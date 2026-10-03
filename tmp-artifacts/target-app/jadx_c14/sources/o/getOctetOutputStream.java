package o;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.account.savingbox.SavingBoxIntroActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getOctetOutputStream {
    public static final getOctetOutputStream onExtraCallback = new getOctetOutputStream();

    private getOctetOutputStream() {
    }

    public final void onExtraCallback(@NotNull Activity activity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        activity.startActivity(SavingBoxIntroActivity.Companion.onNavigationEvent(activity, str));
    }
}
