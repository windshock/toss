package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPluginByClass {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final List<NativeSoundManagerSpec> items;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getPluginByClass)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.items, ((getPluginByClass) obj).items)) {
            int i7 = onNavigationEvent + 23;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            z = i7 % 2 != 0;
            int i9 = i8 + 73;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        List<NativeSoundManagerSpec> list = this.items;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SaveConsumptionHiddenReq(items=" + this.items + ")";
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public getPluginByClass(@NotNull List<NativeSoundManagerSpec> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }
}
