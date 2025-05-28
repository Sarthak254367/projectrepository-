public class string {
    public static void main(String[] args) {
        String name="Sarthak";
        char target='t';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target) {
        if(str.length()==0) {
            return  false;
        }
    for(int i=0; i<str.length(); i++) {
        if(target==str.charAt(3)){
            return true;
        }
    }
    return false;
    }
}
