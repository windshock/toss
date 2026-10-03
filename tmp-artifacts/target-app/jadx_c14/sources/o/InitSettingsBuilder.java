package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InitSettingsBuilder {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("reserved")
    private final boolean reserved;

    @SerializedName("subscriptions")
    private final List<getVersionOverride> subscriptions;

    /* JADX WARN: Illegal instructions before constructor call */
    public InitSettingsBuilder() {
        List list = null;
        this(list, false, 3, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitSettingsBuilder)) {
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        InitSettingsBuilder initSettingsBuilder = (InitSettingsBuilder) obj;
        if (Intrinsics.areEqual(this.subscriptions, initSettingsBuilder.subscriptions)) {
            return this.reserved == initSettingsBuilder.reserved;
        }
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r1
      0x0023: PHI (r1v6 java.util.List<o.getVersionOverride>) = (r1v4 java.util.List<o.getVersionOverride>), (r1v7 java.util.List<o.getVersionOverride>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.InitSettingsBuilder.onExtraCallback
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.InitSettingsBuilder.onWarmupCompleted = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L17
            java.util.List<o.getVersionOverride> r1 = r5.subscriptions
            r4 = 48
            int r4 = r4 / r3
            if (r1 != 0) goto L23
            goto L1b
        L17:
            java.util.List<o.getVersionOverride> r1 = r5.subscriptions
            if (r1 != 0) goto L23
        L1b:
            int r2 = r2 + 105
            int r1 = r2 % 128
            o.InitSettingsBuilder.onExtraCallback = r1
            int r2 = r2 % r0
            goto L27
        L23:
            int r3 = r1.hashCode()
        L27:
            int r3 = r3 * 31
            boolean r0 = r5.reserved
            int r0 = java.lang.Boolean.hashCode(r0)
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.InitSettingsBuilder.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationSubscriptionsResp(subscriptions=" + this.subscriptions + ", reserved=" + this.reserved + ")";
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public InitSettingsBuilder(@Nullable List<getVersionOverride> list, boolean z) {
        this.subscriptions = list;
        this.reserved = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitSettingsBuilder(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            list = null;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z = false;
        }
        this(list, z);
    }

    public final List<getVersionOverride> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<getVersionOverride> list = this.subscriptions;
        int i4 = i3 + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.reserved;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return z;
    }
}
