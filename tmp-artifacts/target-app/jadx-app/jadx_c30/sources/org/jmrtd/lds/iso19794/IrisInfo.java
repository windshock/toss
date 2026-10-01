package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import net.sf.scuba.smartcards.ISO7816;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class IrisInfo extends AbstractListInfo<IrisBiometricSubtypeInfo> implements BiometricDataBlock {
    public static final int CAPTURE_DEVICE_UNDEF = 0;
    private static final int FORMAT_IDENTIFIER = 1229541888;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 9;
    public static final int IMAGEFORMAT_MONO_JPEG = 6;
    public static final int IMAGEFORMAT_MONO_JPEG2000 = 14;
    public static final int IMAGEFORMAT_MONO_JPEG_LS = 10;
    public static final int IMAGEFORMAT_MONO_RAW = 2;
    public static final int IMAGEFORMAT_RGB_JPEG = 8;
    public static final int IMAGEFORMAT_RGB_JPEG2000 = 16;
    public static final int IMAGEFORMAT_RGB_JPEG_LS = 12;
    public static final int IMAGEFORMAT_RGB_RAW = 4;
    public static final int INTENSITY_DEPTH_UNDEF = 0;
    public static final int IRBNDY_PROCESSED = 1;
    public static final int IRBNDY_UNDEF = 0;
    public static final int IROCC_PROCESSED = 1;
    public static final int IROCC_UNDEF = 0;
    public static final int IROCC_ZEROFILL = 0;
    public static final int IROC_UNITFILL = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int ORIENTATION_BASE = 1;
    public static final int ORIENTATION_FLIPPED = 2;
    public static final int ORIENTATION_UNDEF = 0;
    public static final int SCAN_TYPE_CORRECTED = 4;
    public static final int SCAN_TYPE_INTERLACE_FIELD = 3;
    public static final int SCAN_TYPE_INTERLACE_FRAME = 2;
    public static final int SCAN_TYPE_PROGRESSIVE = 1;
    public static final int SCAN_TYPE_UNDEF = 0;
    public static final int TRANS_STD = 1;
    public static final int TRANS_UNDEF = 0;
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -3415309711643815511L;
    private int boundaryExtraction;
    private int captureDeviceId;
    private byte[] deviceUniqueId;
    private int horizontalOrientation;
    private int imageFormat;
    private int imageTransformation;
    private int intensityDepth;
    private int irisDiameter;
    private int irisOcclusion;
    private int occlusionFilling;
    private int rawImageHeight;
    private int rawImageWidth;
    private long recordLength;
    private StandardBiometricHeader sbh;
    private int scanType;
    private int verticalOrientation;

    public IrisInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this(null, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, bArr, list);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Serializable, org.jmrtd.lds.iso19794.IrisBiometricSubtypeInfo] */
    public IrisInfo(StandardBiometricHeader standardBiometricHeader, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, byte[] bArr, List<IrisBiometricSubtypeInfo> list) {
        this.sbh = standardBiometricHeader;
        if (list == null) {
            throw new IllegalArgumentException("Null irisBiometricSubtypeInfos");
        }
        this.captureDeviceId = i;
        this.horizontalOrientation = i2;
        this.verticalOrientation = i3;
        this.scanType = i4;
        this.irisOcclusion = i5;
        this.occlusionFilling = i6;
        this.boundaryExtraction = i7;
        this.irisDiameter = i8;
        this.imageFormat = i9;
        this.rawImageWidth = i10;
        this.rawImageHeight = i11;
        this.intensityDepth = i12;
        this.imageTransformation = i13;
        long recordLength = 0;
        for (IrisBiometricSubtypeInfo irisBiometricSubtypeInfo : list) {
            recordLength += irisBiometricSubtypeInfo.getRecordLength();
            add(irisBiometricSubtypeInfo);
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("deviceUniqueId invalid");
        }
        byte[] bArr2 = new byte[16];
        this.deviceUniqueId = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.recordLength = recordLength + 45;
    }

    public IrisInfo(InputStream inputStream) throws IOException {
        this(null, inputStream);
    }

    public IrisInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable, org.jmrtd.lds.iso19794.IrisBiometricSubtypeInfo] */
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i = dataInputStream.readInt();
        if (i != FORMAT_IDENTIFIER) {
            throw new IllegalArgumentException("'IIR' marker expected! Found " + Integer.toHexString(i));
        }
        int i2 = dataInputStream.readInt();
        if (i2 != VERSION_NUMBER) {
            throw new IllegalArgumentException("'010' version number expected! Found " + Integer.toHexString(i2));
        }
        long j = dataInputStream.readInt();
        this.recordLength = j;
        long j2 = j - 45;
        this.captureDeviceId = dataInputStream.readUnsignedShort();
        int unsignedByte = dataInputStream.readUnsignedByte();
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (unsignedShort != 45) {
            throw new IllegalArgumentException("Expected header length 45, found " + unsignedShort);
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.horizontalOrientation = unsignedShort2 & 3;
        this.verticalOrientation = (unsignedShort2 & 12) >> 2;
        this.scanType = (unsignedShort2 & 112) >> 4;
        this.irisOcclusion = (unsignedShort2 & 128) >> 7;
        this.occlusionFilling = (unsignedShort2 & 256) >> 8;
        this.boundaryExtraction = (unsignedShort2 & 512) >> 9;
        this.irisDiameter = dataInputStream.readUnsignedShort();
        this.imageFormat = dataInputStream.readUnsignedShort();
        this.rawImageWidth = dataInputStream.readUnsignedShort();
        this.rawImageHeight = dataInputStream.readUnsignedShort();
        this.intensityDepth = dataInputStream.readUnsignedByte();
        this.imageTransformation = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[16];
        this.deviceUniqueId = bArr;
        dataInputStream.readFully(bArr);
        long recordLength = 0;
        for (int i3 = 0; i3 < unsignedByte; i3++) {
            ?? irisBiometricSubtypeInfo = new IrisBiometricSubtypeInfo(inputStream, this.imageFormat);
            recordLength += irisBiometricSubtypeInfo.getRecordLength();
            add((Serializable) irisBiometricSubtypeInfo);
        }
        if (j2 != recordLength) {
            LOGGER.warning("ConstructedDataLength and dataLength differ: dataLength = " + j2 + ", constructedDataLength = " + recordLength);
        }
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        List subRecords = getSubRecords();
        Iterator it = subRecords.iterator();
        int recordLength = 0;
        while (it.hasNext()) {
            recordLength = (int) (recordLength + ((IrisBiometricSubtypeInfo) it.next()).getRecordLength());
        }
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt(recordLength + 45);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeByte(subRecords.size());
        dataOutputStream.writeShort(45);
        dataOutputStream.writeShort((this.horizontalOrientation & 3) | ((this.verticalOrientation << 2) & 12) | ((this.scanType << 4) & 112) | ((this.irisOcclusion << 7) & 128) | ((this.occlusionFilling << 8) & 256) | ((this.boundaryExtraction << 9) & 512));
        dataOutputStream.writeShort(this.irisDiameter);
        dataOutputStream.writeShort(this.imageFormat);
        dataOutputStream.writeShort(this.rawImageWidth);
        dataOutputStream.writeShort(this.rawImageHeight);
        dataOutputStream.writeByte(this.intensityDepth);
        dataOutputStream.writeByte(this.imageTransformation);
        dataOutputStream.write(this.deviceUniqueId);
        Iterator it2 = subRecords.iterator();
        while (it2.hasNext()) {
            ((IrisBiometricSubtypeInfo) it2.next()).writeObject(outputStream);
        }
    }

    public int getCaptureDeviceId() {
        return this.captureDeviceId;
    }

    public int getHorizontalOrientation() {
        return this.horizontalOrientation;
    }

    public int getVerticalOrientation() {
        return this.verticalOrientation;
    }

    public int getScanType() {
        return this.scanType;
    }

    public int getIrisOcclusion() {
        return this.irisOcclusion;
    }

    public int getOcclusionFilling() {
        return this.occlusionFilling;
    }

    public int getBoundaryExtraction() {
        return this.boundaryExtraction;
    }

    public int getIrisDiameter() {
        return this.irisDiameter;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getRawImageWidth() {
        return this.rawImageWidth;
    }

    public int getRawImageHeight() {
        return this.rawImageHeight;
    }

    public int getIntensityDepth() {
        return this.intensityDepth;
    }

    public int getImageTransformation() {
        return this.imageTransformation;
    }

    public byte[] getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(130, bArr);
            treeMap.put(Integer.valueOf(ISO7816.TAG_SM_ENCRYPTED_DATA_WITH_PADDING_INDICATOR), new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 9});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.boundaryExtraction;
        int i2 = this.captureDeviceId;
        int iHashCode2 = Arrays.hashCode(this.deviceUniqueId);
        int i3 = this.horizontalOrientation;
        int i4 = this.imageFormat;
        int i5 = this.imageTransformation;
        int i6 = this.intensityDepth;
        int i7 = this.irisDiameter;
        int i8 = this.irisOcclusion;
        int i9 = this.occlusionFilling;
        int i10 = this.rawImageHeight;
        int i11 = this.rawImageWidth;
        long j = this.recordLength;
        int i12 = (int) (j ^ (j >>> 32));
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + iHashCode2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + (standardBiometricHeader == null ? 0 : standardBiometricHeader.hashCode())) * 31) + this.scanType) * 31) + this.verticalOrientation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        IrisInfo irisInfo = (IrisInfo) obj;
        StandardBiometricHeader standardBiometricHeader = this.sbh;
        if (standardBiometricHeader == null) {
            if (irisInfo.sbh != null) {
                return false;
            }
        } else if (!standardBiometricHeader.equals(irisInfo.sbh)) {
            return false;
        }
        return this.boundaryExtraction == irisInfo.boundaryExtraction && this.captureDeviceId == irisInfo.captureDeviceId && Arrays.equals(this.deviceUniqueId, irisInfo.deviceUniqueId) && this.horizontalOrientation == irisInfo.horizontalOrientation && this.imageFormat == irisInfo.imageFormat && this.imageTransformation == irisInfo.imageTransformation && this.intensityDepth == irisInfo.intensityDepth && this.irisDiameter == irisInfo.irisDiameter && this.irisOcclusion == irisInfo.irisOcclusion && this.occlusionFilling == irisInfo.occlusionFilling && this.rawImageHeight == irisInfo.rawImageHeight && this.rawImageWidth == irisInfo.rawImageWidth && this.recordLength == irisInfo.recordLength && this.scanType == irisInfo.scanType && this.verticalOrientation == irisInfo.verticalOrientation;
    }

    public String toString() {
        return "IrisInfo []";
    }

    public List<IrisBiometricSubtypeInfo> getIrisBiometricSubtypeInfos() {
        return getSubRecords();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addIrisBiometricSubtypeInfo(IrisBiometricSubtypeInfo irisBiometricSubtypeInfo) {
        add(irisBiometricSubtypeInfo);
    }

    public void removeIrisBiometricSubtypeInfo(int i) {
        remove(i);
    }

    private int getBiometricSubtype() {
        Iterator it = getSubRecords().iterator();
        while (it.hasNext()) {
            ((IrisBiometricSubtypeInfo) it.next()).getBiometricSubtype();
        }
        return 0;
    }
}
