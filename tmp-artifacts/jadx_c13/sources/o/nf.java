package o;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class nf {
    public static final Charset IAuthTabCallback;
    private static final Pattern onExtraCallback = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    private static final char[] onNavigationEvent;
    static final String onWarmupCompleted;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        IAuthTabCallback = charsetForName;
        onWarmupCompleted = charsetForName.name();
        onNavigationEvent = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
