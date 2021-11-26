/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Prueba {
    
    public static void main(String[] args) {
        int[] conjunto = {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};
        int[] conjuntoOrdenado;
        conjuntoOrdenado = Ordenar.ordenarConjunto(conjunto);
        System.err.println("Conjunto ordenado: ");
        for (int i = 0; i < conjunto.length; i++) {
            System.out.print(conjuntoOrdenado[i] + ", ");
        }
    }
    
}
