package org.xbill.DNS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.lt54;
import o.ryzbycx;
import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RRset implements Serializable, Iterable<Record> {
    private short position;
    private final ArrayList<Record> rrs;
    private final ArrayList<RRSIGRecord> sigs;
    private long ttl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RRset)) {
            return false;
        }
        RRset rRset = (RRset) obj;
        if (!rRset.onWarmupCompleted(this)) {
            return false;
        }
        ArrayList<Record> arrayList = this.rrs;
        ArrayList<Record> arrayList2 = rRset.rrs;
        if (arrayList != null ? !arrayList.equals(arrayList2) : arrayList2 != null) {
            return false;
        }
        ArrayList<RRSIGRecord> arrayList3 = this.sigs;
        ArrayList<RRSIGRecord> arrayList4 = rRset.sigs;
        return arrayList3 != null ? arrayList3.equals(arrayList4) : arrayList4 == null;
    }

    public int hashCode() {
        ArrayList<Record> arrayList = this.rrs;
        int iHashCode = arrayList == null ? 43 : arrayList.hashCode();
        ArrayList<RRSIGRecord> arrayList2 = this.sigs;
        return ((iHashCode + 59) * 59) + (arrayList2 != null ? arrayList2.hashCode() : 43);
    }

    protected boolean onWarmupCompleted(Object obj) {
        return obj instanceof RRset;
    }

    public RRset() {
        this.rrs = new ArrayList<>(1);
        this.sigs = new ArrayList<>(0);
    }

    public RRset(Record record) {
        this();
        onNavigationEvent(record);
    }

    public RRset(RRset rRset) {
        this.rrs = new ArrayList<>(rRset.rrs);
        this.sigs = new ArrayList<>(rRset.sigs);
        this.position = rRset.position;
        this.ttl = rRset.ttl;
    }

    public void onNavigationEvent(Record record) {
        if (record instanceof RRSIGRecord) {
            onExtraCallback((RRset) record, (List<RRset>) this.sigs);
        } else {
            onExtraCallback((RRset) record, (List<RRset>) this.rrs);
        }
    }

    private <X extends Record> void onExtraCallback(X x, List<X> list) {
        if (this.sigs.isEmpty() && this.rrs.isEmpty()) {
            list.add(x);
            this.ttl = x.readTypedObject();
            return;
        }
        onNavigationEvent(x, this.rrs);
        onNavigationEvent(x, this.sigs);
        if (x.readTypedObject() > this.ttl) {
            x = (X) x.IAuthTabCallback_Parcel();
            x.onWarmupCompleted(this.ttl);
        } else if (x.readTypedObject() < this.ttl) {
            this.ttl = x.readTypedObject();
            onExtraCallback(x.readTypedObject(), this.rrs);
            onExtraCallback(x.readTypedObject(), this.sigs);
        }
        if (list.contains(x)) {
            return;
        }
        list.add(x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X extends Record> void onExtraCallback(long j, List<X> list) {
        for (int i = 0; i < list.size(); i++) {
            Record recordIAuthTabCallback_Parcel = ((Record) list.get(i)).IAuthTabCallback_Parcel();
            recordIAuthTabCallback_Parcel.onWarmupCompleted(j);
            list.set(i, recordIAuthTabCallback_Parcel);
        }
    }

    private void onNavigationEvent(Record record, List<? extends Record> list) {
        if (!list.isEmpty() && !record.onWarmupCompleted(list.get(0))) {
            throw new IllegalArgumentException("record does not match rrset");
        }
    }

    public void onExtraCallbackWithResult(Record record) {
        if (record instanceof RRSIGRecord) {
            this.sigs.remove(record);
        } else {
            this.rrs.remove(record);
        }
    }

    public List<Record> onWarmupCompleted(boolean z) {
        if (!z || this.rrs.size() <= 1) {
            return Collections.unmodifiableList(this.rrs);
        }
        ArrayList arrayList = new ArrayList(this.rrs.size());
        if (this.position == Short.MAX_VALUE) {
            this.position = (short) 0;
        }
        short s = this.position;
        this.position = (short) (s + 1);
        int size = s % this.rrs.size();
        ArrayList<Record> arrayList2 = this.rrs;
        arrayList.addAll(arrayList2.subList(size, arrayList2.size()));
        arrayList.addAll(this.rrs.subList(0, size));
        return arrayList;
    }

    public List<Record> IAuthTabCallbackDefault() {
        return onWarmupCompleted(true);
    }

    public List<RRSIGRecord> IAuthTabCallbackStubProxy() {
        return Collections.unmodifiableList(this.sigs);
    }

    public int access100() {
        return this.rrs.size();
    }

    public int IAuthTabCallbackStub() {
        return this.sigs.size();
    }

    public yzp2 asInterface() {
        return onWarmupCompleted().access000();
    }

    public int onExtraCallback() {
        return onWarmupCompleted().cB_();
    }

    public int IAuthTabCallback() {
        return onWarmupCompleted().extraCallback();
    }

    public int onTransact() {
        return onWarmupCompleted().getInterfaceDescriptor();
    }

    public long asBinder() {
        return onWarmupCompleted().readTypedObject();
    }

    public Record onWarmupCompleted() {
        if (!this.rrs.isEmpty()) {
            return this.rrs.get(0);
        }
        if (!this.sigs.isEmpty()) {
            return this.sigs.get(0);
        }
        throw new IllegalStateException("rrset is empty");
    }

    private void onExtraCallbackWithResult(Iterator<? extends Record> it, StringBuilder sb) {
        while (it.hasNext()) {
            Record next = it.next();
            sb.append("[");
            sb.append(next.writeTypedObject());
            sb.append("]");
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
    }

    public String toString() {
        if (this.rrs.isEmpty() && this.sigs.isEmpty()) {
            return "{empty}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append(asInterface());
        sb.append(" ");
        sb.append(asBinder());
        sb.append(" ");
        sb.append(ryzbycx.onWarmupCompleted(onTransact()));
        sb.append(" ");
        sb.append(lt54.onNavigationEvent(onExtraCallback()));
        sb.append(" ");
        onExtraCallbackWithResult(this.rrs.iterator(), sb);
        if (!this.sigs.isEmpty()) {
            sb.append(" sigs: ");
            onExtraCallbackWithResult(this.sigs.iterator(), sb);
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<Record> iterator() {
        return IAuthTabCallbackDefault().iterator();
    }
}
