package viva.republica.toss.guest.certify.guardian;

import android.content.Context;
import im.toss.base.BaseFragment;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import net.sf.scuba.smartcards.BuildConfig;
import o.AUPop;
import o.ConvertFloatArrayToByteArray;
import o.access13800;
import o.access14300;
import o.access15400;
import o.createPaints;
import o.enableViewRecyclingForImage;
import o.findResAndMsg;
import o.getIconfontFileName;
import o.getIsAlbumMedia;
import o.getParamImp;
import o.getPhotoGroupIndex;
import o.initMiniApp;
import o.isImageLoaded;
import o.startScroll;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;
import viva.republica.toss.guest.certify.verify.SmsVerificationFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class GuardianAgreementCompleteFragment$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ startScroll $carrier;
    final /* synthetic */ boolean $clearCarrier;
    int label;
    final /* synthetic */ GuardianAgreementCompleteFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuardianAgreementCompleteFragment$onNavigationEvent(GuardianAgreementCompleteFragment guardianAgreementCompleteFragment, startScroll startscroll, boolean z, access13800<? super GuardianAgreementCompleteFragment$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = guardianAgreementCompleteFragment;
        this.$carrier = startscroll;
        this.$clearCarrier = z;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new GuardianAgreementCompleteFragment$onNavigationEvent(this.this$0, this.$carrier, this.$clearCarrier, access13800Var);
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
            BaseFragment.showProgressDialog$default(this.this$0, (String) null, false, 3, (Object) null);
            GuardianAgreementCompleteFragment guardianAgreementCompleteFragment = this.this$0;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(guardianAgreementCompleteFragment, this.$carrier, this.$clearCarrier, null);
            this.label = 1;
            obj = GuestBaseFragment.onNavigationEvent(guardianAgreementCompleteFragment, (Function0) null, anonymousClass4, this, 1, (Object) null);
            if (obj == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        Result result = (Result) obj;
        if (result != null) {
            Object objOnNavigationEvent = result.onNavigationEvent();
            GuardianAgreementCompleteFragment guardianAgreementCompleteFragment2 = this.this$0;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                GuardianAgreementCompleteFragment.onNavigationEvent(guardianAgreementCompleteFragment2, R.id.action_guardianAgreementCompleteFragment_to_smsVerificationFragment, SmsVerificationFragment.Companion.onExtraCallback(((Number) objOnNavigationEvent).longValue(), GuardianAgreementCompleteFragment.onExtraCallback(guardianAgreementCompleteFragment2).onUnminimized()));
            }
            final GuardianAgreementCompleteFragment guardianAgreementCompleteFragment3 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("sendSms", th);
                if ((th instanceof getIsAlbumMedia) || (th instanceof getPhotoGroupIndex)) {
                    GuardianAgreementCompleteFragment.onWarmupCompleted(guardianAgreementCompleteFragment3);
                } else {
                    GuardianAgreementCompleteFragment.onExtraCallbackWithResult(guardianAgreementCompleteFragment3, th, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianAgreementCompleteFragment$sendSms$1$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj2) {
                            return GuardianAgreementCompleteFragment$onNavigationEvent.onExtraCallbackWithResult(guardianAgreementCompleteFragment3, (Throwable) obj2);
                        }
                    });
                }
            }
            Result.IAuthTabCallback(objOnNavigationEvent);
        }
        GuardianAgreementCompleteFragment.onExtraCallback(this.this$0).onExtraCallback(false);
        this.this$0.dismissProgressDialog();
        return Unit.INSTANCE;
    }

    /* renamed from: viva.republica.toss.guest.certify.guardian.GuardianAgreementCompleteFragment$onNavigationEvent$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function1<access13800<? super Result<? extends Long>>, Object> {
        final /* synthetic */ startScroll $carrier;
        final /* synthetic */ boolean $clearCarrier;
        Object L$0;
        int label;
        final /* synthetic */ GuardianAgreementCompleteFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(GuardianAgreementCompleteFragment guardianAgreementCompleteFragment, startScroll startscroll, boolean z, access13800<? super AnonymousClass4> access13800Var) {
            super(1, access13800Var);
            this.this$0 = guardianAgreementCompleteFragment;
            this.$carrier = startscroll;
            this.$clearCarrier = z;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Result<Long>> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new AnonymousClass4(this.this$0, this.$carrier, this.$clearCarrier, access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                enableViewRecyclingForImage enableviewrecyclingforimage = enableViewRecyclingForImage.onWarmupCompleted;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
                enableViewRecyclingForImage.onWarmupCompleted(enableviewrecyclingforimage, contextRequireContext, (Regex) null, 2, (Object) null);
                AUPop aUPopOnNavigationEvent = isImageLoaded.onNavigationEvent("TS-USI", GuardianAgreementCompleteFragment.onExtraCallback(this.this$0).access100(), this.$carrier, createPaints.IAuthTabCallback, this.$clearCarrier);
                getIconfontFileName geticonfontfilenameIAuthTabCallback = GuardianAgreementCompleteFragment.IAuthTabCallback(this.this$0);
                this.L$0 = access15400.onNavigationEvent(aUPopOnNavigationEvent);
                this.label = 1;
                objIAuthTabCallback = geticonfontfilenameIAuthTabCallback.IAuthTabCallback(aUPopOnNavigationEvent, this);
                if (objIAuthTabCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = ((Result) obj).onNavigationEvent();
            }
            return Result.IAuthTabCallback(objIAuthTabCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(GuardianAgreementCompleteFragment guardianAgreementCompleteFragment, Throwable th) {
        getParamImp.onWarmupCompleted(th, guardianAgreementCompleteFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }
}
