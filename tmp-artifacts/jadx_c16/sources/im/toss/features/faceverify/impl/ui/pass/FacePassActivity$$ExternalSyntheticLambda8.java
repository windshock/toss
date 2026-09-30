package im.toss.features.faceverify.impl.ui.pass;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FacePassActivity.IAuthTabCallback(this.f$0, (DialogInterface) obj);
        int i4 = IAuthTabCallback + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
