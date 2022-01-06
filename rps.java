import java.util.*;
class abc{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        Random rand=new Random(); 
        int cpu,wins=0,losses=0;
        String mychoice="";
        String computerchoice="";

        while(true){
        System.out.print("Enter your choice rock,paper or scissor,(if you want to exit the game type 'quit'): ");
        mychoice=ob.nextLine();    

        if(mychoice.equals("quit")){
            break;
        }

        if(!mychoice.equals("rock") && !mychoice.equals("paper") && !mychoice.equals("scissor")){
            System.out.println("Invalid input ");
        }else{
            cpu=rand.nextInt(3);

            if(cpu==0){
            computerchoice="rock";
            }else if(cpu==1){
            computerchoice="paper";
            }else{
            computerchoice="scissor";
            }

        System.out.println("computer choice: "+computerchoice);
         
        if(mychoice.equals(computerchoice)){
            System.out.println("Tie :|");
        }else if((mychoice.equals("rock") && computerchoice.equals("scissor")) || 
        (mychoice.equals("paper") && computerchoice.equals("rock")) ||
        (mychoice.equals("scissor") && computerchoice.equals("paper"))){
            System.out.println("You Won :)");
            wins++;
        }  else{
            System.out.println("You Lost :(");
            losses++;
        }
        System.out.println("You Won "+wins+" games");
        System.out.println("You Lost "+losses+" games");
        }
        }
        if(wins>losses){
            System.out.println("You Won more games than you lost");
        }else if(wins<losses){
            System.out.println("You Lost more games than you won");
        }else{
            System.out.println("You won and lost equal number of games");
        }

        System.out.println("Thanks for playing :)");
         
    }
}