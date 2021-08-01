// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/StepIcon")
@file:JsNonModule

package material

external interface StepIconProps : react.RProps {
    /**
     * Whether this step is active.
     * @default false
     */
    var active: Boolean

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * Mark the step as completed. Is passed to child components.
     * @default false
     */
    var completed: Boolean

    /**
     * If `true`, the step is marked as failed.
     * @default false
     */
    var error: Boolean

    /**
     * The label displayed in the step icon.
     */
    var icon: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://material-ui.com/components/steppers/)
 *
 * API:
 *
 * - [StepIcon API](https://material-ui.com/api/step-icon/)
 */
@JsName("default")
external val StepIcon: react.FC<StepIconProps>