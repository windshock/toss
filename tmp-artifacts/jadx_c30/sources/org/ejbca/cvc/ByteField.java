package org.ejbca.cvc;

import java.math.BigInteger;
import net.sf.scuba.smartcards.BuildConfig;
import org.ejbca.cvc.util.StringConverter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ByteField extends AbstractDataField {
    private static final long serialVersionUID = 1;
    private byte[] data;
    private boolean showBitLength;

    ByteField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
        this.showBitLength = false;
    }

    ByteField(CVCTagEnum cVCTagEnum, byte[] bArr) {
        this(cVCTagEnum, bArr, false);
    }

    ByteField(CVCTagEnum cVCTagEnum, byte[] bArr, boolean z) {
        super(cVCTagEnum);
        this.data = bArr;
        this.showBitLength = z;
    }

    public boolean isShowBitLength() {
        return this.showBitLength;
    }

    public void setShowBitLength(boolean z) {
        this.showBitLength = z;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    protected byte[] getEncoded() {
        return this.data;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    protected String valueAsText() {
        String str;
        if (!this.showBitLength) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "[" + (this.data != null ? new BigInteger(1, this.data).bitLength() : 0) + "]  ";
        }
        return str + StringConverter.byteToHex(this.data);
    }
}
