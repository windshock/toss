package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setNativeAdView extends setCreativeDebuggerEnabled<getIconView> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public setNativeAdView() {
        getIconView geticonview = null;
        this(geticonview, 1, geticonview);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNativeAdView(@NotNull getIconView geticonview) {
        super(geticonview);
        Intrinsics.checkNotNullParameter(geticonview, "");
    }

    public /* synthetic */ setNativeAdView(getIconView geticonview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            geticonview = new getIconView();
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        this(geticonview);
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (!(!(iscreativedebuggerenabled instanceof reinitialize))) {
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ICustomTabsCallback().IAuthTabCallback(ByteOrderedDataOutputStream.onExtraCallback(((reinitialize) iscreativedebuggerenabled).onNavigationEvent(f)));
        }
        int i6 = IAuthTabCallback + 19;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        float fOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        if (iscreativedebuggerenabled instanceof reinitialize) {
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            fOnNavigationEvent = ByteOrderedDataOutputStream.onNavigationEvent(ICustomTabsCallback().onWarmupCompleted());
        } else {
            int i4 = onExtraCallback + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 4;
            }
            fOnNavigationEvent = 0.0f;
        }
        return Float.valueOf(fOnNavigationEvent);
    }
}
