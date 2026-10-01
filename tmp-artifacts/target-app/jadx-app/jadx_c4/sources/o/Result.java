package o;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
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
public final class Result extends downloadZip {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Map<String, Object> onNavigationEvent;
    private final String onWarmupCompleted;
    private static char[] IAuthTabCallbackStub = {64982, 65064, 64980, 65065, 65066, 64960, 64978, 64990, 65067};
    private static char IAuthTabCallbackDefault = 51242;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallbackWithResult = Result.this.onExtraCallbackWithResult(i3 != 0, this);
            int i4 = onExtraCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public Result() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(@NotNull String str) {
        this(str, null, null, null, null, 30, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(@NotNull String str, @Nullable String str2) {
        this(str, str2, null, null, null, 28, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, 24, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
        this(str, str2, str3, map, null, 16, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 1;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof Result)) {
            int i4 = asBinder + 95;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Result result = (Result) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, result.onExtraCallback)) {
            return false;
        }
        Object obj2 = null;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, result.onWarmupCompleted)) {
            int i6 = asBinder + 93;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, result.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, result.onNavigationEvent)) {
            if (!Intrinsics.areEqual(this.IAuthTabCallback, result.IAuthTabCallback)) {
                return false;
            }
            int i7 = onTransact + 111;
            asBinder = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 98 / 0;
            }
            return true;
        }
        int i9 = asBinder + 97;
        int i10 = i9 % 128;
        onTransact = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 3;
        asBinder = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
      0x002f: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
      0x0024: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
                int i3 = asBinder + 19;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
                int i5 = asBinder + 29;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            iHashCode = this.onExtraCallback.hashCode();
            str = this.onWarmupCompleted;
            if (str == null) {
            }
        }
        String str2 = this.onExtraCallbackWithResult;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TrackWarning(tag=" + this.onExtraCallback + ", message=" + this.onWarmupCompleted + ", service=" + this.onExtraCallbackWithResult + ", params=" + this.onNavigationEvent + ", company=" + this.IAuthTabCallback + ")";
        int i2 = asBinder + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public Result(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onExtraCallback = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = map;
        this.IAuthTabCallback = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Result(String str, String str2, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6 = "";
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = asBinder + 85;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = asBinder + 115;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = asBinder + 123;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i9 = onTransact + 121;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                map = access8100.onNavigationEvent();
                int i10 = 2 % 2;
            } else {
                access8100.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
        }
        this(str, str6, str5, map, (i & 16) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str4);
    }

    @Override // o.downloadZip
    public Map<String, Object> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    @Override // o.downloadZip
    public void IAuthTabCallbackDefault() {
        Long l;
        String str;
        Throwable th;
        int i;
        int i2 = 2 % 2;
        int i3 = onTransact + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str2 = this.onExtraCallback;
        if (i4 == 0) {
            l = null;
            str = this.onWarmupCompleted;
            th = null;
            i = 61;
        } else {
            l = null;
            str = this.onWarmupCompleted;
            th = null;
            i = 20;
        }
        downloadZip.onExtraCallback(this, "warn", str2, l, str, th, i, null);
        int i5 = asBinder + 89;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // o.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super InterfaceC0059deInitialize> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i2 = onextracallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onTransact + 93;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                onextracallback.label = i2 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        onExtraCallback onextracallback2 = onextracallback;
        Object objOnExtraCallback = onextracallback2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onextracallback2.label;
        if (i5 != 0) {
            int i6 = asBinder + 31;
            onTransact = i6 % 128;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        } else {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            DetectFaceInSingleImage.onNavigationEvent onnavigationevent = new DetectFaceInSingleImage.onNavigationEvent(null, this.onExtraCallback, "warn", 1, null);
            Map<String, Object> mapOnNavigationEvent = onNavigationEvent();
            String str = this.IAuthTabCallback;
            onextracallback2.Z$0 = z;
            onextracallback2.label = 1;
            objOnExtraCallback = onExtraCallback(onnavigationevent, mapOnNavigationEvent, true, str, z, onextracallback2);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        Map map = (Map) objOnExtraCallback;
        if (GetFeatureExtension.onWarmupCompleted.onPostMessage()) {
            Object[] objArr = new Object[1];
            a(new char[]{6, 1, 13885, 13885, '\b', 0, 13907}, (byte) (84 - Gravity.getAbsoluteGravity(0, 0)), 6 - Process.getGidForName(""), objArr);
            map.put(((String) objArr[0]).intern(), this.onWarmupCompleted);
        }
        String str2 = this.onExtraCallback;
        String str3 = this.onExtraCallbackWithResult;
        if (str3 == null) {
            str3 = "common";
        }
        return new AppEventPayloadV1(str2, "warn", str3, map, (String) null, onExtraCallbackWithResult(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.IAuthTabCallback, (String) null, (String) null, (Long) null, (String) null, (String) null, (Referrer) null, (String) null, this.onWarmupCompleted, 1044432, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallbackStub;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 23;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 26, Color.rgb(0, 0, 0) + 16800355, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.getDeadChar(0, 0) + 26, MotionEvent.axisFromString("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 65;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $10 + 95;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 74, 8088 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getMode(0) + 30, KeyEvent.keyCodeFromString("") + 19488, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 63;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 15040);
                i17 += 4;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
