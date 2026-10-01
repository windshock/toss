package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.adjust;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidSelectionHandles_androidKtExternalSyntheticLambda0 implements adjust {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int[] access100 = {-31638437, -1840617519, -537426895, -960591443, 198323530, -1190795705, -537110564, -1447392314, -1193806243, -1207453845, 1145544933, -1725648999, -393894275, 2061556986, -1533412361, -2116781458, -245983084, -755380186};
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda2 IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final int IAuthTabCallback_Parcel;
    private final long asBinder;
    private final boolean asInterface;
    private long getInterfaceDescriptor;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final HashMap<SelectionManagerExternalSyntheticLambda12, IAuthTabCallback> onTransact;
    private final long onWarmupCompleted;

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int length;
        int[] iArr2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = access100;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), 72 - ExpandableListView.getPackedPositionType(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = access100;
        if (iArr6 != null) {
            int i8 = $10 + 97;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 63;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i9]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(i6), (ViewConfiguration.getScrollBarSize() >> 8) + 72, (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i9 /= 0;
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i9])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, KeyEvent.normalizeMetaState(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i6 = 0;
            }
            i3 = i6;
            iArr6 = iArr2;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr6, i3, iArr5, i3, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i3] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.indexOf((CharSequence) "", '0', 0)), 39 - KeyEvent.keyCodeFromString(""), (Process.myPid() >> 22) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - View.MeasureSpec.makeMeasureSpec(0, 0)), Gravity.getAbsoluteGravity(0, 0) + 78, View.getDefaultSize(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public AndroidSelectionHandles_androidKtExternalSyntheticLambda0() {
        this(new ComposableSingletonsScaffoldKtExternalSyntheticLambda2(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    protected AndroidSelectionHandles_androidKtExternalSyntheticLambda0(ComposableSingletonsScaffoldKtExternalSyntheticLambda2 composableSingletonsScaffoldKtExternalSyntheticLambda2, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) throws Throwable {
        Object[] objArr = new Object[1];
        a(new int[]{1646952026, 809544206}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        onExtraCallback(i4, 0, "bufferForPlaybackMs", ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new int[]{1646952026, 809544206}, -((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        onExtraCallback(i5, 0, "bufferForPlaybackAfterRebufferMs", ((String) objArr2[0]).intern());
        onExtraCallback(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        onExtraCallback(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        onExtraCallback(i3, i2, "maxBufferMs", "minBufferMs");
        Object[] objArr3 = new Object[1];
        a(new int[]{1646952026, 809544206}, TextUtils.getOffsetAfter("", 0) + 1, objArr3);
        onExtraCallback(i7, 0, "backBufferDurationMs", ((String) objArr3[0]).intern());
        this.IAuthTabCallback = composableSingletonsScaffoldKtExternalSyntheticLambda2;
        this.IAuthTabCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i2);
        this.asBinder = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i3);
        this.onExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i4);
        this.onExtraCallbackWithResult = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i5);
        this.IAuthTabCallback_Parcel = i6;
        this.IAuthTabCallbackDefault = z;
        this.onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(i7);
        this.asInterface = z2;
        this.onTransact = new HashMap<>();
        this.getInterfaceDescriptor = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // o.adjust
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        boolean z;
        int i2 = 2 % 2;
        long id = Thread.currentThread().getId();
        long j = this.getInterfaceDescriptor;
        if (j != -1) {
            int i3 = access000 + 9;
            int i4 = i3 % 128;
            IAuthTabCallbackStubProxy = i4;
            int i5 = i3 % 2;
            if (j != id) {
                int i6 = i4 + 11;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            } else {
                int i8 = access000 + 5;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            }
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.getInterfaceDescriptor = id;
        if (!this.onTransact.containsKey(selectionManagerExternalSyntheticLambda12)) {
            this.onTransact.put(selectionManagerExternalSyntheticLambda12, new IAuthTabCallback());
        }
        IAuthTabCallbackDefault(selectionManagerExternalSyntheticLambda12);
    }

    @Override // o.adjust
    public void IAuthTabCallback(adjust.IAuthTabCallback iAuthTabCallback, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 101;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact.get(iAuthTabCallback.asInterface));
        int iOnWarmupCompleted = this.IAuthTabCallback_Parcel;
        if (iOnWarmupCompleted == -1) {
            iOnWarmupCompleted = onWarmupCompleted(colorsKtExternalSyntheticLambda0Arr);
        }
        iAuthTabCallback2.onExtraCallbackWithResult = iOnWarmupCompleted;
        IAuthTabCallbackDefault();
        int i5 = access000 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
    }

    @Override // o.adjust
    public void onExtraCallbackWithResult(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = access000 + 31;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStub(selectionManagerExternalSyntheticLambda12);
        int i5 = access000 + 103;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
    }

    @Override // o.adjust
    public void onNavigationEvent(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 57;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallbackStub(selectionManagerExternalSyntheticLambda12);
            int i4 = 15 / 0;
            if (!this.onTransact.isEmpty()) {
                return;
            }
        } else {
            IAuthTabCallbackStub(selectionManagerExternalSyntheticLambda12);
            if (!this.onTransact.isEmpty()) {
                return;
            }
        }
        int i5 = access000 + 101;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        this.getInterfaceDescriptor = -1L;
        if (i6 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.adjust
    public ComposableSingletonsScaffoldKtExternalSyntheticLambda3 IAuthTabCallback() {
        ComposableSingletonsScaffoldKtExternalSyntheticLambda2 composableSingletonsScaffoldKtExternalSyntheticLambda2;
        int i2 = 2 % 2;
        int i3 = access000;
        int i4 = i3 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            composableSingletonsScaffoldKtExternalSyntheticLambda2 = this.IAuthTabCallback;
            int i5 = 88 / 0;
        } else {
            composableSingletonsScaffoldKtExternalSyntheticLambda2 = this.IAuthTabCallback;
        }
        int i6 = i3 + 65;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            return composableSingletonsScaffoldKtExternalSyntheticLambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.adjust
    public long onWarmupCompleted(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = access000 + 101;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.adjust
    public boolean onExtraCallback(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy;
        int i4 = i3 + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.asInterface;
        int i6 = i3 + 49;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    @Override // o.adjust
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult(adjust.IAuthTabCallback iAuthTabCallback) {
        int i2 = 2 % 2;
        IAuthTabCallback iAuthTabCallback2 = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact.get(iAuthTabCallback.asInterface));
        boolean z = true;
        boolean z2 = this.IAuthTabCallback.onWarmupCompleted() >= onNavigationEvent();
        long jMin = this.IAuthTabCallbackStub;
        float f = iAuthTabCallback.IAuthTabCallbackStub;
        if (f > 1.0f) {
            jMin = Math.min(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jMin, f), this.asBinder);
        }
        long jMax = Math.max(jMin, 500000L);
        long j = iAuthTabCallback.IAuthTabCallback;
        if (j < jMax) {
            if (!this.IAuthTabCallbackDefault) {
                int i3 = IAuthTabCallbackStubProxy + 61;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                if (z2) {
                    z = false;
                }
            }
            iAuthTabCallback2.onExtraCallback = z;
            if (!z && j < 500000) {
                int i5 = IAuthTabCallbackStubProxy + 55;
                access000 = i5 % 128;
                if (i5 % 2 == 0) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    int i6 = 69 / 0;
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            }
        } else if (j < this.asBinder) {
            int i7 = IAuthTabCallbackStubProxy + 31;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            if (z2) {
                iAuthTabCallback2.onExtraCallback = false;
            }
        }
        return iAuthTabCallback2.onExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    @Override // o.adjust
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallback(adjust.IAuthTabCallback iAuthTabCallback) {
        long jMin;
        int i2 = 2 % 2;
        long jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.IAuthTabCallbackStub);
        if (!iAuthTabCallback.IAuthTabCallbackDefault) {
            jMin = this.onExtraCallback;
        } else {
            int i3 = IAuthTabCallbackStubProxy + 65;
            access000 = i3 % 128;
            if (i3 % 2 != 0) {
                jMin = this.onExtraCallbackWithResult;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        long j = iAuthTabCallback.asBinder;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        if (jMin > 0) {
            int i4 = IAuthTabCallbackStubProxy + 5;
            int i5 = i4 % 128;
            access000 = i5;
            int i6 = i4 % 2;
            if (jOnNavigationEvent < jMin) {
                int i7 = i5 + 73;
                IAuthTabCallbackStubProxy = i7 % 128;
                if (i7 % 2 == 0) {
                    if (!this.IAuthTabCallbackDefault) {
                    }
                    return false;
                }
                int i8 = 62 / 0;
                if (!this.IAuthTabCallbackDefault) {
                    if (this.IAuthTabCallback.onWarmupCompleted() < onNavigationEvent()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // o.adjust
    public boolean IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j) {
        int i2 = 2 % 2;
        Iterator<IAuthTabCallback> it = this.onTransact.values().iterator();
        while (it.hasNext()) {
            if (!(!it.next().onExtraCallback)) {
                int i3 = IAuthTabCallbackStubProxy + 33;
                access000 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
        }
        int i5 = IAuthTabCallbackStubProxy + 43;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    protected int onWarmupCompleted(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        int i2 = 2 % 2;
        int i3 = access000 + 31;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        int length = colorsKtExternalSyntheticLambda0Arr.length;
        int iOnExtraCallbackWithResult = 0;
        while (i5 < length) {
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i5];
            if (colorsKtExternalSyntheticLambda0 != null) {
                int i6 = IAuthTabCallbackStubProxy + 13;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                iOnExtraCallbackWithResult += onExtraCallbackWithResult(colorsKtExternalSyntheticLambda0.onExtraCallback().onExtraCallback);
            }
            i5++;
            int i8 = IAuthTabCallbackStubProxy + 35;
            access000 = i8 % 128;
            int i9 = i8 % 2;
        }
        return Math.max(13107200, iOnExtraCallbackWithResult);
    }

    int onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 73;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Iterator<IAuthTabCallback> it = this.onTransact.values().iterator();
        int i5 = IAuthTabCallbackStubProxy + 31;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (it.hasNext()) {
            int i8 = IAuthTabCallbackStubProxy + 41;
            access000 = i8 % 128;
            i7 = i8 % 2 == 0 ? i7 / it.next().onExtraCallbackWithResult : i7 + it.next().onExtraCallbackWithResult;
        }
        return i7;
    }

    private void IAuthTabCallbackDefault(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 125;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onTransact.get(selectionManagerExternalSyntheticLambda12));
            int i4 = this.IAuthTabCallback_Parcel;
            if (i4 == -1) {
                int i5 = IAuthTabCallbackStubProxy + 77;
                int i6 = i5 % 128;
                access000 = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 49;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                i4 = 13107200;
            }
            iAuthTabCallback.onExtraCallbackWithResult = i4;
            iAuthTabCallback.onExtraCallback = false;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IAuthTabCallbackStub(SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 73;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if (this.onTransact.remove(selectionManagerExternalSyntheticLambda12) != null) {
            IAuthTabCallbackDefault();
        }
        int i5 = access000 + 97;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3.IAuthTabCallback.IAuthTabCallback(onNavigationEvent());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r3.onTransact.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3.onTransact.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = o.AndroidSelectionHandles_androidKtExternalSyntheticLambda0.IAuthTabCallbackStubProxy + 13;
        o.AndroidSelectionHandles_androidKtExternalSyntheticLambda0.access000 = r1 % 128;
        r1 = r1 % 2;
        r3.IAuthTabCallback.onNavigationEvent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = access000 + 57;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
    }

    private static int onExtraCallbackWithResult(int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 71;
        int i5 = i4 % 128;
        IAuthTabCallbackStubProxy = i5;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        switch (i2) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                int i6 = i5 + 37;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static void onExtraCallback(int i2, int i3, String str, String str2) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStubProxy + 89;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        RecordingInputConnection_androidKt.onExtraCallback(i2 >= i3, str + " cannot be less than " + str2);
        int i7 = IAuthTabCallbackStubProxy + 99;
        access000 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    static class IAuthTabCallback {
        public boolean onExtraCallback;
        public int onExtraCallbackWithResult;

        private IAuthTabCallback() {
        }
    }
}
