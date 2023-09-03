
public class NotificationFactory {  // a factory to create notifications
	public Notification createNotification(String channel) {
		if(channel == null || channel.isEmpty()) return null;
		
		switch(channel) {
		case "SMS":
			return new SMSNotification();
			
		case "Email":
			return new EmailNotification();
		case "Call":
			return new CallNotification();
		default:
			throw new IllegalArgumentException("Invalid channel " + channel);
		}
	}

}
