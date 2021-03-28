package br.com.treinamento;

public class SerHumano {
    public static void main(String[] args){
        Animal objeto1 = new Animal();
        objeto1.setNome("David");
        objeto1.setSobrenome("Oliveira");

        Animal objeto2 = new Animal();
        objeto2.setNome("Junior");
        objeto2.setSobrenome("Oliveira");


        objeto1.imprimirnomecmpleto();
        objeto2.imprimirnomecmpleto();

    }
    
}
