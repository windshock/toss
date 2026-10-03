package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_DecryptPrikey {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UST_CERT_DecryptPrikey[] $VALUES;
    public static final UST_CERT_DecryptPrikey Card;
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 1;
    public static final UST_CERT_DecryptPrikey Pin;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private final String typeCode;
    private final String typeString;

    private static final /* synthetic */ UST_CERT_DecryptPrikey[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        UST_CERT_DecryptPrikey[] uST_CERT_DecryptPrikeyArr = {Card, Pin};
        int i5 = i2 + 107;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return uST_CERT_DecryptPrikeyArr;
    }

    public static EnumEntries<UST_CERT_DecryptPrikey> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<UST_CERT_DecryptPrikey> enumEntries = $ENTRIES;
        int i5 = i3 + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return enumEntries;
    }

    public static UST_CERT_DecryptPrikey valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey = (UST_CERT_DecryptPrikey) Enum.valueOf(UST_CERT_DecryptPrikey.class, str);
        int i4 = onExtraCallback + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return uST_CERT_DecryptPrikey;
    }

    public static UST_CERT_DecryptPrikey[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UST_CERT_DecryptPrikey[] uST_CERT_DecryptPrikeyArr = (UST_CERT_DecryptPrikey[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 7;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return uST_CERT_DecryptPrikeyArr;
        }
        throw null;
    }

    private UST_CERT_DecryptPrikey(String str, int i, String str2, String str3) {
        this.typeString = str2;
        this.typeCode = str3;
    }

    public final String getTypeCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.typeCode;
        int i5 = i2 + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTypeString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.typeString;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 188, 3}, false, new byte[]{1, 1, 0, 1}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new int[]{4, 4, 82, 0}, true, new byte[]{0, 0, 1, 0}, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new int[]{8, 1, 0, 1}, false, new byte[]{1}, objArr3);
        Card = new UST_CERT_DecryptPrikey(strIntern, 0, strIntern2, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a(new int[]{9, 3, 0, 0}, true, new byte[]{0, 1, 1}, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a(new int[]{12, 3, 125, 0}, true, new byte[]{1, 1, 1}, objArr5);
        String strIntern4 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new int[]{15, 1, 26, 0}, false, new byte[]{0}, objArr6);
        Pin = new UST_CERT_DecryptPrikey(strIntern3, 1, strIntern4, ((String) objArr6[0]).intern());
        UST_CERT_DecryptPrikey[] uST_CERT_DecryptPrikeyArr$values = $values();
        $VALUES = uST_CERT_DecryptPrikeyArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(uST_CERT_DecryptPrikeyArr$values);
        Companion = new onExtraCallbackWithResult(null);
        int i = onNavigationEvent + 33;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ UST_CERT_DecryptPrikey onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, String str, UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey, int i, Object obj) {
            if ((i & 2) != 0) {
                uST_CERT_DecryptPrikey = UST_CERT_DecryptPrikey.Card;
            }
            return onextracallbackwithresult.IAuthTabCallback(str, uST_CERT_DecryptPrikey);
        }

        public final UST_CERT_DecryptPrikey IAuthTabCallback(@NotNull String str, @NotNull UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey) {
            Object next;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(uST_CERT_DecryptPrikey, "");
            Iterator it = UST_CERT_DecryptPrikey.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.equals(((UST_CERT_DecryptPrikey) next).getTypeString(), str, true)) {
                    break;
                }
            }
            UST_CERT_DecryptPrikey uST_CERT_DecryptPrikey2 = (UST_CERT_DecryptPrikey) next;
            return uST_CERT_DecryptPrikey2 == null ? uST_CERT_DecryptPrikey : uST_CERT_DecryptPrikey2;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i7 = $10 + 17;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 35283), Color.red(0) + 35, ExpandableListView.getPackedPositionGroup(0L) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.getCapsMode("", 0, 0)), 65 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 16718 - Color.argb(0, 0, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 29, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 70 - View.resolveSizeAndState(0, 0, 0), 12486 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 - i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 >> i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i12, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i12);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i13 = $10 + 7;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 % 3;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i15 = $11 + 29;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{27328, 27499, 27497, 27457, 27157, 27379, 27381, 27386, 27222, 27257, 27173, 27154, 27195, 27302, 27303, 27240};
    }
}
