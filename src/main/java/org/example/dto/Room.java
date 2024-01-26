package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Room {
    private Integer roomNo;
    private boolean occupency;
    private String checkIn;
    private String checkOut;

}
