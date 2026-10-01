package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import o.AlertDialogKtExternalSyntheticLambda3;
import o.AlertDialogKtExternalSyntheticLambda5;
import o.AlertDialogKtExternalSyntheticLambda6;
import o.BottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent;
import o.TextFieldSelectionManagerKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface HlsPlaylistTracker {

    public interface IAuthTabCallback {
        void onNavigationEvent(AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3);
    }

    public interface onExtraCallback {
        void asBinder();

        boolean onExtraCallback(Uri uri, ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent, boolean z);
    }

    public interface onWarmupCompleted {
        HlsPlaylistTracker createTracker(TextFieldSelectionManagerKtExternalSyntheticLambda4 textFieldSelectionManagerKtExternalSyntheticLambda4, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, AlertDialogKtExternalSyntheticLambda5 alertDialogKtExternalSyntheticLambda5, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0);
    }

    AlertDialogKtExternalSyntheticLambda6 IAuthTabCallback();

    AlertDialogKtExternalSyntheticLambda3 onExtraCallback(Uri uri, boolean z);

    void onExtraCallback(Uri uri);

    void onExtraCallback(onExtraCallback onextracallback);

    boolean onExtraCallback();

    void onExtraCallbackWithResult();

    boolean onExtraCallbackWithResult(Uri uri);

    long onNavigationEvent();

    void onNavigationEvent(Uri uri) throws IOException;

    void onNavigationEvent(Uri uri, BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback, IAuthTabCallback iAuthTabCallback);

    void onNavigationEvent(onExtraCallback onextracallback);

    boolean onNavigationEvent(Uri uri, long j);

    void onWarmupCompleted() throws IOException;

    default void onWarmupCompleted(Uri uri) {
    }
}
