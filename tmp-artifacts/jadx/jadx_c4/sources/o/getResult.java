package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.tracker.Referrer;
import im.toss.core.tracker.payload.AppEventPayloadV1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getResult extends downloadZip {
    private final Map<String, Object> IAuthTabCallback;
    private final Throwable onExtraCallback;
    private final String onExtraCallbackWithResult;
    private static final byte[] $$a = {62, 54, 60, 44};
    private static final int $$b = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onWarmupCompleted = 478308941;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = getResult.this.onExtraCallbackWithResult(false, this);
            int i4 = onExtraCallback + 45;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return objOnExtraCallbackWithResult;
        }
    }

    private static String $$c(short s, short s2, short s3) {
        int i = 3 - (s3 * 3);
        int i2 = s * 2;
        byte[] bArr = $$a;
        int i3 = 105 - (s2 * 2);
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 += -i;
            i = i;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i6];
            i = i6;
            i4 = i5;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 67;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getResult)) {
            return false;
        }
        getResult getresult = (getResult) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, getresult.onExtraCallback)) {
            int i7 = IAuthTabCallbackDefault + 53;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, getresult.onExtraCallbackWithResult)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, getresult.IAuthTabCallback))) {
            return true;
        }
        int i9 = IAuthTabCallbackDefault + 95;
        int i10 = i9 % 128;
        onNavigationEvent = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 17;
        IAuthTabCallbackDefault = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 70 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3
      0x0031: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            int i3 = 58 / 0;
            if (str == null) {
                int i4 = IAuthTabCallbackDefault + 3;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onExtraCallbackWithResult;
            if (str == null) {
            }
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackCrash(cause=" + this.onExtraCallback + ", message=" + this.onExtraCallbackWithResult + ", params=" + this.IAuthTabCallback + ")";
        int i2 = IAuthTabCallbackDefault + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public getResult(@NotNull Throwable th, @Nullable String str, @NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = th;
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = map;
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.IAuthTabCallback;
        int i5 = i3 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, 3 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'\n', 65535, 65530, '\t', 65528}, false, 205 - Color.green(0), objArr);
        downloadZip.onExtraCallback(this, ((String) objArr[0]).intern(), this.onExtraCallback.getClass().getSimpleName(), null, this.onExtraCallbackWithResult, this.onExtraCallback, 4, null);
        int i4 = IAuthTabCallbackDefault + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z2 = access13800Var instanceof onExtraCallbackWithResult;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i3 = onextracallbackwithresult.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IAuthTabCallbackDefault + 63;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    onextracallbackwithresult.label = i3 - Integer.MIN_VALUE;
                } else {
                    onextracallbackwithresult.label = i3 - 2147483648;
                }
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object objIAuthTabCallback = onextracallbackwithresult2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallbackwithresult2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            Object[] objArr = new Object[1];
            a(5 - View.resolveSizeAndState(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 2, new char[]{'\n', 65535, 65530, '\t', 65528}, false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 204, objArr);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, null, ((String) objArr[0]).intern(), 3, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            onextracallbackwithresult2.Z$0 = z;
            onextracallbackwithresult2.label = 1;
            objIAuthTabCallback = downloadZip.IAuthTabCallback(this, onnavigationevent, mapOnNavigationEvent, true, null, z, onextracallbackwithresult2, 8, null);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i6 = IAuthTabCallbackDefault + 51;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = IAuthTabCallbackDefault + 115;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        Map map = (Map) objIAuthTabCallback;
        Object[] objArr2 = new Object[1];
        a(6 - TextUtils.indexOf((CharSequence) "", '0'), 1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{65534, 65532, 4, 65532, '\n', '\n', 65528}, false, TextUtils.lastIndexOf("", '0') + 206, objArr2);
        map.put(((String) objArr2[0]).intern(), this.onExtraCallbackWithResult);
        map.put("stacktrace", RawQueries.onNavigationEvent(this.onExtraCallback, 0, 0, 3, null));
        map.put("error_name", this.onExtraCallback.getClass().getName());
        if (!Intrinsics.areEqual(this.onExtraCallback.getMessage(), this.onExtraCallbackWithResult)) {
            int i10 = IAuthTabCallbackDefault + 67;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("error_message", this.onExtraCallback.getMessage());
                int i11 = 47 / 0;
            } else {
                map.put("error_message", this.onExtraCallback.getMessage());
            }
        }
        String str = "crash_" + this.onExtraCallback.getClass().getName();
        String str2 = this.onExtraCallbackWithResult;
        Object[] objArr3 = new Object[1];
        a(5 - TextUtils.indexOf("", "", 0, 0), 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{'\n', 65535, 65530, '\t', 65528}, false, 204 - TextUtils.lastIndexOf("", '0', 0), objArr3);
        return new AppEventPayloadV1(str, ((String) objArr3[0]).intern(), "common", map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, str2, 1048528, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 35125), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.keyCodeFromString("")), Color.alpha(0) + 55, 2167 - TextUtils.getOffsetAfter("", 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $10 + 87;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[i >>> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getTapTimeout() >> 16)), View.resolveSize(0, 0) + 55, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), View.resolveSizeAndState(0, 0, 0) + 55, 2166 - TextUtils.lastIndexOf("", '0'), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i4 = 2083011369;
            }
            int i9 = $10 + 37;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }
}
