package o;

import java.math.BigInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya26 extends getLoadingProgressBar {
    @Override // o.setAdCreativeClickListener
    public Object onExtraCallbackWithResult(uh2 uh2Var) {
        return onWarmupCompleted(onExtraCallback(uh2Var));
    }

    protected Number onWarmupCompleted(String str) {
        try {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return Long.valueOf(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigInteger(str);
        }
    }
}
