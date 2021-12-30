/*
Loops are executed untill some condition satisfies
Like something being true
Value being in range
Examples will make this more clear
*/


public class WhileForLoops {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 5){
            System.out.println(i);
            i++; // i = i + 1;
        


//do .... while --> in this case, the stuff in do is executed before checking tru/false in the while blocl
//if tru, then the do block is executed again


        }
        System.out.println("\n Off to Do loops\n\n");
        
        int j = 0;
        do{
            System.out.println(j);
            j ++;
        } while(j>5);
        //you can see that it printed 0, then checked for the condition, relaised computed it to be false, then stopped printing
        System.out.println("\n Off to For loops\n\n");

/*

for (Statement 1; Statement 2: Statement 3){
    
}

Statement 1 assigns a value to the variable (happens only initially)​

Statement 2 defines the condition for the ‘for’ loop. The condition being ‘true’ will make the loop to execute again.​If the condition is ‘false’ then the loop will end​

Statement 3 will increment the value of the variable ‘I’ by ‘1’ each time after the code block is executed​

*/


        for (int k = 10; k > 5; k--){
            System.out.println("The value of k is: "+k);
        }
        

    }

}


/* 

You can have loop under a loop. They are called nested loop
The Outer loop executes first, then the inner loop completes first

*/
