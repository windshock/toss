package o;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getColorFilter<T> implements getTileModeX<T> {
    private final Function2<setRipple<? super T>, access13800<? super Unit>, Object> onExtraCallback;
    private final getTileModeX<T> onExtraCallbackWithResult;

    static final class onExtraCallback extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getColorFilter<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getColorFilter<T> getcolorfilter, access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
            this.this$0 = getcolorfilter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    @Override // o.getTileModeX
    public List<T> onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getColorFilter(@NotNull getTileModeX<? extends T> gettilemodex, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        this.onExtraCallbackWithResult = gettilemodex;
        this.onExtraCallback = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.getTileModeX, o.IAnimation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<?> access13800Var) {
        onExtraCallback onextracallback;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(this, access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            getTileModeX<T> gettilemodex = this.onExtraCallbackWithResult;
            setEraseRadius seteraseradius = new setEraseRadius(setripple, this.onExtraCallback);
            onextracallback.label = 1;
            if (gettilemodex.collect(seteraseradius, onextracallback) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        throw new setWrite();
    }
}
