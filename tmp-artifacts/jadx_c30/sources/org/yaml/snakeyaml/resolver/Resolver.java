package org.yaml.snakeyaml.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import o.getBSignCert;
import o.getBSignPriKeyCCFBFH;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Resolver {
    protected Map<Character, List<ResolverTuple>> IAuthTabCallbackStub = new HashMap();
    public static final Pattern onWarmupCompleted = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final Pattern onExtraCallbackWithResult = Pattern.compile("^([-+]?(?:[0-9][0-9_]*)\\.[0-9_]*(?:[eE][-+]?[0-9]+)?|[-+]?(?:[0-9][0-9_]*)(?:[eE][-+]?[0-9]+)|[-+]?\\.[0-9_]+(?:[eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final Pattern onExtraCallback = Pattern.compile("^(?:[-+]?0b_*[0-1][0-1_]*|[-+]?0_*[0-7][0-7_]*|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x_*[0-9a-fA-F][0-9a-fA-F_]*|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final Pattern onNavigationEvent = Pattern.compile("^(?:<<)$");
    public static final Pattern asBinder = Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final Pattern IAuthTabCallback = Pattern.compile("^$");
    public static final Pattern IAuthTabCallbackDefault = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final Pattern asInterface = Pattern.compile("^(?:=)$");
    public static final Pattern onTransact = Pattern.compile("^(?:!|&|\\*)$");

    protected void onWarmupCompleted() {
        onExtraCallbackWithResult(getBSignPriKeyCCFBFH.onNavigationEvent, onWarmupCompleted, "yYnNtTfFoO", 10);
        IAuthTabCallback(getBSignPriKeyCCFBFH.onExtraCallbackWithResult, onExtraCallback, "-+0123456789");
        IAuthTabCallback(getBSignPriKeyCCFBFH.IAuthTabCallback, onExtraCallbackWithResult, "-+0123456789.");
        onExtraCallbackWithResult(getBSignPriKeyCCFBFH.onTransact, onNavigationEvent, "<", 10);
        getBSignPriKeyCCFBFH getbsignprikeyccfbfh = getBSignPriKeyCCFBFH.asInterface;
        onExtraCallbackWithResult(getbsignprikeyccfbfh, asBinder, "~nN\u0000", 10);
        onExtraCallbackWithResult(getbsignprikeyccfbfh, IAuthTabCallback, null, 10);
        onExtraCallbackWithResult(getBSignPriKeyCCFBFH.IAuthTabCallbackStubProxy, IAuthTabCallbackDefault, "0123456789", 50);
        onExtraCallbackWithResult(getBSignPriKeyCCFBFH.getInterfaceDescriptor, onTransact, "!&*", 10);
    }

    public Resolver() {
        onWarmupCompleted();
    }

    public void IAuthTabCallback(getBSignPriKeyCCFBFH getbsignprikeyccfbfh, Pattern pattern, String str) {
        onExtraCallbackWithResult(getbsignprikeyccfbfh, pattern, str, 1024);
    }

    public void onExtraCallbackWithResult(getBSignPriKeyCCFBFH getbsignprikeyccfbfh, Pattern pattern, String str, int i) {
        if (pattern == null) {
            throw new IllegalStateException("No pattern provided for Tag=" + getbsignprikeyccfbfh);
        }
        if (str == null) {
            List<ResolverTuple> arrayList = this.IAuthTabCallbackStub.get(null);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.IAuthTabCallbackStub.put(null, arrayList);
            }
            arrayList.add(new ResolverTuple(getbsignprikeyccfbfh, pattern, i));
            return;
        }
        for (char c : str.toCharArray()) {
            Character chValueOf = Character.valueOf(c);
            if (c == 0) {
                chValueOf = null;
            }
            List<ResolverTuple> arrayList2 = this.IAuthTabCallbackStub.get(chValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                this.IAuthTabCallbackStub.put(chValueOf, arrayList2);
            }
            arrayList2.add(new ResolverTuple(getbsignprikeyccfbfh, pattern, i));
        }
    }

    public getBSignPriKeyCCFBFH IAuthTabCallback(getBSignCert getbsigncert, String str, boolean z) {
        List<ResolverTuple> list;
        if (getbsigncert == getBSignCert.scalar && z) {
            if (str.isEmpty()) {
                list = this.IAuthTabCallbackStub.get((char) 0);
            } else {
                list = this.IAuthTabCallbackStub.get(Character.valueOf(str.charAt(0)));
            }
            if (list != null) {
                for (ResolverTuple resolverTuple : list) {
                    getBSignPriKeyCCFBFH getbsignprikeyccfbfhIAuthTabCallback = resolverTuple.IAuthTabCallback();
                    Pattern patternOnExtraCallback = resolverTuple.onExtraCallback();
                    if (str.length() <= resolverTuple.onNavigationEvent() && patternOnExtraCallback.matcher(str).matches()) {
                        return getbsignprikeyccfbfhIAuthTabCallback;
                    }
                }
            }
            if (this.IAuthTabCallbackStub.containsKey(null)) {
                for (ResolverTuple resolverTuple2 : this.IAuthTabCallbackStub.get(null)) {
                    getBSignPriKeyCCFBFH getbsignprikeyccfbfhIAuthTabCallback2 = resolverTuple2.IAuthTabCallback();
                    Pattern patternOnExtraCallback2 = resolverTuple2.onExtraCallback();
                    if (str.length() <= resolverTuple2.onNavigationEvent() && patternOnExtraCallback2.matcher(str).matches()) {
                        return getbsignprikeyccfbfhIAuthTabCallback2;
                    }
                }
            }
        }
        int i = AnonymousClass1.onExtraCallback[getbsigncert.ordinal()];
        if (i == 1) {
            return getBSignPriKeyCCFBFH.access000;
        }
        if (i == 2) {
            return getBSignPriKeyCCFBFH.access100;
        }
        return getBSignPriKeyCCFBFH.asBinder;
    }

    /* renamed from: org.yaml.snakeyaml.resolver.Resolver$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[getBSignCert.values().length];
            onExtraCallback = iArr;
            try {
                iArr[getBSignCert.scalar.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[getBSignCert.sequence.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
