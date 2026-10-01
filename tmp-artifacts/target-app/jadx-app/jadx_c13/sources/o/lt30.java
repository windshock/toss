package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;
import o.lt30;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.url._UrlKt;
import org.xbill.DNS.Record;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt30 extends Record {
    private static final IAuthTabCallbackStub onNavigationEvent;
    protected final Map<Integer, onWarmupCompleted> svcParams = new TreeMap();
    protected int svcPriority;
    protected yzp2 targetName;

    public static abstract class onWarmupCompleted implements Serializable {
        public abstract void onWarmupCompleted(byte[] bArr) throws IOException;

        public abstract byte[] onWarmupCompleted();

        public abstract String toString();
    }

    protected lt30() {
    }

    public onWarmupCompleted onExtraCallback(int i) {
        return this.svcParams.get(Integer.valueOf(i));
    }

    static class IAuthTabCallbackStub extends sz1 {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 53046;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static char onExtraCallback = 14997;
        private static char onExtraCallbackWithResult = 63297;
        private static char onNavigationEvent = 62560;
        private final HashMap<Integer, Supplier<onWarmupCompleted>> onWarmupCompleted;

        public IAuthTabCallbackStub() throws Throwable {
            super("SVCB/HTTPS Parameters", 3);
            Object[] objArr = new Object[1];
            a(new char[]{21024, 13976, 38127, 18521}, 3 - View.MeasureSpec.getMode(0), objArr);
            onWarmupCompleted(((String) objArr[0]).intern());
            onWarmupCompleted(true);
            onNavigationEvent(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.onWarmupCompleted = new HashMap<>();
        }

        public void onExtraCallbackWithResult(int i, String str, Supplier<onWarmupCompleted> supplier) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 51;
            IAuthTabCallbackDefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                super.IAuthTabCallback(i, str);
                this.onWarmupCompleted.put(Integer.valueOf(i), supplier);
                int i4 = IAuthTabCallbackDefault + 113;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            super.IAuthTabCallback(i, str);
            this.onWarmupCompleted.put(Integer.valueOf(i), supplier);
            throw null;
        }

        public Supplier<onWarmupCompleted> onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault + 7;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                this.onWarmupCompleted.get(Integer.valueOf(i));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Supplier<onWarmupCompleted> supplier = this.onWarmupCompleted.get(Integer.valueOf(i));
            int i4 = IAuthTabCallbackStub + 119;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return supplier;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            int i4 = $11 + 93;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                int i6 = $10 + 67;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 58224;
                int i9 = i3;
                while (i9 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 10;
                            int defaultSize = View.getDefaultSize(i3, i3) + 12434;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, packedPositionType, defaultSize, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16789650, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 13 - ImageFormat.getBitsPerPixel(0), 19902 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }

    static {
        IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub();
        onNavigationEvent = iAuthTabCallbackStub;
        iAuthTabCallbackStub.onExtraCallbackWithResult(0, "mandatory", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.onTransact();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(1, "alpn", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.onNavigationEvent();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(2, "no-default-alpn", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.IAuthTabCallbackDefault();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(3, "port", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.asBinder();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(4, "ipv4hint", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.onExtraCallback();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(5, "ech", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda5
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.IAuthTabCallback();
            }
        });
        iAuthTabCallbackStub.onExtraCallbackWithResult(6, "ipv6hint", new Supplier() { // from class: org.xbill.DNS.SVCBBase$$ExternalSyntheticLambda6
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lt30.onExtraCallbackWithResult();
            }
        });
        iAuthTabCallbackStub.onExtraCallback(5, "echconfig");
    }

    public static class onTransact extends onWarmupCompleted {
        private final List<Integer> values = new ArrayList();

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws IOException {
            this.values.clear();
            getBlob getblob = new getBlob(bArr);
            while (getblob.IAuthTabCallbackDefault() >= 2) {
                this.values.add(Integer.valueOf(getblob.onExtraCallbackWithResult()));
            }
            if (getblob.IAuthTabCallbackDefault() > 0) {
                throw new WireParseException("Unexpected number of bytes in mandatory parameter");
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            deactivate deactivateVar = new deactivate();
            Iterator<Integer> it = this.values.iterator();
            while (it.hasNext()) {
                deactivateVar.IAuthTabCallback(it.next().intValue());
            }
            return deactivateVar.IAuthTabCallback();
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Integer num : this.values) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(lt30.onNavigationEvent.IAuthTabCallback(num.intValue()));
            }
            return sb.toString();
        }
    }

    public static class onNavigationEvent extends onWarmupCompleted {
        private final List<byte[]> values = new ArrayList();

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws IOException {
            this.values.clear();
            getBlob getblob = new getBlob(bArr);
            while (getblob.IAuthTabCallbackDefault() > 0) {
                this.values.add(getblob.IAuthTabCallback());
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            deactivate deactivateVar = new deactivate();
            Iterator<byte[]> it = this.values.iterator();
            while (it.hasNext()) {
                deactivateVar.onExtraCallback(it.next());
            }
            return deactivateVar.IAuthTabCallback();
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.values) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(Record.onExtraCallbackWithResult(bArr, false).replace(",", "\\,"));
            }
            return sb.toString();
        }
    }

    public static class IAuthTabCallbackDefault extends onWarmupCompleted {
        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws WireParseException {
            if (bArr.length > 0) {
                throw new WireParseException("No value can be specified for no-default-alpn");
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            return new byte[0];
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
    }

    public static class asBinder extends onWarmupCompleted {
        private int port;

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws IOException {
            getBlob getblob = new getBlob(bArr);
            this.port = getblob.onExtraCallbackWithResult();
            if (getblob.IAuthTabCallbackDefault() > 0) {
                throw new WireParseException("Unexpected number of bytes in port parameter");
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            deactivate deactivateVar = new deactivate();
            deactivateVar.IAuthTabCallback(this.port);
            return deactivateVar.IAuthTabCallback();
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            return Integer.toString(this.port);
        }
    }

    public static class onExtraCallback extends onWarmupCompleted {
        private final List<byte[]> addresses = new ArrayList();

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws IOException {
            this.addresses.clear();
            getBlob getblob = new getBlob(bArr);
            while (getblob.IAuthTabCallbackDefault() >= 4) {
                this.addresses.add(getblob.IAuthTabCallback(4));
            }
            if (getblob.IAuthTabCallbackDefault() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv4hint parameter");
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            deactivate deactivateVar = new deactivate();
            Iterator<byte[]> it = this.addresses.iterator();
            while (it.hasNext()) {
                deactivateVar.onNavigationEvent(it.next());
            }
            return deactivateVar.IAuthTabCallback();
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.addresses) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(dy6.onWarmupCompleted(bArr));
            }
            return sb.toString();
        }
    }

    public static class IAuthTabCallback extends onWarmupCompleted {
        private byte[] data;

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) {
            this.data = bArr;
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            return this.data;
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            return UST_TRANS_ImportCert.onNavigationEvent(this.data);
        }
    }

    public static class onExtraCallbackWithResult extends onWarmupCompleted {
        private final List<byte[]> addresses = new ArrayList();

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) throws IOException {
            this.addresses.clear();
            getBlob getblob = new getBlob(bArr);
            while (getblob.IAuthTabCallbackDefault() >= 16) {
                this.addresses.add(getblob.IAuthTabCallback(16));
            }
            if (getblob.IAuthTabCallbackDefault() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv6hint parameter");
            }
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            deactivate deactivateVar = new deactivate();
            Iterator<byte[]> it = this.addresses.iterator();
            while (it.hasNext()) {
                deactivateVar.onNavigationEvent(it.next());
            }
            return deactivateVar.IAuthTabCallback();
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (byte[] bArr : this.addresses) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                try {
                    sb.append(InetAddress.getByAddress(null, bArr).getHostAddress());
                } catch (UnknownHostException e) {
                    return e.getMessage();
                }
            }
            return sb.toString();
        }
    }

    public static class asInterface extends onWarmupCompleted {
        private final int key;
        private byte[] value = new byte[0];

        public asInterface(int i) {
            this.key = i;
        }

        @Override // o.lt30.onWarmupCompleted
        public void onWarmupCompleted(byte[] bArr) {
            this.value = bArr;
        }

        @Override // o.lt30.onWarmupCompleted
        public byte[] onWarmupCompleted() {
            return this.value;
        }

        @Override // o.lt30.onWarmupCompleted
        public String toString() {
            return Record.onExtraCallbackWithResult(this.value, false);
        }
    }

    protected boolean onExtraCallback() {
        onTransact ontransact = (onTransact) onExtraCallback(0);
        if (ontransact == null) {
            return true;
        }
        Iterator it = ontransact.values.iterator();
        while (it.hasNext()) {
            if (onExtraCallback(((Integer) it.next()).intValue()) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallback(getBlob getblob) throws IOException {
        onWarmupCompleted asinterface;
        this.svcPriority = getblob.onExtraCallbackWithResult();
        this.targetName = new yzp2(getblob);
        this.svcParams.clear();
        while (getblob.IAuthTabCallbackDefault() >= 4) {
            int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
            byte[] bArrIAuthTabCallback = getblob.IAuthTabCallback(getblob.onExtraCallbackWithResult());
            Supplier<onWarmupCompleted> supplierOnExtraCallback = onNavigationEvent.onExtraCallback(iOnExtraCallbackWithResult);
            if (supplierOnExtraCallback != null) {
                asinterface = supplierOnExtraCallback.get();
            } else {
                asinterface = new asInterface(iOnExtraCallbackWithResult);
            }
            asinterface.onWarmupCompleted(bArrIAuthTabCallback);
            this.svcParams.put(Integer.valueOf(iOnExtraCallbackWithResult), asinterface);
        }
        if (getblob.IAuthTabCallbackDefault() > 0) {
            throw new WireParseException("Record had unexpected number of bytes");
        }
        if (!onExtraCallback()) {
            throw new WireParseException("Not all mandatory SvcParams are specified");
        }
    }

    @Override // org.xbill.DNS.Record
    public String IAuthTabCallback() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.svcPriority);
        sb.append(" ");
        sb.append(this.targetName);
        for (Map.Entry<Integer, onWarmupCompleted> entry : this.svcParams.entrySet()) {
            sb.append(" ");
            sb.append(onNavigationEvent.IAuthTabCallback(entry.getKey().intValue()));
            String string = entry.getValue().toString();
            if (string != null && !string.isEmpty()) {
                sb.append("=");
                sb.append(string);
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        deactivateVar.IAuthTabCallback(this.svcPriority);
        this.targetName.onNavigationEvent(deactivateVar, (ryzb) null, z);
        for (Map.Entry<Integer, onWarmupCompleted> entry : this.svcParams.entrySet()) {
            deactivateVar.IAuthTabCallback(entry.getKey().intValue());
            byte[] bArrOnWarmupCompleted = entry.getValue().onWarmupCompleted();
            deactivateVar.IAuthTabCallback(bArrOnWarmupCompleted.length);
            deactivateVar.onNavigationEvent(bArrOnWarmupCompleted);
        }
    }
}
