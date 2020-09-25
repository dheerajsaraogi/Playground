#include <bits/stdc++.h>

using namespace std;

void isPrime(int num ,vector<int>&prime)
{
	for(int i=2;i<=sqrt(num);i++)
    {
    	if(num%i == 0)
			return;
    }
  	prime.push_back(num);
}

void findPair(vector<int> prime)
{
	unordered_set<int>s;
  	int count=0;
  	for(int i=0;i<prime.size();i++)
    {
    	s.insert(prime[i]);
    }
  	for(int i=0;i<prime.size();i++)
    {
    	if(s.find(prime[i]-6) != s.end())
          count++;
    }
  	if(count)
      cout<<count;
  	else
      cout<<"No Prime Pairs";
  
  	return;
}

int main() 
{

	int n,m;
  	cin>>n>>m;
  
  vector<int>prime;
  
  	for(int i=n;i<=m;i++)
    {
    	 isPrime(i,prime);
    }
  
  	findPair(prime);
  
  return 0;
}