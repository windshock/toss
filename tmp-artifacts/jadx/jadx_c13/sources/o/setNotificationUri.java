package o;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import okhttp3.internal.http2.Settings;
import org.xbill.DNS.Rcode;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setNotificationUri implements Cloneable {
    private static final Random onExtraCallback = new SecureRandom();
    private int IAuthTabCallback;
    private int[] onExtraCallbackWithResult;
    private int onWarmupCompleted;

    public setNotificationUri(int i) {
        if (!lt56.onNavigationEvent(i)) {
            throw new IllegalArgumentException("DNS message ID " + i + " is out of range");
        }
        this.onExtraCallbackWithResult = new int[4];
        this.onWarmupCompleted = 0;
        this.IAuthTabCallback = i;
    }

    public setNotificationUri() {
        this(onExtraCallback.nextInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE));
    }

    setNotificationUri(getBlob getblob) throws IOException {
        this(getblob.onExtraCallbackWithResult());
        this.onWarmupCompleted = getblob.onExtraCallbackWithResult();
        int i = 0;
        while (true) {
            int[] iArr = this.onExtraCallbackWithResult;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = getblob.onExtraCallbackWithResult();
            i++;
        }
    }

    public setNotificationUri(byte[] bArr) throws IOException {
        this(new getBlob(bArr));
    }

    void onNavigationEvent(deactivate deactivateVar) {
        deactivateVar.IAuthTabCallback(onNavigationEvent());
        deactivateVar.IAuthTabCallback(this.onWarmupCompleted);
        for (int i : this.onExtraCallbackWithResult) {
            deactivateVar.IAuthTabCallback(i);
        }
    }

    public byte[] asInterface() {
        deactivate deactivateVar = new deactivate();
        onNavigationEvent(deactivateVar);
        return deactivateVar.IAuthTabCallback();
    }

    private static boolean access000(int i) {
        return i >= 0 && i <= 15 && requery.onExtraCallback(i);
    }

    private static void access100(int i) {
        if (access000(i)) {
            return;
        }
        throw new IllegalArgumentException("invalid flag bit " + i);
    }

    static int onExtraCallback(int i, int i2, boolean z) {
        access100(i2);
        int i3 = 1 << (15 - i2);
        return z ? i | i3 : i & (~i3);
    }

    static boolean onExtraCallbackWithResult(int i, int i2) {
        access100(i2);
        return (i & (1 << (15 - i2))) != 0;
    }

    public void IAuthTabCallback(int i) {
        access100(i);
        this.onWarmupCompleted = onExtraCallback(this.onWarmupCompleted, i, true);
    }

    public void IAuthTabCallbackStub(int i) {
        access100(i);
        this.onWarmupCompleted = onExtraCallback(this.onWarmupCompleted, i, false);
    }

    public boolean onExtraCallback(int i) {
        return onExtraCallbackWithResult(this.onWarmupCompleted, i);
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public void IAuthTabCallbackDefault(int i) {
        if (!lt56.onNavigationEvent(i)) {
            throw new IllegalArgumentException("DNS message ID " + i + " is out of range");
        }
        this.IAuthTabCallback = i;
    }

    public void onTransact(int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("DNS Rcode " + i + " is out of range");
        }
        this.onWarmupCompleted = i | (this.onWarmupCompleted & (-16));
    }

    public int onExtraCallback() {
        return this.onWarmupCompleted & 15;
    }

    public void asInterface(int i) {
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("DNS Opcode " + i + "is out of range");
        }
        this.onWarmupCompleted = (i << 11) | (this.onWarmupCompleted & 34815);
    }

    public int IAuthTabCallback() {
        return (this.onWarmupCompleted >> 11) & 15;
    }

    void onExtraCallback(int i, int i2) {
        if (!lt56.onNavigationEvent(i2)) {
            throw new IllegalArgumentException("DNS section count " + i2 + " is out of range");
        }
        this.onExtraCallbackWithResult[i] = i2;
    }

    void onWarmupCompleted(int i) {
        int[] iArr = this.onExtraCallbackWithResult;
        int i2 = iArr[i];
        if (i2 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = i2 + 1;
    }

    void onExtraCallbackWithResult(int i) {
        int[] iArr = this.onExtraCallbackWithResult;
        int i2 = iArr[i];
        if (i2 == 0) {
            throw new IllegalStateException("DNS section count cannot be decremented");
        }
        iArr[i] = i2 - 1;
    }

    public int onNavigationEvent(int i) {
        return this.onExtraCallbackWithResult[i];
    }

    int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    private void onNavigationEvent(StringBuilder sb) {
        for (int i = 0; i < 16; i++) {
            if (access000(i) && onExtraCallback(i)) {
                sb.append(requery.onExtraCallbackWithResult(i));
                sb.append(" ");
            }
        }
    }

    String asBinder(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(";; ->>HEADER<<- ");
        sb.append("opcode: ");
        sb.append(lt20.IAuthTabCallback(IAuthTabCallback()));
        sb.append(", status: ");
        sb.append(Rcode.onWarmupCompleted(i));
        sb.append(", id: ");
        sb.append(onNavigationEvent());
        sb.append("\n");
        sb.append(";; flags: ");
        onNavigationEvent(sb);
        sb.append("; ");
        for (int i2 = 0; i2 < 4; i2++) {
            sb.append(lt27.onExtraCallback(i2));
            sb.append(": ");
            sb.append(onNavigationEvent(i2));
            sb.append(" ");
        }
        return sb.toString();
    }

    public String toString() {
        return asBinder(onExtraCallback());
    }

    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public setNotificationUri clone() {
        setNotificationUri setnotificationuri = (setNotificationUri) super.clone();
        setnotificationuri.IAuthTabCallback = this.IAuthTabCallback;
        setnotificationuri.onWarmupCompleted = this.onWarmupCompleted;
        int[] iArr = new int[setnotificationuri.onExtraCallbackWithResult.length];
        setnotificationuri.onExtraCallbackWithResult = iArr;
        int[] iArr2 = this.onExtraCallbackWithResult;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        return setnotificationuri;
    }
}
