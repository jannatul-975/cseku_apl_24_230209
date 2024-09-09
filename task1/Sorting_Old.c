#include <stdio.h>
int main(void)
{
    int i, j, tmp, n;
    printf("Enter the number of elements in array:");
    scanf("%d", &n);
    int arr[n + 1];
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < n - 1; i++)
    {
        for (j = i; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    printf("\nSorted array in ascending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
    for (i = 0; i < n - 1; i++)
    {
        for (j = i; j < n; j++)
        {
            if (arr[i] < arr[j])
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    printf("\nSorted array in descending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}