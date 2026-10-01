package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class socketFactory {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Integer onExtraCallback;
    private final Integer onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public socketFactory() {
        Integer num = null;
        this(num, num, 3, num);
    }

    public socketFactory(@Nullable Integer num, @Nullable Integer num2) {
        this.onWarmupCompleted = num;
        this.onExtraCallback = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ socketFactory(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            num2 = null;
        }
        this(num, num2);
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return num;
    }

    public final Integer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.onExtraCallback;
        int i5 = i2 + 33;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }
}
