package UserData;

public class EmailUserNameParser {

	public static void main(String[] args) {
		String s= "Mr. Chales P. wooten, III";
		String[] s1=s.split(" ");
		String[] s2= {"salutation:"+s1[0],
				     "FirstName  :"+s1[1],
		             "Intials    :"+s1[2],
		             "LastName   :"+s1[3],
				     "Suffix     :"+s1[4]
		};
		for (String display:s2) {
			System.out.println(display);
			
		}
	

	}

}
