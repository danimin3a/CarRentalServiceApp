package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rentaloffices")
public class RentalOfficeEntity {
    //3 fields mandatory in Spring
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rentalOfficeId;
    @Column(length = 50)
    private String name; //String nu este recomand pt FK
    private String internetdomain;
    private String contactaddress;
    private String owner;

    @OneToMany(mappedBy = "rentalOffice")
    private List<BranchEntity> branchEntities;

    public List<BranchEntity> getBranchEntities() {
        return branchEntities;
    }

    public void setBranchEntities(List<BranchEntity> branchEntities) {
        this.branchEntities = branchEntities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInternetdomain() {
        return internetdomain;
    }

    public void setInternetdomain(String internetdomain) {
        this.internetdomain = internetdomain;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
