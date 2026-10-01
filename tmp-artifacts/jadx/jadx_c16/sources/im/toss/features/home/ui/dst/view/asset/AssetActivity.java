package im.toss.features.home.ui.dst.view.asset;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.initech.pkix.cmp.client.util.URI;
import im.toss.TossApplication;
import im.toss.features.home.core.hds.view.HomeTabLayout;
import im.toss.features.home.core.ui.base.BaseHomeActivity;
import im.toss.features.home.core.ui.base.HomeEmptyViewModel;
import im.toss.features.home.core.ui.widget.HomeNavigationBarItemGroup;
import im.toss.features.home.ui.dst.R;
import im.toss.features.home.ui.dst.view.asset.AssetActivity$;
import im.toss.features.home.ui.dst.view.asset.summary.AssetSummaryFragment;
import im.toss.features.password.api.annotation.RequiresAuth;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.uikit.widget.tab.TdsTabV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DownloadInstallCallback1;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.GeckoHubImp;
import o.IAnimation;
import o.LifecyclesKtawaitStarted21;
import o.NativeActionFilter;
import o.PlayerErrorCode;
import o.ProductDetailsPricingPhases;
import o.RVManifestIProxyManifest;
import o.RemoteDebugBridgeExtension2;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.UTF8Decoder;
import o.access13800;
import o.access14300;
import o.access15400;
import o.addExtra;
import o.getBacktraceNote;
import o.getJsApiHandler;
import o.getPackageType;
import o.getStartTimeMillis;
import o.getTileModeY;
import o.maybeUpdateAnimatable;
import o.setMaxScale;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.service.LabFragment;

