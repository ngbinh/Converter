package typingsJapgolly.reactDropzone.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneProps extends DropzoneOptions {
  var children: js.UndefOr[js.Function1[/* state */ DropzoneState, Element]] = js.native
}

object DropzoneProps {
  @scala.inline
  def apply(): DropzoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneProps]
  }
  @scala.inline
  implicit class DropzonePropsOps[Self <: DropzoneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: /* state */ DropzoneState => CallbackTo[Element]): Self = this.set("children", js.Any.fromFunction1((t0: /* state */ DropzoneState) => value(t0).runNow()))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

