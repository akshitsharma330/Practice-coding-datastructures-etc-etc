public class linkedlist {
    class node{
        int data;
        node ref;
    }
    node head=null;

    public void add(int data)
    {
        node temp=new node();
        temp.data=data;

        if(head==null)
        {
            head=temp;
            temp.ref=null;

        }
        else{
            node ptr=head;
            while(ptr.ref!=null)
            {
                ptr=ptr.ref;

            }
            ptr.data=data;
        }

    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            node ptr=this.head;
            while(ptr!=null)
            {
                System.out.print(ptr.data+" ");
                ptr=ptr.ref;
            }
        }
    }
}
