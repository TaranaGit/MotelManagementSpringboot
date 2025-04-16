package com.example.OnlineHotelBooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RoomDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roomlId;

    @NotBlank(message = "Please Add Room Number ")
    private String roomNumber;
    private String roomType;
    private Double pricePerNight;
    private boolean isAvailable;
    private String description;

}
