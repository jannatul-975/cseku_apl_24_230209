#include <stdio.h>

int main(void)
{
    int n, p = 0, r, number; // Declaration of variables

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%d", &n); // Scan a number

    number = n; // Store the original number

    // Reverse the number
    while (n != 0)
    {
        r = n % 10;       // Get the last digit
        p = (p * 10) + r; // Append the digit to the reversed number
        n = n / 10;       // Remove the last digit from the original number
    }

    // Check if the original number is equal to the reversed number
    if (p == number)
    {
        printf("The number %d is palindrome", number);
    }
    else
    {
        printf("The number %d is not palindrome", number);
    }

    return 0;
}

/*
Sample Input and Output

    Input :

    Enter a number : 121

    Output :

    The number 121 is palindrome

    Input :

    Enter a number : 123

    Output :

    The number 123 is not palindrome
*/