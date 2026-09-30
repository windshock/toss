package o;

import java.io.Serializable;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity4 implements dj11, Cloneable, Serializable {
    public static final dj4 onWarmupCompleted = new dj4(21589);
    private static final long serialVersionUID = 1;
    private dj12 accessTime;
    private boolean bit0_modifyTimePresent;
    private boolean bit1_accessTimePresent;
    private boolean bit2_createTimePresent;
    private dj12 createTime;
    private byte flags;
    private dj12 modifyTime;

    private static dj12 to_(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return onWarmupCompleted(PAGNativeAdLoadCallback.tH_(fileTime));
    }

    private static FileTime tp_(dj12 dj12Var) {
        if (dj12Var != null) {
            return PAGNativeAdLoadCallback.tI_(dj12Var.IAuthTabCallback());
        }
        return null;
    }

    private static dj12 onWarmupCompleted(long j) {
        if (!PAGNativeAdLoadCallback.onExtraCallbackWithResult(j)) {
            throw new IllegalArgumentException("X5455 timestamps must fit in a signed 32 bit integer: " + j);
        }
        return new dj12(j);
    }

    private static Date onExtraCallbackWithResult(dj12 dj12Var) {
        if (dj12Var != null) {
            return new Date(dj12Var.IAuthTabCallback() * 1000);
        }
        return null;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TTWebsiteActivity4)) {
            return false;
        }
        TTWebsiteActivity4 tTWebsiteActivity4 = (TTWebsiteActivity4) obj;
        return (this.flags & 7) == (tTWebsiteActivity4.flags & 7) && Objects.equals(this.modifyTime, tTWebsiteActivity4.modifyTime) && Objects.equals(this.accessTime, tTWebsiteActivity4.accessTime) && Objects.equals(this.createTime, tTWebsiteActivity4.createTime);
    }

    public FileTime tq_() {
        return tp_(this.accessTime);
    }

    public Date asInterface() {
        return onExtraCallbackWithResult(this.accessTime);
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return Arrays.copyOf(onExtraCallbackWithResult(), IAuthTabCallback().onNavigationEvent());
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return new dj4((this.bit0_modifyTimePresent ? 4 : 0) + 1);
    }

    public FileTime tr_() {
        return tp_(this.createTime);
    }

    public Date IAuthTabCallbackDefault() {
        return onExtraCallbackWithResult(this.createTime);
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onWarmupCompleted;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        dj12 dj12Var;
        dj12 dj12Var2;
        byte[] bArr = new byte[onExtraCallback().onNavigationEvent()];
        bArr[0] = 0;
        int i = 1;
        if (this.bit0_modifyTimePresent) {
            bArr[0] = 1;
            System.arraycopy(this.modifyTime.onExtraCallbackWithResult(), 0, bArr, 1, 4);
            i = 5;
        }
        if (this.bit1_accessTimePresent && (dj12Var2 = this.accessTime) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(dj12Var2.onExtraCallbackWithResult(), 0, bArr, i, 4);
            i += 4;
        }
        if (this.bit2_createTimePresent && (dj12Var = this.createTime) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(dj12Var.onExtraCallbackWithResult(), 0, bArr, i, 4);
        }
        return bArr;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        int i = this.bit0_modifyTimePresent ? 4 : 0;
        return new dj4(i + 1 + ((!this.bit1_accessTimePresent || this.accessTime == null) ? 0 : 4) + ((!this.bit2_createTimePresent || this.createTime == null) ? 0 : 4));
    }

    public FileTime ts_() {
        return tp_(this.modifyTime);
    }

    public Date access100() {
        return onExtraCallbackWithResult(this.modifyTime);
    }

    public int hashCode() {
        int iRotateLeft = (this.flags & 7) * (-123);
        dj12 dj12Var = this.modifyTime;
        if (dj12Var != null) {
            iRotateLeft ^= dj12Var.hashCode();
        }
        dj12 dj12Var2 = this.accessTime;
        if (dj12Var2 != null) {
            iRotateLeft ^= Integer.rotateLeft(dj12Var2.hashCode(), 11);
        }
        dj12 dj12Var3 = this.createTime;
        return dj12Var3 != null ? iRotateLeft ^ Integer.rotateLeft(dj12Var3.hashCode(), 22) : iRotateLeft;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.bit0_modifyTimePresent;
    }

    public boolean getInterfaceDescriptor() {
        return this.bit1_accessTimePresent;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.bit2_createTimePresent;
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        access000();
        onWarmupCompleted(bArr, i, i2);
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        int i4;
        access000();
        if (i2 <= 0) {
            throw new ZipException("X5455_ExtendedTimestamp too short, only " + i2 + " bytes");
        }
        int i5 = i2 + i;
        int i6 = i + 1;
        onNavigationEvent(bArr[i]);
        if (this.bit0_modifyTimePresent && (i4 = i + 5) <= i5) {
            this.modifyTime = new dj12(bArr, i6);
            i6 = i4;
        } else {
            this.bit0_modifyTimePresent = false;
        }
        if (this.bit1_accessTimePresent && (i3 = i6 + 4) <= i5) {
            this.accessTime = new dj12(bArr, i6);
            i6 = i3;
        } else {
            this.bit1_accessTimePresent = false;
        }
        if (this.bit2_createTimePresent && i6 + 4 <= i5) {
            this.createTime = new dj12(bArr, i6);
        } else {
            this.bit2_createTimePresent = false;
        }
    }

    private void access000() {
        onNavigationEvent((byte) 0);
        this.modifyTime = null;
        this.accessTime = null;
        this.createTime = null;
    }

    public void tt_(FileTime fileTime) {
        IAuthTabCallback(to_(fileTime));
    }

    public void IAuthTabCallback(dj12 dj12Var) {
        this.bit1_accessTimePresent = dj12Var != null;
        byte b = this.flags;
        this.flags = (byte) (dj12Var != null ? b | 2 : b & (-3));
        this.accessTime = dj12Var;
    }

    public void tu_(FileTime fileTime) {
        onWarmupCompleted(to_(fileTime));
    }

    public void onWarmupCompleted(dj12 dj12Var) {
        this.bit2_createTimePresent = dj12Var != null;
        byte b = this.flags;
        this.flags = (byte) (dj12Var != null ? b | 4 : b & (-5));
        this.createTime = dj12Var;
    }

    public void onNavigationEvent(byte b) {
        this.flags = b;
        this.bit0_modifyTimePresent = (b & 1) == 1;
        this.bit1_accessTimePresent = (b & 2) == 2;
        this.bit2_createTimePresent = (b & 4) == 4;
    }

    public void tv_(FileTime fileTime) {
        onExtraCallback(to_(fileTime));
    }

    public void onExtraCallback(dj12 dj12Var) {
        this.bit0_modifyTimePresent = dj12Var != null;
        this.flags = (byte) (dj12Var != null ? 1 | this.flags : this.flags & (-2));
        this.modifyTime = dj12Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x5455 Zip Extra Field: Flags=");
        sb.append(Integer.toBinaryString(dj5.onWarmupCompleted((int) this.flags)));
        sb.append(" ");
        if (this.bit0_modifyTimePresent && this.modifyTime != null) {
            Date dateAccess100 = access100();
            sb.append(" Modify:[");
            sb.append(dateAccess100);
            sb.append("] ");
        }
        if (this.bit1_accessTimePresent && this.accessTime != null) {
            Date dateAsInterface = asInterface();
            sb.append(" Access:[");
            sb.append(dateAsInterface);
            sb.append("] ");
        }
        if (this.bit2_createTimePresent && this.createTime != null) {
            Date dateIAuthTabCallbackDefault = IAuthTabCallbackDefault();
            sb.append(" Create:[");
            sb.append(dateIAuthTabCallbackDefault);
            sb.append("] ");
        }
        return sb.toString();
    }
}
