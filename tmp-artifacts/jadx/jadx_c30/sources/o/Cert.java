package o;

import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class Cert {
    private final UST_TRANS_V2_SendReceiverInfo onExtraCallback;
    private final UST_TRANS_V2_SendReceiverInfo onNavigationEvent;

    public enum onNavigationEvent {
        Alias,
        Comment,
        DocumentEnd,
        DocumentStart,
        MappingEnd,
        MappingStart,
        Scalar,
        SequenceEnd,
        SequenceStart,
        StreamEnd,
        StreamStart
    }

    public abstract onNavigationEvent onExtraCallback();

    public Cert(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        this.onNavigationEvent = uST_TRANS_V2_SendReceiverInfo;
        this.onExtraCallback = uST_TRANS_V2_SendReceiverInfo2;
    }

    public String toString() {
        return "<" + getClass().getName() + "(" + onNavigationEvent() + ")>";
    }

    public UST_TRANS_V2_SendReceiverInfo IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public UST_TRANS_V2_SendReceiverInfo IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    protected String onNavigationEvent() {
        return BuildConfig.FLAVOR;
    }

    public boolean onExtraCallback(onNavigationEvent onnavigationevent) {
        return onExtraCallback() == onnavigationevent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cert) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
