package o;

import android.content.Context;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewOnAnimationEventListener {
    public static final void onNavigationEvent(@NotNull SetDetectableSize setDetectableSize, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Intrinsics.checkNotNullParameter(context, "");
        setDetectableSize.onExtraCallback().putAll(IAuthTabCallback(context));
    }

    private static final Map<String, String> IAuthTabCallback(Context context) {
        Locale localeOnExtraCallback = PageExitListener.onExtraCallback(context);
        Locale localeIAuthTabCallback = PageExitListener.IAuthTabCallback(context);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("device_region_code", localeOnExtraCallback.getCountry());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("device_language_code", localeOnExtraCallback.getLanguage());
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("device_language_region_code", localeOnExtraCallback.getCountry());
        String language = localeIAuthTabCallback.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "");
        String upperCase = language.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("toss_app_language", upperCase)});
    }
}
