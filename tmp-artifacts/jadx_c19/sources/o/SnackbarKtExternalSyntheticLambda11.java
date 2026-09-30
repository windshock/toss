package o;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.io.IOException;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerStateExternalSyntheticLambda0;
import o.SnackbarKtExternalSyntheticLambda11;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarKtExternalSyntheticLambda11 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onWarmupCompleted = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SnackbarKtExternalSyntheticLambda11.onNavigationEvent();
        }
    };
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 asInterface;
    private onWarmupCompleted onNavigationEvent;
    private int onTransact = 0;
    private long IAuthTabCallbackDefault = -1;
    private int onExtraCallback = -1;
    private long onExtraCallbackWithResult = -1;

    interface onWarmupCompleted {
        void IAuthTabCallback(long j);

        void onNavigationEvent(int i2, long j) throws ParserException;

        boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new SnackbarKtExternalSyntheticLambda11()};
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return SnackbarKtExternalSyntheticLambda5.IAuthTabCallback(drawerKtExternalSyntheticLambda9);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
        this.asInterface = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 1);
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onTransact = j == 0 ? 0 : 4;
        onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.IAuthTabCallback(j2);
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        onExtraCallback();
        int i2 = this.onTransact;
        if (i2 == 0) {
            onNavigationEvent(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 1) {
            IAuthTabCallback(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 2) {
            onWarmupCompleted(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 3) {
            asInterface(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 4) {
            return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull
    private void onExtraCallback() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.asInterface);
        Object[] objArr = {this.IAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9.IAuthTabCallback() == 0);
        int i2 = this.onExtraCallback;
        if (i2 != -1) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
            this.onTransact = 4;
        } else {
            if (!SnackbarKtExternalSyntheticLambda5.IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
                throw ParserException.onNavigationEvent("Unsupported or unrecognized wav file type.", (Throwable) null);
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback((int) (drawerKtExternalSyntheticLambda9.onWarmupCompleted() - drawerKtExternalSyntheticLambda9.IAuthTabCallback()));
            this.onTransact = 1;
        }
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.IAuthTabCallbackDefault = SnackbarKtExternalSyntheticLambda5.onExtraCallback(drawerKtExternalSyntheticLambda9);
        this.onTransact = 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @RequiresNonNull
    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        SnackbarKtExternalSyntheticLambda4 snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult = SnackbarKtExternalSyntheticLambda5.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
        int i2 = snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback;
        if (i2 == 17) {
            this.onNavigationEvent = new onExtraCallbackWithResult(this.IAuthTabCallback, this.asInterface, snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult);
        } else if (i2 == 6) {
            this.onNavigationEvent = new IAuthTabCallback(this.IAuthTabCallback, this.asInterface, snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult, "audio/g711-alaw", -1);
        } else if (i2 == 7) {
            this.onNavigationEvent = new IAuthTabCallback(this.IAuthTabCallback, this.asInterface, snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult, "audio/g711-mlaw", -1);
        } else {
            int iOnExtraCallback = FloatingActionButtonKtExternalSyntheticLambda0.onExtraCallback(i2, snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult);
            if (iOnExtraCallback == 0) {
                throw ParserException.onExtraCallback("Unsupported WAV format type: " + snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback);
            }
            this.onNavigationEvent = new IAuthTabCallback(this.IAuthTabCallback, this.asInterface, snackbarKtExternalSyntheticLambda4OnExtraCallbackWithResult, "audio/raw", iOnExtraCallback);
        }
        this.onTransact = 3;
    }

    private void asInterface(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        Pair<Long, Long> pairOnWarmupCompleted = SnackbarKtExternalSyntheticLambda5.onWarmupCompleted(drawerKtExternalSyntheticLambda9);
        this.onExtraCallback = ((Long) pairOnWarmupCompleted.first).intValue();
        long jLongValue = ((Long) pairOnWarmupCompleted.second).longValue();
        long j = this.IAuthTabCallbackDefault;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.onExtraCallbackWithResult = this.onExtraCallback + jLongValue;
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        if (jOnExtraCallback != -1 && this.onExtraCallbackWithResult > jOnExtraCallback) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("WavExtractor", "Data exceeds input length: " + this.onExtraCallbackWithResult + ", " + jOnExtraCallback);
            this.onExtraCallbackWithResult = jOnExtraCallback;
        }
        ((onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult);
        this.onTransact = 4;
    }

    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult != -1);
        return ((onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onWarmupCompleted(drawerKtExternalSyntheticLambda9, this.onExtraCallbackWithResult - drawerKtExternalSyntheticLambda9.IAuthTabCallback()) ? -1 : 0;
    }

    static final class IAuthTabCallback implements onWarmupCompleted {
        private int IAuthTabCallback;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackStub;
        private final SnackbarKtExternalSyntheticLambda4 asBinder;
        private final int asInterface;
        private final DrawerStateExternalSyntheticLambda1 onExtraCallback;
        private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
        private long onNavigationEvent;
        private long onWarmupCompleted;

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        public IAuthTabCallback(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, SnackbarKtExternalSyntheticLambda4 snackbarKtExternalSyntheticLambda4, String str, int i2) throws ParserException {
            this.onExtraCallback = drawerStateExternalSyntheticLambda1;
            this.IAuthTabCallbackStub = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            this.asBinder = snackbarKtExternalSyntheticLambda4;
            int i3 = (snackbarKtExternalSyntheticLambda4.IAuthTabCallbackDefault * snackbarKtExternalSyntheticLambda4.onExtraCallbackWithResult) / 8;
            if (snackbarKtExternalSyntheticLambda4.onWarmupCompleted != i3) {
                throw ParserException.onNavigationEvent("Expected block size: " + i3 + "; got: " + snackbarKtExternalSyntheticLambda4.onWarmupCompleted, (Throwable) null);
            }
            int i4 = snackbarKtExternalSyntheticLambda4.onTransact * i3;
            int i5 = i4 << 3;
            int iMax = Math.max(i3, i4 / 10);
            this.asInterface = iMax;
            this.onExtraCallbackWithResult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("audio/wav").IAuthTabCallbackDefault(str).onNavigationEvent(i5).extraCallback(i5).IAuthTabCallbackStubProxy(iMax).onExtraCallback(snackbarKtExternalSyntheticLambda4.IAuthTabCallbackDefault).extraCallbackWithResult(snackbarKtExternalSyntheticLambda4.onTransact).writeTypedObject(i2).onNavigationEvent();
        }

        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        public void IAuthTabCallback(long j) {
            this.onWarmupCompleted = j;
            this.IAuthTabCallback = 0;
            this.onNavigationEvent = 0L;
        }

        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        public void onNavigationEvent(int i2, long j) {
            SnackbarKtExternalSyntheticLambda6 snackbarKtExternalSyntheticLambda6 = new SnackbarKtExternalSyntheticLambda6(this.asBinder, 1, i2, j);
            this.onExtraCallback.IAuthTabCallback(snackbarKtExternalSyntheticLambda6);
            this.IAuthTabCallbackStub.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            snackbarKtExternalSyntheticLambda6.onExtraCallback();
        }

        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        public boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
            int i2;
            int i3;
            long j2 = j;
            while (j2 > 0 && (i2 = this.IAuthTabCallback) < (i3 = this.asInterface)) {
                int iOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(drawerKtExternalSyntheticLambda9, (int) Math.min(i3 - i2, j2), true);
                if (iOnExtraCallback == -1) {
                    j2 = 0;
                } else {
                    this.IAuthTabCallback += iOnExtraCallback;
                    j2 -= iOnExtraCallback;
                }
            }
            int i4 = this.asBinder.onWarmupCompleted;
            int i5 = this.IAuthTabCallback / i4;
            if (i5 > 0) {
                long j3 = this.onWarmupCompleted;
                long jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.onNavigationEvent, 1000000L, r1.onTransact);
                int i6 = i5 * i4;
                int i7 = this.IAuthTabCallback - i6;
                this.IAuthTabCallbackStub.onExtraCallback(j3 + jIAuthTabCallback, 1, i6, i7, null);
                this.onNavigationEvent += i5;
                this.IAuthTabCallback = i7;
            }
            return j2 <= 0;
        }
    }

    static final class onExtraCallbackWithResult implements onWarmupCompleted {
        private static final int[] IAuthTabCallback = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] onNavigationEvent = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private int IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private long IAuthTabCallbackStubProxy;
        private final SnackbarKtExternalSyntheticLambda4 IAuthTabCallback_Parcel;
        private final int access100;
        private long asBinder;
        private final int asInterface;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 getInterfaceDescriptor;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback;
        private final DrawerStateExternalSyntheticLambda1 onExtraCallbackWithResult;
        private final byte[] onTransact;
        private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

        private static int IAuthTabCallback(int i2, int i3) {
            return (i2 << 1) * i3;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        public onExtraCallbackWithResult(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, SnackbarKtExternalSyntheticLambda4 snackbarKtExternalSyntheticLambda4) throws ParserException {
            this.onExtraCallbackWithResult = drawerStateExternalSyntheticLambda1;
            this.getInterfaceDescriptor = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            this.IAuthTabCallback_Parcel = snackbarKtExternalSyntheticLambda4;
            int iMax = Math.max(1, snackbarKtExternalSyntheticLambda4.onTransact / 10);
            this.access100 = iMax;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(snackbarKtExternalSyntheticLambda4.IAuthTabCallback);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
            int iWriteTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
            this.asInterface = iWriteTypedObject;
            int i2 = snackbarKtExternalSyntheticLambda4.IAuthTabCallbackDefault;
            int i3 = (((snackbarKtExternalSyntheticLambda4.onWarmupCompleted - (i2 << 2)) << 3) / (snackbarKtExternalSyntheticLambda4.onExtraCallbackWithResult * i2)) + 1;
            if (iWriteTypedObject != i3) {
                throw ParserException.onNavigationEvent("Expected frames per block: " + i3 + "; got: " + iWriteTypedObject, (Throwable) null);
            }
            int iOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(iMax, iWriteTypedObject);
            this.onTransact = new byte[snackbarKtExternalSyntheticLambda4.onWarmupCompleted * iOnWarmupCompleted];
            this.onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(iOnWarmupCompleted * IAuthTabCallback(iWriteTypedObject, i2));
            int i4 = ((snackbarKtExternalSyntheticLambda4.onTransact * snackbarKtExternalSyntheticLambda4.onWarmupCompleted) << 3) / iWriteTypedObject;
            this.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("audio/raw").onNavigationEvent(i4).extraCallback(i4).IAuthTabCallbackStubProxy(IAuthTabCallback(iMax, i2)).onExtraCallback(snackbarKtExternalSyntheticLambda4.IAuthTabCallbackDefault).extraCallbackWithResult(snackbarKtExternalSyntheticLambda4.onTransact).writeTypedObject(2).onNavigationEvent();
        }

        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        public void IAuthTabCallback(long j) {
            this.IAuthTabCallbackDefault = 0;
            this.IAuthTabCallbackStubProxy = j;
            this.IAuthTabCallbackStub = 0;
            this.asBinder = 0L;
        }

        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        public void onNavigationEvent(int i2, long j) {
            SnackbarKtExternalSyntheticLambda6 snackbarKtExternalSyntheticLambda6 = new SnackbarKtExternalSyntheticLambda6(this.IAuthTabCallback_Parcel, this.asInterface, i2, j);
            this.onExtraCallbackWithResult.IAuthTabCallback(snackbarKtExternalSyntheticLambda6);
            this.getInterfaceDescriptor.onExtraCallbackWithResult(this.onWarmupCompleted);
            snackbarKtExternalSyntheticLambda6.onExtraCallback();
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
        
            r1 = true;
         */
        @Override // o.SnackbarKtExternalSyntheticLambda11.onWarmupCompleted
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
            boolean z;
            int iOnExtraCallback;
            int iOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.access100 - onExtraCallback(this.IAuthTabCallbackStub), this.asInterface) * this.IAuthTabCallback_Parcel.onWarmupCompleted;
            if (j != 0) {
                z = false;
                while (!z) {
                    if (this.IAuthTabCallbackDefault >= iOnWarmupCompleted) {
                        break;
                    }
                    int iOnWarmupCompleted2 = drawerKtExternalSyntheticLambda9.onWarmupCompleted(this.onTransact, this.IAuthTabCallbackDefault, (int) Math.min(iOnWarmupCompleted - r2, j));
                    if (iOnWarmupCompleted2 != -1) {
                        this.IAuthTabCallbackDefault += iOnWarmupCompleted2;
                    }
                }
                int i2 = this.IAuthTabCallbackDefault / this.IAuthTabCallback_Parcel.onWarmupCompleted;
                if (i2 > 0) {
                    onNavigationEvent(this.onTransact, i2, this.onExtraCallback);
                    this.IAuthTabCallbackDefault -= i2 * this.IAuthTabCallback_Parcel.onWarmupCompleted;
                    int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
                    this.getInterfaceDescriptor.onNavigationEvent(this.onExtraCallback, iOnExtraCallbackWithResult);
                    int i3 = this.IAuthTabCallbackStub + iOnExtraCallbackWithResult;
                    this.IAuthTabCallbackStub = i3;
                    int iOnExtraCallback2 = onExtraCallback(i3);
                    int i4 = this.access100;
                    if (iOnExtraCallback2 >= i4) {
                        onExtraCallbackWithResult(i4);
                    }
                }
                if (z && (iOnExtraCallback = onExtraCallback(this.IAuthTabCallbackStub)) > 0) {
                    onExtraCallbackWithResult(iOnExtraCallback);
                }
                return z;
            }
            z = true;
        }

        private void onExtraCallbackWithResult(int i2) {
            long j = this.IAuthTabCallbackStubProxy;
            long jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.asBinder, 1000000L, this.IAuthTabCallback_Parcel.onTransact);
            int iOnWarmupCompleted = onWarmupCompleted(i2);
            this.getInterfaceDescriptor.onExtraCallback(j + jIAuthTabCallback, 1, iOnWarmupCompleted, this.IAuthTabCallbackStub - iOnWarmupCompleted, null);
            this.asBinder += i2;
            this.IAuthTabCallbackStub -= iOnWarmupCompleted;
        }

        private void onNavigationEvent(byte[] bArr, int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.IAuthTabCallback_Parcel.IAuthTabCallbackDefault; i4++) {
                    onExtraCallbackWithResult(bArr, i3, i4, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
                }
            }
            int iOnWarmupCompleted = onWarmupCompleted(this.asInterface * i2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(iOnWarmupCompleted);
        }

        private void onExtraCallbackWithResult(byte[] bArr, int i2, int i3, byte[] bArr2) {
            SnackbarKtExternalSyntheticLambda4 snackbarKtExternalSyntheticLambda4 = this.IAuthTabCallback_Parcel;
            int i4 = snackbarKtExternalSyntheticLambda4.onWarmupCompleted;
            int i5 = snackbarKtExternalSyntheticLambda4.IAuthTabCallbackDefault;
            int i6 = (i2 * i4) + (i3 << 2);
            int i7 = i4 / i5;
            int iOnExtraCallback = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int iMin = Math.min(bArr[i6 + 2] & 255, 88);
            int i8 = onNavigationEvent[iMin];
            int i9 = (((i2 * this.asInterface) * i5) + i3) << 1;
            bArr2[i9] = (byte) iOnExtraCallback;
            bArr2[i9 + 1] = (byte) (iOnExtraCallback >> 8);
            for (int i10 = 0; i10 < ((i7 - 4) << 1); i10++) {
                byte b = bArr[(((i10 / 8) * i5) << 2) + (i5 << 2) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i12 = ((((i11 & 7) << 1) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(iOnExtraCallback + i12, -32768, 32767);
                i9 += i5 << 1;
                bArr2[i9] = (byte) iOnExtraCallback;
                bArr2[i9 + 1] = (byte) (iOnExtraCallback >> 8);
                int i13 = IAuthTabCallback[i11];
                int[] iArr = onNavigationEvent;
                iMin = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(iMin + i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int onExtraCallback(int i2) {
            return i2 / (this.IAuthTabCallback_Parcel.IAuthTabCallbackDefault << 1);
        }

        private int onWarmupCompleted(int i2) {
            return IAuthTabCallback(i2, this.IAuthTabCallback_Parcel.IAuthTabCallbackDefault);
        }
    }
}
