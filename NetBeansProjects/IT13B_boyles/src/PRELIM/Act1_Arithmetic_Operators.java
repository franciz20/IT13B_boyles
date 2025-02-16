/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;

public class Act1_Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int x = in.nextInt();
        
        System.out.print("Enter second number: ");
        int y = in.nextInt();
        
        System.out.println("\n" + x + "+" + y + "=" + (x + y));
        System.out.println( x + "-" + y + "=" + (x - y));
        System.out.println(x + "*" + y + "=" + (x * y));
        System.out.println(x + "/" + y + "=" + (x / y));
        System.out.println(x + "mod" + y + "=" + (x % y));
        
    }
    
}
