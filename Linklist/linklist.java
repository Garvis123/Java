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

    public int itrSearch(int key) // through iteration 
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)// key found
            {
                return i;
            }
 
            temp=temp.next; 
            i++;
        }
        return -1; // key not found

    }

   public int helper(Node head,int key)
   {
       if(head==null)
       {
         return -1;
       }
      if(head.data==key)
      {
        return 0;
      }
      int idx=helper(head.next, key);

      if(idx==-1) return -1;

      return idx+1;

   }
    public int recSerch(int key) // we require a helper function for it 
    {
      return helper(head, key);
    }

    public void reverse() //0(n)
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //find & remove nth node from end
    public void deletenthnode(int n)
    {
        int size=0;
        Node temp=head;
        while(temp != null)
        {
            temp=temp.next;
            size++;
        }
        if(n==size) // head case
        {
         head=head.next;
        }
        int i=1;
        int itoFind=size-n;// prev wlaa 5-3=2
       Node prev=head;
        while(i<itoFind)
        {
         prev=prev.next;
         i++;;
        }
        prev.next=prev.next.next;
        return;
    }

    // Slow - Fast Approch
    public Node findMid(Node head)//healper
    {
       Node slow=head;
       Node fast=head;

       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;//+1
        fast=fast.next.next;//+2
       }
       return slow;//slow will tell the middleware
    }

    public boolean palindrome()
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        //step 1 find mid
        Node midNode=findMid(head);

        //step 2 find rever of 2 halg right
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left=head;

        //step 3 check for the palindrome 
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
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
    linklist ll = new linklist();  // Use your custom linked list, not java.util.LinkedList
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 9);

    ll.print();
    // ll.reverse();
    // ll.print();
    // ll.deletenthnode(3); 
    // ll.print();
    System.out.print(ll.palindrome()); // use your custom print method
    // System.out.println(ll.recSerch(3));
      // now it will work

    // System.out.println(ll.size);  // access size directly
}

}
