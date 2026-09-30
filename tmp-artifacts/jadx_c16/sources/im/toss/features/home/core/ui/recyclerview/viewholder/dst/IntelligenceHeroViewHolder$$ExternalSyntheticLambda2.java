package im.toss.features.home.core.ui.recyclerview.viewholder.dst;

import com.horcrux.svg.SvgPackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.RVDownloadRequest;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IntelligenceHeroViewHolder$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ RVDownloadRequest f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, Float.valueOf(((Float) obj).floatValue())};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        if (i3 != 0) {
            return (Unit) RVDownloadRequest.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -480227370, objArr, iOnExtraCallbackWithResult, 480227370, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
        }
        int i4 = 34 / 0;
        return (Unit) RVDownloadRequest.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), -480227370, objArr, iOnExtraCallbackWithResult, 480227370, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult());
    }
}
