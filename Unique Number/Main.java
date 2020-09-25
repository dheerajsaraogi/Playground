#include <bits/stdc++.h>
using namespace std;

void checkUniqueNumber(int num, int &count)
{
	vector<int>freq(10,0);
  	while(num)
    {
    	int temp = num%10;
      	freq[temp]++;
      	num = num/10;
      	if(freq[temp]>1)
          return;
    }
  	count++;
}

int main() 
{
   // Try out your code here
	int low,high,count=0;
  	cin>>low>>high;
  
  	for(int i=low;i<=high;i++)
    {
    	checkUniqueNumber(i,count);
    }
  	if(count)
  		cout<<count;
  	else
      	cout<<"No Unique Number";
  return 0;
}