package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TiffUtil {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("resolveLinkText")
    private final String buttonText;

    @SerializedName("connectable")
    private final boolean connectable;

    @SerializedName("resolveLinkUri")
    private final String landingScheme;

    @SerializedName("notConnectableReasonMessage")
    private final String notConnectableReasonMessage;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof TiffUtil)) {
            return false;
        }
        TiffUtil tiffUtil = (TiffUtil) obj;
        if (this.connectable != tiffUtil.connectable) {
            return false;
        }
        if (!Intrinsics.areEqual(this.notConnectableReasonMessage, tiffUtil.notConnectableReasonMessage)) {
            int i7 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.buttonText, tiffUtil.buttonText)) {
            return Intrinsics.areEqual(this.landingScheme, tiffUtil.landingScheme);
        }
        int i9 = onNavigationEvent + 21;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Boolean.hashCode(this.connectable) * 31) + this.notConnectableReasonMessage.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.landingScheme.hashCode();
        int i4 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConnectPrerequisiteStatus(connectable=" + this.connectable + ", notConnectableReasonMessage=" + this.notConnectableReasonMessage + ", buttonText=" + this.buttonText + ", landingScheme=" + this.landingScheme + ")";
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.connectable;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.notConnectableReasonMessage;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.buttonText;
        int i4 = i3 + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.landingScheme;
        int i5 = i3 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return str;
    }
}
