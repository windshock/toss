package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.JsonReaderErrorInfo;
import o.JsonReaderUnknownNumberParsing;
import o.NetConverter3;
import o.PhotoBrowseView;
import o.ReactNativeFeatureFlagsCxxAccessor;
import o.RotationProvider1;
import o.SetDetectableSize;
import o.TextFieldKeyInputExternalSyntheticLambda6;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.access27200;
import o.access8100;
import o.canOverrideExistingModule;
import o.createPaints;
import o.deserializeDecimalCollection;
import o.deserializeDouble;
import o.deserializeFloat;
import o.deserializeIntNullableCollection;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getWrite;
import o.isViewAllVisible;
import o.jniHandleMemoryPressure;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.setRipple;
import o.setRubIn;
import o.setSelection;
import o.setWrite;
import o.virtualViewPrerenderRatio;
import o.wasLastName;
import o.writeRaw;
import o.zzbr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.ArsVerificationFragment;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhoneArsVerificationFragment extends Hilt_PhoneArsVerificationFragment implements ArsVerificationFragment.onExtraCallback {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = 8;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private deserializeUriNullableCollection ICustomTabsCallback;
    private final access27200<Unit> access000;
    private final access27200<Boolean> access100;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private long extraCallback;
    private String getInterfaceDescriptor;
    private PhotoBrowseView onExtraCallback;
    private ArsVerificationFragment onExtraCallbackWithResult;
    private virtualViewPrerenderRatio onNavigationEvent;
    private final Lazy onTransact;
    private final access27200<Unit> onWarmupCompleted;

    public static /* synthetic */ void IAuthTabCallbackStubProxy() {
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel() {
    }

    public static /* synthetic */ void getInterfaceDescriptor() {
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public long IAuthTabCallback() {
        return 1001446L;
    }

    public long getScreenId() {
        return -1L;
    }

    public PhoneArsVerificationFragment() {
        Lazy lazyOnNavigationEvent = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(new onExtraCallbackWithResult(this)));
        this.IAuthTabCallback_Parcel = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(PhoneArsVerificationViewModel.class), new IAuthTabCallbackStub(lazyOnNavigationEvent), new asBinder(null, lazyOnNavigationEvent), new onTransact(this, lazyOnNavigationEvent));
        access27200<Unit> typedObject = access27200.readTypedObject();
        Intrinsics.checkNotNullExpressionValue(typedObject, "");
        this.access000 = typedObject;
        access27200<Unit> typedObject2 = access27200.readTypedObject();
        Intrinsics.checkNotNullExpressionValue(typedObject2, "");
        this.onWarmupCompleted = typedObject2;
        access27200<Boolean> typedObject3 = access27200.readTypedObject();
        Intrinsics.checkNotNullExpressionValue(typedObject3, "");
        this.access100 = typedObject3;
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda18
            public final Object invoke() {
                return PhoneArsVerificationFragment.IAuthTabCallbackStub(this.f$0);
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda19
            public final Object invoke() {
                return PhoneArsVerificationFragment.IAuthTabCallback_Parcel(this.f$0);
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda20
            public final Object invoke() {
                return PhoneArsVerificationFragment.access100(this.f$0);
            }
        });
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda21
            public final Object invoke() {
                return PhoneArsVerificationFragment.access000(this.f$0);
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda22
            public final Object invoke() {
                return PhoneArsVerificationFragment.getInterfaceDescriptor(this.f$0);
            }
        });
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Bundle onExtraCallbackWithResult(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return RotationProvider1.onNavigationEvent(new Pair[]{getWrite.IAuthTabCallback("EXTRA_OTP", str), getWrite.IAuthTabCallback("EXTRA_UNIFIED_ID", Long.valueOf(j))});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneArsVerificationViewModel onMinimized() {
        return (PhoneArsVerificationViewModel) this.IAuthTabCallback_Parcel.getValue();
    }

    public String getAccessibilityPaneTitle(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(R.string.app_ars_phone_ars_verification_description);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class onExtraCallback extends OnBackPressedCallback {
        onExtraCallback() {
            super(true);
        }

        public void handleOnBackPressed() {
            if (PhoneArsVerificationFragment.this.onExtraCallbackWithResult != null) {
                ArsVerificationFragment arsVerificationFragment = PhoneArsVerificationFragment.this.onExtraCallbackWithResult;
                if (arsVerificationFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    arsVerificationFragment = null;
                }
                if (arsVerificationFragment.onBackPressed()) {
                    return;
                }
            }
            PhoneArsVerificationFragment.this.onRelationshipValidationResult();
        }
    }

    @Override // viva.republica.toss.guest.certify.verify.Hilt_PhoneArsVerificationFragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new onExtraCallback());
    }

    public void onCreate(@Nullable Bundle bundle) {
        String string;
        super.onCreate(bundle);
        String str = "";
        if (bundle != null) {
            String string2 = bundle.getString("EXTRA_OTP", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            this.getInterfaceDescriptor = string2;
            this.extraCallback = bundle.getLong("EXTRA_UNIFIED_ID", 0L);
            this.IAuthTabCallbackStubProxy = bundle.getInt("STATE_RETRY_COUNT", 0);
            PhotoBrowseView serializable = bundle.getSerializable("STATE_CERTIFY_STATUS");
            this.onExtraCallback = serializable instanceof PhotoBrowseView ? serializable : null;
        } else {
            Bundle arguments = getArguments();
            if (arguments != null && (string = arguments.getString("EXTRA_OTP")) != null) {
                str = string;
            }
            this.getInterfaceDescriptor = str;
            Bundle arguments2 = getArguments();
            this.extraCallback = arguments2 != null ? arguments2.getLong("EXTRA_UNIFIED_ID") : 0L;
        }
        createPaints.IAuthTabCallback.IAuthTabCallback(setSelection.ARS);
        this.onNavigationEvent = new virtualViewPrerenderRatio("TS-USI", onUnminimized().access100());
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0> {
        final /* synthetic */ Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0 invoke() {
            return (AndroidTextContextMenuToolbarProviderExternalSyntheticLambda0) this.$ownerProducer.invoke();
        }
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(R.layout.fragment_nested_fragment, viewGroup, false);
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate).getViewModelStore();
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Function0 function0, Lazy lazy) {
            super(0);
            this.$extrasProducer = function0;
            this.$owner$delegate = lazy;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            return textFieldKeyInputExternalSyntheticLambda6 != null ? textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelCreationExtras() : AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult;
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (onActivityResized()) {
            onActivityLayout();
            if (bundle != null) {
                ArsVerificationFragment arsVerificationFragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("ArsVerificationFragment");
                Intrinsics.checkNotNull(arsVerificationFragmentFindFragmentByTag, "");
                this.onExtraCallbackWithResult = arsVerificationFragmentFindFragmentByTag;
                access000();
            } else {
                ArsVerificationFragment.IAuthTabCallback iAuthTabCallback = ArsVerificationFragment.Companion;
                String str2 = this.getInterfaceDescriptor;
                Fragment fragment = null;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    str = null;
                } else {
                    str = str2;
                }
                this.onExtraCallbackWithResult = iAuthTabCallback.onNavigationEvent(str, (126 & 2) != 0 ? null : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) == 0 ? null : null);
                FlowRowOverflowCompanionExternalSyntheticLambda4 flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult = getChildFragmentManager().onExtraCallbackWithResult();
                int i = R.id.fragment_container;
                Fragment fragment2 = this.onExtraCallbackWithResult;
                if (fragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    fragment = fragment2;
                }
                flowRowOverflowCompanionExternalSyntheticLambda4OnExtraCallbackWithResult.onExtraCallback(i, fragment, "ArsVerificationFragment").onExtraCallbackWithResult();
            }
            onPostMessage();
        }
    }

    public static final class onTransact extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Fragment fragment, Lazy lazy) {
            super(0);
            this.$this_viewModels = fragment;
            this.$owner$delegate = lazy;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory;
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this.$owner$delegate);
            TextFieldKeyInputExternalSyntheticLambda6 textFieldKeyInputExternalSyntheticLambda6 = textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent instanceof TextFieldKeyInputExternalSyntheticLambda6 ? textFieldKeyInputExternalSyntheticLambda6OnNavigationEvent : null;
            if (textFieldKeyInputExternalSyntheticLambda6 != null && (defaultViewModelProviderFactory = textFieldKeyInputExternalSyntheticLambda6.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
            return defaultViewModelProviderFactory2;
        }
    }

    private final void access000() {
        if (((Boolean) onMinimized().onNavigationEvent().IAuthTabCallback()).booleanValue()) {
            onExtraCallback(false);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return PhoneArsVerificationFragment.this.new onNavigationEvent(access13800Var);
        }

        /* renamed from: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$onNavigationEvent$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ PhoneArsVerificationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PhoneArsVerificationFragment phoneArsVerificationFragment, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = phoneArsVerificationFragment;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass4(this.this$0, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
            public final Object invokeSuspend(Object obj) throws setWrite {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    setRubIn<Boolean> setrubinOnNavigationEvent = this.this$0.onMinimized().onNavigationEvent();
                    final PhoneArsVerificationFragment phoneArsVerificationFragment = this.this$0;
                    setRipple setripple = new setRipple() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment.onNavigationEvent.4.3
                        public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                            return onExtraCallbackWithResult(((Boolean) obj2).booleanValue(), access13800Var);
                        }

                        public final Object onExtraCallbackWithResult(boolean z, access13800<? super Unit> access13800Var) {
                            if (phoneArsVerificationFragment.onExtraCallbackWithResult != null) {
                                ArsVerificationFragment arsVerificationFragment = phoneArsVerificationFragment.onExtraCallbackWithResult;
                                if (arsVerificationFragment == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    arsVerificationFragment = null;
                                }
                                arsVerificationFragment.onExtraCallbackWithResult(z);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (setrubinOnNavigationEvent.collect(setripple, this) == objOnWarmupCompleted) {
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

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = PhoneArsVerificationFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(PhoneArsVerificationFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onExtraCallback(viewLifecycleOwner, onextracallback, anonymousClass4, this) == objOnWarmupCompleted) {
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

    private final void onPostMessage() {
        TextFieldScrollKtExternalSyntheticLambda0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(viewLifecycleOwner), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onSaveInstanceState(bundle);
        String str = this.getInterfaceDescriptor;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        bundle.putString("EXTRA_OTP", str);
        bundle.putLong("EXTRA_UNIFIED_ID", this.extraCallback);
        bundle.putInt("STATE_RETRY_COUNT", this.IAuthTabCallbackStubProxy);
        bundle.putSerializable("STATE_CERTIFY_STATUS", this.onExtraCallback);
    }

    private final void onActivityLayout() {
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy = this.access000.IAuthTabCallbackStubProxy();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda40
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onNavigationEvent(this.f$0, (Unit) obj);
            }
        };
        wasLastName waslastnameOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda46
            public final Object apply(Object obj) {
                return PhoneArsVerificationFragment.extraCallbackWithResult(function1, obj);
            }
        }, false, 1);
        deserializeDecimalCollection deserializedecimalcollection = new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda47
            public final void run() {
                PhoneArsVerificationFragment.IAuthTabCallbackStubProxy();
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda48
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onWarmupCompleted((Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = waslastnameOnWarmupCompleted.onWarmupCompleted(deserializedecimalcollection, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda49
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.ICustomTabsCallbackStub(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy2 = this.onWarmupCompleted.IAuthTabCallbackStubProxy();
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda50
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallback(this.f$0, (Unit) obj);
            }
        };
        wasLastName waslastnameOnWarmupCompleted2 = jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy2.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda51
            public final Object apply(Object obj) {
                return PhoneArsVerificationFragment.onRelationshipValidationResult(function13, obj);
            }
        }, false, 1);
        deserializeDecimalCollection deserializedecimalcollection2 = new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda52
            public final void run() {
                PhoneArsVerificationFragment.IAuthTabCallback_Parcel();
            }
        };
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda53
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted2 = waslastnameOnWarmupCompleted2.onWarmupCompleted(deserializedecimalcollection2, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda54
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.onUnminimized(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted2, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted2);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy3 = this.access100.IAuthTabCallbackStubProxy();
        final Function1 function15 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda41
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallback(this.f$0, (Boolean) obj);
            }
        };
        wasLastName waslastnameOnWarmupCompleted3 = jsonReaderUnknownNumberParsingIAuthTabCallbackStubProxy3.onWarmupCompleted(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda42
            public final Object apply(Object obj) {
                return PhoneArsVerificationFragment.onActivityResized(function15, obj);
            }
        }, false, 1);
        deserializeDecimalCollection deserializedecimalcollection3 = new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda43
            public final void run() {
                PhoneArsVerificationFragment.getInterfaceDescriptor();
            }
        };
        final Function1 function16 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda44
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onTransact(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted3 = waslastnameOnWarmupCompleted3.onWarmupCompleted(deserializedecimalcollection3, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda45
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.onPostMessage(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted3, "");
        autoDisposable(deserializeurinullablecollectionOnWarmupCompleted3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo extraCallbackWithResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JsonReaderErrorInfo) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onNavigationEvent(final PhoneArsVerificationFragment phoneArsVerificationFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        virtualViewPrerenderRatio virtualviewprerenderratio = phoneArsVerificationFragment.onNavigationEvent;
        if (virtualviewprerenderratio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            virtualviewprerenderratio = null;
        }
        virtualViewPrerenderRatio virtualviewprerenderratio2 = virtualviewprerenderratio;
        long jOnWarmupCompleted = phoneArsVerificationFragment.onUnminimized().onWarmupCompleted();
        createPaints createpaints = createPaints.IAuthTabCallback;
        writeRaw writerawOnWarmupCompleted = virtualviewprerenderratio2.onWarmupCompleted(jOnWarmupCompleted, createpaints.IAuthTabCallback(), createpaints.asBinder(), createpaints.onNavigationEvent(), Integer.parseInt(createpaints.onTransact()));
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted2 = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda11
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.extraCallback(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda12
            public final void run() {
                PhoneArsVerificationFragment.IAuthTabCallbackStubProxy(this.f$0);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallback(this.f$0, (isViewAllVisible) obj);
            }
        };
        writeRaw writerawOnNavigationEvent = writerawOnWarmupCompleted2.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda14
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.readTypedObject(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.asBinder(this.f$0, (Throwable) obj);
            }
        };
        return writerawOnNavigationEvent.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda16
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.ICustomTabsCallback(function13, obj);
            }
        }).bI_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void extraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(PhoneArsVerificationFragment phoneArsVerificationFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        phoneArsVerificationFragment.onMinimized().onWarmupCompleted(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStubProxy(PhoneArsVerificationFragment phoneArsVerificationFragment) {
        phoneArsVerificationFragment.onMinimized().onWarmupCompleted(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readTypedObject(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PhoneArsVerificationFragment phoneArsVerificationFragment, isViewAllVisible isviewallvisible) {
        phoneArsVerificationFragment.getInterfaceDescriptor = isviewallvisible.onExtraCallbackWithResult();
        phoneArsVerificationFragment.extraCallback = isviewallvisible.onExtraCallback();
        ArsVerificationFragment arsVerificationFragment = phoneArsVerificationFragment.onExtraCallbackWithResult;
        ArsVerificationFragment arsVerificationFragment2 = null;
        if (arsVerificationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arsVerificationFragment = null;
        }
        String str = phoneArsVerificationFragment.getInterfaceDescriptor;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        arsVerificationFragment.IAuthTabCallback(str);
        phoneArsVerificationFragment.IAuthTabCallbackStubProxy = 0;
        ArsVerificationFragment arsVerificationFragment3 = phoneArsVerificationFragment.onExtraCallbackWithResult;
        if (arsVerificationFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            arsVerificationFragment2 = arsVerificationFragment3;
        }
        arsVerificationFragment2.onExtraCallback();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asBinder(PhoneArsVerificationFragment phoneArsVerificationFragment, Throwable th) {
        Intrinsics.checkNotNull(th);
        phoneArsVerificationFragment.IAuthTabCallback(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhoneArsVerificationActivity", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onRelationshipValidationResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JsonReaderErrorInfo) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onExtraCallback(final PhoneArsVerificationFragment phoneArsVerificationFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        virtualViewPrerenderRatio virtualviewprerenderratio = phoneArsVerificationFragment.onNavigationEvent;
        if (virtualviewprerenderratio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            virtualviewprerenderratio = null;
        }
        writeRaw writerawOnNavigationEvent = virtualviewprerenderratio.onNavigationEvent(phoneArsVerificationFragment.extraCallback);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallback(this.f$0, (Boolean) obj);
            }
        };
        writeRaw writerawOnNavigationEvent2 = writerawOnNavigationEvent.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda29
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.ICustomTabsCallbackDefault(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.asInterface(this.f$0, (Throwable) obj);
            }
        };
        return writerawOnNavigationEvent2.onWarmupCompleted(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda31
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.ICustomTabsCallbackStubProxy(function12, obj);
            }
        }).bI_().onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PhoneArsVerificationFragment phoneArsVerificationFragment, Boolean bool) {
        phoneArsVerificationFragment.onExtraCallback(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(PhoneArsVerificationFragment phoneArsVerificationFragment, Throwable th) {
        Intrinsics.checkNotNull(th);
        phoneArsVerificationFragment.IAuthTabCallback(th);
        ArsVerificationFragment arsVerificationFragment = phoneArsVerificationFragment.onExtraCallbackWithResult;
        if (arsVerificationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arsVerificationFragment = null;
        }
        arsVerificationFragment.onExtraCallback();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnminimized(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhoneArsVerificationActivity", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onActivityResized(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JsonReaderErrorInfo) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onExtraCallback(final PhoneArsVerificationFragment phoneArsVerificationFragment, final Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        virtualViewPrerenderRatio virtualviewprerenderratio = phoneArsVerificationFragment.onNavigationEvent;
        if (virtualviewprerenderratio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            virtualviewprerenderratio = null;
        }
        writeRaw writerawOnWarmupCompleted = virtualviewprerenderratio.onWarmupCompleted(phoneArsVerificationFragment.extraCallback);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onNavigationEvent(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnExtraCallback = writerawOnWarmupCompleted.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda33
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.writeTypedObject(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda34
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallbackWithResult(this.f$0, bool, (canOverrideExistingModule) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnExtraCallback.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda35
            public final Object apply(Object obj) {
                return PhoneArsVerificationFragment.onMinimized(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda36
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackDefault(this.f$0, (Throwable) obj);
            }
        };
        return waslastnameOnNavigationEvent.onExtraCallbackWithResult(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda37
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.onActivityLayout(function13, obj);
            }
        }).onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PhoneArsVerificationFragment phoneArsVerificationFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        phoneArsVerificationFragment.onMinimized().onWarmupCompleted(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeTypedObject(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onMinimized(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JsonReaderErrorInfo) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonReaderErrorInfo onExtraCallbackWithResult(final PhoneArsVerificationFragment phoneArsVerificationFragment, Boolean bool, canOverrideExistingModule canoverrideexistingmodule) {
        Intrinsics.checkNotNullParameter(canoverrideexistingmodule, "");
        if (canoverrideexistingmodule.onNavigationEvent() != PhotoBrowseView.SUCCESS) {
            Intrinsics.checkNotNull(bool);
            phoneArsVerificationFragment.IAuthTabCallback(bool.booleanValue());
            return wasLastName.IAuthTabCallback();
        }
        CertifyGuestViewModel certifyGuestViewModelOnUnminimized = phoneArsVerificationFragment.onUnminimized();
        Context contextRequireContext = phoneArsVerificationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        writeRaw<Intent> writerawOnExtraCallbackWithResult = certifyGuestViewModelOnUnminimized.onExtraCallbackWithResult(contextRequireContext, jniHandleMemoryPressure.ARS, canoverrideexistingmodule.IAuthTabCallback());
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onExtraCallback(this.f$0, (Intent) obj);
            }
        };
        return writerawOnExtraCallbackWithResult.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                PhoneArsVerificationFragment.onMessageChannelReady(function1, obj);
            }
        }).bI_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMessageChannelReady(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(PhoneArsVerificationFragment phoneArsVerificationFragment, Intent intent) {
        Intrinsics.checkNotNull(intent);
        GuestBaseFragment.onExtraCallback(phoneArsVerificationFragment, intent, null, 2, null);
        phoneArsVerificationFragment.ICustomTabsCallbackStubProxy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityLayout(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(final PhoneArsVerificationFragment phoneArsVerificationFragment, Throwable th) {
        phoneArsVerificationFragment.ICustomTabsCallbackStubProxy();
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhoneArsVerificationActivity", th);
        Intrinsics.checkNotNull(th);
        phoneArsVerificationFragment.onExtraCallback(th, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackStub(this.f$0, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(PhoneArsVerificationFragment phoneArsVerificationFragment, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        phoneArsVerificationFragment.IAuthTabCallback(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPostMessage(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(PhoneArsVerificationFragment phoneArsVerificationFragment, Throwable th) {
        phoneArsVerificationFragment.onMinimized().onWarmupCompleted(false);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("PhoneArsVerificationActivity", th);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(final boolean z) {
        zzbr.onWarmupCompleted(this.ICustomTabsCallback);
        writeRaw writerawIAuthTabCallback = writeRaw.IAuthTabCallback(2000L, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback());
        final Function2 function2 = new Function2() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda38
            public final Object invoke(Object obj, Object obj2) {
                return PhoneArsVerificationFragment.onWarmupCompleted(this.f$0, z, (Long) obj, (Throwable) obj2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeDouble() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda39
            public final void accept(Object obj, Object obj2) {
                PhoneArsVerificationFragment.onNavigationEvent(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNull(deserializeurinullablecollectionOnNavigationEvent);
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        this.ICustomTabsCallback = deserializeurinullablecollectionOnNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PhoneArsVerificationFragment phoneArsVerificationFragment, boolean z, Long l, Throwable th) {
        int i = phoneArsVerificationFragment.IAuthTabCallbackStubProxy;
        if (i < 10) {
            phoneArsVerificationFragment.IAuthTabCallbackStubProxy = i + 1;
            phoneArsVerificationFragment.onExtraCallback(z);
        } else {
            if (z) {
                String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_message);
                Intrinsics.checkNotNullExpressionValue(string, "");
                phoneArsVerificationFragment.onExtraCallback(string, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) null, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) null);
            }
            phoneArsVerificationFragment.ICustomTabsCallbackStubProxy();
            phoneArsVerificationFragment.IAuthTabCallbackStubProxy = 0;
        }
        return Unit.INSTANCE;
    }

    private final void ICustomTabsCallbackStubProxy() {
        ArsVerificationFragment arsVerificationFragment = this.onExtraCallbackWithResult;
        if (arsVerificationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arsVerificationFragment = null;
        }
        arsVerificationFragment.onNavigationEvent();
        onMinimized().onWarmupCompleted(false);
    }

    public Map<String, Object> getScreenParams() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("act_type", "enrollment_funnel")});
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public String onNavigationEvent() {
        return "enrollment_funnel__ars_certification";
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public Map<String, Object> onExtraCallback() {
        return getScreenParams();
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void asInterface() {
        this.access000.onWarmupCompleted(Unit.INSTANCE);
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void IAuthTabCallbackDefault() {
        onWarmupCompleted("click__ars_certification_get_call_cta", new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda55
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackStub(this.f$0, (SetDetectableSize) obj);
            }
        });
        this.onWarmupCompleted.onWarmupCompleted(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(PhoneArsVerificationFragment phoneArsVerificationFragment, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(phoneArsVerificationFragment.getScreenParams());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void onExtraCallback(boolean z) {
        onWarmupCompleted("click__ars_certification_confirm", new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda27
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackDefault(this.f$0, (SetDetectableSize) obj);
            }
        });
        this.access100.onWarmupCompleted(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(PhoneArsVerificationFragment phoneArsVerificationFragment, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(phoneArsVerificationFragment.getScreenParams());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void onWarmupCompleted() {
        onWarmupCompleted("click__ars_certification_can_not_hear_call_button", new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PhoneArsVerificationFragment phoneArsVerificationFragment, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(phoneArsVerificationFragment.getScreenParams());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void IAuthTabCallbackStub() {
        onWarmupCompleted("click__ars_certification_get_call_again", new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.asInterface(this.f$0, (SetDetectableSize) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(PhoneArsVerificationFragment phoneArsVerificationFragment, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(phoneArsVerificationFragment.getScreenParams());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.common.ArsVerificationFragment.onExtraCallback
    public void onExtraCallbackWithResult() {
        GuestBaseFragment.onNavigationEvent(this, "click__ars_certification_can_not_get_call", null, 2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4.equals("TV3121") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r4.equals("TV3120") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        onExtraCallback(r0, extraCallbackWithResult(), readTypedObject());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r4.equals("TV3112") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r4.equals("TV3111") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        onExtraCallback(r0, extraCallbackWithResult(), extraCallback());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof im.toss.network.throwable.TossApiCallException.ApiError
            if (r0 == 0) goto Ld4
            java.lang.String r0 = r4.getMessage()
            int r1 = viva.republica.toss.R.string.network_error
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = o.mergeParams.onNavigationEvent(r0, r1)
            viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda8 r1 = new viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda8
            r1.<init>()
            java.lang.String r2 = "impression__ars_certification_incorrect_dialog"
            r3.onExtraCallbackWithResult(r2, r1)
            im.toss.network.throwable.TossApiCallException$ApiError r4 = (im.toss.network.throwable.TossApiCallException.ApiError) r4
            java.lang.String r4 = r4.asBinder()
            int r1 = r4.hashCode()
            switch(r1) {
                case -1809188383: goto Lba;
                case -1809127839: goto La6;
                case -1809127809: goto L92;
                case -1809127808: goto L7e;
                case -1809127807: goto L75;
                case -1809127806: goto L61;
                case -1809127778: goto L4d;
                case -1809127777: goto L43;
                case -1809099009: goto L3a;
                case -1809099008: goto L30;
                default: goto L2e;
            }
        L2e:
            goto Lcf
        L30:
            java.lang.String r1 = "TV4002"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L42
            goto Lcf
        L3a:
            java.lang.String r1 = "TV4001"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
        L42:
            return
        L43:
            java.lang.String r1 = "TV3121"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L55
            goto Lcf
        L4d:
            java.lang.String r1 = "TV3120"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
        L55:
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.extraCallbackWithResult()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.readTypedObject()
            r3.onExtraCallback(r0, r4, r1)
            return
        L61:
            java.lang.String r1 = "TV3113"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.writeTypedObject()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.readTypedObject()
            r3.onExtraCallback(r0, r4, r1)
            return
        L75:
            java.lang.String r1 = "TV3112"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L86
            goto Lcf
        L7e:
            java.lang.String r1 = "TV3111"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
        L86:
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.extraCallbackWithResult()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.extraCallback()
            r3.onExtraCallback(r0, r4, r1)
            return
        L92:
            java.lang.String r1 = "TV3110"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.writeTypedObject()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.extraCallback()
            r3.onExtraCallback(r0, r4, r1)
            return
        La6:
            java.lang.String r1 = "TV3101"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto Lcf
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.ICustomTabsCallback()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.readTypedObject()
            r3.onExtraCallback(r0, r4, r1)
            return
        Lba:
            java.lang.String r1 = "TV1000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lc3
            goto Lcf
        Lc3:
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r4 = r3.extraCallbackWithResult()
            o.CommonModule_setLeftEdgeTouchEnabled$onExtraCallback r1 = r3.readTypedObject()
            r3.onExtraCallback(r0, r4, r1)
            return
        Lcf:
            r4 = 0
            r3.onExtraCallback(r0, r4, r4)
            return
        Ld4:
            int r4 = viva.republica.toss.R.string.network_error
            o.onRenderReady.onWarmupCompleted(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment.IAuthTabCallback(java.lang.Throwable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_text", str);
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(final String str, final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback onextracallback, final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback onextracallback2) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onWarmupCompleted(str, onextracallback, onextracallback2, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final String str, CommonModule_setLeftEdgeTouchEnabled.onExtraCallback onextracallback, CommonModule_setLeftEdgeTouchEnabled.onExtraCallback onextracallback2, final PhoneArsVerificationFragment phoneArsVerificationFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, new Object[]{commonModule_setLeftEdgeTouchEnabled, onextracallback}, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, new Object[]{commonModule_setLeftEdgeTouchEnabled, onextracallback2}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnDismissListener() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PhoneArsVerificationFragment.onExtraCallback(this.f$0, str, dialogInterface);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(PhoneArsVerificationFragment phoneArsVerificationFragment, final String str, DialogInterface dialogInterface) {
        phoneArsVerificationFragment.onWarmupCompleted("click__ars_certification_incorrect_dialog_button", new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onWarmupCompleted(str, (SetDetectableSize) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("error_text", str);
        setDetectableSize.onExtraCallback("view", "impression__ars_certification_incorrect_dialog");
        return Unit.INSTANCE;
    }

    private final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback readTypedObject() {
        return (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) this.IAuthTabCallbackStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback IAuthTabCallbackStub(final PhoneArsVerificationFragment phoneArsVerificationFragment) {
        String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_button_customer_service);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda24
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackStub(this.f$0, (DialogInterface) obj);
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(PhoneArsVerificationFragment phoneArsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ReactNativeFeatureFlagsCxxAccessor.onWarmupCompleted(ReactNativeFeatureFlagsCxxAccessor.onExtraCallbackWithResult, phoneArsVerificationFragment.requireBaseActivity(), CollectionsKt.listOf(new ReactNativeFeatureFlagsCxxAccessor.onExtraCallback[]{ReactNativeFeatureFlagsCxxAccessor.onExtraCallback.KAKAO, ReactNativeFeatureFlagsCxxAccessor.onExtraCallback.FAQ}), (DialogInterface.OnDismissListener) null, 4, (Object) null);
        return Unit.INSTANCE;
    }

    private final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback extraCallback() {
        return (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) this.onTransact.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback IAuthTabCallback_Parcel(final PhoneArsVerificationFragment phoneArsVerificationFragment) {
        String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_button_not_received);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.asBinder(this.f$0, (DialogInterface) obj);
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asBinder(PhoneArsVerificationFragment phoneArsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Context contextRequireContext = phoneArsVerificationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(contextRequireContext, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onNavigationEvent((CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(Integer.valueOf(R.string.ars_help_not_received_call_message));
        return Unit.INSTANCE;
    }

    private final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback ICustomTabsCallback() {
        return (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) this.asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback access100(final PhoneArsVerificationFragment phoneArsVerificationFragment) {
        String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_button_edit_info);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.asInterface(this.f$0, (DialogInterface) obj);
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit asInterface(PhoneArsVerificationFragment phoneArsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        phoneArsVerificationFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    private final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback writeTypedObject() {
        return (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) this.asBinder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback access000(final PhoneArsVerificationFragment phoneArsVerificationFragment) {
        String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_button_edit_number);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.onTransact(this.f$0, (DialogInterface) obj);
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTransact(PhoneArsVerificationFragment phoneArsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        phoneArsVerificationFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    private final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback extraCallbackWithResult() {
        return (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) this.IAuthTabCallbackDefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonModule_setLeftEdgeTouchEnabled.onExtraCallback getInterfaceDescriptor(final PhoneArsVerificationFragment phoneArsVerificationFragment) {
        String string = phoneArsVerificationFragment.getString(R.string.phone_ars_verification_error_button_reset);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                return PhoneArsVerificationFragment.IAuthTabCallbackDefault(this.f$0, (DialogInterface) obj);
            }
        }, 6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(PhoneArsVerificationFragment phoneArsVerificationFragment, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ArsVerificationFragment arsVerificationFragment = phoneArsVerificationFragment.onExtraCallbackWithResult;
        if (arsVerificationFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arsVerificationFragment = null;
        }
        arsVerificationFragment.IAuthTabCallback();
        return Unit.INSTANCE;
    }
}
