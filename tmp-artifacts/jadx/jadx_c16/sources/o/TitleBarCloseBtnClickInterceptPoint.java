package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TitleBarCloseBtnClickInterceptPoint {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public TitleBarCloseBtnClickInterceptPoint() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ TitleBarCloseBtnClickInterceptPoint onNavigationEvent(TitleBarCloseBtnClickInterceptPoint titleBarCloseBtnClickInterceptPoint, String str, String str2, boolean z, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 1;
        asBinder = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = titleBarCloseBtnClickInterceptPoint.onWarmupCompleted;
            int i5 = i3 + 85;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = titleBarCloseBtnClickInterceptPoint.onExtraCallbackWithResult;
        }
        if ((i & 4) != 0) {
            int i7 = i3 + 85;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            z = titleBarCloseBtnClickInterceptPoint.onExtraCallback;
            if (i8 == 0) {
                int i9 = 70 / 0;
            }
        }
        if ((i & 8) != 0) {
            str3 = titleBarCloseBtnClickInterceptPoint.onNavigationEvent;
        }
        return titleBarCloseBtnClickInterceptPoint.onExtraCallbackWithResult(str, str2, z, str3);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleBarCloseBtnClickInterceptPoint)) {
            int i2 = asBinder + 15;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        TitleBarCloseBtnClickInterceptPoint titleBarCloseBtnClickInterceptPoint = (TitleBarCloseBtnClickInterceptPoint) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, titleBarCloseBtnClickInterceptPoint.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, titleBarCloseBtnClickInterceptPoint.onExtraCallbackWithResult)) {
            int i3 = asBinder + 7;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.onExtraCallback == titleBarCloseBtnClickInterceptPoint.onExtraCallback) {
            return Intrinsics.areEqual(this.onNavigationEvent, titleBarCloseBtnClickInterceptPoint.onNavigationEvent);
        }
        int i5 = IAuthTabCallback + 67;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.onWarmupCompleted;
        if (str == null) {
            int i2 = asBinder + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
        String str2 = this.onNavigationEvent;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = IAuthTabCallback + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode4;
    }

    public final TitleBarCloseBtnClickInterceptPoint onExtraCallbackWithResult(@Nullable String str, @NotNull String str2, boolean z, @Nullable String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        TitleBarCloseBtnClickInterceptPoint titleBarCloseBtnClickInterceptPoint = new TitleBarCloseBtnClickInterceptPoint(str, str2, z, str3);
        int i2 = asBinder + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return titleBarCloseBtnClickInterceptPoint;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EditTossAccountReq(tossAccountId=" + this.onWarmupCompleted + ", tossAccountName=" + this.onExtraCallbackWithResult + ", constrainedWithdraw=" + this.onExtraCallback + ", type=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallback + 11;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return str;
    }

    public TitleBarCloseBtnClickInterceptPoint(@Nullable String str, @NotNull String str2, boolean z, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = str2;
        this.onExtraCallback = z;
        this.onNavigationEvent = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TitleBarCloseBtnClickInterceptPoint(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            str2 = "";
        }
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback + 13;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 88 / 0;
            }
            int i7 = 2 % 2;
            str3 = null;
        }
        this(str, str2, z, str3);
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onWarmupCompleted;
            int i4 = 86 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i2 + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i3 + 93;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleBarCloseBtnClickInterceptPoint(@NotNull onDisclaimerClick ondisclaimerclick) {
        this(ondisclaimerclick.onExtraCallbackWithResult(), ondisclaimerclick.asBinder(), ondisclaimerclick.onMinimized(), null, 8, null);
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
    }
}
