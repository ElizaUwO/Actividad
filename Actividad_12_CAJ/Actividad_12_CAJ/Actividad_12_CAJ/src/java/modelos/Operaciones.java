/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author ferna
 */
public class Operaciones {
    
    public String area(String baseT, String alturaT) {       
        int base; 
        int altura;
        int area;
        
        base = Integer.parseInt(baseT);
        altura = Integer.parseInt(alturaT);
        area = (base * altura) / 2;      
        return String.valueOf(area);
    }
    
    public String perimetro(String ladoAT, String ladoBT, String ladoCT) {      
        int ladoA;
        int ladoB;
        int ladoC;
        int perimetro;
        
        ladoA = Integer.parseInt(ladoAT);
        ladoB = Integer.parseInt(ladoBT);
        ladoC = Integer.parseInt(ladoCT);
        perimetro = ladoA + ladoB + ladoC;
        return String.valueOf(perimetro);
    }
    
}
