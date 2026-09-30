package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.android.OpenCVLoader;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isH5 {
    public static final isH5 IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static onWarmupCompleted onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static Size onNavigationEvent;
    private static int onTransact;
    private static requestInnerAsync onWarmupCompleted;

    private isH5() {
    }

    static {
        onExtraCallback();
        IAuthTabCallback = new isH5();
        onWarmupCompleted = new requestInnerAsync(null, null, null, null, 15, null);
        onNavigationEvent = new Size(960, 1280);
        onExtraCallback = onWarmupCompleted.PORTRAIT;
        int i = asBinder + 33;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final Size onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 49;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Size size = onNavigationEvent;
        int i5 = i2 + 61;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return size;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted LANDSCAPE;
        public static final onWarmupCompleted PORTRAIT;
        private static int asInterface = 1;
        private static char onExtraCallback = 0;
        private static char[] onExtraCallbackWithResult = null;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 5;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = PORTRAIT;
                onWarmupCompleted onwarmupcompleted2 = LANDSCAPE;
                onwarmupcompletedArr = new onWarmupCompleted[4];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{PORTRAIT, LANDSCAPE};
            }
            int i4 = i2 + 55;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onExtraCallbackWithResult();
            Object[] objArr = new Object[1];
            a(new char[]{0, 1, 11, 5, '\n', 1, 11, 6}, (byte) (48 - ImageFormat.getBitsPerPixel(0)), 8 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            PORTRAIT = new onWarmupCompleted(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(new char[]{2, 6, 7, '\r', '\b', 7, 3, 0, 13829}, (byte) (TextUtils.indexOf("", "", 0, 0) + 38), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9, objArr2);
            LANDSCAPE = new onWarmupCompleted(((String) objArr2[0]).intern(), 1);
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = asInterface + 125;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            long j;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onExtraCallbackWithResult;
            long j2 = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 23139 - (ViewConfiguration.getFadingEdgeLength() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            float f = 0.0f;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, Drawable.resolveOpacity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                        int i5 = $11 + 55;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        j = j2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 24824), 74 - View.getDefaultSize(0, 0), 8087 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    j = 0;
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, 19487 - TextUtils.indexOf((CharSequence) "", '0', 0), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    j = 0;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                            } else {
                                obj = null;
                                j = 0;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i8 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i8];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                                    int i10 = $10 + 73;
                                    $11 = i10 % 128;
                                    int i11 = i10 % 2;
                                } else {
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
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
                    j2 = j;
                    f = 0.0f;
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        static void onExtraCallbackWithResult() {
            onExtraCallbackWithResult = new char[]{65020, 65013, 65010, 64995, 65008, 65021, 65011, 64999, 65009, 64993, 65018, 64992, 65014, 65022, 65023, 65015};
            onExtraCallback = (char) 51245;
        }
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull requestInnerAsync requestinnerasync) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(requestinnerasync, "");
            onWarmupCompleted = requestinnerasync;
            IAuthTabCallback();
            return;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(requestinnerasync, "");
        onWarmupCompleted = requestinnerasync;
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final requestInnerAsync onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 111;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        requestInnerAsync requestinnerasync = onWarmupCompleted;
        int i5 = i2 + 45;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return requestinnerasync;
        }
        throw null;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
            if (OpenCVLoader.initLocal()) {
                return;
            }
        } else if (OpenCVLoader.initLocal()) {
            return;
        }
        int i4 = IAuthTabCallbackDefault + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{27241, 27153, 27172, 27175, 27158, 27138, 27332, 27485, 27476, 27480, 27485, 27481, 27483, 27481, 27326, 27298, 27458, 27456, 27485, 27487, 27459, 27468, 27462, 27485, 27484, 27471, 27323, 27306, 27299, 27482, 27482, 27481, 27481, 27456, 27358, 27473, 27318, 27316, 27499, 27475, 27482, 27483, 27480, 27483, 27483, 27483, 27460, 27486, 27477, 27476, 27463, 27315, 27298, 27323, 27474, 27474, 27473, 27473, 27480, 27481, 27477, 27500, 27472, 27477, 27473};
    }
}
