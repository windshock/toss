package viva.republica.toss.common.web.message.handlers;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.IconRoundCornerProgressBarSavedState;
import o.deserializeUriNullableCollection;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RequestPhonePermissionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestPhonePermissionHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 3315411520391056047L;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit onExtraCallback(RequestPhonePermissionHandler requestPhonePermissionHandler, FragmentActivity fragmentActivity, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(requestPhonePermissionHandler, fragmentActivity, setonoutofmemeryerrorcallback, th);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(RequestPhonePermissionHandler requestPhonePermissionHandler, FragmentActivity fragmentActivity, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(requestPhonePermissionHandler, fragmentActivity, setonoutofmemeryerrorcallback, shouldbekeptaschild);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted, 993397001, iOnWarmupCompleted2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -993397000);
            return;
        }
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted3, 993397001, iOnWarmupCompleted4, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -993397000);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i6 | i9;
        int i11 = ~i6;
        int i12 = i9 | (~(i11 | i3));
        int i13 = (~(i2 | i7 | i6)) | (~(i8 | i11 | i7));
        int i14 = i3 + i6 + i4 + ((-619979367) * i) + (68302741 * i5);
        int i15 = i14 * i14;
        int i16 = (i3 * 561304900) + 382271488 + (561304900 * i6) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i) + ((-1821507584) * i5) + (428933120 * i15);
        int i17 = ((i3 * (-96142684)) - 56799437) + (i6 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i * (-1380774991)) + (i5 * (-1175232947)) + (i15 * (-118947840));
        if (i16 + (i17 * i17 * (-1369505792)) == 1) {
            return IAuthTabCallback(objArr);
        }
        Activity activity = (Activity) objArr[1];
        int i18 = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{4089, 22281, 48642, 1303, 27659, 45834, 6662, 24911, 51219, 12042, 30234, 56601, 9221, 35589, 53773, 14618, 32838, 59190, 20006, 38181, 64568, 17210, 43569, 61744, 22564, 48950, 1585, 27955, 46115, 6975, 25151, 51501, 4153, 30478, 56842, 9494, 35867, 54032, 14855, 33045, 59412, 20230, 38400, 64778, 17439}, 22783 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        Intent intent = new Intent(((String) objArr2[0]).intern());
        String packageName = activity.getApplicationContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a(new char[]{4072, 19720, 35353, 50976, 1085, 16714, 40539, 56117}, View.MeasureSpec.makeMeasureSpec(0, 0) + 17137, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        activity.startActivity(intent);
        int i19 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i3 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 13 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            return;
        }
        onExtraCallback(activity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback);
        int i4 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(RequestPhonePermissionHandler requestPhonePermissionHandler, FragmentActivity fragmentActivity, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!shouldbekeptaschild.onNavigationEvent && !shouldbekeptaschild.onExtraCallbackWithResult) {
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{requestPhonePermissionHandler, fragmentActivity}, iOnWarmupCompleted, -1486993571, iOnWarmupCompleted2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486993571);
            } else {
                int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{requestPhonePermissionHandler, fragmentActivity}, iOnWarmupCompleted3, -1486993571, iOnWarmupCompleted4, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486993571);
                throw null;
            }
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(RequestPhonePermissionHandler requestPhonePermissionHandler, FragmentActivity fragmentActivity, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{requestPhonePermissionHandler, fragmentActivity}, iOnWarmupCompleted, -1486993571, iOnWarmupCompleted2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486993571);
            i = 0;
        } else {
            int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            int iOnWarmupCompleted4 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
            onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{requestPhonePermissionHandler, fragmentActivity}, iOnWarmupCompleted3, -1486993571, iOnWarmupCompleted4, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486993571);
            i = 1;
        }
        setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, (Function1) null, i, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String[] strArr;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 26) {
            Object[] objArr = new Object[1];
            a(new char[]{4089, 23941, 43802, 63667, 17979, 37838, 57678, 20115, 40048, 59894, 14228, 34052, 53909, 8252, 36257, 56140, 10439, 30293, 50080, 4419, 32545, 52406, 6718, 26514, 46336, 747, 20601, 48631, 2889, 22720, 42673, 62497, 16825, 44831, 64667}, 21107 - Drawable.resolveOpacity(0, 0), objArr);
            strArr = new String[]{((String) objArr[0]).intern()};
        } else {
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                strArr = new String[3];
                Object[] objArr2 = new Object[1];
                a(new char[]{4089, 23941, 43802, 63667, 17979, 37838, 57678, 20115, 40048, 59894, 14228, 34052, 53909, 8252, 36257, 56140, 10439, 30293, 50080, 4419, 32545, 52406, 6718, 26514, 46336, 747, 20601, 48631, 2889, 22720, 42673, 62497, 16825, 44831, 64667}, 10414 / (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), objArr2);
                strArr[0] = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a(new char[]{4089, 2447, 782, 7297, 5651, 12204, 10538, 8953, 15392, 13756, 20304, 18630, 16989, 23502, 21877, 28390, 26727, 25087, 31540, 30001, 36521, 34868, 33210, 39704, 38032, 44545, 42909, 41237, 47841, 46194, 52728, 51050, 49397, 55875, 54223, 60737, 59087}, (ViewConfiguration.getEdgeSlop() >> 40) + 19018, objArr3);
                strArr[0] = ((String) objArr3[0]).intern();
            } else {
                Object[] objArr4 = new Object[1];
                a(new char[]{4089, 23941, 43802, 63667, 17979, 37838, 57678, 20115, 40048, 59894, 14228, 34052, 53909, 8252, 36257, 56140, 10439, 30293, 50080, 4419, 32545, 52406, 6718, 26514, 46336, 747, 20601, 48631, 2889, 22720, 42673, 62497, 16825, 44831, 64667}, 21107 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                a(new char[]{4089, 2447, 782, 7297, 5651, 12204, 10538, 8953, 15392, 13756, 20304, 18630, 16989, 23502, 21877, 28390, 26727, 25087, 31540, 30001, 36521, 34868, 33210, 39704, 38032, 44545, 42909, 41237, 47841, 46194, 52728, 51050, 49397, 55875, 54223, 60737, 59087}, (ViewConfiguration.getEdgeSlop() >> 16) + 1657, objArr5);
                strArr = new String[]{strIntern, ((String) objArr5[0]).intern()};
            }
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = new RxPermissions(fragmentActivity).onTransact((String[]) Arrays.copyOf(strArr, strArr.length)).onExtraCallbackWithResult(new RequestPhonePermissionHandler$.ExternalSyntheticLambda1(new RequestPhonePermissionHandler$.ExternalSyntheticLambda0(this, fragmentActivity, setonoutofmemeryerrorcallback)), new RequestPhonePermissionHandler$.ExternalSyntheticLambda3(new RequestPhonePermissionHandler$.ExternalSyntheticLambda2(this, fragmentActivity, setonoutofmemeryerrorcallback)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        int i3 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 45;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), Color.rgb(0, 0, 0) + 16777240, TextUtils.lastIndexOf("", '0') + 19628, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() * (IAuthTabCallback - 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") + 59, MotionEvent.axisFromString("") + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 59, 6383 - TextUtils.getTrimmedLength(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i8 = $11 + 63;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i10 = $10 + 57;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 59, 6383 - TextUtils.indexOf("", ""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i11 = 9 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), ImageFormat.getBitsPerPixel(0) + 60, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{function1, obj}, iOnWarmupCompleted, 993397001, iOnWarmupCompleted2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -993397000);
    }

    private final void onNavigationEvent(Activity activity) throws Throwable {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this, activity}, iOnWarmupCompleted, -1486993571, iOnWarmupCompleted2, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1486993571);
    }
}
