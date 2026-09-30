package o;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MediationAdapterRouter implements getTitleMarginEnd {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final getConfiguration<Float> onExtraCallbackWithResult;
    private final getCachingExecutorService onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public MediationAdapterRouter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MediationAdapterRouter(@NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice) {
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        this.onExtraCallbackWithResult = getconfiguration;
        this.onNavigationEvent = getcachingexecutorservice;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MediationAdapterRouter(getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            getconfiguration = (getConfiguration) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -1629622331, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[0], 1629622338, iOnExtraCallbackWithResult);
            int i2 = IAuthTabCallback + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            getcachingexecutorservice = configureReward.onExtraCallback();
        }
        this(getconfiguration, getcachingexecutorservice);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediationAdapterRouter(float f, float f2, @NotNull getCachingExecutorService getcachingexecutorservice) {
        this(configureReward.onExtraCallback(f, f2), getcachingexecutorservice);
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
    }

    public modifyFpsForPreviewOnlyRepeating onWarmupCompleted(@NotNull Camera2CapturePipelineTorchTaskExternalSyntheticLambda1 camera2CapturePipelineTorchTaskExternalSyntheticLambda1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, "");
        shouldAlwaysRewardUser shouldalwaysrewarduser = new shouldAlwaysRewardUser(camera2CapturePipelineTorchTaskExternalSyntheticLambda1, this.onExtraCallbackWithResult, this.onNavigationEvent);
        int i2 = IAuthTabCallback + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return shouldalwaysrewarduser;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return iHashCode;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof MediationAdapterRouter)) {
            return false;
        }
        MediationAdapterRouter mediationAdapterRouter = (MediationAdapterRouter) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, mediationAdapterRouter.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, mediationAdapterRouter.onNavigationEvent)) {
            return true;
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        return i4 % 2 == 0;
    }
}
