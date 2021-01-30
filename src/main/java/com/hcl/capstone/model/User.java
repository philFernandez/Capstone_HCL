package com.hcl.capstone.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private Set<Order> orders;

    public User(String username, String password, String email, boolean isAdmin,
            Set<Order> orders) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
        this.orders = orders;
    }
}
