package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BASE64_DECODER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ry5 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ ry5[] $VALUES;
    public static final ry5 BASE64_DECODER;
    public static final ry5 BASE64_ENCODER;
    public static final ry5 CONST;
    public static final ry5 DATE;
    public static final ry5 DNS;
    public static final ry5 ENVIRONMENT;
    public static final ry5 FILE;
    private static int IAuthTabCallback = 1;
    public static final ry5 JAVA;
    public static final ry5 LOCAL_HOST;
    public static final ry5 PROPERTIES;
    public static final ry5 RESOURCE_BUNDLE;
    public static final ry5 SCRIPT;
    public static final ry5 SYSTEM_PROPERTIES;
    public static final ry5 URL;
    public static final ry5 URL_DECODER;
    public static final ry5 URL_ENCODER;
    public static final ry5 XML;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String key;
    private final zb7 lookup;

    public static ry5 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ry5 ry5Var = (ry5) Enum.valueOf(ry5.class, str);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return ry5Var;
    }

    public static ry5[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ry5[] ry5VarArr = (ry5[]) $VALUES.clone();
        int i4 = onExtraCallback + 61;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return ry5VarArr;
    }

    static {
        onWarmupCompleted();
        initListener initlistener = initListener.IAuthTabCallback;
        ry5 ry5Var = new ry5("BASE64_DECODER", 0, "base64Decoder", initlistener.IAuthTabCallback());
        BASE64_DECODER = ry5Var;
        ry5 ry5Var2 = new ry5("BASE64_ENCODER", 1, "base64Encoder", initlistener.onExtraCallbackWithResult());
        BASE64_ENCODER = ry5Var2;
        ry5 ry5Var3 = new ry5("CONST", 2, "const", initlistener.onExtraCallback());
        CONST = ry5Var3;
        ry5 ry5Var4 = new ry5("DATE", 3, "date", initlistener.onWarmupCompleted());
        DATE = ry5Var4;
        ry5 ry5Var5 = new ry5("DNS", 4, "dns", initlistener.onNavigationEvent());
        DNS = ry5Var5;
        ry5 ry5Var6 = new ry5("ENVIRONMENT", 5, "env", initlistener.IAuthTabCallbackDefault());
        ENVIRONMENT = ry5Var6;
        ry5 ry5Var7 = new ry5("FILE", 6, "file", initlistener.IAuthTabCallbackStub());
        FILE = ry5Var7;
        ry5 ry5Var8 = new ry5("JAVA", 7, "java", initlistener.onTransact());
        JAVA = ry5Var8;
        ry5 ry5Var9 = new ry5("LOCAL_HOST", 8, "localhost", initlistener.asInterface());
        LOCAL_HOST = ry5Var9;
        ry5 ry5Var10 = new ry5("PROPERTIES", 9, "properties", initlistener.asBinder());
        PROPERTIES = ry5Var10;
        ry5 ry5Var11 = new ry5("RESOURCE_BUNDLE", 10, "resourceBundle", initlistener.IAuthTabCallback_Parcel());
        RESOURCE_BUNDLE = ry5Var11;
        ry5 ry5Var12 = new ry5("SCRIPT", 11, "script", initlistener.access100());
        SCRIPT = ry5Var12;
        ry5 ry5Var13 = new ry5("SYSTEM_PROPERTIES", 12, "sys", initlistener.getInterfaceDescriptor());
        SYSTEM_PROPERTIES = ry5Var13;
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 1}, false, new byte[]{0, 1, 1}, objArr);
        ry5 ry5Var14 = new ry5("URL", 13, ((String) objArr[0]).intern(), initlistener.extraCallbackWithResult());
        URL = ry5Var14;
        ry5 ry5Var15 = new ry5("URL_DECODER", 14, "urlDecoder", initlistener.access000());
        URL_DECODER = ry5Var15;
        ry5 ry5Var16 = new ry5("URL_ENCODER", 15, "urlEncoder", initlistener.IAuthTabCallbackStubProxy());
        URL_ENCODER = ry5Var16;
        ry5 ry5Var17 = new ry5("XML", 16, "xml", initlistener.extraCallback());
        XML = ry5Var17;
        $VALUES = new ry5[]{ry5Var, ry5Var2, ry5Var3, ry5Var4, ry5Var5, ry5Var6, ry5Var7, ry5Var8, ry5Var9, ry5Var10, ry5Var11, ry5Var12, ry5Var13, ry5Var14, ry5Var15, ry5Var16, ry5Var17};
        int i = IAuthTabCallback + 57;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    private ry5(String str, int i, String str2, zb7 zb7Var) {
        this.key = str2;
        this.lookup = zb7Var;
    }

    public String getKey() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public zb7 getStringLookup() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zb7 zb7Var = this.lookup;
        int i4 = i3 + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zb7Var;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.resolveSize(0, 0)), 35 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 14239 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 105;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.resolveSize(0, 0)), View.resolveSize(0, 0) + 65, 16718 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17657 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i12 = $11 + 97;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.green(0) + 70, 12486 - Color.blue(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (!z) {
            i = 2;
        } else {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i15 = $10 + 57;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
            i = 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $11 + 67;
            $10 = i17 % 128;
            int i18 = i17 % i;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[i]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27256, 27198, 27197};
    }
}
