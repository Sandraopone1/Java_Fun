// java.lang.String.trim()
public class StringManipulator{
	public String trimAndConcat(String word, String letter){
		 String wordy = word.trim();
		 String lettery = letter.trim();
		String answer = wordy + lettery;
		return answer;

	}

	// public int getIndexOrNull(String getIndex, char character){
	// 	int indexFound = getIndex.indexOf(character);
	// 	// if (indexFound == -1){
	// 	// 	return " no index";
	// 	// }
	// 	// else{
		
	// 	return indexFound;
	// // }
	// }



	public int getIndexOrNull(String getIndex, String character){
		int indexFound = getIndex.indexOf(character);
		// if (indexFound == -1){
		// 	return "null"
		// }
		// else{
		
		return indexFound;
	}

	// public integer getIndexOrNull(String getIndex, char character){

	// 	integer indexSubstring = getIndex.indexOf("character");
	// 	if (ndexSubstring == -1){
	// 		return "null"
	// 	}
	// 	else{
		
	// 	return indexSubstring
	// }

	// }

	public String concatSubstring(String first, int num, int val, String last){
		String value = first.substring(num, val);
		String complete = value.concat(last);
		return complete;
	}
}
		
	// }

// }





