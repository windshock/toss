package o;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import o.DrawerStateExternalSyntheticLambda0;
import o.DrawerStateExternalSyntheticLambda2;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface DrawerStateExternalSyntheticLambda2 {
    public static final DrawerStateExternalSyntheticLambda2 onNavigationEvent = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return DrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult();
        }
    };

    DrawerStateExternalSyntheticLambda0[] createExtractors();

    default DrawerStateExternalSyntheticLambda2 onExtraCallback(int i2) {
        return this;
    }

    @Deprecated
    default DrawerStateExternalSyntheticLambda2 onExtraCallback(boolean z) {
        return this;
    }

    default DrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return this;
    }

    static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onExtraCallbackWithResult() {
        return new DrawerStateExternalSyntheticLambda0[0];
    }

    default DrawerStateExternalSyntheticLambda0[] IAuthTabCallback(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
