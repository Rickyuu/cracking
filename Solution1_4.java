public class Solution1_4 {
	public static void main(String args[]) {
		char[] total = new char[50];
		char[] content = {'n', 'c', ' ', 's', 'z', ' ', ' ', ' ', 'f', ' ', ' ', 'c', 'a', ' '};
		for(int i=0; i<content.length; i++) {
			total[i] = content[i];
		}
		Solution1_4 solution1_4 = new Solution1_4();
		solution1_4.replaceSpace(total, content.length);
		System.out.println(new String(content));
		System.out.println(new String(total));
	}

	public void replaceSpace(char[] total, int length) {
		int newLength = length;
		for(int i=0; i<length; i++) {
			if(total[i] == ' ') {
				newLength += 2;
			}
		}

		total[newLength] = '\0';
		while(length > 0) {
			if(total[--length] != ' ') {
				total[--newLength] = total[length];
			} else {
				total[--newLength] = '0';
				total[--newLength] = '2';
				total[--newLength] = '%';
			}
		}
	}
}