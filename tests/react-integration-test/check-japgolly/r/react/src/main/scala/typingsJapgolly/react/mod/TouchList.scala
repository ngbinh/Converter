package typingsJapgolly.react.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  var length: Double = js.native
  def identifiedTouch(identifier: Double): Touch = js.native
  def item(index: Double): Touch = js.native
}

object TouchList {
  @scala.inline
  def apply(identifiedTouch: Double => CallbackTo[Touch], item: Double => CallbackTo[Touch], length: Double): TouchList = {
    val __obj = js.Dynamic.literal(identifiedTouch = js.Any.fromFunction1((t0: Double) => identifiedTouch(t0).runNow()), item = js.Any.fromFunction1((t0: Double) => item(t0).runNow()), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchList]
  }
  @scala.inline
  implicit class TouchListOps[Self <: TouchList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifiedTouch(value: Double => CallbackTo[Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifiedTouch")(js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        ret
    }
    @scala.inline
    def withItem(value: Double => CallbackTo[Touch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

