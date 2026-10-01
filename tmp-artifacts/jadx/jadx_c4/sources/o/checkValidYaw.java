package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AUTextView;
import o.adInfo;
import o.checkValidYaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkValidYaw {
    private static int IAuthTabCallback = 1;
    private static final wie2 onExtraCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.core.tracker.payload.LogPayloadUtilsKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            adInfo adinfo = (adInfo) obj;
            if (i2 % 2 != 0) {
                return checkValidYaw.onNavigationEvent(adinfo);
            }
            checkValidYaw.onNavigationEvent(adinfo);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }, 1, (Object) null);
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(adinfo);
        int i4 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    static {
        int i = IAuthTabCallback + 75;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static final wie2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        wie2 wie2Var = onExtraCallback;
        int i5 = i3 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return wie2Var;
    }

    private static final Unit IAuthTabCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<String, Object> onExtraCallback(@Nullable Map<String, ? extends Object> map, @NotNull String str) {
        LinkedHashMap linkedHashMap;
        Object value;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (map != null) {
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Object> mapOnExtraCallback = onExtraCallback(map);
            if (mapOnExtraCallback != null) {
                linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(mapOnExtraCallback.size()));
                Iterator<T> it = mapOnExtraCallback.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if (entry.getValue() instanceof Number) {
                        value = entry.getValue().toString();
                        int i4 = onWarmupCompleted + 49;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        value = entry.getValue();
                    }
                    linkedHashMap.put(key, value);
                }
            } else {
                linkedHashMap = null;
            }
        }
        if (Intrinsics.areEqual(str, "3")) {
            int i6 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (onWarmupCompleted(map)) {
                int i8 = onWarmupCompleted + 27;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                if (linkedHashMap == null) {
                    return null;
                }
                Map<String, Object> mapIAuthTabCallback = getInstallVersion.IAuthTabCallback(linkedHashMap);
                int i10 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    return mapIAuthTabCallback;
                }
                obj.hashCode();
                throw null;
            }
        }
        return linkedHashMap;
    }

    private static final boolean onWarmupCompleted(Map<String, ? extends Object> map) {
        Boolean bool;
        int i = 2 % 2;
        if (map == null || map.isEmpty()) {
            return false;
        }
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = map.get("from_rn");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        } else {
            bool = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2)) {
            Object obj2 = map.get("from_web");
            if (!Intrinsics.areEqual(obj2 instanceof Boolean ? (Boolean) obj2 : null, bool2)) {
                return false;
            }
        }
        return true;
    }

    private static final Map<String, Object> onExtraCallback(Map<String, ? extends Object> map) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Map) {
                    value = onExtraCallback((Map) value);
                } else if (value instanceof List) {
                    int i4 = onExtraCallbackWithResult + 33;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        value = onWarmupCompleted((List<? extends Object>) value);
                        int i5 = 17 / 0;
                    } else {
                        value = onWarmupCompleted((List<? extends Object>) value);
                    }
                }
                pairIAuthTabCallback = getWrite.IAuthTabCallback(key, value);
            } else {
                pairIAuthTabCallback = null;
            }
            if (pairIAuthTabCallback != null) {
                int i6 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(pairIAuthTabCallback);
            }
        }
        return access8100.onExtraCallbackWithResult(arrayList);
    }

    private static final List<?> onWarmupCompleted(List<? extends Object> list) {
        int i = 2 % 2;
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = it.next() instanceof Map;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object next = it.next();
            if (next instanceof Map) {
                Intrinsics.checkNotNull(next, "");
                next = onExtraCallback((Map) next);
            } else if (!(true ^ (next instanceof List))) {
                int i3 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                next = onWarmupCompleted((List<? extends Object>) next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
