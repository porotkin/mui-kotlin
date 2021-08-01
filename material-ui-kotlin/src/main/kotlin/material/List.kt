// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/List")
@file:JsNonModule

package material

external interface ListProps : react.RProps {
    /**
     * The content of the component.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used for
     * the list and list items.
     * The prop is available to descendant components as the `dense` context.
     * @default false
     */
    var dense: Boolean

    /**
     * If `true`, vertical padding is removed from the list.
     * @default false
     */
    var disablePadding: Boolean

    /**
     * The content of the subheader, normally `ListSubheader`.
     */
    var subheader: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 *
 * Demos:
 *
 * - [Lists](https://material-ui.com/components/lists/)
 * - [Transfer List](https://material-ui.com/components/transfer-list/)
 *
 * API:
 *
 * - [List API](https://material-ui.com/api/list/)
 */
@JsName("default")
external val List: react.FC<ListProps>