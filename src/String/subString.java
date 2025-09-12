package String;

public class subString {
    public static String subString(String str,int si,int ei){
        String sub="";
        for(int i=si;i<ei;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(subString(str,0,4));
        System.out.println(str.substring(0,5));
    }
}
