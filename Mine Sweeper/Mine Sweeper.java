/*This is a text version of minesweeper, enter the X and Y coords and wether you want to flag the spot(F) or reveal the spot(R)
I might add graphics to this*/

package main;

import java.util.*;
//import javax.swing.*;

public class Mine Sweeper{
	public static int[][] reveal(int[][] field, int[][] revealed, int choiceX, int choiceY, String flag, int xLen, int yLen){//Revealing a spot on the field
		if(flag.equals(" R")){
			if(field[choiceY][choiceX]==0&&revealed[choiceY][choiceX]==0){
				for(int y=-1;y<=1;y++){
					for(int x=-1;x<=1;x++){
						if(x!=0||y!=0){
							try{
								revealed[choiceY+y][choiceX+x]=1;
								//revealed=reveal(field,revealed,choiceX+x,choiceY+y,xLen,yLen);
							}catch(java.lang.ArrayIndexOutOfBoundsException e){}		
						}
					}
				}
			}
			revealed[choiceY][choiceX]=1;
		}else if(flag.equals(" F")){
			revealed[choiceY][choiceX]=2;
		}
		return revealed;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		int xLen=12,yLen=12,choiceX=0,choiceY=0,rndX=0,rndY=0;
		int[][] field=new int[yLen][xLen];
		int[][] revealed=new int[yLen][xLen];//0=not revealed, 1=revealed, 2=flagged
		String flag="";//R=reveal, F=flag
		for(int y=0;y<yLen;y++){//Creating the field
			Arrays.fill(revealed[y], 0);
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
					}catch(java.lang.ArrayIndexOutOfBoundsException e){}
				}
			}
		}
		while(field[choiceY][choiceX]!=9||(field[choiceY][choiceX]==9&&revealed[choiceY][choiceX]==0)){
			for(int y=0;y<yLen;y++){
				for(int x=0;x<xLen;x++){
					if(revealed[y][x]==1){
						if(field[y][x]>9) field[y][x]=9;
						System.out.print(field[y][x]);
					}else if(revealed[y][x]==0){
						System.out.print("X");
					}else{
						System.out.print("F");
					}
				}
				System.out.print("\n");
			}
			choiceX=sc.nextInt()-1;
			choiceY=sc.nextInt()-1;
			flag=sc.nextLine();
			revealed=reveal(field,revealed,choiceX,choiceY,flag,xLen,yLen);
		}
		/*JFrame frame=new JFrame("XD");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);*/
	}
}
