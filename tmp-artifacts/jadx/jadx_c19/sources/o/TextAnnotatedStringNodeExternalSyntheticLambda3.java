package o;

import android.os.SystemClock;
import com.google.common.primitives.Longs;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextAnnotatedStringNodeExternalSyntheticLambda3 implements SelectionAdjustmentCompanionExternalSyntheticLambda0 {
    private float IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private final float access000;
    private long access100;
    private long asBinder;
    private final long asInterface;
    private final long extraCallbackWithResult;
    private final float getInterfaceDescriptor;
    private final float onExtraCallback;
    private long onExtraCallbackWithResult;
    private long onNavigationEvent;
    private long onTransact;
    private final float onWarmupCompleted;
    private long readTypedObject;
    private long writeTypedObject;

    private static long onExtraCallback(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    public static final class onExtraCallbackWithResult {
        private float onExtraCallback = 0.97f;
        private float onNavigationEvent = 1.03f;
        private long IAuthTabCallback = 1000;
        private float asInterface = 1.0E-7f;
        private long onExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(20);
        private long asBinder = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(500);
        private float onWarmupCompleted = 0.999f;

        public TextAnnotatedStringNodeExternalSyntheticLambda3 onWarmupCompleted() {
            return new TextAnnotatedStringNodeExternalSyntheticLambda3(this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback, this.asInterface, this.onExtraCallbackWithResult, this.asBinder, this.onWarmupCompleted);
        }
    }

    private TextAnnotatedStringNodeExternalSyntheticLambda3(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.onExtraCallback = f;
        this.onWarmupCompleted = f2;
        this.IAuthTabCallbackStubProxy = j;
        this.getInterfaceDescriptor = f3;
        this.asInterface = j2;
        this.extraCallbackWithResult = j3;
        this.access000 = f4;
        this.IAuthTabCallbackDefault = -9223372036854775807L;
        this.readTypedObject = -9223372036854775807L;
        this.access100 = -9223372036854775807L;
        this.onTransact = -9223372036854775807L;
        this.IAuthTabCallback_Parcel = f;
        this.IAuthTabCallbackStub = f2;
        this.IAuthTabCallback = 1.0f;
        this.asBinder = -9223372036854775807L;
        this.onExtraCallbackWithResult = -9223372036854775807L;
        this.onNavigationEvent = -9223372036854775807L;
        this.ICustomTabsCallback = -9223372036854775807L;
        this.writeTypedObject = -9223372036854775807L;
    }

    @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda0
    public void onWarmupCompleted(TextFieldStateKtExternalSyntheticLambda0.onTransact ontransact) {
        this.IAuthTabCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(ontransact.IAuthTabCallbackStub);
        this.access100 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(ontransact.onNavigationEvent);
        this.onTransact = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(ontransact.onExtraCallback);
        float f = ontransact.IAuthTabCallback;
        if (f == -3.4028235E38f) {
            f = this.onExtraCallback;
        }
        this.IAuthTabCallback_Parcel = f;
        float f2 = ontransact.onWarmupCompleted;
        if (f2 == -3.4028235E38f) {
            f2 = this.onWarmupCompleted;
        }
        this.IAuthTabCallbackStub = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.IAuthTabCallbackDefault = -9223372036854775807L;
        }
        onWarmupCompleted();
    }

    @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda0
    public void onWarmupCompleted(long j) {
        this.readTypedObject = j;
        onWarmupCompleted();
    }

    @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda0
    public void onNavigationEvent() {
        long j = this.onNavigationEvent;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.extraCallbackWithResult;
        this.onNavigationEvent = j2;
        long j3 = this.onTransact;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.onNavigationEvent = j3;
        }
        this.asBinder = -9223372036854775807L;
    }

    @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda0
    public float onExtraCallback(long j, long j2) {
        if (this.IAuthTabCallbackDefault == -9223372036854775807L) {
            return 1.0f;
        }
        onNavigationEvent(j, j2);
        if (this.asBinder != -9223372036854775807L && SystemClock.elapsedRealtime() - this.asBinder < this.IAuthTabCallbackStubProxy) {
            return this.IAuthTabCallback;
        }
        this.asBinder = SystemClock.elapsedRealtime();
        onNavigationEvent(j);
        long j3 = j - this.onNavigationEvent;
        if (Math.abs(j3) < this.asInterface) {
            this.IAuthTabCallback = 1.0f;
        } else {
            this.IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((this.getInterfaceDescriptor * j3) + 1.0f, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackStub);
        }
        return this.IAuthTabCallback;
    }

    @Override // o.SelectionAdjustmentCompanionExternalSyntheticLambda0
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    private void onWarmupCompleted() {
        long j;
        long j2 = this.IAuthTabCallbackDefault;
        if (j2 != -9223372036854775807L) {
            j = this.readTypedObject;
            if (j == -9223372036854775807L) {
                long j3 = this.access100;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.onTransact;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.onExtraCallbackWithResult == j) {
            return;
        }
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = j;
        this.ICustomTabsCallback = -9223372036854775807L;
        this.writeTypedObject = -9223372036854775807L;
        this.asBinder = -9223372036854775807L;
    }

    private void onNavigationEvent(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.ICustomTabsCallback;
        if (j4 == -9223372036854775807L) {
            this.ICustomTabsCallback = j3;
            this.writeTypedObject = 0L;
        } else {
            long jMax = Math.max(j3, onExtraCallback(j4, j3, this.access000));
            this.ICustomTabsCallback = jMax;
            this.writeTypedObject = onExtraCallback(this.writeTypedObject, Math.abs(j3 - jMax), this.access000);
        }
    }

    private void onNavigationEvent(long j) {
        long j2 = this.ICustomTabsCallback + (this.writeTypedObject * 3);
        if (this.onNavigationEvent > j2) {
            float fOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallbackStubProxy);
            this.onNavigationEvent = Longs.max(new long[]{j2, this.onExtraCallbackWithResult, this.onNavigationEvent - (((long) ((this.IAuthTabCallback - 1.0f) * fOnNavigationEvent)) + ((long) ((this.IAuthTabCallbackStub - 1.0f) * fOnNavigationEvent)))});
            return;
        }
        long jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j - ((long) (Math.max(0.0f, this.IAuthTabCallback - 1.0f) / this.getInterfaceDescriptor)), this.onNavigationEvent, j2);
        this.onNavigationEvent = jOnWarmupCompleted;
        long j3 = this.onTransact;
        if (j3 == -9223372036854775807L || jOnWarmupCompleted <= j3) {
            return;
        }
        this.onNavigationEvent = j3;
    }
}
