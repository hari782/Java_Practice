/* 

// array concept

import java.util.*;
class hello {
    public static void main (String[] args) {
        String[] a = new String[3];
        a[0] = "Song 1";
        a[1] = "Song 2";
        a[2] = "Song 3";
        System.out.println(a+"\n"+a[0]+ "\n"+a[1]+ "\n"+a[2]);
    }
}

// array concept

import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enther the value of a[0]:");
        a[0] = s.nextInt();
        System.out.println("Enther the value of a[1]:");
        a[1] = s.nextInt();
        System.out.println("Enther the value of a[2]:");
        a[2] = s.nextInt();
        System.out.println("Enther the value of a[3]:");
        a[3] = s.nextInt();
        System.out.println("Enther the value of a[4]:");
        a[4] = s.nextInt();
        System.out.print(a[0]+a[1]+a[2]+a[3]+a[4]);
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enther the value of a[0]:");
        a[0] = s.nextInt();
        System.out.println("Enther the value of a[1]:");
        a[1] = s.nextInt();
        System.out.println("Enther the value of a[2]:");
        a[2] = s.nextInt();
        System.out.println("Enther the value of a[3]:");
        a[3] = s.nextInt();
        System.out.println("Enther the value of a[4]:");
        a[4] = s.nextInt();
        for (int i=0; i<=n; i++);
        System.out.println();
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i=0;i<=4;i++) {
            System.out.println("Enthe the value of "+a[i]);
            a[i] = s.nextInt();
        }
        System.out.println("The array contains:");
        System.out.println(a[0]+ "\n"+a[1]+ "\n"+a[2]+ "\n"+a[3]+ "\n"+a[4]);
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i=0;i<=n-1;i++) {
            System.out.println("Enthe the value of "+a[i]);
            a[i] = s.nextInt();
        }
        System.out.println("The array contains:");
        for (int i = 0; i <= n-1; i++) {
        System.out.println(a[i]+ "\n");
        }
    }
}



import java.util.*;
class hello {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=1;i<=10;i++) {
            int a = n*i;
            System.out.printf("%d x %d = %d \n",n,i,a);
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i=0;i<=n-1;i++) {
            a[i] = s.nextInt();
        }
        int l = a.length;
        int mid = l/2;
            System.out.println(a[mid]);
        }
    }

    


import java.util.*;
class hello {
    public static void main(String[] args) {
        for(int t=1;t<=3;t++) {
            for (int i=1;i<=5;i++) {
                System.out.println("John");
            }
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        for (int i=0;i<=2;i++) {
            for (int j=0;j<=2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




import java.util.*;
class hello {
    public static void main(String[] args) {
        for (int i=0;i<=3;i++){
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// class and objects

import java.util.*;
class hello {
    void iphone(){
        System.out.println("This is iphone");
    }
    void vivo() {
        System.out.println("This is vivo");
    }
    void oppo() {
        System.out.println("This is oppo");
    }
    void techno() {
        System.out.println("This is techno");
    }
    public static void main (String[] args) {
        hello phone = new hello();
        phone.vivo();
        phone.oppo();
        phone.techno();
        phone.iphone();
    }
}



class hello {
    int a = 10;
    int b = 20;
    void sum() {
        int c = a+b;
        System.out.println(c);
    }
    public static void main (String[] args) {
        hello add = new hello();
        add.sum();
    }
}


// function concept
class hello {
    int apple_price = 20;
    int apple_count = 5;
    void total_money() {
        System.out.print(apple_count*apple_price);
    }
    public static void main (String[] args) {
        hello mul = new hello();
        mul.total_money();
    }
}


//parameter function


class hello {
    void chocolate(int money) {
        System.out.println("The price of chocolate is "+money);
        System.out.println("chocolate purchased");
    }
    void powder(int money) {
        System.out.println("The price of powder is "+money);
        System.out.println("powder purchased");
    }
    public static void main (String[] args) {
        hello store = new hello();
        store.chocolate(110);
        store.powder(520);
    }
}



class hello {
    void sum(int a, int b) {
        System.out.println(a+b);
    }
    void sub(int a, int b) {
        System.out.println(a-b);
    }
    void mul(int a, int b) {
        System.out.println(a*b);
    }
    void div(int a, int b) {
        System.out.println(a/b);
    }
    public static void main (String[] args) {
        hello obj = new hello();
        obj.sum(26,76);
        obj.sub(26,76);
        obj.mul(26,76);
        obj.div(26,76);
    }
}



// return type

import java.util.*;
class hello {
    int add (int a, int b) {
        return a + b;
    }
    public static void main (String[] args) {
        hello obj = new hello();
        int sum = obj.add(26,76);
        System.out.print(sum);
    }
}



import java.util.*;
class hello {
    String getname(String a){
        return a;
    }
    long getphonenum (long b) {
        return b;
    }
    public static void main(String[] args) {
        hello obj = new hello();
        String c = obj.getname("Haribalaji");
        long d = obj.getphonenum(894058908);
        System.out.println(c +d);
    }
}



import java.util.*;
class hello {
    void evod (int num) {
        if(num%2==0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        hello obj = new hello();
        obj.evod(number);
    }
}



import java.util.*;
class hello {
    void result (int res) {
        if(res > 35) {
            System.out.print("Pass");
        } else {
            System.out.print("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        hello obj = new hello();
        int mark = s.nextInt();
        obj.result(mark);
    }
}



import java.util.*;
class hello {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i<5;i++) {
            System.out.println(a[i]);
        }
    }
}



import java.util.*;
class hello {
    public static void main (String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        String[] a = new String[n];
        System.out.println("Enter the value for array: ");
        for (int i=0; i<n;i++) {
            a[i] = s.nextLine();
        }
        for (int i=0; i<n;i++) {
            System.out.println(a[i]);
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char c = s.next().charAt(0);
        if(c=='+') {
            System.out.println(a+b);
        } else if (c=='-') {
            System.out.println(a-b);
        } else if (c=='*') {
            System.out.println(a*b);
        } else if (c=='/') {
            System.out.println(a/b);
        } else if (c=='%') {
            System.out.println(a%b);
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char c = s.next().charAt(0);
        switch(c) {
            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/': System.out.println(a/b); break;
            case '%': System.out.println(a%b); break;
            default: System.out.print("Invalid"); break;
        }
    }
}




import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch(a) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
        }
    }
}


import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        char c = Character.toLowerCase(ch);
        switch(c) {
            case 'a': System.out.println("Vowel"); break;
            case 'e': System.out.println("Vowel"); break;
            case 'i': System.out.println("Vowel"); break;
            case 'o': System.out.println("Vowel"); break;
            case 'u': System.out.println("Vowel"); break;
            default: System.out.println("Consonate"); break;
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i=0;i<=a;i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}



import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i=1;i<=a;i++) {
            System.out.print(i);
        }
    }
}




import java.util.*;
class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int f = 1;
        for(int i=1;i<=a;i++){
            f = f*i;
        }
        System.out.println(f);
    }
}

*/


