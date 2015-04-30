package demo;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class GetUserStatus {
	public static void main(String[] args) {
		Twitter twitter = new TwitterFactory().getInstance();
        try {
            List<Status> statuses;
            
            String user = "katewalsh"; 
            statuses = twitter.getUserTimeline(user);
            System.out.println("Showing @" + user + "'s user timeline.");
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }
	}
}
