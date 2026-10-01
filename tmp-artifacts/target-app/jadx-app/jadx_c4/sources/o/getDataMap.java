package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getDataMap {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 5;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getDataMap)) {
            int i4 = IAuthTabCallback + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        getDataMap getdatamap = (getDataMap) obj;
        if (this.onExtraCallback != getdatamap.onExtraCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, getdatamap.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallback + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = onNavigationEvent + 11;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.onExtraCallback);
        String str = this.onExtraCallbackWithResult;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LivingStabilizationPreRegistration(isPreRegistrationTarget=" + this.onExtraCallback + ", url=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getDataMap(boolean z, @Nullable String str) {
        this.onExtraCallback = z;
        this.onExtraCallbackWithResult = str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i3 + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
