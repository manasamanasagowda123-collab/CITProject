public class Nestedif {
    public static void main(String[] args) {
        int age=65;
        if(age>=18){
            if (age>=65){
                System.out.println("Eligible to vote and avail goverment fund");
            }
            else
                System.out.println("we are not Eligible to vote and avil goverment fund");
        }else
            System.out.println("we are not eligible to vote");
                
    }

}
