package org.xbill.DNS;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;
import o.AppSetIdAndScope1;
import o.TRANS_V2_SendReceiverInfo;
import o.deactivate;
import o.ea10;
import o.getBlob;
import o.getWantsAllOnMoveCalls;
import o.lt17;
import o.lt48;
import o.lt51;
import o.lt54;
import o.lt56;
import o.ryzb;
import o.ryzbycx;
import o.yzp2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Record implements Cloneable, Comparable<Record>, Serializable {
    private static final DecimalFormat IAuthTabCallback;
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted((Class<?>) Record.class);
    public int dclass;
    public yzp2 name;
    public long ttl;
    public int type;

    protected abstract String IAuthTabCallback();

    public yzp2 cA_() {
        return null;
    }

    protected abstract void onExtraCallback(getBlob getblob) throws IOException;

    public abstract void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar, boolean z);

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        IAuthTabCallback = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    public Record() {
    }

    public Record(yzp2 yzp2Var, int i, int i2, long j) {
        if (!yzp2Var.onNavigationEvent()) {
            throw new RelativeNameException(yzp2Var);
        }
        lt54.IAuthTabCallback(i);
        ryzbycx.IAuthTabCallback(i2);
        lt48.onExtraCallbackWithResult(j);
        this.name = yzp2Var;
        this.type = i;
        this.dclass = i2;
        this.ttl = j;
    }

    Object writeReplace() {
        return new RecordSerializationProxy(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use RecordSerializationProxy");
    }

    private static Record onExtraCallback(yzp2 yzp2Var, int i, int i2, long j, boolean z) {
        Record getwantsallonmovecalls;
        if (z) {
            Supplier<Record> supplierOnExtraCallback = lt54.onExtraCallback(i);
            if (supplierOnExtraCallback != null) {
                getwantsallonmovecalls = supplierOnExtraCallback.get();
            } else {
                getwantsallonmovecalls = new lt51();
            }
        } else {
            getwantsallonmovecalls = new getWantsAllOnMoveCalls();
        }
        getwantsallonmovecalls.name = yzp2Var;
        getwantsallonmovecalls.type = i;
        getwantsallonmovecalls.dclass = i2;
        getwantsallonmovecalls.ttl = j;
        return getwantsallonmovecalls;
    }

    private static Record onExtraCallbackWithResult(yzp2 yzp2Var, int i, int i2, long j, int i3, getBlob getblob) throws IOException {
        Record recordOnExtraCallback = onExtraCallback(yzp2Var, i, i2, j, getblob != null);
        if (getblob == null) {
            return recordOnExtraCallback;
        }
        if (getblob.IAuthTabCallbackDefault() < i3) {
            throw new WireParseException("truncated record");
        }
        getblob.onNavigationEvent(i3);
        recordOnExtraCallback.onExtraCallback(getblob);
        if (getblob.IAuthTabCallbackDefault() > 0) {
            throw new WireParseException("invalid record length");
        }
        getblob.onNavigationEvent();
        return recordOnExtraCallback;
    }

    public static Record onExtraCallbackWithResult(yzp2 yzp2Var, int i, int i2, long j) {
        if (!yzp2Var.onNavigationEvent()) {
            throw new RelativeNameException(yzp2Var);
        }
        lt54.IAuthTabCallback(i);
        ryzbycx.IAuthTabCallback(i2);
        lt48.onExtraCallbackWithResult(j);
        return onExtraCallback(yzp2Var, i, i2, j, false);
    }

    public static Record IAuthTabCallback(yzp2 yzp2Var, int i, int i2) {
        return onExtraCallbackWithResult(yzp2Var, i, i2, 0L);
    }

    public static Record onExtraCallbackWithResult(getBlob getblob, int i, boolean z) throws IOException {
        yzp2 yzp2Var = new yzp2(getblob);
        int iOnExtraCallbackWithResult = getblob.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = getblob.onExtraCallbackWithResult();
        if (i == 0) {
            return IAuthTabCallback(yzp2Var, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
        }
        long jAsBinder = getblob.asBinder();
        int iOnExtraCallbackWithResult3 = getblob.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult3 == 0 && z && (i == 1 || i == 2)) {
            return onExtraCallbackWithResult(yzp2Var, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, jAsBinder);
        }
        return onExtraCallbackWithResult(yzp2Var, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, jAsBinder, iOnExtraCallbackWithResult3, getblob);
    }

    public static Record onNavigationEvent(byte[] bArr, int i) throws IOException {
        return onExtraCallbackWithResult(new getBlob(bArr), i, false);
    }

    public void onExtraCallbackWithResult(deactivate deactivateVar, int i, ryzb ryzbVar) {
        this.name.onExtraCallbackWithResult(deactivateVar, ryzbVar);
        deactivateVar.IAuthTabCallback(this.type);
        deactivateVar.IAuthTabCallback(this.dclass);
        if (i == 0) {
            return;
        }
        deactivateVar.onWarmupCompleted(this.ttl);
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        deactivateVar.IAuthTabCallback(0);
        onExtraCallbackWithResult(deactivateVar, ryzbVar, false);
        deactivateVar.onExtraCallbackWithResult((deactivateVar.onNavigationEvent() - iOnNavigationEvent) - 2, iOnNavigationEvent);
    }

    public byte[] IAuthTabCallback(int i) {
        deactivate deactivateVar = new deactivate();
        onExtraCallbackWithResult(deactivateVar, i, (ryzb) null);
        return deactivateVar.IAuthTabCallback();
    }

    private void onExtraCallback(deactivate deactivateVar, boolean z) {
        this.name.IAuthTabCallback(deactivateVar);
        deactivateVar.IAuthTabCallback(this.type);
        deactivateVar.IAuthTabCallback(this.dclass);
        if (z) {
            deactivateVar.onWarmupCompleted(0L);
        } else {
            deactivateVar.onWarmupCompleted(this.ttl);
        }
        int iOnNavigationEvent = deactivateVar.onNavigationEvent();
        deactivateVar.IAuthTabCallback(0);
        onExtraCallbackWithResult(deactivateVar, (ryzb) null, true);
        deactivateVar.onExtraCallbackWithResult((deactivateVar.onNavigationEvent() - iOnNavigationEvent) - 2, iOnNavigationEvent);
    }

    private byte[] onWarmupCompleted(boolean z) {
        deactivate deactivateVar = new deactivate();
        onExtraCallback(deactivateVar, z);
        return deactivateVar.IAuthTabCallback();
    }

    public byte[] ICustomTabsCallback() {
        return onWarmupCompleted(false);
    }

    public byte[] extraCallbackWithResult() {
        deactivate deactivateVar = new deactivate();
        onExtraCallbackWithResult(deactivateVar, (ryzb) null, true);
        return deactivateVar.IAuthTabCallback();
    }

    public String writeTypedObject() {
        return IAuthTabCallback();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (sb.length() < 8) {
            sb.append("\t");
        }
        if (sb.length() < 16) {
            sb.append("\t");
        }
        sb.append("\t");
        if (lt17.IAuthTabCallback("BINDTTL")) {
            sb.append(lt48.IAuthTabCallback(this.ttl));
        } else {
            sb.append(this.ttl);
        }
        sb.append("\t");
        if (this.dclass != 1 || !lt17.IAuthTabCallback("noPrintIN")) {
            sb.append(ryzbycx.onWarmupCompleted(this.dclass));
            sb.append("\t");
        }
        sb.append(lt54.onNavigationEvent(this.type));
        String strIAuthTabCallback = IAuthTabCallback();
        if (!strIAuthTabCallback.isEmpty()) {
            sb.append("\t");
            sb.append(strIAuthTabCallback);
        }
        return sb.toString();
    }

    public static byte[] IAuthTabCallback(String str) throws TextParseException {
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            if (b == 92) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i = 0;
                boolean z = false;
                int i2 = 0;
                for (byte b2 : bytes) {
                    if (z) {
                        if (b2 >= 48 && b2 <= 57) {
                            i++;
                            i2 = (i2 * 10) + (b2 - 48);
                            if (i2 > 255) {
                                throw new TextParseException("bad escape");
                            }
                            if (i >= 3) {
                                b2 = (byte) i2;
                            }
                        } else if (i > 0) {
                            throw new TextParseException("bad escape");
                        }
                        byteArrayOutputStream.write(b2);
                        z = false;
                    } else if (b2 == 92) {
                        z = true;
                        i = 0;
                        i2 = 0;
                    } else {
                        byteArrayOutputStream.write(b2);
                    }
                }
                if (i > 0 && i < 3) {
                    throw new TextParseException("bad escape");
                }
                if (byteArrayOutputStream.toByteArray().length > 255) {
                    throw new TextParseException("text string too long");
                }
                return byteArrayOutputStream.toByteArray();
            }
        }
        if (bytes.length <= 255) {
            return bytes;
        }
        throw new TextParseException("text string too long");
    }

    public static String onExtraCallbackWithResult(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                sb.append('\\');
                sb.append(IAuthTabCallback.format(i));
            } else if (i == 34 || i == 92) {
                sb.append('\\');
                sb.append((char) i);
            } else {
                sb.append((char) i);
            }
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public static String onExtraCallbackWithResult(byte[] bArr) {
        return "\\# " + bArr.length + " " + TRANS_V2_SendReceiverInfo.onExtraCallback(bArr);
    }

    public yzp2 access000() {
        return this.name;
    }

    public int extraCallback() {
        return this.type;
    }

    public int cB_() {
        return this.type;
    }

    public int getInterfaceDescriptor() {
        return this.dclass;
    }

    public long readTypedObject() {
        return this.ttl;
    }

    public boolean onWarmupCompleted(Record record) {
        return cB_() == record.cB_() && this.dclass == record.dclass && this.name.equals(record.name);
    }

    public boolean onExtraCallback(RRset rRset) {
        return cB_() == rRset.onExtraCallback() && this.dclass == rRset.onTransact() && this.name.equals(rRset.asInterface());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if (this.type == record.type && this.dclass == record.dclass && this.name.equals(record.name)) {
            return Arrays.equals(extraCallbackWithResult(), record.extraCallbackWithResult());
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : onWarmupCompleted(true)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public Record IAuthTabCallback_Parcel() {
        try {
            return (Record) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    public Record onNavigationEvent(yzp2 yzp2Var) {
        if (!yzp2Var.onNavigationEvent()) {
            throw new RelativeNameException(yzp2Var);
        }
        Record recordIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        recordIAuthTabCallback_Parcel.name = yzp2Var;
        return recordIAuthTabCallback_Parcel;
    }

    public Record onWarmupCompleted(int i, long j) {
        Record recordIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        recordIAuthTabCallback_Parcel.dclass = i;
        recordIAuthTabCallback_Parcel.ttl = j;
        return recordIAuthTabCallback_Parcel;
    }

    void onWarmupCompleted(long j) {
        this.ttl = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int compareTo(Record record) {
        if (this == record) {
            return 0;
        }
        int iCompareTo = this.name.compareTo(record.name);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.dclass - record.dclass;
        if (i != 0) {
            return i;
        }
        int i2 = this.type - record.type;
        if (i2 != 0) {
            return i2;
        }
        byte[] bArrExtraCallbackWithResult = extraCallbackWithResult();
        byte[] bArrExtraCallbackWithResult2 = record.extraCallbackWithResult();
        int iMin = Math.min(bArrExtraCallbackWithResult.length, bArrExtraCallbackWithResult2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            byte b = bArrExtraCallbackWithResult[i3];
            byte b2 = bArrExtraCallbackWithResult2[i3];
            if (b != b2) {
                return (b & 255) - (b2 & 255);
            }
        }
        return bArrExtraCallbackWithResult.length - bArrExtraCallbackWithResult2.length;
    }

    public static int onExtraCallback(String str, int i) {
        if (lt56.IAuthTabCallback(i)) {
            return i;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 8 bit value");
    }

    public static int onNavigationEvent(String str, int i) {
        if (lt56.onNavigationEvent(i)) {
            return i;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 16 bit value");
    }

    public static long IAuthTabCallback(String str, long j) {
        if (lt56.IAuthTabCallback(j)) {
            return j;
        }
        throw new IllegalArgumentException("\"" + str + "\" " + j + " must be an unsigned 32 bit value");
    }

    public static yzp2 IAuthTabCallback(String str, yzp2 yzp2Var) {
        if (yzp2Var.onNavigationEvent()) {
            return yzp2Var;
        }
        throw new RelativeNameException("'" + yzp2Var + "' on field " + str + " is not an absolute name");
    }
}
