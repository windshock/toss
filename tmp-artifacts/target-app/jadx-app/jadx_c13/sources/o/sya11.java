package o;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class sya11 {

    static final class onWarmupCompleted<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ycxycx.onExtraCallbackWithResult((IAnimation) null, (setRipple) null, this);
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<Throwable, access13800<? super Boolean>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new IAuthTabCallback(access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th, access13800<? super Boolean> access13800Var) {
            return ((IAuthTabCallback) create(th, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return access14000.onNavigationEvent(true);
        }
    }

    public static /* synthetic */ IAnimation onNavigationEvent(IAnimation iAnimation, long j, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = LongCompanionObject.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            function2 = new IAuthTabCallback(null);
        }
        return ycxycx.onNavigationEvent(iAnimation, j, (Function2<? super Throwable, ? super access13800<? super Boolean>, ? extends Object>) function2);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class onNavigationEvent<T> extends SuspendLambda implements setTaggedAddrCtrl<setRipple<? super T>, Throwable, Long, access13800<? super Boolean>, Object> {
        final /* synthetic */ Function2<Throwable, access13800<? super Boolean>, Object> $predicate;
        final /* synthetic */ long $retries;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(long j, Function2<? super Throwable, ? super access13800<? super Boolean>, ? extends Object> function2, access13800<? super onNavigationEvent> access13800Var) {
            super(4, access13800Var);
            this.$retries = j;
            this.$predicate = function2;
        }

        @Override // o.setTaggedAddrCtrl
        public /* synthetic */ Object invoke(Object obj, Throwable th, Long l, access13800<? super Boolean> access13800Var) {
            return onNavigationEvent((setRipple) obj, th, l.longValue(), access13800Var);
        }

        public final Object onNavigationEvent(setRipple<? super T> setripple, Throwable th, long j, access13800<? super Boolean> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$retries, this.$predicate, access13800Var);
            onnavigationevent.L$0 = th;
            onnavigationevent.J$0 = j;
            return onnavigationevent.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Throwable th = (Throwable) this.L$0;
                if (this.J$0 < this.$retries) {
                    Function2<Throwable, access13800<? super Boolean>, Object> function2 = this.$predicate;
                    this.label = 1;
                    obj = function2.invoke(th, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
                return access14000.onNavigationEvent(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            boolean z = ((Boolean) obj).booleanValue();
            return access14000.onNavigationEvent(z);
        }
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, long j, @NotNull Function2<? super Throwable, ? super access13800<? super Boolean>, ? extends Object> function2) {
        if (j <= 0) {
            throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j).toString());
        }
        return ycxycx.onExtraCallback((IAnimation) iAnimation, (setTaggedAddrCtrl) new onNavigationEvent(j, function2, null));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asBinder<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation IAuthTabCallback;
        final /* synthetic */ setTaggedAddrCtrl onExtraCallbackWithResult;

        /* renamed from: o.sya11$asBinder$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            long J$0;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return asBinder.this.collect(null, this);
            }
        }

        public asBinder(IAnimation iAnimation, setTaggedAddrCtrl settaggedaddrctrl) {
            this.IAuthTabCallback = iAnimation;
            this.onExtraCallbackWithResult = settaggedaddrctrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0075 -> B:30:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0096 -> B:26:0x0099). Please report as a decompilation issue!!! */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) throws Throwable {
            AnonymousClass1 anonymousClass1;
            long j;
            asBinder<T> asbinder;
            int i;
            asBinder<T> asbinder2;
            setRipple<? super T> setripple2;
            Throwable th;
            Object objOnExtraCallbackWithResult;
            if (access13800Var instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) access13800Var;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - 2147483648;
                } else {
                    anonymousClass1 = new AnonymousClass1(access13800Var);
                }
            }
            Object obj = anonymousClass1.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i3 = anonymousClass1.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                j = 0;
                asbinder = this;
                IAnimation iAnimation = asbinder.IAuthTabCallback;
                anonymousClass1.L$0 = asbinder;
                anonymousClass1.L$1 = setripple;
                anonymousClass1.L$2 = null;
                anonymousClass1.J$0 = j;
                anonymousClass1.I$0 = 0;
                anonymousClass1.label = 1;
                objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(iAnimation, setripple, anonymousClass1);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            if (i3 == 1) {
                i = anonymousClass1.I$0;
                j = anonymousClass1.J$0;
                setripple2 = (setRipple) anonymousClass1.L$1;
                asbinder2 = (asBinder) anonymousClass1.L$0;
                ResultKt.onNavigationEvent(obj);
                th = (Throwable) obj;
                if (th != null) {
                }
                asbinder = asbinder2;
                if (i == 0) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = anonymousClass1.J$0;
                Throwable th2 = (Throwable) anonymousClass1.L$2;
                setripple2 = (setRipple) anonymousClass1.L$1;
                asbinder2 = (asBinder) anonymousClass1.L$0;
                ResultKt.onNavigationEvent(obj);
                if (!((Boolean) obj).booleanValue()) {
                    j++;
                    i = 1;
                    asbinder = asbinder2;
                    if (i == 0) {
                        return Unit.INSTANCE;
                    }
                    setripple = setripple2;
                    IAnimation iAnimation2 = asbinder.IAuthTabCallback;
                    anonymousClass1.L$0 = asbinder;
                    anonymousClass1.L$1 = setripple;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.J$0 = j;
                    anonymousClass1.I$0 = 0;
                    anonymousClass1.label = 1;
                    objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(iAnimation2, setripple, anonymousClass1);
                    if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                        setripple2 = setripple;
                        i = 0;
                        asbinder2 = asbinder;
                        obj = objOnExtraCallbackWithResult;
                        th = (Throwable) obj;
                        if (th != null) {
                            setTaggedAddrCtrl settaggedaddrctrl = asbinder2.onExtraCallbackWithResult;
                            Long lOnExtraCallback = access14000.onExtraCallback(j);
                            anonymousClass1.L$0 = asbinder2;
                            anonymousClass1.L$1 = setripple2;
                            anonymousClass1.L$2 = th;
                            anonymousClass1.J$0 = j;
                            anonymousClass1.label = 2;
                            InlineMarker.mark(6);
                            Object objInvoke = settaggedaddrctrl.invoke(setripple2, th, lOnExtraCallback, anonymousClass1);
                            InlineMarker.mark(7);
                            if (objInvoke != objOnExtraCallback) {
                                obj = objInvoke;
                                th2 = th;
                                if (!((Boolean) obj).booleanValue()) {
                                    throw th2;
                                }
                            }
                        }
                        asbinder = asbinder2;
                        if (i == 0) {
                        }
                    }
                    return objOnExtraCallback;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallback<T> implements IAnimation<T> {
        final /* synthetic */ IAnimation onExtraCallbackWithResult;
        final /* synthetic */ getBacktraceNote onWarmupCompleted;

        /* renamed from: o.sya11$onExtraCallback$2, reason: invalid class name */
        public static final class AnonymousClass2 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass2(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onExtraCallback.this.collect(null, this);
            }
        }

        public onExtraCallback(IAnimation iAnimation, getBacktraceNote getbacktracenote) {
            this.onExtraCallbackWithResult = iAnimation;
            this.onWarmupCompleted = getbacktracenote;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r6 == r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) throws Throwable {
            AnonymousClass2 anonymousClass2;
            onExtraCallback<T> onextracallback;
            if (access13800Var instanceof AnonymousClass2) {
                anonymousClass2 = (AnonymousClass2) access13800Var;
                int i = anonymousClass2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass2.label = i - 2147483648;
                } else {
                    anonymousClass2 = new AnonymousClass2(access13800Var);
                }
            }
            Object objOnExtraCallbackWithResult = anonymousClass2.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass2.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                IAnimation iAnimation = this.onExtraCallbackWithResult;
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = setripple;
                anonymousClass2.label = 1;
                objOnExtraCallbackWithResult = ycxycx.onExtraCallbackWithResult(iAnimation, setripple, anonymousClass2);
                if (objOnExtraCallbackWithResult != objOnExtraCallback) {
                    onextracallback = this;
                }
                return objOnExtraCallback;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                return Unit.INSTANCE;
            }
            setripple = (setRipple) anonymousClass2.L$1;
            onextracallback = (onExtraCallback) anonymousClass2.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            Throwable th = (Throwable) objOnExtraCallbackWithResult;
            if (th != null) {
                getBacktraceNote getbacktracenote = onextracallback.onWarmupCompleted;
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.label = 2;
                InlineMarker.mark(6);
                Object objInvoke = getbacktracenote.invoke(setripple, th, anonymousClass2);
                InlineMarker.mark(7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull setRipple<? super T> setripple, @NotNull access13800<? super Throwable> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        Throwable th;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i = onwarmupcompleted.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onwarmupcompleted.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                setRipple<? super Object> onextracallbackwithresult = new onExtraCallbackWithResult<>(setripple, objectRef2);
                onwarmupcompleted.L$0 = objectRef2;
                onwarmupcompleted.label = 1;
                if (iAnimation.collect(onextracallbackwithresult, onwarmupcompleted) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) onwarmupcompleted.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) objectRef.element;
        if (IAuthTabCallback(th, th4) || IAuthTabCallback(th, onwarmupcompleted.getContext())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            setExecute.onNavigationEvent(th4, th);
            throw th4;
        }
        setExecute.onNavigationEvent(th, th4);
        throw th;
    }

    static final class onExtraCallbackWithResult<T> implements setRipple {
        final /* synthetic */ setRipple<T> onExtraCallback;
        final /* synthetic */ Ref.ObjectRef<Throwable> onNavigationEvent;

        static final class IAuthTabCallback extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ onExtraCallbackWithResult<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            IAuthTabCallback(onExtraCallbackWithResult<? super T> onextracallbackwithresult, access13800<? super IAuthTabCallback> access13800Var) {
                super(access13800Var);
                this.this$0 = onextracallbackwithresult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(setRipple<? super T> setripple, Ref.ObjectRef<Throwable> objectRef) {
            this.onExtraCallback = setripple;
            this.onNavigationEvent = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.setRipple
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, access13800<? super Unit> access13800Var) throws Throwable {
            IAuthTabCallback iAuthTabCallback;
            Object obj;
            onExtraCallbackWithResult<T> onextracallbackwithresult;
            if (access13800Var instanceof IAuthTabCallback) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                int i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(this, access13800Var);
                }
            }
            Object obj2 = iAuthTabCallback.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = iAuthTabCallback.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onextracallbackwithresult = (onExtraCallbackWithResult) iAuthTabCallback.L$0;
                try {
                    ResultKt.onNavigationEvent(obj2);
                    return Unit.INSTANCE;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof o.sya11.onExtraCallbackWithResult.IAuthTabCallback
                    if (r0 == 0) goto L13
                    r0 = r6
                    o.sya11$onExtraCallbackWithResult$IAuthTabCallback r0 = (o.sya11.onExtraCallbackWithResult.IAuthTabCallback) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L18
                L13:
                    o.sya11$onExtraCallbackWithResult$IAuthTabCallback r0 = new o.sya11$onExtraCallbackWithResult$IAuthTabCallback
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = o.access14300.onWarmupCompleted()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.L$0
                    o.sya11$onExtraCallbackWithResult r5 = (o.sya11.onExtraCallbackWithResult) r5
                    kotlin.ResultKt.onNavigationEvent(r6)     // Catch: java.lang.Throwable -> L2d
                    goto L47
                L2d:
                    r6 = move-exception
                    goto L4d
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    kotlin.ResultKt.onNavigationEvent(r6)
                    o.setRipple<T> r6 = r4.onExtraCallback     // Catch: java.lang.Throwable -> L4a
                    r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
                    r0.label = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L4a:
                    r5 = move-exception
                    r6 = r5
                    r5 = r4
                L4d:
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.onNavigationEvent
                    r5.element = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o.sya11.onExtraCallbackWithResult.emit(java.lang.Object, o.access13800):java.lang.Object");
            }
        }

        private static final boolean IAuthTabCallback(Throwable th, CoroutineContext coroutineContext) {
            getPackageType getpackagetype = (getPackageType) coroutineContext.get(getPackageType.onNavigationEvent);
            if (getpackagetype == null || !getpackagetype.access000()) {
                return false;
            }
            return IAuthTabCallback(th, getpackagetype.asBinder());
        }

        private static final boolean IAuthTabCallback(Throwable th, Throwable th2) {
            return th2 != null && Intrinsics.areEqual(th2, th);
        }

        public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super T>, ? super Throwable, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
            return new onExtraCallback(iAnimation, getbacktracenote);
        }

        public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull setTaggedAddrCtrl<? super setRipple<? super T>, ? super Throwable, ? super Long, ? super access13800<? super Boolean>, ? extends Object> settaggedaddrctrl) {
            return new asBinder(iAnimation, settaggedaddrctrl);
        }
    }
