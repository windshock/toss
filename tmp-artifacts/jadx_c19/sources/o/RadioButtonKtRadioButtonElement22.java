package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum RadioButtonKtRadioButtonElement22 implements RadioButtonKtRadioButton3 {
    READ_ENUM_KEYS_USING_INDEX(false),
    WRITE_ENUMS_TO_LOWERCASE(false);

    private static final int FEATURE_INDEX = 0;
    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    @Override // o.RadioButtonKtRadioButton3
    public int featureIndex() {
        return 0;
    }

    RadioButtonKtRadioButtonElement22(boolean z) {
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
