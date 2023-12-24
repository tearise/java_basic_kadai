package kadai_008;

public class Price_chapter08 {

	public static void main(String[]args) {
		int age=30;
		int userAge = 0;
		String others ="";
		if( age <10) {
			others="その他は";
		}else if(age<20) {
			userAge=10;
		}else if( age < 30) {
			userAge = 20;
		}else if(age <40){
			userAge = 30;
		}else if(age <50) {
			userAge = 40;
		}else if(age <60) {
			userAge = 50;
		}else if(age <70) {
			userAge = 60;
		}else if(age <80) {
			userAge =70;
		}else if(age <90) {
			userAge = 80;
		}else {others ="その他は";}
		
		
		int serviceCost = switch(userAge) {
		case 10  -> 1000;
		case 20 -> 2000;
		case 30,40 -> 3000;
		case 50,60,70 -> 4000;
		case 80 -> 5000;
		default -> 500;
		};
		
		if((userAge >=10)&& (userAge <=80)) {
		System.out.println(userAge + "代は" + serviceCost + "円です");
		}else {
		System.out.println(others + 500 + "円です");
	}}
}
