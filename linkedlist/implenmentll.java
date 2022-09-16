package linkedlist;
public class implenmentll {
    public static void main(String[] args) {
        Linkedlist<Integer> ll = new Linkedlist<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.recRev();
        ll.print();


    }
}
class Linkedlist<type> {

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
        if(head==null || head.ref==null){
            return;
        }
        node prev=null;
        node curr=head;
        node next=null;
        while(curr!=null){
            next=curr.ref;
            curr.ref=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void recRev(){
        recRev(head);
    }
    node recRev(node ptr){
        if(ptr ==null || ptr.ref==null){
            return ptr;
        }
        node newhead=recRev(ptr.ref);
        ptr.ref.ref=ptr;
        ptr.ref=null;
        head=newhead;
        return newhead;

    }
    
}


