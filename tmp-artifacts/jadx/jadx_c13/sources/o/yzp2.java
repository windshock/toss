package o;

import java.io.Serializable;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import org.bouncycastle.asn1.BERTags;
import org.xbill.DNS.NameTooLongException;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.WireParseException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class yzp2 implements Comparable<yzp2>, Serializable {
    public static final yzp2 IAuthTabCallback;
    private static final yzp2 IAuthTabCallbackStub;
    public static final yzp2 onExtraCallback;
    private static final long serialVersionUID = -6036624806201621219L;
    private transient int IAuthTabCallbackDefault;
    private int labels;
    private byte[] name;
    private long offsets;
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onWarmupCompleted((Class<?>) yzp2.class);
    private static final byte[] onExtraCallbackWithResult = {0};
    private static final byte[] onTransact = {1, 42};
    private static final byte[] onNavigationEvent = new byte[256];

    static {
        int i = 0;
        while (true) {
            byte[] bArr = onNavigationEvent;
            if (i >= bArr.length) {
                yzp2 yzp2Var = new yzp2();
                IAuthTabCallback = yzp2Var;
                yzp2Var.name = onExtraCallbackWithResult;
                yzp2Var.labels = 1;
                yzp2 yzp2Var2 = new yzp2();
                onExtraCallback = yzp2Var2;
                yzp2Var2.name = new byte[0];
                yzp2 yzp2Var3 = new yzp2();
                IAuthTabCallbackStub = yzp2Var3;
                yzp2Var3.name = onTransact;
                yzp2Var3.labels = 1;
                return;
            }
            if (i < 65 || i > 90) {
                bArr[i] = (byte) i;
            } else {
                bArr[i] = (byte) (i + 32);
            }
            i++;
        }
    }

    private yzp2() {
    }

    private void IAuthTabCallback(int i, int i2) {
        if (i == 0 || i >= 9) {
            return;
        }
        int i3 = (i - 1) << 3;
        this.offsets = ((~(255 << i3)) & this.offsets) | (i2 << i3);
    }

    private int IAuthTabCallback(int i) {
        if (i == 0) {
            return 0;
        }
        if (i <= 0 || i >= this.labels) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 9) {
            return ((int) (this.offsets >>> ((i - 1) << 3))) & 255;
        }
        int i2 = ((int) (this.offsets >>> 56)) & 255;
        for (int i3 = 8; i3 < i; i3++) {
            i2 += this.name[i2] + 1;
        }
        return i2;
    }

    private static void IAuthTabCallback(yzp2 yzp2Var, yzp2 yzp2Var2) {
        yzp2Var2.name = yzp2Var.name;
        yzp2Var2.offsets = yzp2Var.offsets;
        yzp2Var2.labels = yzp2Var.labels;
    }

    private void onNavigationEvent(byte[] bArr, int i, int i2) throws NameTooLongException {
        byte[] bArrCopyOf;
        byte[] bArr2 = this.name;
        int length = bArr2 == null ? 0 : bArr2.length;
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3] + 1;
            i3 += i6;
            i4 += i6;
        }
        int i7 = length + i4;
        if (i7 > 255) {
            throw new NameTooLongException();
        }
        byte[] bArr3 = this.name;
        if (bArr3 != null) {
            bArrCopyOf = Arrays.copyOf(bArr3, i7);
        } else {
            bArrCopyOf = new byte[i7];
        }
        System.arraycopy(bArr, i, bArrCopyOf, length, i4);
        this.name = bArrCopyOf;
        for (int i8 = 0; i8 < i2 && i8 < 9; i8++) {
            IAuthTabCallback(this.labels + i8, length);
            length += bArrCopyOf[length] + 1;
        }
        this.labels += i2;
    }

    private void onExtraCallback(char[] cArr, int i) throws NameTooLongException {
        int iOnNavigationEvent = onNavigationEvent(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.name[iOnNavigationEvent + i2] = (byte) cArr[i2];
        }
    }

    private int onNavigationEvent(int i) throws NameTooLongException {
        byte[] bArrCopyOf;
        byte[] bArr = this.name;
        int length = bArr == null ? 0 : bArr.length;
        int i2 = length + 1;
        int i3 = i2 + i;
        if (i3 > 255) {
            throw new NameTooLongException();
        }
        if (bArr != null) {
            bArrCopyOf = Arrays.copyOf(bArr, i3);
        } else {
            bArrCopyOf = new byte[i3];
        }
        bArrCopyOf[length] = (byte) i;
        this.name = bArrCopyOf;
        IAuthTabCallback(this.labels, length);
        this.labels++;
        return i2;
    }

    private void onWarmupCompleted(String str, char[] cArr, int i) throws TextParseException {
        try {
            onExtraCallback(cArr, i);
        } catch (NameTooLongException e) {
            throw new TextParseException(str, "Name too long", e);
        }
    }

    private void IAuthTabCallback(String str, byte[] bArr, int i) throws TextParseException {
        try {
            onNavigationEvent(bArr, 0, i);
        } catch (NameTooLongException unused) {
            throw new TextParseException(str, "Name too long");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yzp2(String str, yzp2 yzp2Var) throws TextParseException {
        char c;
        boolean zOnNavigationEvent;
        char c2;
        char c3;
        int iHashCode = str.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 46) {
                c = (iHashCode == 64 && str.equals("@")) ? (char) 2 : (char) 65535;
            } else if (str.equals(".")) {
                c = 1;
            }
        } else if (str.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
            c = 0;
        }
        if (c == 0) {
            throw new TextParseException("empty name");
        }
        if (c == 1) {
            IAuthTabCallback(IAuthTabCallback, this);
            return;
        }
        if (c == 2) {
            if (yzp2Var == null) {
                IAuthTabCallback(onExtraCallback, this);
                return;
            } else {
                IAuthTabCallback(yzp2Var, this);
                return;
            }
        }
        char[] cArr = new char[63];
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt > 255) {
                throw new TextParseException(str, "Illegal character in name");
            }
            if (z) {
                if (cCharAt >= '0' && cCharAt <= '9' && i < 3) {
                    i++;
                    i4 = (i4 * 10) + (cCharAt - '0');
                    if (i4 > 255) {
                        throw new TextParseException(str, "bad escape");
                    }
                    if (i >= 3) {
                        cCharAt = (char) i4;
                    }
                    c2 = '.';
                    c3 = '?';
                } else if (i > 0 && i < 3) {
                    throw new TextParseException(str, "bad escape");
                }
                if (i3 >= 63) {
                    throw new TextParseException(str, "label too long");
                }
                cArr[i3] = cCharAt;
                i2 = i3;
                z = false;
                i3++;
                c2 = '.';
                c3 = '?';
            } else if (cCharAt == '\\') {
                c2 = '.';
                c3 = '?';
                i = 0;
                z = true;
                i4 = 0;
            } else {
                c2 = '.';
                if (cCharAt == '.') {
                    if (i2 == -1) {
                        throw new TextParseException(str, "invalid empty label");
                    }
                    onWarmupCompleted(str, cArr, i3);
                    i2 = -1;
                    c3 = '?';
                    i3 = 0;
                } else {
                    i2 = i2 == -1 ? i5 : i2;
                    c3 = '?';
                    if (i3 >= 63) {
                        throw new TextParseException(str, "label too long");
                    }
                    cArr[i3] = cCharAt;
                    i3++;
                }
            }
        }
        if ((i > 0 && i < 3) || z) {
            throw new TextParseException(str, "bad escape");
        }
        if (i2 == -1) {
            IAuthTabCallback(str, onExtraCallbackWithResult, 1);
            zOnNavigationEvent = true;
        } else {
            onWarmupCompleted(str, cArr, i3);
            zOnNavigationEvent = false;
        }
        if (yzp2Var != null && !zOnNavigationEvent) {
            zOnNavigationEvent = yzp2Var.onNavigationEvent();
            IAuthTabCallback(str, yzp2Var.name, yzp2Var.labels);
        }
        if (!zOnNavigationEvent && onExtraCallbackWithResult() == 255) {
            throw new TextParseException(str, "Name too long");
        }
    }

    public static yzp2 onExtraCallback(String str, yzp2 yzp2Var) throws TextParseException {
        if (str.equals("@")) {
            return yzp2Var != null ? yzp2Var : onExtraCallback;
        }
        if (str.equals(".")) {
            return IAuthTabCallback;
        }
        return new yzp2(str, yzp2Var);
    }

    public static yzp2 onExtraCallbackWithResult(String str) throws TextParseException {
        return onExtraCallback(str, (yzp2) null);
    }

    public static yzp2 onWarmupCompleted(String str) {
        try {
            return onExtraCallback(str, (yzp2) null);
        } catch (TextParseException unused) {
            throw new IllegalArgumentException("Invalid name '" + str + "'");
        }
    }

    public yzp2(getBlob getblob) throws WireParseException {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int iAsInterface = getblob.asInterface();
            int i = iAsInterface & BERTags.PRIVATE;
            if (i != 0) {
                if (i == 192) {
                    int iAsInterface2 = getblob.asInterface() + ((iAsInterface & (-193)) << 8);
                    getblob.onWarmupCompleted();
                    if (iAsInterface2 >= getblob.onWarmupCompleted() - 2) {
                        throw new WireParseException("bad compression");
                    }
                    if (!z2) {
                        getblob.IAuthTabCallbackStub();
                        z2 = true;
                    }
                    getblob.onExtraCallback(iAsInterface2);
                } else {
                    throw new WireParseException("bad label type");
                }
            } else if (iAsInterface == 0) {
                onNavigationEvent(onExtraCallbackWithResult, 0, 1);
                z = true;
            } else {
                bArr[0] = (byte) iAsInterface;
                getblob.onExtraCallback(bArr, 1, iAsInterface);
                onNavigationEvent(bArr, 0, 1);
            }
        }
        if (z2) {
            getblob.onTransact();
        }
    }

    public yzp2(yzp2 yzp2Var, int i) {
        int i2 = yzp2Var.labels;
        if (i > i2) {
            throw new IllegalArgumentException("attempted to remove too many labels");
        }
        if (i == i2) {
            IAuthTabCallback(onExtraCallback, this);
            return;
        }
        this.labels = i2 - i;
        this.name = Arrays.copyOfRange(yzp2Var.name, yzp2Var.IAuthTabCallback(i), yzp2Var.name.length);
        int iIAuthTabCallback = yzp2Var.IAuthTabCallback(i);
        for (int i3 = 1; i3 < 9 && i3 < this.labels; i3++) {
            IAuthTabCallback(i3, yzp2Var.IAuthTabCallback(i3 + i) - iIAuthTabCallback);
        }
    }

    public static yzp2 onWarmupCompleted(yzp2 yzp2Var, yzp2 yzp2Var2) throws NameTooLongException {
        if (yzp2Var.onNavigationEvent()) {
            return yzp2Var;
        }
        yzp2 yzp2Var3 = new yzp2();
        yzp2Var3.onNavigationEvent(yzp2Var.name, 0, yzp2Var.labels);
        yzp2Var3.onNavigationEvent(yzp2Var2.name, 0, yzp2Var2.labels);
        return yzp2Var3;
    }

    public yzp2 onWarmupCompleted(yzp2 yzp2Var) {
        if (yzp2Var == null || !IAuthTabCallback(yzp2Var)) {
            return this;
        }
        yzp2 yzp2Var2 = new yzp2();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult() - yzp2Var.onExtraCallbackWithResult();
        yzp2Var2.labels = this.labels - yzp2Var.labels;
        yzp2Var2.offsets = this.offsets;
        byte[] bArr = new byte[iOnExtraCallbackWithResult];
        yzp2Var2.name = bArr;
        System.arraycopy(this.name, 0, bArr, 0, iOnExtraCallbackWithResult);
        return yzp2Var2;
    }

    public yzp2 onExtraCallback(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("must replace 1 or more labels");
        }
        try {
            yzp2 yzp2Var = new yzp2();
            IAuthTabCallback(IAuthTabCallbackStub, yzp2Var);
            yzp2Var.onNavigationEvent(this.name, IAuthTabCallback(i), this.labels - i);
            return yzp2Var;
        } catch (NameTooLongException unused) {
            throw new IllegalStateException("Name.wild: concatenate failed");
        }
    }

    public yzp2 onExtraCallbackWithResult(uhzb uhzbVar) throws NameTooLongException {
        yzp2 yzp2VarAccess000 = uhzbVar.access000();
        yzp2 yzp2VarOnExtraCallbackWithResult = uhzbVar.onExtraCallbackWithResult();
        if (!IAuthTabCallback(yzp2VarAccess000)) {
            return null;
        }
        int i = this.labels;
        int i2 = yzp2VarAccess000.labels;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult() - yzp2VarAccess000.onExtraCallbackWithResult();
        int i3 = yzp2VarOnExtraCallbackWithResult.labels;
        short sOnExtraCallbackWithResult = yzp2VarOnExtraCallbackWithResult.onExtraCallbackWithResult();
        int i4 = iOnExtraCallbackWithResult + sOnExtraCallbackWithResult;
        if (i4 > 255) {
            throw new NameTooLongException();
        }
        yzp2 yzp2Var = new yzp2();
        int i5 = (i - i2) + i3;
        yzp2Var.labels = i5;
        byte[] bArrCopyOf = Arrays.copyOf(this.name, i4);
        yzp2Var.name = bArrCopyOf;
        System.arraycopy(yzp2VarOnExtraCallbackWithResult.name, 0, bArrCopyOf, iOnExtraCallbackWithResult, sOnExtraCallbackWithResult);
        int i6 = 0;
        for (int i7 = 0; i7 < 9 && i7 < i5; i7++) {
            yzp2Var.IAuthTabCallback(i7, i6);
            i6 += yzp2Var.name[i6] + 1;
        }
        return yzp2Var;
    }

    public boolean onWarmupCompleted() {
        if (this.labels == 0) {
            return false;
        }
        byte[] bArr = this.name;
        return bArr[0] == 1 && bArr[1] == 42;
    }

    public boolean onNavigationEvent() {
        int i = this.labels;
        return i != 0 && this.name[IAuthTabCallback(i - 1)] == 0;
    }

    public short onExtraCallbackWithResult() {
        if (this.labels == 0) {
            return (short) 0;
        }
        return (short) this.name.length;
    }

    public int IAuthTabCallback() {
        return this.labels;
    }

    public boolean IAuthTabCallback(yzp2 yzp2Var) {
        int i = yzp2Var.labels;
        int i2 = this.labels;
        if (i > i2) {
            return false;
        }
        if (i == i2) {
            return equals(yzp2Var);
        }
        return yzp2Var.onExtraCallbackWithResult(this.name, IAuthTabCallback(i2 - i));
    }

    private String onNavigationEvent(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i + 1;
        int i3 = bArr[i];
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            int i5 = bArr[i4] & 255;
            if (i5 <= 32 || i5 >= 127) {
                sb.append('\\');
                if (i5 < 10) {
                    sb.append("00");
                } else if (i5 < 100) {
                    sb.append('0');
                }
                sb.append(i5);
            } else if (i5 == 34 || i5 == 40 || i5 == 41 || i5 == 46 || i5 == 59 || i5 == 92 || i5 == 64 || i5 == 36) {
                sb.append('\\');
                sb.append((char) i5);
            } else {
                sb.append((char) i5);
            }
        }
        return sb.toString();
    }

    public String IAuthTabCallback(boolean z) {
        int i = this.labels;
        if (i == 0) {
            return "@";
        }
        int i2 = 0;
        if (i == 1 && this.name[0] == 0) {
            return ".";
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            if (i2 >= this.labels) {
                break;
            }
            byte b = this.name[i3];
            if (b != 0) {
                if (i2 > 0) {
                    sb.append('.');
                }
                sb.append(onNavigationEvent(this.name, i3));
                i3 += b + 1;
                i2++;
            } else if (!z) {
                sb.append('.');
            }
        }
        return sb.toString();
    }

    public String toString() {
        return IAuthTabCallback(false);
    }

    public String onWarmupCompleted(int i) {
        return onNavigationEvent(this.name, IAuthTabCallback(i));
    }

    public void onExtraCallbackWithResult(deactivate deactivateVar, ryzb ryzbVar) {
        if (!onNavigationEvent()) {
            throw new IllegalArgumentException("toWire() called on non-absolute name");
        }
        int i = 0;
        while (i < this.labels - 1) {
            yzp2 yzp2Var = i == 0 ? this : new yzp2(this, i);
            int iOnExtraCallback = ryzbVar != null ? ryzbVar.onExtraCallback(yzp2Var) : -1;
            if (iOnExtraCallback >= 0) {
                deactivateVar.IAuthTabCallback(49152 | iOnExtraCallback);
                return;
            }
            if (ryzbVar != null) {
                ryzbVar.onNavigationEvent(deactivateVar.onNavigationEvent(), yzp2Var);
            }
            int iIAuthTabCallback = IAuthTabCallback(i);
            byte[] bArr = this.name;
            deactivateVar.onExtraCallback(bArr, iIAuthTabCallback, bArr[iIAuthTabCallback] + 1);
            i++;
        }
        deactivateVar.onNavigationEvent(0);
    }

    public void IAuthTabCallback(deactivate deactivateVar) {
        deactivateVar.onNavigationEvent(onExtraCallback());
    }

    public byte[] onExtraCallback() {
        if (this.labels == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[this.name.length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.labels; i3++) {
            byte b = this.name[i];
            i++;
            bArr[i2] = b;
            i2++;
            int i4 = 0;
            while (i4 < b) {
                bArr[i2] = onNavigationEvent[this.name[i] & 255];
                i4++;
                i2++;
                i++;
            }
        }
        return bArr;
    }

    public void onNavigationEvent(deactivate deactivateVar, ryzb ryzbVar, boolean z) {
        if (z) {
            IAuthTabCallback(deactivateVar);
        } else {
            onExtraCallbackWithResult(deactivateVar, ryzbVar);
        }
    }

    private boolean onExtraCallbackWithResult(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.labels; i3++) {
            byte b = this.name[i2];
            if (b != bArr[i]) {
                return false;
            }
            i2++;
            i++;
            int i4 = 0;
            while (i4 < b) {
                byte[] bArr2 = onNavigationEvent;
                if (bArr2[this.name[i2] & 255] != bArr2[bArr[i] & 255]) {
                    return false;
                }
                i4++;
                i++;
                i2++;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yzp2)) {
            return false;
        }
        yzp2 yzp2Var = (yzp2) obj;
        if (yzp2Var.labels == this.labels && yzp2Var.hashCode() == hashCode()) {
            return onExtraCallbackWithResult(yzp2Var.name, 0);
        }
        return false;
    }

    public int hashCode() {
        int i = this.IAuthTabCallbackDefault;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int iIAuthTabCallback = IAuthTabCallback(0);
        while (true) {
            byte[] bArr = this.name;
            if (iIAuthTabCallback < bArr.length) {
                i2 += (i2 << 3) + (onNavigationEvent[bArr[iIAuthTabCallback] & 255] & 255);
                iIAuthTabCallback++;
            } else {
                this.IAuthTabCallbackDefault = i2;
                return i2;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int compareTo(yzp2 yzp2Var) {
        if (this == yzp2Var) {
            return 0;
        }
        int i = yzp2Var.labels;
        int iMin = Math.min(this.labels, i);
        for (int i2 = 1; i2 <= iMin; i2++) {
            int iIAuthTabCallback = IAuthTabCallback(this.labels - i2);
            int iIAuthTabCallback2 = yzp2Var.IAuthTabCallback(i - i2);
            byte b = this.name[iIAuthTabCallback];
            byte b2 = yzp2Var.name[iIAuthTabCallback2];
            for (int i3 = 0; i3 < b && i3 < b2; i3++) {
                byte[] bArr = onNavigationEvent;
                int i4 = (bArr[this.name[(i3 + iIAuthTabCallback) + 1] & 255] & 255) - (bArr[yzp2Var.name[(i3 + iIAuthTabCallback2) + 1] & 255] & 255);
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b != b2) {
                return b - b2;
            }
        }
        return this.labels - i;
    }
}
