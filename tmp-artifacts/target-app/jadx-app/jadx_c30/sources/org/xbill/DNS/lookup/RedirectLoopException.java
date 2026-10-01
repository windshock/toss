package org.xbill.DNS.lookup;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RedirectLoopException extends RedirectOverflowException {
    public RedirectLoopException(int i) {
        super("Detected a redirect loop", i);
    }
}
