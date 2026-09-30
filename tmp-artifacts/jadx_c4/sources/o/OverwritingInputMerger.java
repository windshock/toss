package o;

import im.toss.features.usshome.UssHomeItemAdapter$;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class OverwritingInputMerger {
    private static isFinished IAuthTabCallback = null;
    private static String IAuthTabCallbackDefault = null;
    private static String IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static String IAuthTabCallback_Parcel = null;
    private static final Charset access000;
    private static int access100 = 0;
    private static String asBinder = null;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static String onExtraCallback = null;
    public static final OverwritingInputMerger onExtraCallbackWithResult = new OverwritingInputMerger();
    private static isFinished onNavigationEvent = null;
    private static int onTransact = 0;
    private static String onWarmupCompleted = null;
    private static int readTypedObject = 1;

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i6 | i3 | (~i);
        int i8 = (~((~i6) | i3)) | (~(i6 | i));
        int i9 = (~(i | (~i3))) | i6;
        int i10 = i6 + i3 + i4 + ((-1069702238) * i2) + (1645725337 * i5);
        int i11 = i10 * i10;
        int i12 = ((i6 * 2084108943) - 1824784384) + (2084108943 * i3) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i4) + ((-1977090048) * i2) + (448004096 * i5) + (1807155200 * i11);
        int i13 = (i6 * (-999696423)) + 1136243370 + (i3 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i4 * (-999695593)) + (i2 * 636963214) + (i5 * (-1077364033)) + (i11 * 980484096);
        int i14 = i12 + (i13 * i13 * 1287192576);
        if (i14 == 1) {
            int i15 = 2 % 2;
            int i16 = access100 + 43;
            int i17 = i16 % 128;
            readTypedObject = i17;
            int i18 = i16 % 2;
            String str = onWarmupCompleted;
            int i19 = i17 + 111;
            access100 = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }
        if (i14 == 2) {
            return IAuthTabCallback(objArr);
        }
        OverwritingInputMerger overwritingInputMerger = (OverwritingInputMerger) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        isFinished isfinished = (isFinished) objArr[3];
        isFinished isfinished2 = (isFinished) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i21 = 2 % 2;
        int i22 = readTypedObject;
        int i23 = i22 + 75;
        access100 = i23 % 128;
        if (i23 % 2 == 0 ? (iIntValue3 & 1) != 0 : (iIntValue3 & 1) != 0) {
            int i24 = i22 + 51;
            access100 = i24 % 128;
            int i25 = i24 % 2;
            iIntValue = Integer.MAX_VALUE;
        }
        if ((iIntValue3 & 2) != 0) {
            iIntValue2 = -100;
        }
        overwritingInputMerger.onExtraCallback(iIntValue, iIntValue2, isfinished, isfinished2);
        int i26 = access100 + 1;
        readTypedObject = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    private OverwritingInputMerger() {
    }

    static {
        Charset charsetForName = Charset.forName("utf-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "");
        access000 = charsetForName;
        onExtraCallback = "friends";
        IAuthTabCallbackStub = "viva";
        onWarmupCompleted = "d";
        asBinder = "e";
        IAuthTabCallbackDefault = "2d9285ef-961c-4dbf-bc13-cb712d0ac18a";
        IAuthTabCallback_Parcel = "";
        asInterface = Integer.MAX_VALUE;
        onTransact = -100;
        isFinished isfinished = isFinished.MEDIUM;
        onNavigationEvent = isfinished;
        IAuthTabCallback = isfinished;
        int i = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public final Charset IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 111;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        Charset charset = access000;
        int i5 = i3 + 17;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return charset;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final String asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = access100 + 79;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            str = IAuthTabCallbackStub;
            int i4 = 73 / 0;
        } else {
            str = IAuthTabCallbackStub;
        }
        int i5 = i3 + 67;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        String str = asBinder;
        int i5 = i3 + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 89;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = IAuthTabCallbackDefault;
        int i4 = i3 + 95;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = access100 + 85;
        int i3 = i2 % 128;
        readTypedObject = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = IAuthTabCallback_Parcel;
        int i4 = i3 + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback_Parcel = str;
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback_Parcel = str;
        }
        int i4 = readTypedObject + 5;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onTransact() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = onTransact;
        int i5 = i3 + 65;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return Integer.valueOf(i4);
    }

    public final isFinished onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        isFinished isfinished = onNavigationEvent;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return isfinished;
    }

    public final isFinished onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        isFinished isfinished = IAuthTabCallback;
        int i4 = i3 + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return isfinished;
        }
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onExtraCallback = str;
        IAuthTabCallbackStub = str2;
        IAuthTabCallbackDefault = str3;
        int i4 = access100 + 55;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public final void onExtraCallback(int i, int i2, @NotNull isFinished isfinished, @NotNull isFinished isfinished2) {
        int i3 = 2 % 2;
        int i4 = readTypedObject + 91;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isfinished, "");
            Intrinsics.checkNotNullParameter(isfinished2, "");
            asInterface = i;
            onTransact = i2;
            onNavigationEvent = isfinished;
            IAuthTabCallback = isfinished2;
            return;
        }
        Intrinsics.checkNotNullParameter(isfinished, "");
        Intrinsics.checkNotNullParameter(isfinished2, "");
        asInterface = i;
        onTransact = i2;
        onNavigationEvent = isfinished;
        IAuthTabCallback = isfinished2;
        int i5 = 68 / 0;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback_Parcel = str;
        int i4 = readTypedObject + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        String str = IAuthTabCallback_Parcel;
        int i5 = i3 + 87;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public static /* synthetic */ void onExtraCallback(OverwritingInputMerger overwritingInputMerger, int i, int i2, isFinished isfinished, isFinished isfinished2, int i3, Object obj) {
        Object[] objArr = {overwritingInputMerger, Integer.valueOf(i), Integer.valueOf(i2), isfinished, isfinished2, Integer.valueOf(i3), obj};
        onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1000146761, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), objArr, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1000146761);
    }

    public final String onNavigationEvent() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return (String) onNavigationEvent(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1316568974, iOnWarmupCompleted2, new Object[]{this}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1316568973);
    }

    public final int asBinder() {
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        return ((Integer) onNavigationEvent(iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), 1807848670, iOnWarmupCompleted2, new Object[]{this}, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), -1807848668)).intValue();
    }
}
