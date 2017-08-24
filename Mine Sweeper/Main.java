/**/

package main;

import java.util.Arrays;
//import javax.swing.*;

public class Main {
	public static void main(String[] args){
		int xLen=12,yLen=12;
		boolean[][] revieled=new boolean[yLen][xLen];
		int[][] field=new int[yLen][xLen];
		for(int y=0;y<yLen;y++){
			Arrays.fill(revieled, true);
			Arrays.fill(field, 0);
		}
		for(int y=0;y<12;y++){
			for(int x=0;x<12;x++){
				if(revieled[y][x]){
					System.out.print(field[y][x]);
				}else{
					System.out.print("X");
				}
			}
			System.out.print("\n");
		}
		/*JFrame frame=new JFrame("XD");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);*/
	}
}
