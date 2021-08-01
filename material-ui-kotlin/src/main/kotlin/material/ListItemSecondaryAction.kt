// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/ListItemSecondaryAction")
@file:JsNonModule

package material

external interface ListItemSecondaryActionProps : react.RProps {
    /**
     * The content of the component, normally an `IconButton` or selection control.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 * Must be used as the last child of ListItem to function properly.
 *
 * Demos:
 *
 * - [Lists](https://material-ui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemSecondaryAction API](https://material-ui.com/api/list-item-secondary-action/)
 */
@JsName("default")
external val ListItemSecondaryAction: react.FC<ListItemSecondaryActionProps>