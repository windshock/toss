package o;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class infoForPosition {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private Long onExtraCallbackWithResult;
    private final initViewPager onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public infoForPosition() {
        initViewPager initviewpager = null;
        this(initviewpager, 1, initviewpager);
    }

    public infoForPosition(@NotNull initViewPager initviewpager) {
        Intrinsics.checkNotNullParameter(initviewpager, "");
        this.onWarmupCompleted = initviewpager;
    }

    public /* synthetic */ infoForPosition(initViewPager initviewpager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            initviewpager = new initViewPager(0.0f, 0.0f, 0.0f, 0L, 0L, 31, null);
            int i3 = onNavigationEvent + 93;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this(initviewpager);
    }

    public final List<NativeAdsEventLogType> onExtraCallback(float f, long j) {
        long jLongValue;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (f > this.onWarmupCompleted.IAuthTabCallback()) {
            int i3 = IAuthTabCallback + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(NativeAdsEventLogType.IAuthTabCallbackDefault.IAuthTabCallback);
        }
        if (f >= this.onWarmupCompleted.onExtraCallback()) {
            arrayList.add(NativeAdsEventLogType.asInterface.onExtraCallbackWithResult);
            int i5 = IAuthTabCallback + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (f < this.onWarmupCompleted.onExtraCallbackWithResult()) {
            this.onExtraCallbackWithResult = null;
            return arrayList;
        }
        Long l = this.onExtraCallbackWithResult;
        if (l != null) {
            int i7 = IAuthTabCallback + 39;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            jLongValue = l.longValue();
        } else {
            this.onExtraCallbackWithResult = Long.valueOf(j);
            jLongValue = j;
        }
        if (j - jLongValue >= this.onWarmupCompleted.onWarmupCompleted()) {
            arrayList.add(NativeAdsEventLogType.getInterfaceDescriptor.onExtraCallbackWithResult);
        }
        return arrayList;
    }

    public final void onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        this.onExtraCallbackWithResult = null;
        int i6 = i4 + 113;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }
}
