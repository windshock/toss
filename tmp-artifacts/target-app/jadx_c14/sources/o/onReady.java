package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onReady {
    public static final boolean onExtraCallback(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.areEqual(uri.getHost(), "qa-login") && onExtraCallback();
    }

    private static final boolean onExtraCallback() {
        return zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer() && zzaj.onNavigationEvent().ITrustedWebActivityService_Parcel();
    }

    public static final void onNavigationEvent(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        if (onExtraCallback()) {
            TextRoundCornerProgressBarSavedState1 activeNotifications = addPolicy.getActiveNotifications();
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            activeNotifications.IAuthTabCallback("pendingScheme", string, true);
        }
    }

    public static final boolean onExtraCallbackWithResult() {
        if (onExtraCallback()) {
            return addPolicy.getActiveNotifications().onNavigationEvent("pendingScheme");
        }
        return false;
    }

    public static final Uri onWarmupCompleted() {
        String strIAuthTabCallback;
        if (!onExtraCallback() || (strIAuthTabCallback = addPolicy.getActiveNotifications().IAuthTabCallback("pendingScheme")) == null) {
            return null;
        }
        drawBackgroundProgress.onExtraCallbackWithResult(addPolicy.getActiveNotifications(), "pendingScheme", true);
        Uri uri = Uri.parse(strIAuthTabCallback);
        if (onExtraCallback(uri)) {
            return uri;
        }
        return null;
    }
}
