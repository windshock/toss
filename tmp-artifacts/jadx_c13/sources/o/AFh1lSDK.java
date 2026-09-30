package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final AFh1lSDK IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static final String onNavigationEvent;
    private static int onTransact = 1;
    private static final Set<String> onWarmupCompleted;

    private AFh1lSDK() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        private final String value;
        public static final onNavigationEvent JPG = new onNavigationEvent("JPG", 0, "jpg");
        public static final onNavigationEvent JPEG = new onNavigationEvent("JPEG", 1, "jpeg");
        public static final onNavigationEvent PNG = new onNavigationEvent("PNG", 2, "png");
        public static final onNavigationEvent WEBP = new onNavigationEvent("WEBP", 3, "webp");
        public static final onNavigationEvent GIF = new onNavigationEvent("GIF", 4, "gif");

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {JPG, JPEG, PNG, WEBP, GIF};
            int i5 = i2 + 27;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 93 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = IAuthTabCallback + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 == 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 95;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.value;
            int i4 = i2 + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 73;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 71 / 0;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.value;
            int i5 = i2 + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final String value;
        public static final onExtraCallbackWithResult COVER = new onExtraCallbackWithResult("COVER", 0, "cover");
        public static final onExtraCallbackWithResult CONTAIN = new onExtraCallbackWithResult("CONTAIN", 1, "contain");
        public static final onExtraCallbackWithResult FILL = new onExtraCallbackWithResult("FILL", 2, "fill");
        public static final onExtraCallbackWithResult INSIDE = new onExtraCallbackWithResult("INSIDE", 3, "inside");
        public static final onExtraCallbackWithResult OUTSIDE = new onExtraCallbackWithResult("OUTSIDE", 4, "outside");

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {COVER, CONTAIN, FILL, INSIDE, OUTSIDE};
            int i5 = i2 + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 60 / 0;
            }
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.value;
            }
            throw null;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallback + 113;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 29, 71, 13}, false, new byte[]{0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0}, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        IAuthTabCallback = new AFh1lSDK();
        onWarmupCompleted = clearFaultAddress.onNavigationEvent("svg");
        int i = onExtraCallback + 57;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final String onNavigationEvent(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onNavigationEvent onnavigationevent, @Nullable Integer num3, @Nullable Integer num4) throws Throwable {
        String str2;
        int iIntValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (str == null) {
            return str;
        }
        if (!(!StringsKt__StringsKt.isBlank(str))) {
            int i4 = IAuthTabCallbackDefault + 59;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            int i5 = 57 / 0;
            return str;
        }
        Object[] objArr = new Object[1];
        a(new int[]{29, 30, 100, 0}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
        if (StringsKt__StringsJVMKt.startsWith(str, ((String) objArr[0]).intern(), true)) {
            return str;
        }
        if (num3 != null && ((iIntValue = num3.intValue()) <= 0 || iIntValue >= 101)) {
            throw new IllegalArgumentException(("quality must be 1..100, was " + num3).toString());
        }
        if (num4 != null && num4.intValue() < 0) {
            throw new IllegalArgumentException(("rounded must be >= 0, was " + num4).toString());
        }
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (num != null) {
            listCreateListBuilder.add("width=" + num);
        }
        if (num2 != null) {
            listCreateListBuilder.add("height=" + num2);
        }
        if (onextracallbackwithresult != null) {
            listCreateListBuilder.add("fit=" + onextracallbackwithresult.getValue());
        }
        if (onnavigationevent != null) {
            listCreateListBuilder.add("format=" + onnavigationevent.getValue());
        }
        if (num3 != null) {
            listCreateListBuilder.add("quality=" + num3);
            int i6 = asBinder + 11;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
        }
        if (num4 != null) {
            listCreateListBuilder.add("rounded=" + num4);
        }
        List listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        if (listBuild.isEmpty()) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "?" + CollectionsKt___CollectionsKt.joinToString$default(listBuild, "&", null, null, 0, null, null, 62, null);
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        a(new int[]{29, 30, 100, 0}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(strOnExtraCallbackWithResult);
        sb.append(str2);
        return sb.toString();
    }

    private final String onExtraCallbackWithResult(String str) throws UnsupportedEncodingException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strEncode = URLEncoder.encode(str, "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null), "%21", "!", false, 4, (Object) null), "%27", "'", false, 4, (Object) null), "%28", "(", false, 4, (Object) null), "%29", ")", false, 4, (Object) null), "%7E", "~", false, 4, (Object) null);
        int i4 = IAuthTabCallbackDefault + 119;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return strReplace$default;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        char c = '0';
        long j = 0;
        if (cArr2 != null) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            int i9 = i;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i9]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, i3, i3)), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 34, 14240 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    c = '0';
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i10 = $10 + 65;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 10935), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 66, (Process.myTid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 49467), 69 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i14 = $11 + 65;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (z) {
            int i17 = $10 + 61;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i5];
            int i19 = 0;
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i19;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                i19 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i20 = $11 + 9;
            $10 = i20 % 128;
            char c3 = 2;
            int i21 = i20 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[c3]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                c3 = 2;
            }
        }
        String str = new String(cArr3);
        int i22 = $10 + 115;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{27157, 27382, 27380, 27387, 27388, 27383, 27386, 27389, 27380, 27350, 27329, 27390, 27387, 27391, 27387, 27381, 27383, 27382, 27347, 27189, 27192, 27357, 27388, 27360, 27365, 27363, 27389, 27353, 27350, 27143, 27388, 27292, 27267, 27362, 27387, 27289, 27294, 27295, 27288, 27265, 27292, 27289, 27291, 27291, 27387, 27386, 27294, 27268, 27270, 27269, 27265, 27390, 27357, 27350, 27380, 27291, 27288, 27286, 27292};
    }
}
