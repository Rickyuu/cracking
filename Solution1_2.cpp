#include <iostream>

using namespace std;

void reverse(char* str) {
	if(str == NULL)
		return;

	char* right = str;
	while(*right) {
		right ++;
	}
	right --;

	while(right > str) {
		char temp = *str;
		*str = *right;
		*right = temp;
		str ++;
		right --;
	}
}

void printResult(char* test) {
	if(test == NULL) {
		reverse(test);
	} else {
		cout << test << " ";
		reverse(test);
		cout << test << endl;
	}
} 

int main() {
	char test0[] = "";
	char test1[] = "e";
	char test2[] = "me";
	char test3[] = "mng";
	char test4[] = "mkls";
	char test5[] = "msloc";
	char test[] = "msjcoqlhfc";
	printResult(NULL);
	printResult(test0);
	printResult(test1);
	printResult(test2);
	printResult(test3);
	printResult(test4);
	printResult(test5);
	printResult(test);
	return 0;
}