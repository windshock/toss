package im.toss.securities.widget.overview.ui.small.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity;
import o.animate;
import o.captureEndValues;
import o.s2;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Hilt_OverviewSmallWidgetSettingActivity extends BaseOverviewWidgetSettingActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int onTransact;
    private boolean asBinder = false;

    Hilt_OverviewSmallWidgetSettingActivity() {
        ICustomTabsServiceStub();
    }

    private void ICustomTabsServiceStub() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity.2
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Hilt_OverviewSmallWidgetSettingActivity.this.aR_();
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity
    public void aR_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!this.asBinder) {
            int i5 = i2 + 33;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            this.asBinder = true;
            ((s2) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).IAuthTabCallback((OverviewSmallWidgetSettingActivity) animate.onExtraCallbackWithResult(this));
        }
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
