package o;

import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class DrawerKtExternalSyntheticLambda28 {
    protected final onTransact IAuthTabCallback;
    private final int onExtraCallback;
    protected IAuthTabCallback onExtraCallbackWithResult;
    protected final onWarmupCompleted onNavigationEvent;

    public interface onExtraCallback {
        long timeUsToTargetTime(long j);
    }

    public static final class onNavigationEvent implements onExtraCallback {
        @Override // o.DrawerKtExternalSyntheticLambda28.onExtraCallback
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    public interface onTransact {
        default void onExtraCallbackWithResult() {
        }

        onExtraCallbackWithResult onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException;
    }

    public DrawerKtExternalSyntheticLambda28(onExtraCallback onextracallback, onTransact ontransact, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        this.IAuthTabCallback = ontransact;
        this.onExtraCallback = i2;
        this.onNavigationEvent = new onWarmupCompleted(onextracallback, j, j2, j3, j4, j5, j6);
    }

    public final ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final void onWarmupCompleted(long j) {
        IAuthTabCallback iAuthTabCallback = this.onExtraCallbackWithResult;
        if (iAuthTabCallback == null || iAuthTabCallback.IAuthTabCallback() != j) {
            this.onExtraCallbackWithResult = onExtraCallback(j);
        }
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult != null;
    }

    public int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        while (true) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult);
            long jOnExtraCallback = iAuthTabCallback.onExtraCallback();
            long jOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            long jOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            if (jOnNavigationEvent - jOnExtraCallback <= this.onExtraCallback) {
                onExtraCallback(false, jOnExtraCallback);
                return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, jOnExtraCallback, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
            }
            if (!onNavigationEvent(drawerKtExternalSyntheticLambda9, jOnWarmupCompleted)) {
                return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, jOnWarmupCompleted, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
            }
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(drawerKtExternalSyntheticLambda9, iAuthTabCallback.onExtraCallbackWithResult());
            int i2 = onextracallbackwithresultOnWarmupCompleted.IAuthTabCallback;
            if (i2 == -3) {
                onExtraCallback(false, jOnWarmupCompleted);
                return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, jOnWarmupCompleted, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
            }
            if (i2 == -2) {
                iAuthTabCallback.onExtraCallbackWithResult(onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted, onextracallbackwithresultOnWarmupCompleted.onExtraCallback);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    onNavigationEvent(drawerKtExternalSyntheticLambda9, onextracallbackwithresultOnWarmupCompleted.onExtraCallback);
                    onExtraCallback(true, onextracallbackwithresultOnWarmupCompleted.onExtraCallback);
                    return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, onextracallbackwithresultOnWarmupCompleted.onExtraCallback, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
                }
                iAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnWarmupCompleted.onWarmupCompleted, onextracallbackwithresultOnWarmupCompleted.onExtraCallback);
            }
        }
    }

    protected IAuthTabCallback onExtraCallback(long j) {
        return new IAuthTabCallback(j, this.onNavigationEvent.onExtraCallbackWithResult(j), this.onNavigationEvent.onTransact, this.onNavigationEvent.onExtraCallback, this.onNavigationEvent.onWarmupCompleted, this.onNavigationEvent.onExtraCallbackWithResult, this.onNavigationEvent.onNavigationEvent);
    }

    protected final void onExtraCallback(boolean z, long j) {
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    protected final boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
        long jIAuthTabCallback = j - drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        if (jIAuthTabCallback < 0 || jIAuthTabCallback > 262144) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback((int) jIAuthTabCallback);
        return true;
    }

    protected final int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) {
        if (j == drawerKtExternalSyntheticLambda9.IAuthTabCallback()) {
            return 0;
        }
        exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
        return 1;
    }

    protected static class IAuthTabCallback {
        private long IAuthTabCallback;
        private long IAuthTabCallbackStub;
        private final long asInterface;
        private long onExtraCallback;
        private final long onExtraCallbackWithResult;
        private long onNavigationEvent;
        private final long onTransact;
        private long onWarmupCompleted;

        protected static long onExtraCallbackWithResult(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected IAuthTabCallback(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.asInterface = j;
            this.onTransact = j2;
            this.onWarmupCompleted = j3;
            this.IAuthTabCallback = j4;
            this.onExtraCallback = j5;
            this.onNavigationEvent = j6;
            this.onExtraCallbackWithResult = j7;
            this.IAuthTabCallbackStub = onExtraCallbackWithResult(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long onExtraCallback() {
            return this.onExtraCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long onNavigationEvent() {
            return this.onNavigationEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long onExtraCallbackWithResult() {
            return this.onTransact;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long IAuthTabCallback() {
            return this.asInterface;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onExtraCallbackWithResult(long j, long j2) {
            this.onWarmupCompleted = j;
            this.onExtraCallback = j2;
            asInterface();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onNavigationEvent(long j, long j2) {
            this.IAuthTabCallback = j;
            this.onNavigationEvent = j2;
            asInterface();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long onWarmupCompleted() {
            return this.IAuthTabCallbackStub;
        }

        private void asInterface() {
            this.IAuthTabCallbackStub = onExtraCallbackWithResult(this.onTransact, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent, this.onExtraCallbackWithResult);
        }
    }

    public static final class onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult(-3, -9223372036854775807L, -1);
        private final int IAuthTabCallback;
        private final long onExtraCallback;
        private final long onWarmupCompleted;

        private onExtraCallbackWithResult(int i2, long j, long j2) {
            this.IAuthTabCallback = i2;
            this.onWarmupCompleted = j;
            this.onExtraCallback = j2;
        }

        public static onExtraCallbackWithResult onWarmupCompleted(long j, long j2) {
            return new onExtraCallbackWithResult(-1, j, j2);
        }

        public static onExtraCallbackWithResult onExtraCallbackWithResult(long j, long j2) {
            return new onExtraCallbackWithResult(-2, j, j2);
        }

        public static onExtraCallbackWithResult onWarmupCompleted(long j) {
            return new onExtraCallbackWithResult(0, -9223372036854775807L, j);
        }
    }

    public static class onWarmupCompleted implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
        private final long IAuthTabCallback;
        private final onExtraCallback IAuthTabCallbackStub;
        private final long onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private final long onTransact;
        private final long onWarmupCompleted;

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public boolean onNavigationEvent() {
            return true;
        }

        public onWarmupCompleted(onExtraCallback onextracallback, long j, long j2, long j3, long j4, long j5, long j6) {
            this.IAuthTabCallbackStub = onextracallback;
            this.IAuthTabCallback = j;
            this.onTransact = j2;
            this.onExtraCallback = j3;
            this.onWarmupCompleted = j4;
            this.onExtraCallbackWithResult = j5;
            this.onNavigationEvent = j6;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j, IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallbackStub.timeUsToTargetTime(j), this.onTransact, this.onExtraCallback, this.onWarmupCompleted, this.onExtraCallbackWithResult, this.onNavigationEvent)));
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public long onExtraCallback() {
            return this.IAuthTabCallback;
        }

        public long onExtraCallbackWithResult(long j) {
            return this.IAuthTabCallbackStub.timeUsToTargetTime(j);
        }
    }
}
