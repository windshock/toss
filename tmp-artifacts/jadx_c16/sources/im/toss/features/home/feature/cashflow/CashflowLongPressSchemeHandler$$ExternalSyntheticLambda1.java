package im.toss.features.home.feature.cashflow;

import android.net.Uri;
import im.toss.base.BaseActivity;
import kotlin.jvm.functions.Function1;
import o.PrepareCallbackImpl1;
import o.unmarshallJSONArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowLongPressSchemeHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ unmarshallJSONArray f$0;
    public final /* synthetic */ BaseActivity f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Uri f$3;

    public /* synthetic */ CashflowLongPressSchemeHandler$$ExternalSyntheticLambda1(unmarshallJSONArray unmarshalljsonarray, BaseActivity baseActivity, boolean z, Uri uri) {
        this.f$0 = unmarshalljsonarray;
        this.f$1 = baseActivity;
        this.f$2 = z;
        this.f$3 = uri;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        unmarshallJSONArray unmarshalljsonarray = this.f$0;
        if (i3 == 0) {
            return unmarshallJSONArray.onWarmupCompleted(unmarshalljsonarray, this.f$1, this.f$2, this.f$3, (PrepareCallbackImpl1) obj);
        }
        unmarshallJSONArray.onWarmupCompleted(unmarshalljsonarray, this.f$1, this.f$2, this.f$3, (PrepareCallbackImpl1) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
