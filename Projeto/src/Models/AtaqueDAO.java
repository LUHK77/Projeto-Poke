/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Ataque.Ataque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class AtaqueDAO {

    public Ataque getAtaqueBydId(int id) {
        String sql = "SELECT id,nome,efeito,valor,custo,poke_id FROM ataque WHERE poke_id =?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Ataque atk = new Ataque(rs.getInt("id"), rs.getString("nome"), rs.getString("efeito"),
                        rs.getInt("valor"), rs.getInt("custo"), rs.getInt("poke_id"));
                return atk;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
