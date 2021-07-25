// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/SwipeableDrawer")
@file:JsNonModule

package material

external interface SwipeableDrawerProps : react.RProps {
    var disableBackdropTransition: Boolean

    var disableDiscovery: Boolean

    var disableSwipeToOpen: Boolean

    var hysteresis: Number

    var minFlingVelocity: Number

    var onClose: dynamic

    var onOpen: dynamic

    var open: Boolean

    var SwipeAreaProps: Any

    var swipeAreaWidth: Number
}

/**
 *
 * Demos:
 *
 * - [Drawers](https://material-ui.com/components/drawers/)
 *
 * API:
 *
 * - [SwipeableDrawer API](https://material-ui.com/api/swipeable-drawer/)
 * - inherits [Drawer API](https://material-ui.com/api/drawer/)
 */
@JsName("default")
external val SwipeableDrawer: react.ComponentType<SwipeableDrawerProps>
