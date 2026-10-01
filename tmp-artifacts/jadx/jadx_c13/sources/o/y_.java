package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class y_<T> {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private final Function0<Long> IAuthTabCallback;
    private final LinkedHashMap<String, onExtraCallbackWithResult<T>> onExtraCallback;
    private final long onNavigationEvent;
    private final jni_YGNodeStyleGetFlexBasisJNI onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ y_<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(y_<T> y_Var, access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
            this.this$0 = y_Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = this.this$0.onWarmupCompleted(null, null, this);
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public y_(long j, @NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onNavigationEvent = j;
        this.IAuthTabCallback = function0;
        if (j <= 0) {
            throw new IllegalArgumentException("expireAfterWriteMillis must be positive");
        }
        this.onExtraCallback = new LinkedHashMap<>();
        this.onWarmupCompleted = jni_YGNodeStyleGetFlexGrowJNI.IAuthTabCallback(false, 1, null);
        int i = asBinder + 93;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    private final void onNavigationEvent(long j) {
        Iterator<Map.Entry<String, onExtraCallbackWithResult<T>>> it;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            it = this.onExtraCallback.entrySet().iterator();
            int i3 = 32 / 0;
        } else {
            it = this.onExtraCallback.entrySet().iterator();
        }
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i4 = asBinder + 7;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = onExtraCallbackWithResult + 73;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (j > it.next().getValue().onExtraCallbackWithResult()) {
                int i7 = asBinder + 39;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    it.remove();
                    obj.hashCode();
                    throw null;
                }
                it.remove();
            }
        }
    }

    static final class onExtraCallbackWithResult<T> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final getIconImageResource<T> onNavigationEvent;
        private final long onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull getIconImageResource<T> geticonimageresource, long j) {
            Intrinsics.checkNotNullParameter(geticonimageresource, "");
            this.onNavigationEvent = geticonimageresource;
            this.onWarmupCompleted = j;
        }

        public final getIconImageResource<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 69;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            getIconImageResource<T> geticonimageresource = this.onNavigationEvent;
            int i4 = i2 + 53;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return geticonimageresource;
            }
            throw null;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            long j = this.onWarmupCompleted;
            int i5 = i3 + 29;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull Function0<getIconImageResource<T>> function0, @NotNull access13800<? super getIconImageResource<T>> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni;
        getIconImageResource<T> geticonimageresourceOnWarmupCompleted;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof onWarmupCompleted))) {
            int i2 = asBinder + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = asBinder + 111;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted.label = i4 * Integer.MIN_VALUE;
                } else {
                    onwarmupcompleted.label = i4 - 2147483648;
                }
            } else {
                onwarmupcompleted = new onWarmupCompleted(this, access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i6 = onwarmupcompleted.label;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = this.onWarmupCompleted;
            onwarmupcompleted.L$0 = str;
            onwarmupcompleted.L$1 = function0;
            onwarmupcompleted.L$2 = jni_ygnodestylegetflexbasisjni;
            onwarmupcompleted.I$0 = 0;
            onwarmupcompleted.label = 1;
            if (jni_ygnodestylegetflexbasisjni.IAuthTabCallback(null, onwarmupcompleted) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jni_YGNodeStyleGetFlexBasisJNI jni_ygnodestylegetflexbasisjni2 = (jni_YGNodeStyleGetFlexBasisJNI) onwarmupcompleted.L$2;
            function0 = (Function0) onwarmupcompleted.L$1;
            String str2 = (String) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            jni_ygnodestylegetflexbasisjni = jni_ygnodestylegetflexbasisjni2;
            str = str2;
        }
        try {
            long jLongValue = this.IAuthTabCallback.invoke().longValue();
            onNavigationEvent(jLongValue);
            onExtraCallbackWithResult<T> onextracallbackwithresult = this.onExtraCallback.get(str);
            if (onextracallbackwithresult != null) {
                geticonimageresourceOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
            } else {
                getIconImageResource<T> geticonimageresourceInvoke = function0.invoke();
                this.onExtraCallback.put(str, new onExtraCallbackWithResult<>(geticonimageresourceInvoke, jLongValue + this.onNavigationEvent));
                geticonimageresourceOnWarmupCompleted = geticonimageresourceInvoke;
            }
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
            int i7 = asBinder + 123;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return geticonimageresourceOnWarmupCompleted;
            }
            throw null;
        } catch (Throwable th) {
            jni_ygnodestylegetflexbasisjni.onWarmupCompleted(null);
            throw th;
        }
    }
}
