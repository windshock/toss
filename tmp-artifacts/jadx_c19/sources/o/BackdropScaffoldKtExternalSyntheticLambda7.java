package o;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BackdropScaffoldKtExternalSyntheticLambda7 {
    ListenableFuture<?> onExtraCallbackWithResult(onNavigationEvent onnavigationevent);

    public static final class onNavigationEvent {
        public final Uri onExtraCallback;

        public onNavigationEvent(Uri uri) {
            this.onExtraCallback = uri;
        }
    }
}
