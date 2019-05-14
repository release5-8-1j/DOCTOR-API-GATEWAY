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

import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bytatech.ayoos.client.consultation.api.ConsultationCommandResourceApi;
import com.bytatech.ayoos.client.consultation.model.ConsultationRequest;
import com.bytatech.ayoos.client.consultation.model.DefaultInfoRequest;
import com.bytatech.ayoos.client.consultation.model.InitiateMedicalSummaryRequest;
import com.bytatech.ayoos.client.consultation.model.ParamedicalExaminationRequest;
import com.bytatech.ayoos.client.consultation.model.Prescription;
import com.bytatech.ayoos.client.consultation.model.PrescriptionRequest;
import com.bytatech.ayoos.client.doctor.api.*;
import com.bytatech.ayoos.client.doctor.domain.ReservedSlot;
import com.bytatech.ayoos.client.doctor.model.*;

import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
@RestController
@RequestMapping("/api/commands")
public class CommandResource {
	
	 @PostMapping("/doc")
	public String test() {
		return "success";
	}
	 
	  @Autowired
	    DoctorResourceApi doctorApi;
	  
	  @Autowired
	  QualificationResourceApi qualificationApi;
	  
	  @Autowired
	  ContactInfoResourceApi contactInfoResourceApi;
	  
	  @Autowired
	  SessionInfoResourceApi sessionInfoAPi;
	  
	  @Autowired
	  WorkPlaceResourceApi workPlaceResourceApi;
	  
	  @Autowired
	  ReservedSlotResourceApi reservedSlotResourceApi;
	  
	  @Autowired
	  ConsultationCommandResourceApi consultationApi;
	  
	  @PostMapping("/doctors")
	    public ResponseEntity<DoctorDTO> createDoctor(@RequestBody DoctorDTO doctorDTO) throws URISyntaxException {
		  
		  return  doctorApi.createDoctorUsingPOST(doctorDTO);
	  }
	  
	  @PutMapping("/doctors")
	    public ResponseEntity<DoctorDTO> updateDoctor(@RequestBody DoctorDTO doctorDTO)  {
		  return doctorApi.updateDoctorUsingPUT(doctorDTO);
	  }    
	  
	  @PostMapping("/contact-infos")
	  public ResponseEntity<ContactInfoDTO> createContactInfo(@RequestBody ContactInfoDTO contactInfoDTO){
		  
		  ResponseEntity<ContactInfoDTO> contactInfo =contactInfoResourceApi.createContactInfoUsingPOST(contactInfoDTO);
		  
		  return contactInfo;
	  }
	  
	  @PutMapping("/contact-infos")
	  public ResponseEntity<ContactInfoDTO> updateContactInfo(@RequestBody ContactInfoDTO contactInfoDTO){
		  return contactInfoResourceApi.updateContactInfoUsingPUT(contactInfoDTO);
	  }
	 
	  @DeleteMapping("/contact-infos/{id}")
	  public void deleteContactInfo(@PathVariable Long id){
		  contactInfoResourceApi.deleteContactInfoUsingDELETE(id);
	  }
	  
	  @PostMapping("/qualifications")
	  public ResponseEntity<QualificationDTO> createQualification(@RequestBody QualificationDTO qualificationDTO){
		 return qualificationApi.createQualificationUsingPOST(qualificationDTO);
	  }
	  @PutMapping("/qualifications")
	  public ResponseEntity<QualificationDTO> updateQualification(@RequestBody QualificationDTO qualificationDTO){
		 return qualificationApi.updateQualificationUsingPUT(qualificationDTO);
	  }
	  
	  @DeleteMapping("/qualifications")
	  public void deleteQualification(@PathVariable Long id){
		  qualificationApi.deleteQualificationUsingDELETE(id);
	  }
	  
	  @PostMapping("/work-places")
	  public ResponseEntity<WorkPlaceDTO> createWorkPlace(@RequestBody WorkPlaceDTO workPlaceDTO){
		  ResponseEntity<WorkPlaceDTO> workPlace=  workPlaceResourceApi.createWorkPlaceUsingPOST(workPlaceDTO);
		
		  return workPlace;
	  }
	  
	  @PutMapping("/work-places")
	  public ResponseEntity<WorkPlaceDTO> updateWorkPlace(@RequestBody WorkPlaceDTO workPlaceDTO){
		  
		  return workPlaceResourceApi.updateWorkPlaceUsingPUT(workPlaceDTO);
		  
	  }
	  
	  @DeleteMapping("/work-places")
	  public void deleteWorkPlace(@PathVariable Long id){
		  workPlaceResourceApi.deleteWorkPlaceUsingDELETE(id);
	  }
	  
	  @PostMapping("/sessionInfo")
	 public ResponseEntity<List<SessionInfoDTO>> createSessionInfo(@RequestBody List<SessionInfoDTO> sessionInfoDTO,
				@RequestParam List<Integer> monthList){
		return  sessionInfoAPi.setSessionToMonthUsingPOST(monthList, sessionInfoDTO);
	 }
	 
	  @PostMapping("/slot/{date}")
	  public ResponseEntity<List<ReservedSlotDTO>> createSlot(@PathVariable LocalDate date){
		 return  reservedSlotResourceApi.createSlotUsingPOST(date);
	  }
	
	  
 ///////////--------------CONSULTATION----------------\\\\\\\\\\\\\\\\\\
	  
	  
	@PostMapping("/initiate-Consultation")
	public ResponseEntity<String> initiate(@RequestBody InitiateMedicalSummaryRequest medicalSummaryRequest) {

		return consultationApi.initiateConsultationSummaryUsingPOST(medicalSummaryRequest);
	}

	@PostMapping("/collect-Default-info/{taskId}")
	public void collectInformations(@PathVariable String taskId, @RequestBody DefaultInfoRequest defaultInfoRequest) {

		consultationApi.collectInformationsUsingPOST(taskId, defaultInfoRequest);
	}

	@PostMapping("/collect-Consultation-Info/{taskId}")
	public void collectConsultationInformations(@PathVariable String taskId,
			@RequestBody ConsultationRequest consultationRequest) {

		consultationApi.collectConsultationInformationsUsingPOST(taskId, consultationRequest);
	}

	@PostMapping("/collect-ParamedicalExamination-Info/{taskId}")
	public void collectParamedicalExaminationInformations(@PathVariable String taskId,
			@RequestBody ParamedicalExaminationRequest paramedicalExaminationRequest) {

		consultationApi.collectParamedicalExaminationInformationsUsingPOST(taskId, paramedicalExaminationRequest);
	}

	@PostMapping("/collect-Prescription-Info/{taskId}")
	public void collectPrescriptionInformations(@PathVariable String taskId, Prescription prescriptionRequest) {

		consultationApi.collectPrescriptionInformationsUsingPOST(taskId, prescriptionRequest);
	}

	@PostMapping("/upload-prescription")
	public void uploadPrescription( @RequestParam MultipartFile file){
		consultationApi.uploadUsingPOST(file);
	}
	
}
