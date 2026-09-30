package im.toss.core.webkit;

import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.ALCFaceBox;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MessageCallbackProxyKt$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Integer f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (startRunning) obj};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) ALCFaceBox.onWarmupCompleted(-994893637, iIAuthTabCallback, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), objArr, iIAuthTabCallback2, 994893640);
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
