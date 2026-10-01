package o;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressIndicatorKtExternalSyntheticLambda18 implements ProgressIndicatorKtExternalSyntheticLambda20 {
    private long IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private long access000;
    private long asBinder;
    private final ProgressIndicatorKtExternalSyntheticLambda6 asInterface;
    private long getInterfaceDescriptor;
    private long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final ProgressIndicatorKtExternalSyntheticLambda2 onNavigationEvent;
    private long onTransact;
    private final long onWarmupCompleted;

    public ProgressIndicatorKtExternalSyntheticLambda18(ProgressIndicatorKtExternalSyntheticLambda6 progressIndicatorKtExternalSyntheticLambda6, long j, long j2, long j3, long j4, boolean z) {
        RecordingInputConnection_androidKt.onNavigationEvent(j >= 0 && j2 > j);
        this.asInterface = progressIndicatorKtExternalSyntheticLambda6;
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = j2;
        if (j3 == j2 - j || z) {
            this.getInterfaceDescriptor = j4;
            this.IAuthTabCallbackStub = 4;
        } else {
            this.IAuthTabCallbackStub = 0;
        }
        this.onNavigationEvent = new ProgressIndicatorKtExternalSyntheticLambda2();
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
    public long onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        int i2 = this.IAuthTabCallbackStub;
        if (i2 == 0) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            this.IAuthTabCallbackDefault = jIAuthTabCallback;
            this.IAuthTabCallbackStub = 1;
            long j = this.onWarmupCompleted - 65307;
            if (j > jIAuthTabCallback) {
                return j;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long jOnWarmupCompleted = onWarmupCompleted(drawerKtExternalSyntheticLambda9);
                if (jOnWarmupCompleted != -1) {
                    return jOnWarmupCompleted;
                }
                this.IAuthTabCallbackStub = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            onNavigationEvent(drawerKtExternalSyntheticLambda9);
            this.IAuthTabCallbackStub = 4;
            return -(this.onTransact + 2);
        }
        this.getInterfaceDescriptor = onExtraCallback(drawerKtExternalSyntheticLambda9);
        this.IAuthTabCallbackStub = 4;
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public IAuthTabCallback onWarmupCompleted() {
        if (this.getInterfaceDescriptor != 0) {
            return new IAuthTabCallback();
        }
        return null;
    }

    @Override // o.ProgressIndicatorKtExternalSyntheticLambda20
    public void IAuthTabCallback(long j) {
        this.access000 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(j, 0L, this.getInterfaceDescriptor - 1);
        this.IAuthTabCallbackStub = 2;
        this.asBinder = this.onExtraCallbackWithResult;
        this.onExtraCallback = this.onWarmupCompleted;
        this.onTransact = 0L;
        this.IAuthTabCallback = this.getInterfaceDescriptor;
    }

    private long onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        if (this.asBinder == this.onExtraCallback) {
            return -1L;
        }
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        if (!this.onNavigationEvent.IAuthTabCallback(drawerKtExternalSyntheticLambda9, this.onExtraCallback)) {
            long j = this.asBinder;
            if (j != jIAuthTabCallback) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, false);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        long j2 = this.access000;
        ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = this.onNavigationEvent;
        long j3 = progressIndicatorKtExternalSyntheticLambda2.onWarmupCompleted;
        long j4 = j2 - j3;
        int i2 = progressIndicatorKtExternalSyntheticLambda2.onNavigationEvent + progressIndicatorKtExternalSyntheticLambda2.IAuthTabCallback;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.onExtraCallback = jIAuthTabCallback;
            this.IAuthTabCallback = j3;
        } else {
            this.asBinder = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + i2;
            this.onTransact = this.onNavigationEvent.onWarmupCompleted;
        }
        long j5 = this.onExtraCallback;
        long j6 = this.asBinder;
        if (j5 - j6 < 100000) {
            this.onExtraCallback = j6;
            return j6;
        }
        long j7 = i2;
        long j8 = j4 <= 0 ? 2L : 1L;
        long jIAuthTabCallback2 = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        long j9 = this.onExtraCallback;
        long j10 = this.asBinder;
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((jIAuthTabCallback2 - (j7 * j8)) + ((j4 * (j9 - j10)) / (this.IAuthTabCallback - this.onTransact)), j10, j9 - 1);
    }

    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        while (true) {
            this.onNavigationEvent.IAuthTabCallback(drawerKtExternalSyntheticLambda9);
            this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, false);
            ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = this.onNavigationEvent;
            if (progressIndicatorKtExternalSyntheticLambda2.onWarmupCompleted <= this.access000) {
                drawerKtExternalSyntheticLambda9.onExtraCallback(progressIndicatorKtExternalSyntheticLambda2.onNavigationEvent + progressIndicatorKtExternalSyntheticLambda2.IAuthTabCallback);
                this.asBinder = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                this.onTransact = this.onNavigationEvent.onWarmupCompleted;
            } else {
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                return;
            }
        }
    }

    long onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        this.onNavigationEvent.onExtraCallbackWithResult();
        if (!this.onNavigationEvent.IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
            throw new EOFException();
        }
        this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, false);
        ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda2 = this.onNavigationEvent;
        drawerKtExternalSyntheticLambda9.onExtraCallback(progressIndicatorKtExternalSyntheticLambda2.onNavigationEvent + progressIndicatorKtExternalSyntheticLambda2.IAuthTabCallback);
        long j = this.onNavigationEvent.onWarmupCompleted;
        while (true) {
            ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda22 = this.onNavigationEvent;
            if ((progressIndicatorKtExternalSyntheticLambda22.onTransact & 4) != 4 && progressIndicatorKtExternalSyntheticLambda22.IAuthTabCallback(drawerKtExternalSyntheticLambda9) && drawerKtExternalSyntheticLambda9.IAuthTabCallback() < this.onWarmupCompleted && this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, true)) {
                ProgressIndicatorKtExternalSyntheticLambda2 progressIndicatorKtExternalSyntheticLambda23 = this.onNavigationEvent;
                if (!DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9, progressIndicatorKtExternalSyntheticLambda23.onNavigationEvent + progressIndicatorKtExternalSyntheticLambda23.IAuthTabCallback)) {
                    break;
                }
                j = this.onNavigationEvent.onWarmupCompleted;
            } else {
                break;
            }
        }
        return j;
    }

    final class IAuthTabCallback implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public boolean onNavigationEvent() {
            return true;
        }

        private IAuthTabCallback() {
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
            long jIAuthTabCallback = ProgressIndicatorKtExternalSyntheticLambda18.this.asInterface.IAuthTabCallback(j);
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((ProgressIndicatorKtExternalSyntheticLambda18.this.onExtraCallbackWithResult + BigInteger.valueOf(jIAuthTabCallback).multiply(BigInteger.valueOf(ProgressIndicatorKtExternalSyntheticLambda18.this.onWarmupCompleted - ProgressIndicatorKtExternalSyntheticLambda18.this.onExtraCallbackWithResult)).divide(BigInteger.valueOf(ProgressIndicatorKtExternalSyntheticLambda18.this.getInterfaceDescriptor)).longValue()) - 30000, ProgressIndicatorKtExternalSyntheticLambda18.this.onExtraCallbackWithResult, ProgressIndicatorKtExternalSyntheticLambda18.this.onWarmupCompleted - 1)));
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public long onExtraCallback() {
            return ProgressIndicatorKtExternalSyntheticLambda18.this.asInterface.onWarmupCompleted(ProgressIndicatorKtExternalSyntheticLambda18.this.getInterfaceDescriptor);
        }
    }
}
