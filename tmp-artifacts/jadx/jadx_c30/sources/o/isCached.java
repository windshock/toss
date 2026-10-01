package o;

import android.os.Build;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import o.isCached;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class isCached {
    public static final isCached onExtraCallback = new isCached();
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.GuestConstants$$ExternalSyntheticLambda0
        public final Object invoke() {
            return isCached.onExtraCallback();
        }
    });
    public static final int onNavigationEvent = 8;

    private isCached() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onExtraCallback() {
        List listMutableListOf = CollectionsKt.mutableListOf(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.WRITE_EXTERNAL_STORAGE"});
        if (Build.VERSION.SDK_INT >= 26) {
            listMutableListOf.add(0, "android.permission.READ_PHONE_NUMBERS");
        }
        return listMutableListOf;
    }
}
