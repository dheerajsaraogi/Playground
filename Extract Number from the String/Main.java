#include <bits/stdc++.h>
using namespace std;


int main() 
{
   // Try out your code here
  int t;
  cin>>t;
	string str;
  
  while(t--)
  {
  	cin.ignore();
    getline(cin,str);
    
    int n = str.length();
    long long res=-1,a=0;
   for(int i=0;i<n;i++)
   {
         int n9=0;
         string num = "";
   		while(str[i]>='0' && str[i]<='9')
        {
        	if(str[i] == '9')
            {
            	n9=1;
            }
          	num += str[i];
          	i++;
        }
     	if(n9 == 0 && num != "")
        {
        	 a = stoll(num);
        }
     
     	if(a>res)
        {
        	res = a;
        }
     
   }
    
    
    if(res == -1)
  {
  cout<<"-1"<<endl;
  }else{
  cout<<res<<endl;
  }
  }
  return 0;
}