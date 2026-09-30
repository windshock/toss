package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import o.verifySignatureValue_NoAlgorithmInfo;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.BiometricDataBlockDecoder;
import org.jmrtd.cbeff.BiometricDataBlockEncoder;
import org.jmrtd.cbeff.ComplexCBEFFInfo;
import org.jmrtd.cbeff.ISO781611Decoder;
import org.jmrtd.cbeff.ISO781611Encoder;
import org.jmrtd.cbeff.SimpleCBEFFInfo;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.CBEFFDataGroup;
import org.jmrtd.lds.iso19794.IrisInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class DG4File extends CBEFFDataGroup<IrisInfo> {
    private static final ISO781611Decoder DECODER = new ISO781611Decoder(new BiometricDataBlockDecoder<IrisInfo>() { // from class: org.jmrtd.lds.icao.DG4File.1
        public IrisInfo decode(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) throws IOException {
            return new IrisInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final ISO781611Encoder<IrisInfo> ENCODER = new ISO781611Encoder<>(new BiometricDataBlockEncoder<IrisInfo>() { // from class: org.jmrtd.lds.icao.DG4File.2
        public void encode(IrisInfo irisInfo, OutputStream outputStream) throws IOException {
            irisInfo.writeObject(outputStream);
        }
    });
    private static final long serialVersionUID = -1290365855823447586L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG4File(List<IrisInfo> list) {
        this(list, true);
    }

    public DG4File(List<IrisInfo> list, boolean z) {
        super(118, list);
        this.shouldAddRandomDataIfEmpty = z;
    }

    public DG4File(InputStream inputStream) throws IOException {
        super(118, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        for (SimpleCBEFFInfo simpleCBEFFInfo : DECODER.decode(inputStream).getSubRecords()) {
            if (!(simpleCBEFFInfo instanceof SimpleCBEFFInfo)) {
                throw new IOException("Was expecting a SimpleCBEFFInfo, found " + simpleCBEFFInfo.getClass().getSimpleName());
            }
            BiometricDataBlock biometricDataBlock = simpleCBEFFInfo.getBiometricDataBlock();
            if (!(biometricDataBlock instanceof IrisInfo)) {
                throw new IOException("Was expecting an IrisInfo, found " + biometricDataBlock.getClass().getSimpleName());
            }
            add((IrisInfo) biometricDataBlock);
        }
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        ComplexCBEFFInfo complexCBEFFInfo = new ComplexCBEFFInfo();
        Iterator it = getSubRecords().iterator();
        while (it.hasNext()) {
            complexCBEFFInfo.add(new SimpleCBEFFInfo((IrisInfo) it.next()));
        }
        ENCODER.encode(complexCBEFFInfo, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            writeOptionalRandomData(outputStream);
        }
    }

    public String toString() {
        return "DG4File [" + super.toString() + "]";
    }

    public List<IrisInfo> getIrisInfos() {
        return getSubRecords();
    }

    public void addIrisInfo(IrisInfo irisInfo) {
        add(irisInfo);
    }

    public void removeIrisInfo(int i) {
        remove(i);
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.shouldAddRandomDataIfEmpty ? 1231 : verifySignatureValue_NoAlgorithmInfo.ACTIVITY_REQ_PAYMENT_CHARGE_ACCOUNT_CHOOSER);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && getClass() == obj.getClass() && this.shouldAddRandomDataIfEmpty == ((DG4File) obj).shouldAddRandomDataIfEmpty;
    }
}
