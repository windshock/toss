package o;

import j$.time.Duration;
import java.io.IOException;
import java.net.SocketAddress;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.lt42;
import okhttp3.internal.http2.Settings;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.Rcode;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class lt64 {
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted((Class<?>) lt64.class);
    private long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private IAuthTabCallback IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private Duration IAuthTabCallback_Parcel = Duration.ofMinutes(15);
    private int access000;
    private final lt42 access100;
    private long asBinder;
    private SocketAddress asInterface;
    private lt42.onWarmupCompleted extraCallback;
    private final yzp2 extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private final SocketAddress onExtraCallbackWithResult;
    private lt44 onNavigationEvent;
    private Record onTransact;
    private int onWarmupCompleted;
    private final boolean readTypedObject;

    public interface IAuthTabCallback {
        void IAuthTabCallback() throws lt62;

        void IAuthTabCallback(Record record) throws lt62;

        void onExtraCallbackWithResult() throws lt62;

        void onNavigationEvent(Record record) throws lt62;

        void onWarmupCompleted(Record record) throws lt62;
    }

    public static class onWarmupCompleted {
        public long IAuthTabCallback;
        public List<Record> onExtraCallback;
        public long onExtraCallbackWithResult;
        public List<Record> onWarmupCompleted;

        private onWarmupCompleted() {
            this.onWarmupCompleted = new ArrayList();
            this.onExtraCallback = new ArrayList();
        }
    }

    static class onExtraCallbackWithResult implements IAuthTabCallback {
        private List<onWarmupCompleted> IAuthTabCallback;
        private List<Record> onNavigationEvent;

        private onExtraCallbackWithResult() {
        }

        @Override // o.lt64.IAuthTabCallback
        public void onExtraCallbackWithResult() {
            this.onNavigationEvent = new ArrayList();
        }

        @Override // o.lt64.IAuthTabCallback
        public void IAuthTabCallback() {
            this.IAuthTabCallback = new ArrayList();
        }

        @Override // o.lt64.IAuthTabCallback
        public void IAuthTabCallback(Record record) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
            onwarmupcompleted.onExtraCallback.add(record);
            onwarmupcompleted.onExtraCallbackWithResult = lt64.onWarmupCompleted(record);
            this.IAuthTabCallback.add(onwarmupcompleted);
        }

        @Override // o.lt64.IAuthTabCallback
        public void onWarmupCompleted(Record record) {
            onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get(r0.size() - 1);
            onwarmupcompleted.onWarmupCompleted.add(record);
            onwarmupcompleted.IAuthTabCallback = lt64.onWarmupCompleted(record);
        }

        @Override // o.lt64.IAuthTabCallback
        public void onNavigationEvent(Record record) {
            List<onWarmupCompleted> list = this.IAuthTabCallback;
            if (list != null) {
                onWarmupCompleted onwarmupcompleted = list.get(list.size() - 1);
                if (!onwarmupcompleted.onWarmupCompleted.isEmpty()) {
                    onwarmupcompleted.onWarmupCompleted.add(record);
                    return;
                } else {
                    onwarmupcompleted.onExtraCallback.add(record);
                    return;
                }
            }
            this.onNavigationEvent.add(record);
        }
    }

    lt64(yzp2 yzp2Var, int i, long j, boolean z, SocketAddress socketAddress, lt42 lt42Var) {
        this.onExtraCallbackWithResult = socketAddress;
        this.access100 = lt42Var;
        if (yzp2Var.onNavigationEvent()) {
            this.extraCallbackWithResult = yzp2Var;
        } else {
            try {
                this.extraCallbackWithResult = yzp2.onWarmupCompleted(yzp2Var, yzp2.IAuthTabCallback);
            } catch (NameTooLongException unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.IAuthTabCallbackStubProxy = i;
        this.onWarmupCompleted = 1;
        this.IAuthTabCallbackDefault = j;
        this.readTypedObject = z;
        this.access000 = 0;
    }

    public static lt64 onExtraCallbackWithResult(yzp2 yzp2Var, SocketAddress socketAddress, lt42 lt42Var) {
        return new lt64(yzp2Var, 252, 0L, false, socketAddress, lt42Var);
    }

    public void onExtraCallback(Duration duration) {
        this.IAuthTabCallback_Parcel = duration;
    }

    public void onNavigationEvent(SocketAddress socketAddress) {
        this.asInterface = socketAddress;
    }

    private void IAuthTabCallbackDefault() throws IOException {
        lt44 lt44VarIAuthTabCallback = IAuthTabCallback(this.IAuthTabCallback_Parcel);
        this.onNavigationEvent = lt44VarIAuthTabCallback;
        SocketAddress socketAddress = this.asInterface;
        if (socketAddress != null) {
            lt44VarIAuthTabCallback.onExtraCallbackWithResult(socketAddress);
        }
        this.onNavigationEvent.onWarmupCompleted(this.onExtraCallbackWithResult);
    }

    lt44 IAuthTabCallback(Duration duration) throws IOException {
        return new lt44(duration);
    }

    private void onTransact() throws IOException {
        Record recordIAuthTabCallback = Record.IAuthTabCallback(this.extraCallbackWithResult, this.IAuthTabCallbackStubProxy, this.onWarmupCompleted);
        onChildViewAdded onchildviewadded = new onChildViewAdded();
        onchildviewadded.IAuthTabCallback().asInterface(0);
        onchildviewadded.onNavigationEvent(recordIAuthTabCallback, 0);
        if (this.IAuthTabCallbackStubProxy == 251) {
            yzp2 yzp2Var = this.extraCallbackWithResult;
            int i = this.onWarmupCompleted;
            yzp2 yzp2Var2 = yzp2.IAuthTabCallback;
            onchildviewadded.onNavigationEvent(new lt26(yzp2Var, i, 0L, yzp2Var2, yzp2Var2, this.IAuthTabCallbackDefault, 0L, 0L, 0L, 0L), 2);
        }
        lt42 lt42Var = this.access100;
        if (lt42Var != null) {
            lt42Var.onWarmupCompleted(onchildviewadded, (lt46) null);
            this.extraCallback = new lt42.onWarmupCompleted(this.access100, onchildviewadded.IAuthTabCallbackDefault());
        }
        this.onNavigationEvent.onWarmupCompleted(onchildviewadded.IAuthTabCallback(Settings.DEFAULT_INITIAL_WINDOW_SIZE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long onWarmupCompleted(Record record) {
        return ((lt26) record).onExtraCallback();
    }

    private void onNavigationEvent(String str) throws lt62 {
        throw new lt62(str);
    }

    private void onExtraCallbackWithResult() throws lt62 {
        if (!this.readTypedObject) {
            onNavigationEvent("server doesn't support IXFR");
        }
        this.IAuthTabCallbackStubProxy = 252;
        this.access000 = 0;
    }

    private void onExtraCallbackWithResult(Record record) throws lt62 {
        int iExtraCallback = record.extraCallback();
        switch (this.access000) {
            case 0:
                if (iExtraCallback != 6) {
                    onNavigationEvent("missing initial SOA");
                }
                this.onTransact = record;
                long jOnWarmupCompleted = onWarmupCompleted(record);
                this.asBinder = jOnWarmupCompleted;
                if (this.IAuthTabCallbackStubProxy == 251 && lt36.onExtraCallback(jOnWarmupCompleted, this.IAuthTabCallbackDefault) <= 0) {
                    this.access000 = 7;
                    break;
                } else {
                    this.access000 = 1;
                    break;
                }
                break;
            case 1:
                if (this.IAuthTabCallbackStubProxy == 251 && iExtraCallback == 6 && onWarmupCompleted(record) == this.IAuthTabCallbackDefault) {
                    this.getInterfaceDescriptor = 251;
                    this.IAuthTabCallbackStub.IAuthTabCallback();
                    this.access000 = 2;
                } else {
                    this.getInterfaceDescriptor = 252;
                    this.IAuthTabCallbackStub.onExtraCallbackWithResult();
                    this.IAuthTabCallbackStub.onNavigationEvent(this.onTransact);
                    this.access000 = 6;
                }
                onExtraCallbackWithResult(record);
                break;
            case 2:
                this.IAuthTabCallbackStub.IAuthTabCallback(record);
                this.access000 = 3;
                break;
            case 3:
                if (iExtraCallback == 6) {
                    this.IAuthTabCallback = onWarmupCompleted(record);
                    this.access000 = 4;
                    onExtraCallbackWithResult(record);
                    break;
                } else {
                    this.IAuthTabCallbackStub.onNavigationEvent(record);
                    break;
                }
            case 4:
                this.IAuthTabCallbackStub.onWarmupCompleted(record);
                this.access000 = 5;
                break;
            case 5:
                if (iExtraCallback == 6) {
                    long jOnWarmupCompleted2 = onWarmupCompleted(record);
                    if (jOnWarmupCompleted2 != this.asBinder) {
                        if (jOnWarmupCompleted2 != this.IAuthTabCallback) {
                            onNavigationEvent("IXFR out of sync: expected serial " + this.IAuthTabCallback + " , got " + jOnWarmupCompleted2);
                        } else {
                            this.access000 = 2;
                            onExtraCallbackWithResult(record);
                            break;
                        }
                    } else {
                        this.access000 = 7;
                        break;
                    }
                }
                this.IAuthTabCallbackStub.onNavigationEvent(record);
                break;
            case 6:
                if (iExtraCallback != 1 || record.getInterfaceDescriptor() == this.onWarmupCompleted) {
                    this.IAuthTabCallbackStub.onNavigationEvent(record);
                    if (iExtraCallback == 6) {
                        this.access000 = 7;
                        break;
                    }
                }
                break;
            case 7:
                onNavigationEvent("extra data");
                break;
            default:
                onNavigationEvent("invalid state");
                break;
        }
    }

    private void IAuthTabCallback() {
        try {
            lt44 lt44Var = this.onNavigationEvent;
            if (lt44Var != null) {
                lt44Var.close();
            }
        } catch (IOException unused) {
        }
    }

    private onChildViewAdded onExtraCallback(byte[] bArr) throws WireParseException {
        try {
            return new onChildViewAdded(bArr);
        } catch (IOException e) {
            if (e instanceof WireParseException) {
                throw ((WireParseException) e);
            }
            throw new WireParseException("Error parsing message", e);
        }
    }

    private void onExtraCallback() throws IllegalStateException, NoSuchAlgorithmException, lt62, IOException, InvalidKeyException {
        lt42.onWarmupCompleted onwarmupcompleted;
        onTransact();
        while (this.access000 != 7) {
            byte[] bArrOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted();
            onChildViewAdded onchildviewaddedOnExtraCallback = onExtraCallback(bArrOnWarmupCompleted);
            List<Record> listOnWarmupCompleted = onchildviewaddedOnExtraCallback.onWarmupCompleted(1);
            if (onchildviewaddedOnExtraCallback.IAuthTabCallback().onExtraCallback() == 0 && (onwarmupcompleted = this.extraCallback) != null) {
                int iOnExtraCallback = onwarmupcompleted.onExtraCallback(onchildviewaddedOnExtraCallback, bArrOnWarmupCompleted, listOnWarmupCompleted.get(listOnWarmupCompleted.size() - 1).extraCallback() == 6);
                if (iOnExtraCallback != 0) {
                    if (this.extraCallback.onWarmupCompleted() != null) {
                        onNavigationEvent("TSIG failure: " + Rcode.onNavigationEvent(iOnExtraCallback) + " (" + this.extraCallback.onWarmupCompleted() + ")");
                    } else {
                        onNavigationEvent("TSIG failure: " + Rcode.onNavigationEvent(iOnExtraCallback));
                    }
                }
            }
            if (this.access000 == 0) {
                int iIAuthTabCallbackStub = onchildviewaddedOnExtraCallback.IAuthTabCallbackStub();
                if (iIAuthTabCallbackStub != 0) {
                    if (this.IAuthTabCallbackStubProxy == 251 && iIAuthTabCallbackStub == 4) {
                        onExtraCallbackWithResult();
                        onExtraCallback();
                        return;
                    }
                    onNavigationEvent(Rcode.onWarmupCompleted(iIAuthTabCallbackStub));
                }
                Record recordOnNavigationEvent = onchildviewaddedOnExtraCallback.onNavigationEvent();
                if (recordOnNavigationEvent != null && recordOnNavigationEvent.extraCallback() != this.IAuthTabCallbackStubProxy) {
                    onNavigationEvent("invalid question section");
                }
                if (listOnWarmupCompleted.isEmpty() && this.IAuthTabCallbackStubProxy == 251) {
                    onExtraCallbackWithResult();
                    onExtraCallback();
                    return;
                }
            }
            Iterator<Record> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult(it.next());
            }
        }
    }

    public void onNavigationEvent(IAuthTabCallback iAuthTabCallback) throws lt62, IOException {
        this.IAuthTabCallbackStub = iAuthTabCallback;
        try {
            IAuthTabCallbackDefault();
            onExtraCallback();
        } finally {
            IAuthTabCallback();
        }
    }

    public void onNavigationEvent() throws lt62, IOException {
        onNavigationEvent(new onExtraCallbackWithResult());
    }

    private onExtraCallbackWithResult asInterface() throws IllegalArgumentException {
        IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackStub;
        if (iAuthTabCallback instanceof onExtraCallbackWithResult) {
            return (onExtraCallbackWithResult) iAuthTabCallback;
        }
        throw new IllegalArgumentException("ZoneTransferIn used callback interface");
    }

    public List<Record> onWarmupCompleted() {
        return asInterface().onNavigationEvent;
    }
}
