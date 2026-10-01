package o;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.vsb;
import o.vzs;
import o.wqq;
import o.xh;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ww {
    private final String IAuthTabCallbackDefault;
    private final um asInterface;
    private final List<vzs> onNavigationEvent = new ArrayList();
    private static final String[] IAuthTabCallback = {",", ">", "+", "~", " "};
    private static final String[] onWarmupCompleted = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern onExtraCallbackWithResult = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern onExtraCallback = Pattern.compile("([+-])?(\\d+)");

    private ww(String str) {
        oas.onExtraCallbackWithResult(str);
        String strTrim = str.trim();
        this.IAuthTabCallbackDefault = strTrim;
        this.asInterface = new um(strTrim);
    }

    public static vzs onNavigationEvent(String str) {
        try {
            return new ww(str).onWarmupCompleted();
        } catch (IllegalArgumentException e) {
            throw new xh.onExtraCallbackWithResult(e.getMessage(), new Object[0]);
        }
    }

    vzs onWarmupCompleted() throws NumberFormatException {
        this.asInterface.onExtraCallbackWithResult();
        if (this.asInterface.onNavigationEvent(IAuthTabCallback)) {
            this.onNavigationEvent.add(new wqq.asBinder());
            onExtraCallback(this.asInterface.IAuthTabCallback());
        } else {
            asBinder();
        }
        while (!this.asInterface.onWarmupCompleted()) {
            boolean zOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult();
            if (this.asInterface.onNavigationEvent(IAuthTabCallback)) {
                onExtraCallback(this.asInterface.IAuthTabCallback());
            } else if (zOnExtraCallbackWithResult) {
                onExtraCallback(' ');
            } else {
                asBinder();
            }
        }
        if (this.onNavigationEvent.size() == 1) {
            return this.onNavigationEvent.get(0);
        }
        return new vsb.onExtraCallback(this.onNavigationEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(char c) {
        vzs onextracallback;
        vzs vzsVarOnNavigationEvent;
        boolean z;
        vzs onextracallback2;
        vsb.IAuthTabCallback iAuthTabCallback;
        this.asInterface.onExtraCallbackWithResult();
        vzs vzsVarOnNavigationEvent2 = onNavigationEvent(IAuthTabCallbackDefault());
        if (this.onNavigationEvent.size() == 1) {
            onextracallback = this.onNavigationEvent.get(0);
            if ((onextracallback instanceof vsb.IAuthTabCallback) && c != ',') {
                vzsVarOnNavigationEvent = ((vsb.IAuthTabCallback) onextracallback).onNavigationEvent();
                z = true;
            }
            this.onNavigationEvent.clear();
            if (c != ' ') {
                onextracallback2 = new vsb.onExtraCallback(new wqq.onExtraCallback(vzsVarOnNavigationEvent), vzsVarOnNavigationEvent2);
            } else if (c == '>') {
                onextracallback2 = new vsb.onExtraCallback(new wqq.onNavigationEvent(vzsVarOnNavigationEvent), vzsVarOnNavigationEvent2);
            } else if (c == '~') {
                onextracallback2 = new vsb.onExtraCallback(new wqq.onTransact(vzsVarOnNavigationEvent), vzsVarOnNavigationEvent2);
            } else if (c == '+') {
                onextracallback2 = new vsb.onExtraCallback(new wqq.onWarmupCompleted(vzsVarOnNavigationEvent), vzsVarOnNavigationEvent2);
            } else if (c == ',') {
                if (vzsVarOnNavigationEvent instanceof vsb.IAuthTabCallback) {
                    iAuthTabCallback = (vsb.IAuthTabCallback) vzsVarOnNavigationEvent;
                } else {
                    vsb.IAuthTabCallback iAuthTabCallback2 = new vsb.IAuthTabCallback();
                    iAuthTabCallback2.onExtraCallbackWithResult(vzsVarOnNavigationEvent);
                    iAuthTabCallback = iAuthTabCallback2;
                }
                iAuthTabCallback.onExtraCallbackWithResult(vzsVarOnNavigationEvent2);
                onextracallback2 = iAuthTabCallback;
            } else {
                throw new xh.onExtraCallbackWithResult("Unknown combinator: " + c, new Object[0]);
            }
            if (z) {
                onextracallback = onextracallback2;
            } else {
                ((vsb.IAuthTabCallback) onextracallback).onNavigationEvent(onextracallback2);
            }
            this.onNavigationEvent.add(onextracallback);
        }
        onextracallback = new vsb.onExtraCallback(this.onNavigationEvent);
        vzsVarOnNavigationEvent = onextracallback;
        z = false;
        this.onNavigationEvent.clear();
        if (c != ' ') {
        }
        if (z) {
        }
        this.onNavigationEvent.add(onextracallback);
    }

    private String IAuthTabCallbackDefault() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        while (!this.asInterface.onWarmupCompleted()) {
            if (this.asInterface.onTransact("(")) {
                sbIAuthTabCallback.append("(");
                sbIAuthTabCallback.append(this.asInterface.onExtraCallbackWithResult('(', ')'));
                sbIAuthTabCallback.append(")");
            } else if (this.asInterface.onTransact("[")) {
                sbIAuthTabCallback.append("[");
                sbIAuthTabCallback.append(this.asInterface.onExtraCallbackWithResult('[', ']'));
                sbIAuthTabCallback.append("]");
            } else if (this.asInterface.onNavigationEvent(IAuthTabCallback)) {
                if (sbIAuthTabCallback.length() > 0) {
                    break;
                }
                this.asInterface.IAuthTabCallback();
            } else {
                sbIAuthTabCallback.append(this.asInterface.IAuthTabCallback());
            }
        }
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    private void asBinder() throws NumberFormatException {
        if (this.asInterface.onExtraCallback("#")) {
            onNavigationEvent();
            return;
        }
        if (this.asInterface.onExtraCallback(".")) {
            onExtraCallbackWithResult();
            return;
        }
        if (this.asInterface.asBinder() || this.asInterface.onTransact("*|")) {
            IAuthTabCallbackStub();
            return;
        }
        if (this.asInterface.onTransact("[")) {
            IAuthTabCallback();
            return;
        }
        if (this.asInterface.onExtraCallback("*")) {
            onExtraCallback();
            return;
        }
        if (this.asInterface.onExtraCallback(":lt(")) {
            IAuthTabCallbackStubProxy();
            return;
        }
        if (this.asInterface.onExtraCallback(":gt(")) {
            access000();
            return;
        }
        if (this.asInterface.onExtraCallback(":eq(")) {
            access100();
            return;
        }
        if (this.asInterface.onTransact(":has(")) {
            IAuthTabCallback_Parcel();
            return;
        }
        if (this.asInterface.onTransact(":contains(")) {
            onWarmupCompleted(false);
            return;
        }
        if (this.asInterface.onTransact(":containsOwn(")) {
            onWarmupCompleted(true);
            return;
        }
        if (this.asInterface.onTransact(":containsData(")) {
            onTransact();
            return;
        }
        if (this.asInterface.onTransact(":matches(")) {
            IAuthTabCallback(false);
            return;
        }
        if (this.asInterface.onTransact(":matchesOwn(")) {
            IAuthTabCallback(true);
            return;
        }
        if (this.asInterface.onTransact(":not(")) {
            getInterfaceDescriptor();
            return;
        }
        if (this.asInterface.onExtraCallback(":nth-child(")) {
            onExtraCallbackWithResult(false, false);
            return;
        }
        if (this.asInterface.onExtraCallback(":nth-last-child(")) {
            onExtraCallbackWithResult(true, false);
            return;
        }
        if (this.asInterface.onExtraCallback(":nth-of-type(")) {
            onExtraCallbackWithResult(false, true);
            return;
        }
        if (this.asInterface.onExtraCallback(":nth-last-of-type(")) {
            onExtraCallbackWithResult(true, true);
            return;
        }
        if (this.asInterface.onExtraCallback(":first-child")) {
            this.onNavigationEvent.add(new vzs.onActivityLayout());
            return;
        }
        if (this.asInterface.onExtraCallback(":last-child")) {
            this.onNavigationEvent.add(new vzs.onMinimized());
            return;
        }
        if (this.asInterface.onExtraCallback(":first-of-type")) {
            this.onNavigationEvent.add(new vzs.onMessageChannelReady());
            return;
        }
        if (this.asInterface.onExtraCallback(":last-of-type")) {
            this.onNavigationEvent.add(new vzs.onActivityResized());
            return;
        }
        if (this.asInterface.onExtraCallback(":only-child")) {
            this.onNavigationEvent.add(new vzs.ICustomTabsCallbackDefault());
            return;
        }
        if (this.asInterface.onExtraCallback(":only-of-type")) {
            this.onNavigationEvent.add(new vzs.extraCommand());
            return;
        }
        if (this.asInterface.onExtraCallback(":empty")) {
            this.onNavigationEvent.add(new vzs.onPostMessage());
        } else if (this.asInterface.onExtraCallback(":root")) {
            this.onNavigationEvent.add(new vzs.ICustomTabsCallback_Parcel());
        } else {
            if (this.asInterface.onExtraCallback(":matchText")) {
                this.onNavigationEvent.add(new vzs.ICustomTabsService());
                return;
            }
            throw new xh.onExtraCallbackWithResult("Could not parse query '%s': unexpected token at '%s'", this.IAuthTabCallbackDefault, this.asInterface.IAuthTabCallbackDefault());
        }
    }

    private void onNavigationEvent() {
        String strOnNavigationEvent = this.asInterface.onNavigationEvent();
        oas.onExtraCallbackWithResult(strOnNavigationEvent);
        this.onNavigationEvent.add(new vzs.writeTypedObject(strOnNavigationEvent));
    }

    private void onExtraCallbackWithResult() {
        String strOnNavigationEvent = this.asInterface.onNavigationEvent();
        oas.onExtraCallbackWithResult(strOnNavigationEvent);
        this.onNavigationEvent.add(new vzs.IAuthTabCallbackStubProxy(strOnNavigationEvent.trim()));
    }

    private void IAuthTabCallbackStub() {
        String strOnWarmupCompleted = oiz.onWarmupCompleted(this.asInterface.onExtraCallback());
        oas.onExtraCallbackWithResult(strOnWarmupCompleted);
        if (strOnWarmupCompleted.startsWith("*|")) {
            this.onNavigationEvent.add(new vsb.IAuthTabCallback(new vzs.newSessionWithExtras(strOnWarmupCompleted.substring(2)), new vzs.newSession(strOnWarmupCompleted.replace("*|", ":"))));
        } else {
            if (strOnWarmupCompleted.contains("|")) {
                strOnWarmupCompleted = strOnWarmupCompleted.replace("|", ":");
            }
            this.onNavigationEvent.add(new vzs.newSessionWithExtras(strOnWarmupCompleted));
        }
    }

    private void IAuthTabCallback() {
        um umVar = new um(this.asInterface.onExtraCallbackWithResult('[', ']'));
        String strIAuthTabCallback = umVar.IAuthTabCallback(onWarmupCompleted);
        oas.onExtraCallbackWithResult(strIAuthTabCallback);
        umVar.onExtraCallbackWithResult();
        if (umVar.onWarmupCompleted()) {
            if (strIAuthTabCallback.startsWith("^")) {
                this.onNavigationEvent.add(new vzs.IAuthTabCallback(strIAuthTabCallback.substring(1)));
                return;
            } else {
                this.onNavigationEvent.add(new vzs.onNavigationEvent(strIAuthTabCallback));
                return;
            }
        }
        if (umVar.onExtraCallback("=")) {
            this.onNavigationEvent.add(new vzs.onWarmupCompleted(strIAuthTabCallback, umVar.IAuthTabCallbackDefault()));
            return;
        }
        if (umVar.onExtraCallback("!=")) {
            this.onNavigationEvent.add(new vzs.IAuthTabCallbackDefault(strIAuthTabCallback, umVar.IAuthTabCallbackDefault()));
            return;
        }
        if (umVar.onExtraCallback("^=")) {
            this.onNavigationEvent.add(new vzs.asInterface(strIAuthTabCallback, umVar.IAuthTabCallbackDefault()));
            return;
        }
        if (umVar.onExtraCallback("$=")) {
            this.onNavigationEvent.add(new vzs.IAuthTabCallbackStub(strIAuthTabCallback, umVar.IAuthTabCallbackDefault()));
        } else if (umVar.onExtraCallback("*=")) {
            this.onNavigationEvent.add(new vzs.onTransact(strIAuthTabCallback, umVar.IAuthTabCallbackDefault()));
        } else {
            if (umVar.onExtraCallback("~=")) {
                this.onNavigationEvent.add(new vzs.asBinder(strIAuthTabCallback, Pattern.compile(umVar.IAuthTabCallbackDefault())));
                return;
            }
            throw new xh.onExtraCallbackWithResult("Could not parse attribute query '%s': unexpected token at '%s'", this.IAuthTabCallbackDefault, umVar.IAuthTabCallbackDefault());
        }
    }

    private void onExtraCallback() {
        this.onNavigationEvent.add(new vzs.onExtraCallback());
    }

    private void IAuthTabCallbackStubProxy() {
        this.onNavigationEvent.add(new vzs.readTypedObject(asInterface()));
    }

    private void access000() {
        this.onNavigationEvent.add(new vzs.extraCallbackWithResult(asInterface()));
    }

    private void access100() {
        this.onNavigationEvent.add(new vzs.extraCallback(asInterface()));
    }

    private void onExtraCallbackWithResult(boolean z, boolean z2) throws NumberFormatException {
        String strOnWarmupCompleted = oiz.onWarmupCompleted(this.asInterface.onWarmupCompleted(")"));
        Matcher matcher = onExtraCallbackWithResult.matcher(strOnWarmupCompleted);
        Matcher matcher2 = onExtraCallback.matcher(strOnWarmupCompleted);
        int i = 2;
        int i2 = 1;
        if (!"odd".equals(strOnWarmupCompleted)) {
            if ("even".equals(strOnWarmupCompleted)) {
                i2 = 0;
            } else if (matcher.matches()) {
                int i3 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", _UrlKt.FRAGMENT_ENCODE_SET)) : 1;
                i2 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", _UrlKt.FRAGMENT_ENCODE_SET)) : 0;
                i = i3;
            } else if (matcher2.matches()) {
                i2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", _UrlKt.FRAGMENT_ENCODE_SET));
                i = 0;
            } else {
                throw new xh.onExtraCallbackWithResult("Could not parse nth-index '%s': unexpected format", strOnWarmupCompleted);
            }
        }
        if (z2) {
            if (z) {
                this.onNavigationEvent.add(new vzs.ICustomTabsCallbackStub(i, i2));
                return;
            } else {
                this.onNavigationEvent.add(new vzs.onUnminimized(i, i2));
                return;
            }
        }
        if (z) {
            this.onNavigationEvent.add(new vzs.onRelationshipValidationResult(i, i2));
        } else {
            this.onNavigationEvent.add(new vzs.ICustomTabsCallbackStubProxy(i, i2));
        }
    }

    private int asInterface() {
        String strTrim = this.asInterface.onWarmupCompleted(")").trim();
        oas.onExtraCallback(nfe.IAuthTabCallback(strTrim), "Index must be numeric");
        return Integer.parseInt(strTrim);
    }

    private void IAuthTabCallback_Parcel() {
        this.asInterface.onNavigationEvent(":has");
        String strOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult('(', ')');
        oas.onExtraCallback(strOnExtraCallbackWithResult, ":has(selector) subselect must not be empty");
        this.onNavigationEvent.add(new wqq.onExtraCallbackWithResult(onNavigationEvent(strOnExtraCallbackWithResult)));
    }

    private void onWarmupCompleted(boolean z) {
        this.asInterface.onNavigationEvent(z ? ":containsOwn" : ":contains");
        String strIAuthTabCallback = um.IAuthTabCallback(this.asInterface.onExtraCallbackWithResult('(', ')'));
        oas.onExtraCallback(strIAuthTabCallback, ":contains(text) query must not be empty");
        if (z) {
            this.onNavigationEvent.add(new vzs.getInterfaceDescriptor(strIAuthTabCallback));
        } else {
            this.onNavigationEvent.add(new vzs.access000(strIAuthTabCallback));
        }
    }

    private void onTransact() {
        this.asInterface.onNavigationEvent(":containsData");
        String strIAuthTabCallback = um.IAuthTabCallback(this.asInterface.onExtraCallbackWithResult('(', ')'));
        oas.onExtraCallback(strIAuthTabCallback, ":containsData(text) query must not be empty");
        this.onNavigationEvent.add(new vzs.access100(strIAuthTabCallback));
    }

    private void IAuthTabCallback(boolean z) {
        this.asInterface.onNavigationEvent(z ? ":matchesOwn" : ":matches");
        String strOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult('(', ')');
        oas.onExtraCallback(strOnExtraCallbackWithResult, ":matches(regex) query must not be empty");
        if (z) {
            this.onNavigationEvent.add(new vzs.isEngagementSignalsApiAvailable(Pattern.compile(strOnExtraCallbackWithResult)));
        } else {
            this.onNavigationEvent.add(new vzs.mayLaunchUrl(Pattern.compile(strOnExtraCallbackWithResult)));
        }
    }

    private void getInterfaceDescriptor() {
        this.asInterface.onNavigationEvent(":not");
        String strOnExtraCallbackWithResult = this.asInterface.onExtraCallbackWithResult('(', ')');
        oas.onExtraCallback(strOnExtraCallbackWithResult, ":not(selector) subselect must not be empty");
        this.onNavigationEvent.add(new wqq.IAuthTabCallback(onNavigationEvent(strOnExtraCallbackWithResult)));
    }

    public String toString() {
        return this.IAuthTabCallbackDefault;
    }
}
