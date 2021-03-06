package typingsJapgolly.reactContextmenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Children.Varargs
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.JsForwardRefComponent.force
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactContextmenu.mod.ContextMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextMenu {
  def apply(
    id: String,
    className: String = null,
    data: js.Any = null,
    hideOnLeave: js.UndefOr[Boolean] = js.undefined,
    onHide: /* event */ js.Any => Callback = null,
    onMouseLeave: (js.Function3[
      /* event */ ReactMouseEventFrom[HTMLElement], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object */ /* data */ js.Any, 
      /* target */ HTMLElement, 
      Unit
    ]) | js.Function = null,
    onShow: /* event */ js.Any => Callback = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ContextMenuProps, 
    typingsJapgolly.reactContextmenu.mod.ContextMenu, 
    Unit, 
    ContextMenuProps
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnLeave)) __obj.updateDynamic("hideOnLeave")(hideOnLeave.get.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* event */ js.Any) => onHide(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* event */ js.Any) => onShow(t0).runNow()))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    val f = force[ContextMenuProps, Varargs, typingsJapgolly.reactContextmenu.mod.ContextMenu](this.componentImport)
    f(__obj.asInstanceOf[ContextMenuProps])(children :_*)
  }
  @JSImport("react-contextmenu", "ContextMenu")
  @js.native
  object componentImport extends js.Object
  
}

