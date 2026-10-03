package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class clearFrameCallback {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final String ERROR_CODE_CANNOT_ISSUE_TOSS_CERTIFICATE = "TE_TOSS_BANK_MINOR_CANNOT_ISSUE_TOSS_CERTIFICATE";
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    @SerializedName("issuerDn")
    private final String issuerDn;

    @SerializedName("moveScheme")
    private final String moveScheme;

    @SerializedName("serial")
    private final String serial;

    static {
        int i = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public clearFrameCallback() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 29;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof clearFrameCallback)) {
            return false;
        }
        clearFrameCallback clearframecallback = (clearFrameCallback) obj;
        if (!Intrinsics.areEqual(this.issuerDn, clearframecallback.issuerDn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.serial, clearframecallback.serial)) {
            int i7 = onWarmupCompleted + 51;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.moveScheme, clearframecallback.moveScheme)) {
            int i8 = onWarmupCompleted + 101;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = onExtraCallback + 35;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onExtraCallback = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.issuerDn) != null : (str = this.issuerDn) != null) ? str.hashCode() : 0;
        String str2 = this.serial;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.moveScheme;
        if (str3 != null) {
            int i3 = onWarmupCompleted + 111;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int iHashCode4 = str3.hashCode();
                int i4 = 44 / 0;
                iHashCode = iHashCode4;
            } else {
                iHashCode = str3.hashCode();
            }
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalDeviceCertResponse(issuerDn=" + this.issuerDn + ", serial=" + this.serial + ", moveScheme=" + this.moveScheme + ")";
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public clearFrameCallback(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.issuerDn = str;
        this.serial = str2;
        this.moveScheme = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ clearFrameCallback(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 23;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            } else {
                int i6 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.issuerDn;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.serial;
        int i5 = i3 + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.moveScheme;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
