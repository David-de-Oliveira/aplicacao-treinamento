package br.com.treinamento;

public class MutiplasVerificacoes {
    public static void main(String[] args){
        int numero = 10;
        switch (numero) {
            case 5:
                System.out.println("valor eh 5");
                break;
            case 10:
                System.out.println("valor eh 10");
                break;
            case 20:
                System.out.println("valor eh 10");
                break;
            default:
                System.out.println("valor informado foi " + numero);
                break;
        }


    }
    
}
