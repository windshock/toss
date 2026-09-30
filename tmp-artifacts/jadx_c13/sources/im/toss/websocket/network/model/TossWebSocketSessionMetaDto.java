package im.toss.websocket.network.model;

import im.toss.websocket.network.model.TossWebSocketSessionMetaDto$;
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
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossWebSocketSessionMetaDto {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String decodeKey;
    private final String loginToken;
    private final String url;
    private final String userToken;

    static {
        int i = onWarmupCompleted + 65;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TossWebSocketSessionMetaDto)) {
            return false;
        }
        TossWebSocketSessionMetaDto tossWebSocketSessionMetaDto = (TossWebSocketSessionMetaDto) obj;
        if (!Intrinsics.areEqual(this.url, tossWebSocketSessionMetaDto.url)) {
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.loginToken, tossWebSocketSessionMetaDto.loginToken)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.userToken, tossWebSocketSessionMetaDto.userToken)) {
            int i4 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.decodeKey, tossWebSocketSessionMetaDto.decodeKey)) {
            return true;
        }
        int i6 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        IAuthTabCallback = i3 % 128;
        int iHashCode3 = 0;
        if (i3 % 2 != 0 ? (str = this.url) != null : (str = this.url) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 49;
            IAuthTabCallback = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        }
        String str2 = this.loginToken;
        if (str2 == null) {
            int i5 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i7 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 4;
            }
        }
        String str3 = this.userToken;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.decodeKey;
        if (str4 != null) {
            int i9 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = str4.hashCode();
            int i11 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketSessionMetaDto(url=" + this.url + ", loginToken=" + this.loginToken + ", userToken=" + this.userToken + ", decodeKey=" + this.decodeKey + ")";
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossWebSocketSessionMetaDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TossWebSocketSessionMetaDto$.serializer serializerVar = TossWebSocketSessionMetaDto$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 34 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ TossWebSocketSessionMetaDto(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = TossWebSocketSessionMetaDto$.serializer.INSTANCE.getDescriptor();
                i2 = 65;
            } else {
                descriptor = TossWebSocketSessionMetaDto$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.url = str;
        this.loginToken = str2;
        this.userToken = str3;
        this.decodeKey = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(TossWebSocketSessionMetaDto tossWebSocketSessionMetaDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, tossWebSocketSessionMetaDto.url);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, tossWebSocketSessionMetaDto.loginToken);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, tossWebSocketSessionMetaDto.userToken);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, tossWebSocketSessionMetaDto.decodeKey);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.loginToken;
        int i4 = i3 + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            str = this.userToken;
            int i4 = 11 / 0;
        } else {
            str = this.userToken;
        }
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.decodeKey;
        int i5 = i2 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
