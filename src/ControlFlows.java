public class ControlFlows {
    public static void main(String[] args){
        int marks = Integer.parseInt(args[0]);

        if(marks>70){
            System.out.println("Grade A");
        }else if(marks>55){
            System.out.println("Grade B");
        }else if(marks>40){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
