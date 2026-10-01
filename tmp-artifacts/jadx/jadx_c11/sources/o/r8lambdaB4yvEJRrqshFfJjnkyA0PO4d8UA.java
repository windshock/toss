package o;

import im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody;
import im.toss.securities.libs.performance.tracker.data.model.SecuritiesPerformanceLogBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaB4yvEJRrqshFfJjnkyA0PO4d8UA {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final SecuritiesPerformanceLogBody onNavigationEvent(@NotNull r8lambdaGuc5V9NsYQnbZkQbf4KwyluwEz4 r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4, "");
        if (!(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 instanceof r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg)) {
            if (!(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4 instanceof r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks)) {
                throw new IllegalArgumentException("Unsupported PerformanceTracingData type: " + Reflection.getOrCreateKotlinClass(r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4.getClass()).getSimpleName());
            }
            r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks r8lambdan2uusxctu9sq10xffiic0tk0ks = (r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks) r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
            List<r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback> listOnWarmupCompleted = r8lambdan2uusxctu9sq10xffiic0tk0ks.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                arrayList.add(r8lambdaGElTg33GpZ0N94uPamJyyZSwsvg.onExtraCallbackWithResult((r8lambdan2UUSXCtU9sq10xffIiC0tK0Ks.onExtraCallback) it.next()));
            }
            return new MetricV1LogBody(arrayList, access8100.onWarmupCompleted(r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallbackWithResult(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("appVersion", GetFeatureExtension.onWarmupCompleted.bx_()))), r8lambdan2uusxctu9sq10xffiic0tk0ks.onNavigationEvent(), r8lambdan2uusxctu9sq10xffiic0tk0ks.IAuthTabCallback(), r8lambdan2uusxctu9sq10xffiic0tk0ks.onExtraCallback(), (String) null, 32, (DefaultConstructorMarker) null);
        }
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg r8lambdaj_zehzutegcgnvr3afdvis3lttg = (r8lambdaj_ZEHZUtEGCGnvR3aFdvIS3LTTg) r8lambdaguc5v9nsyqnbzkqbf4kwyluwez4;
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(r8lambdaj_zehzutegcgnvr3afdvis3lttg.onExtraCallbackWithResult());
        Object objRemove = mapOnWarmupCompleted.remove("viewName");
        Object obj = null;
        if (!(!(objRemove instanceof String))) {
            int i4 = onNavigationEvent + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallback = (String) objRemove;
        } else {
            strIAuthTabCallback = null;
        }
        Object objRemove2 = mapOnWarmupCompleted.remove("sourceType");
        String str = !((objRemove2 instanceof String) ^ true) ? (String) objRemove2 : null;
        mapOnWarmupCompleted.put("appVersion", GetFeatureExtension.onWarmupCompleted.bx_());
        List<r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E> listOnExtraCallback = r8lambdaj_zehzutegcgnvr3afdvis3lttg.onExtraCallback();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnExtraCallback, 10));
        Iterator<T> it2 = listOnExtraCallback.iterator();
        while (it2.hasNext()) {
            arrayList2.add(r8lambdaGElTg33GpZ0N94uPamJyyZSwsvg.onNavigationEvent((r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E) it2.next()));
            int i5 = onExtraCallback + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        if (strIAuthTabCallback == null) {
            int i7 = onNavigationEvent + 59;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                r8lambdaj_zehzutegcgnvr3afdvis3lttg.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallback = r8lambdaj_zehzutegcgnvr3afdvis3lttg.IAuthTabCallback();
        }
        MetricV1LogBody metricV1LogBody = new MetricV1LogBody(arrayList2, mapOnWarmupCompleted, strIAuthTabCallback, str == null ? "android_native" : str, r8lambdaj_zehzutegcgnvr3afdvis3lttg.IAuthTabCallback(), (String) null, 32, (DefaultConstructorMarker) null);
        int i8 = onExtraCallback + 7;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return metricV1LogBody;
    }
}
