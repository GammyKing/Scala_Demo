package chapter01

class Student(name: String,age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

// 引入一个伴生对象
object Student{
  val school:String = "hbust"

  def main(args: Array[String]): Unit = {
    val alice = new Student(name = "alice",age = 23)
    val bob = new Student(name = "bob",age = 24)
    alice.printInfo()
    bob.printInfo()
  }
}