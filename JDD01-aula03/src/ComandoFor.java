import java.util.Scanner;

public class ComandoFor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade = 0, media, numeroAluno;

        //tudo que eu faço no for eu consigo fazer no while ou do.. while, mas nem tudo o que eu faço no while
        //ou do..while eu consigo fazer no for
        for(numeroAluno = 1; numeroAluno <= 5; numeroAluno++) {
            System.out.println("Digite a idade do aluno " + numeroAluno + " :");
            idade = idade + leitor.nextInt();
        }
        media = idade / 5;
        System.out.println("A média de idade dos alunos da escola é: " + media);
    }

}

