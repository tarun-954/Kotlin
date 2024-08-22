fun main(){
//     using char datatype in kotlin
    
    val name:Char='A'
    println(name)
    
//     using string datatype in kotlin
//     mutiple line string
    var fullName:String="""my name is tarun choudhary
    i am from Palampur himachal pradesh
    """  
    println(fullName)
    
//     using boolean datatype in kotlin

    val name2:Boolean;
    name2=true;
    println(name2)
    //array of int
    val numbers=arrayOf(1,2,3,4,5)
    println(numbers[0])
      println(numbers[1])
        println(numbers[2])
          println(numbers[3])
            println(numbers[4])
            
            
            
            
    //array of string
    val words:Array<String> = arrayOf("kotlin","java","python")
println(words[0])
println(words[1])
println(words[2])

//creating array of squares uing lambda function
    var squares=Array(5){i->i*i}
println(squares[0])
    println(squares[1])
    println(squares[2])
    println(squares[3])
    println(squares[4])
    
//     check the size of the array
var size=numbers.size
    println("size of the array is "+size)
    
    
//     check if the array is empty of not 
var isEmpty=words.isEmpty()
println("The array is empty: $isEmpty")

// DO
// 2D array 
// conversion 
// typecasting
// all the types of operaters 
//     modifing the elements of the array 
    
}