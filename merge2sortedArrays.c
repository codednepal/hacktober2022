// C program to merge two sorted arrays with O(1) extra
// space.
#include <stdio.h>
 
// Merge ar1[] and ar2[] with O(1) extra space

void merge(int ar1[], int ar2[], int m, int n)
{

    // Iterate through all elements

    // of ar2[] starting from the last element

    for (int i = n - 1; i >= 0; i--) {

        // Find the smallest element greater than ar2[i].

        // Move all elements one position ahead till the

        // smallest greater element is not found */

        int j, last = ar1[m - 1];

        for (j = m - 2; j >= 0 && ar1[j] > ar2[i]; j--)

            ar1[j + 1] = ar1[j];
 

        // If there was a greater element

        if (last > ar2[i]) {

            ar1[j + 1] = ar2[i];

            ar2[i] = last;

        }

    }
}
 
// Driver program

int main()
{

    int ar1[] = { 1, 5, 9, 10, 15, 20 };

    int ar2[] = { 2, 3, 8, 13 };

    int m = sizeof(ar1) / sizeof(ar1[0]);

    int n = sizeof(ar2) / sizeof(ar2[0]);

    merge(ar1, ar2, m, n);
 

    printf("After Merging \nFirst Array: ");

    for (int i = 0; i < m; i++)

        printf("%d ", ar1[i]);

    printf("\nSecond Array: ");

    for (int i = 0; i < n; i++)

        printf("%d ", ar2[i]);

    return 0;
}
 
// This code is contributed by Ramanujam 
