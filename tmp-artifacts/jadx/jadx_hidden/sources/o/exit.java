package o;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import kotlin.enums.EnumEntries;
import o.PKCS58;
import o.s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class exit {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ exit[] $VALUES;
    public static final exit APP_SCHEME;
    public static final exit HIDDEN_LAB;
    private static int IAuthTabCallback = 1;
    public static final exit UNIVERSAL_LINK;
    public static final exit VISIBLE_WEB;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;

    private static final /* synthetic */ exit[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        exit[] exitVarArr = {UNIVERSAL_LINK, APP_SCHEME, VISIBLE_WEB, HIDDEN_LAB};
        int i5 = i2 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return exitVarArr;
    }

    public static EnumEntries<exit> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static exit valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        exit exitVar = (exit) Enum.valueOf(exit.class, str);
        if (i3 != 0) {
            return exitVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static exit[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        exit[] exitVarArr = (exit[]) $VALUES.clone();
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return exitVarArr;
    }

    private exit(String str, int i) {
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{19, 6, 18, '\f', 6, '\r', 3, 21, 20, 14, 22, 19, 7, 14}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 69), '>' - AndroidCharacter.getMirror('0'), objArr);
        UNIVERSAL_LINK = new exit(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(new char[]{22, '\b', 5, '\f', 3, 16, 18, 5, '\r', '\t'}, (byte) (14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        APP_SCHEME = new exit(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a(new char[]{'\f', 18, 2, 16, '\t', 20, 5, '\r', '\b', '\r', 13875}, (byte) (91 - (Process.myPid() >> 22)), 11 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        VISIBLE_WEB = new exit(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        a(new char[]{16, 18, 13815, 13815, '\t', 5, 14, 20, 20, '\b'}, (byte) ((-16777191) - Color.rgb(0, 0, 0)), 9 - Process.getGidForName(""), objArr4);
        HIDDEN_LAB = new exit(((String) objArr4[0]).intern(), 3);
        exit[] exitVarArr$values = $values();
        $VALUES = exitVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(exitVarArr$values);
        int i = onExtraCallbackWithResult + 27;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr3;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr4 = onWarmupCompleted;
        int i7 = 0;
        if (cArr4 != null) {
            int i8 = $11 + 17;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $11 + 117;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr5[i10] = PKCS58.onNavigationEvent.z(cArr4[i10]);
                } else {
                    cArr5[i10] = PKCS58.onNavigationEvent.z(cArr4[i10]);
                    i10++;
                }
            }
            cArr2 = cArr5;
        } else {
            cArr2 = cArr4;
        }
        char cZ = PKCS58.onNavigationEvent.z(onExtraCallback);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i12 = i - 1;
            cArr6[i12] = (char) (cArr[i12] - b);
            i2 = i12;
        } else {
            i2 = i;
        }
        int i13 = 1;
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i13];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i13] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i13;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i7;
                } else {
                    i3 = i13;
                    i4 = i2;
                    char[] cArr7 = cArr6;
                    i5 = i7;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i14 = $11 + 115;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3 = cArr7;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                    } else {
                        cArr3 = cArr7;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                int i21 = $10 + 35;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr6 = cArr3;
                i13 = i3;
                i2 = i4;
                i7 = i5;
            }
        }
        char[] cArr8 = cArr6;
        int i23 = i7;
        for (int i24 = i23; i24 < i; i24++) {
            int i25 = $10 + 5;
            $11 = i25 % 128;
            int i26 = i25 % 2;
            cArr8[i24] = (char) (cArr8[i24] ^ 13722);
        }
        objArr[i23] = new String(cArr8);
    }

    static void onExtraCallback() {
        onWarmupCompleted = new char[]{51240, 64992, 51245, 64996, 51246, 65009, 65015, 64995, 65014, 65021, 65004, 64993, 65016, 64997, 65022, 65019, 64998, 65018, 65008, 51247, 51244, 51243, 51242, 65010, 65023};
        onExtraCallback = (char) 51244;
    }
}
