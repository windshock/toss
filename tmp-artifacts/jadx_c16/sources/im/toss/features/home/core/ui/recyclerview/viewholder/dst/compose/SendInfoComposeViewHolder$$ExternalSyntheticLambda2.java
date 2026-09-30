package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.isResetCookie;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SendInfoComposeViewHolder$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ isResetCookie f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = isResetCookie.IAuthTabCallback(this.f$0, ((Float) obj).floatValue());
        int i4 = IAuthTabCallback + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
