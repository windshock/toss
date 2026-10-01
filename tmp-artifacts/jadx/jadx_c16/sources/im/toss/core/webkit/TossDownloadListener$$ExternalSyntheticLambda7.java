package im.toss.core.webkit;

import com.horcrux.svg.SvgPackage;
import kotlin.jvm.functions.Function1;
import o.deserializeFloat;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda7 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, obj};
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            setBackgroundAlpha.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, 478205847, SvgPackage.21.onExtraCallbackWithResult(), -478205845, iOnExtraCallbackWithResult);
            int i3 = 37 / 0;
        } else {
            Object[] objArr2 = {this.f$0, obj};
            int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
            setBackgroundAlpha.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr2, 478205847, SvgPackage.21.onExtraCallbackWithResult(), -478205845, iOnExtraCallbackWithResult2);
        }
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
