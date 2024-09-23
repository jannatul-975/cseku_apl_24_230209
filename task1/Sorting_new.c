#include <stdio.h>

int main(void)
{
    int i, j, tmp, n; // Declaration of variables

    // Prompt user for the number of elements in the array
    printf("Enter the number of elements in array: ");
    scanf("%d", &n); // Read the number of elements

    int arr[n]; // Declare an array of size n

    // Read n elements into the array
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]); // Input each element
    }

    // Sorting in ascending order using bubble sort
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            // Start j from i + 1
            if (arr[i] > arr[j])
            {
                // If current element is greater than the next
                // Swap the elements
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    // Output the sorted array in ascending order
    printf("\nSorted array in ascending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]); // Print each element
    }

    // Sorting in descending order using bubble sort
    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            // Start j from i + 1
            if (arr[i] < arr[j])
            {
                // If current element is less than the next
                // Swap the elements
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }

    // Output the sorted array in descending order
    printf("\nSorted array in descending order:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]); // Print each element
    }

    return 0;
}

/*
Sample input and output

input:

Enter the number of elements in array: 5
34 7 23 32 5

output:

Sorted array in ascending order:
5 7 23 32 34
Sorted array in descending order:
34 32 23 7 5
*/