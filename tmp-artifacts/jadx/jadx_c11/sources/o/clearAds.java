package o;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.tds.compose.foundation.anim.rally.RallyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.clearAds;
import o.flipHorizontally;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class clearAds {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(RallyData rallyData, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rallyData, fliphorizontally);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallbackWithResult(RallyData rallyData, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        fliphorizontally.IAuthTabCallback_Parcel(((Float) RallyData.onExtraCallbackWithResult(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent, new Object[]{rallyData}, -1828117382, 1828117383, iOnNavigationEvent2)).floatValue());
        fliphorizontally.access000(rallyData.getInterfaceDescriptor());
        fliphorizontally.IAuthTabCallbackStubProxy(rallyData.IAuthTabCallbackStub());
        fliphorizontally.getInterfaceDescriptor(rallyData.asInterface());
        fliphorizontally.IAuthTabCallbackStub(rallyData.onExtraCallback());
        fliphorizontally.asInterface(rallyData.onTransact());
        fliphorizontally.asBinder(rallyData.asBinder());
        fliphorizontally.IAuthTabCallbackDefault(rallyData.IAuthTabCallbackDefault());
        fliphorizontally.asInterface(rallyData.access100());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final RallyData rallyData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(rallyData, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = attachTimestamp.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.foundation.anim.rally.extension.ModifiersKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                RallyData rallyData2 = rallyData;
                flipHorizontally fliphorizontally = (flipHorizontally) obj;
                if (i4 == 0) {
                    return clearAds.onNavigationEvent(rallyData2, fliphorizontally);
                }
                clearAds.onNavigationEvent(rallyData2, fliphorizontally);
                throw null;
            }
        }).onExtraCallback(quirksExternalSyntheticBackport0);
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }
}
