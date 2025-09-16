
public class linkedlist {
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

    public static boolean Cycle()
    {
       Node slow=head;
       Node fast=head;
     while(fast!=null && fast.next!=null)
     {
            fast=fast.next.next;//+2
            slow=slow.next;//+1
            if(fast==slow)
            {
               return true;//cycle exists 
            }
        }
        return false;
    }

    public static void removeCycle()
    {
        Node slow=head;
        Node fast=head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
            cycle=true;
            break;
            }
        }
        if(cycle==false)
        {
            return;
        }


      //finding the meeting point
      slow=head;
      Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }

        //last node=null
          prev.next=null;
    }
    public static void main(String args[])
    {
        // Steps--> 
        // detect the cycle 
        
     head=new Node(1);
     Node temp=new Node(2);
     head.next=temp;
     head.next.next=new Node(3);
     head.next.next.next=temp;
     //1->2->3->1
     System.out.println(Cycle());
     removeCycle();;
     System.out.println(Cycle());

    }
}
