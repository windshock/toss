package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class extendNativeModules extends CatalystInstanceImpl {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("carrier")
    private final startScroll carrier;

    @SerializedName(PKCS12.KEY_PHONE)
    private final String phone;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof extendNativeModules) {
            extendNativeModules extendnativemodules = (extendNativeModules) obj;
            if (this.carrier == extendnativemodules.carrier) {
                return Intrinsics.areEqual(this.phone, extendnativemodules.phone);
            }
            int i2 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = IAuthTabCallback + 113;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 7;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.carrier.hashCode();
        return (i3 == 0 ? iHashCode + 83 : iHashCode * 31) + this.phone.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendSmsWithJuminNoRequest(carrier=" + this.carrier + ", phone=" + this.phone + ")";
        int i2 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
