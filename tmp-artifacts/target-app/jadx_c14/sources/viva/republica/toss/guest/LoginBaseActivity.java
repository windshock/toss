package viva.republica.toss.guest;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.useronboarding.common.dev.OnboardingDevToolActionManager;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinError;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.Encoder;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.JsonReaderUnknownNumberParsing;
import o.RightClickGesturesKtonRightClickDown2;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CMP_IssueCertificate;
import o.access8100;
import o.buildInitSettings;
import o.calcThumbnailOptions;
import o.decodeFile;
import o.deserializeUriNullableCollection;
import o.getWrite;
import o.setAdUnitIds;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.LoginBaseActivity$;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class LoginBaseActivity extends Hilt_LoginBaseActivity {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallbackStub;
    public static final int IAuthTabCallback_Parcel;
    private static int access100;
    private static char asBinder;
    private static long asInterface;
    private final Lazy IAuthTabCallbackDefault = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CertifyGuestViewModel.class), new onNavigationEvent(this), new IAuthTabCallback(this), new onExtraCallbackWithResult(null, this));

    @Inject
    public AppLovinError applicationProcessManager;

    @Inject
    public setAdUnitIds loginStatus;
    private boolean onTransact;

    @Inject
    public dagger.Lazy<OnboardingDevToolActionManager> onboardingDevToolActionManager;

    @Inject
    public calcThumbnailOptions userOnboardingLogManager;
    private static final byte[] $$d = {114, 69, -115, -114};
    private static final int $$e = 37;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 0;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(int r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            byte[] r0 = viva.republica.toss.guest.LoginBaseActivity.$$d
            int r7 = r7 + 109
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r6 = r9
            r9 = r7
            r7 = r6
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2b:
            int r9 = r9 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.LoginBaseActivity.$$f(int, byte, int):java.lang.String");
    }

    static {
        access100 = 1;
        areNotificationsEnabled();
        Companion = new onExtraCallback(null);
        IAuthTabCallback_Parcel = 8;
        int i = access000 + 123;
        access100 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LoginBaseActivity loginBaseActivity, Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            return (Unit) asBinder(7906700, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -7906693, new Object[]{loginBaseActivity, function1, setDetectableSize}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
        }
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback4 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object asBinder(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = i7 | i;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i));
        int i11 = (~(i6 | i)) | (~(i7 | i6));
        int i12 = i9 | i8;
        int i13 = i + i3 + i5 + (988256597 * i2) + ((-695401848) * i4);
        int i14 = i13 * i13;
        int i15 = (((-880163897) * i) - 1270611968) + ((-1462879173) * i3) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i5) + (479985664 * i2) + (1063256064 * i4) + (1273561088 * i14);
        int i16 = (i * (-1367684995)) + 376186498 + (i3 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + (i5 * (-1367684709)) + (i2 * 1512018807) + (i4 * 1127043160) + (i14 * (-418185216));
        switch (i15 + (i16 * i16 * 1903099904)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                String str = (String) objArr[0];
                final LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[1];
                final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[3];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
                commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallback(new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj) {
                        return LoginBaseActivity.onWarmupCompleted(this.f$0, zBooleanValue, (DialogInterface) obj);
                    }
                })}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
                commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda9
                    public final Object invoke(Object obj) {
                        return LoginBaseActivity.onNavigationEvent(this.f$0, (DialogInterface) obj);
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i18 = getInterfaceDescriptor + 123;
                IAuthTabCallbackStubProxy = i18 % 128;
                int i19 = i18 % 2;
                return unit;
        }
    }

    public static /* synthetic */ void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        int i4 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(dialogInterface);
        }
        onWarmupCompleted(dialogInterface);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(loginBaseActivity, function1, setDetectableSize);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossApiCallException.ApiError apiError, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(apiError, dialogInterface);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(apiError, dialogInterface);
        int i3 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, LoginBaseActivity loginBaseActivity, boolean z, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, loginBaseActivity, Boolean.valueOf(z), commonModule_setLeftEdgeTouchEnabled};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) asBinder(1733175809, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1733175809, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
        int i4 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoginBaseActivity loginBaseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loginBaseActivity, dialogInterface);
        int i4 = IAuthTabCallbackStubProxy + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoginBaseActivity loginBaseActivity, TossApiCallException.ApiError apiError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loginBaseActivity, apiError);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoginBaseActivity loginBaseActivity, Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(loginBaseActivity, function1, setDetectableSize);
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Encoder encoder, LoginBaseActivity loginBaseActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(encoder, loginBaseActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoginBaseActivity loginBaseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) asBinder(-1532498344, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1532498347, new Object[]{loginBaseActivity, dialogInterface}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
        int i4 = IAuthTabCallbackStubProxy + 55;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoginBaseActivity loginBaseActivity, boolean z, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {loginBaseActivity, Boolean.valueOf(z), dialogInterface};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) asBinder(-569416646, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 569416647, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.onTransact = z;
        int i5 = i3 + 85;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 93;
        viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.setAdUnitIds ITrustedWebActivityCallbackDefault() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor
            int r1 = r1 + 107
            int r2 = r1 % 128
            viva.republica.toss.guest.LoginBaseActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            r3 = 93
            r4 = 0
            if (r1 != 0) goto L18
            o.setAdUnitIds r1 = r6.loginStatus
            int r5 = r3 / 0
            if (r1 == 0) goto L29
            goto L1c
        L18:
            o.setAdUnitIds r1 = r6.loginStatus
            if (r1 == 0) goto L29
        L1c:
            int r2 = r2 + r3
            int r3 = r2 % 128
            viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L25
            return r1
        L25:
            r4.hashCode()
            throw r4
        L29:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.LoginBaseActivity.ITrustedWebActivityCallbackDefault():o.setAdUnitIds");
    }

    public final AppLovinError ITrustedWebActivityCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AppLovinError appLovinError = this.applicationProcessManager;
        if (appLovinError == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 107;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return appLovinError;
    }

    public final dagger.Lazy<OnboardingDevToolActionManager> IPostMessageService_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 53;
        getInterfaceDescriptor = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        dagger.Lazy<OnboardingDevToolActionManager> lazy = this.onboardingDevToolActionManager;
        if (lazy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i2 + 125;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        obj.hashCode();
        throw null;
    }

    public final calcThumbnailOptions ITrustedWebActivityCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        calcThumbnailOptions calcthumbnailoptions = this.userOnboardingLogManager;
        if (calcthumbnailoptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return calcthumbnailoptions;
        }
        throw null;
    }

    public final CertifyGuestViewModel cancelNotification() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        CertifyGuestViewModel certifyGuestViewModel = (CertifyGuestViewModel) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStubProxy + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return certifyGuestViewModel;
        }
        throw null;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallback(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallbackWithResult.getDefaultViewModelProviderFactory();
        }
    }

    public static final class onNavigationEvent implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onNavigationEvent.getViewModelStore();
        }
    }

    private static final Unit onExtraCallbackWithResult(TossApiCallException.ApiError apiError, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        UST_CMP_IssueCertificate.onExtraCallback onextracallback = UST_CMP_IssueCertificate.onExtraCallback.LOGIN;
        Object[] objArr = new Object[1];
        d((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 293325119, new char[]{34247, 31168, 62617, 3479, 47592, 36872, 26278}, new char[]{56042, 60702, 52751, 49116}, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), new char[]{49842, 33846, 61166, 26589}, objArr);
        UST_CMP_IssueCertificate.onNavigationEvent(false, onextracallback, "LOGIN_PKEY_EXPIRED", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), apiError.getMessage()), getWrite.IAuthTabCallback("from", "LoginBaseActivity")}), 0, 17, null);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return unit;
    }

    public static final class onExtraCallbackWithResult implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;
        final /* synthetic */ Function0 onExtraCallback;

        public onExtraCallbackWithResult(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.IAuthTabCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.IAuthTabCallback.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r1.equals("TV8105") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r1.equals("TV4002") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if ((!r1.equals("TV4001")) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r9.cancelNotification().onTransact(0);
        r10 = r10.getMessage();
        r1 = r9.getString(viva.republica.toss.R.string.login_session_expired_default_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        IAuthTabCallback(r9, o.mergeParams.onNavigationEvent(r10, r1), false, 2, null);
        r9 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor + 109;
        r10 = r9 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(viva.republica.toss.guest.LoginBaseActivity r9, im.toss.network.throwable.TossApiCallException.ApiError r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r10.asBinder()
            int r2 = r1.hashCode()
            switch(r2) {
                case -1809099009: goto L45;
                case -1809099008: goto L3c;
                case -1808978880: goto L33;
                case -1808978851: goto L17;
                default: goto Le;
            }
        Le:
            int r9 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor
            int r9 = r9 + 49
            int r10 = r9 % 128
        L14:
            viva.republica.toss.guest.LoginBaseActivity.IAuthTabCallbackStubProxy = r10
            goto L78
        L17:
            java.lang.String r0 = "TV8113"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L79
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r3 = 0
            r4 = 0
            r5 = 0
            viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda2 r6 = new viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda2
            r6.<init>(r10)
            r7 = 14
            r8 = 0
            r1 = r10
            r2 = r9
            o.getParamImp.onWarmupCompleted(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L79
        L33:
            java.lang.String r2 = "TV8105"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L79
            goto L50
        L3c:
            java.lang.String r2 = "TV4002"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L50
            goto L79
        L45:
            java.lang.String r2 = "TV4001"
            boolean r1 = r1.equals(r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L50
            goto L79
        L50:
            viva.republica.toss.guest.certify.CertifyGuestViewModel r1 = r9.cancelNotification()
            r2 = 0
            r1.onTransact(r2)
            java.lang.String r10 = r10.getMessage()
            int r1 = viva.republica.toss.R.string.login_session_expired_default_message
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r10 = o.mergeParams.onNavigationEvent(r10, r1)
            r1 = 0
            r2 = 0
            IAuthTabCallback(r9, r10, r1, r0, r2)
            int r9 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor
            int r9 = r9 + 109
            int r10 = r9 % 128
            goto L14
        L78:
            int r9 = r9 % r0
        L79:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.LoginBaseActivity.IAuthTabCallback(viva.republica.toss.guest.LoginBaseActivity, im.toss.network.throwable.TossApiCallException$ApiError):kotlin.Unit");
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        asBinder(1335624450, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1335624444, new Object[]{this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = buildInitSettings.onExtraCallback.onWarmupCompleted().onExtraCallback(TossApiCallException.ApiError.class);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnExtraCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnExtraCallback.IAuthTabCallback(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new LoginBaseActivity$.ExternalSyntheticLambda11(new LoginBaseActivity$.ExternalSyntheticLambda10(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        int i2 = IAuthTabCallbackStubProxy + 83;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        cancelNotification().ICustomTabsService();
        if (ITrustedWebActivityCallbackDefault().IAuthTabCallback()) {
            int i4 = IAuthTabCallbackStubProxy + 23;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            if (this.onTransact) {
                return;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoginBaseActivity", "finishAffinity, GuestActivity Resumed After Login", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            finishAffinity();
            int i6 = getInterfaceDescriptor + 61;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(LoginBaseActivity loginBaseActivity, Intent intent, Pair pair, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeActivity");
        }
        if ((i & 2) != 0) {
            pair = new Pair(Integer.valueOf(R.anim.anim_window_in_from_right), Integer.valueOf(R.anim.anim_window_out_to_left));
            int i3 = IAuthTabCallbackStubProxy + 107;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        loginBaseActivity.onWarmupCompleted(intent, (Pair<Integer, Integer>) pair);
        int i5 = getInterfaceDescriptor + 5;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onWarmupCompleted(@NotNull Intent intent, @NotNull Pair<Integer, Integer> pair) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(pair, "");
            intent.addFlags(131072);
            startActivity(intent);
            overridePendingTransition(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(pair, "");
        intent.addFlags(131072);
        startActivity(intent);
        overridePendingTransition(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        int i3 = getInterfaceDescriptor + 45;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void ITrustedWebActivityCallbackStubProxy() {
        final Encoder encoder;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            if (!zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer()) {
                encoder = Encoder.GLOBAL;
            } else {
                int i3 = getInterfaceDescriptor + 17;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                encoder = Encoder.KR;
            }
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return LoginBaseActivity.onWarmupCompleted(encoder, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
            return;
        }
        zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        loginBaseActivity.ITrustedWebActivityCallbackStub().IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(Encoder encoder, final LoginBaseActivity loginBaseActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        Integer titleRes = encoder.getTitleRes();
        String string = null;
        if (titleRes != null) {
            int i2 = getInterfaceDescriptor + 71;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                loginBaseActivity.getString(titleRes.intValue());
                throw null;
            }
            string = loginBaseActivity.getString(titleRes.intValue());
            int i3 = IAuthTabCallbackStubProxy + 77;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
        }
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(string);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(encoder.getMessageRes()));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, encoder.getPositiveRes(), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return LoginBaseActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, encoder.getNegativeRes(), (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                return (Unit) LoginBaseActivity.asBinder(534246333, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -534246329, new Object[]{(DialogInterface) obj}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void IAuthTabCallback(LoginBaseActivity loginBaseActivity, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStopDialog");
        }
        int i3 = getInterfaceDescriptor + 27;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 65;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        loginBaseActivity.onExtraCallbackWithResult(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onExtraCallbackWithResult(@Nullable String str, boolean z) {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new LoginBaseActivity$.ExternalSyntheticLambda1(str, this, z));
        int i2 = getInterfaceDescriptor + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 2 / 0;
        }
    }

    private static void d(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $10 + 3;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int offsetAfter = 43 - TextUtils.getOffsetAfter("", 0);
                    int iKeyCodeFromString = 1451 - KeyEvent.keyCodeFromString("");
                    byte b = (byte) ($$e & 3);
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), offsetAfter, iKeyCodeFromString, 228868077, false, $$f(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.getDefaultSize(0, 0)), 44 - TextUtils.indexOf("", "", 0), Color.blue(0) + 1494, 1533236389, false, $$f(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getEdgeSlop() >> 16)), 50 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - ExpandableListView.getPackedPositionGroup(0L)), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (asInterface ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 95;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        loginBaseActivity.ITrustedWebActivityCallbackStub().IAuthTabCallback(zBooleanValue);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 65;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(LoginBaseActivity loginBaseActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        loginBaseActivity.finishAffinity();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 3;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(LoginBaseActivity loginBaseActivity, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initActionBar");
        }
        if ((i & 1) != 0) {
            int i3 = getInterfaceDescriptor + 73;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallbackStubProxy + 121;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        loginBaseActivity.onWarmupCompleted(str, z);
    }

    protected final void onWarmupCompleted(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = getInterfaceDescriptor + 83;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                supportActionBar.onExtraCallbackWithResult(str);
                supportActionBar.onNavigationEvent(z);
            } else {
                supportActionBar.onExtraCallbackWithResult(str);
                supportActionBar.onNavigationEvent(z);
                throw null;
            }
        }
    }

    public static /* synthetic */ void onWarmupCompleted(LoginBaseActivity loginBaseActivity, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 69;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEnrollmentClickEvent");
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 107;
            getInterfaceDescriptor = i6 % 128;
            function1 = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        asBinder(1243422708, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1243422706, new Object[]{loginBaseActivity, str, function1}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "click");
        setDetectableSize.onExtraCallback("act_type", "enrollment_funnel");
        setDetectableSize.onExtraCallback("screen_name", loginBaseActivity.getScreenName());
        if (function1 != null) {
            int i4 = getInterfaceDescriptor + 7;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                function1.invoke(setDetectableSize);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            function1.invoke(setDetectableSize);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        String str = (String) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted(str, false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return LoginBaseActivity.IAuthTabCallback(this.f$0, function1, (SetDetectableSize) obj);
            }
        }, 28, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 13;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onWarmupCompleted(viva.republica.toss.guest.LoginBaseActivity r8, kotlin.jvm.functions.Function1 r9, o.SetDetectableSize r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.guest.LoginBaseActivity.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r2 = "screen_name"
            java.lang.String r3 = "enrollment_funnel"
            java.lang.String r4 = "act_type"
            java.lang.String r5 = "impression"
            java.lang.String r6 = "action_type"
            java.lang.String r7 = ""
            if (r1 != 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r7)
            r10.onExtraCallback(r6, r5)
            r10.onExtraCallback(r4, r3)
            java.lang.String r8 = r8.getScreenName()
            r10.onExtraCallback(r2, r8)
            r8 = 29
            int r8 = r8 / 0
            if (r9 == 0) goto L4f
            goto L43
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r7)
            r10.onExtraCallback(r6, r5)
            r10.onExtraCallback(r4, r3)
            java.lang.String r8 = r8.getScreenName()
            r10.onExtraCallback(r2, r8)
            if (r9 == 0) goto L4f
        L43:
            r9.invoke(r10)
            int r8 = viva.republica.toss.guest.LoginBaseActivity.getInterfaceDescriptor
            int r8 = r8 + 115
            int r9 = r8 % 128
            viva.republica.toss.guest.LoginBaseActivity.IAuthTabCallbackStubProxy = r9
            int r8 = r8 % r0
        L4f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.LoginBaseActivity.onWarmupCompleted(viva.republica.toss.guest.LoginBaseActivity, kotlin.jvm.functions.Function1, o.SetDetectableSize):kotlin.Unit");
    }

    public final void onExtraCallback(@NotNull String str, @Nullable final Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted(str, false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.LoginBaseActivity$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return LoginBaseActivity.onNavigationEvent(this.f$0, function1, (SetDetectableSize) obj);
            }
        }, 28, (Object) null);
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(LoginBaseActivity loginBaseActivity, Function1 function1, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("action_type", "screen");
        setDetectableSize.onExtraCallback("act_type", "enrollment_funnel");
        setDetectableSize.onExtraCallback("screen_name", loginBaseActivity.getScreenName());
        Object obj = null;
        if (function1 != null) {
            int i4 = getInterfaceDescriptor + 117;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                function1.invoke(setDetectableSize);
                obj.hashCode();
                throw null;
            }
            function1.invoke(setDetectableSize);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallbackStubProxy + 59;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        int i4 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoginBaseActivity loginBaseActivity = (LoginBaseActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            decodeFile.onWarmupCompleted();
            obj.hashCode();
            throw null;
        }
        if (!decodeFile.onWarmupCompleted()) {
            return null;
        }
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle = loginBaseActivity.getLifecycle();
        Object obj2 = loginBaseActivity.IPostMessageService_Parcel().get();
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        lifecycle.IAuthTabCallback((TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0) obj2);
        int i3 = IAuthTabCallbackStubProxy + 81;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IPostMessageServiceStubProxy() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (ICustomTabsServiceDefault()) {
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "LoginBaseActivity", "Invalid Session, Restart App: onboardingSessionId :" + ITrustedWebActivityCallback().onExtraCallbackWithResult() + ", guestSessionId: " + cancelNotification().access100(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            onExtraCallbackWithResult(getString(R.string.error_retry_whole_message), true);
            int i4 = IAuthTabCallbackStubProxy + 95;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        if (ITrustedWebActivityCallback().IAuthTabCallback() && cancelNotification().access100() != 0) {
            int i2 = IAuthTabCallbackStubProxy + 55;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                cancelNotification().access100();
                throw null;
            }
            if (cancelNotification().access100() != -1) {
                return false;
            }
        }
        int i3 = IAuthTabCallbackStubProxy + 67;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoginBaseActivity loginBaseActivity, Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(559774433, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -559774428, new Object[]{loginBaseActivity, function1, setDetectableSize}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(534246333, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -534246329, new Object[]{dialogInterface}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    private final void onNavigationEvent() {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        asBinder(1335624450, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1335624444, new Object[]{this}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit onExtraCallbackWithResult(LoginBaseActivity loginBaseActivity, DialogInterface dialogInterface) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(-1532498344, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1532498347, new Object[]{loginBaseActivity, dialogInterface}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    private static final Unit onWarmupCompleted(String str, LoginBaseActivity loginBaseActivity, boolean z, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Object[] objArr = {str, loginBaseActivity, Boolean.valueOf(z), commonModule_setLeftEdgeTouchEnabled};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(1733175809, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1733175809, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onExtraCallback(LoginBaseActivity loginBaseActivity, boolean z, DialogInterface dialogInterface) {
        Object[] objArr = {loginBaseActivity, Boolean.valueOf(z), dialogInterface};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(-569416646, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 569416647, objArr, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback);
    }

    private static final Unit onExtraCallbackWithResult(LoginBaseActivity loginBaseActivity, Function1 function1, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) asBinder(7906700, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -7906693, new Object[]{loginBaseActivity, function1, setDetectableSize}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    protected final void onNavigationEvent(@NotNull String str, @Nullable Function1<? super SetDetectableSize, Unit> function1) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        asBinder(1243422708, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1243422706, new Object[]{this, str, function1}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback);
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 25;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getInterfaceDescriptor + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    @Override // viva.republica.toss.guest.Hilt_LoginBaseActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            throw null;
        }
    }

    static void areNotificationsEnabled() {
        asInterface = -3177638934926610159L;
        IAuthTabCallbackStub = -1776194565;
        asBinder = (char) 27643;
    }
}
