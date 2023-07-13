public class Main {
    public static void main(String[] args) {

        //*********************************************
        /*char[] ch = {'J','a','v','a',' ','S','t','r','i','n','g'};
        String s = new String(ch);
        System.out.println(ch);

        String str = "Java String";
        System.out.println(str);*/

        /*
        //***************************************************
        //the + can use to concatenate strings
        String p = "Hello";
        String q = "World";
        System.out.println(p+q); // concatenate the p and q

        String a = "Hello";

        //here to check whether equal,they use hash method
        //in applications the passwords must be hashed(SHA-256)

        System.out.println("Hello".equals(a));//check whether strings are equal or not here they are equal
        System.out.println("hello".equals(a));
        System.out.println("hello".equalsIgnoreCase(a));//always true

        */

        String text= "NIBM Galle Branch";
        System.out.println(text.length());//length
        System.out.println(text.substring(5));//Substring substring from 5th letter
        System.out.println(text.substring(5,10));//substring from 5th to 10th letter
        System.out.println(text.indexOf('B'));//returns the first occurence of B
        System.out.println(text.lastIndexOf('B'));//last occurance of B
        System.out.println(text.charAt(5));//getting the character at a given index
        System.out.println(text.toUpperCase());//convert to upper case
        System.out.println(text.toLowerCase());//convert to lower case
        System.out.println(text.startsWith("NIBM"));//Text starts with returns a boolean values
        System.out.println(text.contains("Galle"));//Text contains returns a boolean valuessss



    }
}