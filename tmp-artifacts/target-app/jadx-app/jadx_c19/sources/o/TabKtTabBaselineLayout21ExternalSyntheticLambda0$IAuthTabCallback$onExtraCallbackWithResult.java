package o;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;
import o.TabKtTabBaselineLayout21ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallback$onExtraCallbackWithResult extends TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent {
    final /* synthetic */ TabKtTabBaselineLayout21ExternalSyntheticLambda0.IAuthTabCallback onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallback$onExtraCallbackWithResult(TabKtTabBaselineLayout21ExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, Context context) {
        super(iAuthTabCallback, context);
        this.onExtraCallback = iAuthTabCallback;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        this.onExtraCallback.onExtraCallbackWithResult(str, new TabKtTabBaselineLayout21ExternalSyntheticLambda0.asBinder(result));
    }

    @Override // o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent, android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
