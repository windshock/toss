package im.toss.appsintoss.iap;

import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getTileModeX;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationActivity$IAuthTabCallbackDefault extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    int label;
    final /* synthetic */ InAppPurchasePreparationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationActivity$IAuthTabCallbackDefault(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super InAppPurchasePreparationActivity$IAuthTabCallbackDefault> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationActivity$IAuthTabCallbackDefault inAppPurchasePreparationActivity$IAuthTabCallbackDefault = new InAppPurchasePreparationActivity$IAuthTabCallbackDefault(this.this$0, access13800Var);
        int i3 = onExtraCallbackWithResult + 15;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
        return inAppPurchasePreparationActivity$IAuthTabCallbackDefault;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object objOnNavigationEvent;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onExtraCallbackWithResult = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = 3 / 0;
        } else {
            objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
        }
        int i5 = onExtraCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity$IAuthTabCallbackDefault inAppPurchasePreparationActivity$IAuthTabCallbackDefaultCreate = create(findresandmsg, access13800Var);
        if (i4 == 0) {
            return inAppPurchasePreparationActivity$IAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
        }
        inAppPurchasePreparationActivity$IAuthTabCallbackDefaultCreate.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$IAuthTabCallbackDefault$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ InAppPurchasePreparationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchasePreparationActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, access13800Var);
            int i3 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                return anonymousClass3;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i5 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
            if (i4 != 0) {
                anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$IAuthTabCallbackDefault$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InAppPurchasePreparationActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchasePreparationActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
                anonymousClass2.L$0 = obj;
                int i3 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) obj, (access13800) obj2);
                int i5 = IAuthTabCallback + 107;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                AnonymousClass2 anonymousClass2Create = create(safeActivityEmbeddingComponentProviderExternalSyntheticLambda27, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    anonymousClass2Create.invokeSuspend(unit);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(unit);
                int i5 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27 safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda27 != null) {
                    int i3 = onExtraCallbackWithResult + 75;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        InAppPurchasePreparationActivity.asBinder(this.this$0);
                        throw null;
                    }
                    InAppPurchasePreparationActivity.asBinder(this.this$0);
                    int i4 = IAuthTabCallback + 7;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 % 2;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {this.this$0};
                Object[] objArr2 = {(InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)};
                getTileModeX gettilemodex = (getTileModeX) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -1981269108, 1981269112);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(gettilemodex, anonymousClass2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(obj);
            InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(inAppPurchasePreparationActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchasePreparationActivity, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                int i6 = onExtraCallback + 71;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            int i8 = onExtraCallbackWithResult + 71;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }
}
