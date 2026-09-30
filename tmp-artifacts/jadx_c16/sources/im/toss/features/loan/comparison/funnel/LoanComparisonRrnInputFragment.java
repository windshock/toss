package im.toss.features.loan.comparison.funnel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.loan.comparison.funnel.LoanComparisonRrnInputFragment$;
import im.toss.features.loan.ui.R;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import im.toss.uikit.widget.textField.BaseEditText;
import im.toss.uikit.widget.textField.TextField;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DownloadStepMyPackageDownloadCallback1;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.GriverTransActivityLite1;
import o.GriverTransActivityLite2;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.NetConverter3;
import o.PageRenderReadyListener;
import o.PlayerErrorCode;
import o.ProducerSequenceFactoryExternalSyntheticLambda1;
import o.RsaUtil;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextKtExternalSyntheticLambda7;
import o.TransitionTransitionNotificationExternalSyntheticLambda1;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2;
import o.UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener;
import o.access13800;
import o.access14300;
import o.access8100;
import o.addAllCommandLine;
import o.addExtra;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.generateLink;
import o.getByteBuffer;
import o.getHostnameVerifierokhttp;
import o.getKekid;
import o.getReporter;
import o.getThisUpdate;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.mediationData;
import o.mergeParams;
import o.onCenterChanged;
import o.onPageExit;
import o.preFillDefault;
import o.r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.main.service.HappyTalkActivity;
import viva.republica.toss.network.model.loan.LoanFunnelType;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanComparisonRrnInputFragment extends Hilt_LoanComparisonRrnInputFragment {
    private static int IAuthTabCallback_Parcel;
    public static final int onExtraCallback;
    private static int onTransact;
    static final /* synthetic */ addAllCommandLine<Object>[] onWarmupCompleted;
    private boolean IAuthTabCallbackDefault;

    @Inject
    public mediationData api;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private int IAuthTabCallbackStub = R.layout.activity_comparison_input_rnn;
    private final PageRenderReadyListener onNavigationEvent = preFillDefault.IAuthTabCallback(this, onExtraCallback.onWarmupCompleted);
    private final TextKtExternalSyntheticLambda7 onExtraCallbackWithResult = new TextKtExternalSyntheticLambda7(Reflection.getOrCreateKotlinClass(DownloadStepMyPackageDownloadCallback1.class), new IAuthTabCallback(this));
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda0(this));

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        int i4 = (b * 3) + 105;
        byte[] bArr = $$a;
        int i5 = (i * 3) + 1;
        int i6 = (s * 2) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i5;
            i4 = (-i4) + i9;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i10 = bArr[i6];
            int i11 = i6;
            i9 = i4;
            i4 = i10;
            i8 = i3;
            i7 = i11;
            i4 = (-i4) + i9;
            i6 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    static {
        IAuthTabCallback_Parcel = 1;
        asBinder();
        onWarmupCompleted = new addAllCommandLine[]{new PropertyReference1Impl<>(LoanComparisonRrnInputFragment.class, "binding", "getBinding()Lim/toss/features/loan/ui/databinding/ActivityComparisonInputRnnBinding;", 0)};
        onExtraCallback = 8;
        int i = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(setDetectableSize);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
        int i3 = getInterfaceDescriptor + 65;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanComparisonRrnInputFragment, Boolean.valueOf(z)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 == 0) {
            onNavigationEvent(objArr, -1107292350, iIAuthTabCallback2, 1107292351, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3);
        } else {
            onNavigationEvent(objArr, -1107292350, iIAuthTabCallback2, 1107292351, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3);
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        int i4 = getInterfaceDescriptor + 37;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 63;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, setDetectableSize}, 966666395, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -966666390, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i3 = getInterfaceDescriptor + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setDetectableSize);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        String str = (String) onNavigationEvent(new Object[]{function1, obj}, -1894615912, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1894615916, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i3 = asInterface + 99;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loanComparisonRrnInputFragment, dialogInterface);
        int i4 = getInterfaceDescriptor + 59;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, str}, -127530359, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 127530359, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i3 = asInterface + 57;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(loanComparisonRrnInputFragment, commonModule_setLeftEdgeTouchEnabled);
        }
        onExtraCallback(loanComparisonRrnInputFragment, commonModule_setLeftEdgeTouchEnabled);
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i5) | i7);
        int i9 = i | i8 | (~(i3 | i5));
        int i10 = (~(i5 | i)) | (~(i7 | i5)) | (~(i7 | i));
        int i11 = i + i3 + i2 + (1351532378 * i6) + (1237199896 * i4);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i3) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i2) + ((-1818230784) * i6) + ((-914358272) * i4) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i3 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i2 * 406039561) + (i6 * 1283666474) + (i4 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
                IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
                int i15 = 2 % 2;
                int i16 = getInterfaceDescriptor + 35;
                asInterface = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
                loanComparisonRrnInputFragment.IAuthTabCallback(iEngagementSignalsCallbackDefault);
                Unit unit = Unit.INSTANCE;
                int i18 = getInterfaceDescriptor + 91;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                LoanComparisonRrnInputFragment loanComparisonRrnInputFragment2 = (LoanComparisonRrnInputFragment) objArr[0];
                String str = (String) objArr[1];
                int i20 = 2 % 2;
                int i21 = asInterface + 25;
                getInterfaceDescriptor = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNull(str);
                loanComparisonRrnInputFragment2.onWarmupCompleted(str);
                Unit unit2 = Unit.INSTANCE;
                int i23 = getInterfaceDescriptor + 115;
                asInterface = i23 % 128;
                int i24 = i23 % 2;
                return unit2;
        }
    }

    public static /* synthetic */ String onNavigationEvent(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(charSequence);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(charSequence);
        int i3 = getInterfaceDescriptor + 125;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(loanComparisonRrnInputFragment, dialogInterface);
        int i4 = getInterfaceDescriptor + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanComparisonRrnInputFragment, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = asInterface + 63;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = {loanComparisonRrnInputFragment, iEngagementSignalsCallbackDefault};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(objArr2, -1328894119, iIAuthTabCallback2, 1328894121, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = asInterface + 105;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanComparisonRrnInputFragment, setDetectableSize);
        int i4 = asInterface + 65;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return 1014317L;
        }
        int i3 = 19 / 0;
        return 1014317L;
    }

    public static final class IAuthTabCallback implements Function0<Bundle> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Fragment IAuthTabCallback;

        public IAuthTabCallback(Fragment fragment) {
            this.IAuthTabCallback = fragment;
        }

        public /* synthetic */ Object invoke() {
            Bundle bundleOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                bundleOnExtraCallback = onExtraCallback();
                int i3 = 1 / 0;
            } else {
                bundleOnExtraCallback = onExtraCallback();
            }
            int i4 = onWarmupCompleted + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return bundleOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Bundle onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Bundle arguments = this.IAuthTabCallback.getArguments();
            if (arguments == null) {
                throw new IllegalStateException("Fragment " + this.IAuthTabCallback + " has null arguments");
            }
            int i4 = onExtraCallback + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return arguments;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ TdsDialogV1 onExtraCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TdsDialogV1 tdsDialogV1ICustomTabsCallbackDefault = loanComparisonRrnInputFragment.ICustomTabsCallbackDefault();
        int i4 = getInterfaceDescriptor + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return tdsDialogV1ICustomTabsCallbackDefault;
    }

    public static final /* synthetic */ void onExtraCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonRrnInputFragment.onExtraCallback(str);
        int i4 = getInterfaceDescriptor + 3;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ TdsDialogV1 onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            loanComparisonRrnInputFragment.ICustomTabsCallbackStubProxy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsDialogV1 tdsDialogV1ICustomTabsCallbackStubProxy = loanComparisonRrnInputFragment.ICustomTabsCallbackStubProxy();
        int i3 = getInterfaceDescriptor + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return tdsDialogV1ICustomTabsCallbackStubProxy;
    }

    public static final /* synthetic */ void onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {loanComparisonRrnInputFragment, str};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (i3 != 0) {
            onNavigationEvent(objArr, -925434667, iIAuthTabCallback2, 925434673, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3);
            throw null;
        }
        onNavigationEvent(objArr, -925434667, iIAuthTabCallback2, 925434673, iIAuthTabCallback4, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = asInterface + 107;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loanComparisonRrnInputFragment, Boolean.valueOf(z)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(objArr, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = asInterface + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    public Map<String, Object> getScreenParams() {
        String str;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super.getScreenParams();
        if (!onActivityLayout().onExtraCallback()) {
            str = BizSceneNavigateManager.KEY_DEFAULT;
        } else {
            int i4 = asInterface + 19;
            int i5 = i4 % 128;
            getInterfaceDescriptor = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 43;
            asInterface = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 5;
            }
            str = "savedata";
        }
        screenParams.put("prescreen_type", str);
        return screenParams;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i5 = 34 / 0;
        }
        return i4;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, getReporter> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onNavigationEvent + 85;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 51 / 0;
            }
        }

        onExtraCallback() {
            super(1, getReporter.class, "bind", "bind(Landroid/view/View;)Lim/toss/features/loan/ui/databinding/ActivityComparisonInputRnnBinding;", 0);
        }

        public final getReporter IAuthTabCallback(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            getReporter getreporterIAuthTabCallback = getReporter.IAuthTabCallback(view);
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getreporterIAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getReporter getreporterIAuthTabCallback = IAuthTabCallback((View) obj);
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getreporterIAuthTabCallback;
        }
    }

    private final getReporter onMessageChannelReady() {
        PageRenderReadyListener pageRenderReadyListener;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            pageRenderReadyListener = this.onNavigationEvent;
            addallcommandline = onWarmupCompleted[1];
        } else {
            pageRenderReadyListener = this.onNavigationEvent;
            addallcommandline = onWarmupCompleted[0];
        }
        getReporter getreporterOnNavigationEvent = pageRenderReadyListener.onNavigationEvent(this, addallcommandline);
        int i3 = asInterface + 89;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            return getreporterOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final DownloadStepMyPackageDownloadCallback1 onActivityLayout() {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DownloadStepMyPackageDownloadCallback1 downloadStepMyPackageDownloadCallback1 = (DownloadStepMyPackageDownloadCallback1) this.onExtraCallbackWithResult.getValue();
        int i3 = getInterfaceDescriptor + 117;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return downloadStepMyPackageDownloadCallback1;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseEditText baseEditTextIAuthTabCallback;
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getReporter getreporterOnMessageChannelReady = loanComparisonRrnInputFragment.onMessageChannelReady();
        if (getreporterOnMessageChannelReady != null) {
            int i4 = asInterface + 75;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                TextField textField = getreporterOnMessageChannelReady.onNavigationEvent;
                throw null;
            }
            TextField textField2 = getreporterOnMessageChannelReady.onNavigationEvent;
            if (textField2 != null && (baseEditTextIAuthTabCallback = textField2.IAuthTabCallback()) != null) {
                baseEditTextIAuthTabCallback.setEnabled(!zBooleanValue);
                int i5 = getInterfaceDescriptor + 77;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            FragmentActivity activity = loanComparisonRrnInputFragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda1(loanComparisonRrnInputFragment, zBooleanValue));
                int i3 = getInterfaceDescriptor + 13;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            }
            loanComparisonRrnInputFragment.IAuthTabCallbackDefault = zBooleanValue;
            return null;
        }
        loanComparisonRrnInputFragment.getActivity();
        obj.hashCode();
        throw null;
    }

    public final mediationData IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        mediationData mediationdata = this.api;
        if (mediationdata == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 3;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return mediationdata;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onPostMessage();
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int i4 = asInterface + 83;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            onNavigationEvent(new Object[]{this, false}, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        } else {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            onNavigationEvent(new Object[]{this, false}, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        }
        int i3 = asInterface + 39;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = asInterface + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.base.BaseFragment*/.onDestroyView();
        dismissLoadingIndicator();
        int i4 = asInterface + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
    }

    public View getFocusableInput() {
        int i = 2 % 2;
        getReporter getreporterOnMessageChannelReady = onMessageChannelReady();
        if (getreporterOnMessageChannelReady != null) {
            int i2 = getInterfaceDescriptor + 103;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            TextField textField = getreporterOnMessageChannelReady.onNavigationEvent;
            if (textField != null) {
                int i4 = getInterfaceDescriptor + 119;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    return textField.IAuthTabCallback();
                }
                textField.IAuthTabCallback();
                throw null;
            }
        }
        int i5 = getInterfaceDescriptor + 43;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (String) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final String onExtraCallbackWithResult(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            return charSequence.toString();
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        charSequence.toString();
        throw null;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private final deserializeUriNullableCollection onPostMessage() {
        int i = 2 % 2;
        getReporter getreporterOnMessageChannelReady = onMessageChannelReady();
        Object obj = null;
        if (getreporterOnMessageChannelReady == null) {
            int i2 = asInterface + 107;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        getByteBuffer getbytebufferOnExtraCallback = RxTextView.IAuthTabCallback(getreporterOnMessageChannelReady.onNavigationEvent.IAuthTabCallback()).onExtraCallbackWithResult().onExtraCallback(RxUtils.onWarmupCompleted((Object) null));
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallback, "");
        getByteBuffer getbytebufferAsInterface = getbytebufferOnExtraCallback.onExtraCallback(50L, TimeUnit.MILLISECONDS).asInterface(new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda10(new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda9()));
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsInterface, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferAsInterface.onExtraCallbackWithResult(NetConverter3.onExtraCallback()).IAuthTabCallback(new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda12(new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda11(this)));
        int i4 = asInterface + 91;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeurinullablecollectionIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getReporter getreporterOnMessageChannelReady = loanComparisonRrnInputFragment.onMessageChannelReady();
        if (getreporterOnMessageChannelReady == null) {
            return null;
        }
        Typography3 typography3 = getreporterOnMessageChannelReady.IAuthTabCallbackStub;
        String string = loanComparisonRrnInputFragment.getString(R.string.loan_rrn_input_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        typography3.setText(mergeParams.asBinder(string));
        BaseEditText baseEditTextIAuthTabCallback = getreporterOnMessageChannelReady.onWarmupCompleted.IAuthTabCallback();
        baseEditTextIAuthTabCallback.setEnabled(false);
        String strICustomTabsCallback = addExtra.ICustomTabsCallback(PlayerErrorCode.onWarmupCompleted);
        if (strICustomTabsCallback == null) {
            int i4 = getInterfaceDescriptor + 79;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            strICustomTabsCallback = "";
        }
        baseEditTextIAuthTabCallback.setText(strICustomTabsCallback);
        baseEditTextIAuthTabCallback.setTextSize(2, 24.0f);
        baseEditTextIAuthTabCallback.setInputType(2);
        BaseEditText baseEditTextIAuthTabCallback2 = getreporterOnMessageChannelReady.onNavigationEvent.IAuthTabCallback();
        baseEditTextIAuthTabCallback2.setText("");
        baseEditTextIAuthTabCallback2.setTextSize(2, 24.0f);
        baseEditTextIAuthTabCallback2.setInputType(2);
        baseEditTextIAuthTabCallback2.setTransformationMethod(new TransitionTransitionNotificationExternalSyntheticLambda1());
        baseEditTextIAuthTabCallback2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        SecureKeyboardView secureKeyboardView = getreporterOnMessageChannelReady.onTransact;
        Intrinsics.checkNotNullExpressionValue(secureKeyboardView, "");
        getThisUpdate.onExtraCallback(baseEditTextIAuthTabCallback2, secureKeyboardView, false, (Function1) null, 6, (Object) null);
        SecureKeyboardView secureKeyboardView2 = getreporterOnMessageChannelReady.onTransact;
        Resources resources = loanComparisonRrnInputFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        secureKeyboardView2.setDarkMode(generateLink.IAuthTabCallback(resources));
        Unit unit = Unit.INSTANCE;
        int i6 = getInterfaceDescriptor + 41;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 32 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        float f;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onTransact)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 35125), 23 - View.getDefaultSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 12844);
                    int i7 = 55 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i8 = 2168 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[0] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, i7, i8, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 43;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i11 = $10 + 95;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 5 / 5;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i13 = $10 + 109;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char c = (char) (12844 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)));
                    int i15 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 54;
                    int iResolveSizeAndState = 2167 - View.resolveSizeAndState(0, 0, 0);
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, i15, iResolveSizeAndState, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                f = 0.0f;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private final Unit onWarmupCompleted(String str) {
        int i = 2 % 2;
        getReporter getreporterOnMessageChannelReady = onMessageChannelReady();
        if (getreporterOnMessageChannelReady == null) {
            return null;
        }
        if (str.length() == 7) {
            int i2 = getInterfaceDescriptor + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.toIntOrNull(str) != null && !this.IAuthTabCallbackDefault) {
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                onNavigationEvent(new Object[]{this, true}, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                Object[] objArr = {getreporterOnMessageChannelReady.onWarmupCompleted};
                int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Editable editable = (Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, objArr, -450491624, iIAuthTabCallback2, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                Object[] objArr2 = {getreporterOnMessageChannelReady.onNavigationEvent};
                int iIAuthTabCallback3 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
                Editable editable2 = (Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, objArr2, -450491624, iIAuthTabCallback3, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
                StringBuilder sb = new StringBuilder();
                sb.append((Object) editable);
                sb.append((Object) editable2);
                IAuthTabCallbackStub(sb.toString());
                int i4 = getInterfaceDescriptor + 73;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallbackStub(String str) {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this, str, (access13800) null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        Object[] objArr = {onCenterChanged.IAuthTabCallback, str};
        onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1757845090, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1757845097, objArr);
        if (!asInterface().onMessageChannelReady()) {
            onUnminimized();
            return;
        }
        int i2 = asInterface + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault();
        int i4 = asInterface + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }

    private final TdsDialogV1 ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onMessageChannelReady();
            obj.hashCode();
            throw null;
        }
        getReporter getreporterOnMessageChannelReady = onMessageChannelReady();
        if (getreporterOnMessageChannelReady == null) {
            return null;
        }
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, false}, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        getreporterOnMessageChannelReady.onNavigationEvent.IAuthTabCallback().setText("");
        ConvertByteArrayToFloatArray.onExtraCallback(1237653L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TdsDialogV1 tdsDialogV1OnExtraCallbackWithResult = CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda7(this));
        int i3 = getInterfaceDescriptor + 67;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return tdsDialogV1OnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___705c39360b));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___ecef0756df));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 13;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final TdsDialogV1 ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getReporter getreporterOnMessageChannelReady = onMessageChannelReady();
            if (getreporterOnMessageChannelReady == null) {
                int i3 = getInterfaceDescriptor + 49;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            onNavigationEvent(new Object[]{this, false}, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            getreporterOnMessageChannelReady.onNavigationEvent.IAuthTabCallback().setText("");
            ConvertByteArrayToFloatArray.onExtraCallback(1237655L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            return CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda3(this));
        }
        onMessageChannelReady();
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 10, new char[]{65532, 7, 65522, 1, 2, 7, 7, '\b', 65525, 65528, 65535, 7}, true, Gravity.getAbsoluteGravity(0, 0) + 131, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___c593954a0e));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 5;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1237739L, false, (String) null, (Map) null, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda8(loanComparisonRrnInputFragment), 14, (Object) null);
        HappyTalkActivity.onNavigationEvent onnavigationevent = HappyTalkActivity.Companion;
        Context contextRequireContext = loanComparisonRrnInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        loanComparisonRrnInputFragment.startActivity(HappyTalkActivity.onNavigationEvent.onExtraCallbackWithResult(onnavigationevent, contextRequireContext, (String) null, 2, (Object) null));
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, 9 - Drawable.resolveOpacity(0, 0), new char[]{65532, 7, 65522, 1, 2, 7, 7, '\b', 65525, 65528, 65535, 7}, true, 131 - Drawable.resolveOpacity(0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), loanComparisonRrnInputFragment.getString(viva.republica.toss.R.string.close));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1237739L, false, (String) null, (Map) null, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda2(loanComparisonRrnInputFragment), 14, (Object) null);
        loanComparisonRrnInputFragment.extraCallback();
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___c38c4493d4));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___00084e4e79));
        String string = loanComparisonRrnInputFragment.getString(R.string.loan_comparison_funnel___c593954a0e);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda4(loanComparisonRrnInputFragment), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = loanComparisonRrnInputFragment.getString(viva.republica.toss.R.string.close);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda5(loanComparisonRrnInputFragment), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 11;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return unit;
    }

    private final void onUnminimized() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(null), 3, (Object) null);
        int i2 = asInterface + 83;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = LoanComparisonRrnInputFragment.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallback + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallback + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
            } else {
                ResultKt.onNavigationEvent(obj);
                getHostnameVerifierokhttp.onNavigationEvent(LoanComparisonRrnInputFragment.this, (String) null, 1, (Object) null);
                LoanFunnelNavigatorViewModel loanFunnelNavigatorViewModelOnTransact = LoanComparisonRrnInputFragment.this.onTransact();
                this.label = 1;
                objOnExtraCallback = loanFunnelNavigatorViewModelOnTransact.onExtraCallback(this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = LoanComparisonRrnInputFragment.this;
            if (Result.onNavigationEvent(objOnExtraCallback)) {
                LoanComparisonRrnInputFragment.onWarmupCompleted(loanComparisonRrnInputFragment, ((ProducerSequenceFactoryExternalSyntheticLambda1) objOnExtraCallback).onExtraCallbackWithResult());
            }
            LoanComparisonRrnInputFragment loanComparisonRrnInputFragment2 = LoanComparisonRrnInputFragment.this;
            if (Result.exceptionOrNull-impl(objOnExtraCallback) != null) {
                loanComparisonRrnInputFragment2.ICustomTabsCallback();
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanComparisonRrnInputFragment loanComparisonRrnInputFragment = (LoanComparisonRrnInputFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = loanComparisonRrnInputFragment.asBinder;
        r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback = UniformLocalAuthDialogExtensionImplUniformLocalAuthDialogClickNameListener.IAuthTabCallback.IAuthTabCallback();
        Context contextRequireContext = loanComparisonRrnInputFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        iEngagementSignalsCallback_Parcel.onNavigationEvent(r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.onExtraCallback(r8lambda5db4_qmk9ixx9gsf5y7yv3rg7qyIAuthTabCallback, contextRequireContext, str, true, (GriverTransActivityLite1) null, (GriverTransActivityLite2) null, (UniformLocalAuthDialogExtensionImplUniformLocalAuthDialog2) null, loanComparisonRrnInputFragment.onTransact().ICustomTabsCallback(), "loan_comparison", (String) null, (List) null, false, false, (r8lambda5dB4_Qmk9IXx9gSF5Y7YV3rg7QY.IAuthTabCallback) null, 7992, (Object) null));
        int i4 = getInterfaceDescriptor + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void IAuthTabCallback(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        dismissLoadingIndicator();
        int iOnNavigationEvent = iEngagementSignalsCallbackDefault.onNavigationEvent();
        if (iOnNavigationEvent == -1) {
            ICustomTabsCallbackStub();
            return;
        }
        if (iOnNavigationEvent == 500) {
            onRelationshipValidationResult();
            return;
        }
        int i2 = getInterfaceDescriptor + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1236945L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        int i4 = getInterfaceDescriptor + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(5 - ((byte) KeyEvent.getModifierMetaStateMask()), 6 - TextUtils.indexOf("", ""), new char[]{5, 65533, 6, 4, 65526, 3}, true, 133 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "success");
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void ICustomTabsCallbackStub() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1236943L, false, (String) null, (Map) null, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda13(), 14, (Object) null);
        asInterface().onExtraCallback("");
        asInterface().onNavigationEvent(Long.valueOf(onTransact().IAuthTabCallback()));
        ConvertByteArrayToFloatArray.onWarmupCompleted("loan_comparison_verification_complete", false, (String) null, (List) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("category", "loan_comparison_examine")), (Function1) null, 46, (Object) null);
        IAuthTabCallbackDefault();
        int i2 = asInterface + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 89;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(6 - Color.green(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, new char[]{5, 65533, 6, 4, 65526, 3}, true, 132 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), "fail");
        setDetectableSize.onExtraCallback("error_code", 500);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 11;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    private final void onRelationshipValidationResult() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1236943L, false, (String) null, (Map) null, new LoanComparisonRrnInputFragment$.ExternalSyntheticLambda6(), 14, (Object) null);
        ICustomTabsCallback();
        int i2 = getInterfaceDescriptor + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            LoanFunnelType loanFunnelTypeAsInterface = asInterface().asInterface();
            Object[] objArr = {RsaUtil.onNavigationEvent, onActivityLayout().IAuthTabCallback()};
            int iOnExtraCallback = getKekid.onExtraCallback();
            int iOnExtraCallback2 = getKekid.onExtraCallback();
            JsonObject jsonObject = (JsonObject) RsaUtil.IAuthTabCallback(getKekid.onExtraCallback(), iOnExtraCallback, getKekid.onExtraCallback(), objArr, -1025874369, 1025874369, iOnExtraCallback2);
            if (loanFunnelTypeAsInterface != LoanFunnelType.MANUAL) {
                onTransact().onExtraCallbackWithResult(jsonObject, loanFunnelTypeAsInterface);
                int i3 = asInterface + 29;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            onTransact().onRelationshipValidationResult();
            int i4 = getInterfaceDescriptor + 33;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        asInterface().asInterface();
        Object[] objArr2 = {RsaUtil.onNavigationEvent, onActivityLayout().IAuthTabCallback()};
        int iOnExtraCallback3 = getKekid.onExtraCallback();
        int iOnExtraCallback4 = getKekid.onExtraCallback();
        LoanFunnelType loanFunnelType = LoanFunnelType.MANUAL;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, setDetectableSize}, 1924430036, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1924430027, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, iEngagementSignalsCallbackDefault}, 498421252, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -498421244, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final void onExtraCallbackWithResult(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, boolean z) {
        Object[] objArr = {loanComparisonRrnInputFragment, Boolean.valueOf(z)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(objArr, -1107292350, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1107292351, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final String onWarmupCompleted(Function1 function1, Object obj) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (String) onNavigationEvent(new Object[]{function1, obj}, -1894615912, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1894615916, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, String str) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, str}, -127530359, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 127530359, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final Unit onMinimized() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{this}, -307786037, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 307786040, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void IAuthTabCallback(String str) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(new Object[]{this, str}, -925434667, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 925434673, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, setDetectableSize}, 966666395, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -966666390, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        onNavigationEvent(objArr, 2021920703, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -2021920696, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(LoanComparisonRrnInputFragment loanComparisonRrnInputFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (Unit) onNavigationEvent(new Object[]{loanComparisonRrnInputFragment, iEngagementSignalsCallbackDefault}, -1328894119, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1328894121, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    static void asBinder() {
        onTransact = 478308927;
    }
}
