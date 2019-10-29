package com.bytatech.ayoos.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bytatech.ayoos.client.appointment.model.Appointment;
import com.bytatech.ayoos.client.doctor.domain.*;
import com.bytatech.ayoos.client.doctor.model.SessionInfoDTO;

public interface QueryService {

	Doctor findDoctor(String searchTerm);

	Page<Review> findAllReview(Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */

	ContactInfo findContactInfo(String searchTerm);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */

	Page<WorkPlace> findWorkPlaces(String searchTerm, Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */

	Page<Qualification> findAllQualification(String searchTerm, Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	/*
	 * Page<SessionInfo> findAllSessionInfo(String searchTerm, Pageable pageable);
	 * 
	 *//**
		 * @param searchTerm
		 * @param pageable
		 * @return
		 */

	Page<ReservedSlot> findAllReservedSlot(String searchTerm, Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	/*
	 * Page<SessionInfo> findSessionInfos(String searchTerm, Pageable pageable);
	 */

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	Page<SessionInfo> findSessionInfoByDoctorsWorkPlace(String doctorId, Long workPlaceId, Pageable pageable);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */

	Page<Appointment> findAppointmentsByDoctorId(String searchTerm, Pageable pageable);

	/**
	 * @param doctorId
	 * @param date
	 * @param pageable
	 * @return
	 */
	Page<Appointment> findAppointmentsByDoctorId(String doctorId, LocalDate date, Pageable pageable);

}
