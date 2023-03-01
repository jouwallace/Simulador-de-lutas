/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7;

/**
 *
 * @author Notebook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lutador l[] = new Lutador [6];
        
        
        l[0] = new Lutador( "pretty boy", "França", 31,1.75f,
                           68.9f, 11, 2, 1 );
        l[1] = new Lutador( "maluco beleza", "Brasil", 29,1.68f,
                           57.8f, 14, 2, 3 );
        l[2] = new Lutador( "O meteoro da paixão","Italia", 31,1.65f,
                           68.9f, 11, 2, 3 );
        l[3] = new Lutador( "O Cãozinho dos teclados", "Inglaterra", 28,1.93f,
                           81.6f, 13, 0, 2 );
        l[4] = new Lutador( "Reiginaldo Rossi", "EUA", 37,1.70f,
                           119.7f, 5, 4, 3 );
        l[5] = new Lutador( "King Of Pop", "EUA", 33,1.85f,
                           105.9f, 12, 2, 4 );
     
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].Status();
        l[1].Status();
    }

    
    
}
