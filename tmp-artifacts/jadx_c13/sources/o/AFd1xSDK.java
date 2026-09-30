package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1xSDK {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public static final JsonObject IAuthTabCallback(@NotNull String str) {
        Object objM31constructorimpl;
        Object objM31constructorimpl2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.isBlank(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(EndMotionInteraction.onExtraCallback().onExtraCallback(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
            try {
                Result.Companion companion3 = Result.Companion;
                wie2 wie2VarOnExtraCallback = EndMotionInteraction.onExtraCallback();
                wie2VarOnExtraCallback.onExtraCallback();
                objM31constructorimpl2 = Result.m31constructorimpl(EndMotionInteraction.onExtraCallback().onExtraCallback(((JsonPrimitive) wie2VarOnExtraCallback.onExtraCallback(JsonPrimitive.Companion.serializer(), str)).onWarmupCompleted()));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                objM31constructorimpl2 = Result.m31constructorimpl(ResultKt.createFailure(th2));
            }
            objM31constructorimpl = objM31constructorimpl2;
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            objM31constructorimpl = null;
        }
        JsonElement jsonElement = (JsonElement) objM31constructorimpl;
        if (jsonElement != null && (jsonElement instanceof JsonObject)) {
            return (JsonObject) jsonElement;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<String, String> onExtraCallback(@NotNull String str) {
        JsonPrimitive jsonPrimitive;
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback(str);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObjectIAuthTabCallback = IAuthTabCallback(str);
        if (jsonObjectIAuthTabCallback == null) {
            return access8000.IAuthTabCallback();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8200.onNavigationEvent(jsonObjectIAuthTabCallback.size()));
        Iterator<T> it = jsonObjectIAuthTabCallback.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(!(value instanceof JsonPrimitive))) {
                int i3 = onExtraCallback + 45;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                jsonPrimitive = (JsonPrimitive) value;
            } else {
                int i5 = onNavigationEvent + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                int i7 = onExtraCallback + 75;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                string = jsonPrimitive.onWarmupCompleted();
                if (string == null) {
                    string = ((JsonElement) entry.getValue()).toString();
                    int i9 = onNavigationEvent + 47;
                    onExtraCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 2 % 4;
                    }
                }
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }
}
