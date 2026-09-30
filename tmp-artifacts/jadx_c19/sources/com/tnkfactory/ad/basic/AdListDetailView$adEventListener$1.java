package com.tnkfactory.ad.basic;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.off.AdEventListener;
import com.tnkfactory.ad.off.data.AdListVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdListDetailView$adEventListener$1 implements AdEventListener {
    public final /* synthetic */ AdListDetailView a;

    public AdListDetailView$adEventListener$1(AdListDetailView adListDetailView) {
        this.a = adListDetailView;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    @Override // com.tnkfactory.ad.off.AdEventListener
    public void onComplete(AdListVo adListVo, boolean z) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        if (z) {
            this.a.customClose();
        }
    }

    @Override // com.tnkfactory.ad.off.AdEventListener
    public void onError(TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        this.a.getTnkContext().getNavi().showDialog(this.a.getTnkContext().getActivity(), tnkError.getMessage(), new Function0() { // from class: com.tnkfactory.ad.basic.AdListDetailView$adEventListener$1$$ExternalSyntheticLambda0
            public final Object invoke() {
                return AdListDetailView$adEventListener$1.a();
            }
        });
    }
}
