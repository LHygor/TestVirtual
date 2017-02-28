
package br.com.virtualtest.model;
import java.util.Scanner;

public class CadastroLogin extends Usuario{
     public int Contador;
     public String Prova;
    
    public static void main(String[] arqs){
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Digite um nome de usuario:");
        System.out.println("Digite uma senha:");
        System.out.println("Confirme a senha:");
        System.out.println("Agora Responda Essas 5 Perguntas para definir seu nivel!");
        
        System.out.println("Pergunta 1-  ");
        System.out.println("a)  b)  c)  d) ");
        String Prova = ler.next();
        if (Prova == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 2-  ");
        System.out.println("a)  b)  c)  d) ");
        String Prova = ler.next();
        if (Prova == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 3-  ");
        System.out.println("a)  b)  c)  d) ");
        String Prova = ler.next();
        if (Prova == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 4-  ");
        System.out.println("a)  b)  c)  d) ");
        String Prova = ler.next();
        if (Prova == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 5-  ");
        System.out.println("a)  b)  c)  d) ");
        String Prova = ler.next();
        if (Prova == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");    
        
        if (Contador <= 6){
            System.out.println("Sua Classificação e': ALUNO");
            return typeUser = A;
        } 
        if ((Contador > 6)&&(Contador <= 8)){
            System.out.println("Sua Classificação e': MONITOR");
            return typeUser = M;
        } 
        if ((Contador > 8)&&(Contador <= 10)){
            System.out.println("Sua Classificação e': PROFESSOR");
            return typeUser = P;
        }
    }
}
