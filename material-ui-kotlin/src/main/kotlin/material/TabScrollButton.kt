// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/TabScrollButton")
@file:JsNonModule

package material

external interface TabScrollButtonProps : react.RProps {
    /**
     * The content of the component.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The direction the button should indicate.
     */
    var direction: dynamic /* 'left' | 'right' */

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean

    /**
     * The component orientation (layout flow direction).
     */
    var orientation: dynamic /* 'horizontal' | 'vertical' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://material-ui.com/components/tabs/)
 *
 * API:
 *
 * - [TabScrollButton API](https://material-ui.com/api/tab-scroll-button/)
 */
@JsName("default")
external val TabScrollButton: react.FC<TabScrollButtonProps>