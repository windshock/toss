package im.toss.tosssecurities.widget.watchlist.small.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity;
import im.toss.tosssecurities.widget.watchlist.small.WatchlistSmallWidgetWorker;
import o.q8ExternalSyntheticLambda3;
import o.q8a;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SmallWidgetWatchlistSelectActivity extends BaseWidgetWatchlistSelectActivity {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final float IAuthTabCallbackDefault = 1.0f;
    private final q8ExternalSyntheticLambda3 IAuthTabCallbackStub = q8ExternalSyntheticLambda3.WatchlistSmall;

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public float validateRelationship() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.IAuthTabCallbackDefault;
        int i4 = i2 + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public q8ExternalSyntheticLambda3 ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q8a.onWarmupCompleted(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", false, 4, (Object) null);
        int i4 = onTransact + 47;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        asBinder = i2 % 128;
        (i2 % 2 != 0 ? WatchlistSmallWidgetWorker.Companion : WatchlistSmallWidgetWorker.Companion).IAuthTabCallback(this, IAuthTabCallback(), true);
        int i3 = onTransact + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.tosssecurities.widget.watchlist.setting.watchlist.BaseWidgetWatchlistSelectActivity
    public Intent IAuthTabCallback(long j) {
        int i = 2 % 2;
        Intent intent = new Intent((Context) this, (Class<?>) SmallWidgetProductSelectActivity.class);
        intent.putExtra("appWidgetId", IAuthTabCallback());
        intent.putExtra("watchlist_id_", j);
        int i2 = onTransact + 17;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return intent;
        }
        Object obj = null;
        obj.hashCode();
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
