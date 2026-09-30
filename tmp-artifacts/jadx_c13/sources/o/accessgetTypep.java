package o;

import kotlin.text.Regex;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class accessgetTypep {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final Regex onExtraCallback = new Regex("^([a-zA-Z][a-zA-Z0-9+.-]*://[^*{}/?#]*)");
    private static final Regex onNavigationEvent = new Regex("(?<!\\\\)\\((?!\\?)");

    public static final /* synthetic */ Regex IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Regex regex = onExtraCallback;
        int i5 = i3 + 75;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return regex;
    }

    public static final /* synthetic */ Regex onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Regex regex = onNavigationEvent;
        int i5 = i3 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return regex;
        }
        throw null;
    }

    static {
        int i = onWarmupCompleted + 69;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
