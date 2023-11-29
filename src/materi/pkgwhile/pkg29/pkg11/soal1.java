/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materi.pkgwhile.pkg29.pkg11;

import java.util.Scanner;

/**
 *
 * @author Nrhys
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = 0, n, j, temp, x[];
        x = new int[10];
        
        while(i < x.length){
            System.out.println("Inputkan data ke-"+(i+1));
            x[i] = input.nextInt();
            i++;
        }
        
        i = 0;
                
        while(i <= x.length - 1){
            j = i + 1;
            while(j <= x.length - 1){
                if(x[j] < x[i]){
                    temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }else{
                    
                }
                j++;
            }
            i++;
        }
        i=0;
        System.out.println("Setelah Di proses menjadi = ");
        
        while(i < x.length){
            System.out.print(x[i]+" ");
            i++;
        }
    }
    
}
