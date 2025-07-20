public class RecursivePalindrom {
    public static boolean check(int i, String str){
        int e = str.length();
        if(i >= e/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(e-i-1)) return false;
        return check(i+1, str);
    }
    public static void main(String[] args){
        String s = "malayalam";
        System.out.println(check(0, s));
    }
}
