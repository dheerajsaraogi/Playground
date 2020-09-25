#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,temp; 
  cin>>n;
  int arr[2] ={0};
  for(int i=0;i<n;i++)
  {
  	cin>>temp;
    arr[temp]++;
  }
  	while(arr[0]--)
    {
    	cout<<"0";
    }
  	while(arr[1]--)
    {
    	cout<<"1";
    }
    return 0;
}