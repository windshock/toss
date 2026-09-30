package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class wdefault<T> implements AFg1eSDKAFa1ySDK<T> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final Map<T, Float> onWarmupCompleted;

    public wdefault(@NotNull Map<T, Float> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onWarmupCompleted = map;
    }

    @Override // o.AFg1eSDKAFa1ySDK
    public float onExtraCallback(T t) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Float f = this.onWarmupCompleted.get(t);
        if (f == null) {
            return Float.NaN;
        }
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        float fFloatValue = f.floatValue();
        if (i5 == 0) {
            int i6 = 45 / 0;
        }
        return fFloatValue;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 85;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 != 0;
        }
        if (obj instanceof wdefault) {
            return Intrinsics.areEqual(this.onWarmupCompleted, ((wdefault) obj).onWarmupCompleted);
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? this.onWarmupCompleted.hashCode() >> 59 : this.onWarmupCompleted.hashCode() * 31;
        int i3 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MapDraggableAnchors(" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
