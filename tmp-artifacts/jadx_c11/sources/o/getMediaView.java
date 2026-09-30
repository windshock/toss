package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMediaView {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final Integer onExtraCallbackWithResult;
    private SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 onNavigationEvent;

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.onExtraCallbackWithResult;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 = this.onNavigationEvent;
        int i5 = i2 + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
    }

    public getMediaView(@NotNull String str, @Nullable SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = null;
        this.onNavigationEvent = singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getMediaView(String str, SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 43;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            } else {
                int i7 = 2 % 2;
            }
            singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 = null;
        }
        this(str, singleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        String str = this.IAuthTabCallback + "_" + this.onExtraCallbackWithResult;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.IAuthTabCallback;
        if (str == null || str.length() == 0) {
            Integer num = this.onExtraCallbackWithResult;
            if (num == null) {
                int i4 = onExtraCallback + 1;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onExtraCallback + 117;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                num.intValue();
                throw null;
            }
            if (num.intValue() <= 0) {
                return false;
            }
        }
        return true;
    }

    public final Object onExtraCallback() {
        int i = 2 % 2;
        Object obj = null;
        if (asBinder()) {
            int i2 = onWarmupCompleted + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            if (str != null) {
                return StringsKt.isBlank(str) ? this.onExtraCallbackWithResult : str;
            }
        }
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }
}
