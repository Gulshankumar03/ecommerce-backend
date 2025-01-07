package com.gulshan.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gulshan.ecommerce.enums.UserRole;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String fullName;

    private String mobile;

    private UserRole role;

    @OneToMany
    private Set<Address> addresses = new HashSet<>();

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "user_coupons", inverseJoinColumns = @JoinColumn(name = "coupon_id"))
    private Set<Coupon> usedCoupons = new HashSet<>();

}
