import java.util.*;
public class duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = s.nextInt();
		int a[]=new int[n];
		int d[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int f=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					d[f]=a[j];
					f++;
				}
			}
		}
		System.out.print("Duplicate elemnts: ");
		for(int i=0;i<f;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Total duplicate count : "+f); 
	}
}