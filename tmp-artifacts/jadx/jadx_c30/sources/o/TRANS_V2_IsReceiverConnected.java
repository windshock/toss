package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TRANS_V2_IsReceiverConnected {
    private final boolean IAuthTabCallback;
    private final List<yzp2> onExtraCallbackWithResult;
    private final List<Record> onNavigationEvent;
    private final Map<Record, onChildViewAdded> onWarmupCompleted;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TRANS_V2_IsReceiverConnected)) {
            return false;
        }
        TRANS_V2_IsReceiverConnected tRANS_V2_IsReceiverConnected = (TRANS_V2_IsReceiverConnected) obj;
        if (IAuthTabCallback() != tRANS_V2_IsReceiverConnected.IAuthTabCallback()) {
            return false;
        }
        List<Record> listOnWarmupCompleted = onWarmupCompleted();
        List<Record> listOnWarmupCompleted2 = tRANS_V2_IsReceiverConnected.onWarmupCompleted();
        if (listOnWarmupCompleted != null ? !listOnWarmupCompleted.equals(listOnWarmupCompleted2) : listOnWarmupCompleted2 != null) {
            return false;
        }
        List<yzp2> listOnExtraCallback = onExtraCallback();
        List<yzp2> listOnExtraCallback2 = tRANS_V2_IsReceiverConnected.onExtraCallback();
        if (listOnExtraCallback != null ? !listOnExtraCallback.equals(listOnExtraCallback2) : listOnExtraCallback2 != null) {
            return false;
        }
        Map<Record, onChildViewAdded> mapOnNavigationEvent = onNavigationEvent();
        Map<Record, onChildViewAdded> mapOnNavigationEvent2 = tRANS_V2_IsReceiverConnected.onNavigationEvent();
        return mapOnNavigationEvent != null ? mapOnNavigationEvent.equals(mapOnNavigationEvent2) : mapOnNavigationEvent2 == null;
    }

    public int hashCode() {
        int i = IAuthTabCallback() ? 79 : 97;
        List<Record> listOnWarmupCompleted = onWarmupCompleted();
        int iHashCode = listOnWarmupCompleted == null ? 43 : listOnWarmupCompleted.hashCode();
        List<yzp2> listOnExtraCallback = onExtraCallback();
        int iHashCode2 = listOnExtraCallback == null ? 43 : listOnExtraCallback.hashCode();
        Map<Record, onChildViewAdded> mapOnNavigationEvent = onNavigationEvent();
        return ((((((i + 59) * 59) + iHashCode) * 59) + iHashCode2) * 59) + (mapOnNavigationEvent != null ? mapOnNavigationEvent.hashCode() : 43);
    }

    public String toString() {
        return "LookupResult(records=" + onWarmupCompleted() + ", aliases=" + onExtraCallback() + ", queryResponsePairs=" + onNavigationEvent() + ", isAuthenticated=" + IAuthTabCallback() + ")";
    }

    public List<Record> onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public List<yzp2> onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    Map<Record, onChildViewAdded> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    boolean IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Deprecated
    public TRANS_V2_IsReceiverConnected(List<Record> list, List<yzp2> list2) {
        List<yzp2> listUnmodifiableList;
        this.onNavigationEvent = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
        }
        this.onExtraCallbackWithResult = listUnmodifiableList;
        this.onWarmupCompleted = Collections.EMPTY_MAP;
        this.IAuthTabCallback = false;
    }
}
