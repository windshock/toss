package org.xbill.DNS.lookup;

import o.TRANS_V2_Init;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RedirectOverflowException extends TRANS_V2_Init {
    private final int maxRedirects;

    public RedirectOverflowException(int i) {
        super("Refusing to follow more than " + i + " redirects");
        this.maxRedirects = i;
    }

    RedirectOverflowException(String str, int i) {
        super(str);
        this.maxRedirects = i;
    }
}
