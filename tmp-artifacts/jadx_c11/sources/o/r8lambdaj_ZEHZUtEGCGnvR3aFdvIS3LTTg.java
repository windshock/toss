package o;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg implements r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult;
    private final Map<String, Object> IAuthTabCallback;
    private final String onExtraCallback;
    private final List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E> onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg)) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 107;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 29;
            IAuthTabCallbackStub = i9 % 128;
            if (i9 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg r8lambdaj_zehzutegcgnvr3afdvis3lttg = (r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg) obj;
        if (this.onWarmupCompleted != r8lambdaj_zehzutegcgnvr3afdvis3lttg.onWarmupCompleted) {
            int i10 = onExtraCallbackWithResult + 21;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, r8lambdaj_zehzutegcgnvr3afdvis3lttg.onExtraCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, r8lambdaj_zehzutegcgnvr3afdvis3lttg.onNavigationEvent)) {
            return Intrinsics.areEqual(this.IAuthTabCallback, r8lambdaj_zehzutegcgnvr3afdvis3lttg.IAuthTabCallback);
        }
        int i12 = onExtraCallbackWithResult + 55;
        IAuthTabCallbackStub = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallbackStub = i2 % 128;
        return i2 % 2 == 0 ? (((((Long.hashCode(this.onWarmupCompleted) + 96) >>> this.onExtraCallback.hashCode()) >> 42) / this.onNavigationEvent.hashCode()) / 12) << this.IAuthTabCallback.hashCode() : (((((Long.hashCode(this.onWarmupCompleted) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ComposableTracingData(logTime=" + this.onWarmupCompleted + ", tag=" + this.onExtraCallback + ", metrics=" + this.onNavigationEvent + ", additionalParams=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackStub + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg(long j, @NotNull String str, @NotNull List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E> list, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onWarmupCompleted = j;
        this.onExtraCallback = str;
        this.onNavigationEvent = list;
        this.IAuthTabCallback = map;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i2 + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 49;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E> list = this.onNavigationEvent;
        int i5 = i2 + 53;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }
}
