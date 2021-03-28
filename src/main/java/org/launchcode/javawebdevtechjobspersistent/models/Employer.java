package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 128)
    private String location;

    public Employer() {
    }

    public Employer(String location) {
    this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
