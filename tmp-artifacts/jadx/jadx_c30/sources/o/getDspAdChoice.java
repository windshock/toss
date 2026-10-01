package o;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getDspAdChoice extends getHostAppName {
    public static getDspAdChoice onExtraCallback(int i, int i2) {
        return new getDspAdChoice(i, i2, false);
    }

    public getDspAdChoice(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // o.getHostAppName
    protected String onExtraCallback(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + getAdTitleTextView.onNavigationEvent(chars[0]) + "\\u" + getAdTitleTextView.onNavigationEvent(chars[1]);
    }
}
