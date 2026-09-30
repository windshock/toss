package o;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getUpdatedDate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted = {1665042840, 1487484115, -1741569443, 1350622525, -941993946, -115968, -1465646288, 1210450082, -375140426, -10641448, -2125559702, 764780076, 890802224, -855369675, 1093492303, -940390393, 2060954046, -1448786789};

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getUpdatedDate.onExtraCallbackWithResult(null, null, false, null, false, null, null, null, null, this);
            int i4 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(@NotNull DetectFaceInSingleImage.onNavigationEvent onnavigationevent, @Nullable Map<String, ? extends Object> map, boolean z, @Nullable String str, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Boolean bool, @NotNull access13800<? super Map<String, Object>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        Map mapOnExtraCallback;
        String str4;
        String str5;
        String str6;
        Long l2;
        Boolean bool2;
        boolean z3;
        Map map2;
        Map map3;
        boolean z4;
        String strOnTransact;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
            if (!(!(access13800Var instanceof onWarmupCompleted))) {
                int i5 = i2 + 117;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = ((onWarmupCompleted) access13800Var).label;
                    throw null;
                }
                onwarmupcompleted = (onWarmupCompleted) access13800Var;
                int i7 = onwarmupcompleted.label;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    onwarmupcompleted.label = i7 - 2147483648;
                } else {
                    onwarmupcompleted = new onWarmupCompleted(access13800Var);
                }
            }
        } else if (access13800Var instanceof onWarmupCompleted) {
        }
        Object objOnExtraCallbackWithResult = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i8 = onwarmupcompleted.label;
        if (i8 != 0) {
            int i9 = onNavigationEvent + 79;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = onwarmupcompleted.Z$1;
            z4 = onwarmupcompleted.Z$0;
            mapOnExtraCallback = (Map) onwarmupcompleted.L$9;
            Map map4 = (Map) onwarmupcompleted.L$8;
            Map map5 = (Map) onwarmupcompleted.L$7;
            Boolean bool3 = (Boolean) onwarmupcompleted.L$6;
            l2 = (Long) onwarmupcompleted.L$5;
            String str7 = (String) onwarmupcompleted.L$4;
            String str8 = (String) onwarmupcompleted.L$3;
            String str9 = (String) onwarmupcompleted.L$2;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            map2 = map4;
            str4 = str9;
            z3 = z5;
            map3 = map5;
            str5 = str8;
            bool2 = bool3;
            str6 = str7;
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            mapOnExtraCallback = access8100.onExtraCallback();
            DetectFaceInSingleImage typedObject = GetFeatureExtension.onWarmupCompleted.readTypedObject();
            Map<String, ? extends Object> mapOnNavigationEvent = map == null ? access8100.onNavigationEvent() : map;
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(onnavigationevent);
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(map);
            str4 = str;
            onwarmupcompleted.L$2 = str4;
            str5 = str2;
            onwarmupcompleted.L$3 = str5;
            str6 = str3;
            onwarmupcompleted.L$4 = str6;
            l2 = l;
            onwarmupcompleted.L$5 = l2;
            bool2 = bool;
            onwarmupcompleted.L$6 = bool2;
            onwarmupcompleted.L$7 = mapOnExtraCallback;
            onwarmupcompleted.L$8 = mapOnExtraCallback;
            onwarmupcompleted.L$9 = mapOnExtraCallback;
            onwarmupcompleted.Z$0 = z;
            z3 = z2;
            onwarmupcompleted.Z$1 = z3;
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.label = 1;
            objOnExtraCallbackWithResult = typedObject.onExtraCallbackWithResult(mapOnNavigationEvent, onnavigationevent, onwarmupcompleted);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            map2 = mapOnExtraCallback;
            map3 = map2;
            z4 = z;
        }
        mapOnExtraCallback.putAll((Map) objOnExtraCallbackWithResult);
        if (z3) {
            int i11 = onExtraCallback + 19;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            if (!Intrinsics.areEqual(map2.get("_immediate"), access14000.onNavigationEvent(true))) {
                map2.put("_immediate", access14000.onNavigationEvent(true));
            }
        }
        if (str4 != null) {
            int i13 = onNavigationEvent + 9;
            onExtraCallback = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 99 / 0;
                if (!StringsKt.isBlank(str4)) {
                    Object[] objArr = new Object[1];
                    a(new int[]{-391501949, 771383993}, Color.green(0) + 4, objArr);
                    if (Intrinsics.areEqual(str4, ((String) objArr[0]).intern())) {
                        GetSDKVersion.onNavigationEvent(map2, str5, str6, l2);
                        if (!map2.containsKey("device_timezone") && (strOnTransact = GetFeatureExtension.onWarmupCompleted.onTransact()) != null) {
                            int i15 = onExtraCallback + 5;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            map2.put("device_timezone", strOnTransact);
                        }
                    }
                }
            } else if (!StringsKt.isBlank(str4)) {
            }
        }
        if (!InstallReferrerClientImplClientState.IAuthTabCallback.onExtraCallbackWithResult()) {
            map2.put("_background", "Y");
        }
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        if (getFeatureExtension.IAuthTabCallbackStubProxy()) {
            map2.put("_inhouse", "Y");
        }
        String strIAuthTabCallbackStub = getFeatureExtension.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null) {
            int i17 = onExtraCallback + 63;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            map2.put("automation_session_id", strIAuthTabCallbackStub);
        }
        if (bool2 != null) {
            int i19 = onExtraCallback + 73;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            map2.put("is_first_impressed", bool2.booleanValue() ? "Y" : "N");
        }
        if (!(!z4)) {
            int i21 = onExtraCallback + 65;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            map2.put("manufacturer", Build.MANUFACTURER);
            map2.put("model", Build.MODEL);
            map2.put("security_patch", Build.VERSION.SECURITY_PATCH);
            int i23 = Build.VERSION.PREVIEW_SDK_INT;
            if (i23 != 0) {
                int i24 = onExtraCallback + 25;
                onNavigationEvent = i24 % 128;
                int i25 = i24 % 2;
                map2.put("preview_sdk_int", access14000.onNavigationEvent(i23));
            }
            map2.put("vpn", access14000.onNavigationEvent(getFeatureExtension.onRelationshipValidationResult()));
        }
        return access8100.onWarmupCompleted(access8100.onExtraCallbackWithResult(map3));
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onWarmupCompleted;
        char c = '0';
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror(c) - '0'), 72 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i7 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 73, (ViewConfiguration.getEdgeSlop() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                c = '0';
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 27;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr5[i9]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 72 - KeyEvent.getDeadChar(i5, i5), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i9++;
                i4 = -1469660336;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        int i13 = $11 + 77;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 97;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 39 - TextUtils.getOffsetBefore("", 0), 10300 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i15 += 91;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22251), (Process.myPid() >> 22) + 39, View.combineMeasuredStates(0, 0) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i15++;
                }
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4033), 78 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.green(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
