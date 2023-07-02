#include <stdlib.h>

// Example *bad* code from the Valgrind Quick Start
// Try to determine the troubles by reading the code

  void f(void)
  {
     int* x = malloc(10 * sizeof(int));
     x[10] = 0;
  }

  int main(void)
  {
     f();
     return 0;
  }