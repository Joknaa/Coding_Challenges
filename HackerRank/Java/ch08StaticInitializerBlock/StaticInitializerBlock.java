package ch08StaticInitializerBlock;

import java.util.Scanner;

public class StaticInitializerBlock {

	static int B,H;
	static boolean flag = true;
	static {
    	Scanner sc = new Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
		sc.close();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
		}
	}

	public static void main(String[] args){
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

