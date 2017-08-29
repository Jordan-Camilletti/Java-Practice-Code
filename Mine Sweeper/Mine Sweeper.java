/*This is a text version of minesweeper, enter the X and Y coords and wether you want to flag the spot(F) or reveal the spot(R)
I might add graphics to this*/

package mine.sweeper;

import java.util.*;
import javax.swing.*;

public class MineSweeper {
	public static int[][] reveal(int[][] field, int[][] revealed, int choiceX, int choiceY, String flag, int xLen, int yLen){//Revealing a spot on the field
		if(flag.equals(" R")){
			if((field[choiceY][choiceX]==0&&revealed[choiceY][choiceX]==0)){
				for(int y=-1;y<=1;y++){
					for(int x=-1;x<=1;x++){
						if(x!=0||y!=0){
							try{
                                                            revealed[choiceY+y][choiceX+x]=1;
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
		System.out.print("Enter x and y lengths for field.\n");
		int xLen=sc.nextInt(), yLen=sc.nextInt();
		int choiceX=0,choiceY=0,rndX=0,rndY=0;
		int[][] field=new int[yLen][xLen];
		int[][] revealed=new int[yLen][xLen];//0=not revealed, 1=revealed, 2=flagged
		String flag="",txt1="";//R=reveal, F=flag
		JFrame frame=new JFrame("Mine Sweeper");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JLabel txt=new JLabel("");
		for(int y=0;y<yLen;y++){//Creating the field
			Arrays.fill(revealed[y], 0);
			Arrays.fill(field[y], 0);
		}
		for(int m=0;m<0/*(xLen+yLen)/2*/;m++){//Adding mines, 9=mine
			rndX=rnd.nextInt(xLen-1);
			rndY=rnd.nextInt(yLen-1);
			field[rndY][rndX]=9;
			for(int y=-1;y<=1;y++){
				for(int x=-1;x<=1;x++){
					try{
						field[rndY+y][rndX+x]+=1;
					}catch(java.lang.ArrayIndexOutOfBoundsException e){}
				}
			}
		}
		System.out.print("Enter the x and y coordinates along with R for revealing the spot and F for flagging the spot.\n");
		while(true){//Revealing the field(playing)
			choiceX=sc.nextInt()-1;
			choiceY=sc.nextInt()-1;
			flag=sc.nextLine();
			revealed=reveal(field,revealed,choiceX,choiceY,flag,xLen,yLen);
			for(int y=0;y<yLen;y++){
				txt1=txt1+"<html>";
				for(int x=0;x<xLen;x++){
					if(revealed[y][x]==1){
						if(field[y][x]>9) field[y][x]=9;
						txt1=txt1+field[y][x];
					}else if(revealed[y][x]==0){
						txt1=txt1+"X";
					}else{
						txt1=txt1+"F";
					}
				}
				txt1=txt1+"<br/>";
			}
			txt1=txt1+"</html>";//Displaying the field in a window
			txt.setText(txt1);
			frame.add(txt);
			frame.pack();
			frame.revalidate();
			txt1="";
			if(field[choiceY][choiceX]==9&&revealed[choiceY][choiceX]==1) break;
		}
		System.out.print("You lose!");
	}
}
