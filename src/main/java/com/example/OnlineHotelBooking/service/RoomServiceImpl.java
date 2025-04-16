package com.example.OnlineHotelBooking.service;

import com.example.OnlineHotelBooking.entity.RoomDetails;
import com.example.OnlineHotelBooking.error.RoomNotFoundException;
import com.example.OnlineHotelBooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public RoomDetails addRoomDetails(RoomDetails roomDetails) {
        return roomRepository.save(roomDetails);
    }

    @Override
    public List<RoomDetails> fetchRoomList() {
        return roomRepository.findAll();
    }

    @Override

    public RoomDetails fetchDataById(Long roomlId) throws RoomNotFoundException { // implementing exception handling

        Optional<RoomDetails> room = roomRepository.findById(roomlId);
        if(!room.isPresent()){
            throw  new RoomNotFoundException("Room Id not available");
        }


        return room.get();
    }

    @Override
    public void DeleteRoomById(Long roomId) {
         roomRepository.deleteById(roomId);
    }

    @Override
    public RoomDetails updateRoomsDetailsById(Long roomId, RoomDetails roomDetails) {
        // here roomInfo contains all the information of a particulkar room
        RoomDetails roomInfo = roomRepository.findById(roomId).get();
        // lets chack if the properties is not empty, which i want tyo update
        // Update roomNumber if provided. if not provided dont update
        if (
                Objects.nonNull(roomDetails.getRoomNumber()) &&
                        "".equalsIgnoreCase(roomDetails.getRoomType())) {
            roomInfo.setRoomNumber(roomDetails.getRoomNumber());
        }
        // Update roomType if provided
        if(roomDetails.getRoomType() !=null){
            roomInfo.setRoomType(roomDetails.getRoomType());
        }
    //  // Update pricePerNight if provided
        if (roomDetails.getPricePerNight() != null) {
            roomInfo.setPricePerNight(roomDetails.getPricePerNight());
        }
        // Update isAvailable only if it's a Boolean object (not primitive)
        if (roomDetails.isAvailable()) {
            roomInfo.setAvailable(true);
        }
    //Update description if provided
        if(roomDetails.getDescription() !=null){
            roomInfo.setDescription(roomDetails.getDescription());
        }
        return  roomRepository.save(roomInfo);

    }

    @Override
    public RoomDetails fetchRoomDetailsByroomType(String roomType) {
        return roomRepository.findByroomType(roomType);
    }

    @Override
    public RoomDetails fetchBYRoomNumber(String roomNumber) {
        return roomRepository.findByroomNumberIgnoreCase(roomNumber);
    }


}
