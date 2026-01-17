import java.util.Scanner;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    static void main() {
        Scanner in=new Scanner(System.in);
        String hayStack=in.next();
        String needle=in.next();
        int z=strStr(hayStack,needle);
        System.out.println(z);
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

//2nd Method : :
/*
public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    static void main() {
        Scanner in=new Scanner(System.in);
        String hayStack=in.next();
        String needle=in.next();
        int z=strStr(hayStack,needle);
        System.out.println(z);
    }
    public static int strStr(String haystack, String needle) {
       for(int i=0;i<haystack.length()-needle.length();i++){
           if(match(haystack,i,needle)) return i;
       }
       return -1;
    }
    public static boolean match(String haystack,int i,String needle){
      int j=0;
        while(i<haystack.length() && j<needle.length())
        {
            if(haystack.charAt(i)!=needle.charAt(j)) return false;
            i++;
            j++;
        }
        return true;
    }
}
* */