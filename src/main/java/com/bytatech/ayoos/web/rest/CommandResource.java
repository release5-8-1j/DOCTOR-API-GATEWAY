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
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.client.doctor.api.*;
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
	 public void createSessionInfo(@RequestBody List<SessionInfoDTO> sessionInfoDTO,
				@RequestParam List<Integer> monthList){
		 sessionInfoAPi.setSessionToMonthUsingPOST(monthList, sessionInfoDTO);
	 }
	
	
}
