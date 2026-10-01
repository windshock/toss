package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAppOpenAd<S> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final Map<S, Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY>> IAuthTabCallback = new LinkedHashMap();

    public final void onExtraCallbackWithResult(S s, @NotNull Map<MaxNativeAdView, ? extends r8lambdawISNmAGv0vJBBl_rQ3C6417OY> map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.IAuthTabCallback.put(s, map);
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            this.IAuthTabCallback.put(s, map);
            throw null;
        }
    }

    public final Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> IAuthTabCallback(@NotNull Function1<? super removeAdapter, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        removeAdapter removeadapter = new removeAdapter();
        function1.invoke(removeadapter);
        Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY> mapOnNavigationEvent = removeadapter.onNavigationEvent();
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return mapOnNavigationEvent;
        }
        throw null;
    }

    public final Map<S, Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Map<S, Map<MaxNativeAdView, r8lambdawISNmAGv0vJBBl_rQ3C6417OY>> map = this.IAuthTabCallback;
        int i5 = i3 + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
