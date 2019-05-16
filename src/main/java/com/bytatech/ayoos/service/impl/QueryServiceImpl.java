package com.bytatech.ayoos.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.client.appointment.model.Appointment;
import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.service.QueryService;

import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.mapper.JestResultsExtractor;

import io.searchbox.client.JestClient;
import io.searchbox.core.SearchResult;

@Service
public class QueryServiceImpl implements QueryService {
	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	public QueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;

	@Override
	public Doctor findDoctor(String searchTerm) {

		StringQuery stringQuery = new StringQuery(matchQuery("doctorId", searchTerm).toString());
		return elasticsearchOperations.queryForObject(stringQuery, Doctor.class);
	}

	@Override
	public Page<Review> findAllReview(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();

		return elasticsearchOperations.queryForPage(searchQuery, Review.class);

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
		StringQuery stringQuery = new StringQuery(termQuery("id", searchTerm).toString());
		return elasticsearchOperations.queryForObject(stringQuery, ContactInfo.class);

	}

	
	@Override
	public Page<WorkPlace> findWorkPlaces(String searchTerm, Pageable pageable) {
		// StringQuery stringQuery = new
		// StringQuery(termQuery("doctor.doctorId.keyword",
		// searchTerm).toString());
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, WorkPlace.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bytatech.ayoos.service.QueryService#findAllQualification(org.
	 * springframework.data.domain.Pageable)
	 */
	@Override
	public Page<Qualification> findAllQualification(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Qualification.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findAllSessionInfo(java.lang.
	 * String, org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<SessionInfo> findAllSessionInfo(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, SessionInfo.class);
	}

	@Override
	public Page<SessionInfo> findSessionInfos(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, SessionInfo.class);
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findAllReservedSlot(java.lang.
	 * String, org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<ReservedSlot> findAllReservedSlot(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctor.doctorId.keyword", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, ReservedSlot.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findSessionInfoByDoctorsWorkPlace
	 * (java.lang.String, java.lang.Long,
	 * org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<SessionInfo> findSessionInfoByDoctorsWorkPlace(String doctorId, Long workPlaceId, Pageable pageable) {

	
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("workPlace.doctor.doctorId", doctorId))
						.must(QueryBuilders.matchQuery("workPlace.id", workPlaceId)))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, SessionInfo.class);
	}

	//..................................Appointment..............................................................................
	@Override
	public Page<Appointment> findAppointmentsByDoctorId(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("doctorId", searchTerm)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Appointment.class);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bytatech.ayoos.service.QueryService#findAllUnReservedSlots(java.lang.
	 * String, org.springframework.data.domain.Pageable)
	 */

	/*
	 * @Override public Page<Product> findProductByCategoryId(Long categoryId,
	 * Pageable pageable) { SearchQuery searchQuery = new
	 * NativeSearchQueryBuilder().withQuery(matchQuery("categoryId",
	 * categoryId)) .build();
	 * 
	 * return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	 * 
	 * }
	 * 
	 * public List<Result> findAll(String searchTerm, Pageable pageable) {
	 * List<Result> values = new ArrayList<Result>(); ;
	 * 
	 * SearchQuery searchQuery = new NativeSearchQueryBuilder()
	 * .withQuery(matchQuery("name",
	 * searchTerm).fuzziness(Fuzziness.TWO)).build();
	 * 
	 * elasticsearchTemplate.query(searchQuery, new
	 * JestResultsExtractor<List<Result>>() {
	 * 
	 * @Override public List<Result> extract(SearchResult response) {
	 * 
	 * for (SearchResult.Hit<JsonObject, Void> searchHit :
	 * response.getHits(JsonObject.class)) { Result result = new Result(); //
	 * sampleEntity.setId(searchHit.source.get(JestResult.ES_METADATA_ID).
	 * getAsString());
	 * result.setName(searchHit.source.get("name").getAsString());
	 * 
	 * values.add(result);
	 * 
	 * } return values; } }); return values;
	 * 
	 * }
	 */
	/*
	 * @Override public Page<Customer> findAllCustomers(String searchTerm,
	 * Pageable pageable) { SearchQuery searchQuery = new
	 * NativeSearchQueryBuilder() .withQuery(matchQuery("name",
	 * searchTerm).fuzziness(Fuzziness.TWO)).build();
	 * 
	 * return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	 * 
	 * }
	 */

}
