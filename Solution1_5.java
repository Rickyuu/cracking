public class Solution1_5 {
	public static void main(String args[]) {
		Solution1_5 solution1_5 = new Solution1_5();
		String str = "bbcccmsssssa";
		String str2 = "bbnfdmcklaa";
		System.out.println(str);
		
		System.out.println(solution1_5.compressStr(str));
		System.out.println(str2);
		
		System.out.println(solution1_5.compressStr(str2));
	}

	public String compressStr(String str) {
		StringBuffer strbuf = new StringBuffer();
		char pivot = str.charAt(0);
		int count = 1;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == pivot) {
				count ++;
				continue;
			}
			strbuf.append(pivot).append(count);
			pivot = str.charAt(i);
			count = 1;
		}
		strbuf.append(pivot).append(count);
		String newStr = strbuf.toString();
		if(newStr.length() >= str.length()) {
			return str;
		} 
		return newStr;
	}
}