package o;

import java.util.List;
import o.getOCSPAddress;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getKMPrikeyCCFFHFilename<T> extends getOCSPAddress {
    private final List<T> IAuthTabCallback;
    private final String onWarmupCompleted;

    public getKMPrikeyCCFFHFilename(String str, List<T> list, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        super(uST_TRANS_V2_SendReceiverInfo, uST_TRANS_V2_SendReceiverInfo2);
        this.onWarmupCompleted = str;
        if (list != null && list.size() != 2) {
            throw new UST_TRANS_V2_Init("Two strings must be provided instead of " + list.size());
        }
        this.IAuthTabCallback = list;
    }

    public String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public List<T> onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    @Override // o.getOCSPAddress
    public getOCSPAddress.onWarmupCompleted onWarmupCompleted() {
        return getOCSPAddress.onWarmupCompleted.Directive;
    }
}
