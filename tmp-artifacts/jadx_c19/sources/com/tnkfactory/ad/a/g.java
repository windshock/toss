package com.tnkfactory.ad.a;

import com.tnkfactory.ad.AdListViewImpl;
import com.tnkfactory.ad.TnkAdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class g extends SuspendLambda implements Function2 {
    public final /* synthetic */ AdListViewImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdListViewImpl adListViewImpl, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = adListViewImpl;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new g(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new g(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        try {
            TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
            int startCategory = tnkAdConfig.getHeaderConfig().getStartCategory();
            int startFilter = tnkAdConfig.getHeaderConfig().getStartFilter();
            int startFilterID = tnkAdConfig.getHeaderConfig().getStartFilterID();
            if (startFilterID != 0) {
                this.a.getViewModel().getRwdFilter().changeFilter(startFilterID);
            } else {
                if (startCategory <= 0) {
                    startCategory = 0;
                }
                if (startFilter <= 0) {
                    startFilter = 0;
                }
                this.a.getViewModel().getRwdFilter().changeFilter(startCategory, startFilter);
            }
            tnkAdConfig.getHeaderConfig().setStartCategory(0);
            tnkAdConfig.getHeaderConfig().setStartFilter(0);
            tnkAdConfig.getHeaderConfig().setStartFilterID(0);
        } catch (Exception unused) {
            this.a.getViewModel().getRwdFilter().selectFirst();
        }
        return Unit.INSTANCE;
    }
}
