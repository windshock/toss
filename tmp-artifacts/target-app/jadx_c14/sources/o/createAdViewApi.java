package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createAdViewApi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ createAdViewApi[] $VALUES;
    private static byte[] IAuthTabCallback;
    public static final createAdViewApi PKCS1;
    public static final createAdViewApi PKCS1_OAEP;
    private static int asBinder;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static short[] onWarmupCompleted;
    private final String value;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 3
            int r7 = 115 - r7
            byte[] r1 = o.createAdViewApi.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createAdViewApi.$$c(int, int, int):java.lang.String");
    }

    private static final /* synthetic */ createAdViewApi[] $values() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        createAdViewApi createadviewapi = PKCS1;
        if (i3 != 0) {
            return new createAdViewApi[]{createadviewapi, PKCS1_OAEP};
        }
        createAdViewApi createadviewapi2 = PKCS1_OAEP;
        createAdViewApi[] createadviewapiArr = new createAdViewApi[3];
        createadviewapiArr[1] = createadviewapi;
        createadviewapiArr[0] = createadviewapi2;
        return createadviewapiArr;
    }

    public static EnumEntries<createAdViewApi> getEntries() {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static createAdViewApi valueOf(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        createAdViewApi createadviewapi = (createAdViewApi) Enum.valueOf(createAdViewApi.class, str);
        int i4 = IAuthTabCallbackStub + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return createadviewapi;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static createAdViewApi[] values() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        createAdViewApi[] createadviewapiArr = (createAdViewApi[]) $VALUES.clone();
        int i3 = asInterface + 71;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return createadviewapiArr;
    }

    private createAdViewApi(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 99;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 123;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        asBinder = 1;
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (TextUtils.indexOf("", "", 0) - 102), (-419915864) - TextUtils.indexOf("", ""), 848186025 + ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 5, objArr);
        PKCS1 = new createAdViewApi("PKCS1", 0, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) (88 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 419915846, ExpandableListView.getPackedPositionType(0L) + 848186024, 19 - MotionEvent.axisFromString(""), objArr2);
        PKCS1_OAEP = new createAdViewApi("PKCS1_OAEP", 1, ((String) objArr2[0]).intern());
        createAdViewApi[] createadviewapiArr$values = $values();
        $VALUES = createadviewapiArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(createadviewapiArr$values);
        int i = onTransact + 69;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 43424), 42 - TextUtils.getTrimmedLength(""), Color.red(0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 == 1) {
                int i7 = $11 + 65;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr2 = IAuthTabCallback;
                char c = '0';
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = $11 + 91;
                        $10 = i10 % 128;
                        int i11 = i10 % i4;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char bitsPerPixel = (char) (12842 - ImageFormat.getBitsPerPixel(0));
                                int iIndexOf = 54 - TextUtils.indexOf("", c);
                                int iIndexOf2 = 2166 - TextUtils.indexOf("", c, 0, 0);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(bitsPerPixel, iIndexOf, iIndexOf2, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i9++;
                            int i12 = $10 + 9;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            i4 = 2;
                            c = '0';
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.alpha(0) + 42, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i14 = $10 + 53;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i6;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 87, 9567 - (ViewConfiguration.getPressedStateDuration() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr5 = IAuthTabCallback;
                    if (bArr5 != null) {
                        int i16 = $10 + 99;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                        }
                        int i17 = 0;
                        while (i17 < length) {
                            bArr[i17] = (byte) (bArr5[i17] ^ (-4629411779493505016L));
                            i17++;
                            int i18 = $10 + 69;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i19 = 3 % 2;
                            }
                        }
                        bArr5 = bArr;
                    }
                    boolean z = bArr5 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    int i20 = $11 + 1;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i22 = $11 + 19;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        if (z) {
                            byte[] bArr6 = IAuthTabCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallback = -1119834032;
        onNavigationEvent = -1538795513;
        onExtraCallbackWithResult = 1765174690;
        IAuthTabCallback = new byte[]{107, -105, -105, -110, -111, -125, -115, 76, -126, 106, 105, -77, Byte.MAX_VALUE, 109, 108, -124, 124, 124, -109, -87, 85, 85, 80, 83, 65, 79, -69, -81, -86, -71, -90, 125, 64, 84, -68, -87, -91, -69, -92, 91, 66, 87, 91, 84, -94, 112, -67, -81, -82, 70, -66, -66, 81, 8, 8};
    }
}
