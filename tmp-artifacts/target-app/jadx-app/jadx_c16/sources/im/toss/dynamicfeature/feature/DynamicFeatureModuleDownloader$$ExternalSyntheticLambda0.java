package im.toss.dynamicfeature.feature;

import android.view.View;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DynamicFeatureModuleDownloader$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TdsBottomCtaV1View f$0;
    public final /* synthetic */ DynamicFeatureModuleDownloader f$1;

    public /* synthetic */ DynamicFeatureModuleDownloader$$ExternalSyntheticLambda0(TdsBottomCtaV1View tdsBottomCtaV1View, DynamicFeatureModuleDownloader dynamicFeatureModuleDownloader) {
        this.f$0 = tdsBottomCtaV1View;
        this.f$1 = dynamicFeatureModuleDownloader;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = this.f$0;
        if (i3 == 0) {
            return (Unit) DynamicFeatureModuleDownloader.onWarmupCompleted(-651373118, new Object[]{tdsBottomCtaV1View, this.f$1, (View) obj}, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 651373118, PushInfo.Companion.onExtraCallback());
        }
        throw null;
    }
}
