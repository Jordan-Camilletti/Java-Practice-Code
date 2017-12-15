/*Synthetic division is a 'synthetic' way of doing division with two terms that each involve variables
http://www.purplemath.com/modules/synthdiv.htm is a visualized way of doing it
Find the value of x by setting the divisor to zero and sovling
Them multiply the value by the coefficient and add that sum to the next coefficient(the first coefficient remains unchanged)
Finaly set the row of new coefficients to the highest power in the dividend-1
If there is still a coefficient left after x^0 is used, that is set to the remainder(written as coefficient/divisor)
Created by Jordan Camilletti*/

public class SyntheticDivision {
	public static String format(String e){//Formats an equation for proper use(4x^3-2x^2+3/x-5 -> 4x^3+-2x^2+0x^1+3x^0/1x+-5)
		String[] dividend=(e.split("/")[0]).split("\\-");//(4x^3 2x^2+3)
		String[] plusDividend=(String.join("+-", dividend)).split("\\+");//(4x^3 -2x^2 3)
		int topPower=Integer.parseInt((dividend[0].split("\\^"))[1]);//3
		for(int n=0;n<plusDividend.length;n++){
			if(!plusDividend[n].contains("x^")) plusDividend[n]=plusDividend[n]+"x^0";//(4x^3 -2x^2 3x^0)
			while(Integer.parseInt((plusDividend[n].split("\\+")[0]).split("\\^")[1])!=topPower-n){
				//add 0x^(topPower-n)
				plusDividend[n]="0x^"+(topPower-n)+"+"+plusDividend[n];//(4x^3 -2x^2 0x^1+3x^0)
				topPower-=1;
			}
		}
		String divisor=e.split("/")[1];//(x-5)
		if((divisor.substring(0,1)).equals("x")) divisor="1"+divisor;//(1x-5)
		divisor=String.join("+-",divisor.split("\\-"));//(1x+-5)
		return((String.join("+",plusDividend))+divisor);
	}

	public static void main(String[] args){
		String solution="";
		String equation="3x^4+4x^3+-32x^2+-5x^1+-20x^0/1x+4";
		equation=format(equation);
		String[] dividend=(equation.split("/")[0]).split("x\\^");//left side of equation
		String[] divisor=(equation.split("/")[1]).split("x");//right side of equation
		int x=(Integer.parseInt(divisor[1])*-1)/Integer.parseInt(divisor[0]);
		int topPower=Integer.parseInt(dividend[1].split("\\+")[0])-1;
		int[] coefficients=new int[dividend.length-1];
		coefficients[0]=Integer.parseInt(dividend[0]);//the numbers before x
		for(int n=1;n<dividend.length-1;n++){
			coefficients[n]=Integer.parseInt(dividend[n].split("\\+")[1]);
		}
		//System.out.println("X:"+x);
		solution=solution+coefficients[0]+"x^"+topPower;
		//System.out.println(coefficients[0]+"x^"+topPower); 
		for(int n=1;n<coefficients.length;n++){
			coefficients[n]+=(coefficients[n-1]*x);
			if(topPower-n<0){
				solution=solution+coefficients[n]+"/"+(equation.split("/")[1]);
				//System.out.println(coefficients[n]+"/"+(equation.split("/")[1]));//remainder
			}else{
				solution=solution+coefficients[n]+"x^"+(topPower-n);
				//System.out.println(coefficients[n]+"x^"+(topPower-n));
			}
		}
		System.out.print(solution);
	}
}
