package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1qSDK4 implements addAnimatorUpdateListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final GriverPageConfiguration onExtraCallback = GriverPageConfiguration.Companion.IAuthTabCallback("tosssec-tuba-variable-v2");

    @Inject
    public AFe1qSDK4() {
    }

    public String onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(str);
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public void onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback.onExtraCallback(str, str2);
            int i3 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback.onExtraCallback(str, str2);
        }
        int i4 = IAuthTabCallback + 67;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public void IAuthTabCallback(@NotNull Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            it = map.entrySet().iterator();
            int i3 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            it = map.entrySet().iterator();
        }
        while (it.hasNext()) {
            int i4 = onNavigationEvent + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Map.Entry<String, String> next = it.next();
                this.onExtraCallback.onExtraCallback(next.getKey(), next.getValue());
                int i5 = 21 / 0;
            } else {
                Map.Entry<String, String> next2 = it.next();
                this.onExtraCallback.onExtraCallback(next2.getKey(), next2.getValue());
            }
            int i6 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public Map<String, String> onExtraCallbackWithResult(@NotNull String... strArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            if (this.onExtraCallback.onWarmupCompleted(str) != null) {
                int i3 = IAuthTabCallback + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(str);
            }
            i2++;
            int i5 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i7 = onNavigationEvent + 25;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                Object next = it.next();
                String strOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted((String) next);
                Intrinsics.checkNotNull(strOnWarmupCompleted);
                linkedHashMap.put(next, strOnWarmupCompleted);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next2 = it.next();
            String strOnWarmupCompleted2 = this.onExtraCallback.onWarmupCompleted((String) next2);
            Intrinsics.checkNotNull(strOnWarmupCompleted2);
            linkedHashMap.put(next2, strOnWarmupCompleted2);
        }
        return linkedHashMap;
    }
}
