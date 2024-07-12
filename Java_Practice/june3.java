/*

import java.util.*;
class june2 {
public static void main (String[] args) {
for(int i = 0; i<=5; i++){
System.out.print("# ");
}
}
}



import java.util.*;
class june2 {
public static void main (String[] args) {
for(int i = 0; i<=5; i++){
for(int j = 0; j<=5; j++){
System.out.print("# ");
}
System.out.println();
}
}
}




import java.util.*;
class june2 {
public static void main (String[] args) {
int n = 5;
for(int i = 0; i<n; i++){
for(int j = 0; j<n; j++){
if (i==0 || i==n-1 || j==0 || j==n-1){
System.out.print("# ");
} else{
System.out.print("  ");
}
}
System.out.println();
}
}
}



import java.util.*;
class june2 {
public static void main (String[] args) {
for(int i = 1; i<=6; i++) {
for(int j = 1; j<=i; j++) {
System.out.print(" "+j);
}
System.out.println();
}
}
}



import java.util.*;
class june2 {
public static void main (String[] args) {
for (int i = 1; i<=5; i++) {
for (int j = 0; j<=5-i; j++) {
System.out.print(i);
}
System.out.println();
}
}
}


// print # in + pattern

import java.util.*;
class june2 {
public static void main (String[] args) {
int n = 5;
for (int i = 0; i<n/2; i++){
for (int j = 0; j<n/2-i; j++) {
System.out.print(" ");
}
for(int j = 0; j<2*i+1; j++){
System.out.print("#");
}
System.out.println();
}
for(int i = 0; i<n; i++){
System.out.print("#");
}
System.out.println();
for (int i = n/2-1; i>=0; i--){
for (int j = 0; j<n/2-i; j++) {
System.out.print(" ");
}
for(int j = 0; j<2*i+1; j++) {
System.out.print("#");
}
System.out.println();
}
}
}


// # in x pattern

import java.util.*;
class june3 {
public static void main(String[] args) {
int n = 5;
for (int i = 1; i<=n;i++){
for(int j=1;j<=n;j++){
if(i==j || i+j==n+1){
System.out.print("# ");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}



// pattern to print y

import java.util.*;
class june3 {
public static void main(String[] args) {
int n = 5;
for (int i = 1; i<=n;i++){
for(int j=1;j<=n;j++){
if(i+j==n+1 || i==j && j<=n/2){
System.out.print("# ");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}



// print num in array

import java.util.*;
class june3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int b = s.nextInt();
int a[] = new int[b];
for (int i=0;i<b;i++) {
a[i]=s.nextInt();
}
for(int i=0;i<b;i++){
System.out.print(a[i]);
}
}
}






import java.util.*;
class june3 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Press 0 to park:");
System.out.println("Press 1 to exit:");
int a = s.nextInt();
if(a==0){
System.out.println("You are going to park");
int arr[] = new int[20];
System.out.println("Choose the slot:");
int slot = s.nextInt();
} else if(a==0 && slot<=20){
System.out.println("Slot is available");
} else if(a!=0 && slot>20) {
System.out.println("Not available");
}
System.out.println("Enter the vehicle number:");
int veh = s.nextInt();
System.out.println("Your vehicle num is: "+veh);
System.out.println("Park the vehicle in slot: "+slot);
} if(a!=0) {
System.out.println("Enter the vehicle num: ");
int ve = s.nextInt();
System.out.println("Your vehicle num is: " +ve+ "and in the slot: "+slot);
}
}
}


*/


































