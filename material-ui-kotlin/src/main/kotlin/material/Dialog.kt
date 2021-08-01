// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/Dialog")
@file:JsNonModule

package material

external interface DialogProps : react.RProps {
    /**
     * The id(s) of the element(s) that describe the dialog.
     */
    // var `aria-describedby`: String

    /**
     * The id(s) of the element(s) that label the dialog.
     */
    // var `aria-labelledby`: String

    /**
     * Dialog children, usually the included sub-components.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * If `true`, hitting escape will not fire the `onClose` callback.
     * @default false
     */
    var disableEscapeKeyDown: Boolean

    /**
     * If `true`, the dialog is full-screen.
     * @default false
     */
    var fullScreen: Boolean

    /**
     * If `true`, the dialog stretches to `maxWidth`.
     *
     * Notice that the dialog width grow is limited by the default margin.
     * @default false
     */
    var fullWidth: Boolean

    /**
     * Determine the max-width of the dialog.
     * The dialog width grows with the size of the screen.
     * Set to `false` to disable `maxWidth`.
     * @default 'sm'
     */
    var maxWidth: dynamic

    /**
     * Callback fired when the backdrop is clicked.
     */
    var onBackdropClick: dynamic

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`.
     */
    var onClose: dynamic

    /**
     * If `true`, the component is shown.
     */
    var open: dynamic

    /**
     * The component used to render the body of the dialog.
     * @default Paper
     */
    var PaperComponent: dynamic

    /**
     * Props applied to the [`Paper`](/api/paper/) element.
     * @default {}
     */
    var PaperProps: dynamic

    /**
     * Determine the container for scrolling the dialog.
     * @default 'paper'
     */
    var scroll: dynamic /* 'body' | 'paper' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     */
    var TransitionComponent: dynamic

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     * @default { enter: duration.enteringScreen, exit: duration.leavingScreen }
     */
    var transitionDuration: dynamic

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition) component.
     */
    var TransitionProps: dynamic
}

/**
 * Dialogs are overlaid modal paper based components with a backdrop.
 *
 * Demos:
 *
 * - [Dialogs](https://material-ui.com/components/dialogs/)
 *
 * API:
 *
 * - [Dialog API](https://material-ui.com/api/dialog/)
 * - inherits [Modal API](https://material-ui.com/api/modal/)
 */
@JsName("default")
external val Dialog: react.FC<DialogProps>