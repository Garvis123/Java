public class FriendPairing {

    public static int friend(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        return friend(n-1) + ((n-1) * friend(n-2));
        
        // return singleParing + doublePairing 
    }
    public static void main(String args[])
    {
        System.out.print(friend(3));
    }
}
