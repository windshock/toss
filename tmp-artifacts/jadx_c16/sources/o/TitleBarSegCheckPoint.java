package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TitleBarSegCheckPoint {
    private static int asBinder = 1;
    private static int asInterface;
    private final long IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBarSegCheckPoint)) {
            return false;
        }
        TitleBarSegCheckPoint titleBarSegCheckPoint = (TitleBarSegCheckPoint) obj;
        if (this.IAuthTabCallback != titleBarSegCheckPoint.IAuthTabCallback) {
            return false;
        }
        if (this.onWarmupCompleted != titleBarSegCheckPoint.onWarmupCompleted) {
            int i4 = i2 + 123;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, titleBarSegCheckPoint.onNavigationEvent)) {
            int i6 = asInterface + 27;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, titleBarSegCheckPoint.onTransact)) {
            int i8 = asInterface + 83;
            asBinder = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, titleBarSegCheckPoint.onExtraCallback)) {
            int i9 = asInterface + 33;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackDefault, titleBarSegCheckPoint.IAuthTabCallbackDefault)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, titleBarSegCheckPoint.onExtraCallbackWithResult) && this.IAuthTabCallbackStub == titleBarSegCheckPoint.IAuthTabCallbackStub;
        }
        int i11 = asBinder + 115;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((Long.hashCode(this.IAuthTabCallback) * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onTransact.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackDefault.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallbackStub);
        int i4 = asBinder + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendGroupEventDuesReq(eventId=" + this.IAuthTabCallback + ", amount=" + this.onWarmupCompleted + ", fromAccountNo=" + this.onNavigationEvent + ", fromAccountType=" + this.onTransact + ", doc=" + this.onExtraCallback + ", signature=" + this.IAuthTabCallbackDefault + ", date=" + this.onExtraCallbackWithResult + ", useLv0Cert=" + this.IAuthTabCallbackStub + ")";
        int i2 = asBinder + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return str;
    }

    public TitleBarSegCheckPoint(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.IAuthTabCallback = j;
        this.onWarmupCompleted = j2;
        this.onNavigationEvent = str;
        this.onTransact = str2;
        this.onExtraCallback = str3;
        this.IAuthTabCallbackDefault = str4;
        this.onExtraCallbackWithResult = str5;
        this.IAuthTabCallbackStub = z;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.IAuthTabCallback;
        int i4 = i3 + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return j;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        int i3 = 21 / 0;
        return this.onWarmupCompleted;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.onTransact;
        int i4 = i3 + 79;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 93;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallbackStub;
        int i5 = i3 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
