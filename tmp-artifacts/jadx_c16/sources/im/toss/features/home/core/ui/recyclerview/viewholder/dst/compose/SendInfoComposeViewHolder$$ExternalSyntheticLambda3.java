package im.toss.features.home.core.ui.recyclerview.viewholder.dst.compose;

import kotlin.jvm.functions.Function1;
import o.isResetCookie;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SendInfoComposeViewHolder$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ isResetCookie f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isResetCookie isresetcookie = this.f$0;
        Float f = (Float) obj;
        if (i3 == 0) {
            return isResetCookie.onExtraCallback(isresetcookie, f.floatValue());
        }
        isResetCookie.onExtraCallback(isresetcookie, f.floatValue());
        throw null;
    }
}
