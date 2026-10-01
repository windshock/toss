package com.tnkfactory.ad.b;

import android.content.Context;
import android.os.Bundle;
import com.tnkfactory.ad.basic.AdDetailNewsDialog;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.ResultState;
import com.tnkfactory.ad.rwd.data.constants.ErrorCodes;
import com.tnkfactory.framework.vo.ValueObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14000;
import o.access14300;
import o.putChannelInfo;
import o.setPatch;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ AdDetailNewsDialog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdDetailNewsDialog adDetailNewsDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = adDetailNewsDialog;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new d(this.b, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new d(this.b, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r11, r2, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (o.maybeUpdateAnimatable.onExtraCallback(r11, r5, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                ResultState<ValueObject> resultStateReqeustPayForClick = TnkCore.INSTANCE.getServiceTask().reqeustPayForClick(AdDetailNewsDialog.access$getAppId(this.b), AdDetailNewsDialog.access$getAppId(this.b), AdDetailNewsDialog.access$getCnts_type(this.b));
                Context activity = this.b.getActivity();
                if (activity != null) {
                    AdDetailNewsDialog adDetailNewsDialog = this.b;
                    if (resultStateReqeustPayForClick instanceof ResultState.Success) {
                        Settings.INSTANCE.setUserJoined(activity, AdDetailNewsDialog.access$getAppId(adDetailNewsDialog), null);
                        Function1<Boolean, Unit> onRequestPayForClick = adDetailNewsDialog.getOnRequestPayForClick();
                        if (onRequestPayForClick != null) {
                            onRequestPayForClick.invoke(access14000.onNavigationEvent(true));
                        }
                        Bundle arguments = adDetailNewsDialog.getArguments();
                        if (arguments != null) {
                            arguments.putBoolean("pay_yn", true);
                        }
                        setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                        a aVar = new a(activity, adDetailNewsDialog, null);
                        this.a = 1;
                    } else if (resultStateReqeustPayForClick instanceof ResultState.Error) {
                        ResultState.Error error = (ResultState.Error) resultStateReqeustPayForClick;
                        String message = error.getE().getMessage();
                        if (message == null) {
                            message = ErrorCodes.INSTANCE.getErrorMessage(error.getE().getCode());
                        }
                        setPatch setpatchOnExtraCallback2 = putChannelInfo.onExtraCallback();
                        c cVar = new c(activity, message, adDetailNewsDialog, null);
                        this.a = 2;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
