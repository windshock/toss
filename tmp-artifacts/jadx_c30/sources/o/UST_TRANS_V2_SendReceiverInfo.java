package o;

import java.io.Serializable;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_V2_SendReceiverInfo implements Serializable {
    private final int[] buffer;
    private final int column;
    private final int index;
    private final int line;
    private final String name;
    private final int pointer;

    public UST_TRANS_V2_SendReceiverInfo(String str, int i, int i2, int i3, int[] iArr, int i4) {
        this.name = str;
        this.index = i;
        this.line = i2;
        this.column = i3;
        this.buffer = iArr;
        this.pointer = i4;
    }

    private boolean onWarmupCompleted(int i) {
        return getCRLDP.onTransact.onExtraCallback(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r3 = net.sf.scuba.smartcards.BuildConfig.FLAVOR;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String IAuthTabCallback(int i, int i2) {
        String str;
        String str2;
        float f = (i2 / 2.0f) - 1.0f;
        int i3 = this.pointer;
        while (true) {
            str = BuildConfig.FLAVOR;
            if (i3 <= 0) {
                break;
            }
            int i4 = i3 - 1;
            if (onWarmupCompleted(this.buffer[i4])) {
                break;
            }
            if (this.pointer - i4 > f) {
                i3 += 4;
                str2 = " ... ";
                break;
            }
            i3 = i4;
        }
        int i5 = this.pointer;
        while (true) {
            int[] iArr = this.buffer;
            if (i5 >= iArr.length || onWarmupCompleted(iArr[i5])) {
                break;
            }
            int i6 = i5 + 1;
            if (i6 - this.pointer > f) {
                i5 -= 4;
                str = " ... ";
                break;
            }
            i5 = i6;
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < i; i7++) {
            sb.append(" ");
        }
        sb.append(str2);
        for (int i8 = i3; i8 < i5; i8++) {
            sb.appendCodePoint(this.buffer[i8]);
        }
        sb.append(str);
        sb.append("\n");
        for (int i9 = 0; i9 < ((this.pointer + i) - i3) + str2.length(); i9++) {
            sb.append(" ");
        }
        sb.append("^");
        return sb.toString();
    }

    public String onExtraCallbackWithResult() {
        return IAuthTabCallback(4, 75);
    }

    public String toString() {
        return " in " + this.name + ", line " + (this.line + 1) + ", column " + (this.column + 1) + ":\n" + onExtraCallbackWithResult();
    }

    public String onWarmupCompleted() {
        return this.name;
    }

    public int onNavigationEvent() {
        return this.line;
    }

    public int onExtraCallback() {
        return this.column;
    }

    public int IAuthTabCallback() {
        return this.index;
    }
}
