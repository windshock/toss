package o;

import kotlin.jvm.functions.Function0;
import o.MaxRecyclerAdapterAdPositionBehavior;
import o.MaxRecyclerAdaptera;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRecyclerAdapterAdPositionBehavior {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static final MaxRecyclerAdaptera onExtraCallbackWithResult = new MaxRecyclerAdaptera(getSpecialFeatureOptInStatus.Light);
    private static final MaxRecyclerAdaptera onExtraCallback = new MaxRecyclerAdaptera(getSpecialFeatureOptInStatus.Dark);
    private static final accessisMonitoringp<MaxRecyclerAdaptera> IAuthTabCallback = setPostviewFormatSelector.IAuthTabCallback(new Function0() { // from class: im.toss.tds.compose.foundation.graphics.shadow.TdsShadowsKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            MaxRecyclerAdaptera maxRecyclerAdapteraIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                maxRecyclerAdapteraIAuthTabCallback = MaxRecyclerAdapterAdPositionBehavior.IAuthTabCallback();
                int i3 = 33 / 0;
            } else {
                maxRecyclerAdapteraIAuthTabCallback = MaxRecyclerAdapterAdPositionBehavior.IAuthTabCallback();
            }
            int i4 = onExtraCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            return maxRecyclerAdapteraIAuthTabCallback;
        }
    });

    public static /* synthetic */ MaxRecyclerAdaptera IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MaxRecyclerAdaptera maxRecyclerAdapteraOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return maxRecyclerAdapteraOnExtraCallbackWithResult;
    }

    private static final MaxRecyclerAdaptera onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = asBinder + 3;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final MaxRecyclerAdaptera onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        MaxRecyclerAdaptera maxRecyclerAdaptera = onExtraCallbackWithResult;
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return maxRecyclerAdaptera;
    }

    public static final MaxRecyclerAdaptera onWarmupCompleted() {
        MaxRecyclerAdaptera maxRecyclerAdaptera;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            maxRecyclerAdaptera = onExtraCallback;
            int i4 = 67 / 0;
        } else {
            maxRecyclerAdaptera = onExtraCallback;
        }
        int i5 = i3 + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return maxRecyclerAdaptera;
    }

    public static final accessisMonitoringp<MaxRecyclerAdaptera> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        accessisMonitoringp<MaxRecyclerAdaptera> accessismonitoringp = IAuthTabCallback;
        int i4 = i3 + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return accessismonitoringp;
    }
}
