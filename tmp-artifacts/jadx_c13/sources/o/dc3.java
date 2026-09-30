package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.RRset;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverConfig;
import org.xbill.DNS.TextParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dc3 {
    private static TRANS_ExportCert IAuthTabCallback;
    private static Map<Integer, dy9> onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static Resolver onNavigationEvent;
    private List<yzp2> IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private final int ICustomTabsCallback_Parcel;
    private String access000;
    private int access100;
    private boolean asBinder;
    private boolean extraCallback;
    private TRANS_ExportCert extraCallbackWithResult;
    private boolean extraCommand;
    private dy9 getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private List<yzp2> mayLaunchUrl;
    private final yzp2 onActivityLayout;
    private int onActivityResized;
    private final int onMessageChannelReady;
    private boolean onMinimized;
    private int onPostMessage;
    private boolean onRelationshipValidationResult;
    private Record[] onTransact;
    private Resolver onUnminimized;
    private String readTypedObject;
    private boolean writeTypedObject;
    private static final AppSetIdAndScope1 asInterface = ea10.onWarmupCompleted((Class<?>) dc3.class);
    private static List<yzp2> onWarmupCompleted = Collections.EMPTY_LIST;
    private static final yzp2[] IAuthTabCallbackStub = new yzp2[0];

    static {
        IAuthTabCallback();
    }

    public static void IAuthTabCallback() {
        synchronized (dc3.class) {
            onNavigationEvent = new moveToFirst();
            onWarmupCompleted = ResolverConfig.onNavigationEvent().onExtraCallback();
            onExtraCallback = new HashMap();
            onExtraCallbackWithResult = ResolverConfig.onNavigationEvent().IAuthTabCallback();
            IAuthTabCallback = new TRANS_ExportCert();
        }
    }

    public static Resolver onWarmupCompleted() {
        Resolver resolver;
        synchronized (dc3.class) {
            resolver = onNavigationEvent;
        }
        return resolver;
    }

    public static dy9 onExtraCallbackWithResult(int i) {
        dy9 dy9Var;
        synchronized (dc3.class) {
            ryzbycx.IAuthTabCallback(i);
            dy9Var = onExtraCallback.get(Integer.valueOf(i));
            if (dy9Var == null) {
                dy9Var = new dy9(i);
                onExtraCallback.put(Integer.valueOf(i), dy9Var);
            }
        }
        return dy9Var;
    }

    public static List<yzp2> onNavigationEvent() {
        List<yzp2> list;
        synchronized (dc3.class) {
            list = onWarmupCompleted;
        }
        return list;
    }

    public static TRANS_ExportCert onExtraCallbackWithResult() {
        TRANS_ExportCert tRANS_ExportCert;
        synchronized (dc3.class) {
            tRANS_ExportCert = IAuthTabCallback;
        }
        return tRANS_ExportCert;
    }

    public static /* synthetic */ yzp2 onExtraCallback(yzp2 yzp2Var) {
        try {
            return yzp2.onWarmupCompleted(yzp2Var, yzp2.IAuthTabCallback);
        } catch (NameTooLongException e) {
            throw new RuntimeException(e);
        }
    }

    private void onTransact() {
        this.onPostMessage = 0;
        this.ICustomTabsCallback = false;
        this.writeTypedObject = false;
        this.extraCallback = false;
        this.IAuthTabCallbackDefault = null;
        this.onTransact = null;
        this.ICustomTabsCallbackStub = -1;
        this.readTypedObject = null;
        this.onRelationshipValidationResult = false;
        this.asBinder = false;
        this.access000 = null;
        this.ICustomTabsCallbackDefault = false;
        this.isEngagementSignalsApiAvailable = false;
        this.onMinimized = false;
        this.ICustomTabsCallbackStubProxy = false;
        if (this.extraCommand) {
            this.getInterfaceDescriptor.IAuthTabCallback();
        }
    }

    public dc3(yzp2 yzp2Var, int i, int i2) {
        this.IAuthTabCallback_Parcel = true;
        lt54.IAuthTabCallback(i);
        ryzbycx.IAuthTabCallback(i2);
        if (!lt54.onWarmupCompleted(i) && i != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.onActivityLayout = yzp2Var;
        this.ICustomTabsCallback_Parcel = i;
        this.IAuthTabCallbackStubProxy = i2;
        synchronized (dc3.class) {
            this.onUnminimized = onWarmupCompleted();
            this.mayLaunchUrl = onNavigationEvent();
            this.getInterfaceDescriptor = onExtraCallbackWithResult(i2);
        }
        this.onActivityResized = onExtraCallbackWithResult;
        this.access100 = 3;
        this.ICustomTabsCallbackStub = -1;
        this.onMessageChannelReady = Integer.parseInt(System.getProperty("dnsjava.lookup.max_iterations", "16"));
        if (Boolean.parseBoolean(System.getProperty("dnsjava.lookup.use_hosts_file", "true"))) {
            this.extraCallbackWithResult = onExtraCallbackWithResult();
        }
    }

    public dc3(String str, int i) throws TextParseException {
        this(yzp2.onExtraCallbackWithResult(str), i, 1);
    }

    public void onExtraCallback(Resolver resolver) {
        this.onUnminimized = resolver;
    }

    private void onExtraCallbackWithResult(yzp2 yzp2Var, yzp2 yzp2Var2) throws NameTooLongException {
        this.ICustomTabsCallback = true;
        this.asBinder = false;
        this.ICustomTabsCallbackDefault = false;
        this.isEngagementSignalsApiAvailable = false;
        this.onRelationshipValidationResult = false;
        this.ICustomTabsCallbackStubProxy = false;
        int i = this.onPostMessage + 1;
        this.onPostMessage = i;
        if (i >= this.onMessageChannelReady || yzp2Var.equals(yzp2Var2)) {
            this.ICustomTabsCallbackStub = 1;
            this.readTypedObject = "CNAME loop";
            this.writeTypedObject = true;
        } else {
            if (this.IAuthTabCallbackDefault == null) {
                this.IAuthTabCallbackDefault = new ArrayList();
            }
            this.IAuthTabCallbackDefault.add(yzp2Var2);
            onWarmupCompleted(yzp2Var);
        }
    }

    private void IAuthTabCallback(yzp2 yzp2Var, lt38 lt38Var) throws NameTooLongException {
        if (lt38Var.IAuthTabCallbackDefault()) {
            List<RRset> listIAuthTabCallback = lt38Var.IAuthTabCallback();
            ArrayList arrayList = new ArrayList();
            Iterator<RRset> it = listIAuthTabCallback.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().onWarmupCompleted(this.IAuthTabCallback_Parcel));
            }
            this.ICustomTabsCallbackStub = 0;
            this.onTransact = (Record[]) arrayList.toArray(new Record[0]);
            this.writeTypedObject = true;
            return;
        }
        if (lt38Var.asInterface()) {
            this.onRelationshipValidationResult = true;
            this.extraCallback = true;
            if (this.onPostMessage > 0) {
                this.ICustomTabsCallbackStub = 3;
                this.writeTypedObject = true;
                return;
            }
            return;
        }
        if (lt38Var.onTransact()) {
            this.ICustomTabsCallbackStub = 4;
            this.onTransact = null;
            this.writeTypedObject = true;
        } else {
            if (lt38Var.onExtraCallbackWithResult()) {
                onExtraCallbackWithResult(lt38Var.onExtraCallback().onNavigationEvent(), yzp2Var);
                return;
            }
            if (lt38Var.asBinder()) {
                try {
                    onExtraCallbackWithResult(yzp2Var.onExtraCallbackWithResult(lt38Var.onWarmupCompleted()), yzp2Var);
                    return;
                } catch (NameTooLongException unused) {
                    this.ICustomTabsCallbackStub = 1;
                    this.readTypedObject = "Invalid DNAME target";
                    this.writeTypedObject = true;
                    return;
                }
            }
            if (lt38Var.IAuthTabCallbackStub()) {
                this.ICustomTabsCallbackStubProxy = true;
            }
        }
    }

    private void onWarmupCompleted(yzp2 yzp2Var) throws NameTooLongException {
        if (onExtraCallbackWithResult(yzp2Var)) {
            return;
        }
        lt38 lt38VarOnExtraCallbackWithResult = this.getInterfaceDescriptor.onExtraCallbackWithResult(yzp2Var, this.ICustomTabsCallback_Parcel, this.access100);
        new Object[]{yzp2Var, lt54.onNavigationEvent(this.ICustomTabsCallback_Parcel), lt38VarOnExtraCallbackWithResult};
        IAuthTabCallback(yzp2Var, lt38VarOnExtraCallbackWithResult);
        if (this.writeTypedObject || this.extraCallback) {
            return;
        }
        onChildViewAdded onchildviewaddedIAuthTabCallback = onChildViewAdded.IAuthTabCallback(Record.IAuthTabCallback(yzp2Var, this.ICustomTabsCallback_Parcel, this.IAuthTabCallbackStubProxy));
        try {
            onChildViewAdded onchildviewaddedOnExtraCallbackWithResult = this.onUnminimized.onWarmupCompleted(onchildviewaddedIAuthTabCallback).onExtraCallbackWithResult(onchildviewaddedIAuthTabCallback);
            int iOnExtraCallback = onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().onExtraCallback();
            if (iOnExtraCallback != 0 && iOnExtraCallback != 3) {
                this.asBinder = true;
                this.access000 = Rcode.onWarmupCompleted(iOnExtraCallback);
            } else {
                if (!onchildviewaddedIAuthTabCallback.onNavigationEvent().equals(onchildviewaddedOnExtraCallbackWithResult.onNavigationEvent())) {
                    this.asBinder = true;
                    this.access000 = "response does not match query";
                    return;
                }
                lt38 lt38VarIAuthTabCallback = this.getInterfaceDescriptor.IAuthTabCallback(onchildviewaddedOnExtraCallbackWithResult);
                if (lt38VarIAuthTabCallback == null) {
                    lt38VarIAuthTabCallback = this.getInterfaceDescriptor.onExtraCallbackWithResult(yzp2Var, this.ICustomTabsCallback_Parcel, this.access100);
                }
                new Object[]{yzp2Var, lt54.onNavigationEvent(this.ICustomTabsCallback_Parcel), Integer.valueOf(onchildviewaddedOnExtraCallbackWithResult.IAuthTabCallback().onNavigationEvent()), lt38VarIAuthTabCallback};
                IAuthTabCallback(yzp2Var, lt38VarIAuthTabCallback);
            }
        } catch (IOException e) {
            String strOnNavigationEvent = lt54.onNavigationEvent(onchildviewaddedIAuthTabCallback.onNavigationEvent().extraCallback());
            int iOnNavigationEvent = onchildviewaddedIAuthTabCallback.IAuthTabCallback().onNavigationEvent();
            new Object[]{yzp2Var, strOnNavigationEvent, Integer.valueOf(iOnNavigationEvent), this.onUnminimized, e};
            if (e instanceof InterruptedIOException) {
                this.isEngagementSignalsApiAvailable = true;
            } else {
                this.ICustomTabsCallbackDefault = true;
            }
        }
    }

    private boolean onExtraCallbackWithResult(yzp2 yzp2Var) {
        int i;
        TRANS_ExportCert tRANS_ExportCert = this.extraCallbackWithResult;
        if (tRANS_ExportCert != null && ((i = this.ICustomTabsCallback_Parcel) == 1 || i == 28)) {
            try {
                Optional<InetAddress> optionalOnExtraCallbackWithResult = tRANS_ExportCert.onExtraCallbackWithResult(yzp2Var, i);
                if (optionalOnExtraCallbackWithResult.isPresent()) {
                    this.ICustomTabsCallbackStub = 0;
                    this.writeTypedObject = true;
                    if (this.ICustomTabsCallback_Parcel == 1) {
                        this.onTransact = new dy4[]{new dy4(yzp2Var, this.IAuthTabCallbackStubProxy, 0L, optionalOnExtraCallbackWithResult.get())};
                    } else {
                        this.onTransact = new dy2[]{new dy2(yzp2Var, this.IAuthTabCallbackStubProxy, 0L, optionalOnExtraCallbackWithResult.get())};
                    }
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private void onNavigationEvent(yzp2 yzp2Var, yzp2 yzp2Var2) throws NameTooLongException {
        this.extraCallback = false;
        if (yzp2Var2 == null) {
            onWarmupCompleted(yzp2Var);
            return;
        }
        try {
            onWarmupCompleted(yzp2.onWarmupCompleted(yzp2Var, yzp2Var2));
        } catch (NameTooLongException unused) {
            this.onMinimized = true;
        }
    }

    public Record[] onExtraCallback() throws NameTooLongException {
        if (this.writeTypedObject) {
            onTransact();
        }
        if (this.onActivityLayout.onNavigationEvent()) {
            onNavigationEvent(this.onActivityLayout, null);
        } else {
            boolean z = this.onActivityLayout.IAuthTabCallback() > this.onActivityResized;
            if (z) {
                onNavigationEvent(this.onActivityLayout, yzp2.IAuthTabCallback);
                if (this.writeTypedObject) {
                    return this.onTransact;
                }
            }
            Iterator<yzp2> it = this.mayLaunchUrl.iterator();
            while (it.hasNext()) {
                onNavigationEvent(this.onActivityLayout, it.next());
                if (this.writeTypedObject) {
                    return this.onTransact;
                }
                if (this.ICustomTabsCallback) {
                    break;
                }
            }
            if (!z) {
                onNavigationEvent(this.onActivityLayout, yzp2.IAuthTabCallback);
            }
        }
        if (!this.writeTypedObject) {
            if (this.asBinder) {
                this.ICustomTabsCallbackStub = 2;
                this.readTypedObject = this.access000;
                this.writeTypedObject = true;
            } else if (this.isEngagementSignalsApiAvailable) {
                this.ICustomTabsCallbackStub = 2;
                this.readTypedObject = "timed out";
                this.writeTypedObject = true;
            } else if (this.ICustomTabsCallbackDefault) {
                this.ICustomTabsCallbackStub = 2;
                this.readTypedObject = "network error";
                this.writeTypedObject = true;
            } else if (this.onRelationshipValidationResult) {
                this.ICustomTabsCallbackStub = 3;
                this.writeTypedObject = true;
            } else if (this.ICustomTabsCallbackStubProxy) {
                this.ICustomTabsCallbackStub = 1;
                this.readTypedObject = "referral";
                this.writeTypedObject = true;
            } else if (this.onMinimized) {
                this.ICustomTabsCallbackStub = 1;
                this.readTypedObject = "name too long";
                this.writeTypedObject = true;
            }
        }
        return this.onTransact;
    }
}
