#include <stdio.h>
#include <stdlib.h>


typedef struct node
{
    int data;
    struct node *next;
}node;


int main(int argc, char *argv[])
{

    node *list = NULL;
    
    for (int i=1; i < argc; i++)
    {
        int data = atoi(argv[i]);
        
        node *n = malloc(sizeof(node));
        if (n==NULL)
        {
            return 1;
        }
        n->data = data;
        n->next =list;

        
        list = n;
    }

    //print whole list
    node *ptr = list;
    while (ptr != NULL)
    {
        printf("%i\n",ptr->data);
        
    }
}