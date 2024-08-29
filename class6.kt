
class person{
    var name:String;
    var age :Int;
    constructor(x:String,y:Int){
        this.name=x;
        this.age=y;

    // }
    // constructor(x:String){
    //     this.name=x;
    //     this.age=0;

    fun intro(){
        println("$name and $age")
    }

}

fun main(){
    var a=person("tarunchoudhary",21);
a.intro();
}




