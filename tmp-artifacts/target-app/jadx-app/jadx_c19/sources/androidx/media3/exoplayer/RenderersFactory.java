package androidx.media3.exoplayer;

import android.os.Handler;
import o.BackdropScaffoldKtExternalSyntheticLambda11;
import o.ChipKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda15;
import o.SelectionManagerExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RenderersFactory {
    default Renderer IAuthTabCallback(Renderer renderer, Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11) {
        return null;
    }

    Renderer[] IAuthTabCallback(Handler handler, DrawerKtExternalSyntheticLambda15 drawerKtExternalSyntheticLambda15, SelectionManagerExternalSyntheticLambda5 selectionManagerExternalSyntheticLambda5, ChipKtExternalSyntheticLambda4 chipKtExternalSyntheticLambda4, BackdropScaffoldKtExternalSyntheticLambda11 backdropScaffoldKtExternalSyntheticLambda11);
}
