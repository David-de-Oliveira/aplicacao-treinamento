package br.com.treinamento;

public class ComparaTipos {
    public static void main(String[] args){
        // String nome = "DAvid";
        // String nome = null;
        String nome = new String();
        if(nome instanceof String) {
            System.out.println("e String");
        } else {
            System.out.println("nao e String");
        }
    }
}
