#include <bits/stdc++.h>

using namespace std;

class node{

  public:
  	int data;
  	node* next;
  
  	node(int val){
    	data = val;
      	this->next = NULL;
    }

};

void listTraversal(node* head)
{

  if(head ==NULL)
  {
    cout<<"Linked list is empty."<<endl;
    return;
  }

	while(head)
    {
    	cout<<head->data<<" ";
      	head = head->next;
    }
  	cout<<endl;
}

node* insertNodeStart(node* head,int data)
{
	node* newnode = new node(data);
  
  	if(head == NULL)
    {
      return newnode;
    }
      	
  	newnode->next=head;
 
  	return newnode;
 
}

 node* insertNodeLast(node* head,int data)
 {
 	node* newnode = new node(data);
  	if(head == NULL)
    {
      return newnode;
    }
   	node* temp= head;
   	while(temp->next!= NULL)
    {
    	temp = temp->next;
    }
   	temp->next = newnode;
   return head;
   
 }

node* deleteStart(node* head)
{
    if(head==NULL)
    {
        cout<<"Linked list is empty."<<endl;
    	return NULL;
    }
	node* temp = head;
  	head = head->next;
  	int val = temp->data;
  	free(temp);
  	cout<<val<<" deleted from beginning successfully."<<endl;
  	return head;
}

node*  deleteLast(node* head)
{
  	if(head==NULL)
    {
        cout<<"Linked list is empty."<<endl;
    	return NULL;
    }
  	
  	if(head->next ==NULL)
    {
    	int val = head->data;
  		cout<<val<<" deleted from end successfully."<<endl;
      	return NULL;
    }
  
  	node* temp = head;
  	node* prev =NULL; 
  	while(temp->next != NULL)
    {
     	prev = temp;
    	temp = temp->next;
    }

  	if(prev)
    {
    	prev->next =NULL;
    }
  	int val = temp->data;
  	cout<<val<<" deleted from end successfully."<<endl;
  	free(temp);

}

int main() 
{
   // Try out your code here
  	int n,data;
  
  node* head = NULL;
	while(1)
    {
      cin>>n;
      	switch(n)
        {
          case 1:cout<<"Enter value of element"<<endl;
            	 cin>>data;
            	head = insertNodeStart(head,data);
            	break;
          case 2:cout<<"Enter value of element"<<endl;
            	 cin>>data;
            	head = insertNodeLast(head,data);
            	break;
          case 3: listTraversal(head);
            		break;
          case 4: head = deleteStart(head);
            		break;
          case 5: head = deleteLast(head);
            		break;
          case 6:exit(0);
        }
      	
    }
 
    return 0;
}