package im.toss.global.features.leave.test;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.PKCS58;
import o.s3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
final class GlobalLeaveTestActivity$onWarmupCompleted {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private static char[] onExtraCallback = {64970, 64973, 64984, 64923, 65020, 64988, 64985, 64927, 64991, 65022, 64964, 64975, 65010, 64965, 64966, 64987, 64922, 64967, 64962, 64976, 65008, 64960, 64915, 64992, 64961, 64986, 64910, 64989, 64972, 64963, 64978, 64990, 65009, 64974, 64982, 64995};
    private static char onTransact = 51247;
    private final String IAuthTabCallback;
    private final Long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalLeaveTestActivity$onWarmupCompleted)) {
            return false;
        }
        GlobalLeaveTestActivity$onWarmupCompleted globalLeaveTestActivity$onWarmupCompleted = (GlobalLeaveTestActivity$onWarmupCompleted) obj;
        if (this.onWarmupCompleted != globalLeaveTestActivity$onWarmupCompleted.onWarmupCompleted) {
            int i5 = i2 + 85;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, globalLeaveTestActivity$onWarmupCompleted.IAuthTabCallback)) {
            int i7 = IAuthTabCallbackDefault + 79;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, globalLeaveTestActivity$onWarmupCompleted.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, globalLeaveTestActivity$onWarmupCompleted.onNavigationEvent)) {
            return true;
        }
        int i9 = IAuthTabCallbackDefault + 99;
        int i10 = i9 % 128;
        IAuthTabCallbackStub = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 45;
        IAuthTabCallbackDefault = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 68 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.onWarmupCompleted);
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        Long l = this.onExtraCallbackWithResult;
        int iHashCode4 = 0;
        if (l == null) {
            int i2 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = IAuthTabCallbackStub + 29;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 2;
            }
        }
        String str = this.onNavigationEvent;
        if (str != null) {
            int i6 = IAuthTabCallbackStub + 73;
            IAuthTabCallbackDefault = i6 % 128;
            if (i6 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode4 = str.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        long j = this.onWarmupCompleted;
        String str = this.IAuthTabCallback;
        Long l = this.onExtraCallbackWithResult;
        String str2 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{5, 11, 26, 28, 14, '#', ' ', 6, '!', 24, 22, 31, 29, 23, '#', '\f', 15, 20, 0, '!', '#', 1, 15, 26, 15, 11, 31, 25, 29, 0, 20, 27}, (byte) (114 - Drawable.resolveOpacity(0, 0)), (-16777184) - Color.rgb(0, 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(j);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\n', 19, 20, '\r', 13909, 13909, '!', 28, 18, 1, 13844}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 109), 11 - View.resolveSize(0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str);
        Object[] objArr3 = new Object[1];
        a(new char[]{'\n', 19, 1, 31, 28, 26, ' ', '\r', ' ', 19, '!', 18, 16, 3, 15, '\f', '\r', 30, 2, 17, 29, 15, 7, 27, 18, 25, 3, 23, 13802}, (byte) (66 - ExpandableListView.getPackedPositionChild(0L)), 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(l);
        Object[] objArr4 = new Object[1];
        a(new char[]{'\n', 19, 1, 31, 28, 26, ' ', '\r', ' ', 19, '!', 18, 16, 3, 15, '\f', 26, 20, 13893, 13893, '!', 28, 18, 1, 13828}, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 93), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str2);
        Object[] objArr5 = new Object[1];
        a(new char[]{13757}, (byte) (Color.argb(0, 0, 0, 0) + 10), 1 - (Process.myTid() >> 22), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return string;
    }

    public GlobalLeaveTestActivity$onWarmupCompleted(long j, @NotNull String str, @Nullable Long l, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = l;
        this.onNavigationEvent = str2;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 7;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 != 0) {
            str = this.IAuthTabCallback;
            int i4 = 2 / 0;
        } else {
            str = this.IAuthTabCallback;
        }
        int i5 = i3 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final Long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Long l = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return l;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 33;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 3;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        int i4;
        int i5;
        int length;
        char[] cArr4;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr5 = onExtraCallback;
        int i9 = 0;
        int i10 = 1;
        if (cArr5 != null) {
            int i11 = $10 + 65;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 1;
            } else {
                length = cArr5.length;
                cArr4 = new char[length];
                i6 = 0;
            }
            while (i6 < length) {
                cArr4[i6] = PKCS58.onNavigationEvent.z(cArr5[i6]);
                i6++;
            }
            cArr2 = cArr4;
        } else {
            cArr2 = cArr5;
        }
        char cZ = PKCS58.onNavigationEvent.z(onTransact);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i12 = i - 1;
            cArr6[i12] = (char) (cArr[i12] - b);
            i2 = i12;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i13 = $11 + 29;
                $10 = i13 % 128;
                int i14 = i13 % i7;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i15 = $11 + 63;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i10] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i10;
                    i5 = i9;
                } else {
                    i3 = i2;
                    cArr3 = cArr6;
                    i4 = i10;
                    i5 = i9;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
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
                i2 = i3;
                i10 = i4;
                i9 = i5;
                i7 = 2;
            }
        }
        char[] cArr7 = cArr6;
        int i22 = i9;
        int i23 = i22;
        while (i23 < i) {
            int i24 = $11 + 53;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                cArr7[i23] = (char) (cArr7[i23] ^ 15563);
                i23 += 81;
            } else {
                cArr7[i23] = (char) (cArr7[i23] ^ 13722);
                i23++;
            }
        }
        objArr[i22] = new String(cArr7);
    }
}
