package o;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.SliderKtExternalSyntheticLambda19;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda19 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onNavigationEvent = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.ts.AdtsExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return SliderKtExternalSyntheticLambda19.onNavigationEvent();
        }
    };
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 IAuthTabCallbackStubProxy;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback_Parcel;
    private final int asBinder;
    private final SliderKtExternalSyntheticLambda17 asInterface;
    private boolean getInterfaceDescriptor;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact;
    private int onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new SliderKtExternalSyntheticLambda19()};
    }

    public SliderKtExternalSyntheticLambda19() {
        this(0);
    }

    public SliderKtExternalSyntheticLambda19(int i2) {
        this.asBinder = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.asInterface = new SliderKtExternalSyntheticLambda17(true, "audio/mp4a-latm");
        this.onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(2048);
        this.onWarmupCompleted = -1;
        this.onExtraCallbackWithResult = -1L;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);
        this.IAuthTabCallback_Parcel = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        this.IAuthTabCallbackStubProxy = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int iIAuthTabCallback = IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        int i2 = iIAuthTabCallback;
        int i3 = 0;
        int i4 = 0;
        do {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 2);
            this.IAuthTabCallback_Parcel.asBinder(0);
            if (SliderKtExternalSyntheticLambda17.onNavigationEvent(this.IAuthTabCallback_Parcel.onUnminimized())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 4);
                this.IAuthTabCallbackStubProxy.onWarmupCompleted(14);
                int iOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(13);
                if (iOnNavigationEvent <= 6) {
                    i2++;
                    drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(i2);
                } else {
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnNavigationEvent - 6);
                    i4 += iOnNavigationEvent;
                }
            } else {
                i2++;
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(i2);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - iIAuthTabCallback < 8192);
        return false;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
        this.asInterface.onNavigationEvent(drawerStateExternalSyntheticLambda1, new SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult(0, 1));
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.getInterfaceDescriptor = false;
        this.asInterface.onWarmupCompleted();
        this.onExtraCallback = j2;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallback);
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        int i2 = this.asBinder;
        if ((i2 & 2) != 0 || ((i2 & 1) != 0 && jOnExtraCallback != -1)) {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
        }
        int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(this.onTransact.onExtraCallback(), 0, 2048);
        boolean z = iOnWarmupCompleted == -1;
        onNavigationEvent(jOnExtraCallback, z);
        if (z) {
            return -1;
        }
        this.onTransact.asBinder(0);
        this.onTransact.onNavigationEvent(iOnWarmupCompleted);
        if (!this.getInterfaceDescriptor) {
            this.asInterface.onNavigationEvent(this.onExtraCallback, 4);
            this.getInterfaceDescriptor = true;
        }
        this.asInterface.IAuthTabCallback(this.onTransact);
        return 0;
    }

    private int IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2 = 0;
        while (true) {
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 10);
            this.IAuthTabCallback_Parcel.asBinder(0);
            if (this.IAuthTabCallback_Parcel.onMessageChannelReady() != 4801587) {
                break;
            }
            this.IAuthTabCallback_Parcel.IAuthTabCallbackDefault(3);
            int iOnPostMessage = this.IAuthTabCallback_Parcel.onPostMessage();
            i2 += iOnPostMessage + 10;
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnPostMessage);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(i2);
        if (this.onExtraCallbackWithResult == -1) {
            this.onExtraCallbackWithResult = i2;
        }
        return i2;
    }

    @RequiresNonNull
    private void onNavigationEvent(long j, boolean z) {
        if (this.IAuthTabCallbackStub) {
            return;
        }
        boolean z2 = (this.asBinder & 1) != 0 && this.onWarmupCompleted > 0;
        if (z2 && this.asInterface.onNavigationEvent() == -9223372036854775807L && !z) {
            return;
        }
        if (z2 && this.asInterface.onNavigationEvent() != -9223372036854775807L) {
            this.IAuthTabCallback.IAuthTabCallback(onExtraCallback(j, (this.asBinder & 2) != 0));
        } else {
            this.IAuthTabCallback.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
        }
        this.IAuthTabCallbackStub = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        int iOnNavigationEvent;
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.onWarmupCompleted = -1;
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        long j = 0;
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() == 0) {
            IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        }
        int i2 = 0;
        int i3 = 0;
        do {
            try {
                if (!drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 2, true)) {
                    break;
                }
                this.IAuthTabCallback_Parcel.asBinder(0);
                if (!SliderKtExternalSyntheticLambda17.onNavigationEvent(this.IAuthTabCallback_Parcel.onUnminimized())) {
                    break;
                }
                if (!drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel.onExtraCallback(), 0, 4, true)) {
                    break;
                }
                this.IAuthTabCallbackStubProxy.onWarmupCompleted(14);
                iOnNavigationEvent = this.IAuthTabCallbackStubProxy.onNavigationEvent(13);
                if (iOnNavigationEvent <= 6) {
                    this.IAuthTabCallbackDefault = true;
                    throw ParserException.onNavigationEvent("Malformed ADTS stream", (Throwable) null);
                }
                j += iOnNavigationEvent;
                i3++;
                if (i3 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(iOnNavigationEvent - 6, true));
        i2 = i3;
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        if (i2 > 0) {
            this.onWarmupCompleted = (int) (j / i2);
        } else {
            this.onWarmupCompleted = -1;
        }
        this.IAuthTabCallbackDefault = true;
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onExtraCallback(long j, boolean z) {
        return new DrawerKtExternalSyntheticLambda8(j, this.onExtraCallbackWithResult, onExtraCallbackWithResult(this.onWarmupCompleted, this.asInterface.onNavigationEvent()), this.onWarmupCompleted, z);
    }

    private static int onExtraCallbackWithResult(int i2, long j) {
        return (int) ((i2 * 8000000) / j);
    }
}
