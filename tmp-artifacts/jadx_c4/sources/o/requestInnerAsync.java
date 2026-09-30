package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
import im.toss.facepay.validation.model.init.config.OperationConfig;
import im.toss.facepay.validation.model.init.config.QualityModelConfig;
import im.toss.facepay.validation.model.init.config.ServiceConfig;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestInnerAsync {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int[] onNavigationEvent = {-1877730702, -533589811, -474671387, -750229301, 863514634, 1580589886, -964883287, -44287356, 834650595, 246252390, 2114620302, 1096159675, -1180530203, 382083209, 1710085452, -2065014428, 1945716362, -211032885};
    private final ServiceConfig IAuthTabCallback;
    private final InterpreterConfig onExtraCallback;
    private final OperationConfig onExtraCallbackWithResult;
    private final QualityModelConfig onWarmupCompleted;

    public requestInnerAsync() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestInnerAsync)) {
            return false;
        }
        requestInnerAsync requestinnerasync = (requestInnerAsync) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, requestinnerasync.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, requestinnerasync.onExtraCallback)) {
            int i2 = IAuthTabCallbackStub + 77;
            asBinder = i2 % 128;
            return i2 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, requestinnerasync.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, requestinnerasync.onExtraCallbackWithResult);
        }
        int i3 = asBinder + 11;
        IAuthTabCallbackStub = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = asBinder + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        ServiceConfig serviceConfig = this.IAuthTabCallback;
        InterpreterConfig interpreterConfig = this.onExtraCallback;
        QualityModelConfig qualityModelConfig = this.onWarmupCompleted;
        OperationConfig operationConfig = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{771656772, 910473142, -836422424, -448492768, -1333195503, 687210795, -644517551, 1626736228, -608052534, -993557317, -1037348845, -328997248, -1250472529, 1243263056, 320763965, -1494599564}, 31 - ExpandableListView.getPackedPositionType(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(serviceConfig);
        Object[] objArr2 = new Object[1];
        a(new int[]{1523386826, -1148633698, -295938834, 1427383457, -547698605, 1251175505, -229289935, 895019268, 932614161, -1494701976}, View.resolveSize(0, 0) + 20, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(interpreterConfig);
        Object[] objArr3 = new Object[1];
        a(new int[]{750178432, 477651613, 1536167639, -796005025, 1905376932, -81652689, 1448451682, 917809000, -644517551, 1626736228, 1187126388, 1782605203}, 21 - Color.red(0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(qualityModelConfig);
        Object[] objArr4 = new Object[1];
        a(new int[]{-1136497627, 664054978, 887843414, -272357077, 1404628118, 16250857, 1554231523, -1463135283, -166512422, 810000607}, KeyEvent.normalizeMetaState(0) + 18, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(operationConfig);
        Object[] objArr5 = new Object[1];
        a(new int[]{865408608, 1886129825}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public requestInnerAsync(@NotNull ServiceConfig serviceConfig, @NotNull InterpreterConfig interpreterConfig, @NotNull QualityModelConfig qualityModelConfig, @NotNull OperationConfig operationConfig) {
        Intrinsics.checkNotNullParameter(serviceConfig, "");
        Intrinsics.checkNotNullParameter(interpreterConfig, "");
        Intrinsics.checkNotNullParameter(qualityModelConfig, "");
        Intrinsics.checkNotNullParameter(operationConfig, "");
        this.IAuthTabCallback = serviceConfig;
        this.onExtraCallback = interpreterConfig;
        this.onWarmupCompleted = qualityModelConfig;
        this.onExtraCallbackWithResult = operationConfig;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ requestInnerAsync(im.toss.facepay.validation.model.init.config.ServiceConfig r22, im.toss.facepay.validation.model.init.config.InterpreterConfig r23, im.toss.facepay.validation.model.init.config.QualityModelConfig r24, im.toss.facepay.validation.model.init.config.OperationConfig r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r21 = this;
            r0 = r26 & 1
            if (r0 == 0) goto L20
            im.toss.facepay.validation.model.init.config.ServiceConfig r0 = new im.toss.facepay.validation.model.init.config.ServiceConfig
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r20)
            goto L22
        L20:
            r0 = r22
        L22:
            r1 = r26 & 2
            r2 = 2
            if (r1 == 0) goto L3a
            im.toss.facepay.validation.model.init.config.InterpreterConfig r1 = new im.toss.facepay.validation.model.init.config.InterpreterConfig
            r3 = 3
            r4 = 0
            r1.<init>(r4, r4, r3, r4)
            int r3 = o.requestInnerAsync.IAuthTabCallbackStub
            int r3 = r3 + 1
            int r4 = r3 % 128
            o.requestInnerAsync.asBinder = r4
            int r3 = r3 % r2
            int r3 = r2 % r2
            goto L3c
        L3a:
            r1 = r23
        L3c:
            r3 = r26 & 4
            if (r3 == 0) goto L52
            im.toss.facepay.validation.model.init.config.QualityModelConfig r3 = new im.toss.facepay.validation.model.init.config.QualityModelConfig
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L54
        L52:
            r3 = r24
        L54:
            r4 = r26 & 8
            if (r4 == 0) goto L6d
            im.toss.facepay.validation.model.init.config.OperationConfig r4 = new im.toss.facepay.validation.model.init.config.OperationConfig
            r4.<init>()
            int r5 = o.requestInnerAsync.IAuthTabCallbackStub
            int r5 = r5 + 101
            int r6 = r5 % 128
            o.requestInnerAsync.asBinder = r6
            int r5 = r5 % r2
            if (r5 == 0) goto L69
            goto L6a
        L69:
            int r2 = r2 % r2
        L6a:
            r2 = r21
            goto L71
        L6d:
            r2 = r21
            r4 = r25
        L71:
            r2.<init>(r0, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestInnerAsync.<init>(im.toss.facepay.validation.model.init.config.ServiceConfig, im.toss.facepay.validation.model.init.config.InterpreterConfig, im.toss.facepay.validation.model.init.config.QualityModelConfig, im.toss.facepay.validation.model.init.config.OperationConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ServiceConfig onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ServiceConfig serviceConfig = this.IAuthTabCallback;
        int i5 = i3 + 15;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serviceConfig;
    }

    public final InterpreterConfig IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        InterpreterConfig interpreterConfig = this.onExtraCallback;
        int i4 = i3 + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return interpreterConfig;
    }

    public final QualityModelConfig onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        QualityModelConfig qualityModelConfig = this.onWarmupCompleted;
        int i5 = i2 + 89;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return qualityModelConfig;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> i5), 73 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 72 - View.getDefaultSize(0, 0), Color.blue(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i2 = 2;
                i5 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $11 + 111;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i6] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 72, 8849 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i11++;
                i4 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i13 = $11 + 87;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 39, TextUtils.indexOf("", "") + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i15++;
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 79 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 7397 - TextUtils.lastIndexOf("", '0'), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
