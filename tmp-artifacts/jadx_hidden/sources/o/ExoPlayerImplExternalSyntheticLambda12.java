package o;

/* loaded from: classes.dex */
public abstract class ExoPlayerImplExternalSyntheticLambda12<T> {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public ExoPlayerImplExternalSyntheticLambda14 onWarmupCompleted;

    public abstract T onExtraCallback();

    protected ExoPlayerImplExternalSyntheticLambda12(ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14) {
        this.onWarmupCompleted = exoPlayerImplExternalSyntheticLambda14;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw new NullPointerException();
        }
        if (this == obj) {
            int i4 = ((i2 | 7) << 1) - (i2 ^ 7);
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj != null) {
            int i6 = ((i2 | 31) << 1) - (i2 ^ 31);
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (getClass() == obj.getClass()) {
                ExoPlayerImplExternalSyntheticLambda12 exoPlayerImplExternalSyntheticLambda12 = (ExoPlayerImplExternalSyntheticLambda12) obj;
                if (this.onWarmupCompleted != exoPlayerImplExternalSyntheticLambda12.onWarmupCompleted) {
                    int i8 = onExtraCallback;
                    int i9 = (i8 & 49) + (i8 | 49);
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (onExtraCallback() != null) {
                    int i11 = onNavigationEvent;
                    int i12 = (i11 ^ 105) + ((i11 & 105) << 1);
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return onExtraCallback().equals(exoPlayerImplExternalSyntheticLambda12.onExtraCallback());
                }
                if (exoPlayerImplExternalSyntheticLambda12.onExtraCallback() == null) {
                    int i14 = onNavigationEvent + 85;
                    onExtraCallback = i14 % 128;
                    return i14 % 2 != 0;
                }
                int i15 = onExtraCallback;
                int i16 = ((i15 | 87) << 1) - (i15 ^ 87);
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.onWarmupCompleted.onNavigationEvent();
        }
        this.onWarmupCompleted.onNavigationEvent();
        throw new NullPointerException();
    }

    public final ExoPlayerImplExternalSyntheticLambda14 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14 = this.onWarmupCompleted;
        int i6 = i4 + 41;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return exoPlayerImplExternalSyntheticLambda14;
    }
}
