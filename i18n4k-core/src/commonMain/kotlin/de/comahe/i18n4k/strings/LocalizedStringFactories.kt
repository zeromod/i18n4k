package de.comahe.i18n4k.strings

import de.comahe.i18n4k.Locale

/**
 * A factory for [LocalizedString] wich 1 parameter.
 */
interface LocalizedStringFactory1 {
    /** Create a string with the given parameter
     * @param locale The locale to be used. If `null` the current setting in [i18n4k] ([I18n4kConfig.locale]) will be used
     */
    fun createString(p0: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter */
    fun createLocalizedString(p0: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(p0: Any, locale: Locale? = null): String =
        createString(p0, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any): LocalizedString =
        createLocalizedString(p0)
}

/** See [LocalizedStringFactory1], but with 5 parameters. */
interface LocalizedStringFactory2 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(p0: Any, p1: Any, locale: Locale? = null): String =
        createString(p0, p1, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any): LocalizedString =
        createLocalizedString(p0, p1)
}

/** See [LocalizedStringFactory1], but with 5 parameters. */
interface LocalizedStringFactory3 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(p0: Any, p1: Any, p2: Any, locale: Locale? = null): String =
        createString(p0, p1, p2, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any): LocalizedString =
        createLocalizedString(p0, p1, p2)
}


/** See [LocalizedStringFactory1], but with 5 parameters. */
interface LocalizedStringFactory4 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(p0: Any, p1: Any, p2: Any, p3: Any, locale: Locale? = null): String =
        createString(p0, p1, p2, p3, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3)
}

/** See [LocalizedStringFactory1], but with 5 parameters. */
interface LocalizedStringFactory5 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4)
}

/** See [LocalizedStringFactory1], but with 6 parameters. */
interface LocalizedStringFactory6 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, p5, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4, p5)
}

interface LocalizedStringFactory7 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, p5, p6, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4, p5, p6)
}

interface LocalizedStringFactory8 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, p5, p6, p7, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4, p5, p6, p7)
}

interface LocalizedStringFactory9 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any, p8: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any, p8: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, p5, p6, p7, p8, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4, p5, p6, p7, p8)
}

interface LocalizedStringFactory10 {

    /** Create a string with the given parameter.
     *
     * @see [LocalizedStringFactory1.createString]]
     * */
    fun createString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any, p8: Any, p9: Any, locale: Locale? = null): String

    /** Create [LocalizedString] with the given parameter
     *
     * @see [LocalizedStringFactory1.createLocalizedString]]
     */
    fun createLocalizedString(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any,  p5: Any, p6: Any, p7: Any, p8: Any, p9: Any): LocalizedString

    /** Shortcut for [createString] */
    operator fun invoke(
        p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any, p9: Any,
        locale: Locale? = null
    ): String =
        createString(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, locale)

    /** Shortcut for [createLocalizedString] */
    operator fun get(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any, p6: Any, p7: Any, p8: Any, p9: Any): LocalizedString =
        createLocalizedString(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)
}