package im.toss.devtool.domain.usecase;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.findResAndMsg;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RunDevToolActionUseCase$invoke$4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static short[] IAuthTabCallback;
    final /* synthetic */ Object $action;
    int label;
    final /* synthetic */ RunDevToolActionUseCase this$0;
    private static final byte[] $$a = {32, 13, -54, -47};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = -907229521;
    private static int onExtraCallbackWithResult = -1538795411;
    private static int onNavigationEvent = 1174059163;
    private static byte[] onWarmupCompleted = {119, -123, 117, -113, -122, -115, -125, -100, -61, 72, 116, -101, 114, -41, -119, 66, -118, -116, -119, -104, -123, -62, -121, 75, 115, -125, -103, -127, -125, -62, -119, 66, -120, -120, -126, -98, 115, -37, -121, 49, -117, -44, 52, Byte.MIN_VALUE, -101, -114, 8};

    private static String $$c(byte b, int i, byte b2) {
        byte[] bArr = $$a;
        int i2 = b * 3;
        int i3 = 115 - (b2 * 4);
        int i4 = i + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i4++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i4];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunDevToolActionUseCase$invoke$4(RunDevToolActionUseCase runDevToolActionUseCase, Object obj, access13800<? super RunDevToolActionUseCase$invoke$4> access13800Var) {
        super(2, access13800Var);
        this.this$0 = runDevToolActionUseCase;
        this.$action = obj;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RunDevToolActionUseCase$invoke$4 runDevToolActionUseCase$invoke$4 = new RunDevToolActionUseCase$invoke$4(this.this$0, this.$action, access13800Var);
        int i2 = asBinder + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return runDevToolActionUseCase$invoke$4;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallbackDefault = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return onExtraCallback(findresandmsg, access13800Var);
        }
        onExtraCallback(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = IAuthTabCallbackDefault + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        if (this.label != 0) {
            Object[] objArr = new Object[1];
            a((short) (121 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (-1839931047) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 507682768 - View.MeasureSpec.getMode(0), (-54) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            throw new IllegalStateException(((String) objArr[0]).intern());
        }
        ResultKt.onNavigationEvent(obj);
        List mutableList = CollectionsKt.toMutableList(RunDevToolActionUseCase.onNavigationEvent(this.this$0).onWarmupCompleted());
        if (mutableList.contains(this.$action)) {
            mutableList.remove(this.$action);
            RunDevToolActionUseCase.onNavigationEvent(this.this$0).onExtraCallback$252026d8(this.$action);
        }
        Object obj2 = this.$action;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1236230942);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33478), TextUtils.lastIndexOf("", '0', 0) + 22, TextUtils.indexOf("", "", 0) + 10882, -2028969358, false, "onExtraCallbackWithResult", new Class[0]);
            }
            Object objInvoke = ((Method) objOnExtraCallback).invoke(obj2, null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2076318973);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 10777 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1250091629, false, "getId", new Class[0]);
            }
            Object objInvoke2 = ((Method) objOnExtraCallback2).invoke(objInvoke, null);
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(517933642);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, 10777 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 799012058, false, "DEV_TOOL_ACTION", (Class[]) null);
            }
            Object obj3 = ((Field) objOnExtraCallback3).get(null);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2076318973);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 15 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10776, -1250091629, false, "getId", new Class[0]);
            }
            if (!Intrinsics.areEqual(objInvoke2, ((Method) objOnExtraCallback4).invoke(obj3, null))) {
                int i2 = asBinder + 29;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                mutableList.add(this.$action);
                RunDevToolActionUseCase.onNavigationEvent(this.this$0).onExtraCallbackWithResult$252026d8(this.$action);
            }
            if (mutableList.size() > 3) {
                int i4 = IAuthTabCallbackDefault + 99;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                RunDevToolActionUseCase.onNavigationEvent(this.this$0).onExtraCallback$252026d8(mutableList.remove(0));
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x022f A[PHI: r0
      0x022f: PHI (r0v9 int) = (r0v8 int), (r0v42 int) binds: [B:47:0x022d, B:44:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0239 A[PHI: r0
      0x0239: PHI (r0v39 int) = (r0v8 int), (r0v42 int) binds: [B:47:0x022d, B:44:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getTapTimeout() >> 16)), 42 - (ViewConfiguration.getEdgeSlop() >> 16), 22439 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10;
                int i10 = i9 + 77;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 17;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int i14 = $10 + 81;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i16 = 0;
                    while (i16 < length) {
                        int i17 = $11 + 17;
                        $10 = i17 % 128;
                        int i18 = i17 % i7;
                        Object[] objArr3 = {Integer.valueOf(bArr[i16])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12842), (ViewConfiguration.getEdgeSlop() >> 16) + 55, 2167 - KeyEvent.keyCodeFromString(""), -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i16] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i16++;
                        i7 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i19 = $10 + 41;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 42, View.getDefaultSize(0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) % ((int) (onExtraCallbackWithResult * (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 43424), KeyEvent.keyCodeFromString("") + 42, KeyEvent.normalizeMetaState(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i6 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i6;
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i20 = $10 + 51;
                int i21 = i20 % 128;
                $11 = i21;
                if (i20 % 2 == 0) {
                    i4 = ((i << iIntValue) / 2) * ((int) (onExtraCallback / (-4629411779493505016L)));
                    if (z) {
                        int i22 = i21 + 105;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 134 - AndroidCharacter.getMirror('0'), 9567 - (Process.myPid() >> 22), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onWarmupCompleted;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i24 = 0; i24 < length2; i24++) {
                        bArr6[i24] = (byte) (bArr5[i24] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i25 = $10 + 45;
                    $11 = i25 % 128;
                    int i26 = i25 % 2;
                    if (z2) {
                        byte[] bArr7 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
