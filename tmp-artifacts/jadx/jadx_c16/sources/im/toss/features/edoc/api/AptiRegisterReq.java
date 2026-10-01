package im.toss.features.edoc.api;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AptiRegisterReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String aptCode;
    private final String dong;
    private final String ho;
    private final String password;

    static {
        int i = IAuthTabCallback + 79;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public AptiRegisterReq() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptiRegisterReq)) {
            int i2 = onExtraCallbackWithResult + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        AptiRegisterReq aptiRegisterReq = (AptiRegisterReq) obj;
        if ((!Intrinsics.areEqual(this.aptCode, aptiRegisterReq.aptCode)) || !Intrinsics.areEqual(this.dong, aptiRegisterReq.dong)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ho, aptiRegisterReq.ho)) {
            int i4 = onExtraCallbackWithResult + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.password, aptiRegisterReq.password)) {
            return true;
        }
        int i6 = onExtraCallback + 59;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.aptCode;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.dong;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ho;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.password;
        if (str4 != null) {
            int i2 = onExtraCallbackWithResult + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 0 / 0;
                iHashCode = str4.hashCode();
            } else {
                iHashCode = str4.hashCode();
            }
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = onExtraCallback + 87;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AptiRegisterReq(aptCode=" + this.aptCode + ", dong=" + this.dong + ", ho=" + this.ho + ", password=" + this.password + ")";
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AptiRegisterReq(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.aptCode = null;
        } else {
            this.aptCode = str;
        }
        if ((i & 2) == 0) {
            this.dong = null;
        } else {
            this.dong = str2;
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.ho = null;
            int i4 = 2 % 2;
        } else {
            this.ho = str3;
        }
        if ((i & 8) == 0) {
            int i5 = onExtraCallback + 73;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            this.password = null;
            return;
        }
        this.password = str4;
        int i7 = onExtraCallbackWithResult + 61;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 48 / 0;
        }
    }

    public AptiRegisterReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.aptCode = str;
        this.dong = str2;
        this.ho = str3;
        this.password = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(AptiRegisterReq aptiRegisterReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || aptiRegisterReq.aptCode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, aptiRegisterReq.aptCode);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (aptiRegisterReq.dong != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, aptiRegisterReq.dong);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallbackWithResult + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (aptiRegisterReq.ho != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, aptiRegisterReq.ho);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || aptiRegisterReq.password != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, aptiRegisterReq.password);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AptiRegisterReq(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 5;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            str4 = null;
        }
        this(str, str2, str3, str4);
    }
}
