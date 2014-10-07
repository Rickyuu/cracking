public class Solution1_3 {
	public static void main(String args[]) {
		Solution1_3 solution1_3 = new Solution1_3();
		System.out.println(solution1_3.isPermutation("abkd", "sm"));
		System.out.println(solution1_3.isPermutation("lxjsf vsx", "kxgvacsac"));
		System.out.println(solution1_3.isPermutation("lxje xs", "xjesx l"));
	}

	public boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}

		int count[] = new int[256];
		for(int i=0; i<str1.length(); i++) {
			char ch=str1.charAt(i);
			count[ch] ++;
		}

		for(int i=0; i<str2.length(); i++) {
			char ch=str2.charAt(i);
			count[ch] --;
			if(count[ch] < 0) {
				return false;
			}
		}
		return true;
	}
}