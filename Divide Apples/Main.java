#include <bits/stdc++.h>
using namespace std;

int main() 
{

	int n;
  cin>>n;
  vector<int>a(n,0);
  vector<int>b(n,0);
  long long int avg=0;
  
  for(int i=0;i<n;i++)
  {
  	cin>>a[i];
    avg += a[i];
  }
  avg = avg/n;
 for(int i=0;i<n-1;i++)
 {
   b[i+1] = a[i] +b[i] - avg;
 }
 	sort(b.begin(),b.end());
  int m = -b[n/2];
 
  long long int res=0;
  
  for(int i=0;i<n;i++)
  {
  	res += abs(b[i] +m);
  }
  
  cout<<res;
  
  return 0;
}