package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.r8lambdarKY_76dijV4LvyApAwXzgCxxoY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static volatile String onExtraCallback;
    private static int[] onExtraCallbackWithResult;
    private static volatile Boolean onNavigationEvent;
    private static int onTransact;
    public static final r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs onWarmupCompleted;

    static {
        onNavigationEvent();
        onWarmupCompleted = new r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs();
        int i = IAuthTabCallback + 13;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i7 | i10 | i3));
        int i12 = (~(i6 | i8)) | i7 | (~(i10 | i3));
        int i13 = i4 + i3 + i2 + (1112421973 * i5) + ((-1897213938) * i);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i4) - 781189120) + ((-1395624931) * i3) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i2) + ((-1446510592) * i5) + (892338176 * i) + ((-1657864192) * i14);
        int i16 = (i4 * 2010092721) + 1217064380 + (i3 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i2 * 2010091741) + (i5 * (-1378896031)) + (i * 856652822) + (i14 * 563281920);
        return i15 + ((i16 * i16) * (-1077346304)) != 1 ? onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs() {
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                int i8 = $11 + 11;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 72, TextUtils.lastIndexOf("", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1469660336;
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
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i10 = $10;
            int i11 = i10 + 117;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = i10 + 75;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr6[i14]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.red(i6) + 72, TextUtils.lastIndexOf("", '0', i6, i6) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i14] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i14++;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i15];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22253), 39 - (Process.myTid() >> 22), 10301 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Process.getGidForName("") + 79, 7398 - (ViewConfiguration.getEdgeSlop() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i20 = $11 + 39;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = onTransact + 117;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback = str;
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback = str;
        }
        int i4 = asInterface + 49;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback = null;
        if (i3 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs = (r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str, access8100.onWarmupCompleted(r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallbackWithResult(), map), (String) null, false, (String) null, 56, (Object) null);
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return null;
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.areEqual(str, r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallback.FEATURE_DISABLED.getValue());
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (Intrinsics.areEqual(str, r8lambdarKY_76dijV4LvyApAwXzgCxxoY.onExtraCallback.FEATURE_DISABLED.getValue())) {
            Object obj = map.get("entryPoint");
            Object obj2 = map.get("stage");
            Objects.toString(obj);
            Objects.toString(obj2);
            int i3 = asInterface + 49;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object[] objArr = new Object[1];
        a(new int[]{314096840, -612198888, 1747214304, 990462491}, (ViewConfiguration.getLongPressTimeout() >> 16) + 6, objArr);
        Object[] objArr2 = {this, "mono_hermes_fallback", access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)), map)};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1053925019, -1053925018, objArr2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str, access8100.onWarmupCompleted(onExtraCallbackWithResult(), map), null, false, null, 87, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str, access8100.onWarmupCompleted(onExtraCallbackWithResult(), map), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
        int i3 = asInterface + 45;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs, String str, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i3 + 59;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            }
            th = null;
        }
        if ((i & 4) != 0) {
            map = access8100.onNavigationEvent();
            int i7 = onTransact + 59;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
        r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallback(str, th, map);
    }

    public final void onExtraCallback(@NotNull String str, @Nullable Throwable th, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str, str, th, access8100.onWarmupCompleted(onExtraCallbackWithResult(), map));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult(str, str, th, access8100.onWarmupCompleted(onExtraCallbackWithResult(), map));
        int i3 = onTransact + 55;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        try {
            Result.Companion companion = Result.Companion;
            Result.constructor-impl(Integer.valueOf(Log.e(str, "failed to record " + str, th)));
            int i2 = onTransact + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    public static /* synthetic */ Map onNavigationEvent(r8lambdaxc7XAFniRCAE5gE7MvkfMDSQbs r8lambdaxc7xafnircae5ge7mvkfmdsqbs, Throwable th, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            i = 200;
        }
        Map<String, Object> mapOnExtraCallbackWithResult = r8lambdaxc7xafnircae5ge7mvkfmdsqbs.onExtraCallbackWithResult(th, i);
        int i5 = asInterface + 51;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return mapOnExtraCallbackWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> onExtraCallbackWithResult(@Nullable Throwable th, int i) {
        String strTake;
        StackTraceElement[] stackTrace;
        List listTake;
        int i2 = 2 % 2;
        String strJoinToString$default = null;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("errorName", th != null ? th.getClass().getName() : null);
        if (th != null) {
            int i3 = onTransact + 107;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                th.getMessage();
                strJoinToString$default.hashCode();
                throw null;
            }
            String message = th.getMessage();
            if (message != null) {
                int i4 = onTransact + 91;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    StringsKt.take(message, i);
                    throw null;
                }
                strTake = StringsKt.take(message, i);
            } else {
                strTake = null;
            }
        }
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("errorMessage", strTake);
        if (th != null && (stackTrace = th.getStackTrace()) != null) {
            int i5 = asInterface + 71;
            onTransact = i5 % 128;
            if (i5 % 2 == 0 ? (listTake = ArraysKt.take(stackTrace, 4)) != null : (listTake = ArraysKt.take(stackTrace, 2)) != null) {
                strJoinToString$default = CollectionsKt.joinToString$default(listTake, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                int i6 = asInterface + 95;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("stackHead", strJoinToString$default)});
    }

    private final Map<String, Object> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("monoEnabled", onExtraCallback()), getWrite.IAuthTabCallback("runtimeInstanceId", onExtraCallback)});
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("monoEnabled", onExtraCallback());
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("runtimeInstanceId", onExtraCallback);
        Pair[] pairArr = new Pair[5];
        pairArr[1] = pairIAuthTabCallback;
        pairArr[0] = pairIAuthTabCallback2;
        return access8100.onWarmupCompleted(pairArr);
    }

    private final Boolean onExtraCallback() {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Boolean boolOnTransact = r8lambdatmbWHEMtRtNT1964wjUkbDe9TEQ.onExtraCallbackWithResult.onTransact();
            if (boolOnTransact != null) {
                onNavigationEvent = boolOnTransact;
            } else {
                boolOnTransact = onNavigationEvent;
            }
            obj = Result.constructor-impl(boolOnTransact);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i2 = asInterface + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        int i4 = onTransact + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1053925019, -1053925018, new Object[]{this, str, map}, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onNavigationEvent(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1653359475, 1653359475, new Object[]{this, str}, iOnNavigationEvent3, iOnNavigationEvent);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new int[]{-2133444762, 1448733600, 638521469, -868501983, 811049381, -1390649378, 781046321, -1603343442, -1747938097, 2144491683, -39962096, -863365868, -425965170, -1714406030, -1947330182, 126215445, -1697159610, -113226946};
    }
}
