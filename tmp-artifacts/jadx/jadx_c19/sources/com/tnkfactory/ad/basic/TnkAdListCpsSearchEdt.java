package com.tnkfactory.ad.basic;

import android.view.View;
import com.tnkfactory.ad.R;
import com.tnkfactory.ad.TnkContext;
import com.xwray.groupie.Item;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldSizeKtExternalSyntheticLambda2;
import o.setColorSchemeColors;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdListCpsSearchEdt extends Item<setColorSchemeColors> implements TextFieldScrollKtExternalSyntheticLambda0 {
    public final TnkContext a;
    public final Lazy b;
    public final TextFieldSizeKtExternalSyntheticLambda2 c;

    public TnkAdListCpsSearchEdt(@NotNull TnkContext tnkContext) {
        Intrinsics.checkNotNullParameter(tnkContext, "");
        this.a = tnkContext;
        Lazy lazyOnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsSearchEdt$$ExternalSyntheticLambda2
            public final Object invoke() {
                return TnkAdListCpsSearchEdt.a(this.f$0);
            }
        });
        this.b = lazyOnExtraCallbackWithResult;
        this.c = (TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue();
        ((TextFieldSizeKtExternalSyntheticLambda2) lazyOnExtraCallbackWithResult.getValue()).onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED);
    }

    public static final TextFieldSizeKtExternalSyntheticLambda2 a(TnkAdListCpsSearchEdt tnkAdListCpsSearchEdt) {
        return new TextFieldSizeKtExternalSyntheticLambda2(tnkAdListCpsSearchEdt);
    }

    public static final void b(TnkAdListCpsSearchEdt tnkAdListCpsSearchEdt, View view) {
        tnkAdListCpsSearchEdt.a.getEventHandler().onCpsSearchClick();
    }

    @Override // com.xwray.groupie.Item
    public void bind(@NotNull setColorSchemeColors setcolorschemecolors, int i2) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        View viewOnNavigationEvent = setcolorschemecolors.onNavigationEvent();
        View viewFindViewById = viewOnNavigationEvent.findViewById(R.id.com_tnk_off_curation_ll_cps_my);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsSearchEdt$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListCpsSearchEdt.a(this.f$0, view);
                }
            });
        }
        View viewFindViewById2 = viewOnNavigationEvent.findViewById(R.id.com_tnk_off_curation_ll_cps_search);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.tnkfactory.ad.basic.TnkAdListCpsSearchEdt$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TnkAdListCpsSearchEdt.b(this.f$0, view);
                }
            });
        }
    }

    @Override // com.xwray.groupie.Item
    public int getLayout() {
        return R.layout.com_tnk_offerwall_adlist_cps_search_edt;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.c;
    }

    public final TnkContext getTnkContext() {
        return this.a;
    }

    @Override // com.xwray.groupie.Item
    public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewAttachedToWindow(setcolorschemecolors);
        ((TextFieldSizeKtExternalSyntheticLambda2) this.b.getValue()).onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
    }

    @Override // com.xwray.groupie.Item
    public void onViewDetachedFromWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewDetachedFromWindow(setcolorschemecolors);
        ((TextFieldSizeKtExternalSyntheticLambda2) this.b.getValue()).onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
    }

    public static final void a(TnkAdListCpsSearchEdt tnkAdListCpsSearchEdt, View view) {
        tnkAdListCpsSearchEdt.a.getEventHandler().onCpsMyClick();
    }
}
