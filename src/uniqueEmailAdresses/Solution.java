package uniqueEmailAdresses;
import java.util.*;

public class Solution {
	public int numUniqueEmails(String[] emails) {
		Set<String> distinctEmails = new TreeSet<>();
		
		for (int i = 0; i < emails.length; i++) {
			String currentEmail = emails[i];
			String[] localAndDomain = currentEmail.split("@");
			String local = localAndDomain[0];
			String domain = localAndDomain[1];
			//System.out.println(localAndDomain[1]);
			
			if(local.contains("+")) {
				int upTo = local.indexOf("+");
				local = local.substring(0,upTo);
			}
			
			if(local.contains(".")) {
				local = local.replace(".", "");
			}
			
			String email = local + "@" + domain;
			System.out.println(email);
			distinctEmails.add(email);
		}
		return distinctEmails.size();
	}
	
	public static void main (String args[]) {
		Solution tester = new Solution();
		String [] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(tester.numUniqueEmails(emails));
	}
}
