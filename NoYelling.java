 class NoYelling {
    public static void main(String[] args) {
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));     
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!")); 
    }

    static String noYelling(String sen) {

        return sen.replaceAll("([?!])\\1+$", "$1");
        //[] list of char where the value match or not
        //\\1+ from the backside of the string only first group 
        //$ pattern will end of the string
        //it  read from end of the each string and only replace the first group of it

    }
}
