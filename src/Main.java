public class Main {
    public static void main(String[] args) {
        /*char[] ch = {'J','a','v','a',' ','S','t','r','i','n','g'};
        String s = new String(ch);
        System.out.println(ch);

        String str = "Java String";
        System.out.println(str);*/

        //the + can use to concatenate strings
        String p = "Hello";
        String q = "World";
        System.out.println(p+q); // concatenate the p and q

        String a = "Hello";
        System.out.println("Hello".equals(a));//check whether strings are equal or not here they are equal
        System.out.println("hello".equals(a));
        System.out.println("hello".equalsIgnoreCase(a));
    }
}