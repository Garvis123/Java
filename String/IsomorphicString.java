package String;
import java.util.Map;
import java.util.HashMap;


public class IsomorphicString {
    public static boolean isIsomorphic(String s , String t)
    {
    if(s.length()!=t.length())
    {
        return false;
    }
    Map<Character , Character> charMappingMap= new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        char original=s.charAt(i);
        char replacement=t.charAt(i);
        if(!charMappingMap.containsKey(original))
        {
            if(!charMappingMap.containsValue(replacement))
            charMappingMap.put(original,replacement);
            else
            return false;
        }
        else
        {
            char mappedCharacter= charMappingMap.get(original);
            if(mappedCharacter!=replacement)
            {
                return false;
            }
        }
    }
    return true;
    
    }
    public static void main(String args[])
    {
        String s="egg";
        String t="add";
        System.out.print(isIsomorphic(s,t));
    }
}
