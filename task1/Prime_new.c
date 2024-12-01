#include <stdio.h>
#include <math.h> // Include math.h for the sqrt function

int main(void)
{
    int number, flag = 1; // Decleration of variables

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%d", &number); // Scan a number

    // Check for factors from 2 to sqrt(n)
    for (int index = 2; index <= sqrt(number); index++)
    {
        if (number % index == 0 && number != 2)
        {
            flag = 0; // Set flag to 0 if a factor is found
            break;    // Exit the loop if a factor is found
        }
    }

    // Special case for number 1
    if (number == 1)
    {
        printf("The number %d is not prime", number);
    }

    // If no factors were found, the number is prime
    else if (flag == 1)
    {
        printf("The number %d is prime", number);
    }

    // If a factor was found, the number is not prime
    else
    {
        printf("The number %d is not prime", number);
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
