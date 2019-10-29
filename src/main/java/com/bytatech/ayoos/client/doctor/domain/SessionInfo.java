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
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

//import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
//@Document(indexName = "sessioninfo")
public class SessionInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;

   
    private String sessionName;

    private LocalDate date;


    private Integer weekDay;

    @DecimalMin(value = "0")
    private Double fromTime;

    @DecimalMax(value = "23")
    private Double toTime;

    private Double interval;


    private WorkPlace workPlace;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionName() {
        return sessionName;
    }

    public SessionInfo sessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public LocalDate getDate() {
        return date;
    }

    public SessionInfo date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public SessionInfo weekDay(Integer weekDay) {
        this.weekDay = weekDay;
        return this;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public Double getFromTime() {
        return fromTime;
    }

    public SessionInfo fromTime(Double fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    public void setFromTime(Double fromTime) {
        this.fromTime = fromTime;
    }

    public Double getToTime() {
        return toTime;
    }

    public SessionInfo toTime(Double toTime) {
        this.toTime = toTime;
        return this;
    }

    public void setToTime(Double toTime) {
        this.toTime = toTime;
    }

    public Double getInterval() {
        return interval;
    }

    public SessionInfo interval(Double interval) {
        this.interval = interval;
        return this;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public SessionInfo workPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
        return this;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
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
        SessionInfo sessionInfo = (SessionInfo) o;
        if (sessionInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), sessionInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SessionInfo{" +
            "id=" + getId() +
            ", sessionName='" + getSessionName() + "'" +
            ", date='" + getDate() + "'" +
            ", weekDay=" + getWeekDay() +
            ", fromTime=" + getFromTime() +
            ", toTime=" + getToTime() +
            ", interval=" + getInterval() +
            "}";
    }
}
