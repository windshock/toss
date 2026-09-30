package o;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Record;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class dy9 {
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onWarmupCompleted((Class<?>) dy9.class);
    private int IAuthTabCallback;
    private int onExtraCallback;
    private final onNavigationEvent onNavigationEvent;
    private final int onWarmupCompleted;

    interface IAuthTabCallback {
        int onExtraCallback();

        boolean onExtraCallbackWithResult();

        int onNavigationEvent(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onNavigationEvent(long j, long j2) {
        if (j2 >= 0 && j2 < j) {
            j = j2;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        return (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 2147483647L) ? IntCompanionObject.MAX_VALUE : (int) jCurrentTimeMillis;
    }

    static class onExtraCallback extends RRset implements IAuthTabCallback {
        int credibility;
        int expire;
        boolean isAuthenticated;

        public onExtraCallback(RRset rRset, int i, long j, boolean z) {
            super(rRset);
            this.credibility = i;
            this.expire = dy9.onNavigationEvent(rRset.asBinder(), j);
            this.isAuthenticated = z;
        }

        @Override // o.dy9.IAuthTabCallback
        public final boolean onExtraCallbackWithResult() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.expire;
        }

        @Override // o.dy9.IAuthTabCallback
        public final int onNavigationEvent(int i) {
            return this.credibility - i;
        }

        @Override // org.xbill.DNS.RRset
        public String toString() {
            return super.toString() + " cl = " + this.credibility;
        }

        public boolean onNavigationEvent() {
            return this.isAuthenticated;
        }
    }

    static class onWarmupCompleted implements IAuthTabCallback {
        yzp2 IAuthTabCallback;
        int onExtraCallback;
        int onExtraCallbackWithResult;
        int onNavigationEvent;
        boolean onWarmupCompleted;

        public onWarmupCompleted(yzp2 yzp2Var, int i, lt26 lt26Var, int i2, long j, boolean z) {
            this.IAuthTabCallback = yzp2Var;
            this.onExtraCallbackWithResult = i;
            long jMin = lt26Var != null ? Math.min(lt26Var.onExtraCallbackWithResult(), lt26Var.readTypedObject()) : 0L;
            this.onExtraCallback = i2;
            this.onNavigationEvent = dy9.onNavigationEvent(jMin, j);
            this.onWarmupCompleted = z;
        }

        @Override // o.dy9.IAuthTabCallback
        public int onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.dy9.IAuthTabCallback
        public final boolean onExtraCallbackWithResult() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.onNavigationEvent;
        }

        @Override // o.dy9.IAuthTabCallback
        public final int onNavigationEvent(int i) {
            return this.onExtraCallback - i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.onExtraCallbackWithResult == 0) {
                sb.append("NXDOMAIN ");
                sb.append(this.IAuthTabCallback);
            } else {
                sb.append("NXRRSET ");
                sb.append(this.IAuthTabCallback);
                sb.append(" ");
                sb.append(lt54.onNavigationEvent(this.onExtraCallbackWithResult));
            }
            sb.append(" cl = ");
            sb.append(this.onExtraCallback);
            return sb.toString();
        }
    }

    static class onNavigationEvent extends LinkedHashMap<yzp2, Object> {
        private int maxsize;

        onNavigationEvent(int i) {
            super(16, 0.75f, true);
            this.maxsize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<yzp2, Object> entry) {
            return this.maxsize >= 0 && size() > this.maxsize;
        }
    }

    public dy9(int i) {
        this.onExtraCallback = -1;
        this.IAuthTabCallback = -1;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = new onNavigationEvent(50000);
    }

    public dy9() {
        this(1);
    }

    private Object onExtraCallback(yzp2 yzp2Var) {
        Object obj;
        synchronized (this) {
            obj = this.onNavigationEvent.get(yzp2Var);
        }
        return obj;
    }

    private IAuthTabCallback[] IAuthTabCallback(Object obj) {
        synchronized (this) {
            if (obj instanceof List) {
                List list = (List) obj;
                return (IAuthTabCallback[]) list.toArray(new IAuthTabCallback[list.size()]);
            }
            return new IAuthTabCallback[]{(IAuthTabCallback) obj};
        }
    }

    private IAuthTabCallback onNavigationEvent(yzp2 yzp2Var, Object obj, int i, int i2) {
        synchronized (this) {
            if (i == 255) {
                throw new IllegalArgumentException("oneElement(ANY)");
            }
            if (obj instanceof List) {
                for (IAuthTabCallback iAuthTabCallback : (List) obj) {
                    if (iAuthTabCallback.onExtraCallback() == i) {
                        break;
                    }
                }
                iAuthTabCallback = null;
            } else {
                iAuthTabCallback = (IAuthTabCallback) obj;
                if (iAuthTabCallback.onExtraCallback() != i) {
                    iAuthTabCallback = null;
                }
            }
            if (iAuthTabCallback == null) {
                return null;
            }
            if (iAuthTabCallback.onExtraCallbackWithResult()) {
                onNavigationEvent(yzp2Var, i);
                return null;
            }
            if (iAuthTabCallback.onNavigationEvent(i2) < 0) {
                return null;
            }
            return iAuthTabCallback;
        }
    }

    private IAuthTabCallback onExtraCallback(yzp2 yzp2Var, int i, int i2) {
        synchronized (this) {
            Object objOnExtraCallback = onExtraCallback(yzp2Var);
            if (objOnExtraCallback == null) {
                return null;
            }
            return onNavigationEvent(yzp2Var, objOnExtraCallback, i, i2);
        }
    }

    private void IAuthTabCallback(yzp2 yzp2Var, IAuthTabCallback iAuthTabCallback) {
        synchronized (this) {
            Object obj = this.onNavigationEvent.get(yzp2Var);
            if (obj == null) {
                this.onNavigationEvent.put(yzp2Var, iAuthTabCallback);
                return;
            }
            int iOnExtraCallback = iAuthTabCallback.onExtraCallback();
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    if (((IAuthTabCallback) list.get(i)).onExtraCallback() == iOnExtraCallback) {
                        list.set(i, iAuthTabCallback);
                        return;
                    }
                }
                list.add(iAuthTabCallback);
            } else {
                IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) obj;
                if (iAuthTabCallback2.onExtraCallback() == iOnExtraCallback) {
                    this.onNavigationEvent.put(yzp2Var, iAuthTabCallback);
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(iAuthTabCallback2);
                    linkedList.add(iAuthTabCallback);
                    this.onNavigationEvent.put(yzp2Var, linkedList);
                }
            }
        }
    }

    private void onNavigationEvent(yzp2 yzp2Var, int i) {
        synchronized (this) {
            Object obj = this.onNavigationEvent.get(yzp2Var);
            if (obj == null) {
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (((IAuthTabCallback) list.get(i2)).onExtraCallback() == i) {
                        list.remove(i2);
                        if (list.isEmpty()) {
                            this.onNavigationEvent.remove(yzp2Var);
                        }
                        return;
                    }
                }
            } else if (((IAuthTabCallback) obj).onExtraCallback() == i) {
                this.onNavigationEvent.remove(yzp2Var);
            }
        }
    }

    public void IAuthTabCallback() {
        synchronized (this) {
            this.onNavigationEvent.clear();
        }
    }

    private <T extends Record> void IAuthTabCallback(RRset rRset, int i, boolean z) {
        onExtraCallback onextracallback;
        synchronized (this) {
            long jAsBinder = rRset.asBinder();
            yzp2 yzp2VarAsInterface = rRset.asInterface();
            int iOnExtraCallback = rRset.onExtraCallback();
            IAuthTabCallback iAuthTabCallbackOnExtraCallback = onExtraCallback(yzp2VarAsInterface, iOnExtraCallback, 0);
            if (jAsBinder == 0) {
                if (iAuthTabCallbackOnExtraCallback != null && iAuthTabCallbackOnExtraCallback.onNavigationEvent(i) <= 0) {
                    onNavigationEvent(yzp2VarAsInterface, iOnExtraCallback);
                }
            } else {
                if (iAuthTabCallbackOnExtraCallback != null && iAuthTabCallbackOnExtraCallback.onNavigationEvent(i) <= 0) {
                    iAuthTabCallbackOnExtraCallback = null;
                }
                if (iAuthTabCallbackOnExtraCallback == null) {
                    if (rRset instanceof onExtraCallback) {
                        onextracallback = (onExtraCallback) rRset;
                    } else {
                        onextracallback = new onExtraCallback(rRset, i, this.IAuthTabCallback, z);
                    }
                    IAuthTabCallback(yzp2VarAsInterface, onextracallback);
                }
            }
        }
    }

    private void onExtraCallbackWithResult(yzp2 yzp2Var, int i, lt26 lt26Var, int i2, boolean z) {
        long jMin;
        synchronized (this) {
            if (lt26Var != null) {
                try {
                    jMin = Math.min(lt26Var.onExtraCallbackWithResult(), lt26Var.readTypedObject());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                jMin = 0;
            }
            IAuthTabCallback iAuthTabCallbackOnExtraCallback = onExtraCallback(yzp2Var, i, 0);
            if (jMin == 0) {
                if (iAuthTabCallbackOnExtraCallback != null && iAuthTabCallbackOnExtraCallback.onNavigationEvent(i2) <= 0) {
                    onNavigationEvent(yzp2Var, i);
                }
            } else {
                if (iAuthTabCallbackOnExtraCallback != null && iAuthTabCallbackOnExtraCallback.onNavigationEvent(i2) <= 0) {
                    iAuthTabCallbackOnExtraCallback = null;
                }
                if (iAuthTabCallbackOnExtraCallback == null) {
                    IAuthTabCallback(yzp2Var, new onWarmupCompleted(yzp2Var, i, lt26Var, i2, this.onExtraCallback, z));
                }
            }
        }
    }

    protected lt38 onNavigationEvent(yzp2 yzp2Var, int i, int i2) {
        yzp2 yzp2Var2;
        synchronized (this) {
            int iIAuthTabCallback = yzp2Var.IAuthTabCallback();
            int i3 = iIAuthTabCallback;
            while (i3 > 0) {
                boolean z = i3 == 1;
                boolean z2 = i3 == iIAuthTabCallback;
                if (z) {
                    yzp2Var2 = yzp2.IAuthTabCallback;
                } else {
                    yzp2Var2 = z2 ? yzp2Var : new yzp2(yzp2Var, iIAuthTabCallback - i3);
                }
                Object obj = this.onNavigationEvent.get(yzp2Var2);
                if (obj != null) {
                    if (z2 && i == 255) {
                        IAuthTabCallback[] iAuthTabCallbackArrIAuthTabCallback = IAuthTabCallback(obj);
                        lt38 lt38VarOnExtraCallback = lt38.onExtraCallback(lt39.SUCCESSFUL);
                        int i4 = 0;
                        for (IAuthTabCallback iAuthTabCallback : iAuthTabCallbackArrIAuthTabCallback) {
                            if (iAuthTabCallback.onExtraCallbackWithResult()) {
                                onNavigationEvent(yzp2Var2, iAuthTabCallback.onExtraCallback());
                            } else if ((iAuthTabCallback instanceof onExtraCallback) && iAuthTabCallback.onNavigationEvent(i2) >= 0) {
                                lt38VarOnExtraCallback.IAuthTabCallback((onExtraCallback) iAuthTabCallback);
                                i4++;
                            }
                        }
                        if (i4 > 0) {
                            return lt38VarOnExtraCallback;
                        }
                    } else if (z2) {
                        IAuthTabCallback iAuthTabCallbackOnNavigationEvent = onNavigationEvent(yzp2Var2, obj, i, i2);
                        if (iAuthTabCallbackOnNavigationEvent instanceof onExtraCallback) {
                            return lt38.onExtraCallback(lt39.SUCCESSFUL, (onExtraCallback) iAuthTabCallbackOnNavigationEvent);
                        }
                        if (iAuthTabCallbackOnNavigationEvent != null) {
                            return lt38.onExtraCallback(lt39.NXRRSET);
                        }
                        IAuthTabCallback iAuthTabCallbackOnNavigationEvent2 = onNavigationEvent(yzp2Var2, obj, 5, i2);
                        if (iAuthTabCallbackOnNavigationEvent2 instanceof onExtraCallback) {
                            return lt38.onExtraCallback(lt39.CNAME, (onExtraCallback) iAuthTabCallbackOnNavigationEvent2);
                        }
                    } else {
                        IAuthTabCallback iAuthTabCallbackOnNavigationEvent3 = onNavigationEvent(yzp2Var2, obj, 39, i2);
                        if (iAuthTabCallbackOnNavigationEvent3 instanceof onExtraCallback) {
                            return lt38.onExtraCallback(lt39.DNAME, (onExtraCallback) iAuthTabCallbackOnNavigationEvent3);
                        }
                    }
                    IAuthTabCallback iAuthTabCallbackOnNavigationEvent4 = onNavigationEvent(yzp2Var2, obj, 2, i2);
                    if (iAuthTabCallbackOnNavigationEvent4 instanceof onExtraCallback) {
                        return lt38.onExtraCallback(lt39.DELEGATION, (onExtraCallback) iAuthTabCallbackOnNavigationEvent4);
                    }
                    if (z2 && onNavigationEvent(yzp2Var2, obj, 0, i2) != null) {
                        return lt38.onExtraCallback(lt39.NXDOMAIN);
                    }
                }
                i3--;
            }
            return lt38.onExtraCallback(lt39.UNKNOWN);
        }
    }

    public lt38 onExtraCallbackWithResult(yzp2 yzp2Var, int i, int i2) {
        return onNavigationEvent(yzp2Var, i, i2);
    }

    private List<RRset> IAuthTabCallback(yzp2 yzp2Var, int i, int i2) {
        lt38 lt38VarOnExtraCallbackWithResult = onExtraCallbackWithResult(yzp2Var, i, i2);
        if (lt38VarOnExtraCallbackWithResult.IAuthTabCallbackDefault()) {
            return lt38VarOnExtraCallbackWithResult.IAuthTabCallback();
        }
        return null;
    }

    public List<RRset> onExtraCallback(yzp2 yzp2Var, int i) {
        return IAuthTabCallback(yzp2Var, i, 3);
    }

    public List<RRset> IAuthTabCallback(yzp2 yzp2Var, int i) {
        return IAuthTabCallback(yzp2Var, i, 2);
    }

    private int onNavigationEvent(int i, boolean z) {
        if (i == 1) {
            return z ? 4 : 3;
        }
        if (i == 2) {
            return z ? 4 : 3;
        }
        if (i == 3) {
            return 1;
        }
        throw new IllegalArgumentException("getCred: invalid section");
    }

    private static void onExtraCallback(RRset rRset, Set<yzp2> set) {
        if (rRset.onWarmupCompleted().cA_() != null) {
            Iterator<Record> it = rRset.IAuthTabCallbackDefault().iterator();
            while (it.hasNext()) {
                yzp2 yzp2VarCA_ = it.next().cA_();
                if (yzp2VarCA_ != null) {
                    set.add(yzp2VarCA_);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lt38 IAuthTabCallback(onChildViewAdded onchildviewadded) throws NameTooLongException {
        lt39 lt39Var;
        int i;
        char c;
        char c2 = 5;
        boolean zOnExtraCallback = onchildviewadded.IAuthTabCallback().onExtraCallback(5);
        boolean zOnExtraCallback2 = onchildviewadded.IAuthTabCallback().onExtraCallback(10);
        Record recordOnNavigationEvent = onchildviewadded.onNavigationEvent();
        int iOnExtraCallback = onchildviewadded.IAuthTabCallback().onExtraCallback();
        if ((iOnExtraCallback != 0 && iOnExtraCallback != 3) || recordOnNavigationEvent == null) {
            return null;
        }
        yzp2 yzp2VarAccess000 = recordOnNavigationEvent.access000();
        int iExtraCallback = recordOnNavigationEvent.extraCallback();
        int interfaceDescriptor = recordOnNavigationEvent.getInterfaceDescriptor();
        HashSet hashSet = new HashSet();
        int i2 = 1;
        List<RRset> listOnNavigationEvent = onchildviewadded.onNavigationEvent(1);
        lt38 lt38VarOnExtraCallback = null;
        yzp2 yzp2VarOnNavigationEvent = yzp2VarAccess000;
        int i3 = 0;
        boolean z = false;
        while (i3 < listOnNavigationEvent.size()) {
            RRset rRset = listOnNavigationEvent.get(i3);
            if (rRset.onTransact() != interfaceDescriptor) {
                i = interfaceDescriptor;
                c = c2;
            } else {
                int iOnExtraCallback2 = rRset.onExtraCallback();
                yzp2 yzp2VarAsInterface = rRset.asInterface();
                i = interfaceDescriptor;
                int iOnNavigationEvent = onNavigationEvent(i2, zOnExtraCallback);
                if ((iOnExtraCallback2 == iExtraCallback || iExtraCallback == 255) && yzp2VarAsInterface.equals(yzp2VarOnNavigationEvent)) {
                    IAuthTabCallback(rRset, iOnNavigationEvent, zOnExtraCallback2);
                    if (yzp2VarOnNavigationEvent == yzp2VarAccess000) {
                        if (lt38VarOnExtraCallback == null) {
                            lt38VarOnExtraCallback = lt38.onExtraCallback(lt39.SUCCESSFUL);
                        }
                        lt38 lt38Var = lt38VarOnExtraCallback;
                        lt38Var.IAuthTabCallback(rRset);
                        lt38VarOnExtraCallback = lt38Var;
                    }
                    onExtraCallback(rRset, hashSet);
                    c = 5;
                    z = true;
                } else if (iOnExtraCallback2 == 39 && yzp2VarOnNavigationEvent.IAuthTabCallback(yzp2VarAsInterface)) {
                    IAuthTabCallback(rRset, iOnNavigationEvent, zOnExtraCallback2);
                    if (yzp2VarOnNavigationEvent == yzp2VarAccess000) {
                        lt38VarOnExtraCallback = lt38.onWarmupCompleted(lt39.DNAME, rRset, zOnExtraCallback2);
                    }
                    int i4 = i3 + 1;
                    if (i4 < listOnNavigationEvent.size()) {
                        RRset rRset2 = listOnNavigationEvent.get(i4);
                        if (rRset2.onExtraCallback() != 5 || !rRset2.asInterface().equals(yzp2VarOnNavigationEvent)) {
                            try {
                                yzp2VarOnNavigationEvent = yzp2VarOnNavigationEvent.onExtraCallbackWithResult((uhzb) rRset.onWarmupCompleted());
                            } catch (NameTooLongException unused) {
                            }
                        }
                        c = 5;
                    }
                } else {
                    c = 5;
                    if (iOnExtraCallback2 == 5 && yzp2VarAsInterface.equals(yzp2VarOnNavigationEvent)) {
                        IAuthTabCallback(rRset, iOnNavigationEvent, zOnExtraCallback2);
                        if (yzp2VarOnNavigationEvent == yzp2VarAccess000) {
                            lt38VarOnExtraCallback = lt38.onWarmupCompleted(lt39.CNAME, rRset, zOnExtraCallback2);
                        }
                        yzp2VarOnNavigationEvent = ((jcdj) rRset.onWarmupCompleted()).onNavigationEvent();
                    }
                }
            }
            i3++;
            c2 = c;
            interfaceDescriptor = i;
            i2 = 1;
        }
        RRset rRset3 = null;
        RRset rRset4 = null;
        for (RRset rRset5 : onchildviewadded.onNavigationEvent(2)) {
            if (rRset5.onExtraCallback() == 6 && yzp2VarOnNavigationEvent.IAuthTabCallback(rRset5.asInterface())) {
                rRset4 = rRset5;
            } else if (rRset5.onExtraCallback() == 2 && yzp2VarOnNavigationEvent.IAuthTabCallback(rRset5.asInterface())) {
                rRset3 = rRset5;
            }
        }
        if (!z) {
            int i5 = iOnExtraCallback == 3 ? 0 : iExtraCallback;
            if (iOnExtraCallback == 3 || rRset4 != null || rRset3 == null) {
                onExtraCallbackWithResult(yzp2VarOnNavigationEvent, i5, rRset4 != null ? (lt26) rRset4.onWarmupCompleted() : null, onNavigationEvent(2, zOnExtraCallback), zOnExtraCallback2);
                if (lt38VarOnExtraCallback == null) {
                    if (iOnExtraCallback == 3) {
                        lt39Var = lt39.NXDOMAIN;
                    } else {
                        lt39Var = lt39.NXRRSET;
                    }
                    lt38VarOnExtraCallback = lt38.onExtraCallback(lt39Var);
                }
            } else {
                IAuthTabCallback(rRset3, onNavigationEvent(2, zOnExtraCallback), zOnExtraCallback2);
                onExtraCallback(rRset3, hashSet);
                if (lt38VarOnExtraCallback == null) {
                    lt38VarOnExtraCallback = lt38.onWarmupCompleted(lt39.DELEGATION, rRset3, zOnExtraCallback2);
                }
            }
        } else if (iOnExtraCallback == 0 && rRset3 != null) {
            IAuthTabCallback(rRset3, onNavigationEvent(2, zOnExtraCallback), zOnExtraCallback2);
            onExtraCallback(rRset3, hashSet);
        }
        lt38 lt38Var2 = lt38VarOnExtraCallback;
        for (RRset rRset6 : onchildviewadded.onNavigationEvent(3)) {
            int iOnExtraCallback3 = rRset6.onExtraCallback();
            if (iOnExtraCallback3 == 1 || iOnExtraCallback3 == 28 || iOnExtraCallback3 == 38) {
                if (hashSet.contains(rRset6.asInterface())) {
                    IAuthTabCallback(rRset6, onNavigationEvent(3, zOnExtraCallback), zOnExtraCallback2);
                }
            }
        }
        new Object[]{lt38Var2, onchildviewadded.onNavigationEvent().access000(), lt54.onNavigationEvent(onchildviewadded.onNavigationEvent().extraCallback())};
        return lt38Var2;
    }

    public int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            Iterator<Object> it = this.onNavigationEvent.values().iterator();
            while (it.hasNext()) {
                for (IAuthTabCallback iAuthTabCallback : IAuthTabCallback(it.next())) {
                    sb.append(iAuthTabCallback);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
