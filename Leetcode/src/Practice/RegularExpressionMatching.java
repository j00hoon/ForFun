package Practice;



public class RegularExpressionMatching 
{
	public static void main(String[] args) 
	{
		String str1 = "aaba";
		String str2 = "ab*a*c*a";
		System.out.println("Res : " + isMatch(str1, str2));
	}
	
	private static boolean isMatch(String text, String pattern)
	{
		if(pattern.isEmpty()) 
        {
           return text.isEmpty();   
        }// if
          
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if(pattern.length() >= 2 && pattern.charAt(1) == '*')
        {
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        }// if
        else
        {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }// else
	}

}
