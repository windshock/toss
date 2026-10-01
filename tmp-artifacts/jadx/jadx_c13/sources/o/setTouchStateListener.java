package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTouchStateListener {
    public static final JsonDecodingException onWarmupCompleted(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException onExtraCallbackWithResult(int i, @NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return onWarmupCompleted(i, str + "\nJSON input: " + ((Object) IAuthTabCallback(charSequence, i)));
    }

    public static final JsonEncodingException onWarmupCompleted(@NotNull Number number, @NotNull String str) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) onWarmupCompleted(str, 0, 1, (Object) null)));
    }

    public static final Void onExtraCallbackWithResult(@NotNull getBeforeTimestamp getbeforetimestamp, @NotNull Number number) {
        Intrinsics.checkNotNullParameter(getbeforetimestamp, "");
        Intrinsics.checkNotNullParameter(number, "");
        getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new setWrite();
    }

    public static /* synthetic */ Void onWarmupCompleted(getBeforeTimestamp getbeforetimestamp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return onNavigationEvent(getbeforetimestamp, str);
    }

    public static final Void onNavigationEvent(@NotNull getBeforeTimestamp getbeforetimestamp, @NotNull String str) {
        Intrinsics.checkNotNullParameter(getbeforetimestamp, "");
        Intrinsics.checkNotNullParameter(str, "");
        getbeforetimestamp.onNavigationEvent("Trailing comma before the end of JSON " + str, getbeforetimestamp.onWarmupCompleted - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new setWrite();
    }

    public static final JsonEncodingException onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return new JsonEncodingException("Value of type '" + serialDescriptor.onExtraCallbackWithResult() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.IAuthTabCallback() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonEncodingException onExtraCallbackWithResult(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new JsonEncodingException(onWarmupCompleted(number, str, str2));
    }

    public static final JsonDecodingException onNavigationEvent(@NotNull Number number, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return onWarmupCompleted(-1, onWarmupCompleted(number, str, str2));
    }

    private static final String onWarmupCompleted(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) onWarmupCompleted(str2, 0, 1, (Object) null));
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return IAuthTabCallback(charSequence, i);
    }

    public static final CharSequence IAuthTabCallback(@NotNull CharSequence charSequence, int i) {
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i != -1) {
            int i2 = i - 30;
            int i3 = i + 30;
            String str2 = i2 <= 0 ? _UrlKt.FRAGMENT_ENCODE_SET : ".....";
            if (i3 < charSequence.length()) {
                str = ".....";
            }
            return str2 + charSequence.subSequence(RangesKt___RangesKt.coerceAtLeast(i2, 0), RangesKt___RangesKt.coerceAtMost(i3, charSequence.length())).toString() + str;
        }
        int length = charSequence.length() - 60;
        if (length <= 0) {
            return charSequence;
        }
        return "....." + charSequence.subSequence(length, charSequence.length()).toString();
    }
}
