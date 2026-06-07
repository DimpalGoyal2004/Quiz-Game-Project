import java.util.*;
class quiz{
    public static void main(){
         Scanner sc  = new Scanner(System.in);
         int score=0;
         
         System.out.println("Welcome to Quiz Game!");
         
         System.out.println("\nQ1. Java is?");
         System.out.print("(a) Programming language\n");
         System.out.println("(b) Fruit name");
         System.out.println("(c) Animal name");
         
         String ans1 = sc.next();
         
         if(ans1.equalsIgnoreCase("a")){
             System.out.println("Correct!");
             score++;
         }
         else{
             System.out.println("Wrong!");
         }
         System.out.println("\nQ2. Which keyword is used for interface?");
         System.out.println("(a) Extends");
         System.out.println("(b) Implement");
         System.out.println("(c) Runnable");
         
         String ans2 = sc.next();
         if(ans2.equalsIgnoreCase("b")){
             System.out.println("Correct!");
             score++;
         }
         else{
             System.out.println("Wrong!");
         }
         System.out.println("\nQ3. Which keyword is used for inheritance?");
         System.out.println("(a) Extends");
         System.out.println("(b) Implement");
         System.out.println("(c) Runnable");
         
         String ans3 = sc.next();
         if(ans3.equalsIgnoreCase("a")){
             System.out.println("Correct!");
             score++;
         }
         else{
             System.out.println("Wrong!");
         }
    
    System.out.println("\nQ4. Which is a type of OOPS?");
    System.out.println("(a) Polymorphism");
    System.out.println("(b) Extends");
    System.out.println("(c) Threads");
    
    String ans4 = sc.next();
    if(ans4.equalsIgnoreCase("a")){
        System.out.println("Correct!");
        score++;
    }
    else{
        System.out.println("Wrong!");
    }
    
    System.out.println("\nQ5 Which is not a Access Modifier in java?");
    System.out.println("(a) Private");
    System.out.println("(b) Default");
    System.out.println("(c) Throws");
     
    String ans5= sc.next();
    if(ans5.equalsIgnoreCase("c")){
        System.out.println("Correct!");
        score++;
    }
    else{
        System.out.println("Wrong!");
    }
    if(score==5){
        System.out.println("Excellent!");
    }
    else{
        System.out.println("You Do Not Well Done!");
    }
}
}