package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum isInBackStack implements r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    isInBackStack(boolean z) {
        this._defaultState = z;
    }

    @Override // o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo
    public boolean enabledByDefault() {
        return this._defaultState;
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
