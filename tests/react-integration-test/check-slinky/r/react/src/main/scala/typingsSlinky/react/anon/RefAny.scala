package typingsSlinky.react.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefAny extends js.Object {
  var ref: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<R, string> */ js.Any
  ] = js.native
}

object RefAny {
  @scala.inline
  def apply(): RefAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefAny]
  }
  @scala.inline
  implicit class RefAnyOps[Self <: RefAny] (val x: Self) extends AnyVal {
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
    def setRef(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Exclude<R, string> */ js.Any
    ): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

