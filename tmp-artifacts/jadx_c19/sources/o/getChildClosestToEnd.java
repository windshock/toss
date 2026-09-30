package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.kakao.sdk.auth.network.RequiredScopesInterceptor;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getChildClosestToEnd {
    private static final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(onExtraCallback.onWarmupCompleted);
    private static final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(onWarmupCompleted.onNavigationEvent);
    private static final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(onExtraCallbackWithResult.onExtraCallback);
    private static final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(IAuthTabCallback.onWarmupCompleted);
    private static final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(onNavigationEvent.onWarmupCompleted);

    static final class onExtraCallback extends Lambda implements Function0<Retrofit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int asInterface = 0;
        private static char onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static char[] onNavigationEvent = null;
        private static int onTransact = 1;
        public static final onExtraCallback onWarmupCompleted;

        static {
            onExtraCallbackWithResult();
            onWarmupCompleted = new onExtraCallback();
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        onExtraCallback() {
            super(0);
        }

        public /* synthetic */ Object invoke() throws Throwable {
            int i2 = 2 % 2;
            int i3 = asInterface + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Retrofit retrofitOnWarmupCompleted = onWarmupCompleted();
            int i5 = asInterface + 53;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return retrofitOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Retrofit onWarmupCompleted() throws Throwable {
            int i2 = 2 % 2;
            canScrollHorizontally canscrollhorizontally = canScrollHorizontally.onExtraCallback;
            String strOnWarmupCompleted = fixLayoutStartGap.onNavigationEvent.IAuthTabCallback().onWarmupCompleted();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{7, 0, 2, 4, 0, 5, 13789, 13789}, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 40), 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnWarmupCompleted);
            Retrofit retrofitOnExtraCallback = canScrollHorizontally.onExtraCallback(canscrollhorizontally, sb.toString(), new OkHttpClient.Builder().addInterceptor(canscrollhorizontally.onExtraCallbackWithResult()).addInterceptor(getChildClosestToEnd.onExtraCallback(canscrollhorizontally)).addInterceptor(getChildClosestToEnd.onWarmupCompleted(canscrollhorizontally)).addInterceptor(canscrollhorizontally.onWarmupCompleted()), (CallAdapter.Factory) null, 4, (Object) null);
            int i3 = onTransact + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return retrofitOnExtraCallback;
        }

        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            if (cArr2 != null) {
                int i5 = $11 + 57;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 26 - TextUtils.indexOf("", ""), 23139 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 26 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    i3 = i2 - 1;
                    cArr4[i3] = (char) (cArr[i3] - b);
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    int i8 = $11 + 51;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 24825), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 74, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i11 = $10 + 25;
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    }
                }
                int i17 = 0;
                while (i17 < i2) {
                    cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                    i17++;
                    int i18 = $11 + 101;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                }
                String str = new String(cArr4);
                int i20 = $11 + 47;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        static void onExtraCallbackWithResult() {
            onNavigationEvent = new char[]{51243, 64967, 64960, 64905, 64924, 64963, 64987, 51242, 51240};
            onExtraCallback = (char) 51242;
        }
    }

    public static final Retrofit onExtraCallbackWithResult(@NotNull canScrollHorizontally canscrollhorizontally) {
        Intrinsics.checkNotNullParameter(canscrollhorizontally, "");
        return (Retrofit) onWarmupCompleted.getValue();
    }

    static final class onWarmupCompleted extends Lambda implements Function0<Retrofit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char[] IAuthTabCallback = null;
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static boolean onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final onWarmupCompleted onNavigationEvent;
        private static int onTransact;
        private static boolean onWarmupCompleted;

        static {
            onNavigationEvent();
            onNavigationEvent = new onWarmupCompleted();
            int i2 = asInterface + 81;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        onWarmupCompleted() {
            super(0);
        }

        public /* synthetic */ Object invoke() throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackStub + 87;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Retrofit retrofitOnExtraCallback = onExtraCallback();
            if (i4 != 0) {
                int i5 = 60 / 0;
            }
            return retrofitOnExtraCallback;
        }

        public final Retrofit onExtraCallback() throws Throwable {
            int i2 = 2 % 2;
            canScrollHorizontally canscrollhorizontally = canScrollHorizontally.onExtraCallback;
            String strOnNavigationEvent = fixLayoutStartGap.onNavigationEvent.IAuthTabCallback().onNavigationEvent();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-122, -122, -123, -124, -125, -126, -126, -127}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnNavigationEvent);
            Retrofit retrofitOnExtraCallback = canScrollHorizontally.onExtraCallback(canscrollhorizontally, sb.toString(), new OkHttpClient.Builder().addInterceptor(canscrollhorizontally.onExtraCallbackWithResult()).addInterceptor(canscrollhorizontally.onWarmupCompleted()), (CallAdapter.Factory) null, 4, (Object) null);
            int i3 = IAuthTabCallbackStub + 7;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return retrofitOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(j), 76 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), View.combineMeasuredStates(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i5++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 75, (ViewConfiguration.getTouchSlop() >> 8) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallback) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 64, 12213 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $11 + 7;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63, ImageFormat.getBitsPerPixel(0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i2] + iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    i3 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i3;
            }
            String str = new String(cArr6);
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str;
        }

        static void onNavigationEvent() {
            IAuthTabCallback = new char[]{32417, 32477, 32473, 32478, 32407, 32410};
            onExtraCallbackWithResult = -1184334007;
            onWarmupCompleted = true;
            onExtraCallback = true;
        }
    }

    public static final Retrofit onNavigationEvent(@NotNull canScrollHorizontally canscrollhorizontally) {
        Intrinsics.checkNotNullParameter(canscrollhorizontally, "");
        return (Retrofit) IAuthTabCallback.getValue();
    }

    static final class onExtraCallbackWithResult extends Lambda implements Function0<Retrofit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char IAuthTabCallback = 0;
        private static int asBinder = 1;
        public static final onExtraCallbackWithResult onExtraCallback;
        private static int onExtraCallbackWithResult = 0;
        private static char[] onNavigationEvent = null;
        private static int onTransact = 0;
        private static int onWarmupCompleted = 1;

        static {
            onNavigationEvent();
            onExtraCallback = new onExtraCallbackWithResult();
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        onExtraCallbackWithResult() {
            super(0);
        }

        public /* synthetic */ Object invoke() throws Throwable {
            int i2 = 2 % 2;
            int i3 = asBinder + 99;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            throw null;
        }

        public final Retrofit onWarmupCompleted() throws Throwable {
            int i2 = 2 % 2;
            canScrollHorizontally canscrollhorizontally = canScrollHorizontally.onExtraCallback;
            String strOnWarmupCompleted = fixLayoutStartGap.onNavigationEvent.IAuthTabCallback().onWarmupCompleted();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a(new char[]{2, '\b', 3, 5, 6, 4, 13792, 13792}, (byte) ('[' - AndroidCharacter.getMirror('0')), 8 - View.resolveSizeAndState(0, 0, 0), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(strOnWarmupCompleted);
            Retrofit retrofitOnExtraCallback = canScrollHorizontally.onExtraCallback(canscrollhorizontally, sb.toString(), new OkHttpClient.Builder().addInterceptor(canscrollhorizontally.onExtraCallbackWithResult()).addInterceptor(getChildClosestToEnd.onExtraCallback(canscrollhorizontally)).addInterceptor(getChildClosestToEnd.onWarmupCompleted(canscrollhorizontally)), (CallAdapter.Factory) null, 4, (Object) null);
            int i3 = asBinder + 55;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return retrofitOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            Object obj;
            int length;
            char[] cArr2;
            int i4;
            int i5 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onNavigationEvent;
            char c = '0';
            Object obj2 = null;
            if (cArr3 != null) {
                int i6 = $10 + 89;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i4 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i4 = 0;
                }
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 25 - TextUtils.indexOf("", c), 23139 - TextUtils.getCapsMode("", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4++;
                        c = '0';
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
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i7 = $10 + 71;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent - 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i8 = $10 + 101;
                            $11 = i8 % 128;
                            if (i8 % 2 == 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 74 - Color.argb(0, 0, 0, 0), KeyEvent.getDeadChar(0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 29 - TextUtils.lastIndexOf("", '0', 0), Color.rgb(0, 0, 0) + 16796704, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i9];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i10 = $10 + 63;
                                    $11 = i10 % 128;
                                    int i11 = i10 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    int i16 = $11 + 49;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    obj2 = obj;
                }
            }
            for (int i18 = 0; i18 < i2; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void onNavigationEvent() {
            onNavigationEvent = new char[]{51240, 51242, 51243, 64905, 64963, 64967, 64924, 64960, 64987};
            IAuthTabCallback = (char) 51242;
        }
    }

    public static final Retrofit IAuthTabCallback(@NotNull canScrollHorizontally canscrollhorizontally) {
        Intrinsics.checkNotNullParameter(canscrollhorizontally, "");
        return (Retrofit) onExtraCallback.getValue();
    }

    static final class IAuthTabCallback extends Lambda implements Function0<computeScrollRange> {
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        IAuthTabCallback() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final computeScrollRange invoke() {
            return new computeScrollRange(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public static final computeScrollRange onExtraCallback(@NotNull canScrollHorizontally canscrollhorizontally) {
        Intrinsics.checkNotNullParameter(canscrollhorizontally, "");
        return (computeScrollRange) onExtraCallbackWithResult.getValue();
    }

    static final class onNavigationEvent extends Lambda implements Function0<RequiredScopesInterceptor> {
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        onNavigationEvent() {
            super(0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final RequiredScopesInterceptor invoke() {
            return new RequiredScopesInterceptor(null, 1, null);
        }
    }

    public static final RequiredScopesInterceptor onWarmupCompleted(@NotNull canScrollHorizontally canscrollhorizontally) {
        Intrinsics.checkNotNullParameter(canscrollhorizontally, "");
        return (RequiredScopesInterceptor) onNavigationEvent.getValue();
    }
}
