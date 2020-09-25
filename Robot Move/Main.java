#include <iostream>
using namespace std;

void robotMoves(int currentRow,int currentColumn,int m,int n, int &count)
{
	if(currentRow == m-1 && currentColumn == n-1)
    {
    	count++;
      return ;
    }
  if(currentRow >= m || currentColumn >=n)
    return;
  
  robotMoves(currentRow+1,currentColumn,m,n,count);
  robotMoves(currentRow,currentColumn+1,m,n,count);
  
  return;
  
  	
}

int main() 
{
   // Try out your code here
  
  	int m,n,count=0;
  
  cin>>m>>n;
  
      robotMoves(0,0,m,n,count);
    	cout<<count;
    return 0;
}