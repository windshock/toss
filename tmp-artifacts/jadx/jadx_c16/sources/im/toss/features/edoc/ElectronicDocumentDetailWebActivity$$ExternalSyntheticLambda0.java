package im.toss.features.edoc;

import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ElectronicDocumentDetailWebActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ElectronicDocumentDetailWebActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SetDetectableSize) obj};
        int iIAuthTabCallback = OverseasRrnInputTextField.IAuthTabCallback();
        Unit unit = (Unit) ElectronicDocumentDetailWebActivity.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), -329230018, OverseasRrnInputTextField.IAuthTabCallback(), objArr, OverseasRrnInputTextField.IAuthTabCallback(), 329230024, iIAuthTabCallback);
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
