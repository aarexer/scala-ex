package aarexer.common

import java.io.File
import java.nio.file.{Files, Path, Paths}
import java.util.stream

object FileUtils {
  def exists(filename: String): Boolean = Files.exists(Paths.get(filename))

  def files(path: String): stream.Stream[Path] = {
    Files.list(Paths.get(path)).filter(!Files.isDirectory(_))
  }

  def getListOfFiles(dir: String): Seq[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toSeq
    } else {
      Seq[File]()
    }
  }
}
