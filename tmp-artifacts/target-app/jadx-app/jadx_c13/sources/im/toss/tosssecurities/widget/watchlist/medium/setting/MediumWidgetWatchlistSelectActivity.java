package im.toss.tosssecurities.widget.watchlist.medium.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import im.toss.tosssecurities.widget.watchlist.medium.WatchlistMediumWidgetWorker;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity;
import o.q8ExternalSyntheticLambda3;
import o.q8a;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MediumWidgetWatchlistSelectActivity extends BaseWidgetWatchlistSelectActivity {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final float onTransact = 1.6428572f;
    private final q8ExternalSyntheticLambda3 IAuthTabCallbackStub = q8ExternalSyntheticLambda3.WatchlistMedium;

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public float validateRelationship() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = this.onTransact;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public q8ExternalSyntheticLambda3 ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 41;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = this.IAuthTabCallbackStub;
        int i4 = i2 + 115;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return q8externalsyntheticlambda3;
    }

    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            q8a.onExtraCallback(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", true, 2, (Object) null);
        } else {
            q8a.onExtraCallback(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", false, 4, (Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        WatchlistMediumWidgetWorker.Companion.onExtraCallbackWithResult(this, IAuthTabCallback(), true);
        int i4 = IAuthTabCallbackDefault + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public Intent IAuthTabCallback(long j) {
        int i = 2 % 2;
        Intent intent = new Intent((Context) this, (Class<?>) MediumWidgetProductSelectActivity.class);
        intent.putExtra("appWidgetId", IAuthTabCallback());
        intent.putExtra("watchlist_id_", j);
        int i2 = asBinder + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
