/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo
 */
public class Ordenar {
    
    public static int[] ordenarConjunto(int[] conjunto){
        for (int x = 0; x < conjunto.length; x++) {
            for (int y = 0; y < conjunto.length - 1; y++) {
                int numActual = conjunto[y];
                int numSig = conjunto[y + 1];
                if (numActual > numSig){
                    conjunto[y] = numSig;
                    conjunto[y + 1] = numActual;
                }
            }
        }
        return conjunto;
    }
}
