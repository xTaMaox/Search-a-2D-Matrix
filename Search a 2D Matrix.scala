import scala.collection.Searching._
object Solution {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    var upperBound = matrix.length - 1
    while (upperBound != -1 && target < matrix(upperBound).head) upperBound -= 1
    if (upperBound == -1) false
    else matrix(upperBound).search(target).isInstanceOf[Found]
  }
}