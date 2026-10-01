package o;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import java.util.List;
import o.TabKtTabBaselineLayout21ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallbackDefault$onNavigationEvent extends TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallback$onExtraCallbackWithResult {
    final /* synthetic */ TabKtTabBaselineLayout21ExternalSyntheticLambda0.IAuthTabCallbackDefault onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallbackDefault$onNavigationEvent(TabKtTabBaselineLayout21ExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault, Context context) {
        super(iAuthTabCallbackDefault, context);
        this.onWarmupCompleted = iAuthTabCallbackDefault;
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
        TabRowKtExternalSyntheticLambda0.onNavigationEvent(bundle);
        TabKtTabBaselineLayout21ExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = this.onWarmupCompleted;
        TabKtTabBaselineLayout21ExternalSyntheticLambda0 tabKtTabBaselineLayout21ExternalSyntheticLambda0 = iAuthTabCallbackDefault.asBinder;
        tabKtTabBaselineLayout21ExternalSyntheticLambda0.onWarmupCompleted = tabKtTabBaselineLayout21ExternalSyntheticLambda0.onExtraCallbackWithResult;
        iAuthTabCallbackDefault.onWarmupCompleted(str, new TabKtTabBaselineLayout21ExternalSyntheticLambda0.asBinder(result), bundle);
        this.onWarmupCompleted.asBinder.onWarmupCompleted = null;
    }

    @Override // o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallback$onExtraCallbackWithResult, o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$IAuthTabCallback$onExtraCallbackWithResult, o.TabKtTabBaselineLayout21ExternalSyntheticLambda0$onExtraCallback$onNavigationEvent, android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
