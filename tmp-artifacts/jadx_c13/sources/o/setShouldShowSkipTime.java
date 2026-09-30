package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShouldShowSkipTime extends setSkipText {
    public static setShouldShowSkipTime onExtraCallbackWithResult(int i, int i2) {
        return new setShouldShowSkipTime(i, i2, false);
    }

    public setShouldShowSkipTime(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // o.setSkipText
    protected String IAuthTabCallback(int i) {
        char[] chars = Character.toChars(i);
        return "\\u" + hideCountDownText.onExtraCallbackWithResult(chars[0]) + "\\u" + hideCountDownText.onExtraCallbackWithResult(chars[1]);
    }
}
