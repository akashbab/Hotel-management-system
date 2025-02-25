package com.dao;
import com.bean.Room;
import com.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class RoomDao {
	 public Room getRoomDetails(int roomId) {
	        String query = "SELECT * FROM rooms WHERE room_id = ?";
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setInt(1, roomId);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new Room(rs.getInt("room_id"), rs.getString("room_number"), rs.getString("room_type"), rs.getDouble("price"), rs.getString("status"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
