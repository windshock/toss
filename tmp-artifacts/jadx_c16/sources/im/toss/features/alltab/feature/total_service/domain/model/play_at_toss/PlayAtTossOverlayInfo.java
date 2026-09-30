package im.toss.features.alltab.feature.total_service.domain.model.play_at_toss;

import im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$;
import im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$First$;
import im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$Second$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PlayAtTossOverlayInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final First first;
    private final Second second;

    static {
        int i = onWarmupCompleted + 77;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayAtTossOverlayInfo) {
            PlayAtTossOverlayInfo playAtTossOverlayInfo = (PlayAtTossOverlayInfo) obj;
            if (!Intrinsics.areEqual(this.first, playAtTossOverlayInfo.first)) {
                return false;
            }
            if (Intrinsics.areEqual(this.second, playAtTossOverlayInfo.second)) {
                return true;
            }
            int i2 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 15;
        onNavigationEvent = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 93;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 71 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
      0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v1 im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$Second) = 
      (r3v0 im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$Second)
      (r3v5 im.toss.features.alltab.feature.total_service.domain.model.play_at_toss.PlayAtTossOverlayInfo$Second)
     binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        Second second;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.first.hashCode();
            second = this.second;
            int i3 = 26 / 0;
            if (second != null) {
                iHashCode2 = second.hashCode();
                int i4 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            iHashCode = this.first.hashCode();
            second = this.second;
            if (second != null) {
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlayAtTossOverlayInfo(first=" + this.first + ", second=" + this.second + ")";
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlayAtTossOverlayInfo> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            PlayAtTossOverlayInfo$.serializer serializerVar = PlayAtTossOverlayInfo$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ PlayAtTossOverlayInfo(int i, First first, Second second, okycx okycxVar) {
        if (1 != (i & 1)) {
            htf31.onExtraCallbackWithResult(i, 1, PlayAtTossOverlayInfo$.serializer.INSTANCE.getDescriptor());
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.first = first;
        if ((i & 2) == 0) {
            this.second = null;
            return;
        }
        this.second = second;
        int i5 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(PlayAtTossOverlayInfo playAtTossOverlayInfo, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onNavigationEvent(serialDescriptor, 1, PlayAtTossOverlayInfo$First$.serializer.INSTANCE, playAtTossOverlayInfo.first);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                int i3 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Second second = playAtTossOverlayInfo.second;
                    throw null;
                }
                if (playAtTossOverlayInfo.second == null) {
                    return;
                }
            }
        } else {
            vylVar.onNavigationEvent(serialDescriptor, 0, PlayAtTossOverlayInfo$First$.serializer.INSTANCE, playAtTossOverlayInfo.first);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, PlayAtTossOverlayInfo$Second$.serializer.INSTANCE, playAtTossOverlayInfo.second);
        int i4 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final First onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.first;
        }
        throw null;
    }

    public final Second onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Second second = this.second;
        int i4 = i2 + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return second;
    }
}
