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

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.client.appointment.api.AppointmentQueryResourceApi;
import com.bytatech.ayoos.client.appointment.model.Appointment;
import com.bytatech.ayoos.client.appointment.model.OpenAppointmentResponse;
import com.bytatech.ayoos.client.consultation.api.ConsultationQueryResourceApi;
import com.bytatech.ayoos.client.consultation.model.DataResponse;
import com.bytatech.ayoos.client.doctor.api.ContactInfoResourceApi;
import com.bytatech.ayoos.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.client.doctor.api.DoctorResourceApiClient;
import com.bytatech.ayoos.client.doctor.api.DoctorSettingsResourceApi;
import com.bytatech.ayoos.client.doctor.api.PaymentSettingsResourceApi;
import com.bytatech.ayoos.client.doctor.api.QualificationResourceApi;
import com.bytatech.ayoos.client.doctor.api.ReservedSlotResourceApi;
import com.bytatech.ayoos.client.doctor.api.SessionInfoResourceApi;
import com.bytatech.ayoos.client.doctor.api.WorkPlaceResourceApi;
import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.client.doctor.model.ContactInfoDTO;
import com.bytatech.ayoos.client.doctor.model.DoctorDTO;
import com.bytatech.ayoos.client.doctor.model.DoctorSettingsDTO;
import com.bytatech.ayoos.client.doctor.model.PaymentSettingsDTO;
import com.bytatech.ayoos.client.doctor.model.QualificationDTO;
import com.bytatech.ayoos.client.doctor.model.ReservedSlotDTO;
import com.bytatech.ayoos.client.doctor.model.SessionInfoDTO;
import com.bytatech.ayoos.client.doctor.model.WorkPlaceDTO;
import com.bytatech.ayoos.service.QueryService;
import com.bytatech.ayoos.service.dto.PdfDTO;
import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;

import io.swagger.annotations.ApiParam;

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
	@Autowired
	ConsultationQueryResourceApi consultationQueryResource;
	@Autowired
	AppointmentQueryResourceApi appointmentQueryResourceApi;
	@Autowired
	DoctorSettingsResourceApi doctorSettingsResourceApi;
	@Autowired
	PaymentSettingsResourceApi paymentSettingResourceApi;

//worked
	@GetMapping("/doctor/{searchTerm}")
	public ResponseEntity<DoctorDTO> findDoctor(@PathVariable String searchTerm) {
		return doctorResourceApi.modelToDtoUsingPOST1(queryService.findDoctor(searchTerm));

		// return ResponseEntity.ok().body(queryService.findDoctor(searchTerm));
	}

// worked
	@GetMapping("/contact-infos/{searchTerm}")
	public ResponseEntity<ContactInfoDTO> findContactInfo(@PathVariable String searchTerm) {

		return contactInfoResourceApi.modelToDtoUsingPOST(queryService.findContactInfo(searchTerm));
		// return ResponseEntity.ok().body(queryService.findContactInfo(searchTerm));
	}

// worked
	@GetMapping("/work-places/{searchTerm}")
	public Page<WorkPlace> findWorkPlace(@PathVariable String searchTerm, Pageable pageable) {
		// return
		// workPlaceResourceApi.listToDtoUsingPOST7(queryService.findWorkPlaces(searchTerm,
		// pageable).getContent());
		return queryService.findWorkPlaces(searchTerm, pageable);
	}

// repeate
	@GetMapping("/findworkplacesBydoctorId/{doctorId}")
	public ResponseEntity<List<WorkPlaceDTO>> findAllWorkPlacesByDoctorId(@PathVariable Long doctorId) {
		return workPlaceResourceApi.findAllWorkPlacesByDoctorIdUsingGET(doctorId);
	}

	@GetMapping("/review")
	public Page<Review> findAllReview(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findAllReview(pageable);
	}

