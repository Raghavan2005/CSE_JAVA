 class Palindrome {
    public static void main(String[] args) {
     
       

router();


    }

   static void router(){
         if(!isPalindrome(11211230)){
             System.out.println(isdescendent("11211230")); 
         }
          if(!isPalindrome(13001120)){
            System.out.println(isdescendent("13001120")); 
         }

    }

    static boolean isdescendent(String value) {
        String reselt = value;


        while (reselt.length() > 1) {
            StringBuilder sb = new StringBuilder();
for (int i = 0; i < reselt.length(); i += 2) {
                int num1 = Character.getNumericValue(reselt.charAt(i));
                int num2 = (i + 1 < reselt.length()) ? Character.getNumericValue(reselt.charAt(i + 1)) : 0;
                int sum = num1 + num2;
                sb.append(sum);
            }

            reselt = sb.toString();
        }

        
        int finalValue = Integer.parseInt(reselt);

    
        return isPalindrome(finalValue);
    }

     static boolean isPalindrome(int num) {
        String value = String.valueOf(num);//123543
        
        int startstr = 0;
        int endstr = value.length() - 1; //5
        while (startstr < endstr) { //0<5
            
            if (value.charAt(startstr) != value.charAt(endstr)) {
                
                return false;
            }
            startstr++;
            endstr--;
        }
        return true;
        }
}
