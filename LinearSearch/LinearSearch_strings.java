package LinearSearch;
import java.util.Scanner;

public class LinearSearch_strings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name=input.next();

        char target = 'y';

        System.out.println(searchString(name, target));

    }

    private static boolean searchString(String name, char target) {
        if(name.isEmpty()){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
