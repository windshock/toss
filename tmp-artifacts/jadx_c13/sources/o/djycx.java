package o;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class djycx {
    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new getBorderColors(function2);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallback<T> implements IAnimation<T> {
        final /* synthetic */ Object IAuthTabCallback;

        public onExtraCallback(Object obj) {
            this.IAuthTabCallback = obj;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            Object objEmit = setripple.emit((Object) this.IAuthTabCallback, access13800Var);
            return objEmit == access14100.onExtraCallback() ? objEmit : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onNavigationEvent<T> implements IAnimation<T> {
        final /* synthetic */ Sequence IAuthTabCallback;

        /* renamed from: o.djycx$onNavigationEvent$5, reason: invalid class name */
        public static final class AnonymousClass5 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass5(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onNavigationEvent.this.collect(null, this);
            }
        }

        public onNavigationEvent(Sequence sequence) {
            this.IAuthTabCallback = sequence;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            AnonymousClass5 anonymousClass5;
            setRipple setripple2;
            Iterator<T> itIAuthTabCallback;
            if (access13800Var instanceof AnonymousClass5) {
                anonymousClass5 = (AnonymousClass5) access13800Var;
                int i = anonymousClass5.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass5.label = i - 2147483648;
                } else {
                    anonymousClass5 = new AnonymousClass5(access13800Var);
                }
            }
            Object obj = anonymousClass5.result;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = anonymousClass5.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                setripple2 = setripple;
                itIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                itIAuthTabCallback = (Iterator) anonymousClass5.L$1;
                setripple2 = (setRipple) anonymousClass5.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            while (itIAuthTabCallback.hasNext()) {
                T next = itIAuthTabCallback.next();
                anonymousClass5.L$0 = setripple2;
                anonymousClass5.L$1 = itIAuthTabCallback;
                anonymousClass5.label = 1;
                if (setripple2.emit(next, anonymousClass5) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements IAnimation<T> {
        final /* synthetic */ Object[] onExtraCallback;

        /* renamed from: o.djycx$onWarmupCompleted$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(access13800 access13800Var) {
                super(access13800Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return onWarmupCompleted.this.collect(null, this);
            }
        }

        public onWarmupCompleted(Object[] objArr) {
            this.onExtraCallback = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        @Override // o.IAnimation
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            AnonymousClass1 anonymousClass1;
            int i;
            onWarmupCompleted<T> onwarmupcompleted;
            setRipple setripple2;
            int length;
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
                i = 0;
                onwarmupcompleted = this;
                setripple2 = setripple;
                length = this.onExtraCallback.length;
                if (i < length) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = anonymousClass1.I$1;
                i = anonymousClass1.I$0;
                setRipple setripple3 = (setRipple) anonymousClass1.L$1;
                onwarmupcompleted = (onWarmupCompleted) anonymousClass1.L$0;
                ResultKt.onNavigationEvent(obj);
                setRipple setripple4 = setripple3;
                i++;
                setripple2 = setripple4;
                if (i < length) {
                    Object obj2 = onwarmupcompleted.onExtraCallback[i];
                    anonymousClass1.L$0 = onwarmupcompleted;
                    anonymousClass1.L$1 = setripple2;
                    anonymousClass1.I$0 = i;
                    anonymousClass1.I$1 = length;
                    anonymousClass1.label = 1;
                    Object objEmit = setripple2.emit(obj2, anonymousClass1);
                    setripple4 = setripple2;
                    if (objEmit == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    i++;
                    setripple2 = setripple4;
                    if (i < length) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public static final <T> IAnimation<T> IAuthTabCallback() {
        return jc1.onExtraCallback;
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new getRipple(function2, null, 0, null, 14, null);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return new wwx(function2, null, 0, null, 14, null);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull Iterable<? extends T> iterable) {
        return new onExtraCallbackWithResult(iterable);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull Sequence<? extends T> sequence) {
        return new onNavigationEvent(sequence);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull T... tArr) {
        return new onWarmupCompleted(tArr);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(T t) {
        return new onExtraCallback(t);
    }
}
