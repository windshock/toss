package im.toss.securities.widget.overview.ui.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.securities.widget.common.ui.BaseWidgetSettingActivity;
import o.animate;
import o.captureEndValues;
import o.s1ExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Hilt_BaseOverviewWidgetSettingActivity extends BaseWidgetSettingActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private boolean onTransact = false;

    Hilt_BaseOverviewWidgetSettingActivity() {
        updateVisuals();
    }

    private void updateVisuals() {
        int i = 2 % 2;
        addOnContextAvailableListener(new writeTypedList() { // from class: im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity.4
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onContextAvailable(Context context) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Hilt_BaseOverviewWidgetSettingActivity.this.aR_();
                int i5 = onExtraCallback + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = IAuthTabCallbackDefault + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aR_() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onTransact) {
            this.onTransact = true;
            ((s1ExternalSyntheticLambda0) ((captureEndValues) animate.onExtraCallbackWithResult(this)).generatedComponent()).onWarmupCompleted((BaseOverviewWidgetSettingActivity) animate.onExtraCallbackWithResult(this));
            int i4 = asBinder + 119;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = asBinder + 123;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
