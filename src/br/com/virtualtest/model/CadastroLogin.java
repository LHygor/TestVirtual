
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
        
        System.out.println("Pergunta 1- Resolva a Equacao x^2-4x-5=0");
        System.out.println("  a)-5 e 1  b)-10 e 6  c)-1 e 5  d)0 ");
        String Prova = ler.next();
        if (Prova == "c"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 2- São Paulo e Rio de Janeiro são as duas grandes metrópoles globais existentes");
        System.out.println("no Brasil. Tais cidades encontram-se classificadas nesse patamar por apresentarem:");
        System.out.println("  a) Uma maior dinâmica de deslocamento intra urbano.");
        System.out.println("  b) Um maior mercado consumidor.");
        System.out.println("  c) Uma produção intensiva de matérias-primas e produtos primários.");
        System.out.println("  d) Um alcance econômico em nível nacional e internacional.");
        String Prova = ler.next();
        if (Prova == "d"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 3- Qual a força de atração gravitacional entre duas massas de 500 kg distantes 5 m uma da outra?");
        System.out.println("  a)Fg = 6,67*10^-7 N  b)Fg = -7*10^-7 N c)Fg = 10^7 N d)Fg = 0 N");
        String Prova = ler.next();
        if (Prova == "a"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 4- Qual fase da mitose é caracterizada pelo posicionamento dos cromossomos no equador da célula?");
        System.out.println("  a)G1.  b)Prófase  c)Metáfase  d)Anáfase ");
        String Prova = ler.next();
        if (Prova == "c"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 5- A propriedade que pode ser atribuída à maioria dos compostos iônicos");
        System.out.println("(compostos caracterizados predominantemente por ligações iônicas entre as partículas) é:");
        System.out.println("  a) Dissolvidos em água, formam soluções ácidas.");
        System.out.println("  b) Fundidos (isto é, no estado líquido), conduzem corrente elétrica.");
        System.out.println("  c) São moles, quebradiços e cristalinos.");
        System.out.println("  d) Possuem baixos pontos de fusão e ebulição.");
        String Prova = ler.next();
        if (Prova == "b"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!"); 
        
        System.out.println("Pergunta 6- Voce e' timido?");
        System.out.println("  a)Nao  b)Sim  c)Um Puoco  d)... ");
        String Prova = ler.next();
        if (Prova == "d"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 7- O que e' um Micro-Ondas?");
        System.out.println("  a)Sim  b)Nao  c)Mata que e' Bixo  d)Eletro ");
        String Prova = ler.next();
        if (Prova == "d"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 8- A Segunda Grande Guerra, a partir de 7 de dezembro de 1941, adquire um caráter mundial quando os: ");
        System.out.println("  a) Franceses, por determinação de Petain, ocupam o sudeste da Ásia.");
        System.out.println("  b) Hittler ascende ao poder.");
        System.out.println("  c) Russos tomam a iniciativa de anexar o território dos Estados bálticos.");
        System.out.println("  d) Japoneses atacam a base americana de Pearl Habor.");
        String Prova = ler.next();
        if (Prova == "d"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 9- Durante as cruzadas os cavaleiros templários constantemente bradavam: ");
        System.out.println("  a)Deus lo Vult  b)Ave Maria  c)Fe no Pai que o Inimigo Cai  d)Vamos tomar Jerusalem ");
        String Prova = ler.next();
        if (Prova == "a"){
            System.out.println("RESPOSTA CERTA!");
            Contador++;
            Prova = null;
        }else System.out.println("RESPOSTA ERRADA!");
        
        System.out.println("Pergunta 10- Resolva 2+2");
        System.out.println("  a)0  b)4  c)-15  d)5 ");
        String Prova = ler.next();
        if (Prova == "b"){
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
