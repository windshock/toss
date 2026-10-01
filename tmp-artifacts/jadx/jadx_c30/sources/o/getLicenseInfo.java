package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getLicenseInfo {
    private final getSignForPKCS7AndVIDRV2NoContents IAuthTabCallback;
    private final Map<String, String> onExtraCallback;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public getLicenseInfo() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLicenseInfo)) {
            return false;
        }
        getLicenseInfo getlicenseinfo = (getLicenseInfo) obj;
        return this.IAuthTabCallback == getlicenseinfo.IAuthTabCallback && Intrinsics.areEqual(this.onNavigationEvent, getlicenseinfo.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, getlicenseinfo.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, getlicenseinfo.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        String str = this.onNavigationEvent;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.onExtraCallback;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        String str2 = this.onWarmupCompleted;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GraniteVideoDrmConfig(type=" + this.IAuthTabCallback + ", licenseServer=" + this.onNavigationEvent + ", headers=" + this.onExtraCallback + ", contentId=" + this.onWarmupCompleted + ")";
    }

    public getLicenseInfo(@NotNull getSignForPKCS7AndVIDRV2NoContents getsignforpkcs7andvidrv2nocontents, @Nullable String str, @Nullable Map<String, String> map, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(getsignforpkcs7andvidrv2nocontents, BuildConfig.FLAVOR);
        this.IAuthTabCallback = getsignforpkcs7andvidrv2nocontents;
        this.onNavigationEvent = str;
        this.onExtraCallback = map;
        this.onWarmupCompleted = str2;
    }

    public /* synthetic */ getLicenseInfo(getSignForPKCS7AndVIDRV2NoContents getsignforpkcs7andvidrv2nocontents, String str, Map map, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? getSignForPKCS7AndVIDRV2NoContents.NONE : getsignforpkcs7andvidrv2nocontents, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str2);
    }
}
