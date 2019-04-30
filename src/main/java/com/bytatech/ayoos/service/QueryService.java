package com.bytatech.ayoos.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bytatech.ayoos.client.doctor.domain.*;

public interface QueryService {

	Doctor findDoctor(String searchTerm, Pageable pageable);

	Page<Review> findAllReview(Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	ContactInfo findContactInfo(String searchTerm, Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	Page<WorkPlace> findWorkPlaces(String searchTerm, Pageable pageable);


}
