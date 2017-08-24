/**/

package main;

import java.util.Arrays;
//import javax.swing.*;

public class Main {
	public static void main(String[] args){
		boolean[][] revieled=new boolean[12][12];
		int[][] field=new int[12][12];
		Arrays.fill(revieled, false);
		Arrays.fill(field, 0);
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
