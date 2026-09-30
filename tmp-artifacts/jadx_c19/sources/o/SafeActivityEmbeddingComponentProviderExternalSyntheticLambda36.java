package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.alibaba.ariver.kernel.RVParams;
import im.toss.appsintoss.R;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda36 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallbackWithResult = -5244191016582517182L;
    private static int onNavigationEvent = 1;

    private static final boolean onExtraCallback(String str) {
        FaceDetectCallBack faceDetectCallBack;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
            z = true;
        } else {
            faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
            z = false;
        }
        return FaceDetectCallBack.onExtraCallback(faceDetectCallBack, str, z, 2, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 IAuthTabCallback(@NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, @Nullable String str, @Nullable String str2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        String str3;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33 safeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
        String strOnExtraCallback;
        String str4;
        String strOnExtraCallback2;
        String str5;
        String str6;
        int i3 = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{27421, 20118, 8239, 7104, 64858, 53436, 35536, 27771, 18366, 14670, 7410, 63100, 43016, 33725, 25881, 22744, 12906, 5121, 53144, 41326, 34000, 32379, 20896, 3031, 60729, 49381, 47702, 40361, 30647, 10583, 3201, 59001, 55736, 45943, 38217, 18662, 8712, 1430, 65329, 53508, 46211, 28221}, 9623 - KeyEvent.getDeadChar(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        str3 = "";
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onNavigationEvent + 37;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1121542276, i2, -1, "im.toss.appsintoss.iap.model.toUIModel (InAppTossPurchaseErrorUIModel.kt:55)");
        }
        if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onNavigationEvent.onNavigationEvent) || Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234652751);
            String strOnExtraCallback3 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_server_error_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
            String strOnExtraCallback4 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_server_error_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0);
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult.Companion.onWarmupCompleted(null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 7);
            Object[] objArr2 = new Object[1];
            a(new char[]{27421, 12002, 57543, 47788, 31882, 13856, 51208, 33391, 17438, 8186, 53706, 27584, 11704, 59281, 47409, 29516, 13610, 53013, 33520, 17538, 7840, 53383, 27352, 11299, 58969, 47219, 29214, 13801, 53198, 33192, 23430, 7547, 55098, 26947, 9058, 58682, 47276, 29323, 13566, 52941, 32895, 23115, 7231, 54817, 26627, 9212, 58769, 49064, 29067, 2913}, 17891 - TextUtils.getTrimmedLength(""), objArr2);
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(((String) objArr2[0]).intern(), strOnExtraCallback3, strOnExtraCallback4, null, onextracallbackwithresultOnWarmupCompleted, 8, null);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = null;
            if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onWarmupCompleted.onExtraCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1316154362);
                FaceDetectCallBack faceDetectCallBack = FaceDetectCallBack.onExtraCallbackWithResult;
                if (str2 != null) {
                    int i6 = IAuthTabCallback + 39;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    str3 = str2;
                }
                boolean zOnExtraCallback = FaceDetectCallBack.onExtraCallback(faceDetectCallBack, str3, false, 2, (Object) null);
                int i8 = R.string.appsintoss_in_app_purchase_error_already_owned_title;
                if (zOnExtraCallback) {
                    int i9 = IAuthTabCallback + 51;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    str5 = "이";
                } else {
                    str5 = "가";
                }
                String str7 = str2 + str5;
                if (zOnExtraCallback) {
                    int i11 = onNavigationEvent + 69;
                    IAuthTabCallback = i11 % 128;
                    int i12 = i11 % 2;
                    str6 = "은";
                } else {
                    str6 = "는";
                }
                safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(strIntern, DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i8, new Object[]{str7, str2 + str6}, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult.Companion.onWarmupCompleted(null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 7), 4, null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallback_Parcel.onExtraCallbackWithResult)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234615542);
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(strIntern, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_user_problem_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_user_problem_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), CollectionsKt.listOf(new String[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_user_problem_problem_1, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_in_app_purchase_error_user_problem_problem_2, new Object[]{str2 + (onExtraCallback(str2 != null ? str2 : "") ? "을" : "를")}, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_user_problem_problem_3, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_user_problem_problem_4, cameraCaptureResultEmptyCameraCaptureResult, 0)})), SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult.Companion.onWarmupCompleted(null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 7), 4, null);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onTransact.onExtraCallback)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234577861);
                    if (str == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1318111361);
                        strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_title_default, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1318241685);
                        strOnExtraCallback2 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_title, cameraCaptureResultEmptyCameraCaptureResult, 0), Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(strOnExtraCallback2, "");
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    String strOnExtraCallback5 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_title_description, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    String strOnExtraCallback6 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234554788);
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    if (str != null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1606818056);
                        String str8 = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_case_network, cameraCaptureResultEmptyCameraCaptureResult, 0), Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(str8, "");
                        listCreateListBuilder.add(str8);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1606629700);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (str == null || str2 == null) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1606144612);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1606541505);
                        listCreateListBuilder.add(DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_granted_case_partner, new Object[]{str, str2 + (onExtraCallback(str2) ? "을" : "를")}, cameraCaptureResultEmptyCameraCaptureResult, 0));
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    Unit unit = Unit.INSTANCE;
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(strIntern, strOnExtraCallback2, strOnExtraCallback5, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.IAuthTabCallback(strOnExtraCallback6, listBuild), new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_cta, cameraCaptureResultEmptyCameraCaptureResult, 0), "refund", SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.C0041onExtraCallback.onWarmupCompleted, null, null, null, null, null, null, 504, null));
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else if (!Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.asInterface.onExtraCallbackWithResult)) {
                    int i13 = onNavigationEvent + 103;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackDefault.onExtraCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234517635);
                        if (str2 != null) {
                            int i15 = IAuthTabCallback + 105;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1320019318);
                            strOnExtraCallback = String.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_title, cameraCaptureResultEmptyCameraCaptureResult, 0), Arrays.copyOf(new Object[]{str2}, 1));
                            Intrinsics.checkNotNullExpressionValue(strOnExtraCallback, "");
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1320159593);
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_title_default, cameraCaptureResultEmptyCameraCaptureResult, 0);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(strIntern, strOnExtraCallback, null, null, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_post_purchase_cta, cameraCaptureResultEmptyCameraCaptureResult, 0), "refund", SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.C0041onExtraCallback.onWarmupCompleted, null, null, null, null, null, null, 504, null), 4, null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.asBinder.onExtraCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234492601);
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(strIntern, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_product_info_title, cameraCaptureResultEmptyCameraCaptureResult, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_product_info_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), null, new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_cta_contact, cameraCaptureResultEmptyCameraCaptureResult, 0), "report", SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_cta_close, cameraCaptureResultEmptyCameraCaptureResult, 0), "close", SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult, null, null, null, 448, null), 8, null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.onExtraCallbackWithResult.onExtraCallback)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234466112);
                        int i17 = R.string.appsintoss_in_app_purchase_error_temporary_title;
                        if (str2 != null) {
                            int i18 = IAuthTabCallback + 89;
                            onNavigationEvent = i18 % 128;
                            if (i18 % 2 == 0) {
                                safeActivityEmbeddingComponentProviderExternalSyntheticLambda33.hashCode();
                                throw null;
                            }
                            str4 = str2;
                        } else {
                            str4 = "";
                        }
                        String strIAuthTabCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.IAuthTabCallback(i17, new Object[]{str2 + (onExtraCallback(str4) ? "을" : "를")}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        String strOnExtraCallback7 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_cta_reserving_notification, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onNavigationEvent onnavigationevent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult;
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult onextracallbackwithresult = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult(strOnExtraCallback7, "register_alarm", onnavigationevent, null, null, null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_cta_do_next, cameraCaptureResultEmptyCameraCaptureResult, 0), "next", onnavigationevent, 56, null);
                        Object[] objArr3 = new Object[1];
                        a(new char[]{27421, 52220, 11003, 35314, 59634, 20414, 44724, 3505, 27886, 50148, 8950, 33246, 57536, 18383, 42637, 1490, 25802, 56267, 15052, 39324, 63704, 24537, 48868, 7677, 31913, 54253, 12962, 37303, 61622, 22454, 46778, 5541, 29946, 43933, 2782, 27044, 51415, 12197, 36556, 60883, 19602, 41858, 662, 24932, 49262, 10089, 34350, 58725, 17514, 47990, 6778, 31036, 55393, 16250, 40524}, TextUtils.lastIndexOf("", '0', 0) + 41214, objArr3);
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(((String) objArr3[0]).intern(), strIAuthTabCallback, null, null, onextracallbackwithresult, 4, null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else if (Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallback.onNavigationEvent)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234436438);
                        String strOnExtraCallback8 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_only_korean_title, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        String strOnExtraCallback9 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_in_app_purchase_error_only_korean_description, cameraCaptureResultEmptyCameraCaptureResult, 0);
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted2 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33.onExtraCallbackWithResult.Companion.onWarmupCompleted(null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 7);
                        Object[] objArr4 = new Object[1];
                        a(new char[]{27421, 64236, 18651, 57026, 11442, 45806, 212, 38433, 58478, 19028, 55382, 11822, 48128, 543, 37293, 59362, 30154, 56251, 10668, 49100, 3480, 37737, 57604, 30477, 50473, 11135, 47378, 2235, 40671, 60575, 29315, 49282, 22264, 42125, 2621, 38948, 61024, 31748, 49781, 20510, 42515, 13799}, View.resolveSize(0, 0) + 37357, objArr4);
                        safeActivityEmbeddingComponentProviderExternalSyntheticLambda33 = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda33(((String) objArr4[0]).intern(), strOnExtraCallback8, strOnExtraCallback9, null, onextracallbackwithresultOnWarmupCompleted2, 8, null);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        if (!Intrinsics.areEqual(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStubProxy.onWarmupCompleted)) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-234649189);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            throw new NoWhenBranchMatchedException();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1322833497);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        int i19 = IAuthTabCallback + 87;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                    }
                }
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return safeActivityEmbeddingComponentProviderExternalSyntheticLambda33;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 35;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.resolveSizeAndState(0, 0, 0) + 24, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19627, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                try {
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 59 - View.combineMeasuredStates(0, 0), 6383 - View.getDefaultSize(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i7 = $11 + 1;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 59 - (Process.myPid() >> 22), 6382 - TextUtils.indexOf((CharSequence) "", '0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }
}
