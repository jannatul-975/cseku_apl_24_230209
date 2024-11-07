#include <stdio.h>
#include <string.h>

int main()
{
    int i, j;     // Loop counters
    char str[50]; // Array to hold the input string

    // Prompt user for input
    printf("Enter a string: ");
    gets(str); // Read the input string

    int l = strlen(str); // Get the length of the string

    // Loop through the string
    for (i = 0; i < l; i++)
    {
        // Check for spaces in the string
        if (str[i] == ' ')
        {
            // Shift characters to the left to remove the space
            for (j = i; j < l; j++)
            {
                str[j] = str[j + 1];
            }
            l--; // Decrease length since we removed a character
            i--; // Decrease index to check the new character at the same position
        }
    }

    // Output the modified string without spaces
    puts(str);
    return 0;
}
/*
Sample input and output

input:

Enter a string: Hello World!

output:

HelloWorld!
*/