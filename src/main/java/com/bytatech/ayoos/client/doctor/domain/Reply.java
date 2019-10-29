package com.bytatech.ayoos.client.doctor.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Reply.
 */

//@Document(indexName = "reply")
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;
    
   
    private Long id;

   
    private String replay;

    
    private Review review;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReplay() {
        return replay;
    }

    public Reply replay(String replay) {
        this.replay = replay;
        return this;
    }

    public void setReplay(String replay) {
        this.replay = replay;
    }

    public Review getReview() {
        return review;
    }

    public Reply review(Review review) {
        this.review = review;
        return this;
    }

    public void setReview(Review review) {
        this.review = review;
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
        Reply reply = (Reply) o;
        if (reply.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reply.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Reply{" +
            "id=" + getId() +
            ", replay='" + getReplay() + "'" +
            "}";
    }
}
