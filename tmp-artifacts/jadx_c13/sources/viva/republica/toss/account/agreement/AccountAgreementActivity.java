package viva.republica.toss.account.agreement;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.kyc.navigation.models.AddressModuleType;
import im.toss.features.kyc.navigation.models.CddProcessType;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.standardtermsv2.param.StandardTermsV2BizReceiver;
import im.toss.standardtermsv2.param.StandardTermsV2CustomVariable;
import im.toss.standardtermsv2.param.StandardTermsV2DynamicTermsParam;
import im.toss.standardtermsv2.param.StandardTermsV2YouthRegisterParam;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppLovinAdImpl;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModulePackageExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.CxxInspectorPackagerConnectionIWebSocket;
import o.GeckoHubImp;
import o.IEngagementSignalsCallback_Parcel;
import o.LifecyclesKtawaitStarted21;
import o.PlayerErrorCode;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TemplateConfigModel;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.TimeoutCompanionNONE1;
import o.ToolkitManager_Update;
import o.TypeUtils2;
import o.TypeUtils7;
import o.UST_CMP_IssueCertificate_SendConf;
import o.UTF8Decoder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.addExtra;
import o.checkNavigationBarBySystemProperties;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.findResAndMsg;
import o.getDummyAd;
import o.getEnableJsT2;
import o.getExtModel;
import o.getExtUrl;
import o.getHostnameVerifierokhttp;
import o.getIssuerAndSerialNumber;
import o.getOriginalFullResponse;
import o.getParamImp;
import o.getResultMsg;
import o.getSignedData;
import o.initMiniApp;
import o.isProxy;
import o.maybeUpdateAnimatable;
import o.nSetPosition;
import o.onLoadStarted;
import o.onSeekEngaged;
import o.putChannelInfo;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.r8lambdaDml5dirzRCENiZicd2_b5Xg5o;
import o.send;
import o.setDescriptionTextColor;
import o.setExtraJsT2MapStr;
import o.setHasShown;
import o.setSignedData;
import o.setUcJsT2;
import o.shortValue;
import o.writeRaw;
import o.zzaj;
import o.zzaz;
import o.zzbq;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementActivity$onCreate$1$;
import viva.republica.toss.network.model.transfer.BankTermIds;
import viva.republica.toss.network.model.transfer.ResolveTermIdsRequest;
import viva.republica.toss.network.model.transfer.ResolveTermIdsResponse;
import viva.republica.toss.network.model.verify.SessionKnownType;
import viva.republica.toss.signup.AccountSmsIntroActivity;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AccountAgreementActivity extends Hilt_AccountAgreementActivity {
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallbackDefault;
    private static char[] onActivityResized;
    private static int onMinimized;
    private static long onPostMessage;
    private TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult IAuthTabCallback_Parcel;
    private UTF8Decoder access000;
    private boolean access100;
    private Long asBinder;
    private long asInterface;
    private boolean getInterfaceDescriptor;

    @Inject
    public getEnableJsT2 kycHelper;

    @Inject
    public getDummyAd standardTermsV2Intent;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {106, -23, 12, ByteCompanionObject.MIN_VALUE};
    private static final int $$b = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int onMessageChannelReady = 0;
    private static int onActivityLayout = 1;
    private final Lazy extraCallbackWithResult = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(getResultMsg.class), new getInterfaceDescriptor(this), new asBinder(this), new IAuthTabCallback_Parcel(null, this));
    private String onTransact = _UrlKt.FRAGMENT_ENCODE_SET;
    private String IAuthTabCallbackStub = _UrlKt.FRAGMENT_ENCODE_SET;
    private String extraCallback = SessionKnownType.REGISTER_BANK_ACCOUNT.name();
    private String IAuthTabCallbackStubProxy = "SV-WBA";
    private getSignedData readTypedObject = getSignedData.DEFAULT;
    private boolean writeTypedObject = true;
    private final SessionTrackera ICustomTabsCallback = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj};
            return (Unit) AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -494388120, 494388127, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
        }
    });

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1013986926, -1013986924, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{AccountAgreementActivity.this, this});
        }
    }

    static final class IAuthTabCallbackDefault extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountAgreementActivity.onExtraCallbackWithResult(AccountAgreementActivity.this, null, this);
        }
    }

    static final class access000 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        access000(access13800<? super access000> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountAgreementActivity.onNavigationEvent(AccountAgreementActivity.this, this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountAgreementActivity.onExtraCallbackWithResult(AccountAgreementActivity.this, null, null, this);
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountAgreementActivity.IAuthTabCallback(AccountAgreementActivity.this, this);
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[setExtraJsT2MapStr.values().length];
            try {
                iArr[setExtraJsT2MapStr.NOT_KYC_TARGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setExtraJsT2MapStr.CDD_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setExtraJsT2MapStr.EDD_DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setExtraJsT2MapStr.GRC_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[setExtraJsT2MapStr.BLOCKED_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[setExtraJsT2MapStr.START_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[setExtraJsT2MapStr.CDD_CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[setExtraJsT2MapStr.CDD_FAILURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[setExtraJsT2MapStr.EDD_CANCELED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[setExtraJsT2MapStr.EDD_FAILURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[setExtraJsT2MapStr.PIN_CANCELED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[setExtraJsT2MapStr.EEDD_CANCELED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            onExtraCallback = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        int i5;
        int i6 = 4 - (i2 * 4);
        int i7 = 1 - (i * 2);
        byte[] bArr = $$a;
        int i8 = 97 - (b * 2);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            i4 = i6;
            i5 = 0;
            i6 += -i9;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i4];
            i6 += -i9;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i6;
            i6 = i8;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    static {
        onMinimized = 0;
        ICustomTabsServiceDefault();
        Companion = new onExtraCallback(null);
        IAuthTabCallbackDefault = 8;
        int i = ICustomTabsCallbackStubProxy + 55;
        onMinimized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(accountAgreementActivity);
        int i4 = onActivityLayout + 95;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objArr[1];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 91;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = {accountAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, setDetectableSize};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 2121686518, -2121686515, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, setDetectableSize});
        int i3 = onActivityLayout + 91;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 11;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = onActivityLayout + 29;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(AccountAgreementActivity accountAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 111;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountAgreementActivity, setDetectableSize);
        int i4 = onActivityLayout + 29;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i4;
        int i10 = ~i5;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i | i5)) | (~(i7 | i9 | i10));
        int i13 = i4 + i5 + i3 + ((-1136091917) * i6) + (376669458 * i2);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i4) + 1718550528 + ((-1748215485) * i5) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i3) + ((-2044854272) * i6) + (41156608 * i2) + (1721171968 * i14);
        int i16 = ((i4 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i3 * (-924404175)) + (i6 * (-2083730301)) + (i2 * 182666354) + (i14 * (-51970048));
        switch (i15 + (i16 * i16 * (-653721600))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objArr[1];
                SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[2];
                int i17 = 2 % 2;
                int i18 = onMessageChannelReady + 15;
                onActivityLayout = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(setDetectableSize, "");
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 9, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37184), objArr2);
                setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), (String) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 72269503, -72269497, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountAgreementActivity}));
                setDetectableSize.onExtraCallback("service_referrer", accountAgreementActivity.ICustomTabsServiceStub());
                setDetectableSize.onExtraCallback("account_ids", tabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult());
                Unit unit = Unit.INSTANCE;
                int i20 = onMessageChannelReady + 109;
                onActivityLayout = i20 % 128;
                int i21 = i20 % 2;
                return unit;
            case 4:
                AccountAgreementActivity accountAgreementActivity2 = (AccountAgreementActivity) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i22 = 2 % 2;
                int i23 = onMessageChannelReady + 83;
                int i24 = i23 % 128;
                onActivityLayout = i24;
                int i25 = i23 % 2;
                accountAgreementActivity2.getInterfaceDescriptor = zBooleanValue;
                int i26 = i24 + 109;
                onMessageChannelReady = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return onExtraCallback(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountAgreementActivity, dialogInterface);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        int i5 = onMessageChannelReady + 49;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountAgreementActivity accountAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 35;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -2061239426, 2061239435, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, setDetectableSize});
        int i4 = onMessageChannelReady + 97;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 5;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(accountAgreementActivity, dialogInterface);
        }
        IAuthTabCallback(accountAgreementActivity, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 63;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 111;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return 1214885L;
        }
        throw null;
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -5673178029083967571L;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Bundle $savedInstanceState;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Bundle bundle, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$savedInstanceState = bundle;
        }

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i6;
            int i9 = ~(i7 | i8 | i2);
            int i10 = ~i2;
            int i11 = i9 | (~(i7 | i10 | i6));
            int i12 = (~(i2 | i8)) | i7 | (~(i10 | i6));
            int i13 = i3 + i6 + i5 + (1112421973 * i4) + ((-1897213938) * i);
            int i14 = i13 * i13;
            int i15 = ((1216318437 * i3) - 781189120) + ((-1395624931) * i6) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i5) + ((-1446510592) * i4) + (892338176 * i) + ((-1657864192) * i14);
            int i16 = (i3 * 2010092721) + 1217064380 + (i6 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i5 * 2010091741) + (i4 * (-1378896031)) + (i * 856652822) + (i14 * 563281920);
            if (i15 + (i16 * i16 * (-1077346304)) != 1) {
                return IAuthTabCallback(objArr);
            }
            onTransact ontransact = (onTransact) objArr[0];
            Object obj = objArr[1];
            int i17 = 2 % 2;
            onTransact ontransact2 = AccountAgreementActivity.this.new onTransact(ontransact.$savedInstanceState, (access13800) objArr[2]);
            int i18 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
            return ontransact2;
        }

        public static /* synthetic */ Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(accountAgreementActivity, dialogInterface);
            if (i3 != 0) {
                int i4 = 2 / 0;
            }
            int i5 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unitOnWarmupCompleted;
        }

        public static /* synthetic */ Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(accountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(accountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
            int i3 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 11 / 0;
            }
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(accountAgreementActivity, dialogInterface);
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(AccountAgreementActivity accountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(accountAgreementActivity, commonModule_setLeftEdgeTouchEnabled);
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                Object[] objArr = {(onTransact) ((access13800) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 983613409, iOnExtraCallbackWithResult3, new Object[]{this, findresandmsg, access13800Var}, iOnExtraCallbackWithResult2, -983613408)), Unit.INSTANCE};
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult5 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -1389291777, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult5, 1389291777);
                throw null;
            }
            int iOnExtraCallbackWithResult6 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult7 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult8 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            Object[] objArr2 = {(onTransact) ((access13800) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, 983613409, iOnExtraCallbackWithResult8, new Object[]{this, findresandmsg, access13800Var}, iOnExtraCallbackWithResult7, -983613408)), Unit.INSTANCE};
            int iOnExtraCallbackWithResult9 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult10 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            Object objIAuthTabCallback = IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult9, -1389291777, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult10, 1389291777);
            int i3 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
            return objIAuthTabCallback;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
            char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
            timelineExternalSyntheticLambda0.onNavigationEvent = 4;
            while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                int i3 = $10 + 13;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 45812), ExpandableListView.getPackedPositionChild(0L) + 85, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 14186), 20 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 8808 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i6 = $11 + 15;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        }

        private static final Unit onNavigationEvent(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                accountAgreementActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i3 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 36 / 0;
                }
                return unit;
            }
            accountAgreementActivity.finish();
            Unit unit2 = Unit.INSTANCE;
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallback(AccountAgreementActivity accountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(accountAgreementActivity.getString(R.string.visitor_block_service_message));
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, null, false, new AccountAgreementActivity$onCreate$1$.ExternalSyntheticLambda2(accountAgreementActivity), 6, null)}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i2 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 62 / 0;
            }
            return unit;
        }

        private static final Unit onWarmupCompleted(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            accountAgreementActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 56 / 0;
            }
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onNavigationEvent(AccountAgreementActivity accountAgreementActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
            int i = 2 % 2;
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(accountAgreementActivity.getString(R.string.teens_age_block_service_info_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(accountAgreementActivity.getString(R.string.teens_age_block_service_info_message, PlayerErrorCode.onPostMessage()));
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_confirm, null, false, new AccountAgreementActivity$onCreate$1$.ExternalSyntheticLambda3(accountAgreementActivity), 6, null)};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:90:0x02e8, code lost:
        
            if (viva.republica.toss.account.agreement.AccountAgreementActivity.onNavigationEvent(r0, r1) == r5) goto L94;
         */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v11, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v12, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v13, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v23, types: [android.content.Context, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /* JADX WARN: Type inference failed for: r0v9, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
            boolean z;
            TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult;
            getSignedData getsigneddata;
            UTF8Decoder uTF8Decoder;
            getSignedData getsigneddata2;
            onTransact ontransact = (onTransact) objArr[0];
            Object objOnExtraCallback = objArr[1];
            int i = 2 % 2;
            Object objOnExtraCallback2 = access14100.onExtraCallback();
            int i2 = ontransact.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallback);
                if (addExtra.extraCallback(PlayerErrorCode.onWarmupCompleted)) {
                    ?? r0 = AccountAgreementActivity.this;
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r0, new AccountAgreementActivity$onCreate$1$.ExternalSyntheticLambda0((AccountAgreementActivity) r0));
                    return Unit.INSTANCE;
                }
                LifecyclesKtawaitStarted21 lifecyclesKtawaitStarted21 = LifecyclesKtawaitStarted21.IAuthTabCallback;
                Boolean boolOnNavigationEvent = access14000.onNavigationEvent(false);
                ontransact.label = 1;
                objOnExtraCallback = LifecyclesKtawaitStarted21.onExtraCallback(new Object[]{lifecyclesKtawaitStarted21, "transfer.skipUnderFourteenRestrictionAccountAgreement", boolOnNavigationEvent, ontransact}, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback());
                if (objOnExtraCallback != objOnExtraCallback2) {
                }
                return objOnExtraCallback2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallback);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            boolean zBooleanValue = ((Boolean) objOnExtraCallback).booleanValue();
            if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted) && !zBooleanValue) {
                ?? r02 = AccountAgreementActivity.this;
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r02, new AccountAgreementActivity$onCreate$1$.ExternalSyntheticLambda1((AccountAgreementActivity) r02));
                return Unit.INSTANCE;
            }
            Bundle bundle = ontransact.$savedInstanceState;
            String str = _UrlKt.FRAGMENT_ENCODE_SET;
            if (bundle != null) {
                z = zBooleanValue;
                AccountAgreementActivity.IAuthTabCallback(AccountAgreementActivity.this, bundle.getLong("EXTRA_ACCOUNT_ID", 0L));
                AccountAgreementActivity accountAgreementActivity = AccountAgreementActivity.this;
                String string = ontransact.$savedInstanceState.getString("EXTRA_BANK_CODE", _UrlKt.FRAGMENT_ENCODE_SET);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AccountAgreementActivity.onExtraCallback(accountAgreementActivity, string);
                AccountAgreementActivity accountAgreementActivity2 = AccountAgreementActivity.this;
                String string2 = ontransact.$savedInstanceState.getString("EXTRA_BANK_ACCOUNT_NO");
                if (string2 == null) {
                    string2 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                AccountAgreementActivity.onExtraCallbackWithResult(accountAgreementActivity2, string2);
                AccountAgreementActivity accountAgreementActivity3 = AccountAgreementActivity.this;
                TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult serializable = ontransact.$savedInstanceState.getSerializable("EXTRA_REGISTER_METHOD");
                AccountAgreementActivity.onExtraCallback(accountAgreementActivity3, serializable instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult ? serializable : null);
                AccountAgreementActivity accountAgreementActivity4 = AccountAgreementActivity.this;
                Bundle bundle2 = ontransact.$savedInstanceState;
                Object[] objArr2 = new Object[1];
                a(new char[]{24965, 25073, 45600, 59291, 11437, 63224, 28329, 57643}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                UTF8Decoder serializable2 = bundle2.getSerializable(((String) objArr2[0]).intern());
                if (serializable2 instanceof UTF8Decoder) {
                    int i3 = onNavigationEvent + 109;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 != 0) {
                        uTF8Decoder = serializable2;
                        int i4 = 64 / 0;
                    } else {
                        uTF8Decoder = serializable2;
                    }
                } else {
                    uTF8Decoder = null;
                }
                AccountAgreementActivity.onNavigationEvent(accountAgreementActivity4, uTF8Decoder);
                AccountAgreementActivity accountAgreementActivity5 = AccountAgreementActivity.this;
                Serializable serializable3 = ontransact.$savedInstanceState.getSerializable("titleType");
                if (serializable3 instanceof getSignedData) {
                    int i5 = onNavigationEvent + 99;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    getsigneddata2 = (getSignedData) serializable3;
                } else {
                    getsigneddata2 = null;
                }
                if (getsigneddata2 == null) {
                    int i6 = onExtraCallbackWithResult + 43;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    getsigneddata2 = getSignedData.DEFAULT;
                }
                AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1350808242, 1350808242, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{accountAgreementActivity5, getsigneddata2});
                AccountAgreementActivity.onExtraCallbackWithResult(AccountAgreementActivity.this, ontransact.$savedInstanceState.getBoolean("showSmsGuide", true));
            } else {
                z = zBooleanValue;
                ?? r03 = AccountAgreementActivity.this;
                AccountAgreementActivity.IAuthTabCallback((AccountAgreementActivity) r03, r03.getIntent().getLongExtra("EXTRA_ACCOUNT_ID", 0L));
                ?? r04 = AccountAgreementActivity.this;
                String stringExtra = r04.getIntent().getStringExtra("EXTRA_BANK_CODE");
                if (stringExtra == null) {
                    stringExtra = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                AccountAgreementActivity.onExtraCallback((AccountAgreementActivity) r04, stringExtra);
                ?? r05 = AccountAgreementActivity.this;
                String stringExtra2 = r05.getIntent().getStringExtra("EXTRA_BANK_ACCOUNT_NO");
                if (stringExtra2 == null) {
                    stringExtra2 = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                AccountAgreementActivity.onExtraCallbackWithResult((AccountAgreementActivity) r05, stringExtra2);
                ?? r06 = AccountAgreementActivity.this;
                TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult serializableExtra = r06.getIntent().getSerializableExtra("EXTRA_REGISTER_METHOD");
                if (!(!(serializableExtra instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult))) {
                    int i8 = onExtraCallbackWithResult + 73;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    onextracallbackwithresult = serializableExtra;
                } else {
                    onextracallbackwithresult = null;
                }
                AccountAgreementActivity.onExtraCallback((AccountAgreementActivity) r06, onextracallbackwithresult);
                ?? r07 = AccountAgreementActivity.this;
                Intent intent = r07.getIntent();
                Object[] objArr3 = new Object[1];
                a(new char[]{24965, 25073, 45600, 59291, 11437, 63224, 28329, 57643}, KeyEvent.getDeadChar(0, 0) + 1, objArr3);
                UTF8Decoder serializableExtra2 = intent.getSerializableExtra(((String) objArr3[0]).intern());
                AccountAgreementActivity.onNavigationEvent((AccountAgreementActivity) r07, serializableExtra2 instanceof UTF8Decoder ? serializableExtra2 : null);
                BaseActivity baseActivity = AccountAgreementActivity.this;
                Serializable serializableExtra3 = baseActivity.getIntent().getSerializableExtra("titleType");
                if (serializableExtra3 instanceof getSignedData) {
                    int i10 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    getsigneddata = (getSignedData) serializableExtra3;
                } else {
                    getsigneddata = null;
                }
                if (getsigneddata == null) {
                    int i11 = onExtraCallbackWithResult + 53;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    getsigneddata = getSignedData.DEFAULT;
                }
                AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -1350808242, 1350808242, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{baseActivity, getsigneddata});
                ?? r08 = AccountAgreementActivity.this;
                AccountAgreementActivity.onExtraCallbackWithResult((AccountAgreementActivity) r08, r08.getIntent().getBooleanExtra("showSmsGuide", true));
            }
            BaseActivity baseActivity2 = AccountAgreementActivity.this;
            AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -630585238, 630585242, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{baseActivity2, Boolean.valueOf(baseActivity2.getIntent().getBooleanExtra("EXTRA_ERROR_ON_WITHDRAWAL_FAILED", false))});
            ?? r09 = AccountAgreementActivity.this;
            Long lOnExtraCallback = access14000.onExtraCallback(r09.getIntent().getLongExtra("EXTRA_COIN_VERIFICATION_SESSION_ID", 0L));
            if (lOnExtraCallback.longValue() == 0) {
                lOnExtraCallback = null;
            }
            AccountAgreementActivity.onExtraCallbackWithResult((AccountAgreementActivity) r09, lOnExtraCallback);
            ?? r010 = AccountAgreementActivity.this;
            String stringExtra3 = r010.getIntent().getStringExtra("EXTRA_SESSION_TYPE");
            if (stringExtra3 == null) {
                stringExtra3 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (stringExtra3.length() == 0) {
                stringExtra3 = SessionKnownType.REGISTER_BANK_ACCOUNT.name();
            }
            AccountAgreementActivity.onWarmupCompleted((AccountAgreementActivity) r010, stringExtra3);
            ?? r011 = AccountAgreementActivity.this;
            String stringExtra4 = r011.getIntent().getStringExtra("EXTRA_REQUESTER_CODE");
            if (stringExtra4 != null) {
                str = stringExtra4;
            }
            if (str.length() == 0) {
                str = "SV-WBA";
            }
            AccountAgreementActivity.onNavigationEvent((AccountAgreementActivity) r011, str);
            AccountAgreementActivity accountAgreementActivity6 = AccountAgreementActivity.this;
            ontransact.Z$0 = z;
            ontransact.label = 2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (access13800) IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 983613409, iOnExtraCallbackWithResult3, new Object[]{this, obj, access13800Var}, iOnExtraCallbackWithResult2, -983613408);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return IAuthTabCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1389291777, iOnExtraCallbackWithResult3, new Object[]{this, obj}, iOnExtraCallbackWithResult2, 1389291777);
        }
    }

    public static final /* synthetic */ Object IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            accountAgreementActivity.IAuthTabCallback((access13800<? super Boolean>) access13800Var);
            obj.hashCode();
            throw null;
        }
        Object objIAuthTabCallback = accountAgreementActivity.IAuthTabCallback((access13800<? super Boolean>) access13800Var);
        int i3 = onMessageChannelReady + 3;
        onActivityLayout = i3 % 128;
        if (i3 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        access13800<? super Unit> access13800Var = (access13800) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = accountAgreementActivity.onWarmupCompleted(access13800Var);
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ void IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, long j) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 87;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        accountAgreementActivity.asInterface = j;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 105;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getResultMsg IAuthTabCallbackDefault(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 43;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        getResultMsg getresultmsg = (getResultMsg) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 401848352, -401848347, iOnWarmupCompleted3, new Object[]{accountAgreementActivity});
        int i4 = onActivityLayout + 5;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return getresultmsg;
    }

    public static final /* synthetic */ void asBinder(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        accountAgreementActivity.ICustomTabsService_Parcel();
        int i4 = onActivityLayout + 91;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(AccountAgreementActivity accountAgreementActivity, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        accountAgreementActivity.onTransact = str;
        int i5 = i3 + 107;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(AccountAgreementActivity accountAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 11;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        accountAgreementActivity.IAuthTabCallback_Parcel = onextracallbackwithresult;
        int i5 = i3 + 103;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ boolean onExtraCallback(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 11;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        boolean z = accountAgreementActivity.access100;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i2 + 55;
        onActivityLayout = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, TypeUtils2 typeUtils2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 55;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = accountAgreementActivity.IAuthTabCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener, typeUtils2, (access13800<? super Unit>) access13800Var);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onMessageChannelReady + 81;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, TypeUtils2 typeUtils2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 29;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Object objOnNavigationEvent = onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1678965322, 1678965323, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, typeUtils2, access13800Var});
        int i4 = onMessageChannelReady + 83;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ UTF8Decoder onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 105;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        UTF8Decoder uTF8Decoder = accountAgreementActivity.access000;
        int i5 = i3 + 107;
        onMessageChannelReady = i5 % 128;
        int i6 = i5 % 2;
        return uTF8Decoder;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, Long l) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        accountAgreementActivity.asBinder = l;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, String str) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 29;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        accountAgreementActivity.IAuthTabCallbackStub = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, boolean z) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 71;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        accountAgreementActivity.writeTypedObject = z;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(AccountAgreementActivity accountAgreementActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 39;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = accountAgreementActivity.onNavigationEvent((access13800<? super Unit>) access13800Var);
        int i4 = onMessageChannelReady + 83;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        getSignedData getsigneddata = (getSignedData) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 45;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        accountAgreementActivity.readTypedObject = getsigneddata;
        int i5 = i2 + 111;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ void onNavigationEvent(AccountAgreementActivity accountAgreementActivity, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        accountAgreementActivity.IAuthTabCallbackStubProxy = str;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        int i6 = i2 + 15;
        onMessageChannelReady = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(AccountAgreementActivity accountAgreementActivity, UTF8Decoder uTF8Decoder) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 115;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        accountAgreementActivity.access000 = uTF8Decoder;
        int i5 = i2 + 51;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady;
        int i3 = i2 + 33;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        boolean z = accountAgreementActivity.getInterfaceDescriptor;
        int i5 = i2 + 23;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ String onWarmupCompleted(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 21;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        String str = accountAgreementActivity.onTransact;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 99;
        onMessageChannelReady = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void onWarmupCompleted(AccountAgreementActivity accountAgreementActivity, String str) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 37;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        int i4 = i2 % 2;
        accountAgreementActivity.extraCallback = str;
        int i5 = i3 + 43;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        getResultMsg getresultmsg = (getResultMsg) accountAgreementActivity.extraCallbackWithResult.getValue();
        int i4 = onMessageChannelReady + 77;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return getresultmsg;
    }

    public static final class asBinder implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onWarmupCompleted;

        public asBinder(ComponentActivity componentActivity) {
            this.onWarmupCompleted = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onWarmupCompleted.getDefaultViewModelProviderFactory();
        }
    }

    public static final class getInterfaceDescriptor implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity IAuthTabCallback;

        public getInterfaceDescriptor(ComponentActivity componentActivity) {
            this.IAuthTabCallback = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.IAuthTabCallback.getViewModelStore();
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 onExtraCallbackWithResult;
        final /* synthetic */ ComponentActivity onNavigationEvent;

        public IAuthTabCallback_Parcel(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = function0;
            this.onNavigationEvent = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallbackWithResult;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onNavigationEvent.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Object obj;
        BaseActivity baseActivity = (AccountAgreementActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = baseActivity.getIntent();
        double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
        if (i3 != 0) {
            Object[] objArr2 = new Object[1];
            a((dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 35 % (Process.myTid() + 23), (char) (37184 / ExpandableListView.getPackedPositionGroup(0L)), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a((dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 8 - (Process.myTid() >> 22), (char) (ExpandableListView.getPackedPositionGroup(0L) + 37184), objArr3);
            obj = objArr3[0];
        }
        String stringExtra = intent.getStringExtra(((String) obj).intern());
        int i4 = onActivityLayout + 79;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 87;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("serviceReferrer");
        int i4 = onActivityLayout + 107;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    public final SessionTrackerb setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 45;
        int i3 = i2 % 128;
        onMessageChannelReady = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i4 = i3 + 55;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return sessionTrackerb;
        }
        obj.hashCode();
        throw null;
    }

    public final getDummyAd onNavigationEvent() {
        int i = 2 % 2;
        getDummyAd getdummyad = this.standardTermsV2Intent;
        if (getdummyad != null) {
            int i2 = onMessageChannelReady + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            return getdummyad;
        }
        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        int i4 = onMessageChannelReady + 19;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 49;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onActivityResized[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onPostMessage), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46134), (ViewConfiguration.getPressedStateDuration() >> 16) + 31, View.resolveSizeAndState(0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $10 + 81;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $11 + 95;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), View.MeasureSpec.getMode(0) + 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    public final getEnableJsT2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 97;
        onMessageChannelReady = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getEnableJsT2 getenablejst2 = this.kycHelper;
        if (getenablejst2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            return null;
        }
        int i4 = i2 + 15;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 == 0) {
            return getenablejst2;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 81;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(accountAgreementActivity.getScreenParams());
        setDetectableSize.onExtraCallback("skip_yn", zzaz.onExtraCallbackWithResult(!accountAgreementActivity.writeTypedObject));
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 57;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        AccountAgreementActivity accountAgreementActivity = (AccountAgreementActivity) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 115;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(accountAgreementActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = onMessageChannelReady + 9;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final AccountAgreementActivity accountAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed()) {
            ConvertByteArrayToFloatArray.onExtraCallback(1214887L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountAgreementActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(accountAgreementActivity.onTransact);
            Object obj = null;
            if (checknavigationbarbysystempropertiesOnExtraCallback != null) {
                boolValueOf = Boolean.valueOf(checknavigationbarbysystempropertiesOnExtraCallback.ICustomTabsCallback());
            } else {
                int i2 = onActivityLayout + 29;
                onMessageChannelReady = i2 % 128;
                int i3 = i2 % 2;
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                int i4 = onMessageChannelReady + 67;
                onActivityLayout = i4 % 128;
                if (i4 % 2 == 0) {
                    boolValueOf.booleanValue();
                    obj.hashCode();
                    throw null;
                }
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            accountAgreementActivity.IAuthTabCallback(zBooleanValue);
        } else {
            ConvertByteArrayToFloatArray.onExtraCallback(1247157L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountAgreementActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj2);
                }
            }, 14, (Object) null);
            accountAgreementActivity.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_account_agreement);
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new onTransact(bundle, null), 3, null);
        int i2 = onMessageChannelReady + 43;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }

    public static final class onExtraCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int[] onExtraCallbackWithResult = {1168680257, -2127224996, -1466250973, -1761017331, 838944985, 1268905826, 1418807021, -1998564010, 882981135, -111685773, 1263333640, 692266095, 761701027, -1630982888, -551561224, -606913900, -1516515612, 857867049};
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i2 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = onExtraCallbackWithResult;
            long j = 0;
            int i3 = -1469660336;
            int i4 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i5 = 0;
                while (i5 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), 72 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 8848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i5++;
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
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = onExtraCallbackWithResult;
            if (iArr6 != null) {
                int i6 = $10 + 105;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 123;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = Integer.valueOf(iArr6[i7]);
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET)), 73 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 8848 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i7++;
                        i4 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                iArr6 = iArr2;
            }
            int i10 = i4;
            System.arraycopy(iArr6, i10, iArr5, i10, length3);
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i10;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
                cArr[i10] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
                cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
                cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
                cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                for (int i11 = 0; i11 < 16; i11++) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                    try {
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getTouchSlop() >> 8)), View.getDefaultSize(0, 0) + 39, 10300 - ImageFormat.getBitsPerPixel(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i12 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i12;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
                int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
                cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
                cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
                cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 4033), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 79, 7397 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i10 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ void IAuthTabCallback(onExtraCallback onextracallback, Activity activity, IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel, Long l, String str, String str2, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, UTF8Decoder uTF8Decoder, boolean z, Long l2, String str3, String str4, boolean z2, boolean z3, String str5, String str6, int i, Object obj) throws Throwable {
            Long l3;
            String str7;
            boolean z4;
            int i2 = 2 % 2;
            UTF8Decoder uTF8Decoder2 = (i & 64) != 0 ? null : uTF8Decoder;
            boolean z5 = (i & 128) != 0 ? false : z;
            if ((i & 256) != 0) {
                int i3 = onWarmupCompleted + 77;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                l3 = null;
            } else {
                l3 = l2;
            }
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                str7 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str7 = str3;
            }
            String str8 = (i & 1024) != 0 ? null : str4;
            boolean z6 = (i & 2048) != 0 ? true : z2;
            if ((i & 4096) != 0) {
                int i7 = onExtraCallback + 73;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                z4 = false;
            } else {
                z4 = z3;
            }
            onextracallback.IAuthTabCallback(activity, iEngagementSignalsCallback_Parcel, l, str, str2, onextracallbackwithresult, uTF8Decoder2, z5, l3, str7, str8, z6, z4, str5, str6);
        }

        public final void IAuthTabCallback(@NotNull Activity activity, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, @Nullable Long l, @Nullable String str, @Nullable String str2, @NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, @Nullable UTF8Decoder uTF8Decoder, boolean z, @Nullable Long l2, @NotNull String str3, @Nullable String str4, boolean z2, boolean z3, @Nullable String str5, @Nullable String str6) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(str3, "");
            iEngagementSignalsCallback_Parcel.onNavigationEvent(onWarmupCompleted(activity, l, str, str2, onextracallbackwithresult, uTF8Decoder, z, l2, str3, str4, z2, z3, str5, str6));
            int i4 = onWarmupCompleted + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ Intent onNavigationEvent(onExtraCallback onextracallback, Activity activity, Long l, String str, String str2, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, UTF8Decoder uTF8Decoder, boolean z, Long l2, String str3, String str4, boolean z2, boolean z3, String str5, String str6, int i, Object obj) {
            UTF8Decoder uTF8Decoder2;
            String str7;
            int i2 = 2 % 2;
            if ((i & 32) != 0) {
                int i3 = onWarmupCompleted + 21;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                uTF8Decoder2 = null;
            } else {
                uTF8Decoder2 = uTF8Decoder;
            }
            boolean z4 = (i & 64) != 0 ? false : z;
            Long l3 = (i & 128) != 0 ? null : l2;
            String str8 = (i & 256) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                int i5 = onExtraCallback + 53;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 4;
                }
                str7 = null;
            } else {
                str7 = str4;
            }
            return onextracallback.onWarmupCompleted(activity, l, str, str2, onextracallbackwithresult, uTF8Decoder2, z4, l3, str8, str7, (i & 1024) != 0 ? true : z2, (i & 2048) != 0 ? false : z3, str5, str6);
        }

        public final Intent onWarmupCompleted(@NotNull Activity activity, @Nullable Long l, @Nullable String str, @Nullable String str2, @NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, @Nullable UTF8Decoder uTF8Decoder, boolean z, @Nullable Long l2, @NotNull String str3, @Nullable String str4, boolean z2, boolean z3, @Nullable String str5, @Nullable String str6) throws Throwable {
            String stringExtra;
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intent intent = new Intent(activity, (Class<?>) AccountAgreementActivity.class);
            intent.putExtra("EXTRA_ACCOUNT_ID", l);
            intent.putExtra("EXTRA_BANK_CODE", str);
            intent.putExtra("EXTRA_BANK_ACCOUNT_NO", str2);
            intent.putExtra("EXTRA_REGISTER_METHOD", (Serializable) onextracallbackwithresult);
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                int i2 = onExtraCallback + 99;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = new Object[1];
                a(new int[]{394375888, -1785768858, -233954081, -478394771, -153881841, 1490508821}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11, objArr);
                stringExtra = intent2.getStringExtra(((String) objArr[0]).intern());
                int i4 = onWarmupCompleted + 75;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                stringExtra = null;
            }
            Object[] objArr2 = new Object[1];
            a(new int[]{394375888, -1785768858, -233954081, -478394771, -153881841, 1490508821}, 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            intent.putExtra(((String) objArr2[0]).intern(), stringExtra);
            if (uTF8Decoder != null) {
                int i6 = onExtraCallback + 67;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    a(new int[]{-1649027618, -1147169201}, Color.blue(1) + 5, objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{-1649027618, -1147169201}, Color.blue(0) + 4, objArr4);
                    obj = objArr4[0];
                }
                intent.putExtra(((String) obj).intern(), (Serializable) uTF8Decoder);
            }
            intent.putExtra("EXTRA_ERROR_ON_WITHDRAWAL_FAILED", z);
            intent.putExtra("EXTRA_COIN_VERIFICATION_SESSION_ID", l2);
            intent.putExtra("agreementTitle", str3);
            intent.putExtra("titleType", getSignedData.Companion.IAuthTabCallback(str4));
            intent.putExtra("showSmsGuide", z2);
            Object[] objArr5 = new Object[1];
            a(new int[]{-2012157151, -1573531159, 1690861802, -145987961}, (ViewConfiguration.getTapTimeout() >> 16) + 8, objArr5);
            intent.putExtra(((String) objArr5[0]).intern(), str5);
            intent.putExtra("serviceReferrer", str6);
            intent.putExtra("skipSmsGuideCompleteMessage", z3);
            int i7 = onWarmupCompleted + 17;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return intent;
        }

        public static /* synthetic */ Intent onWarmupCompleted(onExtraCallback onextracallback, Activity activity, Long l, String str, String str2, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, UTF8Decoder uTF8Decoder, boolean z, Long l2, String str3, String str4, boolean z2, String str5, String str6, String str7, String str8, int i, Object obj) {
            boolean z3;
            Long l3;
            String str9;
            boolean z4;
            String strName;
            String str10;
            int i2 = 2 % 2;
            UTF8Decoder uTF8Decoder2 = (i & 32) != 0 ? null : uTF8Decoder;
            if ((i & 64) != 0) {
                int i3 = onExtraCallback + 91;
                onWarmupCompleted = i3 % 128;
                z3 = i3 % 2 == 0;
            } else {
                z3 = z;
            }
            if ((i & 128) != 0) {
                int i4 = onExtraCallback + 21;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                l3 = null;
            } else {
                l3 = l2;
            }
            String str11 = (i & 256) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str3;
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                int i6 = onWarmupCompleted + 39;
                int i7 = i6 % 128;
                onExtraCallback = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                str9 = null;
            } else {
                str9 = str4;
            }
            if ((i & 1024) != 0) {
                int i11 = onWarmupCompleted + 19;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                z4 = true;
            } else {
                z4 = z2;
            }
            if ((i & 2048) != 0) {
                int i13 = onExtraCallback + 21;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                strName = SessionKnownType.REGISTER_BANK_ACCOUNT.name();
            } else {
                strName = str5;
            }
            if ((i & 4096) != 0) {
                int i15 = onExtraCallback + 57;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                str10 = "SV-WBA";
            } else {
                str10 = str6;
            }
            return onextracallback.onExtraCallbackWithResult(activity, l, str, str2, onextracallbackwithresult, uTF8Decoder2, z3, l3, str11, str9, z4, strName, str10, str7, str8);
        }

        public final Intent onExtraCallbackWithResult(@NotNull Activity activity, @Nullable Long l, @Nullable String str, @Nullable String str2, @NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, @Nullable UTF8Decoder uTF8Decoder, boolean z, @Nullable Long l2, @NotNull String str3, @Nullable String str4, boolean z2, @NotNull String str5, @NotNull String str6, @Nullable String str7, @Nullable String str8) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intent intentOnNavigationEvent = onNavigationEvent(this, activity, l, str, str2, onextracallbackwithresult, uTF8Decoder, z, l2, str3, str4, z2, false, str7, str8, 2048, null);
            intentOnNavigationEvent.putExtra("EXTRA_SESSION_TYPE", str5);
            intentOnNavigationEvent.putExtra("EXTRA_REQUESTER_CODE", str6);
            int i4 = onExtraCallback + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 12 / 0;
            }
            return intentOnNavigationEvent;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x056d  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String updateVisuals() {
        String str;
        Bundle extras;
        ?? string;
        Object next;
        int i = 2 % 2;
        Intent intent = getIntent();
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            int i2 = onActivityLayout + 37;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            if (extras.containsKey("agreementTitle")) {
                if (zzbq.onNavigationEvent(intent)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString("agreementTitle")) != 0) {
                        int i4 = onActivityLayout + 83;
                        onMessageChannelReady = i4 % 128;
                        int i5 = i4 % 2;
                        if (Intrinsics.areEqual(String.class, Integer.class)) {
                            string = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
                        } else if (Intrinsics.areEqual(String.class, Long.class)) {
                            string = StringsKt__StringNumberConversionsKt.toLongOrNull(string);
                        } else if (Intrinsics.areEqual(String.class, Float.class)) {
                            string = StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(string);
                        } else if (Intrinsics.areEqual(String.class, Double.class)) {
                            string = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(string);
                        } else if (Intrinsics.areEqual(String.class, Short.class)) {
                            string = StringsKt__StringNumberConversionsKt.toShortOrNull(string);
                        } else if (Intrinsics.areEqual(String.class, Byte.class)) {
                            string = StringsKt__StringNumberConversionsKt.toByteOrNull(string);
                        } else {
                            if (!(!Intrinsics.areEqual(String.class, Boolean.class))) {
                                int i6 = onActivityLayout + 109;
                                onMessageChannelReady = i6 % 128;
                                if (i6 % 2 != 0) {
                                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                                    int i7 = 94 / 0;
                                } else {
                                    string = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } else if (Intrinsics.areEqual(String.class, Character.class)) {
                                string = Character.valueOf(string.charAt(0));
                            } else if (!Intrinsics.areEqual(String.class, String.class)) {
                                if (Intrinsics.areEqual(String.class, Integer[].class)) {
                                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : listSplit$default) {
                                        if (((String) obj).length() > 0) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(Integer.valueOf(Integer.parseInt(StringsKt__StringsKt.trim((CharSequence) it.next()).toString())));
                                    }
                                    string = arrayList2.toArray(new Integer[0]);
                                } else if (Intrinsics.areEqual(String.class, Long[].class)) {
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : listSplit$default2) {
                                        if (((String) obj2).length() > 0) {
                                            int i8 = onMessageChannelReady + 53;
                                            onActivityLayout = i8 % 128;
                                            int i9 = i8 % 2;
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(Long.valueOf(Long.parseLong(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString())));
                                    }
                                    string = arrayList4.toArray(new Long[0]);
                                } else if (Intrinsics.areEqual(String.class, Float[].class)) {
                                    List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj3 : listSplit$default3) {
                                        if (((String) obj3).length() > 0) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                                    Iterator it3 = arrayList5.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Float.valueOf(Float.parseFloat(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString())));
                                    }
                                    string = arrayList6.toArray(new Float[0]);
                                } else if (Intrinsics.areEqual(String.class, Double[].class)) {
                                    List listSplit$default4 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj4 : listSplit$default4) {
                                        if (((String) obj4).length() > 0) {
                                            arrayList7.add(obj4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                    Iterator it4 = arrayList7.iterator();
                                    while (it4.hasNext()) {
                                        arrayList8.add(Double.valueOf(Double.parseDouble(StringsKt__StringsKt.trim((CharSequence) it4.next()).toString())));
                                    }
                                    string = arrayList8.toArray(new Double[0]);
                                } else if (Intrinsics.areEqual(String.class, Short[].class)) {
                                    List listSplit$default5 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList9 = new ArrayList();
                                    for (Object obj5 : listSplit$default5) {
                                        int i10 = onMessageChannelReady + 61;
                                        onActivityLayout = i10 % 128;
                                        int i11 = i10 % 2;
                                        if (((String) obj5).length() > 0) {
                                            arrayList9.add(obj5);
                                        }
                                    }
                                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10));
                                    Iterator it5 = arrayList9.iterator();
                                    while (it5.hasNext()) {
                                        int i12 = onActivityLayout + 23;
                                        onMessageChannelReady = i12 % 128;
                                        int i13 = i12 % 2;
                                        arrayList10.add(Short.valueOf(Short.parseShort(StringsKt__StringsKt.trim((CharSequence) it5.next()).toString())));
                                    }
                                    string = arrayList10.toArray(new Short[0]);
                                } else if (Intrinsics.areEqual(String.class, Byte[].class)) {
                                    List listSplit$default6 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj6 : listSplit$default6) {
                                        if (((String) obj6).length() > 0) {
                                            arrayList11.add(obj6);
                                            int i14 = onMessageChannelReady + 79;
                                            onActivityLayout = i14 % 128;
                                            int i15 = i14 % 2;
                                        }
                                    }
                                    ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10));
                                    Iterator it6 = arrayList11.iterator();
                                    while (it6.hasNext()) {
                                        arrayList12.add(Byte.valueOf(Byte.parseByte(StringsKt__StringsKt.trim((CharSequence) it6.next()).toString())));
                                    }
                                    string = arrayList12.toArray(new Byte[0]);
                                } else if (Intrinsics.areEqual(String.class, Boolean[].class)) {
                                    List listSplit$default7 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList13 = new ArrayList();
                                    for (Object obj7 : listSplit$default7) {
                                        if (((String) obj7).length() > 0) {
                                            int i16 = onMessageChannelReady + 123;
                                            onActivityLayout = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                arrayList13.add(obj7);
                                                int i17 = 80 / 0;
                                            } else {
                                                arrayList13.add(obj7);
                                            }
                                        }
                                    }
                                    ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList13, 10));
                                    Iterator it7 = arrayList13.iterator();
                                    while (it7.hasNext()) {
                                        arrayList14.add(Boolean.valueOf(Boolean.parseBoolean(StringsKt__StringsKt.trim((CharSequence) it7.next()).toString())));
                                    }
                                    string = arrayList14.toArray(new Boolean[0]);
                                } else if (Intrinsics.areEqual(String.class, Character[].class)) {
                                    List listSplit$default8 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj8 : listSplit$default8) {
                                        int i18 = onMessageChannelReady + 103;
                                        onActivityLayout = i18 % 128;
                                        int i19 = i18 % 2;
                                        if (((String) obj8).length() > 0) {
                                            arrayList15.add(obj8);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList15, 10));
                                    Iterator it8 = arrayList15.iterator();
                                    while (it8.hasNext()) {
                                        arrayList16.add(Character.valueOf(StringsKt__StringsKt.trim((CharSequence) it8.next()).toString().charAt(0)));
                                    }
                                    string = arrayList16.toArray(new Character[0]);
                                } else if (Intrinsics.areEqual(String.class, String[].class)) {
                                    List listSplit$default9 = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
                                    ArrayList arrayList17 = new ArrayList();
                                    for (Object obj9 : listSplit$default9) {
                                        if (((String) obj9).length() > 0) {
                                            arrayList17.add(obj9);
                                        }
                                    }
                                    string = arrayList17.toArray(new String[0]);
                                } else {
                                    Object[] enumConstants = String.class.getEnumConstants();
                                    if (enumConstants != null) {
                                        ArrayList arrayList18 = new ArrayList(enumConstants.length);
                                        for (Object obj10 : enumConstants) {
                                            Intrinsics.checkNotNull(obj10, "");
                                            arrayList18.add((Enum) obj10);
                                        }
                                        Iterator it9 = arrayList18.iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it9.next();
                                            if (Intrinsics.areEqual(((Enum) next).name(), (Object) string)) {
                                                break;
                                            }
                                        }
                                        string = (Enum) next;
                                    } else {
                                        string = 0;
                                    }
                                    if (string == 0) {
                                        if (zzaj.onNavigationEvent().onActivityLayout()) {
                                            throw new IllegalArgumentException(String.class.getSimpleName() + " is not supported");
                                        }
                                        string = 0;
                                    }
                                }
                            }
                        }
                        boolean z = string instanceof String;
                        String str3 = string;
                        if (!z) {
                            str3 = null;
                        }
                        str = str3;
                    }
                } else {
                    Bundle extras3 = intent.getExtras();
                    Object obj11 = extras3 != null ? extras3.get("agreementTitle") : null;
                    if (!(obj11 instanceof String)) {
                        int i20 = onActivityLayout + 97;
                        onMessageChannelReady = i20 % 128;
                        if (i20 % 2 != 0) {
                            throw null;
                        }
                        obj11 = null;
                    }
                    str = (String) obj11;
                }
            }
        }
        if (str != null) {
            str2 = str;
        }
        if (StringsKt__StringsKt.isBlank(str2)) {
            return null;
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (onWarmupCompleted(r1) == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        access000 access000Var;
        int i = 2 % 2;
        if (!(access13800Var instanceof access000)) {
            access000Var = new access000(access13800Var);
            int i2 = onActivityLayout + 37;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onMessageChannelReady + 19;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            access000Var = (access000) access13800Var;
            int i6 = access000Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = onActivityLayout + 85;
                onMessageChannelReady = i7 % 128;
                int i8 = i7 % 2;
                access000Var.label = i6 - 2147483648;
            }
        }
        Object objIAuthTabCallback = access000Var.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i9 = access000Var.label;
        Object obj = null;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            access000Var.label = 1;
            objIAuthTabCallback = IAuthTabCallback(access000Var);
            if (objIAuthTabCallback != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = onMessageChannelReady + 43;
            onActivityLayout = i10 % 128;
            if (i10 % 2 != 0) {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                bo_();
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            obj.hashCode();
            throw null;
        }
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        int i11 = onMessageChannelReady + 113;
        onActivityLayout = i11 % 128;
        int i12 = i11 % 2;
        if (((Boolean) objIAuthTabCallback).booleanValue()) {
            access000Var.label = 2;
        }
        bo_();
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 81;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            accountAgreementActivity.finish();
            return Unit.INSTANCE;
        }
        accountAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(access13800<? super Boolean> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onActivityLayout + 63;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                onextracallbackwithresult.label = i4 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        Object objOnWarmupCompleted = onextracallbackwithresult2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = onextracallbackwithresult2.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                String strOnPostMessage = PlayerErrorCode.onPostMessage();
                Result.Companion companion = Result.Companion;
                String string = getString(R.string.app_account_agreement_kyc_title, strOnPostMessage);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = getString(R.string.app_account_agreement___900c766ec2, strOnPostMessage);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getExtUrl getexturl = new getExtUrl(1L, 0L, new getExtModel(string, string2, _UrlKt.FRAGMENT_ENCODE_SET, TemplateConfigModel.Companion.onNavigationEvent()), setUcJsT2.PAGE, false, false, (AddressModuleType) null, (CddProcessType) null, 226, (DefaultConstructorMarker) null);
                writeRaw writerawOnExtraCallbackWithResult = getEnableJsT2.onExtraCallbackWithResult(IAuthTabCallback(), this, getexturl, false, false, 12, (Object) null);
                onextracallbackwithresult2.L$0 = access15400.onNavigationEvent(strOnPostMessage);
                onextracallbackwithresult2.L$1 = access15400.onNavigationEvent(onextracallbackwithresult2);
                onextracallbackwithresult2.L$2 = access15400.onNavigationEvent(getexturl);
                onextracallbackwithresult2.I$0 = 0;
                onextracallbackwithresult2.I$1 = 0;
                onextracallbackwithresult2.label = 1;
                objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawOnExtraCallbackWithResult, onextracallbackwithresult2);
                if (objOnWarmupCompleted == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnWarmupCompleted);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        if (!Result.onNavigationEvent(objM31constructorimpl)) {
            Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl == null) {
                return access14000.onNavigationEvent(false);
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "AccountAgreementActivity", "error on checkKycTarget", thM32exceptionOrNullimpl, (Map) null, 8, (Object) null);
            getParamImp.onWarmupCompleted(thM32exceptionOrNullimpl, this, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountAgreementActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
                }
            }, 14, (Object) null);
            return access14000.onNavigationEvent(false);
        }
        int i8 = onMessageChannelReady + 15;
        onActivityLayout = i8 % 128;
        int i9 = i8 % 2;
        setExtraJsT2MapStr setextrajst2mapstr = (setExtraJsT2MapStr) objM31constructorimpl;
        switch (setextrajst2mapstr == null ? -1 : onWarmupCompleted.onExtraCallback[setextrajst2mapstr.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                finish();
                return access14000.onNavigationEvent(false);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                return access14000.onNavigationEvent(true);
        }
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ResolveTermIdsResponse>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ AccountAgreementActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(access13800 access13800Var, AccountAgreementActivity accountAgreementActivity) {
            super(2, access13800Var);
            this.this$0 = accountAgreementActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(access13800Var, this.this$0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super ResolveTermIdsResponse> access13800Var) {
            return ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, 24733 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback2).get(null);
                try {
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 29427), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, (ViewConfiguration.getScrollBarSize() >> 8) + 24734, 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback3).invoke(obj2, null);
                    ResolveTermIdsRequest resolveTermIdsRequest = new ResolveTermIdsRequest(CollectionsKt__CollectionsJVMKt.listOf(access14000.onNavigationEvent(Integer.parseInt(AccountAgreementActivity.onWarmupCompleted(this.this$0)))), false);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.onExtraCallbackWithResult(resolveTermIdsRequest, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
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
                        return (ResolveTermIdsResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.ResolveTermIdsResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(ResolveTermIdsResponse.class, Object.class) || Intrinsics.areEqual(ResolveTermIdsResponse.class, Unit.class)) {
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

    private static final Unit onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 115;
        onMessageChannelReady = i2 % 128;
        if (i2 % 2 == 0) {
            accountAgreementActivity.finish();
            Unit unit = Unit.INSTANCE;
            int i3 = onMessageChannelReady + 25;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        accountAgreementActivity.finish();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r0 != r2) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(access13800<? super Unit> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Object objM31constructorimpl;
        final AccountAgreementActivity accountAgreementActivity;
        Object obj;
        Throwable thM32exceptionOrNullimpl;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objOnExtraCallback = iAuthTabCallback2.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i3 = iAuthTabCallback2.label;
        try {
        } catch (WebResourceResponseModel e) {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Result.Companion companion3 = Result.Companion;
            GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
            onNavigationEvent onnavigationevent = new onNavigationEvent(null, this);
            iAuthTabCallback2.L$0 = access15400.onNavigationEvent(iAuthTabCallback2);
            iAuthTabCallback2.I$0 = 0;
            iAuthTabCallback2.I$1 = 0;
            iAuthTabCallback2.I$2 = 0;
            iAuthTabCallback2.label = 1;
            objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, iAuthTabCallback2);
        } else {
            if (i3 != 1) {
                int i4 = onMessageChannelReady + Imgproc.COLOR_YUV2RGBA_YVYU;
                onActivityLayout = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 2 : i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iAuthTabCallback2.L$0;
                ResultKt.onNavigationEvent(objOnExtraCallback);
                accountAgreementActivity = this;
                accountAgreementActivity.ICustomTabsCallback.onNavigationEvent((Intent) objOnExtraCallback);
                objM31constructorimpl = obj;
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                    getParamImp.onWarmupCompleted(thM32exceptionOrNullimpl, this, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AccountAgreementActivity.onNavigationEvent(this.f$0, (DialogInterface) obj2);
                        }
                    }, 14, (Object) null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        objM31constructorimpl = Result.m31constructorimpl(objOnExtraCallback);
        if (!Result.onNavigationEvent(objM31constructorimpl)) {
            accountAgreementActivity = this;
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        ResolveTermIdsResponse resolveTermIdsResponse = (ResolveTermIdsResponse) objM31constructorimpl;
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        listCreateListBuilder.addAll(resolveTermIdsResponse.onExtraCallbackWithResult());
        Iterator it = ((List) ResolveTermIdsResponse.IAuthTabCallback(new Object[]{resolveTermIdsResponse}, 659282793, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -659282793)).iterator();
        while (it.hasNext()) {
            int i5 = onMessageChannelReady + Imgproc.COLOR_YUV2RGB_YVYU;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            listCreateListBuilder.addAll(((BankTermIds) it.next()).onExtraCallback());
        }
        Iterator it2 = ((List) ResolveTermIdsResponse.IAuthTabCallback(new Object[]{resolveTermIdsResponse}, 1983471334, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1983471333)).iterator();
        while (it2.hasNext()) {
            listCreateListBuilder.addAll(((BankTermIds) it2.next()).onExtraCallback());
        }
        List listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        getDummyAd getdummyadOnNavigationEvent = onNavigationEvent();
        String str = (String) onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 72269503, -72269497, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), new Object[]{this});
        String str2 = str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        String strICustomTabsServiceStub = ICustomTabsServiceStub();
        String str3 = strICustomTabsServiceStub != null ? strICustomTabsServiceStub : _UrlKt.FRAGMENT_ENCODE_SET;
        List listDistinct = CollectionsKt___CollectionsKt.distinct(listBuild);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator it3 = listDistinct.iterator();
        while (it3.hasNext()) {
            arrayList.add(new StandardTermsV2DynamicTermsParam((String) it3.next(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        }
        StandardTermsV2DynamicTermsParam[] standardTermsV2DynamicTermsParamArr = (StandardTermsV2DynamicTermsParam[]) arrayList.toArray(new StandardTermsV2DynamicTermsParam[0]);
        iAuthTabCallback2.L$0 = objM31constructorimpl;
        iAuthTabCallback2.L$1 = access15400.onNavigationEvent(resolveTermIdsResponse);
        iAuthTabCallback2.L$2 = access15400.onNavigationEvent(listBuild);
        iAuthTabCallback2.I$0 = 0;
        iAuthTabCallback2.label = 2;
        Object objOnExtraCallback3 = getDummyAd.onExtraCallback(getdummyadOnNavigationEvent, this, "STD_15_ACCOUNT_AGREEMENT", str2, str3, 1L, (Map) null, (setHasShown) null, false, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (StandardTermsV2CustomVariable[]) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (getOriginalFullResponse) null, (r8lambdaDml5dirzRCENiZicd2_b5Xg5o) null, false, false, false, (StandardTermsV2BizReceiver[]) null, standardTermsV2DynamicTermsParamArr, false, (StandardTermsV2YouthRegisterParam) null, (String) null, iAuthTabCallback2, 7864288, (Object) null);
        objOnExtraCallback2 = objOnExtraCallback2;
        if (objOnExtraCallback3 != objOnExtraCallback2) {
            obj = objM31constructorimpl;
            objOnExtraCallback = objOnExtraCallback3;
            accountAgreementActivity = this;
            accountAgreementActivity.ICustomTabsCallback.onNavigationEvent((Intent) objOnExtraCallback);
            objM31constructorimpl = obj;
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
        return objOnExtraCallback2;
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 77;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        this.access100 = z;
        writeTypedList();
        int i4 = onMessageChannelReady + 73;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String str;
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        String str2 = (String) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 72269503, -72269497, iOnWarmupCompleted3, new Object[]{this});
        if (str2 != null && str2.length() != 0) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getWindowTouchSlop() >> 8, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37183), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted5 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted6 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            linkedHashMap.put(strIntern, (String) onNavigationEvent(iOnWarmupCompleted4, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted5, 72269503, -72269497, iOnWarmupCompleted6, new Object[]{this}));
        }
        String strICustomTabsServiceStub = ICustomTabsServiceStub();
        if (strICustomTabsServiceStub != null && strICustomTabsServiceStub.length() != 0) {
            int i2 = onMessageChannelReady + 75;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.put("service_referrer", ICustomTabsServiceStub());
        }
        linkedHashMap.put("execution_id", getIssuerAndSerialNumber.onNavigationEvent.onWarmupCompleted(UST_CMP_IssueCertificate_SendConf.BANK));
        Object[] objArr2 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 19, (KeyEvent.getMaxKeyCode() >> 16) + 5, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), updateVisuals());
        linkedHashMap.put("bank_code", this.onTransact);
        if (this.asBinder != null) {
            int i4 = onActivityLayout + 59;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str = "1won_auth";
        } else {
            int i5 = onMessageChannelReady + 33;
            onActivityLayout = i5 % 128;
            int i6 = i5 % 2;
            str = "connect_accnt";
        }
        linkedHashMap.put("funnel_type", str);
        return linkedHashMap;
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        access100(access13800<? super access100> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((access100) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AccountAgreementActivity.this.new access100(access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
        
            if (r0 != r2) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        
            if (viva.republica.toss.account.agreement.AccountAgreementActivity.onExtraCallbackWithResult(r4, r6, r21) == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        
            return r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Throwable thM32exceptionOrNullimpl;
            Object objOnWarmupCompleted;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
            }
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                AccountAgreementActivity.IAuthTabCallbackDefault(AccountAgreementActivity.this).onExtraCallback(true);
                AccountAgreementActivity accountAgreementActivity = AccountAgreementActivity.this;
                Result.Companion companion3 = Result.Companion;
                shortValue.onWarmupCompleted onwarmupcompleted = shortValue.Companion;
                UTF8Decoder uTF8DecoderOnExtraCallbackWithResult = AccountAgreementActivity.onExtraCallbackWithResult(accountAgreementActivity);
                if (uTF8DecoderOnExtraCallbackWithResult == null) {
                    uTF8DecoderOnExtraCallbackWithResult = UTF8Decoder.SIGN_AGREEMENT;
                }
                writeRaw writerawIAuthTabCallback = shortValue.IAuthTabCallback(onwarmupcompleted, accountAgreementActivity, uTF8DecoderOnExtraCallbackWithResult, 1L, (getHostnameVerifierokhttp) null, false, false, (shortValue.onNavigationEvent) null, false, false, (String) null, onExtraCallbackWithResult.onExtraCallback, 1008, (Object) null);
                this.L$0 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawIAuthTabCallback, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objM31constructorimpl = this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    AccountAgreementActivity.IAuthTabCallbackDefault(AccountAgreementActivity.this).onExtraCallback(false);
                    AccountAgreementActivity accountAgreementActivity2 = AccountAgreementActivity.this;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                        if (!(thM32exceptionOrNullimpl instanceof isProxy)) {
                            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountAgreementActivity::startAgreement", thM32exceptionOrNullimpl);
                        }
                        AccountAgreementActivity.asBinder(accountAgreementActivity2);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                objOnWarmupCompleted = obj;
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnWarmupCompleted);
            AccountAgreementActivity accountAgreementActivity3 = AccountAgreementActivity.this;
            if (Result.onNavigationEvent(objM31constructorimpl)) {
                TypeUtils2 typeUtils2 = (TypeUtils2) objM31constructorimpl;
                Intrinsics.checkNotNull(typeUtils2);
                this.L$0 = objM31constructorimpl;
                this.L$1 = access15400.onNavigationEvent(typeUtils2);
                this.I$0 = 0;
                this.label = 2;
            }
            AccountAgreementActivity.IAuthTabCallbackDefault(AccountAgreementActivity.this).onExtraCallback(false);
            AccountAgreementActivity accountAgreementActivity22 = AccountAgreementActivity.this;
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }

        static final class onExtraCallbackWithResult implements Function1<TypeUtils7, Unit> {
            public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

            onExtraCallbackWithResult() {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(TypeUtils7 typeUtils7) {
                onWarmupCompleted(typeUtils7);
                return Unit.INSTANCE;
            }

            public final void onWarmupCompleted(TypeUtils7 typeUtils7) {
                Intrinsics.checkNotNullParameter(typeUtils7, "");
                typeUtils7.IAuthTabCallback(true);
            }
        }
    }

    private final void writeTypedList() {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new access100(null), 3, null);
        int i2 = onMessageChannelReady + 81;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AccountAgreementActivity.this.new IAuthTabCallbackStub(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackStub) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                AccountAgreementActivity accountAgreementActivity = AccountAgreementActivity.this;
                this.label = 1;
                if (AccountAgreementActivity.onNavigationEvent(accountAgreementActivity, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
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

    private final void ICustomTabsService_Parcel() {
        int i = 2 % 2;
        onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), null, null, new IAuthTabCallbackStub(null), 3, null);
        int i2 = onActivityLayout + Imgproc.COLOR_YUV2RGBA_YVYU;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asInterface(AccountAgreementActivity accountAgreementActivity) {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 53;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        accountAgreementActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + Imgproc.COLOR_YUV2RGB_YVYU;
        onMessageChannelReady = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:4|(2:6|(1:8)(1:9))(0)|10|77|(1:(1:(6:14|(1:16)(1:17)|70|(1:72)|73|74)(2:18|19))(4:20|80|21|22))(12:29|(1:31)|32|(1:34)(1:35)|36|84|37|38|82|39|(1:41)|68)|79|42|64|(3:66|(1:69)|68)|70|(0)|73|74) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0151, code lost:
    
        r4 = r0;
        r0 = r3;
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015a, code lost:
    
        r4 = r0;
        r0 = r3;
        r3 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.account.agreement.AccountAgreementActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NumberFormatException {
        IAuthTabCallbackDefault iAuthTabCallbackDefault;
        setDescriptionTextColor setdescriptiontextcolor;
        ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult;
        Object obj;
        Exception exc;
        WebResourceResponseModel webResourceResponseModel;
        TypeUtils2 typeUtils2;
        ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult2;
        setDescriptionTextColor setdescriptiontextcolor2;
        Object objM31constructorimpl;
        Throwable thM32exceptionOrNullimpl;
        final ?? r2 = (AccountAgreementActivity) objArr[0];
        TypeUtils2 typeUtils22 = (TypeUtils2) objArr[1];
        access13800 access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 125;
        onActivityLayout = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            boolean z = access13800Var instanceof IAuthTabCallbackDefault;
            obj2.hashCode();
            throw null;
        }
        if (access13800Var instanceof IAuthTabCallbackDefault) {
            iAuthTabCallbackDefault = (IAuthTabCallbackDefault) access13800Var;
            int i3 = iAuthTabCallbackDefault.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = onMessageChannelReady + 79;
                onActivityLayout = i4 % 128;
                int i5 = i4 % 2;
                iAuthTabCallbackDefault.label = i3 - 2147483648;
            } else {
                iAuthTabCallbackDefault = new IAuthTabCallbackDefault(access13800Var);
            }
        }
        IAuthTabCallbackDefault iAuthTabCallbackDefault2 = iAuthTabCallbackDefault;
        Object objOnWarmupCompleted = iAuthTabCallbackDefault2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = iAuthTabCallbackDefault2.label;
        try {
            if (i6 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                long j = ((AccountAgreementActivity) r2).asInterface;
                int i7 = Integer.parseInt(((AccountAgreementActivity) r2).onTransact);
                String str = ((AccountAgreementActivity) r2).IAuthTabCallbackStub;
                TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult3 = ((AccountAgreementActivity) r2).IAuthTabCallback_Parcel;
                if (onextracallbackwithresult3 == null) {
                    onextracallbackwithresult3 = TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult.UNDEFINED;
                }
                setdescriptiontextcolor = new setDescriptionTextColor(j, i7, str, (String) null, onextracallbackwithresult3.name());
                Long l = ((AccountAgreementActivity) r2).asBinder;
                onextracallbackwithresult = l != null ? new ToolkitManager_Update.onExtraCallbackWithResult(l.longValue(), ((AccountAgreementActivity) r2).extraCallback, ((AccountAgreementActivity) r2).IAuthTabCallbackStubProxy) : null;
                BaseActivity.IAuthTabCallback((BaseActivity) r2, (String) null, false, 3, (Object) null);
                try {
                    Result.Companion companion = Result.Companion;
                    obj = objOnExtraCallback;
                    try {
                        writeRaw writerawIAuthTabCallback = new setSignedData().IAuthTabCallback(typeUtils22, onExtraCallback((AccountAgreementActivity) r2), (4 & 4) != 0 ? false : false, setdescriptiontextcolor, (4 & 16) != 0 ? false : onNavigationEvent((AccountAgreementActivity) r2), (4 & 32) != 0 ? null : onextracallbackwithresult).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                        iAuthTabCallbackDefault2.L$0 = typeUtils22;
                        iAuthTabCallbackDefault2.L$1 = access15400.onNavigationEvent(setdescriptiontextcolor);
                        iAuthTabCallbackDefault2.L$2 = access15400.onNavigationEvent(onextracallbackwithresult);
                        iAuthTabCallbackDefault2.L$3 = access15400.onNavigationEvent(iAuthTabCallbackDefault2);
                        iAuthTabCallbackDefault2.I$0 = 0;
                        iAuthTabCallbackDefault2.I$1 = 0;
                        iAuthTabCallbackDefault2.label = 1;
                        objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(writerawIAuthTabCallback, iAuthTabCallbackDefault2);
                        if (objOnWarmupCompleted != obj) {
                            typeUtils2 = typeUtils22;
                            onextracallbackwithresult2 = onextracallbackwithresult;
                            setdescriptiontextcolor2 = setdescriptiontextcolor;
                        }
                    } catch (WebResourceResponseModel e) {
                        e = e;
                        webResourceResponseModel = e;
                        Result.Companion companion2 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(webResourceResponseModel));
                        typeUtils2 = typeUtils22;
                        onextracallbackwithresult2 = onextracallbackwithresult;
                        setdescriptiontextcolor2 = setdescriptiontextcolor;
                        r2.bo_();
                        if (Result.onNavigationEvent(objM31constructorimpl)) {
                        }
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        Result.Companion companion3 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(exc));
                        typeUtils2 = typeUtils22;
                        onextracallbackwithresult2 = onextracallbackwithresult;
                        setdescriptiontextcolor2 = setdescriptiontextcolor;
                        r2.bo_();
                        if (Result.onNavigationEvent(objM31constructorimpl)) {
                        }
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (WebResourceResponseModel e3) {
                    e = e3;
                    obj = objOnExtraCallback;
                } catch (Exception e4) {
                    e = e4;
                    obj = objOnExtraCallback;
                }
                return obj;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = onActivityLayout + 51;
                onMessageChannelReady = i8 % 128;
                if (i8 % 2 != 0) {
                    objM31constructorimpl = iAuthTabCallbackDefault2.L$3;
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                    int i9 = 53 / 0;
                } else {
                    objM31constructorimpl = iAuthTabCallbackDefault2.L$3;
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                }
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                    CxxInspectorPackagerConnectionIWebSocket.onNavigationEvent.onNavigationEvent((Context) r2, thM32exceptionOrNullimpl, new Function0() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountAgreementActivity.IAuthTabCallback(this.f$0);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            onextracallbackwithresult2 = (ToolkitManager_Update.onExtraCallbackWithResult) iAuthTabCallbackDefault2.L$2;
            setdescriptiontextcolor2 = (setDescriptionTextColor) iAuthTabCallbackDefault2.L$1;
            typeUtils2 = (TypeUtils2) iAuthTabCallbackDefault2.L$0;
            try {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                obj = objOnExtraCallback;
            } catch (WebResourceResponseModel e5) {
                webResourceResponseModel = e5;
                ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult2;
                typeUtils22 = typeUtils2;
                obj = objOnExtraCallback;
                onextracallbackwithresult = onextracallbackwithresult4;
                setdescriptiontextcolor = setdescriptiontextcolor2;
                Result.Companion companion22 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(webResourceResponseModel));
                typeUtils2 = typeUtils22;
                onextracallbackwithresult2 = onextracallbackwithresult;
                setdescriptiontextcolor2 = setdescriptiontextcolor;
                r2.bo_();
                if (Result.onNavigationEvent(objM31constructorimpl)) {
                }
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            } catch (Exception e6) {
                exc = e6;
                ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult5 = onextracallbackwithresult2;
                typeUtils22 = typeUtils2;
                obj = objOnExtraCallback;
                onextracallbackwithresult = onextracallbackwithresult5;
                setdescriptiontextcolor = setdescriptiontextcolor2;
                Result.Companion companion32 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(exc));
                typeUtils2 = typeUtils22;
                onextracallbackwithresult2 = onextracallbackwithresult;
                setdescriptiontextcolor2 = setdescriptiontextcolor;
                r2.bo_();
                if (Result.onNavigationEvent(objM31constructorimpl)) {
                }
                thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                if (thM32exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnWarmupCompleted);
            r2.bo_();
            if (Result.onNavigationEvent(objM31constructorimpl)) {
                TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) objM31constructorimpl;
                Intrinsics.checkNotNull(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                iAuthTabCallbackDefault2.L$0 = access15400.onNavigationEvent(typeUtils2);
                iAuthTabCallbackDefault2.L$1 = access15400.onNavigationEvent(setdescriptiontextcolor2);
                iAuthTabCallbackDefault2.L$2 = access15400.onNavigationEvent(onextracallbackwithresult2);
                iAuthTabCallbackDefault2.L$3 = objM31constructorimpl;
                iAuthTabCallbackDefault2.L$4 = access15400.onNavigationEvent(tabBarInfoQueryPointOnTabBarInfoQueryListener);
                iAuthTabCallbackDefault2.I$0 = 0;
                iAuthTabCallbackDefault2.label = 2;
                if (r2.IAuthTabCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener, typeUtils2, iAuthTabCallbackDefault2) != obj) {
                    int i10 = onActivityLayout + 65;
                    onMessageChannelReady = i10 % 128;
                    int i11 = i10 % 2;
                }
                return obj;
            }
            thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
            if (thM32exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putLong("EXTRA_ACCOUNT_ID", this.asInterface);
        bundle.putString("EXTRA_BANK_CODE", this.onTransact);
        bundle.putString("EXTRA_BANK_ACCOUNT_NO", this.IAuthTabCallbackStub);
        bundle.putSerializable("EXTRA_REGISTER_METHOD", this.IAuthTabCallback_Parcel);
        Object[] objArr = new Object[1];
        a(Color.green(0) + 24, 4 - KeyEvent.normalizeMetaState(0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) + 12657), objArr);
        bundle.putSerializable(((String) objArr[0]).intern(), this.access000);
        bundle.putBoolean("showSmsGuide", this.writeTypedObject);
        int i4 = onActivityLayout + 37;
        onMessageChannelReady = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, TypeUtils2 typeUtils2, access13800<? super Unit> access13800Var) throws Throwable {
        asInterface asinterface;
        boolean z;
        String str;
        TypeUtils2 typeUtils22;
        char c;
        String str2;
        final TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener2 = tabBarInfoQueryPointOnTabBarInfoQueryListener;
        int i = 2 % 2;
        if (access13800Var instanceof asInterface) {
            int i2 = onActivityLayout + 17;
            onMessageChannelReady = i2 % 128;
            int i3 = i2 % 2;
            asinterface = (asInterface) access13800Var;
            int i4 = asinterface.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i4 - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
                int i5 = onActivityLayout + 83;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        asInterface asinterface2 = asinterface;
        Object obj = asinterface2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = asinterface2.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj);
            Intent intent = getIntent();
            if (intent != null) {
                int i8 = onMessageChannelReady + 53;
                onActivityLayout = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr = new Object[1];
                a(8 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (30884 - TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0)), objArr);
                String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
                String str3 = (stringExtra == null || stringExtra.length() <= 0) ? null : stringExtra;
                boolean booleanExtra = getIntent().getBooleanExtra("skipSmsGuideCompleteMessage", false);
                if (this.writeTypedObject) {
                    int i10 = onActivityLayout + 15;
                    onMessageChannelReady = i10 % 128;
                    int i11 = i10 % 2;
                    AccountSmsIntroActivity.onExtraCallbackWithResult onextracallbackwithresult = AccountSmsIntroActivity.Companion;
                    List listListOf = CollectionsKt__CollectionsJVMKt.listOf(access14000.onNavigationEvent(Integer.parseInt(tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface())));
                    if (booleanExtra) {
                        int i12 = onMessageChannelReady;
                        int i13 = i12 + 107;
                        onActivityLayout = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = i12 + Imgproc.COLOR_YUV2RGB_YVYU;
                        onActivityLayout = i15 % 128;
                        int i16 = i15 % 2;
                        str2 = _UrlKt.FRAGMENT_ENCODE_SET;
                    } else {
                        String string = getString(R.string.app_account_greement_toast_done, tabBarInfoQueryPointOnTabBarInfoQueryListener.onMessageChannelReady());
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        str2 = string;
                    }
                    startActivity(onextracallbackwithresult.onWarmupCompleted(this, listListOf, str2, str3, this.readTypedObject));
                    z = booleanExtra;
                } else {
                    if (str3 == null || str3.length() == 0) {
                        z = booleanExtra;
                        str = _UrlKt.FRAGMENT_ENCODE_SET;
                    } else {
                        z = booleanExtra;
                        str = _UrlKt.FRAGMENT_ENCODE_SET;
                        SessionTrackerb.IAuthTabCallback(setEngagementSignalsCallback(), this, str3, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                        int i17 = onMessageChannelReady + 97;
                        onActivityLayout = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    if (!z) {
                        String string2 = getString(R.string.app_account_greement_toast_done, tabBarInfoQueryPointOnTabBarInfoQueryListener.onMessageChannelReady());
                        Intrinsics.checkNotNullExpressionValue(string2, str);
                        BrickModulePackageExternalSyntheticLambda0.onExtraCallbackWithResult(TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent((Activity) this, (CharSequence) string2), R.drawable.icn_success_color, 0, 2, (Object) null), 300, null, 0, 6, null);
                    }
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1363244L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object[] objArr2 = {this.f$0, tabBarInfoQueryPointOnTabBarInfoQueryListener2, (SetDetectableSize) obj2};
                        return (Unit) AccountAgreementActivity.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1375388131, -1375388123, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr2);
                    }
                }, 14, (Object) null);
                disableOldAndroidAttachmentMetricsWorkarounds disableoldandroidattachmentmetricsworkarounds = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback;
                asinterface2.L$0 = tabBarInfoQueryPointOnTabBarInfoQueryListener2;
                typeUtils22 = typeUtils2;
                asinterface2.L$1 = typeUtils22;
                asinterface2.L$2 = access15400.onNavigationEvent(str3);
                asinterface2.Z$0 = z;
                asinterface2.label = 1;
                if (disableoldandroidattachmentmetricsworkarounds.onExtraCallback(tabBarInfoQueryPointOnTabBarInfoQueryListener2, true, true, asinterface2) == objOnExtraCallback) {
                    int i19 = onMessageChannelReady + 87;
                    onActivityLayout = i19 % 128;
                    if (i19 % 2 == 0) {
                        int i20 = 63 / 0;
                    }
                    return objOnExtraCallback;
                }
                c = 0;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            typeUtils22 = (TypeUtils2) asinterface2.L$1;
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener3 = (TabBarInfoQueryPointOnTabBarInfoQueryListener) asinterface2.L$0;
            ResultKt.onNavigationEvent(obj);
            ((Result) obj).onNavigationEvent();
            tabBarInfoQueryPointOnTabBarInfoQueryListener2 = tabBarInfoQueryPointOnTabBarInfoQueryListener3;
            c = 0;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("toss.intent.extra.ACCOUNT_ID", tabBarInfoQueryPointOnTabBarInfoQueryListener2.onExtraCallbackWithResult());
        TabBarInfoQueryPointOnTabBarInfoQueryListener[] tabBarInfoQueryPointOnTabBarInfoQueryListenerArr = new TabBarInfoQueryPointOnTabBarInfoQueryListener[1];
        tabBarInfoQueryPointOnTabBarInfoQueryListenerArr[c] = tabBarInfoQueryPointOnTabBarInfoQueryListener2;
        intent2.putParcelableArrayListExtra("EXTRA_KEY_REGISTERED_BANK_ACCOUNTS", CollectionsKt__CollectionsKt.arrayListOf(tabBarInfoQueryPointOnTabBarInfoQueryListenerArr));
        intent2.putExtra("EXTRA_KEY_CREDENTIAL", (Parcelable) typeUtils22);
        setResult(-1, intent2);
        finish();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountAgreementActivity accountAgreementActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -494388120, 494388127, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse});
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountAgreementActivity accountAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 1375388131, -1375388123, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, setDetectableSize});
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, access13800 access13800Var) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 1013986926, -1013986924, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, access13800Var});
    }

    public static final /* synthetic */ void IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, boolean z) throws Throwable {
        Object[] objArr = {accountAgreementActivity, Boolean.valueOf(z)};
        onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -630585238, 630585242, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AccountAgreementActivity accountAgreementActivity, getSignedData getsigneddata) throws Throwable {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1350808242, 1350808242, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, getsigneddata});
    }

    private final String validateRelationship() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (String) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 72269503, -72269497, iOnWarmupCompleted3, new Object[]{this});
    }

    private final getResultMsg ICustomTabsServiceStubProxy() {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (getResultMsg) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 401848352, -401848347, iOnWarmupCompleted3, new Object[]{this});
    }

    private static final Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 2121686518, -2121686515, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, tabBarInfoQueryPointOnTabBarInfoQueryListener, setDetectableSize});
    }

    private final Object onExtraCallback(TypeUtils2 typeUtils2, access13800<? super Unit> access13800Var) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1678965322, 1678965323, iOnWarmupCompleted3, new Object[]{this, typeUtils2, access13800Var});
    }

    private static final Unit IAuthTabCallback(AccountAgreementActivity accountAgreementActivity, SetDetectableSize setDetectableSize) {
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        return (Unit) onNavigationEvent(iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -2061239426, 2061239435, iOnWarmupCompleted3, new Object[]{accountAgreementActivity, setDetectableSize});
    }

    @Override // viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onMessageChannelReady + 23;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = onMessageChannelReady + 9;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = onMessageChannelReady + 21;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // viva.republica.toss.account.agreement.Hilt_AccountAgreementActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 97;
        onMessageChannelReady = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = onMessageChannelReady + 75;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ICustomTabsServiceDefault() {
        onActivityResized = new char[]{31974, 14077, 59626, 41685, 21718, 3802, 49337, 31410, 38146, 57113, 268, 19261, 48434, 59177, 10587, 37712, 50501, 3950, 29028, 60832, 42929, 31160, 13212, 50561, 56434, 38515, 18542, 583};
        onPostMessage = 978131861118625752L;
    }
}
