import javax.swing.JOptionPane;
class Encrypt{
	public static void main(String[] args) {
		String data=JOptionPane.showInputDialog("Enter the Data to be encrypted");
		while(data.length()<3){
			data=JOptionPane.showInputDialog("Data length too Small. Enter the Data to be encrypted");
		}
		int sub=data.length()/2;
		System.out.println(sub);
		String subA=data.substring(0,sub);
		String subB=data.substring(sub);
		String revStrA="";
		String revStrB="";
		for (int i=subA.length()-1;i>=0 ;i--) {
			 revStrA+=subA.charAt(i);
			
		}
		for (int i=subB.length()-1;i>=0 ;i--) {
			 revStrB+=subB.charAt(i);
			
		}
		revStrA=revStrA.replace("a","1");
		revStrA=revStrA.replace("e","5");
		revStrA=revStrA.replace("i","3");
		revStrA=revStrA.replace("o","2");
		revStrA=revStrA.replace("u","4");

		revStrB=revStrB.replace("a","1");
		revStrB=revStrB.replace("e","5");
		revStrB=revStrB.replace("i","3");
		revStrB=revStrB.replace("o","2");
		revStrB=revStrB.replace("u","4");

		String encrypteddata=revStrB.concat(revStrA);

		System.out.println("Encrpted Data: "+encrypteddata);

		int encsub=encrypteddata.length()/2;
	
		String encsubA=encrypteddata.substring(0,encsub);
		String encsubB=encrypteddata.substring(encsub);
		String encrevStrA="";
		String encrevStrB="";
		for (int i=encsubA.length()-1;i>=0 ;i--) {
			 encrevStrA+=encsubA.charAt(i);
			
		}
		for (int i=encsubB.length()-1;i>=0 ;i--) {
			 encrevStrB+=encsubB.charAt(i);
			
		}
		encrevStrA=encrevStrA.replace("1","a");
		encrevStrA=encrevStrA.replace("5","e");
		encrevStrA=encrevStrA.replace("3","i");
		encrevStrA=encrevStrA.replace("2","o");
		encrevStrA=encrevStrA.replace("4","u");

		encrevStrB=encrevStrB.replace("1","a");
		encrevStrB=encrevStrB.replace("5","e");
		encrevStrB=encrevStrB.replace("3","i");
		encrevStrB=encrevStrB.replace("2","o");
		encrevStrB=encrevStrB.replace("4","u");

		String decrypteddata=encrevStrB.concat(encrevStrA);
		System.out.println("Decrpted Data: "+decrypteddata);
		
	}

}