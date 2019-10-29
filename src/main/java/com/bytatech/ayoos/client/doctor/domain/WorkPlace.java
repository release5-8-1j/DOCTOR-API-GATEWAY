
package com.bytatech.ayoos.client.doctor.domain;



import javax.persistence.*;

/*import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.GeoPointField;*/

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A WorkPlace.
 */
//@Document(indexName = "workplace")
public class WorkPlace implements Serializable {

    private static final long serialVersionUID = 1L;
    

    private Long id;

    
    
    private String name;

   // @GeoPointField
    private String location;

    private String locationName;
    
	private Doctor doctor;
    public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}



    private Set<SessionInfo> sessionInfos = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public WorkPlace name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public WorkPlace location(String location) {
        this.location = location;
        return this;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public WorkPlace doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Set<SessionInfo> getSessionInfos() {
        return sessionInfos;
    }

    public WorkPlace sessionInfos(Set<SessionInfo> sessionInfos) {
        this.sessionInfos = sessionInfos;
        return this;
    }

    public WorkPlace addSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfos.add(sessionInfo);
        sessionInfo.setWorkPlace(this);
        return this;
    }

    public WorkPlace removeSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfos.remove(sessionInfo);
        sessionInfo.setWorkPlace(null);
        return this;
    }

    public void setSessionInfos(Set<SessionInfo> sessionInfos) {
        this.sessionInfos = sessionInfos;
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
        WorkPlace workPlace = (WorkPlace) o;
        if (workPlace.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), workPlace.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", location='" + getLocation() + "'" +
            "}";
    }
}
