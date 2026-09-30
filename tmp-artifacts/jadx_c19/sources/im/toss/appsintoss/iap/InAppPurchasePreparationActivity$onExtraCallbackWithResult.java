package im.toss.appsintoss.iap;

import androidx.lifecycle.RepeatOnLifecycleKt;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getTileModeX;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationActivity$onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    int label;
    final /* synthetic */ InAppPurchasePreparationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationActivity$onExtraCallbackWithResult(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super InAppPurchasePreparationActivity$onExtraCallbackWithResult> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationActivity$onExtraCallbackWithResult inAppPurchasePreparationActivity$onExtraCallbackWithResult = new InAppPurchasePreparationActivity$onExtraCallbackWithResult(this.this$0, access13800Var);
        int i3 = IAuthTabCallback + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return inAppPurchasePreparationActivity$onExtraCallbackWithResult;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        if (i4 == 0) {
            int i5 = 6 / 0;
        }
        int i6 = onExtraCallback + 17;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity$onExtraCallbackWithResult inAppPurchasePreparationActivity$onExtraCallbackWithResultCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            inAppPurchasePreparationActivity$onExtraCallbackWithResultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = inAppPurchasePreparationActivity$onExtraCallbackWithResultCreate.invokeSuspend(unit);
        int i5 = IAuthTabCallback + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$onExtraCallbackWithResult$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;
        final /* synthetic */ InAppPurchasePreparationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass1> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchasePreparationActivity;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 27;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
            if (i4 != 0) {
                anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 37;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
            int i3 = onNavigationEvent + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 37 / 0;
            }
            return anonymousClass1;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 9;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i5 = onWarmupCompleted + 5;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objIAuthTabCallback;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$onExtraCallbackWithResult$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            int label;
            final /* synthetic */ InAppPurchasePreparationActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchasePreparationActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
                int i3 = onNavigationEvent + 11;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 83;
                onExtraCallback = i3 % 128;
                Unit unit = (Unit) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i3 % 2 == 0) {
                    return onWarmupCompleted(unit, access13800Var);
                }
                onWarmupCompleted(unit, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(Unit unit, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 17;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(unit, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = onNavigationEvent + 47;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
            
                if (r2 == null) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
            
                r1 = r2.asInterface();
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
            
                r4 = im.toss.appsintoss.iap.InAppPurchasePreparationActivity$onExtraCallbackWithResult.AnonymousClass1.AnonymousClass5.onExtraCallback + 91;
                im.toss.appsintoss.iap.InAppPurchasePreparationActivity$onExtraCallbackWithResult.AnonymousClass1.AnonymousClass5.onNavigationEvent = r4 % 128;
                r4 = r4 % 2;
                r1 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
            
                r13 = new java.lang.Object[]{r17.this$0};
                r4 = ((im.toss.appsintoss.iap.InAppPurchasePreparationViewModel) im.toss.appsintoss.iap.InAppPurchasePreparationActivity.IAuthTabCallback(im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), r13, im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).onTransact();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
            
                if (r4 == null) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
            
                if (r1 == null) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
            
                r3 = new im.toss.appsintoss.manager.model.AppsInTossProductReceipt(r4, r1, r2.IAuthTabCallbackStub());
                r1 = new android.content.Intent();
                r1.putExtra("result_product", r3);
                r17.this$0.setResult(-1, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
            
                r1 = new android.content.Intent();
                r1.putExtra("result_error_code", o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda27.IAuthTabCallbackStub.onWarmupCompleted.onExtraCallback());
                r1.putExtra("result_order_id", r4);
                r17.this$0.setResult(0, r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
            
                r17.this$0.finish();
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
            
                return kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00e3, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
            
                if (r17.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
            
                if (r17.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r18);
                r7 = new java.lang.Object[]{r17.this$0};
                r8 = new java.lang.Object[]{(im.toss.appsintoss.iap.InAppPurchasePreparationViewModel) im.toss.appsintoss.iap.InAppPurchasePreparationActivity.IAuthTabCallback(im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), r7, im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)};
                r2 = (o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) ((o.setRubIn) im.toss.appsintoss.iap.InAppPurchasePreparationViewModel.onWarmupCompleted(com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), com.google.android.material.datepicker.DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), r8, -225118289, 225118298)).IAuthTabCallback();
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 75;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 49 / 0;
                }
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 31;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {this.this$0};
                getTileModeX gettilemodexExtraCallbackWithResult = ((InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)).extraCallbackWithResult();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(gettilemodexExtraCallbackWithResult, anonymousClass5, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i6 = onNavigationEvent + 47;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        if (i5 != 0) {
            int i6 = onExtraCallback + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(inAppPurchasePreparationActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchasePreparationActivity, onextracallback, anonymousClass1, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
