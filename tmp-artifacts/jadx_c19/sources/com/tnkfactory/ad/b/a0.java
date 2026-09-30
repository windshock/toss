package com.tnkfactory.ad.b;

import android.content.Context;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.basic.TnkCpsSearchWithFilterDialog;
import com.tnkfactory.ad.off.TnkOffRepository;
import com.tnkfactory.ad.off.data.CpsFavoriteKeywardVo;
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
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class a0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TnkCpsSearchWithFilterDialog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, access13800 access13800Var) {
        super(2, access13800Var);
        this.a = tnkCpsSearchWithFilterDialog;
    }

    public static final Unit a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, ArrayList arrayList) {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkCpsSearchWithFilterDialog), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.basic.c(tnkCpsSearchWithFilterDialog, arrayList, null), 2, (Object) null);
        return Unit.INSTANCE;
    }

    public final access13800 create(Object obj, access13800 access13800Var) {
        return new a0(this.a, access13800Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return new a0(this.a, (access13800) obj2).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.onNavigationEvent(obj);
        TnkOffRepository offRepository = TnkCore.INSTANCE.getOffRepository();
        Context context = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TnkResultTask<ArrayList<CpsFavoriteKeywardVo>> favoriteKeywordList = offRepository.getFavoriteKeywordList(context);
        final TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog = this.a;
        favoriteKeywordList.setOnSuccess(new Function1() { // from class: com.tnkfactory.ad.b.a0$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return a0.a(tnkCpsSearchWithFilterDialog, (ArrayList) obj2);
            }
        }).setOnError(new Function1() { // from class: com.tnkfactory.ad.b.a0$$ExternalSyntheticLambda1
            public final Object invoke(Object obj2) {
                return a0.a(tnkCpsSearchWithFilterDialog, (TnkError) obj2);
            }
        }).execute();
        return Unit.INSTANCE;
    }

    public static final Unit a(TnkCpsSearchWithFilterDialog tnkCpsSearchWithFilterDialog, TnkError tnkError) {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(tnkCpsSearchWithFilterDialog), putChannelInfo.onExtraCallback(), (setRandomHost) null, new com.tnkfactory.ad.basic.d(tnkCpsSearchWithFilterDialog, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
