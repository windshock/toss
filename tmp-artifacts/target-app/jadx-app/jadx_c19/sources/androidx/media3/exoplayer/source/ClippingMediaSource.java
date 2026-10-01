package androidx.media3.exoplayer.source;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import o.BackdropScaffoldKtExternalSyntheticLambda25;
import o.BackdropScaffoldStateExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BottomDrawerStateCompanionExternalSyntheticLambda1;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomSheetScaffoldKtExternalSyntheticLambda15;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda3;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.RecordingInputConnection_androidKt;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda6;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ClippingMediaSource extends BottomSheetScaffoldKtExternalSyntheticLambda15 {
    private final boolean IAuthTabCallback;
    private long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final boolean access000;
    private final ArrayList<BackdropScaffoldKtExternalSyntheticLambda25> asBinder;
    private final boolean asInterface;
    private onWarmupCompleted onExtraCallback;
    private final boolean onNavigationEvent;
    private long onTransact;
    private IllegalClippingException onWarmupCompleted;

    public static final class IAuthTabCallback {
        private boolean IAuthTabCallback;
        private long IAuthTabCallbackDefault;
        private boolean asInterface;
        private boolean onExtraCallback;
        private boolean onNavigationEvent;
        private final BottomDrawerStateExternalSyntheticLambda2 onTransact;
        private boolean onWarmupCompleted = true;
        private long onExtraCallbackWithResult = Long.MIN_VALUE;

        public IAuthTabCallback(BottomDrawerStateExternalSyntheticLambda2 bottomDrawerStateExternalSyntheticLambda2) {
            this.onTransact = (BottomDrawerStateExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(bottomDrawerStateExternalSyntheticLambda2);
        }

        public IAuthTabCallback onExtraCallbackWithResult(long j) {
            RecordingInputConnection_androidKt.onNavigationEvent(j >= 0);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.IAuthTabCallbackDefault = j;
            return this;
        }

        public IAuthTabCallback onExtraCallback(long j) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.onExtraCallbackWithResult = j;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(boolean z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.onWarmupCompleted = z;
            return this;
        }

        public IAuthTabCallback onNavigationEvent(boolean z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.IAuthTabCallback = z;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(boolean z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.asInterface = z;
            return this;
        }

        public IAuthTabCallback onExtraCallbackWithResult(boolean z) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onNavigationEvent);
            this.onExtraCallback = z;
            return this;
        }

        public ClippingMediaSource IAuthTabCallback() {
            this.onNavigationEvent = true;
            return new ClippingMediaSource(this);
        }
    }

    public static final class IllegalClippingException extends IOException {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int[] IAuthTabCallback = {1423714075, -91809663, -205232857, 893647780, -487770521, 727339662, 3585646, 982189158, -1245423342, 1251970766, -2137271232, -524861434, 2022060043, 1529001893, -482284534, 493680985, 156116396, -2045864583};
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        public final int reason;

        private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = IAuthTabCallback;
            int i4 = -1469660336;
            long j = 0;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = $10 + 125;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 71, TextUtils.indexOf((CharSequence) "", '0', 0) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = IAuthTabCallback;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(iArr5[i9]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', i5) + 1), (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 73, 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i9] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i9++;
                        i4 = -1469660336;
                        i5 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr5 = iArr6;
            }
            int i10 = i5;
            System.arraycopy(iArr5, i10, iArr4, i10, length2);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                int i11 = $11 + 97;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                for (int i13 = 0; i13 < 16; i13++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 22253), 39 - (ViewConfiguration.getPressedStateDuration() >> 16), 10301 - View.MeasureSpec.getSize(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
                int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 77, 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        public IllegalClippingException(int i2) {
            this(i2, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i2, long j, long j2) {
            super("Illegal clipping: " + onExtraCallbackWithResult(i2, j, j2));
            this.reason = i2;
        }

        private static String onExtraCallbackWithResult(int i2, long j, long j2) throws Throwable {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 5;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            if (i2 == 0) {
                return "invalid period count";
            }
            if (i2 == 1) {
                return "not seekable to start";
            }
            if (i2 == 2) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                return "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
            int i7 = i5 + 83;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr = new Object[1];
            a(new int[]{125189740, 1288513739, -376488126, -1936874711}, 7 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i9 = onExtraCallback + 47;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 62 / 0;
            }
            return strIntern;
        }
    }

    private ClippingMediaSource(IAuthTabCallback iAuthTabCallback) {
        super(iAuthTabCallback.onTransact);
        this.IAuthTabCallback_Parcel = iAuthTabCallback.IAuthTabCallbackDefault;
        this.IAuthTabCallbackStub = iAuthTabCallback.onExtraCallbackWithResult;
        this.asInterface = iAuthTabCallback.onWarmupCompleted;
        this.onNavigationEvent = iAuthTabCallback.IAuthTabCallback;
        this.access000 = iAuthTabCallback.asInterface;
        this.IAuthTabCallback = iAuthTabCallback.onExtraCallback;
        this.asBinder = new ArrayList<>();
        this.IAuthTabCallbackStubProxy = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public boolean IAuthTabCallback(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        return onNavigationEvent().onExtraCallback.equals(textFieldStateKtExternalSyntheticLambda0.onExtraCallback) && ((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult.IAuthTabCallback(textFieldStateKtExternalSyntheticLambda0);
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5
    public void onExtraCallback() throws IOException {
        IllegalClippingException illegalClippingException = this.onWarmupCompleted;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.onExtraCallback();
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public BottomDrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j) {
        BackdropScaffoldKtExternalSyntheticLambda25 backdropScaffoldKtExternalSyntheticLambda25 = new BackdropScaffoldKtExternalSyntheticLambda25(((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, composableSingletonsScaffoldKtExternalSyntheticLambda3, j), this.asInterface, this.onTransact, this.IAuthTabCallbackDefault);
        this.asBinder.add(backdropScaffoldKtExternalSyntheticLambda25);
        return backdropScaffoldKtExternalSyntheticLambda25;
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public void onExtraCallbackWithResult(BottomDrawerStateCompanionExternalSyntheticLambda1 bottomDrawerStateCompanionExternalSyntheticLambda1) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asBinder.remove(bottomDrawerStateCompanionExternalSyntheticLambda1));
        ((BottomSheetScaffoldKtExternalSyntheticLambda15) this).onExtraCallbackWithResult.onExtraCallbackWithResult(((BackdropScaffoldKtExternalSyntheticLambda25) bottomDrawerStateCompanionExternalSyntheticLambda1).onWarmupCompleted);
        if (!this.asBinder.isEmpty() || this.onNavigationEvent) {
            return;
        }
        onExtraCallback(((onWarmupCompleted) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onExtraCallbackWithResult);
    }

    @Override // o.BackdropScaffoldKtExternalSyntheticLambda5, o.BackdropScaffoldKtExternalSyntheticLambda26
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        this.onWarmupCompleted = null;
        this.onExtraCallback = null;
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda15
    public void onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        if (this.onWarmupCompleted != null) {
            return;
        }
        onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
    }

    private void onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
        long j;
        long j2;
        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(0, this.IAuthTabCallbackStubProxy);
        long jAsBinder = this.IAuthTabCallbackStubProxy.asBinder();
        if (this.onExtraCallback == null || this.asBinder.isEmpty() || this.onNavigationEvent) {
            long j3 = this.IAuthTabCallback_Parcel;
            long j4 = this.IAuthTabCallbackStub;
            if (this.access000) {
                long jOnExtraCallbackWithResult = this.IAuthTabCallbackStubProxy.onExtraCallbackWithResult();
                j3 += jOnExtraCallbackWithResult;
                j4 += jOnExtraCallbackWithResult;
            }
            this.onTransact = jAsBinder + j3;
            this.IAuthTabCallbackDefault = this.IAuthTabCallbackStub != Long.MIN_VALUE ? jAsBinder + j4 : Long.MIN_VALUE;
            int size = this.asBinder.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.asBinder.get(i2).onExtraCallbackWithResult(this.onTransact, this.IAuthTabCallbackDefault);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.onTransact - jAsBinder;
            j2 = this.IAuthTabCallbackStub != Long.MIN_VALUE ? this.IAuthTabCallbackDefault - jAsBinder : Long.MIN_VALUE;
            j = j5;
        }
        try {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, j, j2, this.IAuthTabCallback);
            this.onExtraCallback = onwarmupcompleted;
            onNavigationEvent((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) onwarmupcompleted);
        } catch (IllegalClippingException e) {
            this.onWarmupCompleted = e;
            for (int i3 = 0; i3 < this.asBinder.size(); i3++) {
                this.asBinder.get(i3).onExtraCallbackWithResult(this.onWarmupCompleted);
            }
        }
    }

    static final class onWarmupCompleted extends BackdropScaffoldStateExternalSyntheticLambda2 {
        private final long IAuthTabCallback;
        private final long IAuthTabCallbackDefault;
        private final long onExtraCallback;
        private final boolean onNavigationEvent;

        public onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, long j, long j2, boolean z) throws IllegalClippingException {
            super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(2, j, j2);
            }
            boolean z2 = true;
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted() != 1) {
                throw new IllegalClippingException(0);
            }
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(0, new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback());
            long jMax = Math.max(0L, j);
            if (!z && !IAuthTabCallback.IAuthTabCallbackStub && jMax != 0 && !IAuthTabCallback.IAuthTabCallbackDefault) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? IAuthTabCallback.onExtraCallbackWithResult : Math.max(0L, j2);
            long j3 = IAuthTabCallback.onExtraCallbackWithResult;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.IAuthTabCallbackDefault = jMax;
            this.IAuthTabCallback = jMax2;
            this.onExtraCallback = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (!IAuthTabCallback.asInterface || (jMax2 != -9223372036854775807L && (j3 == -9223372036854775807L || jMax2 != j3))) {
                z2 = false;
            }
            this.onNavigationEvent = z2;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
            this.onExtraCallbackWithResult.onWarmupCompleted(0, iAuthTabCallback, 0L);
            long j2 = iAuthTabCallback.access100;
            long j3 = this.IAuthTabCallbackDefault;
            iAuthTabCallback.access100 = j2 + j3;
            iAuthTabCallback.onExtraCallbackWithResult = this.onExtraCallback;
            iAuthTabCallback.asInterface = this.onNavigationEvent;
            long j4 = iAuthTabCallback.onExtraCallback;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                iAuthTabCallback.onExtraCallback = jMax;
                long j5 = this.IAuthTabCallback;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                iAuthTabCallback.onExtraCallback = jMax - this.IAuthTabCallbackDefault;
            }
            long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallbackDefault);
            long j6 = iAuthTabCallback.getInterfaceDescriptor;
            if (j6 != -9223372036854775807L) {
                iAuthTabCallback.getInterfaceDescriptor = j6 + jOnExtraCallback;
            }
            long j7 = iAuthTabCallback.writeTypedObject;
            if (j7 != -9223372036854775807L) {
                iAuthTabCallback.writeTypedObject = j7 + jOnExtraCallback;
            }
            return iAuthTabCallback;
        }

        @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
            this.onExtraCallbackWithResult.IAuthTabCallback(0, onextracallback, z);
            long jOnWarmupCompleted = onextracallback.onWarmupCompleted() - this.IAuthTabCallbackDefault;
            long j = this.onExtraCallback;
            return onextracallback.onWarmupCompleted(onextracallback.onExtraCallback, onextracallback.asBinder, 0, j != -9223372036854775807L ? j - jOnWarmupCompleted : -9223372036854775807L, jOnWarmupCompleted);
        }
    }
}
