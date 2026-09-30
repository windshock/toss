package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getEmbedViewManager {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = (~(i7 | i8 | i9)) | (~(i6 | i));
        int i11 = ~(i7 | i9);
        int i12 = i6 | i11;
        int i13 = (~(i | i4)) | i11 | (~(i8 | i4));
        int i14 = i4 + i6 + i2 + (296844165 * i5) + (1729652556 * i3);
        int i15 = i14 * i14;
        int i16 = ((i4 * 599922083) - 580124672) + (599922083 * i6) + (2088888926 * i10) + ((-117189444) * i12) + ((-2088888926) * i13) + ((-1606156288) * i2) + ((-279707648) * i5) + ((-265289728) * i3) + (2117271552 * i15);
        int i17 = (i4 * (-1181628991)) + 1322814002 + (i6 * (-1181628991)) + (i10 * (-118)) + (i12 * (-236)) + (i13 * 118) + (i2 * (-1181629109)) + (i5 * (-698251017)) + (i3 * 1773125444) + (i15 * 938541056);
        if (i16 + (i17 * i17 * (-109772800)) == 1) {
            return IAuthTabCallback(objArr);
        }
        Object obj = objArr[0];
        int i18 = 2 % 2;
        int i19 = onNavigationEvent + 61;
        IAuthTabCallback = i19 % 128;
        int i20 = i19 % 2;
        JsonObject jsonObjectIAuthTabCallback = IAuthTabCallback(obj);
        int i21 = onNavigationEvent + 21;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        return jsonObjectIAuthTabCallback;
    }

    @Deprecated
    public static final <T> String onWarmupCompleted(T t) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String json = ALCEyeBlink.onExtraCallback().toJson(t);
        Intrinsics.checkNotNullExpressionValue(json, "");
        int i4 = IAuthTabCallback + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return json;
    }

    @Deprecated
    public static final <T> String onNavigationEvent(T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                return onWarmupCompleted(t);
            }
            onWarmupCompleted(t);
            obj.hashCode();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated
    public static final <T> JsonObject IAuthTabCallback(T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            JsonElement string = JsonParser.parseString(ALCEyeBlink.onExtraCallback().toJson(t));
            if (string.isJsonNull()) {
                return new JsonObject();
            }
            JsonObject asJsonObject = string.getAsJsonObject();
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return asJsonObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated
    public static final String onExtraCallbackWithResult(@NotNull JsonObject jsonObject, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            int i2 = IAuthTabCallback + 125;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                boolean z = jsonElement instanceof JsonPrimitive;
                throw null;
            }
            if (!(jsonElement instanceof JsonPrimitive)) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                int i4 = i3 + 59;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                String asString = jsonElement.getAsString();
                if (asString != null) {
                    int i6 = IAuthTabCallback + 93;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    return asString;
                }
            }
        }
        return "";
    }

    @Deprecated
    public static final boolean onNavigationEvent(@NotNull JsonObject jsonObject, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null) {
            return false;
        }
        int i4 = IAuthTabCallback + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (!(jsonElement instanceof JsonPrimitive)) {
            jsonElement = null;
        }
        if (jsonElement == null || !jsonElement.getAsBoolean()) {
            return false;
        }
        int i6 = IAuthTabCallback + 109;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        JsonObject jsonObject = (JsonObject) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                boolean z = jsonElement instanceof JsonPrimitive;
                obj.hashCode();
                throw null;
            }
            if (!(jsonElement instanceof JsonPrimitive)) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                long asLong = jsonElement.getAsLong();
                int i3 = IAuthTabCallback + 61;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return Long.valueOf(asLong);
                }
                int i4 = 11 / 0;
                return Long.valueOf(asLong);
            }
        }
        return Long.valueOf(jLongValue);
    }

    @Deprecated
    public static final String IAuthTabCallback(@NotNull JsonObject jsonObject, @NotNull String str, @NotNull String str2) {
        String asString;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            if (!(jsonElement instanceof JsonPrimitive)) {
                int i2 = IAuthTabCallback + 53;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 30 / 0;
                }
                jsonElement = null;
            }
            if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                int i4 = IAuthTabCallback + 19;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 64 / 0;
                }
                return asString;
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JsonArray onNavigationEvent(@NotNull JsonObject jsonObject, @NotNull String str, @NotNull JsonArray jsonArray) {
        JsonArray asJsonArray;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonArray, "");
            jsonObject.get(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            int i4 = onNavigationEvent + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 31 / 0;
                if (!(jsonElement instanceof JsonArray)) {
                    jsonElement = null;
                }
                if (jsonElement != null && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
                    i = onNavigationEvent + 121;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        return asJsonArray;
                    }
                    throw null;
                }
            } else {
                if (!(jsonElement instanceof JsonArray)) {
                }
                if (jsonElement != null) {
                    i = onNavigationEvent + 121;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                    }
                }
            }
        }
        return jsonArray;
    }

    @Deprecated
    public static final JsonObject IAuthTabCallback(@NotNull JsonObject jsonObject, @NotNull String str, @NotNull JsonObject jsonObject2) {
        JsonObject asJsonObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject2, "");
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement != null) {
            int i2 = onNavigationEvent + 21;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                boolean z = jsonElement instanceof JsonObject;
                throw null;
            }
            if (!(jsonElement instanceof JsonObject)) {
                int i4 = i3 + 117;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                jsonElement = null;
            }
            if (jsonElement != null && (asJsonObject = jsonElement.getAsJsonObject()) != null) {
                return asJsonObject;
            }
        }
        return jsonObject2;
    }

    @Deprecated
    public static final long onWarmupCompleted(@NotNull JsonObject jsonObject, @NotNull String str, long j) {
        Object[] objArr = {jsonObject, str, Long.valueOf(j)};
        return ((Long) IAuthTabCallback(MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), -842752671, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), objArr, 842752672)).longValue();
    }

    @Deprecated
    public static final <T> JsonObject onExtraCallbackWithResult(T t) {
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (JsonObject) IAuthTabCallback(iOnExtraCallback, iOnExtraCallback2, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), 353022731, iOnExtraCallback3, new Object[]{t}, -353022731);
    }
}
