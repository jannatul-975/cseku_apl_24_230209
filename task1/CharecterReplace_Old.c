#include <stdio.h>
#include <string.h>
int main()
{

    int i, j, k, m;
    char str[50], str2[50];
    printf("Enter a string:");
    gets(str);
    int l = strlen(str);
    for (i = 0; i < l - 2; i++)
    {
        if (str[i] == 'a' && str[i + 1] == 'b' && str[i + 2] == 'c')
        {
            str[i] = 'c';
            str[i + 1] = 'd';

            for (j = 0, k = i + 3; k < l; j++, k++)
            {
                str2[j] = str[k];
            }
            l = l - 1;
            for (m = i + 2, j = 0; m < l; m++, j++)
            {
                str[m] = str2[j];
            }
        }
    }
    str[l] = '\0';
    puts(str);

    return 0;
}
