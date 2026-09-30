package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getSignForPKCS7AndVIDRV2WithAttr {
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public getSignForPKCS7AndVIDRV2WithAttr() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSignForPKCS7AndVIDRV2WithAttr)) {
            return false;
        }
        getSignForPKCS7AndVIDRV2WithAttr getsignforpkcs7andvidrv2withattr = (getSignForPKCS7AndVIDRV2WithAttr) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, getsignforpkcs7andvidrv2withattr.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, getsignforpkcs7andvidrv2withattr.IAuthTabCallback) && Intrinsics.areEqual(this.onWarmupCompleted, getsignforpkcs7andvidrv2withattr.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, getsignforpkcs7andvidrv2withattr.onExtraCallback) && Intrinsics.areEqual(this.onNavigationEvent, getsignforpkcs7andvidrv2withattr.onNavigationEvent);
    }

    public int hashCode() {
        String str = this.onExtraCallbackWithResult;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.IAuthTabCallback;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onWarmupCompleted;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.onExtraCallback;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onNavigationEvent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "GraniteVideoMetadata(title=" + this.onExtraCallbackWithResult + ", subtitle=" + this.IAuthTabCallback + ", description=" + this.onWarmupCompleted + ", artist=" + this.onExtraCallback + ", imageUri=" + this.onNavigationEvent + ")";
    }

    public getSignForPKCS7AndVIDRV2WithAttr(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallback = str4;
        this.onNavigationEvent = str5;
    }

    public /* synthetic */ getSignForPKCS7AndVIDRV2WithAttr(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
