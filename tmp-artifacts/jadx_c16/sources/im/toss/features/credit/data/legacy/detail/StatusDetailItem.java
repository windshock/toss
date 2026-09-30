package im.toss.features.credit.data.legacy.detail;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StatusDetailItem {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String desc;
    private final String key;
    private final String value;

    static {
        int i = onNavigationEvent + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public StatusDetailItem() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof StatusDetailItem)) {
            int i4 = onWarmupCompleted + 1;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        StatusDetailItem statusDetailItem = (StatusDetailItem) obj;
        if (!Intrinsics.areEqual(this.key, statusDetailItem.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value, statusDetailItem.value)) {
            int i6 = onWarmupCompleted + 53;
            onExtraCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.desc, statusDetailItem.desc)) {
            return true;
        }
        int i7 = onWarmupCompleted + 39;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.value.hashCode();
        String str = this.desc;
        if (str == null) {
            int i2 = onExtraCallback + 7;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i7 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i8 = onExtraCallback + 5;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatusDetailItem(key=" + this.key + ", value=" + this.value + ", desc=" + this.desc + ")";
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ StatusDetailItem(int i, String str, String str2, String str3, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.key = "";
        } else {
            this.key = str;
        }
        if ((i & 2) == 0) {
            int i2 = onWarmupCompleted + 95;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            this.value = "";
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            this.value = str2;
        }
        int i7 = 2 % 2;
        if ((i & 4) != 0) {
            this.desc = str3;
            return;
        }
        this.desc = null;
        int i8 = onExtraCallback + 61;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    public StatusDetailItem(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
        this.desc = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(StatusDetailItem statusDetailItem, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(statusDetailItem.key, "")) {
            vylVar.onExtraCallback(serialDescriptor, 0, statusDetailItem.key);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || !Intrinsics.areEqual(statusDetailItem.value, "")) {
            vylVar.onExtraCallback(serialDescriptor, 1, statusDetailItem.value);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                String str = statusDetailItem.desc;
                obj.hashCode();
                throw null;
            }
            if (statusDetailItem.desc != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, statusDetailItem.desc);
            }
        }
        int i3 = onExtraCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StatusDetailItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 97;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            int i5 = 2 % 2;
            str2 = "";
        }
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.desc;
        int i5 = i3 + 77;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
