#include <stdio.h>
#include <math.h> // Include math.h for the sqrt function

int main(void)
{
    int n, flag = 1; // Decleration of variables

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%d", &n); // Scan a number

    // Check for factors from 2 to sqrt(n)
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0 && n != 2)
        {
            flag = 0; // Set flag to 0 if a factor is found
            break;    // Exit the loop if a factor is found
        }
    }

    // Special case for number 1
    if (n == 1)
    {
        printf("The number %d is not prime", n);
    }

    // If no factors were found, the number is prime
    else if (flag == 1)
    {
        printf("The number %d is prime", n);
    }

    // If a factor was found, the number is not prime
    else
    {
        printf("The number %d is not prime", n);
    }

    return 0;
}

/*
Sample Input and Output

    Input:

    Enter a number : 17

    Output:

    The number 17 is prime

    Input:

    Enter a number : 35

    Output:

    The number 18 is not prime
*/
