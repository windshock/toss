package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class va {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final boolean onExtraCallback;
    private final SessionProcessorBaseExternalSyntheticLambda1 onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public va() {
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1 = null;
        this(sessionProcessorBaseExternalSyntheticLambda1, false, 3, sessionProcessorBaseExternalSyntheticLambda1);
    }

    public va(@NotNull SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) {
        Intrinsics.checkNotNullParameter(sessionProcessorBaseExternalSyntheticLambda1, "");
        this.onWarmupCompleted = sessionProcessorBaseExternalSyntheticLambda1;
        this.onExtraCallback = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ va(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                sessionProcessorBaseExternalSyntheticLambda1 = SessionProcessorBaseExternalSyntheticLambda1.Inherit;
                int i3 = 73 / 0;
            } else {
                sessionProcessorBaseExternalSyntheticLambda1 = SessionProcessorBaseExternalSyntheticLambda1.Inherit;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = true;
        }
        this(sessionProcessorBaseExternalSyntheticLambda1, z);
    }

    public final SessionProcessorBaseExternalSyntheticLambda1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1 = this.onWarmupCompleted;
        int i5 = i2 + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return sessionProcessorBaseExternalSyntheticLambda1;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return z;
    }

    public va(boolean z) {
        this(SessionProcessorBaseExternalSyntheticLambda1.Inherit, z);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        if (this.onWarmupCompleted == ((va) obj).onWarmupCompleted) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.onWarmupCompleted.hashCode() % 51) >>> Boolean.hashCode(this.onExtraCallback) : (this.onWarmupCompleted.hashCode() * 31) + Boolean.hashCode(this.onExtraCallback);
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
