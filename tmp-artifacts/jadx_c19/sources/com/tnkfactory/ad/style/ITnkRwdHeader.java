package com.tnkfactory.ad.style;

import com.tnkfactory.ad.TnkAdListModel;
import com.tnkfactory.ad.TnkRwdFilter;
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
public abstract class ITnkRwdHeader extends Item<setColorSchemeColors> implements TextFieldScrollKtExternalSyntheticLambda0 {
    private final Lazy lifecycleRegistry$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.tnkfactory.ad.style.ITnkRwdHeader$$ExternalSyntheticLambda0
        public final Object invoke() {
            return ITnkRwdHeader.lifecycleRegistry_delegate$lambda$0(this.f$0);
        }
    });
    private final TextFieldKeyInputExternalSyntheticLambda9 lifecycle = getLifecycleRegistry();

    public ITnkRwdHeader() {
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.INITIALIZED);
    }

    private final TextFieldSizeKtExternalSyntheticLambda2 getLifecycleRegistry() {
        return (TextFieldSizeKtExternalSyntheticLambda2) this.lifecycleRegistry$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldSizeKtExternalSyntheticLambda2 lifecycleRegistry_delegate$lambda$0(ITnkRwdHeader iTnkRwdHeader) {
        return new TextFieldSizeKtExternalSyntheticLambda2(iTnkRwdHeader);
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        return this.lifecycle;
    }

    public abstract void onChangeFilter(@NotNull TnkRwdFilter tnkRwdFilter);

    public abstract void onCreateViewHolder(@NotNull TnkAdListModel tnkAdListModel);

    public abstract void onReceiveMessage();

    @Override // com.xwray.groupie.Item
    public void onViewAttachedToWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewAttachedToWindow(setcolorschemecolors);
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED);
    }

    @Override // com.xwray.groupie.Item
    public void onViewDetachedFromWindow(@NotNull setColorSchemeColors setcolorschemecolors) {
        Intrinsics.checkNotNullParameter(setcolorschemecolors, "");
        super.onViewDetachedFromWindow(setcolorschemecolors);
        getLifecycleRegistry().onWarmupCompleted(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
    }
}
