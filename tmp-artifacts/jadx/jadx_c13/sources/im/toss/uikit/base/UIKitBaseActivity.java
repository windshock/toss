package im.toss.uikit.base;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.tmoney.a;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.uikit.base.UIKitBaseActivity$;
import im.toss.uikit.widget.bridge.BridgeRowV2;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1nSDK4;
import o.AFj1oSDK;
import o.AFj1rSDKExternalSyntheticLambda2;
import o.AFj1rSDKExternalSyntheticLambda4;
import o.AFj1rSDKExternalSyntheticLambda6;
import o.AFj1sSDK5;
import o.ALCFaceEmotion;
import o.AppLovinSdkSdkInitializationListener;
import o.AppSetIdAndScope1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.EncoderImplMediaCodecCallbackExternalSyntheticLambda9;
import o.EncoderImplSurfaceInputExternalSyntheticLambda0;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.L_;
import o.NetConverter3;
import o.RememberLottieCompositionKtloadFontsFromAssets2;
import o.RememberLottieCompositionKtlottieComposition1;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TossBundleLoader_closeServiceActivity;
import o.TossModule_isAllowedByPolicy;
import o.TossModule_postMessage;
import o.clearTid;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.downloadZip;
import o.ea10;
import o.followRedirects;
import o.generateLink;
import o.getAvailableMediatedNetworks;
import o.getIconPaddingLeft;
import o.getRegisteredModules;
import o.initMiniApp;
import o.isFireOS;
import o.makeJpegBase64;
import o.onAppStart;
import o.onVisit;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setBaseURL;
import o.setMessageBytes;
import o.setTopGuideText;
import o.sslSocketFactory;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class UIKitBaseActivity extends AppCompatActivity implements r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, L_, RememberLottieCompositionKtlottieComposition1, AFj1rSDKExternalSyntheticLambda6, getAvailableMediatedNetworks {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int[] ICustomTabsCallback = null;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int onMessageChannelReady = 0;
    private static int onPostMessage = 1;
    private boolean IAuthTabCallbackDefault;
    private final TossBundleLoader_closeServiceActivity IAuthTabCallbackStub;
    private ALCFaceEmotion IAuthTabCallbackStubProxy;
    private TossModule_postMessage IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final sslSocketFactory access100;
    private final Lazy asBinder;
    private SparseArray<Parcelable> asInterface;
    private final boolean getInterfaceDescriptor;
    private final AppLovinSdkSdkInitializationListener onTransact;
    private final Lazy readTypedObject;
    private final Lazy writeTypedObject;

    static {
        ParcelableVolumeInfo();
        Companion = new onNavigationEvent(null);
        int i = onMessageChannelReady + 71;
        onPostMessage = i % 128;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRegisteredModules getregisteredmodules, String str, BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getregisteredmodules, str, bridgeRowV2);
        int i4 = extraCallbackWithResult + 3;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallbackStub(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i4);
        int i11 = (~i4) | i7;
        int i12 = i10 | (~(i11 | i3));
        int i13 = (~(i4 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i5));
        int i15 = i5 + i3 + i + (783392123 * i6) + ((-786872706) * i2);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i5) + 1729888256 + (218870266 * i3) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i) + ((-1731985408) * i6) + ((-471334912) * i2) + ((-600899584) * i16);
        int i18 = (i5 * 375823119) + 1642083618 + (i3 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i * 375824245) + (i6 * (-117547465)) + (i2 * 763984278) + (i16 * (-763691008));
        switch (i17 + (i18 * i18 * 1830354944)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
                int i19 = 2 % 2;
                int i20 = extraCallbackWithResult + 67;
                extraCallback = i20 % 128;
                int i21 = i20 % 2;
                onWarmupCompleted(uIKitBaseActivity, true, null, 2, null);
                Unit unit = Unit.INSTANCE;
                int i22 = extraCallback + 9;
                extraCallbackWithResult = i22 % 128;
                int i23 = i22 % 2;
                return unit;
            case 7:
                return IAuthTabCallbackDefault(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ deserializeUriCollection RatingCompat() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriCollection deserializeuricollectionOnWarmupCompleted = onWarmupCompleted();
        int i4 = extraCallbackWithResult + 21;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeuricollectionOnWarmupCompleted;
    }

    public static /* synthetic */ Unit access100(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        int i4 = extraCallback + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1IAuthTabCallbackDefault = IAuthTabCallbackDefault(uIKitBaseActivity);
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return appSetIdAndScope1IAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 5;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function0);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 9;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1516080246, new Object[]{uIKitBaseActivity}, iIAuthTabCallback, 1516080252, iIAuthTabCallback3);
        int i4 = extraCallback + 35;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(uIKitBaseActivity, intent);
        int i4 = extraCallbackWithResult + 51;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(uIKitBaseActivity);
        int i4 = extraCallback + 57;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(uIKitBaseActivity);
        }
        onTransact(uIKitBaseActivity);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, setBaseURL setbaseurl) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 103;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(uIKitBaseActivity, setbaseurl);
        }
        IAuthTabCallback(uIKitBaseActivity, setbaseurl);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AFj1sSDK5 onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFj1sSDK5 aFj1sSDK5AsBinder = asBinder(uIKitBaseActivity);
        int i4 = extraCallback + 115;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return aFj1sSDK5AsBinder;
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public FragmentActivity getActivity() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public Context getContext() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 125;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public boolean isSplashScreen() {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public /* bridge */ void clearAnimationStore() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.clearAnimationStore();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = extraCallbackWithResult + 21;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ void clearPlayable(@NotNull View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.clearPlayable(view);
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String getBiometricTitle() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return super.getBiometricTitle();
        }
        super.getBiometricTitle();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.L_
    public /* bridge */ AFj1nSDK4 getLogVersion() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AFj1nSDK4 logVersion = super.getLogVersion();
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return logVersion;
    }

    public /* bridge */ isFireOS<?> getPlayable(@NotNull View view) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isFireOS<?> playable = super.getPlayable(view);
        int i4 = extraCallbackWithResult + 109;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return playable;
    }

    public /* bridge */ isFireOS<?> getPlayable(@NotNull View view, long j) {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.getPlayable(view, j);
        }
        super.getPlayable(view, j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ List<isFireOS<?>> getPlayables(@NotNull View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        List<isFireOS<?>> playables = super.getPlayables(view);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return playables;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenHash() {
        int i = 2 % 2;
        int i2 = extraCallback + 63;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String screenHash = super.getScreenHash();
        int i4 = extraCallbackWithResult + 33;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return screenHash;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ String getScreenName() {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String screenName = super.getScreenName();
        int i4 = extraCallbackWithResult + 71;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return screenName;
    }

    @Override // o.L_, o.AFj1oSDKAFa1ySDK
    public /* bridge */ Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        int i4 = extraCallback + 47;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return screenParams;
    }

    @Override // o.L_
    public /* bridge */ void onPrepareTrackViewParams(@NotNull Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPrepareTrackViewParams(map);
        int i4 = extraCallback + 45;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackBottomSheetView() {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackBottomSheetView = super.onTrackBottomSheetView();
        int i4 = extraCallbackWithResult + 55;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnTrackBottomSheetView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackView(boolean z) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView(z);
        int i4 = extraCallback + 115;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnTrackView;
    }

    @Override // o.L_
    public /* bridge */ boolean onTrackViewInternal(boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackViewInternal = super.onTrackViewInternal(z, z2);
        int i4 = extraCallbackWithResult + 13;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnTrackViewInternal;
    }

    public final ALCFaceEmotion RatingCompatStyle() {
        int i = 2 % 2;
        int i2 = extraCallback + 71;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        ALCFaceEmotion aLCFaceEmotion = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 23;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return aLCFaceEmotion;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFj1sSDK5 aFj1sSDK5 = (AFj1sSDK5) uIKitBaseActivity.writeTypedObject.getValue();
        int i4 = extraCallback + 111;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFj1sSDK5;
    }

    private static final AFj1sSDK5 asBinder(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        AFj1sSDK5 aFj1sSDK5 = new AFj1sSDK5(uIKitBaseActivity);
        int i2 = extraCallbackWithResult + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return aFj1sSDK5;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeUriCollection deserializeuricollection = (deserializeUriCollection) uIKitBaseActivity.asBinder.getValue();
        int i4 = extraCallbackWithResult + 73;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeuricollection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deserializeUriCollection onWarmupCompleted() {
        int i = 2 % 2;
        deserializeUriCollection deserializeuricollection = new deserializeUriCollection();
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return deserializeuricollection;
    }

    public UIKitBaseActivity() {
        this.writeTypedObject = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                UIKitBaseActivity uIKitBaseActivity = this.f$0;
                if (i3 == 0) {
                    return UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity);
                }
                UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                deserializeUriCollection deserializeuricollectionRatingCompat;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    deserializeuricollectionRatingCompat = UIKitBaseActivity.RatingCompat();
                    int i3 = 96 / 0;
                } else {
                    deserializeuricollectionRatingCompat = UIKitBaseActivity.RatingCompat();
                }
                int i4 = IAuthTabCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return deserializeuricollectionRatingCompat;
            }
        });
        this.asInterface = new SparseArray<>();
        this.IAuthTabCallbackStub = new TossBundleLoader_closeServiceActivity();
        this.onTransact = new AppLovinSdkSdkInitializationListener();
        this.access100 = new sslSocketFactory();
        this.readTypedObject = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(UIKitBaseActivity.onNavigationEvent(this.f$0));
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        });
        this.access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    UIKitBaseActivity.onExtraCallbackWithResult(this.f$0);
                    throw null;
                }
                AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = UIKitBaseActivity.onExtraCallbackWithResult(this.f$0);
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 74 / 0;
                }
                return appSetIdAndScope1OnExtraCallbackWithResult;
            }
        });
    }

    public UIKitBaseActivity(int i) {
        super(i);
        this.writeTypedObject = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i22 % 128;
                int i3 = i22 % 2;
                UIKitBaseActivity uIKitBaseActivity = this.f$0;
                if (i3 == 0) {
                    return UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity);
                }
                UIKitBaseActivity.onWarmupCompleted(uIKitBaseActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                deserializeUriCollection deserializeuricollectionRatingCompat;
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 43;
                onWarmupCompleted = i22 % 128;
                if (i22 % 2 != 0) {
                    deserializeuricollectionRatingCompat = UIKitBaseActivity.RatingCompat();
                    int i3 = 96 / 0;
                } else {
                    deserializeuricollectionRatingCompat = UIKitBaseActivity.RatingCompat();
                }
                int i4 = IAuthTabCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return deserializeuricollectionRatingCompat;
            }
        });
        this.asInterface = new SparseArray<>();
        this.IAuthTabCallbackStub = new TossBundleLoader_closeServiceActivity();
        this.onTransact = new AppLovinSdkSdkInitializationListener();
        this.access100 = new sslSocketFactory();
        this.readTypedObject = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda6
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 11;
                onWarmupCompleted = i22 % 128;
                int i3 = i22 % 2;
                Boolean boolValueOf = Boolean.valueOf(UIKitBaseActivity.onNavigationEvent(this.f$0));
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolValueOf;
                }
                throw null;
            }
        });
        this.access000 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i22 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i22 % 128;
                if (i22 % 2 == 0) {
                    UIKitBaseActivity.onExtraCallbackWithResult(this.f$0);
                    throw null;
                }
                AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = UIKitBaseActivity.onExtraCallbackWithResult(this.f$0);
                int i3 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 74 / 0;
                }
                return appSetIdAndScope1OnExtraCallbackWithResult;
            }
        });
    }

    public AppLovinSdkSdkInitializationListener getAnimationStore() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 67;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkSdkInitializationListener appLovinSdkSdkInitializationListener = this.onTransact;
        int i5 = i2 + 111;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return appLovinSdkSdkInitializationListener;
    }

    public sslSocketFactory getScrollTriggerStore() {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        sslSocketFactory sslsocketfactory = this.access100;
        int i5 = i3 + 3;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return sslsocketfactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.L_
    public String getReferrerParam() throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object[] objArr = new Object[1];
        g(new int[]{1328140292, 1271568998, -1566593989, 1241817662}, 8 - View.resolveSize(0, 0), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = extraCallbackWithResult + 89;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        TossModule_postMessage tossModule_postMessage = uIKitBaseActivity.IAuthTabCallback_Parcel;
        int i5 = i3 + 29;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return tossModule_postMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean asInterface(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        extraCallback = i2 % 128;
        boolean z = uIKitBaseActivity instanceof initMiniApp;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return z;
    }

    public boolean ao_() {
        int i = 2 % 2;
        int i2 = extraCallback + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.readTypedObject.getValue()).booleanValue();
        int i4 = extraCallback + 83;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public View getView() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.content);
        int i4 = extraCallback + 95;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return viewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void addSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        ((deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback, -9217141, iIAuthTabCallback3)).onNavigationEvent(deserializeurinullablecollection);
        int i4 = extraCallback + 125;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void removeSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            ((deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback, -9217141, iIAuthTabCallback3)).onExtraCallbackWithResult(deserializeurinullablecollection);
            return;
        }
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback5 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback6 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        ((deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback5, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback4, -9217141, iIAuthTabCallback6)).onExtraCallbackWithResult(deserializeurinullablecollection);
        throw null;
    }

    public final void onNavigationEvent(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        addSubscription(deserializeurinullablecollection);
        int i4 = extraCallbackWithResult + 25;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 113;
        extraCallback = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                ((deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback, -9217141, iIAuthTabCallback3)).dispose();
                int i3 = 81 / 0;
            } else {
                int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback5 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback6 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                ((deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback5, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback4, -9217141, iIAuthTabCallback6)).dispose();
            }
            int i4 = extraCallback + 15;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    private static void g(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ICustomTabsCallback;
        char c = '0';
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 49;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 72, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i3++;
                    c = '0';
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallback;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $11 + 109;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 72, 8849 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i6 = 0;
                    i8 = 0;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), 72 - (KeyEvent.getMaxKeyCode() >> 16), 8848 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i8++;
                    i6 = 0;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 49;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 22252), View.MeasureSpec.makeMeasureSpec(0, 0) + 39, 10300 - ImageFormat.getBitsPerPixel(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
                int i14 = $10 + 31;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4034), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 78, Color.blue(0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        ALCFaceEmotion aLCFaceEmotion;
        boolean z;
        Object objOnTransact$128544c1;
        View rootView;
        ALCFaceEmotion aLCFaceEmotion2;
        int i = 2 % 2;
        RememberLottieCompositionKtloadFontsFromAssets2 application = getApplication();
        Intrinsics.checkNotNull(application, "");
        RememberLottieCompositionKtloadFontsFromAssets2 rememberLottieCompositionKtloadFontsFromAssets2 = application;
        if (!isSplashScreen()) {
            aLCFaceEmotion = new ALCFaceEmotion(onVisit.IAuthTabCallback(this));
            if (rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel().onExtraCallback()) {
                ALCFaceEmotion.onNavigationEvent(rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel(), onVisit.IAuthTabCallback(this) + ".init", true, 0L, 4, (Object) null);
                if (rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel().onNavigationEvent() < 8000) {
                    int i2 = extraCallbackWithResult + 3;
                    extraCallback = i2 % 128;
                    int i3 = i2 % 2;
                    rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel().onWarmupCompleted(aLCFaceEmotion);
                }
            }
        } else {
            if (rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel().onExtraCallback()) {
                aLCFaceEmotion = rememberLottieCompositionKtloadFontsFromAssets2.IPostMessageService_Parcel();
                int i4 = extraCallback + 67;
                extraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                this.IAuthTabCallbackStubProxy = aLCFaceEmotion;
                followRedirects.onExtraCallbackWithResult.onNavigationEvent(this);
                super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
                if (bundle != null) {
                    int i6 = extraCallbackWithResult + 7;
                    extraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else {
                    z = true;
                }
                this.IAuthTabCallbackDefault = z;
                objOnTransact$128544c1 = rememberLottieCompositionKtloadFontsFromAssets2.onTransact$128544c1();
                if (objOnTransact$128544c1 != null) {
                    try {
                        Object[] objArr = {this, getClass()};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(786135490);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 18, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6567, 530286418, false, "onNavigationEvent", new Class[]{Context.class, Class.class});
                        }
                        ((Method) objOnExtraCallback).invoke(objOnTransact$128544c1, objArr);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                rootView = getWindow().getDecorView().getRootView();
                if (rootView != null) {
                    ((AFj1sSDK5) IAuthTabCallbackStub(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1240113979, new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1240113986, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).onExtraCallback(this, rootView, this.IAuthTabCallbackStubProxy);
                }
                writeTypedObject();
                aLCFaceEmotion2 = this.IAuthTabCallbackStubProxy;
                if (aLCFaceEmotion2 == null) {
                    ALCFaceEmotion.onNavigationEvent(aLCFaceEmotion2, onVisit.IAuthTabCallback(this) + ".onCreate", false, 0L, 6, (Object) null);
                    return;
                }
                return;
            }
            aLCFaceEmotion = new ALCFaceEmotion(onVisit.IAuthTabCallback(this));
            int i8 = extraCallbackWithResult + 107;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        ALCFaceEmotion.onExtraCallbackWithResult(aLCFaceEmotion, 0L, 1, (Object) null);
        int i10 = extraCallbackWithResult + 43;
        extraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 3 % 4;
        }
        this.IAuthTabCallbackStubProxy = aLCFaceEmotion;
        followRedirects.onExtraCallbackWithResult.onNavigationEvent(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        if (bundle != null) {
        }
        this.IAuthTabCallbackDefault = z;
        objOnTransact$128544c1 = rememberLottieCompositionKtloadFontsFromAssets2.onTransact$128544c1();
        if (objOnTransact$128544c1 != null) {
        }
        rootView = getWindow().getDecorView().getRootView();
        if (rootView != null) {
        }
        writeTypedObject();
        aLCFaceEmotion2 = this.IAuthTabCallbackStubProxy;
        if (aLCFaceEmotion2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, setBaseURL setbaseurl) throws Throwable {
        int i = 2 % 2;
        TdsToastV1.onNavigationEvent onnavigationeventOnExtraCallback = BrickModulePackageExternalSyntheticLambda0.onExtraCallback(setbaseurl.onWarmupCompleted(), uIKitBaseActivity);
        TdsToastV1 tdsToastV1OnWarmupCompleted = null;
        if (uIKitBaseActivity.isFinishing()) {
            int i2 = extraCallback + 23;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        int iOnNavigationEvent = setbaseurl.onNavigationEvent();
        if (iOnNavigationEvent == 0) {
            if (!onnavigationeventOnExtraCallback.asBinder()) {
                int i3 = extraCallback + 89;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                View viewRatingCompatApi19Impl = uIKitBaseActivity.RatingCompatApi19Impl();
                if (viewRatingCompatApi19Impl != null && viewRatingCompatApi19Impl.getId() != 16908290) {
                    onnavigationeventOnExtraCallback.onNavigationEvent(viewRatingCompatApi19Impl);
                }
            }
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            tdsToastV1OnWarmupCompleted = (TdsToastV1) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), -950699249, iOnWarmupCompleted3, iOnWarmupCompleted2, new Object[]{onnavigationeventOnExtraCallback}, 950699257, iOnWarmupCompleted);
        } else if (iOnNavigationEvent != 1) {
            int i5 = extraCallback + 115;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                tdsToastV1OnWarmupCompleted.hashCode();
                throw null;
            }
        } else {
            tdsToastV1OnWarmupCompleted = onnavigationeventOnExtraCallback.onWarmupCompleted();
        }
        if (setbaseurl.onExtraCallbackWithResult() != null && tdsToastV1OnWarmupCompleted != null) {
            tdsToastV1OnWarmupCompleted.asBinder(setbaseurl.onExtraCallbackWithResult().intValue());
            int i6 = extraCallback + 81;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        if (tdsToastV1OnWarmupCompleted != null) {
            int i8 = extraCallback + 9;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            tdsToastV1OnWarmupCompleted.IAuthTabCallback_Parcel();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 13;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void writeTypedObject() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onExtraCallback(setBaseURL.class).onExtraCallback(clearTid.onExtraCallback()).onWarmupCompleted(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        onNavigationEvent(setMessageBytes.onNavigationEvent(jsonReaderUnknownNumberParsingOnWarmupCompleted, new UIKitBaseActivity$.ExternalSyntheticLambda9(), null, new UIKitBaseActivity$.ExternalSyntheticLambda10(this), 2, null));
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
    }

    public View RatingCompatApi19Impl() {
        View viewFindViewById;
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            viewFindViewById = findViewById(R.id.content);
            int i3 = 71 / 0;
        } else {
            viewFindViewById = findViewById(R.id.content);
        }
        int i4 = extraCallback + 123;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRequestedOrientation(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 9;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT != 26) {
            super/*android.app.Activity*/.setRequestedOrientation(i);
        }
        int i5 = extraCallback + 17;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.L_
    public boolean onTrackView() {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTrackView = super.onTrackView();
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return zOnTrackView;
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onStart();
            AFj1oSDK.onExtraCallbackWithResult.onNavigationEvent(this);
            onTrackView();
            if (!(!(this instanceof initMiniApp))) {
                int i3 = extraCallbackWithResult + 39;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
                ((initMiniApp) this).onGreatestScrollPercentageIncreased();
            }
            int i5 = extraCallback + 81;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.onStart();
        AFj1oSDK.onExtraCallbackWithResult.onNavigationEvent(this);
        onTrackView();
        boolean z = this instanceof initMiniApp;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*androidx.fragment.app.FragmentActivity*/.onResume();
            followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
            Resources resourcesOnExtraCallback = followredirects.onExtraCallback();
            if (resourcesOnExtraCallback != null) {
                boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resourcesOnExtraCallback);
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                if (zIAuthTabCallback != generateLink.IAuthTabCallback(resources)) {
                    followredirects.onNavigationEvent(this);
                    int i3 = extraCallback + 103;
                    extraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (!(!MediaSessionCompatQueueItem())) {
                int i5 = extraCallback + 15;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                onWarmupCompleted(this, false, null, 2, null);
            }
            int i7 = extraCallbackWithResult + 113;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        followRedirects.onExtraCallbackWithResult.onExtraCallback();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPostCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Activity*/.onPostCreate(bundle, persistableBundle);
        int i4 = extraCallbackWithResult + 75;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = this instanceof initMiniApp;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this instanceof initMiniApp) {
            ((initMiniApp) this).writeTypedList();
        }
        super.onStop();
        int i3 = extraCallbackWithResult + 87;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 29;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this instanceof initMiniApp) {
            int i5 = i2 + 23;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            ((initMiniApp) this).IEngagementSignalsCallback();
        }
        access000();
        clearAnimationStore();
        super.onDestroy();
        int i7 = extraCallbackWithResult + 69;
        extraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public void putInstanceStateData(int i, @Nullable Parcelable parcelable) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 39;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            this.asInterface.put(i, parcelable);
            throw null;
        }
        this.asInterface.put(i, parcelable);
        int i4 = extraCallbackWithResult + 95;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ
    public Parcelable getInstanceStateData(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 35;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Parcelable parcelable = this.asInterface.get(i);
        int i5 = extraCallbackWithResult + 79;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return parcelable;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*android.app.Activity*/.onRestoreInstanceState(bundle);
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("ActivityInstanceStateData");
        if (sparseParcelableArray == null) {
            sparseParcelableArray = new SparseArray<>();
            int i2 = extraCallbackWithResult + 1;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        this.asInterface = sparseParcelableArray;
        int i4 = extraCallbackWithResult + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[PHI: r3 r4
      0x003f: PHI (r3v5 android.view.MenuItem) = (r3v4 android.view.MenuItem), (r3v14 android.view.MenuItem) binds: [B:15:0x003d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r4v2 android.graphics.drawable.Drawable) = (r4v1 android.graphics.drawable.Drawable), (r4v3 android.graphics.drawable.Drawable) binds: [B:15:0x003d, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        MenuItem item;
        Drawable icon;
        int i = 2 % 2;
        if (menu != null) {
            int size = menu.size();
            int i2 = extraCallback + 89;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            }
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = extraCallbackWithResult + 31;
                extraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    item = menu.getItem(i4);
                    icon = item.getIcon();
                    int i6 = 80 / 0;
                    if (icon != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (item.getIconTintList() == null) {
                                int i7 = extraCallback + 109;
                                extraCallbackWithResult = i7 % 128;
                                int i8 = i7 % 2;
                                icon.setColorFilter(EncoderImplSurfaceInputExternalSyntheticLambda0.IAuthTabCallback(ContextCompat.getColor(this, im.toss.tds.R.color.grey_400), EncoderImplMediaCodecCallbackExternalSyntheticLambda9.SRC_IN));
                            }
                        } else if (icon.getColorFilter() == null) {
                            icon.setColorFilter(EncoderImplSurfaceInputExternalSyntheticLambda0.IAuthTabCallback(ContextCompat.getColor(this, im.toss.tds.R.color.grey_400), EncoderImplMediaCodecCallbackExternalSyntheticLambda9.SRC_IN));
                        }
                    }
                } else {
                    item = menu.getItem(i4);
                    icon = item.getIcon();
                    if (icon != null) {
                    }
                }
            }
        }
        return super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallback + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putSparseParcelableArray("ActivityInstanceStateData", this.asInterface);
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        int i4 = extraCallbackWithResult + 21;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = extraCallback + 43;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        if (!(!(this instanceof WebViewContentOwner))) {
            setTopGuideText.onWarmupCompleted.onExtraCallbackWithResult((WebViewContentOwner) this, i, i2, intent);
            int i6 = extraCallback + 81;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onEnterAnimationComplete() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Activity*/.onEnterAnimationComplete();
        this.IAuthTabCallbackStub.onWarmupCompleted();
        int i4 = extraCallbackWithResult + 9;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final AppSetIdAndScope1 RatingCompatStarStyle() {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Object value = this.access000.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (AppSetIdAndScope1) value;
        }
        Object value2 = this.access000.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        throw null;
    }

    private static final AppSetIdAndScope1 IAuthTabCallbackDefault(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult(onVisit.IAuthTabCallback(uIKitBaseActivity));
        int i4 = extraCallbackWithResult + 27;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1OnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public void onFirstGlobalLayout() throws Throwable {
        int i = 2 % 2;
        if (!this.IAuthTabCallbackDefault) {
            int i2 = extraCallback + 91;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(getIntent());
        }
        int i4 = extraCallback + 103;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AFj1rSDKExternalSyntheticLambda6
    public void onUiLaunchTime(@NotNull ALCFaceEmotion aLCFaceEmotion) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aLCFaceEmotion, "");
            isSplashScreen();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aLCFaceEmotion, "");
        if (!isSplashScreen()) {
            int i3 = extraCallbackWithResult + 83;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            AFj1rSDKExternalSyntheticLambda4 aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult = AFj1rSDKExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            String strIAuthTabCallback = onVisit.IAuthTabCallback(this);
            String screenName = getScreenName();
            boolean zMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
            boolean zExtraCallbackWithResult = extraCallbackWithResult();
            Boolean boolOnExtraCallbackWithResult = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallbackWithResult();
            long jOnExtraCallback = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback();
            long jOnNavigationEvent = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onNavigationEvent();
            long jOnWarmupCompleted = aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.onWarmupCompleted();
            downloadZip downloadzipOnExtraCallbackWithResult = aLCFaceEmotion.onExtraCallbackWithResult(strIAuthTabCallback, screenName, Boolean.valueOf(zMediaSessionCompatResultReceiverWrapper), boolOnExtraCallbackWithResult, zExtraCallbackWithResult, Long.valueOf(jOnExtraCallback), Long.valueOf(jOnNavigationEvent), Long.valueOf(jOnWarmupCompleted), aFj1rSDKExternalSyntheticLambda4OnExtraCallbackWithResult.IAuthTabCallback());
            if (downloadzipOnExtraCallbackWithResult != null) {
                int i5 = extraCallback + 23;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
                ((Boolean) downloadZip.onWarmupCompleted(iOnNavigationEvent2, 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, new Object[]{downloadzipOnExtraCallbackWithResult}, iOnNavigationEvent3)).booleanValue();
            }
        }
        onAppStart.IAuthTabCallback(this);
    }

    public boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        int i3 = i2 % 128;
        extraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.getInterfaceDescriptor;
        int i4 = i3 + 53;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ALCFaceEmotion aLCFaceEmotion = this.IAuthTabCallbackStubProxy;
        if (aLCFaceEmotion == null) {
            return false;
        }
        List listOnWarmupCompleted = aLCFaceEmotion.onWarmupCompleted();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator it = listOnWarmupCompleted.iterator();
        while (!(!it.hasNext())) {
            int i3 = extraCallback + 5;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(((makeJpegBase64) it.next()).onExtraCallbackWithResult());
        }
        return arrayList.contains("App.onCreate");
    }

    private static final void IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        uIKitBaseActivity.IAuthTabCallbackDefault = false;
        uIKitBaseActivity.onNavigationEvent(intent);
        int i4 = extraCallbackWithResult + 19;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNewIntent(@NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = NetConverter3.onExtraCallback().onNavigationEvent(new UIKitBaseActivity$.ExternalSyntheticLambda8(this, intent), 1500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        setToolbar(findViewById(im.toss.core.R.id.toolbar));
        int i4 = extraCallbackWithResult + 123;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setToolbar(@Nullable View view) {
        initMiniApp initminiapp;
        int i = 2 % 2;
        int i2 = extraCallback + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (view != null) {
            setSupportActionBar((Toolbar) view);
            if (ao_()) {
                if (this instanceof initMiniApp) {
                    initminiapp = (initMiniApp) this;
                    int i4 = extraCallbackWithResult + 45;
                    extraCallback = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    initminiapp = null;
                }
                IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    this.IAuthTabCallback_Parcel = new TossModule_postMessage(this, initminiapp, supportActionBar);
                }
            }
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (uIKitBaseActivity.ao_()) {
            int i2 = extraCallbackWithResult + 7;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                TossModule_postMessage tossModule_postMessage = uIKitBaseActivity.IAuthTabCallback_Parcel;
                obj.hashCode();
                throw null;
            }
            TossModule_postMessage tossModule_postMessage2 = uIKitBaseActivity.IAuthTabCallback_Parcel;
            if (tossModule_postMessage2 != null) {
                tossModule_postMessage2.onExtraCallbackWithResult(str);
                return null;
            }
        } else {
            IPostMessageServiceStubProxy supportActionBar = uIKitBaseActivity.getSupportActionBar();
            if (supportActionBar != null) {
                int i3 = extraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                supportActionBar.onExtraCallbackWithResult(str);
                if (i4 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 59;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (!ao_()) {
            super/*android.app.Activity*/.setTitle(i);
            return;
        }
        int i5 = extraCallback + 47;
        int i6 = i5 % 128;
        extraCallbackWithResult = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        TossModule_postMessage tossModule_postMessage = this.IAuthTabCallback_Parcel;
        if (tossModule_postMessage != null) {
            int i7 = i6 + 15;
            extraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                String string = getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "");
                tossModule_postMessage.onExtraCallbackWithResult(string);
            } else {
                String string2 = getString(i);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                tossModule_postMessage.onExtraCallbackWithResult(string2);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r4.IAuthTabCallback_Parcel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r2 = im.toss.uikit.base.UIKitBaseActivity.extraCallbackWithResult + 79;
        im.toss.uikit.base.UIKitBaseActivity.extraCallback = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((r2 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r1.onExtraCallbackWithResult(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1.onExtraCallbackWithResult(r5);
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        super/*android.app.Activity*\/.setTitle(r5);
        r5 = im.toss.uikit.base.UIKitBaseActivity.extraCallback + 113;
        im.toss.uikit.base.UIKitBaseActivity.extraCallbackWithResult = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (ao_() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if ((!ao_()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[PHI: r1
      0x0048: PHI (r1v3 o.TossModule_postMessage) = (r1v2 o.TossModule_postMessage), (r1v4 o.TossModule_postMessage) binds: [B:14:0x0046, B:11:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossModule_postMessage tossModule_postMessage;
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        String str = (String) objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!uIKitBaseActivity.ao_()) {
            uIKitBaseActivity.RatingCompatStarStyle();
            int i2 = extraCallbackWithResult + 57;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return null;
        }
        int i4 = extraCallbackWithResult + 91;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            tossModule_postMessage = uIKitBaseActivity.IAuthTabCallback_Parcel;
            int i5 = 4 / 0;
            if (tossModule_postMessage != null) {
                tossModule_postMessage.onWarmupCompleted(str, function0);
            }
        } else {
            tossModule_postMessage = uIKitBaseActivity.IAuthTabCallback_Parcel;
            if (tossModule_postMessage != null) {
            }
        }
        return null;
    }

    private static final Triple<Boolean, String, String> onWarmupCompleted(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Uri uri = Uri.parse(str4);
            if (uri.isOpaque()) {
                return null;
            }
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                queryParameter = "false";
            }
            boolean z = Boolean.parseBoolean(queryParameter);
            String queryParameter2 = uri.getQueryParameter(str2);
            if (queryParameter2 == null) {
                return null;
            }
            Triple<Boolean, String, String> triple = new Triple<>(Boolean.valueOf(z), queryParameter2, uri.getQueryParameter(str3));
            int i3 = extraCallback + 3;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return triple;
        }
        Uri.parse(str4).isOpaque();
        throw null;
    }

    private static final Triple<Boolean, String, String> IAuthTabCallback(String str, String str2, String str3, Intent intent) {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean z = Boolean.parseBoolean(intent.getStringExtra(str));
        String stringExtra = intent.getStringExtra(str2);
        Object obj = null;
        if (stringExtra == null) {
            return null;
        }
        Triple<Boolean, String, String> triple = new Triple<>(Boolean.valueOf(z), stringExtra, intent.getStringExtra(str3));
        int i4 = extraCallbackWithResult + 85;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return triple;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Intent intent) throws Throwable {
        String str;
        boolean z;
        Triple<Boolean, String, String> tripleIAuthTabCallback;
        int i = 2 % 2;
        if (intent == null || isFinishing()) {
            return;
        }
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (isSplashScreen()) {
            return;
        }
        Object[] objArr = new Object[1];
        g(new int[]{1878972312, 207550614}, 3 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        if (stringExtra == null) {
            int i4 = extraCallbackWithResult + 95;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str = stringExtra;
        }
        if (str.length() > 0) {
            int i6 = extraCallback + 63;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        String stringExtra2 = intent.getStringExtra("schemeUri");
        if (stringExtra2 != null) {
            stringExtra = stringExtra2;
        }
        if (stringExtra != null) {
            int i8 = extraCallback + 15;
            extraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (stringExtra.length() > 0) {
                int i10 = extraCallback + 91;
                extraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    g(new int[]{1388231985, -1180302730, -811673467, 1684603161, 1388440786, 1881120963}, 46 / ((Process.getThreadPriority(0) - 92) >> 39), objArr2);
                    tripleIAuthTabCallback = onWarmupCompleted(((String) objArr2[0]).intern(), "bridgeType", "bridgeMessage", stringExtra);
                    if (tripleIAuthTabCallback == null) {
                        Object[] objArr3 = new Object[1];
                        g(new int[]{1388231985, -1180302730, -811673467, 1684603161, 1388440786, 1881120963}, 10 - Gravity.getAbsoluteGravity(0, 0), objArr3);
                        tripleIAuthTabCallback = IAuthTabCallback(((String) objArr3[0]).intern(), "bridgeType", "bridgeMessage", intent);
                        if (tripleIAuthTabCallback == null) {
                            return;
                        }
                    }
                } else {
                    Object[] objArr4 = new Object[1];
                    g(new int[]{1388231985, -1180302730, -811673467, 1684603161, 1388440786, 1881120963}, ((Process.getThreadPriority(0) + 20) >> 6) + 10, objArr4);
                    tripleIAuthTabCallback = onWarmupCompleted(((String) objArr4[0]).intern(), "bridgeType", "bridgeMessage", stringExtra);
                    if (tripleIAuthTabCallback == null) {
                    }
                }
            } else {
                Object[] objArr5 = new Object[1];
                g(new int[]{1388231985, -1180302730, -811673467, 1684603161, 1388440786, 1881120963}, 10 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
                tripleIAuthTabCallback = IAuthTabCallback(((String) objArr5[0]).intern(), "bridgeType", "bridgeMessage", intent);
                if (tripleIAuthTabCallback == null) {
                    return;
                }
            }
        }
        boolean zBooleanValue = tripleIAuthTabCallback.getFirst().booleanValue();
        String second = tripleIAuthTabCallback.getSecond();
        String third = tripleIAuthTabCallback.getThird();
        if (zBooleanValue) {
            int i11 = extraCallback + 5;
            extraCallbackWithResult = i11 % 128;
            if (i11 % 2 == 0) {
                IAuthTabCallback(getRegisteredModules.Companion.IAuthTabCallback(second), third, z ? 5000L : 2000L, (Function0<Unit>) new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 45;
                        IAuthTabCallback = i13 % 128;
                        Object obj = null;
                        if (i13 % 2 != 0) {
                            Object[] objArr6 = {this.f$0};
                            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                            obj.hashCode();
                            throw null;
                        }
                        Object[] objArr7 = {this.f$0};
                        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                        Unit unit = (Unit) UIKitBaseActivity.IAuthTabCallbackStub(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1895079136, objArr7, iIAuthTabCallback2, -1895079135, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                        int i14 = onExtraCallback + 105;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            return unit;
                        }
                        throw null;
                    }
                });
            } else {
                getRegisteredModules.Companion.IAuthTabCallback(second);
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 115;
        extraCallbackWithResult = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideBridge");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        uIKitBaseActivity.onExtraCallbackWithResult(z, (Function0<Unit>) function0);
        int i4 = extraCallbackWithResult + 63;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r3.IAuthTabCallbackStub.IAuthTabCallback(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (MediaSessionCompatQueueItem() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (MediaSessionCompatQueueItem() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r4 = im.toss.uikit.base.UIKitBaseActivity.extraCallbackWithResult + 99;
        im.toss.uikit.base.UIKitBaseActivity.extraCallback = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(boolean z, @Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
    }

    public final boolean MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = extraCallback + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackStub.onExtraCallback();
            throw null;
        }
        boolean zOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
        int i3 = extraCallbackWithResult + 93;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallback;
    }

    public final void IAuthTabCallback(@NotNull final getRegisteredModules getregisteredmodules, @Nullable final String str, long j, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getregisteredmodules, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onExtraCallback(new Function0() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                BridgeRowV2 bridgeRowV2 = (BridgeRowV2) UIKitBaseActivity.IAuthTabCallbackStub(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 976528829, objArr, iIAuthTabCallback, -976528825, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                int i5 = IAuthTabCallback + 71;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return bridgeRowV2;
            }
        }, new Function1() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = UIKitBaseActivity.IAuthTabCallback(getregisteredmodules, str, (BridgeRowV2) obj);
                int i5 = onWarmupCompleted + 49;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return unitIAuthTabCallback;
            }
        }, function0, j);
        int i2 = extraCallbackWithResult + 75;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final BridgeRowV2 onTransact(UIKitBaseActivity uIKitBaseActivity) {
        int i = 2 % 2;
        BridgeRowV2 bridgeRowV2 = new BridgeRowV2(uIKitBaseActivity, null, 0, 6, null);
        int i2 = extraCallbackWithResult + 93;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return bridgeRowV2;
    }

    private static final Unit onWarmupCompleted(getRegisteredModules getregisteredmodules, String str, BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bridgeRowV2, "");
        bridgeRowV2.setTossCommunityBridge(getregisteredmodules, str);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 27;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends TossModule_isAllowedByPolicy> void onExtraCallback(Function0<? extends T> function0, Function1<? super T, Unit> function1, final Function0<Unit> function02, long j) {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStub.onExtraCallback()) {
            return;
        }
        int i2 = extraCallback + 83;
        extraCallbackWithResult = i2 % 128;
        ViewGroup viewGroup = null;
        if (i2 % 2 != 0) {
            boolean z = getWindow().getDecorView().getRootView() instanceof ViewGroup;
            throw null;
        }
        View rootView = getWindow().getDecorView().getRootView();
        if (rootView instanceof ViewGroup) {
            int i3 = extraCallbackWithResult + 47;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            viewGroup = (ViewGroup) rootView;
        }
        if (viewGroup == null) {
            return;
        }
        this.IAuthTabCallbackStub.IAuthTabCallback(viewGroup);
        T tInvoke = function0.invoke();
        this.IAuthTabCallbackStub.onExtraCallback(tInvoke);
        function1.invoke(tInvoke);
        viewGroup.addView(tInvoke.IAuthTabCallback());
        this.IAuthTabCallbackStub.onExtraCallback(new Runnable() { // from class: im.toss.uikit.base.UIKitBaseActivity$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 67;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                UIKitBaseActivity.onExtraCallbackWithResult(function02);
                int i8 = onExtraCallback + 99;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }
        }, j);
        int i5 = extraCallback + 35;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1895079136, new Object[]{uIKitBaseActivity}, iIAuthTabCallback, -1895079135, iIAuthTabCallback3);
    }

    public static /* synthetic */ BridgeRowV2 IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (BridgeRowV2) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 976528829, new Object[]{uIKitBaseActivity}, iIAuthTabCallback, -976528825, iIAuthTabCallback3);
    }

    private static final Unit IAuthTabCallbackStub(UIKitBaseActivity uIKitBaseActivity) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1516080246, new Object[]{uIKitBaseActivity}, iIAuthTabCallback, 1516080252, iIAuthTabCallback3);
    }

    private final deserializeUriCollection IAuthTabCallbackStubProxy() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (deserializeUriCollection) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9217141, new Object[]{this}, iIAuthTabCallback, -9217141, iIAuthTabCallback3);
    }

    private final AFj1sSDK5 getInterfaceDescriptor() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (AFj1sSDK5) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1240113979, new Object[]{this}, iIAuthTabCallback, 1240113986, iIAuthTabCallback3);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull Function0<Unit> function0) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2027491167, new Object[]{this, str, function0}, iIAuthTabCallback, 2027491170, iIAuthTabCallback3);
    }

    public final TossModule_postMessage RatingCompat1() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (TossModule_postMessage) IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1107937773, new Object[]{this}, iIAuthTabCallback, -1107937771, iIAuthTabCallback3);
    }

    public final void asInterface(@NotNull String str) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1348922071, new Object[]{this, str}, iIAuthTabCallback, -1348922066, iIAuthTabCallback3);
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCallbackWithResult + 83;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = extraCallback + 115;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void ParcelableVolumeInfo() {
        ICustomTabsCallback = new int[]{-782961232, 1358355683, -32968554, 2048101845, 1162175989, 1408155689, 686579043, -22913550, -1612942040, 55776132, 2088565031, -465216940, 1201087998, 2105431928, -156424401, 1555124498, -2117611250, 140307459};
    }
}
