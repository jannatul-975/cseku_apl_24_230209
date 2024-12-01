#include <stdio.h>

int main(void)
{
    int originalNumber, palindromeNumber = 0, lastDigit, tmp_Number; // Declaration of variables

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%d", &originalNumber); // Scan a number

    tmp_Number = originalNumber; // Store the original number

    // Reverse the number
    while (originalNumber != 0)
    {
        lastDigit = originalNumber % 10;                // Get the last digit
        palindromeNumber = (palindromeNumber * 10) + lastDigit; // Append the digit to the reversed number
        originalNumber = originalNumber / 10; // Remove the last digit from the original number
    }

    // Check if the original number is equal to the reversed number
    if (palindromeNumber == tmp_Number)
    {
        printf("The number %d is palindrome", tmp_Number);
    }
    else
    {
        printf("The number %d is not palindrome", tmp_Number);
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
