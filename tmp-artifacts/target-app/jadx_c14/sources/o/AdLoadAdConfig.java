package o;

import android.app.Activity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.network.model.notification.group.RecentMessagesDto;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdLoadAdConfig {
    public static final boolean onExtraCallback(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.areEqual(str, "TOSS_BANK") && z && addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted);
    }

    public static final boolean IAuthTabCallback(@NotNull RecentMessagesDto recentMessagesDto) {
        Intrinsics.checkNotNullParameter(recentMessagesDto, "");
        return addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted) && recentMessagesDto.IAuthTabCallback() == MultiLineString.RECOMMEND && recentMessagesDto.onWarmupCompleted() == MultiPoint.TOSS_BANK;
    }

    public static final TdsToastV1 onNavigationEvent(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String string = activity.getString(R.string.app_notification_marketing_toss_bank_maintenance_toast);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new TdsToastV1.onNavigationEvent(activity, string).onNavigationEvent();
    }
}
