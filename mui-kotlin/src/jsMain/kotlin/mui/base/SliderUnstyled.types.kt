// Automatically generated - do not modify!

package mui.base

external interface SliderUnstyledProps :
    SliderUnstyledOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>

external interface SliderUnstyledOwnerState {
    var disabled: Boolean

    var focusedThumbIndex: Number

    var isRtl: Boolean

    var max: Number

    var min: Number

    var dragging: Boolean

    var marked: Boolean

    var orientation: mui.material.Orientation

    var scale: (value: Number) -> Number

    var step: Number?

    var track: mui.system.Union /* 'normal' | false | 'inverted' */

    var valueLabelFormat: String /* or (value: Number, index: Number) -> react.ReactNode*/
}

external interface SliderUnstyledOwnProps :
    UseSliderParameters {
    /**
     * The label of the slider.
     */
    // var `aria-label`: String?

    /**
     * A string value that provides a user-friendly name for the current value of the slider.
     */
    // var `aria-valuetext`: String?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the thumb labels of the slider.
     * This is important for screen reader users.
     * @param {number} index The thumb label's index to format.
     * @returns {string}
     */
    var getAriaLabel: ((index: Number) -> String)?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current value of the slider.
     * This is important for screen reader users.
     * @param {number} value The thumb label's value to format.
     * @param {number} index The thumb label's index to format.
     * @returns {string}
     */
    var getAriaValueText: ((value: Number, index: Number) -> String)?

    /**
     * The props used for each slot inside the Slider.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* SlotComponentProps<'span', SliderUnstyledRootSlotPropsOverrides, SliderUnstyledOwnerState> */
        var track: react.Props? /* SlotComponentProps<'span', SliderUnstyledTrackSlotPropsOverrides, SliderUnstyledOwnerState> */
        var rail: react.Props? /* SlotComponentProps<'span', SliderUnstyledRailSlotPropsOverrides, SliderUnstyledOwnerState> */
        var thumb: react.Props? /* SlotComponentProps<'span', SliderUnstyledThumbSlotPropsOverrides, SliderUnstyledOwnerState> */
        var mark: react.Props? /* SlotComponentProps<'span', SliderUnstyledMarkSlotPropsOverrides, SliderUnstyledOwnerState> */
        var markLabel: react.Props? /* SlotComponentProps<'span', SliderUnstyledMarkLabelSlotPropsOverrides, SliderUnstyledOwnerState> */
        var valueLabel: react.Props? /* SlotComponentProps<React.ElementType, SliderUnstyledValueLabelSlotPropsOverrides, SliderUnstyledOwnerState> */
        var input: react.Props? /* SlotComponentProps<'input', SliderUnstyledInputSlotPropsOverrides, SliderUnstyledOwnerState> */
    }

    /**
     * The components used for each slot inside the Slider.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var slots: SliderUnstyledSlots?

    /**
     * The track presentation:
     *
     * - `normal` the track will render a bar representing the slider value.
     * - `inverted` the track will render a bar representing the remaining slider value.
     * - `false` the track will render without a bar.
     * @default 'normal'
     */
    var track: mui.system.Union? /* 'normal' | false | 'inverted' */

    /**
     * The format function the value label's value.
     *
     * When a function is provided, it should have the following signature:
     *
     * - {number} value The value label's value to format
     * - {number} index The value label's index to format
     * @param {any} x
     * @returns {any}
     * @default function Identity(x) {
     *   return x;
     * }
     */
    var valueLabelFormat: String? /* or (value: Number, index: Number) -> react.ReactNode*/
}

external interface SliderUnstyledSlots {
    /**
     * The component that renders the root.
     * @default 'span'
     */
    var root: react.ElementType<*>?

    /**
     * The component that renders the track.
     * @default 'span'
     */
    var track: react.ElementType<*>?

    /**
     * The component that renders the rail.
     * @default 'span'
     */
    var rail: react.ElementType<*>?

    /**
     * The component that renders the thumb.
     * @default 'span'
     */
    var thumb: react.ElementType<*>?

    /**
     * The component that renders the mark.
     * @default 'span'
     */
    var mark: react.ElementType<*>?

    /**
     * The component that renders the mark label.
     * @default 'span'
     */
    var markLabel: react.ElementType<*>?

    /**
     * The component that renders the value label.
     */
    var valueLabel: react.ElementType<*>?

    /**
     * The component that renders the input.
     * @default 'input'
     */
    var input: react.ElementType<*>?
}
