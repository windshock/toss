package o;

import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh6 extends uh30 {
    public static final Pattern onExtraCallbackWithResult = Pattern.compile("^(?:true|false)$");
    public static final Pattern IAuthTabCallback = Pattern.compile("^(-?(0|[1-9][0-9]*)(\\.[0-9]*)?([eE][-+]?[0-9]+)?)|(-?\\.inf)|(\\.nan)$");
    public static final Pattern asBinder = Pattern.compile("^-?(0|[1-9][0-9]*)$");
    public static final Pattern IAuthTabCallbackDefault = Pattern.compile("^(?:null)$");

    @Override // o.uh30
    protected void onExtraCallbackWithResult() {
        uh25 uh25Var = uh25.asInterface;
        onNavigationEvent(uh25Var, uh30.onWarmupCompleted, null);
        onNavigationEvent(uh25.onNavigationEvent, onExtraCallbackWithResult, "tf");
        onNavigationEvent(uh25.IAuthTabCallbackDefault, asBinder, "-0123456789");
        onNavigationEvent(uh25.onWarmupCompleted, IAuthTabCallback, "-0123456789.");
        onNavigationEvent(uh25Var, IAuthTabCallbackDefault, "n\u0000");
        onNavigationEvent(uh25.IAuthTabCallback, uh30.onNavigationEvent, onVideoError.onExtraCallback);
    }
}
