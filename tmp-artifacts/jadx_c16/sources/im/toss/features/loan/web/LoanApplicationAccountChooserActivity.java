package im.toss.features.loan.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.google.android.gms.internal.ads.zzgsa;
import im.toss.features.loan.web.LoanApplicationAccountChooserActivity$;
import im.toss.features.verify.response.AutoVerifyAvailableBankAccountResp;
import im.toss.features.verify.response.AutoVerifyPossibleBankAccount;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NetConverter3;
import o.PageShowPoint;
import o.ReactJsExceptionHandlerProcessedErrorStackFrame;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.checkNavigationBarByWindowManagerService;
import o.clearTid;
import o.createSocketSession;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.forceSetWebSocketAddr;
import o.getDummyAd;
import o.getHostnameVerifierokhttp;
import o.getOriginalFullResponse;
import o.getTypedExportedConstants;
import o.issueCertV3;
import o.maybeUpdateAnimatable;
import o.movePluginRefreshTimeToSp;
import o.onPageExit;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setRandomHost;
import o.shouldAutoplay;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanApplicationAccountChooserActivity extends Hilt_LoanApplicationAccountChooserActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    public static final int IAuthTabCallbackStub;
    private static int extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    private static int onMessageChannelReady = 0;
    private static int readTypedObject = 1;
    private static int[] writeTypedObject;
    private Function0<Unit> access000;
    private r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI asBinder;

    @Inject
    public SessionState sessionState;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;

    @Inject
    public shouldAutoplay verifyApi;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda7(this));
    private final Lazy ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda8(this));
    private final Lazy extraCallback = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda9(this));
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda10(this));
    private final Lazy IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda11(this));
    private final Lazy IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda12(this));
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallbackDefault(this));
    private final IEngagementSignalsCallback_Parcel<Intent> onTransact = onPageExit.onNavigationEvent(this, new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda13(this));
    private final SessionTrackera access100 = AppLovinAdImpl.IAuthTabCallback(this, new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda14(this));

    static {
        ICustomTabsServiceStub();
        Companion = new IAuthTabCallback(null);
        IAuthTabCallbackStub = 8;
        int i = onMessageChannelReady + 67;
        onActivityLayout = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(access000(loanApplicationAccountChooserActivity));
        }
        access000(loanApplicationAccountChooserActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallbackStub(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(loanApplicationAccountChooserActivity);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return strIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 9;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = readTypedObject + 91;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(loanApplicationAccountChooserActivity, th);
        int i4 = extraCallbackWithResult + 81;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(list, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(list, setDetectableSize);
        int i3 = readTypedObject + 61;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void onExtraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(loanApplicationAccountChooserActivity);
        int i4 = readTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~((~i6) | i2)) | (~(i2 | i4));
        int i8 = (~i2) | (~i4);
        int i9 = i7 | (~(i8 | i6));
        int i10 = (~i8) | i6;
        int i11 = ~(i4 | i6);
        int i12 = i6 + i2 + i3 + ((-417414852) * i5) + (1247522396 * i);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1219797419)) + 1526988800 + ((-1219797419) * i2) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i3) + ((-2135949312) * i5) + ((-953155584) * i) + ((-430374912) * i13);
        int i15 = ((i6 * 184508743) - 476012450) + (i2 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i3 * 184509739) + (i5 * (-953474796)) + (i * (-288057996)) + (i13 * (-839712768));
        switch (i14 + (i15 * i15 * 1709113344)) {
            case 1:
                LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
                int i16 = 2 % 2;
                int i17 = extraCallbackWithResult + 115;
                readTypedObject = i17 % 128;
                int i18 = i17 % 2;
                String strAccess100 = access100(loanApplicationAccountChooserActivity);
                int i19 = extraCallbackWithResult + 9;
                readTypedObject = i19 % 128;
                int i20 = i19 % 2;
                return strAccess100;
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            unit = (Unit) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1404056824, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1404056824, new Object[]{loanApplicationAccountChooserActivity, iEngagementSignalsCallbackDefault});
            int i3 = 83 / 0;
        } else {
            int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent5 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent6 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            unit = (Unit) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1404056824, iOnNavigationEvent5, iOnNavigationEvent4, iOnNavigationEvent6, 1404056824, new Object[]{loanApplicationAccountChooserActivity, iEngagementSignalsCallbackDefault});
        }
        int i4 = extraCallbackWithResult + 71;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ String onNavigationEvent(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strWriteTypedObject = writeTypedObject(loanApplicationAccountChooserActivity);
        int i4 = readTypedObject + 111;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanApplicationAccountChooserActivity, autoVerifyAvailableBankAccountResp);
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallback(list, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(list, setDetectableSize);
        int i3 = extraCallbackWithResult + 61;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strExtraCallback = extraCallback(loanApplicationAccountChooserActivity);
        int i4 = extraCallbackWithResult + 109;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return strExtraCallback;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = extraCallbackWithResult + 39;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onTransact(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(loanApplicationAccountChooserActivity);
        }
        IAuthTabCallbackStubProxy(loanApplicationAccountChooserActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(loanApplicationAccountChooserActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        }
        onExtraCallback(loanApplicationAccountChooserActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(loanApplicationAccountChooserActivity, autoVerifyAvailableBankAccountResp);
        }
        onExtraCallback(loanApplicationAccountChooserActivity, autoVerifyAvailableBankAccountResp);
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = readTypedObject + 45;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 31;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return -1L;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements Function0<forceSetWebSocketAddr> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Activity onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Activity activity) {
            this.onExtraCallbackWithResult = activity;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback();
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
            return searchBarKtExternalSyntheticLambda5IAuthTabCallback;
        }

        public final forceSetWebSocketAddr IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            LayoutInflater layoutInflater = this.onExtraCallbackWithResult.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            forceSetWebSocketAddr forcesetwebsocketaddrOnNavigationEvent = forceSetWebSocketAddr.onNavigationEvent(layoutInflater);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return forcesetwebsocketaddrOnNavigationEvent;
        }
    }

    public static final /* synthetic */ String IAuthTabCallbackDefault(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return loanApplicationAccountChooserActivity.ICustomTabsServiceStubProxy();
        }
        loanApplicationAccountChooserActivity.ICustomTabsServiceStubProxy();
        throw null;
    }

    public static final /* synthetic */ SessionTrackera asBinder(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackera sessionTrackera = loanApplicationAccountChooserActivity.access100;
        if (i3 == 0) {
            return sessionTrackera;
        }
        throw null;
    }

    public static final /* synthetic */ void asInterface(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1494548150, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1494548159, new Object[]{loanApplicationAccountChooserActivity});
        int i4 = extraCallbackWithResult + 29;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.asInterface.getValue()).booleanValue();
        int i4 = extraCallbackWithResult + 103;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean access000(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 115;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = loanApplicationAccountChooserActivity.getIntent().getBooleanExtra("EXTRA_COPY", false);
        int i4 = readTypedObject + 57;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanExtra;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) loanApplicationAccountChooserActivity.ICustomTabsCallback.getValue();
        int i4 = extraCallbackWithResult + 63;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String writeTypedObject(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = loanApplicationAccountChooserActivity.getIntent().getStringExtra("EXTRA_TEXT_PARAM_1");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = readTypedObject + 25;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String extraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        String stringExtra = loanApplicationAccountChooserActivity.getIntent().getStringExtra("EXTRA_TEXT_PARAM_2");
        if (stringExtra == null) {
            int i2 = readTypedObject + 75;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        int i4 = readTypedObject + 93;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private final String writeTypedList() {
        String str;
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) this.extraCallback.getValue();
            int i3 = 86 / 0;
        } else {
            str = (String) this.extraCallback.getValue();
        }
        int i4 = extraCallbackWithResult + 93;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return str;
    }

    private final String IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.getInterfaceDescriptor.getValue();
        int i4 = extraCallbackWithResult + 91;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String access100(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 109;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = loanApplicationAccountChooserActivity.getIntent();
        if (i3 != 0) {
            intent.getStringExtra("EXTRA_COPY_LABEL");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = intent.getStringExtra("EXTRA_COPY_LABEL");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = readTypedObject + 47;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 % 2;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallbackStubProxy(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = loanApplicationAccountChooserActivity.getIntent().getBooleanExtra("EXTRA_SKIP_AGREEMENT", false);
        int i4 = readTypedObject + 63;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return booleanExtra;
    }

    private final boolean ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.IAuthTabCallback_Parcel.getValue()).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.IAuthTabCallback_Parcel.getValue()).booleanValue();
        int i3 = extraCallbackWithResult + 55;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static final String IAuthTabCallback_Parcel(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!loanApplicationAccountChooserActivity.ICustomTabsServiceDefault()) {
            Object[] objArr = new Object[1];
            a(new int[]{-42850752, 3185424, 299619130, -321542189, 1798426882, 67976423, 1758525949, -1914905738, 766944634, -1834079780, -182189456, -1292635571, -40155255, 876107907}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 28, objArr);
            return ((String) objArr[0]).intern();
        }
        int i4 = readTypedObject + 77;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(new int[]{1051601099, -1972779693, -1312523775, -20037307, -1226329738, -322083897, -90303211, 1239463037, -1875434630, -2044753759, 623974741, 2072812195, 324983917, 1143314804}, 59 - TextUtils.lastIndexOf("", 'T', 0, 1), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a(new int[]{1051601099, -1972779693, -1312523775, -20037307, -1226329738, -322083897, -90303211, 1239463037, -1875434630, -2044753759, 623974741, 2072812195, 324983917, 1143314804}, 24 - TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
            obj = objArr3[0];
        }
        return ((String) obj).intern();
    }

    private final String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = (String) this.IAuthTabCallbackStubProxy.getValue();
        int i3 = readTypedObject + 79;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    private final forceSetWebSocketAddr updateVisuals() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        forceSetWebSocketAddr forcesetwebsocketaddr = (forceSetWebSocketAddr) value;
        int i4 = readTypedObject + 101;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return forcesetwebsocketaddr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 111;
        im.toss.features.loan.web.LoanApplicationAccountChooserActivity.readTypedObject = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final shouldAutoplay validateRelationship() {
        shouldAutoplay shouldautoplay;
        int i = 2 % 2;
        int i2 = readTypedObject + 57;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            shouldautoplay = this.verifyApi;
            int i4 = 75 / 0;
        } else {
            shouldautoplay = this.verifyApi;
        }
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        Object obj = null;
        if (sessionTrackerb != null) {
            int i2 = readTypedObject + 55;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return sessionTrackerb;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = readTypedObject + 47;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final SessionState IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SessionState sessionState = this.sessionState;
        if (sessionState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 21;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return sessionState;
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.termsIntent;
        if (getdummyad != null) {
            int i2 = extraCallbackWithResult + 109;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 75 / 0;
            }
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = readTypedObject + 121;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault = (IEngagementSignalsCallbackDefault) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        loanApplicationAccountChooserActivity.IEngagementSignalsCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1753081458, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1753081464, new Object[]{loanApplicationAccountChooserActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse});
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 59;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            setContentView(updateVisuals().onNavigationEvent());
            IEngagementSignalsCallbackDefault();
            int i3 = 84 / 0;
            return;
        }
        super.onCreate(bundle);
        setContentView(updateVisuals().onNavigationEvent());
        IEngagementSignalsCallbackDefault();
    }

    @Override // im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        Function0<Unit> function0 = this.access000;
        if (function0 != null) {
            function0.invoke();
            int i2 = extraCallbackWithResult + 97;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        this.access000 = null;
        int i4 = readTypedObject + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setResult(-1);
        getTypedExportedConstants gettypedexportedconstants = this.asBinder;
        if (gettypedexportedconstants == null) {
            finish();
            return;
        }
        int i4 = extraCallbackWithResult + 65;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        if (gettypedexportedconstants == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = extraCallbackWithResult + 51;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
            gettypedexportedconstants = null;
        }
        gettypedexportedconstants.dismiss();
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function0<Unit> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        onExtraCallbackWithResult(Object obj) {
            super(0, obj, LoanApplicationAccountChooserActivity.class, "loadAccounts", "loadAccounts()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted();
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                LoanApplicationAccountChooserActivity.asInterface((LoanApplicationAccountChooserActivity) ((CallableReference) this).receiver);
                obj.hashCode();
                throw null;
            }
            LoanApplicationAccountChooserActivity.asInterface((LoanApplicationAccountChooserActivity) ((CallableReference) this).receiver);
            int i3 = onNavigationEvent + 79;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function0<Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        onExtraCallback(Object obj) {
            super(0, obj, LoanApplicationAccountChooserActivity.class, "finish", "finish()V", 0);
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ((LoanApplicationAccountChooserActivity) ((CallableReference) this).receiver).finish();
            int i4 = onNavigationEvent + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r1.getLifecycle().IAuthTabCallback().isAtLeast(o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r12 = im.toss.features.loan.web.LoanApplicationAccountChooserActivity.extraCallbackWithResult + 39;
        im.toss.features.loan.web.LoanApplicationAccountChooserActivity.readTypedObject = r12 % 128;
        r12 = r12 % 2;
        r8 = com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1494548150, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), r8, com.facebook.react.uimanager.LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1494548159, new java.lang.Object[]{r1});
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        r1.access000 = new im.toss.features.loan.web.LoanApplicationAccountChooserActivity.onExtraCallbackWithResult(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if ((!r1.getLifecycle().IAuthTabCallback().isAtLeast(o.TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        if (!((r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1]).onExtraCallbackWithResult().isSucceed()) {
            if (loanApplicationAccountChooserActivity.getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
                loanApplicationAccountChooserActivity.finish();
                return null;
            }
            loanApplicationAccountChooserActivity.access000 = new onExtraCallback(loanApplicationAccountChooserActivity);
            int i2 = extraCallbackWithResult + 79;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 58 / 0;
            }
            return null;
        }
        int i4 = readTypedObject + 1;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            movePluginRefreshTimeToSp.onNavigationEvent.IAuthTabCallback(true);
        } else {
            movePluginRefreshTimeToSp.onNavigationEvent.IAuthTabCallback(false);
        }
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 23;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    private static final Unit onExtraCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getHostnameVerifierokhttp.onNavigationEvent(loanApplicationAccountChooserActivity, (String) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void getInterfaceDescriptor(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.dismissLoadingIndicator();
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(autoVerifyAvailableBankAccountResp);
        if (i3 != 0) {
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            loanApplicationAccountChooserActivity.IAuthTabCallback((List<? extends KeyBoardVisiblePoint>) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2143077142, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -2143077137, new Object[]{loanApplicationAccountChooserActivity, autoVerifyAvailableBankAccountResp}));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent5 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent6 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        loanApplicationAccountChooserActivity.IAuthTabCallback((List<? extends KeyBoardVisiblePoint>) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2143077142, iOnNavigationEvent5, iOnNavigationEvent4, iOnNavigationEvent6, -2143077137, new Object[]{loanApplicationAccountChooserActivity, autoVerifyAvailableBankAccountResp}));
        Unit unit2 = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit2;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        loanApplicationAccountChooserActivity.IAuthTabCallback(CollectionsKt.emptyList());
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 53;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity = (LoanApplicationAccountChooserActivity) objArr[0];
        int i = 2 % 2;
        writeRaw writerawOnWarmupCompleted = shouldAutoplay.onWarmupCompleted(loanApplicationAccountChooserActivity.validateRelationship(), (String) null, (Long) null, 3, (Object) null);
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda1(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda0(loanApplicationAccountChooserActivity))).onWarmupCompleted(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda2(loanApplicationAccountChooserActivity)).onNavigationEvent(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda4(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda3(loanApplicationAccountChooserActivity)), new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda6(new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda5(loanApplicationAccountChooserActivity)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        loanApplicationAccountChooserActivity.onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 85;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsService_Parcel();
            obj.hashCode();
            throw null;
        }
        if (!ICustomTabsService_Parcel()) {
            if (((Boolean) movePluginRefreshTimeToSp.onNavigationEvent(new Object[]{movePluginRefreshTimeToSp.onNavigationEvent}, 516553625, zzgsa.onWarmupCompleted(), -516553622, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted())).booleanValue()) {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
                int i3 = extraCallbackWithResult + 47;
                readTypedObject = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1494548150, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1494548159, new Object[]{this});
        int i5 = extraCallbackWithResult + 77;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = LoanApplicationAccountChooserActivity.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, im.toss.features.loan.web.LoanApplicationAccountChooserActivity] */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getDummyAd getdummyadOnNavigationEvent = LoanApplicationAccountChooserActivity.this.onNavigationEvent();
                ?? r3 = LoanApplicationAccountChooserActivity.this;
                String strIAuthTabCallbackDefault = LoanApplicationAccountChooserActivity.IAuthTabCallbackDefault((LoanApplicationAccountChooserActivity) r3);
                createSocketSession createsocketsession = new createSocketSession();
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, (Context) r3, "STD_1591_FIND_MY_LOAN_WEB_VIEW_IN_TOSS", strIAuthTabCallbackDefault, "loan_comparison", 284L, (Map) null, createsocketsession, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, (StandardTermsV2DynamicTermsParam[]) null, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 8388512, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i3 = onNavigationEvent + 81;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    int i5 = i4 + 3;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            LoanApplicationAccountChooserActivity.asBinder(LoanApplicationAccountChooserActivity.this).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    private static final Unit IAuthTabCallback(List list, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("funnel_type", "account");
        if (list.isEmpty()) {
            int i4 = readTypedObject + 1;
            extraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str = "non_connect";
        } else {
            str = "connect";
        }
        setDetectableSize.onExtraCallback("case_type", str);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(List list, SetDetectableSize setDetectableSize) {
        String str;
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("funnel_type", "auth");
            list.isEmpty();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("funnel_type", "auth");
        if (!list.isEmpty()) {
            str = "connect";
        } else {
            str = "non_connect";
            int i3 = extraCallbackWithResult + 51;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        setDetectableSize.onExtraCallback("case_type", str);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(List<? extends KeyBoardVisiblePoint> list) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (ICustomTabsServiceDefault()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1283153L, false, (String) null, (Map) null, new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda15(list), 14, (Object) null);
            this.asBinder = ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallbackWithResult(new LoanApplicationAccountCopyBottomSheet(this, list, IEngagementSignalsCallback()));
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1283153L, false, (String) null, (Map) null, new LoanApplicationAccountChooserActivity$.ExternalSyntheticLambda16(list), 14, (Object) null);
        SessionState sessionStateIAuthTabCallback = IAuthTabCallback();
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        this.asBinder = ReactJsExceptionHandlerProcessedErrorStackFrame.onExtraCallbackWithResult(new LoanApplicationAccountSelectBottomSheet(this, list, sessionStateIAuthTabCallback, (String) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 383412280, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -383412273, new Object[]{this}), writeTypedList(), setEngagementSignalsCallback(), this.onTransact));
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeTypedObject;
        long j = 0;
        int i3 = -1469660336;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 72 - KeyEvent.keyCodeFromString(""), Drawable.resolveOpacity(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i3 = -1469660336;
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
        int[] iArr5 = writeTypedObject;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 101;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i4] = Integer.valueOf(iArr5[i7]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", i4), Color.red(i4) + 72, 8848 - Color.blue(i4), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i7])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 72 - (Process.myPid() >> 22), 8848 - View.resolveSize(0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i7++;
                }
                i4 = 0;
            }
            iArr5 = iArr6;
        }
        int i9 = i4;
        System.arraycopy(iArr5, i9, iArr4, i9, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i9;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i10 = $10 + 51;
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
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22300 - AndroidCharacter.getMirror('0')), 38 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
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
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 4033), 78 - (ViewConfiguration.getTapTimeout() >> 16), 7398 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(IAuthTabCallback iAuthTabCallback, Context context, boolean z, String str, boolean z2, String str2, String str3, int i, Object obj) {
            boolean z3;
            String str4;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            boolean z4 = (i & 2) != 0 ? false : z;
            String str5 = (i & 4) != 0 ? "" : str;
            if ((i & 8) != 0) {
                int i6 = i3 + 79;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                z3 = false;
            } else {
                z3 = z2;
            }
            String str6 = null;
            if ((i & 16) != 0) {
                int i8 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 11 / 0;
                }
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i & 32) != 0) {
                int i10 = onExtraCallbackWithResult + 19;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 91 / 0;
                }
            } else {
                str6 = str3;
            }
            return iAuthTabCallback.onWarmupCompleted(context, z4, str5, z3, str4, str6);
        }

        public final Intent onWarmupCompleted(@NotNull Context context, boolean z, @NotNull String str, boolean z2, @Nullable String str2, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) LoanApplicationAccountChooserActivity.class).putExtra("EXTRA_COPY", z).putExtra("EXTRA_COPY_LABEL", str).putExtra("EXTRA_SKIP_AGREEMENT", z2).putExtra("EXTRA_TEXT_PARAM_1", str2).putExtra("EXTRA_TEXT_PARAM_2", str3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return intentPutExtra;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp = (AutoVerifyAvailableBankAccountResp) objArr[1];
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        PageShowPoint.onWarmupCompleted onwarmupcompleted = PageShowPoint.Companion;
        arrayList.addAll(onwarmupcompleted.asInterface());
        arrayList.addAll(onwarmupcompleted.IAuthTabCallback());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) obj;
            if (!issueCertV3.asBinder(keyBoardVisiblePoint)) {
                int i2 = readTypedObject + 25;
                extraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 53 / 0;
                    if (!Intrinsics.areEqual(keyBoardVisiblePoint.asInterface(), checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) {
                        List listOnNavigationEvent = autoVerifyAvailableBankAccountResp.onNavigationEvent();
                        if (listOnNavigationEvent instanceof Collection) {
                            int i4 = extraCallbackWithResult + 65;
                            readTypedObject = i4 % 128;
                            if (i4 % 2 == 0) {
                                listOnNavigationEvent.isEmpty();
                                throw null;
                            }
                            if (!listOnNavigationEvent.isEmpty()) {
                            }
                        }
                        Iterator it = listOnNavigationEvent.iterator();
                        while (!(!it.hasNext())) {
                            AutoVerifyPossibleBankAccount autoVerifyPossibleBankAccount = (AutoVerifyPossibleBankAccount) it.next();
                            if (!Intrinsics.areEqual(String.valueOf(autoVerifyPossibleBankAccount.onWarmupCompleted()), keyBoardVisiblePoint.onExtraCallbackWithResult()) || !autoVerifyPossibleBankAccount.onExtraCallbackWithResult()) {
                            }
                        }
                    }
                } else if (!Intrinsics.areEqual(keyBoardVisiblePoint.asInterface(), checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) {
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (String) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 700899535, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -700899527, new Object[]{loanApplicationAccountChooserActivity});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -657798218, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 657798221, new Object[]{loanApplicationAccountChooserActivity, iEngagementSignalsCallbackDefault});
    }

    public static /* synthetic */ boolean IAuthTabCallback(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return ((Boolean) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -818026295, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 818026299, new Object[]{loanApplicationAccountChooserActivity})).booleanValue();
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -2002429146, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 2002429148, new Object[]{loanApplicationAccountChooserActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse});
    }

    public static /* synthetic */ String onWarmupCompleted(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (String) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 958200205, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -958200204, new Object[]{loanApplicationAccountChooserActivity});
    }

    private static final Unit onWarmupCompleted(LoanApplicationAccountChooserActivity loanApplicationAccountChooserActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (Unit) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1404056824, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1404056824, new Object[]{loanApplicationAccountChooserActivity, iEngagementSignalsCallbackDefault});
    }

    private final String access200() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (String) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 383412280, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -383412273, new Object[]{this});
    }

    private final void onSessionEnded() {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1494548150, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1494548159, new Object[]{this});
    }

    private final void onNavigationEvent(r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1753081458, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, 1753081464, new Object[]{this, r8lambda6v0yvgpvgcqzeji1gnetqsiyse});
    }

    private final List<KeyBoardVisiblePoint> onExtraCallbackWithResult(AutoVerifyAvailableBankAccountResp autoVerifyAvailableBankAccountResp) {
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        return (List) onNavigationEvent(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 2143077142, iOnNavigationEvent2, iOnNavigationEvent, iOnNavigationEvent3, -2143077137, new Object[]{this, autoVerifyAvailableBankAccountResp});
    }

    @Override // im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallbackWithResult + 77;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 87;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.features.loan.web.Hilt_LoanApplicationAccountChooserActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = extraCallbackWithResult + 123;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ICustomTabsServiceStub() {
        writeTypedObject = new int[]{-1083545204, 490198975, -629929370, -1526901140, -1474900187, 2062522833, 1297987477, 1096207959, -1978275233, 1643973467, 41180203, -582243583, -1813174192, 2010052451, -1897200508, 1822752714, 994333765, 104216928};
    }
}
