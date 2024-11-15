/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import Controllers.PokeController;
import Models.Poke;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PokeView {

    private PokeController pokeController;
    
    public void listarTodos() {
        for (Poke p : pokeController.getStatus()) {
            System.out.print("ID: ");
            System.out.print(p.getId() + "\t");
            System.out.print("Nome: ");
            System.out.print(p.getNome() + "\t");
            System.out.print("Image");
            System.out.println(p.getImagePath());
        }
    }

    public Optional<Poke> selecionar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecione seu poke pelo id");
        int id = teclado.nextInt();
        Optional<Poke> pk = pokeController.selecionar(id);
        pk.ifPresentOrElse(p -> System.out.println(
                "ID: " + p.getId()+ "\tNome: " + p.getNome() + "\tTipo:" + p.getTipo() + "\tAtaque:" + p.getAtaqueBase()
                        + "\tStamina:" + p.getStamina()+ "\tHP:" + p.getHp()+ "\tImage:" + p.getImagePath()),
                () -> System.out.println("Este poke não existe")
        );
        return pk;
    }

}
