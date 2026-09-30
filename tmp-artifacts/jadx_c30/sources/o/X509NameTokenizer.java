package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class X509NameTokenizer {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {64989, 65023, 64982, 64993, 64986, 64923, 64988, 64990, 64963, 64991, 64983, 64981, 64978, 65018, 64922, 64961, 64910, 65010, 64966, 64977, 64967, 64927, 64960, 64915, 64998};
    private static char onExtraCallbackWithResult = 51244;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    @SerializedName("responseInfo")
    private final BiometricData onExtraCallback;

    @SerializedName("adUnitId")
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509NameTokenizer)) {
            int i4 = i3 + 103;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        X509NameTokenizer x509NameTokenizer = (X509NameTokenizer) obj;
        if (Intrinsics.areEqual(this.onNavigationEvent, x509NameTokenizer.onNavigationEvent)) {
            return !(Intrinsics.areEqual(this.onExtraCallback, x509NameTokenizer.onExtraCallback) ^ true);
        }
        int i5 = onWarmupCompleted + 117;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        return i3 == 0 ? (iHashCode % 75) * this.onExtraCallback.hashCode() : (iHashCode * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.onNavigationEvent;
        BiometricData biometricData = this.onExtraCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{15, '\f', '\b', 7, 16, 4, 7, 11, '\r', 0, 7, 2, 19, '\b', 0, '\n', '\r', 11, 20, 4, 0, 24, 14, 11, 13852}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 116), Color.blue(0) + 25, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{22, 24, 17, 0, 23, 7, 5, 1, 2, 7, '\n', 3, 16, 11, 13834}, (byte) (99 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 15 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(biometricData);
        Object[] objArr3 = new Object[1];
        a(new char[]{13803}, (byte) (56 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTouchSlop() >> 8) + 1, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return string;
    }

    public X509NameTokenizer(@NotNull String str, @NotNull BiometricData biometricData) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(biometricData, BuildConfig.FLAVOR);
        this.onNavigationEvent = str;
        this.onExtraCallback = biometricData;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        boolean z;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) + 26, TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        boolean z2 = false;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                    int i5 = $11 + 23;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    z = z2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24823), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, (ViewConfiguration.getTouchSlop() >> 8) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i7 = $11 + 35;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                z = false;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, 19487 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                z = false;
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        z = false;
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            int i14 = $10 + 57;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                z2 = z;
                obj2 = obj;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            i16++;
            int i17 = $11 + 65;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr4);
    }
}
