package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;
import org.jmrtd.lds.AbstractListInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class IrisBiometricSubtypeInfo extends AbstractListInfo<IrisImageInfo> {
    public static final int EYE_LEFT = 2;
    public static final int EYE_RIGHT = 1;
    public static final int EYE_UNDEF = 0;
    private static final long serialVersionUID = -6588640634764878039L;
    private int biometricSubtype;
    private int imageFormat;

    public IrisBiometricSubtypeInfo(int i, int i2, List<IrisImageInfo> list) {
        this.biometricSubtype = i;
        this.imageFormat = i2;
        addAll(list);
    }

    public IrisBiometricSubtypeInfo(InputStream inputStream, int i) throws IOException {
        this.imageFormat = i;
        readObject(inputStream);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, org.jmrtd.lds.iso19794.IrisImageInfo] */
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.biometricSubtype = dataInputStream.readUnsignedByte();
        int unsignedShort = dataInputStream.readUnsignedShort();
        for (int i = 0; i < unsignedShort; i++) {
            ?? irisImageInfo = new IrisImageInfo(inputStream, this.imageFormat);
            irisImageInfo.getRecordLength();
            add((Serializable) irisImageInfo);
        }
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeByte(this.biometricSubtype & GF2Field.MASK);
        List subRecords = getSubRecords();
        dataOutputStream.writeShort(subRecords.size() & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        Iterator it = subRecords.iterator();
        while (it.hasNext()) {
            ((IrisImageInfo) it.next()).writeObject(dataOutputStream);
        }
    }

    public long getRecordLength() {
        Iterator it = getSubRecords().iterator();
        long recordLength = 3;
        while (it.hasNext()) {
            recordLength += ((IrisImageInfo) it.next()).getRecordLength();
        }
        return recordLength;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.biometricSubtype) * 31) + this.imageFormat;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisBiometricSubtypeInfo irisBiometricSubtypeInfo = (IrisBiometricSubtypeInfo) obj;
        return this.biometricSubtype == irisBiometricSubtypeInfo.biometricSubtype && this.imageFormat == irisBiometricSubtypeInfo.imageFormat;
    }

    public String toString() {
        return "IrisBiometricSubtypeInfo [biometric subtype: " + biometricSubtypeToString(this.biometricSubtype) + ", imageCount = " + getSubRecords().size() + "]";
    }

    public int getBiometricSubtype() {
        return this.biometricSubtype;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public List<IrisImageInfo> getIrisImageInfos() {
        return getSubRecords();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addIrisImageInfo(IrisImageInfo irisImageInfo) {
        add(irisImageInfo);
    }

    public void removeIrisImageInfo(int i) {
        remove(i);
    }

    private static String biometricSubtypeToString(int i) {
        if (i == 0) {
            return "Undefined";
        }
        if (i == 1) {
            return "Right eye";
        }
        if (i == 2) {
            return "Left eye";
        }
        throw new NumberFormatException("Unknown biometric subtype: " + Integer.toHexString(i));
    }
}
