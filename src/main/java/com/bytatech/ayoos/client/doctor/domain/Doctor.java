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
package com.bytatech.ayoos.client.doctor.domain;


import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Doctor.
 */
@Document(indexName = "doctor")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;

   
    private byte[] image;

   
    private String imageContentType;

   
    private String doctorId;

  
    private String specialization;

    private String registerNumber;

 
    private ZonedDateTime practiceSince;

    
    private Double totalRating;


    private ContactInfo contactInfo;

 
    private Review review;

  
    private UserRating userRating;

   
    private Set<WorkPlace> workPlaces = new HashSet<>();
   
    private Set<Qualification> qualifications = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public Doctor image(byte[] image) {
        this.image = image;
        return this;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public Doctor imageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
        return this;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public Doctor doctorId(String doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Doctor specialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public Doctor registerNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public ZonedDateTime getPracticeSince() {
        return practiceSince;
    }

    public Doctor practiceSince(ZonedDateTime practiceSince) {
        this.practiceSince = practiceSince;
        return this;
    }

    public void setPracticeSince(ZonedDateTime practiceSince) {
        this.practiceSince = practiceSince;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public Doctor totalRating(Double totalRating) {
        this.totalRating = totalRating;
        return this;
    }

    public void setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public Doctor contactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Review getReview() {
        return review;
    }

    public Doctor review(Review review) {
        this.review = review;
        return this;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public UserRating getUserRating() {
        return userRating;
    }

    public Doctor userRating(UserRating userRating) {
        this.userRating = userRating;
        return this;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    public Set<WorkPlace> getWorkPlaces() {
        return workPlaces;
    }

    public Doctor workPlaces(Set<WorkPlace> workPlaces) {
        this.workPlaces = workPlaces;
        return this;
    }

    public Doctor addWorkPlace(WorkPlace workPlace) {
        this.workPlaces.add(workPlace);
        workPlace.setDoctor(this);
        return this;
    }

    public Doctor removeWorkPlace(WorkPlace workPlace) {
        this.workPlaces.remove(workPlace);
        workPlace.setDoctor(null);
        return this;
    }

    public void setWorkPlaces(Set<WorkPlace> workPlaces) {
        this.workPlaces = workPlaces;
    }

    public Set<Qualification> getQualifications() {
        return qualifications;
    }

    public Doctor qualifications(Set<Qualification> qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    public Doctor addQualification(Qualification qualification) {
        this.qualifications.add(qualification);
        qualification.setDoctor(this);
        return this;
    }

    public Doctor removeQualification(Qualification qualification) {
        this.qualifications.remove(qualification);
        qualification.setDoctor(null);
        return this;
    }

    public void setQualifications(Set<Qualification> qualifications) {
        this.qualifications = qualifications;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Doctor doctor = (Doctor) o;
        if (doctor.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), doctor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Doctor{" +
            "id=" + getId() +
            ", image='" + getImage() + "'" +
            ", imageContentType='" + getImageContentType() + "'" +
            ", doctorId='" + getDoctorId() + "'" +
            ", specialization='" + getSpecialization() + "'" +
            ", registerNumber='" + getRegisterNumber() + "'" +
            ", practiceSince='" + getPracticeSince() + "'" +
            ", totalRating=" + getTotalRating() +
            "}";
    }
}
