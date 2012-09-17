import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

		String filename = "";
		String path = "";
		String input = "1234561234\n" + "(456)789 4567\n" + "345-345-1234\n"
				+ "(789)-873-9427\n" + "1:00am\n" + "11:00 pm\n" + "2:00 AM\n"
				+ "5:02pm\n" + "1:19 pm\n" + "1:15 PM\n" + "1:50 pm\n"
				+ "\nemail1@yahoo.com\n" + "\nemail-id@yahoo.com\n"
				+ "myname1995@mydomain.com\n" + "name@mydomain.net\n"
				+ "name.100@hotmail.com.au\n" + "mygmail@gmail.com\n"
				+ "account@csail.mit.edu\n";

		if (input.isEmpty()) {
			System.out.println("File is empty or file not found");
		} else {

			List<String> phoneNumbers = getPhoneNumbers(input);
			System.out.println(phoneNumbers.size() + " phone numbers found :");
			for (String item : phoneNumbers) {
				System.out.println(item.toString());
			}

			List<String> emailAddresses = getEmailAddresses(input);
			System.out.println(emailAddresses.size()
					+ " email addresses found :");
			for (String item : emailAddresses) {
				System.out.println(item.toString());
			}

			List<String> timeStamps = getTimeStamp(input);
			System.out.println(timeStamps.size() + " time stamps found :");
			for (String item : timeStamps) {
				System.out.println(item.toString());
			}

		}
	}

	/**
	 * Extracts phone numbers from a String, and returns formated list of phone
	 * numbers
	 * 
	 * @param input
	 *            a string containing a-z A-Z 0-9 @ + - . \n white spaces and
	 *            phone number in one of the follwoing formats (xxx)xxx-xxxx
	 *            (xxx)-xxx-xxxx xxxxxxxxxx xxx-xxx-xxxx (xxx)xxx xxxx
	 * @return list of Strings containing phone numbers formated like
	 *         xxx-xxx-xxxx
	 */

	public static List<String> getPhoneNumbers(String input) {
		List<String> phonenumbers = new ArrayList<String>();
		return phonenumbers;
	}

	/**
	 * Extracts email addresses from a String and returns a formated list
	 * 
	 * @param input
	 *            a string containing email addresses in format
	 *            something@something.xxx "something" may contains dots input
	 *            file may contain a-z A-Z 0-9 @ + - . \n white spaces
	 * @return list of Strings containing email addresses in original formating
	 */
	public static List<String> getEmailAddresses(String input) {
		List<String> emailaddresses = new ArrayList<String>();
		return emailaddresses;

	}

	/**
	 * Extracts time stamps from a String and returns a formated list
	 * 
	 * @param input
	 *            a string containing a-z A-Z 0-9 @ + - . \n white spaces and
	 *            time stamps like
	 * @return list of Strings containing time stamps in original formating
	 */
	public static List<String> getTimeStamp(String input) {
		List<String> timestamps = new ArrayList<String>();
		return timestamps;

	}

	/**
	 * Reads an input file and returns the content as String returns String
	 * empty string if file does not exist.
	 * 
	 * @param filename
	 *            a string containing path and name of file
	 * @return String content of the string
	 */

	public static String readFile(String filename) {
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));

			while (reader.ready()) { // Read
				String thisline = reader.readLine();
				sb.append(thisline + "\n");
			}

		} catch (IOException ex) {
			sb.append("");

		}
		return sb.toString();

	}

}
