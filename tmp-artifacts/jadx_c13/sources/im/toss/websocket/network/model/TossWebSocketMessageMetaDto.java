package im.toss.websocket.network.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getBgColor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossWebSocketMessageMetaDto {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String connectEventId;
    private final Boolean isTrace;
    private final String socketPushId;

    static {
        int i = onWarmupCompleted + 87;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TossWebSocketMessageMetaDto)) {
            int i6 = i3 + 27;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto = (TossWebSocketMessageMetaDto) obj;
        if (!Intrinsics.areEqual(this.connectEventId, tossWebSocketMessageMetaDto.connectEventId)) {
            int i8 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.socketPushId, tossWebSocketMessageMetaDto.socketPushId)) {
            return Intrinsics.areEqual(this.isTrace, tossWebSocketMessageMetaDto.isTrace);
        }
        int i10 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v11 java.lang.String) = (r1v4 java.lang.String), (r1v13 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 != 0) {
            str = this.connectEventId;
            iHashCode = 1;
            iHashCode2 = str == null ? 0 : str.hashCode();
        } else {
            str = this.connectEventId;
            iHashCode = 0;
            if (str == null) {
            }
        }
        String str2 = this.socketPushId;
        if (str2 == null) {
            int i3 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode3 = str2.hashCode();
        }
        Boolean bool = this.isTrace;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketMessageMetaDto(connectEventId=" + this.connectEventId + ", socketPushId=" + this.socketPushId + ", isTrace=" + this.isTrace + ")";
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossWebSocketMessageMetaDto> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TossWebSocketMessageMetaDto$$serializer tossWebSocketMessageMetaDto$$serializer = TossWebSocketMessageMetaDto$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return tossWebSocketMessageMetaDto$$serializer;
        }
    }

    public /* synthetic */ TossWebSocketMessageMetaDto(int i, String str, String str2, Boolean bool, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, TossWebSocketMessageMetaDto$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.connectEventId = str;
        this.socketPushId = str2;
        this.isTrace = bool;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(TossWebSocketMessageMetaDto tossWebSocketMessageMetaDto, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, tossWebSocketMessageMetaDto.connectEventId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, tossWebSocketMessageMetaDto.socketPushId);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, tossWebSocketMessageMetaDto.isTrace);
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.connectEventId;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.socketPushId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Boolean bool = this.isTrace;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }
}
