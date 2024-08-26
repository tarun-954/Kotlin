fun main() {
//     right shift in kt
    
// var x=5
//     var y=x.shr(2)
//     println(y)
    
    
    // and operater 
//     var x1=true
//     var y1=false
//     println(x1&&y1)
//     println(x1.and(y1))
//     var x=2
//     println(+x)
//     println(-x)
//     println(x++) //increment to 3 but not printed
//     println(++x) // incremented and also printed
//     println(x--) // decremented but not printed
//         println(--x) // decremented and also printed
        
    
    //elvish operater in kotline
    
        var str:String? = null
    var str2:String? ="May be declaered nullable string"
    var len1:Int=str ?.length ?: -1
    var len2:Int=str2 ?.length ?: -1
    println("length of the str is : ${len1}")
    println("Length of the str2 is : ${len2}")
    
    
    // when      in kotline
        var choice =3
    var result = when(choice){
       1->"Hello tarun"
        2->"hello tanmay"
        3->"hello everyone"
        4->"practice makes a men perfect"
        else->"choice out of bound"
    }
        println(result)
//  compile all the programs done in class 
// try to make a calulator with all the arthemetic operaters
// using the loop print and add even numbers sum of the array 
//revise functions again as home work

//   var choice ="+"
//    var a=10
//    var b=30
//     var result = when(choice){
//        "+"->a+b
//         "-"->a-b
//         "/"->a/b
//         "%"->a%b
//          "*"->a*b
//         else->"choice out of bound"
//     }
//         println(result)



//  for loop in kotlin


for(i in 1..5){
    print(i)
    print(" ")
}
println()
//output 1 2 3 4 5 



// other method to utilize for loop 
for(i in 1 until 5){
    print(i)
    print(" ")
    
   
}
println()
// output 1 2 3 4



for(i in 5 downTo 1){
    print(i)
    print(" ")
}
println()
// out put: 5 4 3 2 1 




for(i in 5 downTo 1 step 2){
    print(i)
    print(" ")
}
println()
// output:  5 3 1


// while loop in kotline
var i=1
while(i <= 5){
    print(i);
    print(" ")
    i++
}

println()
// output: 1 2 3 4 5 









}


