package im.toss.core.webkit;

import com.horcrux.svg.SvgPackage;
import im.toss.uikit.base.UIKitBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setBackgroundAlpha;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossDownloadListener$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ setBackgroundAlpha f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ UIKitBaseActivity f$5;

    public /* synthetic */ TossDownloadListener$$ExternalSyntheticLambda1(String str, setBackgroundAlpha setbackgroundalpha, String str2, String str3, String str4, UIKitBaseActivity uIKitBaseActivity) {
        this.f$0 = str;
        this.f$1 = setbackgroundalpha;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = uIKitBaseActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5};
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) setBackgroundAlpha.onExtraCallbackWithResult(SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr, -137019418, SvgPackage.21.onExtraCallbackWithResult(), 137019422, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
