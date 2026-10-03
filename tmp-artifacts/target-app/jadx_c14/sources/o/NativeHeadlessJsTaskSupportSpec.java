package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeHeadlessJsTaskSupportSpec {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("summary")
    private final String summary;

    @SerializedName("transactedAt")
    private final String transactedAt;

    @SerializedName("type")
    private final runStdFunctionImpl type;

    @SerializedName("userType")
    private final NativeIntentAndroidSpec userType;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeHeadlessJsTaskSupportSpec)) {
            return false;
        }
        NativeHeadlessJsTaskSupportSpec nativeHeadlessJsTaskSupportSpec = (NativeHeadlessJsTaskSupportSpec) obj;
        if (this.amount != nativeHeadlessJsTaskSupportSpec.amount) {
            int i2 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.summary, nativeHeadlessJsTaskSupportSpec.summary)) {
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transactedAt, nativeHeadlessJsTaskSupportSpec.transactedAt)) {
            int i6 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 13 / 0;
            }
            return false;
        }
        if (this.type != nativeHeadlessJsTaskSupportSpec.type) {
            int i8 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, nativeHeadlessJsTaskSupportSpec.iconUrl)) {
            return false;
        }
        if (this.userType == nativeHeadlessJsTaskSupportSpec.userType) {
            return true;
        }
        int i10 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.amount) * 31) + this.summary.hashCode()) * 31) + this.transactedAt.hashCode()) * 31) + this.type.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.userType.hashCode();
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FangirlSavingBoxTransaction(amount=" + this.amount + ", summary=" + this.summary + ", transactedAt=" + this.transactedAt + ", type=" + this.type + ", iconUrl=" + this.iconUrl + ", userType=" + this.userType + ")";
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 99;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.amount;
        int i4 = i2 + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.summary;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transactedAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final runStdFunctionImpl onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        runStdFunctionImpl runstdfunctionimpl = this.type;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return runstdfunctionimpl;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final NativeIntentAndroidSpec asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        NativeIntentAndroidSpec nativeIntentAndroidSpec = this.userType;
        int i5 = i2 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return nativeIntentAndroidSpec;
    }
}
