/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Poke.GaloCururu;
import Models.Poke.Papaco;
import Models.Poke.Poke;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 *
 * @author Aluno
 */
public class PokeDAO {

     public ArrayList<Poke> getAll() {
        ArrayList<Poke> pokes = new ArrayList<>();
        String sql = "SELECT apelido, level_poke, exp_poke, hp, stamina FROM poke";
        try (
                Connection conn = DAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Poke p = new Poke(rs.getString("apelido"), rs.getInt("level_poke"), rs.getInt("exp_poke"),rs.getInt("hp"), rs.getInt("stamina")) {};
                pokes.add(p);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return pokes;
    } 
 /*  public Poke selecionar(int id) {
        String sql = "SELECT id,nome,tipo,atk_base,stamina,hp,image_path FROM poke WHERE id = ?";
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                Poke p = new Poke(rs.getInt("id"), rs.getString("nome"), rs.getString("tipo"),
                        rs.getInt("atk_base"), rs.getInt("stamina"), rs.getDouble("hp"), rs.getString("image_path"));

                return p;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    } */
    public Poke selecionarI(int id) {
        String sql = "SELECT apelido, level_poke,exp_poke,hp,stamina FROM poke WHERE id = id";
        Poke p;
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                switch (id) {

                    case 1 -> {
                        p = new GaloCururu(rs.getString("apelido"), rs.getInt("level_poke"), rs.getInt("exp_poke"),
                                rs.getInt("hp"), rs.getInt("stamina"));
                    }
                    case 2 -> {
                        p = new Papaco(rs.getString("apelido"), rs.getInt("level_poke"), rs.getInt("exp_poke"),
                                rs.getInt("hp"), rs.getInt("stamina"));
                    }
                    default -> {
                        return p = null;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public Poke selecionarN(String nome) {
        String sql = "SELECT apelido, level_poke,exp_poke,hp,stamina FROM poke WHERE apelido = apelido";
        Poke p;
        try (Connection conn = DAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                switch (nome) {

                    case "Galo Cururu" -> {
                        p = new GaloCururu(rs.getString("apelido"), rs.getInt("level_poke"), rs.getInt("exp_poke"),
                                rs.getInt("hp"), rs.getInt("stamina"));
                    }
                    case "Papaco" -> {
                        p = new Papaco(rs.getString("apelido"), rs.getInt("level_poke"), rs.getInt("exp_poke"),
                                rs.getInt("hp"), rs.getInt("stamina"));
                    }
                    default -> {
                        return p = null;
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
