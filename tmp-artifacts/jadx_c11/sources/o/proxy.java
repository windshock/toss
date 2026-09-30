package o;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$;
import im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$animateStack$processAnimateStack$6$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.Authenticator;
import o.proxy;
import o.proxySelector;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class proxy {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onNavigationEvent = 1;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[protocols.values().length];
            try {
                iArr[protocols.Child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[protocols.Stack.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[protocols.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int[] iArr2 = new int[hostnameVerifier.values().length];
            try {
                iArr2[hostnameVerifier.UP.ordinal()] = 1;
                int i2 = onExtraCallback + 29;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[hostnameVerifier.DOWN.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr2;
            int i5 = onExtraCallback + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        dns dnsVar = (dns) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(dnsVar);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinSdkSettings, view, proxyselector);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(function1);
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, viewGroup, z);
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void onExtraCallback(socketFactory socketfactory, ViewGroup viewGroup, int i, int i2, protocols protocolsVar, Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, AppLovinSdkSettings appLovinSdkSettings, boolean z2, Function1 function1, Function1 function12, Function2 function2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {socketfactory, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), protocolsVar, authenticator, authenticator2, authenticator3, authenticator4, Boolean.valueOf(z), appLovinSdkSettings, Boolean.valueOf(z2), function1, function12, function2};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1992460206, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1992460206);
        int i6 = onNavigationEvent + 1;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, List list, int i2, AppLovinSdkSettings appLovinSdkSettings, boolean z, Function1 function1, Function1 function12, View view, proxySelector proxyselector) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(i, list, i2, appLovinSdkSettings, z, function1, function12, view, proxyselector);
        }
        onWarmupCompleted(i, list, i2, appLovinSdkSettings, z, function1, function12, view, proxyselector);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, View view, boolean z) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (i3 == 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(new Object[]{function2, view, boolValueOf}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 360303626, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -360303621);
            int i4 = 65 / 0;
        } else {
            int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            unit = (Unit) onWarmupCompleted(new Object[]{function2, view, boolValueOf}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 360303626, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, -360303621);
        }
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(View view, dns dnsVar) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(view, dnsVar);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {function1};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 718745350, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -718745349);
        int i4 = onWarmupCompleted + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        View view = (View) objArr[1];
        proxySelector proxyselector = (proxySelector) objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function1, view, proxyselector);
        }
        onNavigationEvent(function1, view, proxyselector);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~i6;
        int i10 = ~((~i5) | i9);
        int i11 = ~(i9 | i3);
        int i12 = i10 | i11;
        int i13 = (~(i5 | i7)) | i11 | i8;
        int i14 = i6 + i3 + i4 + ((-168536539) * i) + (1787681333 * i2);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i6) + 1460535296 + ((-923239215) * i3) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i4) + (1604583424 * i) + (216268800 * i2) + (1778253824 * i15);
        int i17 = (i6 * (-925914073)) + 175428941 + (i3 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i4 * (-925913209)) + (i * 1252505731) + (i2 * 30625011) + (i15 * (-2030960640));
        switch (i16 + (i17 * i17 * 899809280)) {
            case 1:
                Function1 function1 = (Function1) objArr[0];
                int i18 = 2 % 2;
                int i19 = onWarmupCompleted + 107;
                int i20 = i19 % 128;
                onNavigationEvent = i20;
                int i21 = i19 % 2;
                if (function1 != null) {
                    int i22 = i20 + 61;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    function1.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onExtraCallback(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, view, proxyselector);
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, View view, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(function2, view, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(function2, view, z);
        int i3 = onNavigationEvent + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appLovinSdkSettings, view, proxyselector);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ ViewGroup onWarmupCompleted(ViewGroup viewGroup, Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, protocols protocolsVar, AppLovinSdkSettings appLovinSdkSettings, boolean z2, int i, int i2, socketFactory socketfactory, Function2 function2, Function1 function1, Function1 function12, int i3, Object obj) {
        protocols protocolsVar2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback;
        int i4;
        Function1 function13;
        AuthenticatorCompanion authenticatorCompanion;
        authenticate authenticateVar;
        Cache cache;
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone;
        boolean z3;
        Function1 function14;
        int i5;
        int i6 = 2 % 2;
        Authenticator onnavigationevent = (i3 & 1) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator;
        Authenticator onnavigationevent2 = (i3 & 2) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator2;
        Authenticator onnavigationevent3 = (i3 & 4) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator3;
        Authenticator onnavigationevent4 = (i3 & 8) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator4;
        boolean z4 = (i3 & 16) == 0 ? z : true;
        if ((i3 & 32) != 0) {
            int i7 = onWarmupCompleted + 35;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                protocols protocolsVar3 = protocols.None;
                throw null;
            }
            protocolsVar2 = protocols.None;
        } else {
            protocolsVar2 = protocolsVar;
        }
        if ((i3 & 64) != 0) {
            int i8 = onWarmupCompleted + 75;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
                authenticateVar = authenticate.IN;
                cache = Cache.UP;
                authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
                z3 = true;
                function14 = null;
                i5 = 87;
            } else {
                authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
                authenticateVar = authenticate.IN;
                cache = Cache.UP;
                authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.FAST;
                z3 = false;
                function14 = null;
                i5 = 24;
            }
            appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, z3, function14, i5, null);
        } else {
            appLovinSdkSettingsIAuthTabCallback = appLovinSdkSettings;
        }
        boolean z5 = (i3 & 128) != 0 ? false : z2;
        if ((i3 & 256) != 0) {
            int i9 = onNavigationEvent + 35;
            onWarmupCompleted = i9 % 128;
            i4 = i9 % 2 == 0 ? 4 : 80;
        } else {
            i4 = i;
        }
        int i10 = (i3 & 512) != 0 ? 0 : i2;
        socketFactory socketfactory2 = (i3 & 1024) != 0 ? new socketFactory(null, null, 3, null) : socketfactory;
        Function2 function22 = (i3 & 2048) != 0 ? null : function2;
        if ((i3 & 4096) != 0) {
            int i11 = onNavigationEvent + 53;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 88 / 0;
            }
            function13 = null;
        } else {
            function13 = function1;
        }
        return onNavigationEvent(viewGroup, onnavigationevent, onnavigationevent2, onnavigationevent3, onnavigationevent4, z4, protocolsVar2, appLovinSdkSettingsIAuthTabCallback, z5, i4, i10, socketfactory2, function22, function13, (i3 & 8192) != 0 ? null : function12);
    }

    private static final boolean onWarmupCompleted(Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(authenticator, authenticator2, authenticator3, authenticator4, view);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147 A[PHI: r0 r10 r18
      0x0147: PHI (r0v13 java.lang.Object) = (r0v12 java.lang.Object), (r0v17 java.lang.Object) binds: [B:35:0x0145, B:32:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r10v14 android.view.View) = (r10v13 android.view.View), (r10v19 android.view.View) binds: [B:35:0x0145, B:32:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x0147: PHI (r18v14 o.sslSocketFactory) = (r18v13 o.sslSocketFactory), (r18v15 o.sslSocketFactory) binds: [B:35:0x0145, B:32:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e A[PHI: r0
      0x014e: PHI (r0v16 java.lang.Object) = (r0v12 java.lang.Object), (r0v17 java.lang.Object) binds: [B:35:0x0145, B:32:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        List listEmptyList;
        List<View> list;
        final Function1 function1;
        Function2 function2;
        AppLovinSdkSettings appLovinSdkSettings;
        Authenticator authenticator;
        Authenticator authenticator2;
        Authenticator authenticator3;
        Authenticator authenticator4;
        int i;
        final ViewGroup viewGroup;
        final Function1 function12;
        int i2;
        Object obj;
        Object next;
        View view;
        sslSocketFactory sslsocketfactoryOnExtraCallbackWithResult;
        deprecated_sslSocketFactory deprecated_sslsocketfactoryOnExtraCallback;
        Integer num = 0;
        socketFactory socketfactory = (socketFactory) objArr[0];
        ViewGroup viewGroup2 = (ViewGroup) objArr[1];
        int i3 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        final int iIntValue2 = ((Number) objArr[3]).intValue();
        protocols protocolsVar = (protocols) objArr[4];
        Authenticator authenticator5 = (Authenticator) objArr[5];
        Authenticator authenticator6 = (Authenticator) objArr[6];
        Authenticator authenticator7 = (Authenticator) objArr[7];
        Authenticator authenticator8 = (Authenticator) objArr[8];
        boolean zBooleanValue = ((Boolean) objArr[9]).booleanValue();
        AppLovinSdkSettings appLovinSdkSettings2 = (AppLovinSdkSettings) objArr[10];
        final boolean zBooleanValue2 = ((Boolean) objArr[11]).booleanValue();
        Function1 function13 = (Function1) objArr[12];
        Function1 function14 = (Function1) objArr[13];
        Function1 function15 = function13;
        Function2 function22 = (Function2) objArr[14];
        int i4 = 2 % 2;
        Integer numOnNavigationEvent = socketfactory.onNavigationEvent();
        int iIntValue3 = numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : 0;
        Integer numOnWarmupCompleted = socketfactory.onWarmupCompleted();
        final List listDrop = CollectionsKt.drop(CollectionsKt.dropLast(clearRevision.access000(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup2)), clearRevision.onWarmupCompleted(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup2)) - ((numOnWarmupCompleted != null ? numOnWarmupCompleted.intValue() : clearRevision.onWarmupCompleted(EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(viewGroup2)) - 1) + 1)), iIntValue3);
        if (onWarmupCompleted(authenticator5, authenticator6, authenticator7, authenticator8, viewGroup2)) {
            listEmptyList = new ArrayList();
            for (Object obj2 : listDrop) {
                int i5 = onWarmupCompleted + 27;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (onWarmupCompleted(authenticator5, authenticator6, authenticator7, authenticator8, (View) obj2)) {
                    listEmptyList.add(obj2);
                    int i7 = onWarmupCompleted + 89;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list2 = listEmptyList;
        connectionSpecs connectionspecsIAuthTabCallback = IAuthTabCallback(viewGroup2);
        if (Intrinsics.areEqual(connectionspecsIAuthTabCallback != null ? connectionspecsIAuthTabCallback.IAuthTabCallbackStub() : null, viewGroup2)) {
            List arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int i9 = onNavigationEvent + 85;
                onWarmupCompleted = i9 % 128;
                if (i9 % i3 == 0) {
                    next = it.next();
                    view = (View) next;
                    sslsocketfactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup2);
                    int i10 = 78 / 0;
                    deprecated_sslsocketfactoryOnExtraCallback = sslsocketfactoryOnExtraCallbackWithResult != null ? sslsocketfactoryOnExtraCallbackWithResult.onExtraCallback(view) : null;
                } else {
                    next = it.next();
                    view = (View) next;
                    sslsocketfactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup2);
                    if (sslsocketfactoryOnExtraCallbackWithResult != null) {
                    }
                }
                if (deprecated_sslsocketfactoryOnExtraCallback == null) {
                    arrayList.add(next);
                }
                i3 = 2;
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (list.isEmpty()) {
            function1 = function14;
            function2 = function22;
            appLovinSdkSettings = appLovinSdkSettings2;
            authenticator = authenticator8;
            authenticator2 = authenticator7;
            authenticator3 = authenticator6;
            authenticator4 = authenticator5;
            i = iIntValue;
            viewGroup = viewGroup2;
            function12 = function15;
            i2 = 1;
            obj = null;
        } else {
            pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(iIntValue);
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                int i11 = onWarmupCompleted + 49;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add((Rally) RallysKt.onWarmupCompleted(new Object[]{(View) it2.next(), appLovinSdkSettings2, num, null, num, null, null, Boolean.FALSE, num, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025));
                arrayList2 = arrayList3;
                viewGroup2 = viewGroup2;
                num = num;
                onnavigationevent = onnavigationevent;
                function14 = function14;
                function15 = function15;
                function22 = function22;
                appLovinSdkSettings2 = appLovinSdkSettings2;
                authenticator8 = authenticator8;
                authenticator7 = authenticator7;
                authenticator6 = authenticator6;
                authenticator5 = authenticator5;
                iIntValue = iIntValue;
            }
            Function1 function16 = function14;
            function2 = function22;
            appLovinSdkSettings = appLovinSdkSettings2;
            authenticator = authenticator8;
            authenticator2 = authenticator7;
            authenticator3 = authenticator6;
            authenticator4 = authenticator5;
            ArrayList arrayList4 = arrayList2;
            i = iIntValue;
            viewGroup = viewGroup2;
            function12 = function15;
            i2 = 1;
            obj = null;
            function1 = function16;
            isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(null, onnavigationevent, zBooleanValue2 ? CollectionsKt.reversed(arrayList4) : arrayList4, 0, null, 0, null, null, Boolean.FALSE, iIntValue2, 0L, false, 3321, null), null, new Function0() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 83;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    Object[] objArr2 = {function12};
                    int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                    Unit unit = (Unit) proxy.onWarmupCompleted(objArr2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 778231556, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -778231550);
                    int i16 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }
            }, 1, null), null, new Function0() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 43;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    Function1 function17 = function1;
                    if (i15 == 0) {
                        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                        return (Unit) proxy.onWarmupCompleted(new Object[]{function17}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1897492225, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1897492232);
                    }
                    int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                    int i16 = 95 / 0;
                    return (Unit) proxy.onWarmupCompleted(new Object[]{function17}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1897492225, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 1897492232);
                }
            }, 1, null), false, 1, null);
        }
        int i13 = onExtraCallbackWithResult.onWarmupCompleted[protocolsVar.ordinal()];
        if (i13 == i2) {
            final Function2 function23 = function2;
            for (final View view2 : list) {
                final AppLovinSdkSettings appLovinSdkSettings3 = appLovinSdkSettings;
                dns dnsVar = new dns(authenticator4, authenticator3, authenticator2, authenticator, zBooleanValue, new Function1() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3) {
                        int i14 = 2 % 2;
                        int i15 = onWarmupCompleted + 69;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            proxy.onExtraCallbackWithResult(function23, view2, ((Boolean) obj3).booleanValue());
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = proxy.onExtraCallbackWithResult(function23, view2, ((Boolean) obj3).booleanValue());
                        int i16 = onWarmupCompleted + 65;
                        onExtraCallbackWithResult = i16 % 128;
                        int i17 = i16 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, new Function2() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i14 = 2 % 2;
                        int i15 = onExtraCallback + 61;
                        IAuthTabCallback = i15 % 128;
                        if (i15 % 2 != 0) {
                            proxy.onWarmupCompleted(appLovinSdkSettings3, (View) obj3, (proxySelector) obj4);
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        Unit unitOnWarmupCompleted = proxy.onWarmupCompleted(appLovinSdkSettings3, (View) obj3, (proxySelector) obj4);
                        int i16 = onExtraCallback + 99;
                        IAuthTabCallback = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 38 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                }, null, null, null, null, 1920, null);
                if (list2.contains(view2)) {
                    dnsVar.IAuthTabCallback(true);
                }
                onExtraCallback(view2, dnsVar);
                appLovinSdkSettings = appLovinSdkSettings3;
            }
            final AppLovinSdkSettings appLovinSdkSettings4 = appLovinSdkSettings;
            viewGroup.setOnHierarchyChangeListener(new onExtraCallback(authenticator4, authenticator3, authenticator2, authenticator, zBooleanValue, function23, appLovinSdkSettings4));
            connectionSpecs connectionspecsIAuthTabCallback2 = IAuthTabCallback(viewGroup);
            if (connectionspecsIAuthTabCallback2 != null) {
                int i14 = onNavigationEvent + 113;
                onWarmupCompleted = i14 % 128;
                if (i14 % 2 != 0 ? connectionspecsIAuthTabCallback2.asInterface() : connectionspecsIAuthTabCallback2.asInterface()) {
                    ArrayList<View> arrayList5 = new ArrayList();
                    for (Object obj3 : listDrop) {
                        if (!list.contains((View) obj3)) {
                            int i15 = onWarmupCompleted + 95;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            arrayList5.add(obj3);
                        }
                    }
                    for (final View view3 : arrayList5) {
                        onExtraCallbackWithResult(view3, authenticator4, authenticator3, authenticator2, authenticator, zBooleanValue, new Function1() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda4
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj4) {
                                int i17 = 2 % 2;
                                int i18 = IAuthTabCallback + 5;
                                onExtraCallbackWithResult = i18 % 128;
                                int i19 = i18 % 2;
                                Unit unitOnWarmupCompleted = proxy.onWarmupCompleted(function23, view3, ((Boolean) obj4).booleanValue());
                                int i20 = IAuthTabCallback + 31;
                                onExtraCallbackWithResult = i20 % 128;
                                int i21 = i20 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }, new Function2() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj4, Object obj5) {
                                int i17 = 2 % 2;
                                int i18 = IAuthTabCallback + 31;
                                onExtraCallbackWithResult = i18 % 128;
                                int i19 = i18 % 2;
                                AppLovinSdkSettings appLovinSdkSettings5 = appLovinSdkSettings4;
                                View view4 = (View) obj4;
                                if (i19 == 0) {
                                    return proxy.IAuthTabCallback(appLovinSdkSettings5, view4, (proxySelector) obj5);
                                }
                                proxy.IAuthTabCallback(appLovinSdkSettings5, view4, (proxySelector) obj5);
                                Object obj6 = null;
                                obj6.hashCode();
                                throw null;
                            }
                        }, null, null, null, null, 1920, null);
                    }
                }
            }
        } else {
            if (i13 == 2) {
                final Function2 function24 = function2;
                final int i17 = i;
                final AppLovinSdkSettings appLovinSdkSettings5 = appLovinSdkSettings;
                onExtraCallbackWithResult(viewGroup, authenticator4, authenticator3, authenticator2, authenticator, zBooleanValue, new Function1() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = IAuthTabCallback + 57;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnExtraCallback = proxy.onExtraCallback(function24, viewGroup, ((Boolean) obj4).booleanValue());
                        int i21 = IAuthTabCallback + 105;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        return unitOnExtraCallback;
                    }
                }, new Function2() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda7
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj4, Object obj5) {
                        int i18 = 2 % 2;
                        int i19 = onNavigationEvent + 101;
                        onWarmupCompleted = i19 % 128;
                        if (i19 % 2 != 0) {
                            return proxy.onExtraCallbackWithResult(i17, listDrop, iIntValue2, appLovinSdkSettings5, zBooleanValue2, function12, function1, (View) obj4, (proxySelector) obj5);
                        }
                        Unit unitOnExtraCallbackWithResult = proxy.onExtraCallbackWithResult(i17, listDrop, iIntValue2, appLovinSdkSettings5, zBooleanValue2, function12, function1, (View) obj4, (proxySelector) obj5);
                        int i20 = 28 / 0;
                        return unitOnExtraCallbackWithResult;
                    }
                }, null, null, null, null, 1920, null);
                int i18 = onNavigationEvent + 35;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                return obj;
            }
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return obj;
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        if (function1 != null) {
            int i2 = onWarmupCompleted + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(Boolean.FALSE);
            int i4 = onNavigationEvent + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 7;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (function1 != null) {
            int i4 = i3 + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                function1.invoke(Boolean.FALSE);
            } else {
                function1.invoke(Boolean.FALSE);
                obj.hashCode();
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener IAuthTabCallback;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(View view, View view2, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
            this.onExtraCallback = view;
            this.onNavigationEvent = view2;
            this.IAuthTabCallback = onScrollChangedListener;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            this.onNavigationEvent.getViewTreeObserver().addOnScrollChangedListener(this.IAuthTabCallback);
            int i4 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        View view = (View) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (function2 != null) {
            int i4 = i2 + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            function2.invoke(view, Boolean.valueOf(zBooleanValue));
            int i6 = onNavigationEvent + 19;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(proxyselector, "");
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettings, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback implements ViewGroup.OnHierarchyChangeListener {
        private static int asBinder = 0;
        private static int asInterface = 1;
        final /* synthetic */ Function2<View, Boolean, Unit> IAuthTabCallback;
        final /* synthetic */ Authenticator IAuthTabCallbackStub;
        final /* synthetic */ AppLovinSdkSettings onExtraCallback;
        final /* synthetic */ Authenticator onExtraCallbackWithResult;
        final /* synthetic */ boolean onNavigationEvent;
        final /* synthetic */ Authenticator onTransact;
        final /* synthetic */ Authenticator onWarmupCompleted;

        public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, View view, boolean z) {
            int i = 2 % 2;
            int i2 = asBinder + 31;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(function2, view, z);
            int i4 = asBinder + 19;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
            int i = 2 % 2;
            int i2 = asInterface + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(appLovinSdkSettings, view, proxyselector);
            int i4 = asBinder + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 51 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, Function2<? super View, ? super Boolean, Unit> function2, AppLovinSdkSettings appLovinSdkSettings) {
            this.IAuthTabCallbackStub = authenticator;
            this.onTransact = authenticator2;
            this.onExtraCallbackWithResult = authenticator3;
            this.onWarmupCompleted = authenticator4;
            this.onNavigationEvent = z;
            this.IAuthTabCallback = function2;
            this.onExtraCallback = appLovinSdkSettings;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            proxy.onExtraCallbackWithResult(view2, this.IAuthTabCallbackStub, this.onTransact, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onNavigationEvent, new ScrollTriggersKt$animateStack$processAnimateStack$6$.ExternalSyntheticLambda0(this.IAuthTabCallback, view2), new ScrollTriggersKt$animateStack$processAnimateStack$6$.ExternalSyntheticLambda1(this.onExtraCallback), null, null, null, null, 1920, null);
            int i2 = asBinder + 39;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onExtraCallback(Function2 function2, View view, boolean z) {
            int i = 2 % 2;
            if (function2 != null) {
                int i2 = asInterface + 35;
                asBinder = i2 % 128;
                if (i2 % 2 == 0) {
                    function2.invoke(view, Boolean.valueOf(z));
                } else {
                    function2.invoke(view, Boolean.valueOf(z));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i3 = asBinder + 121;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
            boolean z;
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = asBinder + 9;
            asInterface = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(proxyselector, "");
                z = false;
                objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettings, 1, null, 0, null, null, Boolean.FALSE, 1, 0L, true, 24322, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            } else {
                z = false;
                Intrinsics.checkNotNullParameter(view, "");
                Intrinsics.checkNotNullParameter(proxyselector, "");
                objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettings, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            }
            isFireOS.onExtraCallbackWithResult((Rally) objOnWarmupCompleted, z, 1, null);
            Unit unit = Unit.INSTANCE;
            int i3 = asBinder + 49;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements View.OnAttachStateChangeListener {
        private static int asBinder = 1;
        private static int onExtraCallback;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener onNavigationEvent;
        final /* synthetic */ dns onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
        }

        public onNavigationEvent(View view, dns dnsVar, View view2, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
            this.onExtraCallbackWithResult = view;
            this.onWarmupCompleted = dnsVar;
            this.IAuthTabCallback = view2;
            this.onNavigationEvent = onScrollChangedListener;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = asBinder + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
            this.onWarmupCompleted.asBinder();
            this.IAuthTabCallback.getViewTreeObserver().removeOnScrollChangedListener(this.onNavigationEvent);
            int i4 = asBinder + 31;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit IAuthTabCallback(Function2 function2, View view, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (function2 != null) {
            int i5 = i2 + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            function2.invoke(view, Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(AppLovinSdkSettings appLovinSdkSettings, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(proxyselector, "");
        isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettings, 0, null, 0, null, null, Boolean.FALSE, 0, 0L, false, 1916, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (function2 != null) {
            int i5 = i2 + 1;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                function2.invoke(viewGroup, Boolean.valueOf(z));
                int i6 = 12 / 0;
            } else {
                function2.invoke(viewGroup, Boolean.valueOf(z));
            }
            int i7 = onWarmupCompleted + 9;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 5;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        if (function1 != null) {
            int i2 = onNavigationEvent + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            function1.invoke(Boolean.TRUE);
            int i4 = onNavigationEvent + 1;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(int i, List list, int i2, AppLovinSdkSettings appLovinSdkSettings, boolean z, final Function1 function1, final Function1 function12, View view, proxySelector proxyselector) {
        Object objOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(proxyselector, "");
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(i);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (!(!it.hasNext())) {
            int i4 = onWarmupCompleted + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{(View) it.next(), appLovinSdkSettings, 1, null, 0, null, null, null, 0, 1L, false, 26963, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            } else {
                objOnWarmupCompleted = RallysKt.onWarmupCompleted(new Object[]{(View) it.next(), appLovinSdkSettings, 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
            }
            arrayList.add((Rally) objOnWarmupCompleted);
            int i5 = onWarmupCompleted + 121;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        List list3 = CollectionsKt.toList(arrayList);
        if (z) {
            list3 = CollectionsKt.reversed(list3);
        }
        isFireOS.onExtraCallbackWithResult(runOnUiThreadDelayed.onWarmupCompleted(runOnUiThreadDelayed.IAuthTabCallbackDefault(RallysKt.onWarmupCompleted(null, onnavigationevent, list3, 0, null, 0, null, null, Boolean.FALSE, i2, 0L, false, 3321, null), null, new Function0() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 25;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                Unit unitOnNavigationEvent = proxy.onNavigationEvent(function1);
                int i10 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                return unitOnNavigationEvent;
            }
        }, 1, null), null, new Function0() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda13
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 31;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    proxy.onExtraCallbackWithResult(function12);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = proxy.onExtraCallbackWithResult(function12);
                int i9 = onExtraCallbackWithResult + 31;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 1, null), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements ViewTreeObserver.OnGlobalLayoutListener {
        private static int extraCallbackWithResult = 1;
        private static int readTypedObject;
        final /* synthetic */ int IAuthTabCallback;
        final /* synthetic */ Authenticator IAuthTabCallbackDefault;
        final /* synthetic */ Function2<View, Boolean, Unit> IAuthTabCallbackStub;
        final /* synthetic */ int IAuthTabCallbackStubProxy;
        final /* synthetic */ Authenticator IAuthTabCallback_Parcel;
        final /* synthetic */ socketFactory access000;
        final /* synthetic */ ViewGroup access100;
        final /* synthetic */ boolean asBinder;
        final /* synthetic */ Function1<Boolean, Unit> asInterface;
        final /* synthetic */ Authenticator getInterfaceDescriptor;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ AppLovinSdkSettings onExtraCallbackWithResult;
        final /* synthetic */ protocols onNavigationEvent;
        final /* synthetic */ Authenticator onTransact;
        final /* synthetic */ Function1<Boolean, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(ViewGroup viewGroup, socketFactory socketfactory, int i, int i2, protocols protocolsVar, Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, AppLovinSdkSettings appLovinSdkSettings, boolean z2, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, Function2<? super View, ? super Boolean, Unit> function2) {
            this.access100 = viewGroup;
            this.access000 = socketfactory;
            this.IAuthTabCallbackStubProxy = i;
            this.IAuthTabCallback = i2;
            this.onNavigationEvent = protocolsVar;
            this.getInterfaceDescriptor = authenticator;
            this.IAuthTabCallback_Parcel = authenticator2;
            this.IAuthTabCallbackDefault = authenticator3;
            this.onTransact = authenticator4;
            this.asBinder = z;
            this.onExtraCallbackWithResult = appLovinSdkSettings;
            this.onExtraCallback = z2;
            this.asInterface = function1;
            this.onWarmupCompleted = function12;
            this.IAuthTabCallbackStub = function2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i = 2 % 2;
            if (this.access100.getChildCount() > 0 && this.access100.getChildAt(0).getMeasuredHeight() > 0) {
                int i2 = readTypedObject + 7;
                extraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                this.access100.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                proxy.onExtraCallback(this.access000, this.access100, this.IAuthTabCallbackStubProxy, this.IAuthTabCallback, this.onNavigationEvent, this.getInterfaceDescriptor, this.IAuthTabCallback_Parcel, this.IAuthTabCallbackDefault, this.onTransact, this.asBinder, this.onExtraCallbackWithResult, this.onExtraCallback, this.asInterface, this.onWarmupCompleted, this.IAuthTabCallbackStub);
            }
            int i4 = readTypedObject + 31;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final ViewGroup onNavigationEvent(@NotNull ViewGroup viewGroup, @NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, boolean z, @NotNull protocols protocolsVar, @NotNull AppLovinSdkSettings appLovinSdkSettings, boolean z2, int i, int i2, @NotNull socketFactory socketfactory, @Nullable Function2<? super View, ? super Boolean, Unit> function2, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Boolean, Unit> function12) {
        AppLovinSdkSettings appLovinSdkSettings2;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        Intrinsics.checkNotNullParameter(protocolsVar, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(socketfactory, "");
        if (processDeepLink.onExtraCallback()) {
            int i6 = onWarmupCompleted + 57;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST);
                int i7 = 72 / 0;
            } else {
                appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST);
            }
            appLovinSdkSettings2 = appLovinSdkSettingsOnExtraCallbackWithResult;
        } else {
            appLovinSdkSettings2 = appLovinSdkSettings;
        }
        deprecated_sslSocketFactory deprecated_sslsocketfactory = new deprecated_sslSocketFactory(authenticator, authenticator2, authenticator3, authenticator4, z, protocolsVar, appLovinSdkSettings2, z2, i, i2, socketfactory, function2);
        sslSocketFactory sslsocketfactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(viewGroup);
        if (sslsocketfactoryOnExtraCallbackWithResult != null) {
            sslsocketfactoryOnExtraCallbackWithResult.onNavigationEvent(viewGroup, deprecated_sslsocketfactory);
        }
        if (viewGroup.isLayoutRequested()) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new onWarmupCompleted(viewGroup, socketfactory, i, i2, protocolsVar, authenticator, authenticator2, authenticator3, authenticator4, z, appLovinSdkSettings2, z2, function1, function12, function2));
            return viewGroup;
        }
        Object[] objArr = {socketfactory, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), protocolsVar, authenticator, authenticator2, authenticator3, authenticator4, Boolean.valueOf(z), appLovinSdkSettings2, Boolean.valueOf(z2), function1, function12, function2};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1992460206, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1992460206);
        int i8 = onWarmupCompleted + 49;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return viewGroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(proxyselector, "");
            function1.invoke(view);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(proxyselector, "");
        function1.invoke(view);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(Function1 function1, View view, proxySelector proxyselector) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(proxyselector, "");
        function1.invoke(view);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ View onExtraCallbackWithResult(View view, Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, int i, Object obj) {
        Authenticator onnavigationevent;
        Authenticator onnavigationevent2;
        boolean z2;
        Function2 function26;
        Function2 function27;
        Function2 function28;
        int i2 = 2 % 2;
        Authenticator onnavigationevent3 = (i & 1) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator;
        if ((i & 2) != 0) {
            onnavigationevent = new Authenticator.onNavigationEvent(1, 0);
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            onnavigationevent = authenticator2;
        }
        Authenticator onnavigationevent4 = (i & 4) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator3;
        if ((i & 8) != 0) {
            onnavigationevent2 = new Authenticator.onNavigationEvent(0, 0);
            int i5 = onWarmupCompleted + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            onnavigationevent2 = authenticator4;
        }
        if ((i & 16) != 0) {
            int i7 = onNavigationEvent + 79;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        Function1 function12 = (i & 32) != 0 ? null : function1;
        if ((i & 64) != 0) {
            int i9 = onWarmupCompleted + 107;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            function26 = null;
        } else {
            function26 = function2;
        }
        if ((i & 128) != 0) {
            int i11 = onWarmupCompleted + 107;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            function27 = null;
        } else {
            function27 = function22;
        }
        Function2 function29 = (i & 256) != 0 ? null : function23;
        if ((i & 512) != 0) {
            int i13 = onWarmupCompleted + 103;
            onNavigationEvent = i13 % 128;
            if (i13 % 2 != 0) {
                function2.hashCode();
                throw null;
            }
            function28 = null;
        } else {
            function28 = function24;
        }
        return (View) onWarmupCompleted(new Object[]{view, onnavigationevent3, onnavigationevent, onnavigationevent4, onnavigationevent2, Boolean.valueOf(z2), function12, function26, function27, function29, function28, (i & 1024) == 0 ? function25 : null}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 981563812, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -981563810);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        View view = (View) objArr[0];
        Authenticator authenticator = (Authenticator) objArr[1];
        Authenticator authenticator2 = (Authenticator) objArr[2];
        Authenticator authenticator3 = (Authenticator) objArr[3];
        Authenticator authenticator4 = (Authenticator) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        Function1 function1 = (Function1) objArr[6];
        Function2 function2 = (Function2) objArr[7];
        Function2 function22 = (Function2) objArr[8];
        Function2 function23 = (Function2) objArr[9];
        Function2 function24 = (Function2) objArr[10];
        Function2 function25 = (Function2) objArr[11];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        View viewOnExtraCallback = onExtraCallback(view, new dns(authenticator, authenticator2, authenticator3, authenticator4, zBooleanValue, function1, function2, function22, function23, function24, function25));
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return viewOnExtraCallback;
    }

    private static final int onNavigationEvent(connectionSpecs connectionspecs, dns dnsVar) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Object[] objArr = {connectionspecs, (Authenticator) dns.IAuthTabCallback(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1062717922, new Object[]{dnsVar}, iOnNavigationEvent2, iOnNavigationEvent3, -1062717922)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iIntValue = ((Integer) onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 992279410, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -992279402)).intValue();
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iIntValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final int onWarmupCompleted(connectionSpecs connectionspecs, dns dnsVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {connectionspecs, dnsVar.IAuthTabCallback()};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iIntValue = ((Integer) onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 992279410, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -992279402)).intValue();
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iIntValue;
    }

    private static final void IAuthTabCallback(dns dnsVar) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        dnsVar.onExtraCallback();
        int i4 = onNavigationEvent + 25;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(View view, dns dnsVar) throws NoWhenBranchMatchedException {
        connectionSpecs connectionspecsIAuthTabCallback;
        int i;
        int i2;
        proxyAuthenticator proxyauthenticator;
        int i3 = 2 % 2;
        if (onExtraCallback(view)) {
            return;
        }
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            connectionspecsIAuthTabCallback = IAuthTabCallback(view);
            int i5 = 93 / 0;
            if (connectionspecsIAuthTabCallback == null) {
                return;
            }
        } else {
            connectionspecsIAuthTabCallback = IAuthTabCallback(view);
            if (connectionspecsIAuthTabCallback == null) {
                return;
            }
        }
        int iOnNavigationEvent = !connectionspecsIAuthTabCallback.asInterface() ? onNavigationEvent(view, view.getTop()) : onNavigationEvent(view, view.getTop()) - connectionspecsIAuthTabCallback.onExtraCallbackWithResult();
        int measuredHeight = view.getMeasuredHeight();
        int iOnExtraCallback = onExtraCallback(measuredHeight, iOnNavigationEvent, (Authenticator) dns.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1630921786, new Object[]{dnsVar}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1630921787));
        int iOnExtraCallback2 = onExtraCallback(measuredHeight, iOnNavigationEvent, dnsVar.asInterface());
        int iOnNavigationEvent2 = onNavigationEvent(connectionspecsIAuthTabCallback, dnsVar);
        int iOnWarmupCompleted = onWarmupCompleted(connectionspecsIAuthTabCallback, dnsVar);
        boolean z = iOnExtraCallback <= iOnNavigationEvent2 && iOnExtraCallback2 >= iOnWarmupCompleted;
        dnsVar.IAuthTabCallbackStub();
        Handler handlerOnNavigationEvent = connectionspecsIAuthTabCallback.onNavigationEvent();
        if (handlerOnNavigationEvent != null) {
            int i6 = onWarmupCompleted + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            handlerOnNavigationEvent.removeCallbacksAndMessages(null);
        }
        Handler handlerOnNavigationEvent2 = connectionspecsIAuthTabCallback.onNavigationEvent();
        if (handlerOnNavigationEvent2 != null) {
            i = iOnNavigationEvent;
            handlerOnNavigationEvent2.postDelayed(new ScrollTriggersKt$.ExternalSyntheticLambda9(dnsVar), 100L);
        } else {
            i = iOnNavigationEvent;
        }
        dnsVar.onExtraCallback(connectionspecsIAuthTabCallback.onExtraCallbackWithResult());
        hostnameVerifier hostnameverifier = (hostnameVerifier) dns.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -2021209556, new Object[]{dnsVar}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 2021209559);
        proxyAuthenticator proxyauthenticatorOnNavigationEvent = dnsVar.onNavigationEvent();
        int i8 = onExtraCallbackWithResult.onExtraCallbackWithResult[hostnameverifier.ordinal()];
        if (i8 == 1) {
            i2 = i;
            if (iOnExtraCallback >= iOnNavigationEvent2) {
                int i9 = onNavigationEvent + 41;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 84 / 0;
                    if (!z) {
                        proxyAuthenticator proxyauthenticator2 = proxyAuthenticator.OUTSIDE;
                        if (proxyauthenticatorOnNavigationEvent != proxyauthenticator2) {
                            dnsVar.IAuthTabCallback(proxyauthenticator2);
                            dnsVar.onExtraCallback(view, i2);
                        }
                    }
                } else if (!z) {
                }
            } else if (iOnExtraCallback2 >= iOnWarmupCompleted) {
                int i11 = onNavigationEvent + 43;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 3 / 0;
                    if (z) {
                        proxyAuthenticator proxyauthenticator3 = proxyAuthenticator.VIEWPORT;
                        if (proxyauthenticatorOnNavigationEvent != proxyauthenticator3) {
                            dnsVar.IAuthTabCallback(proxyauthenticator3);
                            dnsVar.onExtraCallbackWithResult(view, i2);
                        }
                    }
                } else if (z) {
                }
            }
        } else {
            if (i8 != 2) {
                return;
            }
            if (iOnExtraCallback2 <= iOnWarmupCompleted) {
                if (!z && proxyauthenticatorOnNavigationEvent != (proxyauthenticator = proxyAuthenticator.OUTSIDE)) {
                    dnsVar.IAuthTabCallback(proxyauthenticator);
                    ((Boolean) dns.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1132284984, new Object[]{dnsVar, view, Integer.valueOf(i)}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1132284982)).booleanValue();
                }
            } else if (iOnExtraCallback <= iOnNavigationEvent2 && z) {
                int i13 = onNavigationEvent + 89;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                proxyAuthenticator proxyauthenticator4 = proxyAuthenticator.VIEWPORT;
                if (proxyauthenticatorOnNavigationEvent != proxyauthenticator4) {
                    dnsVar.IAuthTabCallback(proxyauthenticator4);
                    i2 = i;
                    dnsVar.onNavigationEvent(view, i2);
                }
            }
            i2 = i;
        }
        int iOnWarmupCompleted2 = onWarmupCompleted(measuredHeight, (Authenticator) dns.IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1630921786, new Object[]{dnsVar}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1630921787));
        int iOnWarmupCompleted3 = iOnWarmupCompleted - onWarmupCompleted(measuredHeight, dnsVar.asInterface());
        dnsVar.onNavigationEvent(view, i2, 1.0f - ((i2 - iOnWarmupCompleted3) / ((iOnNavigationEvent2 - iOnWarmupCompleted2) - iOnWarmupCompleted3)));
        int i15 = onNavigationEvent + 85;
        onWarmupCompleted = i15 % 128;
        int i16 = i15 % 2;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, @NotNull View view) {
        int iOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (onExtraCallback(view)) {
            return false;
        }
        connectionSpecs connectionspecsIAuthTabCallback = IAuthTabCallback(view);
        if (connectionspecsIAuthTabCallback != null) {
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (connectionspecsIAuthTabCallback.asInterface()) {
                int i4 = onWarmupCompleted + 55;
                onNavigationEvent = i4 % 128;
                iOnNavigationEvent = i4 % 2 != 0 ? onNavigationEvent(view, view.getTop()) % connectionspecsIAuthTabCallback.onExtraCallbackWithResult() : onNavigationEvent(view, view.getTop()) - connectionspecsIAuthTabCallback.onExtraCallbackWithResult();
            } else {
                iOnNavigationEvent = onNavigationEvent(view, view.getTop());
            }
            int measuredHeight = view.getMeasuredHeight();
            int iOnExtraCallback = onExtraCallback(measuredHeight, iOnNavigationEvent, authenticator);
            int iOnExtraCallback2 = onExtraCallback(measuredHeight, iOnNavigationEvent, authenticator2);
            int iIntValue = ((Integer) onWarmupCompleted(new Object[]{connectionspecsIAuthTabCallback, authenticator3}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 992279410, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -992279402)).intValue();
            int iIntValue2 = ((Integer) onWarmupCompleted(new Object[]{connectionspecsIAuthTabCallback, authenticator4}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 992279410, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -992279402)).intValue();
            if (iOnExtraCallback <= iIntValue && iOnExtraCallback2 >= iIntValue2) {
                return true;
            }
        }
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return false;
    }

    public static final connectionSpecs IAuthTabCallback(@NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof RecyclerView) {
            return new connectionSpecs((RecyclerView) view);
        }
        if (view instanceof ScrollView) {
            return new connectionSpecs((ScrollView) view);
        }
        RecyclerView parent = view.getParent();
        if (parent instanceof ScrollView) {
            return new connectionSpecs((ScrollView) parent);
        }
        if (parent instanceof RecyclerView) {
            connectionSpecs connectionspecs = new connectionSpecs(parent);
            int i2 = onNavigationEvent + 83;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return connectionspecs;
        }
        if (!(parent instanceof View)) {
            int i4 = onWarmupCompleted + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = onNavigationEvent + 115;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        connectionSpecs connectionspecsIAuthTabCallback = IAuthTabCallback((View) parent);
        if (i7 == 0) {
            int i8 = 8 / 0;
        }
        return connectionspecsIAuthTabCallback;
    }

    public static final int onNavigationEvent(@NotNull View view, int i) {
        int top;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        RecyclerView parent = view.getParent();
        if (!(!(parent instanceof ScrollView))) {
            int i3 = onWarmupCompleted + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            top = ((ScrollView) parent).getTop();
        } else {
            if (!(parent instanceof RecyclerView)) {
                if (parent instanceof View) {
                    int i5 = onNavigationEvent + 43;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    View view2 = (View) parent;
                    return onNavigationEvent(view2, i + view2.getTop());
                }
                int i7 = onNavigationEvent + 5;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    return i;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            top = parent.getTop();
        }
        return i + top;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r1 = r6.onWarmupCompleted().intValue();
        r6 = r6.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r1 = r6.onWarmupCompleted().intValue();
        r6 = r6.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r6 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return ((int) (r5 * 0.5f)) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return r5 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if ((r6 instanceof o.Authenticator.onExtraCallbackWithResult) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = r5;
        r1 = r6.onWarmupCompleted().floatValue() * r5;
        r6 = r6.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r3 = o.proxy.onNavigationEvent + 91;
        o.proxy.onWarmupCompleted = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r6 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r5 = (int) (r5 * 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r1 = r1 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r5 = (int) r1;
        r6 = o.proxy.onNavigationEvent + 27;
        o.proxy.onWarmupCompleted = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((r6 instanceof o.Authenticator.onNavigationEvent) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r6 instanceof o.Authenticator.onNavigationEvent) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = o.proxy.onWarmupCompleted + 73;
        o.proxy.onNavigationEvent = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int onWarmupCompleted(int i, @NotNull Authenticator authenticator) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 117;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(authenticator, "");
            int i4 = 59 / 0;
        } else {
            Intrinsics.checkNotNullParameter(authenticator, "");
        }
    }

    public static final int onExtraCallback(int i, int i2, @NotNull Authenticator authenticator) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(authenticator, "");
        int iOnWarmupCompleted = i2 + onWarmupCompleted(i, authenticator);
        int i6 = onNavigationEvent + 49;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return iOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r7 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r2 = o.proxy.onNavigationEvent + 103;
        r4 = r2 % 128;
        o.proxy.onWarmupCompleted = r4;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r7 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r4 = r4 + 25;
        o.proxy.onNavigationEvent = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if ((r4 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r7 = r1.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r1.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r7 = (int) ((r1.IAuthTabCallback() - r1.onWarmupCompleted()) * 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        r7 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        return java.lang.Integer.valueOf(r7 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if ((r7 instanceof o.Authenticator.onExtraCallbackWithResult) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        r0 = o.proxy.onWarmupCompleted + 17;
        o.proxy.onNavigationEvent = r0 % 128;
        r0 = r0 % 2;
        r0 = r1.IAuthTabCallback() - r1.onWarmupCompleted();
        r4 = r7.onWarmupCompleted().floatValue();
        r7 = r7.onNavigationEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r7 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r7 == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        r7 = r1.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r7 = (int) ((r1.IAuthTabCallback() - r1.onWarmupCompleted()) * 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        r7 = r1.IAuthTabCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        return java.lang.Integer.valueOf((int) (r7 + (r0 * r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if ((r7 instanceof o.Authenticator.onNavigationEvent) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ((r7 instanceof o.Authenticator.onNavigationEvent) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r0 = r7.onWarmupCompleted().intValue();
        r7 = r7.onNavigationEvent();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws NoWhenBranchMatchedException {
        connectionSpecs connectionspecs = (connectionSpecs) objArr[0];
        Authenticator authenticator = (Authenticator) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(connectionspecs, "");
            Intrinsics.checkNotNullParameter(authenticator, "");
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(connectionspecs, "");
            Intrinsics.checkNotNullParameter(authenticator, "");
        }
    }

    public static final sslSocketFactory onExtraCallbackWithResult(@NotNull View view) {
        getAvailableMediatedNetworks getavailablemediatednetworks;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object context = view.getContext();
        if (context instanceof getAvailableMediatedNetworks) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 115;
            onWarmupCompleted = i3 % 128;
            getavailablemediatednetworks = (getAvailableMediatedNetworks) context;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            getavailablemediatednetworks = null;
        }
        if (getavailablemediatednetworks == null) {
            int i6 = onNavigationEvent + 43;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i7 = onWarmupCompleted + 49;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        sslSocketFactory scrollTriggerStore = getavailablemediatednetworks.getScrollTriggerStore();
        if (i8 != 0) {
            int i9 = 71 / 0;
        }
        return scrollTriggerStore;
    }

    public static final boolean onExtraCallback(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        sslSocketFactory sslsocketfactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        if (sslsocketfactoryOnExtraCallbackWithResult == null) {
            return false;
        }
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnWarmupCompleted = sslsocketfactoryOnExtraCallbackWithResult.onWarmupCompleted(view);
        if (i5 != 0) {
            if (!zOnWarmupCompleted) {
                return false;
            }
        } else if (!zOnWarmupCompleted) {
            return false;
        }
        int i6 = onNavigationEvent + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static final View onExtraCallback(@NotNull final View view, @NotNull final dns dnsVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dnsVar, "");
        connectionSpecs connectionspecsIAuthTabCallback = IAuthTabCallback(view);
        if (connectionspecsIAuthTabCallback != null) {
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RecyclerView recyclerViewOnExtraCallback = connectionspecsIAuthTabCallback.onExtraCallback();
            if (recyclerViewOnExtraCallback != null) {
                sslSocketFactory sslsocketfactoryOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
                dns dnsVarOnNavigationEvent = sslsocketfactoryOnExtraCallbackWithResult != null ? sslsocketfactoryOnExtraCallbackWithResult.onNavigationEvent(recyclerViewOnExtraCallback, view, dnsVar) : null;
                if (dnsVarOnNavigationEvent == null) {
                    int i4 = onWarmupCompleted + 43;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    dnsVar = dnsVarOnNavigationEvent;
                }
            }
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: im.toss.tds.foundation.anim.rally.stack.ScrollTriggersKt$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() throws NoWhenBranchMatchedException {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 27;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                proxy.onExtraCallbackWithResult(view, dnsVar);
                int i9 = onExtraCallback + 5;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
        };
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
            int i6 = onNavigationEvent + 9;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 3;
            }
        } else {
            view.addOnAttachStateChangeListener(new IAuthTabCallback(view, view, onScrollChangedListener));
        }
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new onNavigationEvent(view, dnsVar, view, onScrollChangedListener));
            return view;
        }
        int i8 = onNavigationEvent + 55;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            dnsVar.asBinder();
            view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
            return view;
        }
        dnsVar.asBinder();
        view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        int i9 = 8 / 0;
        return view;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(new Object[]{function1}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1897492225, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1897492232);
    }

    public static /* synthetic */ void onNavigationEvent(dns dnsVar) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(new Object[]{dnsVar}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 442958845, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -442958842);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, View view, proxySelector proxyselector) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(new Object[]{function1, view, proxyselector}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 160457937, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -160457933);
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(new Object[]{function1}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 778231556, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -778231550);
    }

    private static final void onWarmupCompleted(socketFactory socketfactory, ViewGroup viewGroup, int i, int i2, protocols protocolsVar, Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, AppLovinSdkSettings appLovinSdkSettings, boolean z2, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, Function2<? super View, ? super Boolean, Unit> function2) {
        Object[] objArr = {socketfactory, viewGroup, Integer.valueOf(i), Integer.valueOf(i2), protocolsVar, authenticator, authenticator2, authenticator3, authenticator4, Boolean.valueOf(z), appLovinSdkSettings, Boolean.valueOf(z2), function1, function12, function2};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -1992460206, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, 1992460206);
    }

    private static final Unit IAuthTabCallback(Function1 function1) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(new Object[]{function1}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 718745350, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -718745349);
    }

    private static final Unit onNavigationEvent(Function2 function2, View view, boolean z) {
        Object[] objArr = {function2, view, Boolean.valueOf(z)};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 360303626, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -360303621);
    }

    public static final int onWarmupCompleted(@NotNull connectionSpecs connectionspecs, @NotNull Authenticator authenticator) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return ((Integer) onWarmupCompleted(new Object[]{connectionspecs, authenticator}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 992279410, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -992279402)).intValue();
    }

    public static final View onNavigationEvent(@NotNull View view, @NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, boolean z, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function2<? super View, ? super proxySelector, Unit> function2, @Nullable Function2<? super View, ? super proxySelector, Unit> function22, @Nullable Function2<? super View, ? super proxySelector, Unit> function23, @Nullable Function2<? super View, ? super proxySelector, Unit> function24, @Nullable Function2<? super View, ? super proxySelector, Unit> function25) {
        Object[] objArr = {view, authenticator, authenticator2, authenticator3, authenticator4, Boolean.valueOf(z), function1, function2, function22, function23, function24, function25};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (View) onWarmupCompleted(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 981563812, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -981563810);
    }
}
