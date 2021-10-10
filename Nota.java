//Criar um algoritmo que digite o nome dp aluno,
//Disciplina, nota 1,2,3, e frequencia. 
//O programa deverá retornar o nome,  a disciplina
//frequencia, n1, n2  n3 e se aluno aprovado ou reprovado.


import java.util.Scanner;

public class Nota{

    public static void main(String args[]){

       Scanner ler = new Scanner(System.in);

        String nome, disciplina;
        Double n1,n2,n3, freq;
        //Double media  = (n1 + n2 + n3) /3;

        System.out.println("Digite o nome do aluno");
        nome = ler.nextLine(); 
        System.out.println("Digite o nome do disciplina");
        disciplina = ler.nextLine(); 
        System.out.println("Digite a frequencia do aluno");
        freq = ler.nextDouble();

        System.out.println("Digite a nota 1");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota 2");
        n2 = ler.nextDouble();
        System.out.println("Digite a nota 3");
        n3 = ler.nextDouble();
        System.out.println("Qual a frequencia do aluno?");
       
        Double media = (n1 + n2 + n3)/ 3;
        System.out.println("A média final do aluno é?" + media + "%%");

        System.out.println("Nome do aluno é" + nome + "\n" +
                            "A disciplina é:" + disciplina + "\n" +
                            "A frequencia do aluno é:" + freq + "\n" +
                            "A média do aluno é:" + media);
        
        if(media >= 6 && freq >= 75) {
            System.out.println("O aluno está Aprovado");
        }else {
            System.out.println("O aluno está Reprovado");   

        }
                            

    }


} 