package viva.republica.toss.guest.certify.ussCard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PointF;
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
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseFragment;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.textField.TextFieldLine;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.MapConverter;
import o.NetConverter3;
import o.PageContext;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.UST_CMP_Issue_Confirm;
import o.access8100;
import o.addAllCommandLine;
import o.addExtra;
import o.clearTid;
import o.getNativeModuleIteratorReactAndroid_release;
import o.getWrite;
import o.preFillDefault;
import o.setMessageBytes;
import o.setTurboModuleRegistry;
import o.setVolume;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VerifyGuestUssCardCvcFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static char asBinder;
    private static int asInterface;
    public static final int onExtraCallback;
    private static char onTransact;
    private final Lazy onExtraCallbackWithResult;
    private IAuthTabCallback onNavigationEvent;
    private final PageContext onWarmupCompleted;

    public interface IAuthTabCallback {
        void IPostMessageServiceStub();

        void onGreatestScrollPercentageIncreased();
    }

    static {
        onWarmupCompleted();
        IAuthTabCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(VerifyGuestUssCardCvcFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUssCardAuthCvcBinding;", 0)};
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        onExtraCallback = 8;
        int i = IAuthTabCallback_Parcel + 31;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment = (VerifyGuestUssCardCvcFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1576070806, new Object[]{verifyGuestUssCardCvcFragment, setDetectableSize}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1576070808, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        }
        Unit unit = (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1576070806, new Object[]{verifyGuestUssCardCvcFragment, setDetectableSize}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1576070808, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i3 = 97 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(verifyGuestUssCardCvcFragment, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(verifyGuestUssCardCvcFragment, setDetectableSize);
        int i3 = IAuthTabCallbackStubProxy + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void IAuthTabCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(verifyGuestUssCardCvcFragment, view);
        int i4 = IAuthTabCallbackStubProxy + 57;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i | i7);
        int i9 = i2 | i8;
        int i10 = ~i2;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i2)) | (~(i10 | i5));
        int i13 = i5 + i2 + i3 + (513088896 * i4) + ((-1342203445) * i6);
        int i14 = i13 * i13;
        int i15 = (665020156 * i5) + 661520384 + (1303681286 * i2) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i3) + ((-771751936) * i4) + (1382285312 * i6) + ((-350355456) * i14);
        int i16 = ((i5 * (-363642324)) - 614971735) + (i2 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i3 * (-363641803)) + (i4 * (-2127225984)) + (i6 * (-1080704249)) + (i14 * (-1523187712));
        int i17 = i15 + (i16 * i16 * (-227409920));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onWarmupCompleted(objArr) : IAuthTabCallbackDefault(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossApiCallException.ApiError apiError = (TossApiCallException.ApiError) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -689834130, new Object[]{apiError, commonModule_setLeftEdgeTouchEnabled}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 689834133, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        int i4 = IAuthTabCallbackStubProxy + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(verifyGuestUssCardCvcFragment, setDetectableSize);
        int i4 = asInterface + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ long onNavigationEvent(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Long) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1069937257, new Object[]{verifyGuestUssCardCvcFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1069937262, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).longValue();
        int i4 = asInterface + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return jLongValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(verifyGuestUssCardCvcFragment, obj);
        int i4 = asInterface + 41;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(verifyGuestUssCardCvcFragment, th);
        int i4 = IAuthTabCallbackStubProxy + 121;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(verifyGuestUssCardCvcFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        int i5 = asInterface + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment = (VerifyGuestUssCardCvcFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(verifyGuestUssCardCvcFragment, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(verifyGuestUssCardCvcFragment, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(verifyGuestUssCardCvcFragment, dialogInterface);
        int i3 = IAuthTabCallbackStubProxy + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub(verifyGuestUssCardCvcFragment, setDetectableSize);
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(verifyGuestUssCardCvcFragment, setDetectableSize);
        int i3 = asInterface + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return 1265573L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VerifyGuestUssCardCvcFragment() {
        super(R.layout.fragment_uss_card_auth_cvc);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.onWarmupCompleted);
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda11
            public final Object invoke() {
                return Long.valueOf(VerifyGuestUssCardCvcFragment.onNavigationEvent(this.f$0));
            }
        });
    }

    public static final /* synthetic */ void IAuthTabCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        verifyGuestUssCardCvcFragment.onExtraCallback();
        int i4 = IAuthTabCallbackStubProxy + 49;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        verifyGuestUssCardCvcFragment.IAuthTabCallback();
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, 58 % (ViewConfiguration.getTapTimeout() + 106), objArr);
            return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), Long.valueOf(onExtraCallbackWithResult()))});
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, 16 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), Long.valueOf(onExtraCallbackWithResult()))});
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, UST_CMP_Issue_Confirm> {
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, UST_CMP_Issue_Confirm.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUssCardAuthCvcBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final UST_CMP_Issue_Confirm invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return UST_CMP_Issue_Confirm.IAuthTabCallback(view);
        }
    }

    private final UST_CMP_Issue_Confirm onNavigationEvent() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.onWarmupCompleted;
            addallcommandline = IAuthTabCallback[1];
        } else {
            pageContext = this.onWarmupCompleted;
            addallcommandline = IAuthTabCallback[0];
        }
        UST_CMP_Issue_Confirm uST_CMP_Issue_Confirm = (UST_CMP_Issue_Confirm) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = IAuthTabCallbackStubProxy + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return uST_CMP_Issue_Confirm;
    }

    private final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            return ((Number) value).longValue();
        }
        int i4 = 41 / 0;
        return ((Number) value).longValue();
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) throws Throwable {
        VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment = (VerifyGuestUssCardCvcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = verifyGuestUssCardCvcFragment.getArguments();
        if (arguments == null) {
            return -1L;
        }
        int i4 = asInterface + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{17586, 23585, 41283, 37955, 7970, 7427, 9832, 28358, 63346, 33387, 47277, 64485, 53626, 36259, 20993, 52559, 60823, 63681, 42880, 52465, 3704, 36844}, 21 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        long j = arguments.getLong(((String) objArr2[0]).intern());
        int i6 = asInterface + 111;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public boolean onBackPressed() {
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getParentFragmentManager().extraCommand();
        return i3 == 0;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        IAuthTabCallbackStub();
        int i4 = asInterface + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onExtraCallbackWithResult() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() != 3) {
                return;
            }
            VerifyGuestUssCardCvcFragment.onExtraCallbackWithResult(VerifyGuestUssCardCvcFragment.this);
            VerifyGuestUssCardCvcFragment.IAuthTabCallback(VerifyGuestUssCardCvcFragment.this);
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        EditText editText = onNavigationEvent().onExtraCallback.getEditText();
        if (editText != null) {
            editText.setImeOptions(6);
            editText.setInputType(2);
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(3)});
            editText.addTextChangedListener(new onExtraCallbackWithResult());
            int i4 = IAuthTabCallbackStubProxy + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        TdsImageView tdsImageView = onNavigationEvent().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        TdsImageView.setImage$default(tdsImageView, getNativeModuleIteratorReactAndroid_release.CLEAR_BLACK.getCardImage().getCvcBackImageUrl(), (Function1) null, (Function1) null, 6, (Object) null);
        onNavigationEvent().IAuthTabCallback.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyGuestUssCardCvcFragment.IAuthTabCallback(this.f$0, view);
            }
        });
    }

    private static final Unit asBinder(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, (ViewConfiguration.getScrollBarFadeDuration() % 68) * 88, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), Long.valueOf(verifyGuestUssCardCvcFragment.onExtraCallbackWithResult()));
        return Unit.INSTANCE;
    }

    private static final void onWarmupCompleted(final VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1265579L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardCvcFragment.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IAuthTabCallback iAuthTabCallback = verifyGuestUssCardCvcFragment.onNavigationEvent;
        if (iAuthTabCallback == null) {
            int i2 = IAuthTabCallbackStubProxy + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            iAuthTabCallback = null;
        }
        iAuthTabCallback.IPostMessageServiceStub();
        int i4 = IAuthTabCallbackStubProxy + 47;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, 16 - TextUtils.indexOf("", ""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), Long.valueOf(verifyGuestUssCardCvcFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1265865L, false, (String) null, (Map) null, new VerifyGuestUssCardCvcFragment$.ExternalSyntheticLambda2(verifyGuestUssCardCvcFragment), 14, (Object) null);
        IAuthTabCallback iAuthTabCallback = verifyGuestUssCardCvcFragment.onNavigationEvent;
        if (iAuthTabCallback == null) {
            int i2 = IAuthTabCallbackStubProxy + 97;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = IAuthTabCallbackStubProxy + 15;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 2;
            }
            iAuthTabCallback = null;
        }
        iAuthTabCallback.onGreatestScrollPercentageIncreased();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[PHI: r1
      0x0032: PHI (r1v7 android.widget.EditText) = (r1v6 android.widget.EditText), (r1v14 android.widget.EditText) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment r8, java.lang.Throwable r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallbackStubProxy
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.asInterface = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            o.UST_CMP_Issue_Confirm r1 = r8.onNavigationEvent()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.onExtraCallback
            android.widget.EditText r1 = r1.getEditText()
            r3 = 1
            int r3 = r3 / 0
            if (r1 == 0) goto L3e
            goto L32
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            o.UST_CMP_Issue_Confirm r1 = r8.onNavigationEvent()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.onExtraCallback
            android.widget.EditText r1 = r1.getEditText()
            if (r1 == 0) goto L3e
        L32:
            r1.setText(r2)
            int r1 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallbackStubProxy
            int r1 = r1 + 79
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.asInterface = r2
            int r1 = r1 % r0
        L3e:
            boolean r0 = r9 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            if (r0 == 0) goto L48
            im.toss.network.throwable.TossApiCallException$ApiError r9 = (im.toss.network.throwable.TossApiCallException.ApiError) r9
            r8.onExtraCallbackWithResult(r9)
            goto L57
        L48:
            android.content.Context r1 = r8.requireContext()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r9
            o.getParamImp.onWarmupCompleted(r0, r1, r2, r3, r4, r5, r6, r7)
        L57:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.onExtraCallback(viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment, java.lang.Throwable):kotlin.Unit");
    }

    private final void onExtraCallback() {
        Editable text;
        int i = 2 % 2;
        setVolume setvolumeNewSession = AdSettingsIntegrationErrorMode.onNavigationEvent.newSession();
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult();
        EditText editText = onNavigationEvent().onExtraCallback.getEditText();
        Object obj = null;
        if (editText != null) {
            int i2 = asInterface + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                editText.getText();
                obj.hashCode();
                throw null;
            }
            text = editText.getText();
        } else {
            int i3 = IAuthTabCallbackStubProxy + 101;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            text = null;
        }
        writeRaw<BaseApiResponse<Object>> writerawOnWarmupCompleted = setvolumeNewSession.onWarmupCompleted(new setTurboModuleRegistry(jOnExtraCallbackWithResult, String.valueOf(text)));
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        autoDisposable(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new VerifyGuestUssCardCvcFragment$.ExternalSyntheticLambda9(this), new VerifyGuestUssCardCvcFragment$.ExternalSyntheticLambda10(this)));
        int i5 = IAuthTabCallbackStubProxy + 115;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asBinder);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int iResolveOpacity = Drawable.resolveOpacity(i3, i3) + 10;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), iResolveOpacity, edgeSlop, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0) + 10, TextUtils.getOffsetAfter("", 0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 16014), Drawable.resolveOpacity(0, 0) + 14, Color.rgb(0, 0, 0) + 16797117, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $10 + 33;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final Unit asInterface(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_title", verifyGuestUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_not_matched));
        Object[] objArr = new Object[1];
        a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, View.MeasureSpec.getMode(0) + 16, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), Long.valueOf(verifyGuestUssCardCvcFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 11;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r1.equals("TV4903") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        o.ConvertByteArrayToFloatArray.onExtraCallback(1265575, false, (java.lang.String) null, (java.util.Map) null, new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$.ExternalSyntheticLambda5(r12), 14, (java.lang.Object) null);
        r13 = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "");
        o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r13, new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$.ExternalSyntheticLambda6(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1.equals("TV4905") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r1.equals("TV4904") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(im.toss.network.throwable.TossApiCallException.ApiError r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.asInterface
            int r1 = r1 + 105
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r1 = r13.asBinder()
            int r2 = r1.hashCode()
            java.lang.String r3 = ""
            switch(r2) {
                case -1809090359: goto L58;
                case -1809090358: goto L2f;
                case -1809090357: goto L25;
                case -1809090356: goto L1b;
                default: goto L19;
            }
        L19:
            goto Laf
        L1b:
            java.lang.String r0 = "TV4905"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L37
            goto Laf
        L25:
            java.lang.String r0 = "TV4904"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L37
            goto Laf
        L2f:
            java.lang.String r0 = "TV4903"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Laf
        L37:
            r4 = 1265575(0x134fa7, double:6.25277E-318)
            r6 = 0
            r7 = 0
            r8 = 0
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda5 r9 = new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda5
            r9.<init>(r12)
            r10 = 14
            r11 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r4, r6, r7, r8, r9, r10, r11)
            android.content.Context r13 = r12.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda6 r0 = new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda6
            r0.<init>(r12)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r13, r0)
            return
        L58:
            java.lang.String r2 = "TV4902"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L61
            goto Laf
        L61:
            r4 = 1265577(0x134fa9, double:6.25278E-318)
            r6 = 0
            r7 = 0
            r8 = 0
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda4 r9 = new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda4
            r9.<init>(r12)
            r10 = 14
            r11 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r4, r6, r7, r8, r9, r10, r11)
            int r13 = viva.republica.toss.R.string.teens_uss_card_auth_cvc_not_matched
            java.lang.String r13 = r12.getString(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r3)
            r12.onNavigationEvent(r13)
            o.M_ r13 = o.M_.onExtraCallback
            o.UST_CMP_Issue_Confirm r1 = r12.onNavigationEvent()
            im.toss.uikit.widget.textField.TextFieldLine r1 = r1.onExtraCallback
            java.lang.Object[] r3 = new java.lang.Object[]{r13, r1}
            int r5 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r8 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r7 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            int r4 = im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent()
            r2 = 1312897292(0x4e41390c, float:8.104353E8)
            r6 = -1312897289(0xffffffffb1bec6f7, float:-5.5523475E-9)
            o.M_.onNavigationEvent(r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            int r13 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.asInterface
            int r13 = r13 + 21
            int r1 = r13 % 128
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.IAuthTabCallbackStubProxy = r1
            int r13 = r13 % r0
            return
        Laf:
            android.content.Context r0 = r12.requireContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda7 r1 = new viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda7
            r1.<init>(r13)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.onExtraCallbackWithResult(im.toss.network.throwable.TossApiCallException$ApiError):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment = (VerifyGuestUssCardCvcFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{32591, 8824, 7832, 58628, 4591, 17647}, 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), verifyGuestUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_error_max_dialog_title));
        Object[] objArr3 = new Object[1];
        a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, (ViewConfiguration.getScrollBarSize() >> 8) + 16, objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), Long.valueOf(verifyGuestUssCardCvcFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 33;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return unit;
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {120, 11, 65, 93};
        private static final int $$b = 204;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int IAuthTabCallback = 478308967;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r7, short r8, byte r9) {
            /*
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r8 = r8 + 105
                byte[] r0 = viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.onExtraCallback.$$a
                int r9 = r9 * 2
                int r9 = r9 + 1
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.onExtraCallback.$$c(short, short, byte):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r22, int r23, char[] r24, boolean r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.onExtraCallback.a(int, int, char[], boolean, int, java.lang.Object[]):void");
        }

        private onExtraCallback() {
        }

        public final VerifyGuestUssCardCvcFragment onExtraCallback(long j) throws Throwable {
            int i = 2 % 2;
            VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment = new VerifyGuestUssCardCvcFragment();
            Bundle bundle = new Bundle();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, new char[]{3, 5, '\t', 65526, 65525, 65530, 16, 65535, 0, 65530, 4, 4, 65526, 4, 16, 5, 4, 65526, 6, 65528, 16, 65522}, true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 156, objArr);
            bundle.putLong(((String) objArr[0]).intern(), j);
            verifyGuestUssCardCvcFragment.setArguments(bundle);
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return verifyGuestUssCardCvcFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStub(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{6796, 12326, 5621, 2314, 63771, 14146, 47495, 33754, 45956, 36565, 16885, 12653, 40319, 43416, 64031, 33108}, 16 - TextUtils.indexOf("", ""), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), Long.valueOf(verifyGuestUssCardCvcFragment.onExtraCallbackWithResult()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(final VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1265581L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardCvcFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        IAuthTabCallback iAuthTabCallback = verifyGuestUssCardCvcFragment.onNavigationEvent;
        if (iAuthTabCallback == null) {
            int i2 = IAuthTabCallbackStubProxy + 15;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 85 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            iAuthTabCallback = null;
        }
        iAuthTabCallback.IPostMessageServiceStub();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(final VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(verifyGuestUssCardCvcFragment.getString(R.string.teens_uss_card_auth_cvc_error_max_dialog_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(verifyGuestUssCardCvcFragment.getString(addExtra.writeTypedObject(PlayerErrorCode.onWarmupCompleted) ^ true ? R.string.teens_uss_card_auth_password_error_max_dialog_message : R.string.teens_uss_card_auth_under_fourteen_password_error_max_dialog_message, new Object[]{PlayerErrorCode.onPostMessage()}));
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return VerifyGuestUssCardCvcFragment.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        })}, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 89;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Unit unit;
        TossApiCallException.ApiError apiError = (TossApiCallException.ApiError) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(apiError.onTransact());
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(apiError.getMessage());
            unit = Unit.INSTANCE;
            int i3 = 32 / 0;
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.onExtraCallback(apiError.onTransact());
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(apiError.getMessage());
            unit = Unit.INSTANCE;
        }
        int i4 = asInterface + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(String str) {
        UST_CMP_Issue_Confirm uST_CMP_Issue_ConfirmOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().onExtraCallback.setError(str);
            uST_CMP_Issue_ConfirmOnNavigationEvent = onNavigationEvent();
        } else {
            onNavigationEvent().onExtraCallback.setError(str);
            uST_CMP_Issue_ConfirmOnNavigationEvent = onNavigationEvent();
        }
        uST_CMP_Issue_ConfirmOnNavigationEvent.onExtraCallback.setSelected(true);
    }

    private final void IAuthTabCallback() {
        TextFieldLine textFieldLine;
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 57;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().onExtraCallback.setError((CharSequence) null);
            textFieldLine = onNavigationEvent().onExtraCallback;
            z = true;
        } else {
            onNavigationEvent().onExtraCallback.setError((CharSequence) null);
            textFieldLine = onNavigationEvent().onExtraCallback;
            z = false;
        }
        textFieldLine.setSelected(z);
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = context instanceof IAuthTabCallback;
        Object obj = context;
        if (!z) {
            if (!(getParentFragment() instanceof IAuthTabCallback)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            int i2 = asInterface + 91;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.guest.certify.ussCard.VerifyGuestUssCardCvcFragment.Callback");
            }
            int i4 = IAuthTabCallbackStubProxy + 29;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            obj = parentFragment;
        }
        this.onNavigationEvent = (IAuthTabCallback) obj;
        int i5 = IAuthTabCallbackStubProxy + 47;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 151948077, new Object[]{verifyGuestUssCardCvcFragment, setDetectableSize}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -151948073, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(TossApiCallException.ApiError apiError, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1469628994, new Object[]{apiError, commonModule_setLeftEdgeTouchEnabled}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1469628993, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1210820913, new Object[]{verifyGuestUssCardCvcFragment, commonModule_setLeftEdgeTouchEnabled}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1210820913, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final long onExtraCallback(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment) {
        return ((Long) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1069937257, new Object[]{verifyGuestUssCardCvcFragment}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1069937262, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback())).longValue();
    }

    private static final Unit onTransact(VerifyGuestUssCardCvcFragment verifyGuestUssCardCvcFragment, SetDetectableSize setDetectableSize) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1576070806, new Object[]{verifyGuestUssCardCvcFragment, setDetectableSize}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1576070808, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(TossApiCallException.ApiError apiError, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        return (Unit) onExtraCallback(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -689834130, new Object[]{apiError, commonModule_setLeftEdgeTouchEnabled}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 689834133, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = (char) 50882;
        onTransact = (char) 15844;
        IAuthTabCallbackDefault = (char) 14202;
        asBinder = (char) 1878;
    }
}
