package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CommonSwitch {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSwitch)) {
            return false;
        }
        CommonSwitch commonSwitch = (CommonSwitch) obj;
        if (!Intrinsics.areEqual(this.asBinder, commonSwitch.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, commonSwitch.IAuthTabCallback)) {
            int i2 = onTransact + 37;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 73 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, commonSwitch.onWarmupCompleted) || !Intrinsics.areEqual(this.onNavigationEvent, commonSwitch.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, commonSwitch.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onExtraCallback, commonSwitch.onExtraCallback);
        }
        int i4 = onTransact + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.asBinder;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallback;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onWarmupCompleted;
        if (str3 == null) {
            int i2 = onTransact + 45;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.onNavigationEvent;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onExtraCallbackWithResult;
        if (str5 == null) {
            int i4 = onTransact + 67;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.onExtraCallback;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditStandardTermsUiData(title=" + this.asBinder + ", description=" + this.IAuthTabCallback + ", agreeMessage=" + this.onWarmupCompleted + ", cancelMessage=" + this.onNavigationEvent + ", agreeButtonText=" + this.onExtraCallbackWithResult + ", cancelButtonText=" + this.onExtraCallback + ")";
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CommonSwitch(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.asBinder = str;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = str3;
        this.onNavigationEvent = str4;
        this.onExtraCallbackWithResult = str5;
        this.onExtraCallback = str6;
    }
}
