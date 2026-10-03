package viva.republica.toss.send.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.activitydelegate.DelegateActivity;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsNestedScrollView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CRYPT_AsymmDecryptWithCert;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.G0;
import o.GeckoHubImp;
import o.IPostMessageServiceStubProxy;
import o.PlayerErrorCode;
import o.SessionTrackera;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.accessgetValueMapcp;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.generateLink;
import o.getAdService;
import o.getDummyAd;
import o.getEntryIterator;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onJsBridgeReady;
import o.onSeekEngaged;
import o.putChannelInfo;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.readIntokhttp;
import o.response;
import o.setHasShown;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setTaggedAddrCtrl;
import o.varyMatches;
import o.zzaz;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.transfer.SignDoc;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementAcceptRequest;
import viva.republica.toss.network.model.transfer.WithdrawAdditionalAgreementRejectRequest;
import viva.republica.toss.network.model.transfer.WithdrawAgreementAccount;
import viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$onCreate$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAdditionalAgreementActivity extends Hilt_WithdrawAdditionalAgreementActivity {
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback_Parcel;
    private static short[] extraCallback;
    private static int getInterfaceDescriptor;
    private static int onPostMessage;
    public static final int onTransact;
    private static int readTypedObject;
    private static byte[] writeTypedObject;
    private boolean access100;
    private boolean asBinder;

    @Inject
    public getDummyAd standardTermsV2Intent;
    private static final byte[] $$a = {110, -114, 93, -109};
    private static final int $$b = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onMinimized = 0;
    private static int ICustomTabsCallback = 0;
    private static int extraCallbackWithResult = 1;
    private final Lazy IAuthTabCallbackStub = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new asBinder(this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return WithdrawAdditionalAgreementActivity.onNavigationEvent(this.f$0);
        }
    });
    private List<WithdrawAgreementAccount> IAuthTabCallbackStubProxy = CollectionsKt.emptyList();
    private final SessionTrackera access000 = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda7
        public final Object invoke(Object obj) {
            return WithdrawAdditionalAgreementActivity.onWarmupCompleted(this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj);
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda8
        public final Object invoke() {
            return Boolean.valueOf(WithdrawAdditionalAgreementActivity.IAuthTabCallback(this.f$0));
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.$$a
            int r6 = r6 * 4
            int r6 = r6 + 115
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.$$c(int, int, int):java.lang.String");
    }

    static {
        onPostMessage = 1;
        IAuthTabCallback();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        onTransact = 8;
        int i = onMinimized + 109;
        onPostMessage = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = (WithdrawAdditionalAgreementActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(withdrawAdditionalAgreementActivity, setDetectableSize);
        }
        IAuthTabCallback(withdrawAdditionalAgreementActivity, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 87;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(delegateActivity, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(delegateActivity, setDetectableSize);
        int i3 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ boolean IAuthTabCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface(withdrawAdditionalAgreementActivity);
        int i4 = extraCallbackWithResult + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(delegateActivity, view);
        int i4 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(delegateActivity, bundle);
        int i4 = ICustomTabsCallback + 27;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DelegateActivity delegateActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1769464563, iIAuthTabCallback2, new Object[]{delegateActivity, setDetectableSize}, -1769464558, iIAuthTabCallback3, iIAuthTabCallback);
        int i4 = ICustomTabsCallback + 79;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i2 | i6;
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = (~(i6 | i8)) | (~(i9 | i2));
        int i12 = i2 + i4 + i3 + (1389894630 * i5) + ((-1243605516) * i);
        int i13 = i12 * i12;
        int i14 = ((-345998475) * i2) + 1335230464 + (862422157 * i4) + ((-1543273332) * i7) + (i10 * 1543273332) + (1543273332 * i11) + ((-1889271808) * i3) + (1607991296 * i5) + ((-548405248) * i) + ((-1553596416) * i13);
        int i15 = ((i2 * (-88671125)) - 261777699) + (i4 * (-88671149)) + (i7 * (-12)) + (i10 * 12) + (i11 * 12) + (i3 * (-88671137)) + (i5 * (-349388198)) + (i * (-147040884)) + (i13 * 182059008);
        switch (i14 + (i15 * i15 * (-132513792))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(delegateActivity);
        }
        onNavigationEvent(delegateActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ accessgetValueMapcp onNavigationEvent(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(withdrawAdditionalAgreementActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessgetValueMapcp accessgetvaluemapcpOnTransact = onTransact(withdrawAdditionalAgreementActivity);
        int i3 = ICustomTabsCallback + 59;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return accessgetvaluemapcpOnTransact;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = (WithdrawAdditionalAgreementActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(withdrawAdditionalAgreementActivity, setDetectableSize);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = ICustomTabsCallback + 91;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(withdrawAdditionalAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(withdrawAdditionalAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i3 = ICustomTabsCallback + 119;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 75;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return 1237687L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements Function0<CRYPT_AsymmDecryptWithCert> {
        final /* synthetic */ Activity IAuthTabCallback;

        public asBinder(Activity activity) {
            this.IAuthTabCallback = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CRYPT_AsymmDecryptWithCert invoke() {
            LayoutInflater layoutInflater = this.IAuthTabCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CRYPT_AsymmDecryptWithCert.IAuthTabCallback(layoutInflater);
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = (WithdrawAdditionalAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        withdrawAdditionalAgreementActivity.ICustomTabsServiceStub();
        int i4 = extraCallbackWithResult + 3;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return null;
    }

    public static final /* synthetic */ accessgetValueMapcp onExtraCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            withdrawAdditionalAgreementActivity.setEngagementSignalsCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        accessgetValueMapcp engagementSignalsCallback = withdrawAdditionalAgreementActivity.setEngagementSignalsCallback();
        int i3 = extraCallbackWithResult + 69;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onExtraCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, List list, List list2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        withdrawAdditionalAgreementActivity.onExtraCallbackWithResult((List<String>) list, (List<WithdrawAgreementAccount>) list2);
        int i4 = ICustomTabsCallback + 87;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, accessgetValueMapcp accessgetvaluemapcp) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        withdrawAdditionalAgreementActivity.onExtraCallbackWithResult(accessgetvaluemapcp);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zICustomTabsServiceDefault = withdrawAdditionalAgreementActivity.ICustomTabsServiceDefault();
        int i4 = ICustomTabsCallback + 61;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zICustomTabsServiceDefault;
    }

    public static final /* synthetic */ SessionTrackera onWarmupCompleted(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 73;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackera sessionTrackera = withdrawAdditionalAgreementActivity.access000;
        int i5 = i2 + 39;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return sessionTrackera;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = (WithdrawAdditionalAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CRYPT_AsymmDecryptWithCert cRYPT_AsymmDecryptWithCert = (CRYPT_AsymmDecryptWithCert) withdrawAdditionalAgreementActivity.IAuthTabCallbackStub.getValue();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        int i5 = extraCallbackWithResult + 1;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return cRYPT_AsymmDecryptWithCert;
    }

    private final accessgetValueMapcp setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        accessgetValueMapcp accessgetvaluemapcp = (accessgetValueMapcp) this.asInterface.getValue();
        int i4 = extraCallbackWithResult + 77;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return accessgetvaluemapcp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final accessgetValueMapcp onTransact(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        String str;
        List<String> pathSegments;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Uri data = withdrawAdditionalAgreementActivity.getIntent().getData();
        if (data == null || (pathSegments = data.getPathSegments()) == null) {
            str = null;
        } else {
            int i4 = extraCallbackWithResult + 57;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            str = (String) CollectionsKt.last(pathSegments);
        }
        if (Intrinsics.areEqual(str, "firm-banking")) {
            return accessgetValueMapcp.ADDITIONAL_FIRM_BANKING;
        }
        if (!Intrinsics.areEqual(str, "open-banking")) {
            int i6 = extraCallbackWithResult + 75;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
            }
            return null;
        }
        int i8 = extraCallbackWithResult + 107;
        ICustomTabsCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return accessgetValueMapcp.ADDITIONAL_OPEN_BANKING;
        }
        int i9 = 14 / 0;
        return accessgetValueMapcp.ADDITIONAL_OPEN_BANKING;
    }

    private static final Unit onWarmupCompleted(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, SetDetectableSize setDetectableSize) throws Throwable {
        Map<String, Object> screenParams;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("skip_yn", zzaz.onExtraCallbackWithResult(!withdrawAdditionalAgreementActivity.ICustomTabsServiceDefault()));
            screenParams = withdrawAdditionalAgreementActivity.getScreenParams();
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("skip_yn", zzaz.onExtraCallbackWithResult(!withdrawAdditionalAgreementActivity.ICustomTabsServiceDefault()));
            screenParams = withdrawAdditionalAgreementActivity.getScreenParams();
        }
        setDetectableSize.onExtraCallback(screenParams);
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback(withdrawAdditionalAgreementActivity.getScreenParams());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(withdrawAdditionalAgreementActivity.getScreenParams());
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCallbackWithResult + 107;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (withdrawAdditionalAgreementActivity.IAuthTabCallbackStubProxy.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1237689L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                    int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                    return (Unit) WithdrawAdditionalAgreementActivity.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -869838488, AdResponseKtKt.IAuthTabCallback(), objArr, 869838488, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback);
                }
            }, 14, (Object) null);
            withdrawAdditionalAgreementActivity.IAuthTabCallback(withdrawAdditionalAgreementActivity.IAuthTabCallbackStubProxy);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1237691L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                    int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                    return (Unit) WithdrawAdditionalAgreementActivity.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -1057278548, AdResponseKtKt.IAuthTabCallback(), objArr, 1057278552, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback);
                }
            }, 14, (Object) null);
            withdrawAdditionalAgreementActivity.onNavigationEvent(true);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 41;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return ((Boolean) value).booleanValue();
        }
        int i4 = 7 / 0;
        return ((Boolean) value).booleanValue();
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 23;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 63;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getdummyad;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.ICustomTabsCallback
            int r1 = r1 + 121
            int r2 = r1 % 128
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.extraCallbackWithResult = r2
            int r1 = r1 % r0
            o.accessgetValueMapcp r1 = r12.setEngagementSignalsCallback()
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L30
            int r4 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.extraCallbackWithResult
            int r4 = r4 + 25
            int r5 = r4 % 128
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.ICustomTabsCallback = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L2a
            java.lang.String r1 = r1.getLogName()
            r4 = 41
            int r4 = r4 / r3
            if (r1 != 0) goto L31
            goto L30
        L2a:
            java.lang.String r1 = r1.getLogName()
            if (r1 != 0) goto L31
        L30:
            r1 = r2
        L31:
            r4 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r2, r4, r3, r3)
            int r5 = (-1) - r5
            short r6 = (short) r5
            r7 = 0
            int r5 = android.widget.ExpandableListView.getPackedPositionType(r7)
            int r5 = r5 + (-14)
            byte r7 = (byte) r5
            float r5 = android.view.ViewConfiguration.getScrollFriction()
            r8 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r8 = 147248758(0x8c6d676, float:1.1967111E-33)
            int r8 = r8 + r5
            r5 = -421473256(0xffffffffe6e0d418, float:-5.3086127E23)
            int r2 = android.text.TextUtils.indexOf(r2, r2, r3)
            int r9 = r5 - r2
            char r2 = android.text.AndroidCharacter.getMirror(r4)
            int r10 = (-58) - r2
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r11 = r4
            a(r6, r7, r8, r9, r10, r11)
            r4 = r4[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r4, r1)
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            r2[r3] = r1
            java.util.Map r1 = o.access8100.IAuthTabCallback(r2)
            int r2 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.ICustomTabsCallback
            int r2 = r2 + 63
            int r3 = r2 % 128
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.extraCallbackWithResult = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.getScreenParams():java.util.Map");
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return WithdrawAdditionalAgreementActivity.this.new onExtraCallback(access13800Var);
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [android.content.Context, viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity] */
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            accessgetValueMapcp accessgetvaluemapcpOnExtraCallback = WithdrawAdditionalAgreementActivity.onExtraCallback(WithdrawAdditionalAgreementActivity.this);
            if (accessgetvaluemapcpOnExtraCallback == null) {
                ?? r2 = WithdrawAdditionalAgreementActivity.this;
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult((Context) r2, new WithdrawAdditionalAgreementActivity$onCreate$1$.ExternalSyntheticLambda1((WithdrawAdditionalAgreementActivity) r2));
                return Unit.INSTANCE;
            }
            WithdrawAdditionalAgreementActivity.onExtraCallback(WithdrawAdditionalAgreementActivity.this, accessgetvaluemapcpOnExtraCallback);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onWarmupCompleted(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(withdrawAdditionalAgreementActivity.getString(R.string.app_withdraw_additional_agreement_bad_request_dialog_title));
            commonModule_setLeftEdgeTouchEnabled.asBinder(new WithdrawAdditionalAgreementActivity$onCreate$1$.ExternalSyntheticLambda0(withdrawAdditionalAgreementActivity));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, DialogInterface dialogInterface) {
            withdrawAdditionalAgreementActivity.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // viva.republica.toss.send.common.Hilt_WithdrawAdditionalAgreementActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        setContentView(((CRYPT_AsymmDecryptWithCert) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 933445982, iIAuthTabCallback2, new Object[]{this}, -933445979, iIAuthTabCallback3, iIAuthTabCallback)).getRoot());
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback5 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback6 = AdResponseKtKt.IAuthTabCallback();
        ConstraintLayout root = ((CRYPT_AsymmDecryptWithCert) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 933445982, iIAuthTabCallback5, new Object[]{this}, -933445979, iIAuthTabCallback6, iIAuthTabCallback4)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        int iIAuthTabCallback7 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback8 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback9 = AdResponseKtKt.IAuthTabCallback();
        disableImageViewPreallocationAndroid.onNavigationEvent(root, ((CRYPT_AsymmDecryptWithCert) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 933445982, iIAuthTabCallback8, new Object[]{this}, -933445979, iIAuthTabCallback9, iIAuthTabCallback7)).IAuthTabCallback, (View) null, (View) null, false, 14, (Object) null);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = extraCallbackWithResult + 125;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                supportActionBar.onNavigationEvent(true);
            } else {
                supportActionBar.onNavigationEvent(true);
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
    }

    public boolean bg_() {
        int i = 2 % 2;
        if (!this.access100) {
            int i2 = ICustomTabsCallback + 83;
            extraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted(this, false, 0, null);
            } else {
                onWarmupCompleted(this, false, 1, null);
            }
            int i3 = extraCallbackWithResult + 13;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return super.bg_();
    }

    private final void onExtraCallbackWithResult(accessgetValueMapcp accessgetvaluemapcp) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(accessgetvaluemapcp, this, (access13800) null), 3, (Object) null);
        int i2 = ICustomTabsCallback + 115;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ List<WithdrawAgreementAccount> $accounts;
        final /* synthetic */ List<String> $termsId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(List<WithdrawAgreementAccount> list, List<String> list2, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$accounts = list;
            this.$termsId = list2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return WithdrawAdditionalAgreementActivity.this.new asInterface(this.$accounts, this.$termsId, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                accessgetValueMapcp accessgetvaluemapcpOnExtraCallback = WithdrawAdditionalAgreementActivity.onExtraCallback(WithdrawAdditionalAgreementActivity.this);
                int i2 = accessgetvaluemapcpOnExtraCallback == null ? -1 : onExtraCallbackWithResult.onExtraCallback[accessgetvaluemapcpOnExtraCallback.ordinal()];
                if (i2 == 1) {
                    str = "STD_15_FIRM_BANKING_AGREEMENT";
                } else if (i2 == 2) {
                    str = "STD_15_OPEN_BANKING_AGREEMENT";
                } else {
                    return Unit.INSTANCE;
                }
                String str2 = str;
                List<WithdrawAgreementAccount> list = this.$accounts;
                ArrayList<SignDoc> arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    SignDoc signDocOnExtraCallback = ((WithdrawAgreementAccount) it.next()).onExtraCallback();
                    if (signDocOnExtraCallback != null) {
                        arrayList.add(signDocOnExtraCallback);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                for (SignDoc signDoc : arrayList) {
                    arrayList2.add(new G0(signDoc.onExtraCallback(), signDoc.onNavigationEvent()));
                }
                getDummyAd getdummyadOnNavigationEvent = WithdrawAdditionalAgreementActivity.this.onNavigationEvent();
                BaseActivity baseActivity = WithdrawAdditionalAgreementActivity.this;
                getEntryIterator getentryiterator = new getEntryIterator(arrayList2);
                List listDistinct = CollectionsKt.distinct(this.$termsId);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
                Iterator it2 = listDistinct.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new StandardTermsV2DynamicTermsParam((String) it2.next(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                }
                StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr = (StandardTermsV2DynamicTermsParam[]) arrayList3.toArray(new StandardTermsV2DynamicTermsParam[0]);
                this.L$0 = access15400.onNavigationEvent(str2);
                this.L$1 = access15400.onNavigationEvent(arrayList2);
                this.label = 1;
                objOnExtraCallback = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, baseActivity, str2, (String) null, (String) null, 7L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, getentryiterator, false, false, false, (StandardTermsV2BizReceiver[]) null, standardTermsV2DynamicTermsParamArr, false, (StandardTermsV2YouthRegisterParam) null, (String) null, this, 7847916, (Object) null);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = obj;
            }
            WithdrawAdditionalAgreementActivity.onWarmupCompleted(WithdrawAdditionalAgreementActivity.this).onNavigationEvent((Intent) objOnExtraCallback);
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallbackWithResult(List<String> list, List<WithdrawAgreementAccount> list2) {
        int i = 2 % 2;
        this.IAuthTabCallbackStubProxy = list2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new asInterface(list2, list, null), 3, (Object) null);
        int i2 = ICustomTabsCallback + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ List<WithdrawAgreementAccount> $accounts;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(List<WithdrawAgreementAccount> list, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$accounts = list;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return WithdrawAdditionalAgreementActivity.this.new onNavigationEvent(this.$accounts, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            final /* synthetic */ List $accounts$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ WithdrawAdditionalAgreementActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onExtraCallback(access13800 access13800Var, WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, List list) {
                super(2, access13800Var);
                this.this$0 = withdrawAdditionalAgreementActivity;
                this.$accounts$inlined = list;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallback(access13800Var, this.this$0, this.$accounts$inlined);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnWarmupCompleted;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0', 0)), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 24733, -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getLongPressTimeout() >> 16)), 22 - TextUtils.getCapsMode("", 0, 0), 24735 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1913081575, false, "extraCallback", new Class[0]);
                        }
                        onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        accessgetValueMapcp accessgetvaluemapcpOnExtraCallback = WithdrawAdditionalAgreementActivity.onExtraCallback(this.this$0);
                        Intrinsics.checkNotNull(accessgetvaluemapcpOnExtraCallback);
                        WithdrawAdditionalAgreementAcceptRequest withdrawAdditionalAgreementAcceptRequest = new WithdrawAdditionalAgreementAcceptRequest(accessgetvaluemapcpOnExtraCallback, this.$accounts$inlined);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        objOnWarmupCompleted = onseekengaged.onWarmupCompleted(withdrawAdditionalAgreementAcceptRequest, (access13800<? super BaseApiResponse<Object>>) this);
                        if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                            return objOnWarmupCompleted2;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = obj;
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) objOnWarmupCompleted;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, im.toss.base.BaseActivity, java.lang.Object, viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity] */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = WithdrawAdditionalAgreementActivity.this;
                    List<WithdrawAgreementAccount> list = this.$accounts;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onExtraCallback onextracallback = new onExtraCallback(null, withdrawAdditionalAgreementActivity, list);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onextracallback, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                obj2 = Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            ?? r0 = WithdrawAdditionalAgreementActivity.this;
            if (Result.onNavigationEvent(obj2)) {
                if (WithdrawAdditionalAgreementActivity.onExtraCallbackWithResult((WithdrawAdditionalAgreementActivity) r0)) {
                    int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                    int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
                    int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
                    WithdrawAdditionalAgreementActivity.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1492128671, iIAuthTabCallback2, new Object[]{r0}, -1492128669, iIAuthTabCallback3, iIAuthTabCallback);
                } else {
                    r0.setResult(-1);
                }
                r0.finish();
            }
            BaseActivity baseActivity = WithdrawAdditionalAgreementActivity.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WithdrawAdditionalAgreementActivity", "error on signAndUpdateAgreement", th, (Map) null, 8, (Object) null);
                getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback(List<WithdrawAgreementAccount> list) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(list, null), 3, (Object) null);
        int i2 = ICustomTabsCallback + 85;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    static /* synthetic */ void onWarmupCompleted(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback;
        int i4 = i3 + 89;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 99;
            extraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        withdrawAdditionalAgreementActivity.onNavigationEvent(z);
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return WithdrawAdditionalAgreementActivity.this.new onExtraCallbackWithResult(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0032onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ WithdrawAdditionalAgreementActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0032onExtraCallbackWithResult(access13800 access13800Var, WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
                super(2, access13800Var);
                this.this$0 = withdrawAdditionalAgreementActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new C0032onExtraCallbackWithResult(access13800Var, this.this$0);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), KeyEvent.normalizeMetaState(0) + 22, 24734 - KeyEvent.getDeadChar(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29425), 22 - (ViewConfiguration.getTouchSlop() >> 8), 24735 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1913081575, false, "extraCallback", new Class[0]);
                        }
                        onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        accessgetValueMapcp accessgetvaluemapcpOnExtraCallback = WithdrawAdditionalAgreementActivity.onExtraCallback(this.this$0);
                        Intrinsics.checkNotNull(accessgetvaluemapcpOnExtraCallback);
                        WithdrawAdditionalAgreementRejectRequest withdrawAdditionalAgreementRejectRequest = new WithdrawAdditionalAgreementRejectRequest(accessgetvaluemapcpOnExtraCallback);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = onseekengaged.onWarmupCompleted(withdrawAdditionalAgreementRejectRequest, (access13800<? super BaseApiResponse<Object>>) this);
                        if (obj == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
                int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                    try {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact != null) {
                            return objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(Object.class, Object.class) || Intrinsics.areEqual(Object.class, Unit.class)) {
                            return Unit.INSTANCE;
                        }
                        TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                        apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                        throw apiErrorOnExtraCallbackWithResult;
                    }
                }
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity = WithdrawAdditionalAgreementActivity.this;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    C0032onExtraCallbackWithResult c0032onExtraCallbackWithResult = new C0032onExtraCallbackWithResult(null, withdrawAdditionalAgreementActivity);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0032onExtraCallbackWithResult, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Result.constructor-impl(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(boolean r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.extraCallbackWithResult
            int r1 = r1 + 61
            int r2 = r1 % 128
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.ICustomTabsCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r8.asBinder
            r2 = 20
            int r2 = r2 / 0
            if (r1 != 0) goto L2d
            goto L1b
        L17:
            boolean r1 = r8.asBinder
            if (r1 != 0) goto L2d
        L1b:
            r1 = 1
            r8.asBinder = r1
            o.ComponentModelb r2 = o.ComponentModelb.onExtraCallback
            r3 = 0
            r4 = 0
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$onExtraCallbackWithResult r5 = new viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$onExtraCallbackWithResult
            r1 = 0
            r5.<init>(r1)
            r6 = 3
            r7 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r2, r3, r4, r5, r6, r7)
        L2d:
            if (r9 == 0) goto L3b
            r8.finish()
            int r9 = viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.ICustomTabsCallback
            int r9 = r9 + 123
            int r1 = r9 % 128
            viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.extraCallbackWithResult = r1
            int r9 = r9 % r0
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.onNavigationEvent(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStub() {
        int i = 2 % 2;
        onJsBridgeReady.onExtraCallbackWithResult(this, new Function2() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return WithdrawAdditionalAgreementActivity.onExtraCallback((DelegateActivity) obj, (Bundle) obj2);
            }
        }, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (setTaggedAddrCtrl) null, (Function1) null, 33554432, false, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
                int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
                return (View) WithdrawAdditionalAgreementActivity.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1666547535, iIAuthTabCallback2, new Object[]{(DelegateActivity) obj}, -1666547534, iIAuthTabCallback3, iIAuthTabCallback);
            }
        }, 1534, (Object) null);
        int i2 = ICustomTabsCallback + 99;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        DelegateActivity delegateActivity = (DelegateActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(delegateActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 77;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(final DelegateActivity delegateActivity, Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1237705L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return WithdrawAdditionalAgreementActivity.onExtraCallbackWithResult(delegateActivity, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        delegateActivity.setResult(-1);
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j2 = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 43424), 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 109;
                int i7 = i6 % 128;
                $10 = i7;
                int i8 = i6 % 2;
                byte[] bArr = writeTypedObject;
                if (bArr != null) {
                    int i9 = i7 + 39;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12844 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1))), View.MeasureSpec.getMode(0) + 55, 2167 - TextUtils.getCapsMode("", 0, 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i11++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = writeTypedObject;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (extraCallback[i + ((int) (IAuthTabCallback_Parcel ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback_Parcel ^ j)) + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(readTypedObject), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.green(0) + 86, 9567 - ExpandableListView.getPackedPositionGroup(0L), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = writeTypedObject;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i13 = $11 + 105;
                        int i14 = i13 % 128;
                        $10 = i14;
                        int i15 = i13 % 2;
                        if (z) {
                            int i16 = i14 + 45;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            byte[] bArr6 = writeTypedObject;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = extraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onWarmupCompleted(DelegateActivity delegateActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(delegateActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 37;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(final DelegateActivity delegateActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1237707L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return WithdrawAdditionalAgreementActivity.IAuthTabCallback(delegateActivity, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        delegateActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 55;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity, viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v47, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v53, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean asInterface(viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity r12) {
        /*
            Method dump skipped, instructions count: 1407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity.asInterface(viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity):boolean");
    }

    private static final View onNavigationEvent(final DelegateActivity delegateActivity) throws Throwable {
        String strIntern;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(delegateActivity, "");
        LinearLayout linearLayout = new LinearLayout(delegateActivity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsNestedScrollView tdsNestedScrollView = new TdsNestedScrollView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsNestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        Context context2 = tdsNestedScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        DisplayMetrics displayMetrics = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(90, displayMetrics);
        DisplayMetrics displayMetrics2 = linearLayout2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), iOnNavigationEvent, linearLayout2.getPaddingRight(), varyMatches.onNavigationEvent(40, displayMetrics2));
        Context context3 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(delegateActivity.getString(R.string.transfer_additional_agreement_sms_guide_title));
        Context context4 = tdsTopV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        Configuration configuration = context4.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsTopV1View.setUpperTextColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onUnminimized());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsTopV1View);
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView tdsImageView = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsImageView.setAdjustViewBounds(true);
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{delegateActivity}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i2 = ICustomTabsCallback + 3;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (29 - TextUtils.lastIndexOf("", '0', 0)), View.MeasureSpec.getMode(0) + 147248656, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 421473268, (-59) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            Object[] objArr2 = new Object[1];
            a((short) KeyEvent.getDeadChar(0, 0), (byte) ((-52) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getOffsetBefore("", 0) + 147248707, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 421473269, KeyEvent.normalizeMetaState(0) - 57, objArr2);
            String strIntern2 = ((String) objArr2[0]).intern();
            int i4 = extraCallbackWithResult + 5;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            strIntern = strIntern2;
        }
        TdsImageView.setImage$default(tdsImageView, strIntern, (Function1) null, (Function1) null, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsImageView);
        BaseTextView baseTextView = (BaseTextView) Typography3.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        DisplayMetrics displayMetrics3 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(24, displayMetrics3);
        DisplayMetrics displayMetrics4 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(36, displayMetrics4);
        DisplayMetrics displayMetrics5 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(24, displayMetrics5);
        DisplayMetrics displayMetrics6 = baseTextView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent4, varyMatches.onNavigationEvent(0, displayMetrics6));
        baseTextView.onNavigationEvent(response.Bold);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) delegateActivity.getString(R.string.transfer_additional_agreement_sms_guide_description_1_with_user_name, PlayerErrorCode.onPostMessage()));
        spannableStringBuilder.append((CharSequence) " ");
        Context context6 = baseTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration2 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new onTransact(configuration2)).asBinder());
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) delegateActivity.getString(R.string.transfer_additional_agreement_sms_guide_description_2));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        baseTextView.setText(new SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsNestedScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsNestedScrollView);
        Context context7 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context7);
        TdsBottomCtaV1View.IAuthTabCallback(tdsBottomCtaV1View, tdsNestedScrollView, false, 0, 6, (Object) null);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.transfer_additional_agreement_sms_guide_confirm, new Function1() { // from class: viva.republica.toss.send.common.WithdrawAdditionalAgreementActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr3 = {delegateActivity, (View) obj};
                int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
                return (Unit) WithdrawAdditionalAgreementActivity.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -287486311, AdResponseKtKt.IAuthTabCallback(), objArr3, 287486317, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        return linearLayout;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -869838488, iIAuthTabCallback2, new Object[]{withdrawAdditionalAgreementActivity, setDetectableSize}, 869838488, iIAuthTabCallback3, iIAuthTabCallback);
    }

    public static /* synthetic */ View onExtraCallbackWithResult(DelegateActivity delegateActivity) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (View) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1666547535, iIAuthTabCallback2, new Object[]{delegateActivity}, -1666547534, iIAuthTabCallback3, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(DelegateActivity delegateActivity, View view) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -287486311, iIAuthTabCallback2, new Object[]{delegateActivity, view}, 287486317, iIAuthTabCallback3, iIAuthTabCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -1057278548, iIAuthTabCallback2, new Object[]{withdrawAdditionalAgreementActivity, setDetectableSize}, 1057278552, iIAuthTabCallback3, iIAuthTabCallback);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(WithdrawAdditionalAgreementActivity withdrawAdditionalAgreementActivity) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1492128671, iIAuthTabCallback2, new Object[]{withdrawAdditionalAgreementActivity}, -1492128669, iIAuthTabCallback3, iIAuthTabCallback);
    }

    private final CRYPT_AsymmDecryptWithCert updateVisuals() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (CRYPT_AsymmDecryptWithCert) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 933445982, iIAuthTabCallback2, new Object[]{this}, -933445979, iIAuthTabCallback3, iIAuthTabCallback);
    }

    private static final Unit onExtraCallback(DelegateActivity delegateActivity, SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (Unit) onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 1769464563, iIAuthTabCallback2, new Object[]{delegateActivity, setDetectableSize}, -1769464558, iIAuthTabCallback3, iIAuthTabCallback);
    }

    @Override // viva.republica.toss.send.common.Hilt_WithdrawAdditionalAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 125;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = ICustomTabsCallback + 49;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
    }

    @Override // viva.republica.toss.send.common.Hilt_WithdrawAdditionalAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.send.common.Hilt_WithdrawAdditionalAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        int i5 = extraCallbackWithResult + 95;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.send.common.Hilt_WithdrawAdditionalAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = extraCallbackWithResult + 33;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void IAuthTabCallback() {
        IAuthTabCallback_Parcel = 1400828408;
        getInterfaceDescriptor = -1538795418;
        readTypedObject = -1118243756;
        writeTypedObject = new byte[]{-17, -24, 84, -43, -17, 7, -21, 33, -84, 16, -20, 80, -42, -18, 6, -24, -19, -31, 27, 19, 34, -86, -23, 23, -24, 31, 22, 21, 44, -44, 18, 45, -83, 22, 18, -19, 80, -35, -20, -29, 5, -5, 23, 82, 22, -29, -47, 21, -22, 22, 26, 60, 59, -121, Byte.MAX_VALUE, -55, -60, 59, 56, -6, Byte.MAX_VALUE, -61, 63, -125, 5, 61, -43, 59, 62, 50, -56, -64, -15, 121, 58, -60, 59, -52, -59, -58, -1, 7, -63, -2, 126, -59, -63, 62, -125, 14, 63, 48, -42, 40, -60, -127, -59, 48, 2, -58, 57, -59, -55, 15, 13, -1, 8, 8, 8};
    }
}
