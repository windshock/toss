package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class scheme implements CipherSuiteCompanion {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final int onExtraCallbackWithResult;
    private final int onWarmupCompleted;

    public scheme(int i, int i2) {
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = i2;
    }

    @Override // o.CipherSuiteCompanion
    public /* bridge */ int onNavigationEvent(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = super.onNavigationEvent(getspecialfeatureoptinstatus);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return iOnNavigationEvent;
    }

    @Override // o.CipherSuiteCompanion
    public int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.onWarmupCompleted;
            int i5 = 67 / 0;
        } else {
            i = this.onWarmupCompleted;
        }
        int i6 = i3 + 67;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    @Override // o.CipherSuiteCompanion
    public int onExtraCallbackWithResult() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            i = this.onExtraCallbackWithResult;
            int i5 = 49 / 0;
        } else {
            i = this.onExtraCallbackWithResult;
        }
        int i6 = i4 + 43;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            cls = obj.getClass();
        } else {
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 4;
            }
            cls = null;
        }
        if (!Intrinsics.areEqual(scheme.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        scheme schemeVar = (scheme) obj;
        if (IAuthTabCallback() != schemeVar.IAuthTabCallback()) {
            int i6 = IAuthTabCallback + 23;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (onExtraCallbackWithResult() == schemeVar.onExtraCallbackWithResult()) {
            return true;
        }
        int i8 = IAuthTabCallback + 103;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (Integer.hashCode(IAuthTabCallback()) >> 33) / Integer.hashCode(onExtraCallbackWithResult()) : (Integer.hashCode(IAuthTabCallback()) * 31) + Integer.hashCode(onExtraCallbackWithResult());
        int i3 = IAuthTabCallback + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdaptiveColor(light=" + IAuthTabCallback() + ", dark=" + onExtraCallbackWithResult() + ")";
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
