package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeExceptionsManagerSpec {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("docCode")
    private final long docCode;

    @SerializedName("docName")
    private final String docName;

    @SerializedName("docUrl")
    private final String docUrl;

    @SerializedName("printable")
    private final boolean printable;

    public NativeExceptionsManagerSpec() {
        this(null, null, 0L, false, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeExceptionsManagerSpec)) {
            return false;
        }
        NativeExceptionsManagerSpec nativeExceptionsManagerSpec = (NativeExceptionsManagerSpec) obj;
        if (!Intrinsics.areEqual(this.docName, nativeExceptionsManagerSpec.docName)) {
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.docUrl, nativeExceptionsManagerSpec.docUrl)) {
            return false;
        }
        if (this.docCode != nativeExceptionsManagerSpec.docCode) {
            int i3 = onWarmupCompleted + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.printable != nativeExceptionsManagerSpec.printable) {
            return false;
        }
        int i5 = IAuthTabCallback + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.docName;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.docUrl;
        if (str2 != null) {
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = str2.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode) * 31) + Long.hashCode(this.docCode)) * 31) + Boolean.hashCode(this.printable);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletOpenUrlResp(docName=" + this.docName + ", docUrl=" + this.docUrl + ", docCode=" + this.docCode + ", printable=" + this.printable + ")";
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return str;
    }

    public NativeExceptionsManagerSpec(@Nullable String str, @Nullable String str2, long j, boolean z) {
        this.docName = str;
        this.docUrl = str2;
        this.docCode = j;
        this.printable = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeExceptionsManagerSpec(String str, String str2, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3 = null;
        String str4 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            str3 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 111;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            j = 0;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = false;
        }
        this(str4, str3, j2, z);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.docName;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            str = this.docUrl;
            int i4 = 93 / 0;
        } else {
            str = this.docUrl;
        }
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.docCode;
        int i5 = i2 + 41;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.printable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
