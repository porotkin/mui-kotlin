// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/Menu")
@file:JsNonModule

package material

external interface MenuProps : react.RProps {
    /**
     * An HTML element, or a function that returns one.
     * It's used to set the position of the menu.
     */
    var anchorEl: dynamic

    /**
     * If `true` (Default) will focus the `[role="menu"]` if no focusable child is found. Disabled
     * children are not focusable. If you set this prop to `false` focus will be placed
     * on the parent modal container. This has severe accessibility implications
     * and should only be considered if you manage focus otherwise.
     * @default true
     */
    var autoFocus: Boolean

    /**
     * Menu contents, normally `MenuItem`s.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * When opening the menu will not focus the active item but the `[role="menu"]`
     * unless `autoFocus` is also set to `false`. Not using the default means not
     * following WAI-ARIA authoring practices. Please be considerate about possible
     * accessibility implications.
     * @default false
     */
    var disableAutoFocusItem: Boolean

    /**
     * Props applied to the [`MenuList`](/api/menu-list/) element.
     * @default {}
     */
    var MenuListProps: dynamic

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`, `"tabKeyDown"`.
     */
    var onClose: dynamic

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * `classes` prop applied to the [`Popover`](/api/popover/) element.
     */
    var PopoverClasses: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic

    /**
     * The length of the transition in `ms`, or 'auto'
     * @default 'auto'
     */
    var transitionDuration: dynamic

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition) component.
     * @default {}
     */
    var TransitionProps: dynamic

    /**
     * The variant to use. Use `menu` to prevent selected items from impacting the initial focus.
     * @default 'selectedMenu'
     */
    var variant: dynamic /* 'menu' | 'selectedMenu' */
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://material-ui.com/components/app-bar/)
 * - [Menus](https://material-ui.com/components/menus/)
 *
 * API:
 *
 * - [Menu API](https://material-ui.com/api/menu/)
 * - inherits [Popover API](https://material-ui.com/api/popover/)
 */
@JsName("default")
external val Menu: react.FC<MenuProps>