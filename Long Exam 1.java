public class App {
    public static void main(String[] args) {

        String fullname = "keith niño lumelay";
        removeLetter(fullname, 0, fullname);
    }
    
    
    static String removeLetter(String string, int length, String result){

        if(string.length()==length)
        
            return result;

        String consonant = "bcdfghjklmnpqrstvwxyz";

        if(consonant.contains(String.valueOf(string.charAt(length))))

            return removeLetter(string, length+1, result);

        return removeLetter(string, length+1, result+String.valueOf (string.charAt(length)));
    }

}
