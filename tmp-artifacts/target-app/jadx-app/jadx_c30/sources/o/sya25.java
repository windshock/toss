package o;

import j$.util.Base64;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya25 extends getLoadingProgressBar {
    @Override // o.setAdCreativeClickListener
    public Object onExtraCallbackWithResult(uh2 uh2Var) {
        return Base64.getDecoder().decode(onExtraCallback(uh2Var).replaceAll("\\s", BuildConfig.FLAVOR));
    }
}
