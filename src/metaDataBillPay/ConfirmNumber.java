package metaDataBillPay;

import java.util.Random;

public class ConfirmNumber {

	public static void main(String[] args) {
		
		Random rd = new Random(); 
		
		int rdNumb;
		
		String m[] = new String[8];
		
		for(int i=0; i<8; i++) {
			rdNumb = rd.nextInt(8);
			
			m[i] = Integer.toString(rdNumb);
			
		}
		System.out.println("Confirmation number is :" +m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]);

	}

}
