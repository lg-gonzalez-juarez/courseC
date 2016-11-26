#include <iostream>

using namespace std;

void function1()
{
    return;
}

int function2()
{
    return 0;
}

int function3(int a)
{
    a = a +25;
    cout << "function a is: " << a << endl;
    return 0;
}

int main()
{
    int a = 600;
    function1();
    function2();
    function3(a);
    cout << "main a is: " << a << endl;

   return 0;
}
