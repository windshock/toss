package o;

import java.util.Arrays;
import java.util.function.IntToLongFunction;
import o.onAdDismissed;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onAdDismissed extends PAGRequest {
    private final int IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private long access000;
    private final long access100;
    private final int asInterface;
    private final long[] extraCallback;
    private final int extraCallbackWithResult;
    private final int getInterfaceDescriptor;
    private final long writeTypedObject;

    public onAdDismissed(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public onAdDismissed(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    public onAdDismissed(int i, final int i2, int i3, int i4) {
        if (i <= 0 || i > 5) {
            throw new IllegalArgumentException("1<=b<=5");
        }
        if (i2 <= 0 || i2 > 256) {
            throw new IllegalArgumentException("1<=h<=256");
        }
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException("0<=s<=2");
        }
        if (i4 < 0 || i4 > 1) {
            throw new IllegalArgumentException("0<=d<=1");
        }
        if (i == 1 && i2 != 256) {
            throw new IllegalArgumentException("b=1 -> h=256");
        }
        if (i2 == 256 && i == 5) {
            throw new IllegalArgumentException("h=256 -> b!=5");
        }
        this.asInterface = i;
        this.IAuthTabCallbackStubProxy = i2;
        this.extraCallbackWithResult = i3;
        this.IAuthTabCallback_Parcel = i4;
        this.getInterfaceDescriptor = 256 - i2;
        if (i2 == 1) {
            this.access000 = (i * GF2Field.MASK) + 1;
        } else {
            this.access000 = (long) (((long) ((r11 * (1.0d - Math.pow(r0, r2))) / (1 - i2))) + Math.pow(i2, i));
        }
        this.writeTypedObject = onNavigationEvent();
        this.access100 = IAuthTabCallback();
        long[] jArr = new long[i];
        this.extraCallback = jArr;
        Arrays.setAll(jArr, new IntToLongFunction() { // from class: org.apache.commons.compress.harmony.pack200.BHSDCodec$$ExternalSyntheticLambda0
            @Override // java.util.function.IntToLongFunction
            public final long applyAsLong(int i5) {
                return onAdDismissed.IAuthTabCallback(i2, i5);
            }
        });
    }

    public static /* synthetic */ long IAuthTabCallback(int i, int i2) {
        return (long) Math.pow(i, i2);
    }

    private long IAuthTabCallback() {
        long jOnExtraCallback;
        if (this.IAuthTabCallback_Parcel == 1) {
            return new onAdDismissed(this.asInterface, this.IAuthTabCallbackStubProxy).onExtraCallbackWithResult();
        }
        int i = this.extraCallbackWithResult;
        if (i == 0) {
            jOnExtraCallback = onExtraCallback();
        } else if (i == 1) {
            jOnExtraCallback = onExtraCallback() / 2;
        } else if (i == 2) {
            jOnExtraCallback = (onExtraCallback() * 3) / 4;
        } else {
            throw new Error("Unknown s value");
        }
        return Math.min((this.extraCallbackWithResult == 0 ? 4294967294L : 2147483647L) - 1, jOnExtraCallback - 1);
    }

    private long onNavigationEvent() {
        if (this.IAuthTabCallback_Parcel == 1 || !onWarmupCompleted()) {
            return this.access000 >= 4294967296L ? -2147483648L : 0L;
        }
        return Math.max(-2147483648L, (-onExtraCallback()) / (1 << this.extraCallbackWithResult));
    }

    public long onExtraCallback() {
        return this.access000;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof onAdDismissed)) {
            return false;
        }
        onAdDismissed onaddismissed = (onAdDismissed) obj;
        return onaddismissed.asInterface == this.asInterface && onaddismissed.IAuthTabCallbackStubProxy == this.IAuthTabCallbackStubProxy && onaddismissed.extraCallbackWithResult == this.extraCallbackWithResult && onaddismissed.IAuthTabCallback_Parcel == this.IAuthTabCallback_Parcel;
    }

    public int hashCode() {
        return (((((this.asInterface * 37) + this.IAuthTabCallbackStubProxy) * 37) + this.extraCallbackWithResult) * 37) + this.IAuthTabCallback_Parcel;
    }

    public boolean onWarmupCompleted() {
        return this.extraCallbackWithResult != 0;
    }

    public long onExtraCallbackWithResult() {
        return this.access100;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(11);
        sb.append('(');
        sb.append(this.asInterface);
        sb.append(',');
        sb.append(this.IAuthTabCallbackStubProxy);
        if (this.extraCallbackWithResult != 0 || this.IAuthTabCallback_Parcel != 0) {
            sb.append(',');
            sb.append(this.extraCallbackWithResult);
        }
        if (this.IAuthTabCallback_Parcel != 0) {
            sb.append(',');
            sb.append(this.IAuthTabCallback_Parcel);
        }
        sb.append(')');
        return sb.toString();
    }
}
