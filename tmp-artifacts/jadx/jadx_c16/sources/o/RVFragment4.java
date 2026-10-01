package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeLogger;
import com.iap.ac.android.acs.plugin.utils.AuthCodeUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.showError;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVFragment4 {
    private static int IAuthTabCallbackDefault;
    private static int onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static final RoundedCornerShape onWarmupCompleted;
    private static final byte[] $$a = {102, 12, 98, 84};
    private static final int $$b = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3;
        int i4 = 110 - s;
        byte[] bArr = $$a;
        int i5 = 3 - (s2 * 3);
        int i6 = (i * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i7;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i4 += i7;
            i2 = i3;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i5++;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = (~(i8 | i5)) | i7;
        int i10 = ~i5;
        int i11 = ~(i8 | i10 | i2);
        int i12 = (~(i5 | i7)) | i8 | (~(i10 | i2));
        int i13 = i2 + i3 + i4 + (325770565 * i) + ((-1284996642) * i6);
        int i14 = i13 * i13;
        int i15 = (i2 * (-1991011123)) + 595473426 + (i3 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + ((-1991010217) * i4) + ((-1223611789) * i) + ((-291900814) * i6) + (i14 * (-1931083776));
        if (((789042555 * i2) - 1205338112) + ((-1364710777) * i3) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i4) + ((-667418624) * i) + ((-145752064) * i6) + (1116340224 * i14) + (i15 * i15 * (-1558839296)) != 1) {
            return onNavigationEvent(objArr);
        }
        JsonObject jsonObject = (JsonObject) objArr[0];
        int i16 = 2 % 2;
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "status");
        switch (strOnExtraCallbackWithResult.hashCode()) {
            case -2003244854:
                if (!(!strOnExtraCallbackWithResult.equals("standardTerms"))) {
                    String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "standardTermsCode");
                    if (strOnExtraCallbackWithResult2.length() != 0) {
                        return new showError.IAuthTabCallback.onExtraCallback(strOnExtraCallbackWithResult2, IAuthTabCallback(jsonObject, "primaryCta"), IAuthTabCallback(jsonObject, "secondaryCta"));
                    }
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr2 = new Object[1];
                    a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1850019805) - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{35986, 14011, 32711, 30914, 19738, 35270, 50601}, new char[]{60092, 54998, 52413, 64200}, new char[]{9053, 47856, 35729, 1000}, objArr2);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "AutomationCaUtil", "intro_standard_terms_missing_code", (Throwable) null, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), jsonObject.toString())}), 4, (Object) null);
                    int i17 = onTransact + 21;
                    asBinder = i17 % 128;
                    int i18 = i17 % 2;
                }
                return null;
            case 98712316:
                if (strOnExtraCallbackWithResult.equals("guide")) {
                    int i19 = onTransact + 87;
                    asBinder = i19 % 128;
                    int i20 = i19 % 2;
                    String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
                    String strOnExtraCallbackWithResult4 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
                    Object[] objArr3 = new Object[1];
                    a((char) (46330 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 111656819 - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr3);
                    String strOnExtraCallbackWithResult5 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr3[0]).intern());
                    Object[] objArr4 = new Object[1];
                    a((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, new char[]{45706, 46164, 47717, 38900, 32183, 31379, 36943, 2745}, new char[]{60092, 54998, 52413, 64200}, new char[]{40320, 10061, 48313, 61500}, objArr4);
                    String strOnExtraCallbackWithResult6 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr4[0]).intern());
                    if (strOnExtraCallbackWithResult6.length() == 0) {
                        strOnExtraCallbackWithResult6 = null;
                    }
                    SplashUtils splashUtilsIAuthTabCallback = IAuthTabCallback(jsonObject, "primaryCta");
                    String strOnExtraCallbackWithResult7 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "closeAction");
                    if (strOnExtraCallbackWithResult7.length() == 0) {
                        strOnExtraCallbackWithResult7 = null;
                    }
                    showError.IAuthTabCallback.IAuthTabCallback iAuthTabCallback = new showError.IAuthTabCallback.IAuthTabCallback(strOnExtraCallbackWithResult3, strOnExtraCallbackWithResult4, strOnExtraCallbackWithResult5, strOnExtraCallbackWithResult6, splashUtilsIAuthTabCallback, strOnExtraCallbackWithResult7);
                    int i21 = asBinder + 77;
                    onTransact = i21 % 128;
                    int i22 = i21 % 2;
                    return iAuthTabCallback;
                }
                return null;
            case 951500826:
                if (strOnExtraCallbackWithResult.equals("consent")) {
                    String strOnExtraCallbackWithResult8 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
                    String strOnExtraCallbackWithResult9 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
                    Object[] objArr5 = new Object[1];
                    a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{45706, 46164, 47717, 38900, 32183, 31379, 36943, 2745}, new char[]{60092, 54998, 52413, 64200}, new char[]{40320, 10061, 48313, 61500}, objArr5);
                    String strOnExtraCallbackWithResult10 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr5[0]).intern());
                    String str = strOnExtraCallbackWithResult10.length() == 0 ? null : strOnExtraCallbackWithResult10;
                    Object[] objArr6 = new Object[1];
                    a((char) (46329 - ExpandableListView.getPackedPositionGroup(0L)), 111656819 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr6);
                    return new showError.IAuthTabCallback.onWarmupCompleted(strOnExtraCallbackWithResult8, strOnExtraCallbackWithResult9, str, getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr6[0]).intern()), IAuthTabCallback(jsonObject, "primaryCta"), IAuthTabCallback(jsonObject, "secondaryCta"));
                }
                return null;
            case 1880183383:
                if (strOnExtraCallbackWithResult.equals("collapsed")) {
                    return new showError.IAuthTabCallback.onNavigationEvent(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "onAction"));
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final showError onWarmupCompleted(@NotNull JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Object[] objArr = new Object[1];
        a((char) (Color.blue(0) + 60537), ViewConfiguration.getTouchSlop() >> 8, new char[]{51185, 52269, 12191, 51533}, new char[]{60092, 54998, 52413, 64200}, new char[]{47489, 50320, 30976, 20972}, objArr);
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern());
        switch (strOnExtraCallbackWithResult.hashCode()) {
            case -1001078227:
                if (strOnExtraCallbackWithResult.equals("progress")) {
                    return IAuthTabCallbackStub(jsonObject);
                }
                return null;
            case 3237038:
                if (strOnExtraCallbackWithResult.equals("info")) {
                    return asInterface(jsonObject);
                }
                return null;
            case 100361836:
                if (strOnExtraCallbackWithResult.equals("intro")) {
                    int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                    showError.IAuthTabCallback iAuthTabCallback = (showError.IAuthTabCallback) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -153442639, 153442640, iIAuthTabCallback2, new Object[]{jsonObject}, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                    int i2 = asBinder + 93;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        return iAuthTabCallback;
                    }
                    throw null;
                }
                return null;
            case 110250375:
                if (strOnExtraCallbackWithResult.equals("terms")) {
                    showError.onNavigationEvent onnavigationeventOnTransact = onTransact(jsonObject);
                    int i3 = asBinder + 51;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                    return onnavigationeventOnTransact;
                }
                return null;
            case 951117504:
                if (strOnExtraCallbackWithResult.equals("confirm")) {
                    showError.onExtraCallbackWithResult onExtraCallbackWithResult2 = onExtraCallbackWithResult(jsonObject);
                    int i5 = onTransact + 93;
                    asBinder = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 36 / 0;
                    }
                    return onExtraCallbackWithResult2;
                }
                return null;
            default:
                return null;
        }
    }

    private static final showError.onExtraCallbackWithResult onExtraCallbackWithResult(JsonObject jsonObject) throws Throwable {
        String str;
        showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent;
        showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2;
        showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult;
        showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3;
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "status");
        if (Intrinsics.areEqual(strOnExtraCallbackWithResult, "collapsed")) {
            return new showError.onExtraCallbackWithResult.onNavigationEvent(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "onAction"));
        }
        if (Intrinsics.areEqual(strOnExtraCallbackWithResult, "addressList")) {
            String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
            String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
            Object[] objArr = new Object[1];
            a((char) (46329 - Color.red(0)), 111656818 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
            showError.onExtraCallbackWithResult.onExtraCallbackWithResult onextracallbackwithresult2 = new showError.onExtraCallbackWithResult.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, strOnExtraCallbackWithResult3, getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern()), onNavigationEvent(jsonObject), IAuthTabCallback(jsonObject, "secondaryCta"));
            int i2 = onTransact + 3;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult2;
        }
        JsonObject asJsonObject = jsonObject.getAsJsonObject("fields");
        String strOnExtraCallbackWithResult4 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
        String strOnExtraCallbackWithResult5 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
        Object[] objArr2 = new Object[1];
        a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46330), TextUtils.getCapsMode("", 0, 0) + 111656819, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr2);
        String strOnExtraCallbackWithResult6 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0', 0) + 1), ViewConfiguration.getEdgeSlop() >> 16, new char[]{21239, 23561, 4049, 35613, 20880, 31661, 6826, 22150}, new char[]{60092, 54998, 52413, 64200}, new char[]{24599, 412, 8993, 3291}, objArr3);
        String strOnExtraCallbackWithResult7 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr3[0]).intern());
        if (strOnExtraCallbackWithResult7.length() == 0) {
            int i4 = onTransact + 57;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = null;
        } else {
            str = strOnExtraCallbackWithResult7;
        }
        SplashUtils splashUtilsIAuthTabCallback = IAuthTabCallback(jsonObject, "primaryCta");
        SplashUtils splashUtilsIAuthTabCallback2 = IAuthTabCallback(jsonObject, "secondaryCta");
        if (asJsonObject != null) {
            Object[] objArr4 = new Object[1];
            a((char) (11947 - TextUtils.getOffsetBefore("", 0)), ViewConfiguration.getScrollBarSize() >> 8, new char[]{14228, 31211, 8580, 33863}, new char[]{60092, 54998, 52413, 64200}, new char[]{64799, 28624, 43847, 25646}, objArr4);
            onextracallbackwithresultOnNavigationEvent = onNavigationEvent(asJsonObject, ((String) objArr4[0]).intern());
        } else {
            onextracallbackwithresultOnNavigationEvent = null;
        }
        showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent4 = asJsonObject != null ? onNavigationEvent(asJsonObject, AuthCodeUtil.SCOPE_PHONE_NUMBER) : null;
        if (asJsonObject == null) {
            int i5 = asBinder + 13;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            onextracallbackwithresultOnNavigationEvent2 = null;
        } else {
            onextracallbackwithresultOnNavigationEvent2 = onNavigationEvent(asJsonObject, "email");
        }
        if (asJsonObject != null) {
            int i7 = asBinder + 31;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                onextracallbackwithresultOnNavigationEvent3 = onNavigationEvent(asJsonObject, "address");
                int i8 = 64 / 0;
            } else {
                onextracallbackwithresultOnNavigationEvent3 = onNavigationEvent(asJsonObject, "address");
            }
            onextracallbackwithresult = onextracallbackwithresultOnNavigationEvent3;
        } else {
            onextracallbackwithresult = null;
        }
        return new showError.onExtraCallbackWithResult.onWarmupCompleted(strOnExtraCallbackWithResult4, strOnExtraCallbackWithResult5, strOnExtraCallbackWithResult6, str, splashUtilsIAuthTabCallback, splashUtilsIAuthTabCallback2, new showError.onExtraCallbackWithResult.onWarmupCompleted.onWarmupCompleted(onextracallbackwithresultOnNavigationEvent, onextracallbackwithresultOnNavigationEvent4, onextracallbackwithresultOnNavigationEvent2, onextracallbackwithresult, asJsonObject != null ? onNavigationEvent(asJsonObject, "paymentMethod") : null));
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 83;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 49;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124);
                    int iResolveSize = 44 - View.resolveSize(0, 0);
                    int i8 = 1495 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$b & 3);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iResolveSize, i8, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23971), TextUtils.indexOf((CharSequence) "", '0', 0) + 51, Drawable.resolveOpacity(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45848), View.MeasureSpec.getMode(0) + 29, 12576 - TextUtils.lastIndexOf("", '0'), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i9 = $11 + 9;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final showError.onNavigationEvent onTransact(JsonObject jsonObject) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "status"), "collapsed")) {
            return new showError.onNavigationEvent.onNavigationEvent(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "onAction"));
        }
        Object[] objArr = new Object[1];
        a((char) (TextUtils.getOffsetAfter("", 0) + 46329), 111656819 + (ViewConfiguration.getScrollBarSize() >> 8), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 1, new char[]{21239, 23561, 4049, 35613, 20880, 31661, 6826, 22150}, new char[]{60092, 54998, 52413, 64200}, new char[]{24599, 412, 8993, 3291}, objArr2);
        String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr2[0]).intern());
        if (strOnExtraCallbackWithResult2.length() == 0) {
            int i4 = onTransact + 101;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = null;
        } else {
            str = strOnExtraCallbackWithResult2;
        }
        SplashUtils splashUtilsIAuthTabCallback = IAuthTabCallback(jsonObject, "primaryCta");
        SplashUtils splashUtilsIAuthTabCallback2 = IAuthTabCallback(jsonObject, "secondaryCta");
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        showError.onNavigationEvent.onExtraCallback onextracallback = new showError.onNavigationEvent.onExtraCallback(strOnExtraCallbackWithResult, str, splashUtilsIAuthTabCallback, splashUtilsIAuthTabCallback2, (List) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 405148345, -405148345, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{jsonObject}, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback()));
        int i5 = onTransact + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    private static final showError.onWarmupCompleted asInterface(JsonObject jsonObject) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean asBoolean = true;
        if (Intrinsics.areEqual(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "status"), "collapsed")) {
            String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "iconUrl");
            Object[] objArr = new Object[1];
            a((char) (TextUtils.lastIndexOf("", '0') + 46330), KeyEvent.normalizeMetaState(0) + 111656819, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
            showError.onWarmupCompleted.onWarmupCompleted onwarmupcompleted = new showError.onWarmupCompleted.onWarmupCompleted(strOnExtraCallbackWithResult, getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern()));
            int i4 = asBinder + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }
        String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
        String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{45706, 46164, 47717, 38900, 32183, 31379, 36943, 2745}, new char[]{60092, 54998, 52413, 64200}, new char[]{40320, 10061, 48313, 61500}, objArr2);
        String strOnExtraCallbackWithResult4 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr2[0]).intern());
        String str = strOnExtraCallbackWithResult4.length() == 0 ? null : strOnExtraCallbackWithResult4;
        Object[] objArr3 = new Object[1];
        a((char) (46329 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 111656819 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr3);
        String strOnExtraCallbackWithResult5 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr3[0]).intern());
        JsonElement jsonElement = jsonObject.get("interactable");
        if (jsonElement != null) {
            int i6 = asBinder + 19;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                jsonElement.getAsBoolean();
                throw null;
            }
            asBoolean = jsonElement.getAsBoolean();
        }
        return new showError.onWarmupCompleted.onExtraCallback(strOnExtraCallbackWithResult2, strOnExtraCallbackWithResult3, str, strOnExtraCallbackWithResult5, asBoolean);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final showError.onExtraCallback IAuthTabCallbackStub(JsonObject jsonObject) throws Throwable {
        List listEmptyList;
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "status");
        boolean asBoolean = true;
        switch (strOnExtraCallbackWithResult.hashCode()) {
            case -1884319283:
                if (strOnExtraCallbackWithResult.equals("stopped")) {
                    return new showError.onExtraCallback.onExtraCallbackWithResult(IAuthTabCallback(jsonObject, "primaryCta"));
                }
                return null;
            case 96784904:
                if (strOnExtraCallbackWithResult.equals(ApiDowngradeLogger.EXT_KEY_ERROR_CODE)) {
                    int i2 = asBinder + 77;
                    onTransact = i2 % 128;
                    if (i2 % 2 != 0) {
                        IAuthTabCallback(jsonObject, "primaryCta");
                        str.hashCode();
                        throw null;
                    }
                    SplashUtils splashUtilsIAuthTabCallback = IAuthTabCallback(jsonObject, "primaryCta");
                    if (splashUtilsIAuthTabCallback != null && splashUtilsIAuthTabCallback.onExtraCallbackWithResult().length() != 0) {
                        int i3 = asBinder + 63;
                        onTransact = i3 % 128;
                        int i4 = i3 % 2;
                        if (splashUtilsIAuthTabCallback.onWarmupCompleted().length() != 0) {
                            int i5 = asBinder + 95;
                            onTransact = i5 % 128;
                            int i6 = i5 % 2;
                            Object[] objArr = new Object[1];
                            a((char) (TextUtils.indexOf("", "", 0, 0) + 46329), ExpandableListView.getPackedPositionChild(0L) + 111656820, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
                            String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr[0]).intern());
                            Object[] objArr2 = new Object[1];
                            a((char) Color.red(0), ViewConfiguration.getScrollBarSize() >> 8, new char[]{21239, 23561, 4049, 35613, 20880, 31661, 6826, 22150}, new char[]{60092, 54998, 52413, 64200}, new char[]{24599, 412, 8993, 3291}, objArr2);
                            String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, ((String) objArr2[0]).intern());
                            return new showError.onExtraCallback.IAuthTabCallback(strOnExtraCallbackWithResult2, strOnExtraCallbackWithResult3.length() != 0 ? strOnExtraCallbackWithResult3 : null, splashUtilsIAuthTabCallback);
                        }
                    }
                    ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                    Object[] objArr3 = new Object[1];
                    a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-1850019805) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{35986, 14011, 32711, 30914, 19738, 35270, 50601}, new char[]{60092, 54998, 52413, 64200}, new char[]{9053, 47856, 35729, 1000}, objArr3);
                    ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, "AutomationCaUtil", "progress_error_missing_cta", (Throwable) null, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), jsonObject.toString())}), 4, (Object) null);
                    return null;
                }
                return null;
            case 1550783935:
                if (!(!strOnExtraCallbackWithResult.equals("running"))) {
                    JsonArray asJsonArray = jsonObject.getAsJsonArray("titles");
                    if (asJsonArray != null) {
                        listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
                        Iterator it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            int i7 = asBinder + 27;
                            onTransact = i7 % 128;
                            int i8 = i7 % 2;
                            listEmptyList.add(((JsonElement) it.next()).getAsString());
                            int i9 = asBinder + 107;
                            onTransact = i9 % 128;
                            if (i9 % 2 != 0) {
                                int i10 = 2 % 5;
                            }
                        }
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    List list = listEmptyList;
                    String strOnExtraCallbackWithResult4 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl");
                    String strOnExtraCallbackWithResult5 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl");
                    SplashUtils splashUtilsIAuthTabCallback2 = IAuthTabCallback(jsonObject, "primaryCta");
                    JsonElement jsonElement = jsonObject.get("interactable");
                    if (jsonElement != null) {
                        int i11 = asBinder + 67;
                        onTransact = i11 % 128;
                        int i12 = i11 % 2;
                        asBoolean = jsonElement.getAsBoolean();
                    }
                    boolean z = asBoolean;
                    String strOnExtraCallbackWithResult6 = getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "closeAction");
                    showError.onExtraCallback.onExtraCallback onextracallback = new showError.onExtraCallback.onExtraCallback(strOnExtraCallbackWithResult4, strOnExtraCallbackWithResult5, list, splashUtilsIAuthTabCallback2, z, strOnExtraCallbackWithResult6.length() == 0 ? null : strOnExtraCallbackWithResult6);
                    int i13 = onTransact + 3;
                    asBinder = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 74 / 0;
                    }
                    return onextracallback;
                }
                return null;
            case 1880183383:
                if (strOnExtraCallbackWithResult.equals("collapsed")) {
                    return new showError.onExtraCallback.onNavigationEvent(getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "logoUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "brandNameUrl"), getEmbedViewManager.onExtraCallbackWithResult(jsonObject, "onAction"));
                }
                return null;
            default:
                return null;
        }
    }

    private static final List<showError.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult> onNavigationEvent(JsonObject jsonObject) throws Throwable {
        String str;
        int i = 2 % 2;
        JsonArray asJsonArray = jsonObject.getAsJsonArray("addresses");
        if (asJsonArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
        Iterator it = asJsonArray.iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
            Intrinsics.checkNotNull(asJsonObject);
            String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "id");
            Object[] objArr = new Object[1];
            a((char) (46329 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 111656819 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
            String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            a((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{21239, 23561, 4049, 35613, 20880, 31661, 6826, 22150}, new char[]{60092, 54998, 52413, 64200}, new char[]{24599, 412, 8993, 3291}, objArr2);
            String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr2[0]).intern());
            if (strOnExtraCallbackWithResult3.length() == 0) {
                int i2 = asBinder;
                int i3 = i2 + 19;
                onTransact = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = i2 + 121;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str = null;
            } else {
                str = strOnExtraCallbackWithResult3;
            }
            String strOnExtraCallbackWithResult4 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "placeholder");
            if (strOnExtraCallbackWithResult4.length() == 0) {
                strOnExtraCallbackWithResult4 = null;
            }
            arrayList.add(new showError.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallbackWithResult(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, str, strOnExtraCallbackWithResult4, getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "onAction")));
        }
        return arrayList;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        String str;
        boolean asBoolean;
        List listEmptyList;
        JsonObject jsonObject = (JsonObject) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            jsonObject.getAsJsonArray("items");
            throw null;
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray("items");
        if (asJsonArray == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray, 10));
        Iterator it = asJsonArray.iterator();
        while (it.hasNext()) {
            int i3 = onTransact + 91;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            JsonObject asJsonObject = ((JsonElement) it.next()).getAsJsonObject();
            Intrinsics.checkNotNull(asJsonObject);
            String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "id");
            Object[] objArr2 = new Object[1];
            a((char) (46329 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 111656818, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr2);
            String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr2[0]).intern());
            String strOnExtraCallbackWithResult3 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "badge");
            if (strOnExtraCallbackWithResult3.length() == 0) {
                int i5 = asBinder + 101;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                str = null;
            } else {
                str = strOnExtraCallbackWithResult3;
            }
            JsonElement jsonElement = asJsonObject.get("checked");
            if (jsonElement != null) {
                int i7 = asBinder + 95;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    jsonElement.getAsBoolean();
                    obj.hashCode();
                    throw null;
                }
                asBoolean = jsonElement.getAsBoolean();
            } else {
                asBoolean = false;
            }
            JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("children");
            if (asJsonArray2 != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(asJsonArray2, 10));
                Iterator it2 = asJsonArray2.iterator();
                while (it2.hasNext()) {
                    int i8 = asBinder + 51;
                    onTransact = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList2.add(((JsonElement) it2.next()).getAsString());
                }
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            arrayList.add(new showError.onNavigationEvent.onExtraCallback.IAuthTabCallback(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, str, asBoolean, listEmptyList, getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "onAction")));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[PHI: r11
      0x009d: PHI (r11v5 java.lang.String) = (r11v4 java.lang.String), (r11v6 java.lang.String) binds: [B:16:0x009a, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String IAuthTabCallback(@NotNull JsonObject jsonObject) throws Throwable {
        String strOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = jsonObject.get("bottomCta");
        if (jsonElement != null) {
            if (!jsonElement.isJsonObject()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                int i2 = onTransact + 25;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null) {
                    int i4 = asBinder + 57;
                    onTransact = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a((char) (Color.red(1) * 5032), View.combineMeasuredStates(0, 0), new char[]{30447, 58078, 49861, 22541}, new char[]{60092, 54998, 52413, 64200}, new char[]{15564, 51499, 23245, 56401}, objArr);
                        strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr[0]).intern());
                        if (strOnExtraCallbackWithResult.length() == 0) {
                            return null;
                        }
                        return strOnExtraCallbackWithResult;
                    }
                    Object[] objArr2 = new Object[1];
                    a((char) (20826 - Color.red(0)), View.combineMeasuredStates(0, 0), new char[]{30447, 58078, 49861, 22541}, new char[]{60092, 54998, 52413, 64200}, new char[]{15564, 51499, 23245, 56401}, objArr2);
                    strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr2[0]).intern());
                    if (strOnExtraCallbackWithResult.length() == 0) {
                    }
                }
            }
        }
        return null;
    }

    public static final String onExtraCallback(@NotNull JsonObject jsonObject) {
        JsonObject asJsonObject;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = jsonObject.get("bottomCta");
        Object obj = null;
        if (jsonElement != null) {
            int i2 = onTransact + 89;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                jsonElement.isJsonObject();
                throw null;
            }
            if (!jsonElement.isJsonObject()) {
                jsonElement = null;
            }
            if (jsonElement != null && (asJsonObject = jsonElement.getAsJsonObject()) != null) {
                String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "onAction");
                if (strOnExtraCallbackWithResult.length() != 0) {
                    return strOnExtraCallbackWithResult;
                }
                int i3 = onTransact + 5;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i4 = asBinder + 59;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final SplashUtils IAuthTabCallback(JsonObject jsonObject, String str) throws Throwable {
        int i = 2 % 2;
        JsonObject asJsonObject = jsonObject.getAsJsonObject(str);
        if (asJsonObject == null) {
            return null;
        }
        Object[] objArr = new Object[1];
        a((char) (46328 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 111656820, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, objArr);
        String strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr[0]).intern());
        if (strOnExtraCallbackWithResult.length() == 0) {
            int i2 = asBinder + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr2 = new Object[1];
            a((char) (TextUtils.indexOf((CharSequence) "", '0') + 20827), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{30447, 58078, 49861, 22541}, new char[]{60092, 54998, 52413, 64200}, new char[]{15564, 51499, 23245, 56401}, objArr2);
            strOnExtraCallbackWithResult = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, ((String) objArr2[0]).intern());
            int i4 = onTransact + 21;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 5;
            }
        }
        String strOnExtraCallbackWithResult2 = getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "iconUrl");
        if (strOnExtraCallbackWithResult2.length() == 0) {
            strOnExtraCallbackWithResult2 = null;
        }
        return new SplashUtils(strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, getEmbedViewManager.onExtraCallbackWithResult(asJsonObject, "onAction"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r13 = new java.lang.Object[1];
        a((char) (46329 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), android.text.TextUtils.getOffsetAfter("", 0) + 111656819, new char[]{7715, 41313, 54786, 37583, 12847}, new char[]{60092, 54998, 52413, 64200}, new char[]{29549, 42943, 63750, 30388}, r13);
        r6 = o.getEmbedViewManager.onExtraCallbackWithResult(r1, ((java.lang.String) r13[0]).intern());
        r7 = new java.lang.Object[1];
        a((char) (android.os.Process.myTid() >> 22), (-1) - android.text.TextUtils.lastIndexOf("", '0', 0), new char[]{21239, 23561, 4049, 35613, 20880, 31661, 6826, 22150}, new char[]{60092, 54998, 52413, 64200}, new char[]{24599, 412, 8993, 3291}, r7);
        r4 = o.getEmbedViewManager.onExtraCallbackWithResult(r1, ((java.lang.String) r7[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r4.length() != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        r4 = o.RVFragment4.onTransact + 37;
        o.RVFragment4.asBinder = r4 % 128;
        r4 = r4 % 2;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        r5 = o.getEmbedViewManager.onExtraCallbackWithResult(r1, "placeholder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ab, code lost:
    
        if (r5.length() == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        r2 = o.RVFragment4.onTransact + 91;
        o.RVFragment4.asBinder = r2 % 128;
        r2 = r2 % 2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        r5 = new o.showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult(r6, r4, r2, o.getEmbedViewManager.onExtraCallbackWithResult(r1, "onAction"));
        r1 = o.RVFragment4.asBinder + 3;
        o.RVFragment4.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cd, code lost:
    
        r0 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final showError.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult onNavigationEvent(JsonObject jsonObject, String str) throws Throwable {
        JsonObject asJsonObject;
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onTransact = i2 % 128;
        String str2 = null;
        if (i2 % 2 != 0) {
            asJsonObject = jsonObject.getAsJsonObject(str);
            int i3 = 67 / 0;
        } else {
            asJsonObject = jsonObject.getAsJsonObject(str);
        }
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        RoundedCornerShape roundedCornerShape = onWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, roundedCornerShape), AppLovinAdRewardListener.onExtraCallbackWithResult.onWarmupCompleted(), roundedCornerShape);
        int i4 = onTransact + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0, Unit.INSTANCE, onNavigationEvent.onNavigationEvent);
        int i4 = asBinder + 107;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    static {
        IAuthTabCallbackDefault = 1;
        onWarmupCompleted();
        onWarmupCompleted = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f));
        int i = IAuthTabCallback + 111;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    private static final showError.IAuthTabCallback asBinder(JsonObject jsonObject) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (showError.IAuthTabCallback) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -153442639, 153442640, iIAuthTabCallback2, new Object[]{jsonObject}, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    private static final List<showError.onNavigationEvent.onExtraCallback.IAuthTabCallback> IAuthTabCallbackDefault(JsonObject jsonObject) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        return (List) onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 405148345, -405148345, iIAuthTabCallback2, new Object[]{jsonObject}, iIAuthTabCallback, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -7569776319333433017L;
        onExtraCallback = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
