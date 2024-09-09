#include <stdio.h>
int main(void)
{
    int n, p = 0, r, number;
    printf("Enter a number:");
    scanf("%d", &n);
    number = n;
    while (n != 0)
    {
        r = n % 10;
        p = (p * 10) + r;
        n = n / 10;
    }
    if (p == number)
    {
        printf("The number %d is palindrome", number);
    }
    else
    {
        printf("The number %d is not palindrome", number);
    }
}