#include <stdio.h>
#include <string.h>

int main()
{
    int i, j, k, m;         // Declaration of variables
    char str[50], str2[50]; // Declaration of character array

    // Prompt the user to enter a string
    printf("Enter a string: ");
    gets(str);           // Read input string
    int l = strlen(str); // Get the length of the string

    // Loop through the string to find the substring "abc"
    for (i = 0; i < l - 2; i++)
    {
        if (str[i] == 'a' && str[i + 1] == 'b' && str[i + 2] == 'c')
        {
            // Replace "abc" with "cd"
            str[i] = 'c';
            str[i + 1] = 'd';

            // Shift the remaining characters to the left
            for (j = 0, k = i + 3; k < l; j++, k++)
            {
                str2[j] = str[k];
            }
            l = l - 1; // Decrease the length of the string by 1
            for (m = i + 2, j = 0; m < l; m++, j++)
            {
                str[m] = str2[j];
            }
        }
    }
    str[l] = '\0'; // Null-terminate the modified string
    puts(str);     // Output the modified string

    return 0;
}

/*
Sample Input and Output

    Input :

    Enter a string : abcdefabc

    Output :
    cddefcd
*/