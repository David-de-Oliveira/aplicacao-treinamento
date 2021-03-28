package br.com.treinamento;

public class IncrementoDecremento {
    public static void main(String[] args){

        int valorPosIncremento = 5;
        int valorPreIncremento = 5;
        int valorPosDecremento = 5;
        int valorPreDecremento = 5;

        System.out.println("Pos incremento" + valorPosIncremento++);
        System.out.println("Pre incremento" + ++valorPreIncremento);
        System.out.println("Pos decremento" + valorPosDecremento--);
        System.out.println("Pre decremento" + --valorPreDecremento);



    }
}
