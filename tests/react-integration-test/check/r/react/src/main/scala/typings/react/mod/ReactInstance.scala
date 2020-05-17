package typings.react.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Component API
// ----------------------------------------------------------------------
/* Rewritten from type alias, can be one of: 
  - typings.react.mod.Component[js.Any, js.Object, js.Any]
  - typings.std.Element
*/
trait ReactInstance extends js.Object

object ReactInstance {
  @scala.inline
  implicit def apply(value: Component[js.Any, js.Object, js.Any]): ReactInstance = value.asInstanceOf[ReactInstance]
  @scala.inline
  implicit def apply(value: Element): ReactInstance = value.asInstanceOf[ReactInstance]
}

