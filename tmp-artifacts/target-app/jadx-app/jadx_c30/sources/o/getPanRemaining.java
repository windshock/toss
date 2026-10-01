package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getPanRemaining {
    public static final getPanRemaining onWarmupCompleted = new getPanRemaining();

    private getPanRemaining() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Activity activity, getTypedExportedConstants gettypedexportedconstants, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        activity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:15994905")));
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }
}
