/* 

// Palindrome concept
// reverse a number

// a = 123; b = 321

import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int rem, b=0;
        int t = a;
        while(a>0){
            rem = a%10;
            b = b*10+rem;
            a=a/10;
        }
        if (t==b) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a palindrome");
        }
    }
}


// Amstrong number
// a = 153 = 1^3+5^3+3^3 = 153

import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = 0, sum = 0, r;
        int t = a;
        while(a>0) {
            c++;
            a = a/10;
        }
        a=t;
        while (a>0) {
            r = a%10;
            sum += Math.pow(r,c);
            a = a/10;
        }
        if (t==sum) {
            System.out.print("Amstrong");
        } else {
            System.out.print("Not a amstrong");
        }
    }
}



//fabonacci Series
//0 1 1 2 3 5 8 13...
import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f;
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print(a+" "+b);
        for (int i = 1; i<10; i++){
            f = a+b;
            a = b;
            b = f;
            System.out.print(" "+f+" ");
        }
    }
}



//Strong number
//a=145 = 1!+4!+5! = 145

import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, i, r, f;
        int a = s.nextInt();
        int t = a;
        while(a>0) {
            i = 1;
            f = 1;
            r = a%10;
            while(i<=r){
                f=f*i;
                i++;
            }
            sum = sum+f;
            a =a/ 10;
        }
        if (t==sum){
            System.out.print("Strong number");
        } else {
            System.out.print("Not a strong number");
        }
    }
}



// magic matrix 3x3

import java.util.*;
class main {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];
        int c = 1;
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                m[i][j] = c++;
            }
        }
        int t = m[0][1];
        m[0][1] = m[2][1];
        m[2][1] = t;
        t = m[1][0];
        m[1][0] = m[1][2];
        m[1][2] = t;
        for (int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/

import java.util.*;
class main{
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int c = 1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                m[i][j] = c++;
            }
        }
        int t = m[2][3];
        m[2][3] = m[4][0];
        m[4][0] = m[1][2];
        m[1][2] = t;
        t = m[2][3];
        m[2][3] = m[4][0];
        m[4][0] = m[1][4];
        m[1][4] = t;
        for (int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        } 
    }
}


    