package im.toss.ads_sdk.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.admob.AdmobAdFormat;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.model.NativeExtension;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View;
import im.toss.ads_sdk.ui.v2.view.NativeAdsThumbnailVideoV2View;
import im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView;
import im.toss.ads_sdk.ui.view.NativeAdsFeedView;
import im.toss.ads_sdk.ui.view.NativeAdsNormalView;
import im.toss.ads_sdk.ui.view.NativeAdsRightBannerView;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.R;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.ForwardingCameraControl;
import o.MaxRecyclerAdaptera;
import o.ProfileStore;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UtilsKtExternalSyntheticLambda17;
import o.ViewPager2LinearLayoutManagerImpl;
import o.ViewPager2OnPageChangeCallback;
import o.WebViewCompatExternalSyntheticLambda0;
import o.ZslRingBuffer;
import o.access13800;
import o.access14300;
import o.addFixedPosition;
import o.calculatePageOffsets;
import o.deleteProfile;
import o.findResAndMsg;
import o.forceDomainCheck;
import o.formatMsgs;
import o.getBacktraceNote;
import o.getFillAlpha;
import o.getOrCreateProfile;
import o.getStrokeWidth;
import o.getSupportedHighSpeedResolutionsFor;
import o.getTranslateY;
import o.isFireOS;
import o.isMuted;
import o.nSetPosition;
import o.onPageScrollStateChanged;
import o.setAdVideoPlaybackListener;
import o.y2;
import o.y4;
import o.y6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeAdsView extends NativeAdsContainerView {
    private static int ICustomTabsCallbackStub = 1;
    private static int onActivityLayout = 0;
    private static int onPostMessage = 1;
    private static int onRelationshipValidationResult;
    private NativeAdsDto.AdAsset IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private Rally IAuthTabCallbackStub;
    private final IAuthTabCallback IAuthTabCallbackStubProxy;
    private final onWarmupCompleted IAuthTabCallback_Parcel;
    private final asBinder ICustomTabsCallback;
    private final onTransact access000;
    private final onExtraCallbackWithResult access100;
    private boolean asBinder;
    private final List<ConstraintLayout> asInterface;
    private View extraCallback;
    private final IAuthTabCallbackStub extraCallbackWithResult;
    private final onNavigationEvent getInterfaceDescriptor;
    private String onActivityResized;
    private Float onExtraCallback;
    private final String onMessageChannelReady;
    private final getSupportedHighSpeedResolutionsFor<Boolean> onMinimized;
    private final getTranslateY onNavigationEvent;
    private ComposeView onTransact;
    private NativeAdsDto.AdAsset onWarmupCompleted;
    private Rally readTypedObject;
    private final asInterface writeTypedObject;
    private static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = ICustomTabsCallbackStub + 115;
        onRelationshipValidationResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAdsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsView nativeAdsView) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsView);
        int i4 = onActivityLayout + 81;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 87;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -676004221, new Object[]{nativeAdsView, adAsset, nativeAdsEventLogType}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 676004224, iIAuthTabCallback2);
        }
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsView nativeAdsView, NativeExtension nativeExtension, getBacktraceNote getbacktracenote, NativeAdsDto.AdAsset adAsset, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 23;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(nativeAdsView, nativeExtension, getbacktracenote, adAsset, z, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onPostMessage + 77;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeExtension nativeExtension = (NativeExtension) objArr[1];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[2];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onPostMessage + 113;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsView, nativeExtension, getbacktracenote, adAsset, zBooleanValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onPostMessage + 105;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsView, str);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = onPostMessage + 91;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(view);
        int i4 = onActivityLayout + 17;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = i9 | i10 | (~(i8 | i5));
        int i12 = i10 | i;
        int i13 = ~i5;
        int i14 = (~(i | i13 | i3)) | (~(i7 | i13 | i8)) | (~(i8 | i3 | i5));
        int i15 = i3 + i5 + i6 + ((-1329026341) * i2) + ((-1277752516) * i4);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i3) - 1912602624) + ((-659060787) * i5) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i6) + (494927872 * i2) + (1577058304 * i4) + ((-1783103488) * i16);
        int i18 = (i3 * 595972471) + 129777640 + (i5 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i6 * 595972219) + (i2 * (-1341978823)) + (i4 * 731850196) + (i16 * 1869086720);
        switch (i17 + (i18 * i18 * (-846725120))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
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
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return asInterface(objArr);
            case 10:
                return getInterfaceDescriptor(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(nativeAdsView, adAsset);
        int i4 = onPostMessage + 13;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback3, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 524885799, new Object[]{nativeAdsView, adAsset, motionEvent}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -524885799, iIAuthTabCallback4);
        int i3 = onPostMessage + 35;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsView, adAsset, nativeAdsEventLogType);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(NativeAdsView nativeAdsView) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(nativeAdsView);
        int i4 = onPostMessage + 69;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(nativeAdsView, adAsset);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return zIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onPostMessage + 25;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1190627206, new Object[]{nativeAdsView, adAsset, nativeAdsEventLogType}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1190627208, iIAuthTabCallback2);
        int i4 = onActivityLayout + 51;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsView nativeAdsView, String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 39;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(nativeAdsView, str);
        }
        onExtraCallbackWithResult(nativeAdsView, str);
        throw null;
    }

    public static /* synthetic */ boolean onNavigationEvent(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 27;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(nativeAdsView, adAsset);
        int i4 = onPostMessage + 5;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return zOnTransact;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(nativeAdsView, adAsset, zBooleanValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(nativeAdsView, adAsset, zBooleanValue);
        int i3 = onActivityLayout + 73;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 45;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(nativeAdsView, adAsset, num);
        int i4 = onPostMessage + 41;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean onWarmupCompleted(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(nativeAdsView, adAsset);
        int i4 = onActivityLayout + 121;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallbackStub;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        getTranslateY gettranslateyOnNavigationEvent = getTranslateY.onNavigationEvent(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(gettranslateyOnNavigationEvent, "");
        this.onNavigationEvent = gettranslateyOnNavigationEvent;
        this.onMessageChannelReady = "NativeAdsView";
        this.asBinder = true;
        this.onActivityResized = "";
        this.onMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        NativeAdsFeedView nativeAdsFeedView = gettranslateyOnNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(nativeAdsFeedView, "");
        NativeAdsFeedV2View nativeAdsFeedV2View = gettranslateyOnNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(nativeAdsFeedV2View, "");
        NativeAdsNormalView nativeAdsNormalView = gettranslateyOnNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(nativeAdsNormalView, "");
        NativeAdsNormalV2View nativeAdsNormalV2View = gettranslateyOnNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(nativeAdsNormalV2View, "");
        NativeAdsRightBannerView nativeAdsRightBannerView = gettranslateyOnNavigationEvent.asInterface;
        Intrinsics.checkNotNullExpressionValue(nativeAdsRightBannerView, "");
        NativeAdsRightBannerV2View nativeAdsRightBannerV2View = gettranslateyOnNavigationEvent.onTransact;
        Intrinsics.checkNotNullExpressionValue(nativeAdsRightBannerV2View, "");
        NativeAdsFeedVideoView nativeAdsFeedVideoView = gettranslateyOnNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(nativeAdsFeedVideoView, "");
        NativeAdsFeedVideoV2View nativeAdsFeedVideoV2View = gettranslateyOnNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(nativeAdsFeedVideoV2View, "");
        ConstraintLayout constraintLayout = gettranslateyOnNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = gettranslateyOnNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        this.asInterface = CollectionsKt.listOf(new ConstraintLayout[]{nativeAdsFeedView, nativeAdsFeedV2View, nativeAdsNormalView, nativeAdsNormalV2View, nativeAdsRightBannerView, nativeAdsRightBannerV2View, nativeAdsFeedVideoView, nativeAdsFeedVideoV2View, constraintLayout, constraintLayout2});
        this.access000 = new onTransact();
        this.ICustomTabsCallback = new asBinder();
        this.writeTypedObject = new asInterface();
        this.extraCallbackWithResult = new IAuthTabCallbackStub();
        this.getInterfaceDescriptor = new onNavigationEvent();
        this.IAuthTabCallbackStubProxy = new IAuthTabCallback();
        this.access100 = new onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel = new onWarmupCompleted();
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
            int i5 = onActivityLayout + 97;
            onPostMessage = i5 % 128;
            i2 = 2;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            i2 = 2;
        }
        this.IAuthTabCallbackDefault = true;
        if (attributeSet != null) {
            int i7 = onPostMessage + 45;
            onActivityLayout = i7 % 128;
            int i8 = i7 % i2;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.NativeAdsView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i9 = 0;
            while (i9 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == R.styleable.NativeAdsView_android_paddingVertical) {
                    int i10 = onActivityLayout + 17;
                    onPostMessage = i10 % 128;
                    int i11 = i10 % 2;
                    Resources resources = getResources();
                    int i12 = R.dimen.list_row_padding_vertical_16;
                    setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, resources.getDimensionPixelOffset(i12)));
                    setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(i12)));
                    i4 = 2;
                } else {
                    if (index == R.styleable.NativeAdsView_android_paddingTop) {
                        int i13 = onPostMessage + 87;
                        onActivityLayout = i13 % 128;
                        if (i13 % 2 != 0) {
                            setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_16)));
                            int i14 = 82 / 0;
                        } else {
                            setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_16)));
                        }
                        i3 = 2;
                        int i15 = 2 % 2;
                    } else {
                        i3 = 2;
                        if (index == R.styleable.NativeAdsView_android_paddingBottom) {
                            int i16 = onActivityLayout + 85;
                            onPostMessage = i16 % 128;
                            if (i16 % 2 == 0) {
                                setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_16)));
                                int i17 = 43 / 0;
                            } else {
                                setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_16)));
                            }
                            i4 = 2;
                            int i18 = 2 % 2;
                        }
                    }
                    i4 = i3;
                }
                i9++;
                int i19 = i4 % i4;
            }
            typedArrayObtainStyledAttributes.recycle();
            int i20 = onActivityLayout + 117;
            onPostMessage = i20 % 128;
            if (i20 % 2 == 0) {
                return;
            }
            int i21 = 2 % 2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAdsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onPostMessage + 51;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onActivityLayout + 43;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        View view = (View) objArr[1];
        View view2 = (View) objArr[2];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsView.onNavigationEvent(view, view2, adAsset, zBooleanValue);
        int i4 = onActivityLayout + 85;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return null;
    }

    public static final /* synthetic */ void asBinder(NativeAdsView nativeAdsView) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsView.IAuthTabCallback_Parcel();
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallback(NativeAdsView nativeAdsView) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 121;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsView.IAuthTabCallbackDefault();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 21;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        nativeAdsView.onExtraCallback(adAsset, str, str2);
        int i4 = onActivityLayout + 107;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ View onNavigationEvent(NativeAdsView nativeAdsView) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 79;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        View view = nativeAdsView.extraCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 99;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return view;
    }

    public static final /* synthetic */ NativeAdsDto.AdAsset onWarmupCompleted(NativeAdsView nativeAdsView) {
        int i = 2 % 2;
        int i2 = onPostMessage + 29;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.AdAsset adAsset = nativeAdsView.onWarmupCompleted;
        if (i3 == 0) {
            return adAsset;
        }
        throw null;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 35;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        String str = this.onMessageChannelReady;
        int i5 = i3 + 31;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setRequestId(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onActivityResized = str;
        int i4 = onActivityLayout + 67;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onTransact implements NativeAdsNormalView.IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        onTransact() {
        }

        @Override // im.toss.ads_sdk.ui.view.NativeAdsNormalView.IAuthTabCallback
        public void onNavigationEvent(NativeAdsDto.Creative.Normal normal, String str, String str2) throws Throwable {
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(normal, "");
                Intrinsics.checkNotNullParameter(str, "");
                adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
                int i3 = 80 / 0;
                if (adAssetOnWarmupCompleted == null) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(normal, "");
                Intrinsics.checkNotNullParameter(str, "");
                adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
                if (adAssetOnWarmupCompleted == null) {
                    return;
                }
            }
            int i4 = onExtraCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
            if (i5 != 0) {
                int i6 = 46 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackDefault implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallbackDefault = 1;
        private static int asBinder;
        final /* synthetic */ ConstraintLayout IAuthTabCallback;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ NativeAdsDto.AdAsset onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;
        final /* synthetic */ NativeAdsView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 113;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallbackDefault(View view, NativeAdsView nativeAdsView, ConstraintLayout constraintLayout, NativeAdsDto.AdAsset adAsset, boolean z) {
            this.onExtraCallback = view;
            this.onWarmupCompleted = nativeAdsView;
            this.IAuthTabCallback = constraintLayout;
            this.onExtraCallbackWithResult = adAsset;
            this.onNavigationEvent = z;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            NativeAdsView nativeAdsView = this.onWarmupCompleted;
            Object[] objArr = {nativeAdsView, NativeAdsView.onNavigationEvent(nativeAdsView), this.IAuthTabCallback, this.onExtraCallbackWithResult, Boolean.valueOf(this.onNavigationEvent)};
            NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1417380119, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1417380107, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            NativeAdsView nativeAdsView2 = this.onWarmupCompleted;
            nativeAdsView2.onNavigationEvent(nativeAdsView2.new IAuthTabCallbackStubProxy(null));
            int i2 = asBinder + 23;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class IAuthTabCallback_Parcel implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder;
        final /* synthetic */ ConstraintLayout IAuthTabCallback;
        final /* synthetic */ NativeAdsDto.AdAsset onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ NativeAdsView onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback_Parcel(View view, NativeAdsView nativeAdsView, ConstraintLayout constraintLayout, NativeAdsDto.AdAsset adAsset, boolean z) {
            this.onWarmupCompleted = view;
            this.onNavigationEvent = nativeAdsView;
            this.IAuthTabCallback = constraintLayout;
            this.onExtraCallback = adAsset;
            this.onExtraCallbackWithResult = z;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onWarmupCompleted.removeOnAttachStateChangeListener(this);
            NativeAdsView nativeAdsView = this.onNavigationEvent;
            NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1417380119, new Object[]{nativeAdsView, NativeAdsView.onNavigationEvent(nativeAdsView), this.IAuthTabCallback, this.onExtraCallback, Boolean.valueOf(this.onExtraCallbackWithResult)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1417380107, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            NativeAdsView nativeAdsView2 = this.onNavigationEvent;
            Object obj = null;
            nativeAdsView2.onNavigationEvent(nativeAdsView2.new access100(null));
            int i2 = asBinder + 27;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class getInterfaceDescriptor implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ NativeAdsView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public getInterfaceDescriptor(View view, NativeAdsView nativeAdsView) {
            this.IAuthTabCallback = view;
            this.onWarmupCompleted = nativeAdsView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
            NativeAdsView.onExtraCallback(this.onWarmupCompleted);
            NativeAdsView.asBinder(this.onWarmupCompleted);
            int i4 = onNavigationEvent + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asBinder implements NativeAdsNormalV2View.onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        asBinder() {
        }

        @Override // im.toss.ads_sdk.ui.v2.view.NativeAdsNormalV2View.onNavigationEvent
        public void onNavigationEvent(NativeAdsDto.Creative.Normal normal, String str, String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(normal, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                int i2 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
                    int i3 = 99 / 0;
                } else {
                    NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
                }
            }
            int i4 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class asInterface implements NativeAdsRightBannerView.onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        asInterface() {
        }

        @Override // im.toss.ads_sdk.ui.view.NativeAdsRightBannerView.onNavigationEvent
        public void onExtraCallbackWithResult(NativeAdsDto.Creative.RightBanner rightBanner, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(rightBanner, "");
                Intrinsics.checkNotNullParameter(str, "");
                NativeAdsView.onWarmupCompleted(NativeAdsView.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(rightBanner, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                int i3 = onExtraCallbackWithResult + 125;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
            }
        }
    }

    public static final class IAuthTabCallbackStub implements NativeAdsRightBannerV2View.onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallbackStub() {
        }

        @Override // im.toss.ads_sdk.ui.v2.view.NativeAdsRightBannerV2View.onNavigationEvent
        public void onWarmupCompleted(NativeAdsDto.Creative.RightBanner rightBanner, String str, String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(rightBanner, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                int i2 = IAuthTabCallback + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
                int i4 = onNavigationEvent + 87;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public static final class onNavigationEvent implements NativeAdsFeedView.IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onNavigationEvent() {
        }

        @Override // im.toss.ads_sdk.ui.view.NativeAdsFeedView.IAuthTabCallback
        public void IAuthTabCallback(NativeAdsDto.Creative.Feed feed, String str, String str2) throws Throwable {
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(feed, "");
                Intrinsics.checkNotNullParameter(str, "");
                adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
                int i3 = 68 / 0;
                if (adAssetOnWarmupCompleted == null) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(feed, "");
                Intrinsics.checkNotNullParameter(str, "");
                adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
                if (adAssetOnWarmupCompleted == null) {
                    return;
                }
            }
            int i4 = IAuthTabCallback + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
            int i6 = onExtraCallback + 27;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class IAuthTabCallback implements NativeAdsFeedVideoView.onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback() {
        }

        @Override // im.toss.ads_sdk.ui.view.NativeAdsFeedVideoView.onExtraCallback
        public void onExtraCallbackWithResult(NativeAdsDto.Creative.FeedVideo feedVideo, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(feedVideo, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
            }
            int i4 = onNavigationEvent + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onExtraCallbackWithResult implements NativeAdsFeedV2View.IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onExtraCallbackWithResult() {
        }

        @Override // im.toss.ads_sdk.ui.v2.view.NativeAdsFeedV2View.IAuthTabCallback
        public void onExtraCallbackWithResult(NativeAdsDto.Creative.Feed feed, String str, String str2) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(feed, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                int i2 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
                int i4 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 3;
                }
            }
        }
    }

    public static final class onWarmupCompleted implements NativeAdsFeedVideoV2View.onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        onWarmupCompleted() {
        }

        @Override // im.toss.ads_sdk.ui.v2.view.NativeAdsFeedVideoV2View.onWarmupCompleted
        public void onWarmupCompleted(NativeAdsDto.Creative.FeedVideo feedVideo, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(feedVideo, "");
            Intrinsics.checkNotNullParameter(str, "");
            NativeAdsDto.AdAsset adAssetOnWarmupCompleted = NativeAdsView.onWarmupCompleted(NativeAdsView.this);
            if (adAssetOnWarmupCompleted != null) {
                int i4 = onNavigationEvent + 25;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                NativeAdsView.onExtraCallbackWithResult(NativeAdsView.this, adAssetOnWarmupCompleted, str, str2);
            }
            int i6 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void onExtraCallback(NativeAdsDto.AdAsset adAsset, final String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            getFillAlpha.onWarmupCompleted(IAuthTabCallbackStub(), this.onActivityResized, adAsset, str2 != null ? new NativeAdsEventLogType.onExtraCallback(str2) : null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 11;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr = {this.f$0, str};
                    Unit unit = (Unit) NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1583503824, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1583503831, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                    int i6 = IAuthTabCallback + 53;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 56, null);
            int i3 = onPostMessage + 85;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        IAuthTabCallbackStub();
        onextracallback.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(NativeAdsView nativeAdsView, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            Context context = nativeAdsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            getStrokeWidth.IAuthTabCallback(getstrokewidth, context, str, 0, 2, null);
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 95;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    private final void onWarmupCompleted() {
        ConstraintLayout constraintLayout;
        float f;
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 29;
        onPostMessage = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.onWarmupCompleted == null) {
            Rally rally = this.readTypedObject;
            if (rally != null) {
                int i4 = i2 + 31;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                rally.ICustomTabsServiceStub();
            }
            this.extraCallback = null;
            Iterator<T> it = this.asInterface.iterator();
            while (it.hasNext()) {
                int i6 = onPostMessage + 7;
                onActivityLayout = i6 % 128;
                if (i6 % 2 != 0) {
                    constraintLayout = (ConstraintLayout) it.next();
                    f = 2.0f;
                } else {
                    constraintLayout = (ConstraintLayout) it.next();
                    f = 0.0f;
                }
                constraintLayout.setAlpha(f);
            }
        }
        int i7 = onActivityLayout + 55;
        onPostMessage = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 6 / 0;
        }
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 123;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        onWarmupCompleted();
        int i4 = onPostMessage + 21;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackStub(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 109;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = nativeAdsView.asBinder;
            throw null;
        }
        if (!nativeAdsView.asBinder && nativeAdsView.onWarmupCompleted((View) nativeAdsView) && nativeAdsView.getVisibility() == 0 && Intrinsics.areEqual(adAsset, nativeAdsView.onWarmupCompleted)) {
            int i3 = onActivityLayout + 75;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = onPostMessage + 25;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallbackDefault() throws Throwable {
        final NativeAdsDto.AdAsset adAsset;
        boolean z;
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            obj.hashCode();
            throw null;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (adAsset = this.onWarmupCompleted) == null) {
            return;
        }
        getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor = this.onMinimized;
        if (!this.asBinder) {
            z = true;
            if (!onWarmupCompleted((View) this)) {
                z = false;
            } else {
                int i3 = onPostMessage + 117;
                onActivityLayout = i3 % 128;
                if (i3 % 2 != 0) {
                    getVisibility();
                    obj.hashCode();
                    throw null;
                }
                if (getVisibility() != 0) {
                }
            }
        }
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub != null) {
            nativeAdsManagerIAuthTabCallbackStub.onExtraCallback((findResAndMsg) TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), this.onActivityResized, adAsset, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda9
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onWarmupCompleted + 29;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    NativeAdsView nativeAdsView = this.f$0;
                    if (i6 != 0) {
                        return Boolean.valueOf(NativeAdsView.onWarmupCompleted(nativeAdsView, adAsset));
                    }
                    Boolean.valueOf(NativeAdsView.onWarmupCompleted(nativeAdsView, adAsset));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
        }
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub2 = IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub2 != null) {
            NativeAdsManager.IAuthTabCallback(nSetPosition.onExtraCallbackWithResult(), 1869487633, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1869487598, new Object[]{nativeAdsManagerIAuthTabCallbackStub2, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), this.onActivityResized, adAsset, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda10
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 91;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(NativeAdsView.onExtraCallbackWithResult(this.f$0, adAsset));
                    int i7 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return boolValueOf;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 21;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolValueOf = Boolean.valueOf(NativeAdsView.onNavigationEvent(this.f$0, adAsset));
                    int i7 = onNavigationEvent + 87;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return boolValueOf;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }}, nSetPosition.onExtraCallbackWithResult());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackDefault(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 39;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (nativeAdsView.asBinder || !nativeAdsView.onExtraCallback((View) nativeAdsView) || nativeAdsView.getVisibility() != 0 || !Intrinsics.areEqual(adAsset, nativeAdsView.onWarmupCompleted)) {
            return false;
        }
        int i4 = onPostMessage + 79;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean onTransact(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onPostMessage + 5;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        if (nativeAdsView.asBinder || !nativeAdsView.onExtraCallbackWithResult((View) nativeAdsView)) {
            return false;
        }
        int i4 = onActivityLayout + 89;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            if (nativeAdsView.getVisibility() != 0 || !Intrinsics.areEqual(adAsset, nativeAdsView.onWarmupCompleted)) {
                return false;
            }
            int i5 = onActivityLayout + 111;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        nativeAdsView.getVisibility();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(NativeAdsView nativeAdsView, String str, NativeAdsDto.AdAsset adAsset, boolean z, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 73;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 8) != 0) {
            int i6 = i3 + 27;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            viewPager2LinearLayoutManagerImpl = null;
        }
        nativeAdsView.onExtraCallbackWithResult(str, adAsset, z, viewPager2LinearLayoutManagerImpl);
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        int label;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = NativeAdsView.this.new IAuthTabCallbackStubProxy(access13800Var);
            int i2 = onExtraCallback + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStubProxy;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = 12 / 0;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i4 = onWarmupCompleted + 17;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallback + 49;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            NativeAdsView.this.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = NativeAdsView.this.new access100(access13800Var);
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return access100Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 29;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 73;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onNavigationEvent + 61;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            NativeAdsView.this.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
    }

    private final void onNavigationEvent(String str, NativeAdsDto.AdAsset adAsset, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
        int i = 2 % 2;
        if (ViewPager2OnPageChangeCallback.onExtraCallbackWithResult.onExtraCallback() == null || adAsset == null) {
            return;
        }
        NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset.IAuthTabCallbackStub();
        if (nativeExtensionIAuthTabCallbackStub != null) {
            getOrCreateProfile.onWarmupCompleted(nativeExtensionIAuthTabCallbackStub.onWarmupCompleted(), viewPager2LinearLayoutManagerImpl);
        }
        adAsset.onExtraCallbackWithResult().IAuthTabCallback();
        if (nativeExtensionIAuthTabCallbackStub != null) {
            int i2 = onActivityLayout + 63;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            nativeExtensionIAuthTabCallbackStub.onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 2 / 0;
            }
        }
        int i5 = onPostMessage + 91;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        ComposeView composeView = this.onTransact;
        if (composeView != null) {
            int i5 = i3 + 55;
            onActivityLayout = i5 % 128;
            composeView.setVisibility(i5 % 2 != 0 ? 63 : 8);
            composeView.IAuthTabCallbackStub();
        }
        this.onMinimized.IAuthTabCallback(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = nativeAdsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        getStrokeWidth.IAuthTabCallback(getstrokewidth, context, adAsset.onExtraCallbackWithResult().onWarmupCompleted(), 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 57;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final NativeAdsView nativeAdsView, final NativeAdsDto.AdAsset adAsset, Integer num) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 107;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = nativeAdsView.IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub != null) {
                getFillAlpha.onWarmupCompleted(nativeAdsManagerIAuthTabCallbackStub, nativeAdsView.onActivityResized, adAsset, null, null, null, null, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda16
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallback + 123;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnExtraCallback = NativeAdsView.onExtraCallback(this.f$0, adAsset);
                        int i6 = IAuthTabCallback + 57;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        return unitOnExtraCallback;
                    }
                }, 56, null);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = onPostMessage + 119;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        nativeAdsView.IAuthTabCallbackStub();
        throw null;
    }

    private static final boolean onTransact(NativeAdsView nativeAdsView) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) nativeAdsView.onMinimized.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(NativeAdsView nativeAdsView, String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 13;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        Context context = nativeAdsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        getStrokeWidth.IAuthTabCallback(getstrokewidth, context, str, 0, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 45;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(final NativeAdsView nativeAdsView, NativeExtension nativeExtension, getBacktraceNote getbacktracenote, final NativeAdsDto.AdAsset adAsset, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean zOnNavigationEvent;
        boolean zOnNavigationEvent2;
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 35;
        onPostMessage = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 3) != 3, i & 1)) {
            int i4 = onPostMessage + 13;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-733831655, i, -1, "im.toss.ads_sdk.ui.view.NativeAdsView.showNativeAdsEntry.<anonymous>.<anonymous> (NativeAdsView.kt:419)");
                }
                String str = nativeAdsView.onActivityResized;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeExtension);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2 | zOnNavigationEvent) {
                    int i6 = onPostMessage + 119;
                    onActivityLayout = i6 % 128;
                    if (i6 % 2 != 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = onPageScrollStateChanged.Companion.onExtraCallbackWithResult(nativeExtension, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj) throws Throwable {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 29;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                Unit unitOnWarmupCompleted = NativeAdsView.onWarmupCompleted(this.f$0, adAsset, (Integer) obj);
                                int i10 = onExtraCallback + 31;
                                onExtraCallbackWithResult = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return unitOnWarmupCompleted;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }, new ProfileStore(nativeAdsView.onActivityResized, adAsset, nativeAdsView.IAuthTabCallbackStub(), z, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda4
                            private static int onExtraCallbackWithResult = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i7 = 2 % 2;
                                int i8 = onNavigationEvent + 23;
                                onExtraCallbackWithResult = i8 % 128;
                                int i9 = i8 % 2;
                                Boolean boolValueOf = Boolean.valueOf(NativeAdsView.onExtraCallbackWithResult(this.f$0));
                                int i10 = onNavigationEvent + 55;
                                onExtraCallbackWithResult = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return boolValueOf;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        }, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i7 = 2 % 2;
                                int i8 = onWarmupCompleted + 15;
                                onExtraCallbackWithResult = i8 % 128;
                                if (i8 % 2 != 0) {
                                    NativeAdsView.onNavigationEvent(this.f$0, (String) obj);
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                Unit unitOnNavigationEvent = NativeAdsView.onNavigationEvent(this.f$0, (String) obj);
                                int i9 = onExtraCallbackWithResult + 97;
                                onWarmupCompleted = i9 % 128;
                                int i10 = i9 % 2;
                                return unitOnNavigationEvent;
                            }
                        }));
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    WebViewCompatExternalSyntheticLambda0.onExtraCallback(getbacktracenote, (onPageScrollStateChanged) objOnMinimized, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 4);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                String str2 = nativeAdsView.onActivityResized;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(nativeExtension);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2 | zOnNavigationEvent) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(final NativeAdsView nativeAdsView, final NativeExtension nativeExtension, final getBacktraceNote getbacktracenote, final NativeAdsDto.AdAsset adAsset, final boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onActivityLayout + 119;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            int i5 = onActivityLayout + 31;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onActivityLayout + 75;
                onPostMessage = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2086332034, i, -1, "im.toss.ads_sdk.ui.view.NativeAdsView.showNativeAdsEntry.<anonymous> (NativeAdsView.kt:417)");
                int i9 = onActivityLayout + 85;
                onPostMessage = i9 % 128;
                int i10 = i9 % 2;
            }
            y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, ForwardingCameraControl.onExtraCallback(-733831655, true, new Function2() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = IAuthTabCallback + 9;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        return NativeAdsView.IAuthTabCallback(this.f$0, nativeExtension, getbacktracenote, adAsset, z, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitIAuthTabCallback = NativeAdsView.IAuthTabCallback(this.f$0, nativeExtension, getbacktracenote, adAsset, z, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = 49 / 0;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(final NativeAdsDto.AdAsset adAsset, final NativeExtension nativeExtension, final getBacktraceNote<? super onPageScrollStateChanged, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl, final boolean z) throws Throwable {
        int i = 2 % 2;
        Iterator<T> it = this.asInterface.iterator();
        while (it.hasNext()) {
            ((ConstraintLayout) it.next()).setVisibility(8);
        }
        this.onNavigationEvent.getRoot().setOnClickListener(null);
        this.onNavigationEvent.getRoot().setOnTouchListener(null);
        this.IAuthTabCallback = null;
        this.onExtraCallback = null;
        ComposeView composeView = this.onTransact;
        if (composeView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            composeView.onNavigationEvent(ZslRingBuffer.onNavigationEvent.IAuthTabCallback);
            addView(composeView);
            this.onTransact = composeView;
        }
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(2086332034, true, new Function2() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                NativeAdsView nativeAdsView = this.f$0;
                NativeExtension nativeExtension2 = nativeExtension;
                getBacktraceNote getbacktracenote2 = getbacktracenote;
                NativeAdsDto.AdAsset adAsset2 = adAsset;
                boolean z2 = z;
                int iIntValue = ((Integer) obj2).intValue();
                Object[] objArr = {nativeAdsView, nativeExtension2, getbacktracenote2, adAsset2, Boolean.valueOf(z2), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                Unit unit = (Unit) NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1467335378, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1467335386, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                int i5 = IAuthTabCallback + 23;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 71 / 0;
                }
                return unit;
            }
        })));
        Rally rally = this.IAuthTabCallbackStub;
        if (rally != null) {
            int i2 = onPostMessage + 117;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            rally.ICustomTabsServiceStub();
        }
        this.IAuthTabCallbackStub = null;
        Rally rally2 = this.readTypedObject;
        if (rally2 != null) {
            rally2.ICustomTabsServiceStub();
            int i4 = onPostMessage + 109;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
        }
        this.readTypedObject = null;
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, composeView}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, iIAuthTabCallback2);
        composeView.setVisibility(0);
        this.extraCallback = composeView;
        this.asBinder = false;
        this.onWarmupCompleted = adAsset;
        onNavigationEvent(this.onActivityResized, adAsset, viewPager2LinearLayoutManagerImpl);
        onExtraCallbackWithResult();
        onNavigationEvent(new access000(null));
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = NativeAdsView.this.new access000(access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return access000Var;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 27 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            access000 access000VarCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return access000VarCreate.invokeSuspend(Unit.INSTANCE);
            }
            access000VarCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallbackWithResult + 25;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            NativeAdsView.this.onExtraCallbackWithResult();
            return Unit.INSTANCE;
        }
    }

    public final String onExtraCallbackWithResult(@NotNull String str, @Nullable NativeAdsDto.AdAsset adAsset) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onActivityResized = str;
        Object obj = null;
        if (onNavigationEvent(adAsset)) {
            int i2 = onActivityLayout + 29;
            onPostMessage = i2 % 128;
            if (i2 % 2 != 0) {
                return "7";
            }
            obj.hashCode();
            throw null;
        }
        if (adAsset == null) {
            return null;
        }
        int i3 = onPostMessage + 121;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            return adAsset.IAuthTabCallbackDefault();
        }
        String strIAuthTabCallbackDefault = adAsset.IAuthTabCallbackDefault();
        int i4 = 53 / 0;
        return strIAuthTabCallbackDefault;
    }

    public final void setThumbnailBannerContentLoadState(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 95;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallbackStub.setContentLoadState(z);
            this.onNavigationEvent.IAuthTabCallbackDefault.setContentLoadState(z);
            int i3 = onActivityLayout + 103;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onNavigationEvent.IAuthTabCallbackStub.setContentLoadState(z);
        this.onNavigationEvent.IAuthTabCallbackDefault.setContentLoadState(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(View view, View view2, NativeAdsDto.AdAsset adAsset, boolean z) throws Throwable {
        int i = 2 % 2;
        Rally rally = this.readTypedObject;
        if (rally != null) {
            int i2 = onActivityLayout + 47;
            onPostMessage = i2 % 128;
            if (i2 % 2 == 0) {
                rally.ICustomTabsServiceStub();
                int i3 = 87 / 0;
            } else {
                rally.ICustomTabsServiceStub();
            }
            int i4 = onActivityLayout + 105;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        }
        if (view != null) {
            int i6 = onActivityLayout + 31;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                if (!Intrinsics.areEqual(view, view2)) {
                    float fIAuthTabCallback = IAuthTabCallback(view);
                    view.setScaleX(fIAuthTabCallback);
                    view.setScaleY(fIAuthTabCallback);
                    view.setAlpha(0.0f);
                }
            } else {
                Intrinsics.areEqual(view, view2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        onExtraCallback(adAsset, z);
        this.extraCallback = view2;
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setAlpha(1.0f);
        }
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 21;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = true;
        Object[] objArr = {this.onNavigationEvent.onNavigationEvent, false};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback2, -1854618277, 1854618281);
        this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
        Object[] objArr2 = {this.onNavigationEvent.onWarmupCompleted, false};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        NativeAdsFeedVideoV2View.onWarmupCompleted(objArr2, forceDomainCheck.IAuthTabCallback(), -1729768599, forceDomainCheck.IAuthTabCallback(), 1729768603, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        this.onNavigationEvent.IAuthTabCallbackStub.onNavigationEvent();
        this.onNavigationEvent.IAuthTabCallbackDefault.onNavigationEvent();
        int i4 = onPostMessage + 99;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void asBinder() throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = false;
        Object[] objArr = {this.onNavigationEvent.onNavigationEvent, false};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        NativeAdsFeedVideoView.IAuthTabCallback(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback2, -1854618277, 1854618281);
        this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(true);
        Object[] objArr2 = {this.onNavigationEvent.onWarmupCompleted, false};
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        NativeAdsFeedVideoV2View.onWarmupCompleted(objArr2, forceDomainCheck.IAuthTabCallback(), -1729768599, forceDomainCheck.IAuthTabCallback(), 1729768603, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback);
        this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(true);
        this.onNavigationEvent.IAuthTabCallbackStub.asBinder();
        this.onNavigationEvent.IAuthTabCallbackDefault.asBinder();
        int i4 = onActivityLayout + 111;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.ads_sdk.ui.view.NativeAdsContainerView
    public void onExtraCallbackWithResult(boolean z) throws Throwable {
        int i = 2 % 2;
        NativeAdsFeedVideoView.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this.onNavigationEvent.onNavigationEvent, Boolean.valueOf(z)}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1854618277, 1854618281);
        NativeAdsFeedVideoV2View.onWarmupCompleted(new Object[]{this.onNavigationEvent.onWarmupCompleted, Boolean.valueOf(z)}, forceDomainCheck.IAuthTabCallback(), -1729768599, forceDomainCheck.IAuthTabCallback(), 1729768603, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
        this.onNavigationEvent.IAuthTabCallbackStub.onExtraCallbackWithResult(z);
        this.onNavigationEvent.IAuthTabCallbackDefault.onExtraCallbackWithResult(z);
        if (!z) {
            int i2 = onPostMessage + 15;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel();
        }
        int i4 = onPostMessage + 101;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit asBinder(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 109;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 97;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final Rally IAuthTabCallbackStub(final View view) {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 105;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        if (view == null) {
            int i5 = i2 + 59;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.IAuthTabCallbackDefault(isMuted.onNavigationEvent(RallysKt.onExtraCallback(new LinearInterpolator(), 200), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(IAuthTabCallback(view)), (Function1) null, 5, (Object) null), 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallback + 117;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr2 = {view};
                Unit unit = (Unit) NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1575659291, objArr2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1575659281, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                int i10 = onExtraCallback + 47;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 13 / 0;
                }
                return unit;
            }
        }, 1, null};
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        Rally rally = (Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, iOnExtraCallback, objArr, 2128644226);
        isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
        return rally;
    }

    private final float IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 115;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        if (!Intrinsics.areEqual(view, this.onNavigationEvent.onExtraCallback)) {
            Intrinsics.areEqual(view, this.onNavigationEvent.asBinder);
        }
        int i4 = onPostMessage + 41;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return 0.7f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(NativeAdsView nativeAdsView) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsView.IAuthTabCallbackDefault();
            unit = Unit.INSTANCE;
            int i3 = 19 / 0;
        } else {
            nativeAdsView.IAuthTabCallbackDefault();
            unit = Unit.INSTANCE;
        }
        int i4 = onPostMessage + 69;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r25.IAuthTabCallbackStub == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r2 = im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage + 25;
        im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if ((r2 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = 8544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r2 = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r4 = r1;
        r1 = (im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.Rally.onWarmupCompleted(im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new java.lang.Object[]{(im.toss.tds.foundation.anim.rally.Rally) im.toss.tds.foundation.anim.rally.RallysKt.onWarmupCompleted(new java.lang.Object[]{r26, o.isMuted.asBinder(o.isMuted.onNavigationEvent(im.toss.tds.foundation.anim.rally.RallysKt.onExtraCallback(new android.view.animation.LinearInterpolator(), 200), (java.lang.Float) null, r4, (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), (java.lang.Float) null, r4, (kotlin.jvm.functions.Function1) null, 5, (java.lang.Object) null), 0, null, 0, null, null, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(r8), 0L, false, 1660, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), -303858023, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 303858025), null, new im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda6(r25), 1, null}, 2128644226);
        o.isFireOS.onExtraCallbackWithResult(r1, false, 1, (java.lang.Object) null);
        r2 = im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage + 37;
        im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r26 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r26 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage + 73;
        im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Rally IAuthTabCallbackDefault(View view) {
        int i = 2 % 2;
        int i2 = onPostMessage + 73;
        onActivityLayout = i2 % 128;
        Float fValueOf = i2 % 2 != 0 ? Float.valueOf(2.0f) : Float.valueOf(1.0f);
    }

    private static final Unit onExtraCallback(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            nativeAdsView.onWarmupCompleted(adAsset, z);
            return Unit.INSTANCE;
        }
        nativeAdsView.onWarmupCompleted(adAsset, z);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(final NativeAdsDto.AdAsset adAsset, final boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = onPostMessage + 81;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = adAsset;
            Iterator<T> it = this.asInterface.iterator();
            while (it.hasNext()) {
                ((ConstraintLayout) it.next()).setVisibility(8);
            }
            if (adAsset != null) {
                int i3 = onPostMessage + 75;
                onActivityLayout = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 48 / 0;
                    if (!(!onNavigationEvent(adAsset))) {
                        NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1533812132, new Object[]{this, adAsset.onExtraCallbackWithResult()}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1533812123, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                        if (thumbnailBanner != null) {
                            onWarmupCompleted(adAsset, thumbnailBanner, z, new Function0() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda15
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke() {
                                    Unit unit;
                                    int i5 = 2 % 2;
                                    int i6 = onExtraCallback + 91;
                                    IAuthTabCallback = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        Object[] objArr = {this.f$0, adAsset, Boolean.valueOf(z)};
                                        unit = (Unit) NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -422009747, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 422009748, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                        int i7 = 80 / 0;
                                    } else {
                                        Object[] objArr2 = {this.f$0, adAsset, Boolean.valueOf(z)};
                                        unit = (Unit) NativeAdsView.onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -422009747, objArr2, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 422009748, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
                                    }
                                    int i8 = IAuthTabCallback + 41;
                                    onExtraCallback = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        return unit;
                                    }
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                            });
                            onExtraCallback(adAsset, 1.0f);
                            requestLayout();
                            return;
                        }
                    }
                } else if (onNavigationEvent(adAsset)) {
                }
            }
            onWarmupCompleted(adAsset, z);
            requestLayout();
            return;
        }
        this.onWarmupCompleted = adAsset;
        this.asInterface.iterator();
        throw null;
    }

    private final void onWarmupCompleted(NativeAdsDto.AdAsset adAsset, boolean z) throws Throwable {
        int i = 2 % 2;
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset != null ? adAsset.onExtraCallbackWithResult() : null;
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Normal) {
            onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 884098941, new Object[]{this, adAsset, (NativeAdsDto.Creative.Normal) adAsset.onExtraCallbackWithResult(), Boolean.valueOf(z)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -884098935, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            onExtraCallbackWithResult(this, adAsset, 0.0f, 2, (Object) null);
            return;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Feed) {
            onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -806085614, new Object[]{this, adAsset, (NativeAdsDto.Creative.Feed) adAsset.onExtraCallbackWithResult(), Boolean.valueOf(z)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 806085618, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            onExtraCallbackWithResult(this, adAsset, 0.0f, 2, (Object) null);
            return;
        }
        if (!(!(creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FeedVideo))) {
            int i2 = onActivityLayout + 49;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(adAsset, (NativeAdsDto.Creative.FeedVideo) adAsset.onExtraCallbackWithResult(), z);
            onExtraCallbackWithResult(this, adAsset, 0.0f, 2, (Object) null);
            return;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailBanner) {
            onExtraCallbackWithResult(this, adAsset, (NativeAdsDto.Creative.ThumbnailBanner) adAsset.onExtraCallbackWithResult(), z, (Function0) null, 8, (Object) null);
            onExtraCallback(adAsset, 1.0f);
            return;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailVideo) {
            onExtraCallbackWithResult(this, adAsset, ((NativeAdsDto.Creative.ThumbnailVideo) adAsset.onExtraCallbackWithResult()).IAuthTabCallbackDefault(), z, (Function0) null, 8, (Object) null);
            onExtraCallback(adAsset, 1.0f);
        } else if (!(!(creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.RightBanner))) {
            int i4 = onPostMessage + 5;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback(adAsset, (NativeAdsDto.Creative.RightBanner) adAsset.onExtraCallbackWithResult(), z);
                onExtraCallbackWithResult(this, adAsset, 2.0f, 5, (Object) null);
            } else {
                IAuthTabCallback(adAsset, (NativeAdsDto.Creative.RightBanner) adAsset.onExtraCallbackWithResult(), z);
                onExtraCallbackWithResult(this, adAsset, 0.0f, 2, (Object) null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        deleteProfile deleteprofileAsBinder;
        deleteProfile deleteprofileAsBinder2;
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        int i = 1;
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsDto.Creative.Normal normal = (NativeAdsDto.Creative.Normal) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        boolean zOnTransact = adAsset.onTransact();
        ConstraintLayout constraintLayout = nativeAdsView.onNavigationEvent.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(!zOnTransact ? 0 : 8);
        ConstraintLayout constraintLayout2 = nativeAdsView.onNavigationEvent.asBinder;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (zOnTransact) {
            int i3 = onPostMessage + 97;
            onActivityLayout = i3 % 128;
            if (i3 % 2 == 0) {
                i = 0;
            }
        } else {
            i = 8;
        }
        constraintLayout2.setVisibility(i);
        getTranslateY gettranslatey = nativeAdsView.onNavigationEvent;
        Object obj = zOnTransact ? gettranslatey.asBinder : gettranslatey.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(obj, "");
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{nativeAdsView, obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = onActivityLayout + 75;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        nativeAdsView.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
        nativeAdsView.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        if (zOnTransact) {
            NativeAdsNormalV2View nativeAdsNormalV2View = nativeAdsView.onNavigationEvent.asBinder;
            NativeAdsManager nativeAdsManagerIAuthTabCallbackStub = nativeAdsView.IAuthTabCallbackStub();
            if (nativeAdsManagerIAuthTabCallbackStub == null || (deleteprofileAsBinder2 = nativeAdsManagerIAuthTabCallbackStub.asBinder(nativeAdsView.onActivityResized)) == null) {
                deleteprofileAsBinder2 = deleteProfile.AUTO;
            }
            nativeAdsNormalV2View.setItem(normal, deleteprofileAsBinder2, zBooleanValue, nativeAdsView.ICustomTabsCallback);
            int i6 = onActivityLayout + 105;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        NativeAdsNormalView nativeAdsNormalView = nativeAdsView.onNavigationEvent.onExtraCallback;
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub2 = nativeAdsView.IAuthTabCallbackStub();
        if (nativeAdsManagerIAuthTabCallbackStub2 != null) {
            int i8 = onPostMessage + 25;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            deleteprofileAsBinder = nativeAdsManagerIAuthTabCallbackStub2.asBinder(nativeAdsView.onActivityResized);
            if (deleteprofileAsBinder == null) {
                deleteprofileAsBinder = deleteProfile.AUTO;
                int i10 = onActivityLayout + 85;
                onPostMessage = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        nativeAdsNormalView.setItem(normal, deleteprofileAsBinder, zBooleanValue, nativeAdsView.access000);
        return null;
    }

    private final void IAuthTabCallback(NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.RightBanner rightBanner, boolean z) throws Throwable {
        Object obj;
        int i = 2 % 2;
        boolean zOnTransact = adAsset.onTransact();
        ConstraintLayout constraintLayout = this.onNavigationEvent.asInterface;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i2 = 8;
        constraintLayout.setVisibility(!zOnTransact ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.onNavigationEvent.onTransact;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (zOnTransact) {
            int i3 = onPostMessage + 21;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            i2 = 0;
        }
        constraintLayout2.setVisibility(i2);
        getTranslateY gettranslatey = this.onNavigationEvent;
        if (zOnTransact) {
            obj = gettranslatey.onTransact;
            Intrinsics.checkNotNullExpressionValue(obj, "");
            int i5 = onActivityLayout + 35;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
        } else {
            obj = gettranslatey.asInterface;
            Intrinsics.checkNotNullExpressionValue(obj, "");
        }
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i7 = onActivityLayout + 33;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
        this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        if (!zOnTransact) {
            this.onNavigationEvent.asInterface.setItem(rightBanner, z, this.writeTypedObject);
            return;
        }
        int i9 = onActivityLayout + 123;
        onPostMessage = i9 % 128;
        if (i9 % 2 != 0) {
            this.onNavigationEvent.onTransact.setItem(rightBanner, z, this.extraCallbackWithResult);
        } else {
            this.onNavigationEvent.onTransact.setItem(rightBanner, z, this.extraCallbackWithResult);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if ((!r3) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (r3 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r0 = r1.onNavigationEvent.onExtraCallbackWithResult;
        r2 = r1.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        r2 = r2.asBinder(r1.onActivityResized);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
    
        r2 = o.deleteProfile.AUTO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        r0.setItem(r5, r2, r6, r1.access100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r0 = r1.onNavigationEvent.IAuthTabCallback;
        r2 = r1.IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        r2 = r2.asBinder(r1.onActivityResized);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        r2 = o.deleteProfile.AUTO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        r0.setItem(r5, r2, r6, r1.getInterfaceDescriptor);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        Object obj;
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i2 = 2 % 2;
        int i3 = onPostMessage + 61;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnTransact = adAsset.onTransact();
        ConstraintLayout constraintLayout = nativeAdsView.onNavigationEvent.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (!zOnTransact) {
            i = 0;
        } else {
            int i5 = onPostMessage + 57;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            i = 8;
        }
        constraintLayout.setVisibility(i);
        ConstraintLayout constraintLayout2 = nativeAdsView.onNavigationEvent.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(zOnTransact ? 0 : 8);
        getTranslateY gettranslatey = nativeAdsView.onNavigationEvent;
        Object obj2 = null;
        if (zOnTransact) {
            int i7 = onPostMessage + 67;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(gettranslatey.onExtraCallbackWithResult, "");
                obj2.hashCode();
                throw null;
            }
            obj = gettranslatey.onExtraCallbackWithResult;
        } else {
            obj = gettranslatey.IAuthTabCallback;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "");
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{nativeAdsView, obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i8 = onPostMessage;
        int i9 = i8 + 79;
        onActivityLayout = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 27;
        onActivityLayout = i11 % 128;
        if (i11 % 2 != 0) {
            nativeAdsView.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(true);
            nativeAdsView.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(true);
        } else {
            nativeAdsView.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
            nativeAdsView.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r1
      0x001d: PHI (r1v5 o.calculatePageOffsets) = (r1v4 o.calculatePageOffsets), (r1v6 o.calculatePageOffsets) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        calculatePageOffsets calculatepageoffsetsOnTransact;
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            calculatepageoffsetsOnTransact = nativeAdsView.onTransact();
            int i3 = 66 / 0;
            if (calculatepageoffsetsOnTransact != null) {
                calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnTransact, nativeAdsView.onActivityResized, adAsset, nativeAdsEventLogType, (Function1) null, 8, (Object) null);
            }
        } else {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            calculatepageoffsetsOnTransact = nativeAdsView.onTransact();
            if (calculatepageoffsetsOnTransact != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 97;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        r8 = r16.onNavigationEvent.onWarmupCompleted;
        r9 = r16.onActivityResized;
        r3 = IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r3 = r3.asBinder(r16.onActivityResized);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        r3 = o.deleteProfile.AUTO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        r11 = r3;
        r3 = r17.onWarmupCompleted();
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r3.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        r13.add(im.toss.ads_sdk.model.NativeAdsEventLogType.Companion.onWarmupCompleted((java.lang.String) r3.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        r8.setItem(r9, r18, r11, r19, r13, new im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda13(r16, r17), r16.IAuthTabCallback_Parcel);
        r1 = im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout + 77;
        im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if ((r1 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        r1 = 41 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        r8 = r16.onNavigationEvent.onNavigationEvent;
        r9 = r16.onActivityResized;
        r3 = IAuthTabCallbackStub();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        r3 = r3.asBinder(r16.onActivityResized);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        if (r3 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r3 = o.deleteProfile.AUTO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        r11 = r3;
        r3 = r17.onWarmupCompleted();
        r13 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011b, code lost:
    
        if (r3.hasNext() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011d, code lost:
    
        r4 = im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout + 115;
        im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage = r4 % 128;
        r4 = r4 % 2;
        r13.add(im.toss.ads_sdk.model.NativeAdsEventLogType.Companion.onWarmupCompleted((java.lang.String) r3.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        r8.setItem(r9, r18, r11, r19, r13, new im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda14(r16, r17), r16.IAuthTabCallbackStubProxy);
        r1 = im.toss.ads_sdk.ui.view.NativeAdsView.onActivityLayout + 77;
        im.toss.ads_sdk.ui.view.NativeAdsView.onPostMessage = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014d, code lost:
    
        if ((r1 % 2) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014f, code lost:
    
        r1 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0152, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.FeedVideo feedVideo, boolean z) throws Throwable {
        int i = 2 % 2;
        boolean zOnTransact = adAsset.onTransact();
        ConstraintLayout constraintLayout = this.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        int i2 = 8;
        constraintLayout.setVisibility(!zOnTransact ? 0 : 8);
        ConstraintLayout constraintLayout2 = this.onNavigationEvent.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        if (zOnTransact) {
            int i3 = onActivityLayout + 29;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            i2 = 0;
        }
        constraintLayout2.setVisibility(i2);
        getTranslateY gettranslatey = this.onNavigationEvent;
        Object obj = !(zOnTransact ^ true) ? gettranslatey.onWarmupCompleted : gettranslatey.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(obj, "");
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, obj}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i5 = onPostMessage + 19;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
            this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        } else {
            this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
            this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        calculatePageOffsets calculatepageoffsetsOnTransact = nativeAdsView.onTransact();
        if (calculatepageoffsetsOnTransact != null) {
            int i2 = onActivityLayout + 45;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnTransact, nativeAdsView.onActivityResized, adAsset, nativeAdsEventLogType, (Function1) null, 8, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 39;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, boolean z, Function0 function0, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 3;
        int i4 = i3 % 128;
        onPostMessage = i4;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 116) != 0) {
            int i5 = i4 + 21;
            onActivityLayout = i5 % 128;
            function0 = null;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
        nativeAdsView.onWarmupCompleted(adAsset, thumbnailBanner, z, function0);
        int i6 = onActivityLayout + 3;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[2];
        int i = 2 % 2;
        int i2 = onPostMessage + 7;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            nativeAdsView.onTransact();
            throw null;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        calculatePageOffsets calculatepageoffsetsOnTransact = nativeAdsView.onTransact();
        if (calculatepageoffsetsOnTransact != null) {
            calculatePageOffsets.onExtraCallback(calculatepageoffsetsOnTransact, nativeAdsView.onActivityResized, adAsset, nativeAdsEventLogType, (Function1) null, 8, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onActivityLayout + 99;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[PHI: r2 r7
      0x003a: PHI (r2v24 boolean) = (r2v4 boolean), (r2v25 boolean) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r7v7 im.toss.tds.view.component.widget.TdsRoundLayout) = (r7v1 im.toss.tds.view.component.widget.TdsRoundLayout), (r7v9 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[PHI: r2 r7
      0x0038: PHI (r2v5 boolean) = (r2v4 boolean), (r2v25 boolean) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0038: PHI (r7v2 im.toss.tds.view.component.widget.TdsRoundLayout) = (r7v1 im.toss.tds.view.component.widget.TdsRoundLayout), (r7v9 im.toss.tds.view.component.widget.TdsRoundLayout) binds: [B:8:0x0036, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(final NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner, boolean z, Function0<Unit> function0) throws Throwable {
        boolean zOnTransact;
        TdsRoundLayout tdsRoundLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = onPostMessage + 83;
        onActivityLayout = i3 % 128;
        int i4 = 8;
        if (i3 % 2 != 0) {
            zOnTransact = adAsset.onTransact();
            tdsRoundLayout = this.onNavigationEvent.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            int i5 = 53 / 0;
            if (!(!zOnTransact)) {
                i = 8;
            } else {
                int i6 = onPostMessage + 117;
                onActivityLayout = i6 % 128;
                int i7 = i6 % 2;
                i = 0;
            }
        } else {
            zOnTransact = adAsset.onTransact();
            tdsRoundLayout = this.onNavigationEvent.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
            if (!(!zOnTransact)) {
            }
        }
        tdsRoundLayout.setVisibility(i);
        TdsRoundLayout tdsRoundLayout2 = this.onNavigationEvent.IAuthTabCallbackDefault;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout2, "");
        if (zOnTransact) {
            int i8 = onActivityLayout + 119;
            onPostMessage = i8 % 128;
            int i9 = i8 % 2;
            i4 = 0;
        }
        tdsRoundLayout2.setVisibility(i4);
        this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
        Function1<? super NativeAdsEventLogType, Unit> function1 = new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                Unit unitIAuthTabCallback = NativeAdsView.IAuthTabCallback(this.f$0, adAsset, (NativeAdsEventLogType) obj);
                int i13 = onNavigationEvent + 33;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                return unitIAuthTabCallback;
            }
        };
        if (zOnTransact) {
            NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View = this.onNavigationEvent.IAuthTabCallbackDefault;
            Intrinsics.checkNotNullExpressionValue(nativeAdsThumbnailVideoV2View, "");
            onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, nativeAdsThumbnailVideoV2View}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            this.onNavigationEvent.IAuthTabCallbackDefault.setAdRequestId(this.onActivityResized);
            NativeAdsThumbnailVideoV2View nativeAdsThumbnailVideoV2View2 = this.onNavigationEvent.IAuthTabCallbackDefault;
            List<String> listOnWarmupCompleted = adAsset.onWarmupCompleted();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
            Iterator<T> it = listOnWarmupCompleted.iterator();
            while (it.hasNext()) {
                arrayList.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it.next()));
            }
            nativeAdsThumbnailVideoV2View2.setItem(adAsset, thumbnailBanner, arrayList, function1, function0);
            return;
        }
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView = this.onNavigationEvent.IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(nativeAdsThumbnailVideoView, "");
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, nativeAdsThumbnailVideoView}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
        this.onNavigationEvent.IAuthTabCallbackStub.setAdRequestId(this.onActivityResized);
        NativeAdsThumbnailVideoView nativeAdsThumbnailVideoView2 = this.onNavigationEvent.IAuthTabCallbackStub;
        List<String> listOnWarmupCompleted2 = adAsset.onWarmupCompleted();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted2, 10));
        Iterator<T> it2 = listOnWarmupCompleted2.iterator();
        while (it2.hasNext()) {
            int i10 = onActivityLayout + 31;
            onPostMessage = i10 % 128;
            int i11 = i10 % 2;
            arrayList2.add(NativeAdsEventLogType.Companion.onWarmupCompleted((String) it2.next()));
        }
        nativeAdsThumbnailVideoView2.setItem(adAsset, thumbnailBanner, arrayList2, function1, function0);
        int i12 = onPostMessage + 35;
        onActivityLayout = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        int i4 = onPostMessage + 61;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static /* synthetic */ void onExtraCallbackWithResult(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onPostMessage;
        int i4 = i3 + 13;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 65;
            int i7 = i6 % 128;
            onActivityLayout = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 49;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
            f = 0.99f;
        }
        nativeAdsView.onExtraCallback(adAsset, f);
    }

    private final void onExtraCallback(final NativeAdsDto.AdAsset adAsset, float f) {
        int i = 2 % 2;
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, adAsset))) {
            int i2 = onPostMessage + 125;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(this.onExtraCallback, f)) {
                return;
            }
        }
        this.IAuthTabCallback = adAsset;
        this.onExtraCallback = Float.valueOf(f);
        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
        View root = this.onNavigationEvent.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        View root2 = this.onNavigationEvent.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        getStrokeWidth.onExtraCallback(getstrokewidth, root, false, null, 0, root2, null, 0.0f, f, null, false, 0L, null, null, new Function1() { // from class: im.toss.ads_sdk.ui.view.NativeAdsView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                NativeAdsView nativeAdsView = this.f$0;
                if (i6 == 0) {
                    return NativeAdsView.onExtraCallbackWithResult(nativeAdsView, adAsset, (MotionEvent) obj);
                }
                NativeAdsView.onExtraCallbackWithResult(nativeAdsView, adAsset, (MotionEvent) obj);
                throw null;
            }
        }, 4021, null);
        int i4 = onActivityLayout + 121;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        NativeAdsView nativeAdsView = (NativeAdsView) objArr[0];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 121;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        nativeAdsView.onExtraCallback(adAsset, adAsset.onExtraCallbackWithResult().onWarmupCompleted(), (String) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onPostMessage + 119;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback_Parcel() throws Throwable {
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult;
        int i = 2 % 2;
        NativeAdsDto.AdAsset adAsset = this.onWarmupCompleted;
        if (adAsset != null) {
            int i2 = onActivityLayout + 19;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            creativeOnExtraCallbackWithResult = adAsset.onExtraCallbackWithResult();
        } else {
            creativeOnExtraCallbackWithResult = null;
        }
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FeedVideo) {
            boolean z = true;
            if (!(!onNavigationEvent(this.onWarmupCompleted))) {
                this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
                this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
            } else if (!this.asBinder) {
                int i4 = onActivityLayout + 79;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                if (onExtraCallbackWithResult((View) this)) {
                    int i6 = onPostMessage + 101;
                    onActivityLayout = i6 % 128;
                    int i7 = i6 % 2;
                    if (getVisibility() == 0 && getAlpha() == 1.0f) {
                        int i8 = onActivityLayout + 83;
                        onPostMessage = i8 % 128;
                        int i9 = i8 % 2;
                        NativeAdsDto.AdAsset adAsset2 = this.onWarmupCompleted;
                        if (!Intrinsics.areEqual(adAsset2, adAsset2)) {
                        }
                        if (((Boolean) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -769399176, new Object[]{this, this.onWarmupCompleted}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 769399181, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue()) {
                        }
                    } else {
                        z = false;
                        if (((Boolean) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -769399176, new Object[]{this, this.onWarmupCompleted}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 769399181, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue()) {
                            this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(z);
                            this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(false);
                        } else {
                            this.onNavigationEvent.onNavigationEvent.onExtraCallbackWithResult(false);
                            this.onNavigationEvent.onWarmupCompleted.onExtraCallbackWithResult(z);
                        }
                    }
                }
            }
        }
        if (((Boolean) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -769399176, new Object[]{this, this.onWarmupCompleted}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 769399181, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue()) {
            this.onNavigationEvent.IAuthTabCallbackStub.onNavigationEvent();
            this.onNavigationEvent.IAuthTabCallbackDefault.asBinder();
        } else {
            this.onNavigationEvent.IAuthTabCallbackStub.asBinder();
            this.onNavigationEvent.IAuthTabCallbackDefault.onNavigationEvent();
        }
    }

    private final boolean onNavigationEvent(NativeAdsDto.AdAsset adAsset) {
        NativeAdsManager nativeAdsManagerIAuthTabCallbackStub;
        NativeAdsDto nativeAdsDtoOnNavigationEvent;
        NativeAdsDto.ExtraInfo extraInfoOnTransact;
        NativeAdsDto.Mediation mediationOnNavigationEvent;
        Object next;
        int i = 2 % 2;
        int i2 = onPostMessage + 117;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        if (adAsset == null) {
            int i5 = i3 + 121;
            onPostMessage = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(adAsset.onExtraCallbackWithResult() instanceof NativeAdsDto.Creative.ThumbnailBanner) && !(adAsset.onExtraCallbackWithResult() instanceof NativeAdsDto.Creative.ThumbnailVideo)) {
            int i6 = onActivityLayout + 63;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1533812132, new Object[]{this, adAsset.onExtraCallbackWithResult()}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1533812123, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            if (thumbnailBanner == null) {
                int i8 = onPostMessage + 103;
                onActivityLayout = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!StringsKt.isBlank(thumbnailBanner.getInterfaceDescriptor()) && (nativeAdsManagerIAuthTabCallbackStub = IAuthTabCallbackStub()) != null && (nativeAdsDtoOnNavigationEvent = nativeAdsManagerIAuthTabCallbackStub.onNavigationEvent(this.onActivityResized)) != null && (extraInfoOnTransact = nativeAdsDtoOnNavigationEvent.onTransact()) != null && (mediationOnNavigationEvent = extraInfoOnTransact.onNavigationEvent()) != null) {
                Iterator<T> it = mediationOnNavigationEvent.IAuthTabCallbackDefault().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str = (String) next;
                    if (StringsKt.equals(str, "ADMOB", true)) {
                        break;
                    }
                    int i10 = onPostMessage + 55;
                    onActivityLayout = i10 % 128;
                    int i11 = i10 % 2;
                    if (StringsKt.equals(str, "TOSS", true)) {
                        int i12 = onActivityLayout + 39;
                        onPostMessage = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 77 / 0;
                        }
                    }
                }
                if (StringsKt.equals((String) next, "ADMOB", true)) {
                    int i14 = onActivityLayout + 43;
                    onPostMessage = i14 % 128;
                    int i15 = i14 % 2;
                    NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediationOnNavigationEvent.onExtraCallbackWithResult();
                    if ((admobInfoOnExtraCallbackWithResult != null ? (AdmobAdFormat) NativeAdsDto.AdmobInfo.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1779197038, new Object[]{admobInfoOnExtraCallbackWithResult}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1779197038) : null) == AdmobAdFormat.NATIVE) {
                        int i16 = onPostMessage + 3;
                        onActivityLayout = i16 % 128;
                        int i17 = i16 % 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        NativeAdsDto.Creative creative = (NativeAdsDto.Creative) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 117;
        int i4 = i3 % 128;
        onPostMessage = i4;
        if (i3 % 2 == 0) {
            boolean z = creative instanceof NativeAdsDto.Creative.Normal;
            throw null;
        }
        if (creative instanceof NativeAdsDto.Creative.Normal) {
            NativeAdsDto.Creative.Normal normal = (NativeAdsDto.Creative.Normal) creative;
            return new NativeAdsDto.Creative.ThumbnailBanner(normal.IAuthTabCallback(), normal.asBinder(), normal.asBinder(), (String) null, normal.onWarmupCompleted(), normal.asInterface(), normal.IAuthTabCallbackStub(), (String) null, normal.IAuthTabCallbackDefault(), 136, (DefaultConstructorMarker) null);
        }
        if (creative instanceof NativeAdsDto.Creative.Feed) {
            NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) creative;
            NativeAdsDto.Creative.ThumbnailBanner thumbnailBanner = new NativeAdsDto.Creative.ThumbnailBanner(feed.IAuthTabCallback(), feed.getInterfaceDescriptor(), feed.getInterfaceDescriptor(), (String) null, feed.onWarmupCompleted(), feed.asInterface(), feed.IAuthTabCallbackStub(), feed.asBinder(), feed.onTransact(), 8, (DefaultConstructorMarker) null);
            int i5 = onPostMessage + 65;
            onActivityLayout = i5 % 128;
            if (i5 % 2 == 0) {
                return thumbnailBanner;
            }
            throw null;
        }
        if (creative instanceof NativeAdsDto.Creative.FeedVideo) {
            int i6 = i4 + 33;
            onActivityLayout = i6 % 128;
            int i7 = i6 % 2;
            return ((NativeAdsDto.Creative.FeedVideo) creative).IAuthTabCallback_Parcel();
        }
        if (creative instanceof NativeAdsDto.Creative.ThumbnailBanner) {
            return (NativeAdsDto.Creative.ThumbnailBanner) creative;
        }
        if (!(creative instanceof NativeAdsDto.Creative.ThumbnailVideo)) {
            if (!(creative instanceof NativeAdsDto.Creative.RightBanner)) {
                return null;
            }
            NativeAdsDto.Creative.RightBanner rightBanner = (NativeAdsDto.Creative.RightBanner) creative;
            return new NativeAdsDto.Creative.ThumbnailBanner(rightBanner.IAuthTabCallback(), rightBanner.asBinder(), rightBanner.asBinder(), (String) null, rightBanner.onWarmupCompleted(), rightBanner.asInterface(), rightBanner.IAuthTabCallbackStub(), (String) null, rightBanner.IAuthTabCallbackDefault(), 136, (DefaultConstructorMarker) null);
        }
        int i8 = i2 + 17;
        onPostMessage = i8 % 128;
        if (i8 % 2 != 0) {
            return ((NativeAdsDto.Creative.ThumbnailVideo) creative).IAuthTabCallbackDefault();
        }
        ((NativeAdsDto.Creative.ThumbnailVideo) creative).IAuthTabCallbackDefault();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[1];
        int i = 2 % 2;
        if (adAsset != null) {
            int i2 = onActivityLayout + 103;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            boolean zOnTransact = adAsset.onTransact();
            if (i3 != 0 ? zOnTransact : zOnTransact) {
                int i4 = onActivityLayout + 115;
                onPostMessage = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = onPostMessage + 89;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 61;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
            return;
        }
        setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 81;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        int i5 = onPostMessage + 77;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.RestrictionAllowlist
    public void onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        if (isAttachedToWindow()) {
            int i2 = onActivityLayout + 107;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault();
            IAuthTabCallback_Parcel();
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new getInterfaceDescriptor(this, this));
            int i4 = onActivityLayout + 109;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        int i6 = onActivityLayout + 63;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallback(this);
        asBinder(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.view.View, im.toss.ads_sdk.ui.view.NativeAdsContainerView, im.toss.ads_sdk.ui.view.NativeAdsView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable NativeAdsDto.AdAsset adAsset, boolean z, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) throws Throwable {
        Object obj;
        String str2;
        String str3;
        String str4;
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onPostMessage = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onActivityResized = str;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onActivityResized = str;
        NativeExtension nativeExtensionIAuthTabCallbackStub = adAsset != null ? adAsset.IAuthTabCallbackStub() : null;
        onNavigationEvent(str, adAsset, viewPager2LinearLayoutManagerImpl);
        if (adAsset != null && nativeExtensionIAuthTabCallbackStub != null) {
            int i3 = onPostMessage + 23;
            onActivityLayout = i3 % 128;
            if (i3 % 2 != 0) {
                getOrCreateProfile.onExtraCallback(nativeExtensionIAuthTabCallbackStub.onWarmupCompleted(), viewPager2LinearLayoutManagerImpl);
                throw null;
            }
            getBacktraceNote<onPageScrollStateChanged, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallback = getOrCreateProfile.onExtraCallback(nativeExtensionIAuthTabCallbackStub.onWarmupCompleted(), viewPager2LinearLayoutManagerImpl);
            if (getbacktracenoteOnExtraCallback != null) {
                onWarmupCompleted(adAsset, nativeExtensionIAuthTabCallbackStub, getbacktracenoteOnExtraCallback, viewPager2LinearLayoutManagerImpl, z);
                return;
            }
        }
        onExtraCallback();
        if ((adAsset != null ? adAsset.IAuthTabCallbackStub() : null) != null && (adAsset.onExtraCallbackWithResult() instanceof NativeAdsDto.Creative.None)) {
            int i4 = onPostMessage + 77;
            onActivityLayout = i4 % 128;
            if (i4 % 2 != 0) {
                this.asInterface.iterator();
                throw null;
            }
            Iterator it = this.asInterface.iterator();
            while (it.hasNext()) {
                ((ConstraintLayout) it.next()).setVisibility(8);
            }
            this.onNavigationEvent.getRoot().setOnClickListener(null);
            this.onNavigationEvent.getRoot().setOnTouchListener(null);
            this.IAuthTabCallback = null;
            this.onExtraCallback = null;
            this.onWarmupCompleted = null;
            return;
        }
        boolean zBooleanValue = ((Boolean) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -769399176, new Object[]{this, adAsset}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 769399181, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).booleanValue();
        NativeAdsDto.Creative creativeOnExtraCallbackWithResult = adAsset != null ? adAsset.onExtraCallbackWithResult() : null;
        boolean z2 = true;
        if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Normal) {
            obj = zBooleanValue ? this.onNavigationEvent.asBinder : this.onNavigationEvent.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.Feed) {
            if (zBooleanValue) {
                obj = this.onNavigationEvent.onExtraCallbackWithResult;
                str4 = "feedAdV2";
            } else {
                obj = this.onNavigationEvent.IAuthTabCallback;
                str4 = "feedAd";
            }
            Intrinsics.checkNotNullExpressionValue(obj, str4);
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.FeedVideo) {
            int i5 = onActivityLayout + 17;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            if (zBooleanValue) {
                obj = this.onNavigationEvent.onWarmupCompleted;
                str3 = "feedVideoAdV2";
            } else {
                obj = this.onNavigationEvent.onNavigationEvent;
                str3 = "feedVideoAd";
            }
            Intrinsics.checkNotNullExpressionValue(obj, str3);
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailBanner) {
            int i7 = onPostMessage + 9;
            onActivityLayout = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 25 / 0;
                obj = zBooleanValue ? this.onNavigationEvent.IAuthTabCallbackDefault : this.onNavigationEvent.IAuthTabCallbackStub;
            } else if (zBooleanValue) {
            }
            Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.ThumbnailVideo) {
            obj = zBooleanValue ? this.onNavigationEvent.IAuthTabCallbackDefault : this.onNavigationEvent.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(obj, "");
        } else if (creativeOnExtraCallbackWithResult instanceof NativeAdsDto.Creative.RightBanner) {
            if (!zBooleanValue) {
                obj = this.onNavigationEvent.asInterface;
                str2 = "rightBannerAd";
            } else {
                obj = this.onNavigationEvent.onTransact;
                str2 = "rightBannerAdV2";
            }
            Intrinsics.checkNotNullExpressionValue(obj, str2);
        } else {
            obj = zBooleanValue ? this.onNavigationEvent.asBinder : this.onNavigationEvent.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(obj, "");
        }
        ?? r3 = obj;
        r3.setVisibility(0);
        if (Intrinsics.areEqual(this.extraCallback, (Object) r3)) {
            z2 = false;
        } else if (!Intrinsics.areEqual(this.extraCallback, this.onNavigationEvent.onExtraCallback) && !Intrinsics.areEqual(this.extraCallback, this.onNavigationEvent.asBinder)) {
            int i9 = onPostMessage + 103;
            onActivityLayout = i9 % 128;
            int i10 = i9 % 2;
            if (!Intrinsics.areEqual((Object) r3, this.onNavigationEvent.onExtraCallback) && !Intrinsics.areEqual((Object) r3, this.onNavigationEvent.asBinder) && !Intrinsics.areEqual(this.extraCallback, this.onNavigationEvent.asInterface) && !Intrinsics.areEqual((Object) r3, this.onNavigationEvent.asInterface) && !Intrinsics.areEqual(this.extraCallback, this.onNavigationEvent.onTransact) && !Intrinsics.areEqual((Object) r3, this.onNavigationEvent.onTransact)) {
            }
        }
        this.asBinder = false;
        if (!isAttachedToWindow()) {
            if (!isAttachedToWindow()) {
                addOnAttachStateChangeListener(new IAuthTabCallback_Parcel(this, this, r3, adAsset, z));
                return;
            }
            onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1417380119, new Object[]{this, onNavigationEvent((NativeAdsView) this), r3, adAsset, Boolean.valueOf(z)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1417380107, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            onNavigationEvent(new access100(null));
            return;
        }
        int i11 = onPostMessage + 73;
        onActivityLayout = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        Rally rally = this.IAuthTabCallbackStub;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        this.IAuthTabCallbackStub = null;
        Rally rally2 = this.readTypedObject;
        if (rally2 != null) {
            rally2.ICustomTabsServiceStub();
        }
        this.readTypedObject = null;
        if (z2) {
            this.IAuthTabCallbackStub = IAuthTabCallbackStub(this.extraCallback);
        }
        onExtraCallback(adAsset, z);
        this.extraCallback = r3;
        this.readTypedObject = IAuthTabCallbackDefault(r3);
        onExtraCallbackWithResult();
        if (this.readTypedObject == null) {
            if (!isAttachedToWindow()) {
                addOnAttachStateChangeListener(new IAuthTabCallbackDefault(this, this, r3, adAsset, z));
                return;
            }
            onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1417380119, new Object[]{this, onNavigationEvent((NativeAdsView) this), r3, adAsset, Boolean.valueOf(z)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1417380107, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            onNavigationEvent(new IAuthTabCallbackStubProxy(null));
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsView nativeAdsView, NativeExtension nativeExtension, getBacktraceNote getbacktracenote, NativeAdsDto.AdAsset adAsset, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {nativeAdsView, nativeExtension, getbacktracenote, adAsset, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1467335378, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1467335386, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(View view) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1575659291, new Object[]{view}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1575659281, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, boolean z) {
        Object[] objArr = {nativeAdsView, adAsset, Boolean.valueOf(z)};
        return (Unit) onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -422009747, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 422009748, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsView nativeAdsView, String str) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1583503824, new Object[]{nativeAdsView, str}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1583503831, iIAuthTabCallback2);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(NativeAdsView nativeAdsView, View view, View view2, NativeAdsDto.AdAsset adAsset, boolean z) {
        Object[] objArr = {nativeAdsView, view, view2, adAsset, Boolean.valueOf(z)};
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1417380119, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1417380107, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private final boolean onExtraCallback(NativeAdsDto.AdAsset adAsset) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return ((Boolean) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -769399176, new Object[]{this, adAsset}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 769399181, iIAuthTabCallback2)).booleanValue();
    }

    private final void onTransact(View view) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 14162442, new Object[]{this, view}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -14162431, iIAuthTabCallback2);
    }

    private static final Unit onWarmupCompleted(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, MotionEvent motionEvent) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 524885799, new Object[]{nativeAdsView, adAsset, motionEvent}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -524885799, iIAuthTabCallback2);
    }

    private final void onExtraCallbackWithResult(NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.Feed feed, boolean z) {
        Object[] objArr = {this, adAsset, feed, Boolean.valueOf(z)};
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -806085614, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 806085618, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1190627206, new Object[]{nativeAdsView, adAsset, nativeAdsEventLogType}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1190627208, iIAuthTabCallback2);
    }

    private final void onWarmupCompleted(NativeAdsDto.AdAsset adAsset, NativeAdsDto.Creative.Normal normal, boolean z) {
        Object[] objArr = {this, adAsset, normal, Boolean.valueOf(z)};
        onExtraCallback(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 884098941, objArr, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -884098935, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit asBinder(NativeAdsView nativeAdsView, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -676004221, new Object[]{nativeAdsView, adAsset, nativeAdsEventLogType}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 676004224, iIAuthTabCallback2);
    }

    private final NativeAdsDto.Creative.ThumbnailBanner IAuthTabCallback(NativeAdsDto.Creative creative) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (NativeAdsDto.Creative.ThumbnailBanner) onExtraCallback(iIAuthTabCallback, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1533812132, new Object[]{this, creative}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1533812123, iIAuthTabCallback2);
    }
}
