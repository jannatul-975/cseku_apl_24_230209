#include <stdio.h>
#include <string.h>
int main()
{

    int i, j;
    char t;
    char str[50];
    printf("Enter a string:");
    gets(str);
    int l = strlen(str);
    for (i = 0; i < l; i++)
    {
        if (str[i] == ' ')
        {
            for (j = i; j < l; j++)
            {
                str[j] = str[j + 1];
            }
        }
    }
    puts(str);
    return 0;
}
