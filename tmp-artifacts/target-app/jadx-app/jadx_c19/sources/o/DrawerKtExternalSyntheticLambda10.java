package o;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda10 {
    private final IAuthTabCallback IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private boolean access000;
    private final DrawerKtExternalSyntheticLambda16 asBinder;
    private boolean asInterface;
    private boolean onExtraCallback;
    private boolean onNavigationEvent;
    private final long onWarmupCompleted;
    private int onExtraCallbackWithResult = 0;
    private long onTransact = -9223372036854775807L;
    private long access100 = -9223372036854775807L;
    private long IAuthTabCallbackStub = -9223372036854775807L;
    private float getInterfaceDescriptor = 1.0f;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda0 IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda0.onNavigationEvent;

    public interface IAuthTabCallback {
        boolean IAuthTabCallback(long j, long j2, boolean z);

        boolean onNavigationEvent(long j, long j2);

        boolean onWarmupCompleted(long j, long j2, long j3, boolean z, boolean z2) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;
    }

    public static class onNavigationEvent {
        private long onNavigationEvent = -9223372036854775807L;
        private long onExtraCallback = -9223372036854775807L;

        public long onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }

        public long onNavigationEvent() {
            return this.onExtraCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallback() {
            this.onNavigationEvent = -9223372036854775807L;
            this.onExtraCallback = -9223372036854775807L;
        }
    }

    public DrawerKtExternalSyntheticLambda10(Context context, IAuthTabCallback iAuthTabCallback, long j) {
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        this.onWarmupCompleted = j;
        this.asBinder = new DrawerKtExternalSyntheticLambda16(context);
    }

    public void IAuthTabCallback(int i2) {
        if (i2 == 0) {
            this.onExtraCallbackWithResult = 1;
        } else if (i2 == 1) {
            this.onExtraCallbackWithResult = 0;
        } else {
            if (i2 == 2) {
                onNavigationEvent(2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void onExtraCallbackWithResult() {
        this.access000 = true;
        this.IAuthTabCallback_Parcel = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallback.IAuthTabCallback());
        this.asBinder.onNavigationEvent();
    }

    public void onExtraCallback() {
        this.access000 = false;
        this.IAuthTabCallbackStub = -9223372036854775807L;
        this.asBinder.onExtraCallbackWithResult();
    }

    public void onExtraCallbackWithResult(@Nullable Surface surface) {
        this.asInterface = surface != null;
        this.onNavigationEvent = false;
        this.asBinder.onNavigationEvent(surface);
        onNavigationEvent(1);
    }

    public void onExtraCallback(float f) {
        this.asBinder.onNavigationEvent(f);
    }

    public boolean onNavigationEvent() {
        boolean z = this.onExtraCallbackWithResult != 3;
        this.onExtraCallbackWithResult = 3;
        this.IAuthTabCallback_Parcel = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallback.IAuthTabCallback());
        return z;
    }

    public void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
    }

    public void onWarmupCompleted() {
        if (this.onExtraCallbackWithResult == 0) {
            this.onExtraCallbackWithResult = 1;
        }
    }

    public boolean onWarmupCompleted(boolean z) {
        if (z && (this.onExtraCallbackWithResult == 3 || (!this.asInterface && this.onNavigationEvent))) {
            this.IAuthTabCallbackStub = -9223372036854775807L;
            return true;
        }
        if (this.IAuthTabCallbackStub == -9223372036854775807L) {
            return false;
        }
        if (this.IAuthTabCallback.IAuthTabCallback() < this.IAuthTabCallbackStub) {
            return true;
        }
        this.IAuthTabCallbackStub = -9223372036854775807L;
        return false;
    }

    public void onExtraCallback(boolean z) {
        this.IAuthTabCallbackStubProxy = z;
        this.IAuthTabCallbackStub = this.onWarmupCompleted > 0 ? this.IAuthTabCallback.IAuthTabCallback() + this.onWarmupCompleted : -9223372036854775807L;
    }

    public int IAuthTabCallback(long j, long j2, long j3, long j4, boolean z, boolean z2, onNavigationEvent onnavigationevent) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        onnavigationevent.onExtraCallback();
        if (this.access000 && this.onTransact == -9223372036854775807L) {
            this.onTransact = j2;
        }
        if (this.access100 != j) {
            this.asBinder.IAuthTabCallback(j);
            this.access100 = j;
        }
        onnavigationevent.onNavigationEvent = onExtraCallback(j2, j3, j);
        if (z && !z2) {
            return 3;
        }
        if (this.asInterface) {
            if (onWarmupCompleted(j2, onnavigationevent.onNavigationEvent, j4)) {
                return 0;
            }
            if (!this.access000 || j2 == this.onTransact) {
                return 5;
            }
            long jOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent();
            onnavigationevent.onExtraCallback = this.asBinder.onNavigationEvent((onnavigationevent.onNavigationEvent * 1000) + jOnNavigationEvent);
            onnavigationevent.onNavigationEvent = (onnavigationevent.onExtraCallback - jOnNavigationEvent) / 1000;
            boolean z3 = (this.IAuthTabCallbackStub == -9223372036854775807L || this.IAuthTabCallbackStubProxy) ? false : true;
            if (this.IAuthTabCallbackDefault.onWarmupCompleted(onnavigationevent.onNavigationEvent, j2, j3, z2, z3)) {
                return 4;
            }
            return this.IAuthTabCallbackDefault.IAuthTabCallback(onnavigationevent.onNavigationEvent, j3, z2) ? z3 ? 3 : 2 : onnavigationevent.onNavigationEvent > 50000 ? 5 : 1;
        }
        this.onNavigationEvent = true;
        if (this.IAuthTabCallbackDefault.onWarmupCompleted(onnavigationevent.onNavigationEvent, j2, j3, z2, true)) {
            return 4;
        }
        return (!this.access000 || onnavigationevent.onNavigationEvent >= 30000) ? 5 : 3;
    }

    public void IAuthTabCallback() {
        this.asBinder.onExtraCallback();
        this.access100 = -9223372036854775807L;
        this.onTransact = -9223372036854775807L;
        onNavigationEvent(1);
        this.IAuthTabCallbackStub = -9223372036854775807L;
    }

    public void onExtraCallback(int i2) {
        this.asBinder.IAuthTabCallback(i2);
    }

    public void onExtraCallbackWithResult(float f) {
        RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f);
        if (f == this.getInterfaceDescriptor) {
            return;
        }
        this.getInterfaceDescriptor = f;
        this.asBinder.onExtraCallback(f);
    }

    private void onNavigationEvent(int i2) {
        this.onExtraCallbackWithResult = Math.min(this.onExtraCallbackWithResult, i2);
    }

    private long onExtraCallback(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.getInterfaceDescriptor);
        return this.access000 ? j4 - (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallback.IAuthTabCallback()) - j2) : j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onWarmupCompleted(long j, long j2, long j3) {
        if (this.IAuthTabCallbackStub != -9223372036854775807L && !this.IAuthTabCallbackStubProxy) {
            return false;
        }
        int i2 = this.onExtraCallbackWithResult;
        if (i2 == 0) {
            return this.access000;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return j >= j3;
        }
        if (i2 == 3) {
            long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.IAuthTabCallback.IAuthTabCallback());
            long j4 = this.IAuthTabCallback_Parcel;
            if (this.access000) {
                if (!this.onExtraCallback) {
                    long j5 = this.onTransact;
                    if (j5 != -9223372036854775807L && j5 != j) {
                        if (this.IAuthTabCallbackDefault.onNavigationEvent(j2, jOnNavigationEvent - j4)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }
}
