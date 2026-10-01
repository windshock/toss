package im.toss.appsintoss.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.tmoney.LiveCheckConstants;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$;
import im.toss.appsintoss.iap.InAppPurchasePreparationActivity;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageService_Parcel;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.access13800;
import o.access8100;
import o.dequeImageProxy;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getHostnameVerifierokhttp;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onSessionEnded;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.toMetersPerSecond;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class InAppPurchaseHistoryDetailActivity extends Hilt_InAppPurchaseHistoryDetailActivity {
    public static final onExtraCallbackWithResult Companion;
    private static long IAuthTabCallbackDefault;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy;
    private static char access000;
    private static int asBinder;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {69, 81, 99, -123};
    private static final int $$b = 29;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int access100 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private final Lazy onTransact = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(InAppPurchaseHistoryDetailViewModel.class), new IAuthTabCallbackStub(this), new asInterface(this), new asBinder(null, this));
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface = registerForActivityResult(new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity$$ExternalSyntheticLambda8
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final void onActivityResult(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            InAppPurchaseHistoryDetailActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
            int i4 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3;
        int i4 = (b * 3) + 4;
        int i5 = s * 4;
        int i6 = 110 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            i4 += i6;
            i3 = i8 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i8 = i3;
            i6 = bArr[i3];
            i4 += i6;
            i3 = i8 + 1;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i4 = i6;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    static {
        IAuthTabCallbackStubProxy = 1;
        onNavigationEvent();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackStub = 8;
        int i = getInterfaceDescriptor + 55;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(inAppPurchaseHistoryDetailActivity, str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchaseHistoryDetailActivity, str, str2);
        int i3 = access100 + 39;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 39;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            access000(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitAccess000 = access000(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
        int i3 = access100 + 11;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return unitAccess000;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(inAppPurchaseHistoryDetailActivity, str, str2);
        int i4 = access100 + 59;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchaseHistoryDetailActivity);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit asBinder(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
        int i4 = access100 + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | i6)) | (~(i3 | i2 | i6));
        int i10 = ~i6;
        int i11 = (~(i8 | i3)) | (~(i8 | i10));
        int i12 = (~(i6 | i2)) | (~(i7 | i10));
        int i13 = i3 + i2 + i5 + ((-564018846) * i4) + (483938512 * i);
        int i14 = i13 * i13;
        int i15 = ((i3 * 1456092922) - 824780772) + (i2 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (1456093799 * i5) + (578355822 * i4) + (1098359728 * i) + (i14 * 1868693504);
        switch ((1473915126 * i3) + 752877568 + ((-1516524009) * i2) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i5) + (1390411776 * i4) + (452984832 * i) + ((-1135738880) * i14) + (i15 * i15 * 2110914560)) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                int i16 = 2 % 2;
                ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2058746L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda3((String) objArr[1], (String) objArr[2], (InAppPurchaseHistoryDetailActivity) objArr[0]), 14, null);
                int i17 = IAuthTabCallback_Parcel + 89;
                access100 = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackStub(objArr);
            default:
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                getHostnameVerifierokhttp gethostnameverifierokhttp = (InAppPurchaseHistoryDetailActivity) objArr[2];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
                int i19 = 2 % 2;
                int i20 = IAuthTabCallback_Parcel + 33;
                access100 = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                setDetectableSize.onExtraCallback("service_name", str);
                setDetectableSize.onExtraCallback("order_id", str2);
                Object[] objArr2 = new Object[1];
                a((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Intent intent = gethostnameverifierokhttp.getIntent();
                Object[] objArr3 = new Object[1];
                a((char) (TextUtils.lastIndexOf("", '0') + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr3);
                setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr3[0]).intern()));
                Unit unit = Unit.INSTANCE;
                int i22 = access100 + 119;
                IAuthTabCallback_Parcel = i22 % 128;
                int i23 = i22 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(inAppPurchaseHistoryDetailActivity);
        int i4 = IAuthTabCallback_Parcel + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1339870819, -1339870815, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult);
            int i3 = 58 / 0;
        } else {
            int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1339870819, -1339870815, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult4);
        }
        int i4 = access100 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = access100 + 17;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(inAppPurchaseHistoryDetailActivity, str, str2);
        }
        asBinder(inAppPurchaseHistoryDetailActivity, str, str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = access100 + 119;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {inAppPurchaseHistoryDetailActivity};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 == 0) {
            unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult4, 1647488084, -1647488082, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
            int i4 = 93 / 0;
        } else {
            unit = (Unit) onExtraCallback(iOnExtraCallbackWithResult4, 1647488084, -1647488082, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
        }
        int i5 = IAuthTabCallback_Parcel + 69;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 123;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2136781134, -2136781125, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
        int i5 = IAuthTabCallback_Parcel + 67;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchaseHistoryDetailActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = access100 + 1;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 != 0) {
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -929940688, 929940688, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 63;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onTransact(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(inAppPurchaseHistoryDetailActivity, str, str2);
        int i4 = access100 + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(inAppPurchaseHistoryDetailActivity);
        int i4 = IAuthTabCallback_Parcel + 99;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -902493630, 902493635, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{inAppPurchaseHistoryDetailActivity, str}, iOnExtraCallbackWithResult4);
        int i3 = IAuthTabCallback_Parcel + 59;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback_Parcel(inAppPurchaseHistoryDetailActivity, str, str2);
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(inAppPurchaseHistoryDetailActivity, str, str2);
        int i3 = IAuthTabCallback_Parcel + 119;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        Unit unit = (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1110436919, -1110436918, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, onextracallbackwithresult}, iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback_Parcel + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize);
        int i4 = IAuthTabCallback_Parcel + 27;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(inAppPurchaseHistoryDetailActivity, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return 1639236L;
        }
        int i3 = 3 / 0;
        return 1639236L;
    }

    public static final /* synthetic */ InAppPurchaseHistoryDetailViewModel onExtraCallbackWithResult(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryDetailViewModel engagementSignalsCallback = inAppPurchaseHistoryDetailActivity.setEngagementSignalsCallback();
        int i4 = IAuthTabCallback_Parcel + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, Map map) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailActivity.onNavigationEvent(str, (Map<String, ? extends Object>) map);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access100 + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final InAppPurchaseHistoryDetailViewModel setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchaseHistoryDetailViewModel inAppPurchaseHistoryDetailViewModel = (InAppPurchaseHistoryDetailViewModel) this.onTransact.getValue();
        int i4 = IAuthTabCallback_Parcel + 21;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return inAppPurchaseHistoryDetailViewModel;
    }

    private static final void onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            inAppPurchaseHistoryDetailActivity.setEngagementSignalsCallback().IAuthTabCallback();
        } else {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            inAppPurchaseHistoryDetailActivity.setEngagementSignalsCallback().IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public asInterface(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = onWarmupCompleted + 89;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 47 / 0;
            }
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.IAuthTabCallback;
            if (i3 != 0) {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
            componentActivity.getDefaultViewModelProviderFactory();
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.app.Activity, im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity] */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ?? r2 = (InAppPurchaseHistoryDetailActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SessionTrackerb.IAuthTabCallback(r2.IAuthTabCallback(), (Activity) r2, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onTransact(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {inAppPurchaseHistoryDetailActivity};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        if (i3 != 0) {
            onExtraCallback(iOnExtraCallbackWithResult4, 2020349296, -2020349286, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
            unit = Unit.INSTANCE;
            int i4 = 6 / 0;
        } else {
            onExtraCallback(iOnExtraCallbackWithResult4, 2020349296, -2020349286, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
            unit = Unit.INSTANCE;
        }
        int i5 = IAuthTabCallback_Parcel + 15;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1169155747, 1169155755, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1169155747, 1169155755, iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult4);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.IAuthTabCallback.getViewModelStore();
            int i4 = onExtraCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return IAuthTabCallback();
            }
            IAuthTabCallback();
            throw null;
        }
    }

    private static final Unit asInterface(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        inAppPurchaseHistoryDetailActivity.onWarmupCompleted(str, str2);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onNavigationEvent;

        public asBinder(Function0 function0, ComponentActivity componentActivity) {
            this.onNavigationEvent = function0;
            this.IAuthTabCallback = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            int i3 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
          0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v8 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            Function0 function0;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                function0 = this.onNavigationEvent;
                int i3 = 82 / 0;
                if (function0 != null) {
                    AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                    if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                        int i4 = onWarmupCompleted + 21;
                        onExtraCallbackWithResult = i4 % 128;
                        int i5 = i4 % 2;
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                }
            } else {
                function0 = this.onNavigationEvent;
                if (function0 != null) {
                }
            }
            return this.IAuthTabCallback.getDefaultViewModelCreationExtras();
        }
    }

    private static final Unit IAuthTabCallbackStub(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 69;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            inAppPurchaseHistoryDetailActivity.onNavigationEvent(onextracallbackwithresult);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        inAppPurchaseHistoryDetailActivity.onNavigationEvent(onextracallbackwithresult);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDetailActivity.ICustomTabsServiceStub();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 57;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            inAppPurchaseHistoryDetailActivity.onTransact(str, str2);
            unit = Unit.INSTANCE;
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            inAppPurchaseHistoryDetailActivity.onTransact(str, str2);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback_Parcel + 103;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit getInterfaceDescriptor(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            inAppPurchaseHistoryDetailActivity.onNavigationEvent(str, str2);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        inAppPurchaseHistoryDetailActivity.onNavigationEvent(str, str2);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        inAppPurchaseHistoryDetailActivity.onExtraCallback(str, str2);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 59;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1081118039, -1081118033, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 23;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        boolean zOnExtraCallback;
        Object obj2;
        boolean zOnExtraCallback2;
        Object obj3;
        boolean zOnExtraCallback3;
        Object obj4;
        boolean zOnExtraCallback4;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallback_Parcel + 77;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                throw null;
            }
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = access100 + 101;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-657624799, i2, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailActivity.kt:69)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            InAppPurchaseHistoryDetailViewModel engagementSignalsCallback = inAppPurchaseHistoryDetailActivity.setEngagementSignalsCallback();
            boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback5 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda10(inAppPurchaseHistoryDetailActivity);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Function1 function1 = (Function1) objOnMinimized;
            boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback6) {
                int i7 = access100 + 39;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 0;
                    obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda13 externalSyntheticLambda13 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda13(inAppPurchaseHistoryDetailActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda13);
                        obj = externalSyntheticLambda13;
                    }
                    Function0 function0 = (Function0) obj;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                        Object obj5 = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda14(inAppPurchaseHistoryDetailActivity);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                            obj5 = externalSyntheticLambda14;
                        }
                        Function2 function2 = (Function2) obj5;
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                        Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnExtraCallback7) {
                            Object obj6 = objOnMinimized4;
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda15(inAppPurchaseHistoryDetailActivity);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda15);
                                obj6 = externalSyntheticLambda15;
                            }
                            Function2 function22 = (Function2) obj6;
                            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnExtraCallback8) {
                                Object obj7 = objOnMinimized5;
                                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda16(inAppPurchaseHistoryDetailActivity);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda16);
                                    obj7 = externalSyntheticLambda16;
                                }
                                Function0 function02 = (Function0) obj7;
                                boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnExtraCallback9) {
                                    Object obj8 = objOnMinimized6;
                                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda17 externalSyntheticLambda17 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda17(inAppPurchaseHistoryDetailActivity);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda17);
                                        obj8 = externalSyntheticLambda17;
                                    }
                                    Function0 function03 = (Function0) obj8;
                                    boolean zOnExtraCallback10 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnExtraCallback10) {
                                        InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda18(inAppPurchaseHistoryDetailActivity);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                                        obj2 = externalSyntheticLambda18;
                                        Function1 function12 = (Function1) obj2;
                                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (zOnExtraCallback2) {
                                            Object obj9 = objOnMinimized8;
                                            if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda19 externalSyntheticLambda19 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda19(inAppPurchaseHistoryDetailActivity);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda19);
                                                int i9 = access100 + 7;
                                                IAuthTabCallback_Parcel = i9 % 128;
                                                int i10 = i9 % 2;
                                                obj9 = externalSyntheticLambda19;
                                            }
                                            Function0 function04 = (Function0) obj9;
                                            boolean zOnExtraCallback11 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                            if (!(!zOnExtraCallback11)) {
                                                InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda20 externalSyntheticLambda20 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda20(inAppPurchaseHistoryDetailActivity);
                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda20);
                                                obj3 = externalSyntheticLambda20;
                                                Function2 function23 = (Function2) obj3;
                                                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                if (zOnExtraCallback3) {
                                                    Object obj10 = objOnMinimized10;
                                                    if (objOnMinimized10 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda21 externalSyntheticLambda21 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda21(inAppPurchaseHistoryDetailActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda21);
                                                        obj10 = externalSyntheticLambda21;
                                                    }
                                                    Function2 function24 = (Function2) obj10;
                                                    boolean zOnExtraCallback12 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                    if (zOnExtraCallback12) {
                                                        InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda11(inAppPurchaseHistoryDetailActivity);
                                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                                        obj4 = externalSyntheticLambda11;
                                                        Function2 function25 = (Function2) obj4;
                                                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (zOnExtraCallback4) {
                                                            Object obj11 = objOnMinimized12;
                                                            if (objOnMinimized12 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                                InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda12(inAppPurchaseHistoryDetailActivity);
                                                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                                                                obj11 = externalSyntheticLambda12;
                                                            }
                                                            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda52.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, engagementSignalsCallback, false, function1, function0, function2, function22, function02, function03, function12, function04, function23, function24, function25, (Function2) obj11, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 4);
                                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                                int i11 = access100 + 89;
                                                                IAuthTabCallback_Parcel = i11 % 128;
                                                                if (i11 % 2 == 0) {
                                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                                    throw null;
                                                                }
                                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                            }
                                                        }
                                                    } else {
                                                        int i12 = access100 + 73;
                                                        IAuthTabCallback_Parcel = i12 % 128;
                                                        if (i12 % 2 == 0) {
                                                            CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                                                            throw null;
                                                        }
                                                        obj4 = objOnMinimized11;
                                                        if (objOnMinimized11 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                        }
                                                        Function2 function252 = (Function2) obj4;
                                                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                                        Object objOnMinimized122 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                        if (zOnExtraCallback4) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                obj3 = objOnMinimized9;
                                                if (objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                }
                                                Function2 function232 = (Function2) obj3;
                                                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                                Object objOnMinimized102 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                                if (zOnExtraCallback3) {
                                                }
                                            }
                                        }
                                    } else {
                                        obj2 = objOnMinimized7;
                                        if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        }
                                        Function1 function122 = (Function1) obj2;
                                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                                        Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (zOnExtraCallback2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    obj = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    Function0 function05 = (Function0) obj;
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchaseHistoryDetailActivity);
                    Object objOnMinimized32 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z;
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = access100 + 53;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 3) != 2) {
            int i5 = i3 + 125;
            access100 = i5 % 128;
            z = i5 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i6 = IAuthTabCallback_Parcel + 23;
            access100 = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1125732321, iIntValue, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity.onCreate.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailActivity.kt:65)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-657624799, true, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda0(inAppPurchaseHistoryDetailActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6, 12582912, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access100 + 45;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 7 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access100 + 73;
        IAuthTabCallback_Parcel = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 3) != 5, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1909826247, i, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity.onCreate.<anonymous> (InAppPurchaseHistoryDetailActivity.kt:64)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-1125732321, true, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda6(inAppPurchaseHistoryDetailActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = access100 + 55;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        if (bundle != null) {
            int i4 = IAuthTabCallback_Parcel + 99;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("saved_instance_state_exists", Boolean.valueOf(z));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("order_id", getIntent().getStringExtra("orderId"));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("mini_app_name", getIntent().getStringExtra("miniAppName"));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("deployment_id", getIntent().getStringExtra("deploymentId"));
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = getIntent();
        Object[] objArr2 = new Object[1];
        a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019870).substring(0, 1).codePointAt(0) - 8226), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022805).substring(0, 12).length() - 12, new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        onNavigationEvent("on_create", (Map<String, ? extends Object>) access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, getWrite.IAuthTabCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()))}));
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1909826247, true, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda1(this))), 1, (Object) null);
        ICustomTabsServiceDefault();
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
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
        int i3 = $10 + 93;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 43 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1451 - Color.green(0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char c3 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122);
                    int touchSlop = 44 - (ViewConfiguration.getTouchSlop() >> 8);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494;
                    byte b3 = (byte) ($$b & 3);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, touchSlop, maximumFlingVelocity, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 50 - (Process.myTid() >> 22), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    c2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.alpha(0)), MotionEvent.axisFromString("") + 30, View.MeasureSpec.getSize(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (asBinder ^ 7798559133331975163L))) ^ ((char) (access000 ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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

    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
        int i2 = access100 + 43;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1639238L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda5((String) objArr[1], (String) objArr[2], inAppPurchaseHistoryDetailActivity), 14, null);
        int i2 = access100 + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access100(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.rgb(0, 0, 0) + 16777216, new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = inAppPurchaseHistoryDetailActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), View.combineMeasuredStates(0, 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 53;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onWarmupCompleted(String str, String str2) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 1639242L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda7(str, str2, this), 14, null);
        int i2 = IAuthTabCallback_Parcel + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onTransact(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSize(0, 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = inAppPurchaseHistoryDetailActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - MotionEvent.axisFromString("")), Color.rgb(0, 0, 0) + 16777216, new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onTransact(String str, String str2) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2058744L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda2(str, str2, this), 14, null);
        int i2 = IAuthTabCallback_Parcel + 27;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access000(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a((char) (Process.getGidForName("") + 1), Process.myTid() >> 22, new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = inAppPurchaseHistoryDetailActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a((char) Color.alpha(0), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2058742L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda4(str, str2, this), 14, null);
        int i2 = IAuthTabCallback_Parcel + 97;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = inAppPurchaseHistoryDetailActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 75;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 2058748L, false, null, null, new InAppPurchaseHistoryDetailActivity$.ExternalSyntheticLambda9(str, str2, this), 14, null);
        int i2 = access100 + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit asInterface(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", str);
        setDetectableSize.onExtraCallback("order_id", str2);
        Object[] objArr = new Object[1];
        a((char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = inAppPurchaseHistoryDetailActivity.getIntent();
        Object[] objArr2 = new Object[1];
        a((char) (Process.myTid() >> 22), TextUtils.getOffsetBefore("", 0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        setDetectableSize.onExtraCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        onNavigationEvent("handle_resubscribe_start", (Map<String, ? extends Object>) access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("app_name", onextracallbackwithresult.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback("deployment_id", onextracallbackwithresult.access000()), getWrite.IAuthTabCallback("sku", onextracallbackwithresult.getInterfaceDescriptor())}));
        setEngagementSignalsCallback().onNavigationEvent(onextracallbackwithresult);
        setEngagementSignalsCallback().IAuthTabCallbackDefault();
        Intent intentIAuthTabCallback = InAppPurchasePreparationActivity.onNavigationEvent.IAuthTabCallback(InAppPurchasePreparationActivity.Companion, this, new WindowInfoTrackerCompanionExternalSyntheticLambda0(onextracallbackwithresult.access000(), onextracallbackwithresult.IAuthTabCallback_Parcel(), null, 4, null), onextracallbackwithresult.getInterfaceDescriptor(), InAppPurchaseProductAuthorizer.PARTNER, "SUBSCRIPTION", (String) null, 32, (Object) null);
        onNavigationEvent("handle_resubscribe_launch_preparation", (Map<String, ? extends Object>) access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("deployment_id", onextracallbackwithresult.access000()), getWrite.IAuthTabCallback("app_name", onextracallbackwithresult.IAuthTabCallback_Parcel()), getWrite.IAuthTabCallback("sku", onextracallbackwithresult.getInterfaceDescriptor())}));
        this.asInterface.onNavigationEvent(intentIAuthTabCallback);
        int i2 = access100 + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsServiceStub() throws Throwable {
        Object obj;
        Map mapOnWarmupCompleted;
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1098079652, 1098079655, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, "handle_cancel_subscription_start", null, 2, null}, iOnExtraCallbackWithResult);
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = new Intent("android.intent.action.VIEW");
            Object[] objArr = new Object[1];
            a((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1063894818, new char[]{64690, 7183, 57097, 41484, 39009, 32524, 63413, 22143, 27149, 8337, 57128, 46663, 40128, 14724, 10187, 25322, 22128, 20543, 55496, 16166, 30881, 5000, 43339, 24054, 29617, 13802, 6975, 40955, 34645, 42242, 28730, 40301, 36737, 24023, 41477, 5008, 58836, 12099, 2042, 38607, 36028, 11325, 17525, 6235, 1577, 27965, 14011, 14259, 6966, 14024, 7740}, new char[]{281, 43507, 26300, 5788}, new char[]{8813, 27071, 36671, 8152}, objArr);
            intent.setData(Uri.parse(((String) objArr[0]).intern()));
            startActivity(intent);
            int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1098079652, 1098079655, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{this, "handle_cancel_subscription_success", null, 2, null}, iOnExtraCallbackWithResult3);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i2 = access100 + 43;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("error", th2.toString()), getWrite.IAuthTabCallback("error_message", th2.getMessage())});
            } else {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("error", th2.toString());
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("error_message", th2.getMessage());
                Pair[] pairArr = new Pair[3];
                pairArr[1] = pairIAuthTabCallback;
                pairArr[0] = pairIAuthTabCallback2;
                mapOnWarmupCompleted = access8100.onWarmupCompleted(pairArr);
            }
            onNavigationEvent("handle_cancel_subscription_failure", (Map<String, ? extends Object>) mapOnWarmupCompleted);
        }
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [android.app.Activity, android.content.Context, im.toss.appsintoss.iap.InAppPurchaseHistoryDetailActivity] */
    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        Object obj;
        ?? r12 = (InAppPurchaseHistoryDetailActivity) objArr[0];
        int i = 2 % 2;
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42 safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult = ((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda12) r12.setEngagementSignalsCallback().onTransact().IAuthTabCallback()).onExtraCallbackWithResult();
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult != null) {
            String string = r12.getString(R.string.appsintoss_purchase_history_detail_result_email_title, safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(string, "");
            String strTrimIndent = StringsKt.trimIndent("\n            device: " + Build.MODEL + " (" + Build.VERSION.RELEASE + ")\n            orderId: " + safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onExtraCallbackWithResult() + "\n            productName: " + safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.IAuthTabCallbackDefault() + "\n            appName: " + safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onExtraCallback() + "\n            =====================\n\n        ");
            try {
                Result.Companion companion = Result.Companion;
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onWarmupCompleted()});
                intent.putExtra("android.intent.extra.SUBJECT", string);
                intent.putExtra("android.intent.extra.TEXT", strTrimIndent);
                r12.startActivity(intent);
                obj = Result.constructor-impl(intent);
                int i2 = IAuthTabCallback_Parcel + 61;
                access100 = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                r12.onNavigationEvent("handle_email_failure", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("contact_email", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onWarmupCompleted()), getWrite.IAuthTabCallback("order_id", safeActivityEmbeddingComponentProviderExternalSyntheticLambda42OnExtraCallbackWithResult.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("error", th2.toString()), getWrite.IAuthTabCallback("error_message", th2.getMessage())}));
                String string2 = r12.getString(R.string.appsintoss_in_app_purchase_error_unavailable_email_client);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                new TdsToastV1.onNavigationEvent((Activity) r12, string2).onNavigationEvent();
                int i4 = IAuthTabCallback_Parcel + 125;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 5;
                }
            }
        }
        int i6 = access100 + 57;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("service_name", getIntent().getStringExtra("miniAppName"));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("order_id", getIntent().getStringExtra("orderId"));
        Object[] objArr = new Object[1];
        a((char) View.resolveSizeAndState(0, 0, 0), Color.alpha(0), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Intent intent = getIntent();
        Object[] objArr2 = new Object[1];
        a((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{23428, 21451, 63357, 60563, 36061, 39609, 42522, 5486}, new char[]{281, 43507, 26300, 5788}, new char[]{22568, 1651, 6237, 9209}, objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(strIntern, intent.getStringExtra(((String) objArr2[0]).intern()))});
        int i4 = IAuthTabCallback_Parcel + 113;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity = (InAppPurchaseHistoryDetailActivity) objArr[0];
        String str = (String) objArr[1];
        Map<String, ? extends Object> mapOnNavigationEvent = (Map) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = access100 + 19;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 4) != 0) {
            int i4 = i3 + 21;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            mapOnNavigationEvent = access8100.onNavigationEvent();
            if (i5 != 0) {
                int i6 = 32 / 0;
            }
        }
        inAppPurchaseHistoryDetailActivity.onNavigationEvent(str, mapOnNavigationEvent);
        int i7 = IAuthTabCallback_Parcel + 117;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private final void onNavigationEvent(String str, Map<String, ? extends Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history_detail", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 68, (Object) null);
        } else {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps_in_toss_purchase_history_detail", (String) null, access8100.onWarmupCompleted(access8100.onNavigationEvent(getWrite.IAuthTabCallback("event", str)), map), (String) null, false, (String) null, 58, (Object) null);
        }
        int i3 = access100 + 35;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1158528788, 1158528799, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity}, iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1721694652, -1721694645, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult);
    }

    static /* synthetic */ void onExtraCallback(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, Map map, int i, Object obj) throws Throwable {
        Object[] objArr = {inAppPurchaseHistoryDetailActivity, str, map, Integer.valueOf(i), obj};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1098079652, 1098079655, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
    }

    private final void validateRelationship() throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2020349296, -2020349286, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallbackWithResult(String str, String str2) throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1081118039, -1081118033, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this, str, str2}, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallbackStub(String str, String str2, InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -929940688, 929940688, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{str, str2, inAppPurchaseHistoryDetailActivity, setDetectableSize}, iOnExtraCallbackWithResult);
    }

    private final void IAuthTabCallback(String str, String str2) throws Throwable {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1169155747, 1169155755, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this, str, str2}, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {inAppPurchaseHistoryDetailActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2136781134, -2136781125, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -902493630, 902493635, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str}, iOnExtraCallbackWithResult);
    }

    private static final Unit IAuthTabCallbackStub(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, String str, String str2) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1339870819, -1339870815, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, str, str2}, iOnExtraCallbackWithResult);
    }

    private static final Unit asInterface(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1647488084, -1647488082, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity}, iOnExtraCallbackWithResult);
    }

    private static final Unit onNavigationEvent(InAppPurchaseHistoryDetailActivity inAppPurchaseHistoryDetailActivity, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda42.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1110436919, -1110436918, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{inAppPurchaseHistoryDetailActivity, onextracallbackwithresult}, iOnExtraCallbackWithResult);
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 59;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = access100 + 11;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDetailActivity, im.toss.base.BaseActivity, im.toss.base.Hilt_BaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 109;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        IAuthTabCallbackDefault = 8837868460769962722L;
        asBinder = -1776194565;
        access000 = (char) 27643;
    }
}
