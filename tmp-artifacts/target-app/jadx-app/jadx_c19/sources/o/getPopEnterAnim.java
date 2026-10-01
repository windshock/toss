package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getPopEnterAnim {
    public static final getPostOnViewCreatedAlpha IAuthTabCallback;
    public static final getPostOnViewCreatedAlpha onExtraCallback;
    public static final getPostOnViewCreatedAlpha onNavigationEvent;
    public static final getPostOnViewCreatedAlpha onWarmupCompleted;

    static {
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha = new getPostOnViewCreatedAlpha("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        onWarmupCompleted = getpostonviewcreatedalpha;
        onExtraCallback = new getPostOnViewCreatedAlpha(getpostonviewcreatedalpha, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        onNavigationEvent = new getPostOnViewCreatedAlpha(getpostonviewcreatedalpha, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        IAuthTabCallback = new getPostOnViewCreatedAlpha("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }

    public static getPostOnViewCreatedAlpha onNavigationEvent() {
        return onExtraCallback;
    }

    public static getPostOnViewCreatedAlpha IAuthTabCallback(String str) throws IllegalArgumentException {
        String str2;
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha = onWarmupCompleted;
        if (getpostonviewcreatedalpha._name.equals(str)) {
            return getpostonviewcreatedalpha;
        }
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha2 = onExtraCallback;
        if (getpostonviewcreatedalpha2._name.equals(str)) {
            return getpostonviewcreatedalpha2;
        }
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha3 = onNavigationEvent;
        if (getpostonviewcreatedalpha3._name.equals(str)) {
            return getpostonviewcreatedalpha3;
        }
        getPostOnViewCreatedAlpha getpostonviewcreatedalpha4 = IAuthTabCallback;
        if (getpostonviewcreatedalpha4._name.equals(str)) {
            return getpostonviewcreatedalpha4;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            str2 = "'" + str + "'";
        }
        throw new IllegalArgumentException("No Base64Variant with name " + str2);
    }
}
