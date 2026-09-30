package o;

import java.io.Serializable;
import o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<F extends r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo> implements Serializable {
    private static final long serialVersionUID = 1;
    protected int _enabled;

    protected r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo(int i2) {
        this._enabled = i2;
    }

    public static <F extends r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo> r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<F> onNavigationEvent(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<>(mask);
    }

    public r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<F> onExtraCallbackWithResult(F f) {
        int mask = f.getMask() | this._enabled;
        return mask == this._enabled ? this : new r8lambda4ROHaS4O6f2WoPhKvhOMRg_7Bzo<>(mask);
    }

    public boolean onNavigationEvent(F f) {
        return (f.getMask() & this._enabled) != 0;
    }
}
