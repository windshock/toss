package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setRequestListener {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private final String IAuthTabCallback;
    private final Long IAuthTabCallbackStub;
    private final String asBinder;
    private final String asInterface;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Long onTransact;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStubProxy = i2 % 128;
            return i2 % 2 != 0;
        }
        Object obj2 = null;
        if (!(obj instanceof setRequestListener)) {
            int i3 = IAuthTabCallbackDefault + 109;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        setRequestListener setrequestlistener = (setRequestListener) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, setrequestlistener.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, setrequestlistener.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, setrequestlistener.asInterface)) {
            int i4 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setrequestlistener.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallback, setrequestlistener.IAuthTabCallback) || !Intrinsics.areEqual(this.asBinder, setrequestlistener.asBinder)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onTransact, setrequestlistener.onTransact)) {
            return Intrinsics.areEqual(this.IAuthTabCallbackStub, setrequestlistener.IAuthTabCallbackStub) && this.onExtraCallback == setrequestlistener.onExtraCallback;
        }
        int i6 = IAuthTabCallbackStubProxy + 81;
        int i7 = i6 % 128;
        IAuthTabCallbackDefault = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 65;
        IAuthTabCallbackStubProxy = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 9;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            iHashCode = this.onNavigationEvent.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
                i = 1;
                int i4 = IAuthTabCallbackDefault + 73;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 1;
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.onNavigationEvent.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
                i = 0;
                int i42 = IAuthTabCallbackDefault + 73;
                IAuthTabCallbackStubProxy = i42 % 128;
                int i52 = i42 % 2;
                iHashCode2 = i;
                iHashCode3 = 0;
            } else {
                iHashCode2 = 0;
                iHashCode3 = str.hashCode();
            }
        }
        int iHashCode6 = this.asInterface.hashCode();
        int iHashCode7 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode8 = this.IAuthTabCallback.hashCode();
        String str2 = this.asBinder;
        if (str2 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str2.hashCode();
            int i6 = IAuthTabCallbackStubProxy + 25;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        Long l = this.onTransact;
        if (l == null) {
            int i8 = IAuthTabCallbackDefault;
            int i9 = i8 + 67;
            IAuthTabCallbackStubProxy = i9 % 128;
            iHashCode5 = i9 % 2 != 0 ? 0 : 1;
            int i10 = i8 + 19;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
        } else {
            iHashCode5 = l.hashCode();
        }
        Long l2 = this.IAuthTabCallbackStub;
        if (l2 != null) {
            iHashCode2 = l2.hashCode();
        }
        int iHashCode9 = (((((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i12 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallbackDefault = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Bundle(bundleName=" + this.onNavigationEvent + ", filePath=" + this.onWarmupCompleted + ", signature=" + this.asInterface + ", deploymentId=" + this.onExtraCallbackWithResult + ", deployedAt=" + this.IAuthTabCallback + ", sharedMinDeployedAt=" + this.asBinder + ", savedAt=" + this.onTransact + ", updatedAt=" + this.IAuthTabCallbackStub + ", isFromCache=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackDefault + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setRequestListener(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable Long l, @Nullable Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onNavigationEvent = str;
        this.onWarmupCompleted = str2;
        this.asInterface = str3;
        this.onExtraCallbackWithResult = str4;
        this.IAuthTabCallback = str5;
        this.asBinder = str6;
        this.onTransact = l;
        this.IAuthTabCallbackStub = l2;
        this.onExtraCallback = z;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("bundleName must not be empty");
        }
        if (str5.length() > 0 && !new Regex("\\d{14}").onExtraCallbackWithResult(str5)) {
            throw new IllegalArgumentException("deployedAt must match format yyyyMMddHHmmss");
        }
        if (l != null) {
            int i = IAuthTabCallbackDefault + 113;
            IAuthTabCallbackStubProxy = i % 128;
            if (i % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (l2 != null && l.longValue() > l2.longValue()) {
                throw new IllegalArgumentException("savedAt must be <= updatedAt when both non-null");
            }
        }
        int i2 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 87;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 123;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 109;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.asInterface;
        int i4 = i2 + 37;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            str = this.onExtraCallbackWithResult;
            int i4 = 78 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 89;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 7;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 29;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 93;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Long l = this.onTransact;
        int i4 = i2 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return l;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Long l = this.IAuthTabCallbackStub;
        int i5 = i3 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 5;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
