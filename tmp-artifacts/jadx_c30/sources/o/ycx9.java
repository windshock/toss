package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import o.ycx9;
import org.xbill.DNS.RRSIGRecord;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ycx9 implements Serializable, Iterable<RRset> {
    private final Map<yzp2, Object> data;
    private boolean hasWild;
    private RRset nsRRset;
    private yzp2 origin;
    private Object originNode;
    private final ReentrantReadWriteLock.ReadLock readLock;
    private final ReentrantReadWriteLock readWriteLock;
    private lt26 soaRecord;
    private final ReentrantReadWriteLock.WriteLock writeLock;

    public static /* synthetic */ RRset onExtraCallback(ycx9 ycx9Var) {
        return new RRset(ycx9Var.nsRRset);
    }

    public RRset onExtraCallbackWithResult() {
        return (RRset) onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return ycx9.onExtraCallback(this.f$0);
            }
        });
    }

    public lt26 IAuthTabCallback() {
        return this.soaRecord;
    }

    @Override // java.lang.Iterable
    public Iterator<RRset> iterator() {
        return new onExtraCallback(false);
    }

    public Iterator<RRset> onWarmupCompleted() {
        return new onExtraCallback(true);
    }

    public static /* synthetic */ void onExtraCallback(ycx9 ycx9Var, yzp2 yzp2Var, int i, Record record, int i2) {
        RRset rRsetOnExtraCallback = ycx9Var.onExtraCallback(yzp2Var, i);
        if (rRsetOnExtraCallback == null) {
            ycx9Var.onWarmupCompleted(yzp2Var, new RRset(record));
            return;
        }
        if (i2 == 6) {
            rRsetOnExtraCallback.onExtraCallbackWithResult(ycx9Var.soaRecord);
            ycx9Var.soaRecord = (lt26) record;
        }
        rRsetOnExtraCallback.onNavigationEvent(record);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ycx9 ycx9Var, yzp2 yzp2Var, int i, Record record) {
        RRset rRsetOnExtraCallback = ycx9Var.onExtraCallback(yzp2Var, i);
        if (rRsetOnExtraCallback == null) {
            return;
        }
        if (i == 2 && rRsetOnExtraCallback.access100() == 1) {
            throw new IllegalArgumentException("Cannot remove all NS");
        }
        if (rRsetOnExtraCallback.access100() + rRsetOnExtraCallback.IAuthTabCallbackStub() > 1) {
            rRsetOnExtraCallback.onExtraCallbackWithResult(record);
        } else {
            ycx9Var.IAuthTabCallback(yzp2Var, i);
        }
    }

    public static /* synthetic */ void IAuthTabCallback(ycx9 ycx9Var, yzp2 yzp2Var, RRset rRset, int i) {
        ycx9Var.onWarmupCompleted(yzp2Var, rRset);
        if (i == 6) {
            ycx9Var.soaRecord = rRset.onWarmupCompleted();
        }
    }

    public RRset onExtraCallbackWithResult(final yzp2 yzp2Var, final int i) {
        if (yzp2Var == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        lt54.IAuthTabCallback(i);
        return (RRset) onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ycx9.onNavigationEvent(this.f$0, yzp2Var, i);
            }
        });
    }

    public static /* synthetic */ RRset onNavigationEvent(ycx9 ycx9Var, yzp2 yzp2Var, int i) {
        RRset rRsetOnExtraCallback = ycx9Var.onExtraCallback(yzp2Var, i);
        if (rRsetOnExtraCallback == null) {
            return null;
        }
        return new RRset(rRsetOnExtraCallback);
    }

    public lt38 onNavigationEvent(final yzp2 yzp2Var, final int i) {
        if (yzp2Var == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        lt54.IAuthTabCallback(i);
        if (!yzp2Var.IAuthTabCallback(this.origin)) {
            return lt38.onExtraCallback(lt39.NXDOMAIN);
        }
        return (lt38) onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.onWarmupCompleted(yzp2Var, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T onWarmupCompleted(Supplier<T> supplier) {
        this.readLock.lock();
        try {
            return supplier.get();
        } finally {
            this.readLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(Runnable runnable) {
        this.writeLock.lock();
        try {
            runnable.run();
        } finally {
            this.writeLock.unlock();
        }
    }

    private Object onExtraCallback(yzp2 yzp2Var) {
        return this.data.get(yzp2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<RRset> onWarmupCompleted(Object obj) {
        if (obj instanceof List) {
            return (List) obj;
        }
        return Collections.singletonList((RRset) obj);
    }

    private RRset IAuthTabCallback(Object obj, int i) {
        if (i == 255) {
            throw new IllegalArgumentException("Cannot lookup an exact match for type ANY");
        }
        if (obj instanceof List) {
            for (RRset rRset : (List) obj) {
                if (rRset.onExtraCallback() == i) {
                    return rRset;
                }
            }
            return null;
        }
        RRset rRset2 = (RRset) obj;
        if (rRset2.onExtraCallback() == i) {
            return rRset2;
        }
        return null;
    }

    private RRset onExtraCallback(yzp2 yzp2Var, int i) {
        Object objOnExtraCallback = onExtraCallback(yzp2Var);
        if (objOnExtraCallback == null) {
            return null;
        }
        return IAuthTabCallback(objOnExtraCallback, i);
    }

    private void onWarmupCompleted(yzp2 yzp2Var, RRset rRset) {
        if (!this.hasWild && yzp2Var.onWarmupCompleted()) {
            this.hasWild = true;
        }
        Object obj = this.data.get(yzp2Var);
        if (obj == null) {
            this.data.put(yzp2Var, rRset);
            return;
        }
        int iOnExtraCallback = rRset.onExtraCallback();
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                if (((RRset) list.get(i)).onExtraCallback() == iOnExtraCallback) {
                    list.set(i, rRset);
                    return;
                }
            }
            list.add(rRset);
            return;
        }
        RRset rRset2 = (RRset) obj;
        if (rRset2.onExtraCallback() == iOnExtraCallback) {
            this.data.put(yzp2Var, rRset);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(rRset2);
        linkedList.add(rRset);
        this.data.put(yzp2Var, linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(yzp2 yzp2Var, int i) {
        if (i == 6) {
            throw new IllegalArgumentException("Cannot remove SOA");
        }
        if (i == 2) {
            throw new IllegalArgumentException("Cannot remove all NS");
        }
        Object obj = this.data.get(yzp2Var);
        if (obj != null) {
            if (obj instanceof List) {
                List list = (List) obj;
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (((RRset) list.get(i2)).onExtraCallback() == i) {
                        list.remove(i2);
                        break;
                    }
                    i2++;
                }
                if (list.isEmpty()) {
                    this.data.remove(yzp2Var);
                    return;
                }
                return;
            }
            if (((RRset) obj).onExtraCallback() != i) {
                return;
            }
            this.data.remove(yzp2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public lt38 onWarmupCompleted(yzp2 yzp2Var, int i) {
        yzp2 yzp2Var2;
        RRset rRsetIAuthTabCallback;
        int iIAuthTabCallback = yzp2Var.IAuthTabCallback();
        int iIAuthTabCallback2 = this.origin.IAuthTabCallback();
        int i2 = iIAuthTabCallback2;
        while (true) {
            if (i2 <= iIAuthTabCallback) {
                boolean z = i2 == iIAuthTabCallback2;
                i = i2 == iIAuthTabCallback ? 1 : 0;
                if (z) {
                    yzp2Var2 = this.origin;
                } else {
                    yzp2Var2 = i != 0 ? yzp2Var : new yzp2(yzp2Var, iIAuthTabCallback - i2);
                }
                Object objOnExtraCallback = onExtraCallback(yzp2Var2);
                if (objOnExtraCallback != null) {
                    if (!z && (rRsetIAuthTabCallback = IAuthTabCallback(objOnExtraCallback, 2)) != null) {
                        return lt38.IAuthTabCallback(lt39.DELEGATION, rRsetIAuthTabCallback);
                    }
                    if (i != 0 && i == 255) {
                        lt38 lt38VarOnExtraCallback = lt38.onExtraCallback(lt39.SUCCESSFUL);
                        Iterator<RRset> it = onWarmupCompleted(objOnExtraCallback).iterator();
                        while (it.hasNext()) {
                            lt38VarOnExtraCallback.IAuthTabCallback(it.next());
                        }
                        return lt38VarOnExtraCallback;
                    }
                    if (i != 0) {
                        RRset rRsetIAuthTabCallback2 = IAuthTabCallback(objOnExtraCallback, i);
                        if (rRsetIAuthTabCallback2 != null) {
                            return lt38.IAuthTabCallback(lt39.SUCCESSFUL, rRsetIAuthTabCallback2);
                        }
                        RRset rRsetIAuthTabCallback3 = IAuthTabCallback(objOnExtraCallback, 5);
                        if (rRsetIAuthTabCallback3 != null) {
                            return lt38.IAuthTabCallback(lt39.CNAME, rRsetIAuthTabCallback3);
                        }
                    } else {
                        RRset rRsetIAuthTabCallback4 = IAuthTabCallback(objOnExtraCallback, 39);
                        if (rRsetIAuthTabCallback4 != null) {
                            return lt38.IAuthTabCallback(lt39.DNAME, rRsetIAuthTabCallback4);
                        }
                    }
                    if (i != 0) {
                        return lt38.onExtraCallback(lt39.NXRRSET);
                    }
                }
                i2++;
            } else {
                if (this.hasWild) {
                    while (i < iIAuthTabCallback - iIAuthTabCallback2) {
                        i++;
                        Object objOnExtraCallback2 = onExtraCallback(yzp2Var.onExtraCallback(i));
                        if (objOnExtraCallback2 != null) {
                            if (i == 255) {
                                lt38 lt38VarOnExtraCallback2 = lt38.onExtraCallback(lt39.SUCCESSFUL);
                                Iterator<RRset> it2 = onWarmupCompleted(objOnExtraCallback2).iterator();
                                while (it2.hasNext()) {
                                    lt38VarOnExtraCallback2.IAuthTabCallback(onExtraCallback(it2.next(), yzp2Var));
                                }
                                return lt38VarOnExtraCallback2;
                            }
                            RRset rRsetIAuthTabCallback5 = IAuthTabCallback(objOnExtraCallback2, i);
                            if (rRsetIAuthTabCallback5 != null) {
                                return lt38.IAuthTabCallback(lt39.SUCCESSFUL, onExtraCallback(rRsetIAuthTabCallback5, yzp2Var));
                            }
                        }
                    }
                }
                return lt38.onExtraCallback(lt39.NXDOMAIN);
            }
        }
    }

    private RRset onExtraCallback(RRset rRset, yzp2 yzp2Var) {
        RRset rRset2 = new RRset();
        Iterator it = rRset.onWarmupCompleted(false).iterator();
        while (it.hasNext()) {
            rRset2.onNavigationEvent(((Record) it.next()).onNavigationEvent(yzp2Var));
        }
        Iterator it2 = rRset.IAuthTabCallbackStubProxy().iterator();
        while (it2.hasNext()) {
            rRset2.onNavigationEvent(((RRSIGRecord) it2.next()).onNavigationEvent(yzp2Var));
        }
        return rRset2;
    }

    private void IAuthTabCallback(final StringBuilder sb, Object obj) {
        for (RRset rRset : onWarmupCompleted(obj)) {
            rRset.onWarmupCompleted(false).forEach(new Consumer() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda8
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ycx9.onWarmupCompleted(sb, (Record) obj2);
                }
            });
            rRset.IAuthTabCallbackStubProxy().forEach(new Consumer() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda9
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    ycx9.onNavigationEvent(sb, (RRSIGRecord) obj2);
                }
            });
        }
    }

    public static /* synthetic */ void onWarmupCompleted(StringBuilder sb, Record record) {
        sb.append(record);
        sb.append('\n');
    }

    public static /* synthetic */ void onNavigationEvent(StringBuilder sb, RRSIGRecord rRSIGRecord) {
        sb.append(rRSIGRecord);
        sb.append('\n');
    }

    public String onExtraCallback() {
        final StringBuilder sb = new StringBuilder();
        onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return ycx9.onExtraCallbackWithResult(this.f$0, sb);
            }
        });
        return sb.toString();
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(ycx9 ycx9Var, StringBuilder sb) {
        ycx9Var.IAuthTabCallback(sb, ycx9Var.originNode);
        for (Map.Entry<yzp2, Object> entry : ycx9Var.data.entrySet()) {
            if (!ycx9Var.origin.equals(entry.getKey())) {
                ycx9Var.IAuthTabCallback(sb, entry.getValue());
            }
        }
        return null;
    }

    public String toString() {
        return onExtraCallback();
    }

    public class onExtraCallback implements Iterator<RRset> {
        private RRset IAuthTabCallback;
        private final Iterator<Map.Entry<yzp2, Object>> IAuthTabCallbackStub;
        private RRset onExtraCallback;
        private List<RRset> onExtraCallbackWithResult;
        private int onNavigationEvent;
        private boolean onTransact;

        onExtraCallback(boolean z) {
            this.IAuthTabCallbackStub = ycx9.this.data.entrySet().iterator();
            this.onTransact = z;
            List list = (List) ycx9.this.onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$ZoneIterator$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return ycx9.onExtraCallback.onWarmupCompleted(ycx9Var);
                }
            });
            RRset[] rRsetArr = new RRset[list.size()];
            this.onExtraCallbackWithResult = Arrays.asList(rRsetArr);
            int i = 2;
            for (int i2 = 0; i2 < list.size(); i2++) {
                RRset rRset = (RRset) list.get(i2);
                int iOnExtraCallback = rRset.onExtraCallback();
                if (iOnExtraCallback == 6) {
                    RRset rRset2 = new RRset(rRset);
                    this.IAuthTabCallback = rRset2;
                    rRsetArr[0] = rRset2;
                } else if (iOnExtraCallback == 2) {
                    rRsetArr[1] = new RRset(rRset);
                } else {
                    rRsetArr[i] = new RRset(rRset);
                    i++;
                }
            }
        }

        public static /* synthetic */ ArrayList onWarmupCompleted(ycx9 ycx9Var) {
            return new ArrayList(ycx9Var.onWarmupCompleted(ycx9Var.originNode));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallbackWithResult != null || this.onTransact;
        }

        @Override // java.util.Iterator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public RRset next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            List<RRset> list = this.onExtraCallbackWithResult;
            if (list == null) {
                this.onTransact = false;
                RRset rRset = this.IAuthTabCallback;
                this.onExtraCallback = rRset;
                return rRset;
            }
            int i = this.onNavigationEvent;
            this.onNavigationEvent = i + 1;
            this.onExtraCallback = new RRset(list.get(i));
            if (this.onNavigationEvent == this.onExtraCallbackWithResult.size()) {
                this.onExtraCallbackWithResult = null;
                while (true) {
                    if (!this.IAuthTabCallbackStub.hasNext()) {
                        break;
                    }
                    final Map.Entry<yzp2, Object> next = this.IAuthTabCallbackStub.next();
                    if (!next.getKey().equals(ycx9.this.origin)) {
                        List<RRset> list2 = (List) ycx9.this.onWarmupCompleted(new Supplier() { // from class: org.xbill.DNS.Zone$ZoneIterator$$ExternalSyntheticLambda2
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return ycx9.onExtraCallback.IAuthTabCallback(this.f$0, next);
                            }
                        });
                        if (!list2.isEmpty()) {
                            this.onExtraCallbackWithResult = list2;
                            this.onNavigationEvent = 0;
                            break;
                        }
                    }
                }
            }
            return this.onExtraCallback;
        }

        public static /* synthetic */ ArrayList IAuthTabCallback(onExtraCallback onextracallback, Map.Entry entry) {
            return new ArrayList(ycx9.this.onWarmupCompleted(entry.getValue()));
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.onExtraCallback != null) {
                ycx9.this.IAuthTabCallback(new Runnable() { // from class: org.xbill.DNS.Zone$ZoneIterator$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ycx9.onExtraCallback onextracallback = this.f$0;
                        ycx9.this.IAuthTabCallback(onextracallback.onExtraCallback.asInterface(), onextracallback.onExtraCallback.onExtraCallback());
                    }
                });
                return;
            }
            throw new IllegalStateException("Not at an element");
        }
    }
}
