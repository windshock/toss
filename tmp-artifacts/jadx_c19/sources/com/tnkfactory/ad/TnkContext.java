package com.tnkfactory.ad;

import androidx.fragment.app.FragmentActivity;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.TnkOffNavi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkContext implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final FragmentActivity a;
    public final TextFieldKeyInputExternalSyntheticLambda9 b;
    public AdEventHandler c;
    public TnkOffNavi d;
    public Function1 e;

    public TnkContext(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        this.a = fragmentActivity;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = fragmentActivity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.b = lifecycle;
        this.c = new AdEventHandler(fragmentActivity);
        this.d = new TnkOffNavi(fragmentActivity);
        this.e = new Function1() { // from class: com.tnkfactory.ad.TnkContext$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TnkContext.a(((Integer) obj).intValue());
            }
        };
    }

    public static final Unit a(int i2) {
        return Unit.INSTANCE;
    }

    public final FragmentActivity getActivity() {
        return this.a;
    }

    public final AdEventHandler getEventHandler() {
        return this.c;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.b;
    }

    public final TnkOffNavi getNavi() {
        return this.d;
    }

    public final Function1<Integer, Unit> getOnAdListScroll() {
        return this.e;
    }

    public final void setEventHandler(@NotNull AdEventHandler adEventHandler) {
        Intrinsics.checkNotNullParameter(adEventHandler, "");
        this.c = adEventHandler;
    }

    public final void setNavi(@NotNull TnkOffNavi tnkOffNavi) {
        Intrinsics.checkNotNullParameter(tnkOffNavi, "");
        this.d = tnkOffNavi;
    }

    public final void setOnAdListScroll(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.e = function1;
    }
}
