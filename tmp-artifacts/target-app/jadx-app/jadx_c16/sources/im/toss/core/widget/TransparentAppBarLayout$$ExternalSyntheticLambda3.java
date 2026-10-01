package im.toss.core.widget;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransparentAppBarLayout$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ TransparentAppBarLayout f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TransparentAppBarLayout transparentAppBarLayout = this.f$0;
        if (i3 != 0) {
            return TransparentAppBarLayout.IAuthTabCallback(transparentAppBarLayout);
        }
        TransparentAppBarLayout.IAuthTabCallback(transparentAppBarLayout);
        throw null;
    }
}
