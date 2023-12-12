package com.hotel.micro.services;

import java.util.List;

import com.hotel.micro.entities.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel getHotel(String id);
}
