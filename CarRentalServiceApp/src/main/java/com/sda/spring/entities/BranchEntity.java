package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "branches")
public class BranchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    @Column(length = 50)
    private String address;
    private String listofofficeemployees;
    private String listofavailablecars;


    @ManyToOne
    @JoinColumn(name = "rentalOfficeId") //insertable = true, updatable = false)
    private RentalOfficeEntity rentalOffice;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getListofofficeemployees() {
        return listofofficeemployees;
    }

    public void setListofofficeemployees(String listofofficeemployees) {
        this.listofofficeemployees = listofofficeemployees;
    }

    public String getListofavailablecars() {
        return listofavailablecars;
    }

    public void setListofavailablecars(String listofavailablecars) {
        this.listofavailablecars = listofavailablecars;
    }

}
