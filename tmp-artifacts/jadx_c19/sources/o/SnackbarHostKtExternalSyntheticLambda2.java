package o;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.SnackbarHostKtExternalSyntheticLambda2;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda2 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onNavigationEvent = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ts.PsExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SnackbarHostKtExternalSyntheticLambda2.onExtraCallback();
        }
    };
    private boolean IAuthTabCallback;
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private SnackbarHostKtExternalSyntheticLambda1 IAuthTabCallbackStub;
    private final SparseArray<onNavigationEvent> IAuthTabCallback_Parcel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 access100;
    private long asBinder;
    private boolean asInterface;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact;
    private final SnackbarHostKtExternalSyntheticLambda3 onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onExtraCallback() {
        return new DrawerStateExternalSyntheticLambda0[]{new SnackbarHostKtExternalSyntheticLambda2()};
    }

    public SnackbarHostKtExternalSyntheticLambda2() {
        this(new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(0L));
    }

    public SnackbarHostKtExternalSyntheticLambda2(TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
        this.access100 = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4096);
        this.IAuthTabCallback_Parcel = new SparseArray<>();
        this.onWarmupCompleted = new SnackbarHostKtExternalSyntheticLambda3();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArr = new byte[14];
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr[13] & 7);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallbackDefault = drawerStateExternalSyntheticLambda1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // o.DrawerStateExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(long j, long j2) {
        boolean z = this.access100.onExtraCallbackWithResult() == -9223372036854775807L;
        if (!z) {
            long jIAuthTabCallback = this.access100.IAuthTabCallback();
            if (jIAuthTabCallback != -9223372036854775807L && jIAuthTabCallback != 0 && jIAuthTabCallback != j2) {
                this.access100.IAuthTabCallbackDefault(j2);
            }
        } else if (z) {
        }
        SnackbarHostKtExternalSyntheticLambda1 snackbarHostKtExternalSyntheticLambda1 = this.IAuthTabCallbackStub;
        if (snackbarHostKtExternalSyntheticLambda1 != null) {
            snackbarHostKtExternalSyntheticLambda1.onWarmupCompleted(j2);
        }
        for (int i2 = 0; i2 < this.IAuthTabCallback_Parcel.size(); i2++) {
            this.IAuthTabCallback_Parcel.valueAt(i2).onExtraCallbackWithResult();
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        SliderKtExternalSyntheticLambda22 sliderKtExternalSyntheticLambda4;
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackDefault);
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        if (jOnExtraCallback != -1 && !this.onWarmupCompleted.IAuthTabCallback()) {
            return this.onWarmupCompleted.onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        IAuthTabCallback(jOnExtraCallback);
        SnackbarHostKtExternalSyntheticLambda1 snackbarHostKtExternalSyntheticLambda1 = this.IAuthTabCallbackStub;
        if (snackbarHostKtExternalSyntheticLambda1 != null && snackbarHostKtExternalSyntheticLambda1.onWarmupCompleted()) {
            return this.IAuthTabCallbackStub.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        long jOnWarmupCompleted = jOnExtraCallback != -1 ? jOnExtraCallback - drawerKtExternalSyntheticLambda9.onWarmupCompleted() : -1L;
        if ((jOnWarmupCompleted != -1 && jOnWarmupCompleted < 4) || !drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.onTransact.onExtraCallback(), 0, 4, true)) {
            return -1;
        }
        this.onTransact.asBinder(0);
        int iAsBinder = this.onTransact.asBinder();
        if (iAsBinder == 441) {
            return -1;
        }
        if (iAsBinder == 442) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onTransact.onExtraCallback(), 0, 10);
            this.onTransact.asBinder(9);
            drawerKtExternalSyntheticLambda9.onExtraCallback((this.onTransact.onMinimized() & 7) + 14);
            return 0;
        }
        if (iAsBinder == 443) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onTransact.onExtraCallback(), 0, 2);
            this.onTransact.asBinder(0);
            drawerKtExternalSyntheticLambda9.onExtraCallback(this.onTransact.onUnminimized() + 6);
            return 0;
        }
        if (((iAsBinder & (-256)) >> 8) != 1) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(1);
            return 0;
        }
        int i2 = iAsBinder & OggPageHeader.MAX_SEGMENT_COUNT;
        onNavigationEvent onnavigationevent = this.IAuthTabCallback_Parcel.get(i2);
        if (!this.onExtraCallbackWithResult) {
            if (onnavigationevent == null) {
                if (i2 == 189) {
                    sliderKtExternalSyntheticLambda4 = new SliderKtExternalSyntheticLambda16("video/mp2p");
                    this.IAuthTabCallback = true;
                    this.asBinder = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                } else if ((iAsBinder & 224) == 192) {
                    sliderKtExternalSyntheticLambda4 = new SliderKtanimateToTarget2ExternalSyntheticLambda0("video/mp2p");
                    this.IAuthTabCallback = true;
                    this.asBinder = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                } else if ((iAsBinder & 240) == 224) {
                    sliderKtExternalSyntheticLambda4 = new SliderKtExternalSyntheticLambda4("video/mp2p");
                    this.onExtraCallback = true;
                    this.asBinder = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                } else {
                    sliderKtExternalSyntheticLambda4 = null;
                }
                if (sliderKtExternalSyntheticLambda4 != null) {
                    sliderKtExternalSyntheticLambda4.onNavigationEvent(this.IAuthTabCallbackDefault, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(i2, 256));
                    onnavigationevent = new onNavigationEvent(sliderKtExternalSyntheticLambda4, this.access100);
                    this.IAuthTabCallback_Parcel.put(i2, onnavigationevent);
                }
            }
            if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() > ((this.IAuthTabCallback && this.onExtraCallback) ? this.asBinder + 8192 : 1048576L)) {
                this.onExtraCallbackWithResult = true;
                this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
            }
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onTransact.onExtraCallback(), 0, 2);
        this.onTransact.asBinder(0);
        int iOnUnminimized = this.onTransact.onUnminimized() + 6;
        if (onnavigationevent == null) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(iOnUnminimized);
        } else {
            this.onTransact.onExtraCallback(iOnUnminimized);
            drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onTransact.onExtraCallback(), 0, iOnUnminimized);
            this.onTransact.asBinder(6);
            onnavigationevent.onExtraCallback(this.onTransact);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.onTransact;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback());
        }
        return 0;
    }

    @RequiresNonNull
    private void IAuthTabCallback(long j) {
        if (this.asInterface) {
            return;
        }
        this.asInterface = true;
        if (this.onWarmupCompleted.onExtraCallback() != -9223372036854775807L) {
            SnackbarHostKtExternalSyntheticLambda1 snackbarHostKtExternalSyntheticLambda1 = new SnackbarHostKtExternalSyntheticLambda1(this.onWarmupCompleted.onExtraCallbackWithResult(), this.onWarmupCompleted.onExtraCallback(), j);
            this.IAuthTabCallbackStub = snackbarHostKtExternalSyntheticLambda1;
            this.IAuthTabCallbackDefault.IAuthTabCallback(snackbarHostKtExternalSyntheticLambda1.onExtraCallback());
            return;
        }
        this.IAuthTabCallbackDefault.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.onWarmupCompleted.onExtraCallback()));
    }

    static final class onNavigationEvent {
        private final SliderKtExternalSyntheticLambda22 IAuthTabCallback;
        private long IAuthTabCallbackDefault;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 IAuthTabCallbackStub;
        private boolean asInterface;
        private boolean onExtraCallback;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(new byte[64]);
        private boolean onNavigationEvent;
        private int onWarmupCompleted;

        public onNavigationEvent(SliderKtExternalSyntheticLambda22 sliderKtExternalSyntheticLambda22, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24) {
            this.IAuthTabCallback = sliderKtExternalSyntheticLambda22;
            this.IAuthTabCallbackStub = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        }

        public void onExtraCallbackWithResult() {
            this.asInterface = false;
            this.IAuthTabCallback.onWarmupCompleted();
        }

        public void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onExtraCallbackWithResult.onWarmupCompleted, 0, 3);
            this.onExtraCallbackWithResult.onWarmupCompleted(0);
            onWarmupCompleted();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onExtraCallbackWithResult.onWarmupCompleted, 0, this.onWarmupCompleted);
            this.onExtraCallbackWithResult.onWarmupCompleted(0);
            onExtraCallback();
            this.IAuthTabCallback.onNavigationEvent(this.IAuthTabCallbackDefault, 4);
            this.IAuthTabCallback.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            this.IAuthTabCallback.IAuthTabCallback(false);
        }

        private void onWarmupCompleted() {
            this.onExtraCallbackWithResult.IAuthTabCallback(8);
            this.onExtraCallback = this.onExtraCallbackWithResult.onWarmupCompleted();
            this.onNavigationEvent = this.onExtraCallbackWithResult.onWarmupCompleted();
            this.onExtraCallbackWithResult.IAuthTabCallback(6);
            this.onWarmupCompleted = this.onExtraCallbackWithResult.onNavigationEvent(8);
        }

        private void onExtraCallback() {
            char c;
            this.IAuthTabCallbackDefault = 0L;
            if (this.onExtraCallback) {
                this.onExtraCallbackWithResult.IAuthTabCallback(4);
                long jOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(3);
                this.onExtraCallbackWithResult.IAuthTabCallback(1);
                long jOnNavigationEvent2 = this.onExtraCallbackWithResult.onNavigationEvent(15) << 15;
                this.onExtraCallbackWithResult.IAuthTabCallback(1);
                long jOnNavigationEvent3 = this.onExtraCallbackWithResult.onNavigationEvent(15);
                this.onExtraCallbackWithResult.IAuthTabCallback(1);
                if (this.asInterface || !this.onNavigationEvent) {
                    c = 30;
                } else {
                    this.onExtraCallbackWithResult.IAuthTabCallback(4);
                    long jOnNavigationEvent4 = this.onExtraCallbackWithResult.onNavigationEvent(3);
                    this.onExtraCallbackWithResult.IAuthTabCallback(1);
                    long jOnNavigationEvent5 = this.onExtraCallbackWithResult.onNavigationEvent(15) << 15;
                    this.onExtraCallbackWithResult.IAuthTabCallback(1);
                    long jOnNavigationEvent6 = this.onExtraCallbackWithResult.onNavigationEvent(15);
                    this.onExtraCallbackWithResult.IAuthTabCallback(1);
                    c = 30;
                    this.IAuthTabCallbackStub.IAuthTabCallback((jOnNavigationEvent4 << 30) | jOnNavigationEvent5 | jOnNavigationEvent6);
                    this.asInterface = true;
                }
                this.IAuthTabCallbackDefault = this.IAuthTabCallbackStub.IAuthTabCallback((jOnNavigationEvent << c) | jOnNavigationEvent2 | jOnNavigationEvent3);
            }
        }
    }
}
