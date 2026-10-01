package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DetectFaceInContinuousImage implements deserializeDecimalCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Function0<Unit> IAuthTabCallback;
    private final String onExtraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public DetectFaceInContinuousImage() {
        String str = null;
        this(str, str, 3, str);
    }

    public DetectFaceInContinuousImage(@Nullable String str, @Nullable Function0<Unit> function0) {
        this.onExtraCallback = str;
        this.IAuthTabCallback = function0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DetectFaceInContinuousImage(String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 31;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            } else {
                int i7 = 2 % 2;
            }
            str = null;
        }
        this(str, (i & 2) != 0 ? null : function0);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        return str;
    }

    public final Function0<Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.IAuthTabCallback;
        int i5 = i2 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return function0;
    }

    public void run() {
        int i = 2 % 2;
        Function0<Unit> function0 = this.IAuthTabCallback;
        if (function0 != null) {
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onWarmupCompleted + 19;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }
}
