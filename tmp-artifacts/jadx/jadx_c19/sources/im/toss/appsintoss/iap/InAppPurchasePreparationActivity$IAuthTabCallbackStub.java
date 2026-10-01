package im.toss.appsintoss.iap;

import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.appsintoss.manager.model.AppsInTossProduct;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.setRubIn;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class InAppPurchasePreparationActivity$IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    int label;
    final /* synthetic */ InAppPurchasePreparationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPurchasePreparationActivity$IAuthTabCallbackStub(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super InAppPurchasePreparationActivity$IAuthTabCallbackStub> access13800Var) {
        super(2, access13800Var);
        this.this$0 = inAppPurchasePreparationActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        InAppPurchasePreparationActivity$IAuthTabCallbackStub inAppPurchasePreparationActivity$IAuthTabCallbackStub = new InAppPurchasePreparationActivity$IAuthTabCallbackStub(this.this$0, access13800Var);
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return inAppPurchasePreparationActivity$IAuthTabCallbackStub;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        int i6 = onNavigationEvent + 101;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return objOnNavigationEvent;
    }

    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        InAppPurchasePreparationActivity$IAuthTabCallbackStub inAppPurchasePreparationActivity$IAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return inAppPurchasePreparationActivity$IAuthTabCallbackStubCreate.invokeSuspend(unit);
        }
        inAppPurchasePreparationActivity$IAuthTabCallbackStubCreate.invokeSuspend(unit);
        throw null;
    }

    /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$IAuthTabCallbackStub$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int label;
        final /* synthetic */ InAppPurchasePreparationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
            this.this$0 = inAppPurchasePreparationActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, access13800Var);
            int i3 = onExtraCallbackWithResult + 85;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return anonymousClass4;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 93;
            onExtraCallbackWithResult = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onExtraCallback + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
            if (i4 == 0) {
                anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.appsintoss.iap.InAppPurchasePreparationActivity$IAuthTabCallbackStub$4$4, reason: invalid class name and collision with other inner class name */
        static final class C00344 extends SuspendLambda implements Function2<WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, access13800<? super Unit>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InAppPurchasePreparationActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00344(InAppPurchasePreparationActivity inAppPurchasePreparationActivity, access13800<? super C00344> access13800Var) {
                super(2, access13800Var);
                this.this$0 = inAppPurchasePreparationActivity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                C00344 c00344 = new C00344(this.this$0, access13800Var);
                c00344.L$0 = obj;
                int i3 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return c00344;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) obj, (access13800) obj2);
                int i5 = onWarmupCompleted + 45;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onWarmupCompleted(WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                AppsInTossProduct appsInTossProductAsInterface;
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 = (WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0 != null && (appsInTossProductAsInterface = windowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0.asInterface()) != null) {
                    InAppPurchasePreparationActivity.onNavigationEvent(this.this$0, appsInTossProductAsInterface);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onExtraCallbackWithResult + 53;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 99;
            onExtraCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                access14300.onWarmupCompleted();
                obj2.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {this.this$0};
                Object[] objArr2 = {(InAppPurchasePreparationViewModel) InAppPurchasePreparationActivity.IAuthTabCallback(HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), -1686982575, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), 1686982575)};
                setRubIn setrubin = (setRubIn) InAppPurchasePreparationViewModel.onWarmupCompleted(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, -225118289, 225118298);
                C00344 c00344 = new C00344(this.this$0, null);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(setrubin, c00344, this) == objOnWarmupCompleted) {
                    int i5 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = onNavigationEvent + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            InAppPurchasePreparationActivity inAppPurchasePreparationActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(inAppPurchasePreparationActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(inAppPurchasePreparationActivity, onextracallback, anonymousClass4, this) == objOnWarmupCompleted) {
                int i6 = onNavigationEvent + 31;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
