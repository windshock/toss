package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import o.onChildViewAdded;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class onChildViewAdded implements Cloneable {
    private lt46 IAuthTabCallbackDefault;
    private setNotificationUri IAuthTabCallbackStub;
    private lt42 IAuthTabCallback_Parcel;
    private int access000;
    private Resolver asBinder;
    private List<Record>[] asInterface;
    private int getInterfaceDescriptor;
    int onExtraCallback;
    int onExtraCallbackWithResult;
    int onNavigationEvent;
    private lt46 onTransact;
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onWarmupCompleted((Class<?>) onChildViewAdded.class);
    private static final Record[] IAuthTabCallback = new Record[0];

    private boolean onExtraCallbackWithResult(int i) {
        return i == 2 || i == 3 || i == 4 || i == 7 || i == 15 || i == 33 || i == 35 || i == 36;
    }

    private onChildViewAdded(setNotificationUri setnotificationuri) {
        this.asInterface = new List[4];
        this.IAuthTabCallbackStub = setnotificationuri;
    }

    public onChildViewAdded(int i) {
        this(new setNotificationUri(i));
    }

    public onChildViewAdded() {
        this(new setNotificationUri());
    }

    public static onChildViewAdded IAuthTabCallback(Record record) {
        onChildViewAdded onchildviewadded = new onChildViewAdded();
        onchildviewadded.IAuthTabCallbackStub.asInterface(0);
        onchildviewadded.IAuthTabCallbackStub.IAuthTabCallback(7);
        onchildviewadded.onNavigationEvent(record, 0);
        return onchildviewadded;
    }

    onChildViewAdded(getBlob getblob) throws IOException {
        this(new setNotificationUri(getblob));
        boolean z = this.IAuthTabCallbackStub.IAuthTabCallback() == 5;
        boolean zOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(6);
        for (int i = 0; i < 4; i++) {
            try {
                int iOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent(i);
                if (iOnNavigationEvent > 0) {
                    this.asInterface[i] = new ArrayList(iOnNavigationEvent);
                }
                for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
                    int iOnWarmupCompleted = getblob.onWarmupCompleted();
                    Record recordOnExtraCallbackWithResult = Record.onExtraCallbackWithResult(getblob, i, z);
                    this.asInterface[i].add(recordOnExtraCallbackWithResult);
                    if (i == 3) {
                        if (recordOnExtraCallbackWithResult.extraCallback() == 250) {
                            this.onExtraCallbackWithResult = iOnWarmupCompleted;
                            if (i2 != iOnNavigationEvent - 1) {
                                throw new WireParseException("TSIG is not the last record in the message");
                            }
                        }
                        if (recordOnExtraCallbackWithResult.extraCallback() == 24 && ((lt23) recordOnExtraCallbackWithResult).access100() == 0) {
                            this.onNavigationEvent = iOnWarmupCompleted;
                        }
                    }
                }
            } catch (WireParseException e) {
                if (!zOnExtraCallback) {
                    throw e;
                }
            }
        }
        this.getInterfaceDescriptor = getblob.onWarmupCompleted();
    }

    public onChildViewAdded(byte[] bArr) throws IOException {
        this(new getBlob(bArr));
    }

    public void IAuthTabCallback(setNotificationUri setnotificationuri) {
        this.IAuthTabCallbackStub = setnotificationuri;
    }

    public setNotificationUri IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public void onNavigationEvent(Record record, int i) {
        List<Record>[] listArr = this.asInterface;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        this.IAuthTabCallbackStub.onWarmupCompleted(i);
        this.asInterface[i].add(record);
    }

    public boolean IAuthTabCallback(Record record, int i) {
        lt27.onNavigationEvent(i);
        List<Record> list = this.asInterface[i];
        if (list == null || !list.remove(record)) {
            return false;
        }
        this.IAuthTabCallbackStub.onExtraCallbackWithResult(i);
        return true;
    }

    public void onExtraCallback(int i) {
        lt27.onNavigationEvent(i);
        this.asInterface[i] = null;
        this.IAuthTabCallbackStub.onExtraCallback(i, 0);
    }

    public boolean onNavigationEvent(yzp2 yzp2Var, int i, int i2) {
        lt54.IAuthTabCallback(i);
        lt27.onNavigationEvent(i2);
        if (this.asInterface[i2] == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.asInterface[i2].size(); i3++) {
            Record record = this.asInterface[i2].get(i3);
            if (record.extraCallback() == i && yzp2Var.equals(record.access000())) {
                return true;
            }
        }
        return false;
    }

    public Record onNavigationEvent() {
        List<Record> list = this.asInterface[0];
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public lt46 IAuthTabCallbackDefault() {
        int iOnNavigationEvent = this.IAuthTabCallbackStub.onNavigationEvent(3);
        if (iOnNavigationEvent == 0) {
            return null;
        }
        Record record = this.asInterface[3].get(iOnNavigationEvent - 1);
        if (record.type != 250) {
            return null;
        }
        return (lt46) record;
    }

    lt46 onWarmupCompleted() {
        return this.onTransact;
    }

    public boolean onTransact() {
        int i = this.onExtraCallback;
        return i == 3 || i == 1 || i == 4;
    }

    public boolean asBinder() {
        return this.onExtraCallback == 1;
    }

    public fby10 onExtraCallback() {
        for (Record record : onWarmupCompleted(3)) {
            if (record instanceof fby10) {
                return (fby10) record;
            }
        }
        return null;
    }

    public int IAuthTabCallbackStub() {
        int iOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
        fby10 fby10VarOnExtraCallback = onExtraCallback();
        return fby10VarOnExtraCallback != null ? iOnExtraCallback + (fby10VarOnExtraCallback.onExtraCallbackWithResult() << 4) : iOnExtraCallback;
    }

    public List<Record> onWarmupCompleted(int i) {
        lt27.onNavigationEvent(i);
        List<Record> list = this.asInterface[i];
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public List<RRset> onNavigationEvent(int i) {
        lt27.onNavigationEvent(i);
        if (this.asInterface[i] == null) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        for (Record record : this.asInterface[i]) {
            int size = linkedList.size() - 1;
            while (true) {
                if (size >= 0) {
                    RRset rRset = (RRset) linkedList.get(size);
                    if (record.onExtraCallback(rRset)) {
                        rRset.onNavigationEvent(record);
                        break;
                    }
                    size--;
                } else {
                    linkedList.add(new RRset(record));
                    break;
                }
            }
        }
        return linkedList;
    }

    void onWarmupCompleted(deactivate deactivateVar) {
        this.IAuthTabCallbackStub.onNavigationEvent(deactivateVar);
        ryzb ryzbVar = new ryzb();
        int i = 0;
        while (true) {
            List<Record>[] listArr = this.asInterface;
            if (i >= listArr.length) {
                return;
            }
            List<Record> list = listArr[i];
            if (list != null) {
                Iterator<Record> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onExtraCallbackWithResult(deactivateVar, i, ryzbVar);
                }
            }
            i++;
        }
    }

    private int onWarmupCompleted(deactivate deactivateVar, int i, ryzb ryzbVar, int i2) {
        int size = this.asInterface[i].size();
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        int i3 = 0;
        Record record = null;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Record record2 = this.asInterface[i].get(i5);
            if (i != 3 || !(record2 instanceof fby10)) {
                if (record != null && !record2.onWarmupCompleted(record)) {
                    iOnNavigationEvent = deactivateVar.onNavigationEvent();
                    i3 = i4;
                }
                record2.onExtraCallbackWithResult(deactivateVar, i, ryzbVar);
                if (deactivateVar.onNavigationEvent() > i2) {
                    deactivateVar.onExtraCallbackWithResult(iOnNavigationEvent);
                    return size - i3;
                }
                i4++;
                record = record2;
            }
        }
        return size - i4;
    }

    private boolean onNavigationEvent(deactivate deactivateVar, int i) {
        byte[] bArrIAuthTabCallback;
        if (i < 12) {
            return false;
        }
        lt42 lt42Var = this.IAuthTabCallback_Parcel;
        if (lt42Var != null) {
            i -= lt42Var.IAuthTabCallback();
        }
        fby10 fby10VarOnExtraCallback = onExtraCallback();
        if (fby10VarOnExtraCallback != null) {
            bArrIAuthTabCallback = fby10VarOnExtraCallback.IAuthTabCallback(3);
            i -= bArrIAuthTabCallback.length;
        } else {
            bArrIAuthTabCallback = null;
        }
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        this.IAuthTabCallbackStub.onNavigationEvent(deactivateVar);
        ryzb ryzbVar = new ryzb();
        int iOnExtraCallbackWithResult = this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        int i2 = 0;
        int iOnNavigationEvent2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (this.asInterface[i2] != null) {
                int iOnWarmupCompleted = onWarmupCompleted(deactivateVar, i2, ryzbVar, i);
                if (iOnWarmupCompleted != 0 && i2 != 3) {
                    iOnExtraCallbackWithResult = setNotificationUri.onExtraCallback(iOnExtraCallbackWithResult, 6, true);
                    int i3 = iOnNavigationEvent + 4;
                    deactivateVar.onExtraCallbackWithResult(this.IAuthTabCallbackStub.onNavigationEvent(i2) - iOnWarmupCompleted, (i2 << 1) + i3);
                    for (int i4 = i2 + 1; i4 < 3; i4++) {
                        deactivateVar.onExtraCallbackWithResult(0, (i4 << 1) + i3);
                    }
                } else if (i2 == 3) {
                    iOnNavigationEvent2 = this.IAuthTabCallbackStub.onNavigationEvent(i2) - iOnWarmupCompleted;
                }
            }
            i2++;
        }
        if (bArrIAuthTabCallback != null) {
            deactivateVar.onNavigationEvent(bArrIAuthTabCallback);
            iOnNavigationEvent2++;
        }
        if (iOnExtraCallbackWithResult != this.IAuthTabCallbackStub.onExtraCallbackWithResult()) {
            deactivateVar.onExtraCallbackWithResult(iOnExtraCallbackWithResult, iOnNavigationEvent + 2);
        }
        if (iOnNavigationEvent2 != this.IAuthTabCallbackStub.onNavigationEvent(3)) {
            deactivateVar.onExtraCallbackWithResult(iOnNavigationEvent2, iOnNavigationEvent + 10);
        }
        lt42 lt42Var2 = this.IAuthTabCallback_Parcel;
        if (lt42Var2 != null) {
            lt46 lt46VarOnWarmupCompleted = lt42Var2.onWarmupCompleted(this, deactivateVar.IAuthTabCallback(), this.access000, this.IAuthTabCallbackDefault);
            lt46VarOnWarmupCompleted.onExtraCallbackWithResult(deactivateVar, 3, ryzbVar);
            this.onTransact = lt46VarOnWarmupCompleted;
            deactivateVar.onExtraCallbackWithResult(iOnNavigationEvent2 + 1, iOnNavigationEvent + 10);
        }
        return !setNotificationUri.onExtraCallbackWithResult(iOnExtraCallbackWithResult, 6);
    }

    public byte[] access100() {
        deactivate deactivateVar = new deactivate();
        onWarmupCompleted(deactivateVar);
        this.getInterfaceDescriptor = deactivateVar.onNavigationEvent();
        return deactivateVar.IAuthTabCallback();
    }

    public byte[] IAuthTabCallback(int i) {
        deactivate deactivateVar = new deactivate();
        onNavigationEvent(deactivateVar, i);
        this.getInterfaceDescriptor = deactivateVar.onNavigationEvent();
        return deactivateVar.IAuthTabCallback();
    }

    public byte[] IAuthTabCallback(int i, boolean z) throws obyycx1 {
        deactivate deactivateVar = new deactivate();
        if (!onNavigationEvent(deactivateVar, i) && !z) {
            throw new obyycx1(i);
        }
        this.getInterfaceDescriptor = deactivateVar.onNavigationEvent();
        return deactivateVar.IAuthTabCallback();
    }

    public void IAuthTabCallback(lt42 lt42Var, int i, lt46 lt46Var) {
        this.IAuthTabCallback_Parcel = lt42Var;
        this.access000 = i;
        this.IAuthTabCallbackDefault = lt46Var;
    }

    public int asInterface() {
        return this.getInterfaceDescriptor;
    }

    private void onWarmupCompleted(StringBuilder sb, int i) {
        if (i <= 3) {
            for (Record record : onWarmupCompleted(i)) {
                if (i == 0) {
                    sb.append(";;\t");
                    sb.append(record.name);
                    sb.append(", type = ");
                    sb.append(lt54.onNavigationEvent(record.type));
                    sb.append(", class = ");
                    sb.append(ryzbycx.onWarmupCompleted(record.dclass));
                } else if (!(record instanceof fby10)) {
                    sb.append(record);
                }
                sb.append("\n");
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        fby10 fby10VarOnExtraCallback = onExtraCallback();
        if (fby10VarOnExtraCallback != null) {
            sb.append(this.IAuthTabCallbackStub.asBinder(IAuthTabCallbackStub()));
            sb.append("\n\n");
            fby10VarOnExtraCallback.onExtraCallbackWithResult(sb);
            sb.append('\n');
        } else {
            sb.append(this.IAuthTabCallbackStub);
            sb.append('\n');
        }
        if (onTransact()) {
            sb.append(";; TSIG ");
            if (asBinder()) {
                sb.append("ok");
            } else {
                sb.append("invalid");
            }
            sb.append('\n');
        }
        for (int i = 0; i < 4; i++) {
            if (this.IAuthTabCallbackStub.IAuthTabCallback() != 5) {
                sb.append(";; ");
                sb.append(lt27.IAuthTabCallback(i));
                sb.append(":\n");
            } else {
                sb.append(";; ");
                sb.append(lt27.onWarmupCompleted(i));
                sb.append(":\n");
            }
            onWarmupCompleted(sb, i);
            sb.append("\n");
        }
        sb.append(";; Message size: ");
        sb.append(asInterface());
        sb.append(" bytes");
        return sb.toString();
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public onChildViewAdded clone() {
        onChildViewAdded onchildviewadded = (onChildViewAdded) super.clone();
        onchildviewadded.asInterface = new List[this.asInterface.length];
        int i = 0;
        while (true) {
            List<Record>[] listArr = this.asInterface;
            if (i >= listArr.length) {
                break;
            }
            if (listArr[i] != null) {
                onchildviewadded.asInterface[i] = new LinkedList(this.asInterface[i]);
            }
            i++;
        }
        onchildviewadded.IAuthTabCallbackStub = this.IAuthTabCallbackStub.clone();
        lt46 lt46Var = this.IAuthTabCallbackDefault;
        if (lt46Var != null) {
            onchildviewadded.IAuthTabCallbackDefault = (lt46) lt46Var.IAuthTabCallback_Parcel();
        }
        lt46 lt46Var2 = this.onTransact;
        if (lt46Var2 != null) {
            onchildviewadded.onTransact = (lt46) lt46Var2.IAuthTabCallback_Parcel();
        }
        return onchildviewadded;
    }

    public void onWarmupCompleted(Resolver resolver) {
        this.asBinder = resolver;
    }

    boolean onExtraCallbackWithResult(int i, int i2) {
        lt54.IAuthTabCallback(i);
        lt27.onNavigationEvent(i2);
        if (i2 != 2) {
            if (i2 == 3 && (i == 1 || i == 28)) {
                return true;
            }
        } else if (i == 6 || i == 2 || i == 43 || i == 47 || i == 50) {
            return true;
        }
        return !Boolean.parseBoolean(System.getProperty("dnsjava.harden_unknown_additional", "true"));
    }

    public onChildViewAdded onExtraCallbackWithResult(onChildViewAdded onchildviewadded) {
        try {
            return onWarmupCompleted(onchildviewadded, false);
        } catch (WireParseException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[Catch: NameTooLongException -> 0x0185, TRY_LEAVE, TryCatch #4 {NameTooLongException -> 0x0185, blocks: (B:29:0x00e2, B:31:0x00e8, B:33:0x00f2, B:36:0x011b), top: B:153:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public onChildViewAdded onWarmupCompleted(onChildViewAdded onchildviewadded, boolean z) throws WireParseException {
        int i;
        int i2;
        char c;
        List<RRset> list;
        int i3;
        yzp2 yzp2Var;
        RRset rRset;
        CharSequence charSequence;
        RRset rRset2;
        yzp2 yzp2Var2;
        yzp2 yzp2Var3;
        RRset rRset3;
        RRset rRset4;
        onChildViewAdded onchildviewadded2 = this;
        if (IAuthTabCallbackStub() != 0 && IAuthTabCallbackStub() != 3) {
            return onchildviewadded2;
        }
        yzp2 yzp2VarAccess000 = onchildviewadded.onNavigationEvent().access000();
        int i4 = 1;
        List<RRset> listOnNavigationEvent = onchildviewadded2.onNavigationEvent(1);
        List<RRset> listOnNavigationEvent2 = onchildviewadded2.onNavigationEvent(3);
        List<RRset> listOnNavigationEvent3 = onchildviewadded2.onNavigationEvent(2);
        ArrayList[] arrayListArr = new ArrayList[4];
        arrayListArr[1] = new ArrayList();
        arrayListArr[2] = new ArrayList();
        arrayListArr[3] = new ArrayList();
        yzp2 yzp2VarOnNavigationEvent = yzp2VarAccess000;
        int i5 = 0;
        while (true) {
            int i6 = 39;
            int i7 = 5;
            if (i5 < listOnNavigationEvent.size()) {
                RRset rRset5 = listOnNavigationEvent.get(i5);
                if (rRset5.onExtraCallback() == 39 && yzp2VarOnNavigationEvent.IAuthTabCallback(rRset5.asInterface())) {
                    if (rRset5.access100() > i4) {
                        if (z) {
                            throw new WireParseException("Normalization failed in response to <{}/{}/{}> (id {}), found {} entries (instead of just one) in DNAME RRSet <{}/{}>".replace("{}", "%s"));
                        }
                        new Object[]{yzp2VarOnNavigationEvent, lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), Integer.valueOf(IAuthTabCallback().onNavigationEvent()), Integer.valueOf(rRset5.access100()), rRset5.asInterface(), ryzbycx.onWarmupCompleted(rRset5.onTransact())};
                        return null;
                    }
                    if (onchildviewadded.onNavigationEvent().extraCallback() != 39) {
                        arrayListArr[i4].add(rRset5);
                        RRset rRset6 = listOnNavigationEvent.size() >= i5 + 2 ? listOnNavigationEvent.get(i5 + 1) : null;
                        uhzb uhzbVar = (uhzb) rRset5.onWarmupCompleted();
                        if (rRset6 != null) {
                            try {
                                if (rRset6.onExtraCallback() == 5 && rRset6.asInterface().equals(yzp2VarOnNavigationEvent) && yzp2.onWarmupCompleted(rRset6.asInterface().onWarmupCompleted(uhzbVar.access000()), uhzbVar.onExtraCallbackWithResult()).equals(((jcdj) rRset6.onWarmupCompleted()).onNavigationEvent())) {
                                    i3 = i4;
                                    list = listOnNavigationEvent3;
                                } else {
                                    yzp2 yzp2VarOnExtraCallbackWithResult = yzp2VarOnNavigationEvent.onExtraCallbackWithResult(uhzbVar);
                                    charSequence = "%s";
                                    rRset2 = rRset5;
                                    list = listOnNavigationEvent3;
                                    yzp2Var2 = yzp2VarOnNavigationEvent;
                                    try {
                                        arrayListArr[i4].add(new RRset(new jcdj(yzp2VarOnNavigationEvent, uhzbVar.getInterfaceDescriptor(), 0L, yzp2VarOnExtraCallbackWithResult)));
                                        try {
                                            if (onchildviewadded.onNavigationEvent().extraCallback() == 255) {
                                                i5++;
                                                rRset3 = rRset2;
                                                while (i5 < listOnNavigationEvent.size()) {
                                                    try {
                                                        rRset4 = listOnNavigationEvent.get(i5);
                                                    } catch (NameTooLongException e) {
                                                        e = e;
                                                    }
                                                    try {
                                                        if (!rRset4.asInterface().equals(yzp2Var2)) {
                                                            break;
                                                        }
                                                        arrayListArr[1].add(rRset4);
                                                        i5++;
                                                        rRset3 = rRset4;
                                                    } catch (NameTooLongException e2) {
                                                        e = e2;
                                                        rRset3 = rRset4;
                                                        yzp2Var3 = yzp2VarOnExtraCallbackWithResult;
                                                        if (!z) {
                                                        }
                                                    }
                                                }
                                            }
                                            i3 = 1;
                                            onchildviewadded2 = this;
                                            yzp2VarOnNavigationEvent = yzp2VarOnExtraCallbackWithResult;
                                        } catch (NameTooLongException e3) {
                                            e = e3;
                                            rRset3 = rRset2;
                                        }
                                    } catch (NameTooLongException e4) {
                                        e = e4;
                                        yzp2Var3 = yzp2Var2;
                                        rRset3 = rRset2;
                                        if (!z) {
                                        }
                                    }
                                }
                            } catch (NameTooLongException e5) {
                                e = e5;
                                charSequence = "%s";
                                rRset2 = rRset5;
                                yzp2Var2 = yzp2VarOnNavigationEvent;
                                yzp2Var3 = yzp2Var2;
                                rRset3 = rRset2;
                                if (!z) {
                                }
                            }
                        }
                        if (!z) {
                            throw new WireParseException("Normalization failed in response to <{}/{}/{}> (id {}), could not synthesize CNAME for DNAME <{}/{}>".replace("{}", charSequence), e);
                        }
                        new Object[]{yzp2Var3, lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), Integer.valueOf(IAuthTabCallback().onNavigationEvent()), rRset3.asInterface(), ryzbycx.onWarmupCompleted(rRset3.onTransact())};
                        return null;
                    }
                } else {
                    yzp2 yzp2Var4 = yzp2VarOnNavigationEvent;
                    list = listOnNavigationEvent3;
                    if (!yzp2Var4.equals(rRset5.asInterface())) {
                        onNavigationEvent(z, "Ignoring irrelevant RRset <{}/{}/{}> in response to <{}/{}/{}> (id {})", rRset5, yzp2Var4, onchildviewadded);
                        yzp2VarOnNavigationEvent = yzp2Var4;
                    } else if (rRset5.onExtraCallback() == 5 && onchildviewadded.onNavigationEvent().extraCallback() != 5) {
                        if (rRset5.access100() <= 1) {
                            rRset = rRset5;
                        } else {
                            if (z) {
                                throw new WireParseException(String.format("Found {} CNAMEs in <{}/{}> response to <{}/{}/{}> (id {}), removing all but the first".replace("{}", "%s"), Integer.valueOf(rRset5.onWarmupCompleted(false).size()), rRset5.asInterface(), ryzbycx.onWarmupCompleted(rRset5.onTransact()), yzp2Var4, lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), Integer.valueOf(IAuthTabCallback().onNavigationEvent())));
                            }
                            rRset = rRset5;
                            new Object[]{Integer.valueOf(rRset.onWarmupCompleted(false).size()), rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), yzp2Var4, lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), Integer.valueOf(IAuthTabCallback().onNavigationEvent())};
                            List<Record> listOnWarmupCompleted = rRset.onWarmupCompleted(false);
                            for (int i8 = 1; i8 < listOnWarmupCompleted.size(); i8++) {
                                rRset.onExtraCallbackWithResult(listOnWarmupCompleted.get(i5));
                            }
                        }
                        yzp2VarOnNavigationEvent = ((jcdj) rRset.onWarmupCompleted()).onNavigationEvent();
                        int i9 = 1;
                        arrayListArr[1].add(rRset);
                        if (onchildviewadded.onNavigationEvent().extraCallback() == 255) {
                            while (true) {
                                i5 += i9;
                                if (i5 >= listOnNavigationEvent.size()) {
                                    break;
                                }
                                RRset rRset7 = listOnNavigationEvent.get(i5);
                                if (!rRset7.asInterface().equals(yzp2Var4)) {
                                    break;
                                }
                                arrayListArr[i9].add(rRset7);
                                i9 = 1;
                            }
                        }
                    } else {
                        int iExtraCallback = onNavigationEvent().extraCallback();
                        if (iExtraCallback != 255 && rRset5.IAuthTabCallback() != iExtraCallback) {
                            onNavigationEvent(z, "Ignoring irrelevant RRset <{}/{}/{}> in ANSWER section response to <{}/{}/{}> (id {})", rRset5, yzp2Var4, onchildviewadded);
                            i3 = 1;
                        } else {
                            i3 = 1;
                            arrayListArr[1].add(rRset5);
                            if (yzp2Var4.equals(rRset5.asInterface())) {
                                yzp2Var = yzp2Var4;
                                onchildviewadded2 = this;
                                onchildviewadded2.IAuthTabCallback(rRset5, listOnNavigationEvent2, arrayListArr[3]);
                            }
                            yzp2VarOnNavigationEvent = yzp2Var;
                        }
                        yzp2Var = yzp2Var4;
                        onchildviewadded2 = this;
                        yzp2VarOnNavigationEvent = yzp2Var;
                    }
                    i3 = 1;
                    onchildviewadded2 = this;
                }
                i5 += i3;
                i4 = i3;
                listOnNavigationEvent3 = list;
            } else {
                yzp2 yzp2Var5 = yzp2VarOnNavigationEvent;
                int i10 = i4;
                List<RRset> list2 = listOnNavigationEvent3;
                boolean z2 = false;
                for (RRset rRset8 : list2) {
                    int iOnExtraCallback = rRset8.onExtraCallback();
                    if (iOnExtraCallback == i10 || iOnExtraCallback == i7 || iOnExtraCallback == 28 || iOnExtraCallback == i6) {
                        i = i7;
                        i2 = i6;
                        onNavigationEvent(z, "Ignoring forbidden RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {})", rRset8, yzp2Var5, onchildviewadded);
                    } else if (!onchildviewadded2.onExtraCallbackWithResult(rRset8.onExtraCallback(), 2)) {
                        i = i7;
                        i2 = i6;
                        onNavigationEvent(z, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {})", rRset8, yzp2Var5, onchildviewadded);
                    } else {
                        i = i7;
                        i2 = i6;
                        if (rRset8.onExtraCallback() != 2) {
                            c = 2;
                        } else if (!yzp2Var5.IAuthTabCallback(rRset8.asInterface())) {
                            onNavigationEvent(z, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), not a subdomain of the query", rRset8, yzp2Var5, onchildviewadded);
                        } else if (IAuthTabCallbackStub() == 3 || (IAuthTabCallbackStub() == 0 && list2.stream().anyMatch(new Predicate() { // from class: org.xbill.DNS.Message$$ExternalSyntheticLambda0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return onChildViewAdded.onNavigationEvent((RRset) obj);
                            }
                        }) && onchildviewadded2.asInterface[1] == null)) {
                            onNavigationEvent(z, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), NXDOMAIN or NODATA", rRset8, yzp2Var5, onchildviewadded);
                        } else if (z2) {
                            onNavigationEvent(z, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), already seen another NS", rRset8, yzp2Var5, onchildviewadded);
                        } else {
                            c = 2;
                            z2 = true;
                        }
                        arrayListArr[c].add(rRset8);
                        onchildviewadded2.IAuthTabCallback(rRset8, listOnNavigationEvent2, arrayListArr[3]);
                    }
                    i7 = i;
                    i6 = i2;
                    i10 = 1;
                }
                onChildViewAdded onchildviewadded3 = new onChildViewAdded(IAuthTabCallback());
                onchildviewadded3.asInterface[0] = onchildviewadded2.asInterface[0];
                int[] iArr = {1, 2, 3};
                for (int i11 = 0; i11 < 3; i11++) {
                    int i12 = iArr[i11];
                    onchildviewadded3.asInterface[i12] = onchildviewadded2.onExtraCallback(arrayListArr[i12]);
                    setNotificationUri setnotificationuriIAuthTabCallback = onchildviewadded3.IAuthTabCallback();
                    List<Record> list3 = onchildviewadded3.asInterface[i12];
                    setnotificationuriIAuthTabCallback.onExtraCallback(i12, list3 == null ? 0 : list3.size());
                }
                return onchildviewadded3;
            }
        }
    }

    public static /* synthetic */ boolean onNavigationEvent(RRset rRset) {
        return rRset.onExtraCallback() == 6;
    }

    private void onNavigationEvent(boolean z, String str, RRset rRset, yzp2 yzp2Var, onChildViewAdded onchildviewadded) throws WireParseException {
        if (z) {
            throw new WireParseException(String.format(str.replace("{}", "%s"), rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback()), yzp2Var, ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), Integer.valueOf(IAuthTabCallback().onNavigationEvent())));
        }
        new Object[]{rRset.asInterface(), ryzbycx.onWarmupCompleted(rRset.onTransact()), lt54.onNavigationEvent(rRset.onExtraCallback()), yzp2Var, ryzbycx.onWarmupCompleted(onchildviewadded.onNavigationEvent().getInterfaceDescriptor()), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback()), Integer.valueOf(IAuthTabCallback().onNavigationEvent())};
    }

    private List<Record> onExtraCallback(List<RRset> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (RRset rRset : list) {
            arrayList.addAll(rRset.onWarmupCompleted(false));
            arrayList.addAll(rRset.IAuthTabCallbackStubProxy());
        }
        return arrayList;
    }

    private void IAuthTabCallback(RRset rRset, List<RRset> list, List<RRset> list2) {
        if (onExtraCallbackWithResult(rRset.onExtraCallback())) {
            for (Record record : rRset.onWarmupCompleted(false)) {
                for (RRset rRset2 : list) {
                    if (rRset2.asInterface().equals(record.cA_()) && onExtraCallbackWithResult(rRset2.onExtraCallback(), 3)) {
                        list2.add(rRset2);
                    }
                }
            }
        }
    }
}
