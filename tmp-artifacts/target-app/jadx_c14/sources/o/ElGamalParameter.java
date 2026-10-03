package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.createMediaViewApi;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ElGamalParameter {
    public static final boolean onNavigationEvent(@NotNull createMediaViewApi createmediaviewapi, @NotNull String str) {
        Intrinsics.checkNotNullParameter(createmediaviewapi, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (createmediaviewapi instanceof createMediaViewApi.onExtraCallbackWithResult) {
            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null));
            return (intOrNull != null ? intOrNull.intValue() : 0) >= ((createMediaViewApi.onExtraCallbackWithResult) createmediaviewapi).onNavigationEvent();
        }
        if (createmediaviewapi instanceof createMediaViewApi.asBinder) {
            Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null));
            return (intOrNull2 != null ? intOrNull2.intValue() : 0) % ((createMediaViewApi.asBinder) createmediaviewapi).onWarmupCompleted() == 0;
        }
        if (createmediaviewapi instanceof createMediaViewApi.onExtraCallback) {
            Integer intOrNull3 = StringsKt.toIntOrNull(StringsKt.replace$default(str, ",", "", false, 4, (Object) null));
            return (intOrNull3 != null ? intOrNull3.intValue() : 0) <= ((createMediaViewApi.onExtraCallback) createmediaviewapi).onExtraCallbackWithResult();
        }
        if (createmediaviewapi instanceof createMediaViewApi.IAuthTabCallback) {
            return str.length() >= ((createMediaViewApi.IAuthTabCallback) createmediaviewapi).onWarmupCompleted();
        }
        if (createmediaviewapi instanceof createMediaViewApi.onNavigationEvent) {
            return str.length() <= ((createMediaViewApi.onNavigationEvent) createmediaviewapi).onNavigationEvent();
        }
        if (createmediaviewapi instanceof createMediaViewApi.onWarmupCompleted) {
            return disableMountItemReorderingAndroid.onNavigationEvent.onExtraCallbackWithResult(str);
        }
        if (createmediaviewapi instanceof createMediaViewApi.onTransact) {
            String strOnWarmupCompleted = ((createMediaViewApi.onTransact) createmediaviewapi).onWarmupCompleted();
            Regex regex = null;
            if (strOnWarmupCompleted != null) {
                if (StringsKt.isBlank(strOnWarmupCompleted)) {
                    strOnWarmupCompleted = null;
                }
                if (strOnWarmupCompleted != null) {
                    regex = new Regex(strOnWarmupCompleted);
                }
            }
            if (regex != null) {
                return regex.onExtraCallbackWithResult(str);
            }
        }
        return true;
    }
}
