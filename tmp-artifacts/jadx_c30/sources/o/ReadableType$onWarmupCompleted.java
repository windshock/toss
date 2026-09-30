package o;

import android.webkit.ConsoleMessage;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ReadableType$onWarmupCompleted {
    public static final /* synthetic */ int[] onNavigationEvent;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        onNavigationEvent = iArr;
    }
}
