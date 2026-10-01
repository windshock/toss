package im.toss.tosssecurities.tracker.v2.model;

import android.os.Build;
import im.toss.tosssecurities.tracker.v2.model.SecuritiesLogV2DeviceContext$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.Cookies_set;
import o.UserChoiceBillingListener;
import o.liq;
import o.newChunkedSink;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SecuritiesLogV2DeviceContext {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String deviceModel;
    private final String os;
    private final String osVersion;
    private final String tossAppVer;
    private final String webViewVer;

    static {
        int i = onWarmupCompleted + 101;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public SecuritiesLogV2DeviceContext() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecuritiesLogV2DeviceContext)) {
            int i2 = onExtraCallback + 41;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        SecuritiesLogV2DeviceContext securitiesLogV2DeviceContext = (SecuritiesLogV2DeviceContext) obj;
        if (!Intrinsics.areEqual(this.deviceModel, securitiesLogV2DeviceContext.deviceModel)) {
            int i3 = onExtraCallback;
            int i4 = i3 + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 1;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.os, securitiesLogV2DeviceContext.os)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tossAppVer, securitiesLogV2DeviceContext.tossAppVer)) {
            int i7 = onExtraCallbackWithResult + 75;
            onExtraCallback = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.osVersion, securitiesLogV2DeviceContext.osVersion)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.webViewVer, securitiesLogV2DeviceContext.webViewVer))) {
            return true;
        }
        int i8 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.deviceModel.hashCode() * 31) + this.os.hashCode()) * 31) + this.tossAppVer.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.webViewVer.hashCode();
        int i4 = onExtraCallbackWithResult + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecuritiesLogV2DeviceContext(deviceModel=" + this.deviceModel + ", os=" + this.os + ", tossAppVer=" + this.tossAppVer + ", osVersion=" + this.osVersion + ", webViewVer=" + this.webViewVer + ")";
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SecuritiesLogV2DeviceContext> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            SecuritiesLogV2DeviceContext$.serializer serializerVar = SecuritiesLogV2DeviceContext$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ SecuritiesLogV2DeviceContext(int i, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if ((i & 1) == 0) {
            str = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        this.deviceModel = str;
        if ((i & 2) == 0) {
            int i2 = onExtraCallback;
            int i3 = i2 + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.os = "android";
            int i5 = i2 + 11;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.os = str2;
        }
        if ((i & 4) == 0) {
            this.tossAppVer = newChunkedSink.onExtraCallbackWithResult().getSmallIconBitmap();
        } else {
            this.tossAppVer = str3;
            int i8 = 2 % 2;
        }
        if ((i & 8) == 0) {
            String str6 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str6, "");
            this.osVersion = str6;
        } else {
            this.osVersion = str4;
            int i9 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.webViewVer = Cookies_set.onNavigationEvent.onWarmupCompleted(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
        } else {
            this.webViewVer = str5;
        }
    }

    public SecuritiesLogV2DeviceContext(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.deviceModel = str;
        this.os = str2;
        this.tossAppVer = str3;
        this.osVersion = str4;
        this.webViewVer = str5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(SecuritiesLogV2DeviceContext securitiesLogV2DeviceContext, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallback(serialDescriptor, 0, securitiesLogV2DeviceContext.deviceModel);
            int i3 = onExtraCallbackWithResult + 105;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 3;
            }
        } else {
            String str = securitiesLogV2DeviceContext.deviceModel;
            String str2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!Intrinsics.areEqual(str, str2)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallback(serialDescriptor, 1, securitiesLogV2DeviceContext.os);
        } else {
            int i5 = onExtraCallback + 51;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (!Intrinsics.areEqual(securitiesLogV2DeviceContext.os, "android")) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || !Intrinsics.areEqual(securitiesLogV2DeviceContext.tossAppVer, newChunkedSink.onExtraCallbackWithResult().getSmallIconBitmap())) {
            vylVar.onExtraCallback(serialDescriptor, 2, securitiesLogV2DeviceContext.tossAppVer);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            String str3 = securitiesLogV2DeviceContext.osVersion;
            Intrinsics.checkNotNullExpressionValue(Build.VERSION.RELEASE, "");
            if (!Intrinsics.areEqual(str3, r1)) {
                vylVar.onExtraCallback(serialDescriptor, 3, securitiesLogV2DeviceContext.osVersion);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(securitiesLogV2DeviceContext.webViewVer, Cookies_set.onNavigationEvent.onWarmupCompleted(UserChoiceBillingListener.onExtraCallback.onExtraCallback()))) {
            vylVar.onExtraCallback(serialDescriptor, 4, securitiesLogV2DeviceContext.webViewVer);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecuritiesLogV2DeviceContext(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(Build.MODEL, "");
                obj.hashCode();
                throw null;
            }
            str = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 73;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str2 = "android";
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                str3 = newChunkedSink.onExtraCallbackWithResult().getSmallIconBitmap();
                int i6 = 86 / 0;
            } else {
                str3 = newChunkedSink.onExtraCallbackWithResult().getSmallIconBitmap();
            }
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(str4, "");
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            int i7 = onExtraCallback + 81;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                str5 = Cookies_set.onNavigationEvent.onWarmupCompleted(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
                int i8 = 88 / 0;
            } else {
                str5 = Cookies_set.onNavigationEvent.onWarmupCompleted(UserChoiceBillingListener.onExtraCallback.onExtraCallback());
            }
        }
        this(str, str6, str7, str8, str5);
    }
}
