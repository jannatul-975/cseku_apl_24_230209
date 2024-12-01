#include <stdio.h>

int main(void)
{
    int index, innerIndex, tmp, numOfElements; // Declaration of variables

    // Prompt user for the number of elements in the array
    printf("Enter the number of elements in array: ");
    scanf("%d", &numOfElements); // Read the number of elements

    int arr[numOfElements]; // Declare an array of size numOfElements

    // Read numOfElements from the array
    for (index = 0; index < numOfElements; index++)
    {
        scanf("%d", &arr[index]); // Input each element
    }

    // Sorting in ascending order using bubble sort
    for (index = 0; index < numOfElements - 1; index++)
    {
        for (innerIndex = index + 1; innerIndex < numOfElements; innerIndex++)
        {
            // Start innerIndex from index + 1
            if (arr[index] > arr[innerIndex])
            {
                // If current element is greater than the next
                // Swap the elements
                tmp = arr[index];
                arr[index] = arr[innerIndex];
                arr[innerIndex] = tmp;
            }
        }
    }

    // Output the sorted array in ascending order
    printf("\nSorted array in ascending order:\n");
    for (index = 0; index < numOfElements; index++)
    {
        printf("%d ", arr[index]); // Print each element
    }

    // Sorting in descending order using bubble sort
    for (index = 0; index < numOfElements - 1; index++)
    {
        for (innerIndex = index + 1; innerIndex < numOfElements; innerIndex++)
        {
            // Start innerIndex from index + 1
            if (arr[index] < arr[innerIndex])
            {
                // If current element is less than the next
                // Swap the elements
                tmp = arr[index];
                arr[index] = arr[innerIndex];
                arr[innerIndex] = tmp;
            }
        }
    }

    // Output the sorted array in descending order
    printf("\nSorted array in descending order:\n");
    for (index = 0; index < numOfElements; index++)
    {
        printf("%d ", arr[index]); // Print each element
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
