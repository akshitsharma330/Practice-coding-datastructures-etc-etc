package linkedlist;

public class Linkedlist<type> {

    node head=null;
    class node{
        type data;
        node ref;

    }


    void add(type d)
    {
        node temp=new node();
        temp.data=d;
        if(head==null)
        {
            temp.ref=head;
            head=temp;

        }
        else
        {
            node ptr=head;;
            while(ptr.ref!=null)
            {
                ptr=ptr.ref;
            }
            ptr.ref=temp;
        }


    }
    void print()
    {   node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.ref;
        }

    }
    void rev(){
        node curr=head;
        node prev=null;
        node next=null;
        while(curr!=null){
            next=curr.ref;
            curr.ref=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
}
