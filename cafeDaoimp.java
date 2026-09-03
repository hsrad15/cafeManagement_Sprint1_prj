package com.cafe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cafe.dbconnection.DC;
import com.cafe.pojo.cafe;

public class cafeDaoimp implements cafeDao {

 
    @Override
    public void addcafe(cafe item) {

        String sql = "INSERT INTO cafe(name,price,quantity,category) VALUES(?,?,?,?)";

        try {

            Connection conn = DC.getDC();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getmName());
            ps.setDouble(2, item.getPrice());
            ps.setInt(3, item.getQuantity());
            ps.setString(4, item.getCategory());

            ps.executeUpdate();

            System.out.println("item added successfully");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }


  
    @Override
    public List<cafe> getAllCafe() {

        List<cafe> cafes = new ArrayList<>();

        String sql = "SELECT * FROM cafe";

        try {

            Connection conn = DC.getDC();

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                cafe item = new cafe();

                item.setCafeId(rs.getInt("id"));
                item.setmName(rs.getString("name"));
                item.setPrice(rs.getDouble("price"));
                item.setQuantity(rs.getInt("quantity"));
                item.setCategory(rs.getString("category"));

                cafes.add(item);
            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return cafes;
    }


   
    @Override
    public void updateCafe(cafe item) {

        String sql = "UPDATE cafe SET name=?, price=?, quantity=?, category=? WHERE id=?";

        try {

            Connection conn = DC.getDC();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, item.getmName());
            ps.setDouble(2, item.getPrice());
            ps.setInt(3, item.getQuantity());
            ps.setString(4, item.getCategory());
            ps.setInt(5, item.getCafeId());

            ps.executeUpdate();

            System.out.println("item updated successfully");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }



    @Override
    public void deleteCafe(int id) {

        String sql = "DELETE FROM cafe WHERE id=?";

        try {

            Connection conn = DC.getDC();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("item deleted successfully");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}