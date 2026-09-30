package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import o.LazySaveableStateHolderExternalSyntheticLambda2;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyLayoutPagerKtExternalSyntheticLambda3 {
    private static final Class<?> onExtraCallbackWithResult = onNavigationEvent();
    private static final PagerKtExternalSyntheticLambda2<?, ?> onExtraCallback = onWarmupCompleted();
    private static final PagerKtExternalSyntheticLambda2<?, ?> onWarmupCompleted = new PagerKtExternalSyntheticLambda8();

    public static void onExtraCallbackWithResult(Class<?> cls) {
        Class<?> cls2;
        if (!PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0.class.isAssignableFrom(cls) && !DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult && (cls2 = onExtraCallbackWithResult) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void IAuthTabCallback(int i2, List<Double> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallback(i2, list, z);
    }

    public static void asBinder(int i2, List<Float> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.asBinder(i2, list, z);
    }

    public static void IAuthTabCallbackStub(int i2, List<Long> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallbackDefault(i2, list, z);
    }

    public static void IAuthTabCallbackStubProxy(int i2, List<Long> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.writeTypedObject(i2, list, z);
    }

    public static void access100(int i2, List<Long> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.getInterfaceDescriptor(i2, list, z);
    }

    public static void onWarmupCompleted(int i2, List<Long> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(i2, list, z);
    }

    public static void onTransact(int i2, List<Long> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onTransact(i2, list, z);
    }

    public static void asInterface(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.asInterface(i2, list, z);
    }

    public static void getInterfaceDescriptor(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallbackStubProxy(i2, list, z);
    }

    public static void IAuthTabCallback_Parcel(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.access000(i2, list, z);
    }

    public static void onNavigationEvent(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(i2, list, z);
    }

    public static void IAuthTabCallbackDefault(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.IAuthTabCallbackStub(i2, list, z);
    }

    public static void onExtraCallbackWithResult(int i2, List<Integer> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(i2, list, z);
    }

    public static void onExtraCallback(int i2, List<Boolean> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onNavigationEvent(i2, list, z);
    }

    public static void onExtraCallback(int i2, List<String> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onExtraCallbackWithResult(i2, list);
    }

    public static void onWarmupCompleted(int i2, List<LazyLayoutKtExternalSyntheticLambda3> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(i2, list);
    }

    public static void onExtraCallbackWithResult(int i2, List<?> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onExtraCallback(i2, list, pagerDefaultsExternalSyntheticLambda0);
    }

    public static void onExtraCallback(int i2, List<?> list, PagerMeasureKtExternalSyntheticLambda3 pagerMeasureKtExternalSyntheticLambda3, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        pagerMeasureKtExternalSyntheticLambda3.onWarmupCompleted(i2, list, pagerDefaultsExternalSyntheticLambda0);
    }

    static int IAuthTabCallbackStub(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LazyStaggeredGridIntervalContentExternalSyntheticLambda1)) {
            int iIAuthTabCallback = 0;
            while (i2 < size) {
                iIAuthTabCallback += CodedOutputStream.IAuthTabCallback(list.get(i2).longValue());
                i2++;
            }
            return iIAuthTabCallback;
        }
        LazyStaggeredGridIntervalContentExternalSyntheticLambda1 lazyStaggeredGridIntervalContentExternalSyntheticLambda1 = (LazyStaggeredGridIntervalContentExternalSyntheticLambda1) list;
        int iIAuthTabCallback2 = 0;
        while (i2 < size) {
            iIAuthTabCallback2 += CodedOutputStream.IAuthTabCallback(lazyStaggeredGridIntervalContentExternalSyntheticLambda1.onWarmupCompleted(i2));
            i2++;
        }
        return iIAuthTabCallback2;
    }

    static int IAuthTabCallbackStub(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iIAuthTabCallbackStub = IAuthTabCallbackStub(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackStub);
        }
        return iIAuthTabCallbackStub + (list.size() * CodedOutputStream.asInterface(i2));
    }

    static int asInterface(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LazyStaggeredGridIntervalContentExternalSyntheticLambda1)) {
            int iOnExtraCallback = 0;
            while (i2 < size) {
                iOnExtraCallback += CodedOutputStream.onExtraCallback(list.get(i2).longValue());
                i2++;
            }
            return iOnExtraCallback;
        }
        LazyStaggeredGridIntervalContentExternalSyntheticLambda1 lazyStaggeredGridIntervalContentExternalSyntheticLambda1 = (LazyStaggeredGridIntervalContentExternalSyntheticLambda1) list;
        int iOnExtraCallback2 = 0;
        while (i2 < size) {
            iOnExtraCallback2 += CodedOutputStream.onExtraCallback(lazyStaggeredGridIntervalContentExternalSyntheticLambda1.onWarmupCompleted(i2));
            i2++;
        }
        return iOnExtraCallback2;
    }

    static int IAuthTabCallbackDefault(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAsInterface = asInterface(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iAsInterface);
        }
        return iAsInterface + (size * CodedOutputStream.asInterface(i2));
    }

    static int onTransact(List<Long> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LazyStaggeredGridIntervalContentExternalSyntheticLambda1)) {
            int iOnExtraCallbackWithResult = 0;
            while (i2 < size) {
                iOnExtraCallbackWithResult += CodedOutputStream.onExtraCallbackWithResult(list.get(i2).longValue());
                i2++;
            }
            return iOnExtraCallbackWithResult;
        }
        LazyStaggeredGridIntervalContentExternalSyntheticLambda1 lazyStaggeredGridIntervalContentExternalSyntheticLambda1 = (LazyStaggeredGridIntervalContentExternalSyntheticLambda1) list;
        int iOnExtraCallbackWithResult2 = 0;
        while (i2 < size) {
            iOnExtraCallbackWithResult2 += CodedOutputStream.onExtraCallbackWithResult(lazyStaggeredGridIntervalContentExternalSyntheticLambda1.onWarmupCompleted(i2));
            i2++;
        }
        return iOnExtraCallbackWithResult2;
    }

    static int asInterface(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOnTransact = onTransact(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iOnTransact);
        }
        return iOnTransact + (size * CodedOutputStream.asInterface(i2));
    }

    static int onExtraCallbackWithResult(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            int iOnExtraCallbackWithResult = 0;
            while (i2 < size) {
                iOnExtraCallbackWithResult += CodedOutputStream.onExtraCallbackWithResult(list.get(i2).intValue());
                i2++;
            }
            return iOnExtraCallbackWithResult;
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) list;
        int iOnExtraCallbackWithResult2 = 0;
        while (i2 < size) {
            iOnExtraCallbackWithResult2 += CodedOutputStream.onExtraCallbackWithResult(nearestRangeKeyIndexMapExternalSyntheticLambda0.onWarmupCompleted(i2));
            i2++;
        }
        return iOnExtraCallbackWithResult2;
    }

    static int onExtraCallback(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iOnExtraCallbackWithResult);
        }
        return iOnExtraCallbackWithResult + (size * CodedOutputStream.asInterface(i2));
    }

    static int onExtraCallback(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            int iOnNavigationEvent = 0;
            while (i2 < size) {
                iOnNavigationEvent += CodedOutputStream.onNavigationEvent(list.get(i2).intValue());
                i2++;
            }
            return iOnNavigationEvent;
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) list;
        int iOnNavigationEvent2 = 0;
        while (i2 < size) {
            iOnNavigationEvent2 += CodedOutputStream.onNavigationEvent(nearestRangeKeyIndexMapExternalSyntheticLambda0.onWarmupCompleted(i2));
            i2++;
        }
        return iOnNavigationEvent2;
    }

    static int onWarmupCompleted(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOnExtraCallback = onExtraCallback(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iOnExtraCallback);
        }
        return iOnExtraCallback + (size * CodedOutputStream.asInterface(i2));
    }

    static int asBinder(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            int iOnTransact = 0;
            while (i2 < size) {
                iOnTransact += CodedOutputStream.onTransact(list.get(i2).intValue());
                i2++;
            }
            return iOnTransact;
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) list;
        int iOnTransact2 = 0;
        while (i2 < size) {
            iOnTransact2 += CodedOutputStream.onTransact(nearestRangeKeyIndexMapExternalSyntheticLambda0.onWarmupCompleted(i2));
            i2++;
        }
        return iOnTransact2;
    }

    static int asBinder(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAsBinder = asBinder(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iAsBinder);
        }
        return iAsBinder + (size * CodedOutputStream.asInterface(i2));
    }

    static int IAuthTabCallbackDefault(List<Integer> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NearestRangeKeyIndexMapExternalSyntheticLambda0)) {
            int iAsBinder = 0;
            while (i2 < size) {
                iAsBinder += CodedOutputStream.asBinder(list.get(i2).intValue());
                i2++;
            }
            return iAsBinder;
        }
        NearestRangeKeyIndexMapExternalSyntheticLambda0 nearestRangeKeyIndexMapExternalSyntheticLambda0 = (NearestRangeKeyIndexMapExternalSyntheticLambda0) list;
        int iAsBinder2 = 0;
        while (i2 < size) {
            iAsBinder2 += CodedOutputStream.asBinder(nearestRangeKeyIndexMapExternalSyntheticLambda0.onWarmupCompleted(i2));
            i2++;
        }
        return iAsBinder2;
    }

    static int onTransact(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(list);
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(iIAuthTabCallbackDefault);
        }
        return iIAuthTabCallbackDefault + (size * CodedOutputStream.asInterface(i2));
    }

    static int IAuthTabCallback(List<?> list) {
        return list.size() << 2;
    }

    static int onExtraCallbackWithResult(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(size << 2);
        }
        return size * CodedOutputStream.onExtraCallback(i2, 0);
    }

    static int onWarmupCompleted(List<?> list) {
        return list.size() << 3;
    }

    static int onNavigationEvent(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(size << 3);
        }
        return size * CodedOutputStream.onExtraCallback(i2, 0L);
    }

    static int onNavigationEvent(List<?> list) {
        return list.size();
    }

    static int IAuthTabCallback(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(size);
        }
        return size * CodedOutputStream.IAuthTabCallback(i2, true);
    }

    static int onExtraCallback(int i2, List<?> list) {
        int iOnExtraCallbackWithResult;
        int iOnExtraCallbackWithResult2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iAsInterface = CodedOutputStream.asInterface(i2) * size;
        if (!(list instanceof LazyStaggeredGridDslKtExternalSyntheticLambda0)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    iOnExtraCallbackWithResult = CodedOutputStream.IAuthTabCallback((LazyLayoutKtExternalSyntheticLambda3) obj);
                } else {
                    iOnExtraCallbackWithResult = CodedOutputStream.onExtraCallbackWithResult((String) obj);
                }
                iAsInterface += iOnExtraCallbackWithResult;
                i3++;
            }
            return iAsInterface;
        }
        LazyStaggeredGridDslKtExternalSyntheticLambda0 lazyStaggeredGridDslKtExternalSyntheticLambda0 = (LazyStaggeredGridDslKtExternalSyntheticLambda0) list;
        while (i3 < size) {
            Object objOnNavigationEvent = lazyStaggeredGridDslKtExternalSyntheticLambda0.onNavigationEvent(i3);
            if (objOnNavigationEvent instanceof LazyLayoutKtExternalSyntheticLambda3) {
                iOnExtraCallbackWithResult2 = CodedOutputStream.IAuthTabCallback((LazyLayoutKtExternalSyntheticLambda3) objOnNavigationEvent);
            } else {
                iOnExtraCallbackWithResult2 = CodedOutputStream.onExtraCallbackWithResult((String) objOnNavigationEvent);
            }
            iAsInterface += iOnExtraCallbackWithResult2;
            i3++;
        }
        return iAsInterface;
    }

    static int onWarmupCompleted(int i2, Object obj, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) {
        if (obj instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1) {
            return CodedOutputStream.onExtraCallbackWithResult(i2, (PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1) obj);
        }
        return CodedOutputStream.onExtraCallback(i2, (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj, pagerDefaultsExternalSyntheticLambda0);
    }

    static int onExtraCallback(int i2, List<?> list, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) {
        int iIAuthTabCallback;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAsInterface = CodedOutputStream.asInterface(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1) {
                iIAuthTabCallback = CodedOutputStream.onWarmupCompleted((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1) obj);
            } else {
                iIAuthTabCallback = CodedOutputStream.IAuthTabCallback((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj, pagerDefaultsExternalSyntheticLambda0);
            }
            iAsInterface += iIAuthTabCallback;
        }
        return iAsInterface;
    }

    static int onExtraCallbackWithResult(int i2, List<LazyLayoutKtExternalSyntheticLambda3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iAsInterface = size * CodedOutputStream.asInterface(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iAsInterface += CodedOutputStream.IAuthTabCallback(list.get(i3));
        }
        return iAsInterface;
    }

    static int onWarmupCompleted(int i2, List<LazyStaggeredGridMeasureKtExternalSyntheticLambda1> list, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOnExtraCallbackWithResult = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iOnExtraCallbackWithResult += CodedOutputStream.onExtraCallbackWithResult(i2, list.get(i3), pagerDefaultsExternalSyntheticLambda0);
        }
        return iOnExtraCallbackWithResult;
    }

    public static PagerKtExternalSyntheticLambda2<?, ?> IAuthTabCallback() {
        return onExtraCallback;
    }

    public static PagerKtExternalSyntheticLambda2<?, ?> onExtraCallbackWithResult() {
        return onWarmupCompleted;
    }

    private static PagerKtExternalSyntheticLambda2<?, ?> onWarmupCompleted() {
        try {
            Class<?> clsOnExtraCallback = onExtraCallback();
            if (clsOnExtraCallback == null) {
                return null;
            }
            return (PagerKtExternalSyntheticLambda2) clsOnExtraCallback.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> onNavigationEvent() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> onExtraCallback() {
        if (DefaultPagerStateExternalSyntheticLambda2.onExtraCallbackWithResult) {
            return null;
        }
        try {
            return Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean onExtraCallbackWithResult(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void onExtraCallback(LazyStaggeredGridIntervalContentExternalSyntheticLambda3 lazyStaggeredGridIntervalContentExternalSyntheticLambda3, T t, T t2, long j) {
        PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(t, j, lazyStaggeredGridIntervalContentExternalSyntheticLambda3.IAuthTabCallback(PagerKtExternalSyntheticLambda5.asBinder(t, j), PagerKtExternalSyntheticLambda5.asBinder(t2, j)));
    }

    static <T, FT extends LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<FT>> void onNavigationEvent(LazyLayoutSemanticsModifierNodeExternalSyntheticLambda4<FT> lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4, T t, T t2) {
        LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback = lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.IAuthTabCallback(t2);
        if (lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.asInterface()) {
            return;
        }
        lazyLayoutSemanticsModifierNodeExternalSyntheticLambda4.onExtraCallback(t).onNavigationEvent(lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback);
    }

    static <T, UT, UB> void onWarmupCompleted(PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2, T t, T t2) {
        pagerKtExternalSyntheticLambda2.onExtraCallback(t, pagerKtExternalSyntheticLambda2.onExtraCallbackWithResult(pagerKtExternalSyntheticLambda2.onWarmupCompleted(t), pagerKtExternalSyntheticLambda2.onWarmupCompleted(t2)));
    }

    static <UT, UB> UB onWarmupCompleted(Object obj, int i2, List<Integer> list, LazySaveableStateHolderKtExternalSyntheticLambda1.onExtraCallback<?> onextracallback, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2) {
        if (onextracallback == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = list.get(i4);
                int iIntValue = num.intValue();
                if (onextracallback.onWarmupCompleted(iIntValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    ub = (UB) IAuthTabCallback(obj, i2, iIntValue, ub, pagerKtExternalSyntheticLambda2);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (onextracallback.onWarmupCompleted(iIntValue2) == null) {
                ub = (UB) IAuthTabCallback(obj, i2, iIntValue2, ub, pagerKtExternalSyntheticLambda2);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB onWarmupCompleted(Object obj, int i2, List<Integer> list, LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent onnavigationevent, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2) {
        if (onnavigationevent == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Integer num = list.get(i4);
                int iIntValue = num.intValue();
                if (onnavigationevent.onExtraCallbackWithResult(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, num);
                    }
                    i3++;
                } else {
                    ub = (UB) IAuthTabCallback(obj, i2, iIntValue, ub, pagerKtExternalSyntheticLambda2);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!onnavigationevent.onExtraCallbackWithResult(iIntValue2)) {
                ub = (UB) IAuthTabCallback(obj, i2, iIntValue2, ub, pagerKtExternalSyntheticLambda2);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB IAuthTabCallback(Object obj, int i2, int i3, UB ub, PagerKtExternalSyntheticLambda2<UT, UB> pagerKtExternalSyntheticLambda2) {
        if (ub == null) {
            ub = pagerKtExternalSyntheticLambda2.onNavigationEvent(obj);
        }
        pagerKtExternalSyntheticLambda2.onWarmupCompleted(ub, i2, i3);
        return ub;
    }
}
