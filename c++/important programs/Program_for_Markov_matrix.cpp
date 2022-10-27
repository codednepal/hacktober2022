// C++ code to check Markov Matrix
#include <iostream>
using namespace std;
 
#define n 3
 
bool checkMarkov(double m[][n])
{
    // outer loop to access rows
    // and inner to access columns
    for (int i = 0; i <n; i++) {
 
        // Find sum of current row
        double sum = 0;
        for (int j = 0; j < n; j++)
            sum = sum + m[i][j];
 
        if (sum != 1)
        return false;
    }
 
    return true;
}
 
// Driver Code
int main()
{
    // Matrix to check
    double m[3][3] = { { 0, 0, 1 },
                    { 0.5, 0, 0.5 },
                    { 1, 0, 0 } };
 
    // calls the function check()
    if (checkMarkov(m))
        cout << " yes ";
    else
        cout << " no ";
}