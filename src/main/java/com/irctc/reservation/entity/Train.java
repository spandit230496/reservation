package com.irctc.reservation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private int trainNumber;
    private String source;
    private String destination;

//    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
//    List<Passenger> passengerlist = new ArrayList<>();

}
