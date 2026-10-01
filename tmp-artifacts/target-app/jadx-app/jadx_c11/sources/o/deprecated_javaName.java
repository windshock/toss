package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_javaName implements CipherSuiteCompanion {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final int onExtraCallbackWithResult;

    public deprecated_javaName(int i) {
        this.onExtraCallbackWithResult = i;
    }

    @Override // o.CipherSuiteCompanion
    public /* bridge */ int onNavigationEvent(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.onNavigationEvent(getspecialfeatureoptinstatus);
            throw null;
        }
        int iOnNavigationEvent = super.onNavigationEvent(getspecialfeatureoptinstatus);
        int i3 = onNavigationEvent + 15;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnNavigationEvent;
        }
        throw null;
    }

    @Override // o.CipherSuiteCompanion
    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.CipherSuiteCompanion
    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj != null) {
            cls = obj.getClass();
            int i3 = IAuthTabCallback + 57;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(deprecated_javaName.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        if (this.onExtraCallbackWithResult != ((deprecated_javaName) obj).onExtraCallbackWithResult) {
            return false;
        }
        int i5 = onNavigationEvent + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.onExtraCallbackWithResult);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StaticColor(value=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
