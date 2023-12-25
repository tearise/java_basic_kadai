package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[]args) {
		boolean[] primeJudge =new boolean[100];
		
		for(int i=1; i<primeJudge.length; i++) {
			primeJudge[i] =true;
		}
		
		for(int a =2; a<=100; a++) {
		
		for(int k = 2; k<a; k++) {
			if(a% k==0) {
				primeJudge[a-１]= false;
				break;
			}
			}
		}
		for(int c = 0; c<=primeJudge.length; c++) {
			if(primeJudge[c] ==true) {
			System.out.println(c +1);
			}
		}
	
}
}
