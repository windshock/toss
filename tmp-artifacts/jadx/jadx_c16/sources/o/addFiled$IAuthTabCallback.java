package o;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class addFiled$IAuthTabCallback extends addFiled {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final List<getDisplayMetricsWrapper> onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof addFiled$IAuthTabCallback) {
            return !(Intrinsics.areEqual(this.onWarmupCompleted, ((addFiled$IAuthTabCallback) obj).onWarmupCompleted) ^ true);
        }
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Success(data=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addFiled$IAuthTabCallback(@NotNull List<? extends getDisplayMetricsWrapper> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = list;
    }

    public final List<getDisplayMetricsWrapper> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<getDisplayMetricsWrapper> list = this.onWarmupCompleted;
        int i5 = i3 + 113;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
