//default function with int return type

class car{
    var make:String=""
    var make:String=""
}
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

 //recursion function
    var count =0;
    fun rec(){
        count++;
        if(count<=5){
            println("hello "+count);
            rec();
        }
    }
fun main() {
//     calling function 
   val d=anytask();
    
//     calling function
    val f=task2(20,30);
    
  
    println(d)
    println(f)
   rec()
   
   
   
   
   
   
}