package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getColorSpace {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getColorSpace[] $VALUES;
    public static final getColorSpace ACCOUNT_MEMBER;
    public static final getColorSpace ASSOCIATE_MEMBER;
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    public static final getColorSpace NOT_A_MEMBER;
    public static final getColorSpace UNKNOWN;
    private static int onExtraCallback;
    private static byte[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = r6 + 115
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = o.getColorSpace.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getColorSpace.$$c(byte, int, int):java.lang.String");
    }

    private static final /* synthetic */ getColorSpace[] $values() {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return new getColorSpace[]{ACCOUNT_MEMBER, ASSOCIATE_MEMBER, NOT_A_MEMBER, UNKNOWN};
        }
        getColorSpace getcolorspace = ACCOUNT_MEMBER;
        getColorSpace getcolorspace2 = ASSOCIATE_MEMBER;
        getColorSpace getcolorspace3 = NOT_A_MEMBER;
        getColorSpace getcolorspace4 = UNKNOWN;
        getColorSpace[] getcolorspaceArr = new getColorSpace[2];
        getcolorspaceArr[1] = getcolorspace;
        getcolorspaceArr[1] = getcolorspace2;
        getcolorspaceArr[2] = getcolorspace3;
        getcolorspaceArr[3] = getcolorspace4;
        return getcolorspaceArr;
    }

    public static EnumEntries<getColorSpace> getEntries() {
        EnumEntries<getColorSpace> enumEntries;
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 58 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 51;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getColorSpace valueOf(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getColorSpace getcolorspace = (getColorSpace) Enum.valueOf(getColorSpace.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return getcolorspace;
    }

    public static getColorSpace[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getColorSpace[] getcolorspaceArr = $VALUES;
        if (i3 == 0) {
            return (getColorSpace[]) getcolorspaceArr.clone();
        }
        int i4 = 82 / 0;
        return (getColorSpace[]) getcolorspaceArr.clone();
    }

    private getColorSpace(String str, int i) {
    }

    static {
        IAuthTabCallbackDefault = 0;
        IAuthTabCallback();
        ACCOUNT_MEMBER = new getColorSpace("ACCOUNT_MEMBER", 0);
        ASSOCIATE_MEMBER = new getColorSpace("ASSOCIATE_MEMBER", 1);
        NOT_A_MEMBER = new getColorSpace("NOT_A_MEMBER", 2);
        Object[] objArr = new Object[1];
        a((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (byte) ((-16777216) - Color.rgb(0, 0, 0)), 1636102138 + TextUtils.indexOf((CharSequence) "", '0', 0), (-1721827526) - TextUtils.lastIndexOf("", '0', 0), AndroidCharacter.getMirror('0') - 163, objArr);
        UNKNOWN = new getColorSpace(((String) objArr[0]).intern(), 3);
        getColorSpace[] getcolorspaceArr$values = $values();
        $VALUES = getcolorspaceArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getcolorspaceArr$values);
        int i = asBinder + 95;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.getDefaultSize(0, 0)), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 22438 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if ((i7 ^ 1) == 0) {
                byte[] bArr = onExtraCallbackWithResult;
                if (bArr != null) {
                    int i8 = $10 + 89;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $10 + 71;
                        $11 = i11 % 128;
                        if (i11 % i5 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 12843), 54 - TextUtils.lastIndexOf("", c), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 12843), ExpandableListView.getPackedPositionType(0L) + 55, 2167 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i10] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                        }
                        i10++;
                        i5 = 2;
                        c = '0';
                    }
                    int i12 = $11 + 85;
                    $10 = i12 % 128;
                    i4 = 2;
                    int i13 = i12 % 2;
                    bArr = bArr2;
                } else {
                    i4 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onExtraCallbackWithResult;
                    Object[] objArr5 = new Object[i4];
                    objArr5[1] = Integer.valueOf(onExtraCallback);
                    objArr5[0] = Integer.valueOf(i);
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 43424), TextUtils.indexOf((CharSequence) "", '0') + 43, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i7;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 86 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 9568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onExtraCallbackWithResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (bArr4[i14] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z)) {
                        byte[] bArr6 = onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = 977061903;
        onNavigationEvent = -1538795406;
        IAuthTabCallback = -1025058542;
        onExtraCallbackWithResult = new byte[]{-1, 0, 9, 11, -11, -15, 8};
    }
}
