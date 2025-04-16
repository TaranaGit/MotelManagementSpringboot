package com.example.OnlineHotelBooking.service;

import com.example.OnlineHotelBooking.entity.RoomDetails;
import com.example.OnlineHotelBooking.error.RoomNotFoundException;

import java.util.List;

public interface RoomService {

  public   RoomDetails addRoomDetails(RoomDetails roomDetails);

  public List<RoomDetails> fetchRoomList();


  public RoomDetails fetchDataById(Long roomlId) throws RoomNotFoundException;

 public void DeleteRoomById(Long roomId);

 public RoomDetails updateRoomsDetailsById(Long roomId, RoomDetails roomDetails);

 public  RoomDetails fetchRoomDetailsByroomType(String roomType);

  public   RoomDetails fetchBYRoomNumber(String roomNumber);
}
