
//  compile all the programs done in class 
// try to make a calulator with all the arthemetic operaters
//revise functions classes objects calling of the function again as home work
fun main(){
    var a=10
   var b=30
   var choice ='-'
    var result = when(choice){
       '+'->a+b
        '-'->a-b
        '/'->a/b
        '%'->a%b
         '*'->a*b
        else->"choice out of bound"
    }
      println("Result is: ${result}")


        // using the loop print and add even numbers and sum of the array 


val numbers:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
var sum=0;
    
        for(i in numbers){
            if(i%2==0){
                 print(i)
            sum=sum+i
            print(" ")
            
            
            
            }
           
           
        }
        println()
                    println("sum of even numbers" +sum)


}



