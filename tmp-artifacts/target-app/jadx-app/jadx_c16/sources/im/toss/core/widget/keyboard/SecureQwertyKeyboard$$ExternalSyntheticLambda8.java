package im.toss.core.widget.keyboard;

import java.util.List;
import kotlin.jvm.functions.Function0;
import o.getPreRenderJob;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda8 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SecureQwertyKeyboard f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) SecureQwertyKeyboard.onNavigationEvent(new Object[]{this.f$0}, 255088648, getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -255088643, getPreRenderJob.onNavigationEvent.IAuthTabCallback());
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }
}
