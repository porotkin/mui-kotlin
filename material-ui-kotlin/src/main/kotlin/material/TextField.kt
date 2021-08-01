// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/TextField")
@file:JsNonModule

package material

external interface TextFieldProps : react.RProps

external interface BaseTextFieldProps : react.RProps {
    /**
     * This prop helps users to fill forms faster, especially on mobile devices.
     * The name can be confusing, as it's more like an autofill.
     * You can learn more about it [following the specification](https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill).
     */
    var autoComplete: String

    /**
     * If `true`, the `input` element is focused during the first mount.
     * @default false
     */
    var autoFocus: Boolean

    /**
     * @ignore
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: dynamic

    /**
     * The default value. Use when the component is not controlled.
     */
    var defaultValue: dynamic

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * If `true`, the label is displayed in an error state.
     * @default false
     */
    var error: Boolean

    /**
     * Props applied to the [`FormHelperText`](/api/form-helper-text/) element.
     */
    var FormHelperTextProps: dynamic

    /**
     * If `true`, the input will take up the full width of its container.
     * @default false
     */
    var fullWidth: Boolean

    /**
     * The helper text content.
     */
    var helperText: react.ReactNode

    /**
     * The id of the `input` element.
     * Use this prop to make `label` and `helperText` accessible for screen readers.
     */
    var id: String

    /**
     * Props applied to the [`InputLabel`](/api/input-label/) element.
     */
    var InputLabelProps: dynamic

    /**
     * [Attributes](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Attributes) applied to the `input` element.
     */
    var inputProps: dynamic

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: dynamic

    /**
     * The label content.
     */
    var label: react.ReactNode

    /**
     * If `true`, a `textarea` element is rendered instead of an input.
     * @default false
     */
    var multiline: Boolean

    /**
     * Name attribute of the `input` element.
     */
    var name: String

    var onBlur: dynamic

    var onFocus: dynamic

    /**
     * The short hint displayed in the `input` before the user enters a value.
     */
    var placeholder: String

    /**
     * If `true`, the label is displayed as required and the `input` element is required.
     * @default false
     */
    var required: Boolean

    /**
     * Number of rows to display when multiline option is set to true.
     */
    var rows: dynamic

    /**
     * Maximum number of rows to display when multiline option is set to true.
     */
    var maxRows: dynamic

    /**
     * Minimum number of rows to display when multiline option is set to true.
     */
    var minRows: dynamic

    /**
     * Render a [`Select`](/api/select/) element while passing the Input element to `Select` as `input` parameter.
     * If this option is set you must pass the options of the select as children.
     * @default false
     */
    var select: Boolean

    /**
     * Props applied to the [`Select`](/api/select/) element.
     */
    var SelectProps: dynamic

    /**
     * The size of the component.
     */
    var size: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic

    /**
     * Type of the `input` element. It should be [a valid HTML5 input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#Form_%3Cinput%3E_types).
     */
    var type: dynamic

    /**
     * The value of the `input` element, required for a controlled component.
     */
    var value: dynamic
}

external interface StandardTextFieldProps : react.RProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: dynamic

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: dynamic /* 'standard' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: dynamic
}

external interface FilledTextFieldProps : react.RProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: dynamic

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: dynamic /* 'filled' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: dynamic
}

external interface OutlinedTextFieldProps : react.RProps {
    /**
     * Callback fired when the value is changed.
     *
     * @param {object} event The event source of the callback.
     * You can pull out the new value by accessing `event.target.value` (string).
     */
    var onChange: dynamic

    /**
     * The variant to use.
     * @default 'outlined'
     */
    var variant: dynamic /* 'outlined' */

    /**
     * Props applied to the Input element.
     * It will be a [`FilledInput`](/api/filled-input/),
     * [`OutlinedInput`](/api/outlined-input/) or [`Input`](/api/input/)
     * component depending on the `variant` prop value.
     */
    var InputProps: dynamic
}

/**
 * The `TextField` is a convenience wrapper for the most common cases (80%).
 * It cannot be all things to all people, otherwise the API would grow out of control.
 *
 * ## Advanced Configuration
 *
 * It's important to understand that the text field is a simple abstraction
 * on top of the following components:
 *
 * *   [FormControl](https://material-ui.com/api/form-control/)
 * *   [InputLabel](https://material-ui.com/api/input-label/)
 * *   [FilledInput](https://material-ui.com/api/filled-input/)
 * *   [OutlinedInput](https://material-ui.com/api/outlined-input/)
 * *   [Input](https://material-ui.com/api/input/)
 * *   [FormHelperText](https://material-ui.com/api/form-helper-text/)
 *
 * If you wish to alter the props applied to the `input` element, you can do so as follows:
 *
 * ```jsx
 * const inputProps = {
 *   step: 300,
 * };
 *
 * return <TextField id="time" type="time" inputProps={inputProps} />;
 * ```
 *
 * For advanced cases, please look at the source of TextField by clicking on the
 * "Edit this page" button above. Consider either:
 *
 * *   using the upper case props for passing values directly to the components
 * *   using the underlying components directly as shown in the demos
 *
 * Demos:
 *
 * - [Autocomplete](https://material-ui.com/components/autocomplete/)
 * - [Pickers](https://material-ui.com/components/pickers/)
 * - [Text Fields](https://material-ui.com/components/text-fields/)
 *
 * API:
 *
 * - [TextField API](https://material-ui.com/api/text-field/)
 * - inherits [FormControl API](https://material-ui.com/api/form-control/)
 */
@JsName("default")
external val TextField: react.FC<TextFieldProps>