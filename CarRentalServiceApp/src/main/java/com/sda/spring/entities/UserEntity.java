package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {


    //3 fielduri necesare in spring
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(length = 50)//nr de caractere a stringului username = 50
    private String email;
    @Column(length = 150)
    private String password;
    @Column(length = 50)
    private String username;
    @Column(columnDefinition = "TINYINT")
    private Boolean enabled;//daca punem enabled pe false springul nu permite logarea userului
    @OneToMany(mappedBy = "authorityId") //not "user"
    private List<AuthoritiesEntity> authoritiesEntities;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {
        this.email = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<AuthoritiesEntity> getAuthoritiesEntities() {
        return authoritiesEntities;
    }

    public void setAuthoritiesEntities(List<AuthoritiesEntity> authoritiesEntities) {
        this.authoritiesEntities = authoritiesEntities;
    }
}
