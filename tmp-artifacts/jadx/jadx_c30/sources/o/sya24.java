package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class sya24 extends getLoadingProgressBar {
    @Override // o.setAdCreativeClickListener
    public Object onExtraCallbackWithResult(uh2 uh2Var) {
        String strOnExtraCallback = onExtraCallback(uh2Var);
        if (".inf".equals(strOnExtraCallback)) {
            return Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if ("-.inf".equals(strOnExtraCallback)) {
            return Double.valueOf(Double.NEGATIVE_INFINITY);
        }
        if (".nan".equals(strOnExtraCallback)) {
            return Double.valueOf(Double.NaN);
        }
        return onWarmupCompleted(strOnExtraCallback);
    }

    protected Object onWarmupCompleted(String str) {
        char cCharAt = str.charAt(0);
        int i = 1;
        if (cCharAt == '-') {
            str = str.substring(1);
            i = -1;
        } else if (cCharAt == '+') {
            str = str.substring(1);
        }
        return Double.valueOf(Double.valueOf(str).doubleValue() * i);
    }
}
