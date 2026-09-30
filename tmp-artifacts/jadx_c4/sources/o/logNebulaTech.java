package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class logNebulaTech {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        int i = onExtraCallback;
        int i2 = i & 13;
        int i3 = i2 + ((i ^ 13) | i2);
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
