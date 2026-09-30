package o;

import android.graphics.PointF;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.foreigner.home.R;
import im.toss.features.foreigner.home.ui.onboarding.ForeignerHomeWithdrawAgreementBridgeScreenKt$;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.handleNativeAdClick;
import o.pxToDp;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeCallContext {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static char[] onExtraCallbackWithResult = {32567, 32547, 32559, 32556, 32741, 32744, 32574, 32566, 32572, 32745, 32552, 32554, 32555, 32546, 32573, 32557, 32746, 32560, 32563, 32562, 32553, 32544};
    private static int onExtraCallback = -1184333857;
    private static boolean onWarmupCompleted = true;
    private static boolean onNavigationEvent = true;

    public static /* synthetic */ List IAuthTabCallback(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(rally, rally2, runonuithreaddelayed);
        }
        onExtraCallback(rally, rally2, runonuithreaddelayed);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List IAuthTabCallback(runOnUiThreadDelayed runonuithreaddelayed, runOnUiThreadDelayed runonuithreaddelayed2, runOnUiThreadDelayed runonuithreaddelayed3, runOnUiThreadDelayed runonuithreaddelayed4) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(runonuithreaddelayed, runonuithreaddelayed2, runonuithreaddelayed3, runonuithreaddelayed4);
        int i4 = IAuthTabCallback + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return listOnNavigationEvent;
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStub = IAuthTabCallbackStub(rally);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = IAuthTabCallback + 39;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 63;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unit = (Unit) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -432947235, 432947237, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function0, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i7 = asBinder + 61;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsAsInterface = asInterface(rally);
        int i4 = IAuthTabCallback + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return appLovinSdkSettingsAsInterface;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(rally);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ List onExtraCallbackWithResult(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List list = (List) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1096030916, -1096030916, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{rally, rally2, runonuithreaddelayed}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = IAuthTabCallback + 89;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsOnTransact = onTransact(rally);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return appLovinSdkSettingsOnTransact;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i);
        int i9 = ~i4;
        int i10 = (~(i9 | i3)) | i8;
        int i11 = ~i;
        int i12 = i11 | i3;
        int i13 = i10 | (~i12);
        int i14 = i7 | i4;
        int i15 = i8 | (~i14);
        int i16 = (~(i | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i4));
        int i17 = i3 + i4 + i2 + ((-1254723898) * i5) + ((-1667789834) * i6);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i3) + 1379663872 + ((-481802647) * i4) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i2) + ((-1033371648) * i5) + ((-106430464) * i6) + (1552875520 * i18);
        int i20 = ((i3 * (-402395399)) - 1316031342) + (i4 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i2 * (-402393527)) + (i5 * (-1219896714)) + (i6 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 != 1) {
            return i21 != 2 ? i21 != 3 ? i21 != 4 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }
        Rally rally = (Rally) objArr[0];
        int i22 = 2 % 2;
        int i23 = asBinder + 97;
        IAuthTabCallback = i23 % 128;
        int i24 = i23 % 2;
        AppLovinSdkSettings appLovinSdkSettingsAccess100 = access100(rally);
        int i25 = IAuthTabCallback + 27;
        asBinder = i25 % 128;
        int i26 = i25 % 2;
        return appLovinSdkSettingsAccess100;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List listAsBinder = asBinder(rally, rally2, runonuithreaddelayed);
        int i4 = asBinder + 49;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return listAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(rally);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettingsAsBinder = asBinder(rally);
        int i3 = IAuthTabCallback + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return appLovinSdkSettingsAsBinder;
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = asBinder + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final AppLovinSdkSettings asBinder(Rally rally) {
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
        }
        int i3 = asBinder + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return appLovinSdkSettingsOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final AppLovinSdkSettings asInterface(Rally rally) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
        int i4 = IAuthTabCallback + 119;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettingsOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final AppLovinSdkSettings IAuthTabCallbackStub(Rally rally) {
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
        }
        int i3 = asBinder + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettingsOnExtraCallbackWithResult;
    }

    private static final AppLovinSdkSettings onTransact(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            return AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
        }
        Intrinsics.checkNotNullParameter(rally, "");
        return AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
    }

    private static final AppLovinSdkSettings IAuthTabCallbackStubProxy(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rally, "");
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
        int i4 = IAuthTabCallback + 53;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettingsOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AppLovinSdkSettings access100(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            return AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 5, (Object) null);
        }
        Intrinsics.checkNotNullParameter(rally, "");
        return AuthenticatorCompanion.onExtraCallbackWithResult(AuthenticatorCompanion.IAuthTabCallback, authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST, (Function1) null, 4, (Object) null);
    }

    private static final List onExtraCallback(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        List listListOf;
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
            Rally[] rallyArr = new Rally[5];
            rallyArr[1] = rally;
            rallyArr[1] = rally2;
            listListOf = CollectionsKt.listOf(rallyArr);
        } else {
            Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
            listListOf = CollectionsKt.listOf(new Rally[]{rally, rally2});
        }
        int i3 = asBinder + 119;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return listListOf;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Rally rally = (Rally) objArr[0];
        Rally rally2 = (Rally) objArr[1];
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
            return CollectionsKt.listOf(new Rally[]{rally, rally2});
        }
        Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
        Rally[] rallyArr = new Rally[3];
        rallyArr[0] = rally;
        rallyArr[0] = rally2;
        return CollectionsKt.listOf(rallyArr);
    }

    private static final List asBinder(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        List listListOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
            Rally[] rallyArr = new Rally[3];
            rallyArr[1] = rally;
            rallyArr[0] = rally2;
            listListOf = CollectionsKt.listOf(rallyArr);
        } else {
            Intrinsics.checkNotNullParameter(runonuithreaddelayed, "");
            listListOf = CollectionsKt.listOf(new Rally[]{rally, rally2});
        }
        int i3 = asBinder + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return listListOf;
    }

    private static final List onNavigationEvent(runOnUiThreadDelayed runonuithreaddelayed, runOnUiThreadDelayed runonuithreaddelayed2, runOnUiThreadDelayed runonuithreaddelayed3, runOnUiThreadDelayed runonuithreaddelayed4) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(runonuithreaddelayed4, "");
        List listListOf = CollectionsKt.listOf(new runOnUiThreadDelayed[]{runonuithreaddelayed, runonuithreaddelayed2, runonuithreaddelayed3});
        int i4 = IAuthTabCallback + 123;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return listListOf;
        }
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> $onNextAction;
        final /* synthetic */ runOnUiThreadDelayed $timeline;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(runOnUiThreadDelayed runonuithreaddelayed, Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$timeline = runonuithreaddelayed;
            this.$onNextAction = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$timeline, this.$onNextAction, access13800Var);
            int i2 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 98 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallbackWithResult + 107;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                isFireOS.onExtraCallbackWithResult(this.$timeline, false, 1, (Object) null);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(2000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            this.$onNextAction.invoke();
            Unit unit = Unit.INSTANCE;
            int i5 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = $10 + 79;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 76 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 20952 - (ViewConfiguration.getTouchSlop() >> 8), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 74, 16037 - View.MeasureSpec.getSize(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                try {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 63, (Process.myTid() >> 22) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i6 = 1052772399;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 63 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12215 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object obj;
        Object obj2;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-760979368);
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallback + 93;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18) {
                int i8 = IAuthTabCallback + 87;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-760979368, i4, -1, "im.toss.features.foreigner.home.ui.onboarding.ForeignerHomeWithdrawAgreementBridgeScreen (ForeignerHomeWithdrawAgreementBridgeScreen.kt:40)");
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda0();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                requestPostMessageChannel.onExtraCallbackWithResult(false, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 1);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda3();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 24576, 16383);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda4();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                Rally rallyOnExtraCallback2 = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 1800, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 24576, 16351);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda5();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                Rally rallyOnExtraCallback3 = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 24576, 16383);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda6();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                Rally rallyOnExtraCallback4 = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 1800, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 24576, 16351);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda7();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                Rally rallyOnExtraCallback5 = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 24576, 16383);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda8();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                }
                Rally rallyOnExtraCallback6 = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 1800, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 24576, 16351);
                pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback2);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    Object obj3 = objOnMinimized8;
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda9(rallyOnExtraCallback, rallyOnExtraCallback2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda9);
                        obj3 = externalSyntheticLambda9;
                    }
                    runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult = RallyKt.onExtraCallbackWithResult(iAuthTabCallback, 0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function1) obj3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback3);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback4);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnNavigationEvent3 | zOnNavigationEvent4)) {
                        Object obj4 = objOnMinimized9;
                        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                            ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda10 externalSyntheticLambda10 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda10(rallyOnExtraCallback3, rallyOnExtraCallback4);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda10);
                            obj4 = externalSyntheticLambda10;
                        }
                        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult2 = RallyKt.onExtraCallbackWithResult(iAuthTabCallback, 0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function1) obj4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback5);
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback6);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent5 | zOnNavigationEvent6)) {
                            int i10 = asBinder + 103;
                            IAuthTabCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                onwarmupcompleted.onExtraCallback();
                                throw null;
                            }
                            if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                                ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda11(rallyOnExtraCallback5, rallyOnExtraCallback6);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda11);
                                obj = externalSyntheticLambda11;
                            } else {
                                obj = objOnMinimized10;
                            }
                            runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult3 = RallyKt.onExtraCallbackWithResult(iAuthTabCallback, 0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                            boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(runonuithreaddelayedOnExtraCallbackWithResult);
                            boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(runonuithreaddelayedOnExtraCallbackWithResult2);
                            boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(runonuithreaddelayedOnExtraCallbackWithResult3);
                            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent7 | zOnNavigationEvent8 | zOnNavigationEvent9)) {
                                Object obj5 = objOnMinimized11;
                                if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                    ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda1(runonuithreaddelayedOnExtraCallbackWithResult, runonuithreaddelayedOnExtraCallbackWithResult2, runonuithreaddelayedOnExtraCallbackWithResult3);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda1);
                                    obj5 = externalSyntheticLambda1;
                                }
                                runOnUiThreadDelayed runonuithreaddelayedOnExtraCallbackWithResult4 = RallyKt.onExtraCallbackWithResult(iAuthTabCallback, 0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, (Boolean) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function1) obj5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 0, 16382);
                                Unit unit = Unit.INSTANCE;
                                boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(runonuithreaddelayedOnExtraCallbackWithResult4);
                                boolean z2 = (i4 & 14) == 4;
                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if ((zOnNavigationEvent10 || z2) || objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                    obj2 = null;
                                    objOnMinimized12 = new onWarmupCompleted(runonuithreaddelayedOnExtraCallbackWithResult4, function0, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized12);
                                    int i11 = asBinder + 13;
                                    IAuthTabCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                } else {
                                    obj2 = null;
                                }
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized12, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, obj2);
                                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.35f), setByteOrder.onNavigationEvent(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.0f)))}, 270.0f, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 4);
                                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.onExtraCallback(), false);
                                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    getAwbState.onExtraCallback();
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Image;
                                handleNativeAdClick.onExtraCallback.onWarmupCompleted.onExtraCallback onextracallback = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion;
                                handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = onextracallback.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(451.0f));
                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(RallyModifierKt.IAuthTabCallback(onCaptureSessionStart.onExtraCallback(onextracallback2, 0.5f), rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2), rallyOnExtraCallback2, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                Object[] objArr = new Object[1];
                                Object obj6 = null;
                                a(null, null, new byte[]{-110, -107, -125, -118, -126, -107, -108, -120, -109, -121, -112, -110, -111, -112, -114, -115, -113, -122, -124, -126, -124, -114, -115, -115, -120, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
                                setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0IAuthTabCallback, onWarmupCompleted2, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3126, 0, 8176);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = UseTorchAsFlashQuirk.onExtraCallback(onextracallback2, ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6));
                                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                    int i13 = asBinder + 75;
                                    IAuthTabCallback = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        getAwbState.onExtraCallback();
                                        int i14 = 77 / 0;
                                    } else {
                                        getAwbState.onExtraCallback();
                                    }
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                    int i15 = asBinder + 65;
                                    IAuthTabCallback = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                                handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted3 = onextracallback.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f));
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = RallyModifierKt.IAuthTabCallback(RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback3, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2), rallyOnExtraCallback4, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2);
                                Object[] objArr2 = new Object[1];
                                a(null, null, new byte[]{-125, -113, -108, -106, -118, -108, -114, -115, -113, -111, -126, -127, -110, -120, -112, -111, -106, -117, -112, -112, -121, -122, -125, -113, -108, -106, -122, -116, -120, -118, -124, -124, -117, -126, -118, -119, -120, -126, -121, -126, -124, -122, -122, -123, -124, -125, -126, -126, -127}, 127 - View.getDefaultSize(0, 0), objArr2);
                                setMainImageUri.IAuthTabCallback(((String) objArr2[0]).intern(), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0IAuthTabCallback2, onWarmupCompleted3, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3126, 0, 8176);
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_withdraw_bridge_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), RallyModifierKt.IAuthTabCallback(RallyModifierKt.IAuthTabCallback(onextracallback2, rallyOnExtraCallback5, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2), rallyOnExtraCallback6, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 2), AppLovinPostbackService.onExtraCallbackWithResult.asInterface(), 0L, 0L, 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 196608, 98040}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                            }
                        }
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeWithdrawAgreementBridgeScreenKt$.ExternalSyntheticLambda2(function0, quirksExternalSyntheticBackport02, i, i2));
                return;
            }
            return;
        }
        int i16 = asBinder + 109;
        IAuthTabCallback = i16 % 128;
        int i17 = i16 % 2;
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult(Rally rally) {
        return (AppLovinSdkSettings) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 462050962, -462050959, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{rally}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ AppLovinSdkSettings onNavigationEvent(Rally rally) {
        return (AppLovinSdkSettings) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1390966855, 1390966856, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{rally}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ AppLovinSdkSettings IAuthTabCallbackDefault(Rally rally) {
        return (AppLovinSdkSettings) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -906073850, 906073854, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{rally}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onNavigationEvent(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -432947235, 432947237, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function0, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final List onNavigationEvent(Rally rally, Rally rally2, runOnUiThreadDelayed runonuithreaddelayed) {
        return (List) onWarmupCompleted(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1096030916, -1096030916, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{rally, rally2, runonuithreaddelayed}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }
}
