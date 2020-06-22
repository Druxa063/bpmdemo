package com.company.bpmdemo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "BPMDEMO_PERSON")
@Entity(name = "bpmdemo_Person")
public class Person extends AbstractEntity {
    private static final long serialVersionUID = 4784998845534330301L;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "ROLE", joinColumns = @JoinColumn(name = "PERSON_ID"))
    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "ROLE")
    private Set<Role> roles;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "person")
    private List<Order> orders;

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}