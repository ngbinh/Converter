package typingsJapgolly.react.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P /* <: js.Object */](`type`: String): Element = js.native
  def apply[P /* <: js.Object */](`type`: String, children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: String, props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]]): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]], children: Node*): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, js.Object]]) with P,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClassP[P with js.Object]): Element = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClassP[P with js.Object], children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: ComponentClassP[P with js.Object], props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P]): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], children: Node*): Element = js.native
  def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): Element = js.native
  def apply[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String, props: ClassAttributes[T] with P, children: Node*): DomElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: Node*
  ): ReactSVGElement = js.native
  def apply[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: Node*
  ): ReactSVGElement = js.native
  def apply[P /* <: js.Object */, T /* <: japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], children: Node*): CElement[P, T] = js.native
  def apply[P /* <: js.Object */, T /* <: japgolly.scalajs.react.raw.React.Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: Node*): CElement[P, T] = js.native
}

