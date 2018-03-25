
public class DivideConquer {

	public static void main(String[] args) {

		//Example long string
		String toSearch = "You have a long string containing many characters (such as this paragraph)"
				+ ", and you want to search for a substring within this string."; 
		
		int length = toSearch.length();
		
		//Divide string into two halves
		String firstHalf = toSearch.substring(0, length / 2);
		String secondHalf = toSearch.substring(length / 2);
		
		String firstSearch = "characters"; //|
		String secondSearch = "want to";   //|
		String thirdSearch = "bstring wi"; //|- Things to search from the example
		String fourthSearch = "language";  //|
		String fifthSearch = "paragraph";  //|
	
		System.out.println(toSearch);
		
		//Search for the different strings
		if (search(firstSearch, firstHalf) || search(firstSearch, secondHalf)) {
			System.out.println(firstSearch + " was found!");
		} else {
			System.out.println(firstSearch + " was not found!");
		}
		
		if (search(secondSearch, firstHalf) || search(secondSearch, secondHalf)) {
			System.out.println(secondSearch + " was found!");
		} else {
			System.out.println(secondSearch + " was not found!");
		}
		
		if (search(thirdSearch, firstHalf) || search(thirdSearch, secondHalf)) {
			System.out.println(thirdSearch + " was found!");
		} else {
			System.out.println(thirdSearch + " was not found!");
		}
		
		if (search(fourthSearch, firstHalf) || search(fourthSearch, secondHalf)) {
			System.out.println(fourthSearch + " was found!");
		} else {
			System.out.println(fourthSearch + " was not found!");
		}
		
		if (search(fifthSearch, firstHalf) || search(fifthSearch, secondHalf)) {
			System.out.println(fifthSearch + " was found!");
		} else {
			System.out.println(fifthSearch + " was not found!");
		}
		
		
	}

	static boolean search(String target, String para){
		String f = firstHalfMaker(para);
		String s = secondHalfMaker(para);
		
		if (f.contains(target) || (s.contains(target))){
			return true;
		} else {
//		search(target, f); Doesn't work, crashes the program
//		search(target, s);
		return false;
		}
	}
	
	//Methods for splitting the string into halves
	static String firstHalfMaker(String full){
		return full.substring(0, full.length() / 2);
		
	}
	
	static String secondHalfMaker(String full){
		return full.substring(full.length() / 2);
	}
	
	
}
