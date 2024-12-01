#include <stdio.h>
#include <string.h>

int main()
{
    char string[50]; // Declaration of character array
    int i, j, k;     // Declaration of variables

    // Prompt the user to enter a string
    printf("Enter a string: ");
    gets(string);                // Read input string
    int length = strlen(string); // Get the length of the string

    // Loop through the string to find the substring "abc"
    for (i = 0; i < length - 2; i++)
    {
        if (string[i] == 'a' && string[i + 1] == 'b' && string[i + 2] == 'c')
        {
            // Replace "abc" with "cd"
            string[i] = 'c';
            string[i + 1] = 'd';

            // Shift the remaining characters to the left
            for (j = i + 2, k = i + 3; k < length; j++, k++)
            {
                string[j] = string[k];
            }
            length = length - 1; // Decrease the length of the string by 1
        }
    }
    string[length] = '\0'; // Null-terminate the modified string
    puts(string);          // Output the modified string

    return 0;
}

/*
Sample Input and Output

    Input :

    Enter a string : abcdefabc

    Output :
    cddefcd
*/
