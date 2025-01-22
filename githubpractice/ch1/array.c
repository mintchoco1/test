#include <stdio.h>
#include <ctype.h> //isdigit isspace isalpha 함수의 라이브러리

#define VOWEL 0
#define CONSONANT 1
#define DIGIT 2
#define SPACE 3
#define OTHER 4
#define MAX 5

int main() {
  char i; // characters
  int j, c[MAX]; 

  for (j = 0; j < MAX; j++) { // for loop
    c[j] = 0;
  }//배열에 0 넣기
  //getchar 함수
  //getchar 함수는 입력 버퍼를 사용 
  //scanf 랑 다르게 문자 하나만 입력
  while ((i = getchar()) != '\n') { // while loop
    if (isdigit(i)) { // tons of if conditions
      c[DIGIT]++;
    } else if (isspace(i)) { // branches
      c[SPACE]++;      
    } else if (isalpha(i)) {
      i = toupper(i);
      if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
	c[VOWEL]++;
      } else {
	c[CONSONANT]++;	
      }
    } else { // default "nothing was met"
      c[OTHER]++;
    }
  }
  
  printf("There were %d digits.\n", c[DIGIT]);
  printf("There were %d spaces.\n", c[SPACE]);
  printf("There were %d vowels.\n", c[VOWEL]);
  printf("There were %d consonants.\n", c[CONSONANT]);
  printf("There were %d other characters.\n", c[OTHER]);
  return 0;
}