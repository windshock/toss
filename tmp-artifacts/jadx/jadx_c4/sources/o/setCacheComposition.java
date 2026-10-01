package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.Role;
import im.toss.uikit.R;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.setCacheComposition;
import o.setHorizontalGravity;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setCacheComposition {

    public interface onTransact {
        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        GraphicDeviceInfo IAuthTabCallback();

        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        GraphicDeviceInfo onExtraCallback();

        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        GraphicDeviceInfo onExtraCallbackWithResult();

        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        GraphicDeviceInfo onNavigationEvent();

        CameraPresenceProviderExternalSyntheticLambda6<getHumanReadableName> onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        GraphicDeviceInfo onWarmupCompleted();
    }

    public interface IAuthTabCallbackDefault {
        void IAuthTabCallback(@NotNull RowScope rowScope, @NotNull String str, boolean z, boolean z2, boolean z3, @NotNull ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, @NotNull SearchView searchView, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        public static final class onExtraCallback implements IAuthTabCallbackDefault {
            private final Function0<Unit> onExtraCallback;
            private final Map<Boolean, getMergedResolutions> onExtraCallbackWithResult;
            private final Map<Boolean, C0031onExtraCallback> onNavigationEvent;
            private final getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;
            private static final byte[] $$a = {57, 126, 65, 8};
            private static final int $$b = 219;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int asInterface = 0;
            private static int onTransact = 1;
            private static char[] IAuthTabCallback = {37911, 801, 47711, 20849, 51364, 26519, 7852, 46710, 11612, 50289, 29626, 60101, 33262, 14654, 53277, 20349, 59056, 40390, 13560, 44111, 23390, 62048, 27084, 208, 49132, 22282, 52821, 25954, 7368, 35789, 8957, 55822, 28944, 59425, 34707, 16110, 54782, 19726, 58412, 37751, 2754, 41376, 22754, 61460, 28522, 1650, 48541, 21732, 50162, 31514, 4645, 35150, 8409, 57277, 30413, 60958, 15783, 43665, 5103, 63681, 24852, 52775, 46876, 8134, 34028, 28097, 55818, 17269, 10334, 37006, 31149, 59085, 20224, 13430, 40264, 1535, 62190, 23504, 49276, 43360, 5724, 65210, 26597, 52434, 46456, 8829, 35661, 29630, 55456, 16785, 11811, 38750, 31822, 58558, 19868, 15047, 41842, 2064, 61778, 22948, 50906, 44994, 5157, 64799, 27138, 53928, 48020, 8447, 35112, 30291, 57187, 18343, 11416};
            private static long asBinder = -5026969475086976258L;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Type inference failed for: r8v2, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, byte b2, short s) {
                int i;
                int i2;
                ?? r8 = (s * 3) + 97;
                byte[] bArr = $$a;
                int i3 = b2 * 2;
                int i4 = 3 - (b * 4);
                byte[] bArr2 = new byte[1 - i3];
                int i5 = 0 - i3;
                if (bArr == null) {
                    byte b3 = r8;
                    i = 0;
                    int i6 = i4;
                    int i7 = i6;
                    i2 = i4 + b3;
                    i4 = i7;
                    int i8 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                        return new String(bArr2, 0);
                    }
                    i++;
                    b3 = bArr[i8];
                    int i9 = i2;
                    i6 = i8;
                    i4 = i9;
                    int i72 = i6;
                    i2 = i4 + b3;
                    i4 = i72;
                    int i82 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    i2 = r8;
                    int i822 = i4 + 1;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                }
            }

            public onExtraCallback() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Unit IAuthTabCallback(onExtraCallback onextracallback, RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 79;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    onExtraCallback(onextracallback, rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                    throw null;
                }
                Unit unitOnExtraCallback = onExtraCallback(onextracallback, rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                int i5 = asInterface + 35;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }

            public static /* synthetic */ Unit onExtraCallback(onExtraCallback onextracallback) {
                int i = 2 % 2;
                int i2 = onTransact + 105;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(onextracallback);
                }
                onExtraCallbackWithResult(onextracallback);
                throw null;
            }

            private static final Unit onExtraCallback(onExtraCallback onextracallback, RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 113;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                onextracallback.IAuthTabCallback(rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
                Unit unit = Unit.INSTANCE;
                int i6 = asInterface + 71;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            public static /* synthetic */ Unit onExtraCallback(onExtraCallback onextracallback, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onTransact + 121;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(onextracallback, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
                int i5 = asInterface + 87;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01f7  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                long j;
                Object obj;
                Throwable cause;
                int i3 = 2 % 2;
                TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                long[] jArr = new long[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (true) {
                    j = 0;
                    obj = null;
                    if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                        break;
                    }
                    int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59745 - AndroidCharacter.getMirror('0')), (Process.myTid() >> 22) + 17, 10973 - ExpandableListView.getPackedPositionType(0L), 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(asBinder), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.alpha(0)), Drawable.resolveOpacity(0, 0) + 31, 20220 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, 1494 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr = new char[i2];
                timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                    int i5 = $10 + 39;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                        Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", 0)), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 44, 1495 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        obj.hashCode();
                        throw null;
                    }
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49123), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1493 - ImageFormat.getBitsPerPixel(0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    j = 0;
                }
                String str = new String(cArr);
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                objArr[0] = str;
            }

            public onExtraCallback(@Nullable Function0<Unit> function0, @NotNull Map<Boolean, ? extends getMergedResolutions> map, @NotNull Map<Boolean, C0031onExtraCallback> map2) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                this.onExtraCallback = function0;
                this.onExtraCallbackWithResult = map;
                this.onNavigationEvent = map2;
                this.onWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ onExtraCallback(kotlin.jvm.functions.Function0 r17, java.util.Map r18, java.util.Map r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
                /*
                    r16 = this;
                    r0 = r20 & 1
                    r1 = 0
                    r2 = 2
                    if (r0 == 0) goto L13
                    int r0 = o.setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.asInterface
                    int r0 = r0 + 101
                    int r3 = r0 % 128
                    o.setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.onTransact = r3
                    int r0 = r0 % r2
                    int r0 = r2 % r2
                    r0 = r1
                    goto L15
                L13:
                    r0 = r17
                L15:
                    r3 = r20 & 2
                    r4 = 1
                    r5 = 0
                    if (r3 == 0) goto L3d
                    java.lang.Boolean r3 = java.lang.Boolean.FALSE
                    o.needToAddSensorResolutions r6 = new o.needToAddSensorResolutions
                    r6.<init>(r5, r4, r1)
                    kotlin.Pair r3 = o.getWrite.IAuthTabCallback(r3, r6)
                    java.lang.Boolean r6 = java.lang.Boolean.TRUE
                    o.getMergedResolutions$onExtraCallback r7 = o.getMergedResolutions.Companion
                    o.getMergedResolutions r7 = r7.onNavigationEvent()
                    kotlin.Pair r6 = o.getWrite.IAuthTabCallback(r6, r7)
                    kotlin.Pair[] r7 = new kotlin.Pair[r2]
                    r7[r5] = r3
                    r7[r4] = r6
                    java.util.Map r3 = o.access8100.onWarmupCompleted(r7)
                    goto L3f
                L3d:
                    r3 = r18
                L3f:
                    r6 = r20 & 4
                    if (r6 == 0) goto Lcf
                    java.lang.Boolean r6 = java.lang.Boolean.TRUE
                    o.charset r7 = o.charset.onExtraCallbackWithResult
                    o.CipherSuiteCompanion r7 = r7.asBinder()
                    int r7 = r7.IAuthTabCallback()
                    long r7 = o.ByteOrderedDataOutputStream.onExtraCallback(r7)
                    o.setCacheComposition$IAuthTabCallbackDefault$onExtraCallback$onExtraCallback r9 = new o.setCacheComposition$IAuthTabCallbackDefault$onExtraCallback$onExtraCallback
                    int r10 = android.view.KeyEvent.getMaxKeyCode()
                    int r10 = r10 >> 16
                    int r11 = android.view.ViewConfiguration.getEdgeSlop()
                    int r11 = r11 >> 16
                    int r11 = r11 + 56
                    long r12 = android.os.SystemClock.uptimeMillis()
                    r14 = 0
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    int r12 = 31148 - r12
                    char r12 = (char) r12
                    java.lang.Object[] r13 = new java.lang.Object[r4]
                    a(r10, r11, r12, r13)
                    r10 = r13[r5]
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.String r10 = r10.intern()
                    r9.<init>(r10, r7, r1)
                    kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r6, r9)
                    java.lang.Boolean r6 = java.lang.Boolean.FALSE
                    o.setCacheComposition$IAuthTabCallbackDefault$onExtraCallback$onExtraCallback r13 = new o.setCacheComposition$IAuthTabCallbackDefault$onExtraCallback$onExtraCallback
                    int r7 = android.os.Process.myPid()
                    int r7 = r7 >> 22
                    int r7 = r7 + 56
                    java.lang.String r8 = ""
                    int r8 = android.text.TextUtils.indexOf(r8, r8, r5, r5)
                    int r8 = 57 - r8
                    r9 = 53275(0xd01b, float:7.4654E-41)
                    int r10 = android.view.KeyEvent.getDeadChar(r5, r5)
                    int r9 = r9 - r10
                    char r9 = (char) r9
                    java.lang.Object[] r10 = new java.lang.Object[r4]
                    a(r7, r8, r9, r10)
                    r7 = r10[r5]
                    java.lang.String r7 = (java.lang.String) r7
                    java.lang.String r8 = r7.intern()
                    r9 = 0
                    r11 = 2
                    r12 = 0
                    r7 = r13
                    r7.<init>(r8, r9, r11, r12)
                    kotlin.Pair r6 = o.getWrite.IAuthTabCallback(r6, r13)
                    kotlin.Pair[] r7 = new kotlin.Pair[r2]
                    r7[r5] = r1
                    r7[r4] = r6
                    java.util.Map r1 = o.access8100.onWarmupCompleted(r7)
                    int r4 = o.setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.onTransact
                    int r4 = r4 + 109
                    int r5 = r4 % 128
                    o.setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.asInterface = r5
                    int r4 = r4 % r2
                    int r2 = r2 % r2
                    r2 = r16
                    goto Ld3
                Lcf:
                    r2 = r16
                    r1 = r19
                Ld3:
                    r2.<init>(r0, r3, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.<init>(kotlin.jvm.functions.Function0, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final Map<Boolean, getMergedResolutions> onNavigationEvent() {
                Map<Boolean, getMergedResolutions> map;
                int i = 2 % 2;
                int i2 = onTransact + 73;
                int i3 = i2 % 128;
                asInterface = i3;
                if (i2 % 2 != 0) {
                    map = this.onExtraCallbackWithResult;
                    int i4 = 0 / 0;
                } else {
                    map = this.onExtraCallbackWithResult;
                }
                int i5 = i3 + 101;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return map;
            }

            /* renamed from: o.setCacheComposition$IAuthTabCallbackDefault$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
            public static final class C0031onExtraCallback {
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;
                private final long onExtraCallback;
                private final Object onWarmupCompleted;

                public /* synthetic */ C0031onExtraCallback(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
                    this(obj, j);
                }

                public boolean equals(@Nullable Object obj) {
                    int i = 2 % 2;
                    if (this == obj) {
                        int i2 = onNavigationEvent + 45;
                        IAuthTabCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    if (!(obj instanceof C0031onExtraCallback)) {
                        return false;
                    }
                    C0031onExtraCallback c0031onExtraCallback = (C0031onExtraCallback) obj;
                    if (Intrinsics.areEqual(this.onWarmupCompleted, c0031onExtraCallback.onWarmupCompleted)) {
                        return setByteOrder.onExtraCallbackWithResult(this.onExtraCallback, c0031onExtraCallback.onExtraCallback);
                    }
                    int i4 = IAuthTabCallback + 7;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 113;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.onWarmupCompleted.hashCode();
                    return i3 != 0 ? (iHashCode + 98) * setByteOrder.onTransact(this.onExtraCallback) : (iHashCode * 31) + setByteOrder.onTransact(this.onExtraCallback);
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Icon(data=" + this.onWarmupCompleted + ", tintColor=" + setByteOrder.IAuthTabCallbackDefault(this.onExtraCallback) + ")";
                    int i2 = IAuthTabCallback + 3;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 94 / 0;
                    }
                    return str;
                }

                private C0031onExtraCallback(Object obj, long j) {
                    Intrinsics.checkNotNullParameter(obj, "");
                    this.onWarmupCompleted = obj;
                    this.onExtraCallback = j;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                public /* synthetic */ C0031onExtraCallback(Object obj, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((i & 2) != 0) {
                        int i2 = IAuthTabCallback + 115;
                        onNavigationEvent = i2 % 128;
                        int i3 = i2 % 2;
                        j = setByteOrder.Companion.onTransact();
                        int i4 = IAuthTabCallback + 57;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = 2 % 2;
                    }
                    this(obj, j, null);
                }

                public final Object onExtraCallback() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 79;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    Object obj = this.onWarmupCompleted;
                    int i5 = i2 + 95;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 71 / 0;
                    }
                    return obj;
                }

                public final long onWarmupCompleted() {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback;
                    int i3 = i2 + 109;
                    onNavigationEvent = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    long j = this.onExtraCallback;
                    int i4 = i2 + 93;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    return j;
                }
            }

            public final CameraPresenceProviderExternalSyntheticLambda6<Boolean> onExtraCallback() {
                int i = 2 % 2;
                int i2 = onTransact + 107;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onWarmupCompleted;
                if (i3 != 0) {
                    int i4 = 33 / 0;
                }
                return getsupportedhighspeedresolutionsfor;
            }

            private static final Unit onExtraCallbackWithResult(onExtraCallback onextracallback) {
                int i = 2 % 2;
                onextracallback.onWarmupCompleted.IAuthTabCallback(Boolean.valueOf(!((Boolean) onextracallback.onExtraCallback().onExtraCallbackWithResult()).booleanValue()));
                Function0<Unit> function0 = onextracallback.onExtraCallback;
                if (function0 != null) {
                    int i2 = onTransact + 57;
                    asInterface = i2 % 128;
                    if (i2 % 2 != 0) {
                        function0.invoke();
                        int i3 = 74 / 0;
                    } else {
                        function0.invoke();
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i4 = onTransact + 57;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final Unit onWarmupCompleted(final onExtraCallback onextracallback, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2;
                Object objOnExtraCallback;
                long jOnTransact;
                Object obj;
                int i3 = 2 % 2;
                int i4 = asInterface + 5;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(749501346, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.RightItem.Secret.Content.<anonymous>.<anonymous> (TextFields.kt:437)");
                }
                Object obj2 = null;
                if (((Boolean) onextracallback.onExtraCallback().onExtraCallbackWithResult()).booleanValue()) {
                    int i6 = onTransact + 37;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = R.string.uikit_rrn_text_field_secret_on;
                        throw null;
                    }
                    i2 = R.string.uikit_rrn_text_field_secret_on;
                } else {
                    i2 = R.string.uikit_rrn_text_field_secret_off;
                    int i8 = asInterface + 125;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                }
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                C0031onExtraCallback c0031onExtraCallback = onextracallback.onNavigationEvent.get(onextracallback.onExtraCallback().onExtraCallbackWithResult());
                if (c0031onExtraCallback != null) {
                    objOnExtraCallback = c0031onExtraCallback.onExtraCallback();
                    int i10 = onTransact + 29;
                    asInterface = i10 % 128;
                    int i11 = i10 % 2;
                } else {
                    objOnExtraCallback = null;
                }
                Intrinsics.checkNotNull(objOnExtraCallback);
                C0031onExtraCallback c0031onExtraCallback2 = onextracallback.onNavigationEvent.get(onextracallback.onExtraCallback().onExtraCallbackWithResult());
                if (c0031onExtraCallback2 != null) {
                    int i12 = asInterface + 41;
                    onTransact = i12 % 128;
                    if (i12 % 2 == 0) {
                        c0031onExtraCallback2.onWarmupCompleted();
                        throw null;
                    }
                    jOnTransact = c0031onExtraCallback2.onWarmupCompleted();
                } else {
                    jOnTransact = setByteOrder.Companion.onTransact();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallback);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    obj = objOnMinimized2;
                    if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Secret$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i13 = 2 % 2;
                                int i14 = IAuthTabCallback + 67;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                Unit unitOnExtraCallback = setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.onExtraCallback(this.f$0);
                                int i16 = onWarmupCompleted + 83;
                                IAuthTabCallback = i16 % 128;
                                if (i16 % 2 == 0) {
                                    return unitOnExtraCallback;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj = function0;
                    }
                }
                AppLovinNativeAdImplc.onExtraCallback(objOnExtraCallback, jOnTransact, measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null), strOnExtraCallback, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1008);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = asInterface + 97;
                    onTransact = i13 % 128;
                    if (i13 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj2.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
            @Override // o.setCacheComposition.IAuthTabCallbackDefault
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void IAuthTabCallback(@NotNull final RowScope rowScope, @NotNull final String str, final boolean z, final boolean z2, final boolean z3, @NotNull final ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, @NotNull final SearchView searchView, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8 = 2 % 2;
                int i9 = asInterface + 75;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
                Intrinsics.checkNotNullParameter(searchView, "");
                Intrinsics.checkNotNullParameter(function1, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-90146458);
                if ((i & 48) == 0) {
                    int i11 = asInterface + 123;
                    onTransact = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 8 / 0;
                        i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    }
                    i2 = i7 | i;
                } else {
                    i2 = i;
                }
                if ((i & 384) == 0) {
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                }
                if ((i & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                        int i13 = asInterface + 13;
                        onTransact = i13 % 128;
                        i6 = i13 % 2 == 0 ? 2497 : 16384;
                    } else {
                        i6 = 8192;
                    }
                    i2 |= i6;
                }
                if ((196608 & i) == 0) {
                    int i14 = asInterface + 25;
                    onTransact = i14 % 128;
                    int i15 = i14 % 2;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(resourceManagerInternalResourceManagerHooks)) {
                        int i16 = asInterface + 45;
                        onTransact = i16 % 128;
                        int i17 = i16 % 2;
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i2 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(searchView)) {
                        int i18 = onTransact + 13;
                        asInterface = i18 % 128;
                        int i19 = i18 % 2;
                        i4 = 1048576;
                    } else {
                        i4 = 524288;
                    }
                    i2 |= i4;
                }
                if ((100663296 & i) == 0) {
                    int i20 = asInterface + 51;
                    onTransact = i20 % 128;
                    int i21 = i20 % 2;
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((34152593 & i2) != 34152592, i2 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-90146458, i2, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.RightItem.Secret.Content (TextFields.kt:424)");
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    if (z3) {
                        int i22 = onTransact + 93;
                        asInterface = i22 % 128;
                        int i23 = i22 % 2;
                        i3 = 40;
                    } else {
                        i3 = 20;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i3), 0.0f, 2, (Object) null);
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    if (str.length() > 0) {
                        int i24 = asInterface + 55;
                        onTransact = i24 % 128;
                        int i25 = i24 % 2;
                        if (z) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-402838463);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-402754856);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        int i26 = i2 >> 6;
                        setVerticalGravity.onExtraCallbackWithResult(rowScopeInstance, str.length() > 0 && z, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooks, searchView, (String) null, ForwardingCameraControl.onExtraCallback(749501346, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Secret$$ExternalSyntheticLambda1
                            private static int onNavigationEvent = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i27 = 2 % 2;
                                int i28 = onNavigationEvent + 117;
                                onWarmupCompleted = i28 % 128;
                                int i29 = i28 % 2;
                                Unit unitOnExtraCallback = setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.onExtraCallback(this.f$0, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i30 = onWarmupCompleted + 115;
                                onNavigationEvent = i30 % 128;
                                if (i30 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i26 & 7168) | 1572870 | (i26 & 57344), 18);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i27 = asInterface + 3;
                            onTransact = i27 % 128;
                            int i28 = i27 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Secret$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke(Object obj, Object obj2) {
                            int i29 = 2 % 2;
                            int i30 = onExtraCallback + 61;
                            IAuthTabCallback = i30 % 128;
                            int i31 = i30 % 2;
                            Unit unitIAuthTabCallback = setCacheComposition.IAuthTabCallbackDefault.onExtraCallback.IAuthTabCallback(this.f$0, rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i32 = onExtraCallback + 91;
                            IAuthTabCallback = i32 % 128;
                            if (i32 % 2 != 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    });
                }
            }
        }

        public static final class onExtraCallbackWithResult implements IAuthTabCallbackDefault {
            private final String IAuthTabCallback;
            private final Function0<Unit> onWarmupCompleted;
            private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
            private static final int $$b = 212;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onTransact = 0;
            private static int asInterface = 1;
            private static long onNavigationEvent = 4516646356705861415L;
            private static int onExtraCallbackWithResult = -1776194565;
            private static char onExtraCallback = 27643;

            private static String $$c(short s, short s2, int i) {
                int i2 = i * 2;
                int i3 = s + 109;
                int i4 = 4 - (s2 * 4);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i4++;
                    i3 = i5 + i4;
                }
                while (true) {
                    i6++;
                    bArr2[i6] = (byte) i3;
                    if (i6 == i5) {
                        return new String(bArr2, 0);
                    }
                    byte b = bArr[i4];
                    i4++;
                    i3 += b;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public onExtraCallbackWithResult() {
                Function0 function0 = null;
                this(function0, function0, 3, function0);
            }

            public static /* synthetic */ Unit IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 19;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
                int i6 = asInterface + 77;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Unit onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = asInterface + 123;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult, function1, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
                int i5 = asInterface + 77;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }

            private static final Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, RowScope rowScope, String str, boolean z, boolean z2, boolean z3, ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, SearchView searchView, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
                int i3 = 2 % 2;
                int i4 = onTransact + 51;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                onextracallbackwithresult.IAuthTabCallback(rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
                Unit unit = Unit.INSTANCE;
                int i6 = onTransact + 31;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, onExtraCallbackWithResult onextracallbackwithresult) {
                int i = 2 % 2;
                int i2 = asInterface + 95;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback(function1, onextracallbackwithresult);
                }
                IAuthTabCallback(function1, onextracallbackwithresult);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i4 = $11 + 31;
                    $10 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            byte b = (byte) 1;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 43, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.lastIndexOf("", '0', 0, 0)), 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1493 - ImageFormat.getBitsPerPixel(0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getPressedStateDuration() >> 16)), View.MeasureSpec.getSize(0) + 50, 22939 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 45848), 29 - (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i6 = $10 + 49;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            public onExtraCallbackWithResult(@Nullable Function0<Unit> function0, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onWarmupCompleted = function0;
                this.IAuthTabCallback = str;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(Function0 function0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
                if ((i & 1) != 0) {
                    int i2 = onTransact + 85;
                    int i3 = i2 % 128;
                    asInterface = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 55;
                    onTransact = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 % 2;
                    }
                    function0 = null;
                }
                if ((i & 2) != 0) {
                    Object[] objArr = new Object[1];
                    a((char) (26908 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0), new char[]{36956, 58242, 8278, 19783, 34665, 63444, 60560, 62332, 51746, 13835, 32746, 34668, 54702, 55563, 35386, 43537, 22471, 47213, 29015, 37068, 9061, 40261, 45225, 48309, 16862, 49361, 15426, 47892, 13831, 19282, 7132, 18094, 15608, 57745, 33835, 15785, 50515, 54404, 12057, 42653, 40422, 43972, 40704, 28419, 17224, 41423, 9754, 5860, 32724, 5179, 5119, 51144, 36206, 49001, 53013, 38877, 23119, 4891}, new char[]{46300, 62882, 21976, 21140}, new char[]{14088, 14772, 7416, 65385}, objArr);
                    str = ((String) objArr[0]).intern();
                }
                this(function0, str);
            }

            private static final Unit IAuthTabCallback(Function1 function1, onExtraCallbackWithResult onextracallbackwithresult) {
                int i = 2 % 2;
                int i2 = asInterface + 1;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                function1.invoke("");
                Function0<Unit> function0 = onextracallbackwithresult.onWarmupCompleted;
                if (function0 != null) {
                    int i4 = onTransact + 3;
                    asInterface = i4 % 128;
                    if (i4 % 2 == 0) {
                        function0.invoke();
                        int i5 = 54 / 0;
                    } else {
                        function0.invoke();
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i6 = onTransact + 45;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static final Unit onExtraCallback(final onExtraCallbackWithResult onextracallbackwithresult, final Function1 function1, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                Object obj;
                int i2 = 2 % 2;
                int i3 = onTransact + 59;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = asInterface + 89;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(31800253, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.RightItem.Clear.Content.<anonymous>.<anonymous> (TextFields.kt:376)");
                    int i7 = asInterface + 59;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                }
                String str = onextracallbackwithresult.IAuthTabCallback;
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_rrn_text_field_clear, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onextracallbackwithresult);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function0 = new Function0() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Clear$$ExternalSyntheticLambda0
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i9 = 2 % 2;
                                int i10 = onExtraCallbackWithResult + 49;
                                onNavigationEvent = i10 % 128;
                                int i11 = i10 % 2;
                                Unit unitOnWarmupCompleted = setCacheComposition.IAuthTabCallbackDefault.onExtraCallbackWithResult.onWarmupCompleted(function1, onextracallbackwithresult);
                                int i12 = onNavigationEvent + 73;
                                onExtraCallbackWithResult = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return unitOnWarmupCompleted;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                        obj = function0;
                    }
                }
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{str, measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null), strOnExtraCallback, null, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1016}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return Unit.INSTANCE;
            }

            @Override // o.setCacheComposition.IAuthTabCallbackDefault
            public void IAuthTabCallback(@NotNull final RowScope rowScope, @NotNull final String str, final boolean z, final boolean z2, final boolean z3, @NotNull final ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks, @NotNull final SearchView searchView, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
                int i2;
                boolean z4;
                int i3;
                int i4;
                int i5 = 2 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(resourceManagerInternalResourceManagerHooks, "");
                Intrinsics.checkNotNullParameter(searchView, "");
                Intrinsics.checkNotNullParameter(function1, "");
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1113093497);
                if ((i & 48) == 0) {
                    i2 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true) ? 32 : 16) | i;
                } else {
                    i2 = i;
                }
                if ((i & 384) == 0) {
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
                }
                if ((i & 24576) == 0) {
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(resourceManagerInternalResourceManagerHooks)) {
                        i4 = 65536;
                    } else {
                        int i6 = onTransact + 67;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        i4 = 131072;
                    }
                    i2 |= i4;
                }
                if ((1572864 & i) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(searchView)) {
                        i3 = 1048576;
                    } else {
                        int i8 = asInterface + 59;
                        onTransact = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 524288;
                    }
                    i2 |= i3;
                }
                if ((12582912 & i) == 0) {
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    int i10 = asInterface + 55;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                    i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                }
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38346897 & i2) != 38346896, i2 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                } else {
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1113093497, i2, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.RightItem.Clear.Content (TextFields.kt:362)");
                    }
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z3 ? 40 : 20);
                    int i12 = asInterface + 77;
                    onTransact = i12 % 128;
                    int i13 = i12 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, fIAuthTabCallback, 0.0f, 2, (Object) null);
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i14 = asInterface + 99;
                        onTransact = i14 % 128;
                        if (i14 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            z4 = false;
                            int i15 = 85 / 0;
                        } else {
                            z4 = false;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                    } else {
                        z4 = false;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    if (str.length() <= 0 || !z) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1799728685);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1799645078);
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    int i16 = i2 >> 6;
                    setVerticalGravity.onExtraCallbackWithResult(rowScopeInstance, (str.length() <= 0 || !z) ? z4 : true, (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooks, searchView, (String) null, ForwardingCameraControl.onExtraCallback(31800253, true, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Clear$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i17 = 2 % 2;
                            int i18 = onWarmupCompleted + 27;
                            onExtraCallbackWithResult = i18 % 128;
                            if (i18 % 2 == 0) {
                                setCacheComposition.IAuthTabCallbackDefault.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, function1, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = setCacheComposition.IAuthTabCallbackDefault.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, function1, (setHorizontalGravity) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i19 = onWarmupCompleted + 33;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i16 & 7168) | 1572870 | (i16 & 57344), 18);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i17 = onTransact + 49;
                        asInterface = i17 % 128;
                        if (i17 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v3.textfield.TdsTextFieldV3$RightItem$Clear$$ExternalSyntheticLambda2
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onNavigationEvent + 45;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitIAuthTabCallback = setCacheComposition.IAuthTabCallbackDefault.onExtraCallbackWithResult.IAuthTabCallback(this.f$0, rowScope, str, z, z2, z3, resourceManagerInternalResourceManagerHooks, searchView, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i21 = onWarmupCompleted + 27;
                            onNavigationEvent = i21 % 128;
                            if (i21 % 2 != 0) {
                                int i22 = 83 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    });
                }
            }
        }
    }

    public interface IAuthTabCallback {
        default int onWarmupCompleted() {
            int i = 2 % 2;
            return 1;
        }

        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

            static {
                int i = onNavigationEvent + 29;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 69;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                if (this == obj || !(!(obj instanceof onExtraCallbackWithResult))) {
                    return true;
                }
                int i5 = i3 + 43;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return 1789386176;
                }
                int i3 = 70 / 0;
                return 1789386176;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "SingleLine";
            }

            private onExtraCallbackWithResult() {
            }

            @Override // o.setCacheComposition.IAuthTabCallback
            public /* bridge */ int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnWarmupCompleted = super.onWarmupCompleted();
                int i4 = IAuthTabCallback + 93;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iOnWarmupCompleted;
            }
        }

        public static final class onNavigationEvent implements IAuthTabCallback {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private final int onExtraCallback;

            public onNavigationEvent() {
                this(0, 1, null);
            }

            public onNavigationEvent(int i) {
                this.onExtraCallback = i;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onNavigationEvent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 1) != 0) {
                    int i3 = onNavigationEvent + 43;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 21 / 0;
                    }
                    int i5 = 2 % 2;
                    i = Integer.MAX_VALUE;
                }
                this(i);
            }

            @Override // o.setCacheComposition.IAuthTabCallback
            public int onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = this.onExtraCallback;
                int i6 = i3 + 119;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }
    }

    public interface onExtraCallback {

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallback + 125;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 89;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 45;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        return true;
                    }
                    throw null;
                }
                if (obj instanceof onExtraCallbackWithResult) {
                    int i7 = i2 + 125;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return true;
                }
                int i9 = i2 + 49;
                int i10 = i9 % 128;
                onExtraCallbackWithResult = i10;
                boolean z = i9 % 2 != 0;
                int i11 = i10 + 103;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 != 0) {
                    return z;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 3;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 234466748;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 15;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Auto";
                }
                throw null;
            }

            private onExtraCallbackWithResult() {
            }
        }

        public static final class onWarmupCompleted implements onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            private final float onNavigationEvent;

            public /* synthetic */ onWarmupCompleted(float f, DefaultConstructorMarker defaultConstructorMarker) {
                this(f);
            }

            private onWarmupCompleted(float f) {
                this.onNavigationEvent = f;
            }

            public final float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 45;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                float f = this.onNavigationEvent;
                int i5 = i2 + 45;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return f;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static abstract class IAuthTabCallbackStub {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final onTransact IAuthTabCallback;
        private final IAuthTabCallback onNavigationEvent;

        public /* synthetic */ IAuthTabCallbackStub(onTransact ontransact, IAuthTabCallback iAuthTabCallback, DefaultConstructorMarker defaultConstructorMarker) {
            this(ontransact, iAuthTabCallback);
        }

        public abstract onNavigationEvent onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        private IAuthTabCallbackStub(onTransact ontransact, IAuthTabCallback iAuthTabCallback) {
            this.IAuthTabCallback = ontransact;
            this.onNavigationEvent = iAuthTabCallback;
        }

        public final onTransact onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onTransact ontransact = this.IAuthTabCallback;
            int i5 = i3 + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return ontransact;
        }

        public final IAuthTabCallback IAuthTabCallback() {
            IAuthTabCallback iAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 != 0) {
                iAuthTabCallback = this.onNavigationEvent;
                int i4 = 24 / 0;
            } else {
                iAuthTabCallback = this.onNavigationEvent;
            }
            int i5 = i3 + 67;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class onNavigationEvent extends IAuthTabCallbackStub {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final onNavigationEvent onExtraCallback;

            public onNavigationEvent() {
                this(null, 0, null, 7, null);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onNavigationEvent(onTransact ontransact, int i, onNavigationEvent onnavigationevent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 1) != 0) {
                    int i3 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    ontransact = setDefaultFontFileExtension.onNavigationEvent();
                }
                if ((i2 & 2) != 0) {
                    int i5 = onExtraCallbackWithResult + 97;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    i = Integer.MAX_VALUE;
                }
                if ((i2 & 4) != 0) {
                    int i8 = onWarmupCompleted + 27;
                    onExtraCallbackWithResult = i8 % 128;
                    Object obj = null;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i9 = 2 % 2;
                    onnavigationevent = null;
                }
                this(ontransact, i, onnavigationevent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull onTransact ontransact, int i, @Nullable onNavigationEvent onnavigationevent) {
                super(ontransact, new IAuthTabCallback.onNavigationEvent(i), null);
                Intrinsics.checkNotNullParameter(ontransact, "");
                this.onExtraCallback = onnavigationevent;
            }

            @Override // o.setCacheComposition.IAuthTabCallbackStub
            public onNavigationEvent onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(965436070);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i3 = onExtraCallbackWithResult + 7;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(965436070, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Style.Box.colors (TextFields.kt:199)");
                    if (i4 != 0) {
                        int i5 = 40 / 0;
                    }
                }
                onNavigationEvent onnavigationeventIAuthTabCallback = this.onExtraCallback;
                if (onnavigationeventIAuthTabCallback == null) {
                    int i6 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(71129393);
                    onnavigationeventIAuthTabCallback = setClipToCompositionBounds.onWarmupCompleted.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 100663296, 262143);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(71128122);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return onnavigationeventIAuthTabCallback;
            }
        }

        public static final class onWarmupCompleted extends IAuthTabCallbackStub {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final onNavigationEvent IAuthTabCallback;

            /* JADX WARN: Multi-variable type inference failed */
            public onWarmupCompleted() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onWarmupCompleted(onTransact ontransact, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onWarmupCompleted + 15;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    ontransact = setDefaultFontFileExtension.onExtraCallbackWithResult();
                    int i4 = 2 % 2;
                }
                if ((i & 2) != 0) {
                    int i5 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    onnavigationevent = null;
                }
                this(ontransact, onnavigationevent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull onTransact ontransact, @Nullable onNavigationEvent onnavigationevent) {
                super(ontransact, IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted, null);
                Intrinsics.checkNotNullParameter(ontransact, "");
                this.IAuthTabCallback = onnavigationevent;
            }

            @Override // o.setCacheComposition.IAuthTabCallbackStub
            public onNavigationEvent onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                setClipToCompositionBounds setcliptocompositionbounds;
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                long j8;
                long j9;
                long j10;
                long j11;
                long j12;
                long j13;
                long j14;
                long j15;
                long j16;
                int i2;
                int i3 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(921372563);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(921372563, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Style.Line.colors (TextFields.kt:211)");
                }
                onNavigationEvent onnavigationeventOnWarmupCompleted = this.IAuthTabCallback;
                if (onnavigationeventOnWarmupCompleted == null) {
                    int i4 = onExtraCallbackWithResult + 71;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(675772127);
                    if (i5 != 0) {
                        setcliptocompositionbounds = setClipToCompositionBounds.onWarmupCompleted;
                        j = 1;
                        j2 = 0;
                        j3 = 0;
                        j4 = 1;
                        j5 = 0;
                        j6 = 1;
                        j7 = 1;
                        j8 = 0;
                        j9 = 1;
                        j10 = 0;
                        j11 = 0;
                        j12 = 0;
                        j13 = 0;
                        j14 = 1;
                        j15 = 1;
                        j16 = 0;
                        i2 = 1;
                    } else {
                        setcliptocompositionbounds = setClipToCompositionBounds.onWarmupCompleted;
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                        j5 = 0;
                        j6 = 0;
                        j7 = 0;
                        j8 = 0;
                        j9 = 0;
                        j10 = 0;
                        j11 = 0;
                        j12 = 0;
                        j13 = 0;
                        j14 = 0;
                        j15 = 0;
                        j16 = 0;
                        i2 = 0;
                    }
                    onnavigationeventOnWarmupCompleted = setcliptocompositionbounds.onWarmupCompleted(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, cameraCaptureResultEmptyCameraCaptureResult, i2, 1572864, 65535);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(675770856);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i6 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onWarmupCompleted + 11;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return onnavigationeventOnWarmupCompleted;
            }
        }

        public static final class onExtraCallbackWithResult extends IAuthTabCallbackStub {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private final onNavigationEvent onNavigationEvent;

            /* JADX WARN: Multi-variable type inference failed */
            public onExtraCallbackWithResult() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallbackWithResult(onTransact ontransact, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallback + 85;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback3 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        ontransact = (onTransact) setDefaultFontFileExtension.onWarmupCompleted(1874735448, -1874735439, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, new Object[0]);
                        int i3 = 75 / 0;
                    } else {
                        int iIAuthTabCallback4 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback5 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        int iIAuthTabCallback6 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
                        ontransact = (onTransact) setDefaultFontFileExtension.onWarmupCompleted(1874735448, -1874735439, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback4, iIAuthTabCallback5, new Object[0]);
                    }
                    int i4 = 2 % 2;
                }
                if ((i & 2) != 0) {
                    int i5 = onExtraCallback + 103;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 93;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                    onnavigationevent = null;
                }
                this(ontransact, onnavigationevent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallbackWithResult(@NotNull onTransact ontransact, @Nullable onNavigationEvent onnavigationevent) {
                super(ontransact, IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted, null);
                Intrinsics.checkNotNullParameter(ontransact, "");
                this.onNavigationEvent = onnavigationevent;
            }

            @Override // o.setCacheComposition.IAuthTabCallbackStub
            public onNavigationEvent onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1989651419);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1989651419, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Style.LineBig.colors (TextFields.kt:223)");
                }
                onNavigationEvent onnavigationeventOnExtraCallback = this.onNavigationEvent;
                if (onnavigationeventOnExtraCallback == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-794564876);
                    onnavigationeventOnExtraCallback = setClipToCompositionBounds.onWarmupCompleted.onExtraCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 65535);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-794566147);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                Object obj = null;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i3 = IAuthTabCallback + 41;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    if (i4 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i5 = onExtraCallback + 79;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return onnavigationeventOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallback extends IAuthTabCallbackStub {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private final onNavigationEvent onExtraCallback;

            /* JADX WARN: Multi-variable type inference failed */
            public onExtraCallback() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallback(onTransact ontransact, onNavigationEvent onnavigationevent, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onExtraCallbackWithResult + 47;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    ontransact = setDefaultFontFileExtension.onWarmupCompleted();
                    int i4 = 2 % 2;
                }
                if ((i & 2) != 0) {
                    int i5 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    onnavigationevent = null;
                }
                this(ontransact, onnavigationevent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(@NotNull onTransact ontransact, @Nullable onNavigationEvent onnavigationevent) {
                super(ontransact, IAuthTabCallback.onExtraCallbackWithResult.onWarmupCompleted, null);
                Intrinsics.checkNotNullParameter(ontransact, "");
                this.onExtraCallback = onnavigationevent;
            }

            @Override // o.setCacheComposition.IAuthTabCallbackStub
            public onNavigationEvent onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2076735309);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2076735309, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Style.Hero.colors (TextFields.kt:235)");
                    int i5 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
                onNavigationEvent onnavigationeventIAuthTabCallback = this.onExtraCallback;
                if (onnavigationeventIAuthTabCallback == null) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1417158631);
                    onnavigationeventIAuthTabCallback = setClipToCompositionBounds.onWarmupCompleted.IAuthTabCallback(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, 0, 1572864, 65535);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1417159902);
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                return onnavigationeventIAuthTabCallback;
            }
        }
    }

    public interface onNavigationEvent {
        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallback(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallback(boolean z, boolean z2, boolean z3, boolean z4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallback(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallbackWithResult(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onNavigationEvent(boolean z, boolean z2, boolean z3, boolean z4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onWarmupCompleted(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i);

        default CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1444869016);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1444869016, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Colors.getBackgroundColor (TextFields.kt:323)");
            }
            CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(setByteOrder.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onMessageChannelReady()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        }

        default CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(796276502);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(796276502, i, -1, "im.toss.compose.v3.textfield.TdsTextFieldV3.Colors.getBorderColor (TextFields.kt:328)");
            }
            CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(setByteOrder.onNavigationEvent(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.onExtraCallbackWithResult().mayLaunchUrl()), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted APPEAR = new onWarmupCompleted("APPEAR", 0);
        public static final onWarmupCompleted SUSTAIN = new onWarmupCompleted("SUSTAIN", 1);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            onWarmupCompleted[] onwarmupcompletedArr = {i2 % 2 == 0 ? APPEAR : APPEAR, SUSTAIN};
            int i4 = i3 + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 95;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 113;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            throw null;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 31;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        private onWarmupCompleted(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult APPEAR = new onExtraCallbackWithResult("APPEAR", 0);
        public static final onExtraCallbackWithResult SUSTAIN = new onExtraCallbackWithResult("SUSTAIN", 1);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = APPEAR;
                onExtraCallbackWithResult onextracallbackwithresult2 = SUSTAIN;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[3];
                onextracallbackwithresultArr[0] = onextracallbackwithresult;
                onextracallbackwithresultArr[1] = onextracallbackwithresult2;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{APPEAR, SUSTAIN};
            }
            int i4 = i3 + 67;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i4 = i3 + 25;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onExtraCallback + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 54 / 0;
            }
        }

        private onExtraCallbackWithResult(String str, int i) {
        }
    }
}
