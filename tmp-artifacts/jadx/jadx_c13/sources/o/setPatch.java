package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setPatch extends GeckoHubImp {
    public abstract setPatch onExtraCallback();

    @Override // o.GeckoHubImp
    public String toString() {
        String strOnNavigationEvent = onNavigationEvent();
        if (strOnNavigationEvent != null) {
            return strOnNavigationEvent;
        }
        return getResCount.IAuthTabCallback(this) + '@' + getResCount.onExtraCallbackWithResult(this);
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        setShowDividerHorizontal.onNavigationEvent(i);
        return setShowDividerHorizontal.onExtraCallback(this, str);
    }

    public final String onNavigationEvent() {
        setPatch setpatchOnExtraCallback;
        setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback();
        if (this == setpatchOnExtraCallback2) {
            return "Dispatchers.Main";
        }
        try {
            setpatchOnExtraCallback = setpatchOnExtraCallback2.onExtraCallback();
        } catch (UnsupportedOperationException unused) {
            setpatchOnExtraCallback = null;
        }
        if (this == setpatchOnExtraCallback) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
