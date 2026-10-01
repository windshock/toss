package o;

import com.google.android.gms.internal.ads.zzgc;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class userError {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final getCachingExecutorService onExtraCallback;
    private final getConfiguration<Float> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public userError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public userError(@NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice) {
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        this.onExtraCallbackWithResult = getconfiguration;
        this.onExtraCallback = getcachingexecutorservice;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ userError(getConfiguration getconfiguration, getCachingExecutorService getcachingexecutorservice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
            getconfiguration = (getConfiguration) configureReward.onExtraCallback(zzgc.onExtraCallbackWithResult(), -1629622331, iOnExtraCallbackWithResult2, zzgc.onExtraCallbackWithResult(), new Object[0], 1629622338, iOnExtraCallbackWithResult);
        }
        if ((i & 2) != 0) {
            getcachingexecutorservice = configureReward.onExtraCallback();
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(getconfiguration, getcachingexecutorservice);
    }

    public final getConfiguration<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        getConfiguration<Float> getconfiguration = this.onExtraCallbackWithResult;
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return getconfiguration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getCachingExecutorService onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getCachingExecutorService getcachingexecutorservice = this.onExtraCallback;
        int i5 = i3 + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getcachingexecutorservice;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof userError)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((userError) obj).onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.onExtraCallback, r6.onExtraCallback))) {
            return true;
        }
        int i6 = IAuthTabCallback + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode();
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsClickableScaleConfiguration(scale=" + this.onExtraCallbackWithResult + ", spec=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
