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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.client.doctor.api.ContactInfoResourceApi;
import com.bytatech.ayoos.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.client.doctor.api.DoctorResourceApiClient;
import com.bytatech.ayoos.client.doctor.api.QualificationResourceApi;
import com.bytatech.ayoos.client.doctor.api.ReservedSlotResourceApi;
import com.bytatech.ayoos.client.doctor.api.SessionInfoResourceApi;
import com.bytatech.ayoos.client.doctor.api.WorkPlaceResourceApi;
import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.client.doctor.domain.Doctor;
import com.bytatech.ayoos.client.doctor.domain.WorkPlace;
import com.bytatech.ayoos.client.doctor.model.ContactInfoDTO;
import com.bytatech.ayoos.client.doctor.model.DoctorDTO;
import com.bytatech.ayoos.client.doctor.model.QualificationDTO;
import com.bytatech.ayoos.client.doctor.model.ReservedSlotDTO;
import com.bytatech.ayoos.client.doctor.model.SessionInfoDTO;
import com.bytatech.ayoos.client.doctor.model.WorkPlaceDTO;
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
	DoctorResourceApi doctorResourceApi;
	@Autowired
	ContactInfoResourceApi contactInfoResourceApi;
	@Autowired
	QueryService queryService;
	@Autowired
	WorkPlaceResourceApi workPlaceResourceApi;
	@Autowired
	QualificationResourceApi qualificationResourceApi;
	@Autowired
	SessionInfoResourceApi sessionInfoResourceApi;
	@Autowired
	ReservedSlotResourceApi reservedSlotResourceApi;

	// productResourceApi.listToDtoUsingPOST(queryService.findAllProduct(page).getContent());
	@GetMapping("/doctor/{searchTerm}")
	public ResponseEntity<DoctorDTO> findDoctor(@PathVariable String searchTerm) {
		return doctorResourceApi.modelToDtoUsingPOST1(queryService.findDoctor(searchTerm));

	}

	@GetMapping("/contact-infos/{searchTerm}")
	public ResponseEntity<ContactInfoDTO> findContactInfo(@PathVariable String searchTerm) {

		return contactInfoResourceApi.modelToDtoUsingPOST(queryService.findContactInfo(searchTerm));
	}

	@GetMapping("/work-places/{searchTerm}")
	public ResponseEntity<List<WorkPlaceDTO>> findWorkPlace(@PathVariable String searchTerm, Pageable pageable) {
		return workPlaceResourceApi.listToDtoUsingPOST7(queryService.findWorkPlaces(searchTerm, pageable).getContent());
	}

	@GetMapping("/findworkplacesBydoctorId/{doctorId}")
	public ResponseEntity<List<WorkPlaceDTO>> findAllWorkPlacesByDoctorId(@PathVariable Long doctorId) {
		return workPlaceResourceApi.findAllWorkPlacesByDoctorIdUsingGET(doctorId);
	}

	@GetMapping("/review")
	public Page<Review> findAllReview(/* @PathVariable String searchTerm, */ Pageable pageable) {
		return queryService.findAllReview(pageable);
	}

	@GetMapping("/qualifications/{searchTerm}")
	public ResponseEntity<List<QualificationDTO>> findAllQualification(@PathVariable String searchTerm,
			Pageable pageable) {
		return qualificationResourceApi
				.listToDtoUsingPOST3(queryService.findAllQualification(searchTerm, pageable).getContent());
	}

	@GetMapping("/qualification/{doctorId}")
	public ResponseEntity<List<QualificationDTO>> findAllQualificationByDoctorId(@PathVariable Long doctorId) {
		return qualificationResourceApi.findAllQualificationByDoctorIdUsingGET(doctorId);
	}

	@GetMapping("/session-infos/{searchTerm}")
	public ResponseEntity<List<SessionInfoDTO>> findAllSesionInfo(@PathVariable String searchTerm, Pageable pageable) {
		return sessionInfoResourceApi.listToDtoUsingPOST6(queryService.findAllSessionInfo(searchTerm, pageable).getContent());
	}
	//add findsessionInfoHavingWorkPlaceIdAndDoctorId
	@GetMapping("/session-infos-doctorsworkplace/{doctorId}/{workPlaceId}")
	public ResponseEntity<List<SessionInfoDTO>> findAllSesionInfoByDoctorsWorkPlace(@PathVariable String doctorId,@PathVariable Long workPlaceId, Pageable pageable) {
		return sessionInfoResourceApi.listToDtoUsingPOST6(queryService.findSessionInfoByDoctorsWorkPlace(doctorId, workPlaceId, pageable).getContent());
	}
	@GetMapping("/slots/{searchTerm}")
	public ResponseEntity<List<ReservedSlotDTO>> findAllSlots(@PathVariable String searchTerm, Pageable pageable){
	return reservedSlotResourceApi.listToDtoUsingPOST4(queryService.findAllReservedSlot(searchTerm,pageable).getContent());
	}

	@GetMapping("/unreserved-slots")
	public ResponseEntity<List<ReservedSlotDTO>> findAllUnReservedSlots(@RequestParam Integer page,@RequestParam Integer size,@RequestParam ArrayList<String> sort){
	return	reservedSlotResourceApi.getAllUnReservedSlotsUsingGET(page, size, sort);
	}
}
