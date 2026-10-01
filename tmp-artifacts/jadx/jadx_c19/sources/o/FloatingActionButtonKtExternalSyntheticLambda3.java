package o;

import androidx.media3.common.ParserException;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.ArrayList;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FloatingActionButtonKtExternalSyntheticLambda3 implements DrawerStateExternalSyntheticLambda0 {
    private FloatingActionButtonKtExternalSyntheticLambda5 IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private final boolean IAuthTabCallback_Parcel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 access000;
    private int access100;
    private DrawerStateExternalSyntheticLambda1 asBinder;
    private int asInterface;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback extraCallback;
    private boolean getInterfaceDescriptor;
    private IconButtonKtExternalSyntheticLambda0[] onExtraCallback;
    private long onExtraCallbackWithResult;
    private final onWarmupCompleted onNavigationEvent;
    private int onTransact;
    private IconButtonKtExternalSyntheticLambda0 onWarmupCompleted;

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    @Deprecated
    public FloatingActionButtonKtExternalSyntheticLambda3() {
        this(1, RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback);
    }

    public FloatingActionButtonKtExternalSyntheticLambda3(int i2, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this.extraCallback = onextracallback;
        this.IAuthTabCallback_Parcel = (i2 & 1) == 0;
        this.access000 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(12);
        this.onNavigationEvent = new onWarmupCompleted();
        this.asBinder = new ExposedDropdownMenuDefaultsExternalSyntheticLambda1();
        this.onExtraCallback = new IconButtonKtExternalSyntheticLambda0[0];
        this.IAuthTabCallbackDefault = -1L;
        this.IAuthTabCallbackStub = -1L;
        this.asInterface = -1;
        this.onExtraCallbackWithResult = -9223372036854775807L;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.access100 = 0;
        if (this.IAuthTabCallback_Parcel) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.extraCallback);
        }
        this.asBinder = drawerStateExternalSyntheticLambda1;
        this.IAuthTabCallbackStubProxy = -1L;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.access000.onExtraCallback(), 0, 12);
        this.access000.asBinder(0);
        if (this.access000.getInterfaceDescriptor() != 1179011410) {
            return false;
        }
        this.access000.IAuthTabCallbackDefault(4);
        return this.access000.getInterfaceDescriptor() == 541677121;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        if (onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3)) {
            return 1;
        }
        switch (this.access100) {
            case 0:
                if (onExtraCallback(drawerKtExternalSyntheticLambda9)) {
                    drawerKtExternalSyntheticLambda9.onExtraCallback(12);
                    this.access100 = 1;
                    return 0;
                }
                throw ParserException.onNavigationEvent("AVI Header List not found", (Throwable) null);
            case 1:
                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.access000.onExtraCallback(), 0, 12);
                this.access000.asBinder(0);
                this.onNavigationEvent.onNavigationEvent(this.access000);
                onWarmupCompleted onwarmupcompleted = this.onNavigationEvent;
                if (onwarmupcompleted.onNavigationEvent != 1819436136) {
                    throw ParserException.onNavigationEvent("hdrl expected, found: " + this.onNavigationEvent.onNavigationEvent, (Throwable) null);
                }
                this.asInterface = onwarmupcompleted.onWarmupCompleted;
                this.access100 = 2;
                return 0;
            case 2:
                int i2 = this.asInterface - 4;
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(i2);
                drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i2);
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                this.access100 = 3;
                return 0;
            case 3:
                if (this.IAuthTabCallbackDefault != -1) {
                    long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                    long j = this.IAuthTabCallbackDefault;
                    if (jIAuthTabCallback != j) {
                        this.IAuthTabCallbackStubProxy = j;
                        return 0;
                    }
                }
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.access000.onExtraCallback(), 0, 12);
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                this.access000.asBinder(0);
                this.onNavigationEvent.onExtraCallbackWithResult(this.access000);
                int interfaceDescriptor = this.access000.getInterfaceDescriptor();
                int i3 = this.onNavigationEvent.onExtraCallbackWithResult;
                if (i3 == 1179011410) {
                    drawerKtExternalSyntheticLambda9.onExtraCallback(12);
                    return 0;
                }
                if (i3 != 1414744396 || interfaceDescriptor != 1769369453) {
                    this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + this.onNavigationEvent.onWarmupCompleted + 8;
                    return 0;
                }
                long jIAuthTabCallback2 = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                this.IAuthTabCallbackDefault = jIAuthTabCallback2;
                this.IAuthTabCallbackStub = jIAuthTabCallback2 + this.onNavigationEvent.onWarmupCompleted + 8;
                if (!this.getInterfaceDescriptor) {
                    if (((FloatingActionButtonKtExternalSyntheticLambda5) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback)).onWarmupCompleted()) {
                        this.access100 = 4;
                        this.IAuthTabCallbackStubProxy = this.IAuthTabCallbackStub;
                        return 0;
                    }
                    this.asBinder.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.onExtraCallbackWithResult));
                    this.getInterfaceDescriptor = true;
                }
                this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + 12;
                this.access100 = 6;
                return 0;
            case 4:
                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.access000.onExtraCallback(), 0, 8);
                this.access000.asBinder(0);
                int interfaceDescriptor2 = this.access000.getInterfaceDescriptor();
                int interfaceDescriptor3 = this.access000.getInterfaceDescriptor();
                if (interfaceDescriptor2 == 829973609) {
                    this.access100 = 5;
                    this.onTransact = interfaceDescriptor3;
                } else {
                    this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + interfaceDescriptor3;
                }
                return 0;
            case 5:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onTransact);
                drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda202.onExtraCallback(), 0, this.onTransact);
                onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda202);
                this.access100 = 6;
                this.IAuthTabCallbackStubProxy = this.IAuthTabCallbackDefault;
                return 0;
            case 6:
                return IAuthTabCallback(drawerKtExternalSyntheticLambda9);
            default:
                throw new AssertionError();
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.IAuthTabCallbackStubProxy = -1L;
        this.onWarmupCompleted = null;
        for (IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0 : this.onExtraCallback) {
            iconButtonKtExternalSyntheticLambda0.IAuthTabCallback(j);
        }
        if (j == 0) {
            if (this.onExtraCallback.length == 0) {
                this.access100 = 0;
                return;
            } else {
                this.access100 = 3;
                return;
            }
        }
        this.access100 = 6;
    }

    private boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        boolean z;
        if (this.IAuthTabCallbackStubProxy != -1) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long j = this.IAuthTabCallbackStubProxy;
            if (j < jIAuthTabCallback || j > 262144 + jIAuthTabCallback) {
                exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
                z = true;
            } else {
                drawerKtExternalSyntheticLambda9.onExtraCallback((int) (j - jIAuthTabCallback));
                z = false;
            }
        } else {
            z = false;
        }
        this.IAuthTabCallbackStubProxy = -1L;
        return z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException, IOException {
        IconButtonKtExternalSyntheticLambda1 iconButtonKtExternalSyntheticLambda1OnWarmupCompleted = IconButtonKtExternalSyntheticLambda1.onWarmupCompleted(1819436136, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (iconButtonKtExternalSyntheticLambda1OnWarmupCompleted.onExtraCallbackWithResult() != 1819436136) {
            throw ParserException.onNavigationEvent("Unexpected header list type " + iconButtonKtExternalSyntheticLambda1OnWarmupCompleted.onExtraCallbackWithResult(), (Throwable) null);
        }
        FloatingActionButtonKtExternalSyntheticLambda5 floatingActionButtonKtExternalSyntheticLambda5 = (FloatingActionButtonKtExternalSyntheticLambda5) iconButtonKtExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback(FloatingActionButtonKtExternalSyntheticLambda5.class);
        if (floatingActionButtonKtExternalSyntheticLambda5 == null) {
            throw ParserException.onNavigationEvent("AviHeader not found", (Throwable) null);
        }
        this.IAuthTabCallback = floatingActionButtonKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = floatingActionButtonKtExternalSyntheticLambda5.onExtraCallbackWithResult * floatingActionButtonKtExternalSyntheticLambda5.onExtraCallback;
        ArrayList arrayList = new ArrayList();
        UnmodifiableIterator it = iconButtonKtExternalSyntheticLambda1OnWarmupCompleted.onExtraCallback.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            FloatingActionButtonKtExternalSyntheticLambda1 floatingActionButtonKtExternalSyntheticLambda1 = (FloatingActionButtonKtExternalSyntheticLambda1) it.next();
            if (floatingActionButtonKtExternalSyntheticLambda1.onExtraCallbackWithResult() == 1819440243) {
                IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult((IconButtonKtExternalSyntheticLambda1) floatingActionButtonKtExternalSyntheticLambda1, i2);
                if (iconButtonKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                    arrayList.add(iconButtonKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                }
                i2++;
            }
        }
        this.onExtraCallback = (IconButtonKtExternalSyntheticLambda0[]) arrayList.toArray(new IconButtonKtExternalSyntheticLambda0[0]);
        this.asBinder.onExtraCallbackWithResult();
    }

    private void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int i2;
        long jIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        while (true) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 16) {
                break;
            }
            int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            int interfaceDescriptor2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            long interfaceDescriptor3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(interfaceDescriptor);
            if (iconButtonKtExternalSyntheticLambda0IAuthTabCallback != null) {
                iconButtonKtExternalSyntheticLambda0IAuthTabCallback.onNavigationEvent(interfaceDescriptor3 + jIAuthTabCallback, (interfaceDescriptor2 & 16) == 16);
            }
        }
        for (IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0 : this.onExtraCallback) {
            iconButtonKtExternalSyntheticLambda0.onExtraCallbackWithResult();
        }
        this.getInterfaceDescriptor = true;
        if (this.onExtraCallback.length == 0) {
            this.asBinder.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.onExtraCallbackWithResult));
        } else {
            this.asBinder.IAuthTabCallback(new IAuthTabCallback(this.onExtraCallbackWithResult));
        }
    }

    private long IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 16) {
            return 0L;
        }
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        long interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        long j = this.IAuthTabCallbackDefault;
        long j2 = interfaceDescriptor <= j ? j + 8 : 0L;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        return j2;
    }

    private IconButtonKtExternalSyntheticLambda0 IAuthTabCallback(int i2) {
        for (IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0 : this.onExtraCallback) {
            if (iconButtonKtExternalSyntheticLambda0.onExtraCallback(i2)) {
                return iconButtonKtExternalSyntheticLambda0;
            }
        }
        return null;
    }

    private int IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() >= this.IAuthTabCallbackStub) {
            return -1;
        }
        IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0 = this.onWarmupCompleted;
        if (iconButtonKtExternalSyntheticLambda0 != null) {
            if (iconButtonKtExternalSyntheticLambda0.onWarmupCompleted(drawerKtExternalSyntheticLambda9)) {
                this.onWarmupCompleted = null;
            }
        } else {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.access000.onExtraCallback(), 0, 12);
            this.access000.asBinder(0);
            int interfaceDescriptor = this.access000.getInterfaceDescriptor();
            if (interfaceDescriptor == 1414744396) {
                this.access000.asBinder(8);
                drawerKtExternalSyntheticLambda9.onExtraCallback(this.access000.getInterfaceDescriptor() != 1769369453 ? 8 : 12);
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                return 0;
            }
            int interfaceDescriptor2 = this.access000.getInterfaceDescriptor();
            if (interfaceDescriptor == 1263424842) {
                this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + interfaceDescriptor2 + 8;
                return 0;
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback(8);
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            IconButtonKtExternalSyntheticLambda0 iconButtonKtExternalSyntheticLambda0IAuthTabCallback = IAuthTabCallback(interfaceDescriptor);
            if (iconButtonKtExternalSyntheticLambda0IAuthTabCallback == null) {
                this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + interfaceDescriptor2;
                return 0;
            }
            iconButtonKtExternalSyntheticLambda0IAuthTabCallback.onWarmupCompleted(interfaceDescriptor2);
            this.onWarmupCompleted = iconButtonKtExternalSyntheticLambda0IAuthTabCallback;
        }
        return 0;
    }

    private IconButtonKtExternalSyntheticLambda0 onExtraCallbackWithResult(IconButtonKtExternalSyntheticLambda1 iconButtonKtExternalSyntheticLambda1, int i2) {
        FloatingActionButtonKtExternalSyntheticLambda4 floatingActionButtonKtExternalSyntheticLambda4 = (FloatingActionButtonKtExternalSyntheticLambda4) iconButtonKtExternalSyntheticLambda1.onExtraCallback(FloatingActionButtonKtExternalSyntheticLambda4.class);
        IconKtExternalSyntheticLambda1 iconKtExternalSyntheticLambda1 = (IconKtExternalSyntheticLambda1) iconButtonKtExternalSyntheticLambda1.onExtraCallback(IconKtExternalSyntheticLambda1.class);
        if (floatingActionButtonKtExternalSyntheticLambda4 == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (iconKtExternalSyntheticLambda1 == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jOnExtraCallback = floatingActionButtonKtExternalSyntheticLambda4.onExtraCallback();
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = iconKtExternalSyntheticLambda1.onExtraCallback;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback();
        onextracallbackwithresultOnExtraCallback.IAuthTabCallback_Parcel(i2);
        int i3 = floatingActionButtonKtExternalSyntheticLambda4.onTransact;
        if (i3 != 0) {
            onextracallbackwithresultOnExtraCallback.IAuthTabCallbackStubProxy(i3);
        }
        FloatingActionButtonKtExternalSyntheticLambda6 floatingActionButtonKtExternalSyntheticLambda6 = (FloatingActionButtonKtExternalSyntheticLambda6) iconButtonKtExternalSyntheticLambda1.onExtraCallback(FloatingActionButtonKtExternalSyntheticLambda6.class);
        if (floatingActionButtonKtExternalSyntheticLambda6 != null) {
            onextracallbackwithresultOnExtraCallback.IAuthTabCallback(floatingActionButtonKtExternalSyntheticLambda6.onNavigationEvent);
        }
        int iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
        if (iOnExtraCallback != 1 && iOnExtraCallback != 2) {
            return null;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.asBinder.onExtraCallbackWithResult(i2, iOnExtraCallback);
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresultOnExtraCallback.onNavigationEvent());
        this.onExtraCallbackWithResult = Math.max(this.onExtraCallbackWithResult, jOnExtraCallback);
        return new IconButtonKtExternalSyntheticLambda0(i2, floatingActionButtonKtExternalSyntheticLambda4, exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult);
    }

    private static void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if ((drawerKtExternalSyntheticLambda9.IAuthTabCallback() & 1) == 1) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(1);
        }
    }

    class IAuthTabCallback implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
        private final long onNavigationEvent;

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public boolean onNavigationEvent() {
            return true;
        }

        public IAuthTabCallback(long j) {
            this.onNavigationEvent = j;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public long onExtraCallback() {
            return this.onNavigationEvent;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = FloatingActionButtonKtExternalSyntheticLambda3.this.onExtraCallback[0].onExtraCallbackWithResult(j);
            for (int i2 = 1; i2 < FloatingActionButtonKtExternalSyntheticLambda3.this.onExtraCallback.length; i2++) {
                ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onnavigationeventOnExtraCallbackWithResult2 = FloatingActionButtonKtExternalSyntheticLambda3.this.onExtraCallback[i2].onExtraCallbackWithResult(j);
                if (onnavigationeventOnExtraCallbackWithResult2.IAuthTabCallback.onNavigationEvent < onnavigationeventOnExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent) {
                    onnavigationeventOnExtraCallbackWithResult = onnavigationeventOnExtraCallbackWithResult2;
                }
            }
            return onnavigationeventOnExtraCallbackWithResult;
        }
    }

    static class onWarmupCompleted {
        public int onExtraCallbackWithResult;
        public int onNavigationEvent;
        public int onWarmupCompleted;

        private onWarmupCompleted() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        public void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
            onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            if (this.onExtraCallbackWithResult != 1414744396) {
                throw ParserException.onNavigationEvent("LIST expected, found: " + this.onExtraCallbackWithResult, (Throwable) null);
            }
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        }

        public void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            this.onWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            this.onNavigationEvent = 0;
        }
    }
}
