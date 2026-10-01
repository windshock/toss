package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.remote.model.SspSdkAdResponse$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SspSdkAdResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final List<SspSdkAd> ads;
    private final String mraidJsUrl;
    private final String requestId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.ads_sdk.remote.model.SspSdkAdResponse$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = SspSdkAdResponse.onExtraCallback();
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return kSerializerOnExtraCallback;
        }
    }), null};

    public SspSdkAdResponse() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SspSdkAd$$serializer.INSTANCE);
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return checkcanopenlandingpage;
        }
        throw null;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SspSdkAdResponse)) {
            int i2 = onExtraCallbackWithResult + 79;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SspSdkAdResponse sspSdkAdResponse = (SspSdkAdResponse) obj;
        if (!Intrinsics.areEqual(this.requestId, sspSdkAdResponse.requestId)) {
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.ads, sspSdkAdResponse.ads)) {
            int i5 = onExtraCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.mraidJsUrl, sspSdkAdResponse.mraidJsUrl)) {
            return true;
        }
        int i7 = onExtraCallbackWithResult + 95;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.requestId.hashCode();
        int iHashCode3 = this.ads.hashCode();
        String str = this.mraidJsUrl;
        if (str == null) {
            int i4 = onExtraCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SspSdkAdResponse(requestId=" + this.requestId + ", ads=" + this.ads + ", mraidJsUrl=" + this.mraidJsUrl + ")";
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
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

        public final KSerializer<SspSdkAdResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            SspSdkAdResponse$.serializer serializerVar = SspSdkAdResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 85;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 3;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ SspSdkAdResponse(int i, String str, List list, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i2 = onExtraCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        this.requestId = str;
        if ((i & 2) == 0) {
            int i4 = onExtraCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.ads = CollectionsKt.emptyList();
        } else {
            this.ads = list;
            int i6 = onExtraCallbackWithResult + 79;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.mraidJsUrl = null;
            return;
        }
        this.mraidJsUrl = str2;
        int i9 = onExtraCallback + 105;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
    }

    public SspSdkAdResponse(@NotNull String str, @NotNull List<SspSdkAd> list, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.requestId = str;
        this.ads = list;
        this.mraidJsUrl = str2;
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(SspSdkAdResponse sspSdkAdResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 0)) || !Intrinsics.areEqual(sspSdkAdResponse.requestId, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, sspSdkAdResponse.requestId);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                if (!Intrinsics.areEqual(sspSdkAdResponse.ads, CollectionsKt.emptyList())) {
                    vylVar.onNavigationEvent(serialDescriptor, 1, (py) lazyArr[1].getValue(), sspSdkAdResponse.ads);
                    int i5 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                Intrinsics.areEqual(sspSdkAdResponse.ads, CollectionsKt.emptyList());
                obj.hashCode();
                throw null;
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i7 = onExtraCallback + 41;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (sspSdkAdResponse.mraidJsUrl != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, sspSdkAdResponse.mraidJsUrl);
            }
        }
        int i9 = onExtraCallbackWithResult + 111;
        onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SspSdkAdResponse(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i8 = onExtraCallback + 63;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            list = CollectionsKt.emptyList();
            int i10 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i11 = onExtraCallback + 13;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str2 = null;
        }
        this(str, list, str2);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<SspSdkAd> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<SspSdkAd> list = this.ads;
        int i5 = i3 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.mraidJsUrl;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
