package im.toss;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getBorderRadius;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import o.zzao;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class TossApplication$ITrustedWebActivityCallbackDefault implements zzao {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ TossApplication onExtraCallback;

    TossApplication$ITrustedWebActivityCallbackDefault(TossApplication tossApplication) {
        this.onExtraCallback = tossApplication;
    }

    public /* bridge */ void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityDestroyed(activity);
        int i4 = onWarmupCompleted + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityPaused(activity);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public /* bridge */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onActivitySaveInstanceState(activity, bundle);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityStarted(activity);
        int i4 = IAuthTabCallback + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityStopped(activity);
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = onWarmupCompleted + 1;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onExtraCallbackWithResult extends FlowMeasureLazyPolicyExternalSyntheticLambda3.onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ TossApplication IAuthTabCallback;
        final /* synthetic */ Activity onNavigationEvent;

        onExtraCallbackWithResult(TossApplication tossApplication, Activity activity) {
            this.IAuthTabCallback = tossApplication;
            this.onNavigationEvent = activity;
        }

        public void IAuthTabCallback(FlowMeasureLazyPolicyExternalSyntheticLambda3 flowMeasureLazyPolicyExternalSyntheticLambda3, Fragment fragment) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(flowMeasureLazyPolicyExternalSyntheticLambda3, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.IAuthTabCallback(flowMeasureLazyPolicyExternalSyntheticLambda3, fragment);
            maybeUpdateAnimatable.onNavigationEvent(TossApplication.IAuthTabCallback_Parcel(this.IAuthTabCallback), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this.IAuthTabCallback, this.onNavigationEvent, null), 3, (Object) null);
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Activity $activity;
            int label;
            final /* synthetic */ TossApplication this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(TossApplication tossApplication, Activity activity, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossApplication;
                this.$activity = activity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$activity, access13800Var);
                int i2 = IAuthTabCallback + 49;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 22 / 0;
                }
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onNavigationEvent + 11;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 103;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 99;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onNavigationEvent + 95;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getBorderRadius getborderradiusAccess000 = TossApplication.access000(this.this$0);
                    Activity activity = this.$activity;
                    this.label = 1;
                    if (getborderradiusAccess000.emit(activity, this) == objOnWarmupCompleted) {
                        int i7 = IAuthTabCallback + 87;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AppCompatActivity appCompatActivity;
        FlowMeasureLazyPolicyExternalSyntheticLambda3 supportFragmentManager;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AppCompatActivity) {
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            appCompatActivity = (AppCompatActivity) activity;
        } else {
            int i4 = onWarmupCompleted + 121;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            appCompatActivity = null;
        }
        if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.onNavigationEvent(new onExtraCallbackWithResult(this.onExtraCallback, activity), true);
    }

    public void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        maybeUpdateAnimatable.onNavigationEvent(TossApplication.IAuthTabCallback_Parcel(this.onExtraCallback), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this.onExtraCallback, activity, null), 3, (Object) null);
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Activity $activity;
        int label;
        final /* synthetic */ TossApplication this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(TossApplication tossApplication, Activity activity, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.this$0 = tossApplication;
            this.$activity = activity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, this.$activity, access13800Var);
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(unit);
            }
            iAuthTabCallbackCreate.invokeSuspend(unit);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[PHI: r1
          0x003b: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
          0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                int i4 = 79 / 0;
                if (i != 0) {
                    int i5 = onWarmupCompleted + 45;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getBorderRadius getborderradiusAccess000 = TossApplication.access000(this.this$0);
                    Activity activity = this.$activity;
                    this.label = 1;
                    if (getborderradiusAccess000.emit(activity, this) == objOnWarmupCompleted) {
                        int i7 = onExtraCallback + 115;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                if (i != 0) {
                }
            }
            return Unit.INSTANCE;
        }
    }
}
