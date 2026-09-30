package com.tnkfactory.ad.a;

import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.TnkOfferwall;
import com.tnkfactory.ad.TnkResultListener;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import com.tnkfactory.framework.vo.ValueObject;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class v extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ TnkOfferwall b;
    public final /* synthetic */ TextFieldPressGestureFilterKtExternalSyntheticLambda0 c;
    public final /* synthetic */ TnkResultListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TnkOfferwall tnkOfferwall, TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0, TnkResultListener tnkResultListener, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = tnkOfferwall;
        this.c = textFieldPressGestureFilterKtExternalSyntheticLambda0;
        this.d = tnkResultListener;
    }

    public static final Unit a(TnkOfferwall tnkOfferwall, TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0, TnkResultListener tnkResultListener, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        long earnPointCPS = 0;
        while (it.hasNext()) {
            earnPointCPS += ((AdListVo) it.next()).getPointAmount();
        }
        TnkCore tnkCore = TnkCore.INSTANCE;
        ValueObject sessionVO = tnkCore.getSessionVO(tnkOfferwall.getContext());
        if (tnkCore.getOffRepository().getEarnPointCPS() <= 0) {
            ResultState<ValueObject> productTotalPoint = tnkCore.getServiceTask().getProductTotalPoint(sessionVO);
            if (productTotalPoint instanceof ResultState.Success) {
                ResultState.Success success = (ResultState.Success) productTotalPoint;
                earnPointCPS += ((ValueObject) success.getValue()).getInt("pnt_amt");
                tnkCore.getOffRepository().setEarnPointCPS(((ValueObject) success.getValue()).getInt("pnt_amt"));
            } else if (productTotalPoint instanceof ResultState.Error) {
                ((ResultState.Error) productTotalPoint).getE();
            } else if (!(productTotalPoint instanceof ResultState.Pass)) {
                maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0, putChannelInfo.onExtraCallback(), (setRandomHost) null, new s(tnkResultListener, null), 2, (Object) null);
            }
        } else {
            earnPointCPS += tnkCore.getOffRepository().getEarnPointCPS();
        }
        tnkCore.getOffRepository().setEarnPoint(earnPointCPS);
        tnkCore.getOffRepository().setEarnPointCalcTime(System.currentTimeMillis());
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0, putChannelInfo.onExtraCallback(), (setRandomHost) null, new t(tnkResultListener, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new v(this.b, this.c, this.d, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((findResAndMsg) obj, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            TnkCore tnkCore = TnkCore.INSTANCE;
            this.a = 1;
            obj = tnkCore.load(this);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        final TnkOfferwall tnkOfferwall = this.b;
        final TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0 = this.c;
        final TnkResultListener tnkResultListener = this.d;
        TnkResultTask onSuccess = ((TnkResultTask) obj).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.a.v$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return v.a(tnkOfferwall, textFieldPressGestureFilterKtExternalSyntheticLambda0, tnkResultListener, (ArrayList) obj2);
            }
        });
        final TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda02 = this.c;
        final TnkResultListener tnkResultListener2 = this.d;
        onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.a.v$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return v.a(textFieldPressGestureFilterKtExternalSyntheticLambda02, tnkResultListener2, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0, TnkResultListener tnkResultListener, TnkError tnkError) {
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0, putChannelInfo.onExtraCallback(), (setRandomHost) null, new u(tnkResultListener, tnkError, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
