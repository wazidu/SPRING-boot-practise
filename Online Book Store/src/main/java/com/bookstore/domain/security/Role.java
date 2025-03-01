package com.bookstore.domain.security;

import com.bookstore.domain.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Wazid Ullah Murad on 5/29/2020.
 */
@Entity
public class Role {

    @Id
    private int roleId;
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserRole> userRoles= new HashSet<>();


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
