package o;

import androidx.media3.common.ParserException;
import java.io.IOException;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.ListItemKtExternalSyntheticLambda0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ListItemKtExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onExtraCallback = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.flv.FlvExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return ListItemKtExternalSyntheticLambda0.onExtraCallback();
        }
    };
    private int IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private int IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private boolean asInterface;
    private int extraCallbackWithResult;
    private DrawerStateExternalSyntheticLambda1 onNavigationEvent;
    private long onTransact;
    private ListItemKtExternalSyntheticLambda3 onWarmupCompleted;
    private ListItemKtBaselinesOffsetColumn11ExternalSyntheticLambda0 readTypedObject;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asBinder = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(9);
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 access000 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(11);
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 getInterfaceDescriptor = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final MaterialThemeKtExternalSyntheticLambda0 IAuthTabCallbackStub = new MaterialThemeKtExternalSyntheticLambda0();
    private int access100 = 1;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onExtraCallback() {
        return new DrawerStateExternalSyntheticLambda0[]{new ListItemKtExternalSyntheticLambda0()};
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.asBinder.onExtraCallback(), 0, 3);
        this.asBinder.asBinder(0);
        if (this.asBinder.onMessageChannelReady() != 4607062) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.asBinder.onExtraCallback(), 0, 2);
        this.asBinder.asBinder(0);
        if ((this.asBinder.onUnminimized() & 250) != 0) {
            return false;
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.asBinder.onExtraCallback(), 0, 4);
        this.asBinder.asBinder(0);
        int iAsBinder = this.asBinder.asBinder();
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(iAsBinder);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.asBinder.onExtraCallback(), 0, 4);
        this.asBinder.asBinder(0);
        return this.asBinder.asBinder() == 0;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onNavigationEvent = drawerStateExternalSyntheticLambda1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        if (j == 0) {
            this.access100 = 1;
            this.asInterface = false;
        } else {
            this.access100 = 3;
        }
        this.IAuthTabCallback = 0;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onNavigationEvent);
        while (true) {
            int i2 = this.access100;
            if (i2 != 1) {
                if (i2 == 2) {
                    IAuthTabCallbackDefault(drawerKtExternalSyntheticLambda9);
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9)) {
                    return -1;
                }
            } else if (!onWarmupCompleted(drawerKtExternalSyntheticLambda9)) {
                return -1;
            }
        }
    }

    @RequiresNonNull
    private boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (!drawerKtExternalSyntheticLambda9.onExtraCallback(this.onExtraCallbackWithResult.onExtraCallback(), 0, 9, true)) {
            return false;
        }
        this.onExtraCallbackWithResult.asBinder(0);
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault(4);
        int iOnMinimized = this.onExtraCallbackWithResult.onMinimized();
        boolean z = (iOnMinimized & 4) != 0;
        boolean z2 = (iOnMinimized & 1) != 0;
        if (z && this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new ListItemKtExternalSyntheticLambda3(this.onNavigationEvent.onExtraCallbackWithResult(8, 1));
        }
        if (z2 && this.readTypedObject == null) {
            this.readTypedObject = new ListItemKtBaselinesOffsetColumn11ExternalSyntheticLambda0(this.onNavigationEvent.onExtraCallbackWithResult(9, 2));
        }
        this.onNavigationEvent.onExtraCallbackWithResult();
        this.IAuthTabCallback = this.onExtraCallbackWithResult.asBinder() - 5;
        this.access100 = 2;
        return true;
    }

    private void IAuthTabCallbackDefault(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallback(this.IAuthTabCallback);
        this.IAuthTabCallback = 0;
        this.access100 = 3;
    }

    private boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (!drawerKtExternalSyntheticLambda9.onExtraCallback(this.access000.onExtraCallback(), 0, 11, true)) {
            return false;
        }
        this.access000.asBinder(0);
        this.extraCallbackWithResult = this.access000.onMinimized();
        this.IAuthTabCallbackStubProxy = this.access000.onMessageChannelReady();
        this.IAuthTabCallback_Parcel = this.access000.onMessageChannelReady();
        this.IAuthTabCallback_Parcel = ((this.access000.onMinimized() << 24) | this.IAuthTabCallback_Parcel) * 1000;
        this.access000.IAuthTabCallbackDefault(3);
        this.access100 = 4;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        boolean zOnExtraCallback;
        boolean z;
        long jAsInterface = asInterface();
        int i2 = this.extraCallbackWithResult;
        if (i2 == 8 && this.onWarmupCompleted != null) {
            onNavigationEvent();
            zOnExtraCallback = this.onWarmupCompleted.onExtraCallback(onNavigationEvent(drawerKtExternalSyntheticLambda9), jAsInterface);
        } else if (i2 == 9 && this.readTypedObject != null) {
            onNavigationEvent();
            zOnExtraCallback = this.readTypedObject.onExtraCallback(onNavigationEvent(drawerKtExternalSyntheticLambda9), jAsInterface);
        } else if (i2 == 18 && !this.IAuthTabCallbackDefault) {
            zOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(onNavigationEvent(drawerKtExternalSyntheticLambda9), jAsInterface);
            long jOnWarmupCompleted = this.IAuthTabCallbackStub.onWarmupCompleted();
            if (jOnWarmupCompleted != -9223372036854775807L) {
                this.onNavigationEvent.IAuthTabCallback(new ExposedDropdownMenu_androidExternalSyntheticLambda1(this.IAuthTabCallbackStub.IAuthTabCallback(), this.IAuthTabCallbackStub.onExtraCallbackWithResult(), jOnWarmupCompleted));
                this.IAuthTabCallbackDefault = true;
            }
        } else {
            drawerKtExternalSyntheticLambda9.onExtraCallback(this.IAuthTabCallbackStubProxy);
            zOnExtraCallback = false;
            z = false;
            if (!this.asInterface && zOnExtraCallback) {
                this.asInterface = true;
                this.onTransact = this.IAuthTabCallbackStub.onWarmupCompleted() != -9223372036854775807L ? -this.IAuthTabCallback_Parcel : 0L;
            }
            this.IAuthTabCallback = 4;
            this.access100 = 2;
            return z;
        }
        z = true;
        if (!this.asInterface) {
            this.asInterface = true;
            this.onTransact = this.IAuthTabCallbackStub.onWarmupCompleted() != -9223372036854775807L ? -this.IAuthTabCallback_Parcel : 0L;
        }
        this.IAuthTabCallback = 4;
        this.access100 = 2;
        return z;
    }

    private TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (this.IAuthTabCallbackStubProxy > this.getInterfaceDescriptor.IAuthTabCallback()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.getInterfaceDescriptor;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(new byte[Math.max(textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback() << 1, this.IAuthTabCallbackStubProxy)], 0);
        } else {
            this.getInterfaceDescriptor.asBinder(0);
        }
        this.getInterfaceDescriptor.onNavigationEvent(this.IAuthTabCallbackStubProxy);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.getInterfaceDescriptor.onExtraCallback(), 0, this.IAuthTabCallbackStubProxy);
        return this.getInterfaceDescriptor;
    }

    @RequiresNonNull
    private void onNavigationEvent() {
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
        this.IAuthTabCallbackDefault = true;
    }

    private long asInterface() {
        if (this.asInterface) {
            return this.onTransact + this.IAuthTabCallback_Parcel;
        }
        if (this.IAuthTabCallbackStub.onWarmupCompleted() == -9223372036854775807L) {
            return 0L;
        }
        return this.IAuthTabCallback_Parcel;
    }
}
