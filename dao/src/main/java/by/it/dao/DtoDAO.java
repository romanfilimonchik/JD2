package by.it.dao;

import by.it.connection.ConnectionCreator;
import by.it.dto.MyOrderDTO;
import by.it.dto.ShoesDTO;
import by.it.entities.Shoes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Лёша on 10.01.2017.
 */
public class DtoDAO {
    public List<ShoesDTO> getAllShoesDTO() {
        List<ShoesDTO> shoessDTO = new ArrayList<>();
        String sql = "SELECT shoes.id, gender.sex, models.type, shoes.color, shoes.price, shoes.img" +
                " FROM shoes" +
                " INNER JOIN gender ON shoes.gender_id = gender.id " +
                " INNER JOIN models ON shoes.model_id = models.id;";
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ShoesDTO shoesDTO = new ShoesDTO();
                shoesDTO.setId(rs.getInt("id"));
                shoesDTO.setSex(rs.getString("sex"));
                shoesDTO.setType(rs.getString("type"));
                shoesDTO.setColor(rs.getString("color"));
                shoesDTO.setPrice(rs.getDouble("price"));
                shoesDTO.setImage(rs.getString("img"));
                shoessDTO.add(shoesDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shoessDTO;
    }

    }
