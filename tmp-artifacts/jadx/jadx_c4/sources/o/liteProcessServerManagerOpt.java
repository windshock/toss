package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class liteProcessServerManagerOpt {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final List<onUnavailable> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof liteProcessServerManagerOpt) {
            if (Intrinsics.areEqual(this.onNavigationEvent, ((liteProcessServerManagerOpt) obj).onNavigationEvent)) {
                return true;
            }
            int i4 = onExtraCallback + 117;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = onExtraCallback;
        int i6 = i5 + 69;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 63;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 42 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallback + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final liteProcessServerManagerOpt onExtraCallbackWithResult(@NotNull List<onUnavailable> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        liteProcessServerManagerOpt liteprocessservermanageropt = new liteProcessServerManagerOpt(list);
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return liteprocessservermanageropt;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditHomeBanner(contents=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public liteProcessServerManagerOpt(@NotNull List<onUnavailable> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<onUnavailable> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List<onUnavailable> list = this.onNavigationEvent;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
