/*If we have atlist one abstract method inherited or declear the making the class abstract is maindatory otherwise we get CTE.*/
class A
{
abstract public void demo();//CTE-A is not abstract and does not override abstract method demo() in A
}

/*In class Awe have an abstract method demo()
but the class is not a abstract so when we complie A we get CTE.*/