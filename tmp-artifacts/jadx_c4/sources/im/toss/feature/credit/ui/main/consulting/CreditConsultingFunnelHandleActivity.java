package im.toss.feature.credit.ui.main.consulting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.base.BaseActivity;
import im.toss.feature.credit.ui.main.R;
import im.toss.feature.credit.ui.main.consulting.CreditConsultingFunnelHandleActivity$;
import im.toss.features.credit.data.response.CreditConsultingCategory;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setScreenAwakeMode;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.RightClickGesturesKtonRightClickDown2;
import o.Ripple_androidKt;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.StackSampler;
import o.TextFieldImplKtCommonDecorationBox3ExternalSyntheticLambda4;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TossModule_postMessage;
import o.TypographyKtExternalSyntheticLambda0;
import o.disableImageViewPreallocationAndroid;
import o.enableReportDataOptimize;
import o.getBoolean;
import o.getParamImp;
import o.h5ScreenShotObserverOnChangeOpt;
import o.initMiniApp;
import o.initSDK;
import o.matches;
import o.nSetPosition;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditConsultingFunnelHandleActivity extends Hilt_CreditConsultingFunnelHandleActivity {
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 478308911;
    private boolean asInterface;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackDefault(this));
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CreditConsultingViewModel.class), new asBinder(this), new IAuthTabCallbackStub(this), new onTransact(null, this));
    private final boolean IAuthTabCallbackStub = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4 = 4 - (i * 2);
        byte[] bArr = $$a;
        int i5 = i2 * 3;
        int i6 = 105 - (s * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            i4++;
            i6 = i7 + (-i8);
            int i9 = i6;
            int i10 = i4;
            bArr2[i3] = (byte) i9;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i10];
            i7 = i9;
            i4 = i10;
            i4++;
            i6 = i7 + (-i8);
            int i92 = i6;
            int i102 = i4;
            bArr2[i3] = (byte) i92;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i922 = i6;
            int i1022 = i4;
            bArr2[i3] = (byte) i922;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(creditConsultingFunnelHandleActivity, onnavigationevent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(creditConsultingFunnelHandleActivity, onnavigationevent);
        int i3 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~(i3 | i2 | i5);
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i3 + i2 + i + (105149790 * i4) + ((-719480883) * i6);
        int i15 = i14 * i14;
        int i16 = (i3 * (-424837635)) + 281018368 + ((-424837635) * i2) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i) + ((-654311424) * i4) + (1702887424 * i6) + ((-155189248) * i15);
        int i17 = (i3 * 910058005) + 1460508013 + (i2 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i * 910058489) + (i4 * (-759332242)) + (i6 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(creditConsultingFunnelHandleActivity);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(creditConsultingFunnelHandleActivity);
        int i3 = getInterfaceDescriptor + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 17;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return -1L;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements Function0<StackSampler> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity onExtraCallback;

        public IAuthTabCallbackDefault(Activity activity) {
            this.onExtraCallback = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnWarmupCompleted = onWarmupCompleted();
            if (i3 != 0) {
                int i4 = 35 / 0;
            }
            return searchBarKtExternalSyntheticLambda5OnWarmupCompleted;
        }

        public final StackSampler onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
                return StackSampler.onExtraCallback(layoutInflater);
            }
            LayoutInflater layoutInflater2 = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater2, "");
            StackSampler.onExtraCallback(layoutInflater2);
            throw null;
        }
    }

    public static final /* synthetic */ int onExtraCallback(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity, getBoolean getboolean) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            creditConsultingFunnelHandleActivity.onExtraCallback(getboolean);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallback = creditConsultingFunnelHandleActivity.onExtraCallback(getboolean);
        int i3 = getInterfaceDescriptor + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return iOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity = (CreditConsultingFunnelHandleActivity) objArr[0];
        Fragment fragment = (Fragment) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingFunnelHandleActivity.onNavigationEvent(fragment);
        int i4 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ initMiniApp onExtraCallbackWithResult(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return creditConsultingFunnelHandleActivity.IAuthTabCallback();
        }
        creditConsultingFunnelHandleActivity.IAuthTabCallback();
        throw null;
    }

    public static final /* synthetic */ CreditConsultingViewModel onNavigationEvent(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            return (CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{creditConsultingFunnelHandleActivity});
        }
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity, getBoolean getboolean) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        creditConsultingFunnelHandleActivity.onWarmupCompleted(getboolean);
        int i4 = IAuthTabCallbackStubProxy + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 67;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = creditConsultingFunnelHandleActivity.asInterface;
        int i5 = i2 + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        StackSampler stackSampler;
        CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity = (CreditConsultingFunnelHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = creditConsultingFunnelHandleActivity.asBinder.getValue();
        if (i3 != 0) {
            stackSampler = (StackSampler) value;
            int i4 = 55 / 0;
        } else {
            stackSampler = (StackSampler) value;
        }
        int i5 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return stackSampler;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity = (CreditConsultingFunnelHandleActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CreditConsultingViewModel creditConsultingViewModel = (CreditConsultingViewModel) creditConsultingFunnelHandleActivity.IAuthTabCallbackDefault.getValue();
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return creditConsultingViewModel;
    }

    public boolean ao_() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 49;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.IAuthTabCallbackStub;
        int i4 = i2 + 81;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() throws Throwable {
        int i = 2 % 2;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        getBoolean getboolean = (getBoolean) ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this})).access000().getValue();
        if (getboolean != null) {
            int i2 = IAuthTabCallbackStubProxy + 25;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            if (getboolean.onNavigationEvent()) {
                int i4 = getInterfaceDescriptor + 69;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                finish();
                return true;
            }
        }
        boolean zBg_ = super/*im.toss.base.BaseActivity*/.bg_();
        int i6 = IAuthTabCallbackStubProxy + 61;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return zBg_;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity, initSDK.onNavigationEvent onnavigationevent) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Object[] objArr = new Object[1];
        a(8 - KeyEvent.keyCodeFromString(""), 3 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{65531, 65530, 7, 7, 65530, 7, 7, 65530}, true, 112 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
        onnavigationevent.onExtraCallback(((String) objArr[0]).intern(), h5ScreenShotObserverOnChangeOpt.Companion.onNavigationEvent(creditConsultingFunnelHandleActivity.getIntent()));
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseActivity*/.onCreate(bundle);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        setContentView(((StackSampler) onExtraCallback(zzgsa.onWarmupCompleted(), 405705887, -405705885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this})).onNavigationEvent());
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        LinearLayout linearLayoutOnNavigationEvent = ((StackSampler) onExtraCallback(zzgsa.onWarmupCompleted(), 405705887, -405705885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{this})).onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnNavigationEvent, "");
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayoutOnNavigationEvent, ((StackSampler) onExtraCallback(zzgsa.onWarmupCompleted(), 405705887, -405705885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, zzgsa.onWarmupCompleted(), new Object[]{this})).onExtraCallbackWithResult, (View) null, (View) null, false, 14, (Object) null);
        int iOnWarmupCompleted4 = zzgsa.onWarmupCompleted();
        setSupportActionBar(((StackSampler) onExtraCallback(zzgsa.onWarmupCompleted(), 405705887, -405705885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted4, zzgsa.onWarmupCompleted(), new Object[]{this})).onNavigationEvent);
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        TossModule_postMessage tossModule_postMessage = (TossModule_postMessage) UIKitBaseActivity.IAuthTabCallbackStub(iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1107937773, new Object[]{this}, iIAuthTabCallback, -1107937771, iIAuthTabCallback3);
        if (tossModule_postMessage != null) {
            tossModule_postMessage.onExtraCallbackWithResult(new CreditConsultingFunnelHandleActivity$.ExternalSyntheticLambda0(this));
            int i4 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        ICustomTabsServiceDefault();
        int i6 = IAuthTabCallbackStubProxy + 15;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onNavigationEvent();
            }
            onNavigationEvent();
            throw null;
        }

        public final ViewModelProvider.onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.onNavigationEvent.getDefaultViewModelProviderFactory();
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return defaultViewModelProviderFactory;
        }
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public asBinder(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
                int i3 = 71 / 0;
            } else {
                androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback = onExtraCallback();
            }
            int i4 = onExtraCallbackWithResult + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.onNavigationEvent.getViewModelStore();
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return viewModelStore;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public onTransact(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onNavigationEvent = componentActivity;
        }

        public /* synthetic */ Object invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
                int i3 = 57 / 0;
            } else {
                androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = onWarmupCompleted + 1;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            int i = 2 % 2;
            Function0 function0 = this.onExtraCallback;
            if (function0 != null) {
                int i2 = IAuthTabCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i4 = IAuthTabCallback + 87;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                }
            }
            return this.onNavigationEvent.getDefaultViewModelCreationExtras();
        }
    }

    private static final Unit IAuthTabCallback(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
            ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{creditConsultingFunnelHandleActivity})).onExtraCallback();
            unit = Unit.INSTANCE;
            int i3 = 29 / 0;
        } else {
            int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
            ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{creditConsultingFunnelHandleActivity})).onExtraCallback();
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Fragment fragment) {
        int i = 2 % 2;
        boolean z = fragment instanceof CreditConsultingSelectCategoryFragment;
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        boolean z2 = true;
        if (!(!((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this})).onTransact().asInterface())) {
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 51;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            if (z) {
                int i5 = i2 + 105;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z2 = false;
            }
        }
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        TossModule_postMessage tossModule_postMessage = (TossModule_postMessage) UIKitBaseActivity.IAuthTabCallbackStub(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1107937773, new Object[]{this}, iIAuthTabCallback, -1107937771, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (tossModule_postMessage != null) {
            int i7 = getInterfaceDescriptor + 7;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                tossModule_postMessage.onNavigationEvent();
                if (z2) {
                    String string = getString(R.string.credit_consulting_my);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    UIKitBaseActivity.IAuthTabCallbackStub(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2027491167, new Object[]{this, string, new Function0() { // from class: im.toss.feature.credit.ui.main.consulting.CreditConsultingFunnelHandleActivity$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 35;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnExtraCallback = CreditConsultingFunnelHandleActivity.onExtraCallback(this.f$0);
                            if (i10 == 0) {
                                int i11 = 60 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    }}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2027491170, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                }
                if (z) {
                    int iOnExtraCallbackWithResult = nSetPosition.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = nSetPosition.onExtraCallbackWithResult();
                    TossModule_postMessage.onExtraCallbackWithResult(nSetPosition.onExtraCallbackWithResult(), -275632479, 275632479, nSetPosition.onExtraCallbackWithResult(), new Object[]{tossModule_postMessage, (initMiniApp) fragment}, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
                    return;
                }
                return;
            }
            tossModule_postMessage.onNavigationEvent();
            throw null;
        }
    }

    public static final class onExtraCallback extends FlowMeasureLazyPolicyExternalSyntheticLambda3.onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        onExtraCallback() {
        }

        public void onExtraCallbackWithResult(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onExtraCallbackWithResult(flowMeasureLazyPolicyExternalSyntheticLambda3, fragment);
            Object[] objArr = {CreditConsultingFunnelHandleActivity.this, fragment};
            CreditConsultingFunnelHandleActivity.onExtraCallback(zzgsa.onWarmupCompleted(), -320541011, 320541012, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), objArr);
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onWarmupCompleted(getBoolean getboolean) {
        int i = 2 % 2;
        Ripple_androidKt ripple_androidKtFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        Intrinsics.checkNotNull(ripple_androidKtFindFragmentById, "");
        Ripple_androidKt ripple_androidKt = ripple_androidKtFindFragmentById;
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = ripple_androidKt.IAuthTabCallback().IAuthTabCallbackDefault().onExtraCallback(R.navigation.navigation_credit_consulting);
        exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(onExtraCallback(getboolean));
        ripple_androidKt.IAuthTabCallback().onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
        this.asInterface = true;
        validateRelationship();
        ripple_androidKt.getChildFragmentManager().onNavigationEvent(new onExtraCallback(), false);
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16812341), 23 - View.MeasureSpec.getSize(0), 10278 - Color.blue(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 12844), View.MeasureSpec.makeMeasureSpec(0, 0) + 55, View.resolveSizeAndState(0, 0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 65;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 12843), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55, 2167 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = getIntent();
        Object obj = null;
        String stringExtra = intent != null ? intent.getStringExtra("categoryCode") : null;
        if (stringExtra == null || !(!StringsKt.isBlank(stringExtra))) {
            return;
        }
        int i4 = getInterfaceDescriptor + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Iterator it = ((List) enableReportDataOptimize.onWarmupCompleted(new Object[]{((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{this})).onTransact()}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -760994305, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 760994305)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((CreditConsultingCategory) next).onExtraCallbackWithResult(), stringExtra)) {
                obj = next;
                break;
            }
        }
        CreditConsultingCategory creditConsultingCategory = (CreditConsultingCategory) obj;
        if (creditConsultingCategory != null) {
            ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{this})).onExtraCallback(creditConsultingCategory);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int onExtraCallback(getBoolean getboolean) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (getboolean instanceof getBoolean.onTransact) {
            int i2 = IAuthTabCallbackStubProxy + 47;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return R.id.credit_consulting_select_category;
        }
        if ((getboolean instanceof getBoolean.IAuthTabCallbackStub) || Intrinsics.areEqual(getboolean, getBoolean.IAuthTabCallback.onExtraCallbackWithResult)) {
            return R.id.credit_consulting_select_date;
        }
        if (getboolean instanceof getBoolean.onExtraCallback) {
            return R.id.credit_consulting_input_content;
        }
        if (getboolean instanceof getBoolean.onExtraCallbackWithResult) {
            int i4 = R.id.credit_consulting_history;
            int i5 = IAuthTabCallbackStubProxy + 17;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }
        if (getboolean instanceof getBoolean.asBinder) {
            return R.id.credit_consulting_reservation_detail;
        }
        if (!(!(getboolean instanceof getBoolean.onNavigationEvent))) {
            return R.id.credit_consulting_history_detail;
        }
        if (!(!(getboolean instanceof getBoolean.onWarmupCompleted))) {
            return R.id.credit_consulting_confirm;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final initMiniApp IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Ripple_androidKt ripple_androidKtFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
            Intrinsics.checkNotNull(ripple_androidKtFindFragmentById, "");
            initMiniApp initminiappICustomTabsCallbackStubProxy = ripple_androidKtFindFragmentById.getChildFragmentManager().ICustomTabsCallbackStubProxy();
            if (!(initminiappICustomTabsCallbackStubProxy instanceof initMiniApp)) {
                int i3 = getInterfaceDescriptor + 111;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            initMiniApp initminiapp = initminiappICustomTabsCallbackStubProxy;
            int i5 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return initminiapp;
        }
        Ripple_androidKt ripple_androidKtFindFragmentById2 = getSupportFragmentManager().findFragmentById(R.id.container);
        Intrinsics.checkNotNull(ripple_androidKtFindFragmentById2, "");
        boolean z = ripple_androidKtFindFragmentById2.getChildFragmentManager().ICustomTabsCallbackStubProxy() instanceof initMiniApp;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = TextFieldImplKtCommonDecorationBox3ExternalSyntheticLambda4.onNavigationEvent(this, R.id.container);
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this})).access000().observe(this, new BaseActivity.IAuthTabCallbackStub(new onNavigationEvent(typographyKtExternalSyntheticLambda0OnNavigationEvent)));
        int iOnWarmupCompleted2 = zzgsa.onWarmupCompleted();
        ((CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted2, zzgsa.onWarmupCompleted(), new Object[]{this})).IAuthTabCallback_Parcel().observe(this, new BaseActivity.IAuthTabCallbackStub(new onWarmupCompleted()));
        int iOnWarmupCompleted3 = zzgsa.onWarmupCompleted();
        Object[] objArr = {(CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted3, zzgsa.onWarmupCompleted(), new Object[]{this})};
        int iOnExtraCallback = matches.onExtraCallback();
        ((LiveData) CreditConsultingViewModel.onExtraCallbackWithResult(1480574795, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), iOnExtraCallback, -1480574794, objArr)).observe(this, new BaseActivity.IAuthTabCallbackStub(new onExtraCallbackWithResult()));
        int i2 = getInterfaceDescriptor + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(CreditConsultingFunnelHandleActivity creditConsultingFunnelHandleActivity, Fragment fragment) {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        onExtraCallback(zzgsa.onWarmupCompleted(), -320541011, 320541012, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{creditConsultingFunnelHandleActivity, fragment});
    }

    private final StackSampler onNavigationEvent() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (StackSampler) onExtraCallback(zzgsa.onWarmupCompleted(), 405705887, -405705885, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this});
    }

    private final CreditConsultingViewModel setEngagementSignalsCallback() {
        int iOnWarmupCompleted = zzgsa.onWarmupCompleted();
        return (CreditConsultingViewModel) onExtraCallback(zzgsa.onWarmupCompleted(), -508154187, 508154187, zzgsa.onWarmupCompleted(), iOnWarmupCompleted, zzgsa.onWarmupCompleted(), new Object[]{this});
    }

    @Override // im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 39;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 107;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.feature.credit.ui.main.consulting.Hilt_CreditConsultingFunnelHandleActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.attachBaseContext(context);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Throwable, Unit> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public onExtraCallbackWithResult() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(Throwable th) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getParamImp.onWarmupCompleted(th, CreditConsultingFunnelHandleActivity.this, false, null, null, null, 30, null);
            int i4 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final class onNavigationEvent implements Function1<getBoolean, Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TypographyKtExternalSyntheticLambda0 onExtraCallbackWithResult;

        public onNavigationEvent(TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0) {
            this.onExtraCallbackWithResult = typographyKtExternalSyntheticLambda0;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent(getBoolean getboolean) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            getBoolean getboolean2 = getboolean;
            if (getboolean2 != null) {
                if (CreditConsultingFunnelHandleActivity.onWarmupCompleted(CreditConsultingFunnelHandleActivity.this)) {
                    int i3 = onWarmupCompleted + 37;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    this.onExtraCallbackWithResult.onNavigationEvent(CreditConsultingFunnelHandleActivity.onExtraCallback(CreditConsultingFunnelHandleActivity.this, getboolean2));
                    int i5 = onWarmupCompleted + 33;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                CreditConsultingFunnelHandleActivity.onNavigationEvent(CreditConsultingFunnelHandleActivity.this, getboolean2);
            }
        }
    }

    public static final class onWarmupCompleted implements Function1<Pair<? extends String, ? extends String>, Unit> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 35 / 0;
            }
            int i5 = onExtraCallback + 69;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context, im.toss.feature.credit.ui.main.consulting.CreditConsultingFunnelHandleActivity] */
        public final void IAuthTabCallback(Pair<? extends String, ? extends String> pair) {
            int i = 2 % 2;
            Pair<? extends String, ? extends String> pair2 = pair;
            if (CreditConsultingFunnelHandleActivity.onExtraCallbackWithResult(CreditConsultingFunnelHandleActivity.this) != null) {
                ?? r1 = CreditConsultingFunnelHandleActivity.this;
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r1, new IAuthTabCallback(pair2, (CreditConsultingFunnelHandleActivity) r1));
                int i2 = onWarmupCompleted + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = onWarmupCompleted + 11;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
