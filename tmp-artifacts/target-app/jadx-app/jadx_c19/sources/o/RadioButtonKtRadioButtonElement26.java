package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum RadioButtonKtRadioButtonElement26 implements RadioButtonKtRadioButton3 {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    WRITE_PROPERTIES_SORTED(false),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true),
    FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION(false);

    private static final int FEATURE_INDEX = 1;
    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    @Override // o.RadioButtonKtRadioButton3
    public int featureIndex() {
        return 1;
    }

    RadioButtonKtRadioButtonElement26(boolean z) {
        this._enabledByDefault = z;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public boolean enabledByDefault() {
        return this._enabledByDefault;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public boolean enabledIn(int i2) {
        return (i2 & this._mask) != 0;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public int getMask() {
        return this._mask;
    }
}
