package viva.republica.toss.qrcode;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.google.mlkit.vision.common.InputImage;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.view.RxView;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConstraintTrackingWorkerExternalSyntheticLambda1;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceDefault;
import o.IPostMessageService_Parcel;
import o.ITrustedWebActivityCallback;
import o.LifecyclesKtawaitStarted21;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.deserializeUriNullableCollection;
import o.enableFontScaleChangesUpdatingLayout;
import o.findResAndMsg;
import o.getDynamic;
import o.getVolume;
import o.getWrite;
import o.isVideoAutoplay;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.onSessionEnded;
import o.processBytes;
import o.reportPvFromBackGround;
import o.setRandomHost;
import o.shouldBeKeptAsChild;
import o.zzcr;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.GetOcrResultResp;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse;
import viva.republica.toss.qrcode.PhotoTransferActivity$;
import viva.republica.toss.qrcode.TossScanner;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhotoTransferActivity extends Hilt_PhotoTransferActivity implements TossScanner.IAuthTabCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallbackDefault = 0;
    public static final int asInterface;
    private static boolean onActivityLayout = false;
    private static int onActivityResized = 1;
    private static boolean onMessageChannelReady = false;
    private static int onMinimized = 0;
    private static int onPostMessage = 0;
    private static int onRelationshipValidationResult = 1;
    private static char[] readTypedObject;
    private boolean IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private ScannerViewFinder IAuthTabCallbackStubProxy;
    private MultiFormatReader IAuthTabCallback_Parcel;
    private String access000;
    private Scanner access100;
    private InitSessionKeyResponse extraCallbackWithResult;
    private String getInterfaceDescriptor;
    private IAuthTabCallback onTransact;

    @Inject
    public SessionTrackerb tossRouter;
    private boolean writeTypedObject;
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (enableFontScaleChangesUpdatingLayout) PhotoTransferActivity.onExtraCallback(new Object[0], TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1068545326, -1068545320, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> ICustomTabsCallback = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (Unit) PhotoTransferActivity.onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -241918018, 241918027, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
    });
    private final IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> asBinder = registerForActivityResult(new IPostMessageService_Parcel.onTransact(), new onSessionEnded() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda2
        public final void onActivityResult(Object obj) {
            PhotoTransferActivity.onExtraCallbackWithResult(this.f$0, (Uri) obj);
        }
    });

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoTransferActivity.onExtraCallbackWithResult(PhotoTransferActivity.this, (RequestBody) null, (access13800) this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoTransferActivity.onWarmupCompleted(PhotoTransferActivity.this, (Function0) null, (access13800) this);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoTransferActivity.onNavigationEvent(PhotoTransferActivity.this, null, this);
        }
    }

    static {
        validateRelationship();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = ICustomTabsCallbackDefault + 89;
        onRelationshipValidationResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, String str, PhotoTransferActivity photoTransferActivity, String str2, int i, processBytes processbytes, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 19;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, str, photoTransferActivity, str2, i, processbytes, setDetectableSize);
        if (i4 != 0) {
            int i5 = 49 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(PhotoTransferActivity photoTransferActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 93;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(photoTransferActivity, dialogInterface, i);
        int i5 = onActivityResized + 101;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(boolean z, PhotoTransferActivity photoTransferActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 103;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        onNavigationEvent(z, photoTransferActivity, dialogInterface, i);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = onActivityResized + 51;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 99;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = onActivityResized + 51;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 53;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = onPostMessage + 67;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PhotoTransferActivity photoTransferActivity = (PhotoTransferActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(photoTransferActivity, iEngagementSignalsCallbackDefault);
        int i4 = onActivityResized + 83;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage + 25;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{function1, obj}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 2041384234, -2041384224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
            int i3 = 40 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{function1, obj}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 2041384234, -2041384224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        }
        int i4 = onActivityResized + 45;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~((~i2) | i8 | i3);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i3);
        int i13 = (~(i2 | i7)) | (~(i7 | i4)) | i10;
        int i14 = i3 + i4 + i6 + (1787548100 * i5) + (1101416392 * i);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i3) - 623378432) + (561581232 * i4) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i6) + ((-778043392) * i5) + ((-46137344) * i) + (324403200 * i15);
        int i17 = (i3 * (-930662234)) + 656878810 + (i4 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i6 * (-930661477)) + (i5 * 2052861356) + (i * 749768216) + (i15 * (-2028863488));
        switch (i16 + (i17 * i17 * (-1850081280))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i18 = 2 % 2;
                int i19 = onActivityResized + 53;
                onPostMessage = i19 % 128;
                int i20 = i19 % 2;
                function1.invoke(obj);
                int i21 = onPostMessage + 37;
                onActivityResized = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(PhotoTransferActivity photoTransferActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(photoTransferActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(photoTransferActivity, setDetectableSize);
        int i3 = onPostMessage + 83;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(photoTransferActivity, unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(photoTransferActivity, unit);
        int i3 = onPostMessage + 75;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, Uri uri) {
        int i = 2 % 2;
        int i2 = onPostMessage + 91;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(photoTransferActivity, uri);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, byte[] bArr, Camera camera) {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(photoTransferActivity, bArr, camera);
        int i4 = onActivityResized + 19;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(new Object[]{photoTransferActivity, unit}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2055604309, 2055604309, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit2 = (Unit) onExtraCallback(new Object[]{photoTransferActivity, unit}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, -2055604309, 2055604309, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        int i3 = 39 / 0;
        return unit2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityResized + 65;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        enableFontScaleChangesUpdatingLayout enablefontscalechangesupdatinglayoutAccess200 = access200();
        int i4 = onPostMessage + 15;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return enablefontscalechangesupdatinglayoutAccess200;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            return (Unit) onExtraCallback(new Object[]{photoTransferActivity, unit}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 362631947, -362631936, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PhotoTransferActivity photoTransferActivity, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 19;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(photoTransferActivity, shouldbekeptaschild);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = onPostMessage + 65;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = onPostMessage + 55;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 51;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 25;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return 1230157L;
    }

    public static final /* synthetic */ void IAuthTabCallback(PhotoTransferActivity photoTransferActivity, String str, boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 27;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        photoTransferActivity.onWarmupCompleted(str, z);
        int i4 = onPostMessage + 31;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PhotoTransferActivity photoTransferActivity = (PhotoTransferActivity) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return photoTransferActivity.IAuthTabCallback(bitmap);
        }
        photoTransferActivity.IAuthTabCallback(bitmap);
        throw null;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, RequestBody requestBody, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityResized + 97;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {photoTransferActivity, requestBody, access13800Var};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        if (i3 != 0) {
            onExtraCallback(objArr, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, -488372771, 488372778, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
            throw null;
        }
        Object objOnExtraCallback = onExtraCallback(objArr, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult, -488372771, 488372778, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2);
        int i4 = onPostMessage + 97;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(PhotoTransferActivity photoTransferActivity, Uri uri, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onPostMessage + 39;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = photoTransferActivity.onWarmupCompleted(uri, (access13800<? super RequestBody>) access13800Var);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = onPostMessage + 57;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ enableFontScaleChangesUpdatingLayout onNavigationEvent(PhotoTransferActivity photoTransferActivity) {
        int i = 2 % 2;
        int i2 = onPostMessage + 103;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        enableFontScaleChangesUpdatingLayout enablefontscalechangesupdatinglayoutICustomTabsServiceDefault = photoTransferActivity.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return enablefontscalechangesupdatinglayoutICustomTabsServiceDefault;
    }

    public static final /* synthetic */ Object onWarmupCompleted(PhotoTransferActivity photoTransferActivity, Function0 function0, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = photoTransferActivity.onExtraCallback((Function0<? extends InputImage>) function0, (access13800<? super List<String>>) access13800Var);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return objOnExtraCallback;
    }

    public static final /* synthetic */ Object onWarmupCompleted(PhotoTransferActivity photoTransferActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onActivityResized + 81;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Object objOnExtraCallback = onExtraCallback(new Object[]{photoTransferActivity, access13800Var}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 703397167, -703397159, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onPostMessage + 39;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(PhotoTransferActivity photoTransferActivity, List list) {
        int i = 2 % 2;
        int i2 = onPostMessage + 13;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{photoTransferActivity, list}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1435021409, -1435021405, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i4 = onActivityResized + 9;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 73;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 27;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return sessionTrackerb;
        }
        throw null;
    }

    private final enableFontScaleChangesUpdatingLayout ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        enableFontScaleChangesUpdatingLayout enablefontscalechangesupdatinglayout = (enableFontScaleChangesUpdatingLayout) this.extraCallback.getValue();
        int i4 = onPostMessage + 57;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return enablefontscalechangesupdatinglayout;
    }

    private static final enableFontScaleChangesUpdatingLayout access200() {
        int i = 2 % 2;
        enableFontScaleChangesUpdatingLayout enablefontscalechangesupdatinglayout = new enableFontScaleChangesUpdatingLayout();
        int i2 = onPostMessage + 17;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        return enablefontscalechangesupdatinglayout;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -124, -123, -123, -124, -120, -124, -123}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.access000), getWrite.IAuthTabCallback("inflow_channel", this.getInterfaceDescriptor)});
        int i4 = onPostMessage + 5;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 o.IPostMessageServiceStubProxy) = (r1v4 o.IPostMessageServiceStubProxy), (r1v9 o.IPostMessageServiceStubProxy) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ICustomTabsServiceStub() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage
            int r1 = r1 + 87
            int r2 = r1 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            o.IPostMessageServiceStubProxy r1 = r4.getSupportActionBar()
            r3 = 91
            int r3 = r3 / r2
            if (r1 == 0) goto L34
            goto L1f
        L19:
            o.IPostMessageServiceStubProxy r1 = r4.getSupportActionBar()
            if (r1 == 0) goto L34
        L1f:
            r3 = 1
            r1.onNavigationEvent(r3)
            r1.IAuthTabCallbackStub(r2)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            int r3 = im.toss.uikit.R.color.transparent
            int r3 = androidx.core.content.ContextCompat.getColor(r4, r3)
            r2.<init>(r3)
            r1.onWarmupCompleted(r2)
        L34:
            int r1 = viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L40
            return
        L40:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.ICustomTabsServiceStub():void");
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        PhotoTransferActivity photoTransferActivity = (PhotoTransferActivity) objArr[0];
        int i = 2 % 2;
        try {
            Scanner scanner = photoTransferActivity.access100;
            Scanner scanner2 = null;
            if (scanner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scanner = null;
            }
            scanner.onTransact();
            ScannerViewFinder scannerViewFinder = photoTransferActivity.IAuthTabCallbackStubProxy;
            if (scannerViewFinder == null) {
                int i2 = onActivityResized + 25;
                onPostMessage = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                scannerViewFinder = null;
            }
            View viewOnNavigationEvent = scannerViewFinder.onNavigationEvent();
            Scanner scanner3 = photoTransferActivity.access100;
            if (scanner3 == null) {
                int i4 = onActivityResized + 97;
                onPostMessage = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    scanner2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                scanner2 = scanner3;
            }
            viewOnNavigationEvent.setSelected(scanner2.IAuthTabCallback());
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhotoTransferActivity", e);
        }
        return Unit.INSTANCE;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage + 69;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 69;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        photoTransferActivity.ICustomTabsService_Parcel();
        Unit unit2 = Unit.INSTANCE;
        int i4 = onActivityResized + 93;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this);
        this.onTransact = iAuthTabCallback;
        ScannerViewFinder scannerViewFinder = this.IAuthTabCallbackStubProxy;
        ScannerViewFinder scannerViewFinder2 = null;
        if (scannerViewFinder == null) {
            int i2 = onActivityResized + 99;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            scannerViewFinder = null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxView.onNavigationEvent(scannerViewFinder.onNavigationEvent()).IAuthTabCallback(new PhotoTransferActivity$.ExternalSyntheticLambda11(new PhotoTransferActivity$.ExternalSyntheticLambda10(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        iAuthTabCallback.onWarmupCompleted(deserializeurinullablecollectionIAuthTabCallback);
        isVideoAutoplay isvideoautoplay = this.onTransact;
        if (isvideoautoplay == null) {
            int i4 = onActivityResized + 11;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            isvideoautoplay = null;
        }
        ScannerViewFinder scannerViewFinder3 = this.IAuthTabCallbackStubProxy;
        if (scannerViewFinder3 == null) {
            int i6 = onActivityResized + 121;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            scannerViewFinder3 = null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxView.onNavigationEvent(scannerViewFinder3.IAuthTabCallback()).IAuthTabCallback(new PhotoTransferActivity$.ExternalSyntheticLambda13(new PhotoTransferActivity$.ExternalSyntheticLambda12(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        isvideoautoplay.onWarmupCompleted(deserializeurinullablecollectionIAuthTabCallback2);
        isVideoAutoplay isvideoautoplay2 = this.onTransact;
        if (isvideoautoplay2 == null) {
            int i8 = onActivityResized + 121;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            isvideoautoplay2 = null;
        }
        ScannerViewFinder scannerViewFinder4 = this.IAuthTabCallbackStubProxy;
        if (scannerViewFinder4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            scannerViewFinder2 = scannerViewFinder4;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback3 = RxView.onNavigationEvent((View) ScannerViewFinder.onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 539080953, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{scannerViewFinder2}, -539080951, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback(new PhotoTransferActivity$.ExternalSyntheticLambda15(new PhotoTransferActivity$.ExternalSyntheticLambda14(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback3, "");
        isvideoautoplay2.onWarmupCompleted(deserializeurinullablecollectionIAuthTabCallback3);
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage + 25;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = readTypedObject;
        if (cArr3 != null) {
            int i3 = $10 + 11;
            int i4 = i3 % 128;
            $11 = i4;
            int i5 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = i4 + 25;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 77 - View.MeasureSpec.makeMeasureSpec(0, 0), 20951 - MotionEvent.axisFromString(""), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onMinimized)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0) + 75, Color.blue(0) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i9 = 1052772399;
        if (onMessageChannelReady) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i9);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 63, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i9 = 1052772399;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onActivityLayout) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i10 = $10 + 27;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 13;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 63, 12215 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onWarmupCompleted(PhotoTransferActivity photoTransferActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-123, -124, -123, -123, -124, -120, -124, -123}, KeyEvent.getDeadChar(0, 0) * 84, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-123, -124, -123, -123, -124, -120, -124, -123}, 127 - KeyEvent.getDeadChar(0, 0), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), photoTransferActivity.access000);
        setDetectableSize.onExtraCallback("inflow_channel", photoTransferActivity.getInterfaceDescriptor);
        Unit unit = Unit.INSTANCE;
        int i3 = onPostMessage + 117;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return unit;
    }

    private static final void onWarmupCompleted(PhotoTransferActivity photoTransferActivity, byte[] bArr, Camera camera) {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(bArr);
        photoTransferActivity.onNavigationEvent(bArr);
        int i4 = onActivityResized + 125;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final PhotoTransferActivity photoTransferActivity = (PhotoTransferActivity) objArr[0];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1230159L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return PhotoTransferActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        try {
            Scanner scanner = photoTransferActivity.access100;
            if (scanner == null) {
                int i2 = onActivityResized + 35;
                onPostMessage = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                scanner = null;
            }
            reportPvFromBackGround reportpvfrombackgroundIAuthTabCallbackDefault = scanner.IAuthTabCallbackDefault();
            if (reportpvfrombackgroundIAuthTabCallbackDefault != null) {
                int i4 = onPostMessage + 103;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                Camera camera = reportpvfrombackgroundIAuthTabCallbackDefault.IAuthTabCallback;
                if (camera != null) {
                    camera.takePicture(null, null, new Camera.PictureCallback() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda7
                        @Override // android.hardware.Camera.PictureCallback
                        public final void onPictureTaken(byte[] bArr, Camera camera2) {
                            PhotoTransferActivity.onExtraCallbackWithResult(this.f$0, bArr, camera2);
                        }
                    });
                }
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhotoTransferActivity", e);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        access13800 access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityResized + 57;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {LifecyclesKtawaitStarted21.IAuthTabCallback, "transfer.photo.ocrApiEnabled", access14000.onNavigationEvent(false), access13800Var};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        Object objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(objArr2, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
        int i4 = onActivityResized + 71;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(byte[] bArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, bArr, (access13800) null), 3, (Object) null);
        int i2 = onPostMessage + 87;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super GetOcrResultResp>, Object> {
        final /* synthetic */ RequestBody $body$inlined;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(access13800 access13800Var, RequestBody requestBody) {
            super(2, access13800Var);
            this.$body$inlined = requestBody;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asBinder(access13800Var, this.$body$inlined);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super GetOcrResultResp> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws TossApiCallException.ApiError {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                MultipartBody.Part partCreateFormData = MultipartBody.Part.Companion.createFormData("image", "image.jpeg", this.$body$inlined);
                getVolume getvolumeNewAuthTabSession = AdSettingsIntegrationErrorMode.onNavigationEvent.newAuthTabSession();
                String strOnExtraCallback = ConstraintTrackingWorkerExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback();
                this.L$0 = access15400.onNavigationEvent(this);
                this.L$1 = access15400.onNavigationEvent(partCreateFormData);
                this.I$0 = 0;
                this.label = 1;
                obj = getvolumeNewAuthTabSession.onExtraCallbackWithResult(strOnExtraCallback, partCreateFormData, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (GetOcrResultResp) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.GetOcrResultResp");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(GetOcrResultResp.class, Object.class) || Intrinsics.areEqual(GetOcrResultResp.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static short[] onExtraCallback;
        private static final byte[] $$a = {60, -123, -116, -1};
        private static final int $$b = 156;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int onTransact = 1;
        private static int onNavigationEvent = 1170312825;
        private static int onExtraCallbackWithResult = -1538795465;
        private static int IAuthTabCallback = 443450019;
        private static byte[] onWarmupCompleted = {5, -5, 8, 5, -9, 9, -5, 8};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r6, byte r7, short r8) {
            /*
                int r8 = r8 * 4
                int r0 = 1 - r8
                int r7 = r7 + 4
                byte[] r1 = viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult.$$a
                int r6 = r6 * 2
                int r6 = 115 - r6
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2d:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult.$$c(short, byte, short):java.lang.String");
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            char c;
            int i5 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 43424), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                char c2 = 3;
                if (z) {
                    byte[] bArr = onWarmupCompleted;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = $11 + 111;
                            $10 = i7 % 128;
                            if (i7 % 2 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 12843);
                                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54;
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2167;
                                    byte b2 = $$a[c2];
                                    byte b3 = (byte) (b2 + 1);
                                    byte b4 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, i8, windowTouchSlop, -299036574, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i6])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback3 == null) {
                                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843);
                                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 55;
                                    int iIndexOf = 2167 - TextUtils.indexOf("", "", 0, 0);
                                    byte b5 = $$a[3];
                                    byte b6 = (byte) (b5 + 1);
                                    byte b7 = b5;
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, absoluteGravity, iIndexOf, -299036574, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i6] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                                i6++;
                            }
                            c2 = 3;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onNavigationEvent)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0, 0) + 43424), 41 - ImageFormat.getBitsPerPixel(0), 22439 - KeyEvent.normalizeMetaState(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onExtraCallback[i + ((int) (onNavigationEvent ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    int i9 = ((i + iIntValue) - 2) + ((int) (onNavigationEvent ^ j));
                    if (z) {
                        int i10 = $11 + 53;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 2 / 4;
                        }
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i9 + i4;
                    Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), AndroidCharacter.getMirror('0') + '&', 9567 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            int i13 = $11 + 97;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                        }
                        int i15 = $11 + 51;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (z2) {
                            int i17 = $10 + 97;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                byte[] bArr6 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent << 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r8] * (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                byte[] bArr7 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                        } else {
                            short[] sArr = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, Context context, boolean z, String str, String str2, Long l, InitSessionKeyResponse initSessionKeyResponse, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = onTransact + 119;
            int i4 = i3 % 128;
            asInterface = i4;
            int i5 = i3 % 2;
            if ((i & 16) != 0) {
                int i6 = i4 + 73;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                l = null;
            }
            return onextracallbackwithresult.onExtraCallback(context, z, str, str2, l, initSessionKeyResponse);
        }

        public final Intent onExtraCallback(@NotNull Context context, boolean z, @Nullable String str, @Nullable String str2, @Nullable Long l, @NotNull InitSessionKeyResponse initSessionKeyResponse) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(initSessionKeyResponse, "");
            Intent intent = new Intent(context, (Class<?>) PhotoTransferActivity.class);
            intent.putExtra("returnResult", z);
            Object[] objArr = new Object[1];
            a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (byte) ExpandableListView.getPackedPositionGroup(0L), Gravity.getAbsoluteGravity(0, 0) + 511289743, 1087808967 - Color.rgb(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 55, objArr);
            intent.putExtra(((String) objArr[0]).intern(), str);
            intent.putExtra("origin", str2);
            intent.putExtra("amount", l);
            intent.putExtra("sessionKeyResponse", initSessionKeyResponse);
            int i2 = onTransact + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return intent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asBinder(java.lang.Object[] r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.asBinder(java.lang.Object[]):java.lang.Object");
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(Uri uri, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$uri = uri;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PhotoTransferActivity.this.new onExtraCallback(this.$uri, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r7 != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        
            if (r7 == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r6.label
                r2 = 3
                r3 = 4
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r2) goto L20
                if (r1 != r3) goto L18
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L83
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r0 = r6.L$0
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L68
            L28:
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L51
            L2c:
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L3d
            L30:
                kotlin.ResultKt.onNavigationEvent(r7)
                viva.republica.toss.qrcode.PhotoTransferActivity r7 = viva.republica.toss.qrcode.PhotoTransferActivity.this
                r6.label = r5
                java.lang.Object r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onWarmupCompleted(r7, r6)
                if (r7 == r0) goto L8d
            L3d:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L71
                viva.republica.toss.qrcode.PhotoTransferActivity r7 = viva.republica.toss.qrcode.PhotoTransferActivity.this
                android.net.Uri r1 = r6.$uri
                r6.label = r4
                java.lang.Object r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onNavigationEvent(r7, r1, r6)
                if (r7 == r0) goto L8d
            L51:
                okhttp3.RequestBody r7 = (okhttp3.RequestBody) r7
                if (r7 == 0) goto L6c
                viva.republica.toss.qrcode.PhotoTransferActivity r1 = viva.republica.toss.qrcode.PhotoTransferActivity.this
                java.lang.Object r3 = o.access15400.onNavigationEvent(r7)
                r6.L$0 = r3
                r3 = 0
                r6.I$0 = r3
                r6.label = r2
                java.lang.Object r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult(r1, r7, r6)
                if (r7 == r0) goto L8d
            L68:
                java.util.List r7 = (java.util.List) r7
                if (r7 != 0) goto L85
            L6c:
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
                goto L85
            L71:
                viva.republica.toss.qrcode.PhotoTransferActivity r7 = viva.republica.toss.qrcode.PhotoTransferActivity.this
                viva.republica.toss.qrcode.PhotoTransferActivity$checkGalleryUri$1$$ExternalSyntheticLambda0 r1 = new viva.republica.toss.qrcode.PhotoTransferActivity$checkGalleryUri$1$$ExternalSyntheticLambda0
                android.net.Uri r2 = r6.$uri
                r1.<init>()
                r6.label = r3
                java.lang.Object r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onWarmupCompleted(r7, r1, r6)
                if (r7 != r0) goto L83
                goto L8d
            L83:
                java.util.List r7 = (java.util.List) r7
            L85:
                viva.republica.toss.qrcode.PhotoTransferActivity r0 = viva.republica.toss.qrcode.PhotoTransferActivity.this
                viva.republica.toss.qrcode.PhotoTransferActivity.onWarmupCompleted(r0, r7)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L8d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallback.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final InputImage onWarmupCompleted(PhotoTransferActivity photoTransferActivity, Uri uri) {
            InputImage inputImageFromFilePath = InputImage.fromFilePath(photoTransferActivity, uri);
            Intrinsics.checkNotNullExpressionValue(inputImageFromFilePath, "");
            return inputImageFromFilePath;
        }
    }

    private final void IAuthTabCallback(Uri uri) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(uri, null), 3, (Object) null);
        int i2 = onPostMessage + 43;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super RequestBody>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Uri uri, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$uri = uri;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PhotoTransferActivity.this.new onTransact(this.$uri, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super RequestBody> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws IOException {
            InputStream inputStreamOpenInputStream;
            FileOutputStream fileOutputStream;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            String type = PhotoTransferActivity.this.getContentResolver().getType(this.$uri);
            File fileCreateTempFile = File.createTempFile("photoTransferTempImage", ".jpg", PhotoTransferActivity.this.getCacheDir());
            if (!Intrinsics.areEqual(type, "image/jpeg")) {
                inputStreamOpenInputStream = PhotoTransferActivity.this.getContentResolver().openInputStream(this.$uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                            CloseableKt.closeFinally(inputStreamOpenInputStream, (Throwable) null);
                        } finally {
                        }
                    } finally {
                    }
                }
                type = "image/jpeg";
            } else {
                inputStreamOpenInputStream = PhotoTransferActivity.this.getContentResolver().openInputStream(this.$uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            long jCopyTo$default = ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, (Object) null);
                            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                            access14000.onExtraCallback(jCopyTo$default);
                            CloseableKt.closeFinally(inputStreamOpenInputStream, (Throwable) null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
            RequestBody.Companion companion = RequestBody.Companion;
            Intrinsics.checkNotNull(fileCreateTempFile);
            return companion.create(fileCreateTempFile, MediaType.Companion.parse(type));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(android.net.Uri r7, o.access13800<? super okhttp3.RequestBody> r8) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onWarmupCompleted(android.net.Uri, o.access13800):java.lang.Object");
    }

    private final Bitmap IAuthTabCallback(Bitmap bitmap) {
        int i = 2 % 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        Unit unit = Unit.INSTANCE;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        int i2 = onActivityResized + 59;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return bitmapCreateBitmap;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends String>>, Object> {
        final /* synthetic */ Function0<InputImage> $getInputImage;
        Object L$0;
        int label;
        final /* synthetic */ PhotoTransferActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Function0<? extends InputImage> function0, PhotoTransferActivity photoTransferActivity, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$getInputImage = function0;
            this.this$0 = photoTransferActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(this.$getInputImage, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super List<String>> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            InputImage inputImage = (InputImage) this.$getInputImage.invoke();
            enableFontScaleChangesUpdatingLayout enablefontscalechangesupdatinglayoutOnNavigationEvent = PhotoTransferActivity.onNavigationEvent(this.this$0);
            this.L$0 = access15400.onNavigationEvent(inputImage);
            this.label = 1;
            Object objOnExtraCallback = enablefontscalechangesupdatinglayoutOnNavigationEvent.onExtraCallback(inputImage, this);
            return objOnExtraCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objOnExtraCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(kotlin.jvm.functions.Function0<? extends com.google.mlkit.vision.common.InputImage> r7, o.access13800<? super java.util.List<java.lang.String>> r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof viva.republica.toss.qrcode.PhotoTransferActivity.asInterface
            if (r1 == 0) goto L16
            r1 = r8
            viva.republica.toss.qrcode.PhotoTransferActivity$asInterface r1 = (viva.republica.toss.qrcode.PhotoTransferActivity.asInterface) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.label = r2
            goto L1b
        L16:
            viva.republica.toss.qrcode.PhotoTransferActivity$asInterface r1 = new viva.republica.toss.qrcode.PhotoTransferActivity$asInterface
            r1.<init>(r8)
        L1b:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L46
            if (r3 != r4) goto L3e
            int r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r7 = r7 + 63
            int r2 = r7 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r2
            int r7 = r7 % r0
            java.lang.Object r7 = r1.L$1
            o.access13800 r7 = (o.access13800) r7
            java.lang.Object r7 = r1.L$0
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            goto L77
        L3e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L46:
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            o.GeckoHubImp r8 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            viva.republica.toss.qrcode.PhotoTransferActivity$IAuthTabCallbackStub r3 = new viva.republica.toss.qrcode.PhotoTransferActivity$IAuthTabCallbackStub     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r3.<init>(r7, r6, r5)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r1.L$0 = r7     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            java.lang.Object r7 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r1.L$1 = r7     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r7 = 0
            r1.I$0 = r7     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r1.I$1 = r7     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            r1.label = r4     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r8, r3, r1)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            if (r8 != r2) goto L77
            int r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r7 = r7 + 87
            int r8 = r7 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r8
            int r7 = r7 % r0
            return r2
        L77:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L88 o.WebResourceResponseModel -> L8a
            goto L95
        L7c:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto L95
        L88:
            r7 = move-exception
            throw r7
        L8a:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        L95:
            java.lang.Throwable r8 = kotlin.Result.exceptionOrNull-impl(r7)
            if (r8 == 0) goto Lb4
            int r1 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r1 = r1 + 97
            int r2 = r1 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r2
            int r1 = r1 % r0
            java.lang.String r2 = "PhotoTransferActivity"
            if (r1 != 0) goto Lae
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r1.IAuthTabCallback(r2, r8)
            goto Lb4
        Lae:
            o.ConvertFloatArrayToByteArray r7 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            r7.IAuthTabCallback(r2, r8)
            throw r5
        Lb4:
            boolean r8 = kotlin.Result.onExtraCallback(r7)
            if (r8 == 0) goto Lbb
            goto Lbc
        Lbb:
            r5 = r7
        Lbc:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto Lcd
            int r7 = viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage
            int r7 = r7 + 3
            int r8 = r7 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized = r8
            int r7 = r7 % r0
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallback(kotlin.jvm.functions.Function0, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PhotoTransferActivity photoTransferActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onActivityResized + 91;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            int i4 = onPostMessage + 63;
            onActivityResized = i4 % 128;
            if (i4 % 2 == 0) {
                photoTransferActivity.setResult(-1, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
                photoTransferActivity.finish();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            photoTransferActivity.setResult(-1, iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            photoTransferActivity.finish();
            int i5 = onPostMessage + 35;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(java.lang.String r8, java.lang.String r9, long r10) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized = r2
            int r1 = r1 % r0
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r8)
            r2 = 0
            if (r1 == 0) goto L2c
            int r3 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r3 = r3 + 41
            int r4 = r3 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L25
            int r3 = r1.intValue()
            if (r3 > 0) goto L2d
            goto L2c
        L25:
            r1.intValue()
            r2.hashCode()
            throw r2
        L2c:
            r1 = r2
        L2d:
            boolean r3 = r7.writeTypedObject
            r4 = 0
            java.lang.String r5 = ""
            if (r3 == 0) goto L63
            int r8 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r8 = r8 + 45
            int r10 = r8 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r10
            int r8 = r8 % r0
            if (r1 == 0) goto L43
            int r4 = r1.intValue()
        L43:
            o.deepClone$onNavigationEvent r8 = new o.deepClone$onNavigationEvent
            r8.<init>(r4, r9)
            o.deepClone r9 = new o.deepClone
            r9.<init>(r8, r2, r0, r2)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r10 = "result_photoTransferDetection"
            android.content.Intent r8 = r8.putExtra(r10, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            r9 = -1
            r7.setResult(r9, r8)
            r7.finish()
            return
        L63:
            r1 = 16
            byte[] r1 = new byte[r1]
            r1 = {x00e0: FILL_ARRAY_DATA , data: [-114, -115, -124, -127, -116, -116, -117, -127, -127, -121, -122, -123, -124, -125, -126, -127} // fill-array
            int r3 = android.text.TextUtils.getOffsetBefore(r5, r4)
            int r3 = r3 + 127
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            a(r2, r2, r1, r3, r6)
            r1 = r6[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r2 = "bankCode"
            android.net.Uri$Builder r8 = r1.appendQueryParameter(r2, r8)
            java.lang.String r1 = "accountNo"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r1, r9)
            long r1 = r7.IAuthTabCallbackStub
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto Lab
            int r9 = viva.republica.toss.qrcode.PhotoTransferActivity.onActivityResized
            int r10 = r9 + 87
            int r11 = r10 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r11
            int r10 = r10 % r0
            int r9 = r9 + 43
            int r10 = r9 % 128
            viva.republica.toss.qrcode.PhotoTransferActivity.onPostMessage = r10
            int r9 = r9 % r0
            r10 = r1
        Lab:
            java.lang.String r9 = "amount"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r10)
            java.lang.String r9 = "origin"
            java.lang.String r10 = "photo_transfer"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r9, r10)
            viva.republica.toss.send.v4.entity.TransferSource r9 = viva.republica.toss.send.v4.entity.TransferSource.PHOTO_TRANSFER
            java.lang.String r9 = r9.getValue()
            java.lang.String r10 = "source"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r10, r9)
            android.net.Uri r8 = r8.build()
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            viva.republica.toss.send.SendActivity$onNavigationEvent r9 = viva.republica.toss.send.SendActivity.Companion
            android.content.Intent r8 = r9.IAuthTabCallback(r7, r8)
            o.IEngagementSignalsCallback_Parcel<android.content.Intent> r9 = r7.ICustomTabsCallback
            r9.onNavigationEvent(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult(java.lang.String, java.lang.String, long):void");
    }

    private final void ICustomTabsService_Parcel() {
        IEngagementSignalsCallback_Parcel<IPostMessageServiceDefault> iEngagementSignalsCallback_Parcel;
        IPostMessageService_Parcel.onTransact.onExtraCallback onextracallback;
        int i;
        boolean z;
        IPostMessageService_Parcel.onTransact.onExtraCallbackWithResult onextracallbackwithresult;
        int i2;
        Object obj;
        int i3 = 2 % 2;
        int i4 = onActivityResized + 53;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            obj = null;
            ConvertByteArrayToFloatArray.onExtraCallback(1230163L, false, (String) null, (Map) null, (Function1) null, 37, (Object) null);
            iEngagementSignalsCallback_Parcel = this.asBinder;
            onextracallback = IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent;
            i = 1;
            z = true;
            onextracallbackwithresult = null;
            i2 = 87;
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1230163L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            iEngagementSignalsCallback_Parcel = this.asBinder;
            onextracallback = IPostMessageService_Parcel.onTransact.onExtraCallback.onNavigationEvent;
            i = 0;
            z = false;
            onextracallbackwithresult = null;
            i2 = 14;
            obj = null;
        }
        iEngagementSignalsCallback_Parcel.onNavigationEvent(ITrustedWebActivityCallback.onExtraCallbackWithResult(onextracallback, i, z, onextracallbackwithresult, i2, obj));
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onPostMessage + 99;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        isVideoAutoplay isvideoautoplay = this.onTransact;
        if (isvideoautoplay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onActivityResized + 101;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            isvideoautoplay = null;
        }
        isvideoautoplay.IAuthTabCallbackStubProxy();
    }

    @Override // viva.republica.toss.qrcode.Hilt_PhotoTransferActivity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        if (this.IAuthTabCallbackDefault) {
            return;
        }
        IAuthTabCallback iAuthTabCallback = this.onTransact;
        if (iAuthTabCallback == null) {
            int i2 = onPostMessage + 83;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            iAuthTabCallback = null;
        }
        Object objOnWarmupCompleted = iAuthTabCallback.onExtraCallback().onWarmupCompleted();
        Intrinsics.checkNotNull(objOnWarmupCompleted);
        if (!((Boolean) objOnWarmupCompleted).booleanValue()) {
            writeTypedList();
            return;
        }
        if (new RxPermissions(this).onExtraCallbackWithResult("android.permission.CAMERA")) {
            onExtraCallback(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1438231518, -1438231513, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            int i3 = onActivityResized + 105;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityResized + 109;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        new RxPermissions(this).onExtraCallbackWithResult(new String[]{"android.permission.CAMERA"}).IAuthTabCallback(new PhotoTransferActivity$.ExternalSyntheticLambda4(new PhotoTransferActivity$.ExternalSyntheticLambda3(this)));
        int i2 = onActivityResized + 117;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(PhotoTransferActivity photoTransferActivity, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = null;
        if (!(!shouldbekeptaschild.onNavigationEvent)) {
            onExtraCallback(new Object[]{photoTransferActivity}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), 1438231518, -1438231513, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            int i4 = onPostMessage + 55;
            onActivityResized = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46481 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, 22731 - View.MeasureSpec.getSize(0), -1820028492, false, "IAuthTabCallback", (Class[]) null);
                    }
                    Object obj = ((Field) objOnExtraCallback).get(null);
                    Object[] objArr = {photoTransferActivity, photoTransferActivity.getString(R.string.app_qrcode___4989c8dac9)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-899718983);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - ExpandableListView.getPackedPositionType(0L)), 12 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0) + 22732, -81813975, false, "onNavigationEvent", new Class[]{Context.class, String.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(obj, objArr);
                    photoTransferActivity.finish();
                    throw null;
                }
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1564184796);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46480), 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.resolveSize(0, 0) + 22731, -1820028492, false, "IAuthTabCallback", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback3).get(null);
                Object[] objArr2 = {photoTransferActivity, photoTransferActivity.getString(R.string.app_qrcode___4989c8dac9)};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-899718983);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22730, -81813975, false, "onNavigationEvent", new Class[]{Context.class, String.class});
                }
                ((Method) objOnExtraCallback4).invoke(obj2, objArr2);
                photoTransferActivity.finish();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            String string = photoTransferActivity.getString(R.string.app_qrcode___439265c9c6);
            Intrinsics.checkNotNullExpressionValue(string, "");
            photoTransferActivity.onExtraCallbackWithResult(string, true);
        }
        IAuthTabCallback iAuthTabCallback2 = photoTransferActivity.onTransact;
        if (iAuthTabCallback2 == null) {
            int i5 = onPostMessage + 115;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            iAuthTabCallback = iAuthTabCallback2;
        }
        iAuthTabCallback.onExtraCallback().onExtraCallback(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + photoTransferActivity.getApplicationContext().getPackageName()));
        photoTransferActivity.startActivity(intent);
        IAuthTabCallback iAuthTabCallback = photoTransferActivity.onTransact;
        if (iAuthTabCallback == null) {
            int i3 = onPostMessage + 59;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = onPostMessage + 75;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            iAuthTabCallback = null;
        }
        iAuthTabCallback.onExtraCallback().onExtraCallback(Boolean.FALSE);
        dialogInterface.dismiss();
    }

    private static final void onNavigationEvent(boolean z, PhotoTransferActivity photoTransferActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 73;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            dialogInterface.dismiss();
            int i4 = 90 / 0;
            if (!z) {
                return;
            }
        } else {
            dialogInterface.dismiss();
            if (!z) {
                return;
            }
        }
        photoTransferActivity.finish();
        int i5 = onActivityResized + 111;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(String str, boolean z) {
        int i = 2 % 2;
        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(this).onNavigationEvent(false)).onExtraCallbackWithResult(str), R.string.permission_action_go_to_setting, new PhotoTransferActivity$.ExternalSyntheticLambda8(this), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        String string = getString(im.toss.uikit.R.string.uikit_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {onwarmupcompletedOnExtraCallbackWithResult, string, new PhotoTransferActivity$.ExternalSyntheticLambda9(z, this), null, false, 12, null};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1871975236, 1871975236, iOnExtraCallbackWithResult2)).readTypedObject();
        int i2 = onActivityResized + 13;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
    }

    @Override // viva.republica.toss.qrcode.Hilt_PhotoTransferActivity
    public void onPause() {
        int i = 2 % 2;
        super.onPause();
        Scanner scanner = this.access100;
        if (scanner == null) {
            int i2 = onPostMessage + 83;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = onActivityResized + 47;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            scanner = null;
        }
        scanner.onWarmupCompleted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(PhotoTransferActivity photoTransferActivity, Uri uri) {
        int i = 2 % 2;
        if (uri != null) {
            int i2 = onActivityResized + 85;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            photoTransferActivity.IAuthTabCallbackDefault = true;
            String strOnNavigationEvent = photoTransferActivity.onNavigationEvent(zzcr.onWarmupCompleted(uri, photoTransferActivity));
            if (strOnNavigationEvent != null) {
                int i4 = onActivityResized + 99;
                onPostMessage = i4 % 128;
                if (i4 % 2 == 0) {
                    if (strOnNavigationEvent.length() != 0) {
                        Object[] objArr = {photoTransferActivity, CollectionsKt.listOf(strOnNavigationEvent), true};
                        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                        onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 781003526, -781003523, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                        return;
                    }
                } else {
                    strOnNavigationEvent.length();
                    throw null;
                }
            }
            photoTransferActivity.IAuthTabCallback(uri);
            int i5 = onPostMessage + 103;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        PhotoTransferActivity photoTransferActivity = (PhotoTransferActivity) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 7;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        ScannerViewFinder scannerViewFinder = photoTransferActivity.IAuthTabCallbackStubProxy;
        Object obj = null;
        if (scannerViewFinder == null) {
            int i5 = i2 + 119;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            scannerViewFinder = null;
        }
        scannerViewFinder.onWarmupCompleted(str);
        ScannerViewFinder scannerViewFinder2 = photoTransferActivity.IAuthTabCallbackStubProxy;
        if (scannerViewFinder2 == null) {
            int i7 = onActivityResized + 67;
            onPostMessage = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            scannerViewFinder2 = null;
        }
        scannerViewFinder2.announceForAccessibility(str);
        if (!(!zBooleanValue)) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PhotoTransferActivity", "error message is shown", access8100.onNavigationEvent(getWrite.IAuthTabCallback("msg", str)), (String) null, false, (String) null, 56, (Object) null);
        }
        int i8 = onPostMessage + 19;
        onActivityResized = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted(String str, boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 45;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1438231518, -1438231513, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1191659967, -1191659965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        int i4 = onActivityResized + 57;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void IAuthTabCallback(PhotoTransferActivity photoTransferActivity, String str, boolean z, String str2, int i, processBytes processbytes, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 19;
        int i5 = i4 % 128;
        onActivityResized = i5;
        int i6 = i4 % 2;
        if ((i2 & 8) != 0) {
            int i7 = i5 + 5;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            i = 0;
        }
        int i9 = i;
        if ((i2 & 16) != 0) {
            int i10 = i5 + 47;
            onPostMessage = i10 % 128;
            int i11 = i10 % 2;
            processbytes = null;
        }
        photoTransferActivity.onNavigationEvent(str, z, str2, i9, processbytes);
    }

    private final void onNavigationEvent(final String str, final boolean z, final String str2, final int i, final processBytes processbytes) {
        int i2 = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1230161L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.qrcode.PhotoTransferActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return PhotoTransferActivity.IAuthTabCallback(z, str, this, str2, i, processbytes, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i3 = onActivityResized + 91;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9 A[PHI: r7
      0x00c9: PHI (r7v18 java.lang.String) = (r7v17 java.lang.String), (r7v20 java.lang.String) binds: [B:24:0x00c7, B:21:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onNavigationEvent(boolean r7, java.lang.String r8, viva.republica.toss.qrcode.PhotoTransferActivity r9, java.lang.String r10, int r11, o.processBytes r12, o.SetDetectableSize r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onNavigationEvent(boolean, java.lang.String, viva.republica.toss.qrcode.PhotoTransferActivity, java.lang.String, int, o.processBytes, o.SetDetectableSize):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.app.Activity, viva.republica.toss.qrcode.PhotoTransferActivity, viva.republica.toss.qrcode.TossScanner$IAuthTabCallback] */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ?? r5 = (PhotoTransferActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 33;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        if (r5.isFinishing()) {
            return null;
        }
        try {
            Scanner scanner = ((PhotoTransferActivity) r5).access100;
            Scanner scanner2 = scanner;
            if (scanner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scanner2 = 0;
            }
            scanner2.setResultHandler(r5);
            Scanner scanner3 = ((PhotoTransferActivity) r5).access100;
            if (scanner3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scanner3 = null;
            }
            scanner3.onNavigationEvent();
            ScannerViewFinder scannerViewFinder = ((PhotoTransferActivity) r5).IAuthTabCallbackStubProxy;
            if (scannerViewFinder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                scannerViewFinder = null;
            }
            View viewOnNavigationEvent = scannerViewFinder.onNavigationEvent();
            Scanner scanner4 = ((PhotoTransferActivity) r5).access100;
            if (scanner4 == null) {
                int i4 = onPostMessage + 23;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                scanner4 = null;
            }
            viewOnNavigationEvent.setSelected(scanner4.IAuthTabCallback());
            return null;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhotoTransferActivity", e);
            int i6 = onPostMessage + 65;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
    }

    private final String onNavigationEvent(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = onActivityResized + 23;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        if (bitmap == null) {
            int i5 = i3 + 17;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        try {
            String text = new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new RGBLuminanceSource(bitmap.getWidth(), bitmap.getHeight(), iArr)))).getText();
            int i7 = onActivityResized + 55;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
            return text;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // viva.republica.toss.qrcode.TossScanner.IAuthTabCallback
    public void onNavigationEvent(@Nullable Result result) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 91;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        if (result == null) {
            int i5 = i2 + 49;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr = {this, CollectionsKt.listOf(result.getText()), true};
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 781003526, -781003523, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, viva.republica.toss.qrcode.PhotoTransferActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, viva.republica.toss.qrcode.PhotoTransferActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Object next;
        ?? r0 = (PhotoTransferActivity) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (getDynamic.onWarmupCompleted.onExtraCallbackWithResult((String) next)) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                int i3 = onActivityResized + 107;
                onPostMessage = i3 % 128;
                int i4 = i3 % 2;
                if (str.length() != 0) {
                    InitSessionKeyResponse initSessionKeyResponse = ((PhotoTransferActivity) r0).extraCallbackWithResult;
                    IAuthTabCallback(r0, "qr", true, initSessionKeyResponse != null ? initSessionKeyResponse.onNavigationEvent() : null, 0, null, 24, null);
                    r0.onExtraCallbackWithResult(str);
                    return null;
                }
            }
            InitSessionKeyResponse initSessionKeyResponse2 = ((PhotoTransferActivity) r0).extraCallbackWithResult;
            IAuthTabCallback(r0, "qr", false, initSessionKeyResponse2 != null ? initSessionKeyResponse2.onNavigationEvent() : null, 0, null, 24, null);
            if (zBooleanValue) {
                String string = r0.getString(R.string.not_toss_qr_code_message);
                Intrinsics.checkNotNullExpressionValue(string, "");
                r0.onWarmupCompleted(string, true);
            }
        }
        int i5 = onActivityResized + 93;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.qrcode.TossScanner.IAuthTabCallback
    public void setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 47;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            String string = getString(R.string.not_toss_qr_code_message);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{this, string, true}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1191659967, -1191659965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        } else {
            String string2 = getString(R.string.not_toss_qr_code_message);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int iOnExtraCallbackWithResult3 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            onExtraCallback(new Object[]{this, string2, true}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, 1191659967, -1191659965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4);
        }
        int i3 = onPostMessage + 95;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: Exception -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x008a, blocks: (B:7:0x0050, B:12:0x0068, B:17:0x0075, B:19:0x007d, B:15:0x006f), top: B:42:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onExtraCallbackWithResult(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x117b  */
    /* JADX WARN: Type inference failed for: r1v203, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v204 */
    /* JADX WARN: Type inference failed for: r1v205 */
    /* JADX WARN: Type inference failed for: r1v211 */
    /* JADX WARN: Type inference failed for: r1v212 */
    /* JADX WARN: Type inference failed for: r1v217, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v222, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v229, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v241, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v247, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v252, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v257, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v262, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v267, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v269, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v271, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v272, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v273, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v274, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v275, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v276, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v277 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v281, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r1v92, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v98, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.app.Activity, androidx.appcompat.app.AppCompatActivity, im.toss.base.BaseActivity, viva.republica.toss.qrcode.PhotoTransferActivity] */
    @Override // viva.republica.toss.qrcode.Hilt_PhotoTransferActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 4552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.qrcode.PhotoTransferActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PhotoTransferActivity photoTransferActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{photoTransferActivity, iEngagementSignalsCallbackDefault}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -241918018, 241918027, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static /* synthetic */ enableFontScaleChangesUpdatingLayout onNavigationEvent() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (enableFontScaleChangesUpdatingLayout) onExtraCallback(new Object[0], TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1068545326, -1068545320, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public static final /* synthetic */ Bitmap IAuthTabCallback(PhotoTransferActivity photoTransferActivity, Bitmap bitmap) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Bitmap) onExtraCallback(new Object[]{photoTransferActivity, bitmap}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -341585899, 341585900, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final void onExtraCallback(List<String> list) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{this, list}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1435021409, -1435021405, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final void IAuthTabCallback(List<String> list, boolean z) {
        Object[] objArr = {this, list, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 781003526, -781003523, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit onExtraCallback(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{photoTransferActivity, unit}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 362631947, -362631936, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{function1, obj}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 2041384234, -2041384224, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private static final Unit IAuthTabCallbackStub(PhotoTransferActivity photoTransferActivity, Unit unit) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(new Object[]{photoTransferActivity, unit}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -2055604309, 2055604309, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final Object IAuthTabCallback(access13800<? super Boolean> access13800Var) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return onExtraCallback(new Object[]{this, access13800Var}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 703397167, -703397159, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final Object IAuthTabCallback(RequestBody requestBody, access13800<? super List<String>> access13800Var) {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return onExtraCallback(new Object[]{this, requestBody, access13800Var}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -488372771, 488372778, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final void ICustomTabsServiceStubProxy() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1438231518, -1438231513, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    private final void onExtraCallback(String str, boolean z) {
        Object[] objArr = {this, str, Boolean.valueOf(z)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1191659967, -1191659965, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    @Override // viva.republica.toss.qrcode.Hilt_PhotoTransferActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityResized + 93;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onActivityResized + 55;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.qrcode.Hilt_PhotoTransferActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onActivityResized + 13;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onPostMessage + 101;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    static void validateRelationship() {
        readTypedObject = new char[]{32561, 32567, 32572, 32519, 32562, 32560, 32573, 32518, 32568, 32555, 32746, 32765, 32574, 32512};
        onMinimized = -1184333908;
        onActivityLayout = true;
        onMessageChannelReady = true;
    }
}
