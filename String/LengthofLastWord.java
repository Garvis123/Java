package String;

public class LengthofLastWord {
    public static void main(String args[])
{
    String s="   fly me   to   the moon  ";
    String words[]=s.trim().split("\\s+");
    int length=words[words.length-1].length();
    System.out.print(length);

    
}
}
