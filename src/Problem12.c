// 問題1.2
// CかC++で、void reverse(char* str)という'\0'終端の文字列を逆に並べ変える関数を実装してください。

#include <stdio.h>
#include <string.h>

void reverse(char* str)
{
  char tmp;
  int last;
  int length = strlen(str);

  for (int i = 0; i < length / 2; i++) {
    last      = length - 1 - i;
    tmp       = str[i];
    str[i]    = str[last];
    str[last] = tmp;
  }
}

int main(int argc, char** argv)
{
  reverse(argv[1]);
  printf("%s\n", argv[1]);
}
