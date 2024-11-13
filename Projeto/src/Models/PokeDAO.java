/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class PokeDAO {

    public ArrayList<Poke> getAll() {
        ArrayList<Poke> pokes = new ArrayList<>();
        String sql = "SELECT id,nome,tipo,atk_base,stamina,hp,image_path FROM pokepoki";
        try (
                Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Poke p = new Poke(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"),
                        rs.getInt("atk_base"), rs.getInt("stamina"), rs.getDouble("hp"), rs.getString("image_path"));

                pokes.add(p);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return pokes;
    }

}
