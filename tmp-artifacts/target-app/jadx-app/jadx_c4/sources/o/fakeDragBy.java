package o;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class fakeDragBy implements endFakeDrag {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final calculatePageOffsets onExtraCallbackWithResult;

    @Inject
    public fakeDragBy(@NotNull calculatePageOffsets calculatepageoffsets) {
        Intrinsics.checkNotNullParameter(calculatepageoffsets, "");
        this.onExtraCallbackWithResult = calculatepageoffsets;
    }

    @Override // o.endFakeDrag
    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        calculatePageOffsets.onExtraCallback(this.onExtraCallbackWithResult, str, str2, list, nativeAdsEventLogType.toString(), 0L, 16, (Object) null);
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
