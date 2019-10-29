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

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.springframework.data.elasticsearch.annotations.Document;



/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
//@Document(indexName = "doctorsettings")
public class DoctorSettings implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;

  
    private String approvalType;

    private Boolean isMailNotificationsEnabled;

  
    private Boolean isSMSNotificationsEnabled;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public DoctorSettings approvalType(String approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public Boolean isIsMailNotificationsEnabled() {
        return isMailNotificationsEnabled;
    }

    public DoctorSettings isMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
        this.isMailNotificationsEnabled = isMailNotificationsEnabled;
        return this;
    }

    public void setIsMailNotificationsEnabled(Boolean isMailNotificationsEnabled) {
        this.isMailNotificationsEnabled = isMailNotificationsEnabled;
    }

    public Boolean isIsSMSNotificationsEnabled() {
        return isSMSNotificationsEnabled;
    }

    public DoctorSettings isSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
        this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
        return this;
    }

    public void setIsSMSNotificationsEnabled(Boolean isSMSNotificationsEnabled) {
        this.isSMSNotificationsEnabled = isSMSNotificationsEnabled;
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
        DoctorSettings doctorSettings = (DoctorSettings) o;
        if (doctorSettings.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), doctorSettings.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DoctorSettings{" +
            "id=" + getId() +
            ", approvalType='" + getApprovalType() + "'" +
            ", isMailNotificationsEnabled='" + isIsMailNotificationsEnabled() + "'" +
            ", isSMSNotificationsEnabled='" + isIsSMSNotificationsEnabled() + "'" +
            "}";
    }
}

