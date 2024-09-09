#include <stdio.h>
int main(void)
{
    int n, flag = 1;
    printf("Enter a number:");
    scanf("%d", &n);
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0 && n != 2)
        {
            flag = 0;
            break;
        }
    }
    if (n == 1)

    {
        printf("The number %d is not prime", n);
    }
    else if (flag == 1)
    {
        printf("The number %d is prime", n);
    }
    else
    {
        printf("The number %d is not prime", n);
    }
}