package org.xbill.DNS;

import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RelativeNameException extends IllegalArgumentException {
    public RelativeNameException(yzp2 yzp2Var) {
        super("'" + yzp2Var + "' is not an absolute name");
    }

    public RelativeNameException(String str) {
        super(str);
    }
}
