package com.service;

import com.bean.Room;

import com.dao.RoomDao;
public class RoomService {
    private RoomDao roomDAO = new RoomDao();

    public Room getRoomDetails(int roomId) {
        return roomDAO.getRoomDetails(roomId);
    }
}
