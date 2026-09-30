package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda2 {
    public final int IAuthTabCallback;
    public final onExtraCallback onExtraCallbackWithResult;
    public final boolean onNavigationEvent;
    public final onExtraCallback onWarmupCompleted;

    public static DrawerKtExternalSyntheticLambda2 IAuthTabCallback(int i2) {
        return onWarmupCompleted(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }

    public static DrawerKtExternalSyntheticLambda2 onWarmupCompleted(float f, int i2, int i3, float f2, float f3, int i4) {
        int i5;
        int i6;
        float[] fArr;
        int i7;
        float f4 = f;
        int i8 = i2;
        int i9 = i3;
        RecordingInputConnection_androidKt.onNavigationEvent(f4 > 0.0f);
        RecordingInputConnection_androidKt.onNavigationEvent(i8 > 0);
        RecordingInputConnection_androidKt.onNavigationEvent(i9 > 0);
        RecordingInputConnection_androidKt.onNavigationEvent(f2 > 0.0f && f2 <= 180.0f);
        RecordingInputConnection_androidKt.onNavigationEvent(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f5 = radians / i8;
        float f6 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 << 1) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 << 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f7 = radians / 2.0f;
            float f8 = (i12 * f5) - f7;
            int i15 = i12 + 1;
            float f9 = i15;
            int i16 = 0;
            while (i16 < i10) {
                float f10 = f8;
                int i17 = i15;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    float f11 = i18 == 0 ? f10 : (f9 * f5) - f7;
                    int i20 = i10;
                    float f12 = i16 * f6;
                    int i21 = i16;
                    double d = f4;
                    float f13 = f5;
                    float f14 = f6;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i22 = i18;
                    double d3 = f11;
                    float[] fArr4 = fArr3;
                    float f15 = f9;
                    fArr2[i14] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                    int i23 = i12;
                    int i24 = i13;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i25 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i24] = f12 / radians2;
                    i13 = i24 + 2;
                    fArr4[i24 + 1] = ((i23 + i22) * f13) / radians;
                    if (i21 == 0 && i22 == 0) {
                        i5 = i3;
                        i6 = i21;
                    } else {
                        i5 = i3;
                        i6 = i21;
                        if (i6 != i5 || i22 != 1) {
                            fArr = fArr4;
                            i7 = 2;
                            i14 = i25;
                        }
                        fArr3 = fArr;
                        i19 = i7;
                        i12 = i23;
                        i10 = i20;
                        f5 = f13;
                        f6 = f14;
                        f9 = f15;
                        i18 = i22 + 1;
                        f4 = f;
                        int i26 = i6;
                        i9 = i5;
                        i16 = i26;
                    }
                    System.arraycopy(fArr2, i14, fArr2, i25, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i7 = 2;
                    System.arraycopy(fArr, i24, fArr, i13, 2);
                    i13 = i24 + 4;
                    fArr3 = fArr;
                    i19 = i7;
                    i12 = i23;
                    i10 = i20;
                    f5 = f13;
                    f6 = f14;
                    f9 = f15;
                    i18 = i22 + 1;
                    f4 = f;
                    int i262 = i6;
                    i9 = i5;
                    i16 = i262;
                }
                f8 = f10;
                i9 = i9;
                i15 = i17;
                f5 = f5;
                f6 = f6;
                f9 = f9;
                i16++;
                f4 = f;
            }
            f4 = f;
            i8 = i2;
            i12 = i15;
        }
        return new DrawerKtExternalSyntheticLambda2(new onExtraCallback(new IAuthTabCallback(0, fArr2, fArr3, 1)), i4);
    }

    public DrawerKtExternalSyntheticLambda2(onExtraCallback onextracallback, int i2) {
        this(onextracallback, onextracallback, i2);
    }

    public DrawerKtExternalSyntheticLambda2(onExtraCallback onextracallback, onExtraCallback onextracallback2, int i2) {
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallbackWithResult = onextracallback2;
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = onextracallback == onextracallback2;
    }

    public static final class IAuthTabCallback {
        public final float[] IAuthTabCallback;
        public final int onExtraCallback;
        public final float[] onNavigationEvent;
        public final int onWarmupCompleted;

        public IAuthTabCallback(int i2, float[] fArr, float[] fArr2, int i3) {
            this.onExtraCallback = i2;
            RecordingInputConnection_androidKt.onNavigationEvent((((long) fArr.length) << 1) == ((long) fArr2.length) * 3);
            this.IAuthTabCallback = fArr;
            this.onNavigationEvent = fArr2;
            this.onWarmupCompleted = i3;
        }

        public int onNavigationEvent() {
            return this.IAuthTabCallback.length / 3;
        }
    }

    public static final class onExtraCallback {
        private final IAuthTabCallback[] IAuthTabCallback;

        public onExtraCallback(IAuthTabCallback... iAuthTabCallbackArr) {
            this.IAuthTabCallback = iAuthTabCallbackArr;
        }

        public int onExtraCallbackWithResult() {
            return this.IAuthTabCallback.length;
        }

        public IAuthTabCallback IAuthTabCallback(int i2) {
            return this.IAuthTabCallback[i2];
        }
    }
}
