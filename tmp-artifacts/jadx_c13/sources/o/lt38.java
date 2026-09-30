package o;

import java.util.ArrayList;
import java.util.List;
import o.dy9;
import okhttp3.internal.url._UrlKt;
import org.xbill.DNS.RRset;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt38 {
    private static final lt38 IAuthTabCallback;
    private static final lt38 IAuthTabCallbackDefault;
    private static final lt38 onExtraCallback;
    private static final lt38 onExtraCallbackWithResult;
    private static final lt38 onNavigationEvent;
    private static final lt38 onWarmupCompleted;
    private List<RRset> asBinder;
    private boolean asInterface;
    private final lt39 onTransact;

    static {
        lt39 lt39Var = lt39.UNKNOWN;
        onExtraCallback = new lt38(lt39Var, null, false);
        IAuthTabCallbackDefault = new lt38(lt39Var, null, true);
        lt39 lt39Var2 = lt39.NXDOMAIN;
        onNavigationEvent = new lt38(lt39Var2, null, false);
        onWarmupCompleted = new lt38(lt39Var2, null, true);
        lt39 lt39Var3 = lt39.NXRRSET;
        IAuthTabCallback = new lt38(lt39Var3, null, false);
        onExtraCallbackWithResult = new lt38(lt39Var3, null, true);
    }

    private lt38(lt39 lt39Var, RRset rRset, boolean z) {
        this.onTransact = lt39Var;
        this.asInterface = z;
        if (rRset != null) {
            IAuthTabCallback(rRset);
        }
    }

    static lt38 onExtraCallback(lt39 lt39Var) {
        return onWarmupCompleted(lt39Var, null, false);
    }

    static lt38 IAuthTabCallback(lt39 lt39Var, RRset rRset) {
        return onWarmupCompleted(lt39Var, rRset, false);
    }

    static lt38 onExtraCallback(lt39 lt39Var, dy9.onExtraCallback onextracallback) {
        return onWarmupCompleted(lt39Var, onextracallback, onextracallback.onNavigationEvent());
    }

    /* renamed from: o.lt38$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[lt39.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[lt39.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[lt39.NXDOMAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[lt39.NXRRSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[lt39.DELEGATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[lt39.CNAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[lt39.DNAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[lt39.SUCCESSFUL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static lt38 onWarmupCompleted(lt39 lt39Var, RRset rRset, boolean z) {
        switch (AnonymousClass1.IAuthTabCallback[lt39Var.ordinal()]) {
            case 1:
                return z ? IAuthTabCallbackDefault : onExtraCallback;
            case 2:
                return z ? onWarmupCompleted : onNavigationEvent;
            case 3:
                return z ? onExtraCallbackWithResult : IAuthTabCallback;
            case 4:
            case 5:
            case 6:
            case 7:
                return new lt38(lt39Var, rRset, z);
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    void IAuthTabCallback(RRset rRset) {
        if (this.onTransact.isSealed()) {
            throw new IllegalStateException("Attempted to add RRset to sealed response of type " + this.onTransact);
        }
        if (this.asBinder == null) {
            this.asBinder = new ArrayList();
            if (rRset instanceof dy9.onExtraCallback) {
                this.asInterface = ((dy9.onExtraCallback) rRset).onNavigationEvent();
            }
        } else if ((rRset instanceof dy9.onExtraCallback) && this.asInterface) {
            this.asInterface = ((dy9.onExtraCallback) rRset).onNavigationEvent();
        }
        this.asBinder.add(rRset);
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.onTransact == lt39.UNKNOWN;
    }

    public boolean asInterface() {
        return this.onTransact == lt39.NXDOMAIN;
    }

    public boolean onTransact() {
        return this.onTransact == lt39.NXRRSET;
    }

    public boolean IAuthTabCallbackStub() {
        return this.onTransact == lt39.DELEGATION;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onTransact == lt39.CNAME;
    }

    public boolean asBinder() {
        return this.onTransact == lt39.DNAME;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onTransact == lt39.SUCCESSFUL;
    }

    public List<RRset> IAuthTabCallback() {
        if (this.onTransact != lt39.SUCCESSFUL) {
            return null;
        }
        return this.asBinder;
    }

    public jcdj onExtraCallback() {
        return (jcdj) this.asBinder.get(0).onWarmupCompleted();
    }

    public uhzb onWarmupCompleted() {
        return (uhzb) this.asBinder.get(0).onWarmupCompleted();
    }

    public RRset onNavigationEvent() {
        List<RRset> list = this.asBinder;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.onTransact);
        if (this.onTransact.isPrintRecords()) {
            str = ": " + this.asBinder.get(0);
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        return sb.toString();
    }
}
