#include <stdio.h>


int function_sum(int a, int b);

int main (void)
{

int result;
printf("Hello in my program\r\n");

result = function_sum(20,30);

printf("Result of sum = %d \r\n", result);

return 0;

}

int function_sum (int a, int b)
{
    return a+b;

}
