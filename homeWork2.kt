fun main() {
//     write a java program for discount system 
//     create varible that user have membership
//     if amount is greater than 1000 then check for the membership 
//     if they have then print 20% dicount
//     if they dont have then print 10% discount
//     if the amount is less then 1000 then print no discount to the user 
//     
    
    
   var name="Tarun"

   val hasMembership=false
    val finalAmount:Int
    val totalAmount=1001
    
    if(totalAmount> 1000){
        if(hasMembership){
             finalAmount=totalAmount-totalAmount * 20 / 100
            println("Hurry! You got 20% discount.")
        println("Final ammount: $finalAmount")
        } 
   		else{
            finalAmount=totalAmount-totalAmount * 10 / 100
            println("Hurry! You got 10% discont.")
        println("Final amount: $finalAmount")
  			  }
   
   
    }
    
    else{
          println("Oops! No discount sorry. ")
       println("Final amount: $totalAmount")
    }
    
}