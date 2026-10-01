package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1qSDK5 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private final GriverPageConfiguration onNavigationEvent = GriverPageConfiguration.Companion.IAuthTabCallback("tosssec-tuba-variable-v2-not-found");

    static {
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallbackDefault + 47;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Inject
    public AFe1qSDK5() {
    }

    public final boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return this.onNavigationEvent.onNavigationEvent(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 62 / 0;
        return this.onNavigationEvent.onNavigationEvent(str);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.onNavigationEvent.onNavigationEvent(str)) {
                return;
            }
            int iOnExtraCallback = onExtraCallback();
            if (iOnExtraCallback >= 100) {
                return;
            }
            GriverPageConfiguration griverPageConfiguration = this.onNavigationEvent;
            Object[] objArr = new Object[1];
            a(new char[]{46530, 19688}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr);
            griverPageConfiguration.onExtraCallback(str, ((String) objArr[0]).intern());
            this.onNavigationEvent.onExtraCallback("__marked_count__", String.valueOf(iOnExtraCallback + 1));
            AFd1iSDKAFa1zSDK aFd1iSDKAFa1zSDK = AFd1iSDKAFa1zSDK.onNavigationEvent;
            Object[] objArr2 = new Object[1];
            a(new char[]{41466, 26866, 53374, 14139, 15510, 56459, 35862, 22891, 59072, 9709, 17857, 50700, 54578, 55185}, 13 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{41240, 51399}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, objArr3);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a(new char[]{53349, 59138, 59042, 51550}, 3 - Color.blue(0), objArr4);
            Map mapIAuthTabCallbackStub = access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str));
            Object[] objArr5 = new Object[1];
            a(new char[]{35558, 49115, 50820, 52162, 43915, 5371, 38120, 63691, 9916, 38410, 35491, 41068, 21054, 3916, '3', 7970, 16072, 31432}, 18 - Color.blue(0), objArr5);
            AFd1iSDKAFa1zSDK.onExtraCallback(aFd1iSDKAFa1zSDK, ((String) objArr5[0]).intern(), (String) null, mapIAuthTabCallbackStub, false, (String) null, 26, (Object) null);
        }
    }

    private final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = this.onNavigationEvent.onWarmupCompleted("__marked_count__");
        Object obj = null;
        if (strOnWarmupCompleted != null) {
            int i4 = asBinder + 57;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                StringsKt__StringNumberConversionsKt.toIntOrNull(strOnWarmupCompleted);
                obj.hashCode();
                throw null;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strOnWarmupCompleted);
            if (intOrNull != null) {
                int i5 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    return intOrNull.intValue();
                }
                intOrNull.intValue();
                obj.hashCode();
                throw null;
            }
        }
        int i6 = asBinder + 37;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 47;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 99;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSize = (char) View.resolveSize(i3, i3);
                        int i12 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, i12, maximumFlingVelocity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14, 19901 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = (char) 15829;
        onExtraCallback = (char) 10660;
        IAuthTabCallback = (char) 60634;
        onWarmupCompleted = (char) 57230;
    }
}
