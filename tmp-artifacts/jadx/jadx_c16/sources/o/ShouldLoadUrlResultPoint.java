package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ShouldLoadUrlResultPoint {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final List<onWarmupCompleted> IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 73;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof ShouldLoadUrlResultPoint)) {
            int i6 = i2 + 55;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }
        ShouldLoadUrlResultPoint shouldLoadUrlResultPoint = (ShouldLoadUrlResultPoint) obj;
        if (this.onWarmupCompleted != shouldLoadUrlResultPoint.onWarmupCompleted || !Intrinsics.areEqual(this.IAuthTabCallback, shouldLoadUrlResultPoint.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, shouldLoadUrlResultPoint.onExtraCallbackWithResult)) {
            return true;
        }
        int i7 = onExtraCallback + 83;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
        return i3 == 0 ? (((iHashCode + 107) >> this.IAuthTabCallback.hashCode()) >>> 111) * this.onExtraCallbackWithResult.hashCode() : (((iHashCode * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddReadonlyAccountsReq(alreadyCheckedName=" + this.onWarmupCompleted + ", accountList=" + this.IAuthTabCallback + ", verifyingMethod=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ShouldLoadUrlResultPoint(boolean z, @NotNull List<onWarmupCompleted> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = z;
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = str;
    }

    public final boolean onNavigationEvent() {
        boolean z;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 13;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.onWarmupCompleted;
            int i4 = 67 / 0;
        } else {
            z = this.onWarmupCompleted;
        }
        int i5 = i2 + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<onWarmupCompleted> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        private final String IAuthTabCallback;
        private final int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final onFinish onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i3 = onNavigationEvent + 39;
                IAuthTabCallbackDefault = i3 % 128;
                return i3 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallbackDefault;
                int i5 = i4 + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 89;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 17 / 0;
                }
                return false;
            }
            if (this.onExtraCallback == onwarmupcompleted.onExtraCallback) {
                if (this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted) {
                    return true;
                }
                int i9 = onNavigationEvent + 77;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = onNavigationEvent + 93;
            int i12 = i11 % 128;
            IAuthTabCallbackDefault = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 121;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int iHashCode2 = 0;
            if (str == null) {
                int i5 = i3 + 93;
                onNavigationEvent = i5 % 128;
                iHashCode = i5 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            int iHashCode3 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode4 = Integer.hashCode(this.onExtraCallback);
            onFinish onfinish = this.onWarmupCompleted;
            if (onfinish != null) {
                int i6 = IAuthTabCallbackDefault + 107;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    onfinish.hashCode();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                iHashCode2 = onfinish.hashCode();
            }
            return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Account(accountGroupName=" + this.IAuthTabCallback + ", bankAccount=" + this.onExtraCallbackWithResult + ", bankCode=" + this.onExtraCallback + ", type=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 97;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@Nullable String str, @NotNull String str2, int i, @Nullable onFinish onfinish) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = str2;
            this.onExtraCallback = i;
            this.onWarmupCompleted = onfinish;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(String str, String str2, int i, onFinish onfinish, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 8) != 0) {
                int i3 = IAuthTabCallbackDefault;
                int i4 = i3 + 91;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 11;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                onfinish = null;
            }
            this(str, str2, i, onfinish);
        }

        public final String IAuthTabCallback() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                str = this.IAuthTabCallback;
                int i4 = 73 / 0;
            } else {
                str = this.IAuthTabCallback;
            }
            int i5 = i3 + 71;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 19;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i2 + 35;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 63;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = this.onExtraCallback;
            int i5 = i2 + 117;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final onFinish onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
