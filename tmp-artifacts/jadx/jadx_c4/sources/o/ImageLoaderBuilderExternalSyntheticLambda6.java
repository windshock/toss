package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda6 {
    private static int onExtraCallbackWithResult = 0;
    public static final int onNavigationEvent = 8;
    private static int onWarmupCompleted = 1;
    private final long IAuthTabCallback;
    private long onExtraCallback;

    public ImageLoaderBuilderExternalSyntheticLambda6() {
        this(0L, 1, null);
    }

    public ImageLoaderBuilderExternalSyntheticLambda6(long j) {
        this.IAuthTabCallback = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageLoaderBuilderExternalSyntheticLambda6(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 95;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 2;
            } else {
                int i7 = 2 % 2;
            }
            j = 500;
        }
        this(j);
    }

    public final void onWarmupCompleted(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.onExtraCallback >= this.IAuthTabCallback) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback = jCurrentTimeMillis;
            function0.invoke();
        }
        int i4 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
