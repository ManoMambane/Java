/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03;

/**
 *
 * @author MO
 */
public class Guess {
    public static void main(String[] args)
            throws java.io.IOException{
        
            char ch, answer = 'K';
            System.out.println("I'm thinking of a letter between A and Z");
            System.out.println("Can you guess it");
            
            ch = (char) System.in.read();
            
            if(ch == answer) System.out.println("**Right**");
    }
}
