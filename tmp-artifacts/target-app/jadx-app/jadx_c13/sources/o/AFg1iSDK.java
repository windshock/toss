package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1iSDK {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final SessionProcessorBaseExternalSyntheticLambda1 IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public AFg1iSDK() {
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1 = null;
        this(sessionProcessorBaseExternalSyntheticLambda1, false, 3, sessionProcessorBaseExternalSyntheticLambda1);
    }

    public AFg1iSDK(@NotNull SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) {
        Intrinsics.checkNotNullParameter(sessionProcessorBaseExternalSyntheticLambda1, "");
        this.IAuthTabCallback = sessionProcessorBaseExternalSyntheticLambda1;
        this.onExtraCallbackWithResult = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AFg1iSDK(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                sessionProcessorBaseExternalSyntheticLambda1 = SessionProcessorBaseExternalSyntheticLambda1.Inherit;
                int i3 = onNavigationEvent + 65;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            } else {
                SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda12 = SessionProcessorBaseExternalSyntheticLambda1.Inherit;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallback + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = true;
        }
        this(sessionProcessorBaseExternalSyntheticLambda1, z);
    }

    public final SessionProcessorBaseExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1 = this.IAuthTabCallback;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return sessionProcessorBaseExternalSyntheticLambda1;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AFg1iSDK) {
            return this.IAuthTabCallback == ((AFg1iSDK) obj).IAuthTabCallback;
        }
        int i5 = i2 + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 11;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.IAuthTabCallback.hashCode() * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }
}
