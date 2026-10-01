package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum isAdded implements r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    isAdded(boolean z) {
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
