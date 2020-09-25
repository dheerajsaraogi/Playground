#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
	
  int t;
  cin>>t;
  
  while(t--)
  {
  	int n,p,res=0,val=1;
    cin>>n>>p;
	int i=1;
    if(p>n)
    {
    	cout<<"0"<<endl;
      continue;
    }
    while(val){
      val = n/(pow(p,i));
      res += val;
      i++;
    }
    cout<<res<<endl;
  }
  return 0;
}