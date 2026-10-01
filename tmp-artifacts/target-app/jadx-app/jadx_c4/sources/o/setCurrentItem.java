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
public final class setCurrentItem implements KSerializer<Object> {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private static int onExtraCallbackWithResult;
    public static final setCurrentItem onExtraCallback = new setCurrentItem();
    private static final SerialDescriptor onNavigationEvent = ujb.onNavigationEvent("Any", new SerialDescriptor[0], (Function1) null, 4, (Object) null);
    public static final int onWarmupCompleted = 8;

    private setCurrentItem() {
    }

    static {
        int i = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 55 / 0;
        }
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = onNavigationEvent;
        int i5 = i2 + 51;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    public void serialize(@NotNull Encoder encoder, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            ((skipVideo) encoder).onExtraCallbackWithResult(onNavigationEvent(obj));
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(obj, "");
            ((skipVideo) encoder).onExtraCallbackWithResult(onNavigationEvent(obj));
        }
        int i4 = IAuthTabCallbackDefault + 101;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final JsonElement onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof JsonElement) {
            return (JsonElement) obj;
        }
        if (obj instanceof Map) {
            Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                int i4 = IAuthTabCallbackDefault + 13;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(String.valueOf(entry.getKey()), onExtraCallback.onNavigationEvent(entry.getValue()));
                linkedHashMap.put(pairIAuthTabCallback.getFirst(), pairIAuthTabCallback.getSecond());
            }
            JsonObject jsonObject = new JsonObject(linkedHashMap);
            int i6 = asInterface + 31;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return jsonObject;
        }
        if (obj instanceof Collection) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i8 = IAuthTabCallbackDefault + 7;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    arrayList.add(onExtraCallback.onNavigationEvent(it.next()));
                    int i9 = 55 / 0;
                } else {
                    arrayList.add(onExtraCallback.onNavigationEvent(it.next()));
                }
            }
            return new JsonArray(arrayList);
        }
        if (!(obj instanceof Object[])) {
            if (!(obj instanceof Number)) {
                return obj instanceof Boolean ? initRenderFinish.onWarmupCompleted((Boolean) obj) : obj instanceof String ? initRenderFinish.onNavigationEvent((String) obj) : initRenderFinish.onNavigationEvent(obj.toString());
            }
            int i10 = i2 + 59;
            asInterface = i10 % 128;
            if (i10 % 2 == 0) {
                return initRenderFinish.IAuthTabCallback((Number) obj);
            }
            initRenderFinish.IAuthTabCallback((Number) obj);
            throw null;
        }
        Object[] objArr = (Object[]) obj;
        ArrayList arrayList2 = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            int i11 = asInterface + 71;
            IAuthTabCallbackDefault = i11 % 128;
            int i12 = i11 % 2;
            arrayList2.add(onExtraCallback.onNavigationEvent(obj2));
        }
        return new JsonArray(arrayList2);
    }

    public Object deserialize(@NotNull Decoder decoder) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            IAuthTabCallback(((setAnimationType) decoder).onWarmupCompleted());
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        Object objIAuthTabCallback = IAuthTabCallback(((setAnimationType) decoder).onWarmupCompleted());
        if (objIAuthTabCallback != null) {
            return objIAuthTabCallback;
        }
        int i3 = IAuthTabCallbackDefault + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object IAuthTabCallback(JsonElement jsonElement) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (jsonElement instanceof JsonObject) {
            Map map = (Map) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
            int i2 = IAuthTabCallbackDefault + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), onExtraCallback.IAuthTabCallback((JsonElement) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (jsonElement instanceof JsonArray) {
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            int i4 = asInterface + 31;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = asInterface + 119;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(onExtraCallback.IAuthTabCallback((JsonElement) it.next()));
                    int i7 = 71 / 0;
                } else {
                    arrayList.add(onExtraCallback.IAuthTabCallback((JsonElement) it.next()));
                }
            }
            return arrayList;
        }
        Object objValueOf = null;
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = IAuthTabCallbackDefault + 101;
        asInterface = i8 % 128;
        if (i8 % 2 != 0) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            jsonPrimitive.onWarmupCompleted();
            jsonPrimitive.onExtraCallbackWithResult();
            throw null;
        }
        JsonPrimitive jsonPrimitive2 = (JsonPrimitive) jsonElement;
        Object objOnWarmupCompleted = jsonPrimitive2.onWarmupCompleted();
        if (!jsonPrimitive2.onExtraCallbackWithResult()) {
            objOnWarmupCompleted = null;
        }
        if (objOnWarmupCompleted != null || (objOnWarmupCompleted = initRenderFinish.onExtraCallbackWithResult(jsonPrimitive2)) != null) {
            return objOnWarmupCompleted;
        }
        Long lAccess000 = initRenderFinish.access000(jsonPrimitive2);
        if (lAccess000 != null) {
            long jLongValue = lAccess000.longValue();
            if (-2147483648L > jLongValue || jLongValue > 2147483647L) {
                objValueOf = Long.valueOf(jLongValue);
            } else {
                int i9 = IAuthTabCallbackDefault + 47;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                objValueOf = Integer.valueOf((int) jLongValue);
            }
        }
        if (objValueOf != null) {
            return objValueOf;
        }
        Double dOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonPrimitive2);
        if (dOnWarmupCompleted != null) {
            return dOnWarmupCompleted;
        }
        int i11 = IAuthTabCallbackDefault + 79;
        asInterface = i11 % 128;
        if (i11 % 2 == 0) {
            return jsonPrimitive2.onWarmupCompleted();
        }
        int i12 = 2 / 0;
        return jsonPrimitive2.onWarmupCompleted();
    }
}
