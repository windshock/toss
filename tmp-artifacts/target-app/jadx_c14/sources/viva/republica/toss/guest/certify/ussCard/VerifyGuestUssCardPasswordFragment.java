package viva.republica.toss.guest.certify.ussCard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.view.component.atom.text.SubTypography8;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DigestInfo;
import o.IssueCertificate;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.addAllCommandLine;
import o.addExtra;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.generateLink;
import o.getCornerRadius;
import o.getWrite;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.preFillDefault;
import o.runJSBundle;
import o.setMessageBytes;
import o.setRandomHost;
import o.setRipple;
import o.setShine;
import o.setWrite;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.securekey.SecureKeyboardView;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyGuestUssCardPasswordFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int asInterface;
    public static final int onNavigationEvent;
    private static char[] onTransact;
    private final getCornerRadius<String> asBinder;
    private final PageContext onExtraCallback;
    private onNavigationEvent onExtraCallbackWithResult;
    private final Lazy onWarmupCompleted;

    public interface onNavigationEvent {
        void IPostMessageService();

        void IPostMessageServiceDefault();
    }

    static {
        IAuthTabCallback();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyGuestUssCardPasswordFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthPasswordBinding;", 0)};
        Companion = new IAuthTabCallback(null);
        onNavigationEvent = 8;
        int i = access100 + 41;
        IAuthTabCallback_Parcel = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = (VerifyGuestUssCardPasswordFragment) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifyGuestUssCardPasswordFragment, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(verifyGuestUssCardPasswordFragment, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(verifyGuestUssCardPasswordFragment, commonModule_setLeftEdgeTouchEnabled);
        int i3 = asInterface + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(verifyGuestUssCardPasswordFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 43;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~(i3 | i4);
        int i8 = (~i5) | (~i4);
        int i9 = (~i8) | i3;
        int i10 = (~(i4 | i5)) | (~((~i3) | i5)) | (~(i8 | i3));
        int i11 = i5 + i3 + i2 + ((-101282902) * i6) + ((-829309908) * i);
        int i12 = i11 * i11;
        int i13 = ((i5 * 42798203) - 224002048) + (42798203 * i3) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i2) + (1710751744 * i6) + ((-1643118592) * i) + ((-1134166016) * i12);
        int i14 = (i5 * 1745018779) + 1790267665 + (i3 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i2 * 1745018721) + (i6 * (-1587019414)) + (i * (-1871011668)) + (i12 * 1017511936);
        int i15 = i13 + (i14 * i14 * (-1139146752));
        if (i15 == 1) {
            return onExtraCallback(objArr);
        }
        if (i15 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i15 == 4) {
            return IAuthTabCallback(objArr);
        }
        if (i15 != 5) {
            return onNavigationEvent(objArr);
        }
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = (VerifyGuestUssCardPasswordFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i16 = 2 % 2;
        int i17 = asInterface + 97;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(verifyGuestUssCardPasswordFragment, setDetectableSize);
        int i19 = IAuthTabCallbackStub + 43;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(verifyGuestUssCardPasswordFragment, dialogInterface);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(verifyGuestUssCardPasswordFragment, dialogInterface);
        int i3 = IAuthTabCallbackStub + 9;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = (VerifyGuestUssCardPasswordFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyGuestUssCardPasswordFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 45;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1206145296, iOnNavigationEvent, new Object[]{function1, obj}, 1206145297, iOnNavigationEvent3);
        int i4 = IAuthTabCallbackStub + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(verifyGuestUssCardPasswordFragment);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asInterface + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(verifyGuestUssCardPasswordFragment, th);
        }
        onExtraCallbackWithResult(verifyGuestUssCardPasswordFragment, th);
        throw null;
    }

    public static /* synthetic */ long onWarmupCompleted(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jAsInterface = asInterface(verifyGuestUssCardPasswordFragment);
        int i4 = IAuthTabCallbackStub + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return jAsInterface;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = (VerifyGuestUssCardPasswordFragment) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyGuestUssCardPasswordFragment, obj);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return 1265515L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VerifyGuestUssCardPasswordFragment() {
        super(R.layout.fragment_uss_card_auth_password);
        this.onExtraCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onExtraCallbackWithResult);
        this.asBinder = setShine.onNavigationEvent("");
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda1
            public final Object invoke() {
                return Long.valueOf(VerifyGuestUssCardPasswordFragment.onWarmupCompleted(this.f$0));
            }
        });
    }

    public static final /* synthetic */ IssueCertificate IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            verifyGuestUssCardPasswordFragment.onExtraCallback();
            obj.hashCode();
            throw null;
        }
        IssueCertificate issueCertificateOnExtraCallback = verifyGuestUssCardPasswordFragment.onExtraCallback();
        int i3 = asInterface + 95;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return issueCertificateOnExtraCallback;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        verifyGuestUssCardPasswordFragment.onExtraCallbackWithResult(str);
        int i4 = asInterface + 67;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 99;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<String> getcornerradius = verifyGuestUssCardPasswordFragment.asBinder;
        int i5 = i2 + 93;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 18, '\r', 6, 24, '\f', 6, '\r', 13848, 13848, 7, 17, 24, 11, 0, 22}, (byte) (Drawable.resolveOpacity(0, 0) + 47), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Long.valueOf(onNavigationEvent()))});
        int i4 = IAuthTabCallbackStub + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return mapIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, IssueCertificate> {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        onExtraCallback() {
            super(1, IssueCertificate.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthPasswordBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final IssueCertificate invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return IssueCertificate.onWarmupCompleted(view);
        }
    }

    private final IssueCertificate onExtraCallback() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.onExtraCallback;
            addallcommandline = IAuthTabCallback[1];
        } else {
            pageContext = this.onExtraCallback;
            addallcommandline = IAuthTabCallback[0];
        }
        IssueCertificate issueCertificate = (IssueCertificate) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = IAuthTabCallbackStub + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return issueCertificate;
    }

    private final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Number) this.onWarmupCompleted.getValue()).longValue();
        int i4 = IAuthTabCallbackStub + 3;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return jLongValue;
    }

    private static final long asInterface(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) throws Throwable {
        int i = 2 % 2;
        Bundle arguments = verifyGuestUssCardPasswordFragment.getArguments();
        if (arguments == null) {
            return -1L;
        }
        int i2 = IAuthTabCallbackStub + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{16, 15, 5, 11, 14, 19, 2, 16, 19, 20, '\t', 11, 20, 19, 13787, 13787, '\t', 2, 19, 11, 5, 2}, (byte) (18 - View.MeasureSpec.getMode(0)), 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        long j = arguments.getLong(((String) objArr[0]).intern());
        int i4 = IAuthTabCallbackStub + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return j;
    }

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter IAuthTabCallback;
        final /* synthetic */ MapConverter onExtraCallback;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.IAuthTabCallback = mapConverter;
            this.onExtraCallback = mapConverter2;
        }

        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.onWarmupCompleted.1
                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
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
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$ComponentActivityExternalSyntheticLambda4
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.onExtraCallbackWithResult = anonymousClass1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.IAuthTabCallback;
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

    static final class IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackDefault(access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return VerifyGuestUssCardPasswordFragment.this.new IAuthTabCallbackDefault(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws setWrite {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getCornerRadius getcornerradiusOnNavigationEvent = VerifyGuestUssCardPasswordFragment.onNavigationEvent(VerifyGuestUssCardPasswordFragment.this);
                final VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = VerifyGuestUssCardPasswordFragment.this;
                setRipple setripple = new setRipple() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.IAuthTabCallbackDefault.5
                    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                    public final Object emit(String str, access13800<? super Unit> access13800Var) {
                        int i2 = 0;
                        View[] viewArr = {VerifyGuestUssCardPasswordFragment.IAuthTabCallback(verifyGuestUssCardPasswordFragment).onNavigationEvent, VerifyGuestUssCardPasswordFragment.IAuthTabCallback(verifyGuestUssCardPasswordFragment).onWarmupCompleted};
                        int i3 = 0;
                        while (i2 < 2) {
                            viewArr[i2].setAlpha(i3 <= str.length() - 1 ? 1.0f : 0.12f);
                            i2++;
                            i3++;
                        }
                        if (str.length() == 2) {
                            VerifyGuestUssCardPasswordFragment.IAuthTabCallback(verifyGuestUssCardPasswordFragment, str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (getcornerradiusOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1027857120, iOnNavigationEvent, new Object[]{this}, 1027857120, iOnNavigationEvent3);
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(null), 3, (Object) null);
        int i2 = IAuthTabCallbackStub + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class onExtraCallbackWithResult implements SecureKeyboardView.IAuthTabCallback {

        public static final /* synthetic */ class onNavigationEvent {
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[DigestInfo.values().length];
                try {
                    iArr[DigestInfo.KEY_DELETE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DigestInfo.KEY_RESET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                onWarmupCompleted = iArr;
            }
        }

        onExtraCallbackWithResult() {
        }

        @Override // viva.republica.toss.common.securekey.SecureKeyboardView.IAuthTabCallback
        public void onNavigationEvent(DigestInfo digestInfo) {
            String strDropLast;
            Intrinsics.checkNotNullParameter(digestInfo, "");
            String str = (String) VerifyGuestUssCardPasswordFragment.onNavigationEvent(VerifyGuestUssCardPasswordFragment.this).IAuthTabCallback();
            int i = onNavigationEvent.onWarmupCompleted[digestInfo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    strDropLast = "";
                } else {
                    if (str.length() >= 2) {
                        return;
                    }
                    strDropLast = str + digestInfo.getTitle();
                }
            } else if (str.length() == 0) {
                return;
            } else {
                strDropLast = StringsKt.dropLast(str, 1);
            }
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = VerifyGuestUssCardPasswordFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(VerifyGuestUssCardPasswordFragment.this, strDropLast, null), 3, (Object) null);
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ String $newValue;
            int label;
            final /* synthetic */ VerifyGuestUssCardPasswordFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, String str, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = verifyGuestUssCardPasswordFragment;
                this.$newValue = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new IAuthTabCallback(this.this$0, this.$newValue, access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getCornerRadius getcornerradiusOnNavigationEvent = VerifyGuestUssCardPasswordFragment.onNavigationEvent(this.this$0);
                    String str = this.$newValue;
                    this.label = 1;
                    if (getcornerradiusOnNavigationEvent.emit(str, this) == objOnWarmupCompleted) {
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
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = (VerifyGuestUssCardPasswordFragment) objArr[0];
        int i = 2 % 2;
        verifyGuestUssCardPasswordFragment.onExtraCallback().IAuthTabCallback.setAlpha(1.0f);
        verifyGuestUssCardPasswordFragment.onExtraCallback().onExtraCallbackWithResult.setAlpha(1.0f);
        SecureKeyboardView secureKeyboardView = verifyGuestUssCardPasswordFragment.onExtraCallback().onExtraCallback;
        Context contextRequireContext = verifyGuestUssCardPasswordFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        secureKeyboardView.setDarkMode(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{contextRequireContext}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
        verifyGuestUssCardPasswordFragment.onExtraCallback().onExtraCallback.onWarmupCompleted();
        verifyGuestUssCardPasswordFragment.onExtraCallback().onExtraCallback.setOnSecureKeyListener(verifyGuestUssCardPasswordFragment.new onExtraCallbackWithResult());
        int i2 = IAuthTabCallbackStub + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 91;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 5;
        IAuthTabCallbackStub = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment.showProgressDialog$default(verifyGuestUssCardPasswordFragment, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        verifyGuestUssCardPasswordFragment.dismissProgressDialog();
        int i4 = IAuthTabCallbackStub + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, Object obj) {
        int i = 2 % 2;
        onNavigationEvent onnavigationevent = verifyGuestUssCardPasswordFragment.onExtraCallbackWithResult;
        if (onnavigationevent == null) {
            int i2 = asInterface + 41;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            onnavigationevent = null;
        }
        onnavigationevent.IPostMessageServiceDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 39;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_title", verifyGuestUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_title));
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 18, '\r', 6, 24, '\f', 6, '\r', 13848, 13848, 7, 17, 24, 11, 0, 22}, (byte) (48 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 16, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), Long.valueOf(verifyGuestUssCardPasswordFragment.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 115;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static final byte[] $$a = {59, -24, -77, -23};
        private static final int $$b = 100;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onWarmupCompleted = 0;
        private static int onExtraCallbackWithResult = 1;
        private static long onNavigationEvent = -4461481838996780304L;
        private static int onExtraCallback = -1776194565;
        private static char IAuthTabCallback = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = 3 - r8
                int r7 = r7 * 3
                int r0 = 1 - r7
                byte[] r1 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.IAuthTabCallback.$$a
                int r6 = r6 + 109
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2c
            L17:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L28:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2c:
                int r8 = r8 + r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.IAuthTabCallback.$$c(int, short, int):java.lang.String");
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42, 1451 - (ViewConfiguration.getScrollBarSize() >> 8), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - ((Process.getThreadPriority(0) + 20) >> 6)), 44 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - ((byte) KeyEvent.getModifierMetaStateMask())), ExpandableListView.getPackedPositionChild(0L) + 51, 22938 - TextUtils.lastIndexOf("", '0'), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45848), 29 - Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i3 = $11 + 1;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i5 = $10 + 65;
            $11 = i5 % 128;
            if (i5 % 2 != 0) {
                objArr[0] = str;
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private IAuthTabCallback() {
        }

        public final VerifyGuestUssCardPasswordFragment onNavigationEvent(long j) {
            int i = 2 % 2;
            VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment = new VerifyGuestUssCardPasswordFragment();
            Bundle bundle = new Bundle();
            Object[] objArr = new Object[1];
            a((char) Color.alpha(0), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{64575, 25116, 18936, 7386, 44120, 4882, 24004, 35959, 17558, 21329, 15406, 44520, 43207, 57350, 25377, 21273, 1952, 35590, 59818, 32023, 11364, 55363}, new char[]{57611, 20636, 44497, 44591}, new char[]{15310, 24043, 25099, 22726}, objArr);
            bundle.putLong(((String) objArr[0]).intern(), j);
            verifyGuestUssCardPasswordFragment.setArguments(bundle);
            int i2 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return verifyGuestUssCardPasswordFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{2, 7, 23, 17, 13949}, (byte) (TextUtils.indexOf("", "", 0) + 126), 5 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyGuestUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 18, '\r', 6, 24, '\f', 6, '\r', 13848, 13848, 7, 17, 24, 11, 0, 22}, (byte) (TextUtils.getOffsetAfter("", 0) + 47), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), Long.valueOf(verifyGuestUssCardPasswordFragment.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 17;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{2, 7, 23, 17, 13949}, (byte) (126 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ExpandableListView.getPackedPositionType(0L) + 5, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyGuestUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 18, '\r', 6, 24, '\f', 6, '\r', 13848, 13848, 7, 17, 24, 11, 0, 22}, (byte) (47 - TextUtils.indexOf("", "", 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), Long.valueOf(verifyGuestUssCardPasswordFragment.onNavigationEvent()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 75;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1265519L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (SetDetectableSize) obj};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                return (Unit) VerifyGuestUssCardPasswordFragment.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -891738965, iOnNavigationEvent, objArr, 891738970, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        }, 14, (Object) null);
        onNavigationEvent onnavigationevent = verifyGuestUssCardPasswordFragment.onExtraCallbackWithResult;
        if (onnavigationevent == null) {
            int i2 = IAuthTabCallbackStub + 49;
            asInterface = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            onnavigationevent = null;
        }
        onnavigationevent.IPostMessageService();
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(final VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(verifyGuestUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        if (!addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            i = R.string.teens_uss_card_auth_password_error_max_dialog_message;
            int i3 = IAuthTabCallbackStub + 93;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = IAuthTabCallbackStub + 97;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                i = R.string.teens_uss_card_auth_under_fourteen_password_error_max_dialog_message;
                int i6 = 71 / 0;
            } else {
                i = R.string.teens_uss_card_auth_under_fourteen_password_error_max_dialog_message;
            }
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(verifyGuestUssCardPasswordFragment.getString(i, new Object[]{PlayerErrorCode.onPostMessage()}));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardPasswordFragment.onExtraCallback(this.f$0, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(final viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment r11, java.lang.Throwable r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.onExtraCallbackWithResult(viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment, java.lang.Throwable):kotlin.Unit");
    }

    private final void onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        writeRaw<BaseApiResponse<Object>> writerawOnExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession().onExtraCallback(new runJSBundle(onNavigationEvent(), str));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (deserializeUriNullableCollection) obj};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                return (Unit) VerifyGuestUssCardPasswordFragment.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1002067860, iOnNavigationEvent, objArr, -1002067856, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda4
            public final void accept(Object obj) throws Throwable {
                VerifyGuestUssCardPasswordFragment.onExtraCallbackWithResult(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda5
            public final void run() {
                VerifyGuestUssCardPasswordFragment.onExtraCallbackWithResult(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardPasswordFragment.onNavigationEvent(this.f$0, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, obj};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                return (Unit) VerifyGuestUssCardPasswordFragment.onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1842789464, iOnNavigationEvent, objArr, 1842789467, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
            }
        }));
        int i2 = IAuthTabCallbackStub + 109;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub();
        Context contextRequireContext = requireContext();
        SubTypography8 subTypography8 = onExtraCallback().onTransact;
        Intrinsics.checkNotNullExpressionValue(subTypography8, "");
        try {
            Object[] objArr = {contextRequireContext, subTypography8};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 46481), 13 - KeyEvent.keyCodeFromString(""), 22731 - (ViewConfiguration.getTapTimeout() >> 16), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
            }
            ((Method) objOnExtraCallback).invoke(null, objArr);
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.onWarmupCompleted());
            int i4 = asInterface + 103;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        asBinder(access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return VerifyGuestUssCardPasswordFragment.this.new asBinder(access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getCornerRadius getcornerradiusOnNavigationEvent = VerifyGuestUssCardPasswordFragment.onNavigationEvent(VerifyGuestUssCardPasswordFragment.this);
                this.label = 1;
                if (getcornerradiusOnNavigationEvent.emit("", this) == objOnWarmupCompleted) {
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

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new asBinder(null), 3, (Object) null);
        onExtraCallback().onTransact.setText(getString(R.string.teens_uss_card_auth_password_error_title));
        onExtraCallback().onExtraCallback.onWarmupCompleted();
        int i2 = IAuthTabCallbackStub + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            super.onAttach(context);
            boolean z = context instanceof onNavigationEvent;
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z2 = context instanceof onNavigationEvent;
        Object obj = context;
        if (!z2) {
            if (!(getParentFragment() instanceof onNavigationEvent)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            onNavigationEvent parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardPasswordFragment.Callback");
            }
            int i3 = IAuthTabCallbackStub + 73;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            obj = parentFragment;
        }
        this.onExtraCallbackWithResult = (onNavigationEvent) obj;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onTransact;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.getOffsetBefore("", 0) + 26, (ViewConfiguration.getJumpTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                i2 = i + 110;
                cArr4[i2] = (char) (cArr[i2] * b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $10 + 65;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i10 = $10 + 123;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 24825), 74 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i12 = $10 + 1;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, ((byte) KeyEvent.getModifierMetaStateMask()) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i15 = $10 + 23;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                            int i21 = $11 + 125;
                            $10 = i21 % 128;
                            i3 = 2;
                            int i22 = i21 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                            obj2 = obj;
                        }
                    }
                }
                i3 = 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += i3;
                obj2 = obj;
            }
        }
        int i23 = 0;
        while (i23 < i) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
            i23++;
            int i24 = $11 + 83;
            $10 = i24 % 128;
            int i25 = i24 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -891738965, iOnNavigationEvent, new Object[]{verifyGuestUssCardPasswordFragment, setDetectableSize}, 891738970, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1327165281, iOnNavigationEvent, new Object[]{verifyGuestUssCardPasswordFragment, setDetectableSize}, -1327165279, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, 1002067860, iOnNavigationEvent, new Object[]{verifyGuestUssCardPasswordFragment, deserializeurinullablecollection}, -1002067856, iOnNavigationEvent3);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyGuestUssCardPasswordFragment verifyGuestUssCardPasswordFragment, Object obj) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1842789464, iOnNavigationEvent, new Object[]{verifyGuestUssCardPasswordFragment, obj}, 1842789467, iOnNavigationEvent3);
    }

    private static final void onExtraCallback(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1206145296, iOnNavigationEvent, new Object[]{function1, obj}, 1206145297, iOnNavigationEvent3);
    }

    private final void onExtraCallbackWithResult() throws Throwable {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1027857120, iOnNavigationEvent, new Object[]{this}, 1027857120, iOnNavigationEvent3);
    }

    static void IAuthTabCallback() {
        onTransact = new char[]{65015, 65012, 64986, 64980, 65020, 64969, 64999, 65018, 64960, 65010, 64993, 64982, 64988, 64966, 65004, 65014, 65021, 64998, 64991, 65003, 64983, 64989, 64967, 64968, 64992};
        IAuthTabCallbackDefault = (char) 51244;
    }
}
