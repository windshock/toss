package im.toss.rn.toss.core.common.bridge;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.access8100;
import o.getWrite;
import o.onPreviewFrame;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeJsBridgeKt {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Object IAuthTabCallback(@NotNull onPreviewFrame onpreviewframe, @NotNull String str, @NotNull Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        Object obj;
        Double dValueOf;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onpreviewframe, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Object obj2 = null;
        if (Intrinsics.areEqual(onpreviewframe, onPreviewFrame.onWarmupCompleted.onExtraCallbackWithResult)) {
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallback) {
            return Boolean.valueOf(((onPreviewFrame.onExtraCallback) onpreviewframe).IAuthTabCallback());
        }
        if (onpreviewframe instanceof onPreviewFrame.onExtraCallbackWithResult) {
            return Integer.valueOf(((onPreviewFrame.onExtraCallbackWithResult) onpreviewframe).IAuthTabCallback());
        }
        if (onpreviewframe instanceof onPreviewFrame.IAuthTabCallback) {
            int i4 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                dValueOf = Double.valueOf(((onPreviewFrame.IAuthTabCallback) onpreviewframe).onWarmupCompleted());
                int i5 = 26 / 0;
            } else {
                dValueOf = Double.valueOf(((onPreviewFrame.IAuthTabCallback) onpreviewframe).onWarmupCompleted());
            }
            int i6 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return dValueOf;
            }
            obj2.hashCode();
            throw null;
        }
        if (onpreviewframe instanceof onPreviewFrame.IAuthTabCallbackDefault) {
            return ((onPreviewFrame.IAuthTabCallbackDefault) onpreviewframe).onExtraCallbackWithResult();
        }
        if (!(onpreviewframe instanceof onPreviewFrame.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(JsonParser.parseString(((onPreviewFrame.onNavigationEvent) onpreviewframe).onExtraCallback()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i7 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 8 / 0;
            }
            obj = null;
        }
        JsonElement jsonElement = (JsonElement) obj;
        if (jsonElement == null) {
            return null;
        }
        int i9 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i9 % 128;
        if (i9 % 2 != 0) {
            return onWarmupCompleted(jsonElement, str, map);
        }
        onWarmupCompleted(jsonElement, str, map);
        obj2.hashCode();
        throw null;
    }

    public static final Object onWarmupCompleted(@NotNull JsonElement jsonElement, @NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (jsonElement instanceof JsonNull) {
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        if (!(!(jsonElement instanceof JsonPrimitive))) {
            return onExtraCallback((JsonPrimitive) jsonElement, str, map);
        }
        if (jsonElement instanceof JsonObject) {
            return onExtraCallbackWithResult((JsonObject) jsonElement, str, map);
        }
        if (!(jsonElement instanceof JsonArray)) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, "unknown_json_element_type", (Throwable) null, access8100.IAuthTabCallback(map, getWrite.IAuthTabCallback("elementType", jsonElement.getClass().getSimpleName())), 4, (Object) null);
            return null;
        }
        WritableArray writableArrayOnWarmupCompleted = onWarmupCompleted((JsonArray) jsonElement, str, map);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return writableArrayOnWarmupCompleted;
    }

    private static final Object onExtraCallback(JsonPrimitive jsonPrimitive, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (jsonPrimitive.isString()) {
            int i4 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String asString = jsonPrimitive.getAsString();
            int i6 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 14 / 0;
            }
            return asString;
        }
        if (!(!jsonPrimitive.isBoolean())) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (!jsonPrimitive.isNumber()) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, "unknown_json_primitive_kind", (Throwable) null, access8100.IAuthTabCallback(map, getWrite.IAuthTabCallback("raw", jsonPrimitive.toString())), 4, (Object) null);
            return null;
        }
        int i8 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return Double.valueOf(jsonPrimitive.getAsNumber().doubleValue());
    }

    private static final WritableMap onExtraCallbackWithResult(JsonObject jsonObject, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Set<Map.Entry> setEntrySet = jsonObject.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        for (Map.Entry entry : setEntrySet) {
            int i4 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNull(entry);
            String str2 = (String) entry.getKey();
            JsonElement jsonElement = (JsonElement) entry.getValue();
            Intrinsics.checkNotNull(jsonElement);
            Object objOnWarmupCompleted = onWarmupCompleted(jsonElement, str, map);
            Intrinsics.checkNotNull(str2);
            onExtraCallback(writableNativeMap, str2, objOnWarmupCompleted);
        }
        return writableNativeMap;
    }

    private static final WritableArray onWarmupCompleted(JsonArray jsonArray, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                JsonElement jsonElement = (JsonElement) it.next();
                Intrinsics.checkNotNull(jsonElement);
                onExtraCallback(writableNativeArray, onWarmupCompleted(jsonElement, str, map));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            JsonElement jsonElement2 = (JsonElement) it.next();
            Intrinsics.checkNotNull(jsonElement2);
            onExtraCallback(writableNativeArray, onWarmupCompleted(jsonElement2, str, map));
            int i3 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        return writableNativeArray;
    }

    private static final void onExtraCallback(WritableNativeMap writableNativeMap, String str, Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            writableNativeMap.putNull(str);
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (obj instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            writableNativeMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            writableNativeMap.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            int i6 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            writableNativeMap.putString(str, (String) obj);
            int i8 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        if (obj instanceof WritableMap) {
            int i10 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            writableNativeMap.putMap(str, (ReadableMap) obj);
            return;
        }
        if (obj instanceof WritableArray) {
            writableNativeMap.putArray(str, (ReadableArray) obj);
        } else {
            writableNativeMap.putNull(str);
        }
    }

    private static final void onExtraCallback(WritableNativeArray writableNativeArray, Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            int i2 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            writableNativeArray.pushNull();
            return;
        }
        if (obj instanceof Boolean) {
            int i4 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            writableNativeArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Double) {
            writableNativeArray.pushDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            writableNativeArray.pushString((String) obj);
            int i6 = onExtraCallbackWithResult + 117;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof WritableMap)) {
            if (obj instanceof WritableArray) {
                writableNativeArray.pushArray((ReadableArray) obj);
                return;
            } else {
                writableNativeArray.pushNull();
                return;
            }
        }
        int i7 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            writableNativeArray.pushMap((ReadableMap) obj);
        } else {
            writableNativeArray.pushMap((ReadableMap) obj);
            int i8 = 94 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[PHI: r2 r3
      0x0060: PHI (r2v13 java.lang.Object) = (r2v8 java.lang.Object), (r2v18 java.lang.Object) binds: [B:11:0x005e, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0060: PHI (r3v4 java.lang.Object) = (r3v1 java.lang.Object), (r3v5 java.lang.Object) binds: [B:11:0x005e, B:8:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<?, ?> onNavigationEvent(@NotNull Map<?, ?> map, @NotNull String str, @NotNull Map<String, ? extends Object> map2) {
        Object key;
        Object value;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Map.Entry entry = (Map.Entry) it.next();
                key = entry.getKey();
                value = entry.getValue();
                int i3 = 65 / 0;
                if (value instanceof JsonElement) {
                    value = onWarmupCompleted((JsonElement) value, str, map2);
                }
            } else {
                Map.Entry entry2 = (Map.Entry) it.next();
                key = entry2.getKey();
                value = entry2.getValue();
                if (value instanceof JsonElement) {
                }
            }
            linkedHashMap.put(key, value);
            int i4 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return linkedHashMap;
    }
}
