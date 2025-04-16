package com.example.OnlineHotelBooking.repository;

import com.example.OnlineHotelBooking.entity.RoomDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<RoomDetails, Long> {

    public  RoomDetails findByroomType (String roomType) ;

    public  RoomDetails findByroomNumberIgnoreCase (String roomNumber) ;

}
