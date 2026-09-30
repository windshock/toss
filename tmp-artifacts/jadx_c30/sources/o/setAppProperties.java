package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setAppProperties {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final List<setRootViewTag> list;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAppProperties) {
            return Intrinsics.areEqual(this.list, ((setAppProperties) obj).list);
        }
        int i5 = i3 + 17;
        onNavigationEvent = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i3 + 29;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.list.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.list.hashCode();
        int i3 = onExtraCallback + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferHistories(list=" + this.list + ")";
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
