package im.toss.websocket.network.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.GetMotionInteractionState;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossWebSocketMessageDto {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String action;
    private final TossWebSocketMessageMetaDto metadata;
    private final Object payload;
    private final String service;

    static {
        int i = onExtraCallback + 37;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 19;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof TossWebSocketMessageDto)) {
            return false;
        }
        TossWebSocketMessageDto tossWebSocketMessageDto = (TossWebSocketMessageDto) obj;
        if (!Intrinsics.areEqual(this.metadata, tossWebSocketMessageDto.metadata)) {
            int i7 = IAuthTabCallback + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.service, tossWebSocketMessageDto.service)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.action, tossWebSocketMessageDto.action)) {
            int i9 = IAuthTabCallback + 105;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.payload, tossWebSocketMessageDto.payload)) {
            return true;
        }
        int i11 = onNavigationEvent + 15;
        IAuthTabCallback = i11 % 128;
        return i11 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto = this.metadata;
        int iHashCode3 = 0;
        if (tossWebSocketMessageMetaDto == null) {
            int i2 = onNavigationEvent + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = tossWebSocketMessageMetaDto.hashCode();
        }
        String str = this.service;
        if (str == null) {
            int i4 = IAuthTabCallback + 77;
            onNavigationEvent = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str.hashCode();
            int i5 = onNavigationEvent + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        String str2 = this.action;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Object obj = this.payload;
        if (obj != null) {
            int i7 = IAuthTabCallback + 29;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = obj.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketMessageDto(metadata=" + this.metadata + ", service=" + this.service + ", action=" + this.action + ", payload=" + this.payload + ")";
        int i2 = onNavigationEvent + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
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

        public final KSerializer<TossWebSocketMessageDto> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            TossWebSocketMessageDto$$serializer tossWebSocketMessageDto$$serializer = TossWebSocketMessageDto$$serializer.INSTANCE;
            int i4 = onExtraCallback + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return tossWebSocketMessageDto$$serializer;
        }
    }

    public /* synthetic */ TossWebSocketMessageDto(int i, TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto, String str, String str2, Object obj, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onNavigationEvent + 63;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = TossWebSocketMessageDto$$serializer.INSTANCE.getDescriptor();
                i2 = 32;
            } else {
                descriptor = TossWebSocketMessageDto$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.metadata = tossWebSocketMessageMetaDto;
        this.service = str;
        this.action = str2;
        this.payload = obj;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TossWebSocketMessageDto tossWebSocketMessageDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, TossWebSocketMessageMetaDto$$serializer.INSTANCE, tossWebSocketMessageDto.metadata);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, tossWebSocketMessageDto.service);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, tossWebSocketMessageDto.action);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, GetMotionInteractionState.onExtraCallback, tossWebSocketMessageDto.payload);
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TossWebSocketMessageMetaDto onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto = this.metadata;
        int i5 = i2 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return tossWebSocketMessageMetaDto;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 39;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.service;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.action;
        int i5 = i3 + 59;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Object IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.payload;
        }
        throw null;
    }
}
