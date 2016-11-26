#include <iostream>

using namespace std;

int function1(int* a)
{
    *a = *a +25;
    cout << "address of function a is: " << &a << endl;
    cout << "function a is: " << a << endl;
    return 0;
}

int main()
{
    int a = 600;
    cout << "address of main a is: " << &a << endl;
    function1(&a);
    cout << "main a is: " << a << endl;

   return 0;
}
