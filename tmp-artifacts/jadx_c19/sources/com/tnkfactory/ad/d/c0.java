package com.tnkfactory.ad.d;

import com.tnkfactory.ad.AgreePrivacyPopupListener;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.rwd.AgreePrivacyPopupDialog;
import com.tnkfactory.ad.rwd.Settings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class c0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkOffNavi a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(TnkOffNavi tnkOffNavi, Function0 function0, Function0 function02, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkOffNavi;
        this.b = function0;
        this.c = function02;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new c0(this.a, this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        AgreePrivacyPopupDialog agreePrivacyPopupDialog = new AgreePrivacyPopupDialog(this.a.getActivity());
        final TnkOffNavi tnkOffNavi = this.a;
        final Function0 function0 = this.b;
        final Function0 function02 = this.c;
        agreePrivacyPopupDialog.setAgreePrivacyPopupListener(new AgreePrivacyPopupListener() { // from class: com.tnkfactory.ad.off.TnkOffNavi$showTerms$1$1$1
            @Override // com.tnkfactory.ad.AgreePrivacyPopupListener
            public void onCancle() {
                Settings.INSTANCE.setAgreePrivacy(tnkOffNavi.getActivity(), false);
                function0.invoke();
            }

            @Override // com.tnkfactory.ad.AgreePrivacyPopupListener
            public void onConfirm() {
                Settings.INSTANCE.setAgreePrivacy(tnkOffNavi.getActivity(), true);
                function02.invoke();
            }
        });
        agreePrivacyPopupDialog.show();
        return Unit.INSTANCE;
    }
}
