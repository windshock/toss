package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getProxyokhttp {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 IAuthTabCallback;
    private final Integer onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 15;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 = this.IAuthTabCallback;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
    }

    public getProxyokhttp(@NotNull String str, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback = singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getProxyokhttp(String str, SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 = null;
        }
        this(str, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
    }

    public getProxyokhttp(int i, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        this.onNavigationEvent = null;
        this.onExtraCallbackWithResult = Integer.valueOf(i);
        this.IAuthTabCallback = singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        String str = this.onNavigationEvent + "_" + this.onExtraCallbackWithResult;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onNavigationEvent;
        if (str != null && str.length() != 0) {
            return true;
        }
        Integer num = this.onExtraCallbackWithResult;
        if (num != null) {
            return num.intValue() > 0;
        }
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public final Object onExtraCallbackWithResult() {
        int i = 2 % 2;
        Object obj = null;
        if (IAuthTabCallbackDefault()) {
            int i2 = onWarmupCompleted + 85;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            if (str != null) {
                int i4 = i3 + 41;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return StringsKt.isBlank(str) ? this.onExtraCallbackWithResult : str;
                }
                StringsKt.isBlank(str);
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }
}
