package br.com.treinamento;

import java.util.Locale;
import java.util.Scanner;

public class MediasAlunos {
    public static void main(String[] args){
        float notaAluno = 0;
        float totalNota = 0;
        float mediaNota = 0;
        int totalAluno = 0;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um nota para continuar: ");
            notaAluno = entrada.nextFloat();
            totalNota += notaAluno;
            totalAluno++;
        }
        entrada.close();
        mediaNota = totalNota / totalAluno;
        System.out.println("a nota media da sala, para " + totalAluno +" alunos, foi de " + mediaNota);
    }
    
}
