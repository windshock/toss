package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDecryptData {
    private final Map<String, String> IAuthTabCallback;
    private final Map<String, String> onExtraCallback;
    private final Map<String, String> onExtraCallbackWithResult;
    private final Map<String, String> onNavigationEvent;
    private final int onWarmupCompleted;

    public getDecryptData() {
        this(0, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDecryptData)) {
            return false;
        }
        getDecryptData getdecryptdata = (getDecryptData) obj;
        return this.onWarmupCompleted == getdecryptdata.onWarmupCompleted && Intrinsics.areEqual(this.onExtraCallbackWithResult, getdecryptdata.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onExtraCallback, getdecryptdata.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, getdecryptdata.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, getdecryptdata.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.onWarmupCompleted);
        Map<String, String> map = this.onExtraCallbackWithResult;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        Map<String, String> map2 = this.onExtraCallback;
        int iHashCode3 = map2 == null ? 0 : map2.hashCode();
        Map<String, String> map3 = this.IAuthTabCallback;
        int iHashCode4 = map3 == null ? 0 : map3.hashCode();
        Map<String, String> map4 = this.onNavigationEvent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "GraniteVideoCmcdConfig(mode=" + this.onWarmupCompleted + ", request=" + this.onExtraCallbackWithResult + ", session=" + this.onExtraCallback + ", obj=" + this.IAuthTabCallback + ", status=" + this.onNavigationEvent + ")";
    }

    public getDecryptData(int i, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @Nullable Map<String, String> map3, @Nullable Map<String, String> map4) {
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = map;
        this.onExtraCallback = map2;
        this.IAuthTabCallback = map3;
        this.onNavigationEvent = map4;
    }

    public /* synthetic */ getDecryptData(int i, Map map, Map map2, Map map3, Map map4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : map, (i2 & 4) != 0 ? null : map2, (i2 & 8) != 0 ? null : map3, (i2 & 16) == 0 ? map4 : null);
    }
}
