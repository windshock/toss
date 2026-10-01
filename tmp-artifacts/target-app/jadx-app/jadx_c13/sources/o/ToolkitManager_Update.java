package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.CollectPerformancePoint;
import o.JsonReaderUnknownNumberParsing;
import o.NativeAdScrollView;
import o.TabBarInfoQueryPointOnTabBarInfoQueryListener;
import o.ToolkitManager_Update;
import o.deserializeIp;
import o.getDescriptionTextSize;
import o.onMediaDownloaded;
import o.setButtonColor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.R;
import viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda18;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ToolkitManager_Update {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final int onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    private final Lazy IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToolkitManager_Update.onWarmupCompleted();
        }
    });

    static final class onExtraCallback extends Throwable {
    }

    static {
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        onNavigationEvent = 8;
        int i = asBinder + 51;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ List IAuthTabCallback(List list, CollectPerformancePoint collectPerformancePoint) throws onExtraCallback {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List listOnNavigationEvent = onNavigationEvent(list, collectPerformancePoint);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return listOnNavigationEvent;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(HashMap map, TypeUtils2 typeUtils2, setButtonColor.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(map, typeUtils2, onextracallbackwithresult);
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 804886999, -804886995, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = onExtraCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            access100(function1, obj);
            throw null;
        }
        List listAccess100 = access100(function1, obj);
        int i3 = onExtraCallbackWithResult + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return listAccess100;
    }

    public static /* synthetic */ List IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        List listIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, obj);
        int i4 = onExtraCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return listIAuthTabCallbackDefault;
    }

    public static /* synthetic */ deserializeIp asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp interfaceDescriptor = getInterfaceDescriptor(function1, obj);
        int i4 = onExtraCallbackWithResult + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ deserializeIp asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipOnExtraCallback;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | (~i6))) | (~(i4 | i3 | i6));
        int i10 = (~(i8 | i6)) | (~(i8 | i4));
        int i11 = (~(i6 | i3)) | i4;
        int i12 = i4 + i3 + i5 + (1661237432 * i) + (961048624 * i2);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i4) - 281083904) + ((-1329838950) * i3) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i5) + ((-1559232512) * i) + (1553989632 * i2) + (2020540416 * i13);
        int i15 = (i4 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i5 * (-2040814133)) + (i * (-1614655000)) + (i2 * 500164112) + (i13 * 184877056);
        switch (i14 + (i15 * i15 * 1800994816)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                ToolkitManager_Update toolkitManager_Update = (ToolkitManager_Update) objArr[0];
                int i16 = 2 % 2;
                int i17 = onExtraCallbackWithResult + 23;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                DomainConfigProxy domainConfigProxy = (DomainConfigProxy) toolkitManager_Update.IAuthTabCallback.getValue();
                int i19 = onExtraCallback + 47;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                return domainConfigProxy;
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ List onExtraCallback(boolean z, List list) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(z, list);
        }
        onNavigationEvent(z, list);
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(Ref.IntRef intRef, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{intRef, th}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -332959785, 332959791, iOnNavigationEvent2, iOnNavigationEvent);
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipWriteTypedObject = writeTypedObject(function1, obj);
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipWriteTypedObject;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(boolean z, List list) {
        deserializeIp deserializeip;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserializeip = (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Boolean.valueOf(z), list}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1947652113, -1947652111, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
            int i3 = 66 / 0;
        } else {
            deserializeip = (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{Boolean.valueOf(z), list}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1947652113, -1947652111, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
        }
        int i4 = onExtraCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return deserializeip;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Ref.IntRef intRef, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent = onNavigationEvent(intRef, jsonReaderUnknownNumberParsing);
        int i4 = onExtraCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        HashMap map = (HashMap) objArr[0];
        TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult = (TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) objArr[5];
        boolean zBooleanValue4 = ((Boolean) objArr[6]).booleanValue();
        Integer num = (Integer) objArr[7];
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnExtraCallbackWithResult = onExtraCallbackWithResult(map, onextracallbackwithresult, zBooleanValue, zBooleanValue2, zBooleanValue3, onextracallbackwithresult2, zBooleanValue4, num);
        int i4 = onExtraCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeipOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(function1, obj);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallback_Parcel;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getDescriptionTextSize.onExtraCallback onextracallback = (getDescriptionTextSize.onExtraCallback) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(onextracallback, str);
        }
        onNavigationEvent(onextracallback, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DomainConfigProxy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DomainConfigProxy domainConfigProxyIAuthTabCallback = IAuthTabCallback();
        int i4 = onExtraCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return domainConfigProxyIAuthTabCallback;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(List list) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {list};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        deserializeIp deserializeip = (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1481833871, 1481833872, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
        int i4 = onExtraCallbackWithResult + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeip;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(List list, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(list, obj);
        }
        onNavigationEvent(list, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ deserializeIp onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipIAuthTabCallbackStubProxy;
    }

    private static final DomainConfigProxy IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DomainConfigProxy domainConfigProxyITrustedWebActivityCallbackDefault = ((isPartnerDomains) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), isPartnerDomains.class)).ITrustedWebActivityCallbackDefault();
        int i4 = onExtraCallbackWithResult + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return domainConfigProxyITrustedWebActivityCallbackDefault;
    }

    public final void onWarmupCompleted(@NotNull TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int iOnNavigationEvent = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent2 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            int iOnNavigationEvent3 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
            ((Boolean) DERConstructedSet.onWarmupCompleted(1404184340, iOnNavigationEvent, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent3, -1404184329, new Object[0])).booleanValue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int iOnNavigationEvent4 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent5 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        int iOnNavigationEvent6 = FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent();
        if (!((Boolean) DERConstructedSet.onWarmupCompleted(1404184340, iOnNavigationEvent4, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), iOnNavigationEvent5, iOnNavigationEvent6, -1404184329, new Object[0])).booleanValue()) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
            Object[] objArr = new Object[1];
            a(new int[]{0, 31, 148, 0}, false, new byte[]{1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0}, objArr);
            textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onNavigationEvent(((String) objArr[0]).intern(), true);
        }
        DERConstructedSet.onExtraCallback(onextracallbackwithresult, "when_withdrawal_agreement");
        int iOnNavigationEvent7 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent8 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        ((DomainConfigProxy) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -963878739, 963878742, iOnNavigationEvent8, iOnNavigationEvent7)).IAuthTabCallbackStub();
        DERConstructedSet.IAuthTabCallback(false, 1, (Object) null);
        int i3 = onExtraCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<setButtonColor.onExtraCallbackWithResult> apply(writeRaw<BaseApiResponse<setButtonColor.onExtraCallbackWithResult>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher(new Function1<BaseApiResponse<setButtonColor.onExtraCallbackWithResult>, deserializeIp<? extends setButtonColor.onExtraCallbackWithResult>>() { // from class: o.ToolkitManager_Update.IAuthTabCallback.2
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends setButtonColor.onExtraCallbackWithResult> invoke(BaseApiResponse<setButtonColor.onExtraCallbackWithResult> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = setButtonColor.onExtraCallbackWithResult.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class IAuthTabCallbackDefault<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onExtraCallbackWithResult = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<List<? extends onMediaDownloaded.onNavigationEvent>> apply(writeRaw<BaseApiResponse<List<? extends onMediaDownloaded.onNavigationEvent>>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher(new Function1<BaseApiResponse<List<? extends onMediaDownloaded.onNavigationEvent>>, deserializeIp<? extends List<? extends onMediaDownloaded.onNavigationEvent>>>() { // from class: o.ToolkitManager_Update.IAuthTabCallbackDefault.1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends List<? extends onMediaDownloaded.onNavigationEvent>> invoke(BaseApiResponse<List<? extends onMediaDownloaded.onNavigationEvent>> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = List.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallback;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallbackWithResult;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static final class asBinder<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public asBinder(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<Integer> apply(writeRaw<BaseApiResponse<Integer>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher(new Function1<BaseApiResponse<Integer>, deserializeIp<? extends Integer>>() { // from class: o.ToolkitManager_Update.asBinder.5
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Integer> invoke(BaseApiResponse<Integer> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Integer.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
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

    public static final class onTransact<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onExtraCallbackWithResult;

        public onTransact(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        @Override // o.deserializeUri
        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17$getNavigationEventDispatcher(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: o.ToolkitManager_Update.onTransact.3
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Object.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult((Throwable) apiErrorExtraCallbackWithResult);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onExtraCallback;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    public static /* synthetic */ writeRaw onExtraCallbackWithResult(ToolkitManager_Update toolkitManager_Update, TypeUtils2 typeUtils2, List list, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, boolean z3, onExtraCallbackWithResult onextracallbackwithresult2, boolean z4, int i, Object obj) {
        boolean z5;
        onExtraCallbackWithResult onextracallbackwithresult3;
        boolean z6;
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signAndRegisterAccount");
        }
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 32) != 0) {
            int i6 = i3 + 93;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 67;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            z5 = false;
        } else {
            z5 = z3;
        }
        if ((i & 64) != 0) {
            int i10 = onExtraCallback + 85;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            onextracallbackwithresult3 = null;
        } else {
            onextracallbackwithresult3 = onextracallbackwithresult2;
        }
        if ((i & 128) != 0) {
            int i12 = onExtraCallbackWithResult + 81;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            z6 = true;
        } else {
            z6 = z4;
        }
        return toolkitManager_Update.IAuthTabCallback(typeUtils2, list, onextracallbackwithresult, z, z2, z5, onextracallbackwithresult3, z6);
    }

    private static final deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    private static final String onNavigationEvent(getDescriptionTextSize.onExtraCallback onextracallback, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnNavigationEvent = onextracallback.onNavigationEvent();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.ChangeBundleLocationDialogExternalSyntheticLambda1 */
    private static final deserializeIp onExtraCallback(HashMap map, TypeUtils2 typeUtils2, setButtonColor.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        ArrayList<getDescriptionTextSize.onExtraCallback> arrayListOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        Iterator it = arrayListOnWarmupCompleted.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListOnWarmupCompleted, 10));
                for (final getDescriptionTextSize.onExtraCallback onextracallback : arrayListOnWarmupCompleted) {
                    arrayList.add(new didFailWithError(onextracallback.onExtraCallbackWithResult(), typeUtils2.onExtraCallback(new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object[] objArr = {onextracallback, (String) obj2};
                            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                            return (String) ToolkitManager_Update.onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -392043858, 392043863, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
                        }
                    }).onWarmupCompleted()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((didFailWithError) obj2).onExtraCallbackWithResult().length() > 0) {
                        int i2 = onExtraCallback + 19;
                        onExtraCallbackWithResult = i2 % 128;
                        if (i2 % 2 == 0) {
                            arrayList2.add(obj2);
                            int i3 = 78 / 0;
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                }
                List list = CollectionsKt___CollectionsKt.toList(arrayList2);
                if (list.isEmpty()) {
                    throw new ChangeBundleLocationDialogExternalSyntheticLambda1();
                }
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.MeasureSpec.getSize(0)), 21 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj3 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1083675162);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Color.alpha(0)), (KeyEvent.getMaxKeyCode() >> 16) + 22, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 24735, 1909943434, false, "extraCallbackWithResult", new Class[0]);
                    }
                    writeRaw writerawOnExtraCallbackWithResult = ((DevSupportManagerBaseExternalSyntheticLambda14) ((Method) objOnExtraCallback2).invoke(obj3, null)).onExtraCallbackWithResult(new DefaultDevLoadingViewImplementationExternalSyntheticLambda1(0L, list, 1, (DefaultConstructorMarker) null));
                    MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
                    Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
                    writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new asBinder(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
                    Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                    return writerawIAuthTabCallback;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            getDescriptionTextSize.onExtraCallback onextracallback2 = (getDescriptionTextSize.onExtraCallback) it.next();
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) map.get(onextracallback2.IAuthTabCallback());
            if (onwarmupcompleted != null) {
                int i4 = onExtraCallbackWithResult + 3;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    onwarmupcompleted.IAuthTabCallback(Long.valueOf(onextracallback2.onExtraCallbackWithResult()));
                    obj.hashCode();
                    throw null;
                }
                onwarmupcompleted.IAuthTabCallback(Long.valueOf(onextracallback2.onExtraCallbackWithResult()));
            }
        }
    }

    private static final deserializeIp writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = onExtraCallback + 71;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return deserializeip;
        }
        obj2.hashCode();
        throw null;
    }

    protected final writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> IAuthTabCallback(@NotNull final TypeUtils2 typeUtils2, @NotNull List<setDescriptionTextColor> list, @NotNull final TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, final boolean z, final boolean z2, final boolean z3, @Nullable final onExtraCallbackWithResult onextracallbackwithresult2, final boolean z4) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        final HashMap map = new HashMap();
        Iterator<T> it = list.iterator();
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                break;
            }
            setDescriptionTextColor setdescriptiontextcolor = (setDescriptionTextColor) it.next();
            String strValueOf = String.valueOf(setdescriptiontextcolor.onWarmupCompleted());
            map.put(strValueOf, new onWarmupCompleted(strValueOf, setdescriptiontextcolor));
            i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
        }
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Collection<onWarmupCompleted> collection = collectionValues;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (onWarmupCompleted onwarmupcompleted : collection) {
            arrayList.add(new getDescriptionTextSize.IAuthTabCallback(onwarmupcompleted.onExtraCallbackWithResult(), onwarmupcompleted.onNavigationEvent().onExtraCallbackWithResult(), onwarmupcompleted.onNavigationEvent().onExtraCallback()));
        }
        setAutoplay setautoplay = new setAutoplay(CollectionsKt___CollectionsKt.toList(arrayList), (NativeAdListener) null, 2, (DefaultConstructorMarker) null);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 29426), 22 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), 24734 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-32901893);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 29426), View.resolveSizeAndState(0, 0, 0) + 22, (ViewConfiguration.getEdgeSlop() >> 16) + 24734, -817296789, false, "onExtraCallbackWithResult", new Class[0]);
            }
            writeRaw writerawOnExtraCallback = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(setautoplay);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ToolkitManager_Update.IAuthTabCallback(map, typeUtils2, (setButtonColor.onExtraCallbackWithResult) obj2);
                }
            };
            writeRaw<List<TabBarInfoQueryPointOnTabBarInfoQueryListener>> writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda16
                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj2) {
                    return ToolkitManager_Update.asInterface(function1, obj2);
                }
            }).onExtraCallbackWithResult(new AccountAgreementHelper$$ExternalSyntheticLambda18(new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    HashMap map2 = map;
                    TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult;
                    boolean z5 = z;
                    boolean z6 = z2;
                    boolean z7 = z4;
                    ToolkitManager_Update.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult2;
                    boolean z8 = z3;
                    Boolean boolValueOf = Boolean.valueOf(z5);
                    Boolean boolValueOf2 = Boolean.valueOf(z6);
                    Boolean boolValueOf3 = Boolean.valueOf(z7);
                    Boolean boolValueOf4 = Boolean.valueOf(z8);
                    int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                    int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                    return (deserializeIp) ToolkitManager_Update.onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{map2, onextracallbackwithresult3, boolValueOf, boolValueOf2, boolValueOf3, onextracallbackwithresult4, boolValueOf4, (Integer) obj2}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 333644582, -333644582, iOnNavigationEvent2, iOnNavigationEvent);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            return writerawOnExtraCallbackWithResult;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final List IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = onExtraCallbackWithResult + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List onNavigationEvent(boolean z, List list) throws TossApiCallException.ApiError {
        Object next;
        String string;
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!z) {
            return list;
        }
        List list2 = list;
        Object obj = null;
        if (!(list2 instanceof Collection)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int i4 = onExtraCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    ((onMediaDownloaded.onNavigationEvent) it.next()).onNavigationEvent();
                    obj.hashCode();
                    throw null;
                }
                if (((onMediaDownloaded.onNavigationEvent) it.next()).onNavigationEvent()) {
                    return list;
                }
            }
        } else {
            int i5 = onExtraCallbackWithResult + 33;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (!list2.isEmpty()) {
            }
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                int i7 = onExtraCallbackWithResult + 67;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                next = null;
                break;
            }
            next = it2.next();
            String strOnWarmupCompleted = ((onMediaDownloaded.onNavigationEvent) next).onWarmupCompleted();
            if (strOnWarmupCompleted != null && strOnWarmupCompleted.length() > 0) {
                int i9 = onExtraCallback + 1;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                break;
            }
        }
        onMediaDownloaded.onNavigationEvent onnavigationevent = (onMediaDownloaded.onNavigationEvent) next;
        if (onnavigationevent != null) {
            int i11 = onExtraCallbackWithResult + 111;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                onnavigationevent.onWarmupCompleted();
                throw null;
            }
            string = onnavigationevent.onWarmupCompleted();
            if (string == null) {
                string = UserChoiceBillingListener.onExtraCallback.onExtraCallback().getString(R.string.app_autodebit_agreement_failed);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
        }
        throw new TossApiCallException.ApiError(string);
    }

    private static final deserializeIp IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final deserializeIp onNavigationEvent(List list, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(list);
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return writerawOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (!zBooleanValue) {
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(list);
            int i4 = onExtraCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return writerawOnExtraCallback;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), View.resolveSize(0, 0) + 22, 24733 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.combineMeasuredStates(0, 0)), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            writeRaw writerawOnExtraCallbackWithResult = FullScreenAd.onExtraCallbackWithResult((FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null), (setHidden) null, 1, (Object) null);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onTransact(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback.onWarmupCompleted(5000L, TimeUnit.MILLISECONDS).onWarmupCompleted((writeRaw) new BaseApiResponse()).onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda1
                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj2) {
                    return ToolkitManager_Update.onWarmupCompleted(list, obj2);
                }
            });
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final deserializeIp getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (deserializeIp) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static final deserializeIp onExtraCallbackWithResult(HashMap map, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, boolean z, final boolean z2, boolean z3, onExtraCallbackWithResult onextracallbackwithresult2, final boolean z4, Integer num) throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(num, "");
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((onWarmupCompleted) obj).onWarmupCompleted() != null) {
                int i2 = onExtraCallbackWithResult + 113;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            String strOnNavigationEvent = null;
            if (!it.hasNext()) {
                break;
            }
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) it.next();
            String strOnNavigationEvent2 = onwarmupcompleted.onNavigationEvent().onNavigationEvent();
            String strOnExtraCallbackWithResult = onwarmupcompleted.onNavigationEvent().onExtraCallbackWithResult();
            int iOnExtraCallback = onwarmupcompleted.onNavigationEvent().onExtraCallback();
            Long lOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
            Intrinsics.checkNotNull(lOnWarmupCompleted);
            long jLongValue = lOnWarmupCompleted.longValue();
            Long lValueOf = onextracallbackwithresult2 != null ? Long.valueOf(onextracallbackwithresult2.IAuthTabCallback()) : null;
            if (onextracallbackwithresult2 != null) {
                strOnExtraCallback = onextracallbackwithresult2.onExtraCallback();
            } else {
                int i6 = onExtraCallback + 73;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                strOnExtraCallback = null;
            }
            if (onextracallbackwithresult2 != null) {
                int i8 = onExtraCallbackWithResult + 25;
                onExtraCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    strOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                    int i9 = 88 / 0;
                } else {
                    strOnNavigationEvent = onextracallbackwithresult2.onNavigationEvent();
                }
            }
            arrayList2.add(new NativeAdScrollView.IAuthTabCallback(strOnNavigationEvent2, strOnExtraCallbackWithResult, iOnExtraCallback, jLongValue, lValueOf, strOnExtraCallback, strOnNavigationEvent));
        }
        NativeAdScrollView nativeAdScrollView = new NativeAdScrollView(Long.parseLong(PlayerErrorCode.onMinimized()), onextracallbackwithresult.name(), arrayList2, z, z2, z3);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 29426), (ViewConfiguration.getTouchSlop() >> 8) + 22, TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj2 = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-151691285);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29426), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, 24734 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), -944397957, false, "IAuthTabCallback", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj2, null)).IAuthTabCallback(nativeAdScrollView);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallbackDefault(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return ToolkitManager_Update.onExtraCallback(z4, (List) obj3);
                }
            };
            writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback2.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda8
                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj3) {
                    return ToolkitManager_Update.IAuthTabCallbackStub(function1, obj3);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return ToolkitManager_Update.onExtraCallbackWithResult(z2, (List) obj3);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writerawOnWarmupCompleted.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda10
                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj3) {
                    return ToolkitManager_Update.onWarmupCompleted(function12, obj3);
                }
            });
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return ToolkitManager_Update.onWarmupCompleted((List) obj3);
                }
            };
            return writerawOnExtraCallbackWithResult.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda12
                @Override // o.deserializeIntNullableCollection
                public final Object apply(Object obj3) {
                    return ToolkitManager_Update.asBinder(function13, obj3);
                }
            });
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static final List access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        List list = (List) function1.invoke(obj);
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static final List onNavigationEvent(List list, CollectPerformancePoint collectPerformancePoint) throws onExtraCallback {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(collectPerformancePoint, "");
        List listOnNavigationEvent = collectPerformancePoint.onNavigationEvent();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOnNavigationEvent.iterator();
        while (it.hasNext()) {
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNull(list);
                boolean z = list instanceof Collection;
                throw null;
            }
            Object next = it.next();
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) next;
            Intrinsics.checkNotNull(list);
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i3 = onExtraCallbackWithResult + 15;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    onMediaDownloaded.onNavigationEvent onnavigationevent = (onMediaDownloaded.onNavigationEvent) it2.next();
                    DERConstructedSet dERConstructedSet = DERConstructedSet.onNavigationEvent;
                    String strAsInterface = tabBarInfoQueryPointOnTabBarInfoQueryListener.asInterface();
                    String strBP_ = tabBarInfoQueryPointOnTabBarInfoQueryListener.bP_();
                    int iOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
                    if (dERConstructedSet.onWarmupCompleted(strAsInterface, strBP_, String.valueOf(iOnExtraCallbackWithResult), onnavigationevent.IAuthTabCallback())) {
                        int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            arrayList.add(next);
                            int i6 = 10 / 0;
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw new onExtraCallback();
        }
        return arrayList;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final List list = (List) objArr[0];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        writeRaw writerawIAuthTabCallback = disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback.IAuthTabCallback(true);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolkitManager_Update.IAuthTabCallback(list, (CollectPerformancePoint) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda4
            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                Object[] objArr2 = {function1, obj};
                int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
                return (List) ToolkitManager_Update.onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 73696087, -73696080, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolkitManager_Update.onExtraCallbackWithResult(intRef, (JsonReaderUnknownNumberParsing) obj);
            }
        };
        writeRaw writerawIAuthTabCallbackStub = writerawOnWarmupCompleted.IAuthTabCallbackStub(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda6
            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                return ToolkitManager_Update.IAuthTabCallback(function12, obj);
            }
        });
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return writerawIAuthTabCallbackStub;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = onExtraCallback + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(final Ref.IntRef intRef, JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolkitManager_Update.onExtraCallback(intRef, (Throwable) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsing.IAuthTabCallback(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda14
            @Override // o.deserializeIntNullableCollection
            public final Object apply(Object obj) {
                return ToolkitManager_Update.onNavigationEvent(function1, obj);
            }
        });
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return jsonReaderUnknownNumberParsingIAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        Ref.IntRef intRef = (Ref.IntRef) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            boolean z = th instanceof onExtraCallback;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        boolean z2 = th instanceof onExtraCallback;
        if (z2) {
            int i3 = onExtraCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = intRef.element + 1;
            intRef.element = i5;
            if (i5 <= 5) {
                int i6 = onExtraCallbackWithResult + 125;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return JsonReaderUnknownNumberParsing.onWarmupCompleted(1000L, TimeUnit.MILLISECONDS);
            }
        }
        if (!z2) {
            return JsonReaderUnknownNumberParsing.IAuthTabCallback(th);
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = JsonReaderUnknownNumberParsing.IAuthTabCallback(new IllegalStateException("등록중인 계좌를 찾을 수 없어요. 다시 시도해주세요."));
        int i8 = onExtraCallbackWithResult + 103;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return jsonReaderUnknownNumberParsingIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private final String IAuthTabCallback;
        private final long onExtraCallback;
        private final String onNavigationEvent;

        public onExtraCallbackWithResult(long j, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallback = j;
            this.onNavigationEvent = str;
            this.IAuthTabCallback = str2;
        }

        public final long IAuthTabCallback() {
            return this.onExtraCallback;
        }

        public final String onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final String onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted {
        private Long onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final setDescriptionTextColor onNavigationEvent;

        public onWarmupCompleted(@NotNull String str, @NotNull setDescriptionTextColor setdescriptiontextcolor) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(setdescriptiontextcolor, "");
            this.onExtraCallbackWithResult = str;
            this.onNavigationEvent = setdescriptiontextcolor;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final setDescriptionTextColor onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final void IAuthTabCallback(@Nullable Long l) {
            this.onExtraCallback = l;
        }

        public final Long onWarmupCompleted() {
            return this.onExtraCallback;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
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
        char[] cArr = onWarmupCompleted;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35283), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 35, 14238 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    c = '0';
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
            int i8 = $11 + 123;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $10 + 17;
                $11 = i10 % 128;
                if (i10 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 65 - Color.red(0), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 70, 12486 - Color.green(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            int i14 = $10 + 13;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i16 = $11 + 85;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent * i4];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 67;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] % iArr[5]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(HashMap map, TabBarInfoQueryPointOnTabBarInfoQueryListener.onExtraCallbackWithResult onextracallbackwithresult, boolean z, boolean z2, boolean z3, onExtraCallbackWithResult onextracallbackwithresult2, boolean z4, Integer num) {
        Object[] objArr = {map, onextracallbackwithresult, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), onextracallbackwithresult2, Boolean.valueOf(z4), num};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 333644582, -333644582, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    public static /* synthetic */ List onTransact(Function1 function1, Object obj) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (List) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 73696087, -73696080, iOnNavigationEvent2, iOnNavigationEvent);
    }

    public static /* synthetic */ String onExtraCallback(getDescriptionTextSize.onExtraCallback onextracallback, String str) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{onextracallback, str}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -392043858, 392043863, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private final DomainConfigProxy onExtraCallback() {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (DomainConfigProxy) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -963878739, 963878742, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final deserializeIp IAuthTabCallback(boolean z, List list) {
        Object[] objArr = {Boolean.valueOf(z), list};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 1947652113, -1947652111, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final deserializeIp onNavigationEvent(List list) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (deserializeIp) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{list}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -1481833871, 1481833872, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Ref.IntRef intRef, Throwable th) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{intRef, th}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -332959785, 332959791, iOnNavigationEvent2, iOnNavigationEvent);
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk access000(Function1 function1, Object obj) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{function1, obj}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 804886999, -804886995, iOnNavigationEvent2, iOnNavigationEvent);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{27185, 27314, 27469, 27470, 27320, 27317, 27471, 27464, 27465, 27315, 27314, 27313, 27316, 27314, 27468, 27465, 27470, 27313, 27314, 27322, 27323, 27317, 27470, 27319, 27322, 27320, 27321, 27315, 27464, 27467, 27467};
    }
}
