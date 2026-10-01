package o;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DividerKtExternalSyntheticLambda0 extends AppBarKtExternalSyntheticLambda10 {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public DividerKtExternalSyntheticLambda0(Throwable th, @Nullable AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5, @Nullable Surface surface) {
        super(th, appBarKtExternalSyntheticLambda5);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
