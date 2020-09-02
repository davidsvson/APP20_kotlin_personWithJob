fun main() {

    val intelJob = Job("Chef", "Intel", 100)


    val p1 = Person("Lois", 21, intelJob)

    println("Namn: ${p1.name}")

  //  val job = p1.job
    //val salary = job.salary
    println("Lön: ${p1.job.salary}")

}