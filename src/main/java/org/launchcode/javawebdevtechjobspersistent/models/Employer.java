package org.launchcode.javawebdevtechjobspersistent.models;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 3, max = 128)
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private  List<Job> jobs = new ArrayList<>();

    public Employer() { }

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
