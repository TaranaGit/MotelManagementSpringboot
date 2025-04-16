package com.example.OnlineHotelBooking.controller;

import com.example.OnlineHotelBooking.entity.RoomDetails;
import com.example.OnlineHotelBooking.error.RoomNotFoundException;
import com.example.OnlineHotelBooking.service.RoomService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RoomController {

//service layer object
@Autowired
private RoomService roomService;

    private  final Logger logger =  LoggerFactory.getLogger( RoomController.class);
    //  POST a data
    @PostMapping("/api/rooms")
    public RoomDetails addRoomDetails(@Valid @RequestBody RoomDetails roomDetails) {
        logger.info("debugging from the ADD new Room DetailsS");
        return roomService.addRoomDetails(roomDetails);
    }
    // Get data
    @GetMapping("/api/rooms")
    public List<RoomDetails> fetchRoomList(){
        logger.info(("debugging from the Fetch Room details "));
        return roomService.fetchRoomList();
    }
    // Fetching data by ID
    @GetMapping("/api/rooms/{id}")
    public  RoomDetails fetchRoomDetailsById(@PathVariable("id") Long roomlId) throws RoomNotFoundException {
        return roomService.fetchDataById(roomlId);
    }

    // extra work: finding value using Name of Rome type of the hotel
    @GetMapping("/api/type/{roomType}")
    public  RoomDetails fetchRoomDetailsByroomType(@PathVariable("roomType") String roomType){
        return roomService.fetchRoomDetailsByroomType(roomType);
    }

    @GetMapping("/api/{roomNumber}")
    public  RoomDetails fetchBYRoomNumber(@PathVariable("roomNumber") String roomNumber){
        return  roomService.fetchBYRoomNumber(roomNumber);
    }




    // Deleting By ID
    @DeleteMapping("/api/rooms/roomType/{id}")
    public  String DeleteRoomById(@PathVariable("id") Long roomId){
      roomService.DeleteRoomById(roomId);
      return  "Room deleted Successfully";
    }

    //Updating an entry
    @PutMapping("/api/rooms/{id}")
    public  RoomDetails updateRoomsDetailsById(@PathVariable("id") Long roomId,
                                               @RequestBody RoomDetails roomDetails)
    {
        return  roomService.updateRoomsDetailsById(roomId, roomDetails);
    }
}



