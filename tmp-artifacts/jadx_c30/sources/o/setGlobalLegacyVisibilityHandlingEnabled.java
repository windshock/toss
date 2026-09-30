package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setGlobalLegacyVisibilityHandlingEnabled {
    public static final String CERTIFY_ALL = "1";
    public static final String CERTIFY_CVC = "0";
    public static final String CERTIFY_FRONT_PASSWORD = "2";
    public static final onWarmupCompleted Companion;
    private static char[] onExtraCallback;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("certifyCode")
    private String certifyCode;

    @SerializedName("cvc")
    private String cvc;

    @SerializedName("password")
    private String password;

    @SerializedName("isUseAtm")
    private boolean withoutCvc;
    private static final byte[] $$a = {ISOFileInfo.FCI_BYTE, -17, 11, ISOFileInfo.FILE_IDENTIFIER};
    private static final int $$b = 154;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5 = 97 - (i * 4);
        int i6 = 1 - (i2 * 2);
        int i7 = 3 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5 += i8;
            i3 = i4;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i7];
            i5 += i8;
            i3 = i4;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        int i = IAuthTabCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public setGlobalLegacyVisibilityHandlingEnabled() {
        this(null, null, null, false, 15, null);
    }

    public setGlobalLegacyVisibilityHandlingEnabled(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.cvc = str;
        this.certifyCode = str2;
        this.password = str3;
        this.withoutCvc = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setGlobalLegacyVisibilityHandlingEnabled(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        Object obj;
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 1 / View.MeasureSpec.getSize(1), (char) (ViewConfiguration.getEdgeSlop() * 39), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(TextUtils.getTrimmedLength(BuildConfig.FLAVOR), View.MeasureSpec.getSize(0) + 1, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
                obj = objArr2[0];
            }
            str2 = ((String) obj).intern();
            int i5 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            str3 = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            z = false;
        }
        this(str, str2, str3, z);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.alpha(0)), 17 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10974, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 46134), 30 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 49123), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 1493 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i5 = $10 + 107;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 49123), 44 - Color.green(0), Drawable.resolveOpacity(0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i7 = $10 + 57;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{60901};
        onNavigationEvent = 879712632286120224L;
    }
}
