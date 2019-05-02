package pageObjectModel;

public class Ghd {

	public static void main(String[] args) {
		    
		//System.out.println(product1());
		double price=0,price2=2;
		int i=0;
		int j=1;
		int priceA=0,priceB=0, priceC=0, priceD=0, priceF=0;
		for(i=0;i<5;i++) {       		
			
			if(i==0) {
				priceA=i;
			}
			else if(i==1) {
				priceB=i;
			}
			
			else if(i==2) {
				priceC=i;
			}
			else if(i==3) {
				priceD=i;
			}
			else if(i==4) {
				priceF=4;
			}
	    	          
			if(priceA < priceB &&  priceB < priceC && priceC < priceD &&  priceD < priceF ) {
				System.out.print("pass");
			}
			else {
				System.out.print("not pass");
				break;
			}
				
	        	
            
            }
		
		}
			
			
			
	
	
	public static  double product1() {
		String number="COP $13 656.80";
		String  space=number.substring(6,7);
		String space2=number.substring(7,8);
		double stringToNumber = 0;
		if(space.equalsIgnoreCase(" ") || space2.equalsIgnoreCase(" ")) {
			String  n=number.replace(" ", "");
			String onlyNumbers=n.substring(4);
			stringToNumber=Double.parseDouble(onlyNumbers);
			  
			  }		  
		
		return stringToNumber;		
		
		
	}

}