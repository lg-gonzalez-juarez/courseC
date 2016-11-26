#include <iostream>

using namespace std;

int main()
{
    
    int a = 1;
    cout << "a: " << a << endl; 
   
    int* pointer_1_to_a;
    pointer_1_to_a = &a;
    cout << "Pointer 1 to a: " << pointer_1_to_a << endl; 
    
    int* pointer_2_to_a = &a;
    cout << "Pointer 2 to a: " << pointer_2_to_a << endl; 
   
   return 0;
}