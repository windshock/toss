package viva.republica.toss.home.consumption.transaction.account;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CRYPT_GenSignatureValue;
import o.ConvertFloatArrayToByteArray;
import o.DomainConfigProxy;
import o.FullScreenAd;
import o.GeckoHubImp;
import o.ParamUtils;
import o.Response;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getFormatWidth;
import o.getParamImp;
import o.initMiniApp;
import o.isPartnerDomains;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.putChannelInfo;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet;
import viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet$;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;
import viva.republica.toss.network.model.home.CheckConsumptionExcludedUseStoreReq;
import viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountTransactionExcludeBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallback = 8;
    private final String IAuthTabCallbackDefault;
    private final int asBinder;
    private final boolean onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Function1<Boolean, Unit> onNavigationEvent;

    public static final class IAuthTabCallback implements Function0<CRYPT_GenSignatureValue> {
        final /* synthetic */ Dialog onWarmupCompleted;

        public IAuthTabCallback(Dialog dialog) {
            this.onWarmupCompleted = dialog;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CRYPT_GenSignatureValue invoke() {
            LayoutInflater layoutInflater = this.onWarmupCompleted.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CRYPT_GenSignatureValue.IAuthTabCallback(layoutInflater);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountTransactionExcludeBottomSheet(@NotNull Context context, int i, @NotNull String str, boolean z, @NotNull Function1<? super Boolean, Unit> function1) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.asBinder = i;
        this.IAuthTabCallbackDefault = str;
        this.onExtraCallback = z;
        this.onNavigationEvent = function1;
        this.onExtraCallbackWithResult = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new IAuthTabCallback(this));
    }

    private final CRYPT_GenSignatureValue onExtraCallbackWithResult() {
        return (CRYPT_GenSignatureValue) this.onExtraCallbackWithResult.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        ConstraintLayout root = onExtraCallbackWithResult().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        setContentView(root);
        if (this.onExtraCallback) {
            onExtraCallbackWithResult().IAuthTabCallback.setTitle(getContext().getString(R.string.app_consumption_transaction_detail_exclude_bottom_sheet_header));
            Typography5 typography5 = onExtraCallbackWithResult().onExtraCallback;
            String string = getContext().getString(R.string.app_consumption_transaction_detail_exclude_bottom_sheet_sub_header, this.IAuthTabCallbackDefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            typography5.setText(mergeParams.onExtraCallbackWithResult(string, true));
        } else {
            if (this.asBinder == 0) {
                onExtraCallbackWithResult().IAuthTabCallback.setTitle(getContext().getString(R.string.app_consumption_transaction_detail_exclude_bottom_sheet_header_include_expense));
            } else {
                onExtraCallbackWithResult().IAuthTabCallback.setTitle(getContext().getString(R.string.app_consumption_transaction_detail_exclude_bottom_sheet_header_include));
            }
            Typography5 typography52 = onExtraCallbackWithResult().onExtraCallback;
            String string2 = getContext().getString(R.string.app_consumption_transaction_detail_exclude_bottom_sheet_sub_header_include, this.IAuthTabCallbackDefault);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            typography52.setText(mergeParams.onExtraCallbackWithResult(string2, true));
        }
        TdsButtonV1View tdsButtonV1ViewAsInterface = onExtraCallbackWithResult().onWarmupCompleted.asInterface();
        ParamUtils paramUtils = ParamUtils.NORMAL;
        Object[] objArr = {tdsButtonV1ViewAsInterface, paramUtils, new AccountTransactionExcludeBottomSheet$.ExternalSyntheticLambda0(this)};
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        Object[] objArr2 = {onExtraCallbackWithResult().onWarmupCompleted};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object[] objArr3 = {(TdsButtonV1View) TdsBottomCtaV1View.onExtraCallbackWithResult(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback, objArr2, -1667615339, 1667615356, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback()), paramUtils, new AccountTransactionExcludeBottomSheet$.ExternalSyntheticLambda1(this)};
        int iOnWarmupCompleted3 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted4 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(AccountTransactionExcludeBottomSheet accountTransactionExcludeBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        accountTransactionExcludeBottomSheet.onWarmupCompleted(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(AccountTransactionExcludeBottomSheet accountTransactionExcludeBottomSheet, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        accountTransactionExcludeBottomSheet.onWarmupCompleted(true);
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(boolean z) {
        this.onNavigationEvent.invoke(Boolean.valueOf(z));
        dismiss();
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ BaseActivity $activity;
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ boolean $exclude;
            final /* synthetic */ String $methodType;
            final /* synthetic */ Function1<Boolean, Unit> $revert;
            final /* synthetic */ getFormatWidth $transactionType;
            final /* synthetic */ String $useStore;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(BaseActivity baseActivity, String str, getFormatWidth getformatwidth, String str2, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, boolean z, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.$activity = baseActivity;
                this.$methodType = str;
                this.$transactionType = getformatwidth;
                this.$useStore = str2;
                this.$callback = function1;
                this.$revert = function12;
                this.$exclude = z;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new onNavigationEvent(this.$activity, this.$methodType, this.$transactionType, this.$useStore, this.$callback, this.$revert, this.$exclude, access13800Var);
            }

            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet$onExtraCallback$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
            public static final class C0028onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super ConsumptionExcludedUseStoreResult>, Object> {
                final /* synthetic */ String $methodType$inlined;
                final /* synthetic */ getFormatWidth $transactionType$inlined;
                final /* synthetic */ String $useStore$inlined;
                int I$0;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0028onNavigationEvent(access13800 access13800Var, String str, getFormatWidth getformatwidth, String str2) {
                    super(2, access13800Var);
                    this.$methodType$inlined = str;
                    this.$transactionType$inlined = getformatwidth;
                    this.$useStore$inlined = str2;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new C0028onNavigationEvent(access13800Var, this.$methodType$inlined, this.$transactionType$inlined, this.$useStore$inlined);
                }

                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super ConsumptionExcludedUseStoreResult> access13800Var) {
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
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 29426), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), 24734 - TextUtils.getOffsetAfter("", 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                        }
                        Object obj2 = ((Field) objOnExtraCallback).get(null);
                        try {
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, Color.argb(0, 0, 0, 0) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
                            }
                            FullScreenAd fullScreenAd = (FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj2, null);
                            CheckConsumptionExcludedUseStoreReq checkConsumptionExcludedUseStoreReq = new CheckConsumptionExcludedUseStoreReq(this.$methodType$inlined, this.$transactionType$inlined, this.$useStore$inlined);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.label = 1;
                            obj = fullScreenAd.IAuthTabCallback(checkConsumptionExcludedUseStoreReq, (access13800<? super BaseApiResponse<ConsumptionExcludedUseStoreResult>>) this);
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
                                return (ConsumptionExcludedUseStoreResult) objOnTransact;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.home.ConsumptionExcludedUseStoreResult");
                        } catch (NullPointerException e) {
                            if (Intrinsics.areEqual(ConsumptionExcludedUseStoreResult.class, Object.class) || Intrinsics.areEqual(ConsumptionExcludedUseStoreResult.class, Unit.class)) {
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

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        BaseActivity.IAuthTabCallback(this.$activity, (String) null, false, 3, (Object) null);
                        String str = this.$methodType;
                        getFormatWidth getformatwidth = this.$transactionType;
                        String str2 = this.$useStore;
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        C0028onNavigationEvent c0028onNavigationEvent = new C0028onNavigationEvent(null, str, getformatwidth, str2);
                        this.L$0 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0028onNavigationEvent, this);
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
                } catch (Exception e) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e));
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (CancellationException e3) {
                    throw e3;
                }
                Function1<Boolean, Unit> function1 = this.$callback;
                if (Result.onNavigationEvent(obj2)) {
                    function1.invoke(access14000.onNavigationEvent(((ConsumptionExcludedUseStoreResult) obj2).onNavigationEvent()));
                }
                BaseActivity baseActivity = this.$activity;
                Function1<Boolean, Unit> function12 = this.$revert;
                boolean z = this.$exclude;
                Throwable th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountTransactionExcludeBottomSheet", th);
                    if (function12 != null) {
                        function12.invoke(access14000.onNavigationEvent(z));
                    }
                }
                this.$activity.bo_();
                return Unit.INSTANCE;
            }
        }

        public final void onExtraCallbackWithResult(@NotNull BaseActivity baseActivity, @NotNull String str, @Nullable getFormatWidth getformatwidth, @NotNull String str2, boolean z, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Boolean, Unit> function12) {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function12, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseActivity), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(baseActivity, str, getformatwidth, str2, function12, function1, z, null), 3, (Object) null);
        }

        /* renamed from: viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        static final class C0027onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ BaseActivity $activity;
            final /* synthetic */ boolean $all;
            final /* synthetic */ boolean $exclude;
            final /* synthetic */ String $methodType;
            final /* synthetic */ Function1<Boolean, Unit> $revert;
            final /* synthetic */ List<String> $sourceIds;
            final /* synthetic */ String $time;
            final /* synthetic */ getFormatWidth $transactionType;
            final /* synthetic */ String $useStore;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0027onExtraCallback(BaseActivity baseActivity, boolean z, String str, getFormatWidth getformatwidth, String str2, boolean z2, List<String> list, String str3, Function1<? super Boolean, Unit> function1, access13800<? super C0027onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.$activity = baseActivity;
                this.$all = z;
                this.$methodType = str;
                this.$transactionType = getformatwidth;
                this.$useStore = str2;
                this.$exclude = z2;
                this.$sourceIds = list;
                this.$time = str3;
                this.$revert = function1;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new C0027onExtraCallback(this.$activity, this.$all, this.$methodType, this.$transactionType, this.$useStore, this.$exclude, this.$sourceIds, this.$time, this.$revert, access13800Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14 */
            /* JADX WARN: Type inference failed for: r2v15 */
            /* JADX WARN: Type inference failed for: r2v16 */
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                ?? r2;
                Object objOnExtraCallback;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.onNavigationEvent(obj);
                        final BaseActivity baseActivity = this.$activity;
                        ?? OnExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet$Companion$saveExclude$1$$ExternalSyntheticLambda0
                            public final Object invoke() {
                                return AccountTransactionExcludeBottomSheet.onExtraCallback.C0027onExtraCallback.onNavigationEvent(baseActivity);
                            }
                        });
                        BaseActivity.IAuthTabCallback(this.$activity, (String) null, false, 3, (Object) null);
                        boolean z = this.$all;
                        String str = this.$methodType;
                        getFormatWidth getformatwidth = this.$transactionType;
                        String str2 = this.$useStore;
                        boolean z2 = this.$exclude;
                        List<String> list = this.$sourceIds;
                        String str3 = this.$time;
                        Result.Companion companion = Result.Companion;
                        GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                        onNavigationEvent onnavigationevent = new onNavigationEvent(null, z, str, getformatwidth, str2, z2, list, str3);
                        this.L$0 = OnExtraCallbackWithResult;
                        this.L$1 = access15400.onNavigationEvent(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, onnavigationevent, this);
                        i = OnExtraCallbackWithResult;
                        if (objOnExtraCallback == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = (Lazy) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallback = obj;
                        i = r22;
                    }
                    obj2 = Result.constructor-impl(objOnExtraCallback);
                    r2 = i;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
                    r2 = i;
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
                    r2 = i;
                }
                if (Result.onNavigationEvent(obj2)) {
                    onWarmupCompleted(r2).IAuthTabCallbackStub();
                }
                BaseActivity baseActivity2 = this.$activity;
                Function1<Boolean, Unit> function1 = this.$revert;
                boolean z3 = this.$exclude;
                Throwable th = Result.exceptionOrNull-impl(obj2);
                if (th != null) {
                    getParamImp.onWarmupCompleted(th, baseActivity2, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountTransactionExcludeBottomSheet", th);
                    if (function1 != null) {
                        function1.invoke(access14000.onNavigationEvent(z3));
                    }
                }
                this.$activity.bo_();
                return Unit.INSTANCE;
            }

            private static final DomainConfigProxy onWarmupCompleted(Lazy<? extends DomainConfigProxy> lazy) {
                return (DomainConfigProxy) lazy.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DomainConfigProxy onNavigationEvent(BaseActivity baseActivity) {
                Context applicationContext = baseActivity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                return ((isPartnerDomains) Response.onExtraCallback(applicationContext, isPartnerDomains.class)).ITrustedWebActivityCallbackDefault();
            }

            /* renamed from: viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet$onExtraCallback$onExtraCallback$onNavigationEvent */
            public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Object>, Object> {
                final /* synthetic */ boolean $all$inlined;
                final /* synthetic */ boolean $exclude$inlined;
                final /* synthetic */ String $methodType$inlined;
                final /* synthetic */ List $sourceIds$inlined;
                final /* synthetic */ String $time$inlined;
                final /* synthetic */ getFormatWidth $transactionType$inlined;
                final /* synthetic */ String $useStore$inlined;
                int I$0;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public onNavigationEvent(access13800 access13800Var, boolean z, String str, getFormatWidth getformatwidth, String str2, boolean z2, List list, String str3) {
                    super(2, access13800Var);
                    this.$all$inlined = z;
                    this.$methodType$inlined = str;
                    this.$transactionType$inlined = getformatwidth;
                    this.$useStore$inlined = str2;
                    this.$exclude$inlined = z2;
                    this.$sourceIds$inlined = list;
                    this.$time$inlined = str3;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new onNavigationEvent(access13800Var, this.$all$inlined, this.$methodType$inlined, this.$transactionType$inlined, this.$useStore$inlined, this.$exclude$inlined, this.$sourceIds$inlined, this.$time$inlined);
                }

                /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Object> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
                
                    if (r2 == r0) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
                
                    if (r2 == r0) goto L35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
                
                    return r0;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 429
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.account.AccountTransactionExcludeBottomSheet.onExtraCallback.C0027onExtraCallback.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }
        }

        public final void onNavigationEvent(@NotNull BaseActivity baseActivity, @NotNull String str, @Nullable getFormatWidth getformatwidth, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, boolean z, boolean z2, @Nullable Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(baseActivity), (CoroutineContext) null, (setRandomHost) null, new C0027onExtraCallback(baseActivity, z2, str, getformatwidth, str2, z, list, str3, function1, null), 3, (Object) null);
        }
    }
}
