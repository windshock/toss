package viva.republica.toss.common.web.message.handlers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IconRoundCornerProgressBarSavedState;
import o.MediaCodecInfoReportIncorrectInfoQuirk;
import o.PageAnimStore;
import o.deserializeUriNullableCollection;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestCameraPermissionHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallback = 0;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static char[] asBinder = null;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static char onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static char onTransact;
    private static final String onWarmupCompleted;

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{4763, 43838, 45191, 31013, 27307, 42343, 28715, 3054, 59600, 56117, 25603, 39639, 39329, 19461}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((byte) (View.MeasureSpec.getMode(0) + 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, new char[]{24, '\"', 17, '\r', '\"', 24}, objArr2);
        onExtraCallbackWithResult = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((byte) (95 - (ViewConfiguration.getTapTimeout() >> 16)), 10 - TextUtils.getCapsMode("", 0, 0), new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr3);
        onWarmupCompleted = ((String) objArr3[0]).intern();
        Companion = new Companion(null);
        int i = access100 + 37;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i4 | i5);
        int i8 = i6 | i7;
        int i9 = (~(i5 | (~i6))) | i4;
        int i10 = i4 + i6 + i2 + ((-1932811043) * i3) + (1521317780 * i);
        int i11 = i10 * i10;
        int i12 = ((i4 * (-919556932)) - 154402816) + ((-919556932) * i6) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i2) + ((-2098724864) * i3) + ((-1398800384) * i) + ((-1444151296) * i11);
        int i13 = (i4 * 1794637580) + 2133191799 + (i6 * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i2 * 1794637741) + (i3 * (-1844343719)) + (i * (-1188939004)) + (i11 * (-394526720));
        return i12 + ((i13 * i13) * 821297152) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = getInterfaceDescriptor + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(FragmentActivity fragmentActivity, setText settext, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(fragmentActivity, settext, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, shouldbekeptaschild);
        int i4 = getInterfaceDescriptor + 27;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, FragmentActivity fragmentActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, fragmentActivity, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, fragmentActivity, dialogInterface);
        int i3 = asInterface + 61;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setText settext, FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1736751926, new Object[]{settext, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallbackWithResult, -1736751925);
        }
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -323219250, new Object[]{function1, obj}, iOnExtraCallbackWithResult, 323219250);
            return;
        }
        int iOnExtraCallbackWithResult4 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult5, iOnExtraCallbackWithResult6, -323219250, new Object[]{function1, obj}, iOnExtraCallbackWithResult4, 323219250);
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallback();
        }
        super/*o.drawTextBox*/.onExtraCallback();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 18 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = asInterface + 119;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = asInterface + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 7;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = getInterfaceDescriptor + 33;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 51;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, FragmentActivity fragmentActivity, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        b((byte) (28 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44, new char[]{3, 15, 20, 18, 11, '\t', 25, 7, 23, 19, 13835, 13835, '\t', '\n', 28, 18, 7, 19, 13799, 13799, 18, 15, 25, 15, 0, 14, 4, 17, 22, 26, ' ', 0, 14, '\r', 27, 21, 21, 14, ' ', 0, 0, 14, 14, 28, 13798}, objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = fragmentActivity.getApplicationContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((byte) (95 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, new char[]{27, '#', 11, '\r', 30, 27, 21, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(268435456);
        PageAnimStore.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, intent, 1000, (Bundle) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.cancel();
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 73;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return unit2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        setText settext = (setText) objArr[0];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[1];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[2];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        String string = fragmentActivity.getString(R.string.app_request_camera_permission_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = new Object[1];
        b((byte) (17 - Color.argb(0, 0, 0, 0)), (Process.myPid() >> 22) + 5, new char[]{' ', 11, 30, '#', 13840}, objArr2);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(settext.onNavigationEvent(((String) objArr2[0]).intern(), string));
        String string2 = fragmentActivity.getString(R.string.app_request_camera_permission_message);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{48630, 54238, 58961, 30012, 63861, 53981, 17205, 31346}, 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(settext.onNavigationEvent(((String) objArr3[0]).intern(), string2));
        String string3 = fragmentActivity.getString(R.string.setting);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr4 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string3, (TdsButtonV1View.asInterface) null, false, new RequestCameraPermissionHandler$.ExternalSyntheticLambda3(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, fragmentActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr4, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string4 = fragmentActivity.getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Object[] objArr5 = new Object[1];
        b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 19), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, new char[]{'\t', 31, '\n', '\b', 22, 30, '\b', 14, 30, '#', 13841}, objArr5);
        Object[] objArr6 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, settext.onNavigationEvent(((String) objArr5[0]).intern(), string4), (TdsButtonV1View.asInterface) null, false, new RequestCameraPermissionHandler$.ExternalSyntheticLambda4(), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr6, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(FragmentActivity fragmentActivity, setText settext, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        b((byte) (103 - TextUtils.lastIndexOf("", '0', 0, 0)), 26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{3, 15, 20, 18, 11, '\t', 25, 7, 24, 23, 22, 5, '\n', 20, 20, '\n', 11, '\n', 3, 25, '\f', 1, 31, ' ', 13891}, objArr);
        boolean zOnNavigationEvent = MediaCodecInfoReportIncorrectInfoQuirk.onNavigationEvent(fragmentActivity, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a(new char[]{53178, 57427, 33021, 17711, 56911, 151, 54013, 23391, 60666, 37699, 22410, 33334, 58961, 30012, 29434, 4296, 27446, 53331, 62485, 30776, 53292, 35763, 59442, 566, 12866, 6381}, TextUtils.getTrimmedLength("") + 25, objArr2);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr2[0]).intern(), true})).booleanValue();
        if (!shouldbekeptaschild.onNavigationEvent && !zOnNavigationEvent) {
            int i2 = asInterface + 1;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (zBooleanValue) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(fragmentActivity, new RequestCameraPermissionHandler$.ExternalSyntheticLambda0(settext, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq));
            }
        }
        if (!(!shouldbekeptaschild.onNavigationEvent)) {
            int i4 = getInterfaceDescriptor + 103;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            b((byte) (95 - (ViewConfiguration.getLongPressTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i6 = getInterfaceDescriptor + 21;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        } else if (!zOnNavigationEvent) {
            int i8 = asInterface + 107;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
            Object[] objArr4 = new Object[1];
            b((byte) (TextUtils.lastIndexOf("", '0') + 17), KeyEvent.getDeadChar(0, 0) + 6, new char[]{24, '\"', 17, '\r', '\"', 24}, objArr4);
            strIntern = ((String) objArr4[0]).intern();
        } else {
            Object[] objArr5 = new Object[1];
            a(new char[]{4763, 43838, 45191, 31013, 27307, 42343, 28715, 3054, 59600, 56117, 25603, 39639, 39329, 19461}, Color.rgb(0, 0, 0) + 16777230, objArr5);
            strIntern = ((String) objArr5[0]).intern();
        }
        ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, strIntern);
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 17;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            throw null;
        }
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (activity == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        if (!IAuthTabCallback((Context) activity)) {
            RxPermissions rxPermissions = new RxPermissions(activity);
            Object[] objArr = new Object[1];
            b((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 104), TextUtils.lastIndexOf("", '0', 0) + 26, new char[]{3, 15, 20, 18, 11, '\t', 25, 7, 24, 23, 22, 5, '\n', 20, 20, '\n', 11, '\n', 3, 25, '\f', 1, 31, ' ', 13891}, objArr);
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = rxPermissions.onTransact(new String[]{((String) objArr[0]).intern()}).IAuthTabCallback(new RequestCameraPermissionHandler$.ExternalSyntheticLambda2(new RequestCameraPermissionHandler$.ExternalSyntheticLambda1(activity, settext, setonoutofmemeryerrorcallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            return;
        }
        int i3 = asInterface + 3;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            b((byte) (15 / (ViewConfiguration.getMaximumDrawingCacheSize() * 53)), 15 << (ViewConfiguration.getScrollBarFadeDuration() % 119), new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            b((byte) (95 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10, new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr3);
            obj = objArr3[0];
        }
        ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, ((String) obj).intern());
    }

    public void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (i == 1000) {
            int i4 = getInterfaceDescriptor + 19;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity != null) {
                if (IAuthTabCallback((Context) activity)) {
                    int i6 = getInterfaceDescriptor + 117;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        b((byte) (Color.alpha(0) * 80), 45 << Color.alpha(1), new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        b((byte) (Color.alpha(0) + 95), Color.alpha(0) + 10, new char[]{14, 31, 1, 26, 1, '#', '\r', 15, '\"', 24}, objArr2);
                        obj = objArr2[0];
                    }
                    ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, ((String) obj).intern());
                    return;
                }
                Object[] objArr3 = new Object[1];
                b((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 16), 6 - ExpandableListView.getPackedPositionGroup(0L), new char[]{24, '\"', 17, '\r', '\"', 24}, objArr3);
                ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, ((String) objArr3[0]).intern());
            }
        }
        int i7 = asInterface + 117;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        r8 = viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.getInterfaceDescriptor + 93;
        viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.asInterface = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        if ((r8 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r8, ((java.lang.String) r6[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r8, ((java.lang.String) r6[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0063, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean IAuthTabCallback(android.content.Context r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.asInterface
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.getInterfaceDescriptor = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 25
            if (r1 != 0) goto L3c
            int r1 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r1 = r1 << 22
            r5 = 73
            int r1 = r5 >> r1
            byte r1 = (byte) r1
            int r5 = android.view.View.MeasureSpec.getSize(r3)
            int r5 = r5 * 78
            char[] r4 = new char[r4]
            r4 = {x0072: FILL_ARRAY_DATA , data: [3, 15, 20, 18, 11, 9, 25, 7, 24, 23, 22, 5, 10, 20, 20, 10, 11, 10, 3, 25, 12, 1, 31, 32, 13891} // fill-array
            java.lang.Object[] r6 = new java.lang.Object[r3]
            b(r1, r5, r4, r6)
            r1 = r6[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r8 = androidx.core.content.ContextCompat.checkSelfPermission(r8, r1)
            if (r8 != 0) goto L64
            goto L63
        L3c:
            int r1 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r1 = r1 >> 16
            int r1 = r1 + 104
            byte r1 = (byte) r1
            int r5 = android.view.View.MeasureSpec.getSize(r2)
            int r5 = 25 - r5
            char[] r4 = new char[r4]
            r4 = {x0090: FILL_ARRAY_DATA , data: [3, 15, 20, 18, 11, 9, 25, 7, 24, 23, 22, 5, 10, 20, 20, 10, 11, 10, 3, 25, 12, 1, 31, 32, 13891} // fill-array
            java.lang.Object[] r6 = new java.lang.Object[r3]
            b(r1, r5, r4, r6)
            r1 = r6[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r8 = androidx.core.content.ContextCompat.checkSelfPermission(r8, r1)
            if (r8 != 0) goto L64
        L63:
            return r3
        L64:
            int r8 = viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.getInterfaceDescriptor
            int r8 = r8 + 93
            int r1 = r8 % 128
            viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.asInterface = r1
            int r8 = r8 % r0
            if (r8 != 0) goto L70
            return r2
        L70:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestCameraPermissionHandler.IAuthTabCallback(android.content.Context):boolean");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 39;
            $11 = i5 % 128;
            char c = 1;
            if (i5 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = $10 + 19;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                        int iNormalizeMetaState = 12434 - KeyEvent.normalizeMetaState(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatTimeout, tapTimeout, iNormalizeMetaState, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i11 = i6;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - KeyEvent.getDeadChar(0, 0), 12433 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 = i11 - 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 14 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i12 = $10 + 21;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i14 = $10 + 79;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = asBinder;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 121;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), View.MeasureSpec.getMode(0) + 26, 23139 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i4 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 26 - View.MeasureSpec.makeMeasureSpec(0, 0), 23139 - (ViewConfiguration.getTapTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
            }
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallbackStub)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        char c = '0';
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 25 - TextUtils.lastIndexOf("", '0', 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 29;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 24824), TextUtils.indexOf("", c) + 75, 8088 - (ViewConfiguration.getScrollBarSize() >> 8), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 31 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19487, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i11 = $11 + 93;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
                c = '0';
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final Unit onWarmupCompleted(setText settext, FragmentActivity fragmentActivity, r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, 1736751926, new Object[]{settext, fragmentActivity, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallbackWithResult, -1736751925);
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
        IAuthTabCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, -323219250, new Object[]{function1, obj}, iOnExtraCallbackWithResult, 323219250);
    }

    static void IAuthTabCallback() {
        onExtraCallback = (char) 23344;
        IAuthTabCallback = (char) 54245;
        IAuthTabCallbackDefault = (char) 872;
        onTransact = (char) 39713;
        asBinder = new char[]{65022, 64925, 64999, 64905, 64990, 65020, 64995, 64976, 64986, 64989, 64988, 65009, 65018, 65010, 65001, 64992, 65021, 64984, 64982, 64983, 65004, 65023, 64960, 64961, 64980, 65019, 65012, 65008, 65015, 64963, 65014, 64993, 64998, 64978, 64991, 64967};
        IAuthTabCallbackStub = (char) 51247;
    }
}
