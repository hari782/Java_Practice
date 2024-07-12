import java.util.*;
class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        int[] ar = new int[4];
        try{
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        } catch (Exception obj) {
            throw error()
        }
        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i]);
        }
    }
}
class error extends Exception {
    public error(){
        System.out.println("Hi");
    }

    }
}