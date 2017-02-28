
package br.com.virtualtest.model;
import java.util.Scanner;

public class PrimeiroAmbiente extends Usuario {
public int Acao;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("***BEM-VINDO***");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        int Acao = ler.nextInt();
        
        if (Acao == 1){
            signIn();
        }
        if (Acao == 2){
            Cadastro();
        }
        
        
    }
    
}
