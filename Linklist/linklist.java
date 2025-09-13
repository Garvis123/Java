import java.util.LinkedList;
import java.util.*;

public class linklist {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
    //   1.create a new node 
    Node newNode=new Node(data);
    size++;
    if(head==null) //base case 
    {
        head=tail=newNode;
        return;
    }

    //  2. newNode next pointing to head 
    newNode.next=head; //link;

    // 3.changing new node to head 
    head=newNode;

    }

    public void addLast(int data)
    {
        // 1.create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        // 2.next tail to new tail
         tail.next=newNode;

        //  3. new node to tail
        tail=newNode;

    }

    public void add(int idx,int data)
    {
        Node temp=head;
        Node newNode=new Node(data);
        size++; 
       int i=0;
       while(i<idx-1)
       {
         temp=temp.next;
         i++;
       }
    //  i=idx-1; temp->prev  
       newNode.next=temp.next;
       temp.next=newNode;


    }

    public int removefirst()
    {
     if(size==0)
     {
        System.out.print("LL is empty");
        return Integer.MIN_VALUE;
     }
     else if(size==1)
     {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
     }
     int val=head.data;
     head=head.next;
     size--;
     return val;

    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;// tail.data
        tail=prev;
        prev.next=null;
        size--;
        return val;
    }

    public static void print()
    {
        if(head==null)
        {
            System.out.print("it is null");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;

        }
        System.out.println();
    }
  public static void main(String args[]) {
    LinkedList<Integer> ll = new LinkedList<>();  // Specify Integer as the type
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2,9);

    System.out.println(ll);  // Use LinkedList's toString method instead of custom print
    System.out.println(ll.size());  // Use LinkedList's toString method instead of custom print
}
}
