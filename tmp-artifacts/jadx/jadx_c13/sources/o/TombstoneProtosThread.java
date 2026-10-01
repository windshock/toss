package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosThread<T> implements access13800<T>, access14900 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final onExtraCallback Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static final AtomicReferenceFieldUpdater<TombstoneProtosThread<?>, Object> onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onTransact;
    private static int onWarmupCompleted;
    private final access13800<T> onNavigationEvent;
    private volatile Object result;

    @Override // o.access14900
    public StackTraceElement getStackTraceElement() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TombstoneProtosThread(@NotNull access13800<? super T> access13800Var, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(access13800Var, "");
        this.onNavigationEvent = access13800Var;
        this.result = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TombstoneProtosThread(@NotNull access13800<? super T> access13800Var) {
        this(access13800Var, access14400.UNDECIDED);
        Intrinsics.checkNotNullParameter(access13800Var, "");
    }

    @Override // o.access13800
    public CoroutineContext getContext() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CoroutineContext context = this.onNavigationEvent.getContext();
        int i4 = asInterface + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    static {
        onWarmupCompleted();
        Companion = new onExtraCallback(null);
        Object[] objArr = new Object[1];
        a(new char[]{3, 0, 0, 2, 3, 5}, (byte) (17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 6, objArr);
        onExtraCallback = AtomicReferenceFieldUpdater.newUpdater(TombstoneProtosThread.class, Object.class, ((String) objArr[0]).intern());
        int i = onWarmupCompleted + 109;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    @Override // o.access13800
    public void resumeWith(@NotNull Object obj) {
        int i = 2 % 2;
        while (true) {
            Object obj2 = this.result;
            access14400 access14400Var = access14400.UNDECIDED;
            if (obj2 == access14400Var) {
                if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, access14400Var, obj)) {
                    return;
                }
            } else if (obj2 == access14100.onExtraCallback()) {
                int i2 = asInterface + 59;
                onTransact = i2 % 128;
                Object obj3 = null;
                if (i2 % 2 != 0) {
                    RequestBuilder.onWarmupCompleted(onExtraCallback, this, access14100.onExtraCallback(), access14400.RESUMED);
                    throw null;
                }
                if (!(!RequestBuilder.onWarmupCompleted(onExtraCallback, this, access14100.onExtraCallback(), access14400.RESUMED))) {
                    int i3 = onTransact + 35;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.onNavigationEvent.resumeWith(obj);
                        return;
                    } else {
                        this.onNavigationEvent.resumeWith(obj);
                        obj3.hashCode();
                        throw null;
                    }
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    public final Object onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.result;
        access14400 access14400Var = access14400.UNDECIDED;
        if (obj == access14400Var) {
            if (RequestBuilder.onWarmupCompleted(onExtraCallback, this, access14400Var, access14100.onExtraCallback())) {
                return access14100.onExtraCallback();
            }
            obj = this.result;
        }
        Object obj2 = null;
        if (obj == access14400.RESUMED) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i4 = asInterface + 23;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        int i5 = asInterface + 65;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.access14900
    public access14900 getCallerFrame() {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        access13800<T> access13800Var = this.onNavigationEvent;
        Object obj = null;
        if (!(access13800Var instanceof access14900)) {
            return null;
        }
        int i5 = i3 + 39;
        onTransact = i5 % 128;
        access14900 access14900Var = (access14900) access13800Var;
        if (i5 % 2 == 0) {
            return access14900Var;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SafeContinuation for " + this.onNavigationEvent;
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onExtraCallbackWithResult;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 115;
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.getDeadChar(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        int i6 = $11 + 21;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 24824), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74, 8088 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i8];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i9 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                                $10 = i9 % 128;
                                int i10 = i9 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                            } else {
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i15 = $11 + 9;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{64961, 64966, 64960, 64963, 64967, 64991, 64982, 64965, 64962};
        IAuthTabCallback = (char) 51242;
    }
}