//worked
	@GetMapping("/qualifications/{searchTerm}")
	public ResponseEntity<List<Qualification>> findAllQualification(@PathVariable String searchTerm,
			Pageable pageable) {
		// return qualificationResourceApi
		// .listToDtoUsingPOST3(queryService.findAllQualification(searchTerm,
		// pageable).getContent());
		return ResponseEntity.ok(queryService.findAllQualification(searchTerm, pageable).getContent());
	}
//repeate
	/*
	 * @GetMapping("/qualification/{doctorId}") public
	 * ResponseEntity<List<QualificationDTO>>
	 * findAllQualificationByDoctorId(@PathVariable Long doctorId) { return
	 * qualificationResourceApi.findAllQualificationByDoctorIdUsingGET(doctorId); }
	 */

//repeate
	/*
	 * GetMapping("/session-infos/{searchTerm}") public Page<SessionInfo>
	 * findAllSesionInfo(@PathVariable String searchTerm,
	 * 
	 * @PageableDefault(size = 20) Pageable pageable) { // pageable = new return
	 * queryService.findAllSessionInfo(searchTerm, pageable); } // add
	 */

//worked
	@GetMapping("/session-infos-doctorsworkplace/{doctorId}/{workPlaceId}")
	public ResponseEntity<Page<SessionInfo>> findAllSesionInfoByDoctorsWorkPlace(@PathVariable String doctorId,
			@PathVariable Long workPlaceId, @PageableDefault(size = 20) Pageable pageable) {
		return ResponseEntity.ok()
				.body(queryService.findSessionInfoByDoctorsWorkPlace(doctorId, workPlaceId, pageable));
	}

	/*
	 * @GetMapping("/slots/{searchTerm}") public
	 * ResponseEntity<List<ReservedSlotDTO>> findAllSlots(@PathVariable String
	 * searchTerm, Pageable pageable){ return
	 * reservedSlotResourceApi.listToDtoUsingPOST4(queryService.findAllReservedSlot(
	 * searchTerm,pageable).getContent()); }
	 */

	@GetMapping("/unreserved-slots")
	public ResponseEntity<List<ReservedSlotDTO>> findAllUnReservedSlots(@RequestParam Integer page,
			@RequestParam Integer size, @RequestParam ArrayList<String> sort) {
		return reservedSlotResourceApi.getAllUnReservedSlotsUsingGET(page, size, sort);
	}

	@GetMapping("/Dr-slots/{date}/{doctorId}")
	public ResponseEntity<List<ReservedSlotDTO>> findSlots(@PathVariable String date, @PathVariable Long doctorId) {
		return reservedSlotResourceApi.test2UsingGET(date, doctorId);
	}

	@GetMapping("/doctor-settings/{id}")
	public ResponseEntity<DoctorSettingsDTO> findDoctorSettings(@PathVariable Long id) {
		return doctorSettingsResourceApi.getDoctorSettingsUsingGET(id);
	}

	@GetMapping("/payment-settings/{id}")
	public ResponseEntity<PaymentSettingsDTO> findPaymentSettings(@PathVariable Long id) {
		return paymentSettingResourceApi.getPaymentSettingsUsingGET(id);
	}

	// .............................................Consultation..................
	// .........................................................

	/*
	 * @GetMapping("/tasks") public ResponseEntity<DataResponse>
	 * getTasks(@RequestParam(value = "name", required = false) String name,
	 * 
	 * @RequestParam(value = "nameLike", required = false) String nameLike,
	 * 
	 * @RequestParam(value = "description", required = false) String description,
	 * 
	 * @RequestParam(value = "priority", required = false) String priority,
	 * 
	 * @RequestParam(value = "minimumPriority", required = false) String
	 * minimumPriority,
	 * 
	 * @RequestParam(value = "maximumPriority", required = false) String
	 * maximumPriority,
	 * 
	 * @RequestParam(value = "assignee", required = false) String assignee,
	 * 
	 * @RequestParam(value = "assigneeLike", required = false) String assigneeLike,
	 * 
	 * @RequestParam(value = "owner", required = false) String owner,
	 * 
	 * @RequestParam(value = "ownerLike", required = false) String ownerLike,
	 * 
	 * @RequestParam(value = "unassigned", required = false) String unassigned,
	 * 
	 * @RequestParam(value = "delegationState", required = false) String
	 * delegationState,
	 * 
	 * @RequestParam(value = "candidateUser", required = false) String
	 * candidateUser,
	 * 
	 * @RequestParam(value = "candidateGroup", required = false) String
	 * candidateGroup,
	 * 
	 * @RequestParam(value = "candidateGroups", required = false) String
	 * candidateGroups,
	 * 
	 * @RequestParam(value = "involvedUser", required = false) String involvedUser,
	 * 
	 * @RequestParam(value = "taskDefinitionKey", required = false) String
	 * taskDefinitionKey,
	 * 
	 * @RequestParam(value = "taskDefinitionKeyLike", required = false) String
	 * taskDefinitionKeyLike,
	 * 
	 * @RequestParam(value = "processInstanceId", required = false) String
	 * processInstanceId,
	 * 
	 * @RequestParam(value = "processInstanceBusinessKey", required = false) String
	 * processInstanceBusinessKey,
	 * 
	 * @RequestParam(value = "processInstanceBusinessKeyLike", required = false)
	 * String processInstanceBusinessKeyLike,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of a process instance which has a process definition with the given id."
	 * ) @Valid @RequestParam(value = "processDefinitionId", required = false)
	 * String processDefinitionId,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of a process instance which has a process definition with the given key."
	 * ) @Valid @RequestParam(value = "processDefinitionKey", required = false)
	 * String processDefinitionKey,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of a process instance which has a process definition with a key like the given value."
	 * ) @Valid @RequestParam(value = "processDefinitionKeyLike", required = false)
	 * String processDefinitionKeyLike,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of a process instance which has a process definition with the given name."
	 * ) @Valid @RequestParam(value = "processDefinitionName", required = false)
	 * String processDefinitionName,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of a process instance which has a process definition with a name like the given value."
	 * ) @Valid @RequestParam(value = "processDefinitionNameLike", required = false)
	 * String processDefinitionNameLike,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are part of the execution with the given id."
	 * ) @Valid @RequestParam(value = "executionId", required = false) String
	 * executionId,
	 * 
	 * @ApiParam(value = "Only return tasks which are created on the given date."
	 * ) @Valid @RequestParam(value = "createdOn", required = false) String
	 * createdOn,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are created before the given date."
	 * ) @Valid @RequestParam(value = "createdBefore", required = false) String
	 * createdBefore,
	 * 
	 * @ApiParam(value = "Only return tasks which are created after the given date."
	 * ) @Valid @RequestParam(value = "createdAfter", required = false) String
	 * createdAfter,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are due on the given date.") @Valid @RequestParam(
	 * value = "dueOn", required = false) String dueOn,
	 * 
	 * @ApiParam(value = "Only return tasks which are due before the given date."
	 * ) @Valid @RequestParam(value = "dueBefore", required = false) String
	 * dueBefore,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which are due after the given date.") @Valid @RequestParam
	 * (value = "dueAfter", required = false) String dueAfter,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks which don�t have a due date. The property is ignored if the value is false."
	 * ) @Valid @RequestParam(value = "withoutDueDate", required = false) Boolean
	 * withoutDueDate,
	 * 
	 * @ApiParam(value = "Only return tasks that are not a subtask of another task."
	 * ) @Valid @RequestParam(value = "excludeSubTasks", required = false) Boolean
	 * excludeSubTasks,
	 * 
	 * @ApiParam(value =
	 * "If true, only return tasks that are not suspended (either part of a process that is not suspended or not part of a process at all). If false, only tasks that are part of suspended process instances are returned."
	 * ) @Valid @RequestParam(value = "active", required = false) Boolean active,
	 * 
	 * @ApiParam(value = "Indication to include task local variables in the result."
	 * ) @Valid @RequestParam(value = "includeTaskLocalVariables", required = false)
	 * Boolean includeTaskLocalVariables,
	 * 
	 * @ApiParam(value = "Indication to include process variables in the result."
	 * ) @Valid @RequestParam(value = "includeProcessVariables", required = false)
	 * Boolean includeProcessVariables,
	 * 
	 * @ApiParam(value =
	 * "Only return tasks with the given tenantId.") @Valid @RequestParam(value =
	 * "tenantId", required = false) String tenantId,
	 * 
	 * @ApiParam(value = "Only return tasks with a tenantId like the given value."
	 * ) @Valid @RequestParam(value = "tenantIdLike", required = false) String
	 * tenantIdLike,
	 * 
	 * @ApiParam(value =
	 * "If true, only returns tasks without a tenantId set. If false, the withoutTenantId parameter is ignored."
	 * ) @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean
	 * withoutTenantId,
	 * 
	 * @ApiParam(value =
	 * "Select tasks that has been claimed or assigned to user or waiting to claim by user (candidate user or groups)."
	 * ) @Valid @RequestParam(value = "candidateOrAssigned", required = false)
	 * String candidateOrAssigned,
	 * 
	 * @ApiParam(value =
	 * "Select tasks with the given category. Note that this is the task category, not the category of the process definition (namespace within the BPMN Xml). "
	 * ) @Valid @RequestParam(value = "category", required = false) String
	 * category){
	 * 
	 * return consultationQueryResource.getTasksUsingGET(active, assignee,
	 * assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned,
	 * candidateUser, category, createdAfter, createdBefore, createdOn,
	 * delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks,
	 * executionId, includeProcessVariables, includeTaskLocalVariables,
	 * involvedUser, maximumPriority, minimumPriority, name, nameLike, owner,
	 * ownerLike, maximumPriority, processDefinitionId, processDefinitionKey,
	 * processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike,
	 * processInstanceBusinessKey, processInstanceBusinessKeyLike,
	 * processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId,
	 * tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	 * 
	 * }
	 * 
	 * @GetMapping("/prescription-as-pdf") public ResponseEntity<byte[]>
	 * getPrescriptionAsPDF(){ return
	 * consultationQueryResource.getPrescriptionAsPdfUsingGET(); }
	 * 
	 * @GetMapping("/prescription/pdf") public ResponseEntity<PdfDTO>
	 * exportPrescriptionAsPdf(){
	 * 
	 * PdfDTO pdf = new PdfDTO();
	 * pdf.setPdf(this.consultationQueryResource.getPrescriptionAsPdfUsingGET().
	 * getBody()); pdf.setContentType("application/pdf"); return
	 * ResponseEntity.ok().body(pdf); }
	 * 
	 * 
	 * 
	 * //.............................................Appointment...................
	 * ........................................................
	 * 
	 * @GetMapping("/open-appointments") public
	 * ResponseEntity<List<OpenAppointmentResponse>>
	 * getOpenAppointments(@RequestParam String assignee){ return
	 * appointmentQueryResourceApi.getMyAppointmentsUsingGET(null, assignee, null,
	 * null, null, null, null, null, null, null, null, null, null, null, null, null,
	 * null, null, null, null, null, null, null, null, null, null, null, null, null,
	 * null, null, null, null, null, null, null, null, null, null, null, null, null,
	 * null); }
	 * 
	 * @GetMapping("/appointments/{doctorId}") public Page<Appointment>
	 * getAppointmentsByDoctorId(@PathVariable String doctorId ,Pageable pageable){
	 * return queryService.findAppointmentsByDoctorId(doctorId, pageable); }
	 * 
	 * @GetMapping("/appointments/{doctorId}/{date}") public Page<Appointment>
	 * getAppointmentsByDoctorIdAndDate(@PathVariable String doctorId,@PathVariable
	 * LocalDate date ,Pageable pageable){ return
	 * queryService.findAppointmentsByDoctorId(doctorId,date, pageable); }
	 */
}
