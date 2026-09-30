package viva.republica.toss.guest.certify.guardian;

import android.content.Context;
import im.toss.base.BaseFragment;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
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
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;
import viva.republica.toss.guest.certify.verify.SmsVerificationFragment;
import viva.republica.toss.guest.certify.verify.SmsVerificationFragment$onWarmupCompleted;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class GuardianSimpleInfoFragment$IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ startScroll $carrier;
    final /* synthetic */ boolean $clearCarrier;
    int label;
    final /* synthetic */ GuardianSimpleInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuardianSimpleInfoFragment$IAuthTabCallback_Parcel(GuardianSimpleInfoFragment guardianSimpleInfoFragment, startScroll startscroll, boolean z, access13800<? super GuardianSimpleInfoFragment$IAuthTabCallback_Parcel> access13800Var) {
        super(2, access13800Var);
        this.this$0 = guardianSimpleInfoFragment;
        this.$carrier = startscroll;
        this.$clearCarrier = z;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        return new GuardianSimpleInfoFragment$IAuthTabCallback_Parcel(this.this$0, this.$carrier, this.$clearCarrier, access13800Var);
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
            GuardianSimpleInfoFragment guardianSimpleInfoFragment = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(guardianSimpleInfoFragment, this.$carrier, this.$clearCarrier, null);
            this.label = 1;
            obj = GuestBaseFragment.onNavigationEvent(guardianSimpleInfoFragment, (Function0) null, anonymousClass1, this, 1, (Object) null);
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
            GuardianSimpleInfoFragment guardianSimpleInfoFragment2 = this.this$0;
            if (Result.onNavigationEvent(objOnNavigationEvent)) {
                GuardianSimpleInfoFragment.IAuthTabCallback(guardianSimpleInfoFragment2, R.id.action_guardianSimpleInfoFragment_to_smsVerificationFragment, SmsVerificationFragment$onWarmupCompleted.onExtraCallbackWithResult(SmsVerificationFragment.Companion, ((Number) objOnNavigationEvent).longValue(), false, 2, null));
            }
            final GuardianSimpleInfoFragment guardianSimpleInfoFragment3 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
            if (th != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("sendSms", th);
                if ((th instanceof getIsAlbumMedia) || (th instanceof getPhotoGroupIndex)) {
                    GuardianSimpleInfoFragment.writeTypedObject(guardianSimpleInfoFragment3);
                } else {
                    GuardianSimpleInfoFragment.onExtraCallbackWithResult(guardianSimpleInfoFragment3, th, new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$sendSms$1$$ExternalSyntheticLambda0
                        public final Object invoke(Object obj2) {
                            return GuardianSimpleInfoFragment$IAuthTabCallback_Parcel.onExtraCallback(guardianSimpleInfoFragment3, (Throwable) obj2);
                        }
                    });
                }
            }
            Result.IAuthTabCallback(objOnNavigationEvent);
        }
        Object[] objArr = {this.this$0};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        ((CertifyGuestViewModel) GuardianSimpleInfoFragment.onExtraCallback(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -980735318, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 980735340)).onExtraCallback(false);
        this.this$0.dismissProgressDialog();
        return Unit.INSTANCE;
    }

    /* renamed from: viva.republica.toss.guest.certify.guardian.GuardianSimpleInfoFragment$IAuthTabCallback_Parcel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<access13800<? super Result<? extends Long>>, Object> {
        final /* synthetic */ startScroll $carrier;
        final /* synthetic */ boolean $clearCarrier;
        Object L$0;
        int label;
        final /* synthetic */ GuardianSimpleInfoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GuardianSimpleInfoFragment guardianSimpleInfoFragment, startScroll startscroll, boolean z, access13800<? super AnonymousClass1> access13800Var) {
            super(1, access13800Var);
            this.this$0 = guardianSimpleInfoFragment;
            this.$carrier = startscroll;
            this.$clearCarrier = z;
        }

        public final access13800<Unit> create(access13800<?> access13800Var) {
            return new AnonymousClass1(this.this$0, this.$carrier, this.$clearCarrier, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(access13800<? super Result<Long>> access13800Var) {
            return create(access13800Var).invokeSuspend(Unit.INSTANCE);
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
                Object[] objArr = {this.this$0};
                int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                AUPop aUPopOnNavigationEvent = isImageLoaded.onNavigationEvent("TS-USI", ((CertifyGuestViewModel) GuardianSimpleInfoFragment.onExtraCallback(objArr, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -980735318, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 980735340)).access100(), this.$carrier, createPaints.IAuthTabCallback, this.$clearCarrier);
                Object[] objArr2 = {this.this$0};
                int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
                getIconfontFileName geticonfontfilename = (getIconfontFileName) GuardianSimpleInfoFragment.onExtraCallback(objArr2, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, 14338866, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -14338835);
                this.L$0 = access15400.onNavigationEvent(aUPopOnNavigationEvent);
                this.label = 1;
                objIAuthTabCallback = geticonfontfilename.IAuthTabCallback(aUPopOnNavigationEvent, this);
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
    public static final Unit onExtraCallback(GuardianSimpleInfoFragment guardianSimpleInfoFragment, Throwable th) {
        getParamImp.onWarmupCompleted(th, guardianSimpleInfoFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        return Unit.INSTANCE;
    }
}
