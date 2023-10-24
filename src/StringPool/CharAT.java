package StringPool;

public class CharAT {
    public static void main(String[] args) {

        System.out.println(solve("Scaler"));

//        Scanner s = new Scanner(System.in);
//        String str = s.next();
//        for(int i = 0; i< str.length(); i++){
//            String a = s.next();
//            if(a == "97"){
//                System.out.println(97);
//            }else if(b ==)
//        }
//        Scanner s = new Scanner(System.in);
//        String str = "India";
////        char ch = 0;
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));


//        }

    }


    public static String solve(final String A) {

        String resultcopy = "";

        for (int i = 0; i < A.length() - 1; i++) {
            char ch = A.charAt(i);
            resultcopy = resultcopy + ch;
        }
        return resultcopy;
    }

}

  

