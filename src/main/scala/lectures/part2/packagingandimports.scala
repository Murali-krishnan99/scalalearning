package lectures.part2

import playground.{cindrella, princecharming}

import java.util.Date
import java.sql.Date
/**
 * created by Murali.
 */
object packagingandimports {

  //package members are accessible by their simple name
  val writer = new writer ("murali","cuelebre",2021)

  //import the package
  val princess = new cindrella // playground.cindrella = fully qualified name
 //packages are in hierarchy

  //package object
  sayhello
  println(SPEED_OF_LIGHT)

  //imports
  val  prince = new princecharming
val date = new Date
val sqldate = new java.sql.Date(2018, 5, 4)
}
