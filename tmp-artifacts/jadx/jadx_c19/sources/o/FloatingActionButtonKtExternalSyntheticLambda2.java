package o;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.FloatingActionButtonKtExternalSyntheticLambda2;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FloatingActionButtonKtExternalSyntheticLambda2 implements DrawerStateExternalSyntheticLambda0 {
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackDefault;
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 ICustomTabsCallback;
    private long access000;
    private final int access100;
    private int asBinder;
    private long asInterface;
    private int extraCallback;
    private boolean extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onActivityLayout;
    private long onActivityResized;
    private long onMessageChannelReady;
    private int onTransact;
    private final byte[] readTypedObject;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 writeTypedObject;
    public static final DrawerStateExternalSyntheticLambda2 onNavigationEvent = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.amr.AmrExtractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return FloatingActionButtonKtExternalSyntheticLambda2.onNavigationEvent();
        }
    };
    private static final int[] onExtraCallbackWithResult = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] IAuthTabCallback = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] onExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent("#!AMR\n");
    private static final byte[] onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent("#!AMR-WB\n");

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new FloatingActionButtonKtExternalSyntheticLambda2()};
    }

    public FloatingActionButtonKtExternalSyntheticLambda2() {
        this(0);
    }

    public FloatingActionButtonKtExternalSyntheticLambda2(int i2) {
        this.access100 = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.readTypedObject = new byte[1];
        this.getInterfaceDescriptor = -1;
        DrawerKtExternalSyntheticLambda6 drawerKtExternalSyntheticLambda6 = new DrawerKtExternalSyntheticLambda6();
        this.onActivityLayout = drawerKtExternalSyntheticLambda6;
        this.IAuthTabCallbackDefault = drawerKtExternalSyntheticLambda6;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return IAuthTabCallback(drawerKtExternalSyntheticLambda9);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallbackStub = drawerStateExternalSyntheticLambda1;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 1);
        this.writeTypedObject = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.IAuthTabCallbackDefault = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        onExtraCallback();
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() == 0 && !IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
            throw ParserException.onNavigationEvent("Could not find AMR header.", (Throwable) null);
        }
        asBinder();
        int iOnNavigationEvent = onNavigationEvent(drawerKtExternalSyntheticLambda9);
        onExtraCallback(drawerKtExternalSyntheticLambda9.onExtraCallback(), iOnNavigationEvent);
        if (iOnNavigationEvent == -1) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda4 instanceof ExposedDropdownMenu_androidExternalSyntheticLambda1) {
                ((ExposedDropdownMenu_androidExternalSyntheticLambda1) exposedDropdownMenu_androidKtExternalSyntheticLambda4).onNavigationEvent(this.onActivityResized + this.asInterface);
                this.IAuthTabCallbackStub.IAuthTabCallback(this.ICustomTabsCallback);
            }
        }
        return iOnNavigationEvent;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.asInterface = 0L;
        this.asBinder = 0;
        this.onTransact = 0;
        this.onMessageChannelReady = j2;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda4 instanceof ExposedDropdownMenu_androidExternalSyntheticLambda1) {
            long jOnWarmupCompleted = ((ExposedDropdownMenu_androidExternalSyntheticLambda1) exposedDropdownMenu_androidKtExternalSyntheticLambda4).onWarmupCompleted(j);
            this.onActivityResized = jOnWarmupCompleted;
            if (onExtraCallback(jOnWarmupCompleted, this.onMessageChannelReady)) {
                return;
            }
            this.IAuthTabCallbackStubProxy = true;
            this.IAuthTabCallbackDefault = this.onActivityLayout;
            return;
        }
        if (j != 0 && (exposedDropdownMenu_androidKtExternalSyntheticLambda4 instanceof DrawerKtExternalSyntheticLambda8)) {
            this.onActivityResized = ((DrawerKtExternalSyntheticLambda8) exposedDropdownMenu_androidKtExternalSyntheticLambda4).onWarmupCompleted(j);
        } else {
            this.onActivityResized = 0L;
        }
    }

    private boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArr = onExtraCallback;
        if (onNavigationEvent(drawerKtExternalSyntheticLambda9, bArr)) {
            this.extraCallbackWithResult = false;
            drawerKtExternalSyntheticLambda9.onExtraCallback(bArr.length);
            return true;
        }
        byte[] bArr2 = onWarmupCompleted;
        if (!onNavigationEvent(drawerKtExternalSyntheticLambda9, bArr2)) {
            return false;
        }
        this.extraCallbackWithResult = true;
        drawerKtExternalSyntheticLambda9.onExtraCallback(bArr2.length);
        return true;
    }

    private static boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        byte[] bArr2 = new byte[bArr.length];
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @RequiresNonNull
    private void asBinder() {
        if (this.IAuthTabCallback_Parcel) {
            return;
        }
        this.IAuthTabCallback_Parcel = true;
        boolean z = this.extraCallbackWithResult;
        String str = z ? "audio/amr-wb" : "audio/amr";
        this.writeTypedObject.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent(str).IAuthTabCallbackDefault(z ? "audio/amr-wb" : "audio/3gpp").IAuthTabCallbackStubProxy(z ? IAuthTabCallback[8] : onExtraCallbackWithResult[7]).onExtraCallback(1).extraCallbackWithResult(z ? 16000 : 8000).onNavigationEvent());
    }

    @RequiresNonNull
    private int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        if (this.onTransact == 0) {
            try {
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
                this.asBinder = iOnExtraCallbackWithResult;
                this.onTransact = iOnExtraCallbackWithResult;
                if (this.getInterfaceDescriptor == -1) {
                    this.access000 = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                    this.getInterfaceDescriptor = this.asBinder;
                }
                if (this.getInterfaceDescriptor == this.asBinder) {
                    this.extraCallback++;
                }
                ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
                if (exposedDropdownMenu_androidKtExternalSyntheticLambda4 instanceof ExposedDropdownMenu_androidExternalSyntheticLambda1) {
                    ExposedDropdownMenu_androidExternalSyntheticLambda1 exposedDropdownMenu_androidExternalSyntheticLambda1 = (ExposedDropdownMenu_androidExternalSyntheticLambda1) exposedDropdownMenu_androidKtExternalSyntheticLambda4;
                    long j = this.onActivityResized + this.asInterface + 20000;
                    long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
                    long j2 = this.asBinder;
                    if (!exposedDropdownMenu_androidExternalSyntheticLambda1.onExtraCallbackWithResult(j, 100000L)) {
                        exposedDropdownMenu_androidExternalSyntheticLambda1.IAuthTabCallback(j, jIAuthTabCallback + j2);
                    }
                    if (this.IAuthTabCallbackStubProxy && onExtraCallback(j, this.onMessageChannelReady)) {
                        this.IAuthTabCallbackStubProxy = false;
                        this.IAuthTabCallbackDefault = this.writeTypedObject;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iOnExtraCallback = this.IAuthTabCallbackDefault.onExtraCallback(drawerKtExternalSyntheticLambda9, this.onTransact, true);
        if (iOnExtraCallback == -1) {
            return -1;
        }
        int i2 = this.onTransact - iOnExtraCallback;
        this.onTransact = i2;
        if (i2 > 0) {
            return 0;
        }
        this.IAuthTabCallbackDefault.onExtraCallback(this.onActivityResized + this.asInterface, 1, this.asBinder, 0, null);
        this.asInterface += 20000;
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.readTypedObject, 0, 1);
        byte b = this.readTypedObject[0];
        if ((b & 131) > 0) {
            throw ParserException.onNavigationEvent("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        return onExtraCallbackWithResult((b >> 3) & 15);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private int onExtraCallbackWithResult(int i2) throws ParserException {
        if (onNavigationEvent(i2)) {
            return this.extraCallbackWithResult ? IAuthTabCallback[i2] : onExtraCallbackWithResult[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.extraCallbackWithResult ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw ParserException.onNavigationEvent(sb.toString(), (Throwable) null);
    }

    private boolean onNavigationEvent(int i2) {
        if (i2 < 0 || i2 > 15) {
            return false;
        }
        return onExtraCallback(i2) || onWarmupCompleted(i2);
    }

    private boolean onExtraCallback(int i2) {
        if (this.extraCallbackWithResult) {
            return i2 < 10 || i2 > 13;
        }
        return false;
    }

    private boolean onWarmupCompleted(int i2) {
        if (this.extraCallbackWithResult) {
            return false;
        }
        return i2 < 12 || i2 > 14;
    }

    @RequiresNonNull
    private void onExtraCallback(long j, int i2) {
        int i3;
        if (this.ICustomTabsCallback == null) {
            int i4 = this.access100;
            if ((i4 & 4) != 0) {
                this.ICustomTabsCallback = new ExposedDropdownMenu_androidExternalSyntheticLambda1(new long[]{this.access000}, new long[]{0}, -9223372036854775807L);
            } else if ((i4 & 1) == 0 || ((i3 = this.getInterfaceDescriptor) != -1 && i3 != this.asBinder)) {
                this.ICustomTabsCallback = new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L);
            } else if (this.extraCallback >= 20 || i2 == -1) {
                ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4IAuthTabCallback = IAuthTabCallback(j, (i4 & 2) != 0);
                this.ICustomTabsCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda4IAuthTabCallback;
                exposedDropdownMenu_androidKtExternalSyntheticLambda4IAuthTabCallback.onExtraCallback();
            }
            ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4 = this.ICustomTabsCallback;
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda4 != null) {
                this.IAuthTabCallbackStub.IAuthTabCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda4);
            }
        }
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 IAuthTabCallback(long j, boolean z) {
        return new DrawerKtExternalSyntheticLambda8(j, this.access000, onExtraCallbackWithResult(this.getInterfaceDescriptor, 20000L), this.getInterfaceDescriptor, z);
    }

    @EnsuresNonNull
    private void onExtraCallback() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.writeTypedObject);
        Object[] objArr = {this.IAuthTabCallbackStub};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    private boolean onExtraCallback(long j, long j2) {
        return Math.abs(j2 - j) < 20000;
    }

    private static int onExtraCallbackWithResult(int i2, long j) {
        return (int) ((i2 * 8000000) / j);
    }
}
