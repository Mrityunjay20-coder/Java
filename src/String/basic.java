package String;

public class basic {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       String fullName="Tony Stark";
        System.out.println(fullName.length());
        //concatenation
        String firstName="Mrityunjay";
        String lastName="Aditya";
        String fullName2=firstName+" "+lastName;
        System.out.println(fullName2);
       // System.out.println(fullName2.charAt(2));
        printLetters(fullName2);
    }
}
