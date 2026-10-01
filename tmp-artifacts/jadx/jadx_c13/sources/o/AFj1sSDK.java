package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import im.toss.tds.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFj1sSDK {
    float IAuthTabCallback();

    default Drawable onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return null;
    }

    default String onExtraCallbackWithResult() {
        int i = 2 % 2;
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    default String onExtraCallback() {
        int i = 2 % 2;
        String strValueOf = String.valueOf(IAuthTabCallback());
        if (!StringsKt__StringsJVMKt.endsWith$default(strValueOf, ".0", false, 2, null)) {
            return strValueOf;
        }
        String strSubstring = strValueOf.substring(0, strValueOf.length() - 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    default int IAuthTabCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, R.color.grey_500);
    }

    default int onExtraCallback(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, R.color.grey_500);
    }

    default int onNavigationEvent(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, R.color.grey_500);
    }

    default boolean onWarmupCompleted(@NotNull Context context, @Nullable AFj1sSDK aFj1sSDK) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (!Intrinsics.areEqual(this, aFj1sSDK)) {
            return !(Intrinsics.areEqual(onExtraCallbackWithResult(), aFj1sSDK != null ? aFj1sSDK.onExtraCallbackWithResult() : null) ^ true) && IAuthTabCallback() == aFj1sSDK.IAuthTabCallback() && Intrinsics.areEqual(onExtraCallbackWithResult(context), aFj1sSDK.onExtraCallbackWithResult(context)) && IAuthTabCallback(context) == aFj1sSDK.IAuthTabCallback(context) && onExtraCallback(context) == aFj1sSDK.onExtraCallback(context) && onNavigationEvent(context) == aFj1sSDK.onNavigationEvent(context);
        }
        return true;
    }
}
