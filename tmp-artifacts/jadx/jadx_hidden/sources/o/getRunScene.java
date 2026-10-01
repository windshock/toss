package o;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import kotlin.jvm.internal.Intrinsics;
import o.PKCS58;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class getRunScene {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult;
    private final String onExtraCallback;
    private final String onNavigationEvent;
    private static char[] onWarmupCompleted = {64960, 64961, 64910, 64923, 64927, 64983, 64976, 64965, 64991, 64987, 64982, 64967, 64992, 65022, 64988, 64964, 64963, 64915, 64986, 64962, 65019, 64922, 64990, 64978, 64970};
    private static char IAuthTabCallback = 51244;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRunScene)) {
            return false;
        }
        getRunScene getrunscene = (getRunScene) obj;
        if (Intrinsics.areEqual(this.onExtraCallback, getrunscene.onExtraCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, getrunscene.onNavigationEvent);
        }
        int i4 = onExtraCallbackWithResult + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallback.hashCode() * 31) + this.onNavigationEvent.hashCode();
        int i4 = asInterface + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.onExtraCallback;
        String str2 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{11, 7, 5, 14, 20, '\f', 23, 15, 1, '\n', 11, 4, 23, 14, '\n', '\t', '\r', 5, 4, 1, 7, 5, '\f', 20, '\f', 0}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26), 26 - KeyEvent.keyCodeFromString(""), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{2, 19, '\b', 20, '\f', 11, 13854}, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 118), 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{13757}, (byte) (10 - (ViewConfiguration.getTapTimeout() >> 16)), 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallbackWithResult + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public getRunScene(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallback = str;
        this.onNavigationEvent = str2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 9;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 99;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        char[] cArr3;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr4 = onWarmupCompleted;
        int i8 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr5[i9] = PKCS58.onNavigationEvent.z(cArr4[i9]);
            }
            cArr2 = cArr5;
        } else {
            cArr2 = cArr4;
        }
        char cZ = PKCS58.onNavigationEvent.z(IAuthTabCallback);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i10 = i - 1;
            cArr6[i10] = (char) (cArr[i10] - b);
            i2 = i10;
        } else {
            i2 = i;
        }
        int i11 = 1;
        if (i2 > 1) {
            int i12 = $11 + 25;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i11];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i13 = $10 + 21;
                    $11 = i13 % 128;
                    int i14 = i13 % i6;
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i11] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i11;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i8;
                } else {
                    i3 = i11;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i8;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i16 = $10 + 61;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                    } else {
                        int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i6 = 2;
                i11 = i3;
                i2 = i4;
                i8 = i5;
            }
        }
        char[] cArr7 = cArr6;
        int i22 = i8;
        int i23 = i22;
        while (i23 < i) {
            cArr7[i23] = (char) (cArr7[i23] ^ 13722);
            i23++;
            int i24 = $10 + 17;
            $11 = i24 % 128;
            int i25 = i24 % 2;
        }
        objArr[i22] = new String(cArr7);
    }
}
