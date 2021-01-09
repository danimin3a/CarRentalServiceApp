package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    @Column(length = 100)
    private String booking_name;
    private Integer days;

    @ManyToOne
    @JoinColumn(name = "carId",insertable = false,updatable = false)
    private CarsEntity carsEntity;

//    @OneToMany(mappedBy = "bookingEntity")
//    private List<BranchEntity> branchEntities;


//    @OneToMany(mappedBy = "bookingEntity")
//    private List<BookingEntity> salesEntities;

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getBooking_name() {
        return booking_name;
    }

    public void setBooking_name(String booking_name) {
        this.booking_name = booking_name;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public CarsEntity getCarsEntity() {
        return carsEntity;
    }

    public void setCarsEntity(CarsEntity carsEntity) {
        this.carsEntity = carsEntity;
    }

}
