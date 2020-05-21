package typingsJapgolly.react.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildContextProvider[CC] extends js.Object {
  def getChildContext(): CC = js.native
}

object ChildContextProvider {
  @scala.inline
  def apply[CC](getChildContext: CallbackTo[CC]): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = getChildContext.toJsFn)
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  @scala.inline
  implicit class ChildContextProviderOps[Self[cc] <: ChildContextProvider[cc], CC] (val x: Self[CC]) extends AnyVal {
    @scala.inline
    def duplicate: Self[CC] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[CC]]
    @scala.inline
    def combineWith[Other /* <: js.Any */](other: Other): Self[CC] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[CC] with Other]
    @scala.inline
    def withGetChildContext(value: CallbackTo[CC]): Self[CC] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildContext")(value.toJsFn)
        ret
    }
  }
  
}

