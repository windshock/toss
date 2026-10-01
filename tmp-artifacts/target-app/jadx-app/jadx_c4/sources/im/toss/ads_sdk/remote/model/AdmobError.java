package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdmobError {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Integer code;
    private final String domain;
    private final String message;

    static {
        int i = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AdmobError() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdmobError)) {
            return false;
        }
        AdmobError admobError = (AdmobError) obj;
        if (Intrinsics.areEqual(this.code, admobError.code)) {
            if (!Intrinsics.areEqual(this.domain, admobError.domain)) {
                return false;
            }
            if (Intrinsics.areEqual(this.message, admobError.message)) {
                return true;
            }
            int i2 = onWarmupCompleted + 115;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.code;
        int iHashCode2 = 0;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.domain;
        if (str == null) {
            int i2 = onNavigationEvent + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.message;
        if (str2 != null) {
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = str2.hashCode();
            int i6 = onWarmupCompleted + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdmobError(code=" + this.code + ", domain=" + this.domain + ", message=" + this.message + ")";
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdmobError> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AdmobError$$serializer admobError$$serializer = AdmobError$$serializer.INSTANCE;
            if (i3 != 0) {
                return admobError$$serializer;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdmobError(int i, Integer num, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.code = null;
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
            }
            if ((i & 2) != 0) {
                this.domain = null;
                int i3 = 2 % 2;
            } else {
                this.domain = str;
            }
            if ((i & 4) == 0) {
                this.message = str2;
                return;
            }
            int i4 = onWarmupCompleted + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.message = null;
            if (i5 == 0) {
                int i6 = 24 / 0;
                return;
            }
            return;
        }
        this.code = num;
        int i7 = 2 % 2;
        if ((i & 2) != 0) {
        }
        if ((i & 4) == 0) {
        }
    }

    public AdmobError(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.code = num;
        this.domain = str;
        this.message = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AdmobError admobError, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, admobError.code);
        } else {
            int i3 = onWarmupCompleted + 119;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (admobError.code != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onWarmupCompleted + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (admobError.domain != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, admobError.domain);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i7 = onNavigationEvent + 77;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            if (admobError.message == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, admobError.message);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdmobError(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(num, str, (i & 4) != 0 ? null : str2);
    }
}
