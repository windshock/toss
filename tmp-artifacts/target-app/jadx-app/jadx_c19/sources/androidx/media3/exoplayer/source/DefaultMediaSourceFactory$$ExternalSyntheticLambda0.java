package androidx.media3.exoplayer.source;

import o.BackdropScaffoldKtExternalSyntheticLambda9;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerStateExternalSyntheticLambda0;
import o.DrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class DefaultMediaSourceFactory$$ExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda2 {
    public final /* synthetic */ BackdropScaffoldKtExternalSyntheticLambda9 f$0;
    public final /* synthetic */ BasicTextContextMenuProviderKtExternalSyntheticLambda4 f$1;

    public /* synthetic */ DefaultMediaSourceFactory$$ExternalSyntheticLambda0(BackdropScaffoldKtExternalSyntheticLambda9 backdropScaffoldKtExternalSyntheticLambda9, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        this.f$0 = backdropScaffoldKtExternalSyntheticLambda9;
        this.f$1 = basicTextContextMenuProviderKtExternalSyntheticLambda4;
    }

    @Override // o.DrawerStateExternalSyntheticLambda2
    public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
        return BackdropScaffoldKtExternalSyntheticLambda9.IAuthTabCallback(this.f$0, this.f$1);
    }
}
