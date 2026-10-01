package o;

import o.getView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum setNextTransition implements getSharedElementEnterTransition {
    QUOTE_FIELD_NAMES(true, getView.IAuthTabCallback.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, getView.IAuthTabCallback.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, getView.IAuthTabCallback.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, getView.IAuthTabCallback.ESCAPE_NON_ASCII),
    WRITE_HEX_UPPER_CASE(true, getView.IAuthTabCallback.WRITE_HEX_UPPER_CASE),
    ESCAPE_FORWARD_SLASHES(false, getView.IAuthTabCallback.ESCAPE_FORWARD_SLASHES),
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false, getView.IAuthTabCallback.COMBINE_UNICODE_SURROGATES_IN_UTF8);

    private final boolean _defaultState;
    private final getView.IAuthTabCallback _mappedFeature;
    private final int _mask = 1 << ordinal();

    public static int collectDefaults() {
        int mask = 0;
        for (setNextTransition setnexttransition : values()) {
            if (setnexttransition.enabledByDefault()) {
                mask |= setnexttransition.getMask();
            }
        }
        return mask;
    }

    setNextTransition(boolean z, getView.IAuthTabCallback iAuthTabCallback) {
        this._defaultState = z;
        this._mappedFeature = iAuthTabCallback;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public int getMask() {
        return this._mask;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public boolean enabledIn(int i2) {
        return (i2 & this._mask) != 0;
    }

    public getView.IAuthTabCallback mappedFeature() {
        return this._mappedFeature;
    }
}
