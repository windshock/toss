package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class changeVideoState {
    private static short[] onWarmupCompleted;
    private final boolean allowComments;
    private final boolean allowSpecialFloatingPointValues;
    private final boolean allowStructuredMapKeys;
    private final boolean allowTrailingComma;
    private final String classDiscriminator;
    private wwx2 classDiscriminatorMode;
    private final boolean coerceInputValues;
    private final boolean decodeEnumsCaseInsensitive;
    private final boolean encodeDefaults;
    private final boolean explicitNulls;
    private final boolean ignoreUnknownKeys;
    private final boolean isLenient;
    private final dyycx namingStrategy;
    private final boolean prettyPrint;
    private final String prettyPrintIndent;
    private final boolean useAlternativeNames;
    private final boolean useArrayPolymorphism;
    private static final byte[] $$a = {19, 50, -9, 119};
    private static final int $$b = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = -943130256;
    private static int onExtraCallback = -1538795410;
    private static int onExtraCallbackWithResult = 1217687090;
    private static byte[] onNavigationEvent = {-78, -80, 34, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        int i4 = (s * 2) + 4;
        int i5 = b * 3;
        int i6 = (i * 3) + 115;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i4;
            i6 += i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i3];
            i8 = i3;
            i6 += i7;
            i3 = i8 + 1;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            bArr2[i2] = (byte) i6;
            if (i2 == i5) {
            }
        }
    }

    public changeVideoState() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = (~i3) | i8;
        int i10 = i7 | (~i9);
        int i11 = i3 | i8;
        int i12 = ~(i9 | i4);
        int i13 = i + i4 + i5 + (1075552530 * i6) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i) - 1639710720) + ((-2116975300) * i4) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i5) + ((-189792256) * i6) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i * 251836610) + 257048825 + (i4 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i5 * 251837547) + (i6 * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public changeVideoState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String str, boolean z7, boolean z8, @NotNull String str2, boolean z9, boolean z10, @Nullable dyycx dyycxVar, boolean z11, boolean z12, boolean z13, @NotNull wwx2 wwx2Var) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(wwx2Var, "");
        this.encodeDefaults = z;
        this.ignoreUnknownKeys = z2;
        this.isLenient = z3;
        this.allowStructuredMapKeys = z4;
        this.prettyPrint = z5;
        this.explicitNulls = z6;
        this.prettyPrintIndent = str;
        this.coerceInputValues = z7;
        this.useArrayPolymorphism = z8;
        this.classDiscriminator = str2;
        this.allowSpecialFloatingPointValues = z9;
        this.useAlternativeNames = z10;
        this.namingStrategy = dyycxVar;
        this.decodeEnumsCaseInsensitive = z11;
        this.allowTrailingComma = z12;
        this.allowComments = z13;
        this.classDiscriminatorMode = wwx2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ changeVideoState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, dyycx dyycxVar, boolean z11, boolean z12, boolean z13, wwx2 wwx2Var, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str3;
        boolean z18;
        boolean z19;
        String strIntern;
        boolean z20;
        boolean z21;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z14 = false;
        } else {
            z14 = z;
        }
        if ((i & 2) != 0) {
            int i3 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            z15 = false;
        } else {
            z15 = z2;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            z16 = false;
        } else {
            z16 = z3;
        }
        boolean z22 = (i & 8) != 0 ? false : z4;
        boolean z23 = (i & 16) != 0 ? false : z5;
        boolean z24 = true;
        if ((i & 32) != 0) {
            int i6 = IAuthTabCallbackStub + 97;
            asInterface = i6 % 128;
            z17 = i6 % 2 != 0;
        } else {
            z17 = z6;
        }
        if ((i & 64) != 0) {
            int i7 = IAuthTabCallbackStub + 99;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str3 = "    ";
        } else {
            str3 = str;
        }
        boolean z25 = (i & 128) != 0 ? false : z7;
        if ((i & 256) != 0) {
            int i9 = asInterface + 67;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            z18 = false;
        } else {
            z18 = z8;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            Object[] objArr = new Object[1];
            a((short) (17 - Drawable.resolveOpacity(0, 0)), (byte) (62 - View.getDefaultSize(0, 0)), (-1670324601) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 321669690 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 97, objArr);
            z19 = false;
            strIntern = ((String) objArr[0]).intern();
        } else {
            z19 = false;
            strIntern = str2;
        }
        if ((i & 1024) != 0) {
            int i11 = asInterface + 73;
            IAuthTabCallbackStub = i11 % 128;
            int i12 = i11 % 2;
            z20 = z19;
        } else {
            z20 = z9;
        }
        if ((i & 2048) != 0) {
            int i13 = asInterface + 71;
            IAuthTabCallbackStub = i13 % 128;
            int i14 = i13 % 2;
        } else {
            z24 = z10;
        }
        dyycx dyycxVar2 = (i & 4096) != 0 ? null : dyycxVar;
        if ((i & TTHistoryActivity2.SIZE) != 0) {
            int i15 = asInterface + 51;
            IAuthTabCallbackStub = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            z21 = false;
        } else {
            z21 = z11;
        }
        this(z14, z15, z16, z22, z23, z17, str3, z25, z18, strIntern, z20, z24, dyycxVar2, z21, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12, (i & 32768) != 0 ? false : z13, (i & Imgproc.FLOODFILL_FIXED_RANGE) != 0 ? wwx2.POLYMORPHIC : wwx2Var);
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        asInterface = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.encodeDefaults;
        int i4 = i2 + 43;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean access000() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ignoreUnknownKeys;
        int i4 = i3 + 71;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        changeVideoState changevideostate = (changeVideoState) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z = changevideostate.isLenient;
        if (i3 != 0) {
            return Boolean.valueOf(z);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        boolean z = this.allowStructuredMapKeys;
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.prettyPrint;
        int i5 = i3 + 107;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.explicitNulls;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return z;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        changeVideoState changevideostate = (changeVideoState) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = changevideostate.prettyPrintIndent;
        int i5 = i2 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 57;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.coerceInputValues;
        int i5 = i2 + 65;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.useArrayPolymorphism;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        changeVideoState changevideostate = (changeVideoState) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 97;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = changevideostate.classDiscriminator;
        int i5 = i2 + 13;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 53;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.allowSpecialFloatingPointValues;
        int i4 = i2 + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.useAlternativeNames;
        int i5 = i2 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final dyycx access100() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        dyycx dyycxVar = this.namingStrategy;
        int i5 = i2 + 65;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return dyycxVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 41;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.decodeEnumsCaseInsensitive;
        int i5 = i2 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 11;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.allowTrailingComma;
        int i5 = i3 + 81;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 49;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.allowComments;
        int i4 = i2 + 81;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final wwx2 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        wwx2 wwx2Var = this.classDiscriminatorMode;
        int i5 = i2 + 91;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return wwx2Var;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "JsonConfiguration(encodeDefaults=" + this.encodeDefaults + ", ignoreUnknownKeys=" + this.ignoreUnknownKeys + ", isLenient=" + this.isLenient + ", allowStructuredMapKeys=" + this.allowStructuredMapKeys + ", prettyPrint=" + this.prettyPrint + ", explicitNulls=" + this.explicitNulls + ", prettyPrintIndent='" + this.prettyPrintIndent + "', coerceInputValues=" + this.coerceInputValues + ", useArrayPolymorphism=" + this.useArrayPolymorphism + ", classDiscriminator='" + this.classDiscriminator + "', allowSpecialFloatingPointValues=" + this.allowSpecialFloatingPointValues + ", useAlternativeNames=" + this.useAlternativeNames + ", namingStrategy=" + this.namingStrategy + ", decodeEnumsCaseInsensitive=" + this.decodeEnumsCaseInsensitive + ", allowTrailingComma=" + this.allowTrailingComma + ", allowComments=" + this.allowComments + ", classDiscriminatorMode=" + this.classDiscriminatorMode + ')';
        int i2 = asInterface + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x036c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021b A[PHI: r0
      0x021b: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:56:0x0219, B:53:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0225 A[PHI: r0
      0x0225: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:56:0x0219, B:53:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6;
        byte b2;
        long j;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ExpandableListView.getPackedPositionType(0L)), 42 - KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 22439 - Drawable.resolveOpacity(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue != -1;
            boolean z2 = !z;
            if (!z) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 12843), 55 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), 2167 - (KeyEvent.getMaxKeyCode() >> 16), -299036574, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    iIntValue = (short) (((short) (onWarmupCompleted[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    int i9 = $11 + 35;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        byte[] bArr3 = onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 43425), KeyEvent.getDeadChar(0, 0) + 42, 22439 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            b2 = (byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] * (-4629411779493505016L));
                            j = onExtraCallback | (-4629411779493505016L);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr4 = onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.alpha(0)), 42 - KeyEvent.normalizeMetaState(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L));
                        j = onExtraCallback ^ (-4629411779493505016L);
                    }
                    iIntValue = (byte) (b2 + ((int) j));
                }
            }
            if (iIntValue > 0) {
                int i10 = $11 + 87;
                int i11 = i10 % 128;
                $10 = i11;
                if (i10 % 2 != 0) {
                    i4 = ((i * iIntValue) >> 3) - ((int) (IAuthTabCallback % (-4629411779493505016L)));
                    if (z2) {
                        int i12 = i11 + 35;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z2) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 86 - View.resolveSize(0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onNavigationEvent;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i14 = $10 + 57;
                    $11 = i14 % 128;
                    int i15 = 2;
                    int i16 = i14 % 2;
                    int i17 = 0;
                    while (i17 < length2) {
                        int i18 = $10 + 37;
                        $11 = i18 % 128;
                        if (i18 % i15 == 0) {
                            bArr6[i17] = (byte) (bArr5[i17] % (-4629411779493505016L));
                            i17 >>= 1;
                        } else {
                            bArr6[i17] = (byte) (bArr5[i17] ^ (-4629411779493505016L));
                            i17++;
                        }
                        i15 = 2;
                    }
                    bArr5 = bArr6;
                }
                boolean z3 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z3)) {
                        int i19 = $11 + 85;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            byte[] bArr7 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent % 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr7[r9] % (-4629411779493505016L))) - s)) ^ b));
                        } else {
                            byte[] bArr8 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr8[r9] ^ (-4629411779493505016L))) + s)) ^ b));
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                            i6 = $10 + 123;
                            $11 = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i20 = 3 % 4;
                            }
                        }
                    } else {
                        short[] sArr = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r9] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i21 = $11 + 125;
                        $10 = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    i6 = $10 + 123;
                    $11 = i6 % 128;
                    if (i6 % 2 != 0) {
                    }
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (String) onExtraCallback(-1254650746, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1254650746, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    public final String IAuthTabCallback_Parcel() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (String) onExtraCallback(309595837, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -309595836, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult3);
    }

    public final boolean extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1913675562, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult3)).booleanValue();
    }
}
