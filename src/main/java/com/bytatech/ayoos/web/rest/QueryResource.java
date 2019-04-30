/*
* Copyright 2002-2016 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.bytatech.ayoos.web.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.client.doctor.domain.WorkPlace;
import com.bytatech.ayoos.service.QueryService;
import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;

/**
 * TODO Provide a detailed description here
 * 
 * 
 */
@RestController
@RequestMapping("/api/queries")
public class QueryResource {
	@Autowired
	QueryService queryService;

	@GetMapping("/doctor/{searchTerm}")
	public Doctor findDoctor(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findDoctor(searchTerm, pageable);
	}

	
	@GetMapping("/contact-infos/{searchTerm}")
	public ContactInfo findContactInfo(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findContactInfo(searchTerm,pageable);
	}
	@GetMapping("/work-places/{searchTerm}")
	public Page<WorkPlace> findWorkPlace(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findWorkPlaces(searchTerm, pageable);
	}

	@GetMapping("/review")
	public Page<Review> findAllReview(/*@PathVariable String searchTerm,*/ Pageable pageable) {
		return queryService.findAllReview( pageable);
	} 

}
