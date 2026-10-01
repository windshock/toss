package o;

import androidx.annotation.Nullable;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.ModalBottomSheetKtExternalSyntheticLambda2;
import o.OutlinedTextFieldKtExternalSyntheticLambda12;
import o.OutlinedTextFieldKtExternalSyntheticLambda13;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OutlinedTextFieldKtExternalSyntheticLambda13 implements DrawerStateExternalSyntheticLambda0 {
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallbackStubProxy;
    private final ElevationOverlayKtExternalSyntheticLambda1 IAuthTabCallback_Parcel;
    private long ICustomTabsCallback;
    private HandwritingHandlerNodeExternalSyntheticLambda0 access000;
    private boolean access100;
    private long asBinder;
    private long asInterface;
    private int extraCallback;
    private long extraCallbackWithResult;
    private final ExposedDropdownMenuBoxScopeExternalSyntheticLambda1 getInterfaceDescriptor;
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onActivityLayout;
    private boolean onExtraCallback;
    private long onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onNavigationEvent;
    private final ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback onPostMessage;
    private final int onTransact;
    private OutlinedTextFieldKtExternalSyntheticLambda12 readTypedObject;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 writeTypedObject;
    public static final DrawerStateExternalSyntheticLambda2 onWarmupCompleted = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda0
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return OutlinedTextFieldKtExternalSyntheticLambda13.onNavigationEvent();
        }
    };
    private static final ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback IAuthTabCallback = new ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda1
        @Override // o.ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback
        public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
            return OutlinedTextFieldKtExternalSyntheticLambda13.onNavigationEvent(i2, i3, i4, i5, i6);
        }
    };

    public static /* synthetic */ boolean onNavigationEvent(int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) {
            return true;
        }
        if (i3 == 77 && i4 == 76 && i5 == 76) {
            return i6 == 84 || i2 == 2;
        }
        return false;
    }

    private static boolean onNavigationEvent(int i2, long j) {
        return ((long) (i2 & (-128000))) == (j & (-128000));
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new OutlinedTextFieldKtExternalSyntheticLambda13()};
    }

    public OutlinedTextFieldKtExternalSyntheticLambda13() {
        this(0);
    }

    public OutlinedTextFieldKtExternalSyntheticLambda13(int i2) {
        this(i2, -9223372036854775807L);
    }

    public OutlinedTextFieldKtExternalSyntheticLambda13(int i2, long j) {
        this.onTransact = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.IAuthTabCallbackStub = j;
        this.writeTypedObject = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);
        this.onPostMessage = new ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback();
        this.IAuthTabCallback_Parcel = new ElevationOverlayKtExternalSyntheticLambda1();
        this.onExtraCallbackWithResult = -9223372036854775807L;
        this.getInterfaceDescriptor = new ExposedDropdownMenuBoxScopeExternalSyntheticLambda1();
        DrawerKtExternalSyntheticLambda6 drawerKtExternalSyntheticLambda6 = new DrawerKtExternalSyntheticLambda6();
        this.onActivityLayout = drawerKtExternalSyntheticLambda6;
        this.onNavigationEvent = drawerKtExternalSyntheticLambda6;
        this.asBinder = -1L;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return onNavigationEvent(drawerKtExternalSyntheticLambda9, true);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.IAuthTabCallbackDefault = drawerStateExternalSyntheticLambda1;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 1);
        this.IAuthTabCallbackStubProxy = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.onNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        this.IAuthTabCallbackDefault.onExtraCallbackWithResult();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.onMessageChannelReady = 0;
        this.onExtraCallbackWithResult = -9223372036854775807L;
        this.ICustomTabsCallback = 0L;
        this.extraCallback = 0;
        this.extraCallbackWithResult = j2;
        OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12 = this.readTypedObject;
        if (!(outlinedTextFieldKtExternalSyntheticLambda12 instanceof OutlinedTextFieldKtExternalSyntheticLambda10) || ((OutlinedTextFieldKtExternalSyntheticLambda10) outlinedTextFieldKtExternalSyntheticLambda12).onNavigationEvent(j2)) {
            return;
        }
        this.access100 = true;
        this.onNavigationEvent = this.onActivityLayout;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        asBinder();
        int iOnNavigationEvent = onNavigationEvent(drawerKtExternalSyntheticLambda9);
        if (iOnNavigationEvent == -1 && (this.readTypedObject instanceof OutlinedTextFieldKtExternalSyntheticLambda10)) {
            long jIAuthTabCallback = IAuthTabCallback(this.ICustomTabsCallback);
            if (this.readTypedObject.onExtraCallback() != jIAuthTabCallback) {
                ((OutlinedTextFieldKtExternalSyntheticLambda10) this.readTypedObject).onWarmupCompleted(jIAuthTabCallback);
                this.IAuthTabCallbackDefault.IAuthTabCallback(this.readTypedObject);
                this.readTypedObject.onExtraCallback();
            }
        }
        return iOnNavigationEvent;
    }

    public void onExtraCallback() {
        this.onExtraCallback = true;
    }

    @RequiresNonNull
    private int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (this.onMessageChannelReady == 0) {
            try {
                onNavigationEvent(drawerKtExternalSyntheticLambda9, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.readTypedObject == null) {
            OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12OnWarmupCompleted = onWarmupCompleted(drawerKtExternalSyntheticLambda9);
            this.readTypedObject = outlinedTextFieldKtExternalSyntheticLambda12OnWarmupCompleted;
            this.IAuthTabCallbackDefault.IAuthTabCallback(outlinedTextFieldKtExternalSyntheticLambda12OnWarmupCompleted);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onExtraCallbackWithResult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("audio/mpeg").IAuthTabCallbackDefault(this.onPostMessage.onWarmupCompleted).IAuthTabCallbackStubProxy(4096).onExtraCallback(this.onPostMessage.IAuthTabCallback).extraCallbackWithResult(this.onPostMessage.onNavigationEvent).onTransact(this.IAuthTabCallback_Parcel.IAuthTabCallback).asBinder(this.IAuthTabCallback_Parcel.onWarmupCompleted).onExtraCallbackWithResult((this.onTransact & 8) != 0 ? null : this.access000);
            if (this.readTypedObject.IAuthTabCallback() != -2147483647) {
                onExtraCallbackWithResult.onNavigationEvent(this.readTypedObject.IAuthTabCallback());
            }
            this.onNavigationEvent.onExtraCallbackWithResult(onExtraCallbackWithResult.onNavigationEvent());
            this.asInterface = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        } else if (this.asInterface != 0) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long j = this.asInterface;
            if (jIAuthTabCallback < j) {
                drawerKtExternalSyntheticLambda9.onExtraCallback((int) (j - jIAuthTabCallback));
            }
        }
        return IAuthTabCallbackStub(drawerKtExternalSyntheticLambda9);
    }

    @RequiresNonNull
    private int IAuthTabCallbackStub(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        if (this.extraCallback == 0) {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
            if (IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
                return -1;
            }
            this.writeTypedObject.asBinder(0);
            int iAsBinder = this.writeTypedObject.asBinder();
            if (!onNavigationEvent(iAsBinder, this.onMessageChannelReady) || ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onWarmupCompleted(iAsBinder) == -1) {
                drawerKtExternalSyntheticLambda9.onExtraCallback(1);
                this.onMessageChannelReady = 0;
                return 0;
            }
            this.onPostMessage.onWarmupCompleted(iAsBinder);
            if (this.onExtraCallbackWithResult == -9223372036854775807L) {
                this.onExtraCallbackWithResult = this.readTypedObject.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9.IAuthTabCallback());
                if (this.IAuthTabCallbackStub != -9223372036854775807L) {
                    this.onExtraCallbackWithResult += this.IAuthTabCallbackStub - this.readTypedObject.onExtraCallbackWithResult(0L);
                }
            }
            this.extraCallback = this.onPostMessage.onExtraCallback;
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = this.onPostMessage;
            this.asBinder = jIAuthTabCallback + iAuthTabCallback.onExtraCallback;
            OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12 = this.readTypedObject;
            if (outlinedTextFieldKtExternalSyntheticLambda12 instanceof OutlinedTextFieldKtExternalSyntheticLambda10) {
                OutlinedTextFieldKtExternalSyntheticLambda10 outlinedTextFieldKtExternalSyntheticLambda10 = (OutlinedTextFieldKtExternalSyntheticLambda10) outlinedTextFieldKtExternalSyntheticLambda12;
                outlinedTextFieldKtExternalSyntheticLambda10.onExtraCallback(IAuthTabCallback(this.ICustomTabsCallback + iAuthTabCallback.IAuthTabCallbackStub), this.asBinder);
                if (this.access100 && outlinedTextFieldKtExternalSyntheticLambda10.onNavigationEvent(this.extraCallbackWithResult)) {
                    this.access100 = false;
                    this.onNavigationEvent = this.IAuthTabCallbackStubProxy;
                }
            }
        }
        int iOnExtraCallback = this.onNavigationEvent.onExtraCallback(drawerKtExternalSyntheticLambda9, this.extraCallback, true);
        if (iOnExtraCallback == -1) {
            return -1;
        }
        int i2 = this.extraCallback - iOnExtraCallback;
        this.extraCallback = i2;
        if (i2 > 0) {
            return 0;
        }
        this.onNavigationEvent.onExtraCallback(IAuthTabCallback(this.ICustomTabsCallback), 1, this.onPostMessage.onExtraCallback, 0, null);
        this.ICustomTabsCallback += this.onPostMessage.IAuthTabCallbackStub;
        this.extraCallback = 0;
        return 0;
    }

    private long IAuthTabCallback(long j) {
        return this.onExtraCallbackWithResult + ((j * 1000000) / this.onPostMessage.onNavigationEvent);
    }

    private boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws IOException {
        int iOnWarmupCompleted;
        int iOnWarmupCompleted2;
        int i2 = z ? 32768 : 131072;
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        if (drawerKtExternalSyntheticLambda9.IAuthTabCallback() == 0) {
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = this.getInterfaceDescriptor.onNavigationEvent(drawerKtExternalSyntheticLambda9, (this.onTransact & 8) == 0 ? null : IAuthTabCallback);
            this.access000 = handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent;
            if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent != null) {
                this.IAuthTabCallback_Parcel.onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent);
            }
            iOnWarmupCompleted = (int) drawerKtExternalSyntheticLambda9.onWarmupCompleted();
            if (!z) {
                drawerKtExternalSyntheticLambda9.onExtraCallback(iOnWarmupCompleted);
            }
        } else {
            iOnWarmupCompleted = 0;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!IAuthTabCallback(drawerKtExternalSyntheticLambda9)) {
                this.writeTypedObject.asBinder(0);
                int iAsBinder = this.writeTypedObject.asBinder();
                if ((i3 == 0 || onNavigationEvent(iAsBinder, i3)) && (iOnWarmupCompleted2 = ExposedDropdownMenuDefaultsExternalSyntheticLambda2.onWarmupCompleted(iAsBinder)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.onPostMessage.onWarmupCompleted(iAsBinder);
                        i3 = iAsBinder;
                    }
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnWarmupCompleted2 - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i2) {
                        if (z) {
                            return false;
                        }
                        IAuthTabCallbackStub();
                        throw new EOFException();
                    }
                    if (z) {
                        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                        drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnWarmupCompleted + i6);
                    } else {
                        drawerKtExternalSyntheticLambda9.onExtraCallback(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i3 = 0;
                }
            } else if (i4 <= 0) {
                IAuthTabCallbackStub();
                throw new EOFException();
            }
        }
        if (z) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(iOnWarmupCompleted + i5);
        } else {
            drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        }
        this.onMessageChannelReady = i3;
        return true;
    }

    private boolean IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12 = this.readTypedObject;
        if (outlinedTextFieldKtExternalSyntheticLambda12 != null) {
            long jOnWarmupCompleted = outlinedTextFieldKtExternalSyntheticLambda12.onWarmupCompleted();
            if (jOnWarmupCompleted != -1 && drawerKtExternalSyntheticLambda9.onWarmupCompleted() > jOnWarmupCompleted - 4) {
                return true;
            }
        }
        try {
            return !drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.writeTypedObject.onExtraCallback(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull
    private OutlinedTextFieldKtExternalSyntheticLambda12 onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        long jOnExtraCallback;
        long jOnExtraCallbackWithResult;
        long j;
        long jOnWarmupCompleted;
        OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
        OutlinedTextFieldKtExternalSyntheticLambda2 outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback(this.access000, drawerKtExternalSyntheticLambda9.IAuthTabCallback());
        if (this.onExtraCallback) {
            return new OutlinedTextFieldKtExternalSyntheticLambda12.onExtraCallback();
        }
        if ((this.onTransact & 4) != 0) {
            if (outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback != null) {
                jOnExtraCallbackWithResult = outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback.onExtraCallback();
                jOnWarmupCompleted = outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback.onWarmupCompleted();
            } else if (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult != null) {
                jOnExtraCallbackWithResult = outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallback();
                jOnWarmupCompleted = outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onWarmupCompleted();
            } else {
                jOnExtraCallbackWithResult = onExtraCallbackWithResult(this.access000);
                j = -1;
                outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = new OutlinedTextFieldKtExternalSyntheticLambda10(jOnExtraCallbackWithResult, drawerKtExternalSyntheticLambda9.IAuthTabCallback(), j);
            }
            j = jOnWarmupCompleted;
            outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = new OutlinedTextFieldKtExternalSyntheticLambda10(jOnExtraCallbackWithResult, drawerKtExternalSyntheticLambda9.IAuthTabCallback(), j);
        } else if (outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback != null) {
            outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = outlinedTextFieldKtExternalSyntheticLambda2OnExtraCallback;
        } else if (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult == null) {
            outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = null;
        }
        if (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult != null && IAuthTabCallback(outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult) && outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallback() != -9223372036854775807L && (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onWarmupCompleted() != -1 || drawerKtExternalSyntheticLambda9.onExtraCallback() != -1)) {
            long jOnExtraCallbackWithResult2 = outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallbackWithResult() != -1 ? outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallbackWithResult() : 0L;
            if (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onWarmupCompleted() != -1) {
                jOnExtraCallback = outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onWarmupCompleted();
            } else {
                jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
            }
            long j2 = jOnExtraCallback;
            outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = new OutlinedTextFieldKtExternalSyntheticLambda11(j2, jOnExtraCallbackWithResult2, Ints.saturatedCast(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2 - jOnExtraCallbackWithResult2, 8000000L, outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallback(), RoundingMode.HALF_UP)), -1, false);
        } else if (outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult == null || IAuthTabCallback(outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult)) {
            outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, (this.onTransact & 2) != 0);
        }
        outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult.onExtraCallback();
        return outlinedTextFieldKtExternalSyntheticLambda12OnExtraCallbackWithResult;
    }

    private boolean IAuthTabCallback(OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12) {
        return (outlinedTextFieldKtExternalSyntheticLambda12.onNavigationEvent() || (this.onTransact & 1) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OutlinedTextFieldKtExternalSyntheticLambda12 onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2;
        int i3;
        int i4;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onPostMessage.onExtraCallback);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, this.onPostMessage.onExtraCallback);
        ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback = this.onPostMessage;
        if ((iAuthTabCallback.onTransact & 1) != 0) {
            i2 = iAuthTabCallback.IAuthTabCallback != 1 ? 36 : 21;
        } else if (iAuthTabCallback.IAuthTabCallback == 1) {
            i2 = 13;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i2);
        if (iOnExtraCallbackWithResult != 1231971951) {
            if (iOnExtraCallbackWithResult == 1447187017) {
                OutlinedTextFieldKtExternalSyntheticLambda3 outlinedTextFieldKtExternalSyntheticLambda3OnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda3.onWarmupCompleted(drawerKtExternalSyntheticLambda9.onExtraCallback(), drawerKtExternalSyntheticLambda9.IAuthTabCallback(), this.onPostMessage, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                drawerKtExternalSyntheticLambda9.onExtraCallback(this.onPostMessage.onExtraCallback);
                return outlinedTextFieldKtExternalSyntheticLambda3OnWarmupCompleted;
            }
            if (iOnExtraCallbackWithResult != 1483304551) {
                drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
                return null;
            }
        }
        OutlinedTextFieldKtExternalSyntheticLambda4 outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback = OutlinedTextFieldKtExternalSyntheticLambda4.onExtraCallback(this.onPostMessage, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (!this.IAuthTabCallback_Parcel.onExtraCallback() && (i3 = outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback.onExtraCallback) != -1 && (i4 = outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback.onNavigationEvent) != -1) {
            ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1 = this.IAuthTabCallback_Parcel;
            elevationOverlayKtExternalSyntheticLambda1.IAuthTabCallback = i3;
            elevationOverlayKtExternalSyntheticLambda1.onWarmupCompleted = i4;
        }
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        if (drawerKtExternalSyntheticLambda9.onExtraCallback() != -1 && outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult != -1 && drawerKtExternalSyntheticLambda9.onExtraCallback() != outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult + jIAuthTabCallback) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("Mp3Extractor", "Data size mismatch between stream (" + drawerKtExternalSyntheticLambda9.onExtraCallback() + ") and Xing frame (" + (outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback.onExtraCallbackWithResult + jIAuthTabCallback) + "), using Xing value.");
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback(this.onPostMessage.onExtraCallback);
        if (iOnExtraCallbackWithResult == 1483304551) {
            return OutlinedTextFieldKtExternalSyntheticLambda8.onWarmupCompleted(outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback, jIAuthTabCallback);
        }
        return IAuthTabCallback(jIAuthTabCallback, outlinedTextFieldKtExternalSyntheticLambda4OnExtraCallback, drawerKtExternalSyntheticLambda9.onExtraCallback());
    }

    private OutlinedTextFieldKtExternalSyntheticLambda12 onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z) throws IOException {
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.writeTypedObject.onExtraCallback(), 0, 4);
        this.writeTypedObject.asBinder(0);
        this.onPostMessage.onWarmupCompleted(this.writeTypedObject.asBinder());
        return new OutlinedTextFieldKtExternalSyntheticLambda11(drawerKtExternalSyntheticLambda9.onExtraCallback(), drawerKtExternalSyntheticLambda9.IAuthTabCallback(), this.onPostMessage, z);
    }

    private OutlinedTextFieldKtExternalSyntheticLambda12 IAuthTabCallback(long j, OutlinedTextFieldKtExternalSyntheticLambda4 outlinedTextFieldKtExternalSyntheticLambda4, long j2) {
        long j3;
        long j4;
        long jOnExtraCallback = outlinedTextFieldKtExternalSyntheticLambda4.onExtraCallback();
        if (jOnExtraCallback == -9223372036854775807L) {
            return null;
        }
        long j5 = outlinedTextFieldKtExternalSyntheticLambda4.onExtraCallbackWithResult;
        if (j5 != -1) {
            j4 = j5 - outlinedTextFieldKtExternalSyntheticLambda4.onWarmupCompleted.onExtraCallback;
            j3 = j + j5;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = j2;
            j4 = (j2 - j) - outlinedTextFieldKtExternalSyntheticLambda4.onWarmupCompleted.onExtraCallback;
        }
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new OutlinedTextFieldKtExternalSyntheticLambda11(j3, j + outlinedTextFieldKtExternalSyntheticLambda4.onWarmupCompleted.onExtraCallback, Ints.checkedCast(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j4, 8000000L, jOnExtraCallback, roundingMode)), Ints.checkedCast(LongMath.divide(j4, outlinedTextFieldKtExternalSyntheticLambda4.IAuthTabCallback, roundingMode)), false);
    }

    private void IAuthTabCallbackStub() {
        OutlinedTextFieldKtExternalSyntheticLambda12 outlinedTextFieldKtExternalSyntheticLambda12 = this.readTypedObject;
        if ((outlinedTextFieldKtExternalSyntheticLambda12 instanceof OutlinedTextFieldKtExternalSyntheticLambda11) && outlinedTextFieldKtExternalSyntheticLambda12.onNavigationEvent()) {
            long j = this.asBinder;
            if (j == -1 || j == this.readTypedObject.onWarmupCompleted()) {
                return;
            }
            this.readTypedObject = ((OutlinedTextFieldKtExternalSyntheticLambda11) this.readTypedObject).IAuthTabCallback(this.asBinder);
            ((DrawerStateExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackDefault)).IAuthTabCallback(this.readTypedObject);
            this.readTypedObject.onExtraCallback();
        }
    }

    @EnsuresNonNull
    private void asBinder() {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.IAuthTabCallbackStubProxy);
        Object[] objArr = {this.IAuthTabCallbackDefault};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742);
    }

    private static int onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() >= i2 + 4) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder == 1483304551 || iAsBinder == 1231971951) {
                return iAsBinder;
            }
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() < 40) {
            return 0;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(36);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1447187017 ? 1447187017 : 0;
    }

    private static OutlinedTextFieldKtExternalSyntheticLambda2 onExtraCallback(@Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0, long j) {
        if (handwritingHandlerNodeExternalSyntheticLambda0 == null) {
            return null;
        }
        int iOnExtraCallback = handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback();
        for (int i2 = 0; i2 < iOnExtraCallback; i2++) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2 = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
            if (IAuthTabCallback2 instanceof ModalBottomSheetKtExternalSyntheticLambda8) {
                return OutlinedTextFieldKtExternalSyntheticLambda2.onExtraCallbackWithResult(j, (ModalBottomSheetKtExternalSyntheticLambda8) IAuthTabCallback2, onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0));
            }
        }
        return null;
    }

    private static long onExtraCallbackWithResult(@Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        if (handwritingHandlerNodeExternalSyntheticLambda0 == null) {
            return -9223372036854775807L;
        }
        int iOnExtraCallback = handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback();
        for (int i2 = 0; i2 < iOnExtraCallback; i2++) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2 = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
            if (IAuthTabCallback2 instanceof ModalBottomSheetKtExternalSyntheticLambda9) {
                ModalBottomSheetKtExternalSyntheticLambda9 modalBottomSheetKtExternalSyntheticLambda9 = (ModalBottomSheetKtExternalSyntheticLambda9) IAuthTabCallback2;
                if (modalBottomSheetKtExternalSyntheticLambda9.asBinder.equals("TLEN")) {
                    return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(Long.parseLong((String) modalBottomSheetKtExternalSyntheticLambda9.onNavigationEvent.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
