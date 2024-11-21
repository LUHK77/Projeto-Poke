/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Ataque;
import Models.AtaqueDAO;

/**
 *
 * @author Aluno
 */
public class AtaqueController {
    private AtaqueDAO ataqueDao;

    public AtaqueController(AtaqueDAO ataqueDao) {
        this.ataqueDao = ataqueDao;
    }
    
    public Ataque selecionarAtk(int id){
        return ataqueDao.getAtaqueBydId(id);
    }
}
