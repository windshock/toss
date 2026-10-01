package im.toss.appsintoss.iap;

import androidx.lifecycle.RepeatOnLifecycleKt;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.IAnimation;
import o.QueryProductDetailsParams;
import o.QueryProductDetailsParamsProduct;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationActivity$asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    int label;
    final /* synthetic */ InAppPurchasePreparationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationActivity$asInterface(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super InAppPurchasePreparationActivity$asInterface> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationActivity$asInterface inAppPurchasePreparationActivity$asInterface = new InAppPurchasePreparationActivity$asInterface(this.this$0, access13800Var);
        int i3 = onExtraCallback + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return inAppPurchasePreparationActivity$asInterface;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallback = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            return onNavigationEvent(findresandmsg, access13800Var);
        }
        onNavigationEvent(findresandmsg, access13800Var);
        throw null;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        Object objInvokeSuspend;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity$asInterface inAppPurchasePreparationActivity$asInterfaceCreate = create(findresandmsg, access13800Var);
        if (i4 == 0) {
            objInvokeSuspend = inAppPurchasePreparationActivity$asInterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i5 = 71 / 0;
        } else {
            objInvokeSuspend = inAppPurchasePreparationActivity$asInterfaceCreate.invokeSuspend(Unit.INSTANCE);
        }
        int i6 = IAuthTabCallback + 71;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$asInterface$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
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
            int i3 = onWarmupCompleted + 65;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return anonymousClass3;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 103;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$asInterface$3$3, reason: invalid class name and collision with other inner class name */
        static final class C00353 extends SuspendLambda implements Function2<String, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InAppPurchasePreparationActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00353(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super C00353> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchasePreparationActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                C00353 c00353 = new C00353(this.this$0, access13800Var);
                c00353.L$0 = obj;
                int i3 = onNavigationEvent + 79;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    return c00353;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 27;
                onWarmupCompleted = i3 % 128;
                String str = (String) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 % 2 != 0) {
                    onExtraCallbackWithResult(str, access13800Var);
                    throw null;
                }
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(str, access13800Var);
                int i4 = onWarmupCompleted + 83;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 14 / 0;
                }
                return objOnExtraCallbackWithResult;
            }

            public final Object onExtraCallbackWithResult(String str, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(str, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i4 != 0) {
                    int i5 = 89 / 0;
                }
                int i6 = onNavigationEvent + 121;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
            
                if (r4 == r3) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
            
                r3 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
            
                if (r4 == r3) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
            
                return r3;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                Object objOnNavigationEvent;
                int i2 = 2 % 2;
                String str = (String) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                if (i3 != 0) {
                    int i4 = onNavigationEvent + 35;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = ((Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    if (Intrinsics.areEqual(((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).access100(), "SUBSCRIPTION")) {
                        QueryProductDetailsParamsProduct queryProductDetailsParamsProductIAuthTabCallbackStub = InAppPurchasePreparationActivity.IAuthTabCallbackStub(this.this$0);
                        Object[] objArr2 = {this.this$0};
                        String strIAuthTabCallbackDefault = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).IAuthTabCallbackDefault();
                        this.L$0 = str;
                        this.label = 1;
                        objOnExtraCallback = queryProductDetailsParamsProductIAuthTabCallbackStub.onWarmupCompleted(str, strIAuthTabCallbackDefault, this);
                    } else {
                        QueryProductDetailsParamsProduct queryProductDetailsParamsProductIAuthTabCallbackStub2 = InAppPurchasePreparationActivity.IAuthTabCallbackStub(this.this$0);
                        this.L$0 = str;
                        this.label = 2;
                        objOnExtraCallback = queryProductDetailsParamsProductIAuthTabCallbackStub2.onExtraCallback(str, this);
                    }
                }
                InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.this$0;
                if (Result.onNavigationEvent(objOnNavigationEvent)) {
                    InAppPurchasePreparationActivity.onNavigationEvent(inAppPurchasePreparationActivity, str, (String) objOnNavigationEvent);
                }
                InAppPurchasePreparationActivity inAppPurchasePreparationActivity2 = this.this$0;
                QueryProductDetailsParams queryProductDetailsParams = Result.exceptionOrNull-impl(objOnNavigationEvent);
                if (queryProductDetailsParams != null && !(queryProductDetailsParams instanceof QueryProductDetailsParams.access100) && (queryProductDetailsParams instanceof QueryProductDetailsParams)) {
                    int i6 = onWarmupCompleted + 33;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                    int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                    int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                    ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(iOnExtraCallback, -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), new Object[]{inAppPurchasePreparationActivity2}, iOnExtraCallback2, iOnExtraCallback3, 1686982575)).onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda25.onExtraCallbackWithResult(queryProductDetailsParams));
                }
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {this.this$0};
                IAnimation iAnimationICustomTabsCallback = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).ICustomTabsCallback();
                C00353 c00353 = new C00353(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationICustomTabsCallback, c00353, this) == objOnWarmupCompleted) {
                    int i6 = IAuthTabCallback + 123;
                    int i7 = i6 % 128;
                    onWarmupCompleted = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 109;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = IAuthTabCallback + 9;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(inAppPurchasePreparationActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchasePreparationActivity, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                int i5 = onExtraCallback + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = onExtraCallback + 75;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i8 != 0) {
                obj2.hashCode();
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 117;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }
}
