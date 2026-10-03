package o;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeFileReaderModuleSpec {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("docName")
    private final String docName;

    @SerializedName("serviceId")
    private final long serviceId;

    @SerializedName("standardTermsId")
    private final String standardTermsId;

    @SerializedName("walletStatus")
    private final IAuthTabCallback status;

    @SerializedName("termsRequired")
    private final boolean termsRequired;

    @SerializedName("verifyRequired")
    private final boolean verifyRequired;

    public NativeFileReaderModuleSpec() {
        this(0L, null, false, false, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeFileReaderModuleSpec)) {
            return false;
        }
        NativeFileReaderModuleSpec nativeFileReaderModuleSpec = (NativeFileReaderModuleSpec) obj;
        if (this.serviceId != nativeFileReaderModuleSpec.serviceId || !Intrinsics.areEqual(this.standardTermsId, nativeFileReaderModuleSpec.standardTermsId)) {
            return false;
        }
        if (this.termsRequired != nativeFileReaderModuleSpec.termsRequired) {
            int i2 = onWarmupCompleted + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.verifyRequired != nativeFileReaderModuleSpec.verifyRequired) {
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.docName, nativeFileReaderModuleSpec.docName)) {
            return false;
        }
        if (this.status == nativeFileReaderModuleSpec.status) {
            return true;
        }
        int i6 = IAuthTabCallback + 43;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.serviceId);
        int iHashCode3 = this.standardTermsId.hashCode();
        int iHashCode4 = Boolean.hashCode(this.termsRequired);
        int iHashCode5 = Boolean.hashCode(this.verifyRequired);
        int iHashCode6 = this.docName.hashCode();
        IAuthTabCallback iAuthTabCallback = this.status;
        if (iAuthTabCallback == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 15;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = iAuthTabCallback.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletTermsResp(serviceId=" + this.serviceId + ", standardTermsId=" + this.standardTermsId + ", termsRequired=" + this.termsRequired + ", verifyRequired=" + this.verifyRequired + ", docName=" + this.docName + ", status=" + this.status + ")";
        int i2 = IAuthTabCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    public NativeFileReaderModuleSpec(long j, @NotNull String str, boolean z, boolean z2, @NotNull String str2, @Nullable IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.serviceId = j;
        this.standardTermsId = str;
        this.termsRequired = z;
        this.verifyRequired = z2;
        this.docName = str2;
        this.status = iAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeFileReaderModuleSpec(long j, String str, boolean z, boolean z2, String str2, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        boolean z3;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            j2 = i2 % 2 != 0 ? 1L : 0L;
            int i3 = 2 % 2;
        } else {
            j2 = j;
        }
        String str3 = "";
        String str4 = (i & 2) != 0 ? "" : str;
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        boolean z4 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            int i6 = IAuthTabCallback + 45;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 52 / 0;
            }
        } else {
            str3 = str2;
        }
        this(j2, str4, z3, z4, str3, (i & 32) != 0 ? null : iAuthTabCallback);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.standardTermsId;
        int i5 = i2 + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.termsRequired;
        int i5 = i3 + 69;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.verifyRequired;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docName;
        int i5 = i2 + 9;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final IAuthTabCallback onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = this.status;
        int i5 = i3 + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback SERVICE_AVAILABLE = new IAuthTabCallback("SERVICE_AVAILABLE", 0);
        public static final IAuthTabCallback NOT_REGISTERED = new IAuthTabCallback("NOT_REGISTERED", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = SERVICE_AVAILABLE;
            if (i3 == 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, NOT_REGISTERED};
            }
            IAuthTabCallback iAuthTabCallback2 = NOT_REGISTERED;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[4];
            iAuthTabCallbackArr[0] = iAuthTabCallback;
            iAuthTabCallbackArr[0] = iAuthTabCallback2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 74 / 0;
            }
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallback + 97;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
