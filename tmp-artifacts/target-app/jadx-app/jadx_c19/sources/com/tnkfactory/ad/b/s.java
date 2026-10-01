package com.tnkfactory.ad.b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.basic.TnkAdMyMenu;
import com.tnkfactory.ad.off.TnkOffNavi;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.rwd.TnkCore;
import com.tnkfactory.ad.rwd.data.TnkResultTask;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class s extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ TnkAdMyMenu b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(TnkAdMyMenu tnkAdMyMenu, View view, access13800 access13800Var) {
        super(2, access13800Var);
        this.b = tnkAdMyMenu;
        this.c = view;
    }

    public static final Unit a(TnkAdMyMenu tnkAdMyMenu, View view, ArrayList arrayList) {
        FragmentActivity appCompatActivity = tnkAdMyMenu.getAppCompatActivity();
        Intrinsics.checkNotNull(appCompatActivity);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.basic.a(tnkAdMyMenu, arrayList, view, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new s(this.b, this.c, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new s(this.b, this.c, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.a;
        try {
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
                this.a = 1;
                obj = offRepository.getMultiCampaignJoinListItem(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            final TnkAdMyMenu tnkAdMyMenu = this.b;
            final View view = this.c;
            TnkResultTask onSuccess = ((TnkResultTask) obj).setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.b.s$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return s.a(tnkAdMyMenu, view, (ArrayList) obj2);
                }
            });
            final TnkAdMyMenu tnkAdMyMenu2 = this.b;
            onSuccess.setOnError(new Function1() { // from class: com.tnkfactory.ad.b.s$$ExternalSyntheticLambda1
                public final Object invoke(Object obj2) {
                    return s.a(tnkAdMyMenu2, (TnkError) obj2);
                }
            }).execute();
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkAdMyMenu tnkAdMyMenu, TnkError tnkError) {
        TnkOffNavi tnkNavi = tnkAdMyMenu.getTnkNavi();
        Intrinsics.checkNotNull(tnkNavi);
        tnkNavi.showLoading(false);
        FragmentActivity appCompatActivity = tnkAdMyMenu.getAppCompatActivity();
        Intrinsics.checkNotNull(appCompatActivity);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new r(tnkAdMyMenu, tnkError, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
