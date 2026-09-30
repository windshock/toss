package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import kotlin.enums.EnumEntries;
import o.PKCS58;
import o.s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RoundCornerProgressBar {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RoundCornerProgressBar[] $VALUES;
    public static final RoundCornerProgressBar CLEAR;
    public static final RoundCornerProgressBar EXIT;
    private static int IAuthTabCallback = 0;
    public static final RoundCornerProgressBar NONE;
    private static int asBinder = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;
    private final int priority;

    private static final /* synthetic */ RoundCornerProgressBar[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        RoundCornerProgressBar roundCornerProgressBar = CLEAR;
        if (i3 == 0) {
            return new RoundCornerProgressBar[]{roundCornerProgressBar, EXIT, NONE};
        }
        RoundCornerProgressBar roundCornerProgressBar2 = EXIT;
        RoundCornerProgressBar roundCornerProgressBar3 = NONE;
        RoundCornerProgressBar[] roundCornerProgressBarArr = new RoundCornerProgressBar[3];
        roundCornerProgressBarArr[1] = roundCornerProgressBar;
        roundCornerProgressBarArr[0] = roundCornerProgressBar2;
        roundCornerProgressBarArr[5] = roundCornerProgressBar3;
        return roundCornerProgressBarArr;
    }

    public static EnumEntries<RoundCornerProgressBar> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<RoundCornerProgressBar> enumEntries = $ENTRIES;
        int i5 = i3 + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static RoundCornerProgressBar valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        RoundCornerProgressBar roundCornerProgressBar = (RoundCornerProgressBar) Enum.valueOf(RoundCornerProgressBar.class, str);
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return roundCornerProgressBar;
    }

    public static RoundCornerProgressBar[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        RoundCornerProgressBar[] roundCornerProgressBarArr = (RoundCornerProgressBar[]) $VALUES.clone();
        int i3 = onNavigationEvent + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
        return roundCornerProgressBarArr;
    }

    private RoundCornerProgressBar(String str, int i, int i2) {
        this.priority = i2;
    }

    public final int getPriority() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.priority;
            int i5 = 57 / 0;
        } else {
            i = this.priority;
        }
        int i6 = i3 + 73;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 52 / 0;
        }
        return i;
    }

    static {
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(new char[]{4, '\r', '\n', '\r', 13776}, (byte) (9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 5, objArr);
        CLEAR = new RoundCornerProgressBar(((String) objArr[0]).intern(), 0, 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 1, 11, 14}, (byte) (113 - View.getDefaultSize(0, 0)), 4 - View.MeasureSpec.getSize(0), objArr2);
        EXIT = new RoundCornerProgressBar(((String) objArr2[0]).intern(), 1, 1);
        Object[] objArr3 = new Object[1];
        a(new char[]{0, 3, 1, 11}, (byte) (KeyEvent.getDeadChar(0, 0) + 58), 4 - TextUtils.getOffsetBefore("", 0), objArr3);
        NONE = new RoundCornerProgressBar(((String) objArr3[0]).intern(), 2, 0);
        RoundCornerProgressBar[] roundCornerProgressBarArr$values = $values();
        $VALUES = roundCornerProgressBarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(roundCornerProgressBarArr$values);
        int i = onExtraCallbackWithResult + 95;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        char[] cArr3;
        int i5;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr4 = onWarmupCompleted;
        int i7 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                cArr5[i8] = PKCS58.onNavigationEvent.z(cArr4[i8]);
                i8++;
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2 = cArr5;
        } else {
            cArr2 = cArr4;
        }
        char cZ = PKCS58.onNavigationEvent.z(onExtraCallback);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i11 = i - 1;
            cArr6[i11] = (char) (cArr[i11] - b);
            i2 = i11;
        } else {
            i2 = i;
        }
        int i12 = 1;
        if (i2 > 1) {
            int i13 = $11 + 19;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $10 + 115;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i12;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i7;
                } else {
                    i3 = i12;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i7;
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
                i12 = i3;
                i2 = i4;
                i7 = i5;
            }
        }
        char[] cArr7 = cArr6;
        int i22 = i7;
        for (int i23 = i22; i23 < i; i23++) {
            int i24 = $11 + 123;
            $10 = i24 % 128;
            int i25 = i24 % 2;
            cArr7[i23] = (char) (cArr7[i23] ^ 13722);
        }
        objArr[i22] = new String(cArr7);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{65003, 65005, 65020, 65021, 65007, 65008, 64993, 65002, 65006, 65014, 65018, 64992, 65023, 65004, 65010, 64999};
        onExtraCallback = (char) 51245;
    }
}
