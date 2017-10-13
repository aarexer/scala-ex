package aarexer.examples

import java.io.{FileInputStream, FileOutputStream, IOException}

object TryCatchFinallyExamples {

  def copyBytes(): Unit = {
    var in = None: Option[FileInputStream]
    var out = None: Option[FileOutputStream]

    try {
      in = Some(new FileInputStream("/tmp/Test.class"))
      out = Some(new FileOutputStream("/tmp/Test.class.copy"))
      var c = 0
      while ( {
        c = in.get.read
        c != -1
      }) {
        out.get.write(c)
      }
    } catch {
      case e: IOException => e.printStackTrace()
    } finally {
      println("entered finally ...")
      if (in.isDefined) in.get.close()
      if (out.isDefined) out.get.close()
    }
  }
}
