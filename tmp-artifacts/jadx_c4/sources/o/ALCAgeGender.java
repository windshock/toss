package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCAgeGender {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    private static char asInterface;
    private static final String onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static final int[] onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{65364, 45601, 43369, 38557, 56300, 40539, 30, 39710, 64296, 8678, 24391, 58505, 62949, 54143, 54935, 39767, 53912, 39338, 28709, 64706, 5972, 60226, 38525, 12989, 45673, 43166, 15590, 5623, 24854, 44846, 47886, 29667, 31178, 26146, 44329, 30305, 58511, 44510, 15590, 5623, 60117, 45109, 39786, 50143}, 43 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        int[] iArr = {160, 240, 320, 480, 640, 828, 1080, 1440};
        onWarmupCompleted = iArr;
        IAuthTabCallback = ArraysKt.last(iArr);
        int i = IAuthTabCallbackDefault + 51;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final int IAuthTabCallback(int i) {
        int[] iArr;
        int length;
        Integer numValueOf;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 125;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            iArr = onWarmupCompleted;
            length = iArr.length;
        } else {
            iArr = onWarmupCompleted;
            length = iArr.length;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                int i5 = IAuthTabCallback_Parcel + 79;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
                break;
            }
            int i7 = iArr[i4];
            if (i7 >= i) {
                numValueOf = Integer.valueOf(i7);
                break;
            }
            i4++;
        }
        if (numValueOf == null) {
            return ArraysKt.last(onWarmupCompleted);
        }
        int i8 = onTransact + 65;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        int iIntValue = numValueOf.intValue();
        if (i9 == 0) {
            int i10 = 23 / 0;
        }
        return iIntValue;
    }

    public static /* synthetic */ String onExtraCallback(String str, Integer num, Integer num2, int i, int i2, Object obj) throws Throwable {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback_Parcel + 51;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
            }
            num = null;
        }
        if ((i2 & 2) != 0) {
            int i6 = onTransact + 71;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 90;
        }
        String strOnExtraCallback = onExtraCallback(str, num, num2, i);
        int i8 = onTransact + 107;
        IAuthTabCallback_Parcel = i8 % 128;
        if (i8 % 2 != 0) {
            return strOnExtraCallback;
        }
        throw null;
    }

    public static final String onExtraCallback(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, int i) throws Throwable {
        int iIntValue;
        String str2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 29;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (str == null) {
            return str;
        }
        if (StringsKt.isBlank(str)) {
            int i4 = onTransact + 75;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        Object[] objArr = new Object[1];
        a(new char[]{65364, 45601, 43369, 38557, 56300, 40539, 30, 39710, 64296, 8678, 24391, 58505, 62949, 54143, 54935, 39767, 53912, 39338, 28709, 64706, 5972, 60226, 38525, 12989, 45673, 43166, 15590, 5623, 24854, 44846, 47886, 29667, 31178, 26146, 44329, 30305, 58511, 44510, 15590, 5623, 60117, 45109, 39786, 50143}, 43 - TextUtils.getTrimmedLength(""), objArr);
        if (StringsKt.startsWith$default(str, ((String) objArr[0]).intern(), false, 2, (Object) null)) {
            int i6 = onTransact + 13;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 77 / 0;
            }
            return str;
        }
        if (num != null) {
            int i8 = IAuthTabCallback_Parcel + 69;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            iIntValue = num.intValue();
        } else {
            iIntValue = IAuthTabCallback;
        }
        if (num2 != null) {
            str2 = "width=" + iIntValue + ",height=" + num2;
        } else {
            str2 = "width=" + iIntValue;
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{65364, 45601, 43369, 38557, 56300, 40539, 30, 39710, 64296, 8678, 24391, 58505, 62949, 54143, 54935, 39767, 53912, 39338, 28709, 64706, 5972, 60226, 38525, 12989, 45673, 43166, 15590, 5623, 24854, 44846, 47886, 29667, 31178, 26146, 44329, 30305, 58511, 44510, 15590, 5623, 60117, 45109, 39786, 50143}, (ViewConfiguration.getScrollBarSize() >> 8) + 43, objArr2);
        return Uri.parse(((String) objArr2[0]).intern()).buildUpon().appendEncodedPath(str2 + ",quality=" + i).appendPath(str).build().toString();
    }

    public static /* synthetic */ String onExtraCallback(String str, Integer num, Integer num2, int i, float f, int i2, Object obj) {
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback_Parcel + 77;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            num = null;
        }
        if ((i2 & 2) != 0) {
            num2 = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback_Parcel + 61;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            i = 90;
        }
        if ((i2 & 8) != 0) {
            f = Resources.getSystem().getDisplayMetrics().density;
            int i8 = IAuthTabCallback_Parcel + 79;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
        }
        String strOnNavigationEvent = onNavigationEvent(str, num, num2, i, f);
        int i10 = onTransact + 71;
        IAuthTabCallback_Parcel = i10 % 128;
        if (i10 % 2 != 0) {
            return strOnNavigationEvent;
        }
        obj2.hashCode();
        throw null;
    }

    public static final String onNavigationEvent(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, int i, float f) {
        Integer numValueOf;
        Integer numValueOf2;
        int i2 = 2 % 2;
        Integer numValueOf3 = null;
        if (num2 != null) {
            int i3 = onTransact + 29;
            IAuthTabCallback_Parcel = i3 % 128;
            numValueOf = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(i3 % 2 == 0 ? num2.intValue() / f : num2.intValue() * f));
        } else {
            numValueOf = null;
        }
        if (num != null) {
            numValueOf2 = Integer.valueOf(getBacktraceNoteBytes.onExtraCallback(num.intValue() * f));
            int i4 = onTransact + 85;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf != null) {
            int i6 = IAuthTabCallback_Parcel + 33;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            numValueOf3 = numValueOf2;
        } else if (numValueOf2 != null) {
            numValueOf3 = Integer.valueOf(IAuthTabCallback(numValueOf2.intValue()));
            int i7 = onTransact + 89;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        return onExtraCallback(str, numValueOf3, numValueOf, i);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 15;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (asInterface ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i3);
                        int iAlpha = Color.alpha(i3) + 10;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, iAlpha, iMakeMeasureSpec, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 16014), 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 19902, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = (char) 29832;
        onExtraCallbackWithResult = (char) 8050;
        asInterface = (char) 27130;
        IAuthTabCallbackStub = (char) 51994;
    }
}
