package Models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class User {
    
    public String Name;
    public int DateBirth;
    public int Cpf;
    public String Email;
    public int PhoneNumber;
    
    
    public void __construct(String Name,int DateBirth,int Cpf,String Email, int PhoneNumber){
   
        this.Name = Name;
        this.DateBirth = DateBirth;
        this.Cpf = Cpf;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    } 
    
    public boolean checkCpf(int Cpf){
    boolean check = false;
    //Codigo de verificação de Cpf
    return check;
    }
    
    public boolean checkAge(int DateBirth,int year){
    boolean Age = false;
    int AgeNumber = year - DateBirth;
            if(AgeNumber > 17){
            Age = true;
            }
      return Age;
    }
    
}
