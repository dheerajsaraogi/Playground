#include <iostream>

using namespace std;

struct node{

  int data;
  struct node* next;
};

struct node* insertNode(struct node* head,int data)
{
	struct node* newnode = (node*)malloc(sizeof(struct node));
  
  	if(head==NULL)
    {
    	return newnode;
    }
  
  	node *temp = head;
  	while(temp->next != NULL)
    {
    	temp = temp->next;
    }
  
  	newnode->data = data;
  	temp->next = newnode;
 
  	return head;
}

string getNode(struct node* head,int k)
{
  	node *slow=head, *fast=head;
 
  	while( slow && k--)
    {
    	slow = slow->next;
    }
 	if(slow==NULL)
    {
    	return "No node found";
    }

    return to_string(slow->data);

}
int main() 
{
    int n,data;
  	cin>>n;
  
  	struct node* head = (node*)malloc(sizeof(struct node));
  	head ==NULL;
  
  	for(int i=0;i<n;i++)
    {
      	cin>>data;
    	head = insertNode(head,data);
    }
  
  	int k;
  	cin>>k;
  
  	cout<<getNode(head,k);
    return 0;
}

