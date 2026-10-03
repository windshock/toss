package viva.republica.toss.dashboard.primaryAccount;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AdComponentViewApiProvider;
import o.AdOptionsViewApi;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DERConstructedSet;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.IEngagementSignalsCallback_Parcel;
import o.IconRoundCornerProgressBarSavedState;
import o.JsonReaderUnknownNumberParsing;
import o.KeyBoardVisiblePoint;
import o.MapConverter;
import o.NativeAnimatedModuleExternalSyntheticLambda3;
import o.NetConverter3;
import o.PageShowPoint;
import o.PlayerErrorCode;
import o.ReactContextRCTDeviceEventEmitter;
import o.ReactIgnorableMountingException;
import o.ReactMethod;
import o.SessionTrackerb;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.TypeUtils2;
import o.TypeUtils7;
import o.UTF8Decoder;
import o.UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda0;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.clearTid;
import o.decodeArrayLoop;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.didScheduleMountItems;
import o.disableOldAndroidAttachmentMetricsWorkarounds;
import o.findResAndMsg;
import o.fromBundle;
import o.getBidderToken;
import o.getButtonBorderColor;
import o.getCurrentActivity;
import o.getParamImp;
import o.initMiniApp;
import o.initializeLifecycleEventListenersForViewTag;
import o.initializeMessageQueueThreads;
import o.issueCertV3;
import o.makeNativeObject;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.onDisclaimerClick;
import o.onExitFullscreen;
import o.onHostDestroy;
import o.onJsBridgeReady;
import o.onPaused;
import o.onSeekEngaged;
import o.putChannelInfo;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.resumeForClick;
import o.setMessageBytes;
import o.setRandomHost;
import o.setTaggedAddrCtrl;
import o.shortValue;
import o.toArrayList;
import o.userDrivenScrollEnded;
import o.writeRaw;
import o.ycxExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet;
import viva.republica.toss.network.model.transfer.InitSessionKeyRequest;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse;
import viva.republica.toss.network.model.transfer.TransferResp;
import viva.republica.toss.network.model.transfer.TransferResultData;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferSendRequest;
import viva.republica.toss.network.model.transfer.TransferSendResponse;
import viva.republica.toss.network.model.transfer.TransferSignatureDto;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferPostParam;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferTossMoneyBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallbackStub;
    public static final int onExtraCallback;
    private static long onMessageChannelReady;
    private static int onMinimized;
    private static char onPostMessage;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private KeyBoardVisiblePoint IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private final Lazy ICustomTabsCallback;
    private final boolean access000;
    private final String access100;
    private final setTaggedAddrCtrl<KeyBoardVisiblePoint, Long, Boolean, String, Unit> asBinder;
    private final Lazy asInterface;
    private final Lazy extraCallback;
    private final onDisclaimerClick extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private final Lazy onActivityLayout;
    private final IEngagementSignalsCallback_Parcel<Intent> onActivityResized;
    private long onExtraCallbackWithResult;
    private final BaseActivity onNavigationEvent;
    private final Lazy onTransact;
    private final Lazy readTypedObject;
    private final SessionTrackerb writeTypedObject;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onRelationshipValidationResult = 1;
    private static int ICustomTabsCallbackStubProxy = 0;
    private static int ICustomTabsCallbackDefault = 1;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferTossMoneyBottomSheet.IAuthTabCallback(TransferTossMoneyBottomSheet.this, (TransferSendRequest) null, (access13800) this);
        }
    }

    static final class IAuthTabCallback_Parcel extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferTossMoneyBottomSheet.onWarmupCompleted(null, null, 0L, null, null, null, this);
        }
    }

    static final class asBinder extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {TransferTossMoneyBottomSheet.this, null, null, 0L, this};
            return TransferTossMoneyBottomSheet.onNavigationEvent(1605397736, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1605397723, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferTossMoneyBottomSheet.IAuthTabCallback(TransferTossMoneyBottomSheet.this, null, null, 0L, null, this);
        }
    }

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[TransferResultPage.ButtonLayout.ActionType.values().length];
            try {
                iArr[TransferResultPage.ButtonLayout.ActionType.REDIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[TransferResultData.Status.values().length];
            try {
                iArr2[TransferResultData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[TransferResultData.Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferResultData.Status.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferResultData.Status.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallbackWithResult = iArr2;
        }
    }

    static final class onTransact extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(TransferTossMoneyBottomSheet.this, (access13800) this);
        }
    }

    private static String $$c(byte b, short s, short s2) {
        int i = s2 + 109;
        int i2 = b * 3;
        byte[] bArr = $$a;
        int i3 = s + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = i2 + i;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            i3++;
            if (i4 == i2) {
                return new String(bArr2, 0);
            }
            i += bArr[i3];
        }
    }

    static {
        ICustomTabsCallbackStub = 0;
        onWarmupCompleted();
        Companion = new onNavigationEvent(null);
        onExtraCallback = 8;
        int i = onRelationshipValidationResult + 113;
        ICustomTabsCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ TdsImageView IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewExtraCommand = extraCommand(transferTossMoneyBottomSheet);
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 117;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsImageViewExtraCommand;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 69;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        extraCallbackWithResult(function1, obj);
        int i4 = ICustomTabsCallbackStubProxy + 11;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(th);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(typeUtils7);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(typeUtils7);
        int i3 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder(transferTossMoneyBottomSheet, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(transferTossMoneyBottomSheet, dialogInterface);
        int i3 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(transferTossMoneyBottomSheet, th);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 121;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(transferTossMoneyBottomSheet, ycxexternalsyntheticlambda1);
        }
        onWarmupCompleted(transferTossMoneyBottomSheet, ycxexternalsyntheticlambda1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 15;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, view);
        int i4 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ ConstraintLayout IAuthTabCallbackDefault(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (ConstraintLayout) onNavigationEvent(1579536905, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1579536877, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
        }
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            onNavigationEvent(1284510128, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1284510120, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
            return;
        }
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1284510128, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, -1284510120, iIAuthTabCallback3, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-669439769, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 669439778, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{dialogInterface});
        int i4 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onPostMessage(transferTossMoneyBottomSheet);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 13;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ ProgressBar IAuthTabCallbackStubProxy(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ProgressBar progressBarICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(transferTossMoneyBottomSheet);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return progressBarICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onUnminimized(transferTossMoneyBottomSheet);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 91;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 107;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onMinimized(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStubProxy = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        int i4 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ BaseTextView access000(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return baseTextViewICustomTabsCallback_Parcel;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        DialogInterface dialogInterface = (DialogInterface) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(transferTossMoneyBottomSheet, keyBoardVisiblePoint, jLongValue, dialogInterface);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ BaseTextView access100(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewOnActivityResized = onActivityResized(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return baseTextViewOnActivityResized;
    }

    public static /* synthetic */ void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 39;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized(function1, obj);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    public static /* synthetic */ BaseTextView asBinder(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            mayLaunchUrl(transferTossMoneyBottomSheet);
            throw null;
        }
        BaseTextView baseTextViewMayLaunchUrl = mayLaunchUrl(transferTossMoneyBottomSheet);
        int i3 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return baseTextViewMayLaunchUrl;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 49;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onMessageChannelReady(function1, obj);
        int i4 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    public static /* synthetic */ ConstraintLayout asInterface(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        ConstraintLayout constraintLayout = (ConstraintLayout) onNavigationEvent(-1874233776, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1874233776, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
        int i4 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 39;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onRelationshipValidationResult(transferTossMoneyBottomSheet);
        }
        onRelationshipValidationResult(transferTossMoneyBottomSheet);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TdsBottomCtaV1View onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1ViewExtraCallbackWithResult = extraCallbackWithResult(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackDefault + 55;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return tdsBottomCtaV1ViewExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, getbuttonbordercolor);
        int i4 = ICustomTabsCallbackStubProxy + 21;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(transferTossMoneyBottomSheet, dialogInterface);
        int i4 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(transferTossMoneyBottomSheet, th);
        int i4 = ICustomTabsCallbackStubProxy + 77;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferTossMoneyBottomSheet, typeUtils7);
        int i4 = ICustomTabsCallbackDefault + 17;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(TransferSendResponse transferSendResponse, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 1;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) onNavigationEvent(-1891389779, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1891389789, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferSendResponse, transferTossMoneyBottomSheet, commonModule_setLeftEdgeTouchEnabled, dialogInterface});
        }
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-1891389779, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, 1891389789, iIAuthTabCallback3, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferSendResponse, transferTossMoneyBottomSheet, commonModule_setLeftEdgeTouchEnabled, dialogInterface});
        int i3 = 72 / 0;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(transferTossMoneyBottomSheet, view);
        int i4 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ ConstraintLayout onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutOnMessageChannelReady = onMessageChannelReady(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackStubProxy + 21;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayoutOnMessageChannelReady;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(-1569042724, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, 1569042740, iIAuthTabCallback3, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, deserializeurinullablecollection});
        int i3 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 59;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(th);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 67;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(initializeLifecycleEventListenersForViewTag initializelifecycleeventlistenersforviewtag, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(initializelifecycleeventlistenersforviewtag, transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, typeUtils2);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, long j, KeyBoardVisiblePoint keyBoardVisiblePoint, TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(transferTossMoneyBottomSheet, j, keyBoardVisiblePoint, typeUtils2);
        }
        onExtraCallback(transferTossMoneyBottomSheet, j, keyBoardVisiblePoint, typeUtils2);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(transferTossMoneyBottomSheet, dialogInterface);
        }
        IAuthTabCallbackStub(transferTossMoneyBottomSheet, dialogInterface);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(transferTossMoneyBottomSheet, th);
        int i4 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 23;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, z, str, th);
        int i4 = ICustomTabsCallbackDefault + 55;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, z, str, pair);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(transferTossMoneyBottomSheet, getbuttonbordercolor);
        int i4 = ICustomTabsCallbackStubProxy + 87;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransferSendResponse transferSendResponse, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(transferSendResponse, transferTossMoneyBottomSheet, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 63;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        TransferResp transferResp = (TransferResp) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 123;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(jLongValue), transferResp};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(661013333, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -661013322, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
        int i4 = ICustomTabsCallbackStubProxy + 103;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        BaseActivity baseActivity;
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i;
        int i12 = (~(i8 | i11 | i4)) | i10;
        int i13 = (~(i5 | i11)) | (~(i7 | i11));
        int i14 = i4 + i + i3 + (1941422536 * i2) + ((-555707305) * i6);
        int i15 = i14 * i14;
        int i16 = (i4 * (-2131549542)) + 177471488 + ((-2131549542) * i) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i3) + ((-1363148800) * i2) + (2141716480 * i6) + ((-573308928) * i15);
        int i17 = ((i4 * 487360618) - 1291405921) + (i * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (487361161 * i3) + ((-1188264952) * i2) + (624576655 * i6) + (i15 * (-25952256));
        int i18 = 2;
        switch (i16 + (i17 * i17 * 74186752)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
                int i19 = 2 % 2;
                int i20 = ICustomTabsCallbackDefault + 47;
                ICustomTabsCallbackStubProxy = i20 % 128;
                int i21 = i20 % 2;
                ConstraintLayout constraintLayout = (ConstraintLayout) transferTossMoneyBottomSheet.onTransact.getValue();
                int i22 = ICustomTabsCallbackDefault + 61;
                ICustomTabsCallbackStubProxy = i22 % 128;
                int i23 = i22 % 2;
                return constraintLayout;
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asInterface(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return IAuthTabCallback_Parcel(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return access100(objArr);
            case 15:
                final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet2 = (TransferTossMoneyBottomSheet) objArr[0];
                final Function1 function1 = (Function1) objArr[1];
                int i24 = 2 % 2;
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 29427), (ViewConfiguration.getTapTimeout() >> 16) + 22, TextUtils.lastIndexOf("", '0') + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 29427), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 24734 - KeyEvent.keyCodeFromString(""), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                    }
                    writeRaw<BaseApiResponse<getButtonBorderColor>> writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback();
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
                    IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback2, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda9
                        public final Object invoke(Object obj2) {
                            return TransferTossMoneyBottomSheet.onWarmupCompleted(this.f$0, (Throwable) obj2);
                        }
                    }, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda10
                        public final Object invoke(Object obj2) {
                            return TransferTossMoneyBottomSheet.onExtraCallback(function1, (getButtonBorderColor) obj2);
                        }
                    }), transferTossMoneyBottomSheet2.onNavigationEvent);
                    int i25 = ICustomTabsCallbackStubProxy + 99;
                    ICustomTabsCallbackDefault = i25 % 128;
                    int i26 = i25 % 2;
                    return null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            case 16:
                TransferTossMoneyBottomSheet transferTossMoneyBottomSheet3 = (TransferTossMoneyBottomSheet) objArr[0];
                int i27 = 2 % 2;
                int i28 = ICustomTabsCallbackStubProxy + 105;
                ICustomTabsCallbackDefault = i28 % 128;
                if (i28 % 2 == 0) {
                    baseActivity = transferTossMoneyBottomSheet3.onNavigationEvent;
                } else {
                    baseActivity = transferTossMoneyBottomSheet3.onNavigationEvent;
                    i18 = 3;
                }
                BaseActivity.IAuthTabCallback(baseActivity, (String) null, false, i18, (Object) null);
                return Unit.INSTANCE;
            case 17:
                return access000(objArr);
            case 18:
                return extraCallback(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                return writeTypedObject(objArr);
            case 21:
                final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet4 = (TransferTossMoneyBottomSheet) objArr[0];
                final KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
                final long jLongValue = ((Number) objArr[2]).longValue();
                int i29 = 2 % 2;
                final initializeLifecycleEventListenersForViewTag initializelifecycleeventlistenersforviewtag = new initializeLifecycleEventListenersForViewTag();
                shortValue.onWarmupCompleted onwarmupcompleted = shortValue.Companion;
                BaseActivity baseActivity2 = transferTossMoneyBottomSheet4.onNavigationEvent;
                writeRaw writerawOnWarmupCompleted = shortValue.onWarmupCompleted(onwarmupcompleted, baseActivity2, UTF8Decoder.SEND, 7L, baseActivity2, false, false, false, false, (String) null, (decodeArrayLoop) null, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj2) {
                        Object[] objArr2 = {this.f$0, (TypeUtils7) obj2};
                        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                        return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(1573993946, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1573993922, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                    }
                }, 1008, (Object) null);
                final Function1 function12 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj2) {
                        return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(initializelifecycleeventlistenersforviewtag, transferTossMoneyBottomSheet4, keyBoardVisiblePoint, jLongValue, (TypeUtils2) obj2);
                    }
                };
                deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda14
                    public final void accept(Object obj2) {
                        TransferTossMoneyBottomSheet.onNavigationEvent(function12, obj2);
                    }
                };
                final Function1 function13 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda15
                    public final Object invoke(Object obj2) {
                        return TransferTossMoneyBottomSheet.IAuthTabCallback((Throwable) obj2);
                    }
                };
                writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda16
                    public final void accept(Object obj2) {
                        TransferTossMoneyBottomSheet.onExtraCallbackWithResult(function13, obj2);
                    }
                });
                int i30 = ICustomTabsCallbackDefault + 119;
                ICustomTabsCallbackStubProxy = i30 % 128;
                int i31 = i30 % 2;
                return null;
            case 22:
                return extraCallbackWithResult(objArr);
            case 23:
                return ICustomTabsCallback(objArr);
            case 24:
                return onPostMessage(objArr);
            case 25:
                return onActivityLayout(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return onMinimized(objArr);
            case 28:
                return onActivityResized(objArr);
            case 29:
                return ICustomTabsCallbackDefault(objArr);
            case 30:
                return ICustomTabsCallbackStubProxy(objArr);
            case 31:
                return ICustomTabsCallbackStub(objArr);
            case 32:
                return onUnminimized(objArr);
            case 33:
                return onRelationshipValidationResult(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 95;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(view);
        int i4 = ICustomTabsCallbackDefault + 5;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(ApiServerError apiServerError, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(apiServerError, transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsCallbackStubProxy + 73;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, DialogInterface dialogInterface) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j), dialogInterface};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 != 0) {
            unit = (Unit) onNavigationEvent(1868799537, iIAuthTabCallback3, iIAuthTabCallback2, -1868799514, iIAuthTabCallback, iIAuthTabCallback4, objArr);
            int i4 = 54 / 0;
        } else {
            unit = (Unit) onNavigationEvent(1868799537, iIAuthTabCallback3, iIAuthTabCallback2, -1868799514, iIAuthTabCallback, iIAuthTabCallback4, objArr);
        }
        int i5 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 61;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ICustomTabsCallbackDefault(transferTossMoneyBottomSheet);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(transferTossMoneyBottomSheet, view);
        int i4 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        TypeUtils7 typeUtils7 = (TypeUtils7) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(495968423, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -495968401, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, typeUtils7});
        int i4 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 1;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled);
        int i4 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ BottomSheetHeader onTransact(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeaderOnMinimized = onMinimized(transferTossMoneyBottomSheet);
        int i4 = ICustomTabsCallbackDefault + 85;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return bottomSheetHeaderOnMinimized;
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 107;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1936686147, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1936686122, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
        int i4 = ICustomTabsCallbackDefault + 17;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        AdOptionsViewApi.onExtraCallback onextracallback = (AdOptionsViewApi.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, onextracallback);
        int i4 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(924260071, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -924260045, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{view});
        int i4 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 79;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, long j, didScheduleMountItems didschedulemountitems) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferTossMoneyBottomSheet, j, didschedulemountitems);
        int i4 = ICustomTabsCallbackDefault + 61;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 109;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(transferTossMoneyBottomSheet, dialogInterface);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(transferTossMoneyBottomSheet, dialogInterface);
        int i3 = ICustomTabsCallbackStubProxy + 61;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(transferTossMoneyBottomSheet, th);
        int i4 = ICustomTabsCallbackStubProxy + 73;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 21;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(transferTossMoneyBottomSheet, deserializeurinullablecollection);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(transferTossMoneyBottomSheet, deserializeurinullablecollection);
        int i3 = ICustomTabsCallbackStubProxy + 23;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(134571343, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -134571331, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
        int i4 = ICustomTabsCallbackDefault + 101;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        readTypedObject(function1, obj);
        int i4 = ICustomTabsCallbackDefault + 19;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(transferTossMoneyBottomSheet, deserializeurinullablecollection);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(transferTossMoneyBottomSheet, deserializeurinullablecollection);
        int i3 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final class access100<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public access100(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.IAuthTabCallback = mapConverter2;
        }

        public final deserializeIp<AdOptionsViewApi.onExtraCallback> apply(writeRaw<BaseApiResponse<AdOptionsViewApi.onExtraCallback>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda0(new Function1<BaseApiResponse<AdOptionsViewApi.onExtraCallback>, deserializeIp<? extends AdOptionsViewApi.onExtraCallback>>() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.access100.2
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends AdOptionsViewApi.onExtraCallback> invoke(BaseApiResponse<AdOptionsViewApi.onExtraCallback> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = AdOptionsViewApi.onExtraCallback.class.newInstance();
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
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.IAuthTabCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onNavigationEvent = mapConverter;
            this.onWarmupCompleted = mapConverter2;
        }

        public final deserializeIp<getButtonBorderColor> apply(writeRaw<BaseApiResponse<getButtonBorderColor>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda0(new Function1<BaseApiResponse<getButtonBorderColor>, deserializeIp<? extends getButtonBorderColor>>() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onWarmupCompleted.3
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends getButtonBorderColor> invoke(BaseApiResponse<getButtonBorderColor> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = getButtonBorderColor.class.newInstance();
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
            MapConverter mapConverter = this.onNavigationEvent;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTossMoneyBottomSheet(@NotNull BaseActivity baseActivity, boolean z, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, @NotNull SessionTrackerb sessionTrackerb, @Nullable String str, @NotNull setTaggedAddrCtrl<? super KeyBoardVisiblePoint, ? super Long, ? super Boolean, ? super String, Unit> settaggedaddrctrl) {
        super(baseActivity, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallback_Parcel, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(settaggedaddrctrl, "");
        this.onNavigationEvent = baseActivity;
        this.access000 = z;
        this.onActivityResized = iEngagementSignalsCallback_Parcel;
        this.writeTypedObject = sessionTrackerb;
        this.access100 = str;
        this.asBinder = settaggedaddrctrl;
        this.extraCallbackWithResult = DERConstructedSet.IAuthTabCallback();
        this.extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda50
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.asInterface(this.f$0);
            }
        });
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda51
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.IAuthTabCallbackStubProxy(this.f$0);
            }
        });
        this.ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda52
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.IAuthTabCallback(this.f$0);
            }
        });
        this.readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda53
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.asBinder(this.f$0);
            }
        });
        this.onActivityLayout = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda54
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.access000(this.f$0);
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda55
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.onExtraCallback(this.f$0);
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda56
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.onTransact(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda57
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.access100(this.f$0);
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda58
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(this.f$0);
            }
        });
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda59
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.IAuthTabCallbackDefault(this.f$0);
            }
        });
    }

    public static final /* synthetic */ Object IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, InitSessionKeyResponse initSessionKeyResponse, onDisclaimerClick ondisclaimerclick, long j, TypeUtils2 typeUtils2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 7;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = transferTossMoneyBottomSheet.onWarmupCompleted(initSessionKeyResponse, ondisclaimerclick, j, typeUtils2, access13800Var);
        int i4 = ICustomTabsCallbackDefault + 81;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    public static final /* synthetic */ Object IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, TransferSendRequest transferSendRequest, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 93;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = transferTossMoneyBottomSheet.onNavigationEvent(transferSendRequest, (access13800<? super TransferSendResponse>) access13800Var);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 25;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ onDisclaimerClick ICustomTabsCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 87;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        onDisclaimerClick ondisclaimerclick = transferTossMoneyBottomSheet.extraCallbackWithResult;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 109;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return ondisclaimerclick;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 103;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = transferTossMoneyBottomSheet.access100;
        int i5 = i3 + 49;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 119;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = transferTossMoneyBottomSheet.writeTypedObject;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = i2 + 109;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return sessionTrackerb;
    }

    public static final /* synthetic */ BaseActivity extraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 85;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        BaseActivity baseActivity = transferTossMoneyBottomSheet.onNavigationEvent;
        int i5 = i3 + 81;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return baseActivity;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) throws NoWhenBranchMatchedException {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        onDisclaimerClick ondisclaimerclick = (onDisclaimerClick) objArr[1];
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        access13800<? super Unit> access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 117;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = transferTossMoneyBottomSheet.IAuthTabCallback(ondisclaimerclick, keyBoardVisiblePoint, jLongValue, access13800Var);
        int i4 = ICustomTabsCallbackDefault + 75;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 27;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = transferTossMoneyBottomSheet.onNavigationEvent((access13800<? super InitSessionKeyResponse>) access13800Var);
        int i4 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Object onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, onDisclaimerClick ondisclaimerclick, long j, KeyBoardVisiblePoint keyBoardVisiblePoint, InitSessionKeyResponse initSessionKeyResponse, TypeUtils2 typeUtils2, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(transferTossMoneyBottomSheet, ondisclaimerclick, j, keyBoardVisiblePoint, initSessionKeyResponse, typeUtils2, access13800Var);
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ void onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 5;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(398234363, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -398234342, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        int i4 = ICustomTabsCallbackStubProxy + 65;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    private final boolean onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 75;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.extraCallbackWithResult == null) {
            return false;
        }
        int i5 = i2 + 37;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return true;
    }

    private final ConstraintLayout ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.extraCallback.getValue();
        int i3 = ICustomTabsCallbackStubProxy + 9;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return constraintLayout;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.transferLayout);
        Intrinsics.checkNotNull(constraintLayoutFindViewById);
        ConstraintLayout constraintLayout = constraintLayoutFindViewById;
        int i4 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ProgressBar ICustomTabsCallbackStubProxy(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.progressBar);
        Intrinsics.checkNotNull(viewFindViewById);
        ProgressBar progressBar = (ProgressBar) viewFindViewById;
        int i4 = ICustomTabsCallbackStubProxy + 125;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return progressBar;
    }

    private final ProgressBar onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 89;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProgressBar progressBar = (ProgressBar) this.getInterfaceDescriptor.getValue();
        int i3 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return progressBar;
    }

    private static final TdsImageView extraCommand(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.transferIcon);
        if (i3 == 0) {
            Intrinsics.checkNotNull(tdsImageViewFindViewById);
            return tdsImageViewFindViewById;
        }
        Intrinsics.checkNotNull(tdsImageViewFindViewById);
        int i4 = 76 / 0;
        return tdsImageViewFindViewById;
    }

    private final TdsImageView onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TdsImageView tdsImageView = (TdsImageView) this.ICustomTabsCallback.getValue();
        int i3 = ICustomTabsCallbackDefault + 53;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return tdsImageView;
    }

    private static final BaseTextView mayLaunchUrl(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.transferDescription);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i4 = ICustomTabsCallbackDefault + 29;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return baseTextView;
    }

    private final BaseTextView onUnminimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextView = (BaseTextView) this.readTypedObject.getValue();
        int i4 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return baseTextView;
    }

    private static final BaseTextView ICustomTabsCallback_Parcel(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 41;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.transferTitle);
        if (i3 != 0) {
            Intrinsics.checkNotNull(baseTextViewFindViewById);
            return baseTextViewFindViewById;
        }
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 29;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = transferTossMoneyBottomSheet.onActivityLayout.getValue();
        if (i3 == 0) {
            return (BaseTextView) value;
        }
        int i4 = 3 / 0;
        return (BaseTextView) value;
    }

    private final TdsBottomCtaV1View extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = (TdsBottomCtaV1View) this.IAuthTabCallback.getValue();
        int i3 = ICustomTabsCallbackStubProxy + 1;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return tdsBottomCtaV1View;
    }

    private static final TdsBottomCtaV1View extraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.bottomCta);
        Intrinsics.checkNotNull(tdsBottomCtaV1ViewFindViewById);
        TdsBottomCtaV1View tdsBottomCtaV1View = tdsBottomCtaV1ViewFindViewById;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return tdsBottomCtaV1View;
    }

    private final BottomSheetHeader onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetHeader bottomSheetHeader = (BottomSheetHeader) this.asInterface.getValue();
        if (i3 == 0) {
            return bottomSheetHeader;
        }
        throw null;
    }

    private static final BottomSheetHeader onMinimized(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        BottomSheetHeader bottomSheetHeader;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 35;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            View viewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.delayedTransferTitle);
            Intrinsics.checkNotNull(viewFindViewById);
            bottomSheetHeader = (BottomSheetHeader) viewFindViewById;
            int i3 = 9 / 0;
        } else {
            BottomSheetHeader bottomSheetHeaderFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.delayedTransferTitle);
            Intrinsics.checkNotNull(bottomSheetHeaderFindViewById);
            bottomSheetHeader = bottomSheetHeaderFindViewById;
        }
        int i4 = ICustomTabsCallbackStubProxy + 95;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return bottomSheetHeader;
    }

    private static final BaseTextView onActivityResized(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 117;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.delayedTransferDescription);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i4 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return baseTextView;
    }

    private final BaseTextView readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 53;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextView = (BaseTextView) this.IAuthTabCallbackDefault.getValue();
        int i4 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return baseTextView;
    }

    private static final ConstraintLayout onMessageChannelReady(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 75;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.delayedTransferLayout);
        Intrinsics.checkNotNull(constraintLayoutFindViewById);
        ConstraintLayout constraintLayout = constraintLayoutFindViewById;
        int i4 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(transferTossMoneyBottomSheet.findViewById(R.id.root));
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutFindViewById = transferTossMoneyBottomSheet.findViewById(R.id.root);
        Intrinsics.checkNotNull(constraintLayoutFindViewById);
        ConstraintLayout constraintLayout = constraintLayoutFindViewById;
        int i3 = ICustomTabsCallbackStubProxy + 91;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    private final ConstraintLayout onPostMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.IAuthTabCallback_Parcel.getValue();
        int i3 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return constraintLayout;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $11 + 23;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 17;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 43 - (ViewConfiguration.getTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "")), Color.blue(0) + 44, 1493 - TextUtils.lastIndexOf("", '0', 0), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - View.MeasureSpec.getMode(0)), TextUtils.lastIndexOf("", '0') + 51, 22939 - View.combineMeasuredStates(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 29 - (ViewConfiguration.getTapTimeout() >> 16), 12578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onMessageChannelReady ^ 7798559133331975163L)) ^ ((int) (onMinimized ^ 7798559133331975163L))) ^ ((char) (onPostMessage ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r2.size() != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), 1349100616, new java.lang.Object[]{o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "TransferTossMoneyBottomSheet", "primaryAccountCandidates.size != 1 (size=" + r2.size() + ")", null, null, false, null, 60, null}, com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult(), com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult());
        cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        r4 = (o.KeyBoardVisiblePoint) kotlin.collections.CollectionsKt.first(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r2.size() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = 2
            int r2 = r1 % r1
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(r21)
            int r2 = viva.republica.toss.R.layout.bottom_sheet_transfer_toss_money
            r0.setContentView(r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r20.getBehavior()
            r3 = 0
            r2.setDraggable(r3)
            o.PageShowPoint$onWarmupCompleted r2 = o.PageShowPoint.Companion
            o.KeyBoardVisiblePoint r4 = r2.onTransact()
            r5 = 1
            if (r4 != 0) goto L92
            int r4 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault
            int r4 = r4 + 111
            int r6 = r4 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy = r6
            int r4 = r4 % r1
            if (r4 == 0) goto L34
            java.util.List r2 = r2.onExtraCallbackWithResult(r3)
            int r4 = r2.size()
            if (r4 == 0) goto L8b
            goto L3e
        L34:
            java.util.List r2 = r2.onExtraCallbackWithResult(r5)
            int r4 = r2.size()
            if (r4 == r5) goto L8b
        L3e:
            o.ConvertFloatArrayToByteArray r4 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            int r1 = r2.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "primaryAccountCandidates.size != 1 (size="
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r5 = "TransferTossMoneyBottomSheet"
            java.lang.String r6 = r2.toString()
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r1 = 60
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r16 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            int r19 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r14 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r17 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r18 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            r15 = 1349100616(0x5069a448, float:1.5679431E10)
            r13 = -1349100608(0xffffffffaf965bc0, float:-2.7350033E-10)
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r13, r14, r15, r16, r17, r18, r19)
            r20.cancel()
            return
        L8b:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r2)
            r4 = r2
            o.KeyBoardVisiblePoint r4 = (o.KeyBoardVisiblePoint) r4
        L92:
            r0.IAuthTabCallbackStubProxy = r4
            o.onDisclaimerClick r2 = r0.extraCallbackWithResult
            if (r2 == 0) goto Lb3
            int r3 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault
            int r3 = r3 + 63
            int r4 = r3 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy = r4
            int r3 = r3 % r1
            r1 = 0
            if (r3 == 0) goto La7
            r3 = 1
            goto La9
        La7:
            r3 = 0
        La9:
            long r1 = o.KeyBoardVisiblePoint.onExtraCallback(r2, r3, r5, r1)
            r0.onExtraCallbackWithResult = r1
            r20.writeTypedObject()
            return
        Lb3:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r20.ICustomTabsCallbackDefault()
            r2 = 8
            r1.setVisibility(r2)
            android.widget.ProgressBar r1 = r20.onActivityLayout()
            r1.setVisibility(r3)
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda65 r1 = new viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda65
            r1.<init>(r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r1}
            int r6 = im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r4 = im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r3 = im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()
            int r7 = im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()
            r5 = -1596607019(0xffffffffa0d5b5d5, float:-3.620393E-19)
            r2 = 1596607034(0x5f2a4a3a, float:1.2270684E19)
            onNavigationEvent(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onCreate(android.os.Bundle):void");
    }

    private static final Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getbuttonbordercolor, "");
        transferTossMoneyBottomSheet.onExtraCallbackWithResult = getbuttonbordercolor.onWarmupCompleted();
        transferTossMoneyBottomSheet.writeTypedObject();
        transferTossMoneyBottomSheet.ICustomTabsCallbackDefault().setVisibility(0);
        transferTossMoneyBottomSheet.onActivityLayout().setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 27;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 125;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        int i5 = ICustomTabsCallbackDefault + 119;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
    }

    private static final void onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy();
        int i4 = ICustomTabsCallbackStubProxy + 7;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 long, still in use, count: 2, list:
          (r6v4 long) from 0x0020: PHI (r6v1 long) = (r6v0 long), (r6v4 long) binds: [B:8:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
          (r6v4 long) from 0x0015: CMP_L (r6v4 long), (0 long) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final void writeTypedObject() {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.writeTypedObject():void");
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, getButtonBorderColor getbuttonbordercolor) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbuttonbordercolor, "");
            function1.invoke(getbuttonbordercolor);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbuttonbordercolor, "");
        function1.invoke(getbuttonbordercolor);
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackDefault + 53;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 11;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, transferTossMoneyBottomSheet.onNavigationEvent, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda49
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onExtraCallback(this.f$0, (DialogInterface) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackDefault + 65;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 39;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = transferTossMoneyBottomSheet.IAuthTabCallbackStubProxy;
        if (keyBoardVisiblePoint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = ICustomTabsCallbackDefault + 9;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            keyBoardVisiblePoint = null;
        }
        String strOnExtraCallbackWithResult = keyBoardVisiblePoint.onExtraCallbackWithResult();
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = transferTossMoneyBottomSheet.IAuthTabCallbackStubProxy;
        if (keyBoardVisiblePoint2 == null) {
            int i6 = ICustomTabsCallbackDefault + 119;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = 64 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            keyBoardVisiblePoint2 = null;
        }
        KeyBoardVisiblePoint keyBoardVisiblePointOnWarmupCompleted = DERConstructedSet.onWarmupCompleted(strOnExtraCallbackWithResult, keyBoardVisiblePoint2.onWarmupCompleted());
        if (keyBoardVisiblePointOnWarmupCompleted != null && keyBoardVisiblePointOnWarmupCompleted.bO_()) {
            int i8 = ICustomTabsCallbackStubProxy + 31;
            ICustomTabsCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            transferTossMoneyBottomSheet.IAuthTabCallbackStubProxy = keyBoardVisiblePointOnWarmupCompleted;
            transferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy();
        }
        return null;
    }

    private final void ICustomTabsCallbackStubProxy() throws Throwable {
        int i = 2 % 2;
        onNavigationEvent(new Function0() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda26
            public final Object invoke() {
                return TransferTossMoneyBottomSheet.getInterfaceDescriptor(this.f$0);
            }
        });
        int i2 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onRelationshipValidationResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 11;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {transferTossMoneyBottomSheet, Long.valueOf(transferTossMoneyBottomSheet.onExtraCallbackWithResult)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-119813531, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 119813536, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 59;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onMessageChannelReady(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 105;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static final void onUnminimized(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.onNavigationEvent.bo_();
        int i4 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Function0 function0, AdOptionsViewApi.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        IconRoundCornerProgressBarSavedState.onWarmupCompleted((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), iIAuthTabCallback, GeckoHubImp.IAuthTabCallback.IAuthTabCallback()), "TransferTossMoneyBottomSheet");
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, transferTossMoneyBottomSheet.onNavigationEvent, false, (initMiniApp) null, (Function0) null, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        }, 14, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(final Function0<Unit> function0) throws Throwable {
        int i = 2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = this.IAuthTabCallbackStubProxy;
        if (keyBoardVisiblePoint == null) {
            int i2 = ICustomTabsCallbackDefault + 89;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 95 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            keyBoardVisiblePoint = null;
        }
        if (!(!issueCertV3.asInterface(keyBoardVisiblePoint))) {
            function0.invoke();
            return;
        }
        if (keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
            if (!(!tabBarInfoQueryPointOnTabBarInfoQueryListener.receiveFile())) {
                String strPrefetch = tabBarInfoQueryPointOnTabBarInfoQueryListener.prefetch();
                if (strPrefetch != null) {
                    int i4 = ICustomTabsCallbackDefault + 13;
                    ICustomTabsCallbackStubProxy = i4 % 128;
                    int i5 = i4 % 2;
                    resumeForClick resumeforclick = resumeForClick.asBinder;
                    BaseActivity baseActivity = this.onNavigationEvent;
                    Uri.Builder builderAppendQueryParameter = Uri.parse(strPrefetch).buildUpon().appendQueryParameter("agreementTitle", "연결한 계좌에서\n돈을 보내고 받을 수 있게 할까요?");
                    Object[] objArr = new Object[1];
                    a((char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{29469, 63483, 13423, 26737, 14675, 15270, 19627, 62596}, new char[]{0, 0, 0, 0}, new char[]{27449, 45533, 5557, 18945}, objArr);
                    SessionTrackerb.onNavigationEvent(resumeforclick, baseActivity, builderAppendQueryParameter.appendQueryParameter(((String) objArr[0]).intern(), "HOME_PRIMARY_ACCOUNT_FLOW").build().toString(), this.onActivityResized, (Bundle) null, 8, (Object) null);
                    return;
                }
                return;
            }
        }
        AdComponentViewApiProvider adComponentViewApiProvider = new AdComponentViewApiProvider(keyBoardVisiblePoint.onWarmupCompleted().getName(), keyBoardVisiblePoint.onExtraCallbackWithResult());
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.combineMeasuredStates(0, 0)), 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24734 - Drawable.resolveOpacity(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-32901893);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29426), 21 - TextUtils.lastIndexOf("", '0', 0, 0), View.getDefaultSize(0, 0) + 24734, -817296789, false, "onExtraCallbackWithResult", new Class[0]);
            }
            writeRaw<AdOptionsViewApi> writerawOnExtraCallback = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(adComponentViewApiProvider);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new access100(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda60
                public final Object invoke(Object obj2) {
                    Object[] objArr2 = {this.f$0, (deserializeUriNullableCollection) obj2};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(-1475023513, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1475023516, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda61
                public final void accept(Object obj2) {
                    TransferTossMoneyBottomSheet.asBinder(function1, obj2);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda62
                public final void run() {
                    TransferTossMoneyBottomSheet.IAuthTabCallback_Parcel(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda63
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.IAuthTabCallback(this.f$0, (Throwable) obj2);
                }
            }, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda64
                public final Object invoke(Object obj2) {
                    Object[] objArr2 = {function0, (AdOptionsViewApi.onExtraCallback) obj2};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(-1086337939, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1086337971, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                }
            }), this.onNavigationEvent);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 95;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity baseActivity = transferTossMoneyBottomSheet.onNavigationEvent;
        String string = transferTossMoneyBottomSheet.getContext().getString(R.string.send_request_in_progress);
        Intrinsics.checkNotNullExpressionValue(string, "");
        baseActivity.onNavigationEvent(string, false);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 57;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 57;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackStubProxy + 95;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }

    private static final void ICustomTabsCallbackDefault(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.onNavigationEvent.bo_();
        int i4 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        final long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        KeyBoardVisiblePoint keyBoardVisiblePoint = transferTossMoneyBottomSheet.IAuthTabCallbackStubProxy;
        if (keyBoardVisiblePoint == null) {
            int i2 = ICustomTabsCallbackDefault + 43;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 68 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            keyBoardVisiblePoint = null;
        }
        String str = (String) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 1129674746, nSetPosition.onExtraCallbackWithResult(), -1129674745, new Object[]{keyBoardVisiblePoint.bP_()});
        KeyBoardVisiblePoint keyBoardVisiblePoint2 = transferTossMoneyBottomSheet.IAuthTabCallbackStubProxy;
        if (keyBoardVisiblePoint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            keyBoardVisiblePoint2 = null;
        }
        onHostDestroy onhostdestroy = new onHostDestroy(keyBoardVisiblePoint2.asInterface(), str, null, false, 12, null);
        if (jLongValue > 0) {
            int i4 = ICustomTabsCallbackDefault + 5;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            onhostdestroy.IAuthTabCallback(String.valueOf(jLongValue));
            int i6 = ICustomTabsCallbackDefault + 79;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 22 - Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - KeyEvent.normalizeMetaState(0)), 22 - Color.green(0), 24733 - ExpandableListView.getPackedPositionChild(0L), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult(onhostdestroy).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda40
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj2);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda41
                public final void accept(Object obj2) throws Throwable {
                    Object[] objArr2 = {function1, obj2};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    TransferTossMoneyBottomSheet.onNavigationEvent(-660036784, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 660036803, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr2);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda42
                public final void run() {
                    TransferTossMoneyBottomSheet.onNavigationEvent(this.f$0);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda43
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.onWarmupCompleted(this.f$0, jLongValue, (didScheduleMountItems) obj2);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda44
                public final void accept(Object obj2) throws Throwable {
                    TransferTossMoneyBottomSheet.IAuthTabCallbackDefault(function12, obj2);
                }
            };
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda45
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.onExtraCallback(this.f$0, (Throwable) obj2);
                }
            };
            writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda46
                public final void accept(Object obj2) {
                    TransferTossMoneyBottomSheet.onExtraCallback(function13, obj2);
                }
            });
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet r9, long r10, o.didScheduleMountItems r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object[] r2 = new java.lang.Object[]{r12}
            int r3 = im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback()
            int r8 = im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback()
            int r7 = im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback()
            int r5 = im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback()
            r6 = -812271550(0xffffffffcf95b842, float:-5.0237614E9)
            r4 = 812271550(0x306a47be, float:8.5230656E-10)
            java.lang.Object r1 = im.toss.network.model.BaseApiResponse.onExtraCallbackWithResult(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L61
            java.lang.Object r1 = r12.onTransact()
            if (r1 == 0) goto L61
            int r12 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r12 = r12 + 95
            int r1 = r12 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r1
            int r12 = r12 % r0
            o.KeyBoardVisiblePoint r12 = r9.IAuthTabCallbackStubProxy
            if (r12 != 0) goto L53
            int r1 = r1 + 47
            int r12 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy = r12
            int r1 = r1 % r0
            if (r1 == 0) goto L4f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            int r12 = r0 / 0
            goto L54
        L4f:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L54
        L53:
            r4 = r12
        L54:
            r9.IAuthTabCallback(r4, r10)
            int r9 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r9 = r9 + 27
            int r10 = r9 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r10
            int r9 = r9 % r0
            goto Lbe
        L61:
            boolean r1 = r9.onActivityResized()
            if (r1 == 0) goto La2
            int r1 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault
            int r1 = r1 + 37
            int r5 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L9e
            boolean r1 = r12.IAuthTabCallback()
            r1 = r1 ^ 1
            if (r1 == 0) goto L7b
            goto La2
        L7b:
            int r1 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r1 = r1 + 39
            int r2 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r2
            int r1 = r1 % r0
            o.KeyBoardVisiblePoint r1 = r9.IAuthTabCallbackStubProxy
            if (r1 != 0) goto L95
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            int r1 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r1 = r1 + 95
            int r2 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r2
            int r1 = r1 % r0
            goto L96
        L95:
            r4 = r1
        L96:
            im.toss.network.throwable.ApiServerError r12 = r12.asInterface()
            r9.onNavigationEvent(r4, r10, r12)
            goto Lbe
        L9e:
            r12.IAuthTabCallback()
            throw r4
        La2:
            im.toss.base.BaseActivity r10 = r9.onNavigationEvent
            im.toss.network.throwable.ApiServerError r11 = r12.asInterface()
            if (r11 == 0) goto Lb0
            java.lang.String r11 = r11.IAuthTabCallbackDefault()
            if (r11 != 0) goto Lbb
        Lb0:
            im.toss.base.BaseActivity r9 = r9.onNavigationEvent
            int r11 = viva.republica.toss.R.string.error_retry_message
            java.lang.String r11 = r9.getString(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
        Lbb:
            o.onJsBridgeReady.onNavigationEvent(r10, r11, r2, r0, r4)
        Lbe:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onExtraCallbackWithResult(viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet, long, o.didScheduleMountItems):kotlin.Unit");
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }

    private static final Unit IAuthTabCallbackStub(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, transferTossMoneyBottomSheet.onNavigationEvent, true, (initMiniApp) null, (Function0) null, (Function1) null, 19, (Object) null);
        } else {
            Intrinsics.checkNotNull(th);
            getParamImp.onWarmupCompleted(th, transferTossMoneyBottomSheet.onNavigationEvent, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }
        return Unit.INSTANCE;
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ long $amount;
        final /* synthetic */ KeyBoardVisiblePoint $primaryAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access000(KeyBoardVisiblePoint keyBoardVisiblePoint, long j, access13800<? super access000> access13800Var) {
            super(2, access13800Var);
            this.$primaryAccount = keyBoardVisiblePoint;
            this.$amount = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TransferTossMoneyBottomSheet.this.new access000(this.$primaryAccount, this.$amount, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (TransferTossMoneyBottomSheet.ICustomTabsCallback(TransferTossMoneyBottomSheet.this) != null) {
                    TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = TransferTossMoneyBottomSheet.this;
                    onDisclaimerClick ondisclaimerclickICustomTabsCallback = TransferTossMoneyBottomSheet.ICustomTabsCallback(transferTossMoneyBottomSheet);
                    KeyBoardVisiblePoint keyBoardVisiblePoint = this.$primaryAccount;
                    long j = this.$amount;
                    this.label = 1;
                    Object[] objArr = {transferTossMoneyBottomSheet, ondisclaimerclickICustomTabsCallback, keyBoardVisiblePoint, Long.valueOf(j), this};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    if (TransferTossMoneyBottomSheet.onNavigationEvent(1605397736, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1605397723, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    TransferTossMoneyBottomSheet.onWarmupCompleted(TransferTossMoneyBottomSheet.this, this.$primaryAccount, this.$amount);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            ConvertByteArrayToFloatArray.onExtraCallback(1005554L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback(KeyBoardVisiblePoint keyBoardVisiblePoint, long j) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new access000(keyBoardVisiblePoint, j, null), 3, (Object) null);
        int i2 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object IAuthTabCallback(viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet r14, o.onDisclaimerClick r15, long r16, o.KeyBoardVisiblePoint r18, viva.republica.toss.network.model.transfer.InitSessionKeyResponse r19, o.TypeUtils2 r20, o.access13800<? super kotlin.Unit> r21) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.IAuthTabCallback(viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet, o.onDisclaimerClick, long, o.KeyBoardVisiblePoint, viva.republica.toss.network.model.transfer.InitSessionKeyResponse, o.TypeUtils2, o.access13800):java.lang.Object");
    }

    private static final Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            typeUtils7.onNavigationEvent(((BaseTextView) onNavigationEvent(-374176713, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 374176715, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet})).getText().toString());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        typeUtils7.onNavigationEvent(((BaseTextView) onNavigationEvent(-374176713, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback4, 374176715, iIAuthTabCallback3, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet})).getText().toString());
        int i3 = 71 / 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.onDisclaimerClick r27, o.KeyBoardVisiblePoint r28, long r29, o.access13800<? super kotlin.Unit> r31) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.IAuthTabCallback(o.onDisclaimerClick, o.KeyBoardVisiblePoint, long, o.access13800):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(final TransferSendResponse transferSendResponse, KeyBoardVisiblePoint keyBoardVisiblePoint, long j) throws NoWhenBranchMatchedException {
        TransferResultPage.ButtonLayout.ActionType actionTypeOnNavigationEvent;
        TransferResultPage.ButtonLayout buttonLayoutOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 23;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage transferResultPageOnNavigationEvent = transferSendResponse.onNavigationEvent();
        if (transferResultPageOnNavigationEvent instanceof TransferResultPage.Redirect) {
            SessionTrackerb.onExtraCallbackWithResult(this.writeTypedObject, getContext(), ((TransferResultPage.Redirect) transferSendResponse.onNavigationEvent()).onTransact(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
            return;
        }
        if (transferResultPageOnNavigationEvent instanceof TransferResultPage.Display) {
            TransferResultPage.BottomCTALayout bottomCTALayoutOnTransact = ((TransferResultPage.Display) transferSendResponse.onNavigationEvent()).onTransact();
            if (bottomCTALayoutOnTransact == null || (buttonLayoutOnWarmupCompleted = bottomCTALayoutOnTransact.onWarmupCompleted()) == null) {
                int i4 = ICustomTabsCallbackDefault + 5;
                ICustomTabsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                actionTypeOnNavigationEvent = null;
            } else {
                actionTypeOnNavigationEvent = buttonLayoutOnWarmupCompleted.onNavigationEvent();
            }
            boolean z = actionTypeOnNavigationEvent == TransferResultPage.ButtonLayout.ActionType.INTRODUCE_SCHEDULED_TRANSFER;
            if (onActivityResized() && z) {
                int i6 = ICustomTabsCallbackDefault + 79;
                ICustomTabsCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                onWarmupCompleted(this, keyBoardVisiblePoint, j, (ApiServerError) null, 4, (Object) null);
                return;
            }
            int i8 = onExtraCallbackWithResult.onExtraCallbackWithResult[transferSendResponse.onExtraCallbackWithResult().onWarmupCompleted().ordinal()];
            if (i8 == 1) {
                onNavigationEvent(keyBoardVisiblePoint, j, true, "");
                return;
            }
            int i9 = ICustomTabsCallbackDefault + 103;
            ICustomTabsCallbackStubProxy = i9 % 128;
            if (i9 % 2 == 0 ? i8 == 2 : i8 == 4) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj) {
                        return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(transferSendResponse, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                return;
            } else if (i8 == 3) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context2, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda1
                    public final Object invoke(Object obj) {
                        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                        return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(-446782363, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 446782396, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{(CommonModule_setLeftEdgeTouchEnabled) obj});
                    }
                });
                return;
            } else if (i8 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!(transferResultPageOnNavigationEvent instanceof TransferResultPage.MyDataSuggestion) && !(transferResultPageOnNavigationEvent instanceof TransferResultPage.ShareTransfer)) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = ICustomTabsCallbackDefault + 63;
        ICustomTabsCallbackStubProxy = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        TransferResultPage.ButtonLayout.ActionType actionTypeOnNavigationEvent;
        TransferResultPage.ButtonLayout buttonLayoutOnWarmupCompleted;
        TransferSendResponse transferSendResponse = (TransferSendResponse) objArr[0];
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[1];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[2];
        DialogInterface dialogInterface = (DialogInterface) objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 97;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        TransferResultPage.BottomCTALayout bottomCTALayoutOnTransact = ((TransferResultPage.Display) transferSendResponse.onNavigationEvent()).onTransact();
        if (bottomCTALayoutOnTransact == null || (buttonLayoutOnWarmupCompleted = bottomCTALayoutOnTransact.onWarmupCompleted()) == null) {
            actionTypeOnNavigationEvent = null;
        } else {
            int i4 = ICustomTabsCallbackStubProxy + 23;
            ICustomTabsCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            actionTypeOnNavigationEvent = buttonLayoutOnWarmupCompleted.onNavigationEvent();
        }
        if (actionTypeOnNavigationEvent != null) {
            if (onExtraCallbackWithResult.IAuthTabCallback[actionTypeOnNavigationEvent.ordinal()] == 1) {
                int i6 = ICustomTabsCallbackStubProxy + 13;
                ICustomTabsCallbackDefault = i6 % 128;
                if (i6 % 2 == 0) {
                    SessionTrackerb.onExtraCallbackWithResult(transferTossMoneyBottomSheet.writeTypedObject, commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(), ((TransferResultPage.Display) transferSendResponse.onNavigationEvent()).onTransact().onWarmupCompleted().IAuthTabCallbackDefault(), false, (Function1) null, (Bundle) null, true, 13, (Object) null);
                } else {
                    SessionTrackerb.onExtraCallbackWithResult(transferTossMoneyBottomSheet.writeTypedObject, commonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(), ((TransferResultPage.Display) transferSendResponse.onNavigationEvent()).onTransact().onWarmupCompleted().IAuthTabCallbackDefault(), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        int i7 = ICustomTabsCallbackDefault + 23;
        ICustomTabsCallbackStubProxy = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 97 / 0;
        }
        transferTossMoneyBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit IAuthTabCallback(final viva.republica.toss.network.model.transfer.TransferSendResponse r11, final viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet r12, final o.CommonModule_setLeftEdgeTouchEnabled r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r1 = r1 + 117
            int r2 = r1 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            viva.republica.toss.network.model.transfer.TransferResultPage r2 = r11.onNavigationEvent()
            viva.republica.toss.network.model.transfer.TransferResultPage$Display r2 = (viva.republica.toss.network.model.transfer.TransferResultPage.Display) r2
            java.lang.String r2 = r2.onActivityResized()
            r13.onExtraCallback(r2)
            viva.republica.toss.network.model.transfer.TransferResultPage r2 = r11.onNavigationEvent()
            viva.republica.toss.network.model.transfer.TransferResultPage$Display r2 = (viva.republica.toss.network.model.transfer.TransferResultPage.Display) r2
            java.lang.String r2 = r2.asInterface()
            r13.IAuthTabCallback(r2)
            viva.republica.toss.network.model.transfer.TransferResultPage r2 = r11.onNavigationEvent()
            viva.republica.toss.network.model.transfer.TransferResultPage$Display r2 = (viva.republica.toss.network.model.transfer.TransferResultPage.Display) r2
            viva.republica.toss.network.model.transfer.TransferResultPage$BottomCTALayout r2 = r2.onTransact()
            if (r2 == 0) goto L6b
            viva.republica.toss.network.model.transfer.TransferResultPage$ButtonLayout r2 = r2.onWarmupCompleted()
            if (r2 == 0) goto L6b
            int r3 = viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackStubProxy
            int r3 = r3 + 97
            int r4 = r3 % 128
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.ICustomTabsCallbackDefault = r4
            int r3 = r3 % r0
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            int r4 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r8 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r10 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            int r6 = im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted()
            r5 = -1301264508(0xffffffffb2704784, float:-1.3986099E-8)
            r9 = 1301264509(0x4d8fb87d, float:3.0140406E8)
            java.lang.Object r0 = viva.republica.toss.network.model.transfer.TransferResultPage.ButtonLayout.onExtraCallback(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L69
            goto L6b
        L69:
            r3 = r0
            goto L6c
        L6b:
            r3 = r1
        L6c:
            r4 = 0
            r5 = 0
            viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda39 r6 = new viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda39
            r6.<init>()
            r7 = 6
            r8 = 0
            r2 = r13
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r11 = o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r13, r11}
            int r3 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r0 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r6 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            int r4 = com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult()
            r5 = -675760947(0xffffffffd7b8b4cd, float:-4.0617335E14)
            r1 = 675760957(0x28474b3d, float:1.1063034E-14)
            o.CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.IAuthTabCallback(viva.republica.toss.network.model.transfer.TransferSendResponse, viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet, o.CommonModule_setLeftEdgeTouchEnabled):kotlin.Unit");
    }

    private static final Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.alert_error_timeout_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.alert_error_timeout_message));
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.alert_error_timeout_title));
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.alert_error_timeout_message));
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            int iOnExtraCallbackWithResult5 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult5, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
            int iOnExtraCallbackWithResult6 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult6, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super InitSessionKeyResponse>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ TransferTossMoneyBottomSheet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(access13800 access13800Var, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
            super(2, access13800Var);
            this.this$0 = transferTossMoneyBottomSheet;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(access13800Var, this.this$0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super InitSessionKeyResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ReactMethod.onNavigationEvent.onExtraCallbackWithResult();
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29426), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, 24734 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29425), ExpandableListView.getPackedPositionType(0L) + 22, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24735, 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    InitSessionKeyRequest initSessionKeyRequest = new InitSessionKeyRequest((String) null, TransferTossMoneyBottomSheet.writeTypedObject(this.this$0), 1, (DefaultConstructorMarker) null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.onNavigationEvent(initSessionKeyRequest, (access13800<? super BaseApiResponse<InitSessionKeyResponse>>) this);
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
                        return (InitSessionKeyResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.InitSessionKeyResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(InitSessionKeyResponse.class, Object.class) || Intrinsics.areEqual(InitSessionKeyResponse.class, Unit.class)) {
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

    private static final Unit asBinder(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(o.access13800<? super viva.republica.toss.network.model.transfer.InitSessionKeyResponse> r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onNavigationEvent(o.access13800):java.lang.Object");
    }

    public static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TransferSendResponse>, Object> {
        final /* synthetic */ ReactContextRCTDeviceEventEmitter.onExtraCallback $receiver$inlined;
        final /* synthetic */ TransferSendRequest $request$inlined;
        final /* synthetic */ String $sessionKey$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(access13800 access13800Var, String str, ReactContextRCTDeviceEventEmitter.onExtraCallback onextracallback, TransferSendRequest transferSendRequest) {
            super(2, access13800Var);
            this.$sessionKey$inlined = str;
            this.$receiver$inlined = onextracallback;
            this.$request$inlined = transferSendRequest;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TransferSendResponse> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new asInterface(access13800Var, this.$sessionKey$inlined, this.$receiver$inlined, this.$request$inlined);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ReactMethod.onExtraCallback(ReactMethod.onNavigationEvent, this.$sessionKey$inlined, true, false, this.$receiver$inlined, (String) null, 4, (Object) null);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - ExpandableListView.getPackedPositionType(0L)), (Process.myPid() >> 22) + 22, 24735 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - KeyEvent.normalizeMetaState(0)), Process.getGidForName("") + 23, 24733 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    TransferSendRequest transferSendRequest = this.$request$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.onWarmupCompleted(transferSendRequest, (access13800<? super BaseApiResponse<TransferSendResponse>>) this);
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
                        return (TransferSendResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.TransferSendResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(TransferSendResponse.class, Object.class) || Intrinsics.areEqual(TransferSendResponse.class, Unit.class)) {
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

    private static final Unit IAuthTabCallbackStub(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 69;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackStubProxy + 99;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(viva.republica.toss.network.model.transfer.TransferSendRequest r25, o.access13800<? super viva.republica.toss.network.model.transfer.TransferSendResponse> r26) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onNavigationEvent(viva.republica.toss.network.model.transfer.TransferSendRequest, o.access13800):java.lang.Object");
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TransferSignatureDto>, Object> {
        final /* synthetic */ long $amount;
        final /* synthetic */ TypeUtils2 $certifiedCredential;
        final /* synthetic */ boolean $forceSend;
        final /* synthetic */ ReactContextRCTDeviceEventEmitter.onNavigationEvent.IAuthTabCallback $receiver;
        final /* synthetic */ ReactIgnorableMountingException $sender;
        final /* synthetic */ InitSessionKeyResponse $sessionKeyResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(ReactIgnorableMountingException reactIgnorableMountingException, ReactContextRCTDeviceEventEmitter.onNavigationEvent.IAuthTabCallback iAuthTabCallback, long j, boolean z, InitSessionKeyResponse initSessionKeyResponse, TypeUtils2 typeUtils2, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sender = reactIgnorableMountingException;
            this.$receiver = iAuthTabCallback;
            this.$amount = j;
            this.$forceSend = z;
            this.$sessionKeyResponse = initSessionKeyResponse;
            this.$certifiedCredential = typeUtils2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onWarmupCompleted(String str, String str2) {
            return str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(this.$sender, this.$receiver, this.$amount, this.$forceSend, this.$sessionKeyResponse, this.$certifiedCredential, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TransferSignatureDto> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            final String strOnExtraCallbackWithResult = initializeMessageQueueThreads.onExtraCallbackWithResult.onExtraCallbackWithResult(this.$sender, this.$receiver, this.$amount, "", this.$forceSend, (String) null, (getCurrentActivity) null, false, (String) null);
            ReactMethod reactMethod = ReactMethod.onNavigationEvent;
            reactMethod.onNavigationEvent(this.$sessionKeyResponse.onNavigationEvent(), this.$certifiedCredential.asInterface());
            String strOnWarmupCompleted = this.$certifiedCredential.onExtraCallback(new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$buildSendRequest$signatureDto$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.IAuthTabCallback.onWarmupCompleted(strOnExtraCallbackWithResult, (String) obj2);
                }
            }).onWarmupCompleted();
            reactMethod.IAuthTabCallback(this.$sessionKeyResponse.onNavigationEvent(), strOnWarmupCompleted.length() > 0, this.$certifiedCredential.asInterface());
            return new TransferSignatureDto(strOnExtraCallbackWithResult, strOnWarmupCompleted, userDrivenScrollEnded.Companion.onNavigationEvent(this.$certifiedCredential.asInterface()), NativeAnimatedModuleExternalSyntheticLambda3.onNavigationEvent(this.$certifiedCredential.IAuthTabCallback()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onWarmupCompleted(viva.republica.toss.network.model.transfer.InitSessionKeyResponse r47, o.onDisclaimerClick r48, long r49, o.TypeUtils2 r51, o.access13800<? super viva.republica.toss.network.model.transfer.TransferSendRequest> r52) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onWarmupCompleted(viva.republica.toss.network.model.transfer.InitSessionKeyResponse, o.onDisclaimerClick, long, o.TypeUtils2, o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        TypeUtils7 typeUtils7 = (TypeUtils7) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        typeUtils7.onNavigationEvent(((BaseTextView) onNavigationEvent(-374176713, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 374176715, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet})).getText().toString());
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 51;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unit;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 55;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 21;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            unit = Unit.INSTANCE;
            int i3 = 6 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallbackDefault + 117;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(initializeLifecycleEventListenersForViewTag initializelifecycleeventlistenersforviewtag, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, TypeUtils2 typeUtils2) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(typeUtils2);
            initializelifecycleeventlistenersforviewtag.onExtraCallbackWithResult(typeUtils2);
            transferTossMoneyBottomSheet.onExtraCallback(initializelifecycleeventlistenersforviewtag, keyBoardVisiblePoint, j);
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallbackDefault + 61;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNull(typeUtils2);
        initializelifecycleeventlistenersforviewtag.onExtraCallbackWithResult(typeUtils2);
        transferTossMoneyBottomSheet.onExtraCallback(initializelifecycleeventlistenersforviewtag, keyBoardVisiblePoint, j);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 79;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        BaseActivity baseActivity;
        String string;
        boolean z;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 125;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            baseActivity = transferTossMoneyBottomSheet.onNavigationEvent;
            string = transferTossMoneyBottomSheet.getContext().getString(R.string.send_request_in_progress);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = true;
        } else {
            baseActivity = transferTossMoneyBottomSheet.onNavigationEvent;
            string = transferTossMoneyBottomSheet.getContext().getString(R.string.send_request_in_progress);
            Intrinsics.checkNotNullExpressionValue(string, "");
            z = false;
        }
        baseActivity.onNavigationEvent(string, z);
        return Unit.INSTANCE;
    }

    private static final void onPostMessage(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.onNavigationEvent.bo_();
        int i4 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private final void onExtraCallback(initializeLifecycleEventListenersForViewTag initializelifecycleeventlistenersforviewtag, final KeyBoardVisiblePoint keyBoardVisiblePoint, final long j) throws Throwable {
        int i = 2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getTapTimeout() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, View.resolveSize(0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1550062933);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 29427), Gravity.getAbsoluteGravity(0, 0) + 22, 24734 - View.MeasureSpec.makeMeasureSpec(0, 0), 1831136197, false, "readTypedObject", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback = ((onPaused) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult(initializelifecycleeventlistenersforviewtag).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda4
                public final Object invoke(Object obj2) {
                    Object[] objArr = {this.f$0, (deserializeUriNullableCollection) obj2};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(-421884076, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 421884096, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda5
                public final void accept(Object obj2) throws Throwable {
                    Object[] objArr = {function1, obj2};
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    TransferTossMoneyBottomSheet.onNavigationEvent(1792103494, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1792103493, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
                }
            }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda6
                public final void run() {
                    TransferTossMoneyBottomSheet.IAuthTabCallbackStub(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda7
                public final Object invoke(Object obj2) {
                    return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(this.f$0, (Throwable) obj2);
                }
            }, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda8
                public final Object invoke(Object obj2) {
                    TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = this.f$0;
                    KeyBoardVisiblePoint keyBoardVisiblePoint2 = keyBoardVisiblePoint;
                    Long lValueOf = Long.valueOf(j);
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(-1467705186, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1467705213, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, keyBoardVisiblePoint2, lValueOf, (TransferResp) obj2});
                }
            });
            int i2 = ICustomTabsCallbackDefault + 125;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        boolean z;
        String str;
        int i;
        TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = (TransferTossMoneyBottomSheet) objArr[0];
        KeyBoardVisiblePoint keyBoardVisiblePoint = (KeyBoardVisiblePoint) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        DialogInterface dialogInterface = (DialogInterface) objArr[3];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 75;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            z = false;
            str = null;
            i = 19;
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            z = false;
            str = null;
            i = 8;
        }
        onExtraCallbackWithResult(transferTossMoneyBottomSheet, keyBoardVisiblePoint, jLongValue, z, str, i, null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(ApiServerError apiServerError, final TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, final KeyBoardVisiblePoint keyBoardVisiblePoint, final long j, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(apiServerError.asBinder());
        String strIAuthTabCallbackDefault = apiServerError.IAuthTabCallbackDefault();
        if (strIAuthTabCallbackDefault.length() <= 0) {
            int i2 = ICustomTabsCallbackStubProxy + 121;
            int i3 = i2 % 128;
            ICustomTabsCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            strIAuthTabCallbackDefault = null;
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(strIAuthTabCallbackDefault);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda48
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onNavigationEvent(this.f$0, keyBoardVisiblePoint, j, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Dialog, viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object IAuthTabCallbackStubProxy(java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.IAuthTabCallbackStubProxy(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 31;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 67;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.alert_error_timeout_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.alert_error_timeout_message));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                return (Unit) TransferTossMoneyBottomSheet.onNavigationEvent(1410663404, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1410663397, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{(DialogInterface) obj});
            }
        })};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackDefault + 33;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, Throwable th) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult onextracallbackwithresult = CommonModule_setLeftEdgeTouchEnabled.Companion;
        Context context = transferTossMoneyBottomSheet.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, context, (initMiniApp) null, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda20
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onWarmupCompleted((CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        }, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallbackStubProxy + 121;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static /* synthetic */ void onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, ApiServerError apiServerError, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 87;
        int i4 = i3 % 128;
        ICustomTabsCallbackStubProxy = i4;
        if (i3 % 2 == 0 ? (i & 4) != 0 : (i & 4) != 0) {
            int i5 = i4 + 97;
            ICustomTabsCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 5;
            }
            apiServerError = null;
        }
        transferTossMoneyBottomSheet.onNavigationEvent(keyBoardVisiblePoint, j, apiServerError);
    }

    private static final void onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 121;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.onExtraCallbackWithResult(keyBoardVisiblePoint, j);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 9;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, false, null, 8, null);
        int i4 = ICustomTabsCallbackStubProxy + 33;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 87;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            i = 6;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            i = 8;
        }
        view.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 37;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f A[PHI: r4
      0x009f: PHI (r4v13 java.util.Map) = (r4v12 java.util.Map), (r4v16 java.util.Map) binds: [B:14:0x009d, B:11:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(final o.KeyBoardVisiblePoint r35, final long r36, im.toss.network.throwable.ApiServerError r38) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet.onNavigationEvent(o.KeyBoardVisiblePoint, long, im.toss.network.throwable.ApiServerError):void");
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        int i = 0;
        View view = (View) objArr[0];
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
        view.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallbackDefault + 31;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 107;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            typeUtils7.onNavigationEvent("자동이체를 등록합니다.");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        typeUtils7.onNavigationEvent("자동이체를 등록합니다.");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private final void onExtraCallbackWithResult(final KeyBoardVisiblePoint keyBoardVisiblePoint, final long j) {
        int i = 2 % 2;
        shortValue.onWarmupCompleted onwarmupcompleted = shortValue.Companion;
        BaseActivity baseActivity = this.onNavigationEvent;
        writeRaw writerawOnWarmupCompleted = shortValue.onWarmupCompleted(onwarmupcompleted, baseActivity, UTF8Decoder.PERIODIC_TRANSFER_POST, 9L, baseActivity, false, false, false, false, (String) null, (decodeArrayLoop) null, new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.IAuthTabCallback((TypeUtils7) obj);
            }
        }, 1008, (Object) null);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda22
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(this.f$0, j, keyBoardVisiblePoint, (TypeUtils2) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda23
            public final void accept(Object obj) throws Throwable {
                Object[] objArr = {function1, obj};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                TransferTossMoneyBottomSheet.onNavigationEvent(-327066548, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 327066577, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda25
            public final void accept(Object obj) {
                TransferTossMoneyBottomSheet.access100(function12, obj);
            }
        });
        int i2 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 81;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ long $amount;
        final /* synthetic */ PeriodicTransferPostParam $param;
        final /* synthetic */ KeyBoardVisiblePoint $primaryAccount;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStubProxy(PeriodicTransferPostParam periodicTransferPostParam, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$param = periodicTransferPostParam;
            this.$primaryAccount = keyBoardVisiblePoint;
            this.$amount = j;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return TransferTossMoneyBottomSheet.this.new IAuthTabCallbackStubProxy(this.$param, this.$primaryAccount, this.$amount, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super PeriodicTransferModel>, Object> {
            final /* synthetic */ PeriodicTransferPostParam $param$inlined;
            int I$0;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, PeriodicTransferPostParam periodicTransferPostParam) {
                super(2, access13800Var);
                this.$param$inlined = periodicTransferPostParam;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super PeriodicTransferModel> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(access13800Var, this.$param$inlined);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.combineMeasuredStates(0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 22, 24734 - KeyEvent.getDeadChar(0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29426), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 24734, 1913081575, false, "extraCallback", new Class[0]);
                        }
                        onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        PeriodicTransferPostParam periodicTransferPostParam = this.$param$inlined;
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = onseekengaged.onExtraCallbackWithResult(periodicTransferPostParam, (access13800<? super BaseApiResponse<PeriodicTransferModel>>) this);
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
                            return (PeriodicTransferModel) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.periodic.PeriodicTransferModel");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(PeriodicTransferModel.class, Object.class) || Intrinsics.areEqual(PeriodicTransferModel.class, Unit.class)) {
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

        /* JADX WARN: Type inference failed for: r2v6, types: [android.app.Dialog, java.lang.Object, viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet] */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    BaseActivity.IAuthTabCallback(TransferTossMoneyBottomSheet.extraCallback(TransferTossMoneyBottomSheet.this), (String) null, false, 1, (Object) null);
                    PeriodicTransferPostParam periodicTransferPostParam = this.$param;
                    Result.Companion companion = Result.Companion;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    onNavigationEvent onnavigationevent = new onNavigationEvent(null, periodicTransferPostParam);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
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
                obj2 = Result.constructor-impl(objOnExtraCallback);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            TransferTossMoneyBottomSheet.extraCallback(TransferTossMoneyBottomSheet.this).bo_();
            TransferTossMoneyBottomSheet transferTossMoneyBottomSheet = TransferTossMoneyBottomSheet.this;
            KeyBoardVisiblePoint keyBoardVisiblePoint = this.$primaryAccount;
            long j = this.$amount;
            if (Result.onNavigationEvent(obj2)) {
                TdsToastV1.onNavigationEvent.onNavigationEvent(new TdsToastV1.onNavigationEvent(TransferTossMoneyBottomSheet.extraCallback(transferTossMoneyBottomSheet), "자동이체를 등록했어요"), R.drawable.icn_success_color, 0, 2, (Object) null).onNavigationEvent();
                TransferTossMoneyBottomSheet.onExtraCallbackWithResult(transferTossMoneyBottomSheet, keyBoardVisiblePoint, j, false, null, 8, null);
            }
            ?? r2 = TransferTossMoneyBottomSheet.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                String str = (String) toArrayList.onWarmupCompleted(1160439371, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), -1160439368, new Object[]{toArrayList.onWarmupCompleted, th}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
                if (str != null && str.length() != 0) {
                    int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                    SessionTrackerb.onExtraCallbackWithResult((SessionTrackerb) TransferTossMoneyBottomSheet.onNavigationEvent(614721837, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -614721823, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{r2}), r2.getContext(), str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                } else {
                    onJsBridgeReady.onNavigationEvent(TransferTossMoneyBottomSheet.extraCallback((TransferTossMoneyBottomSheet) r2), "자동이체를 등록하지 못했어요", 0, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final void onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 35;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, long j, KeyBoardVisiblePoint keyBoardVisiblePoint, TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        onDisclaimerClick ondisclaimerclick = transferTossMoneyBottomSheet.extraCallbackWithResult;
        Intrinsics.checkNotNull(ondisclaimerclick);
        PeriodicTransferPostParam periodicTransferPostParam = new PeriodicTransferPostParam();
        periodicTransferPostParam.ICustomTabsCallback(PlayerErrorCode.onPostMessage());
        periodicTransferPostParam.onWarmupCompleted(j);
        Integer intOrNull = StringsKt.toIntOrNull(ondisclaimerclick.asInterface());
        int iIntValue = -1;
        periodicTransferPostParam.onExtraCallbackWithResult(intOrNull != null ? intOrNull.intValue() : -1);
        periodicTransferPostParam.extraCallback(ondisclaimerclick.onExtraCallbackWithResult());
        PeriodicTransferPostParam.onNavigationEvent(new Object[]{periodicTransferPostParam, fromBundle.BANK_ACCOUNT}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 317825029, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -317825024);
        PeriodicTransferPostParam.onNavigationEvent(new Object[]{periodicTransferPostParam, keyBoardVisiblePoint.bP_()}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1615634664, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1615634657);
        Integer intOrNull2 = StringsKt.toIntOrNull(keyBoardVisiblePoint.asInterface());
        if (intOrNull2 != null) {
            int i2 = ICustomTabsCallbackDefault + 5;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                intOrNull2.intValue();
                throw null;
            }
            iIntValue = intOrNull2.intValue();
            int i3 = ICustomTabsCallbackDefault + 121;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 3;
            }
        }
        periodicTransferPostParam.onWarmupCompleted(iIntValue);
        periodicTransferPostParam.onWarmupCompleted(PlayerErrorCode.onPostMessage());
        PeriodicTransferPostParam.onNavigationEvent(new Object[]{periodicTransferPostParam, makeNativeObject.TRANSFER.getValue()}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 1921580702, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1921580701);
        periodicTransferPostParam.onNavigationEvent(userDrivenScrollEnded.Companion.onNavigationEvent(typeUtils2.asInterface()));
        Intrinsics.checkNotNull(typeUtils2);
        periodicTransferPostParam.onExtraCallbackWithResult(typeUtils2);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(transferTossMoneyBottomSheet.onNavigationEvent), (CoroutineContext) null, (setRandomHost) null, transferTossMoneyBottomSheet.new IAuthTabCallbackStubProxy(periodicTransferPostParam, keyBoardVisiblePoint, j, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            unit = Unit.INSTANCE;
            int i3 = 89 / 0;
        } else {
            unit = Unit.INSTANCE;
        }
        int i4 = ICustomTabsCallbackDefault + 125;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static /* synthetic */ void onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault + 43;
        int i4 = i3 % 128;
        ICustomTabsCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if ((i & 8) != 0) {
            int i6 = i4 + 101;
            ICustomTabsCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 77;
            ICustomTabsCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            str = "";
        }
        transferTossMoneyBottomSheet.onNavigationEvent(keyBoardVisiblePoint, j, z, str);
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 121;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStubProxy = i2 % 128;
        BaseActivity.IAuthTabCallback(transferTossMoneyBottomSheet.onNavigationEvent, (String) null, false, i2 % 2 != 0 ? 5 : 3, (Object) null);
        return Unit.INSTANCE;
    }

    private static final void onActivityLayout(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        transferTossMoneyBottomSheet.onNavigationEvent.bo_();
        int i4 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 77;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private final void onNavigationEvent(final KeyBoardVisiblePoint keyBoardVisiblePoint, final long j, final boolean z, final String str) {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.IAuthTabCallback(this.f$0, (ycxExternalSyntheticLambda1) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda29
            public final void accept(Object obj) throws Throwable {
                Object[] objArr = {function1, obj};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                TransferTossMoneyBottomSheet.onNavigationEvent(-367418279, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 367418309, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
            }
        }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda30
            public final void run() throws Throwable {
                Object[] objArr = {this.f$0};
                int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
                TransferTossMoneyBottomSheet.onNavigationEvent(1925542433, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1925542415, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda31
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(this.f$0, keyBoardVisiblePoint, j, z, str, (Pair) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda32
            public final void accept(Object obj) throws Throwable {
                TransferTossMoneyBottomSheet.onWarmupCompleted(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda33
            public final Object invoke(Object obj) {
                return TransferTossMoneyBottomSheet.onExtraCallbackWithResult(this.f$0, keyBoardVisiblePoint, j, z, str, (Throwable) obj);
            }
        };
        jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.dashboard.primaryAccount.TransferTossMoneyBottomSheet$$ExternalSyntheticLambda34
            public final void accept(Object obj) throws Throwable {
                TransferTossMoneyBottomSheet.onTransact(function13, obj);
            }
        });
        int i2 = ICustomTabsCallbackDefault + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 67;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallbackDefault + 125;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (PageShowPoint.Companion.onTransact() != null) {
                transferTossMoneyBottomSheet.dismiss();
                transferTossMoneyBottomSheet.asBinder.invoke(keyBoardVisiblePoint, Long.valueOf(j), Boolean.valueOf(z), str);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallbackDefault + 73;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        PageShowPoint.Companion.onTransact();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, boolean z, String str, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (PageShowPoint.Companion.onTransact() != null) {
            int i4 = ICustomTabsCallbackStubProxy + 79;
            ICustomTabsCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                transferTossMoneyBottomSheet.dismiss();
                transferTossMoneyBottomSheet.asBinder.invoke(keyBoardVisiblePoint, Long.valueOf(j), Boolean.valueOf(z), str);
                throw null;
            }
            transferTossMoneyBottomSheet.dismiss();
            transferTossMoneyBottomSheet.asBinder.invoke(keyBoardVisiblePoint, Long.valueOf(j), Boolean.valueOf(z), str);
            int i5 = ICustomTabsCallbackDefault + 19;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ void onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1925542433, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1925542415, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
    }

    public static /* synthetic */ Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(1410663404, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1410663397, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{dialogInterface});
    }

    public static /* synthetic */ Unit onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1475023513, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1475023516, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, deserializeurinullablecollection});
    }

    public static /* synthetic */ Unit onExtraCallback(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-446782363, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 446782396, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{commonModule_setLeftEdgeTouchEnabled});
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-367418279, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 367418309, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, AdOptionsViewApi.onExtraCallback onextracallback) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1086337939, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1086337971, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function0, onextracallback});
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-660036784, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 660036803, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public static /* synthetic */ void onExtraCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, DialogInterface dialogInterface) throws Throwable {
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j), dialogInterface};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-1802302335, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1802302352, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1792103494, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1792103493, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit IAuthTabCallback(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-421884076, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 421884096, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, deserializeurinullablecollection});
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, TransferResp transferResp) {
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j), transferResp};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1467705186, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1467705213, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, TypeUtils7 typeUtils7) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(1573993946, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1573993922, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, typeUtils7});
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-327066548, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 327066577, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    public static final /* synthetic */ String writeTypedObject(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (String) onNavigationEvent(-1148028548, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1148028579, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
    }

    public static final /* synthetic */ SessionTrackerb readTypedObject(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (SessionTrackerb) onNavigationEvent(614721837, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -614721823, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
    }

    public static final /* synthetic */ Object onNavigationEvent(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, onDisclaimerClick ondisclaimerclick, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, access13800 access13800Var) {
        Object[] objArr = {transferTossMoneyBottomSheet, ondisclaimerclick, keyBoardVisiblePoint, Long.valueOf(j), access13800Var};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return onNavigationEvent(1605397736, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1605397723, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final void access000(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(134571343, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -134571331, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1936686147, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1936686122, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-669439769, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 669439778, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{dialogInterface});
    }

    private static final Unit onExtraCallbackWithResult(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, TransferResp transferResp) {
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j), transferResp};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(661013333, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -661013322, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, KeyBoardVisiblePoint keyBoardVisiblePoint, long j, DialogInterface dialogInterface) {
        Object[] objArr = {transferTossMoneyBottomSheet, keyBoardVisiblePoint, Long.valueOf(j), dialogInterface};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(1868799537, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1868799514, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private final void onExtraCallbackWithResult(Function1<? super getButtonBorderColor, Unit> function1) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1596607034, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1596607019, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this, function1});
    }

    private final ConstraintLayout onMinimized() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (ConstraintLayout) onNavigationEvent(-198808973, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 198808979, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this});
    }

    private final BaseTextView ICustomTabsCallbackStub() {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (BaseTextView) onNavigationEvent(-374176713, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 374176715, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this});
    }

    private static final Unit IAuthTabCallback(TransferSendResponse transferSendResponse, TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled, DialogInterface dialogInterface) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1891389779, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1891389789, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferSendResponse, transferTossMoneyBottomSheet, commonModule_setLeftEdgeTouchEnabled, dialogInterface});
    }

    private final void IAuthTabCallback(long j) throws Throwable {
        Object[] objArr = {this, Long.valueOf(j)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(-119813531, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 119813536, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1284510128, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1284510120, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{function1, obj});
    }

    private static final ConstraintLayout ICustomTabsCallbackStub(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (ConstraintLayout) onNavigationEvent(1579536905, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1579536877, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
    }

    private final void onWarmupCompleted(KeyBoardVisiblePoint keyBoardVisiblePoint, long j) throws Throwable {
        Object[] objArr = {this, keyBoardVisiblePoint, Long.valueOf(j)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(398234363, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -398234342, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr);
    }

    private static final Unit onWarmupCompleted(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, TypeUtils7 typeUtils7) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(495968423, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -495968401, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, typeUtils7});
    }

    private static final Unit IAuthTabCallbackDefault(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(-1569042724, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1569042740, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet, deserializeurinullablecollection});
    }

    private static final Unit onExtraCallbackWithResult(View view) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(924260071, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -924260045, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{view});
    }

    private static final ConstraintLayout ICustomTabsService(TransferTossMoneyBottomSheet transferTossMoneyBottomSheet) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (ConstraintLayout) onNavigationEvent(-1874233776, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, 1874233776, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{transferTossMoneyBottomSheet});
    }

    public final void onExtraCallbackWithResult() throws Throwable {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(1013760100, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback2, -1013760096, iIAuthTabCallback, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{this});
    }

    static void onWarmupCompleted() {
        onMessageChannelReady = 7798559133331975163L;
        onMinimized = -1776194565;
        onPostMessage = (char) 56561;
    }
}
