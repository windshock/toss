package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class GetKMPrikey {
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onWarmupCompleted(GetKMPrikey.class);
    private String IAuthTabCallback;
    private Record asBinder;
    private GetPassword asInterface;
    private final setNotificationUri onExtraCallback;
    private fby10 onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final List<GetKMCert>[] onTransact;

    public GetKMPrikey(setNotificationUri setnotificationuri) {
        this.onNavigationEvent = -1;
        this.onTransact = new List[3];
        this.onExtraCallback = setnotificationuri;
        this.asInterface = GetPassword.UNCHECKED;
    }

    public GetKMPrikey(int i, Record record) {
        this(new setNotificationUri(i));
        this.asBinder = record;
    }

    public GetKMPrikey(onChildViewAdded onchildviewadded) {
        this(onchildviewadded.IAuthTabCallback());
        this.asBinder = onchildviewadded.onNavigationEvent();
        this.onExtraCallbackWithResult = onchildviewadded.onExtraCallback();
        for (int i = 1; i <= 3; i++) {
            Iterator it = onchildviewadded.onNavigationEvent(i).iterator();
            while (it.hasNext()) {
                onExtraCallback(new GetKMCert((RRset) it.next()), i);
            }
        }
    }

    public setNotificationUri onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public Record onExtraCallbackWithResult() {
        return this.asBinder;
    }

    public List<GetKMCert> onExtraCallback(int i) {
        onExtraCallbackWithResult(i);
        List<GetKMCert>[] listArr = this.onTransact;
        int i2 = i - 1;
        if (listArr[i2] == null) {
            listArr[i2] = new LinkedList();
        }
        return this.onTransact[i2];
    }

    private void onExtraCallback(GetKMCert getKMCert, int i) {
        onExtraCallbackWithResult(i);
        if (getKMCert.onExtraCallback() == 41) {
            this.onExtraCallbackWithResult = getKMCert.onWarmupCompleted();
        } else {
            onExtraCallback(i).add(getKMCert);
        }
    }

    private void onExtraCallbackWithResult(int i) {
        if (i <= 0 || i > 3) {
            throw new IllegalArgumentException("Invalid section");
        }
    }

    public List<GetKMCert> onExtraCallbackWithResult(int i, int i2) {
        List<GetKMCert> listOnExtraCallback = onExtraCallback(i);
        if (listOnExtraCallback.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listOnExtraCallback.size());
        for (GetKMCert getKMCert : listOnExtraCallback) {
            if (getKMCert.onExtraCallback() == i2) {
                arrayList.add(getKMCert);
            }
        }
        return arrayList;
    }

    public int IAuthTabCallbackStub() {
        int iOnExtraCallback = this.onExtraCallback.onExtraCallback();
        fby10 fby10Var = this.onExtraCallbackWithResult;
        return fby10Var != null ? iOnExtraCallback + (fby10Var.onExtraCallbackWithResult() << 4) : iOnExtraCallback;
    }

    public GetPassword asInterface() {
        return this.asInterface;
    }

    public void onExtraCallbackWithResult(GetPassword getPassword, int i) {
        onExtraCallbackWithResult(getPassword, i, null);
    }

    public void onExtraCallbackWithResult(GetPassword getPassword, int i, String str) {
        this.asInterface = getPassword;
        this.onNavigationEvent = i;
        this.IAuthTabCallback = str;
    }

    public void onWarmupCompleted(String str) {
        onExtraCallbackWithResult(GetPassword.BOGUS, 6, str);
    }

    public void onNavigationEvent(String str, int i) {
        onExtraCallbackWithResult(GetPassword.BOGUS, i, str);
    }

    public String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public onChildViewAdded IAuthTabCallback() {
        onChildViewAdded onchildviewadded = new onChildViewAdded(this.onExtraCallback.onNavigationEvent());
        setNotificationUri setnotificationuriIAuthTabCallback = onchildviewadded.IAuthTabCallback();
        setnotificationuriIAuthTabCallback.asInterface(this.onExtraCallback.IAuthTabCallback());
        setnotificationuriIAuthTabCallback.onTransact(this.onExtraCallback.onExtraCallback());
        for (int i = 0; i < 16; i++) {
            if (requery.onExtraCallback(i) && this.onExtraCallback.onExtraCallback(i)) {
                setnotificationuriIAuthTabCallback.IAuthTabCallback(i);
            }
        }
        Record record = this.asBinder;
        if (record != null) {
            onchildviewadded.onNavigationEvent(record, 0);
        }
        for (int i2 = 1; i2 <= 3; i2++) {
            for (GetKMCert getKMCert : onExtraCallback(i2)) {
                Iterator it = getKMCert.IAuthTabCallbackDefault().iterator();
                while (it.hasNext()) {
                    onchildviewadded.onNavigationEvent((Record) it.next(), i2);
                }
                Iterator it2 = getKMCert.IAuthTabCallbackStubProxy().iterator();
                while (it2.hasNext()) {
                    onchildviewadded.onNavigationEvent((RRSIGRecord) it2.next(), i2);
                }
            }
        }
        fby10 fby10Var = this.onExtraCallbackWithResult;
        if (fby10Var != null) {
            onchildviewadded.onNavigationEvent(fby10Var, 3);
        }
        return onchildviewadded;
    }

    public int onWarmupCompleted(int i) {
        if (i == 0) {
            return 1;
        }
        List<GetKMCert> listOnExtraCallback = onExtraCallback(i);
        int iAccess100 = 0;
        if (listOnExtraCallback.isEmpty()) {
            return 0;
        }
        Iterator<GetKMCert> it = listOnExtraCallback.iterator();
        while (it.hasNext()) {
            iAccess100 += it.next().access100();
        }
        return iAccess100;
    }

    public GetKMCert onWarmupCompleted(yzp2 yzp2Var, int i, int i2, int i3) {
        onExtraCallbackWithResult(i3);
        for (GetKMCert getKMCert : onExtraCallback(i3)) {
            if (getKMCert.asInterface().equals(yzp2Var) && getKMCert.onExtraCallback() == i && getKMCert.onTransact() == i2) {
                return getKMCert;
            }
        }
        return null;
    }

    public GetKMCert onNavigationEvent(yzp2 yzp2Var, int i, int i2) {
        return onWarmupCompleted(yzp2Var, i, i2, 1);
    }
}
