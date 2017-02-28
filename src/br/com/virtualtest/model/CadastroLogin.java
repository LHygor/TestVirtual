
package br.com.virtualtest.model;
import java.util.Scanner;

public class CadastroLogin extends Usuario{
     public int Contador;
     public String Resposta;
    
    public static void main(String[] arqs){
        Scanner ler = new Scanner(System.in);
                
        System.out.println("Digite um nome de usuario:");
        System.out.println("Digite uma senha:");
        System.out.println("Confirme a senha:");
        System.out.println("Agora Responda Essas 5 Perguntas para definir seu nivel!");
        
        System.out.println("Pergunta 1-  ");
        System.out.println("a)  b)  c)  d) ");
        String Resposta = ler.next();
        if (Resposta == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Resposta = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 2-  ");
        System.out.println("a)  b)  c)  d) ");
        String Resposta = ler.next();
        if (Resposta == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Resposta = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 3-  ");
        System.out.println("a)  b)  c)  d) ");
        String Resposta = ler.next();
        if (Resposta == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Resposta = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 4-  ");
        System.out.println("a)  b)  c)  d) ");
        String Resposta = ler.next();
        if (Resposta == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Resposta = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 5-  ");
        System.out.println("a)  b)  c)  d) ");
        String Resposta = ler.next();
        if (Resposta == ){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Resposta = null;
        }else System.out.println("RESPOSTA ERRADA!");
    
    }
}
