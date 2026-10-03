package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class launchUrl {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final List<getVersionOverride> reservations;

    /* JADX WARN: Illegal instructions before constructor call */
    public launchUrl() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof launchUrl)) {
            int i5 = i2 + 115;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.reservations, ((launchUrl) obj).reservations)) {
            return true;
        }
        int i6 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<getVersionOverride> list = this.reservations;
        if (list != null) {
            return list.hashCode();
        }
        int i5 = i3 + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 69;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationReservationSetResp(reservations=" + this.reservations + ")";
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public launchUrl(@Nullable List<getVersionOverride> list) {
        this.reservations = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ launchUrl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 101;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list = null;
        }
        this(list);
    }

    public final List<getVersionOverride> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        List<getVersionOverride> list = this.reservations;
        int i5 = i2 + 9;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return list;
    }
}
