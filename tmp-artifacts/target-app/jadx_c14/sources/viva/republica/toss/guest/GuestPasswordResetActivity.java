package viva.republica.toss.guest;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import io.opentelemetry.sdk.metrics.SdkMeterProvider$;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CERT_GetPublicKeyAlgorithm;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.GeckoHubImp;
import o.HexEncoder;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IndicatorView;
import o.LifecyclesKtawaitStarted21;
import o.LoadInfo1;
import o.MapConverter;
import o.NetConverter3;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UST_CMP_IssueCertificate;
import o.UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.addPolicy;
import o.checkDeviceBrand;
import o.checkNavigationBarBySystemProperties;
import o.clearTid;
import o.continueWhenFinished;
import o.createPaints;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.disableImageViewPreallocationAndroid;
import o.enableViewCulling;
import o.findResAndMsg;
import o.fixMappingOfEventPrioritiesBetweenFabricAndReact;
import o.fixTextClippingAndroid15useBoundsForWidth;
import o.fuseboxEnabledRelease;
import o.getBacktraceNoteList;
import o.getJSModule;
import o.getLastVisiblePosition;
import o.getLogUploadURLMap;
import o.getNameFromAnnotation;
import o.getNavigationBar;
import o.getPackageType;
import o.getSignForPKCS7V2;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.send;
import o.setFabricUIManager;
import o.setGridCheckStatus;
import o.setRandomHost;
import o.setVideoDuration;
import o.setVisitUrl;
import o.useSharedAnimatedBackend;
import o.writeRaw;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.CreatePasswordActivity;
import viva.republica.toss.guest.GuestPasswordResetActivity$;
import viva.republica.toss.guest.certify.CertifyGuestActivity;
import viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment;
import viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment;
import viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.password.reset.PasswordResetGuideFragment;
import viva.republica.toss.verify.account.AccountInputFragment;
import viva.republica.toss.verify.account.AccountVerificationBankListFragment;
import viva.republica.toss.verify.account.BankAccountOtpVerificationFragment;
import viva.republica.toss.verify.account.BaseOtpVerificationFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GuestPasswordResetActivity extends Hilt_GuestPasswordResetActivity implements PasswordResetGuideFragment.onExtraCallbackWithResult, AccountVerificationBankListFragment.onExtraCallbackWithResult, AccountInputFragment.onWarmupCompleted, BaseOtpVerificationFragment.onWarmupCompleted, BaseOtpVerificationFragment.onNavigationEvent, VerifyGuestUssCardIntroFragment.onExtraCallback, VerifyGuestUssCardPasswordFragment.onNavigationEvent, VerifyGuestUssCardCvcFragment.IAuthTabCallback {
    public static final onExtraCallbackWithResult Companion;
    private static int ICustomTabsCallbackDefault;
    private static byte[] ICustomTabsCallbackStub;
    private static int ICustomTabsCallbackStubProxy;
    private static char ICustomTabsCallback_Parcel;
    private static char ICustomTabsService;
    public static final int asInterface;
    private static char extraCommand;
    private static short[] isEngagementSignalsApiAvailable;
    private static char mayLaunchUrl;
    private static int newAuthTabSession;
    private static int onUnminimized;
    private useSharedAnimatedBackend IAuthTabCallbackDefault;
    private Long IAuthTabCallbackStubProxy;
    private boolean ICustomTabsCallback;

    @Inject
    public setGridCheckStatus accountVerificationFragmentFactory;
    private boolean asBinder;
    private boolean extraCallback;
    private long extraCallbackWithResult;

    @Inject
    public setVideoDuration kftcPasswordIntent;
    private String onActivityLayout;
    private String onActivityResized;
    private String onMessageChannelReady;
    private fuseboxEnabledRelease onMinimized;
    private BaseOtpVerificationFragment onPostMessage;
    private getPackageType onRelationshipValidationResult;

    @Inject
    public fixMappingOfEventPrioritiesBetweenFabricAndReact otpVerificationExceptionHandler;
    private getLogUploadURLMap readTypedObject;

    @Inject
    public getLastVisiblePosition teensSelfieIntent;

    @Inject
    public LoadInfo1 verifyIntent;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int postMessage = 0;
    private static int newSession = 0;
    private static int prefetch = 1;
    private String IAuthTabCallbackStub = "";
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onTransact(this));
    private final Lazy writeTypedObject = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(GuestPasswordResetViewModel.class), new IAuthTabCallbackStub(this), new asInterface(this), new asBinder(null, this));
    private final IEngagementSignalsCallback_Parcel<Intent> access000 = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda32
        public final Object invoke(Object obj) {
            return GuestPasswordResetActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> getInterfaceDescriptor = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda33
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (IEngagementSignalsCallbackDefault) obj};
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1836359579, iOnExtraCallbackWithResult2, -1836359562);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> access100 = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda34
        public final Object invoke(Object obj) {
            return GuestPasswordResetActivity.onNavigationEvent(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static final class IAuthTabCallbackStubProxy extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStubProxy(access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuestPasswordResetActivity.onExtraCallback(GuestPasswordResetActivity.this, null, null, this);
        }
    }

    static final class access100 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        access100(access13800<? super access100> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{GuestPasswordResetActivity.this, null, this}, zzmr.onExtraCallbackWithResult(), 1689672785, zzmr.onExtraCallbackWithResult(), -1689672764);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuestPasswordResetActivity.onExtraCallback(GuestPasswordResetActivity.this, (fuseboxEnabledRelease) null, (access13800) this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = viva.republica.toss.guest.GuestPasswordResetActivity.$$a
            int r8 = r8 * 4
            int r8 = 115 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.$$c(int, byte, byte):java.lang.String");
    }

    static {
        newAuthTabSession = 1;
        IEngagementSignalsCallback_Parcel();
        Companion = new onExtraCallbackWithResult(null);
        asInterface = 8;
        int i = postMessage + 111;
        newAuthTabSession = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 21;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(guestPasswordResetActivity, setDetectableSize);
        int i4 = newSession + 13;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = prefetch + 125;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, setDetectableSize);
        int i4 = newSession + 13;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, String str, String str2, String str3, boolean z, int i, String str4, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = prefetch + 53;
        newSession = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(guestPasswordResetActivity, str, str2, str3, z, i, str4, setDetectableSize);
        }
        onExtraCallback(guestPasswordResetActivity, str, str2, str3, z, i, str4, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 85;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(guestPasswordResetActivity, setDetectableSize);
        int i4 = prefetch + 43;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 55;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(guestPasswordResetActivity, checknavigationbarbysystemproperties, function1, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(guestPasswordResetActivity, checknavigationbarbysystemproperties, function1, setDetectableSize);
        int i3 = prefetch + 83;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, getJSModule getjsmodule) {
        int i = 2 % 2;
        int i2 = prefetch + 77;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, getjsmodule}, iOnExtraCallbackWithResult, -389846804, iOnExtraCallbackWithResult2, 389846812);
        }
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 21;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(guestPasswordResetActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        int i5 = newSession + 45;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 49;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = newSession + 71;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 49;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, -621247837, iOnExtraCallbackWithResult2, 621247857);
        int i4 = newSession + 101;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 53;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(guestPasswordResetActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return typedObject;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 45;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        access000(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = prefetch + 5;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 57;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, deserializeurinullablecollection}, iOnExtraCallbackWithResult, -1603827201, iOnExtraCallbackWithResult2, 1603827207);
        int i4 = newSession + 1;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 47;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestPasswordResetActivity, iEngagementSignalsCallbackDefault);
        int i4 = newSession + 79;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asBinder(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 9;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(guestPasswordResetActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = prefetch + 15;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = prefetch + 19;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 121;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = newSession + 123;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 29;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(guestPasswordResetActivity);
        }
        asInterface(guestPasswordResetActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 43;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestPasswordResetActivity, th);
        int i4 = prefetch + 59;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 65;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(guestPasswordResetActivity, function1, setDetectableSize);
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 117;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(guestPasswordResetActivity, iEngagementSignalsCallbackDefault);
        int i4 = newSession + 49;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 1;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(guestPasswordResetActivity, setDetectableSize);
        int i4 = newSession + 95;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 85;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {guestPasswordResetActivity};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        if (i3 == 0) {
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1273409819, iOnExtraCallbackWithResult2, -1273409809);
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1273409819, iOnExtraCallbackWithResult3, -1273409809);
        int i4 = newSession + 101;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 39;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = newSession + 107;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetch + 85;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        int i4 = prefetch + 61;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 9;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(str, guestPasswordResetActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, guestPasswordResetActivity, setDetectableSize);
        int i3 = newSession + 97;
        prefetch = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = prefetch + 115;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{function1, setDetectableSize}, iOnExtraCallbackWithResult, -1097258449, iOnExtraCallbackWithResult2, 1097258458);
        }
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, fuseboxEnabledRelease fuseboxenabledrelease, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 73;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(guestPasswordResetActivity, fuseboxenabledrelease, setDetectableSize);
        }
        IAuthTabCallback(guestPasswordResetActivity, fuseboxenabledrelease, setDetectableSize);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = newSession + 91;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(guestPasswordResetActivity);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = prefetch + 37;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled);
        int i4 = newSession + 81;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuestPasswordResetActivity guestPasswordResetActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = newSession + 115;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(guestPasswordResetActivity, th);
        int i4 = prefetch + 77;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(GuestPasswordResetActivity guestPasswordResetActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = prefetch + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallbackWithResult, -1764669535, iOnExtraCallbackWithResult2, 1764669557);
        int i4 = newSession + 59;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 95;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = newSession + 117;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = (~(i4 | i3)) | i8;
        int i10 = (~(i3 | (~i6))) | (~((~i4) | i7)) | i8;
        int i11 = i7 | i4 | i6;
        int i12 = i4 + i6 + i5 + (1050315579 * i2) + (2086215248 * i);
        int i13 = i12 * i12;
        int i14 = (i4 * (-1156115713)) + 1671168000 + ((-1156115713) * i6) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i5) + ((-1303117824) * i2) + (314572800 * i) + (431423488 * i13);
        int i15 = ((i4 * (-961373039)) - 1316831794) + (i6 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i5 * (-961372049)) + (i2 * 755842709) + (i * (-1858722640)) + (i13 * (-2040987648));
        switch (i14 + (i15 * i15 * 1361641472)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return access100(objArr);
            case 11:
                return access000(objArr);
            case 12:
                GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
                fuseboxEnabledRelease fuseboxenabledrelease = (fuseboxEnabledRelease) objArr[1];
                int i16 = 2 % 2;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(guestPasswordResetActivity), (CoroutineContext) null, (setRandomHost) null, guestPasswordResetActivity.new access000(fuseboxenabledrelease, null), 3, (Object) null);
                int i17 = newSession + 55;
                prefetch = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 13:
                return IAuthTabCallback_Parcel(objArr);
            case 14:
                return IAuthTabCallbackStubProxy(objArr);
            case 15:
                return getInterfaceDescriptor(objArr);
            case 16:
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
                int i19 = 2 % 2;
                int i20 = prefetch + 125;
                newSession = i20 % 128;
                int i21 = i20 % 2;
                Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
                Object[] objArr2 = new Object[1];
                a((short) (49 - TextUtils.indexOf("", "")), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1765669126) + (Process.myPid() >> 22), (-1481759713) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (-116) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                mapOnExtraCallback.put(((String) objArr2[0]).intern(), "onboarding");
                setDetectableSize.onExtraCallback().put("requester_code", "TS-USI");
                setDetectableSize.onExtraCallback().put("start_auto_yn", "N");
                int i22 = prefetch + 7;
                newSession = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return writeTypedObject(objArr);
            case 21:
                return extraCallbackWithResult(objArr);
            case 22:
                return onMinimized(objArr);
            case 23:
                String str = (String) objArr[0];
                SetDetectableSize setDetectableSize2 = (SetDetectableSize) objArr[1];
                int i24 = 2 % 2;
                int i25 = newSession + 29;
                prefetch = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize2, "");
                Map mapOnExtraCallback2 = setDetectableSize2.onExtraCallback();
                Object[] objArr3 = new Object[1];
                a((short) (61 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) - 1765669074, (-1481759712) - (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 118, objArr3);
                mapOnExtraCallback2.put(((String) objArr3[0]).intern(), str);
                Unit unit = Unit.INSTANCE;
                int i27 = newSession + 53;
                prefetch = i27 % 128;
                int i28 = i27 % 2;
                return unit;
            default:
                return onExtraCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = prefetch + 43;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{str, setDetectableSize}, iOnExtraCallbackWithResult, -802546911, iOnExtraCallbackWithResult2, 802546934);
        int i4 = newSession + 115;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th, GuestPasswordResetActivity guestPasswordResetActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = newSession + 23;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{th, guestPasswordResetActivity, dialogInterface}, iOnExtraCallbackWithResult, -466341272, iOnExtraCallbackWithResult2, 466341279);
        }
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = newSession + 29;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1, setDetectableSize);
        int i4 = newSession + 11;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, String str, long j, String str2, String str3, String str4, String str5, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = newSession + 33;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestPasswordResetActivity, str, j, str2, str3, str4, str5, z, i);
        int i5 = newSession + 35;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 65;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(guestPasswordResetActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        int i5 = newSession + 17;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = prefetch + 71;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, deserializeurinullablecollection}, iOnExtraCallbackWithResult, -52506677, iOnExtraCallbackWithResult2, 52506679);
        int i4 = newSession + 43;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, getJSModule getjsmodule) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 61;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(guestPasswordResetActivity, getjsmodule);
        int i4 = newSession + 13;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(guestPasswordResetActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return unitExtraCallbackWithResult;
    }

    public void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = prefetch + 117;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = newSession + 53;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = prefetch + 53;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return -1L;
    }

    public boolean onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = newSession + 53;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = i3 != 0;
        int i4 = newSession + 115;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public boolean updateVisuals() {
        int i = 2 % 2;
        int i2 = prefetch + 69;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public void writeTypedList() {
        int i = 2 % 2;
        int i2 = prefetch + 77;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
    }

    public static final class onTransact implements Function0<CERT_GetPublicKeyAlgorithm> {
        final /* synthetic */ Activity onWarmupCompleted;

        public onTransact(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetPublicKeyAlgorithm invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetPublicKeyAlgorithm.onNavigationEvent(layoutInflater);
        }
    }

    public static final class IAuthTabCallbackDefault<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public IAuthTabCallbackDefault(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<getJSModule> apply(writeRaw<BaseApiResponse<getJSModule>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda1(new Function1<BaseApiResponse<getJSModule>, deserializeIp<? extends getJSModule>>() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity.IAuthTabCallbackDefault.4
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getJSModule> invoke(BaseApiResponse<getJSModule> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getJSModule.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onNavigationEvent(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<getJSModule> apply(writeRaw<BaseApiResponse<getJSModule>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda1(new Function1<BaseApiResponse<getJSModule>, deserializeIp<? extends getJSModule>>() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity.onNavigationEvent.2
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getJSModule> invoke(BaseApiResponse<getJSModule> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getJSModule.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onWarmupCompleted;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class asInterface implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public asInterface(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = newSession + 93;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        boolean z = guestPasswordResetActivity.extraCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 123;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return z;
    }

    public static final /* synthetic */ long asBinder(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = newSession + 93;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        long j = guestPasswordResetActivity.extraCallbackWithResult;
        int i5 = i3 + 13;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        fuseboxEnabledRelease fuseboxenabledrelease = (fuseboxEnabledRelease) objArr[1];
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = prefetch + 5;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = guestPasswordResetActivity.IAuthTabCallback(fuseboxenabledrelease, access13800Var);
        int i4 = newSession + 99;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, String str, Function1 function1, access13800 access13800Var) throws Exception {
        int i = 2 % 2;
        int i2 = prefetch + 75;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = guestPasswordResetActivity.onNavigationEvent(str, (Function1<? super SetDetectableSize, Unit>) function1, (access13800<? super Unit>) access13800Var);
        int i4 = prefetch + 87;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, fuseboxEnabledRelease fuseboxenabledrelease, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = newSession + 107;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return guestPasswordResetActivity.onNavigationEvent(fuseboxenabledrelease, (access13800<? super Unit>) access13800Var);
        }
        guestPasswordResetActivity.onNavigationEvent(fuseboxenabledrelease, (access13800<? super Unit>) access13800Var);
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, fuseboxEnabledRelease fuseboxenabledrelease) {
        int i = 2 % 2;
        int i2 = newSession + 111;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        guestPasswordResetActivity.onMinimized = fuseboxenabledrelease;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 97;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ useSharedAnimatedBackend onNavigationEvent(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = newSession + 35;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        useSharedAnimatedBackend usesharedanimatedbackend = guestPasswordResetActivity.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return usesharedanimatedbackend;
    }

    public static final /* synthetic */ IEngagementSignalsCallback_Parcel onTransact(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 89;
        newSession = i3 % 128;
        int i4 = i3 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = guestPasswordResetActivity.access100;
        int i5 = i2 + 15;
        newSession = i5 % 128;
        if (i5 % 2 == 0) {
            return iEngagementSignalsCallback_Parcel;
        }
        throw null;
    }

    public static final /* synthetic */ FrameLayout onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = newSession + 71;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout activeNotifications = guestPasswordResetActivity.getActiveNotifications();
        int i4 = newSession + 73;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return activeNotifications;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public IAuthTabCallbackStub(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallback.getViewModelStore();
        }
    }

    public static final class asBinder implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
        final /* synthetic */ Function0 onWarmupCompleted;

        public asBinder(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static final byte[] $$a = {79, -25, -14, 102};
        private static final int $$b = 239;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478308926;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, int r8, int r9) {
            /*
                byte[] r0 = viva.republica.toss.guest.GuestPasswordResetActivity.onExtraCallbackWithResult.$$a
                int r8 = r8 * 3
                int r8 = 105 - r8
                int r9 = r9 + 4
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r5 = r2
                r9 = r7
                goto L2b
            L15:
                r3 = r2
            L16:
                int r9 = r9 + 1
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2b:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onExtraCallbackWithResult.$$c(short, int, int):java.lang.String");
        }

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, boolean z, long j, Long l, String str, boolean z2, boolean z3, boolean z4, getLogUploadURLMap getloguploadurlmap, boolean z5, int i, Object obj) {
            boolean z6;
            boolean z7;
            getLogUploadURLMap getloguploadurlmap2;
            int i2 = 2 % 2;
            boolean z8 = (i & 32) != 0 ? false : z2;
            if ((i & 64) != 0) {
                int i3 = onExtraCallback + 71;
                onNavigationEvent = i3 % 128;
                z6 = i3 % 2 == 0;
            } else {
                z6 = z3;
            }
            if ((i & 128) != 0) {
                int i4 = onExtraCallback + 13;
                onNavigationEvent = i4 % 128;
                z7 = i4 % 2 == 0;
            } else {
                z7 = z4;
            }
            if ((i & 256) != 0) {
                int i5 = onExtraCallback + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                getloguploadurlmap2 = null;
            } else {
                getloguploadurlmap2 = getloguploadurlmap;
            }
            return onextracallbackwithresult.onNavigationEvent(context, z, j, l, str, z8, z6, z7, getloguploadurlmap2, (i & 512) != 0 ? false : z5);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x016a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onExtraCallbackWithResult.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        @JvmStatic
        public final Intent onNavigationEvent(@NotNull Context context, boolean z, long j, @Nullable Long l, @Nullable String str, boolean z2, boolean z3, boolean z4, @Nullable getLogUploadURLMap getloguploadurlmap, boolean z5) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) GuestPasswordResetActivity.class).putExtra("EXTRA_BLOCKED", z);
            Object[] objArr = new Object[1];
            a(Color.alpha(0) + 22, (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, new char[]{4, 65530, 0, 65535, 16, 65530, 65525, 65526, '\t', 5, 3, 65522, 16, 65528, 6, 65526, 4, 5, 16, 4, 65526, 4}, false, KeyEvent.keyCodeFromString("") + 102, objArr);
            Intent intentPutExtra2 = intentPutExtra.putExtra(((String) objArr[0]).intern(), j);
            Object[] objArr2 = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 15, (KeyEvent.getMaxKeyCode() >> 16) + 13, new char[]{17, 65534, 65527, 0, 0, 7, 65528, 17, 65523, 4, 6, '\n', 65527, 65526, 65531}, true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 101, objArr2);
            Intent intentPutExtra3 = intentPutExtra2.putExtra(((String) objArr2[0]).intern(), l).putExtra("EXTRA_REFERRER", str);
            Object[] objArr3 = new Object[1];
            a(29 - Color.green(0), 4 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{65523, 4, 6, '\n', 65527, 0, 65527, 65533, 1, 6, 17, 0, 65531, 65529, 1, 65534, 17, 65526, 65527, 65531, 65528, 65531, 4, 65527, '\b', 17, 5, 65531, 17}, true, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 100, objArr3);
            Intent intentPutExtra4 = intentPutExtra3.putExtra(((String) objArr3[0]).intern(), z2);
            Object[] objArr4 = new Object[1];
            a(22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 16, new char[]{4, 16, 6, 65535, 65525, 65526, 3, 16, 65527, 0, 6, 3, 5, 65526, 65526, 65535, 65526, '\t', 5, 3, 65522, 16, 65530}, false, 102 - View.getDefaultSize(0, 0), objArr4);
            Intent intentPutExtra5 = intentPutExtra4.putExtra(((String) objArr4[0]).intern(), z3).putExtra("EXTRA_IS_USS_CARD_VERIFICATIN_POSSIBLE", z4).putExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", (Serializable) getloguploadurlmap).putExtra("EXTRA_IS_FROM_LOGIN", z5);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra5, "");
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra5;
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 99;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 35;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (mayLaunchUrl ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ICustomTabsService);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i3) + 10;
                        int i12 = 12433 - (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iNormalizeMetaState, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (ICustomTabsCallback_Parcel ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(extraCommand)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, TextUtils.indexOf("", "") + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16013), 14 - Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 105;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Object value = guestPasswordResetActivity.onTransact.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CERT_GetPublicKeyAlgorithm cERT_GetPublicKeyAlgorithm = (CERT_GetPublicKeyAlgorithm) value;
        int i4 = newSession + 87;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return cERT_GetPublicKeyAlgorithm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final FrameLayout getActiveNotifications() {
        int i = 2 % 2;
        int i2 = newSession + 101;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        FrameLayout frameLayout = ((CERT_GetPublicKeyAlgorithm) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -2090814370, iOnExtraCallbackWithResult2, 2090814385)).onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        int i4 = prefetch + 65;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch + 49;
        viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return null;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.setVideoDuration onNavigationEvent() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r1 = r1 + 3
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            o.setVideoDuration r1 = r3.kftcPasswordIntent
            r2 = 41
            int r2 = r2 / 0
            if (r1 == 0) goto L1c
            goto L1b
        L17:
            o.setVideoDuration r1 = r3.kftcPasswordIntent
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r2
            int r1 = r1 % r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onNavigationEvent():o.setVideoDuration");
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 35;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        GuestPasswordResetViewModel guestPasswordResetViewModel = (GuestPasswordResetViewModel) guestPasswordResetActivity.writeTypedObject.getValue();
        int i4 = prefetch + 35;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return guestPasswordResetViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 85;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            BaseActivity.IAuthTabCallback(guestPasswordResetActivity, (String) null, false, 2, (Object) null);
        } else {
            BaseActivity.IAuthTabCallback(guestPasswordResetActivity, (String) null, false, 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = prefetch + 37;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return unit;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 63;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newSession + 47;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(GuestPasswordResetActivity guestPasswordResetActivity) {
        int i = 2 % 2;
        int i2 = prefetch + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        guestPasswordResetActivity.bo_();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = newSession + 21;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newSession + 41;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 123;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = newSession + 11;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asInterface(java.lang.Object[] r4) {
        /*
            r0 = 0
            r0 = r4[r0]
            viva.republica.toss.guest.GuestPasswordResetActivity r0 = (viva.republica.toss.guest.GuestPasswordResetActivity) r0
            r1 = 1
            r4 = r4[r1]
            o.getJSModule r4 = (o.getJSModule) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r2 = r2 + 61
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r3
            int r2 = r2 % r1
            boolean r2 = r4.onExtraCallbackWithResult()
            if (r2 == 0) goto L35
            int r2 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r2 = r2 + 123
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r3
            int r2 = r2 % r1
            boolean r1 = r4.onNavigationEvent()
            if (r1 == 0) goto L35
            boolean r4 = r4.IAuthTabCallback()
            if (r4 == 0) goto L35
            r0.read()
            goto L38
        L35:
            r0.write()
        L38:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.asInterface(java.lang.Object[]):java.lang.Object");
    }

    private static final Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = prefetch + 21;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        guestPasswordResetActivity.write();
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 63;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(final GuestPasswordResetActivity guestPasswordResetActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallback()) {
            int i2 = prefetch + 113;
            newSession = i2 % 128;
            if (i2 % 2 == 0) {
                return Unit.INSTANCE;
            }
            int i3 = 53 / 0;
            return Unit.INSTANCE;
        }
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == 1000) {
            int i4 = prefetch + 67;
            newSession = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = guestPasswordResetActivity.extraCallback;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (guestPasswordResetActivity.extraCallback) {
                int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
                onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult3, -347993396, iOnExtraCallbackWithResult4, 347993415);
            } else {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
                Object[] objArr = new Object[1];
                a((short) (76 - ExpandableListView.getPackedPositionType(0L)), (byte) (Process.myTid() >> 22), (-1765669117) + TextUtils.lastIndexOf("", '0', 0, 0), (-1481759722) - TextUtils.lastIndexOf("", '0'), View.getDefaultSize(0, 0) - 117, objArr);
                textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallbackWithResult(((String) objArr[0]).intern(), true, true);
                if (createPaints.IAuthTabCallback.IAuthTabCallbackStub()) {
                    guestPasswordResetActivity.write();
                    int i5 = prefetch + 115;
                    newSession = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    writeRaw<BaseApiResponse<getJSModule>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onWarmupCompleted(new setFabricUIManager(guestPasswordResetActivity.extraCallbackWithResult));
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj2) {
                            Object[] objArr2 = {this.f$0, (deserializeUriNullableCollection) obj2};
                            int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
                            int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
                            return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult5, 798870501, iOnExtraCallbackWithResult6, -798870488);
                        }
                    };
                    writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda4
                        public final void accept(Object obj2) {
                            GuestPasswordResetActivity.asInterface(function1, obj2);
                        }
                    }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda5
                        public final void run() {
                            GuestPasswordResetActivity.onExtraCallbackWithResult(this.f$0);
                        }
                    });
                    final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda6
                        public final Object invoke(Object obj2) {
                            return GuestPasswordResetActivity.IAuthTabCallback(this.f$0, (getJSModule) obj2);
                        }
                    };
                    deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda7
                        public final void accept(Object obj2) {
                            GuestPasswordResetActivity.onTransact(function12, obj2);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda8
                        public final Object invoke(Object obj2) {
                            return GuestPasswordResetActivity.onNavigationEvent(this.f$0, (Throwable) obj2);
                        }
                    };
                    deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda9
                        public final void accept(Object obj2) {
                            GuestPasswordResetActivity.asBinder(function13, obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
                    guestPasswordResetActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
                }
            }
        } else {
            guestPasswordResetActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if ((r11 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        r11 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        if (r11.onNavigationEvent() != 1000) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        r4 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult();
        r6 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult();
        r2 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), r2, new java.lang.Object[]{r10}, r4, -347993396, r6, 347993415);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        r10.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (((viva.republica.toss.guest.GuestPasswordResetViewModel) onWarmupCompleted(com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), r4, new java.lang.Object[]{r10}, r6, -1869698189, r8, 1869698192)).IAuthTabCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0064, code lost:
    
        if (((viva.republica.toss.guest.GuestPasswordResetViewModel) onWarmupCompleted(com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult(), r4, new java.lang.Object[]{r10}, r6, -1869698189, r8, 1869698192)).IAuthTabCallback() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        r10 = kotlin.Unit.INSTANCE;
        r11 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession + 37;
        viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r11 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.guest.GuestPasswordResetActivity r10, o.IEngagementSignalsCallbackDefault r11) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r1 = r1 + 49
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r10}
            int r6 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r8 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r4 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r3 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            r7 = -1869698189(0xffffffff908eab73, float:-5.6273284E-29)
            r9 = 1869698192(0x6f715490, float:7.4688117E28)
            java.lang.Object r1 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            viva.republica.toss.guest.GuestPasswordResetViewModel r1 = (viva.republica.toss.guest.GuestPasswordResetViewModel) r1
            boolean r1 = r1.IAuthTabCallback()
            r2 = 4
            int r2 = r2 / 0
            if (r1 == 0) goto L78
            goto L66
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r10}
            int r6 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r8 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r4 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r3 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            r7 = -1869698189(0xffffffff908eab73, float:-5.6273284E-29)
            r9 = 1869698192(0x6f715490, float:7.4688117E28)
            java.lang.Object r1 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            viva.republica.toss.guest.GuestPasswordResetViewModel r1 = (viva.republica.toss.guest.GuestPasswordResetViewModel) r1
            boolean r1 = r1.IAuthTabCallback()
            if (r1 == 0) goto L78
        L66:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            int r11 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r11 = r11 + 37
            int r1 = r11 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r1
            int r11 = r11 % r0
            if (r11 != 0) goto L77
            r11 = 25
            int r11 = r11 / 0
        L77:
            return r10
        L78:
            int r11 = r11.onNavigationEvent()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r0) goto L9e
            java.lang.Object[] r3 = new java.lang.Object[]{r10}
            int r4 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r6 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r2 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r1 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            r5 = -347993396(0xffffffffeb420acc, float:-2.345826E26)
            r7 = 347993415(0x14bdf547, float:1.9180868E-26)
            onWarmupCompleted(r1, r2, r3, r4, r5, r6, r7)
            goto La1
        L9e:
            r10.finish()
        La1:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onExtraCallbackWithResult(viva.republica.toss.guest.GuestPasswordResetActivity, o.IEngagementSignalsCallbackDefault):kotlin.Unit");
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) throws Throwable {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        Object obj = null;
        if (((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallback()) {
            Unit unit = Unit.INSTANCE;
            int i2 = prefetch + 33;
            newSession = i2 % 128;
            if (i2 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        int iOnNavigationEvent = iEngagementSignalsCallbackDefault.onNavigationEvent();
        if (iOnNavigationEvent == -1) {
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult4, -347993396, iOnExtraCallbackWithResult5, 347993415);
        } else if (iOnNavigationEvent == 1000 || iOnNavigationEvent == 1002) {
            guestPasswordResetActivity.ITrustedWebActivityServiceStubProxy();
        } else {
            int i3 = newSession + 95;
            prefetch = i3 % 128;
            if (i3 % 2 == 0) {
                guestPasswordResetActivity.finish();
                obj.hashCode();
                throw null;
            }
            guestPasswordResetActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 1;
        viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.LoadInfo1 ICustomTabsServiceDefault() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r2 = r1 + 91
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            o.LoadInfo1 r2 = r4.verifyIntent
            r3 = 32
            int r3 = r3 / 0
            if (r2 == 0) goto L29
            goto L1b
        L17:
            o.LoadInfo1 r2 = r4.verifyIntent
            if (r2 == 0) goto L29
        L1b:
            int r1 = r1 + 1
            int r3 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L28
            r0 = 83
            int r0 = r0 / 0
        L28:
            return r2
        L29:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.ICustomTabsServiceDefault():o.LoadInfo1");
    }

    public final fixMappingOfEventPrioritiesBetweenFabricAndReact IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 19;
        prefetch = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        fixMappingOfEventPrioritiesBetweenFabricAndReact fixmappingofeventprioritiesbetweenfabricandreact = this.otpVerificationExceptionHandler;
        if (fixmappingofeventprioritiesbetweenfabricandreact == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 117;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return fixmappingofeventprioritiesbetweenfabricandreact;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        char c;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ICustomTabsCallbackStubProxy)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 43425), 42 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i7 = -1;
            boolean z2 = iIntValue == -1;
            if (!(!z2)) {
                byte[] bArr2 = ICustomTabsCallbackStub;
                char c2 = '0';
                if (bArr2 != null) {
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf("", c2, 0, 0)), 55 - (KeyEvent.getMaxKeyCode() >> 16), 2167 - KeyEvent.normalizeMetaState(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i7 = -1;
                        c2 = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = ICustomTabsCallbackStub;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ICustomTabsCallbackDefault)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.MeasureSpec.getMode(0)), View.combineMeasuredStates(0, 0) + 42, 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallbackStubProxy ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (isEngagementSignalsApiAvailable[i + ((int) (ICustomTabsCallbackDefault ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (ICustomTabsCallbackStubProxy ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (ICustomTabsCallbackDefault ^ (-4629411779493505016L)));
                if (z2) {
                    int i11 = $11 + 41;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onUnminimized), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 85 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = ICustomTabsCallbackStub;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $10 + 107;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i16 = $11;
                    int i17 = i16 + 123;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    if (z) {
                        int i19 = i16 + 119;
                        $10 = i19 % 128;
                        if (i19 % 2 != 0) {
                            byte[] bArr6 = ICustomTabsCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent >>> 1;
                            byte b4 = (byte) (bArr6[r7] ^ (-4629411779493505016L));
                            c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                            i5 = b4 / s;
                        } else {
                            byte[] bArr7 = ICustomTabsCallbackStub;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            byte b5 = (byte) (bArr7[r7] ^ (-4629411779493505016L));
                            c = trackSelectionParametersExternalSyntheticLambda0.onExtraCallback;
                            i5 = b5 + s;
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (c + (((byte) i5) ^ b));
                    } else {
                        short[] sArr = isEngagementSignalsApiAvailable;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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

    public final getLastVisiblePosition setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = prefetch + 7;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        getLastVisiblePosition getlastvisibleposition = this.teensSelfieIntent;
        if (getlastvisibleposition != null) {
            return getlastvisibleposition;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = prefetch + 123;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ITrustedWebActivityCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetch + 117;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(getString(R.string.guest_password_reset_account_verification_title), "");
            throw null;
        }
        String string = getString(R.string.guest_password_reset_account_verification_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.Hilt_GuestPasswordResetActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        getLogUploadURLMap getloguploadurlmap;
        Object objOnWarmupCompleted;
        getLogUploadURLMap getloguploadurlmap2;
        int i = 2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        setContentView(((CERT_GetPublicKeyAlgorithm) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, -2090814370, iOnExtraCallbackWithResult2, 2090814385)).getRoot());
        IAuthTabCallback(this, 1222971L, (Function1) null, 2, (Object) null);
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        CoordinatorLayout root = ((CERT_GetPublicKeyAlgorithm) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3, -2090814370, iOnExtraCallbackWithResult4, 2090814385)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        disableImageViewPreallocationAndroid.onNavigationEvent(root, ((CERT_GetPublicKeyAlgorithm) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult5, -2090814370, iOnExtraCallbackWithResult6, 2090814385)).IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        Object obj = null;
        if (bundle == null) {
            this.asBinder = getIntent().getBooleanExtra("EXTRA_BLOCKED", false);
            Intent intent = getIntent();
            Object[] objArr = new Object[1];
            a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 221), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132027062).substring(4, 5).codePointAt(0) - 48), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1765669004, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132026733).substring(0, 4).codePointAt(0) - 1481759796, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021838).substring(0, 4).length() - 121, objArr);
            this.extraCallbackWithResult = intent.getLongExtra(((String) objArr[0]).intern(), 0L);
            Intent intent2 = getIntent();
            Object[] objArr2 = new Object[1];
            a((short) (KeyEvent.getDeadChar(0, 0) + 71), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022712).substring(0, 17).codePointAt(6) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022904).substring(0, 13).length() - 1765668976, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132031697).substring(0, 2).codePointAt(0) - 1481759796, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 136, objArr2);
            Long lValueOf = Long.valueOf(intent2.getLongExtra(((String) objArr2[0]).intern(), 0L));
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            this.IAuthTabCallbackStubProxy = lValueOf;
            this.onActivityLayout = getIntent().getStringExtra("EXTRA_REFERRER");
            Intent intent3 = getIntent();
            Object[] objArr3 = new Object[1];
            a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019718).substring(0, 20).codePointAt(15) - 122), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022805).substring(0, 12).codePointAt(6) - 104), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017869).substring(0, 4).length() - 1765668952, (ViewConfiguration.getLongPressTimeout() >> 16) - 1481759759, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 234, objArr3);
            this.extraCallback = intent3.getBooleanExtra(((String) objArr3[0]).intern(), false);
            getLogUploadURLMap serializableExtra = getIntent().getSerializableExtra("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            if (serializableExtra instanceof getLogUploadURLMap) {
                int i2 = newSession + 39;
                prefetch = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                getloguploadurlmap2 = serializableExtra;
            } else {
                getloguploadurlmap2 = null;
            }
            this.readTypedObject = getloguploadurlmap2;
        } else {
            this.asBinder = bundle.getBoolean("EXTRA_BLOCKED");
            Object[] objArr4 = new Object[1];
            a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022911).substring(0, 4).codePointAt(2) - 145), (byte) Color.green(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 1765669090, (-1481759760) - ImageFormat.getBitsPerPixel(0), (-117) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
            this.extraCallbackWithResult = bundle.getLong(((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132021596).substring(4, 6).length() + 69), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 108), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1765668982, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132030518).substring(0, 2).codePointAt(0) - 1481759808, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022706).substring(0, 26).codePointAt(23) - 149, objArr5);
            Long lValueOf2 = Long.valueOf(bundle.getLong(((String) objArr5[0]).intern(), 0L));
            if (lValueOf2.longValue() == 0) {
                int i3 = prefetch + 71;
                newSession = i3 % 128;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                lValueOf2 = null;
            }
            this.IAuthTabCallbackStubProxy = lValueOf2;
            this.onActivityLayout = bundle.getString("EXTRA_REFERRER");
            Object[] objArr6 = new Object[1];
            a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132029092).substring(0, 8).length() - 11), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019653).substring(0, 12).codePointAt(3) - 112), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 1765669045, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019325).substring(0, 4).length() - 1481759763, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 232, objArr6);
            this.extraCallback = bundle.getBoolean(((String) objArr6[0]).intern(), false);
            getLogUploadURLMap serializable = bundle.getSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE");
            if (serializable instanceof getLogUploadURLMap) {
                getloguploadurlmap = serializable;
            } else {
                int i4 = prefetch + 69;
                newSession = i4 % 128;
                int i5 = i4 % 2;
                getloguploadurlmap = null;
            }
            this.readTypedObject = getloguploadurlmap;
        }
        this.IAuthTabCallbackDefault = new useSharedAnimatedBackend("TS-USI", this.extraCallbackWithResult);
        if (HexEncoder.onNavigationEvent(this, false)) {
            int iOnExtraCallbackWithResult7 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = zzmr.onExtraCallbackWithResult();
            ((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult7, -1869698189, iOnExtraCallbackWithResult8, 1869698192)).onNavigationEvent(false);
            LoginBaseActivity.onExtraCallback(this, null, false, 3, null);
            getSmallIconId();
            int i6 = newSession + 81;
            prefetch = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 70 / 0;
                return;
            }
            return;
        }
        int i8 = prefetch + 51;
        newSession = i8 % 128;
        if (i8 % 2 != 0) {
            int iOnExtraCallbackWithResult9 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult10 = zzmr.onExtraCallbackWithResult();
            objOnWarmupCompleted = onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult9, -1869698189, iOnExtraCallbackWithResult10, 1869698192);
        } else {
            int iOnExtraCallbackWithResult11 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult12 = zzmr.onExtraCallbackWithResult();
            objOnWarmupCompleted = onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult11, -1869698189, iOnExtraCallbackWithResult12, 1869698192);
        }
        ((GuestPasswordResetViewModel) objOnWarmupCompleted).onNavigationEvent(true);
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 115;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 39;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return "";
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 25;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putBoolean("EXTRA_BLOCKED", this.asBinder);
        Object[] objArr = new Object[1];
        a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019363).substring(0, 2).length() - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132023022).substring(12, 13).length() - 1), (-1765668987) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132025702).substring(0, 2).length(), (-1481759762) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132020874).substring(0, 3).length(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 229, objArr);
        bundle.putLong(((String) objArr[0]).intern(), this.extraCallbackWithResult);
        Long l = this.IAuthTabCallbackStubProxy;
        long jLongValue = l != null ? l.longValue() : 0L;
        Object[] objArr2 = new Object[1];
        a((short) (View.MeasureSpec.getSize(0) + 71), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 1765669074, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 1481759759, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019714).substring(0, 9).length() - 126, objArr2);
        bundle.putLong(((String) objArr2[0]).intern(), jLongValue);
        bundle.putString("EXTRA_REFERRER", this.onActivityLayout);
        bundle.putInt("EXTRA_WRONG_ACCOUNT_NUMBER_ERROR_COUNT", IAuthTabCallback().onWarmupCompleted());
        Object[] objArr3 = new Object[1];
        a((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 22), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132019660).substring(0, 26).length() - 26), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1765668967, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1481759778, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022893).substring(0, 7).codePointAt(3) - 231, objArr3);
        bundle.putBoolean(((String) objArr3[0]).intern(), this.extraCallback);
        bundle.putSerializable("EXTRA_LOGIN_TOKEN_CONSENT_TYPE", this.readTypedObject);
        super.onSaveInstanceState(bundle);
        int i4 = newSession + 9;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = prefetch + 67;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_PASSWORD_ERROR_RESET_EXIT", null, 1, 60, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            UST_CMP_IssueCertificate.IAuthTabCallback(-596488443, new Object[]{false, UST_CMP_IssueCertificate.onExtraCallback.LOGIN, "LOGIN_PASSWORD_ERROR_RESET_EXIT", null, 0, 25, null}, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 596488447);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.blocked_alert_message));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda39
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallbackWithResult((DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, true}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = prefetch + 87;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean bg_() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r1 = r1 + 99
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1e
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r1 = r10.getSupportFragmentManager()
            int r1 = r1.extraCallbackWithResult()
            r3 = 87
            int r3 = r3 / 0
            if (r1 != 0) goto L3a
            goto L28
        L1e:
            o.FlowMeasureLazyPolicyExternalSyntheticLambda3 r1 = r10.getSupportFragmentManager()
            int r1 = r1.extraCallbackWithResult()
            if (r1 != 0) goto L3a
        L28:
            boolean r1 = r10.asBinder
            if (r1 == 0) goto L3a
            viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda11 r0 = new viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda11
            r0.<init>()
            o.writeRaw r0 = o.CommonModule_setScreenAwakeMode.IAuthTabCallback(r10, r0)
            r1 = 0
            o.IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(r0, r1, r2, r1)
            return r2
        L3a:
            boolean r1 = r10.getSmallIconBitmap()
            if (r1 == 0) goto L67
            java.lang.Object[] r5 = new java.lang.Object[]{r10}
            int r6 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r8 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r4 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            int r3 = com.google.android.gms.internal.firebase-auth-api.zzmr.onExtraCallbackWithResult()
            r7 = -1869698189(0xffffffff908eab73, float:-5.6273284E-29)
            r9 = 1869698192(0x6f715490, float:7.4688117E28)
            java.lang.Object r1 = onWarmupCompleted(r3, r4, r5, r6, r7, r8, r9)
            viva.republica.toss.guest.GuestPasswordResetViewModel r1 = (viva.republica.toss.guest.GuestPasswordResetViewModel) r1
            boolean r1 = r1.onExtraCallback()
            if (r1 == 0) goto L67
            return r2
        L67:
            boolean r1 = super.bg_()
            int r2 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r2 = r2 + 83
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.bg_():boolean");
    }

    private final boolean getSmallIconBitmap() {
        int i = 2 % 2;
        List listOnActivityLayout = getSupportFragmentManager().onActivityLayout();
        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout, "");
        if (listOnActivityLayout.isEmpty()) {
            return false;
        }
        int i2 = prefetch + 103;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        List listOnActivityLayout2 = getSupportFragmentManager().onActivityLayout();
        Intrinsics.checkNotNullExpressionValue(listOnActivityLayout2, "");
        if (!(((Fragment) CollectionsKt.last(listOnActivityLayout2)) instanceof PasswordResetGuideFragment)) {
            return false;
        }
        int i4 = prefetch;
        int i5 = i4 + 73;
        newSession = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 95;
        newSession = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuestPasswordResetActivity.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            PasswordResetGuideFragment passwordResetGuideFragmentIAuthTabCallback = PasswordResetGuideFragment.Companion.IAuthTabCallback(GuestPasswordResetActivity.IAuthTabCallbackDefault(GuestPasswordResetActivity.this), GuestPasswordResetActivity.asBinder(GuestPasswordResetActivity.this));
            if (GuestPasswordResetActivity.this.getSupportFragmentManager().findFragmentByTag("guide") != null) {
                int iExtraCallbackWithResult = GuestPasswordResetActivity.this.getSupportFragmentManager().extraCallbackWithResult();
                for (int i = 0; i < iExtraCallbackWithResult; i++) {
                    GuestPasswordResetActivity.this.getSupportFragmentManager().extraCommand();
                }
            } else {
                GuestPasswordResetActivity.this.getSupportFragmentManager().onExtraCallbackWithResult().IAuthTabCallback(GuestPasswordResetActivity.onWarmupCompleted(GuestPasswordResetActivity.this).getId(), passwordResetGuideFragmentIAuthTabCallback, "guide").IAuthTabCallback();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void getSmallIconId() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.getSmallIconId():void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity, android.content.Context, java.lang.Object, viva.republica.toss.guest.GuestPasswordResetActivity] */
    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        ?? r0 = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 19;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        CreatePasswordActivity.onExtraCallback onextracallback = CreatePasswordActivity.Companion;
        long j = ((GuestPasswordResetActivity) r0).extraCallbackWithResult;
        Long l = ((GuestPasswordResetActivity) r0).IAuthTabCallbackStubProxy;
        String str = ((GuestPasswordResetActivity) r0).onActivityLayout;
        getLogUploadURLMap getloguploadurlmap = ((GuestPasswordResetActivity) r0).readTypedObject;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        getNavigationBar.IAuthTabCallback(CreatePasswordActivity.onExtraCallback.onWarmupCompleted(onextracallback, r0, false, j, l, str, ((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{r0}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallbackStub(), getloguploadurlmap, false, false, null, null, 1920, null), (Context) r0);
        r0.finishAffinity();
        int i4 = newSession + 125;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void read() {
        VerifyGuestUssCardIntroFragment.onNavigationEvent onnavigationevent;
        long j;
        int i = 2 % 2;
        int i2 = newSession + 99;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            onnavigationevent = VerifyGuestUssCardIntroFragment.Companion;
            j = this.extraCallbackWithResult;
        } else {
            onnavigationevent = VerifyGuestUssCardIntroFragment.Companion;
            j = this.extraCallbackWithResult;
        }
        onExtraCallback((BaseFragment) onnavigationevent.onNavigationEvent(j), "uss_card_verification_intro", false);
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuestPasswordResetActivity.this.new getInterfaceDescriptor(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context, viva.republica.toss.guest.GuestPasswordResetActivity] */
        public final Object invokeSuspend(Object obj) {
            String logValue;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                this.label = 1;
                obj = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "onboarding.password.reset.uiType", "CONTROL", this}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            String str = (String) obj;
            setVideoDuration setvideodurationOnNavigationEvent = GuestPasswordResetActivity.this.onNavigationEvent();
            ?? r1 = GuestPasswordResetActivity.this;
            long jAsBinder = GuestPasswordResetActivity.asBinder((GuestPasswordResetActivity) r1);
            long jAsBinder2 = GuestPasswordResetActivity.asBinder(GuestPasswordResetActivity.this);
            IndicatorView indicatorViewAccess100 = createPaints.IAuthTabCallback.access100();
            if (indicatorViewAccess100 == null || (logValue = indicatorViewAccess100.getLogValue()) == null) {
                logValue = IndicatorView.RESET_PASSWORD_CLICK_RESET.getLogValue();
            }
            GuestPasswordResetActivity.onTransact(GuestPasswordResetActivity.this).onNavigationEvent(setvideodurationOnNavigationEvent.onNavigationEvent((Context) r1, "TS-USI", jAsBinder, true, jAsBinder2, false, logValue, str));
            GuestPasswordResetActivity.this.overridePendingTransition(0, 0);
            return Unit.INSTANCE;
        }
    }

    private final void write() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(null), 3, (Object) null);
        int i2 = prefetch + 27;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit extraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 41;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((short) (62 - (ViewConfiguration.getTapTimeout() >> 16)), (byte) KeyEvent.keyCodeFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) - 1765669075, (-1481759712) - View.getDefaultSize(0, 0), (-117) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), guestPasswordResetActivity.ITrustedWebActivityCallback_Parcel());
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 79;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    private final void ITrustedWebActivityServiceStubProxy() {
        int i = 2 % 2;
        this.ICustomTabsCallback = true;
        IAuthTabCallback(1219227L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda16
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 433608965, iOnExtraCallbackWithResult2, -433608947);
            }
        });
        getSupportFragmentManager().onExtraCallbackWithResult().IAuthTabCallback(getActiveNotifications().getId(), AccountVerificationBankListFragment.onExtraCallback.onNavigationEvent(AccountVerificationBankListFragment.Companion, (String) null, ITrustedWebActivityCallback_Parcel(), "", checkDeviceBrand.EXCLUDE_TOSS_FAMILY, false, 17, (Object) null), "bank_list").IAuthTabCallback();
        int i2 = newSession + 89;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(String str) throws Throwable {
        AccountInputFragment accountInputFragmentOnExtraCallback;
        String str2;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = prefetch + 59;
        newSession = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback(this, 1219229L, (Function1) null, 4, (Object) null);
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -38979660, iOnExtraCallbackWithResult2, 38979671);
            accountInputFragmentOnExtraCallback = AccountInputFragment.onNavigationEvent.onExtraCallback(AccountInputFragment.Companion, str, (String) null, (AccountInputFragment.IAuthTabCallback) null, 30, (Object) null);
            str2 = "account_input";
            z = false;
            i = 3;
        } else {
            IAuthTabCallback(this, 1219229L, (Function1) null, 2, (Object) null);
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{this}, iOnExtraCallbackWithResult4, -38979660, iOnExtraCallbackWithResult5, 38979671);
            accountInputFragmentOnExtraCallback = AccountInputFragment.onNavigationEvent.onExtraCallback(AccountInputFragment.Companion, str, (String) null, (AccountInputFragment.IAuthTabCallback) null, 6, (Object) null);
            str2 = "account_input";
            z = false;
            i = 4;
        }
        onWarmupCompleted(this, accountInputFragmentOnExtraCallback, str2, z, i, null);
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        final GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        fixMappingOfEventPrioritiesBetweenFabricAndReact.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{guestPasswordResetActivity.IAuthTabCallback(), true, new Function0() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda17
            public final Object invoke() {
                Object[] objArr2 = {this.f$0};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult, 1596760198, iOnExtraCallbackWithResult2, -1596760198);
            }
        }, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, "TS-USI", 0, 16, null}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1333603370, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1333603374);
        int i2 = prefetch + 75;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit asInterface(GuestPasswordResetActivity guestPasswordResetActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 53;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        guestPasswordResetActivity.getSmallIconId();
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 47;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 109;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 97;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void onWarmupCompleted(fuseboxEnabledRelease fuseboxenabledrelease) {
        BaseFragment baseFragment;
        int i = 2 % 2;
        int i2 = prefetch + 45;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment baseFragmentIAuthTabCallback = BankAccountOtpVerificationFragment.onWarmupCompleted.IAuthTabCallback(BankAccountOtpVerificationFragment.Companion, fuseboxenabledrelease.onExtraCallbackWithResult(), fuseboxenabledrelease.onWarmupCompleted(), fuseboxenabledrelease.onExtraCallback(), fuseboxenabledrelease.onTransact(), fuseboxenabledrelease.asBinder(), fuseboxenabledrelease.IAuthTabCallbackDefault(), false, (BankAccountOtpVerificationFragment.onExtraCallback) null, 128, (Object) null);
        this.onPostMessage = baseFragmentIAuthTabCallback;
        if (baseFragmentIAuthTabCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            baseFragment = null;
        } else {
            baseFragment = baseFragmentIAuthTabCallback;
        }
        onWarmupCompleted(this, baseFragment, "otp_verification", false, 4, null);
        int i4 = newSession + 121;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static /* synthetic */ void onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, BaseFragment baseFragment, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = prefetch + 125;
            newSession = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        }
        guestPasswordResetActivity.onExtraCallback(baseFragment, str, z);
        int i5 = newSession + 59;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void onExtraCallback(BaseFragment baseFragment, String str, boolean z) {
        int i = 2 % 2;
        int i2 = newSession + 19;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        if (getSupportFragmentManager().findFragmentByTag(str) != null) {
            return;
        }
        FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback = getSupportFragmentManager().onExtraCallbackWithResult().onExtraCallback(R.anim.slide_in_left, R.anim.slide_out_left, R.anim.slide_in_right, R.anim.slide_out_right);
        if (z) {
            flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback.IAuthTabCallback(str);
        }
        flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallback.onExtraCallback(getActiveNotifications().getId(), baseFragment, str).onExtraCallbackWithResult();
        int i4 = newSession + 45;
        prefetch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ fuseboxEnabledRelease $bankAccountForOtp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(fuseboxEnabledRelease fuseboxenabledrelease, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$bankAccountForOtp = fuseboxenabledrelease;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuestPasswordResetActivity.this.new access000(this.$bankAccountForOtp, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GuestPasswordResetActivity guestPasswordResetActivity = GuestPasswordResetActivity.this;
                fuseboxEnabledRelease fuseboxenabledrelease = this.$bankAccountForOtp;
                this.label = 1;
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
                if (GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, fuseboxenabledrelease, this}, iOnExtraCallbackWithResult, 1689672785, iOnExtraCallbackWithResult2, -1689672764) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            GuestPasswordResetActivity.onExtraCallbackWithResult(GuestPasswordResetActivity.this, this.$bankAccountForOtp);
            return Unit.INSTANCE;
        }
    }

    @Override // viva.republica.toss.password.reset.PasswordResetGuideFragment.onExtraCallbackWithResult
    public void onVerticalScrollEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 97;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        boolean z = false;
        if (((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallbackStub()) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a((short) ((ViewConfiguration.getScrollBarSize() >> 8) + 76), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-1765669117) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) - 1481759721, (-116) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            if (!textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr[0]).intern(), false)) {
                int i4 = newSession + 115;
                prefetch = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            }
        }
        IAuthTabCallback(z);
    }

    private static final void IAuthTabCallbackStubProxy(GuestPasswordResetActivity guestPasswordResetActivity) throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        ((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallback(true);
        if (guestPasswordResetActivity.extraCallback) {
            int i2 = prefetch + 29;
            newSession = i2 % 128;
            if (i2 % 2 == 0) {
                guestPasswordResetActivity.AudioAttributesImplApi26Parcelizer();
                return;
            } else {
                guestPasswordResetActivity.AudioAttributesImplApi26Parcelizer();
                int i3 = 69 / 0;
                return;
            }
        }
        guestPasswordResetActivity.write();
        int i4 = prefetch + 69;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 81;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 71;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.IAuthTabCallback(guestPasswordResetActivity, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 67;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        GuestPasswordResetActivity guestPasswordResetActivity = (GuestPasswordResetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = newSession + 107;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        guestPasswordResetActivity.bo_();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = prefetch + 109;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 77;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.guest.GuestPasswordResetActivity r3, o.getJSModule r4) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3e
            boolean r1 = r4.onExtraCallbackWithResult()
            if (r1 == 0) goto L38
            int r1 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r1 = r1 + 57
            int r2 = r1 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r2
            int r1 = r1 % r0
            boolean r1 = r4.onNavigationEvent()
            if (r1 == 0) goto L38
            boolean r4 = r4.IAuthTabCallback()
            r1 = 1
            if (r4 == r1) goto L2b
            goto L38
        L2b:
            int r4 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r4 = r4 + 45
            int r1 = r4 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r1
            int r4 = r4 % r0
            r3.read()
            goto L3b
        L38:
            IAuthTabCallbackStubProxy(r3)
        L3b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L3e:
            r4.onExtraCallbackWithResult()
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onExtraCallbackWithResult(viva.republica.toss.guest.GuestPasswordResetActivity, o.getJSModule):kotlin.Unit");
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = prefetch + 91;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = prefetch + 1;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 63;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
            if (isFinishing()) {
                return;
            }
        } else if (isFinishing()) {
            return;
        }
        if (isDestroyed()) {
            return;
        }
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        if (((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).onWarmupCompleted()) {
            return;
        }
        int i4 = prefetch + 103;
        newSession = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (z) {
            int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
            ((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{this}, iOnExtraCallbackWithResult4, -1869698189, iOnExtraCallbackWithResult5, 1869698192)).IAuthTabCallback(true);
            AudioAttributesImplApi26Parcelizer();
            int i5 = newSession + 33;
            prefetch = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (createPaints.IAuthTabCallback.IAuthTabCallbackStub()) {
            IAuthTabCallbackStubProxy(this);
            return;
        }
        writeRaw<BaseApiResponse<getJSModule>> writerawOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onWarmupCompleted(new setFabricUIManager(this.extraCallbackWithResult));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda21
            public final Object invoke(Object obj2) {
                return GuestPasswordResetActivity.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj2);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda22
            public final void accept(Object obj2) throws Throwable {
                Object[] objArr = {function1, obj2};
                int iOnExtraCallbackWithResult7 = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = zzmr.onExtraCallbackWithResult();
                GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult7, -1220007294, iOnExtraCallbackWithResult8, 1220007308);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda23
            public final void run() throws Throwable {
                GuestPasswordResetActivity.onExtraCallback(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda24
            public final Object invoke(Object obj2) {
                return GuestPasswordResetActivity.onWarmupCompleted(this.f$0, (getJSModule) obj2);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda25
            public final void accept(Object obj2) throws Throwable {
                Object[] objArr = {function12, obj2};
                int iOnExtraCallbackWithResult7 = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult8 = zzmr.onExtraCallbackWithResult();
                GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult7, -1452925958, iOnExtraCallbackWithResult8, 1452925959);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda26
            public final Object invoke(Object obj2) {
                return GuestPasswordResetActivity.onExtraCallback(this.f$0, (Throwable) obj2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda27
            public final void accept(Object obj2) {
                GuestPasswordResetActivity.IAuthTabCallbackDefault(function13, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, Throwable th) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = newSession + 1;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy(guestPasswordResetActivity);
            unit = Unit.INSTANCE;
            int i3 = 24 / 0;
        } else {
            IAuthTabCallbackStubProxy(guestPasswordResetActivity);
            unit = Unit.INSTANCE;
        }
        int i4 = prefetch + 95;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AudioAttributesImplApi26Parcelizer() throws Throwable {
        getNameFromAnnotation getnamefromannotation;
        createPaints createpaints;
        int i = 2 % 2;
        CertifyGuestActivity.onExtraCallbackWithResult onextracallbackwithresult = CertifyGuestActivity.Companion;
        long j = this.extraCallbackWithResult;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        boolean zIAuthTabCallbackStub = ((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallbackStub();
        if (this.extraCallback) {
            int i2 = prefetch + 109;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            getnamefromannotation = getNameFromAnnotation.RESET_PASSWORD;
        } else {
            getnamefromannotation = null;
        }
        Intent intentIAuthTabCallback = CertifyGuestActivity.onExtraCallbackWithResult.IAuthTabCallback(onextracallbackwithresult, this, j, 0L, null, null, getnamefromannotation, zIAuthTabCallbackStub, false, false, null, 924, null);
        boolean z = true;
        if (!this.extraCallback) {
            int i4 = newSession + 69;
            prefetch = i4 % 128;
            if (i4 % 2 == 0) {
                createpaints = createPaints.IAuthTabCallback;
                z = false;
            } else {
                createpaints = createPaints.IAuthTabCallback;
            }
            createpaints.onNavigationEvent(z);
        }
        this.access000.onNavigationEvent(intentIAuthTabCallback);
        int i5 = newSession + 39;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 79;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        if (this.extraCallback) {
            int i5 = i3 + 117;
            prefetch = i5 % 128;
            if (i5 % 2 != 0) {
                AudioAttributesImplApi26Parcelizer();
                return;
            }
            AudioAttributesImplApi26Parcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        write();
        int i6 = newSession + 53;
        prefetch = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
    }

    private static final Unit onWarmupCompleted(String str, GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 125;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("bank_name", getSignForPKCS7V2.onExtraCallbackWithResult(str));
        Object[] objArr = new Object[1];
        a((short) (62 - Color.red(0)), (byte) ('0' - AndroidCharacter.getMirror('0')), (-1765669076) + (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-1481759712) - (KeyEvent.getMaxKeyCode() >> 16), (-117) - Color.argb(0, 0, 0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), guestPasswordResetActivity.ITrustedWebActivityCallback_Parcel());
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 43;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallback(@NotNull final String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback(1222309L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda38
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallbackWithResult(str, this, (SetDetectableSize) obj);
            }
        });
        onNavigationEvent(str);
        int i2 = newSession + 117;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access000(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 115;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 23;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ICustomTabsService_Parcel() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            o.enableViewCulling r1 = o.enableViewCulling.IAuthTabCallback
            java.lang.String r2 = r6.ITrustedWebActivityCallback_Parcel()
            viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda15 r3 = new viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda15
            r3.<init>()
            r1.onExtraCallbackWithResult(r2, r3)
            int r1 = o.PlayerErrorCode.writeTypedObject()
            r2 = 14
            java.lang.String r3 = "TS-USI"
            if (r2 > r1) goto L43
            int r2 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r2 = r2 + 47
            int r4 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L2b
            r2 = 30
            if (r1 >= r2) goto L43
            goto L2f
        L2b:
            r2 = 19
            if (r1 >= r2) goto L43
        L2f:
            o.getLastVisiblePosition r1 = r6.setEngagementSignalsCallback()
            long r4 = r6.extraCallbackWithResult
            android.content.Intent r1 = r1.onExtraCallback(r6, r4, r3)
            int r2 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r2 = r2 + 3
            int r3 = r2 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r3
            int r2 = r2 % r0
            goto L4b
        L43:
            o.LoadInfo1 r0 = r6.ICustomTabsServiceDefault()
            android.content.Intent r1 = r0.IAuthTabCallback(r6, r3)
        L4b:
            r6.startActivity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.ICustomTabsService_Parcel():void");
    }

    public void validateRelationship() {
        int i = 2 % 2;
        Object[] objArr = {enableViewCulling.IAuthTabCallback, ITrustedWebActivityCallback_Parcel(), new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda37
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult, 960919518, iOnExtraCallbackWithResult2, -960919514);
            }
        }};
        enableViewCulling.onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -2112450222, 2112450222, setVisitUrl.onExtraCallbackWithResult());
        int i2 = prefetch + 99;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackStubProxy(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 87;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult4, 1471182366, iOnExtraCallbackWithResult5, -1471182350);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, fuseboxEnabledRelease fuseboxenabledrelease, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 67;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.account_verification_account_input_title;
        Object[] objArr = {fuseboxenabledrelease.onExtraCallback()};
        Object[] objArr2 = new Object[1];
        a((short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 62), (byte) (AndroidCharacter.getMirror('0') - '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1765669075, (-1481759712) + View.resolveSizeAndState(0, 0, 0), Color.green(0) - 117, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), guestPasswordResetActivity.getString(i4, objArr));
        Object[] objArr3 = new Object[1];
        a((short) (118 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), Process.getGidForName("") - 1765669069, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1481759730, (-116) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), guestPasswordResetActivity.getString(im.toss.uikit.R.string.uikit_confirm));
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 77;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public void IAuthTabCallback(@NotNull final fuseboxEnabledRelease fuseboxenabledrelease) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fuseboxenabledrelease, "");
        IAuthTabCallback(1222315L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallbackWithResult(this.f$0, fuseboxenabledrelease, (SetDetectableSize) obj);
            }
        });
        int iIAuthTabCallback = SdkMeterProvider$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 1649952689;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, fuseboxenabledrelease}, iIAuthTabCallback, -1900456630, iCodePointAt, 1900456642);
        int i2 = prefetch + 115;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull continueWhenFinished continuewhenfinished, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(continuewhenfinished, "");
        Intrinsics.checkNotNullParameter(function1, "");
        onWarmupCompleted(str, function1);
        int i4 = prefetch + 43;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Function1<SetDetectableSize, Unit> $addHideDepositLogParams;
        final /* synthetic */ String $otpInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, Function1<? super SetDetectableSize, Unit> function1, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$otpInput = str;
            this.$addHideDepositLogParams = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return GuestPasswordResetActivity.this.new onExtraCallback(this.$otpInput, this.$addHideDepositLogParams, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                GuestPasswordResetActivity guestPasswordResetActivity = GuestPasswordResetActivity.this;
                String str = this.$otpInput;
                Function1<SetDetectableSize, Unit> function1 = this.$addHideDepositLogParams;
                this.label = 1;
                if (GuestPasswordResetActivity.onExtraCallback(guestPasswordResetActivity, str, function1, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onWarmupCompleted(String str, Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        if (this.onPostMessage == null) {
            return;
        }
        getPackageType getpackagetype = this.onRelationshipValidationResult;
        if (getpackagetype == null || !getpackagetype.onExtraCallback()) {
            this.onRelationshipValidationResult = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(str, function1, null), 3, (Object) null);
            int i2 = prefetch + 81;
            newSession = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = newSession + 21;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
    }

    private static final Unit readTypedObject(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61), (byte) (Process.myPid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) - 1765669058, TextUtils.indexOf((CharSequence) "", '0', 0) - 1481759712, (-117) - View.resolveSizeAndState(0, 0, 0), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), zzaz.onExtraCallbackWithResult(true));
        String str = guestPasswordResetActivity.onMessageChannelReady;
        if (str != null) {
            int i2 = prefetch + 97;
            newSession = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback().put("bank_code", str);
        }
        setDetectableSize.onExtraCallback().put("end_auto_yn", "N");
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c(new char[]{58621, 23843, 51086, 57139, 57979, 22950, 53484, 5307}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, objArr2);
        mapOnExtraCallback2.put("end_type", ((String) objArr2[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 117;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = newSession + 55;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("otp_verify_succeed", "Y");
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 13;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[Catch: Exception -> 0x0136, WebResourceResponseModel -> 0x0139, CancellationException -> 0x014d, TRY_LEAVE, TryCatch #9 {CancellationException -> 0x014d, blocks: (B:13:0x0053, B:49:0x0119, B:22:0x007c, B:41:0x00dd, B:43:0x00e7, B:45:0x00eb, B:56:0x0126, B:57:0x0131, B:31:0x009a, B:33:0x00a2, B:36:0x00b1, B:38:0x00bd), top: B:95:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0253  */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.Context, viva.republica.toss.guest.LoginBaseActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(java.lang.String r29, kotlin.jvm.functions.Function1<? super o.SetDetectableSize, kotlin.Unit> r30, o.access13800<? super kotlin.Unit> r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onNavigationEvent(java.lang.String, kotlin.jvm.functions.Function1, o.access13800):java.lang.Object");
    }

    private final void ITrustedWebActivityServiceStub() {
        int i = 2 % 2;
        int i2 = newSession;
        int i3 = i2 + 125;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        fuseboxEnabledRelease fuseboxenabledrelease = this.onMinimized;
        if (fuseboxenabledrelease != null) {
            int i5 = i2 + 79;
            prefetch = i5 % 128;
            if (i5 % 2 == 0) {
                this.onMessageChannelReady = fuseboxenabledrelease.onTransact();
                this.onActivityResized = fuseboxenabledrelease.asBinder();
                throw null;
            }
            this.onMessageChannelReady = fuseboxenabledrelease.onTransact();
            this.onActivityResized = fuseboxenabledrelease.asBinder();
            int i6 = newSession + 11;
            prefetch = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(GuestPasswordResetActivity guestPasswordResetActivity, checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 17;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i4 = R.string.account_verification_otp_check_bank_item_and_input_three_digit;
        Object[] objArr = {checknavigationbarbysystemproperties.IAuthTabCallbackStubProxy()};
        Object[] objArr2 = new Object[1];
        a((short) (62 - ((Process.getThreadPriority(0) + 20) >> 6)), (byte) Gravity.getAbsoluteGravity(0, 0), 1885 - AndroidCharacter.getMirror('0'), Color.red(0) - 1481759712, (-117) - TextUtils.getOffsetBefore("", 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), guestPasswordResetActivity.getString(i4, objArr));
        Object[] objArr3 = new Object[1];
        a((short) (((Process.getThreadPriority(0) + 20) >> 6) + 118), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1765669070) - TextUtils.getCapsMode("", 0, 0), KeyEvent.getDeadChar(0, 0) - 1481759730, (-117) - TextUtils.getTrimmedLength(""), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), guestPasswordResetActivity.getString(R.string.account_verification_otp_manual_input_deposit_record_button));
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        int i5 = newSession + 87;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, String str, String str2, String str3, boolean z, int i, String str4, SetDetectableSize setDetectableSize) throws Throwable {
        int i2 = 2 % 2;
        int i3 = newSession + 43;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) (62 - ExpandableListView.getPackedPositionType(0L)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) - 1765669075, TextUtils.indexOf("", "", 0, 0) - 1481759712, (-117) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        c(new char[]{19907, 27817, 34434, 48566, 35999, 61495, 53280, 5533, 24660, 4159, 63267, 46186}, 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), str2);
        setDetectableSize.onExtraCallback().put("bank_code", str3);
        setDetectableSize.onExtraCallback().put("bankapp_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback().put("cnt_cta", Integer.valueOf(i));
        if (str4 != null) {
            int i5 = prefetch + 103;
            newSession = i5 % 128;
            int i6 = i5 % 2;
            Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
            Object[] objArr3 = new Object[1];
            a((short) (119 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1765669070) - View.MeasureSpec.getMode(0), TextUtils.lastIndexOf("", '0') - 1481759729, (-116) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
            mapOnExtraCallback3.put(((String) objArr3[0]).intern(), str4);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(final GuestPasswordResetActivity guestPasswordResetActivity, final String str, long j, final String str2, final String str3, final String str4, String str5, final boolean z, final int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.IAuthTabCallback(this.f$0, str2, str3, str, z, i, str4, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = newSession + 89;
        prefetch = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void IAuthTabCallback(@NotNull final String str, @NotNull String str2, @NotNull Function0<Unit> function0, @NotNull final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(str);
        if (checknavigationbarbysystempropertiesOnExtraCallback == null) {
            int i2 = prefetch + 109;
            newSession = i2 % 128;
            int i3 = i2 % 2;
        } else {
            IAuthTabCallback(1222953L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return GuestPasswordResetActivity.IAuthTabCallback(this.f$0, checknavigationbarbysystempropertiesOnExtraCallback, function1, (SetDetectableSize) obj);
                }
            });
            new fixTextClippingAndroid15useBoundsForWidth(this, this, checknavigationbarbysystempropertiesOnExtraCallback, function0, new getBacktraceNoteList() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                    return GuestPasswordResetActivity.onWarmupCompleted(this.f$0, str, ((Long) obj).longValue(), (String) obj2, (String) obj3, (String) obj4, (String) obj5, ((Boolean) obj6).booleanValue(), ((Integer) obj7).intValue());
                }
            }).IAuthTabCallback();
            int i4 = prefetch + 111;
            newSession = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit access100(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 59;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        fuseboxEnabledRelease fuseboxenabledrelease = guestPasswordResetActivity.onMinimized;
        if (fuseboxenabledrelease != null) {
            int i4 = newSession + 121;
            prefetch = i4 % 128;
            if (i4 % 2 == 0) {
                fuseboxenabledrelease.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strOnExtraCallback = fuseboxenabledrelease.onExtraCallback();
            if (strOnExtraCallback != null) {
                Object[] objArr = new Object[1];
                a((short) (TextUtils.lastIndexOf("", '0') + 63), (byte) (ViewConfiguration.getTouchSlop() >> 8), Color.argb(0, 0, 0, 0) - 1765669075, 9296 - AndroidCharacter.getMirror('0'), (-117) - KeyEvent.getDeadChar(0, 0), objArr);
                setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), guestPasswordResetActivity.getString(R.string.account_verification_otp_check_bank_item_and_input_three_digit, strOnExtraCallback));
                int i5 = prefetch + 71;
                newSession = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        Object[] objArr2 = new Object[1];
        a((short) (117 - Process.getGidForName("")), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1765669069) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) - 1481759730, TextUtils.getOffsetBefore("", 0) - 117, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), guestPasswordResetActivity.getString(R.string.account_verification_otp_manual_input_alternative_button));
        return Unit.INSTANCE;
    }

    public void ICustomTabsServiceStub() throws Throwable {
        int i = 2 % 2;
        IAuthTabCallback(1222955L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.asBinder(this.f$0, (SetDetectableSize) obj);
            }
        });
        getSmallIconId();
        int i2 = newSession + 45;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
    }

    public void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = newSession + 19;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(this, 1219349L, (Function1) null, 2, (Object) null);
        int i4 = prefetch + 113;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    public void access200() {
        int i = 2 % 2;
        IAuthTabCallback(1223151L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda19
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        });
        int i2 = newSession + 65;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback_Parcel(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 13;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a((short) ((Process.myTid() >> 22) + 62), (byte) (Process.myTid() >> 22), (-1765669074) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-1481759712) - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) - 117, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), guestPasswordResetActivity.getString(R.string.account_verification_otp_progressing_top_upper));
        Unit unit = Unit.INSTANCE;
        int i4 = prefetch + 61;
        newSession = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onSessionEnded() {
        int i = 2 % 2;
        IAuthTabCallback(1222949L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
                return (Unit) GuestPasswordResetActivity.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 959157775, iOnExtraCallbackWithResult2, -959157770);
            }
        });
        int i2 = newSession + 47;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) throws Throwable {
        AccountInputFragment.onWarmupCompleted onwarmupcompleted = (GuestPasswordResetActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = newSession + 63;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a((short) (TextUtils.lastIndexOf("", '0', 0) + 63), (byte) (Process.myTid() >> 22), (-1765669075) - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.green(0) - 1481759712, (-117) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        mapOnExtraCallback.put(((String) objArr2[0]).intern(), onwarmupcompleted.getString(R.string.account_verification_send_deposit_completed_top_upper));
        Unit unit = Unit.INSTANCE;
        int i4 = newSession + 115;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNavigationEvent(@NotNull final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        IAuthTabCallback(1222951L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda36
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallbackWithResult(function1, (SetDetectableSize) obj);
            }
        });
        int i2 = prefetch + 21;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 3;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            function1.invoke(setDetectableSize);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        function1.invoke(setDetectableSize);
        int i3 = 87 / 0;
        return Unit.INSTANCE;
    }

    public void IAuthTabCallback(@NotNull final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        IAuthTabCallback(1268981L, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.IAuthTabCallback(function1, (SetDetectableSize) obj);
            }
        });
        int i2 = prefetch + 51;
        newSession = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onNavigationEvent(Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = newSession + 35;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            function1.invoke(setDetectableSize);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        function1.invoke(setDetectableSize);
        int i3 = 16 / 0;
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment.onExtraCallback
    public void IEngagementSignalsCallbackStub() {
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragmentOnNavigationEvent;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = newSession + 29;
        prefetch = i3 % 128;
        if (i3 % 2 == 0) {
            verifyGuestUssCardPasswordFragmentOnNavigationEvent = VerifyGuestUssCardPasswordFragment.Companion.onNavigationEvent(this.extraCallbackWithResult);
            str = "uss_card_password_verification";
            z = true;
            i = 2;
        } else {
            verifyGuestUssCardPasswordFragmentOnNavigationEvent = VerifyGuestUssCardPasswordFragment.Companion.onNavigationEvent(this.extraCallbackWithResult);
            str = "uss_card_password_verification";
            z = false;
            i = 4;
        }
        onWarmupCompleted(this, verifyGuestUssCardPasswordFragmentOnNavigationEvent, str, z, i, null);
        int i4 = prefetch + 17;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.onNavigationEvent
    public void IPostMessageServiceDefault() {
        int i = 2 % 2;
        int i2 = newSession + 87;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(this, VerifyGuestUssCardCvcFragment.Companion.onExtraCallback(this.extraCallbackWithResult), "uss_card_cvc_verification", false, 4, null);
        int i4 = prefetch + 79;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallback
    public void onGreatestScrollPercentageIncreased() throws Throwable {
        int i = 2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        if (((GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192)).IAuthTabCallbackStub()) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a((short) (76 - (ViewConfiguration.getPressedStateDuration() >> 16)), (byte) ExpandableListView.getPackedPositionGroup(0L), (-1765669118) + (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1481759721) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 117, objArr);
            if (!textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr[0]).intern(), false)) {
                int i2 = prefetch + 21;
                newSession = i2 % 128;
                int i3 = i2 % 2;
                Intent intentIAuthTabCallback = CertifyGuestActivity.onExtraCallbackWithResult.IAuthTabCallback(CertifyGuestActivity.Companion, this, this.extraCallbackWithResult, 0L, null, null, getNameFromAnnotation.RESET_PASSWORD, true, true, false, null, 796, null);
                createPaints.IAuthTabCallback.onNavigationEvent(true);
                this.getInterfaceDescriptor.onNavigationEvent(intentIAuthTabCallback);
                return;
            }
        }
        String string = getString(R.string.verify_session_success_toast);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(this, string), R.drawable.icn_success_color, 0, 2, (Object) null), 500, (Integer) null, 1, 2, (Object) null);
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3, -347993396, iOnExtraCallbackWithResult4, 347993415);
        int i4 = newSession + 119;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardIntroFragment.onExtraCallback
    public void IEngagementSignalsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 3;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService_Parcel();
        int i4 = newSession + 17;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallback
    public void IPostMessageServiceStub() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 89;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService_Parcel();
        int i4 = prefetch + 81;
        newSession = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.onNavigationEvent
    public void IPostMessageService() throws Throwable {
        int i = 2 % 2;
        int i2 = newSession + 3;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        ITrustedWebActivityService_Parcel();
        int i4 = newSession + 115;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ITrustedWebActivityService_Parcel() throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer();
        int i4 = prefetch + 125;
        newSession = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, long j, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = newSession + 65;
        int i4 = i3 % 128;
        prefetch = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 37;
            newSession = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        guestPasswordResetActivity.IAuthTabCallback(j, (Function1<? super SetDetectableSize, Unit>) function1);
    }

    private final void IAuthTabCallback(long j, final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(j, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.GuestPasswordResetActivity$$ExternalSyntheticLambda29
            public final Object invoke(Object obj) {
                return GuestPasswordResetActivity.onExtraCallback(this.f$0, function1, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        int i2 = prefetch + 77;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    private static final Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, Function1 function1, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = prefetch + 13;
        newSession = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
            onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int iOnExtraCallbackWithResult4 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult4, 1471182366, iOnExtraCallbackWithResult5, -1471182350);
        if (function1 != null) {
            function1.invoke(setDetectableSize);
            int i3 = newSession + 75;
            prefetch = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r0 != r4) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.app.Activity, java.lang.Object, viva.republica.toss.guest.GuestPasswordResetActivity] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.fuseboxEnabledRelease r17, o.access13800<? super kotlin.Unit> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.IAuthTabCallback(o.fuseboxEnabledRelease, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onTransact(java.lang.Object[] r6) throws java.lang.Throwable {
        /*
            r0 = 0
            r1 = r6[r0]
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = 1
            r3 = r6[r2]
            viva.republica.toss.guest.GuestPasswordResetActivity r3 = (viva.republica.toss.guest.GuestPasswordResetActivity) r3
            r4 = 2
            r6 = r6[r4]
            android.content.DialogInterface r6 = (android.content.DialogInterface) r6
            int r6 = r4 % r4
            int r6 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r6 = r6 + 91
            int r5 = r6 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r5
            int r6 = r6 % r4
            if (r6 != 0) goto L24
            boolean r6 = r1 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            r2 = 81
            int r2 = r2 / r0
            if (r6 == 0) goto L5d
            goto L2a
        L24:
            boolean r6 = r1 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            r6 = r6 ^ r2
            if (r6 == 0) goto L2a
            goto L5d
        L2a:
            im.toss.network.throwable.TossApiCallException$ApiError r1 = (im.toss.network.throwable.TossApiCallException.ApiError) r1
            java.lang.String r6 = r1.asBinder()
            java.lang.String r2 = "TV4254"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            if (r6 == 0) goto L5d
            int r6 = viva.republica.toss.guest.GuestPasswordResetActivity.newSession
            int r6 = r6 + 61
            int r2 = r6 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.prefetch = r2
            int r6 = r6 % r4
            java.lang.String r6 = r1.asBinder()
            if (r6 != 0) goto L57
            int r6 = viva.republica.toss.guest.GuestPasswordResetActivity.prefetch
            int r6 = r6 + 15
            int r1 = r6 % 128
            viva.republica.toss.guest.GuestPasswordResetActivity.newSession = r1
            int r6 = r6 % r4
            if (r6 == 0) goto L55
            r6 = 33
            int r6 = r6 / r0
        L55:
            java.lang.String r6 = ""
        L57:
            r3.IAuthTabCallbackStub = r6
            r3.finish()
            goto L60
        L5d:
            r3.getSmallIconId()
        L60:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onTransact(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r13 != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r4.onNavigationEvent(3000, r1) == r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(o.fuseboxEnabledRelease r12, o.access13800<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.GuestPasswordResetActivity.onNavigationEvent(o.fuseboxEnabledRelease, o.access13800):java.lang.Object");
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = prefetch + 77;
        int i3 = i2 % 128;
        newSession = i3;
        int i4 = i2 % 2;
        this.onMinimized = null;
        this.onMessageChannelReady = null;
        this.onActivityResized = null;
        this.IAuthTabCallbackStub = "";
        int i5 = i3 + 107;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = prefetch + 57;
        newSession = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            fixMappingOfEventPrioritiesBetweenFabricAndReact.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{IAuthTabCallback()}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 331338725, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -331338719);
            if (this.ICustomTabsCallback) {
                IAuthTabCallback(1222973L, (Function1<? super SetDetectableSize, Unit>) new GuestPasswordResetActivity$.ExternalSyntheticLambda10(this));
                int i3 = newSession + 29;
                prefetch = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        super.onDestroy();
        fixMappingOfEventPrioritiesBetweenFabricAndReact.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{IAuthTabCallback()}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 331338725, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -331338719);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) throws Throwable {
        boolean z;
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        if (guestPasswordResetActivity.onActivityResized != null) {
            int i2 = newSession + 59;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 62), (byte) Color.blue(0), KeyEvent.normalizeMetaState(0) - 1765669058, (-1481759713) + (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 117, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), zzaz.onExtraCallbackWithResult(z));
        String str = guestPasswordResetActivity.onMessageChannelReady;
        if (str != null) {
            int i4 = prefetch + 13;
            newSession = i4 % 128;
            if (i4 % 2 != 0) {
                setDetectableSize.onExtraCallback().put("bank_code", str);
                throw null;
            }
            setDetectableSize.onExtraCallback().put("bank_code", str);
        }
        setDetectableSize.onExtraCallback().put("end_auto_yn", "N");
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        if (guestPasswordResetActivity.onActivityResized != null) {
            Object[] objArr2 = new Object[1];
            c(new char[]{58621, 23843, 51086, 57139, 57979, 22950, 53484, 5307}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else if (StringsKt.isBlank(guestPasswordResetActivity.IAuthTabCallbackStub)) {
            Object[] objArr3 = new Object[1];
            c(new char[]{59447, 10758, 64799, 8608, 54486, 19149, 18156, 8298}, Color.argb(0, 0, 0, 0) + 8, objArr3);
            strIntern = ((String) objArr3[0]).intern();
        } else {
            strIntern = guestPasswordResetActivity.IAuthTabCallbackStub;
        }
        mapOnExtraCallback2.put("end_type", strIntern);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 959157775, iOnExtraCallbackWithResult2, -959157770);
    }

    public static /* synthetic */ Unit onNavigationEvent(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 960919518, iOnExtraCallbackWithResult2, -960919514);
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{function1, obj}, iOnExtraCallbackWithResult, -1220007294, iOnExtraCallbackWithResult2, 1220007308);
    }

    public static /* synthetic */ Unit onExtraCallback(GuestPasswordResetActivity guestPasswordResetActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, deserializeurinullablecollection}, iOnExtraCallbackWithResult, 798870501, iOnExtraCallbackWithResult2, -798870488);
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{function1, obj}, iOnExtraCallbackWithResult, -1452925958, iOnExtraCallbackWithResult2, 1452925959);
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallbackWithResult, 1836359579, iOnExtraCallbackWithResult2, -1836359562);
    }

    public static /* synthetic */ Unit asInterface(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, 433608965, iOnExtraCallbackWithResult2, -433608947);
    }

    public static /* synthetic */ Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult, 1596760198, iOnExtraCallbackWithResult2, -1596760198);
    }

    public static final /* synthetic */ Object IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, fuseboxEnabledRelease fuseboxenabledrelease, access13800 access13800Var) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, fuseboxenabledrelease, access13800Var}, iOnExtraCallbackWithResult, 1689672785, iOnExtraCallbackWithResult2, -1689672764);
    }

    private final CERT_GetPublicKeyAlgorithm ITrustedWebActivityService() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (CERT_GetPublicKeyAlgorithm) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -2090814370, iOnExtraCallbackWithResult2, 2090814385);
    }

    private final void onWarmupCompleted(SetDetectableSize setDetectableSize) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this, setDetectableSize}, iOnExtraCallbackWithResult, 1471182366, iOnExtraCallbackWithResult2, -1471182350);
    }

    private final GuestPasswordResetViewModel ITrustedWebActivityServiceDefault() {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (GuestPasswordResetViewModel) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -1869698189, iOnExtraCallbackWithResult2, 1869698192);
    }

    private static final Unit IAuthTabCallback(GuestPasswordResetActivity guestPasswordResetActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, deserializeurinullablecollection}, iOnExtraCallbackWithResult, -1603827201, iOnExtraCallbackWithResult2, 1603827207);
    }

    private static final Unit onNavigationEvent(GuestPasswordResetActivity guestPasswordResetActivity, getJSModule getjsmodule) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, getjsmodule}, iOnExtraCallbackWithResult, -389846804, iOnExtraCallbackWithResult2, 389846812);
    }

    private static final Unit IAuthTabCallbackDefault(GuestPasswordResetActivity guestPasswordResetActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, iEngagementSignalsCallbackDefault}, iOnExtraCallbackWithResult, -1764669535, iOnExtraCallbackWithResult2, 1764669557);
    }

    private final void notifyNotificationWithChannel() throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -38979660, iOnExtraCallbackWithResult2, 38979671);
    }

    private static final Unit onExtraCallback(Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{function1, setDetectableSize}, iOnExtraCallbackWithResult, -1097258449, iOnExtraCallbackWithResult2, 1097258458);
    }

    private static final Unit writeTypedObject(GuestPasswordResetActivity guestPasswordResetActivity, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, setDetectableSize}, iOnExtraCallbackWithResult, -621247837, iOnExtraCallbackWithResult2, 621247857);
    }

    private static final Unit onExtraCallbackWithResult(Throwable th, GuestPasswordResetActivity guestPasswordResetActivity, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{th, guestPasswordResetActivity, dialogInterface}, iOnExtraCallbackWithResult, -466341272, iOnExtraCallbackWithResult2, 466341279);
    }

    private static final Unit onExtraCallbackWithResult(GuestPasswordResetActivity guestPasswordResetActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity, deserializeurinullablecollection}, iOnExtraCallbackWithResult, -52506677, iOnExtraCallbackWithResult2, 52506679);
    }

    private static final void access100(GuestPasswordResetActivity guestPasswordResetActivity) throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{guestPasswordResetActivity}, iOnExtraCallbackWithResult, 1273409819, iOnExtraCallbackWithResult2, -1273409809);
    }

    private final void AudioAttributesCompatParcelizer() throws Throwable {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{this}, iOnExtraCallbackWithResult, -347993396, iOnExtraCallbackWithResult2, 347993415);
    }

    private final void onExtraCallback(fuseboxEnabledRelease fuseboxenabledrelease) throws Throwable {
        int iIAuthTabCallback = SdkMeterProvider$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 1649952689;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this, fuseboxenabledrelease}, iIAuthTabCallback, -1900456630, iCodePointAt, 1900456642);
    }

    private static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = zzmr.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = zzmr.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{str, setDetectableSize}, iOnExtraCallbackWithResult, -802546911, iOnExtraCallbackWithResult2, 802546934);
    }

    @Override // viva.republica.toss.guest.Hilt_GuestPasswordResetActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = prefetch + 109;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = newSession + 87;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.guest.Hilt_GuestPasswordResetActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = prefetch + 107;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = prefetch + 25;
        newSession = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.guest.Hilt_GuestPasswordResetActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = prefetch + 79;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = prefetch + 41;
        newSession = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_GuestPasswordResetActivity, viva.republica.toss.guest.LoginBaseActivity, viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = prefetch + 11;
        newSession = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        int i5 = newSession + 79;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    static void IEngagementSignalsCallback_Parcel() {
        ICustomTabsCallbackDefault = -847634162;
        ICustomTabsCallbackStubProxy = -1538795396;
        onUnminimized = -65665956;
        ICustomTabsCallbackStub = new byte[]{-100, -44, -54, -57, -44, -58, -40, -54, -65, -69, -83, -53, -91, -72, -65, -70, -56, -80, -110, -49, -71, -93, -55, -85, -61, -88, -78, -90, -64, -83, -79, -66, -92, -65, -55, -96, -76, -90, -71, -75, -80, -90, -93, -69, -52, -88, -74, -74, -110, -64, -90, -103, -77, -78, -59, -65, -112, -117, -118, -99, 119, -105, 115, -127, -115, -126, -127, -107, -98, -65, -44, -90, -54, -40, -52, -54, -72, -52, -61, 25, 30, 82, -48, 41, 16, 3, 43, 90, -24, 25, 41, 1, 41, 22, 70, -46, 40, 30, 29, 21, 70, -33, 31, 44, 26, 90, -57, 84, 21, -24, 25, 30, 81, -36, 21, 31, 44, 26, 90, -46, 20, 91, -37, 16, 20, 27, 86, -21, 26, 5, 35, 13, 17, 84, 16, 5, -41, 19, 28, 16, 44, -86, 96, 95, 118, 100, 123, 107, 101, 115, 87, 105, 112, 102, 115, 85, 115, 93, -125, 84, 99, 97, -120, -109, -68, -85, -60, -56, -72, -79, -70, -64, -88, -33, -96, -65, -67, -60, -85, 4, 11, -4, 13, 8, 1, 4, -30, 24, 24, 12, -15, -12, -15, 7, 5, -27, 41, -6, 9, -9, 30};
        ICustomTabsCallback_Parcel = (char) 23106;
        extraCommand = (char) 36266;
        mayLaunchUrl = (char) 18285;
        ICustomTabsService = (char) 31477;
    }
}
