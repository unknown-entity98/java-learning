
/*
if true
    then do this thing

else if true
    then do this
else 
    if nothing above is true, then do this
*/




public class IfElse {

public static void main(String[] args) {
    
    //for the sake of conditions, we can take 2 variables and do comparision between them
    //the comparision operators (basically those output boolean values) can be used here
    int a = 4;
    int b = 5;
    if (a<b){
        System.out.println("a < b");
}

    else if (a == b){
        System.out.println("a = b");
    }

    else{
        System.out.println("a > b");
    }

}
    
}

//you can use &&, ||, operators to make ranges and some more cool stuff. Remember that output of that expression shuld be true or false, thats it
