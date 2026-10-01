package im.toss.features.home.feature.cashflow;

import android.net.Uri;
import im.toss.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PrepareCallbackImpl1;
import o.unmarshallJSONArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowLongPressSchemeHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ unmarshallJSONArray f$0;
    public final /* synthetic */ BaseActivity f$1;
    public final /* synthetic */ Uri f$2;

    public /* synthetic */ CashflowLongPressSchemeHandler$$ExternalSyntheticLambda0(unmarshallJSONArray unmarshalljsonarray, BaseActivity baseActivity, Uri uri) {
        this.f$0 = unmarshalljsonarray;
        this.f$1 = baseActivity;
        this.f$2 = uri;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = unmarshallJSONArray.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (PrepareCallbackImpl1) obj);
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
