// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/AccordionSummary")
@file:JsNonModule

package material

external interface AccordionSummaryProps : react.RProps {
    /**
     * The content of the component.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The icon to display as the expand indicator.
     */
    var expandIcon: react.ReactNode

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 *
 * Demos:
 *
 * - [Accordion](https://material-ui.com/components/accordion/)
 *
 * API:
 *
 * - [AccordionSummary API](https://material-ui.com/api/accordion-summary/)
 * - inherits [ButtonBase API](https://material-ui.com/api/button-base/)
 */
@JsName("default")
external val AccordionSummary: react.FC<AccordionSummaryProps>