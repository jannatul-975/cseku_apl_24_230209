#include <stdio.h>
#include <string.h>

int main()
{
    int outerIndex, innerIndex;     // Loop counters
    char inputString[50]; // Array to hold the input string

    // Prompt user for input
    printf("Enter a string: ");
    gets(inputString); // Read the input string

    int length = strlen(inputString); // Get the length of the string

    // Loop through the string
    for (outerIndex = 0; outerIndex < length; outerIndex++)
    {
        // Check for spaces in the string
        if (inputString[outerIndex] == ' ')
        {
            // Shift characters to the left to remove the space
            for (innerIndex = outerIndex; innerIndex < length; innerIndex++)
            {
                inputString[innerIndex] = inputString[innerIndex + 1];
            }
            length--; // Decrease length since we removed a character
            outerIndex--; // Decrease index to check the new character at the same position
        }
    }

    // Output the modified string without spaces
    puts(inputString);
    return 0;
}
/*
Sample input and output

input:

Enter a string: Hello World!

output:

HelloWorld!
*/
