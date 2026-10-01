package o;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TopLayoutDislike21 implements Serializable {
    private static final long serialVersionUID = 1705927040799295880L;
    private final boolean allowTld;
    private final showCountDownText domainValidator;
    private static final Pattern onWarmupCompleted = Pattern.compile("^(.+)@(\\S+)$");
    private static final Pattern asInterface = Pattern.compile("^\\[(.*)\\]$");
    private static final Pattern asBinder = Pattern.compile("^(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"(\\\\\"|[^\"])*\"))(\\.(((\\\\.)|[^\\s\\p{Cntrl}\\(\\)<>@,;:'\\\\\\\"\\.\\[\\]]|')+|(\"(\\\\\"|[^\"])*\")))*$");
    private static final TopLayoutDislike21 onExtraCallbackWithResult = new TopLayoutDislike21(false, false);
    private static final TopLayoutDislike21 onExtraCallback = new TopLayoutDislike21(false, true);
    private static final TopLayoutDislike21 IAuthTabCallback = new TopLayoutDislike21(true, false);
    private static final TopLayoutDislike21 onNavigationEvent = new TopLayoutDislike21(true, true);

    public static TopLayoutDislike21 onExtraCallback() {
        return onExtraCallbackWithResult;
    }

    protected TopLayoutDislike21(boolean z, boolean z2) {
        this.allowTld = z2;
        this.domainValidator = showCountDownText.onExtraCallbackWithResult(z);
    }

    public boolean onNavigationEvent(String str) {
        if (str == null || str.endsWith(".")) {
            return false;
        }
        Matcher matcher = onWarmupCompleted.matcher(str);
        return matcher.matches() && onExtraCallbackWithResult(matcher.group(1)) && IAuthTabCallback(matcher.group(2));
    }

    protected boolean IAuthTabCallback(String str) {
        Matcher matcher = asInterface.matcher(str);
        if (matcher.matches()) {
            return TopLayoutDislike24.onExtraCallback().IAuthTabCallback(matcher.group(1));
        }
        if (this.allowTld) {
            return this.domainValidator.IAuthTabCallback(str) || (!str.startsWith(".") && this.domainValidator.onTransact(str));
        }
        return this.domainValidator.IAuthTabCallback(str);
    }

    protected boolean onExtraCallbackWithResult(String str) {
        if (str == null || str.length() > 64) {
            return false;
        }
        return asBinder.matcher(str).matches();
    }
}
