package im.toss.securities.widget.overview.ui.medium.setting;

import android.content.Context;
import android.os.Bundle;
import im.toss.securities.widget.overview.ui.medium.OverviewMediumWidgetWorker;
import im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import o.q8ExternalSyntheticLambda3;
import o.q8a;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class OverviewMediumWidgetSettingActivity extends BaseOverviewWidgetSettingActivity {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private final float onTransact = 1.6428572f;
    private final q8ExternalSyntheticLambda3 asBinder = q8ExternalSyntheticLambda3.OverviewMedium;

    public Void ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public /* synthetic */ String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) ICustomTabsServiceStub();
        int i3 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public float updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 45;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onTransact;
        int i5 = i2 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public q8ExternalSyntheticLambda3 validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        q8ExternalSyntheticLambda3 q8externalsyntheticlambda3 = this.asBinder;
        int i5 = i3 + 93;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return q8externalsyntheticlambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.securities.widget.common.ui.BaseWidgetSettingActivity
    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            q8a.IAuthTabCallback(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", true, 5, null);
        } else {
            q8a.IAuthTabCallback(q8a.onNavigationEvent, IAuthTabCallback(), "위젯설정바로가기", false, 4, null);
        }
        int i3 = IAuthTabCallbackStub + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.securities.widget.overview.ui.setting.BaseOverviewWidgetSettingActivity
    public void onWarmupCompleted(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        OverviewMediumWidgetWorker.Companion.onExtraCallback(context, i, true);
        int i5 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
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
