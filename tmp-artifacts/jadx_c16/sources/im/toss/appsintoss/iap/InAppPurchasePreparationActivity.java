package im.toss.appsintoss.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.appsintoss.R$string;
import im.toss.appsintoss.data.remote.model.CreateOrderRequest;
import im.toss.appsintoss.iap.InAppPurchasePreparationActivity$;
import im.toss.appsintoss.iap.model.InAppPurchaseProductAuthorizer;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERSet;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.GeckoHubImp;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LifecyclesKtawaitStarted21;
import o.QueryProductDetailsParams;
import o.QueryProductDetailsParamsProduct;
import o.QuirksExternalSyntheticBackport0;
import o.RightClickGesturesKtonRightClickDown2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackStubProxy;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.WindowInfoTrackerCompanionExternalSyntheticLambda0;
import o.WindowMetricsCalculatorCompanionExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.b0a;
import o.dequeImageProxy;
import o.extraCommand;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getCreativeId;
import o.getPurchasesList;
import o.ka;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.setRandomHost;
import o.toMetersPerSecond;
import o.y1hExternalSyntheticLambda0;
import o.zzad;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InAppPurchasePreparationActivity extends Hilt_InAppPurchasePreparationActivity implements b0a {
    public static final onNavigationEvent Companion;
    public static final int IAuthTabCallbackStub;
    private static int IAuthTabCallback_Parcel;
    private static int getInterfaceDescriptor;
    private boolean asBinder;

    @Inject
    public zzad environments;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 250;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private QueryProductDetailsParamsProduct asInterface = new QueryProductDetailsParamsProduct.onExtraCallbackWithResult().onExtraCallback(this);
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(InAppPurchasePreparationViewModel.class), new getInterfaceDescriptor(this), new access000(this), new IAuthTabCallbackStubProxy(null, this));
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new InAppPurchasePreparationActivity$.ExternalSyntheticLambda9(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2 = 3 - (s * 4);
        int i3 = (s2 * 2) + 105;
        byte[] bArr = $$a;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            int i7 = 0;
            i3 += i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2++;
            i7 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i2];
            i3 += i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2++;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2++;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    static {
        getInterfaceDescriptor = 1;
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        IAuthTabCallbackStub = 8;
        int i = access100 + 31;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = i7 | i2;
        int i9 = (~i8) | (~(i7 | i));
        int i10 = (~((~i) | i7 | (~i2))) | (~(i6 | i2));
        int i11 = i6 + i2 + i4 + ((-540997959) * i5) + (162607451 * i3);
        int i12 = i11 * i11;
        int i13 = ((-612843245) * i6) + 1723858944 + (1667710703 * i2) + (i9 * (-1007206674)) + (1007206674 * i8) + ((-1007206674) * i10) + ((-1620049920) * i4) + ((-672137216) * i5) + (483393536 * i3) + (377683968 * i12);
        int i14 = (i6 * 228155117) + 240245784 + (i2 * 228155665) + (i9 * 274) + (i8 * (-274)) + (i10 * 274) + (i4 * 228155391) + (i5 * (-329950905)) + (i3 * (-2026639707)) + (i12 * 159186944);
        switch (i13 + (i14 * i14 * (-1451425792))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(inAppPurchasePreparationActivity, str);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(inAppPurchasePreparationActivity, str);
        int i3 = access000 + 5;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 105;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {inAppPurchasePreparationActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        Unit unit = (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -144227013, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 144227015);
        int i5 = IAuthTabCallbackStubProxy + 69;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchasePreparationActivity, onBackPressedCallback);
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 27;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(inAppPurchasePreparationActivity, str, setDetectableSize);
        }
        onWarmupCompleted(inAppPurchasePreparationActivity, str, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(inAppPurchasePreparationActivity, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 117;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(inAppPurchasePreparationActivity);
        int i4 = access000 + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 67;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(inAppPurchasePreparationActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 43;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 109;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchasePreparationActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 45;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getCreativeId onNavigationEvent(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(inAppPurchasePreparationActivity);
        }
        asInterface(inAppPurchasePreparationActivity);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        AppsInTossProduct appsInTossProduct = (AppsInTossProduct) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(inAppPurchasePreparationActivity, appsInTossProduct, setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 103;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, -1085250051, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity}, iOnExtraCallback2, iOnExtraCallback3, 1085250052);
        int i4 = access000 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public static final class onExtraCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ InAppPurchasePreparationActivity IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = inAppPurchasePreparationActivity;
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws NoWhenBranchMatchedException {
            SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult;
            int i = 2 % 2;
            if (th instanceof QueryProductDetailsParams) {
                int i2 = onNavigationEvent + 15;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25.onExtraCallbackWithResult((QueryProductDetailsParams) th);
            } else {
                safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult;
            }
            Object[] objArr = {this.IAuthTabCallback};
            ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27OnExtraCallbackWithResult);
            int i4 = onWarmupCompleted + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
        }
    }

    public static final /* synthetic */ List IAuthTabCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        List<String> listICustomTabsServiceStub = inAppPurchasePreparationActivity.ICustomTabsServiceStub();
        int i4 = IAuthTabCallbackStubProxy + 111;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return listICustomTabsServiceStub;
    }

    public static final /* synthetic */ QueryProductDetailsParamsProduct IAuthTabCallbackStub(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        QueryProductDetailsParamsProduct queryProductDetailsParamsProduct = inAppPurchasePreparationActivity.asInterface;
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        int i6 = i3 + 41;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return queryProductDetailsParamsProduct;
    }

    public static final /* synthetic */ void asBinder(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchasePreparationActivity.IEngagementSignalsCallback();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        int i2 = access000 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchasePreparationActivity.setEngagementSignalsCallback();
        if (i3 != 0) {
            throw null;
        }
        int i4 = access000 + 25;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModelICustomTabsServiceDefault = inAppPurchasePreparationActivity.ICustomTabsServiceDefault();
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        int i5 = access000 + 73;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return inAppPurchasePreparationViewModelICustomTabsServiceDefault;
    }

    public static final /* synthetic */ void onNavigationEvent(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, AppsInTossProduct appsInTossProduct) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, -1687197916, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, appsInTossProduct}, iOnExtraCallback2, iOnExtraCallback3, 1687197923);
        int i4 = access000 + 119;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(iOnExtraCallback, 1257750893, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, str, str2}, iOnExtraCallback2, iOnExtraCallback3, -1257750887);
            int i3 = 24 / 0;
        } else {
            int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback5 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback6 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(iOnExtraCallback4, 1257750893, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, str, str2}, iOnExtraCallback5, iOnExtraCallback6, -1257750887);
        }
        int i4 = access000 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access000 + 27;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final zzad onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            int i5 = i3 + 111;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = IAuthTabCallbackStubProxy + 71;
        access000 = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final InAppPurchasePreparationViewModel ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        InAppPurchasePreparationViewModel inAppPurchasePreparationViewModel = (InAppPurchasePreparationViewModel) this.IAuthTabCallbackDefault.getValue();
        int i4 = access000 + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return inAppPurchasePreparationViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 99;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        zzad zzadVarOnExtraCallback = inAppPurchasePreparationActivity.onExtraCallback();
        if (i3 != 0) {
            zzadVarOnExtraCallback.ITrustedWebActivityService_Parcel();
            throw null;
        }
        if (!zzadVarOnExtraCallback.ITrustedWebActivityService_Parcel()) {
            return Boolean.valueOf(DERSet.onExtraCallback.IAuthTabCallback_Parcel());
        }
        int i4 = access000 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final getCreativeId updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        getCreativeId getcreativeid = (getCreativeId) this.onTransact.getValue();
        int i3 = IAuthTabCallbackStubProxy + 43;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return getcreativeid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getCreativeId asInterface(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult();
        String str = "";
        if (strOnExtraCallbackWithResult == null) {
            int i2 = IAuthTabCallbackStubProxy + 61;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            strOnExtraCallbackWithResult = "";
        }
        String strOnNavigationEvent = inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onNavigationEvent();
        if (strOnNavigationEvent != null) {
            int i4 = access000 + 57;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            str = strOnNavigationEvent;
        }
        return new getCreativeId(inAppPurchasePreparationActivity, strOnExtraCallbackWithResult, str);
    }

    public static final class access000 implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public access000(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            if (i3 != 0) {
                int i4 = 26 / 0;
            }
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onWarmupCompleted;
            if (i3 != 0) {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
            componentActivity.getDefaultViewModelProviderFactory();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public getInterfaceDescriptor(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onNavigationEvent.getViewModelStore();
            int i4 = onExtraCallbackWithResult + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public IAuthTabCallbackStubProxy(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = function0;
            this.onWarmupCompleted = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 IAuthTabCallback() {
            int i = 2 % 2;
            Function0 function0 = this.onExtraCallbackWithResult;
            Object obj = null;
            if (function0 != null) {
                int i2 = onNavigationEvent + 67;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i3 = IAuthTabCallback + 117;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.onWarmupCompleted.getDefaultViewModelCreationExtras();
            int i5 = onNavigationEvent + 59;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return defaultViewModelCreationExtras;
            }
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2IAuthTabCallback;
        }
    }

    private final List<String> ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (!onExtraCallback().ITrustedWebActivityService_Parcel()) {
            String strIAuthTabCallbackStub = DERSet.onExtraCallback.IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub.length() != 0) {
                return StringsKt.split$default(StringsKt.trimEnd(strIAuthTabCallbackStub, new char[]{','}), new String[]{","}, false, 0, 6, (Object) null);
            }
            List<String> listEmptyList = CollectionsKt.emptyList();
            int i4 = IAuthTabCallbackStubProxy + 71;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return listEmptyList;
        }
        int i6 = access000 + 21;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        List<String> listEmptyList2 = CollectionsKt.emptyList();
        int i8 = IAuthTabCallbackStubProxy + 47;
        access000 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 73 / 0;
        }
        return listEmptyList2;
    }

    private static final Unit onExtraCallback(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(iOnExtraCallback, 112037706, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, str}, iOnExtraCallback2, iOnExtraCallback3, -112037703);
            unit = Unit.INSTANCE;
            int i3 = 26 / 0;
        } else {
            int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback5 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback6 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            IAuthTabCallback(iOnExtraCallback4, 112037706, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, str}, iOnExtraCallback5, iOnExtraCallback6, -112037703);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 115;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallbackDefault(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbIAuthTabCallback = inAppPurchasePreparationActivity.IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 50, 'B' - AndroidCharacter.getMirror('0'), new char[]{0, '\f', 18, 11, 17, 65484, '\f', 15, 1, 2, 15, 5, 6, 16, 17, '\f', 15, 22, 5, 17, 17, '\r', 16, 65495, 65484, 65484, '\r', '\t', 65534, 22, 65483, 4, '\f', '\f', 4, '\t', 2, 65483, 0, '\f', '\n', 65484, 16, 17, '\f', 15, 2, 65484, 65534, 0}, false, Process.getGidForName("") + 205, objArr);
        SessionTrackerb.IAuthTabCallback(sessionTrackerbIAuthTabCallback, inAppPurchasePreparationActivity, ((String) objArr[0]).intern(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            inAppPurchasePreparationActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
        inAppPurchasePreparationActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                i3 = 4;
            } else {
                int i5 = access000 + 97;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if ((i2 & 19) != 18) {
            int i7 = access000 + 9;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(676704097, i2, -1, "im.toss.appsintoss.iap.InAppPurchasePreparationActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InAppPurchasePreparationActivity.kt:105)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0);
            InAppPurchasePreparationViewModel inAppPurchasePreparationViewModelICustomTabsServiceDefault = inAppPurchasePreparationActivity.ICustomTabsServiceDefault();
            getCreativeId getcreativeidUpdateVisuals = inAppPurchasePreparationActivity.updateVisuals();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchasePreparationActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                int i8 = access000 + 49;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchasePreparationActivity$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new InAppPurchasePreparationActivity$.ExternalSyntheticLambda2(inAppPurchasePreparationActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda2);
                    obj2 = externalSyntheticLambda2;
                }
                Function1 function1 = (Function1) obj2;
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchasePreparationActivity);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback2) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        InAppPurchasePreparationActivity$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new InAppPurchasePreparationActivity$.ExternalSyntheticLambda3(inAppPurchasePreparationActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda3);
                        int i10 = access000 + 123;
                        IAuthTabCallbackStubProxy = i10 % 128;
                        int i11 = i10 % 2;
                        obj3 = externalSyntheticLambda3;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inAppPurchasePreparationActivity);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!zOnExtraCallback3)) {
                        InAppPurchasePreparationActivity$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new InAppPurchasePreparationActivity$.ExternalSyntheticLambda4(inAppPurchasePreparationActivity);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda4);
                        obj = externalSyntheticLambda4;
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, inAppPurchasePreparationViewModelICustomTabsServiceDefault, getcreativeidUpdateVisuals, false, function1, function0, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 3072, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i12 = IAuthTabCallbackStubProxy + 23;
                            access000 = i12 % 128;
                            int i13 = i12 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    } else {
                        obj = objOnMinimized3;
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda57.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, inAppPurchasePreparationViewModelICustomTabsServiceDefault, getcreativeidUpdateVisuals, false, function1, function0, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 3072, 0);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = access000 + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1819417951, i, -1, "im.toss.appsintoss.iap.InAppPurchasePreparationActivity.onCreate.<anonymous>.<anonymous> (InAppPurchasePreparationActivity.kt:102)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(676704097, true, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda1(inAppPurchasePreparationActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6, 12582912, 131070);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = access000 + 95;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = access000 + 99;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        boolean z;
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i2 = IAuthTabCallbackStubProxy + 87;
            access000 = i2 % 128;
            z = i2 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i3 = IAuthTabCallbackStubProxy + 47;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = access000 + 45;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1194023929, iIntValue, -1, "im.toss.appsintoss.iap.InAppPurchasePreparationActivity.onCreate.<anonymous> (InAppPurchasePreparationActivity.kt:101)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1819417951, true, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda5(inAppPurchasePreparationActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1819417951, true, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda5(inAppPurchasePreparationActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        if (!((Boolean) IAuthTabCallback(iOnExtraCallback, 1759412473, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3, -1759412468)).booleanValue()) {
            int i4 = IAuthTabCallbackStubProxy + 125;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            ICustomTabsServiceDefault().onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted);
            return;
        }
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-1194023929, true, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda7(this))), 1, (Object) null);
        validateRelationship();
        if (bundle != null) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "apps-in-toss-iap", "savedInstanceState is not null", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onTransact(bundle, this, null), 3, (Object) null);
            int i6 = access000 + 109;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Object obj;
        char[] cArr2;
        Object obj2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = 2083011369;
            obj = null;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 123;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(IAuthTabCallback_Parcel)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.resolveSizeAndState(0, 0, 0)), 23 - TextUtils.getOffsetBefore("", 0), Drawable.resolveOpacity(0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12844), Color.rgb(0, 0, 0) + 16777271, ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 47;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i11 = $11 + 107;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            int i13 = $11 + 11;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i14 = $11 + 87;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback + i) >>> 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        char offsetBefore = (char) (12843 - TextUtils.getOffsetBefore("", 0));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 55;
                        int iLastIndexOf = 2166 - TextUtils.lastIndexOf("", c, 0, 0);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, maxKeyCode, iLastIndexOf, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                    obj2 = obj;
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 12843), 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    obj2 = null;
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                obj = obj2;
                c = '0';
                i4 = 2083011369;
            }
            int i15 = $11 + 87;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Bundle $savedInstanceState;
        int label;
        final /* synthetic */ InAppPurchasePreparationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Bundle bundle, InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$savedInstanceState = bundle;
            this.this$0 = inAppPurchasePreparationActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$savedInstanceState, this.this$0, access13800Var);
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onTransact ontransactCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 63 / 0;
            } else {
                objInvokeSuspend = ontransactCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onWarmupCompleted + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[PHI: r1
          0x003c: PHI (r1v18 java.lang.Object) = (r1v4 java.lang.Object), (r1v19 java.lang.Object) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r5
          0x0025: PHI (r5v1 int) = (r5v0 int), (r5v5 int) binds: [B:8:0x0023, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 49;
            onWarmupCompleted = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 34 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                    Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                    this.label = 1;
                    int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                    obj = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "appsintoss.iap.orderpage.checkwhenresume", boolOnNavigationEvent, this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                    if (obj == objOnWarmupCompleted) {
                        int i5 = onWarmupCompleted;
                        int i6 = i5 + 49;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = i5 + 7;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i9 = onExtraCallback + 79;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            String string = this.$savedInstanceState.getString("order_id");
            if (string != null) {
                int i11 = onWarmupCompleted + 99;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr = {this.this$0};
                    ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(string);
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr2 = {this.this$0};
                ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(string);
            }
            Unit unit = Unit.INSTANCE;
            int i12 = onExtraCallback + 43;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new asBinder(this, (access13800) null), 2, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 37;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, OnBackPressedCallback onBackPressedCallback) {
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        if (Intrinsics.areEqual(inAppPurchasePreparationActivity.ICustomTabsServiceDefault().writeTypedObject().IAuthTabCallback(), Boolean.TRUE)) {
            int i2 = IAuthTabCallbackStubProxy + 41;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return Unit.INSTANCE;
        }
        Intent intent = new Intent();
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder = inAppPurchasePreparationActivity.ICustomTabsServiceDefault().asBinder();
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder == null || (strOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder.onExtraCallback()) == null) {
            strOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallbackStubProxy.onWarmupCompleted.onExtraCallback();
            int i4 = access000 + 77;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        intent.putExtra("result_error_code", strOnExtraCallback);
        intent.putExtra("result_order_id", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().onTransact());
        inAppPurchasePreparationActivity.setResult(0, intent);
        inAppPurchasePreparationActivity.finish();
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements getPurchasesList {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        IAuthTabCallback() {
        }

        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            InAppPurchasePreparationActivity.onExtraCallback(InAppPurchasePreparationActivity.this);
            int i4 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void validateRelationship() {
        int i = 2 % 2;
        extraCommand.IAuthTabCallback(getOnBackPressedDispatcher(), this, false, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda10(this), 2, (Object) null);
        this.asInterface.onNavigationEvent(new IAuthTabCallback());
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(this, (access13800) null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(this, (access13800) null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback("product_id", str);
        setDetectableSize.onExtraCallback("order_id", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().onTransact());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 1;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 99;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (!inAppPurchasePreparationActivity.asBinder) {
            inAppPurchasePreparationActivity.asBinder = true;
            getCreativeId.onExtraCallback(inAppPurchasePreparationActivity.updateVisuals(), 1603487L, (Set) null, false, "appsintoss_app_visit::background__iap_purchase_success", false, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda8(inAppPurchasePreparationActivity, str), 22, (Object) null);
            inAppPurchasePreparationActivity.ICustomTabsServiceDefault().onNavigationEvent(str2);
            return null;
        }
        int i5 = i2 + 27;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return null;
    }

    private final void setEngagementSignalsCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), new onExtraCallback(CoroutineExceptionHandler.extraCallbackWithResult, this), (setRandomHost) null, new onWarmupCompleted(null), 2, (Object) null);
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = InAppPurchasePreparationActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = onWarmupCompleted + 37;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 71;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                QueryProductDetailsParamsProduct queryProductDetailsParamsProductIAuthTabCallbackStub = InAppPurchasePreparationActivity.IAuthTabCallbackStub(InAppPurchasePreparationActivity.this);
                this.label = 1;
                obj = queryProductDetailsParamsProductIAuthTabCallbackStub.onWarmupCompleted(this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onWarmupCompleted + 63;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            String str = (String) obj;
            if (str == null) {
                Object[] objArr = {InAppPurchasePreparationActivity.this};
                ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback_Parcel.onExtraCallbackWithResult);
                return Unit.INSTANCE;
            }
            List listIAuthTabCallback = InAppPurchasePreparationActivity.IAuthTabCallback(InAppPurchasePreparationActivity.this);
            Object obj2 = null;
            if (!listIAuthTabCallback.isEmpty()) {
                int i5 = onNavigationEvent + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    listIAuthTabCallback.contains(str);
                    obj2.hashCode();
                    throw null;
                }
                if (!listIAuthTabCallback.contains(str)) {
                    int i6 = onWarmupCompleted + 107;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object[] objArr2 = {InAppPurchasePreparationActivity.this};
                        ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback.onNavigationEvent);
                        return Unit.INSTANCE;
                    }
                    Object[] objArr3 = {InAppPurchasePreparationActivity.this};
                    ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr3, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27$IAuthTabCallback.onNavigationEvent);
                    Unit unit = Unit.INSTANCE;
                    obj2.hashCode();
                    throw null;
                }
            }
            Object[] objArr4 = {InAppPurchasePreparationActivity.this};
            Object[] objArr5 = {(InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr4, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575), str};
            InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr5, -245124836, 245124842);
            Unit unit2 = Unit.INSTANCE;
            int i7 = onNavigationEvent + 101;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return unit2;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, android.content.Context, im.toss.appsintoss.iap.InAppPurchasePreparationActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Parcelable parcelable;
        String strOnExtraCallbackWithResult;
        String strIAuthTabCallback;
        String strOnExtraCallbackWithResult2;
        Object obj;
        ?? r1 = (InAppPurchasePreparationActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (str != null && str.length() != 0) {
            String stringExtra = r1.getIntent().getStringExtra("product_id");
            Intent intent = r1.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("mini_app_info", WindowInfoTrackerCompanionExternalSyntheticLambda0.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("mini_app_info");
                if (!(parcelableExtra instanceof WindowInfoTrackerCompanionExternalSyntheticLambda0)) {
                    parcelableExtra = null;
                }
                parcelable = (WindowInfoTrackerCompanionExternalSyntheticLambda0) parcelableExtra;
            }
            WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0 = (WindowInfoTrackerCompanionExternalSyntheticLambda0) parcelable;
            if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null || (strOnExtraCallbackWithResult = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult()) == null) {
                int i4 = access000 + 63;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                strOnExtraCallbackWithResult = "AppsInToss";
            }
            String str2 = "[" + strOnExtraCallbackWithResult + "] 인앱 결제 오류 문의";
            String str3 = Build.MODEL;
            String str4 = Build.VERSION.RELEASE;
            if (windowInfoTrackerCompanionExternalSyntheticLambda0 == null || (strIAuthTabCallback = windowInfoTrackerCompanionExternalSyntheticLambda0.onExtraCallbackWithResult()) == null) {
                strIAuthTabCallback = ka.onWarmupCompleted.IAuthTabCallback();
            }
            if (windowInfoTrackerCompanionExternalSyntheticLambda0 != null) {
                int i6 = access000 + 103;
                IAuthTabCallbackStubProxy = i6 % 128;
                if (i6 % 2 != 0) {
                    strOnExtraCallbackWithResult2 = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
                    int i7 = 48 / 0;
                    if (strOnExtraCallbackWithResult2 == null) {
                        strOnExtraCallbackWithResult2 = ka.onWarmupCompleted.onExtraCallbackWithResult();
                        int i8 = access000 + 29;
                        IAuthTabCallbackStubProxy = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    String strTrimIndent = StringsKt.trimIndent("\n            device: " + str3 + " (" + str4 + ")\n            productId: " + stringExtra + "\n            appName: " + strIAuthTabCallback + "\n            deploymentId: " + strOnExtraCallbackWithResult2 + "\n            appVersion: " + r1.onExtraCallback().getSmallIconBitmap() + "\n            =====================\n\n        ");
                    try {
                        Result.Companion companion = Result.Companion;
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse("mailto:"));
                        intent2.putExtra("android.intent.extra.EMAIL", new String[]{str});
                        intent2.putExtra("android.intent.extra.SUBJECT", str2);
                        intent2.putExtra("android.intent.extra.TEXT", strTrimIndent);
                        r1.startActivity(intent2);
                        obj = Result.constructor-impl(intent2);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    if (Result.exceptionOrNull-impl(obj) != null) {
                        String string = r1.getString(R$string.appsintoss_in_app_purchase_error_unavailable_email_client);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        new TdsToastV1.onNavigationEvent((Activity) r1, string).onNavigationEvent();
                    }
                } else {
                    strOnExtraCallbackWithResult2 = windowInfoTrackerCompanionExternalSyntheticLambda0.onNavigationEvent();
                    if (strOnExtraCallbackWithResult2 == null) {
                    }
                    String strTrimIndent2 = StringsKt.trimIndent("\n            device: " + str3 + " (" + str4 + ")\n            productId: " + stringExtra + "\n            appName: " + strIAuthTabCallback + "\n            deploymentId: " + strOnExtraCallbackWithResult2 + "\n            appVersion: " + r1.onExtraCallback().getSmallIconBitmap() + "\n            =====================\n\n        ");
                    Result.Companion companion3 = Result.Companion;
                    Intent intent22 = new Intent("android.intent.action.SENDTO");
                    intent22.setData(Uri.parse("mailto:"));
                    intent22.putExtra("android.intent.extra.EMAIL", new String[]{str});
                    intent22.putExtra("android.intent.extra.SUBJECT", str2);
                    intent22.putExtra("android.intent.extra.TEXT", strTrimIndent2);
                    r1.startActivity(intent22);
                    obj = Result.constructor-impl(intent22);
                    if (Result.exceptionOrNull-impl(obj) != null) {
                    }
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        InAppPurchasePreparationActivity inAppPurchasePreparationActivity = (InAppPurchasePreparationActivity) objArr[0];
        AppsInTossProduct appsInTossProduct = (AppsInTossProduct) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (inAppPurchasePreparationActivity.ICustomTabsServiceDefault().asBinder() != null) {
            return null;
        }
        Object[] objArr2 = {inAppPurchasePreparationActivity.updateVisuals(), 1602839L, null, false, "appsintoss_app_visit__iap_purchase", false, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda6(inAppPurchasePreparationActivity, appsInTossProduct), 22, null};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzgc.onExtraCallbackWithResult();
        getCreativeId.onExtraCallback(zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, objArr2, -876645919, 876645919);
        int i4 = access000 + 55;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, AppsInTossProduct appsInTossProduct, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback("product_id", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("price", WindowMetricsCalculatorCompanionExternalSyntheticLambda0.onExtraCallbackWithResult(Long.valueOf(appsInTossProduct.onExtraCallbackWithResult()), Integer.valueOf(appsInTossProduct.onWarmupCompleted())));
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, ExpandableListView.getPackedPositionType(0L) + 2, new char[]{'\b', 65526, '\f', 65526, 1, 65528, 5, 5}, true, (-16777002) - Color.rgb(0, 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), appsInTossProduct.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 5;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void IEngagementSignalsCallback() {
        int i = 2 % 2;
        getCreativeId.onExtraCallback(updateVisuals(), 1603493L, (Set) null, false, "appsintoss_app_visit__iap_purchase_error", false, new InAppPurchasePreparationActivity$.ExternalSyntheticLambda0(this), 22, (Object) null);
        int i2 = access000 + 105;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        String strOnExtraCallback = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult());
            setDetectableSize.onExtraCallback("product_id", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().getInterfaceDescriptor());
            inAppPurchasePreparationActivity.ICustomTabsServiceDefault().asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("service_name", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().IAuthTabCallbackStub().onExtraCallbackWithResult());
        setDetectableSize.onExtraCallback("product_id", inAppPurchasePreparationActivity.ICustomTabsServiceDefault().getInterfaceDescriptor());
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder = inAppPurchasePreparationActivity.ICustomTabsServiceDefault().asBinder();
        if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder != null) {
            strOnExtraCallback = safeActivityEmbeddingComponentProviderExternalSyntheticLambda27AsBinder.onExtraCallback();
        } else {
            int i3 = access000 + 13;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        setDetectableSize.onExtraCallback("error_type", strOnExtraCallback);
        return Unit.INSTANCE;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onSaveInstanceState(bundle);
            ICustomTabsServiceDefault().onTransact();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        String strOnTransact = ICustomTabsServiceDefault().onTransact();
        if (strOnTransact != null) {
            int i3 = IAuthTabCallbackStubProxy + 3;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            bundle.putString("order_id", strOnTransact);
        }
        int i5 = access000 + 119;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onNavigationEvent onnavigationevent, Context context, WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, String str, InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 8) != 0) {
                int i3 = onExtraCallback + 77;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                inAppPurchaseProductAuthorizer = InAppPurchaseProductAuthorizer.TOSS;
            }
            InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer2 = inAppPurchaseProductAuthorizer;
            if ((i & 16) != 0) {
                str2 = CreateOrderRequest.TYPE_ONE_TIME_PURCHASE;
            }
            String str4 = str2;
            if ((i & 32) != 0) {
                int i5 = onExtraCallback + 85;
                onExtraCallbackWithResult = i5 % 128;
                str3 = null;
                if (i5 % 2 == 0) {
                    str3.hashCode();
                    throw null;
                }
            }
            return onnavigationevent.onExtraCallback(context, windowInfoTrackerCompanionExternalSyntheticLambda0, str, inAppPurchaseProductAuthorizer2, str4, str3);
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull InAppPurchaseProductAuthorizer inAppPurchaseProductAuthorizer, @NotNull String str2, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(windowInfoTrackerCompanionExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(inAppPurchaseProductAuthorizer, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) InAppPurchasePreparationActivity.class);
            intent.putExtra("mini_app_info", (Parcelable) windowInfoTrackerCompanionExternalSyntheticLambda0);
            intent.putExtra("product_id", str);
            intent.putExtra("product_authorizer", (Serializable) inAppPurchaseProductAuthorizer);
            intent.putExtra("order_type", str2);
            if (str3 != null) {
                int i2 = onExtraCallbackWithResult + 9;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                intent.putExtra("offer_id", str3);
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onExtraCallbackWithResult + 87;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, AppsInTossProduct appsInTossProduct, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, 1404231952, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity, appsInTossProduct, setDetectableSize}, iOnExtraCallback2, iOnExtraCallback3, -1404231948);
    }

    public static final /* synthetic */ InAppPurchasePreparationViewModel onTransact(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (InAppPurchasePreparationViewModel) IAuthTabCallback(iOnExtraCallback, -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity}, iOnExtraCallback2, iOnExtraCallback3, 1686982575);
    }

    private final void IAuthTabCallback(String str) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, 112037706, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this, str}, iOnExtraCallback2, iOnExtraCallback3, -112037703);
    }

    private final boolean access200() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, 1759412473, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this}, iOnExtraCallback2, iOnExtraCallback3, -1759412468)).booleanValue();
    }

    private static final Unit onWarmupCompleted(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {inAppPurchasePreparationActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -144227013, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 144227015);
    }

    private static final Unit getInterfaceDescriptor(InAppPurchasePreparationActivity inAppPurchasePreparationActivity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, -1085250051, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity}, iOnExtraCallback2, iOnExtraCallback3, 1085250052);
    }

    private final void onWarmupCompleted(String str, String str2) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, 1257750893, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this, str, str2}, iOnExtraCallback2, iOnExtraCallback3, -1257750887);
    }

    private final void onWarmupCompleted(AppsInTossProduct appsInTossProduct) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback, -1687197916, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{this, appsInTossProduct}, iOnExtraCallback2, iOnExtraCallback3, 1687197923);
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access000 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = access000 + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchasePreparationActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void onNavigationEvent() {
        IAuthTabCallback_Parcel = 478308928;
    }
}
