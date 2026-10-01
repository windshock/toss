package viva.republica.toss.verify.ussCard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.internal.ads.zzgc;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.image.TdsImageView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.AdSettingsIntegrationErrorMode;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertByteArrayToFloatArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.InterstitialAdExtendedListener;
import o.M_;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.PhotoBrowseView9;
import o.PlayerErrorCode;
import o.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import o.SetDetectableSize;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CMP_Issue_Confirm;
import o.UtilsKtExternalSyntheticLambda17;
import o.addAllCommandLine;
import o.addExtra;
import o.allowsCustomTabAuth;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.enableVirtualViewWindowFocusDetection;
import o.getNativeModuleIteratorReactAndroid_release;
import o.getParamImp;
import o.getReactApplicationContextIfActiveOrWarn;
import o.initMiniApp;
import o.preFillDefault;
import o.setMessageBytes;
import o.shouldAutoplay;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.session.VerifySessionViewModel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class VerifyUssCardCvcFragment extends BaseFragment {
    private static long IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static char onTransact;
    public static final int onWarmupCompleted;
    private final Lazy IAuthTabCallback;
    private final Lazy onExtraCallbackWithResult;
    private final PageContext onNavigationEvent;
    private static final byte[] $$a = {11, -55, -20, ISOFileInfo.A5};
    private static final int $$b = 56;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int asInterface = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 110 - s2;
        int i4 = i * 3;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i6;
            i3 = i5 + (-i7);
            i5 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i9];
            i2++;
            int i10 = i3;
            i6 = i9;
            i5 = i10;
            int i82 = i6;
            i3 = i5 + (-i7);
            i5 = i82;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static {
        getInterfaceDescriptor = 1;
        onExtraCallback();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyUssCardCvcFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthCvcBinding;", 0)};
        onWarmupCompleted = 8;
        int i = IAuthTabCallback_Parcel + 29;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(verifyUssCardCvcFragment);
        int i4 = asInterface + 59;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(verifyUssCardCvcFragment, setDetectableSize);
        int i4 = asBinder + 93;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asBinder + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(TossApiCallException.ApiError apiError, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(apiError, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = asInterface + 113;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyUssCardCvcFragment, deserializeurinullablecollection);
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(verifyUssCardCvcFragment, view);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i4));
        int i13 = i4 + i3 + i5 + (513088896 * i2) + ((-1342203445) * i6);
        int i14 = i13 * i13;
        int i15 = (665020156 * i4) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i5) + ((-771751936) * i2) + (1382285312 * i6) + ((-350355456) * i14);
        int i16 = ((i4 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i5 * (-363641803)) + (i2 * (-2127225984)) + (i6 * (-1080704249)) + (i14 * (-1523187712));
        switch (i15 + (i16 * i16 * (-227409920))) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                final VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
                int i17 = 2 % 2;
                int i18 = asBinder + 35;
                asInterface = i18 % 128;
                int i19 = i18 % 2;
                EditText editText = verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.getEditText();
                if (editText != null) {
                    editText.setImeOptions(6);
                    editText.setInputType(2);
                    editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(3)});
                    editText.addTextChangedListener(verifyUssCardCvcFragment.new onNavigationEvent());
                }
                TdsImageView tdsImageView = verifyUssCardCvcFragment.IAuthTabCallback().onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
                TdsImageView.setImage$default(tdsImageView, getNativeModuleIteratorReactAndroid_release.CLEAR_BLACK.getCardImage().getCvcBackImageUrl(), (Function1) null, (Function1) null, 6, (Object) null);
                verifyUssCardCvcFragment.IAuthTabCallback().IAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VerifyUssCardCvcFragment.onExtraCallback(this.f$0, view);
                    }
                });
                int i20 = asInterface + 13;
                asBinder = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(verifyUssCardCvcFragment, dialogInterface);
        int i4 = asInterface + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(verifyUssCardCvcFragment, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyUssCardCvcFragment, th);
        int i3 = asInterface + 99;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifyUssCardCvcFragment, setDetectableSize);
        int i4 = asInterface + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strAsInterface = asInterface(verifyUssCardCvcFragment);
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return strAsInterface;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = asBinder + 105;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(verifyUssCardCvcFragment, bool);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        int i5 = asBinder + 77;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(verifyUssCardCvcFragment, obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyUssCardCvcFragment, obj);
        int i3 = asInterface + 61;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment, th}, 1824015405, -1824015405, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = asBinder + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(verifyUssCardCvcFragment, commonModule_setLeftEdgeTouchEnabled);
        int i4 = asBinder + 103;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return 1265573L;
    }

    public VerifyUssCardCvcFragment() {
        super(R.layout.fragment_uss_card_auth_cvc);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, IAuthTabCallback.onExtraCallbackWithResult);
        this.IAuthTabCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(VerifySessionViewModel.class), new onExtraCallbackWithResult(this), new IAuthTabCallbackStub(null, this), new asInterface(this));
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda0
            public final Object invoke() {
                Object[] objArr = {this.f$0};
                return (String) VerifyUssCardCvcFragment.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, -1309582137, 1309582142, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            }
        });
    }

    public static final /* synthetic */ void onNavigationEvent(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        verifyUssCardCvcFragment.onNavigationEvent();
        int i4 = asBinder + 51;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment}, 66206338, -66206331, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = asInterface + 123;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> screenParams = super/*im.toss.uikit.base.UIKitBaseFragment*/.getScreenParams();
        int i4 = asBinder + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return screenParams;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function1<View, UST_CMP_Issue_Confirm> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(1, UST_CMP_Issue_Confirm.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthCvcBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final UST_CMP_Issue_Confirm invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return UST_CMP_Issue_Confirm.IAuthTabCallback(view);
        }
    }

    private final UST_CMP_Issue_Confirm IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        UST_CMP_Issue_Confirm uST_CMP_Issue_ConfirmOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallback[0]);
        int i4 = asBinder + 47;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return uST_CMP_Issue_ConfirmOnExtraCallbackWithResult;
    }

    private final VerifySessionViewModel IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        VerifySessionViewModel verifySessionViewModel = (VerifySessionViewModel) this.IAuthTabCallback.getValue();
        int i4 = asBinder + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return verifySessionViewModel;
    }

    private final String asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallbackWithResult.getValue();
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String asInterface(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        String string;
        int i = 2 % 2;
        Bundle arguments = verifyUssCardCvcFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("EXTRA_FIRST_HALF_PASSWORD");
            int i2 = asBinder + 19;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        int i4 = asBinder + 65;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return BuildConfig.FLAVOR;
        }
        throw null;
    }

    public static final class onExtraCallback<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallback;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onExtraCallback(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallback = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<Object> apply(writeRaw<BaseApiResponse<Object>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.BackHandlerKtExternalSyntheticLambda5(new Function1<BaseApiResponse<Object>, deserializeIp<? extends Object>>() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment.onExtraCallback.1
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
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
            }));
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, BuildConfig.FLAVOR);
            MapConverter mapConverter = this.onExtraCallback;
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

    public static final class onWarmupCompleted<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onNavigationEvent;
        final /* synthetic */ MapConverter onWarmupCompleted;

        public onWarmupCompleted(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onWarmupCompleted = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<Boolean> apply(writeRaw<BaseApiResponse<Boolean>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, BuildConfig.FLAVOR);
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new UtilsKtExternalSyntheticLambda17.BackHandlerKtExternalSyntheticLambda5(new Function1<BaseApiResponse<Boolean>, deserializeIp<? extends Boolean>>() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment.onWarmupCompleted.2
                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends Boolean> invoke(BaseApiResponse<Boolean> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, BuildConfig.FLAVOR);
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = Boolean.class.newInstance();
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

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 843344631, -843344629, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        int i4 = asBinder + 107;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class onNavigationEvent implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onNavigationEvent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() != 3) {
                return;
            }
            VerifyUssCardCvcFragment.onNavigationEvent(VerifyUssCardCvcFragment.this);
            VerifyUssCardCvcFragment.onWarmupCompleted(VerifyUssCardCvcFragment.this);
        }
    }

    private static final void onNavigationEvent(VerifyUssCardCvcFragment verifyUssCardCvcFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertByteArrayToFloatArray.onExtraCallback(1265579L, false, (String) null, (Map) null, (Function1) null, 13, (Object) null);
            VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifyUssCardCvcFragment.IAuthTabCallbackDefault(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
            return;
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1265579L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifyUssCardCvcFragment.IAuthTabCallbackDefault(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
    }

    private static final Unit onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment}, -111368187, 111368190, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 39;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, BuildConfig.FLAVOR);
        EditText editText = verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.getEditText();
        if (editText != null) {
            int i2 = asInterface + 113;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                editText.setText(BuildConfig.FLAVOR);
                int i3 = 76 / 0;
            } else {
                editText.setText(BuildConfig.FLAVOR);
            }
        }
        if (!(th instanceof TossApiCallException.ApiError)) {
            getParamImp.onWarmupCompleted(th, verifyUssCardCvcFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        } else {
            verifyUssCardCvcFragment.IAuthTabCallback((TossApiCallException.ApiError) th);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Editable text;
        final VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        InterstitialAdExtendedListener interstitialAdExtendedListenerOnActivityResized = AdSettingsIntegrationErrorMode.onNavigationEvent.onActivityResized();
        long jICustomTabsCallback_Parcel = verifyUssCardCvcFragment.IAuthTabCallbackDefault().onExtraCallbackWithResult().ICustomTabsCallback_Parcel();
        EditText editText = verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.getEditText();
        if (editText != null) {
            int i4 = asInterface + 49;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            text = editText.getText();
        } else {
            text = null;
        }
        writeRaw writerawOnNavigationEvent = interstitialAdExtendedListenerOnActivityResized.onNavigationEvent(jICustomTabsCallback_Parcel, new allowsCustomTabAuth(String.valueOf(text)));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
        writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        verifyUssCardCvcFragment.autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return VerifyUssCardCvcFragment.onWarmupCompleted(this.f$0, (Throwable) obj);
            }
        }, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return VerifyUssCardCvcFragment.onWarmupCompleted(this.f$0, obj);
            }
        }));
        return null;
    }

    private static final Unit onWarmupCompleted(VerifyUssCardCvcFragment verifyUssCardCvcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback("error_title", verifyUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_not_matched));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 35;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a((char) (View.combineMeasuredStates(0, 0) + 64416), Color.green(0) + 880876950, new char[]{11374, 22330, 52008, 20409, 19812}, new char[]{63468, 47200, 65135, 15120}, new char[]{38470, 33053, 41012, 12283}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), verifyUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_error_max_dialog_title));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r1.equals("CvcMaxDailyFailureCountExceeded") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r1.equals("CvcMaxFailureCountExceeded") == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(final TossApiCallException.ApiError apiError) {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String strAsBinder = apiError.asBinder();
        switch (strAsBinder.hashCode()) {
            case -1561653428:
                break;
            case -334881503:
                if (strAsBinder.equals("CvcNotMatched")) {
                    ConvertByteArrayToFloatArray.onExtraCallback(1265577L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda11
                        public final Object invoke(Object obj) {
                            return VerifyUssCardCvcFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
                        }
                    }, 14, (Object) null);
                    String string = getString(R.string.teens_uss_card_auth_cvc_not_matched);
                    Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
                    int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
                    onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, string}, 959347090, -959347084, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
                    Object[] objArr = {M_.onExtraCallback, IAuthTabCallback().onExtraCallback};
                    int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
                    M_.onNavigationEvent(1312897292, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, -1312897289, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda14
                    public final Object invoke(Object obj) {
                        return VerifyUssCardCvcFragment.onExtraCallback(apiError, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                i = asBinder + 23;
                asInterface = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 372985117:
                break;
            case 930154569:
                if (!strAsBinder.equals("CvcNotMatchedThreeTimes")) {
                    int i5 = asBinder + 107;
                    asInterface = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 4;
                    }
                    Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, BuildConfig.FLAVOR);
                    CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext2, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda14
                        public final Object invoke(Object obj2) {
                            return VerifyUssCardCvcFragment.onExtraCallback(apiError, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                        }
                    });
                    i = asBinder + 23;
                    asInterface = i % 128;
                    if (i % 2 == 0) {
                    }
                }
                ConvertByteArrayToFloatArray.onExtraCallback(1265575L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda12
                    public final Object invoke(Object obj2) {
                        return VerifyUssCardCvcFragment.IAuthTabCallback(this.f$0, (SetDetectableSize) obj2);
                    }
                }, 14, (Object) null);
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, BuildConfig.FLAVOR);
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext3, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda13
                    public final Object invoke(Object obj2) {
                        return VerifyUssCardCvcFragment.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    }
                });
                return;
            default:
                Context contextRequireContext22 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext22, BuildConfig.FLAVOR);
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext22, new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda14
                    public final Object invoke(Object obj2) {
                        return VerifyUssCardCvcFragment.onExtraCallback(apiError, (CommonModule_setLeftEdgeTouchEnabled) obj2);
                    }
                });
                i = asBinder + 23;
                asInterface = i % 128;
                if (i % 2 == 0) {
                }
                break;
        }
    }

    private static final Unit onNavigationEvent(VerifyUssCardCvcFragment verifyUssCardCvcFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, BuildConfig.FLAVOR);
        ConvertByteArrayToFloatArray.onExtraCallback(1265581L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        verifyUssCardCvcFragment.asBinder();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 93;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(final VerifyUssCardCvcFragment verifyUssCardCvcFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(verifyUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_error_max_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(verifyUssCardCvcFragment.getString(addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted) ? R.string.teens_uss_card_auth_under_fourteen_password_error_max_dialog_message : R.string.teens_uss_card_auth_password_error_max_dialog_message, new Object[]{PlayerErrorCode.onPostMessage()}));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (DialogInterface) obj};
                return (Unit) VerifyUssCardCvcFragment.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, 357135868, -357135867, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            }
        })}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
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
        int i5 = $11 + 125;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 43 - (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (-b3);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), 44 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), Color.argb(0, 0, 0, 0) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16801188), Drawable.resolveOpacity(0, 0) + 50, Color.green(0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(BuildConfig.FLAVOR) + 45849), View.MeasureSpec.getSize(0) + 29, 12576 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackDefault ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (onTransact ^ 7798559133331975163L)));
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

    private static final Unit onNavigationEvent(TossApiCallException.ApiError apiError, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, BuildConfig.FLAVOR);
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(apiError.onTransact());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(apiError.getMessage());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 3;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
    }

    private static final Unit onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment.showProgressDialog$default(verifyUssCardCvcFragment, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 1;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return unit;
    }

    private static final void onExtraCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        verifyUssCardCvcFragment.dismissProgressDialog();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        int i5 = asInterface + 5;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1265865L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        VerifySessionViewModel verifySessionViewModelIAuthTabCallbackDefault = verifyUssCardCvcFragment.IAuthTabCallbackDefault();
        PhotoBrowseView9 photoBrowseView9 = PhotoBrowseView9.USS_CARD;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getTapTimeout() >> 16), 1638294552 - ExpandableListView.getPackedPositionChild(0L), new char[]{63437, 61752, 10338, 51881, 43931, 52821, 49461}, new char[]{63468, 47200, 65135, 15120}, new char[]{6465, 42596, 15457, 26134}, objArr);
        VerifySessionViewModel.onExtraCallbackWithResult(-258671625, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifySessionViewModelIAuthTabCallbackDefault, photoBrowseView9, true, ((String) objArr[0]).intern()}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 258671628);
        VerifySessionViewModel.IAuthTabCallback(verifyUssCardCvcFragment.IAuthTabCallbackDefault(), (Function1) null, (Function1) null, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, verifyUssCardCvcFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 21;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Editable text;
        final VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        int i = 2 % 2;
        shouldAutoplay shouldautoplayAsBinder = verifyUssCardCvcFragment.IAuthTabCallbackDefault().asBinder();
        long jIsEngagementSignalsApiAvailable = ((enableVirtualViewWindowFocusDetection) VerifySessionViewModel.onExtraCallbackWithResult(-1184650058, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{verifyUssCardCvcFragment.IAuthTabCallbackDefault()}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 1184650066)).isEngagementSignalsApiAvailable();
        long jICustomTabsCallback_Parcel = verifyUssCardCvcFragment.IAuthTabCallbackDefault().onExtraCallbackWithResult().ICustomTabsCallback_Parcel();
        EditText editText = verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.getEditText();
        Object obj = null;
        if (editText != null) {
            text = editText.getText();
            int i2 = asInterface + 89;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            text = null;
        }
        writeRaw writerawOnExtraCallbackWithResult = shouldautoplayAsBinder.onExtraCallbackWithResult(new getReactApplicationContextIfActiveOrWarn(jIsEngagementSignalsApiAvailable, jICustomTabsCallback_Parcel, String.valueOf(text), verifyUssCardCvcFragment.asInterface()));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, BuildConfig.FLAVOR);
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new onWarmupCompleted(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj2) {
                return VerifyUssCardCvcFragment.onExtraCallback(this.f$0, (deserializeUriNullableCollection) obj2);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj2) {
                VerifyUssCardCvcFragment.onWarmupCompleted(function1, obj2);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda4
            public final void run() {
                Object[] objArr2 = {this.f$0};
                VerifyUssCardCvcFragment.onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr2, 602931785, -602931781, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj2) {
                return VerifyUssCardCvcFragment.onWarmupCompleted(this.f$0, (Boolean) obj2);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda6
            public final void accept(Object obj2) {
                VerifyUssCardCvcFragment.IAuthTabCallback(function12, obj2);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj2) {
                return VerifyUssCardCvcFragment.onExtraCallbackWithResult(this.f$0, (Throwable) obj2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.verify.ussCard.VerifyUssCardCvcFragment$$ExternalSyntheticLambda8
            public final void accept(Object obj2) {
                VerifyUssCardCvcFragment.onNavigationEvent(function13, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, BuildConfig.FLAVOR);
        verifyUssCardCvcFragment.autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i4 = asInterface + 99;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{IAuthTabCallbackDefault(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
            throw null;
        }
        VerifySessionViewModel.onExtraCallbackWithResult(-484996305, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), new Object[]{IAuthTabCallbackDefault(), ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android.onRelationshipValidationResult.IAuthTabCallback}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), 484996306);
        int i3 = asBinder + 79;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        VerifyUssCardCvcFragment verifyUssCardCvcFragment = (VerifyUssCardCvcFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.setError(str);
        verifyUssCardCvcFragment.IAuthTabCallback().onExtraCallback.setSelected(true);
        int i4 = asInterface + 31;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback().onExtraCallback.setError((CharSequence) null);
        IAuthTabCallback().onExtraCallback.setSelected(false);
        int i4 = asBinder + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
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

    public static final class asInterface extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (String) onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment}, -1309582137, 1309582142, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static /* synthetic */ void IAuthTabCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment}, 602931785, -602931781, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyUssCardCvcFragment verifyUssCardCvcFragment, DialogInterface dialogInterface) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment, dialogInterface}, 357135868, -357135867, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final void onWarmupCompleted() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, -111368187, 111368190, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final void onExtraCallbackWithResult() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 66206338, -66206331, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private static final Unit onExtraCallback(VerifyUssCardCvcFragment verifyUssCardCvcFragment, Throwable th) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{verifyUssCardCvcFragment, th}, 1824015405, -1824015405, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final void IAuthTabCallbackStub() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this}, 843344631, -843344629, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    private final void onExtraCallbackWithResult(String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallbackWithResult(iOnExtraCallback, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), new Object[]{this, str}, 959347090, -959347084, iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback());
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = 6281099095163640855L;
        IAuthTabCallbackStub = -1776194565;
        onTransact = (char) 27643;
    }
}
