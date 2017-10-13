package aarexer.common

import org.scalatest.FlatSpec

class FileUtilsSpec extends FlatSpec {
  "Exists method" should "return true for file which exists" in {
    assert(FileUtils.exists(".gitignore"))
  }

  it should "return false for non existing file" in {
    assert(!FileUtils.exists(".hello-world"))
  }
}
