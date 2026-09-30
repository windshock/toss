package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ImeEditCommand_androidKtExternalSyntheticLambda0 {
    private int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private short[] IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int access000;
    private int access100;
    private int asBinder;
    private final int asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private int onActivityLayout;
    private final float onActivityResized;
    private double onExtraCallback;
    private short[] onExtraCallbackWithResult;
    private final short[] onNavigationEvent;
    private final float onPostMessage;
    private int onTransact;
    private final int onWarmupCompleted;
    private final float readTypedObject;
    private short[] writeTypedObject;

    public ImeEditCommand_androidKtExternalSyntheticLambda0(int i2, int i3, float f, float f2, int i4) {
        this.IAuthTabCallbackStub = i2;
        this.onWarmupCompleted = i3;
        this.onActivityResized = f;
        this.readTypedObject = f2;
        this.onPostMessage = i2 / i4;
        this.IAuthTabCallbackStubProxy = i2 / 400;
        int i5 = i2 / 65;
        this.IAuthTabCallbackDefault = i5;
        int i6 = i5 << 1;
        this.asInterface = i6;
        this.onNavigationEvent = new short[i6];
        int i7 = i6 * i3;
        this.onExtraCallbackWithResult = new short[i7];
        this.IAuthTabCallback_Parcel = new short[i7];
        this.writeTypedObject = new short[i7];
    }

    public int IAuthTabCallback() {
        return (this.IAuthTabCallback * this.onWarmupCompleted) << 1;
    }

    public void onExtraCallback(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.onWarmupCompleted;
        int i3 = iRemaining / i2;
        short[] sArrOnExtraCallback = onExtraCallback(this.onExtraCallbackWithResult, this.IAuthTabCallback, i3);
        this.onExtraCallbackWithResult = sArrOnExtraCallback;
        shortBuffer.get(sArrOnExtraCallback, this.IAuthTabCallback * this.onWarmupCompleted, ((i2 * i3) << 1) / 2);
        this.IAuthTabCallback += i3;
        onExtraCallback();
    }

    public void onNavigationEvent(ShortBuffer shortBuffer) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.onWarmupCompleted, this.getInterfaceDescriptor);
        shortBuffer.put(this.IAuthTabCallback_Parcel, 0, this.onWarmupCompleted * iMin);
        int i2 = this.getInterfaceDescriptor - iMin;
        this.getInterfaceDescriptor = i2;
        short[] sArr = this.IAuthTabCallback_Parcel;
        int i3 = this.onWarmupCompleted;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public void onNavigationEvent() {
        int i2;
        int i3 = this.IAuthTabCallback;
        float f = this.onActivityResized;
        float f2 = this.readTypedObject;
        double d = f / f2;
        int i4 = this.getInterfaceDescriptor + ((int) (((((((i3 - r5) / d) + this.onActivityLayout) + this.onExtraCallback) + this.extraCallback) / (this.onPostMessage * f2)) + 0.5d));
        this.onExtraCallback = 0.0d;
        this.onExtraCallbackWithResult = onExtraCallback(this.onExtraCallbackWithResult, i3, (this.asInterface << 1) + i3);
        int i5 = 0;
        while (true) {
            int i6 = this.asInterface;
            int i7 = this.onWarmupCompleted;
            i2 = i6 << 1;
            if (i5 >= i2 * i7) {
                break;
            }
            this.onExtraCallbackWithResult[(i7 * i3) + i5] = 0;
            i5++;
        }
        this.IAuthTabCallback += i2;
        onExtraCallback();
        if (this.getInterfaceDescriptor > i4) {
            this.getInterfaceDescriptor = Math.max(i4, 0);
        }
        this.IAuthTabCallback = 0;
        this.onActivityLayout = 0;
        this.extraCallback = 0;
    }

    public void onWarmupCompleted() {
        this.IAuthTabCallback = 0;
        this.getInterfaceDescriptor = 0;
        this.extraCallback = 0;
        this.access000 = 0;
        this.access100 = 0;
        this.onActivityLayout = 0;
        this.extraCallbackWithResult = 0;
        this.ICustomTabsCallback = 0;
        this.asBinder = 0;
        this.onTransact = 0;
        this.onExtraCallback = 0.0d;
    }

    public int onExtraCallbackWithResult() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.getInterfaceDescriptor >= 0);
        return (this.getInterfaceDescriptor * this.onWarmupCompleted) << 1;
    }

    private short[] onExtraCallback(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.onWarmupCompleted;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    private void IAuthTabCallback(int i2) {
        int i3 = this.IAuthTabCallback - i2;
        short[] sArr = this.onExtraCallbackWithResult;
        int i4 = this.onWarmupCompleted;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.IAuthTabCallback = i3;
    }

    private void IAuthTabCallback(short[] sArr, int i2, int i3) {
        short[] sArrOnExtraCallback = onExtraCallback(this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, i3);
        this.IAuthTabCallback_Parcel = sArrOnExtraCallback;
        int i4 = this.onWarmupCompleted;
        System.arraycopy(sArr, i2 * i4, sArrOnExtraCallback, this.getInterfaceDescriptor * i4, i4 * i3);
        this.getInterfaceDescriptor += i3;
    }

    private int onWarmupCompleted(int i2) {
        int iMin = Math.min(this.asInterface, this.onActivityLayout);
        IAuthTabCallback(this.onExtraCallbackWithResult, i2, iMin);
        this.onActivityLayout -= iMin;
        return iMin;
    }

    private void onExtraCallbackWithResult(short[] sArr, int i2, int i3) {
        int i4 = this.asInterface / i3;
        int i5 = this.onWarmupCompleted;
        int i6 = i3 * i5;
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                i8 += sArr[(i7 * i6) + (i2 * i5) + i9];
            }
            this.onNavigationEvent[i7] = (short) (i8 / i6);
        }
    }

    private int onExtraCallbackWithResult(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.onWarmupCompleted;
        int i6 = OggPageHeader.MAX_SEGMENT_COUNT;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i7 * i3) {
                i8 = i3;
                i7 = iAbs;
            }
            if (iAbs * i6 > i9 * i3) {
                i6 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.asBinder = i7 / i8;
        this.onTransact = i9 / i6;
        return i8;
    }

    private boolean IAuthTabCallback(int i2, int i3) {
        return i2 != 0 && this.extraCallbackWithResult != 0 && i3 <= i2 * 3 && (i2 << 1) > this.ICustomTabsCallback * 3;
    }

    private int onWarmupCompleted(short[] sArr, int i2) {
        int iOnExtraCallbackWithResult;
        int i3 = this.IAuthTabCallbackStub;
        int i4 = i3 > 4000 ? i3 / WearableStatusCodes.TARGET_NODE_NOT_CONNECTED : 1;
        if (this.onWarmupCompleted == 1 && i4 == 1) {
            iOnExtraCallbackWithResult = onExtraCallbackWithResult(sArr, i2, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault);
        } else {
            onExtraCallbackWithResult(sArr, i2, i4);
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(this.onNavigationEvent, 0, this.IAuthTabCallbackStubProxy / i4, this.IAuthTabCallbackDefault / i4);
            if (i4 != 1) {
                int i5 = iOnExtraCallbackWithResult2 * i4;
                int i6 = i4 << 2;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.IAuthTabCallbackStubProxy;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.IAuthTabCallbackDefault;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.onWarmupCompleted == 1) {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(sArr, i2, i7, i8);
                } else {
                    onExtraCallbackWithResult(sArr, i2, 1);
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onNavigationEvent, 0, i7, i8);
                }
            } else {
                iOnExtraCallbackWithResult = iOnExtraCallbackWithResult2;
            }
        }
        int i11 = IAuthTabCallback(this.asBinder, this.onTransact) ? this.extraCallbackWithResult : iOnExtraCallbackWithResult;
        this.ICustomTabsCallback = this.asBinder;
        this.extraCallbackWithResult = iOnExtraCallbackWithResult;
        return i11;
    }

    private void onNavigationEvent(int i2) {
        int i3 = this.getInterfaceDescriptor - i2;
        short[] sArrOnExtraCallback = onExtraCallback(this.writeTypedObject, this.extraCallback, i3);
        this.writeTypedObject = sArrOnExtraCallback;
        short[] sArr = this.IAuthTabCallback_Parcel;
        int i4 = this.onWarmupCompleted;
        System.arraycopy(sArr, i2 * i4, sArrOnExtraCallback, this.extraCallback * i4, i4 * i3);
        this.getInterfaceDescriptor = i2;
        this.extraCallback += i3;
    }

    private void onExtraCallback(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.writeTypedObject;
        int i3 = this.onWarmupCompleted;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.extraCallback - i2) * i3);
        this.extraCallback -= i2;
    }

    private short onWarmupCompleted(short[] sArr, int i2, long j, long j2) {
        short s = sArr[i2];
        short s2 = sArr[i2 + this.onWarmupCompleted];
        long j3 = this.access100;
        long j4 = this.access000;
        long j5 = (r9 + 1) * j2;
        long j6 = j5 - (j3 * j);
        long j7 = j5 - (j4 * j2);
        return (short) (((s * j6) + ((j7 - j6) * s2)) / j7);
    }

    private void onExtraCallbackWithResult(float f, int i2) {
        int i3;
        long j;
        int i4;
        long j2;
        if (this.getInterfaceDescriptor == i2) {
            return;
        }
        int i5 = this.IAuthTabCallbackStub;
        long j3 = (long) (i5 / f);
        long j4 = i5;
        while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
            j3 /= 2;
            j4 /= 2;
        }
        onNavigationEvent(i2);
        int i6 = 0;
        while (true) {
            int i7 = this.extraCallback - 1;
            if (i6 < i7) {
                while (true) {
                    i3 = this.access000 + 1;
                    j = i3;
                    long j5 = j * j3;
                    i4 = i6;
                    j2 = this.access100;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.IAuthTabCallback_Parcel = onExtraCallback(this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, 1);
                    int i8 = 0;
                    while (true) {
                        int i9 = this.onWarmupCompleted;
                        if (i8 < i9) {
                            this.IAuthTabCallback_Parcel[(this.getInterfaceDescriptor * i9) + i8] = onWarmupCompleted(this.writeTypedObject, (i9 * i4) + i8, j4, j3);
                            i8++;
                        }
                    }
                    this.access100++;
                    this.getInterfaceDescriptor++;
                    i6 = i4;
                }
                this.access000 = i3;
                if (j == j4) {
                    this.access000 = 0;
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(j2 == j3);
                    this.access100 = 0;
                }
                i6 = i4 + 1;
            } else {
                onExtraCallback(i7);
                return;
            }
        }
    }

    private int onNavigationEvent(short[] sArr, int i2, double d, int i3) {
        int iRound;
        if (d >= 2.0d) {
            double d2 = (i3 / (d - 1.0d)) + this.onExtraCallback;
            iRound = (int) Math.round(d2);
            this.onExtraCallback = d2 - iRound;
        } else {
            double d3 = ((i3 * (2.0d - d)) / (d - 1.0d)) + this.onExtraCallback;
            int iRound2 = (int) Math.round(d3);
            this.onActivityLayout = iRound2;
            this.onExtraCallback = d3 - iRound2;
            iRound = i3;
        }
        short[] sArrOnExtraCallback = onExtraCallback(this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, iRound);
        this.IAuthTabCallback_Parcel = sArrOnExtraCallback;
        onExtraCallback(iRound, this.onWarmupCompleted, sArrOnExtraCallback, this.getInterfaceDescriptor, sArr, i2, sArr, i2 + i3);
        this.getInterfaceDescriptor += iRound;
        return iRound;
    }

    private int onExtraCallbackWithResult(short[] sArr, int i2, double d, int i3) {
        int i4;
        if (d < 0.5d) {
            double d2 = ((i3 * d) / (1.0d - d)) + this.onExtraCallback;
            int iRound = (int) Math.round(d2);
            this.onExtraCallback = d2 - iRound;
            i4 = iRound;
        } else {
            double d3 = ((i3 * ((2.0d * d) - 1.0d)) / (1.0d - d)) + this.onExtraCallback;
            int iRound2 = (int) Math.round(d3);
            this.onActivityLayout = iRound2;
            this.onExtraCallback = d3 - iRound2;
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] sArrOnExtraCallback = onExtraCallback(this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor, i5);
        this.IAuthTabCallback_Parcel = sArrOnExtraCallback;
        int i6 = this.onWarmupCompleted;
        System.arraycopy(sArr, i2 * i6, sArrOnExtraCallback, this.getInterfaceDescriptor * i6, i6 * i3);
        onExtraCallback(i4, this.onWarmupCompleted, this.IAuthTabCallback_Parcel, this.getInterfaceDescriptor + i3, sArr, i2 + i3, sArr, i2);
        this.getInterfaceDescriptor += i5;
        return i4;
    }

    private void IAuthTabCallback(double d) {
        int iOnExtraCallbackWithResult;
        int i2 = this.IAuthTabCallback;
        if (i2 < this.asInterface) {
            return;
        }
        int iOnNavigationEvent = 0;
        do {
            if (this.onActivityLayout > 0) {
                iOnExtraCallbackWithResult = onWarmupCompleted(iOnNavigationEvent);
            } else {
                int iOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult, iOnNavigationEvent);
                if (d > 1.0d) {
                    iOnNavigationEvent += iOnWarmupCompleted + onNavigationEvent(this.onExtraCallbackWithResult, iOnNavigationEvent, d, iOnWarmupCompleted);
                } else {
                    iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onExtraCallbackWithResult, iOnNavigationEvent, d, iOnWarmupCompleted);
                }
            }
            iOnNavigationEvent += iOnExtraCallbackWithResult;
        } while (this.asInterface + iOnNavigationEvent <= i2);
        IAuthTabCallback(iOnNavigationEvent);
    }

    private void onExtraCallback() {
        int i2 = this.getInterfaceDescriptor;
        float f = this.onActivityResized;
        float f2 = this.readTypedObject;
        double d = f / f2;
        float f3 = this.onPostMessage * f2;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            IAuthTabCallback(d);
        } else {
            IAuthTabCallback(this.onExtraCallbackWithResult, 0, this.IAuthTabCallback);
            this.IAuthTabCallback = 0;
        }
        if (f3 != 1.0f) {
            onExtraCallbackWithResult(f3, i2);
        }
    }

    private static void onExtraCallback(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }
}
