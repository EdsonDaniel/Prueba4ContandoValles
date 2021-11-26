/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Equipo
 */
public class ContarValles {
    public static int counttingValleys(int steps, String path){
        int numValles = 0;
        int alturaSobreElNivelDelMar = 0;
        int alturaAnterior = 0; 
        path = path.toUpperCase();
        char[] ruta = path.toCharArray();
        for(int i = 0; i < ruta.length; i++){
            if(ruta[i] == 'U'){
                alturaSobreElNivelDelMar += 1;
                if(alturaSobreElNivelDelMar == 0){
                    numValles++;
                }
                
            }
            if(ruta[i] == 'D'){
                alturaSobreElNivelDelMar -= 1;
            }
            
        }
        
        return numValles;
    }
}
