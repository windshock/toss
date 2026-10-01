package o;

import kotlin.jvm.functions.Function0;
import o.addFixedPosition;
import o.onAdRemoved;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAdRemoved {
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private static final addFixedPosition onNavigationEvent = new addFixedPosition(getSpecialFeatureOptInStatus.Light);
    private static final addFixedPosition onExtraCallback = new addFixedPosition(getSpecialFeatureOptInStatus.Dark);
    private static final accessisMonitoringp<addFixedPosition> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.tds.compose.foundation.color.TdsPaletteKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            addFixedPosition addfixedpositionOnNavigationEvent = onAdRemoved.onNavigationEvent();
            int i4 = onWarmupCompleted + 13;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return addfixedpositionOnNavigationEvent;
            }
            throw null;
        }
    });

    private static final addFixedPosition onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        int i3 = 35 / 0;
        return null;
    }

    public static /* synthetic */ addFixedPosition onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback();
        }
        onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onTransact + 65;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    public static final addFixedPosition onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        addFixedPosition addfixedposition = onNavigationEvent;
        int i4 = i3 + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return addfixedposition;
        }
        throw null;
    }

    public static final addFixedPosition IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public static final accessisMonitoringp<addFixedPosition> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        accessisMonitoringp<addFixedPosition> accessismonitoringp = IAuthTabCallback;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return accessismonitoringp;
    }
}
