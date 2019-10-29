package com.bytatech.ayoos.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.*;

import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import java.io.IOException;
/*import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
*/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.search.TermQuery;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
/*import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilders;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
/*import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;*/
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.client.appointment.model.Appointment;
import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.service.QueryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class QueryServiceImpl implements QueryService {

	private RestHighLevelClient restHighLevelClient;

	private ObjectMapper objectMapper;

	public QueryServiceImpl(RestHighLevelClient restHighLevelClient, ObjectMapper objectMapper) {
		super();
		this.restHighLevelClient = restHighLevelClient;
		this.objectMapper = objectMapper;
	}

	@Override
	public Doctor findDoctor(String searchTerm) {

		SearchSourceBuilder builder = new SearchSourceBuilder();

		String[] include = new String[] { "doctorId", "specialization", "registerNumber", "practiceSince", "firstName",
				"contactInfo.*", "doctorSettings.*", "paymentSettings.*" };
		String[] exclude = new String[] { "workPlaces.*", "qualifications.*" };

		builder.fetchSource(include, exclude);

		builder.query(matchQuery("doctorId", searchTerm));

		SearchRequest searchRequest = new SearchRequest("doctor");

		searchRequest.source(builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		return getSearchResultSingle(searchResponse, new Doctor());
	}

	@Override
	public Page<Review> findAllReview(Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();
		System.out.println(".............................method");

		/*
		 * String[] include = new String[] { "" };
		 * 
		 * String[] exclude = new String[] {};
		 * 
		 * builder.fetchSource(include, exclude);
		 */

		builder.query(matchAllQuery());

		SearchRequest searchRequest = generateSearchRequest("review", pageable.getPageSize(), pageable.getPageNumber(),
				builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new WorkPlace());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findContactInfo(java.lang.String,
	 * org.springframework.data.domain.Pageable)
	 */

	@Override
	public ContactInfo findContactInfo(String searchTerm) {

		SearchSourceBuilder searchBuilder = new SearchSourceBuilder();
		/*
		 * String[] include = new String[] { "", "", "" };
		 * 
		 * searchBuilder.fetchSource(include, exclude);
		 */
		searchBuilder.query(termQuery("id", searchTerm));

		SearchRequest searchRequest = new SearchRequest("contactinfo");

		searchRequest.source(searchBuilder);
		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		return getSearchResultSingle(searchResponse, new ContactInfo());

	}

	@Override
	public Page<WorkPlace> findWorkPlaces(String searchTerm, Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();
		System.out.println(".............................method" + searchTerm);

		String[] include = new String[] { "id", "location", "name", "locationName", "doctor.*" };

		String[] exclude = new String[] {};

		builder.fetchSource(include, exclude);

		builder.query(termQuery("doctor.doctorId", searchTerm));

		SearchRequest searchRequest = generateSearchRequest("workplace", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new WorkPlace());
	}

	private SearchRequest generateSearchRequest(String indexName, Integer totalElement, Integer pageNumber,
			SearchSourceBuilder sourceBuilder) {
		SearchRequest searchRequest = new SearchRequest(indexName);

		int offset = 0;
		int totalElements = 0;

		if (pageNumber == 0) {
			offset = 0;
			totalElements = totalElement;

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&offset in00000000Page" + offset);

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&totalelements in 00000000Page" + totalElements);
		} else {

			offset = totalElement;

			totalElements = (pageNumber * totalElement);
			System.out.println("****************************offset in else Page" + offset);
			System.out.println("************************totalelements in elsePage" + totalElements);

		}
		sourceBuilder.from(offset);
		sourceBuilder.size(totalElements);

		searchRequest.source(sourceBuilder);
		return searchRequest;
	}

	private <T> Page getSearchResult(SearchResponse response, Pageable page, T t) {

		SearchHit[] searchHit = response.getHits().getHits();

		List<T> productList = new ArrayList<>();

		for (SearchHit hit : searchHit) {
			productList.add((T) objectMapper.convertValue(hit.getSourceAsMap(), t.getClass()));
		}

		return new PageImpl(productList, page, response.getHits().getTotalHits());

	}

	private <T> T getSearchResultSingle(SearchResponse response, T t) {

		SearchHit[] searchHit = response.getHits().getHits();
		T productList = null;

		for (SearchHit hit : searchHit) {

			productList = (T) objectMapper.convertValue(hit.getSourceAsMap(), t.getClass());
		}

		return productList;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAllQualification(org.
	 * springframework.data.domain.Pageable)
	 */

	@Override
	public Page<Qualification> findAllQualification(String searchTerm, Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();
		System.out.println(".............................method" + searchTerm);
		/*
		 * String[] include = new String[] { }; String[] exclude = new String[] {};
		 * builder.fetchSource(include, exclude);
		 **/

		builder.query(termQuery("doctor.doctorId", searchTerm));

		SearchRequest searchRequest = generateSearchRequest("qualification", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new Qualification());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAllSessionInfo(java.lang.
	 * String, org.springframework.data.domain.Pageable)
	 */
	/*
	 * @Override public Page<SessionInfo> findSessionInfos(String searchTerm,
	 * Pageable pageable) { SearchQuery searchQuery = new NativeSearchQueryBuilder()
	 * .withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build(); return
	 * elasticsearchOperations.queryForPage(searchQuery, SessionInfo.class); }
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAllReservedSlot(java.lang.
	 * String, org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<ReservedSlot> findAllReservedSlot(String searchTerm, Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();
		System.out.println(".............................method" + searchTerm);
		/*
		 * String[] include = new String[] { }; String[] exclude = new String[] {};
		 * builder.fetchSource(include, exclude);
		 **/

		builder.query(termQuery("doctor.doctorId", searchTerm));

		SearchRequest searchRequest = generateSearchRequest("reservedslot", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new ReservedSlot());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findSessionInfoByDoctorsWorkPlace
	 * (java.lang.String, java.lang.Long, org.springframework.data.domain.Pageable)
	 */

	@Override
	public Page<SessionInfo> findSessionInfoByDoctorsWorkPlace(String doctorId, Long workPlaceId, Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();
		System.out.println(".............................method" + doctorId + "..............." + workPlaceId);
		/*
		 * String[] include = new String[] { }; String[] exclude = new String[] {};
		 * builder.fetchSource(include, exclude);
		 **/

		builder.query(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("workPlace.doctor.doctorId", doctorId))
				.must(QueryBuilders.matchQuery("workPlace.id", workPlaceId)));

		SearchRequest searchRequest = generateSearchRequest("sessioninfo", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new SessionInfo());

	}

	// ..................................Appointment................................
	// ..............................................

	@Override
	public Page<Appointment> findAppointmentsByDoctorId(String searchTerm, Pageable pageable) {

		SearchSourceBuilder builder = new SearchSourceBuilder();

		System.out.println(".............................method" + searchTerm);
		/*
		 * String[] include = new String[] { }; String[] exclude = new String[] {};
		 * builder.fetchSource(include, exclude);
		 **/

		builder.query(termQuery("doctorId", searchTerm));

		SearchRequest searchRequest = generateSearchRequest("appointment", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new Appointment());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAppointmentsByDoctorId(java.
	 * lang.String, java.time.LocalDate, org.springframework.data.domain.Pageable)
	 */

	@Override
	public Page<Appointment> findAppointmentsByDoctorId(String doctorId, LocalDate date, Pageable pageable) {
		// .....if match not work in date plz change accordingly...........

		SearchSourceBuilder builder = new SearchSourceBuilder();

		System.out.println(".............................method" + doctorId + "........." + date);
		/*
		 * String[] include = new String[] { }; String[] exclude = new String[] {};
		 * builder.fetchSource(include, exclude);
		 **/

		builder.query(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("doctorId", doctorId))
				.must(QueryBuilders.matchQuery("appointmentDateAndTime", date)));

		SearchRequest searchRequest = generateSearchRequest("appointment", pageable.getPageSize(),
				pageable.getPageNumber(), builder);

		SearchResponse searchResponse = null;

		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}
		return getSearchResult(searchResponse, pageable, new Appointment());

	}

	
	/*
	 * @Override public Page<Product> findProductByCategoryId(Long categoryId,
	 * Pageable pageable) { SearchQuery searchQuery = new
	 * NativeSearchQueryBuilder().withQuery(matchQuery("categoryId", categoryId))
	 * .build();
	 * 
	 * return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	 * 
	 * }
	 * 
	 * /* public List<Result> findAll(String searchTerm, Pageable pageable) {
	 * List<Result> values = new ArrayList<Result>(); ;
	 * 
	 * SearchQuery searchQuery = new NativeSearchQueryBuilder()
	 * .withQuery(matchQuery("name", searchTerm).fuzziness(Fuzziness.TWO)).build();
	 * 
	 * elasticsearchTemplate.query(searchQuery, new
	 * JestResultsExtractor<List<Result>>() {
	 * 
	 * @Override public List<Result> extract(SearchResult response) {
	 * 
	 * for (SearchResult.Hit<JsonObject, Void> searchHit :
	 * response.getHits(JsonObject.class)) { Result result = new Result(); //
	 * sampleEntity.setId(searchHit.source.get(JestResult.ES_METADATA_ID).
	 * getAsString()); result.setName(searchHit.source.get("name").getAsString());
	 * 
	 * values.add(result);
	 * 
	 * } return values; } }); return values;
	 * 
	 * }
	 * 
	 * 
	 * @Override public Page<Customer> findAllCustomers(String searchTerm, Pageable
	 * pageable) { SearchQuery searchQuery = new NativeSearchQueryBuilder()
	 * .withQuery(matchQuery("name", searchTerm).fuzziness(Fuzziness.TWO)).build();
	 * 
	 * return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	 * 
	 * }
	 */

}
