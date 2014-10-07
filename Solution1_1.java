public class Solution1_1 {
	
	public static void main(String args[]) {
		Solution1_1 solution1_1 = new Solution1_1();
		System.out.println(solution1_1.isAllUnique("dfvsxvg"));
		System.out.println(solution1_1.isAllUnique("hcnd"));
	}

	public boolean isAllUnique(String str) {
		if(str.length() > 256)
			return false;

		boolean[] asciiChars = new boolean[256];		
		char[] chars = str.toCharArray();
		for(char ch : chars) {
			if(asciiChars[ch]) 
				return false;
			asciiChars[ch] = true;
		}

		return true;
	}

}