package im.toss.securities.widget.overview.ui.small.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.securities.widget.overview.ui.small.OverviewSmallWidgetWorker;
import kotlin.jvm.internal.Intrinsics;
import o.q8ExternalSyntheticLambda3;
import o.q8a;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewSmallWidgetSettingActivity extends Hilt_OverviewSmallWidgetSettingActivity {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final float asBinder = 1.0f;
    private final q8ExternalSyntheticLambda3 IAuthTabCallbackDefault = q8ExternalSyntheticLambda3.OverviewSmall;

    public Void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public /* synthetic */ String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) ICustomTabsServiceStub();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public float updateVisuals() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.asBinder;
        int i4 = i2 + 91;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public q8ExternalSyntheticLambda3 validateRelationship() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 41;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = this.IAuthTabCallbackDefault;
        int i5 = i2 + 59;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return q8externalsyntheticlambda3;
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        q8a.onNavigationEvent(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", false, 4, null);
        int i4 = IAuthTabCallbackStub + 25;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public void onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        OverviewSmallWidgetWorker.Companion.onExtraCallback(context, i, true);
    }

    @Override // im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.securities.widget.overview.ui.small.setting.Hilt_OverviewSmallWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity, im.toss.securities.widget.overview.ui.setting.Hilt_BaseOverviewWidgetSettingActivity, im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
