package o;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import androidx.annotation.Nullable;
import java.util.List;
import o.TabKtTabBaselineLayout21ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent extends MediaBrowserService {
    final /* synthetic */ TabKtTabBaselineLayout21ExternalSyntheticLambda0.onExtraCallback IAuthTabCallback;

    TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent(TabKtTabBaselineLayout21ExternalSyntheticLambda0.onExtraCallback onextracallback, Context context) {
        this.IAuthTabCallback = onextracallback;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i2, @Nullable Bundle bundle) {
        TabRowKtExternalSyntheticLambda0.onNavigationEvent(bundle);
        TabKtTabBaselineLayout21ExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(str, i2, bundle == null ? null : new Bundle(bundle));
        if (onnavigationeventOnExtraCallbackWithResult == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot(TabKtTabBaselineLayout21ExternalSyntheticLambda0.onNavigationEvent.IAuthTabCallback(onnavigationeventOnExtraCallbackWithResult), TabKtTabBaselineLayout21ExternalSyntheticLambda0.onNavigationEvent.onWarmupCompleted(onnavigationeventOnExtraCallbackWithResult));
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.IAuthTabCallback.onNavigationEvent(str, new TabKtTabBaselineLayout21ExternalSyntheticLambda0.asBinder(result));
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
