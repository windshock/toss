package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.BreakTime$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BreakTime {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String from;
    private final String to;

    static {
        int i = onExtraCallbackWithResult + 11;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 29;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreakTime)) {
            int i5 = i2 + 7;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.from, ((BreakTime) obj).from)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.to, r6.to))) {
            return true;
        }
        int i6 = onExtraCallback;
        int i7 = i6 + 43;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 83;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.from.hashCode() * 31) + this.to.hashCode();
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BreakTime(from=" + this.from + ", to=" + this.to + ")";
        int i2 = onExtraCallback + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BreakTime(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? BreakTime$.serializer.INSTANCE : BreakTime$.serializer.INSTANCE).getDescriptor());
            int i3 = IAuthTabCallback + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        this.from = str;
        this.to = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(BreakTime breakTime, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, breakTime.from);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, breakTime.from);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, breakTime.to);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.from;
        int i5 = i3 + 83;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.to;
        int i4 = i3 + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
