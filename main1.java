package javaanudip;

abstract class Notification{
	
	 void send() {
		 
	 }
	
//	void showmessage() {
//		System.out.println("send the notification");
//	}

}
class smsnotification extends Notification{

	 void send() {
		System.out.println("Sending SMS");
	}	
	
}
class EmailNotification extends Notification {

	void send() {
		System.out.println("Sending Email");
		
	}
	
}
class otpSignal extends Notification {
	
	void send() {
		System.out.println("Otp sended");
	}
}


public class main1 {
	
	public static void main(String[] args) {
		
		smsnotification sms = new smsnotification();
		sms.send();
		
		EmailNotification Email = new EmailNotification();
		Email.send();
		
		otpSignal otp = new otpSignal();
		otp.send();
		
		
}
}
	