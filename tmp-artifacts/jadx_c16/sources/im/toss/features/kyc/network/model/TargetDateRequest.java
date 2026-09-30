package im.toss.features.kyc.network.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TargetDateRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;
    private final String targetDate;

    static {
        int i = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TargetDateRequest() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TargetDateRequest)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.targetDate, ((TargetDateRequest) obj).targetDate))) {
            return true;
        }
        int i6 = onExtraCallback + 45;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.targetDate.hashCode();
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TargetDateRequest(targetDate=" + this.targetDate + ")";
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return str;
    }

    public /* synthetic */ TargetDateRequest(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) != 0) {
            this.targetDate = str;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        String string = zzaj.onWarmupCompleted().asBinder().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.targetDate = string;
        int i3 = onExtraCallback + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public TargetDateRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetDate = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(TargetDateRequest targetDateRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, targetDateRequest.targetDate);
        } else {
            String str = targetDateRequest.targetDate;
            Intrinsics.checkNotNullExpressionValue(zzaj.onWarmupCompleted().asBinder().toString(), "");
            if (!Intrinsics.areEqual(str, r3)) {
            }
        }
        int i3 = onExtraCallback + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TargetDateRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                str = zzaj.onWarmupCompleted().asBinder().toString();
                Intrinsics.checkNotNullExpressionValue(str, "");
                int i3 = 34 / 0;
            } else {
                str = zzaj.onWarmupCompleted().asBinder().toString();
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            int i4 = 2 % 2;
        }
        this(str);
    }
}
