package intern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindLatin {

	public static void main(String[] args) {
		String sourceString = "hfdawhwhcoomdd";
		// Method 1: Using regex
		String regexString = "aw|aa|dd|ee|oo|ow|w";
		Pattern pattern = Pattern.compile(regexString);
		Matcher matcher = pattern.matcher(sourceString.trim());
		int count = 0;
		while (matcher.find()) {
			// If any match : Incre count
			++count;
			System.out.println(sourceString.substring(matcher.start(),matcher.end()));
		}
		System.out.println("Total vietnamese in latin: " + count);
		
		// Method 2: using for loop
		method2(sourceString);
	}
	public static void method2(String source) {
		String[] vietnameseStrings = {"aw","aa","dd","ee","oo","ow","w"};
		int count = 0;
		for (int i = 0; i < vietnameseStrings.length; i++) {
			if (source.contains(vietnameseStrings[i])) {
				++count;
			}
		}
		System.out.println(count);
	}

}