@RequiresAuth(onExtraCallback = 48, onExtraCallbackWithResult = URI.ENABLE_BACKWARDS_COMPATIBILITY, onWarmupCompleted = UTF8Decoder.HOME_ASSET)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AssetActivity extends Hilt_AssetActivity<RemoteDebugBridgeExtension2, HomeEmptyViewModel, RVManifestIProxyManifest> {
    private final String IAuthTabCallbackDefault;
    private final IAnimation<String> IAuthTabCallbackStub;
    private DownloadInstallCallback1 IAuthTabCallbackStubProxy;
    private final IAnimation<String> asBinder;
    private ValueAnimator asInterface;
    private final Lazy getInterfaceDescriptor;

    @Inject
    public setMaxScale loanBrokerageFragmentNavigation;

    @Inject
    public getStartTimeMillis localeManager;
    private final setRubIn<List<getJsApiHandler>> onTransact;
    private static final byte[] $$a = {79, 23, 89, 11};
    private static final int $$b = 188;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 478308947;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2;
        int i3 = 4 - (s2 * 4);
        int i4 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i5 = (b * 3) + 105;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += -i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += -i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(getjsapihandler, setDetectableSize);
        }
        IAuthTabCallback(getjsapihandler, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i3);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i3)) | (~(i7 | i8 | i9)) | i11 | (~(i4 | i5));
        int i14 = i4 + i3 + i2 + (1272450877 * i6) + ((-51365948) * i);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i4) + 922746880 + ((-1437248296) * i3) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i2) + ((-1881145344) * i6) + ((-578813952) * i) + ((-124846080) * i15);
        int i17 = (i4 * 1187242746) + 1002376400 + (i3 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i2 * 1187242569) + (i6 * (-1484311963)) + (i * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 4) {
            return i18 != 5 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
        }
        BaseHomeActivity baseHomeActivity = (AssetActivity) objArr[0];
        getJsApiHandler getjsapihandler = (getJsApiHandler) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i19 = 2 % 2;
        int i20 = access000 + 17;
        IAuthTabCallback_Parcel = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        d(4 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{7, 65530, 7, 7, 65530, 65531, 65530, 7}, false, 8 - ExpandableListView.getPackedPositionGroup(0L), 229 - TextUtils.indexOf("", "", 0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), baseHomeActivity.onGreatestScrollPercentageIncreased());
        setDetectableSize.onExtraCallback("referrer_item_id", baseHomeActivity.getIntent().getStringExtra("referrer_item_id"));
        setDetectableSize.onExtraCallback("tab_type", getjsapihandler.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i22 = access000 + 105;
        IAuthTabCallback_Parcel = i22 % 128;
        int i23 = i22 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetActivity assetActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(assetActivity);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(assetActivity);
        int i3 = IAuthTabCallback_Parcel + 99;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AssetActivity assetActivity, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = access000 + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallback(assetActivity, i, i2);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(assetActivity, i, i2);
        int i5 = access000 + 49;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AssetActivity assetActivity, getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 633311369, new Object[]{assetActivity, getjsapihandler, setDetectableSize}, -633311365, iOnExtraCallback, iOnExtraCallback3);
        int i4 = IAuthTabCallback_Parcel + 45;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(getJsApiHandler getjsapihandler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = IAuthTabCallback(getjsapihandler);
        int i4 = access000 + 125;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return charSequenceIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AssetActivity assetActivity, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 7;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(assetActivity, i);
        int i5 = access000 + 37;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
            int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
            return (Unit) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 321723004, new Object[]{getjsapihandler, setDetectableSize}, -321723003, iOnExtraCallback, iOnExtraCallback3);
        }
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback5 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback6 = TossApplication.onSessionEnded.onExtraCallback();
        throw null;
    }

    public void access200() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final /* synthetic */ RemoteDebugBridgeExtension2 IAuthTabCallback(AssetActivity assetActivity) {
        int i = 2 % 2;
        int i2 = access000 + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        RemoteDebugBridgeExtension2 remoteDebugBridgeExtension2UpdateVisuals = assetActivity.updateVisuals();
        int i4 = IAuthTabCallback_Parcel + 85;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return remoteDebugBridgeExtension2UpdateVisuals;
    }

    public static final /* synthetic */ int onExtraCallback(AssetActivity assetActivity, Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = assetActivity.onWarmupCompleted(intent);
        int i4 = access000 + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iOnWarmupCompleted;
    }

    public static final /* synthetic */ DownloadInstallCallback1 onExtraCallback(AssetActivity assetActivity) {
        int i = 2 % 2;
        int i2 = access000 + 117;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        DownloadInstallCallback1 downloadInstallCallback1 = assetActivity.IAuthTabCallbackStubProxy;
        int i5 = i3 + 109;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return downloadInstallCallback1;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AssetActivity assetActivity = (AssetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        setRubIn<List<getJsApiHandler>> setrubin = assetActivity.onTransact;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 117;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    public static final /* synthetic */ void onNavigationEvent(AssetActivity assetActivity, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 25;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        assetActivity.onWarmupCompleted(i);
        int i5 = access000 + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onTransact(AssetActivity assetActivity) {
        int i = 2 % 2;
        int i2 = access000 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        assetActivity.ITrustedWebActivityCallbackDefault();
        int i4 = access000 + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AssetActivity assetActivity = (AssetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        assetActivity.IPostMessageServiceStubProxy();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access000 + 73;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public /* synthetic */ NativeActionFilter IPostMessageServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        HomeEmptyViewModel homeEmptyViewModelIPostMessageService = IPostMessageService();
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return homeEmptyViewModelIPostMessageService;
    }

    /* renamed from: im.toss.features.home.ui.dst.view.asset.AssetActivity$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<LayoutInflater, RemoteDebugBridgeExtension2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final AnonymousClass5 onExtraCallbackWithResult = new AnonymousClass5();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 59;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        AnonymousClass5() {
            super(1, RemoteDebugBridgeExtension2.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lim/toss/features/home/ui/dst/databinding/HomeActivityAssetBinding;", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            if (i2 % 2 == 0) {
                onNavigationEvent(layoutInflater);
                obj2.hashCode();
                throw null;
            }
            RemoteDebugBridgeExtension2 remoteDebugBridgeExtension2OnNavigationEvent = onNavigationEvent(layoutInflater);
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return remoteDebugBridgeExtension2OnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }

        public final RemoteDebugBridgeExtension2 onNavigationEvent(LayoutInflater layoutInflater) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            RemoteDebugBridgeExtension2 remoteDebugBridgeExtension2OnExtraCallbackWithResult = RemoteDebugBridgeExtension2.onExtraCallbackWithResult(layoutInflater);
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return remoteDebugBridgeExtension2OnExtraCallbackWithResult;
            }
            throw null;
        }
    }

    public AssetActivity() {
        super(AnonymousClass5.onExtraCallbackWithResult);
        this.IAuthTabCallbackDefault = "account_list";
        this.getInterfaceDescriptor = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(HomeEmptyViewModel.class), new IAuthTabCallback(this), new onNavigationEvent(this), new onExtraCallback(null, this));
        IAnimation iAnimationOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(new IAuthTabCallbackStub(null));
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this);
        getTileModeY.onWarmupCompleted onwarmupcompleted = getTileModeY.Companion;
        setRubIn setrubinIAuthTabCallback = ycxycx.IAuthTabCallback(iAnimationOnExtraCallbackWithResult, textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, onwarmupcompleted.IAuthTabCallback(), (Object) null);
        this.asBinder = setrubinIAuthTabCallback;
        setRubIn setrubinIAuthTabCallback2 = ycxycx.IAuthTabCallback(ycxycx.onExtraCallbackWithResult(new onTransact(null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), onwarmupcompleted.onNavigationEvent(), (Object) null);
        this.IAuthTabCallbackStub = setrubinIAuthTabCallback2;
        this.onTransact = ycxycx.IAuthTabCallback(ycxycx.onWarmupCompleted(setrubinIAuthTabCallback, setrubinIAuthTabCallback2, new onExtraCallbackWithResult(null)), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), getTileModeY.onWarmupCompleted.onExtraCallback(onwarmupcompleted, 0L, 0L, 3, (Object) null), CollectionsKt.emptyList());
    }

    public String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallbackDefault;
        int i5 = i2 + 35;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 43;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!((Collection) this.onTransact.IAuthTabCallback()).isEmpty()) {
            int i4 = IAuthTabCallback_Parcel + 59;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            Iterable iterable = (Iterable) this.onTransact.IAuthTabCallback();
            if (iterable instanceof Collection) {
                int i6 = IAuthTabCallback_Parcel + 3;
                access000 = i6 % 128;
                if (i6 % 2 != 0) {
                    ((Collection) iterable).isEmpty();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (((Collection) iterable).isEmpty()) {
                    return 1281443L;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((getJsApiHandler) it.next()) instanceof getJsApiHandler.onExtraCallback) {
                    int i7 = IAuthTabCallback_Parcel + 13;
                    access000 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 3 / 3;
                    }
                }
            }
            return 1281443L;
        }
        int i9 = IAuthTabCallback_Parcel + 11;
        access000 = i9 % 128;
        int i10 = i9 % 2;
        return -1L;
    }

    public Map<String, Object> getScreenParams() {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = access000 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        getJsApiHandler getjsapihandler = (getJsApiHandler) CollectionsKt.getOrNull((List) this.onTransact.IAuthTabCallback(), updateVisuals().IAuthTabCallback.getCurrentItem());
        if (getjsapihandler != null) {
            int i4 = access000 + 91;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                strOnExtraCallback = getjsapihandler.onExtraCallback();
                int i5 = 58 / 0;
            } else {
                strOnExtraCallback = getjsapihandler.onExtraCallback();
            }
        } else {
            strOnExtraCallback = null;
        }
        screenParams.put("initial_tab", strOnExtraCallback);
        screenParams.put("tab_list", IEngagementSignalsCallbackStubProxy());
        return screenParams;
    }

    protected HomeEmptyViewModel IPostMessageService() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        HomeEmptyViewModel homeEmptyViewModel = (HomeEmptyViewModel) this.getInterfaceDescriptor.getValue();
        int i4 = access000 + 49;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return homeEmptyViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String onVerticalScrollEvent() {
        String string;
        int i = 2 % 2;
        int i2 = access000 + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            string = getString(R.string.home_ui_dst_asset_summary_accessibility_screen_name);
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i3 = 63 / 0;
        } else {
            string = getString(R.string.home_ui_dst_asset_summary_accessibility_screen_name);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        int i4 = access000 + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = im.toss.features.home.ui.dst.view.asset.AssetActivity.access000 + 39;
        im.toss.features.home.ui.dst.view.asset.AssetActivity.IAuthTabCallback_Parcel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final setMaxScale onNavigationEvent() {
        setMaxScale setmaxscale;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            setmaxscale = this.loanBrokerageFragmentNavigation;
            int i3 = 95 / 0;
        } else {
            setmaxscale = this.loanBrokerageFragmentNavigation;
        }
    }

    public static final class onNavigationEvent implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return onwarmupcompletedOnExtraCallbackWithResult;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ComponentActivity componentActivity = this.onNavigationEvent;
            if (i3 != 0) {
                return componentActivity.getDefaultViewModelProviderFactory();
            }
            componentActivity.getDefaultViewModelProviderFactory();
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AssetActivity assetActivity = (AssetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 113;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getStartTimeMillis getstarttimemillis = assetActivity.localeManager;
        if (getstarttimemillis != null) {
            int i5 = i2 + 47;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return getstarttimemillis;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = access000 + 21;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public static final class IAuthTabCallback implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return viewModelStore;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
            int i4 = onNavigationEvent + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return androidTextContextMenuToolbarProviderExternalSyntheticLambda1IAuthTabCallback;
        }
    }

    public static final class onExtraCallback implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public onExtraCallback(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onWarmupCompleted = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback = onExtraCallback();
            if (i3 != 0) {
                int i4 = 57 / 0;
            }
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnExtraCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            if (r0 != null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r0 != null) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 79;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.onExtraCallback;
            if (function0 != null) {
                int i5 = i2 + 67;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (i6 != 0) {
                    int i7 = 83 / 0;
                }
            }
            return this.onWarmupCompleted.getDefaultViewModelCreationExtras();
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<setRipple<? super String>, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = AssetActivity.this.new IAuthTabCallbackStub(access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallbackStub;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((setRipple) obj, (access13800) obj2);
            if (i3 == 0) {
                int i4 = 40 / 0;
            }
            int i5 = onExtraCallback + 17;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(setRipple<? super String> setripple, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setripple, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
            int i5 = onExtraCallback + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
        
            if (r1.emit(r5, r18) != r4) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            setRipple setripple;
            Object objOnExtraCallback2;
            setRipple setripple2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            setRipple setripple3 = (setRipple) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            setripple = (setRipple) this.L$1;
                            ResultKt.onNavigationEvent(obj);
                            objOnExtraCallback = obj;
                            this.L$0 = access15400.onNavigationEvent(setripple3);
                            this.L$1 = null;
                            this.label = 4;
                        } else if (i3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                setRipple setripple4 = (setRipple) this.L$1;
                ResultKt.onNavigationEvent(obj);
                setripple2 = setripple4;
                objOnExtraCallback2 = obj;
                this.L$0 = access15400.onNavigationEvent(setripple3);
                this.L$1 = null;
                this.label = 2;
                if (setripple2.emit(objOnExtraCallback2, this) == objOnWarmupCompleted) {
                    int i4 = onWarmupCompleted + 77;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            Object[] objArr = {AssetActivity.this};
            int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
            if (((getStartTimeMillis) AssetActivity.onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), -1575849221, objArr, 1575849221, iOnExtraCallback, TossApplication.onSessionEnded.onExtraCallback())).onWarmupCompleted() != ProductDetailsPricingPhases.KOREAN) {
                int i6 = onWarmupCompleted + 11;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.L$0 = access15400.onNavigationEvent(setripple3);
                this.L$1 = setripple3;
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                objOnExtraCallback2 = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "home.asset.tab.i18nTitle", "", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (objOnExtraCallback2 != objOnWarmupCompleted) {
                    int i8 = onExtraCallback + 89;
                    onWarmupCompleted = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    setripple2 = setripple3;
                    this.L$0 = access15400.onNavigationEvent(setripple3);
                    this.L$1 = null;
                    this.label = 2;
                    if (setripple2.emit(objOnExtraCallback2, this) == objOnWarmupCompleted) {
                    }
                    return Unit.INSTANCE;
                }
            } else {
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted212 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.L$0 = access15400.onNavigationEvent(setripple3);
                this.L$1 = setripple3;
                this.label = 3;
                int iIAuthTabCallback2 = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted212, "home.asset.tab.title", "", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback2);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    int i9 = onExtraCallback + 49;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    setripple = setripple3;
                    this.L$0 = access15400.onNavigationEvent(setripple3);
                    this.L$1 = null;
                    this.label = 4;
                }
            }
            return objOnWarmupCompleted;
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<setRipple<? super String>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(access13800Var);
            ontransact.L$0 = obj;
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return ontransact;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((setRipple) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(setRipple<? super String> setripple, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(setripple, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 59 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            if (r3.emit(r13, r12) == r2) goto L24;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            setRipple setripple;
            int i = 2 % 2;
            setRipple setripple2 = (setRipple) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.L$0 = access15400.onNavigationEvent(setripple2);
                this.L$1 = setripple2;
                this.label = 1;
                int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
                obj = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "home.asset.tab.url", "", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
                if (obj != objOnWarmupCompleted) {
                    int i3 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    setripple = setripple2;
                }
                return objOnWarmupCompleted;
            }
            int i5 = onExtraCallbackWithResult + 35;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            int i7 = i5 % 2;
            if (i2 != 1) {
                int i8 = i6 + 45;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0 ? i2 != 2 : i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            setripple = (setRipple) this.L$1;
            ResultKt.onNavigationEvent(obj);
            this.L$0 = access15400.onNavigationEvent(setripple2);
            this.L$1 = null;
            this.label = 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements getBacktraceNote<String, String, access13800<? super List<? extends getJsApiHandler>>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(3, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 15;
            onNavigationEvent = i2 % 128;
            String str = (String) obj;
            String str2 = (String) obj2;
            if (i2 % 2 == 0) {
                objOnWarmupCompleted = onWarmupCompleted(str, str2, (access13800) obj3);
                int i3 = 62 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(str, str2, (access13800) obj3);
            }
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(String str, String str2, access13800<? super List<? extends getJsApiHandler>> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = AssetActivity.this.new onExtraCallbackWithResult(access13800Var);
            onextracallbackwithresult.L$0 = str;
            onextracallbackwithresult.L$1 = str2;
            Object objInvokeSuspend = onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
            int i2 = onNavigationEvent + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Type inference failed for: r9v2, types: [android.content.Context, im.toss.features.home.ui.dst.view.asset.AssetActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ?? r9 = AssetActivity.this;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(new getJsApiHandler.IAuthTabCallback((Context) r9));
            PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
            if (addExtra.IAuthTabCallback(playerErrorCode)) {
                int i2 = onNavigationEvent;
                int i3 = i2 + 17;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (str != null) {
                    int i5 = i2 + 85;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    if (str2 == null) {
                        listCreateListBuilder.add(getJsApiHandler.onExtraCallback.IAuthTabCallback);
                    } else if (StringsKt.isBlank(str) || StringsKt.isBlank(str2)) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        listCreateListBuilder.add(new getJsApiHandler.onExtraCallbackWithResult(str, str2));
                    }
                }
            }
            if (addExtra.onExtraCallbackWithResult(playerErrorCode)) {
                listCreateListBuilder.add(new getJsApiHandler.onNavigationEvent((Context) r9, r9.onNavigationEvent()));
            }
            return CollectionsKt.build(listCreateListBuilder);
        }
    }

    private static void d(int i, char[] cArr, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $10 + 75;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(access100)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 35125), Color.argb(0, 0, 0, 0) + 23, 10278 - TextUtils.getOffsetBefore("", 0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 12843), 55 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2167 - (ViewConfiguration.getTapTimeout() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i9 = $10 + 99;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i13 = $10 + 45;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 55 - Gravity.getAbsoluteGravity(0, 0), 2167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 121;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().onExtraCallbackWithResult());
        IPostMessageServiceStubProxy();
        IAuthTabCallback(bundle);
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -69637114, new Object[]{this}, 69637119, iOnExtraCallback, iOnExtraCallback3);
        int i4 = IAuthTabCallback_Parcel + 51;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        RemoteDebugBridgeExtension2 remoteDebugBridgeExtension2UpdateVisuals = updateVisuals();
        Object[] objArr = {remoteDebugBridgeExtension2UpdateVisuals.onNavigationEvent};
        TdsTabV1View.onNavigationEvent(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -968194161, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 968194164);
        remoteDebugBridgeExtension2UpdateVisuals.IAuthTabCallback.clearOnPageChangeListeners();
        HomeTabLayout homeTabLayout = updateVisuals().onNavigationEvent;
        ViewPager viewPager = updateVisuals().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(viewPager, "");
        homeTabLayout.setupWithViewPager(viewPager);
        HomeTabLayout homeTabLayout2 = remoteDebugBridgeExtension2UpdateVisuals.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(homeTabLayout2, "");
        ViewPager viewPager2 = updateVisuals().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        TdsTabV1View.IAuthTabCallback(homeTabLayout2, viewPager2, new AssetActivity$.ExternalSyntheticLambda1(this), new AssetActivity$.ExternalSyntheticLambda2(this), false, 8, (Object) null);
        int i2 = access000 + 67;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        getJsApiHandler getjsapihandler = (getJsApiHandler) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        d(3 - TextUtils.indexOf("", "", 0, 0), new char[]{'\t', 0, 65525, 4}, false, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, TextUtils.indexOf((CharSequence) "", '0', 0) + 235, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), getjsapihandler.onExtraCallback());
        setDetectableSize.onExtraCallback("screen_name", "fd__my_account");
        setDetectableSize.onExtraCallback("view", "fd__my_account");
        Object[] objArr3 = new Object[1];
        d((ViewConfiguration.getPressedStateDuration() >> 16) + 4, new char[]{65532, 7, 65535, 65528, 7}, false, 4 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 230, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), getjsapihandler.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 63;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1010185, false, (java.lang.String) null, (java.util.Map) null, new im.toss.features.home.ui.dst.view.asset.AssetActivity$.ExternalSyntheticLambda6(r0), 14, (java.lang.Object) null);
        o.RVManifestIProxyManifest.onExtraCallbackWithResult(im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 510194272, -510194269, new java.lang.Object[]{r12.IEngagementSignalsCallback(), o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r12), 0L, 2, null}, im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        r12.IAuthTabCallback(r14);
        r12 = kotlin.Unit.INSTANCE;
        r14 = im.toss.features.home.ui.dst.view.asset.AssetActivity.IAuthTabCallback_Parcel + 103;
        im.toss.features.home.ui.dst.view.asset.AssetActivity.access000 = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r12 = kotlin.Unit.INSTANCE;
        r14 = im.toss.features.home.ui.dst.view.asset.AssetActivity.access000 + 113;
        im.toss.features.home.ui.dst.view.asset.AssetActivity.IAuthTabCallback_Parcel = r14 % 128;
        r14 = r14 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(AssetActivity assetActivity, int i, int i2) {
        getJsApiHandler getjsapihandler;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 19;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            getjsapihandler = (getJsApiHandler) CollectionsKt.getOrNull((List) assetActivity.onTransact.IAuthTabCallback(), i2);
            int i5 = 35 / 0;
        } else {
            getjsapihandler = (getJsApiHandler) CollectionsKt.getOrNull((List) assetActivity.onTransact.IAuthTabCallback(), i2);
        }
    }

    private static final Unit IAuthTabCallback(getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        d((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, new char[]{'\t', 0, 65525, 4}, false, 4 - Gravity.getAbsoluteGravity(0, 0), AndroidCharacter.getMirror('0') + 186, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getjsapihandler.onExtraCallback());
        setDetectableSize.onExtraCallback("screen_name", "fd__my_account");
        setDetectableSize.onExtraCallback("view", "fd__my_account");
        Object[] objArr2 = new Object[1];
        d(4 - ExpandableListView.getPackedPositionGroup(0L), new char[]{65532, 7, 65535, 65528, 7}, false, 4 - ExpandableListView.getPackedPositionChild(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 231, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), getjsapihandler.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 117;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(AssetActivity assetActivity, int i) {
        int i2 = 2 % 2;
        getJsApiHandler getjsapihandler = (getJsApiHandler) CollectionsKt.getOrNull((List) assetActivity.onTransact.IAuthTabCallback(), i);
        if (getjsapihandler != null) {
            ConvertByteArrayToFloatArray.onExtraCallback(1009321L, false, (String) null, (Map) null, new AssetActivity$.ExternalSyntheticLambda5(getjsapihandler), 14, (Object) null);
            RVManifestIProxyManifest.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 510194272, -510194269, new Object[]{assetActivity.IEngagementSignalsCallback(), TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(assetActivity), 0L, 2, null}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
            assetActivity.IAuthTabCallback(i);
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback_Parcel + 7;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        int i5 = access000 + 27;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return Unit.INSTANCE;
        }
        int i6 = 38 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[PHI: r1
      0x004b: PHI (r1v9 androidx.viewpager.widget.ViewPager) = (r1v6 androidx.viewpager.widget.ViewPager), (r1v12 androidx.viewpager.widget.ViewPager) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v7 androidx.viewpager.widget.ViewPager) = (r1v6 androidx.viewpager.widget.ViewPager), (r1v12 androidx.viewpager.widget.ViewPager) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final getPackageType IAuthTabCallback(Bundle bundle) {
        ViewPager viewPager;
        DownloadInstallCallback1 downloadInstallCallback1;
        int i = 2 % 2;
        int i2 = access000 + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            viewPager = updateVisuals().IAuthTabCallback;
            viewPager.setOffscreenPageLimit(2);
            if (bundle == null) {
                FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                downloadInstallCallback1 = new DownloadInstallCallback1(supportFragmentManager, getIntent().getExtras());
                int i3 = access000 + 77;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            } else {
                FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                downloadInstallCallback1 = new DownloadInstallCallback1(supportFragmentManager2, (Bundle) null, 2, (DefaultConstructorMarker) null);
            }
        } else {
            viewPager = updateVisuals().IAuthTabCallback;
            viewPager.setOffscreenPageLimit(3);
            if (bundle == null) {
            }
        }
        this.IAuthTabCallbackStubProxy = downloadInstallCallback1;
        viewPager.setAdapter(downloadInstallCallback1);
        return maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, (access13800) null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[PHI: r1
      0x0033: PHI (r1v5 java.util.List) = (r1v4 java.util.List), (r1v12 java.util.List) binds: [B:10:0x0030, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r1
      0x0045: PHI (r1v7 java.util.List) = (r1v4 java.util.List), (r1v5 java.util.List), (r1v12 java.util.List) binds: [B:10:0x0030, B:15:0x0043, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ITrustedWebActivityCallbackDefault() {
        List list;
        int i = 2 % 2;
        List list2 = (List) this.onTransact.IAuthTabCallback();
        if (list2.isEmpty()) {
            return;
        }
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 3;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            list = list2;
            int i4 = 85 / 0;
            if (list instanceof Collection) {
                int i5 = i2 + 69;
                access000 = i5 % 128;
                if (i5 % 2 != 0) {
                    list.isEmpty();
                    throw null;
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((getJsApiHandler) it.next()) instanceof getJsApiHandler.onExtraCallback) {
                            return;
                        }
                    }
                }
            }
        } else {
            list = list2;
            if (!(list instanceof Collection)) {
            }
        }
        onTrackView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(int i) throws Throwable {
        int i2 = 2 % 2;
        PagerAdapter adapter = updateVisuals().IAuthTabCallback.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            if (i < 0 || i > count - 1) {
                return;
            }
            int i3 = access000 + 41;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            d(6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{3, 14, 3, '\b', 3, 65532, 65531, 65518, 6, 65531}, true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, 225 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            if (intent.hasExtra(((String) objArr[0]).intern())) {
                Intent intent2 = getIntent();
                Object[] objArr2 = new Object[1];
                d((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, new char[]{3, 14, 3, '\b', 3, 65532, 65531, 65518, 6, 65531}, true, Color.argb(0, 0, 0, 0) + 10, 224 - TextUtils.indexOf("", "", 0), objArr2);
                intent2.removeExtra(((String) objArr2[0]).intern());
                IPostMessageServiceStubProxy();
            }
            updateVisuals().IAuthTabCallback.setCurrentItem(i);
            int i5 = IAuthTabCallback_Parcel + 105;
            access000 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AssetActivity assetActivity = (AssetActivity) objArr[0];
        int i = 2 % 2;
        RVManifestIProxyManifest.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), 2004152327, -2004152322, new Object[]{assetActivity.IEngagementSignalsCallback(), new AssetActivity$.ExternalSyntheticLambda4(assetActivity)}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent());
        int i2 = access000 + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(AssetActivity assetActivity) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getJsApiHandler getjsapihandler = (getJsApiHandler) CollectionsKt.getOrNull((List) assetActivity.onTransact.IAuthTabCallback(), assetActivity.updateVisuals().IAuthTabCallback.getCurrentItem());
            if (getjsapihandler != null) {
                int i3 = IAuthTabCallback_Parcel + 111;
                access000 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (!(getjsapihandler instanceof getJsApiHandler.IAuthTabCallback)) {
                        ConvertByteArrayToFloatArray.onExtraCallback(1513175L, false, (String) null, (Map) null, new AssetActivity$.ExternalSyntheticLambda3(assetActivity, getjsapihandler), 14, (Object) null);
                    }
                } else {
                    boolean z = getjsapihandler instanceof getJsApiHandler.IAuthTabCallback;
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }
        obj.hashCode();
        throw null;
    }

    public void onNewIntent(@NotNull Intent intent) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        int iOnWarmupCompleted = onWarmupCompleted(intent);
        if (iOnWarmupCompleted != 0) {
            onWarmupCompleted(iOnWarmupCompleted);
            return;
        }
        List listOnActivityLayout = getSupportFragmentManager().onActivityLayout();
        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
        ArrayList arrayList = new ArrayList();
        int i2 = IAuthTabCallback_Parcel + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : listOnActivityLayout) {
            int i4 = IAuthTabCallback_Parcel + 113;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (!(!(obj instanceof AssetSummaryFragment))) {
                int i6 = access000 + 117;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(obj);
            }
        }
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) CollectionsKt.firstOrNull(arrayList);
        if (assetSummaryFragment != null) {
            int i8 = access000 + 45;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
            assetSummaryFragment.setArguments(intent.getExtras());
            IPostMessageService().extraCallbackWithResult();
        }
        onWarmupCompleted(0);
    }

    private final int onWarmupCompleted(Intent intent) throws Throwable {
        String queryParameter;
        Uri data;
        int i = 2 % 2;
        int i2 = 0;
        if (intent == null || (data = intent.getData()) == null) {
            queryParameter = null;
        } else {
            Object[] objArr = new Object[1];
            d(Color.green(0) + 5, new char[]{3, 14, 3, '\b', 3, 65532, 65531, 65518, 6, 65531}, true, 10 + (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 224, objArr);
            queryParameter = data.getQueryParameter(((String) objArr[0]).intern());
        }
        if (queryParameter == null) {
            int i3 = access000 + 85;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            queryParameter = "";
        }
        Iterator it = ((List) this.onTransact.IAuthTabCallback()).iterator();
        while (it.hasNext()) {
            int i4 = access000 + 61;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(((getJsApiHandler) it.next()).onExtraCallbackWithResult(), queryParameter);
                throw null;
            }
            if (Intrinsics.areEqual(((getJsApiHandler) it.next()).onExtraCallbackWithResult(), queryParameter)) {
                return i2;
            }
            i2++;
        }
        int i5 = IAuthTabCallback_Parcel + 81;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    public boolean bg_() {
        Iterator it;
        int i = 2 % 2;
        if (updateVisuals().IAuthTabCallback.getCurrentItem() != 0) {
            List listOnActivityLayout = getSupportFragmentManager().onActivityLayout();
            Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnActivityLayout) {
                int i2 = IAuthTabCallback_Parcel + 25;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                if (obj instanceof LabFragment) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                updateVisuals().IAuthTabCallback.setCurrentItem(0, true);
            } else {
                int i4 = IAuthTabCallback_Parcel + 27;
                access000 = i4 % 128;
                if (i4 % 2 != 0) {
                    it = arrayList.iterator();
                    int i5 = 16 / 0;
                } else {
                    it = arrayList.iterator();
                }
                while (it.hasNext()) {
                    if (((LabFragment) it.next()).onBackPressed()) {
                        break;
                    }
                }
                updateVisuals().IAuthTabCallback.setCurrentItem(0, true);
            }
            return true;
        }
        List listOnActivityLayout2 = getSupportFragmentManager().onActivityLayout();
        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout2, "");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listOnActivityLayout2) {
            if (!(!(obj2 instanceof AssetSummaryFragment))) {
                arrayList2.add(obj2);
            }
        }
        AssetSummaryFragment assetSummaryFragment = (AssetSummaryFragment) CollectionsKt.firstOrNull(arrayList2);
        if (assetSummaryFragment != null && assetSummaryFragment.onBackPressed()) {
            int i6 = IAuthTabCallback_Parcel + 89;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        boolean zBg_ = super/*im.toss.base.BaseActivity*/.bg_();
        int i8 = access000 + 77;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return zBg_;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 51;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        ValueAnimator valueAnimator = this.asInterface;
        if (valueAnimator != null) {
            int i5 = i2 + 55;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                valueAnimator.cancel();
            } else {
                valueAnimator.cancel();
                int i6 = 50 / 0;
            }
        }
        this.asInterface = null;
        super/*im.toss.base.BaseActivity*/.onDestroy();
    }

    private static final CharSequence IAuthTabCallback(getJsApiHandler getjsapihandler) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getjsapihandler, "");
        String strOnExtraCallback = getjsapihandler.onExtraCallback();
        int i4 = IAuthTabCallback_Parcel + 21;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    private final String IEngagementSignalsCallbackStubProxy() {
        int i = 2 % 2;
        String strJoinToString$default = CollectionsKt.joinToString$default((Iterable) this.onTransact.IAuthTabCallback(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new AssetActivity$.ExternalSyntheticLambda0(), 30, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 47;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return strJoinToString$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(int i) {
        int i2;
        int i3 = 2 % 2;
        boolean z = CollectionsKt.getOrNull((List) this.onTransact.IAuthTabCallback(), i) instanceof getJsApiHandler.IAuthTabCallback;
        HomeNavigationBarItemGroup homeNavigationBarItemGroup = updateVisuals().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(homeNavigationBarItemGroup, "");
        if (z) {
            int i4 = IAuthTabCallback_Parcel + 105;
            int i5 = i4 % 128;
            access000 = i5;
            i2 = i4 % 2 != 0 ? 1 : 0;
            int i6 = i5 + 33;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = IAuthTabCallback_Parcel + 103;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            i2 = 8;
        }
        homeNavigationBarItemGroup.setVisibility(i2);
    }

    public static final /* synthetic */ setRubIn onWarmupCompleted(AssetActivity assetActivity) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (setRubIn) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -821059456, new Object[]{assetActivity}, 821059459, iOnExtraCallback, iOnExtraCallback3);
    }

    public static final /* synthetic */ void onNavigationEvent(AssetActivity assetActivity) throws Throwable {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -1568645519, new Object[]{assetActivity}, 1568645521, iOnExtraCallback, iOnExtraCallback3);
    }

    private final void ITrustedWebActivityCallbackStub() throws Throwable {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -69637114, new Object[]{this}, 69637119, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onExtraCallback(AssetActivity assetActivity, getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 633311369, new Object[]{assetActivity, getjsapihandler, setDetectableSize}, -633311365, iOnExtraCallback, iOnExtraCallback3);
    }

    private static final Unit onExtraCallbackWithResult(getJsApiHandler getjsapihandler, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, 321723004, new Object[]{getjsapihandler, setDetectableSize}, -321723003, iOnExtraCallback, iOnExtraCallback3);
    }

    public final getStartTimeMillis IPostMessageServiceDefault() {
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        return (getStartTimeMillis) onExtraCallbackWithResult(TossApplication.onSessionEnded.onExtraCallback(), iOnExtraCallback2, -1575849221, new Object[]{this}, 1575849221, iOnExtraCallback, iOnExtraCallback3);
    }

    @Override // im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = access000 + 17;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 89;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.home.ui.dst.view.asset.Hilt_AssetActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 95;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
