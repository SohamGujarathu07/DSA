import java.util.*;
public class Stringsearch {
    static void search(String str,char target){
        if(str.length() == 0){
            System.out.println("Empty!!!!");
        }
        boolean ans = false;
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                index = i;
                ans = true;
            }
        }
        if (ans = true) {
            System.out.println("Element Found at index:" + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = "SohamGujarathi";
        char target = 'G';
        search(name, target);
    }
}

