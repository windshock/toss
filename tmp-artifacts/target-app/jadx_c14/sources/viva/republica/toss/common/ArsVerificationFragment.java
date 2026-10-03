package viva.republica.toss.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.SubTypography11;
import im.toss.tds.view.component.atom.text.Typography4;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.uikit.widget.CodeVerificationView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.GetTSAHashAlgName;
import o.NetConverter3;
import o.PageContext;
import o.ParamUtils;
import o.SearchBarKtExternalSyntheticLambda5;
import o.addAllCommandLine;
import o.advance;
import o.deserializeFloat;
import o.deserializeLongCollection;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.getTimestampBytes;
import o.preFillDefault;
import o.startRearDisplaySession;
import o.transparentBackground;
import o.writeRaw;
import o.zzaj;
import o.zzbb;
import o.zzbr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

@ActivityEmbeddingControllerembeddedActivityWindowInfo1ExternalSyntheticLambda0(onExtraCallback = startRearDisplaySession.HIGH)
@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ArsVerificationFragment extends BaseFragment {
    private boolean IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private String IAuthTabCallback_Parcel;
    private deserializeUriNullableCollection ICustomTabsCallback;
    private String access000;
    private boolean access100;
    private String asBinder;
    private final getTimestampBytes<Boolean> asInterface;
    private String getInterfaceDescriptor;
    private onExtraCallback onExtraCallbackWithResult;
    private final PageContext onNavigationEvent;
    private String onTransact;
    private onNavigationEvent onWarmupCompleted;
    private String writeTypedObject;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(ArsVerificationFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentArsVerificationBinding;", 0)};
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;

    public ArsVerificationFragment() {
        super(R.layout.fragment_ars_verification);
        this.onNavigationEvent = preFillDefault.onExtraCallbackWithResult(this, onWarmupCompleted.IAuthTabCallback);
        getTimestampBytes<Boolean> gettimestampbytesIAuthTabCallback = getTimestampBytes.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(gettimestampbytesIAuthTabCallback, "");
        this.asInterface = gettimestampbytesIAuthTabCallback;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ArsVerificationFragment onNavigationEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            ArsVerificationFragment arsVerificationFragment = new ArsVerificationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_OTP", str);
            bundle.putString("EXTRA_CUSTOM_GUIDE_TEXT", str2);
            bundle.putString("EXTRA_CUSTOM_HELP_SOUND_MESSAGE_TEXT", str3);
            bundle.putString("EXTRA_CUSTOM_GUIDE_SUB_TEXT", str4);
            bundle.putString("EXTRA_CUSTOM_WARNING_TEXT", str5);
            bundle.putString("EXTRA_CUSTOM_CALL_ARS_CTA_TEXT", str6);
            bundle.putString("EXTRA_CUSTOM_REPORT_ARS_CTA_TEXT", str7);
            arsVerificationFragment.setArguments(bundle);
            return arsVerificationFragment;
        }
    }

    public interface onExtraCallback {
        default long IAuthTabCallback() {
            return -1L;
        }

        void IAuthTabCallbackDefault();

        default void IAuthTabCallbackStub() {
        }

        void asInterface();

        void onExtraCallback(boolean z);

        default void onExtraCallbackWithResult() {
        }

        default void onWarmupCompleted() {
        }

        default String onNavigationEvent() {
            return "";
        }

        default Map<String, Object> onExtraCallback() {
            return new LinkedHashMap();
        }
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<View, GetTSAHashAlgName> {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

        onWarmupCompleted() {
            super(1, GetTSAHashAlgName.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentArsVerificationBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final GetTSAHashAlgName invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return GetTSAHashAlgName.onExtraCallbackWithResult(view);
        }
    }

    private final GetTSAHashAlgName asInterface() {
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(this, onExtraCallback[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        return (GetTSAHashAlgName) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    private final TdsButtonV1View asBinder() {
        TdsButtonV1View tdsButtonV1View = asInterface().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    private final CodeVerificationView IAuthTabCallbackStub() {
        CodeVerificationView codeVerificationView = asInterface().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(codeVerificationView, "");
        return codeVerificationView;
    }

    private final SubTypography11 access000() {
        SubTypography11 subTypography11 = asInterface().access100;
        Intrinsics.checkNotNullExpressionValue(subTypography11, "");
        return subTypography11;
    }

    private final TdsButtonV1View access100() {
        TdsButtonV1View tdsButtonV1View = asInterface().IAuthTabCallbackStub;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    private final TdsTextButtonV0View IAuthTabCallbackStubProxy() {
        TdsTextButtonV0View tdsTextButtonV0View = asInterface().asBinder;
        Intrinsics.checkNotNullExpressionValue(tdsTextButtonV0View, "");
        return tdsTextButtonV0View;
    }

    private final Typography6 getInterfaceDescriptor() {
        Typography6 typography6 = asInterface().asInterface;
        Intrinsics.checkNotNullExpressionValue(typography6, "");
        return typography6;
    }

    private final Typography4 IAuthTabCallbackDefault() {
        Typography4 typography4 = asInterface().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(typography4, "");
        return typography4;
    }

    private final Typography7 onTransact() {
        Typography7 typography7 = asInterface().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(typography7, "");
        return typography7;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (new RxPermissions(this).onExtraCallbackWithResult("android.permission.READ_PHONE_STATE")) {
            onNavigationEvent onnavigationevent = new onNavigationEvent();
            this.onWarmupCompleted = onnavigationevent;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            zzbb.onExtraCallbackWithResult(onnavigationevent, contextRequireContext, new IntentFilter("android.intent.action.PHONE_STATE"), 2);
        }
    }

    public final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.access000 = str;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        asInterface().onWarmupCompleted.setLoading(z);
        asInterface().IAuthTabCallbackStub.setLoading(z);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_HAS_ARS_CALL_REQUEST", this.IAuthTabCallbackStubProxy);
        bundle.putBoolean("STATE_GOT_ARS_CALL", this.IAuthTabCallbackDefault);
        bundle.putBoolean("STATE_IS_ARS_DONE", this.access100);
        String str = this.access000;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        bundle.putString("EXTRA_OTP", str);
        String str3 = this.asBinder;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str3 = null;
        }
        bundle.putString("EXTRA_CUSTOM_GUIDE_TEXT", str3);
        String str4 = this.IAuthTabCallback_Parcel;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        bundle.putString("EXTRA_CUSTOM_HELP_SOUND_MESSAGE_TEXT", str4);
        String str5 = this.IAuthTabCallbackStub;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str5 = null;
        }
        bundle.putString("EXTRA_CUSTOM_GUIDE_SUB_TEXT", str5);
        String str6 = this.writeTypedObject;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str6 = null;
        }
        bundle.putString("EXTRA_CUSTOM_WARNING_TEXT", str6);
        String str7 = this.onTransact;
        if (str7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str7 = null;
        }
        bundle.putString("EXTRA_CUSTOM_CALL_ARS_CTA_TEXT", str7);
        String str8 = this.getInterfaceDescriptor;
        if (str8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str2 = str8;
        }
        bundle.putString("EXTRA_CUSTOM_REPORT_ARS_CTA_TEXT", str2);
    }

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        boolean z = context instanceof onExtraCallback;
        Object obj = context;
        if (!z) {
            if (!(getParentFragment() instanceof onExtraCallback)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            onExtraCallback parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.common.ArsVerificationFragment.ArsVerificationCallback");
            }
            obj = parentFragment;
        }
        this.onExtraCallbackWithResult = (onExtraCallback) obj;
    }

    public void onResume() {
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        if (this.IAuthTabCallbackStubProxy && this.access100) {
            this.asInterface.onExtraCallback(Boolean.FALSE);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        onNavigationEvent onnavigationevent = this.onWarmupCompleted;
        if (onnavigationevent != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            zzbb.onWarmupCompleted(onnavigationevent, contextRequireContext);
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.IAuthTabCallbackStubProxy = bundle.getBoolean("STATE_HAS_ARS_CALL_REQUEST");
            this.IAuthTabCallbackDefault = bundle.getBoolean("STATE_GOT_ARS_CALL");
            this.access100 = bundle.getBoolean("STATE_IS_ARS_DONE");
            String string = bundle.getString("EXTRA_OTP", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.access000 = string;
            String string2 = bundle.getString("EXTRA_CUSTOM_GUIDE_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            this.asBinder = string2;
            String string3 = bundle.getString("EXTRA_CUSTOM_HELP_SOUND_MESSAGE_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            this.IAuthTabCallback_Parcel = string3;
            String string4 = bundle.getString("EXTRA_CUSTOM_GUIDE_SUB_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            this.IAuthTabCallbackStub = string4;
            String string5 = bundle.getString("EXTRA_CUSTOM_WARNING_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            this.writeTypedObject = string5;
            String string6 = bundle.getString("EXTRA_CUSTOM_CALL_ARS_CTA_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string6, "");
            this.onTransact = string6;
            String string7 = bundle.getString("EXTRA_CUSTOM_REPORT_ARS_CTA_TEXT", "");
            Intrinsics.checkNotNullExpressionValue(string7, "");
            this.getInterfaceDescriptor = string7;
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                String string8 = arguments.getString("EXTRA_OTP", "");
                Intrinsics.checkNotNullExpressionValue(string8, "");
                this.access000 = string8;
                String string9 = arguments.getString("EXTRA_CUSTOM_GUIDE_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string9, "");
                this.asBinder = string9;
                String string10 = arguments.getString("EXTRA_CUSTOM_HELP_SOUND_MESSAGE_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string10, "");
                this.IAuthTabCallback_Parcel = string10;
                String string11 = arguments.getString("EXTRA_CUSTOM_GUIDE_SUB_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string11, "");
                this.IAuthTabCallbackStub = string11;
                String string12 = arguments.getString("EXTRA_CUSTOM_WARNING_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string12, "");
                this.writeTypedObject = string12;
                String string13 = arguments.getString("EXTRA_CUSTOM_CALL_ARS_CTA_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string13, "");
                this.onTransact = string13;
                String string14 = arguments.getString("EXTRA_CUSTOM_REPORT_ARS_CTA_TEXT", "");
                Intrinsics.checkNotNullExpressionValue(string14, "");
                this.getInterfaceDescriptor = string14;
            }
        }
        onExtraCallback();
        if (onExtraCallbackWithResult()) {
            onNavigationEvent();
        }
        IAuthTabCallback_Parcel();
    }

    public boolean onBackPressed() {
        if (this.IAuthTabCallbackStubProxy) {
            ICustomTabsCallback();
            return true;
        }
        return super.onBackPressed();
    }

    private final void ICustomTabsCallback() {
        Context context = getContext();
        if (context != null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda18
                public final Object invoke(Object obj) {
                    return ArsVerificationFragment.onExtraCallback(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(final ArsVerificationFragment arsVerificationFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(arsVerificationFragment.getString(R.string.app_common___c7d8c79f7e));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.IAuthTabCallbackDefault(new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.onExtraCallbackWithResult(this.f$0, (DialogInterface) obj);
            }
        })};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 2115179004, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -2115178997, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(ArsVerificationFragment arsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        FragmentActivity activity = arsVerificationFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback() {
        zzbr.onWarmupCompleted(this.ICustomTabsCallback);
        asBinder().setVisibility(0);
        TdsButtonV1View tdsButtonV1ViewAsBinder = asBinder();
        String string = this.onTransact;
        String str = null;
        if (string == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            string = null;
        }
        if (string.length() == 0) {
            string = getString(R.string.ars_call_button_text);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        tdsButtonV1ViewAsBinder.setText(string);
        onWarmupCompleted(false);
        access000().setVisibility(0);
        SubTypography11 subTypography11Access000 = access000();
        String string2 = this.writeTypedObject;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            string2 = null;
        }
        if (string2.length() == 0) {
            string2 = getString(R.string.ars_verification_bottom_warning);
            Intrinsics.checkNotNullExpressionValue(string2, "");
        }
        subTypography11Access000.setText(string2);
        access100().setVisibility(8);
        TdsButtonV1View tdsButtonV1ViewAccess100 = access100();
        String string3 = this.getInterfaceDescriptor;
        if (string3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            string3 = null;
        }
        if (string3.length() == 0) {
            string3 = getString(R.string.ars_report_button_text);
            Intrinsics.checkNotNullExpressionValue(string3, "");
        }
        tdsButtonV1ViewAccess100.setText(string3);
        IAuthTabCallbackStubProxy().setVisibility(8);
        final Typography6 interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            interfaceDescriptor.setText(getString(R.string.ars_help_sound_disabled_button_text));
            interfaceDescriptor.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArsVerificationFragment.onNavigationEvent(this.f$0, interfaceDescriptor, view);
                }
            });
        }
        Typography4 typography4IAuthTabCallbackDefault = IAuthTabCallbackDefault();
        String string4 = this.asBinder;
        if (string4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            string4 = null;
        }
        if (string4.length() == 0) {
            string4 = getString(R.string.ars_verification_initial_guide);
            Intrinsics.checkNotNullExpressionValue(string4, "");
        }
        typography4IAuthTabCallbackDefault.setText(string4);
        String str2 = this.IAuthTabCallbackStub;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str2 = null;
        }
        if (str2.length() > 0) {
            onTransact().setVisibility(0);
            Typography7 typography7OnTransact = onTransact();
            String str3 = this.IAuthTabCallbackStub;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str3 = null;
            }
            typography7OnTransact.setText(str3);
        }
        String str4 = this.access000;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str4 = null;
        }
        if (str4.length() > 0) {
            IAuthTabCallbackStub().setVisibility(0);
            CodeVerificationView codeVerificationViewIAuthTabCallbackStub = IAuthTabCallbackStub();
            String str5 = this.access000;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str = str5;
            }
            codeVerificationViewIAuthTabCallbackStub.setCode(str);
            return;
        }
        IAuthTabCallbackStub().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(final ArsVerificationFragment arsVerificationFragment, Typography6 typography6, View view) {
        onExtraCallback onextracallback = arsVerificationFragment.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onextracallback.onWarmupCompleted();
        Context context = typography6.getContext();
        if (context != null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda7
                public final Object invoke(Object obj) {
                    return ArsVerificationFragment.onExtraCallbackWithResult(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(ArsVerificationFragment arsVerificationFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(Integer.valueOf(R.string.ars_help_sound_disabled_title));
        String string = arsVerificationFragment.IAuthTabCallback_Parcel;
        if (string == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            string = null;
        }
        if (string.length() == 0) {
            string = arsVerificationFragment.getString(R.string.ars_help_sound_disabled_message);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void IAuthTabCallback_Parcel() {
        getTimestampBytes<Boolean> gettimestampbytes = this.asInterface;
        ParamUtils paramUtils = ParamUtils.LONG;
        getByteBuffer getbytebufferOnTransact = gettimestampbytes.onTransact(paramUtils.getDelay(), TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.onExtraCallbackWithResult(this.f$0, (Boolean) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnTransact.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda14
            public final void accept(Object obj) {
                ArsVerificationFragment.IAuthTabCallback(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        autoDisposable(deserializeurinullablecollectionIAuthTabCallback);
        transparentBackground.onWarmupCompleted(asBinder(), paramUtils, new View.OnClickListener() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArsVerificationFragment.onWarmupCompleted(this.f$0, view);
            }
        });
        access100().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArsVerificationFragment.IAuthTabCallback(this.f$0, view);
            }
        });
        transparentBackground.onWarmupCompleted(IAuthTabCallbackStubProxy(), paramUtils, new View.OnClickListener() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ArsVerificationFragment.onTransact(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(ArsVerificationFragment arsVerificationFragment, Boolean bool) {
        if (!arsVerificationFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(bool);
        arsVerificationFragment.onExtraCallback(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(ArsVerificationFragment arsVerificationFragment, View view) {
        arsVerificationFragment.onWarmupCompleted(true);
        onExtraCallback onextracallback = arsVerificationFragment.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onextracallback.IAuthTabCallbackDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ArsVerificationFragment arsVerificationFragment, View view) {
        arsVerificationFragment.asInterface.onExtraCallback(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransact(ArsVerificationFragment arsVerificationFragment, View view) {
        arsVerificationFragment.IAuthTabCallback();
    }

    public final void onNavigationEvent() {
        asBinder().setVisibility(8);
        access000().setVisibility(8);
        access100().setVisibility(0);
        IAuthTabCallbackStubProxy().setVisibility(0);
        final Typography6 interfaceDescriptor = getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            interfaceDescriptor.setText(getString(R.string.ars_help_not_received_call_button_text));
            interfaceDescriptor.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArsVerificationFragment.IAuthTabCallback(this.f$0, interfaceDescriptor, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ArsVerificationFragment arsVerificationFragment, Typography6 typography6, View view) {
        onExtraCallback onextracallback = arsVerificationFragment.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onextracallback.onExtraCallbackWithResult();
        Context context = typography6.getContext();
        if (context != null) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda19
                public final Object invoke(Object obj) {
                    return ArsVerificationFragment.onExtraCallbackWithResult((CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.ars_help_not_received_call_message));
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(boolean z) {
        this.IAuthTabCallbackStubProxy = false;
        this.access100 = false;
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onextracallback.onExtraCallback(z);
    }

    public final void IAuthTabCallback() {
        onNavigationEvent();
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        onExtraCallback onextracallback2 = null;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        onextracallback.asInterface();
        this.IAuthTabCallbackDefault = false;
        this.access100 = false;
        this.IAuthTabCallbackStubProxy = false;
        onExtraCallback onextracallback3 = this.onExtraCallbackWithResult;
        if (onextracallback3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            onextracallback2 = onextracallback3;
        }
        onextracallback2.IAuthTabCallbackStub();
    }

    public final void onWarmupCompleted(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.onExtraCallbackWithResult(str, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(String str, final ArsVerificationFragment arsVerificationFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        String string = arsVerificationFragment.getString(R.string.app_common___6ed6d08d94);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.IAuthTabCallback(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = arsVerificationFragment.getString(R.string.app_common___cc8d0598f1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda11
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.onTransact(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(ArsVerificationFragment arsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!arsVerificationFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        arsVerificationFragment.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:15994905")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(ArsVerificationFragment arsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (!arsVerificationFragment.isAdded()) {
            return Unit.INSTANCE;
        }
        arsVerificationFragment.IAuthTabCallback();
        return Unit.INSTANCE;
    }

    public long getScreenId() {
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        return onextracallback.IAuthTabCallback();
    }

    public String getScreenName() {
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        return onextracallback.onNavigationEvent();
    }

    public Map<String, Object> getScreenParams() {
        onExtraCallback onextracallback = this.onExtraCallbackWithResult;
        if (onextracallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onextracallback = null;
        }
        return onextracallback.onExtraCallback();
    }

    public final boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStubProxy || this.IAuthTabCallbackDefault || this.access100;
    }

    private final void onWarmupCompleted(boolean z) {
        asBinder().setLoading(z);
    }

    public final void onWarmupCompleted() {
        this.IAuthTabCallbackStubProxy = true;
        writeRaw writerawIAuthTabCallback = writeRaw.onExtraCallback((zzaj.onNavigationEvent().onActivityLayout() || !new RxPermissions(this).onExtraCallbackWithResult("android.permission.READ_PHONE_STATE")) ? 1000L : 10000L, TimeUnit.MILLISECONDS).IAuthTabCallback(NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ArsVerificationFragment.onExtraCallbackWithResult(this.f$0, (Long) obj));
            }
        };
        advance advanceVarOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeLongCollection() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda2
            public final boolean test(Object obj) {
                return ArsVerificationFragment.asBinder(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.IAuthTabCallback(this.f$0, (Long) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                ArsVerificationFragment.asInterface(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return ArsVerificationFragment.onWarmupCompleted((Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallback = advanceVarOnExtraCallbackWithResult.onExtraCallback(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.common.ArsVerificationFragment$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                ArsVerificationFragment.IAuthTabCallbackDefault(function13, obj);
            }
        });
        Intrinsics.checkNotNull(deserializeurinullablecollectionOnExtraCallback);
        autoDisposable(deserializeurinullablecollectionOnExtraCallback);
        this.ICustomTabsCallback = deserializeurinullablecollectionOnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(ArsVerificationFragment arsVerificationFragment, Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return arsVerificationFragment.isAdded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(ArsVerificationFragment arsVerificationFragment, Long l) {
        arsVerificationFragment.onWarmupCompleted(false);
        arsVerificationFragment.onNavigationEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("ArsVerificationFragment", th);
        return Unit.INSTANCE;
    }

    public final class onNavigationEvent extends BroadcastReceiver {
        public onNavigationEvent() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.PHONE_STATE")) {
                String stringExtra = intent.getStringExtra("state");
                if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    ArsVerificationFragment.this.IAuthTabCallbackDefault = true;
                } else if (Intrinsics.areEqual(stringExtra, TelephonyManager.EXTRA_STATE_IDLE) && ArsVerificationFragment.this.IAuthTabCallbackDefault) {
                    ArsVerificationFragment.this.access100 = true;
                }
            }
        }
    }
}
