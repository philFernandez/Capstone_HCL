package com.hcl.capstone.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Role {
    @Id 
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
