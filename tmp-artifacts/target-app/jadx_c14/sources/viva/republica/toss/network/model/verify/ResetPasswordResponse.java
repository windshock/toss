package viva.republica.toss.network.model.verify;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.nativeReadByte;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResetPasswordResponse {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("currentPasswordFormat")
    private final nativeReadByte currentPasswordFormat;

    @SerializedName("internalCert")
    private final String internalCert;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 85;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ResetPasswordResponse)) {
            int i7 = i3 + 65;
            onNavigationEvent = i7 % 128;
            return i7 % 2 == 0;
        }
        ResetPasswordResponse resetPasswordResponse = (ResetPasswordResponse) obj;
        if ((!Intrinsics.areEqual(this.internalCert, resetPasswordResponse.internalCert)) || this.currentPasswordFormat != resetPasswordResponse.currentPasswordFormat) {
            return false;
        }
        int i8 = onExtraCallback + 77;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.internalCert.hashCode() + 112) >> this.currentPasswordFormat.hashCode() : (this.internalCert.hashCode() * 31) + this.currentPasswordFormat.hashCode();
        int i3 = onExtraCallback + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResetPasswordResponse(internalCert=" + this.internalCert + ", currentPasswordFormat=" + this.currentPasswordFormat + ")";
        int i2 = onNavigationEvent + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.internalCert;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final nativeReadByte onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return nativereadbyte;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
