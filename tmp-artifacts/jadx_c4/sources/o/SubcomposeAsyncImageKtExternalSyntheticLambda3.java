package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import javax.crypto.spec.IvParameterSpec;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.setProgressColor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SubcomposeAsyncImageKtExternalSyntheticLambda3 implements getMax {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static char onExtraCallback = 51983;
    private static char onExtraCallbackWithResult = 26310;
    private static char onNavigationEvent = 60223;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 1774;
    private final AsyncImagePainterExternalSyntheticLambda0 IAuthTabCallback;

    @Inject
    public SubcomposeAsyncImageKtExternalSyntheticLambda3(@NotNull AsyncImagePainterExternalSyntheticLambda0 asyncImagePainterExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(asyncImagePainterExternalSyntheticLambda0, "");
        this.IAuthTabCallback = asyncImagePainterExternalSyntheticLambda0;
    }

    @Override // o.getMax
    public String onNavigationEvent(@NotNull String str, @NotNull String str2) {
        String strOnExtraCallback;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                strOnExtraCallback = setup.onExtraCallback(setProgressColor.onNavigationEvent.onExtraCallbackWithResult(setProgressColor.Companion, this.IAuthTabCallback.onExtraCallbackWithResult(), (IvParameterSpec) null, 2, (Object) null), str, 0);
            } catch (BaseRoundCornerProgressBarSavedState e) {
                Object[] objArr = new Object[1];
                a(new char[]{20034, 61059, 28420, 3900}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "baseDataValueCipher::encode");
                Object[] objArr2 = new Object[1];
                a(new char[]{64069, 47317, 8307, 10667}, TextUtils.indexOf((CharSequence) "", '0', 0) + 4, objArr2);
                ALCDetectionMode.IAuthTabCallback(e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2)}));
                Object[] objArr3 = new Object[1];
                a(new char[]{64069, 47317, 8307, 10667}, 3 - View.MeasureSpec.getSize(0), objArr3);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("baseDataValueCipher::encode", "key:" + str2, e, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str2)));
                strOnExtraCallback = "";
            }
        }
        return strOnExtraCallback;
    }

    @Override // o.getMax
    public String IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        String strOnWarmupCompleted;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                strOnWarmupCompleted = setup.onWarmupCompleted(setProgressColor.onNavigationEvent.onNavigationEvent(setProgressColor.Companion, this.IAuthTabCallback.onExtraCallbackWithResult(), (IvParameterSpec) null, 2, (Object) null), str, 0);
            } catch (onProgressChanged e) {
                Object[] objArr = new Object[1];
                a(new char[]{20034, 61059, 28420, 3900}, AndroidCharacter.getMirror('0') - ',', objArr);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "baseDataValueCipher::decode");
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("encrypted", str);
                Object[] objArr2 = new Object[1];
                a(new char[]{64069, 47317, 8307, 10667}, 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                ALCDetectionMode.IAuthTabCallback(e, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2)}));
                Object[] objArr3 = new Object[1];
                a(new char[]{64069, 47317, 8307, 10667}, TextUtils.lastIndexOf("", '0', 0, 0) + 4, objArr3);
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("baseDataValueCipher::decode", "key:" + str2, e, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str2), getWrite.IAuthTabCallback("encrypted", str)}));
                strOnWarmupCompleted = "";
            }
        }
        return strOnWarmupCompleted;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 7;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return "tossBaseDataValueCipher";
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
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i7 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i8 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int longPressTimeout = 12434 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, i8, longPressTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, 12434 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i9 = $10 + 103;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i11 = $10 + 103;
        $11 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }
}
