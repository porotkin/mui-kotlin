// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/Slider")
@file:JsNonModule

package material

external interface SliderProps : react.RProps {
    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: dynamic

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic
    var colorPrimary: dynamic
    var colorSecondary: dynamic
    var sizeSmall: dynamic
    var thumbColorPrimary: dynamic
    var thumbColorSecondary: dynamic
    var thumbSizeSmall: dynamic

    /**
     * The size of the slider.
     * @default 'medium'
     */
    var size: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 *
 * Demos:
 *
 * - [Slider](https://material-ui.com/components/slider/)
 *
 * API:
 *
 * - [Slider API](https://material-ui.com/api/slider/)
 * - inherits [SliderUnstyled API](https://material-ui.com/api/slider-unstyled/)
 */
@JsName("default")
external val Slider: react.FC<SliderProps>