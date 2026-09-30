package viva.republica.toss.account.util;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import o.DERConstructedSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AccountHelper$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ Integer f$0;
    public final /* synthetic */ Fragment f$1;

    public /* synthetic */ AccountHelper$$ExternalSyntheticLambda8(Integer num, Fragment fragment) {
        this.f$0 = num;
        this.f$1 = fragment;
    }

    public final Object invoke(Object obj) {
        return DERConstructedSet.onWarmupCompleted(this.f$0, this.f$1, (Intent) obj);
    }
}
