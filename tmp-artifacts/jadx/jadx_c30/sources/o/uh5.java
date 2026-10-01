package o;

import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh5 extends uh30 {
    public static final Pattern onExtraCallbackWithResult = Pattern.compile("^(?:true|True|TRUE|false|False|FALSE)$");
    public static final Pattern IAuthTabCallback = Pattern.compile("^([-+]?(\\.[0-9]+|[0-9]+(\\.[0-9]*)?)([eE][-+]?[0-9]+)?)|([-+]?\\.(?:inf|Inf|INF))|(\\.(?:nan|NaN|NAN))$");
    public static final Pattern onTransact = Pattern.compile("^([-+]?[0-9]+)|(0o[0-7]+)|(0x[0-9a-fA-F]+)$");
    public static final Pattern asBinder = Pattern.compile("^(?:~|null|Null|NULL| )$");

    @Override // o.uh30
    protected void onExtraCallbackWithResult() {
        uh25 uh25Var = uh25.asInterface;
        onNavigationEvent(uh25Var, uh30.onWarmupCompleted, null);
        onNavigationEvent(uh25.onNavigationEvent, onExtraCallbackWithResult, "tfTF");
        onNavigationEvent(uh25.IAuthTabCallbackDefault, onTransact, "-+0123456789");
        onNavigationEvent(uh25.onWarmupCompleted, IAuthTabCallback, "-+0123456789.");
        onNavigationEvent(uh25Var, asBinder, "n\u0000");
        onNavigationEvent(uh25.IAuthTabCallback, uh30.onNavigationEvent, onVideoError.onExtraCallback);
    }
}
