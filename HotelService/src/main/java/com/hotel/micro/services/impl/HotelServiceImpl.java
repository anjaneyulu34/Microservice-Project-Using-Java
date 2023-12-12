package com.hotel.micro.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.micro.entities.Hotel;
import com.hotel.micro.exception.ResourseNotFoundException;
import com.hotel.micro.repositories.HotelRepository;
import com.hotel.micro.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepo;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(String id) {
		
		return hotelRepo.findById(id).orElseThrow(()->new ResourseNotFoundException("hotel with given id not found"));
	}

}
