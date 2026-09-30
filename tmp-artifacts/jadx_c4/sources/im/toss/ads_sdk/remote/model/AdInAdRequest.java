package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.AdInAdRequest$;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody$DeviceInfo$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AdInAdRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String advertisementId;
    private final GetNativeAdsRequestBody.DeviceInfo device;

    static {
        int i = onWarmupCompleted + 33;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.ads_sdk.remote.model.AdInAdRequest) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (im.toss.ads_sdk.remote.model.AdInAdRequest) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.advertisementId, r6.advertisementId) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = im.toss.ads_sdk.remote.model.AdInAdRequest.onExtraCallbackWithResult + 15;
        im.toss.ads_sdk.remote.model.AdInAdRequest.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.device, r6.device) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r6 = im.toss.ads_sdk.remote.model.AdInAdRequest.onExtraCallback + 1;
        im.toss.ads_sdk.remote.model.AdInAdRequest.onExtraCallbackWithResult = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if ((r6 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 9 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.advertisementId.hashCode() * 31) + this.device.hashCode();
        int i4 = onExtraCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdInAdRequest(advertisementId=" + this.advertisementId + ", device=" + this.device + ")";
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdInAdRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AdInAdRequest$.serializer serializerVar = AdInAdRequest$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ AdInAdRequest(int i, String str, GetNativeAdsRequestBody.DeviceInfo deviceInfo, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallbackWithResult + 7;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AdInAdRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = AdInAdRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.advertisementId = str;
        this.device = deviceInfo;
    }

    public AdInAdRequest(@NotNull String str, @NotNull GetNativeAdsRequestBody.DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deviceInfo, "");
        this.advertisementId = str;
        this.device = deviceInfo;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(AdInAdRequest adInAdRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        GetNativeAdsRequestBody$DeviceInfo$.serializer serializerVar;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, adInAdRequest.advertisementId);
            serializerVar = GetNativeAdsRequestBody$DeviceInfo$.serializer.INSTANCE;
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, adInAdRequest.advertisementId);
            serializerVar = GetNativeAdsRequestBody$DeviceInfo$.serializer.INSTANCE;
        }
        vylVar.onNavigationEvent(serialDescriptor, 1, serializerVar, adInAdRequest.device);
        int i3 = onExtraCallback + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
