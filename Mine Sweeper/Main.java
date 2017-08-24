/**/

package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//import javax.swing.*;

public class Main {
	public static int[][] revealZero(int[][] field, int choiceX, int choiceY){//Revealing a spot on the field
		return field;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		int xLen=12,yLen=12,choiceX=0,choiceY=0,rndX=0,rndY=0;
		int[][] field=new int[yLen][xLen];
		boolean[][] revealed=new boolean[yLen][xLen];
		for(int y=0;y<yLen;y++){//Creating the field
			Arrays.fill(revealed[y], false);//Change this to false later
			Arrays.fill(field[y], 0);
		}
		for(int m=0;m<(xLen+yLen)/2;m++){//Adding mines, 9=mine
			rndX=rnd.nextInt(12);
			rndY=rnd.nextInt(12);
			field[rndY][rndX]=9;
			for(int y=-1;y<=1;y++){
				for(int x=-1;x<=1;x++){
					try{
						field[rndY+y][rndX+x]+=1;
					}catch(java.lang.ArrayIndexOutOfBoundsException e){
						
					}
				}
			}
		}
		while(field[choiceY][choiceX]!=9&&revealed[choiceY][choiceX]==true){
			for(int y=0;y<12;y++){
				for(int x=0;x<12;x++){
					if(revealed[y][x]){
						if(field[y][x]>9) field[y][x]=9;
						System.out.print(field[y][x]);
					}else{
						System.out.print("X");
					}
				}
				System.out.print("\n");
			}
			choiceX=sc.nextInt();
			choiceY=sc.nextInt();
			revealed[choiceY][choiceX]=true;
			if(field[choiceY][choiceX]==0){
				field=revealZero(field,choiceX,choiceY);
			}
		}
		/*JFrame frame=new JFrame("XD");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);*/
	}
}
