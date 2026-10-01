package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class initRenderFinish {
    private static final SerialDescriptor onNavigationEvent = getBeginInvisibleAndShow.onExtraCallbackWithResult("kotlinx.serialization.json.JsonUnquotedLiteral", sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE));

    public static final JsonPrimitive onWarmupCompleted(@Nullable Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new muteVideo(bool, false, null, 4, null);
    }

    public static final JsonPrimitive IAuthTabCallback(@Nullable Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new muteVideo(number, false, null, 4, null);
    }

    public static final JsonPrimitive onNavigationEvent(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new muteVideo(str, true, null, 4, null);
    }

    public static final JsonPrimitive onExtraCallback(@Nullable String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (Intrinsics.areEqual(str, JsonNull.INSTANCE.onWarmupCompleted())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new muteVideo(str, false, onNavigationEvent);
    }

    public static final SerialDescriptor onExtraCallbackWithResult() {
        return onNavigationEvent;
    }

    public static final JsonPrimitive onNavigationEvent(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        onWarmupCompleted(jsonElement, "JsonPrimitive");
        throw new setWrite();
    }

    public static final JsonObject onExtraCallbackWithResult(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        onWarmupCompleted(jsonElement, "JsonObject");
        throw new setWrite();
    }

    public static final JsonArray onWarmupCompleted(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        onWarmupCompleted(jsonElement, "JsonArray");
        throw new setWrite();
    }

    public static final int IAuthTabCallbackStub(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            long jIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(jsonPrimitive);
            if (-2147483648L <= jIAuthTabCallback_Parcel && jIAuthTabCallback_Parcel <= 2147483647L) {
                return (int) jIAuthTabCallback_Parcel;
            }
            throw new NumberFormatException(jsonPrimitive.onWarmupCompleted() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer asInterface(@NotNull JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            lValueOf = Long.valueOf(IAuthTabCallback_Parcel(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final long IAuthTabCallbackDefault(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            return IAuthTabCallback_Parcel(jsonPrimitive);
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Long access000(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        try {
            return Long.valueOf(IAuthTabCallback_Parcel(jsonPrimitive));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final double onExtraCallback(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return Double.parseDouble(jsonPrimitive.onWarmupCompleted());
    }

    public static final Double onWarmupCompleted(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(jsonPrimitive.onWarmupCompleted());
    }

    public static final float onTransact(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return Float.parseFloat(jsonPrimitive.onWarmupCompleted());
    }

    public static final Float asBinder(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(jsonPrimitive.onWarmupCompleted());
    }

    public static final boolean IAuthTabCallback(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        Boolean boolIAuthTabCallback = PglCryptUtils.IAuthTabCallback(jsonPrimitive.onWarmupCompleted());
        if (boolIAuthTabCallback != null) {
            return boolIAuthTabCallback.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean onExtraCallbackWithResult(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return PglCryptUtils.IAuthTabCallback(jsonPrimitive.onWarmupCompleted());
    }

    public static final String onNavigationEvent(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.onWarmupCompleted();
    }

    private static final Void onWarmupCompleted(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final long IAuthTabCallback_Parcel(@NotNull JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        return new isNull(jsonPrimitive.onWarmupCompleted()).IAuthTabCallbackDefault();
    }
}
