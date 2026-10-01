package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.skt.usp.UCPApiConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.mergeParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class mergeParams {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private static boolean asBinder = false;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static final Lazy onExtraCallbackWithResult;
    private static final Lazy onNavigationEvent;
    private static boolean onTransact;
    private static final Lazy onWarmupCompleted;

    public static /* synthetic */ Regex onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Regex onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Regex regexOnTransact = onTransact();
        int i4 = IAuthTabCallbackDefault + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return regexOnTransact;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = (~i2) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i4)) | i9;
        int i11 = (~(i7 | (~i4) | i2)) | (~(i8 | i4)) | (~(i6 | i4 | i2));
        int i12 = (~(i2 | i6)) | i4 | i9;
        int i13 = i6 + i4 + i5 + (5090439 * i) + ((-1076018391) * i3);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i6) - 1475346432) + (1088368604 * i4) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i5) + (1616379904 * i) + ((-1222115328) * i3) + (1028194304 * i14);
        int i16 = (i6 * (-1092730454)) + 799718796 + (i4 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i5 * (-1092730761)) + (i * 1582232257) + (i3 * 741505039) + (i14 * (-1125187584));
        switch (i15 + (i16 * i16 * (-410583040))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                String str = (String) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                String str2 = (String) objArr[2];
                int i17 = 2 % 2;
                int i18 = IAuthTabCallbackDefault + 91;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                if (str == null || str.length() == 0 || str.length() <= iIntValue) {
                    return str;
                }
                String strSubstring = str.substring(0, iIntValue - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String str3 = strSubstring + str2;
                int i20 = IAuthTabCallbackDefault + 19;
                asInterface = i20 % 128;
                int i21 = i20 % 2;
                return str3;
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return asInterface(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Regex onWarmupCompleted() {
        Regex regex;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
            regex = (Regex) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -1379305020, iOnExtraCallbackWithResult2, 1379305020, new Object[0]);
            int i3 = 96 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = nSetPosition.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = nSetPosition.onExtraCallbackWithResult();
            regex = (Regex) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, nSetPosition.onExtraCallbackWithResult(), -1379305020, iOnExtraCallbackWithResult4, 1379305020, new Object[0]);
        }
        int i4 = IAuthTabCallbackDefault + 97;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return regex;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        ParamImpl paramImpl = (ParamImpl) objArr[1];
        String str2 = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        if (i2 % 2 != 0 && (iIntValue & 1) != 0) {
            paramImpl = ParamImpl.WON;
        }
        if ((iIntValue & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 27;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str2 = "?";
        }
        return onNavigationEvent(str, paramImpl, str2);
    }

    public static final String onNavigationEvent(@NotNull String str, @NotNull ParamImpl paramImpl, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paramImpl, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            String str3 = (String) getLongName.onNavigationEvent(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -640286283, ICustomTabsCallbackStubProxy.onExtraCallback(), new Object[]{Long.valueOf(new BigDecimal(str).longValue()), paramImpl}, 640286283);
            int i2 = asInterface + 77;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str3;
            }
            throw null;
        } catch (NumberFormatException unused) {
            return str2;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && str.length() != 0) {
            return Uri.parse(str);
        }
        int i4 = IAuthTabCallbackDefault + 1;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return null;
    }

    public static /* synthetic */ Date onExtraCallbackWithResult(String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 97;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            str2 = "yyyyMMdd";
        }
        return onExtraCallbackWithResult(str, str2);
    }

    public static final Date onExtraCallbackWithResult(@Nullable String str, @NotNull String str2) throws ParseException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Date date = new SimpleDateFormat(str2).parse(str);
            int i2 = asInterface + 11;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return date;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Date onWarmupCompleted(@Nullable String str, @NotNull DateFormat dateFormat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dateFormat, "");
        if (str == null) {
            return null;
        }
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if ((!StringsKt.isBlank(str) ? str : null) == null) {
            return null;
        }
        int i4 = asInterface + 103;
        IAuthTabCallbackDefault = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                return dateFormat.parse(str);
            }
            dateFormat.parse(str);
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strReplace = new Regex("\\D+").replace(str, "");
        int i2 = IAuthTabCallbackDefault + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return strReplace;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:3:0x0009, B:7:0x001e, B:9:0x0024, B:17:0x0031, B:19:0x0037, B:14:0x002a), top: B:27:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                int i2 = asInterface + 33;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 40 / 0;
                    if (scheme.length() != 0) {
                        String authority = uri.getAuthority();
                        if (authority != null) {
                            if (authority.length() != 0) {
                                int i4 = asInterface + 85;
                                IAuthTabCallbackDefault = i4 % 128;
                                int i5 = i4 % 2;
                                return true;
                            }
                        }
                    }
                } else if (scheme.length() == 0) {
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str2 = (String) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        if ((iIntValue2 & 2) != 0) {
            int i2 = IAuthTabCallbackDefault + 65;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = "…";
        }
        Object[] objArr2 = {str, Integer.valueOf(iIntValue), str2};
        String str3 = (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 457156028, nSetPosition.onExtraCallbackWithResult(), -457156024, objArr2);
        int i3 = IAuthTabCallbackDefault + 69;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallbackDefault(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (65281 <= cCharAt) {
                int i3 = asInterface + 21;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (cCharAt < 65375) {
                    cCharAt = (char) (cCharAt - 65248);
                } else if (cCharAt == 12288) {
                    int i5 = IAuthTabCallbackDefault + 103;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    cCharAt = ' ';
                }
            }
            stringBuffer.append(cCharAt);
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String IAuthTabCallback(String str, String str2, int i, Object obj) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        int i3 = asInterface + 49;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str2 = "utf-8";
        }
        String strOnWarmupCompleted = onWarmupCompleted(str, str2);
        int i4 = asInterface + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    public static final String onWarmupCompleted(@NotNull String str, @NotNull String str2) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNull(URLEncoder.encode(str, str2));
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strEncode = URLEncoder.encode(str, str2);
        Intrinsics.checkNotNull(strEncode);
        int i3 = asInterface + 65;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return strEncode;
    }

    public static final String IAuthTabCallback(@NotNull String str, @NotNull String str2) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strDecode = URLDecoder.decode(str, str2);
        Intrinsics.checkNotNull(strDecode);
        int i4 = asInterface + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strDecode;
    }

    public static /* synthetic */ String onExtraCallback(String str, String str2, int i, Object obj) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 117;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str2 = "utf-8";
        }
        String strIAuthTabCallback = IAuthTabCallback(str, str2);
        int i7 = IAuthTabCallbackDefault + 33;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    static {
        onExtraCallback();
        onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.extensions.StringsKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    mergeParams.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Regex regexOnWarmupCompleted = mergeParams.onWarmupCompleted();
                int i3 = onExtraCallback + 65;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return regexOnWarmupCompleted;
            }
        });
        onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.extensions.StringsKt$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Regex regexOnNavigationEvent = mergeParams.onNavigationEvent();
                int i4 = onNavigationEvent + 65;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return regexOnNavigationEvent;
            }
        });
        onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.extensions.StringsKt$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return mergeParams.onExtraCallbackWithResult();
                }
                mergeParams.onExtraCallbackWithResult();
                throw null;
            }
        });
        int i = access100 + 81;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    private static final Regex asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Regex regex = (Regex) onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallbackDefault + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return regex;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        Regex regex = new Regex("[^\\d]");
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return regex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Regex onTransact() {
        int i = 2 % 2;
        Regex regex = new Regex("[^\\d.]");
        int i2 = asInterface + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return regex;
    }

    private static final Regex IAuthTabCallback() {
        int i = 2 % 2;
        Regex regex = new Regex("^$");
        int i2 = IAuthTabCallbackDefault + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return regex;
    }

    private static final Regex asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Regex regex = (Regex) onNavigationEvent.getValue();
        int i4 = IAuthTabCallbackDefault + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return regex;
    }

    public static /* synthetic */ long onWarmupCompleted(String str, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 87;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 31;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 59;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            j = 0;
        }
        return onExtraCallbackWithResult(str, j);
    }

    public static final long onExtraCallbackWithResult(@Nullable String str, long j) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (str == null) {
            return j;
        }
        int i5 = i3 + 75;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        String strReplace = asBinder().replace(str, "");
        if (i6 != 0) {
            return Long.parseLong(onWarmupCompleted(strReplace, Long.valueOf(j)));
        }
        int i7 = 5 / 0;
        return Long.parseLong(onWarmupCompleted(strReplace, Long.valueOf(j)));
    }

    private static final String onWarmupCompleted(String str, Number number) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strReplace = asInterface().replace(str, number.toString());
        int i4 = IAuthTabCallbackDefault + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strReplace;
    }

    public static /* synthetic */ CharSequence IAuthTabCallback(String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 57;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        return onExtraCallbackWithResult(str, z);
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        long j = 0;
        Object obj = null;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 78, View.combineMeasuredStates(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myPid() >> 22) + 75, 16037 - View.resolveSizeAndState(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 63, 12213 - ImageFormat.getBitsPerPixel(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr5);
            int i5 = $11 + 121;
            $10 = i5 % 128;
            if (i5 % 2 == 0) {
                objArr[0] = str;
                return;
            } else {
                obj.hashCode();
                throw null;
            }
        }
        if (!onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 125;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] / i] >> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted - 1;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                int i7 = $11 + 117;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 51;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, Drawable.resolveOpacity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str2 = new String(cArr2);
        int i10 = $10 + 7;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str2;
    }

    public static final CharSequence onExtraCallbackWithResult(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Spanned spannedOnWarmupCompleted = isExecuted.onWarmupCompleted(isExecuted.IAuthTabCallback, str, new Object[0], (Html.TagHandler) null, z, false, 20, (Object) null);
        int i4 = asInterface + 121;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return spannedOnWarmupCompleted;
    }

    public static final String onExtraCallbackWithResult(@NotNull String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = "<font color='" + setWriteAbortCountokhttp.IAuthTabCallback(i, "#", false) + "'>" + str + "</font>";
        int i3 = asInterface + 105;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    public static final int IAuthTabCallbackStub(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int color = Color.parseColor(str);
        int i4 = asInterface + 39;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return color;
        }
        throw null;
    }

    public static final Integer onTransact(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Integer numValueOf = Integer.valueOf(Color.parseColor(str));
            int i4 = IAuthTabCallbackDefault + 21;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return numValueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r4 = new java.text.SimpleDateFormat(r5).format(new java.text.SimpleDateFormat(r6).parse(r4));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r5 = o.mergeParams.asInterface + 73;
        o.mergeParams.IAuthTabCallbackDefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r4.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String onExtraCallback(@Nullable String str, @NotNull String str2, @NotNull String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str != null) {
            int i2 = IAuthTabCallbackDefault + 65;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 46 / 0;
            }
        }
        return "";
    }

    public static final String onNavigationEvent(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-127}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        String strReplace$default = StringsKt.replace$default(str, ((String) objArr[0]).intern(), "공", false, 4, (Object) null);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126}, 127 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        String strReplace$default2 = StringsKt.replace$default(strReplace$default, ((String) objArr2[0]).intern(), "일", false, 4, (Object) null);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-125}, 127 - TextUtils.getCapsMode("", 0, 0), objArr3);
        String strReplace$default3 = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, ((String) objArr3[0]).intern(), "이", false, 4, (Object) null), "3", "삼", false, 4, (Object) null), "4", "사", false, 4, (Object) null), "5", "오", false, 4, (Object) null), "6", "육", false, 4, (Object) null), "7", "칠", false, 4, (Object) null), UCPApiConstants.ERR_CARD_DEVICES_RES_FAIL, "팔", false, 4, (Object) null), "9", "구", false, 4, (Object) null);
        int i4 = IAuthTabCallbackDefault + 69;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return strReplace$default3;
        }
        obj.hashCode();
        throw null;
    }

    public static final String IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(str, "yyyy.MM.dd", "yyyy-MM-dd'T'HH:mm:ss");
        }
        onExtraCallback(str, "yyyy.MM.dd", "yyyy-MM-dd'T'HH:mm:ss");
        throw null;
    }

    public static final String onNavigationEvent(@Nullable String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            str = "";
        }
        if (str.length() != 0) {
            return str;
        }
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }

    public static final CharSequence onNavigationEvent(@Nullable CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(charSequence2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (charSequence == null) {
            int i3 = IAuthTabCallbackDefault + 117;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 47 / 0;
            }
            charSequence = "";
        }
        return charSequence.length() == 0 ? charSequence2 : charSequence;
    }

    public static final String onNavigationEvent(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        String strReplace = new Regex("\\D+").replace(charSequence, "");
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return strReplace;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        StringBuilder sb;
        String str;
        String str2 = (String) objArr[0];
        String str3 = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        if (str3 != null) {
            int i4 = IAuthTabCallbackDefault + 121;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if (str3.length() == 0) {
                int i6 = asInterface + 93;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            } else {
                if (StringsKt.contains$default(str2, '?', false, 2, (Object) null)) {
                    sb = new StringBuilder();
                    str = "&title=";
                } else {
                    sb = new StringBuilder();
                    int i8 = asInterface + 75;
                    IAuthTabCallbackDefault = i8 % 128;
                    int i9 = i8 % 2;
                    str = "?title=";
                }
                sb.append(str);
                sb.append(str3);
                str2 = str2 + ((Object) sb.toString());
            }
        }
        int i10 = IAuthTabCallbackDefault + 3;
        asInterface = i10 % 128;
        int i11 = i10 % 2;
        return str2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Integer numValueOf;
        Float floatOrNull;
        String str = (String) objArr[0];
        int i = 2 % 2;
        if (str == null || (floatOrNull = StringsKt.toFloatOrNull(str)) == null) {
            numValueOf = null;
        } else {
            int i2 = IAuthTabCallbackDefault + 1;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            numValueOf = Integer.valueOf((int) floatOrNull.floatValue());
            int i4 = IAuthTabCallbackDefault + 69;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return String.valueOf(numValueOf);
    }

    public static final String asInterface(@NotNull String str) {
        String strReplace$default;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(str, "\n", " ", true, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(str, "\n", " ", false, 4, (Object) null);
        }
        int i3 = asInterface + 1;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return strReplace$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String IAuthTabCallback(@NotNull String str, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        if (readIntokhttp.IAuthTabCallback(configuration)) {
            int i4 = IAuthTabCallbackDefault + 11;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            str = asInterface(str);
            if (i5 == 0) {
                int i6 = 63 / 0;
            }
        }
        return str;
    }

    public static final String asBinder(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            followRedirects.onExtraCallbackWithResult.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Context contextOnNavigationEvent = followRedirects.onExtraCallbackWithResult.onNavigationEvent();
        if (contextOnNavigationEvent != null) {
            return IAuthTabCallback(str, contextOnNavigationEvent);
        }
        int i3 = asInterface + 95;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static final String onExtraCallback(@NotNull String str, @Nullable String str2) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -1614695604, iOnExtraCallbackWithResult2, 1614695607, new Object[]{str, str2});
    }

    public static final String IAuthTabCallback(@Nullable String str, int i, @NotNull String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 457156028, nSetPosition.onExtraCallbackWithResult(), -457156024, objArr);
    }

    public static /* synthetic */ String onExtraCallback(String str, int i, String str2, int i2, Object obj) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Integer.valueOf(i2), obj};
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1334309726, nSetPosition.onExtraCallbackWithResult(), -1334309720, objArr);
    }

    public static final String onExtraCallback(@Nullable String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), 2113424808, iOnExtraCallbackWithResult2, -2113424803, new Object[]{str});
    }

    private static final Regex IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Regex) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -1379305020, iOnExtraCallbackWithResult2, 1379305020, new Object[0]);
    }

    public static final String onWarmupCompleted(@NotNull String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), 1129674746, iOnExtraCallbackWithResult2, -1129674745, new Object[]{str});
    }

    public static /* synthetic */ String onExtraCallback(String str, ParamImpl paramImpl, String str2, int i, Object obj) {
        Object[] objArr = {str, paramImpl, str2, Integer.valueOf(i), obj};
        return (String) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 929961739, nSetPosition.onExtraCallbackWithResult(), -929961737, objArr);
    }

    public static final Uri access000(@Nullable String str) {
        int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
        return (Uri) onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, nSetPosition.onExtraCallbackWithResult(), -846257502, iOnExtraCallbackWithResult2, 846257509, new Object[]{str});
    }

    static void onExtraCallback() {
        IAuthTabCallback = new char[]{32735, 32734, 32733};
        onExtraCallback = -1184333937;
        onTransact = true;
        asBinder = true;
    }
}
