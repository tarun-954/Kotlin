
   // factorial using recursion
    //sum of n numbers using recursion
    // find sum of even numbers for the given range of 1 to n using reccursion and function calling
//make a class and create two diiferent object of this cllass and pass differnet parametere to the class

//     var count = 1
// var a = 1

// fun reccursion() {
//     var n = 5 // Input from user
//     if (count <= n) {
//         a *= count
//         count++
//         reccursion()
//     }
// }

// fun main() {
//     reccursion()
//     println("Factorial of 5 is: $a")
// }


// var a=0;
// var sum=0;
// fun rec(){
//     var n =5
// if(a<n){
//     a++;
// sum=sum+a;
// rec()
// }


// }

// fun main(){
// rec();
// println(sum);
// }


// find sum of even numbers for the given range of 1 to n using reccursion and function calling
var count=0;
var n=10;
var sum=0;
fun reccurs(){
  if(count<=n){
    count++;
    if(count%2==0){
      sum=sum+count;
      println(count);
     
      
    }
     reccurs();
  }
}
fun main(){
  reccurs();
  println("sum of the even numbers is: "+sum)
}