package viva.republica.toss.send;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_GetPublicKeyAlgorithmType;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.GeckoHubImp;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.PerformanceCounter;
import o.ReactIgnorableMountingException;
import o.ReactMarkerMarkerListener;
import o.ReactMethod;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.Type;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14300;
import o.access15400;
import o.deserializeUriNullableCollection;
import o.filterCreatePageParams;
import o.findResAndMsg;
import o.getParamImp;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onCollectWhenDestroy;
import o.onPageExit;
import o.onSeekEngaged;
import o.putChannelInfo;
import o.r8lambdahyx9jcINTsok0QhKqPwRDX7N9k;
import o.setRandomHost;
import o.setRead;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.DepositTargetTabListRequest;
import viva.republica.toss.network.model.transfer.DepositTargetTabListResponse;
import viva.republica.toss.network.model.transfer.InitSessionKeyRequest;
import viva.republica.toss.network.model.transfer.InitSessionKeyResponse;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.MyAccountInfoDto;
import viva.republica.toss.network.model.transfer.MyAccountInfoRequest;
import viva.republica.toss.network.model.transfer.TransferMydataOnboardingRequest;
import viva.republica.toss.network.model.transfer.TransferReserveKeyInfoResponse;
import viva.republica.toss.send.v4.TransferSendActivity;
import viva.republica.toss.send.v4.receiver.TransferReceiverTabActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SendActivity extends Hilt_SendActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 0;
    private static long getInterfaceDescriptor = 0;
    public static final int onTransact;
    private static int writeTypedObject = 1;
    private InitSessionKeyResponse access000;
    private Uri asInterface;

    @Inject
    public Type mydataHelper;

    @Inject
    public SessionTrackerb tossRouter;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new access000(this));
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.send.SendActivity$$ExternalSyntheticLambda2
        public final Object invoke(Object obj) {
            return SendActivity.onWarmupCompleted(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });
    private final CoroutineExceptionHandler IAuthTabCallbackStub = new IAuthTabCallbackStubProxy(CoroutineExceptionHandler.extraCallbackWithResult, this);

    static final class IAuthTabCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendActivity.onNavigationEvent(SendActivity.this, (access13800) this);
        }
    }

    static final class asBinder extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendActivity.IAuthTabCallback(SendActivity.this, null, null, this);
        }
    }

    static final class asInterface extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {SendActivity.this, null, this};
            return SendActivity.onNavigationEvent(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1809792443, zzaq.onNavigationEvent(), -1809792442, objArr);
        }
    }

    static final class onTransact extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {SendActivity.this, null, null, null, this};
            return SendActivity.onNavigationEvent(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 451727824, zzaq.onNavigationEvent(), -451727820, objArr);
        }
    }

    static {
        setEngagementSignalsCallback();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        int i = access100 + 81;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i3) | i8)) | i9;
        int i11 = i6 | i4;
        int i12 = (~(i3 | i8)) | i9;
        int i13 = i6 + i4 + i2 + (1258674323 * i5) + ((-126594725) * i);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i6) + 1954676736 + ((-212912869) * i4) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i2) + (881065984 * i5) + ((-991690752) * i) + ((-541982720) * i14);
        int i16 = ((i6 * (-1656160718)) - 817430035) + (i4 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i2 * (-1656160097)) + (i5 * (-2121497779)) + (i * 1378977669) + (i14 * (-275906560));
        switch (i15 + (i16 * i16 * (-372375552))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(sendActivity, dialogInterface);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SendActivity sendActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sendActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SendActivity sendActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sendActivity, iEngagementSignalsCallbackDefault);
        int i4 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 1;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public static final class access000 implements Function0<CERT_GetPublicKeyAlgorithmType> {
        final /* synthetic */ Activity onWarmupCompleted;

        public access000(Activity activity) {
            this.onWarmupCompleted = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CERT_GetPublicKeyAlgorithmType invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_GetPublicKeyAlgorithmType.onNavigationEvent(layoutInflater);
        }
    }

    public static final class IAuthTabCallbackStubProxy extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        final /* synthetic */ SendActivity onWarmupCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStubProxy(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, SendActivity sendActivity) {
            super(onwarmupcompleted);
            this.onWarmupCompleted = sendActivity;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, viva.republica.toss.send.SendActivity] */
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SendActivity", setRead.onExtraCallback(th), (Throwable) null, (Map) null, 12, (Object) null);
            ?? r2 = this.onWarmupCompleted;
            getParamImp.onWarmupCompleted(th, (Context) r2, false, (initMiniApp) null, (Function0) null, new onExtraCallback(), 14, (Object) null);
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(getInterfaceDescriptor ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(getInterfaceDescriptor)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 84 - (ViewConfiguration.getFadingEdgeLength() >> 16), 21233 - (ViewConfiguration.getFadingEdgeLength() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 19 - TextUtils.getCapsMode("", 0, 0), 8808 - Color.alpha(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 73;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public static final /* synthetic */ Object IAuthTabCallback(SendActivity sendActivity, ReactIgnorableMountingException.IAuthTabCallback iAuthTabCallback, String str, access13800 access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = sendActivity.onExtraCallback(iAuthTabCallback, str, access13800Var);
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        String str = (String) objArr[1];
        access13800<? super TransferReserveKeyInfoResponse> access13800Var = (access13800) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            sendActivity.onExtraCallbackWithResult(str, access13800Var);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = sendActivity.onExtraCallbackWithResult(str, access13800Var);
        int i3 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 90 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ void IAuthTabCallback(SendActivity sendActivity, String str, Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.onExtraCallback(str, function1);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        InitSessionKeyResponse initSessionKeyResponse = (InitSessionKeyResponse) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 53;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        sendActivity.access000 = initSessionKeyResponse;
        int i5 = i2 + 99;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ Uri onExtraCallback(SendActivity sendActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Uri uri = sendActivity.asInterface;
        int i5 = i3 + 3;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return uri;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        String str = (String) objArr[1];
        onCollectWhenDestroy oncollectwhendestroy = (onCollectWhenDestroy) objArr[2];
        String str2 = (String) objArr[3];
        access13800 access13800Var = (access13800) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        Object objOnNavigationEvent = onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1831168984, iOnNavigationEvent3, 1831168987, new Object[]{sendActivity, str, oncollectwhendestroy, str2, access13800Var});
        int i4 = IAuthTabCallbackStubProxy + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ CERT_GetPublicKeyAlgorithmType onExtraCallbackWithResult(SendActivity sendActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            sendActivity.ICustomTabsServiceStub();
            throw null;
        }
        CERT_GetPublicKeyAlgorithmType cERT_GetPublicKeyAlgorithmTypeICustomTabsServiceStub = sendActivity.ICustomTabsServiceStub();
        int i3 = IAuthTabCallbackStubProxy + 99;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return cERT_GetPublicKeyAlgorithmTypeICustomTabsServiceStub;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(SendActivity sendActivity, Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        sendActivity.asInterface = uri;
        int i5 = i3 + 103;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(SendActivity sendActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.onNavigationEvent(deserializeurinullablecollection);
        int i4 = IAuthTabCallback_Parcel + 63;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    public static final /* synthetic */ Uri onNavigationEvent(SendActivity sendActivity, Uri uri, Integer num, String str, Long l, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            sendActivity.onNavigationEvent(uri, num, str, l, bool);
            throw null;
        }
        Uri uriOnNavigationEvent = sendActivity.onNavigationEvent(uri, num, str, l, bool);
        int i3 = IAuthTabCallbackStubProxy + 67;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return uriOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(SendActivity sendActivity, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = sendActivity.IAuthTabCallback((access13800<? super InitSessionKeyResponse>) access13800Var);
        int i4 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return objIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        Uri uri = (Uri) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Uri uriOnNavigationEvent = sendActivity.onNavigationEvent(uri, iIntValue, str);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 51;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return uriOnNavigationEvent;
    }

    public static final /* synthetic */ void onNavigationEvent(SendActivity sendActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.updateVisuals();
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(SendActivity sendActivity, boolean z, InitSessionKeyResponse initSessionKeyResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.IAuthTabCallback(z, initSessionKeyResponse);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ InitSessionKeyResponse onWarmupCompleted(SendActivity sendActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        InitSessionKeyResponse initSessionKeyResponse = sendActivity.access000;
        if (i4 != 0) {
            int i5 = 92 / 0;
        }
        int i6 = i3 + 119;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return initSessionKeyResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(SendActivity sendActivity, TransferMydataOnboardingRequest transferMydataOnboardingRequest) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.onExtraCallbackWithResult(transferMydataOnboardingRequest);
        int i4 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        SendActivity sendActivity = (SendActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        SessionTrackerb sessionTrackerb = sendActivity.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = IAuthTabCallback_Parcel + 33;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        int i7 = i3 + 21;
        int i8 = i7 % 128;
        IAuthTabCallbackStubProxy = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 123;
        IAuthTabCallback_Parcel = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
        }
        return sessionTrackerb;
    }

    public final Type IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Type type = this.mydataHelper;
        if (type == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return type;
    }

    private final CERT_GetPublicKeyAlgorithmType ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CERT_GetPublicKeyAlgorithmType cERT_GetPublicKeyAlgorithmType = (CERT_GetPublicKeyAlgorithmType) this.IAuthTabCallbackDefault.getValue();
        int i4 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return cERT_GetPublicKeyAlgorithmType;
        }
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return "SendActivity";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class getInterfaceDescriptor extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SendActivity.this.new getInterfaceDescriptor(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            InitSessionKeyResponse initSessionKeyResponseOnWarmupCompleted = SendActivity.onWarmupCompleted(SendActivity.this);
            if (initSessionKeyResponseOnWarmupCompleted != null) {
                SendActivity.onNavigationEvent(SendActivity.this, false, initSessionKeyResponseOnWarmupCompleted);
            } else {
                SendActivity.this.finish();
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(SendActivity sendActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(sendActivity), (CoroutineContext) null, (setRandomHost) null, sendActivity.new getInterfaceDescriptor(null), 3, (Object) null);
        } else if (iEngagementSignalsCallbackDefault.onNavigationEvent() == 0) {
            int i2 = IAuthTabCallbackStubProxy + 119;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                sendActivity.finish();
                int i3 = 56 / 0;
            } else {
                sendActivity.finish();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 7;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallback implements Function1<DialogInterface, Unit> {
        onExtraCallback() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((DialogInterface) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(DialogInterface dialogInterface) {
            SendActivity.this.finish();
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        IAuthTabCallback_Parcel(access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SendActivity.this.new IAuthTabCallback_Parcel(access13800Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws im.toss.network.throwable.TossApiCallException.ApiError {
            /*
                Method dump skipped, instructions count: 567
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.IAuthTabCallback_Parcel.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(SendActivity sendActivity, InitSessionKeyResponse initSessionKeyResponse, boolean z) {
            SendActivity.onNavigationEvent(sendActivity, z, initSessionKeyResponse);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.send.Hilt_SendActivity
    public void onCreate(@Nullable Bundle bundle) {
        String dataString;
        int i = 2 % 2;
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStub().getRoot());
        if (getIntent().getDataString() == null) {
            dataString = getIntent().getStringExtra("schemeUri");
        } else {
            dataString = getIntent().getDataString();
            int i2 = IAuthTabCallbackStubProxy + 1;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        if (dataString == null) {
            dataString = "";
        }
        Uri uri = Uri.parse(dataString);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        this.asInterface = uri;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), this.IAuthTabCallbackStub, (setRandomHost) null, new IAuthTabCallback_Parcel(null), 2, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super InitSessionKeyResponse>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onExtraCallbackWithResult = {27255, 27173, 27179, 27179, 27173, 27196, 27173, 27173};
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ SendActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, SendActivity sendActivity) {
            super(2, access13800Var);
            this.this$0 = sendActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var, this.this$0);
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super InitSessionKeyResponse> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                ReactMethod.onNavigationEvent.onExtraCallbackWithResult();
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29426), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, 24734 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Uri uri = null;
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29426), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, 24734 - (Process.myTid() >> 22), 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    Uri uriOnExtraCallback = SendActivity.onExtraCallback(this.this$0);
                    if (uriOnExtraCallback == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        uriOnExtraCallback = null;
                    }
                    String queryParameter = uriOnExtraCallback.getQueryParameter("origin");
                    Uri uriOnExtraCallback2 = SendActivity.onExtraCallback(this.this$0);
                    if (uriOnExtraCallback2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        uri = uriOnExtraCallback2;
                    }
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 8, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1}, objArr);
                    InitSessionKeyRequest initSessionKeyRequest = new InitSessionKeyRequest(queryParameter, uri.getQueryParameter(((String) objArr[0]).intern()));
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
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            if (!((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
                TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                if (apiErrorExtraCallbackWithResult == null) {
                    throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                }
                throw apiErrorExtraCallbackWithResult;
            }
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
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

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = onExtraCallbackWithResult;
            long j = 0;
            float f = 0.0f;
            if (cArr != null) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 35282), 34 - ExpandableListView.getPackedPositionChild(j), 14238 - TextUtils.lastIndexOf("", '0'), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i9++;
                        j = 0;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i10 = $10 + 71;
                    $11 = i10 % 128;
                    if (i10 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 29 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17657 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10935), 65 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollBarSize() >> 8)), View.resolveSize(0, 0) + 70, MotionEvent.axisFromString("") + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                int i13 = $10 + 59;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    char[] cArr5 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr5, 1, i4);
                    System.arraycopy(cArr5, 0, cArr3, i4 - i6, i6);
                    System.arraycopy(cArr5, i6, cArr3, 1, i4 << i6);
                } else {
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr3, 0, cArr6, 0, i4);
                    int i14 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr3, i14, i6);
                    System.arraycopy(cArr6, i6, cArr3, 0, i14);
                }
            }
            if (z) {
                int i15 = $10 + 21;
                $11 = i15 % 128;
                int i16 = 2;
                int i17 = i15 % 2;
                char[] cArr7 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i18 = $10 + 9;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i20 = $11 + 123;
                    $10 = i20 % 128;
                    int i21 = i20 % i16;
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    i16 = 2;
                }
                int i22 = $10 + 33;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                cArr3 = cArr7;
            }
            if (i5 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i24 = $10 + 15;
                    $11 = i24 % 128;
                    if (i24 % 2 == 0) {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] >>> iArr[5]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    } else {
                        cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                        i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                    }
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ boolean $mydataJustRegistered;
        final /* synthetic */ InitSessionKeyResponse $sessionKeyRes;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(InitSessionKeyResponse initSessionKeyResponse, boolean z, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$sessionKeyRes = initSessionKeyResponse;
            this.$mydataJustRegistered = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return SendActivity.this.new access100(this.$sessionKeyRes, this.$mydataJustRegistered, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Context, viva.republica.toss.send.SendActivity] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context, viva.republica.toss.send.SendActivity] */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Intent intentOnNavigationEvent;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            Uri uri = null;
            try {
            } catch (WebResourceResponseModel e) {
                Result.Companion companion = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                PerformanceCounter.onExtraCallbackWithResult onextracallbackwithresult = PerformanceCounter.Companion;
                Uri uriOnExtraCallback = SendActivity.onExtraCallback(SendActivity.this);
                if (uriOnExtraCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    uriOnExtraCallback = null;
                }
                Intent intent = SendActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "");
                if (onextracallbackwithresult.IAuthTabCallback(uriOnExtraCallback, intent)) {
                    ReactMarkerMarkerListener.onNavigationEvent.onWarmupCompleted();
                    TransferSendActivity.onExtraCallback onextracallback = TransferSendActivity.Companion;
                    ?? r0 = SendActivity.this;
                    Uri uriOnExtraCallback2 = SendActivity.onExtraCallback((SendActivity) r0);
                    if (uriOnExtraCallback2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        uri = uriOnExtraCallback2;
                    }
                    intentOnNavigationEvent = onextracallback.onWarmupCompleted((Context) r0, uri.toString(), this.$sessionKeyRes);
                    intentOnNavigationEvent.putExtra("mydataJustRegistered", this.$mydataJustRegistered);
                    intentOnNavigationEvent.addFlags(67108864);
                    intentOnNavigationEvent.addFlags(33554432);
                    SendActivity.this.startActivity(intentOnNavigationEvent);
                    SendActivity.this.finish();
                    return Unit.INSTANCE;
                }
                Uri uriOnExtraCallback3 = SendActivity.onExtraCallback(SendActivity.this);
                if (uriOnExtraCallback3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    uriOnExtraCallback3 = null;
                }
                ReactIgnorableMountingException.IAuthTabCallback iAuthTabCallbackOnExtraCallback = onextracallbackwithresult.onExtraCallback(uriOnExtraCallback3);
                DepositTargetTabListRequest.OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount = iAuthTabCallbackOnExtraCallback != null ? new DepositTargetTabListRequest.OverseasTransferWithdrawalAccount(iAuthTabCallbackOnExtraCallback.onExtraCallbackWithResult(), iAuthTabCallbackOnExtraCallback.IAuthTabCallback()) : null;
                SendActivity sendActivity = SendActivity.this;
                Result.Companion companion3 = Result.Companion;
                GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                onNavigationEvent onnavigationevent = new onNavigationEvent(null, overseasTransferWithdrawalAccount, sendActivity);
                this.L$0 = access15400.onNavigationEvent(iAuthTabCallbackOnExtraCallback);
                this.L$1 = access15400.onNavigationEvent(overseasTransferWithdrawalAccount);
                this.L$2 = access15400.onNavigationEvent(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.label = 1;
                obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
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
            if (Result.onExtraCallback(obj2)) {
                obj2 = null;
            }
            DepositTargetTabListResponse depositTargetTabListResponse = (DepositTargetTabListResponse) obj2;
            TransferReceiverTabActivity.onExtraCallbackWithResult onextracallbackwithresult2 = TransferReceiverTabActivity.Companion;
            ?? r6 = SendActivity.this;
            Uri uriOnExtraCallback4 = SendActivity.onExtraCallback((SendActivity) r6);
            if (uriOnExtraCallback4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                uri = uriOnExtraCallback4;
            }
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            intentOnNavigationEvent = TransferReceiverTabActivity.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult2, (Context) r6, string, this.$sessionKeyRes, (String) null, depositTargetTabListResponse, 8, (Object) null);
            intentOnNavigationEvent.putExtra("mydataJustRegistered", this.$mydataJustRegistered);
            intentOnNavigationEvent.addFlags(67108864);
            intentOnNavigationEvent.addFlags(33554432);
            SendActivity.this.startActivity(intentOnNavigationEvent);
            SendActivity.this.finish();
            return Unit.INSTANCE;
        }

        public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super DepositTargetTabListResponse>, Object> {
            final /* synthetic */ DepositTargetTabListRequest.OverseasTransferWithdrawalAccount $request$inlined;
            int I$0;
            Object L$0;
            int label;
            final /* synthetic */ SendActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(access13800 access13800Var, DepositTargetTabListRequest.OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount, SendActivity sendActivity) {
                super(2, access13800Var);
                this.$request$inlined = overseasTransferWithdrawalAccount;
                this.this$0 = sendActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(access13800Var, this.$request$inlined, this.this$0);
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super DepositTargetTabListResponse> access13800Var) {
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
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 22, 24734 - View.resolveSizeAndState(0, 0, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                    }
                    Uri uri = null;
                    Object obj2 = ((Field) objOnExtraCallback).get(null);
                    try {
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Gravity.getAbsoluteGravity(0, 0)), 22 - View.resolveSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 24734, 1913081575, false, "extraCallback", new Class[0]);
                        }
                        onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                        r8lambdahyx9jcINTsok0QhKqPwRDX7N9k r8lambdahyx9jcintsok0qhkqpwrdx7n9k = r8lambdahyx9jcINTsok0QhKqPwRDX7N9k.TRANSFER;
                        DepositTargetTabListRequest.OverseasTransferWithdrawalAccount overseasTransferWithdrawalAccount = this.$request$inlined;
                        PerformanceCounter.onExtraCallbackWithResult onextracallbackwithresult = PerformanceCounter.Companion;
                        Uri uriOnExtraCallback = SendActivity.onExtraCallback(this.this$0);
                        if (uriOnExtraCallback == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            uri = uriOnExtraCallback;
                        }
                        DepositTargetTabListRequest depositTargetTabListRequest = new DepositTargetTabListRequest(r8lambdahyx9jcintsok0qhkqpwrdx7n9k, overseasTransferWithdrawalAccount, onextracallbackwithresult.IAuthTabCallback(uri));
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = onseekengaged.onWarmupCompleted(depositTargetTabListRequest, (access13800<? super BaseApiResponse<DepositTargetTabListResponse>>) this);
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
                            return (DepositTargetTabListResponse) objOnTransact;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.DepositTargetTabListResponse");
                    } catch (NullPointerException e) {
                        if (Intrinsics.areEqual(DepositTargetTabListResponse.class, Object.class) || Intrinsics.areEqual(DepositTargetTabListResponse.class, Unit.class)) {
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
    }

    private final void IAuthTabCallback(boolean z, InitSessionKeyResponse initSessionKeyResponse) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new access100(initSessionKeyResponse, z, null), 3, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    private final Uri onNavigationEvent(Uri uri, int i, String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 113;
        int i4 = i3 % 128;
        IAuthTabCallbackStubProxy = i4;
        int i5 = i3 % 2;
        if (i > 0) {
            int i6 = i4 + 33;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                if (str.length() > 0) {
                    return (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{(Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{filterCreatePageParams.onExtraCallbackWithResult(filterCreatePageParams.onExtraCallbackWithResult(uri, "bankCodeFrom", String.valueOf(i)), "accountNoFrom", str), "accountFrom"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971), "accountTypeFrom"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
                }
            } else {
                str.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return uri;
    }

    private final Uri onNavigationEvent(Uri uri, Integer num, String str, Long l, Boolean bool) throws Throwable {
        Uri uriOnExtraCallbackWithResult;
        int i = 2 % 2;
        if (num == null || str == null) {
            uriOnExtraCallbackWithResult = uri;
        } else {
            int i2 = IAuthTabCallbackStubProxy + 49;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            Uri uri2 = (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{filterCreatePageParams.onExtraCallbackWithResult(filterCreatePageParams.onExtraCallbackWithResult(uri, "bankCode", String.valueOf(num.intValue())), "accountNo", str), "toMyTossAccountId"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
            Object[] objArr = new Object[1];
            a(new char[]{28932, 1167, 21801, 46646, 29046, 42613, 4212, 20878, 64273, 10722, 39670, 50205}, AndroidCharacter.getMirror('0') - '/', objArr);
            uriOnExtraCallbackWithResult = (Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{(Uri) filterCreatePageParams.onWarmupCompleted(new Object[]{uri2, ((String) objArr[0]).intern()}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971), "phone"}, -1629497967, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1629497971);
            int i4 = IAuthTabCallback_Parcel + 21;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        if (l != null) {
            int i6 = IAuthTabCallback_Parcel + 67;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            if (l.longValue() > 0) {
                int i8 = IAuthTabCallbackStubProxy + 105;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                uriOnExtraCallbackWithResult = filterCreatePageParams.onExtraCallbackWithResult(uriOnExtraCallbackWithResult, "amount", String.valueOf(l.longValue()));
            }
        }
        if (bool == null) {
            return uriOnExtraCallbackWithResult;
        }
        int i10 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStubProxy = i10 % 128;
        if (i10 % 2 != 0) {
            return filterCreatePageParams.onExtraCallbackWithResult(uriOnExtraCallbackWithResult, "fixedAmount", String.valueOf(bool.booleanValue()));
        }
        filterCreatePageParams.onExtraCallbackWithResult(uriOnExtraCallbackWithResult, "fixedAmount", String.valueOf(bool.booleanValue()));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x058d  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, o.TextFieldScrollKtExternalSyntheticLambda0, viva.republica.toss.send.SendActivity] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v61, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallback(java.lang.String r14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.onExtraCallback(java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallback(o.ReactIgnorableMountingException.IAuthTabCallback r15, java.lang.String r16, o.access13800<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r17) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.onExtraCallback(o.ReactIgnorableMountingException$IAuthTabCallback, java.lang.String, o.access13800):java.lang.Object");
    }

    public static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super MyAccountInfoDto>, Object> {
        final /* synthetic */ MyAccountInfoRequest $request$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(access13800 access13800Var, MyAccountInfoRequest myAccountInfoRequest) {
            super(2, access13800Var);
            this.$request$inlined = myAccountInfoRequest;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super MyAccountInfoDto> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackDefault(access13800Var, this.$request$inlined);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - TextUtils.indexOf("", "")), ExpandableListView.getPackedPositionGroup(0L) + 22, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.getDefaultSize(0, 0) + 22, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24735, 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    MyAccountInfoRequest myAccountInfoRequest = this.$request$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.IAuthTabCallback(myAccountInfoRequest, (access13800<? super BaseApiResponse<MyAccountInfoDto>>) this);
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
                        return (MyAccountInfoDto) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.MyAccountInfoDto");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(MyAccountInfoDto.class, Object.class) || Intrinsics.areEqual(MyAccountInfoDto.class, Unit.class)) {
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r21) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisuals() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        SessionTrackerb sessionTrackerb = (SessionTrackerb) onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 688338556, iOnNavigationEvent3, -688338550, new Object[]{this});
        Object[] objArr = new Object[1];
        a(new char[]{25026, 39950, 36677, 47857, 25009, 16100, 51723, 23881, 60364, 45409, 16528, 51419, 30025, 11171, 54620, 17931, 65218, 56943, 27542, 15822, 18497, 20711, 57358, 43854, 54657, 52072, 30358, 9948, 24395, 32253, 2818, 39963, 43209, 61539, 33157, 3039, 12867, 27139, 5695, 33061, 49136, 7314, 44272, 31905, 2420, 38669, 8481, 59947}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(new char[]{36353, 32739, 65025, 32544, 36467, 56601, 47961, 39064, 1039, 21130, 12766, 3339}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        builderBuildUpon.appendQueryParameter(((String) objArr2[0]).intern(), "TRANSFER_START");
        Unit unit = Unit.INSTANCE;
        SessionTrackerb.onNavigationEvent(sessionTrackerb, this, builderBuildUpon.build().toString(), this.asBinder, (Bundle) null, 8, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(TransferMydataOnboardingRequest transferMydataOnboardingRequest) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{43529, 27579, 59544, 41970, 43642, 51537, 44502, 17482, 8199, 18132, 10061, 53720, 48770, 56342, 45697, 24328, 13577, 10714, 3147, 9421, 33674, 42834, 34771, 45645, 7754, 15581, 4427, 16351, 38016, 35400, 27871, 34072, 25375, 2013, 58973, 4826, 63898, 40368, 29155, 38973, 29744, 60196, 52013, 26018, 49855, 24760, 18172, 62248}, -ExpandableListView.getPackedPositionChild(0L), objArr);
        Uri.Builder builderBuildUpon = Uri.parse(((String) objArr[0]).intern()).buildUpon();
        Object[] objArr2 = new Object[1];
        a(new char[]{36353, 32739, 65025, 32544, 36467, 56601, 47961, 39064, 1039, 21130, 12766, 3339}, (Process.myTid() >> 22) + 1, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Intent intent = getIntent();
        Object[] objArr3 = new Object[1];
        a(new char[]{36353, 32739, 65025, 32544, 36467, 56601, 47961, 39064, 1039, 21130, 12766, 3339}, '1' - AndroidCharacter.getMirror('0'), objArr3);
        builderBuildUpon.appendQueryParameter(strIntern, intent.getStringExtra(((String) objArr3[0]).intern()));
        Integer numOnWarmupCompleted = transferMydataOnboardingRequest.onWarmupCompleted();
        Object obj = null;
        builderBuildUpon.appendQueryParameter("bankCode", numOnWarmupCompleted != null ? String.valueOf(numOnWarmupCompleted.intValue()) : null);
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        SessionTrackerb.onNavigationEvent((SessionTrackerb) onNavigationEvent(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent, 688338556, zzaq.onNavigationEvent(), -688338550, new Object[]{this}), this, string, this.asBinder, (Bundle) null, 8, (Object) null);
        int i4 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(SendActivity sendActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super viva.republica.toss.network.model.transfer.InitSessionKeyResponse> r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    public static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super TransferReserveKeyInfoResponse>, Object> {
        final /* synthetic */ String $reserveKey$inlined;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(access13800 access13800Var, String str) {
            super(2, access13800Var);
            this.$reserveKey$inlined = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallbackStub(access13800Var, this.$reserveKey$inlined);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super TransferReserveKeyInfoResponse> access13800Var) {
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 29426), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, View.MeasureSpec.getMode(0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1128771703);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.resolveSize(0, 0)), 22 - (KeyEvent.getMaxKeyCode() >> 16), 24734 - (ViewConfiguration.getEdgeSlop() >> 16), 1913081575, false, "extraCallback", new Class[0]);
                    }
                    onSeekEngaged onseekengaged = (onSeekEngaged) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    String str = this.$reserveKey$inlined;
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = onseekengaged.onNavigationEvent(str, (access13800<? super BaseApiResponse<TransferReserveKeyInfoResponse>>) this);
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
                        return (TransferReserveKeyInfoResponse) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.transfer.TransferReserveKeyInfoResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(TransferReserveKeyInfoResponse.class, Object.class) || Intrinsics.areEqual(TransferReserveKeyInfoResponse.class, Unit.class)) {
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

    private static final Unit IAuthTabCallback(SendActivity sendActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        sendActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(java.lang.String r12, o.access13800<? super viva.republica.toss.network.model.transfer.TransferReserveKeyInfoResponse> r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.send.SendActivity.onExtraCallbackWithResult(java.lang.String, o.access13800):java.lang.Object");
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intent = new Intent(context, (Class<?>) SendActivity.class);
            intent.putExtra("schemeUri", str);
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SendActivity sendActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (Unit) onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -784468003, iOnNavigationEvent3, 784468003, new Object[]{sendActivity, dialogInterface});
    }

    public static final /* synthetic */ Object onExtraCallback(SendActivity sendActivity, String str, onCollectWhenDestroy oncollectwhendestroy, String str2, access13800 access13800Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 451727824, iOnNavigationEvent3, -451727820, new Object[]{sendActivity, str, oncollectwhendestroy, str2, access13800Var});
    }

    public static final /* synthetic */ Object onNavigationEvent(SendActivity sendActivity, String str, access13800 access13800Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 1809792443, iOnNavigationEvent3, -1809792442, new Object[]{sendActivity, str, access13800Var});
    }

    public static final /* synthetic */ void IAuthTabCallback(SendActivity sendActivity, InitSessionKeyResponse initSessionKeyResponse) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1918662838, iOnNavigationEvent3, 1918662843, new Object[]{sendActivity, initSessionKeyResponse});
    }

    public static final /* synthetic */ Uri onExtraCallback(SendActivity sendActivity, Uri uri, int i, String str) {
        Object[] objArr = {sendActivity, uri, Integer.valueOf(i), str};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Uri) onNavigationEvent(zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), iOnNavigationEvent, -1747164294, zzaq.onNavigationEvent(), 1747164296, objArr);
    }

    private final Object onExtraCallback(String str, onCollectWhenDestroy oncollectwhendestroy, String str2, access13800<? super MyAccountInfo> access13800Var) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, -1831168984, iOnNavigationEvent3, 1831168987, new Object[]{this, str, oncollectwhendestroy, str2, access13800Var});
    }

    public final SessionTrackerb onNavigationEvent() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (SessionTrackerb) onNavigationEvent(zzaq.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, 688338556, iOnNavigationEvent3, -688338550, new Object[]{this});
    }

    @Override // viva.republica.toss.send.Hilt_SendActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // viva.republica.toss.send.Hilt_SendActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStubProxy + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.send.Hilt_SendActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = IAuthTabCallbackStubProxy + 11;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.send.Hilt_SendActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    static void setEngagementSignalsCallback() {
        getInterfaceDescriptor = 7239373245559331219L;
    }
}
