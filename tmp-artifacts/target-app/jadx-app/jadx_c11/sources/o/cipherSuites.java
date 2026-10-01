package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class cipherSuites {
    private static int asBinder = 1;
    private static int onTransact;
    private final int IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final allEnabledTlsVersions onNavigationEvent;
    private int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cipherSuites)) {
            return false;
        }
        cipherSuites ciphersuites = (cipherSuites) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ciphersuites.onExtraCallbackWithResult)) {
            int i2 = onTransact + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onNavigationEvent == ciphersuites.onNavigationEvent) {
            return this.IAuthTabCallback == ciphersuites.IAuthTabCallback && this.onWarmupCompleted == ciphersuites.onWarmupCompleted && this.onExtraCallback == ciphersuites.onExtraCallback;
        }
        int i4 = onTransact + 11;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i4 = asBinder + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BufferElement(name=" + this.onExtraCallbackWithResult + ", type=" + this.onNavigationEvent + ", sizeBytes=" + this.IAuthTabCallback + ", offset=" + this.onWarmupCompleted + ", normalized=" + this.onExtraCallback + ")";
        int i2 = onTransact + 11;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public cipherSuites(@NotNull String str, @NotNull allEnabledTlsVersions allenabledtlsversions, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(allenabledtlsversions, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = allenabledtlsversions;
        this.IAuthTabCallback = i;
        this.onWarmupCompleted = i2;
        this.onExtraCallback = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cipherSuites(String str, allEnabledTlsVersions allenabledtlsversions, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        boolean z2;
        if ((i3 & 8) != 0) {
            int i5 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & 16) != 0) {
            int i6 = onTransact;
            int i7 = i6 + 107;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 47;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, allenabledtlsversions, i, i4, z2);
    }

    public final allEnabledTlsVersions IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        allEnabledTlsVersions allenabledtlsversions = this.onNavigationEvent;
        int i5 = i3 + 63;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return allenabledtlsversions;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i2 + 47;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        this.onWarmupCompleted = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 15;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 + 39;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 77;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
