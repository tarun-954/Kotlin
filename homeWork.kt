fun main() {
//     write a java program for discount system 
//    var name="Tarun"
    val age=60;
   val hasMembership="true"
    val finalAmount:Int
    val totalAmount=10000
    
    if(age>60 && age <120){
    finalAmount=totalAmount-totalAmount * 10 / 100
        println("Final ammount: $finalAmount")
    }
    else if(gender=="female"){
            finalAmount=totalAmount-totalAmount * 5 / 100
        println("Final amount: $finalAmount")
    }
    else{
       println("Final amount: $totalAmount")
    }
    
}