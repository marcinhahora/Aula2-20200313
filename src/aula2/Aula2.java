/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Internet
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     *///void não tem retorno
    //função main pode receber um vetor de strings
    public static void main(String[] args) {
        // TODO code application logic here
        int qtdDiv = 0;
        int numero = 7;
        int inicio = numero;
        
        while (inicio >= 1)
        if (numero%inicio==0)
            qtdDiv++;
    }
    
}
