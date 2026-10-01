package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetMotionInteractionState implements KSerializer<Object> {
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final GetMotionInteractionState onExtraCallback = new GetMotionInteractionState();
    private static final SerialDescriptor IAuthTabCallback = ujb.onNavigationEvent("Any", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    private GetMotionInteractionState() {
    }

    static {
        int i = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = IAuthTabCallback;
        int i5 = i3 + 39;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    public void serialize(@NotNull Encoder encoder, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            ((skipVideo) encoder).onExtraCallbackWithResult(onNavigationEvent(obj));
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            ((skipVideo) encoder).onExtraCallbackWithResult(onNavigationEvent(obj));
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    private final JsonElement onNavigationEvent(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            int i2 = IAuthTabCallbackStub + 11;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return jsonNull;
        }
        if (obj instanceof JsonElement) {
            int i4 = onNavigationEvent + 103;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                return (JsonElement) obj;
            }
            throw null;
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(String.valueOf(entry.getKey()), onExtraCallback.onNavigationEvent(entry.getValue()));
                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            return new JsonObject(linkedHashMap);
        }
        if (obj instanceof Collection) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(onExtraCallback.onNavigationEvent(it.next()));
            }
            return new JsonArray(arrayList);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList2 = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList2.add(onExtraCallback.onNavigationEvent(obj2));
            }
            return new JsonArray(arrayList2);
        }
        if (obj instanceof Number) {
            int i5 = IAuthTabCallbackStub + 65;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return initRenderFinish.IAuthTabCallback((Number) obj);
            }
            initRenderFinish.IAuthTabCallback((Number) obj);
            throw null;
        }
        if (!(!(obj instanceof Boolean))) {
            return initRenderFinish.onWarmupCompleted((Boolean) obj);
        }
        if (!(obj instanceof String)) {
            return initRenderFinish.onNavigationEvent(obj.toString());
        }
        int i6 = onNavigationEvent + 105;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return initRenderFinish.onNavigationEvent((String) obj);
        }
        initRenderFinish.onNavigationEvent((String) obj);
        throw null;
    }

    public Object deserialize(@NotNull Decoder decoder) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        Object objOnExtraCallback = onExtraCallback(((setAnimationType) decoder).onWarmupCompleted());
        if (objOnExtraCallback != null) {
            return objOnExtraCallback;
        }
        int i4 = IAuthTabCallbackStub + 7;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 67;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 3;
        }
        return "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object onExtraCallback(JsonElement jsonElement) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (jsonElement instanceof JsonObject) {
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                int i2 = IAuthTabCallbackStub + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                linkedHashMap.put(entry.getKey(), onExtraCallback.onExtraCallback((JsonElement) entry.getValue()));
            }
            return linkedHashMap;
        }
        Object objValueOf = null;
        if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i4 = onNavigationEvent + 63;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(onExtraCallback.onExtraCallback((JsonElement) it.next()));
                    throw null;
                }
                arrayList.add(onExtraCallback.onExtraCallback((JsonElement) it.next()));
            }
            int i5 = onNavigationEvent + 43;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return arrayList;
        }
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        Object objOnWarmupCompleted = jsonPrimitive.onWarmupCompleted();
        if (!jsonPrimitive.onExtraCallbackWithResult()) {
            objOnWarmupCompleted = null;
        }
        if (objOnWarmupCompleted != null || (objOnWarmupCompleted = initRenderFinish.onExtraCallbackWithResult(jsonPrimitive)) != null) {
            return objOnWarmupCompleted;
        }
        Long lAccess000 = initRenderFinish.access000(jsonPrimitive);
        if (lAccess000 != null) {
            long jLongValue = lAccess000.longValue();
            if (-2147483648L > jLongValue || jLongValue > 2147483647L) {
                objValueOf = Long.valueOf(jLongValue);
            } else {
                objValueOf = Integer.valueOf((int) jLongValue);
                int i7 = IAuthTabCallbackStub + 3;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 5 % 3;
                }
            }
        }
        if (objValueOf != null) {
            return objValueOf;
        }
        Double dOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonPrimitive);
        if (dOnWarmupCompleted != null) {
            return dOnWarmupCompleted;
        }
        int i9 = IAuthTabCallbackStub + 23;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return jsonPrimitive.onWarmupCompleted();
    }
}
