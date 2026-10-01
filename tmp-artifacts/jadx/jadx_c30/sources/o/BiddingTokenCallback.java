package o;

import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class BiddingTokenCallback extends ReferenceForm {
    protected boolean onExtraCallbackWithResult;

    public BiddingTokenCallback(int i, String str, int[] iArr) {
        super(i, str, iArr);
    }

    public BiddingTokenCallback(int i, String str, int[] iArr, boolean z) {
        this(i, str, iArr);
        this.onExtraCallbackWithResult = z;
    }
}
