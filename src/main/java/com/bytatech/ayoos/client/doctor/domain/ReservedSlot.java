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
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;





/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

public class ReservedSlot implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    private Long id;

 
    private LocalDate date;

    private Double startTime;

  
    private Double endTime;

   
    private Doctor doctor;

 
    private Set<Status> statuses = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public ReservedSlot date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getStartTime() {
        return startTime;
    }

    public ReservedSlot startTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getEndTime() {
        return endTime;
    }

    public ReservedSlot endTime(Double endTime) {
        this.endTime = endTime;
        return this;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public ReservedSlot doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Set<Status> getStatuses() {
        return statuses;
    }

    public ReservedSlot statuses(Set<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    public ReservedSlot addStatus(Status status) {
        this.statuses.add(status);
        status.setReservedSlot(this);
        return this;
    }

    public ReservedSlot removeStatus(Status status) {
        this.statuses.remove(status);
        status.setReservedSlot(null);
        return this;
    }

    public void setStatuses(Set<Status> statuses) {
        this.statuses = statuses;
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
        ReservedSlot reservedSlot = (ReservedSlot) o;
        if (reservedSlot.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reservedSlot.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ReservedSlot{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", startTime=" + getStartTime() +
            ", endTime=" + getEndTime() +
            "}";
    }
}
