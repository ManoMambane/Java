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
public class Break2 {

    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        for (;;) {
            ch = (char) System.in.read();
            if (ch == 'q') {
                break;
            }
        }
        System.out.println("You passed q!");
    }
}
