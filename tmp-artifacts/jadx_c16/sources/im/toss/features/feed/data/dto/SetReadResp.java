package im.toss.features.feed.data.dto;

import im.toss.features.feed.data.dto.SetReadResp$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SetReadResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean success;

    static {
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SetReadResp)) {
            int i4 = onNavigationEvent + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.success != ((SetReadResp) obj).success) {
            return false;
        }
        int i6 = onExtraCallback + 5;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.success;
        if (i3 == 0) {
            return Boolean.hashCode(z);
        }
        Boolean.hashCode(z);
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SetReadResp(success=" + this.success + ")";
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ SetReadResp(int i, boolean z, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, SetReadResp$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.success = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(SetReadResp setReadResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        vylVar.onNavigationEvent(serialDescriptor, i2 % 2 != 0 ? 1 : 0, setReadResp.success);
        int i3 = onExtraCallback + 49;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
