#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

  void f(void)
  {
	  printf("Inside function f\n");
  }                    

  void g(void)
{
	printf("\tInside function g\n");
	sleep(1);
}
  int main(void)
  {
	for (int i=0; i < 99999; i++) {
     		f();
		if (i % 100 == 0) {
			g();
		}
	}
     return 0;
  }
