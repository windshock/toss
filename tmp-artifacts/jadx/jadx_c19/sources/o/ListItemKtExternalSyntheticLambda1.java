package o;

import androidx.media3.common.ParserException;
import java.io.IOException;
import o.DrawerStateCompanionExternalSyntheticLambda0;
import o.DrawerStateCompanionExternalSyntheticLambda1;
import o.DrawerStateExternalSyntheticLambda0;
import o.ElevationOverlayKtExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.ListItemKtExternalSyntheticLambda1;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ListItemKtExternalSyntheticLambda1 implements DrawerStateExternalSyntheticLambda0 {
    public static final DrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.flac.FlacExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return ListItemKtExternalSyntheticLambda1.onNavigationEvent();
        }
    };
    private long IAuthTabCallback;
    private DrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private final DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback IAuthTabCallback_Parcel;
    private int access000;
    private final byte[] access100;
    private int asBinder;
    private final boolean asInterface;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 getInterfaceDescriptor;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback;
    private int onNavigationEvent;
    private HandwritingHandlerNodeExternalSyntheticLambda0 onTransact;
    private ListItemKtExternalSyntheticLambda2 onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new ListItemKtExternalSyntheticLambda1()};
    }

    public ListItemKtExternalSyntheticLambda1() {
        this(0);
    }

    public ListItemKtExternalSyntheticLambda1(int i2) {
        this.access100 = new byte[42];
        this.onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[32768], 0);
        this.asInterface = (i2 & 1) != 0;
        this.IAuthTabCallback_Parcel = new DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback();
        this.IAuthTabCallbackStubProxy = 0;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        ElevationOverlayKtExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9, false);
        return ElevationOverlayKtExternalSyntheticLambda0.onNavigationEvent(drawerKtExternalSyntheticLambda9);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallbackStub = drawerStateExternalSyntheticLambda1;
        this.getInterfaceDescriptor = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 1);
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        int i2 = this.IAuthTabCallbackStubProxy;
        if (i2 == 0) {
            onWarmupCompleted(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 1) {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 2) {
            IAuthTabCallbackStub(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 3) {
            onNavigationEvent(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 4) {
            IAuthTabCallback(drawerKtExternalSyntheticLambda9);
            return 0;
        }
        if (i2 == 5) {
            return onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        throw new IllegalStateException();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        if (j == 0) {
            this.IAuthTabCallbackStubProxy = 0;
        } else {
            ListItemKtExternalSyntheticLambda2 listItemKtExternalSyntheticLambda2 = this.onWarmupCompleted;
            if (listItemKtExternalSyntheticLambda2 != null) {
                listItemKtExternalSyntheticLambda2.onWarmupCompleted(j2);
            }
        }
        this.IAuthTabCallback = j2 != 0 ? -1L : 0L;
        this.onNavigationEvent = 0;
        this.onExtraCallback.onExtraCallback(0);
    }

    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.onTransact = ElevationOverlayKtExternalSyntheticLambda0.onExtraCallback(drawerKtExternalSyntheticLambda9, !this.asInterface);
        this.IAuthTabCallbackStubProxy = 1;
    }

    private void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArr = this.access100;
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 0, bArr.length);
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        this.IAuthTabCallbackStubProxy = 2;
    }

    private void IAuthTabCallbackStub(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        ElevationOverlayKtExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9);
        this.IAuthTabCallbackStubProxy = 3;
    }

    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        ElevationOverlayKtExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = new ElevationOverlayKtExternalSyntheticLambda0.IAuthTabCallback(this.IAuthTabCallbackDefault);
        boolean zOnExtraCallbackWithResult = false;
        while (!zOnExtraCallbackWithResult) {
            zOnExtraCallbackWithResult = ElevationOverlayKtExternalSyntheticLambda0.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, iAuthTabCallback);
            Object[] objArr = {iAuthTabCallback.IAuthTabCallback};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            this.IAuthTabCallbackDefault = (DrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
        }
        this.access000 = Math.max(this.IAuthTabCallbackDefault.asBinder, 6);
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = this.IAuthTabCallbackDefault.onNavigationEvent(this.access100, this.onTransact);
        Object[] objArr2 = {this.getInterfaceDescriptor};
        int iOnNavigationEvent2 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((ExposedDropdownMenu_androidKtExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent2, objArr2, -1084655742)).onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onExtraCallback().onNavigationEvent("audio/flac").onNavigationEvent());
        Object[] objArr3 = {this.getInterfaceDescriptor};
        int iOnNavigationEvent3 = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        this.IAuthTabCallbackDefault.onWarmupCompleted();
        this.IAuthTabCallbackStubProxy = 4;
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.asBinder = ElevationOverlayKtExternalSyntheticLambda0.IAuthTabCallback(drawerKtExternalSyntheticLambda9);
        Object[] objArr = {this.IAuthTabCallbackStub};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        ((DrawerStateExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).IAuthTabCallback(onWarmupCompleted(drawerKtExternalSyntheticLambda9.IAuthTabCallback(), drawerKtExternalSyntheticLambda9.onExtraCallback()));
        this.IAuthTabCallbackStubProxy = 5;
    }

    private int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        boolean z;
        ListItemKtExternalSyntheticLambda2 listItemKtExternalSyntheticLambda2 = this.onWarmupCompleted;
        if (listItemKtExternalSyntheticLambda2 != null && listItemKtExternalSyntheticLambda2.onWarmupCompleted()) {
            return this.onWarmupCompleted.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        }
        if (this.IAuthTabCallback == -1) {
            this.IAuthTabCallback = DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback(drawerKtExternalSyntheticLambda9, this.IAuthTabCallbackDefault);
            return 0;
        }
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult < 32768) {
            int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(this.onExtraCallback.onExtraCallback(), iOnExtraCallbackWithResult, 32768 - iOnExtraCallbackWithResult);
            z = iOnWarmupCompleted == -1;
            if (!z) {
                this.onExtraCallback.onNavigationEvent(iOnExtraCallbackWithResult + iOnWarmupCompleted);
            } else if (this.onExtraCallback.onNavigationEvent() == 0) {
                onExtraCallback();
                return -1;
            }
        } else {
            z = false;
        }
        int iOnWarmupCompleted2 = this.onExtraCallback.onWarmupCompleted();
        int i2 = this.onNavigationEvent;
        int i3 = this.access000;
        if (i2 < i3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.onExtraCallback;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(Math.min(i3 - i2, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent()));
        }
        long jOnWarmupCompleted = onWarmupCompleted(this.onExtraCallback, z);
        int iOnWarmupCompleted3 = this.onExtraCallback.onWarmupCompleted() - iOnWarmupCompleted2;
        this.onExtraCallback.asBinder(iOnWarmupCompleted2);
        this.getInterfaceDescriptor.onNavigationEvent(this.onExtraCallback, iOnWarmupCompleted3);
        this.onNavigationEvent += iOnWarmupCompleted3;
        if (jOnWarmupCompleted != -1) {
            onExtraCallback();
            this.onNavigationEvent = 0;
            this.IAuthTabCallback = jOnWarmupCompleted;
        }
        int length = this.onExtraCallback.onExtraCallback().length;
        int iOnExtraCallbackWithResult2 = this.onExtraCallback.onExtraCallbackWithResult();
        if (this.onExtraCallback.onNavigationEvent() < 16 && length - iOnExtraCallbackWithResult2 < 16) {
            int iOnNavigationEvent = this.onExtraCallback.onNavigationEvent();
            System.arraycopy(this.onExtraCallback.onExtraCallback(), this.onExtraCallback.onWarmupCompleted(), this.onExtraCallback.onExtraCallback(), 0, iOnNavigationEvent);
            this.onExtraCallback.asBinder(0);
            this.onExtraCallback.onNavigationEvent(iOnNavigationEvent);
        }
        return 0;
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onWarmupCompleted(long j, long j2) {
        DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1 = this.IAuthTabCallbackDefault;
        DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallbackDefault;
        if (onextracallbackwithresult != null && onextracallbackwithresult.onExtraCallback.length > 0) {
            return new DropdownMenuPositionProviderExternalSyntheticLambda0(drawerStateCompanionExternalSyntheticLambda1, j);
        }
        if (j2 != -1 && drawerStateCompanionExternalSyntheticLambda1.access100 > 0) {
            ListItemKtExternalSyntheticLambda2 listItemKtExternalSyntheticLambda2 = new ListItemKtExternalSyntheticLambda2(drawerStateCompanionExternalSyntheticLambda1, this.asBinder, j, j2);
            this.onWarmupCompleted = listItemKtExternalSyntheticLambda2;
            return listItemKtExternalSyntheticLambda2.onExtraCallback();
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(drawerStateCompanionExternalSyntheticLambda1.onWarmupCompleted());
    }

    private long onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z) {
        boolean zIAuthTabCallback;
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        while (iOnWarmupCompleted <= textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - 16) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            if (DrawerStateCompanionExternalSyntheticLambda0.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallbackDefault, this.asBinder, this.IAuthTabCallback_Parcel)) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                return this.IAuthTabCallback_Parcel.onNavigationEvent;
            }
            iOnWarmupCompleted++;
        }
        if (z) {
            while (iOnWarmupCompleted <= textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() - this.access000) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                try {
                    zIAuthTabCallback = DrawerStateCompanionExternalSyntheticLambda0.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.IAuthTabCallbackDefault, this.asBinder, this.IAuthTabCallback_Parcel);
                } catch (IndexOutOfBoundsException unused) {
                    zIAuthTabCallback = false;
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() <= textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() && zIAuthTabCallback) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                    return this.IAuthTabCallback_Parcel.onNavigationEvent;
                }
                iOnWarmupCompleted++;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
            return -1L;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        return -1L;
    }

    private void onExtraCallback() {
        long j = this.IAuthTabCallback;
        Object[] objArr = {this.IAuthTabCallbackDefault};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        Object[] objArr2 = {this.getInterfaceDescriptor};
        ((ExposedDropdownMenu_androidKtExternalSyntheticLambda5) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr2, -1084655742)).onExtraCallback((j * 1000000) / ((DrawerStateCompanionExternalSyntheticLambda1) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).asInterface, 1, this.onNavigationEvent, 0, null);
    }
}
