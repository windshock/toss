package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.K_;
import o.deInitialize;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class K_ {
    private static String IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final K_ onWarmupCompleted = new K_();

    public static /* synthetic */ Unit onNavigationEvent(deInitialize deinitialize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(deinitialize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(deinitialize);
        int i3 = onExtraCallbackWithResult + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return unitOnExtraCallback;
    }

    private K_() {
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        throw null;
    }

    static {
        GetFeatureExtension.onWarmupCompleted.onNavigationEvent(new Function1() { // from class: im.toss.tracking.LastScreenTracker$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 101;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = K_.onNavigationEvent((deInitialize) obj);
                int i4 = IAuthTabCallback + 5;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i = IAuthTabCallbackDefault + 9;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }

    private static final Unit onExtraCallback(deInitialize deinitialize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deinitialize, "");
        GetAttributeExtension getAttributeExtensionOnExtraCallback = GetDetectableSize.onExtraCallback(deinitialize);
        if (getAttributeExtensionOnExtraCallback.onExtraCallback()) {
            int i4 = onExtraCallbackWithResult + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback = getAttributeExtensionOnExtraCallback.IAuthTabCallback();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 77;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = null;
        int i5 = i2 + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
