package im.toss.ads_sdk.model;

import im.toss.ads_sdk.model.NativeAdsError$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsError {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final int code;
    private final String domain;
    private final String message;
    private final String requestId;

    static {
        int i = onExtraCallbackWithResult + 123;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAdsError)) {
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        NativeAdsError nativeAdsError = (NativeAdsError) obj;
        if (this.code != nativeAdsError.code) {
            return false;
        }
        if (!Intrinsics.areEqual(this.message, nativeAdsError.message)) {
            int i3 = onWarmupCompleted + 23;
            IAuthTabCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.domain, nativeAdsError.domain)) {
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, nativeAdsError.requestId)) {
            return true;
        }
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.code);
        int iHashCode3 = this.message.hashCode();
        int iHashCode4 = this.domain.hashCode();
        String str = this.requestId;
        if (str == null) {
            int i4 = IAuthTabCallback + 43;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 99;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i9 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i10 = IAuthTabCallback + 37;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NativeAdsError(code=" + this.code + ", message=" + this.message + ", domain=" + this.domain + ", requestId=" + this.requestId + ")";
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NativeAdsError> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            NativeAdsError$.serializer serializerVar = NativeAdsError$.serializer.INSTANCE;
            int i4 = onExtraCallback + 7;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ NativeAdsError(int i, int i2, String str, String str2, String str3, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i3 = onWarmupCompleted + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 3, NativeAdsError$.serializer.INSTANCE.getDescriptor());
            int i5 = IAuthTabCallback + 9;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.code = i2;
        this.message = str;
        if ((i & 4) == 0) {
            this.domain = "ads-sdk-android";
            int i7 = 2 % 2;
        } else {
            this.domain = str2;
        }
        if ((i & 8) != 0) {
            this.requestId = str3;
            return;
        }
        int i8 = onWarmupCompleted + 107;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        Object obj = null;
        this.requestId = null;
        if (i9 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public NativeAdsError(int i, @NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.code = i;
        this.message = str;
        this.domain = str2;
        this.requestId = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsError nativeAdsError, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, nativeAdsError.code);
        vylVar.onExtraCallback(serialDescriptor, 1, nativeAdsError.message);
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(nativeAdsError.domain, "ads-sdk-android")) {
            vylVar.onExtraCallback(serialDescriptor, 2, nativeAdsError.domain);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || nativeAdsError.requestId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, nativeAdsError.requestId);
        }
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsError(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = onWarmupCompleted;
            int i4 = i3 + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = "ads-sdk-android";
        }
        if ((i2 & 8) != 0) {
            int i9 = onWarmupCompleted + 89;
            int i10 = i9 % 128;
            IAuthTabCallback = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 59;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            str3 = null;
        }
        this(i, str, str2, str3);
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.code;
        int i5 = i2 + 99;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.domain;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.requestId;
        int i4 = i2 + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return str;
    }
}
