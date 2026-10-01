package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum setLayoutTransition implements FragmentStrictModeExternalSyntheticLambda1 {
    USE_ANNOTATIONS(true),
    USE_GETTERS_AS_SETTERS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    INFER_PROPERTY_MUTATORS(true),
    INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES(true),
    ALLOW_VOID_VALUED_PROPERTIES(false),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    USE_STATIC_TYPING(false),
    USE_BASE_TYPE_AS_DEFAULT_IMPL(false),
    INFER_BUILDER_TYPE_BINDINGS(true),
    REQUIRE_TYPE_ID_FOR_SUBTYPES(true),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    SORT_CREATOR_PROPERTIES_FIRST(true),
    SORT_CREATOR_PROPERTIES_BY_DECLARATION_ORDER(false),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    ACCEPT_CASE_INSENSITIVE_ENUMS(false),
    ACCEPT_CASE_INSENSITIVE_VALUES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    ALLOW_IS_GETTERS_FOR_NON_BOOLEAN(false),
    ALLOW_COERCION_OF_SCALARS(true),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true),
    IGNORE_MERGE_FOR_UNMERGEABLE(true),
    BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES(false),
    APPLY_DEFAULT_VALUES(true);

    private final boolean _defaultState;
    private final long _mask = 1 << ordinal();

    public static long collectLongDefaults() {
        long longMask = 0;
        for (setLayoutTransition setlayouttransition : values()) {
            if (setlayouttransition.enabledByDefault()) {
                longMask |= setlayouttransition.getLongMask();
            }
        }
        return longMask;
    }

    setLayoutTransition(boolean z) {
        this._defaultState = z;
    }

    @Override // o.FragmentStrictModeExternalSyntheticLambda1
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    @Override // o.FragmentStrictModeExternalSyntheticLambda1
    @Deprecated
    public int getMask() {
        return (int) this._mask;
    }

    public long getLongMask() {
        return this._mask;
    }

    @Deprecated
    public boolean enabledIn(int i2) {
        return (((long) i2) & this._mask) != 0;
    }

    public boolean enabledIn(long j) {
        return (j & this._mask) != 0;
    }
}
