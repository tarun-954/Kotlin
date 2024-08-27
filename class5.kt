//default function with int return type
fun anytask():Int{
   var a=32;
    var b=24;
    var c=a+b;
    return c;
}

// paramterized function with int return type
fun task2(a:Int,b:Int):Int{
    val c=a+b;
    return c;
}
fun main() {
//     calling function 
   val d=anytask();
    
//     calling function
    val f=task2(20,30);
    println(d)
    println(f)
    
    
    
}