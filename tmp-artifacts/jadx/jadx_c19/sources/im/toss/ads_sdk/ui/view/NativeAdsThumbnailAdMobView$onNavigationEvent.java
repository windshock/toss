package im.toss.ads_sdk.ui.view;

import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.IAnimation;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getCornerRadius;
import o.ycxycx;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsThumbnailAdMobView$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 $lifecycle;
    int label;
    final /* synthetic */ NativeAdsThumbnailAdMobView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsThumbnailAdMobView$onNavigationEvent(TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, access13800<? super NativeAdsThumbnailAdMobView$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.$lifecycle = textFieldKeyInputExternalSyntheticLambda9;
        this.this$0 = nativeAdsThumbnailAdMobView;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsThumbnailAdMobView$onNavigationEvent nativeAdsThumbnailAdMobView$onNavigationEvent = new NativeAdsThumbnailAdMobView$onNavigationEvent(this.$lifecycle, this.this$0, access13800Var);
        int i3 = onExtraCallback + 65;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return nativeAdsThumbnailAdMobView$onNavigationEvent;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(findresandmsg, access13800Var);
        }
        onExtraCallbackWithResult(findresandmsg, access13800Var);
        throw null;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsThumbnailAdMobView$onNavigationEvent nativeAdsThumbnailAdMobView$onNavigationEventCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return nativeAdsThumbnailAdMobView$onNavigationEventCreate.invokeSuspend(unit);
        }
        nativeAdsThumbnailAdMobView$onNavigationEventCreate.invokeSuspend(unit);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;
        final /* synthetic */ NativeAdsThumbnailAdMobView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsThumbnailAdMobView;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, access13800Var);
            int i3 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i5 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent$5$onWarmupCompleted */
        static final class onWarmupCompleted extends SuspendLambda implements getBacktraceNote<Boolean, Boolean, access13800<? super Boolean>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
                super(3, access13800Var);
            }

            public final Object IAuthTabCallback(boolean z, boolean z2, access13800<? super Boolean> access13800Var) {
                int i2 = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
                onwarmupcompleted.Z$0 = z;
                onwarmupcompleted.Z$1 = z2;
                Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
                int i3 = IAuthTabCallback + 7;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objIAuthTabCallback = IAuthTabCallback(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (access13800) obj3);
                int i5 = IAuthTabCallback + 37;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objIAuthTabCallback;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                boolean z2 = this.Z$0;
                boolean z3 = this.Z$1;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                if (z2) {
                    z = true;
                    if (!(!z3)) {
                        z = false;
                    } else {
                        int i5 = onNavigationEvent + 31;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                return access14000.onNavigationEvent(z);
            }
        }

        /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements getBacktraceNote<NativeAd, Boolean, access13800<? super Pair<? extends NativeAd, ? extends Boolean>>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
                super(3, access13800Var);
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((NativeAd) obj, ((Boolean) obj2).booleanValue(), (access13800) obj3);
                int i5 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final Object onExtraCallbackWithResult(NativeAd nativeAd, boolean z, access13800<? super Pair<? extends NativeAd, Boolean>> access13800Var) {
                int i2 = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var);
                anonymousClass3.L$0 = nativeAd;
                anonymousClass3.Z$0 = z;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i3 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
            
                return r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (r6.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
            
                if (r6.label == 0) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
            
                kotlin.ResultKt.onNavigationEvent(r7);
                r7 = new kotlin.Pair(r1, o.access14000.onNavigationEvent(r3));
                r1 = im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent.AnonymousClass5.AnonymousClass3.onExtraCallbackWithResult + 85;
                im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent.AnonymousClass5.AnonymousClass3.onNavigationEvent = r1 % 128;
                r1 = r1 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                NativeAd nativeAd;
                boolean z;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    nativeAd = (NativeAd) this.L$0;
                    z = this.Z$0;
                    int i4 = 85 / 0;
                } else {
                    nativeAd = (NativeAd) this.L$0;
                    z = this.Z$0;
                }
            }
        }

        /* renamed from: im.toss.ads_sdk.ui.view.NativeAdsThumbnailAdMobView$onNavigationEvent$5$5, reason: invalid class name and collision with other inner class name */
        static final class C00335 extends SuspendLambda implements Function2<Pair<? extends NativeAd, ? extends Boolean>, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ NativeAdsThumbnailAdMobView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00335(NativeAdsThumbnailAdMobView nativeAdsThumbnailAdMobView, access13800<? super C00335> access13800Var) {
                super(2, access13800Var);
                this.this$0 = nativeAdsThumbnailAdMobView;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i2 = 2 % 2;
                C00335 c00335 = new C00335(this.this$0, access13800Var);
                c00335.L$0 = obj;
                int i3 = onNavigationEvent + 47;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 42 / 0;
                }
                return c00335;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objOnExtraCallback = onExtraCallback((Pair) obj, (access13800) obj2);
                int i5 = onNavigationEvent + 65;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return objOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            public final Object onExtraCallback(Pair<? extends NativeAd, Boolean> pair, access13800<? super Unit> access13800Var) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = create(pair, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i5 = IAuthTabCallback + 95;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Pair pair = (Pair) this.L$0;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = IAuthTabCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.onNavigationEvent(obj);
                NativeAd nativeAd = (NativeAd) pair.onExtraCallbackWithResult();
                boolean zBooleanValue = ((Boolean) pair.IAuthTabCallback()).booleanValue();
                if (nativeAd == null) {
                    return Unit.INSTANCE;
                }
                if (zBooleanValue) {
                    int i5 = onNavigationEvent + 81;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = {this.this$0, nativeAd};
                    int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                    NativeAdsThumbnailAdMobView.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, 1901605491, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1901605487, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted());
                    int i7 = IAuthTabCallback + 69;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    NativeAdsThumbnailAdMobView.onWarmupCompleted(this.this$0, nativeAd);
                }
                Unit unit = Unit.INSTANCE;
                int i9 = onNavigationEvent + 19;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 != 0) {
                int i6 = IAuthTabCallback + 7;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                IAnimation iAnimationIAuthTabCallback = ycxycx.IAuthTabCallback(ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted(NativeAdsThumbnailAdMobView.onExtraCallbackWithResult(this.this$0), NativeAdsThumbnailAdMobView.onNavigationEvent(this.this$0), new onWarmupCompleted(null))), 1);
                Object[] objArr = {this.this$0};
                int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                IAnimation iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onWarmupCompleted((getCornerRadius) NativeAdsThumbnailAdMobView.onWarmupCompleted(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), iOnWarmupCompleted, -1108856079, objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1108856079, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted()), iAnimationIAuthTabCallback, new AnonymousClass3(null)));
                C00335 c00335 = new C00335(this.this$0, null);
                this.L$0 = access15400.onNavigationEvent(iAnimationIAuthTabCallback);
                this.label = 1;
                if (ycxycx.onWarmupCompleted(iAnimationOnNavigationEvent, c00335, this) == objOnWarmupCompleted) {
                    int i8 = onExtraCallbackWithResult + 93;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 125;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = this.$lifecycle;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onWarmupCompleted(textFieldKeyInputExternalSyntheticLambda9, onextracallback, anonymousClass5, this) == objOnWarmupCompleted) {
                int i5 = onExtraCallback + 11;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
