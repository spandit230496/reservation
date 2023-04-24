package com.irctc.reservation.entity;

import com.irctc.reservation.gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ticketId;
    private int trainNumber;
    private Date date;
    private int age;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
   @JoinColumn
    Train train;

//    @OneToMany(mappedBy = "passenger",cascade = CascadeType.ALL)
//    List<Passenger> passenger = new ArrayList<>();
}





