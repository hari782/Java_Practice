/*
import java.util.*;
class june1 {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
char a = s.next().charAt(0);
a=Character.toLowerCase(a);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
System.out.println("Vowels");
} else {
System.out.println("Consonantes");
}
}
}



import java.util.*;
class june1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
char a = s.next().charAt(0);
if (a>='A' && a<='Z' || a>='a' && a<='z') {
System.out.println("Alphabets");
} else if (a>='0' && a<='9') { 
System.out.println("Numbers");
} else {
System.out.println("Symbol");
}
}
}




import java.util.*;
class june1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = a/200;
a = a%200;
int c = a/100;
a = a%100;
int d = a/50;
a = a%50;
int e = a/20;
a = a%20;
int f = a/10;
a = a%10;
System.out.println("200 = ",+b);
System.out.println("100 = ",+c);
System.out.println("50 = ",+d);
System.out.println("20 = ",+e);
System.out.println("10 = ",+f);
}
}





import java.util.*;
class june1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
String f=a+b+c==180?"Triangle":"Not a triangle";
System.out.println(f);
}
}




import java.util.*;
class june1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String v = s.nextLine();
if(v == "Afsar"){
System.out.print("same");
} else {
System.out.print("Not");
}
}
}



import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
while(a<=b){
if (a%2!=0){
System.out.print(a+" ");
}
a++;
}
}
}



import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
int c = s.nextInt();
int n = 0;
while(a<=b){
if (n==c){
break;
}
if (a%2==0){
System.out.print(a+ " ");
n++;
}
a++;
}
}
}


import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
while(a<=b){
int c=a*b;
System.out.printf("%d x %d = %d \n",b,a,c);
b--;
}
}
}



//prime number

import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int f = 0;
int i = 2;
while(i<=a/2) {
if (a%i==0) {
f = 1;
}
i++;
}
if(f==0){
System.out.println("Prime");
}
else {
System.out.println("Not Prime");
}
}
}

// prime number

import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int f = 0;
for(int i = 2; i<a/2; i++){
if (a%i==0){
f=1;
}
}
if(f==0){
System.out.println("Prime");
} else {
System.out.println("Not a prime");
}
}
}



import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
int f = 0;
for (int i = 2; i<=a && i<=b; i++){
if (a%i==0 && b%i==0){
f = 1;
}}
System.out.println(f);
}}



import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int i = 2;
int f = 0;
while(i%a/2==0){
if(a%2==0) {
f++;
break;


import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
int i = s.nextInt();
int a=0;
while(a!=i){
if (a%3==0 && a%5==0) {
System.out.println("Welcome");
} else if (a%3==0) {
System.out.println("Hi");
} else if (a%5==0) {
System.out.println("Hello");
} else {
System.out.println(a);
}
a++;
}
}}


*/

import java.util.*;
class june1 {
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
