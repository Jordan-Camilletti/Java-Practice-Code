/**/

package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//import javax.swing.*;

public class Main {
	public static boolean[][] reveal(int[][] field, boolean[][] revealed, int choiceX, int choiceY, int xLen, int yLen){//Revealing a spot on the field
		if(choiceX>=0&&choiceX<xLen&&choiceY>=0&&choiceY<yLen&&field[choiceY][choiceX]==0){
			for(int y=-1;y<=1;y++){
				for(int x=-1;x<=1;x++){
					if(x!=0&&y!=0){
						try{
						revealed=reveal(field,revealed,choiceX+x,choiceY+y,xLen,yLen);
						}finally{}
					}
				}
			}
		}
		revealed[choiceY][choiceX]=true;
		return revealed;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		int xLen=12,yLen=12,choiceX=0,choiceY=0,rndX=0,rndY=0;
		int[][] field=new int[yLen][xLen];
		boolean[][] revealed=new boolean[yLen][xLen];
		for(int y=0;y<yLen;y++){//Creating the field
			Arrays.fill(revealed[y], false);
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
		while(field[choiceY][choiceX]!=9||(field[choiceY][choiceX]==9&&!revealed[choiceY][choiceX])){
			for(int y=0;y<yLen;y++){
				for(int x=0;x<xLen;x++){
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
			revealed=reveal(field,revealed,choiceX,choiceY,xLen,yLen);
		}
		/*JFrame frame=new JFrame("XD");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);*/
	}
}