package viva.republica.toss.verify.ussCard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.text.SubTypography8;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.AdSettingsIntegrationErrorMode;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.DigestInfo;
import o.DoNotStripAny;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.IssueCertificate;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import o.RippleNode;
import o.RotationProvider1;
import o.SetDetectableSize;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
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
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.isOneShot;
import o.maybeUpdateAnimatable;
import o.noStore;
import o.preFillDefault;
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
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.verify.session.VerifySessionViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifyUssCardPasswordFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static long asInterface = 0;
    public static final int onExtraCallbackWithResult;
    private static int onTransact = 1;
    private final Lazy onExtraCallback;
    private final PageContext onNavigationEvent;
    private final getCornerRadius<String> onWarmupCompleted;

    static {
        onWarmupCompleted();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyUssCardPasswordFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthPasswordBinding;", 0)};
        Companion = new onNavigationEvent(null);
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallbackDefault + 109;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(verifyUssCardPasswordFragment, dialogInterface);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(verifyUssCardPasswordFragment, dialogInterface);
        int i3 = IAuthTabCallbackStub + 123;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyUssCardPasswordFragment, th);
        int i4 = IAuthTabCallbackStub + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(verifyUssCardPasswordFragment, setDetectableSize);
        int i4 = onTransact + 87;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ void IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(verifyUssCardPasswordFragment);
        int i4 = onTransact + 87;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        VerifyUssCardPasswordFragment verifyUssCardPasswordFragment = (VerifyUssCardPasswordFragment) objArr[0];
        String str = (String) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(1066247659, new Object[]{verifyUssCardPasswordFragment, str, obj}, -1066247659, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        }
        Unit unit = (Unit) onExtraCallbackWithResult(1066247659, new Object[]{verifyUssCardPasswordFragment, str, obj}, -1066247659, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i3 = 42 / 0;
        return unit;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(479040896, new Object[]{function1, obj}, -479040895, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        onExtraCallbackWithResult(479040896, new Object[]{function1, obj}, -479040895, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i3 = onTransact + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i6);
        int i11 = i9 | i10;
        int i12 = ~i2;
        int i13 = i9 | (~(i12 | i)) | i10;
        int i14 = (~(i6 | i2 | i)) | (~(i7 | i12 | i8));
        int i15 = i2 + i + i3 + (1322235619 * i4) + (440487356 * i5);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i2) - 2100690944) + ((-281430247) * i) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i3) + ((-942931968) * i4) + ((-1410334720) * i5) + (1251606528 * i16);
        int i18 = (i2 * 157034417) + 1376579869 + (i * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i3 * 157035401) + (i4 * (-982187909)) + (i5 * (-1869533796)) + (i16 * (-899022848));
        int i19 = i17 + (i18 * i18 * (-511311872));
        if (i19 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 == 2) {
            return onExtraCallback(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
        }
        VerifyUssCardPasswordFragment verifyUssCardPasswordFragment = (VerifyUssCardPasswordFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i20 = 2 % 2;
        int i21 = onTransact + 123;
        IAuthTabCallbackStub = i21 % 128;
        int i22 = i21 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyUssCardPasswordFragment, commonModule_setLeftEdgeTouchEnabled);
        int i23 = IAuthTabCallbackStub + 15;
        onTransact = i23 % 128;
        int i24 = i23 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onExtraCallbackWithResult(249101987, new Object[]{verifyUssCardPasswordFragment, setDetectableSize}, -249101983, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(verifyUssCardPasswordFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(verifyUssCardPasswordFragment, deserializeurinullablecollection);
        }
        onExtraCallback(verifyUssCardPasswordFragment, deserializeurinullablecollection);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return 1265515L;
    }

    public VerifyUssCardPasswordFragment() {
        super(R.layout.fragment_uss_card_auth_password);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
        this.onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new asInterface(this), new onTransact(null, this), new asBinder(this));
        this.onWarmupCompleted = setShine.onNavigationEvent(BuildConfig.FLAVOR);
    }

    public static final /* synthetic */ void IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, String str) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        verifyUssCardPasswordFragment.onExtraCallback(str);
        int i4 = onTransact + 71;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ IssueCertificate onExtraCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IssueCertificate issueCertificateOnExtraCallbackWithResult = verifyUssCardPasswordFragment.onExtraCallbackWithResult();
        int i4 = onTransact + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return issueCertificateOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 75;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<String> getcornerradius = verifyUssCardPasswordFragment.onWarmupCompleted;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i2 + 43;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return getcornerradius;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, IssueCertificate> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, IssueCertificate.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthPasswordBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final IssueCertificate invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return IssueCertificate.onWarmupCompleted(view);
        }
    }

    private final IssueCertificate onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IssueCertificate issueCertificateOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
        int i4 = onTransact + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return issueCertificateOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final VerifySessionViewModel IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.onExtraCallback.getValue();
        int i4 = IAuthTabCallbackStub + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return verifySessionViewModel;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return VerifyUssCardPasswordFragment.this.new onExtraCallback(access13800Var);
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
                getCornerRadius getcornerradiusOnNavigationEvent = VerifyUssCardPasswordFragment.onNavigationEvent(VerifyUssCardPasswordFragment.this);
                final VerifyUssCardPasswordFragment verifyUssCardPasswordFragment = VerifyUssCardPasswordFragment.this;
                setRipple setripple = new setRipple() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment.onExtraCallback.1
                    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                    public final Object emit(String str, access13800<? super Unit> access13800Var) {
                        int i2 = 0;
                        View[] viewArr = {VerifyUssCardPasswordFragment.onExtraCallback(verifyUssCardPasswordFragment).onNavigationEvent, VerifyUssCardPasswordFragment.onExtraCallback(verifyUssCardPasswordFragment).onWarmupCompleted};
                        int i3 = 0;
                        while (i2 < 2) {
                            viewArr[i2].setAlpha(i3 <= str.length() - 1 ? 1.0f : 0.12f);
                            i2++;
                            i3++;
                        }
                        if (str.length() == 2) {
                            VerifyUssCardPasswordFragment.IAuthTabCallback(verifyUssCardPasswordFragment, str);
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

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        onExtraCallback();
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(null), 3, (Object) null);
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public IAuthTabCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment.IAuthTabCallback.5
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Object> invoke(BaseApiResponse<Object> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
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
            }) { // from class: o.UtilsKtExternalSyntheticLambda17.BackHandlerKtExternalSyntheticLambda3
                private final /* synthetic */ Function1 onExtraCallbackWithResult;

                public BackHandlerKtExternalSyntheticLambda3(Function1 function1) {
                    Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
                    this.onExtraCallbackWithResult = function1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onExtraCallbackWithResult.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            MapConverter mapConverter = this.onWarmupCompleted;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
            return writerawIAuthTabCallback;
        }
    }

    public static final class onWarmupCompleted implements SecureKeyboardView.IAuthTabCallback {

        public static final /* synthetic */ class onExtraCallback {
            public static final /* synthetic */ int[] onExtraCallbackWithResult;

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
                onExtraCallbackWithResult = iArr;
            }
        }

        onWarmupCompleted() {
        }

        public void onNavigationEvent(DigestInfo digestInfo) {
            String strDropLast;
            Intrinsics.checkNotNullParameter(digestInfo, BuildConfig.FLAVOR);
            String str = (String) VerifyUssCardPasswordFragment.onNavigationEvent(VerifyUssCardPasswordFragment.this).IAuthTabCallback();
            int i = onExtraCallback.onExtraCallbackWithResult[digestInfo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    strDropLast = BuildConfig.FLAVOR;
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
            TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = VerifyUssCardPasswordFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(VerifyUssCardPasswordFragment.this, strDropLast, null), 3, (Object) null);
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ String $newValue;
            int label;
            final /* synthetic */ VerifyUssCardPasswordFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = verifyUssCardPasswordFragment;
                this.$newValue = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onExtraCallbackWithResult(this.this$0, this.$newValue, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getCornerRadius getcornerradiusOnNavigationEvent = VerifyUssCardPasswordFragment.onNavigationEvent(this.this$0);
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

    private final void onExtraCallback() {
        int i = 2 % 2;
        onExtraCallbackWithResult().IAuthTabCallback.setAlpha(1.0f);
        onExtraCallbackWithResult().onExtraCallbackWithResult.setAlpha(1.0f);
        SecureKeyboardView secureKeyboardView = onExtraCallbackWithResult().onExtraCallback;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        secureKeyboardView.setDarkMode(((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{contextRequireContext}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue());
        onExtraCallbackWithResult().onExtraCallback.onWarmupCompleted();
        onExtraCallbackWithResult().onExtraCallback.setOnSecureKeyListener(new onWarmupCompleted());
        int i2 = IAuthTabCallbackStub + 39;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $10 + 65;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 19627 - Color.green(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() / (asInterface / 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 59 - (Process.myTid() >> 22), 6383 - Color.argb(0, 0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ asInterface);
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 59 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), 6383 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 59, (Process.myTid() >> 22) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onExtraCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment.showProgressDialog$default(verifyUssCardPasswordFragment, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void onExtraCallbackWithResult(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        verifyUssCardPasswordFragment.dismissProgressDialog();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = onTransact + 113;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        VerifyUssCardPasswordFragment verifyUssCardPasswordFragment = (VerifyUssCardPasswordFragment) objArr[0];
        String str = (String) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        RippleNode.onNavigationEvent(verifyUssCardPasswordFragment).onWarmupCompleted(R.id.action_verifyUssCardPasswordFragment_to_verifyUssCardCvcFragment, RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_FIRST_HALF_PASSWORD", str)}));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 109;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VerifyUssCardPasswordFragment verifyUssCardPasswordFragment = (VerifyUssCardPasswordFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback("error_title", verifyUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_title));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 103;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new char[]{58287, 38211, 3661, 34660, 14458}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30450, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            Object[] objArr = new Object[1];
            a(new char[]{58287, 38211, 3661, 34660, 14458}, 502 % TextUtils.lastIndexOf(BuildConfig.FLAVOR, (char) 16, 1), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
            Object[] objArr2 = new Object[1];
            a(new char[]{58287, 38211, 3661, 34660, 14458}, TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 30450, objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), verifyUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 79;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(final VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1265519L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return VerifyUssCardPasswordFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifyUssCardPasswordFragment.IAuthTabCallback(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(final VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 29;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(verifyUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
            addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(verifyUssCardPasswordFragment.getString(R.string.teens_uss_card_auth_password_error_max_dialog_title));
        if (addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted)) {
            int i4 = IAuthTabCallbackStub + 115;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            i = R.string.teens_uss_card_auth_under_fourteen_password_error_max_dialog_message;
        } else {
            i = R.string.teens_uss_card_auth_password_error_max_dialog_message;
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(verifyUssCardPasswordFragment.getString(i, new Object[]{PlayerErrorCode.onPostMessage()}));
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj2) {
                return VerifyUssCardPasswordFragment.IAuthTabCallback(this.f$0, (DialogInterface) obj2);
            }
        })};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(final VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, Throwable th) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        Object obj = null;
        if (th instanceof TossApiCallException.ApiError) {
            int i5 = onTransact + 99;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                ((TossApiCallException.ApiError) th).asBinder().hashCode();
                throw null;
            }
            String strAsBinder = ((TossApiCallException.ApiError) th).asBinder();
            switch (strAsBinder.hashCode()) {
                case -836112105:
                    if (!(!strAsBinder.equals("CertificationErrorNotHandled"))) {
                        ConvertByteArrayToFloatArray.onExtraCallback(1265517L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda2
                            public final Object invoke(Object obj2) {
                                return VerifyUssCardPasswordFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj2);
                            }
                        }, 14, (Object) null);
                        Context contextRequireContext = verifyUssCardPasswordFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
                        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda3
                            public final Object invoke(Object obj2) {
                                return (Unit) VerifyUssCardPasswordFragment.onExtraCallbackWithResult(1918467978, new Object[]{this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2}, -1918467975, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
                            }
                        });
                        break;
                    } else {
                        getParamImp.onWarmupCompleted(th, verifyUssCardPasswordFragment.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                        verifyUssCardPasswordFragment.onNavigationEvent();
                        break;
                    }
                case 187305569:
                    if (!strAsBinder.equals("PasswordMaxFailureCountExceeded")) {
                        i = onTransact + 37;
                        IAuthTabCallbackStub = i % 128;
                        int i6 = i % 2;
                        getParamImp.onWarmupCompleted(th, verifyUssCardPasswordFragment.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                        verifyUssCardPasswordFragment.onNavigationEvent();
                        break;
                    }
                    ConvertByteArrayToFloatArray.onExtraCallback(1265517L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda2
                        public final Object invoke(Object obj2) {
                            return VerifyUssCardPasswordFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj2);
                        }
                    }, 14, (Object) null);
                    Context contextRequireContext2 = verifyUssCardPasswordFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, BuildConfig.FLAVOR);
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext2, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda3
                        public final Object invoke(Object obj2) {
                            return (Unit) VerifyUssCardPasswordFragment.onExtraCallbackWithResult(1918467978, new Object[]{this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2}, -1918467975, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
                        }
                    });
                    break;
                case 248594412:
                    if (strAsBinder.equals("PasswordNotMatched")) {
                        ConvertByteArrayToFloatArray.onExtraCallback(1265907L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda1
                            public final Object invoke(Object obj2) {
                                return VerifyUssCardPasswordFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj2);
                            }
                        }, 14, (Object) null);
                        verifyUssCardPasswordFragment.onNavigationEvent();
                        break;
                    }
                    break;
                case 1049586004:
                    if (!strAsBinder.equals("PasswordNotMatchedThreeTimes")) {
                    }
                    break;
                case 1817801512:
                    if (!strAsBinder.equals("PasswordMaxDailyFailureCountExceeded")) {
                    }
                    break;
                default:
                    i = IAuthTabCallbackStub + 25;
                    onTransact = i % 128;
                    int i62 = i % 2;
                    getParamImp.onWarmupCompleted(th, verifyUssCardPasswordFragment.getContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    verifyUssCardPasswordFragment.onNavigationEvent();
                    break;
            }
        } else {
            getParamImp.onWarmupCompleted(th, verifyUssCardPasswordFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            verifyUssCardPasswordFragment.onNavigationEvent();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 125;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(final String str) {
        int i = 2 % 2;
        writeRaw writerawIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.onActivityResized().IAuthTabCallback(IAuthTabCallback().onExtraCallbackWithResult().ICustomTabsCallback_Parcel(), new DoNotStripAny(str));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
        writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, BuildConfig.FLAVOR);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return VerifyUssCardPasswordFragment.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback2.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                VerifyUssCardPasswordFragment.onExtraCallback(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda6
            public final void run() {
                VerifyUssCardPasswordFragment.IAuthTabCallback(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, BuildConfig.FLAVOR);
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return VerifyUssCardPasswordFragment.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardPasswordFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return (Unit) VerifyUssCardPasswordFragment.onExtraCallbackWithResult(1454498184, new Object[]{this.f$0, str, obj}, -1454498182, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
            }
        }));
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub();
            Context contextRequireContext = requireContext();
            SubTypography8 subTypography8 = onExtraCallbackWithResult().onTransact;
            Intrinsics.checkNotNullExpressionValue(subTypography8, BuildConfig.FLAVOR);
            try {
                Object[] objArr = {contextRequireContext, subTypography8};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46480 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR)), ((Process.getThreadPriority(0) + 20) >> 6) + 13, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22731, 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
                }
                ((Method) objOnExtraCallback).invoke(null, objArr);
                isOneShot.onExtraCallbackWithResult(this, noStore.Companion.onWarmupCompleted());
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        IAuthTabCallbackStub();
        Context contextRequireContext2 = requireContext();
        SubTypography8 subTypography82 = onExtraCallbackWithResult().onTransact;
        Intrinsics.checkNotNullExpressionValue(subTypography82, BuildConfig.FLAVOR);
        try {
            Object[] objArr2 = {contextRequireContext2, subTypography82};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(948703185);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46480), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 14, 22731 - View.resolveSize(0, 0), 164426049, false, "onExtraCallbackWithResult", new Class[]{Context.class, View.class});
            }
            ((Method) objOnExtraCallback2).invoke(null, objArr2);
            isOneShot.onExtraCallbackWithResult(this, noStore.Companion.onWarmupCompleted());
            int i3 = 44 / 0;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return VerifyUssCardPasswordFragment.this.new IAuthTabCallbackStub(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                getCornerRadius getcornerradiusOnNavigationEvent = VerifyUssCardPasswordFragment.onNavigationEvent(VerifyUssCardPasswordFragment.this);
                this.label = 1;
                if (getcornerradiusOnNavigationEvent.emit(BuildConfig.FLAVOR, this) == objOnWarmupCompleted) {
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
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, BuildConfig.FLAVOR);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(null), 3, (Object) null);
        onExtraCallbackWithResult().onTransact.setText(getString(R.string.teens_uss_card_auth_password_error_title));
        onExtraCallbackWithResult().onExtraCallback.onWarmupCompleted();
        int i2 = onTransact + 59;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onTransact extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class asBinder extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallbackWithResult(1918467978, new Object[]{verifyUssCardPasswordFragment, commonModule_setLeftEdgeTouchEnabled}, -1918467975, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, String str, Object obj) {
        return (Unit) onExtraCallbackWithResult(1454498184, new Object[]{verifyUssCardPasswordFragment, str, obj}, -1454498182, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        onExtraCallbackWithResult(479040896, new Object[]{function1, obj}, -479040895, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onNavigationEvent(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallbackWithResult(249101987, new Object[]{verifyUssCardPasswordFragment, setDetectableSize}, -249101983, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallback(VerifyUssCardPasswordFragment verifyUssCardPasswordFragment, String str, Object obj) {
        return (Unit) onExtraCallbackWithResult(1066247659, new Object[]{verifyUssCardPasswordFragment, str, obj}, -1066247659, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    static void onWarmupCompleted() {
        asInterface = -6176535283034200340L;
    }
}
