package im.toss.core.tracker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import o.AUTextView;
import o.access8100;
import o.adInfo;
import o.getWrite;
import o.initRenderFinish;
import o.videoFrameChanged;
import o.wie2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RemoteProcessLogJson {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    public static final RemoteProcessLogJson onNavigationEvent = new RemoteProcessLogJson();
    private static final wie2 IAuthTabCallback = videoFrameChanged.onWarmupCompleted((wie2) null, new Function1() { // from class: im.toss.core.tracker.RemoteProcessLogJson$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i2 % 128;
            adInfo adinfo = (adInfo) obj;
            if (i2 % 2 == 0) {
                return RemoteProcessLogJson.onExtraCallback(adinfo);
            }
            RemoteProcessLogJson.onExtraCallback(adinfo);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }, 1, (Object) null);

    public static /* synthetic */ Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(adinfo);
        int i4 = onExtraCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unitOnNavigationEvent;
    }

    private RemoteProcessLogJson() {
    }

    static {
        int i = IAuthTabCallbackStub + 39;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final wie2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        wie2 wie2Var = IAuthTabCallback;
        int i4 = i2 + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return wie2Var;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final JsonObject onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onExtraCallbackWithResult + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), onNavigationEvent.onWarmupCompleted(entry.getValue()));
                throw null;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            linkedHashMap.put(entry2.getKey(), onNavigationEvent.onWarmupCompleted(entry2.getValue()));
        }
        return new JsonObject(linkedHashMap);
    }

    private final JsonElement onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 109;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        Object obj2 = null;
        if (obj instanceof JsonElement) {
            int i6 = i4 + 37;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return (JsonElement) obj;
            }
            throw null;
        }
        if (obj instanceof Boolean) {
            return initRenderFinish.onWarmupCompleted((Boolean) obj);
        }
        if (obj instanceof Number) {
            int i7 = i2 + 41;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return initRenderFinish.IAuthTabCallback((Number) obj);
            }
            initRenderFinish.IAuthTabCallback((Number) obj);
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof String) {
            int i8 = i2 + 1;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                return initRenderFinish.onNavigationEvent((String) obj);
            }
            initRenderFinish.onNavigationEvent((String) obj);
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(String.valueOf(entry.getKey()), onNavigationEvent.onWarmupCompleted(entry.getValue()));
                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            return new JsonObject(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(onNavigationEvent.onWarmupCompleted(it.next()));
            }
            JsonArray jsonArray = new JsonArray(arrayList);
            int i9 = onExtraCallbackWithResult + 51;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return jsonArray;
        }
        if (!(obj instanceof Object[])) {
            return initRenderFinish.onNavigationEvent(obj.toString());
        }
        Object[] objArr = (Object[]) obj;
        ArrayList arrayList2 = new ArrayList(objArr.length);
        for (Object obj3 : objArr) {
            int i11 = onExtraCallbackWithResult + 87;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            arrayList2.add(onNavigationEvent.onWarmupCompleted(obj3));
        }
        return new JsonArray(arrayList2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r5 instanceof kotlinx.serialization.json.JsonObject) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r5 = IAuthTabCallback((kotlinx.serialization.json.JsonObject) r5);
        r1 = im.toss.core.tracker.RemoteProcessLogJson.onExtraCallbackWithResult + 7;
        im.toss.core.tracker.RemoteProcessLogJson.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if ((r5 instanceof kotlinx.serialization.json.JsonArray) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = (java.lang.Iterable) r5;
        r0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, 10));
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r5.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r0.add(im.toss.core.tracker.RemoteProcessLogJson.onNavigationEvent.onWarmupCompleted((kotlinx.serialization.json.JsonElement) r5.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if ((r5 instanceof kotlinx.serialization.json.JsonPrimitive) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r5 = (kotlinx.serialization.json.JsonPrimitive) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if ((!r5.onExtraCallbackWithResult()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (o.initRenderFinish.onExtraCallbackWithResult(r5) == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        return o.initRenderFinish.onExtraCallbackWithResult(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (o.initRenderFinish.access000(r5) == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        return o.initRenderFinish.access000(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (o.initRenderFinish.onWarmupCompleted(r5) == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r1 = im.toss.core.tracker.RemoteProcessLogJson.onExtraCallback + 7;
        im.toss.core.tracker.RemoteProcessLogJson.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
        r5 = o.initRenderFinish.onWarmupCompleted(r5);
        r1 = im.toss.core.tracker.RemoteProcessLogJson.onExtraCallback + 1;
        im.toss.core.tracker.RemoteProcessLogJson.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if ((r1 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        r0 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        return o.initRenderFinish.onNavigationEvent(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        r5 = o.initRenderFinish.onNavigationEvent(r5);
        r1 = im.toss.core.tracker.RemoteProcessLogJson.onExtraCallbackWithResult + 17;
        im.toss.core.tracker.RemoteProcessLogJson.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof kotlinx.serialization.json.JsonNull) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r5 instanceof kotlinx.serialization.json.JsonNull) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 91;
        im.toss.core.tracker.RemoteProcessLogJson.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(JsonElement jsonElement) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
    }

    public final Map<String, Object> IAuthTabCallback(@NotNull JsonObject jsonObject) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(jsonObject.size()));
        for (Map.Entry entry : jsonObject.entrySet()) {
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put(entry.getKey(), onNavigationEvent.onWarmupCompleted((JsonElement) entry.getValue()));
        }
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return linkedHashMap;
        }
        throw null;
    }
}
