package o;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class lt10<Target> implements setLottieClicklistener<Target> {
    private final String onExtraCallbackWithResult;
    private final List<String> onNavigationEvent;
    private final ltlt<Target> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public lt10(@NotNull ltlt<? super Target> ltltVar, @NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(ltltVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = ltltVar;
        this.onNavigationEvent = list;
        this.onExtraCallbackWithResult = str;
        if (list.size() == (ltltVar.onTransact() - ltltVar.IAuthTabCallbackDefault()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + list.size() + ") in " + list + " does not match the range of the field (" + ((ltltVar.onTransact() - ltltVar.IAuthTabCallbackDefault()) + 1) + ')').toString());
    }

    @Override // o.setLottieClicklistener
    public /* synthetic */ setLottieAnimListener onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final ltlt<Target> onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String IAuthTabCallback(Target target) {
        int iIntValue = this.onWarmupCompleted.onExtraCallback().onExtraCallback(target).intValue();
        String str = (String) CollectionsKt___CollectionsKt.getOrNull(this.onNavigationEvent, iIntValue - this.onWarmupCompleted.IAuthTabCallbackDefault());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.onWarmupCompleted.IAuthTabCallback() + " does not have a corresponding string representation";
    }

    final class IAuthTabCallback implements removePauseListener<Target, String> {
        public IAuthTabCallback() {
        }

        @Override // o.removePauseListener
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public String onWarmupCompleted(Target target, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Integer numOnWarmupCompleted = lt10.this.onNavigationEvent().onExtraCallback().onWarmupCompleted(target, Integer.valueOf(((lt10) lt10.this).onNavigationEvent.indexOf(str) + lt10.this.onNavigationEvent().IAuthTabCallbackDefault()));
            if (numOnWarmupCompleted == null) {
                return null;
            }
            lt10<Target> lt10Var = lt10.this;
            return (String) ((lt10) lt10Var).onNavigationEvent.get(numOnWarmupCompleted.intValue() - lt10Var.onNavigationEvent().IAuthTabCallbackDefault());
        }

        @Override // o.removePauseListener
        public String onWarmupCompleted() {
            return ((lt10) lt10.this).onExtraCallbackWithResult;
        }
    }

    final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<Target, String> {
        onWarmupCompleted(Object obj) {
            super(1, obj, lt10.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final String invoke(Target target) {
            return ((lt10) this.receiver).IAuthTabCallback((lt10) target);
        }
    }

    @Override // o.setLottieClicklistener
    public ltlud<Target> onWarmupCompleted() {
        return new getAnimatedValue(new onWarmupCompleted(this));
    }

    @Override // o.setLottieClicklistener
    public ulsya<Target> onExtraCallback() {
        return new ulsya<>(CollectionsKt__CollectionsJVMKt.listOf(new getRippleValue(this.onNavigationEvent, new IAuthTabCallback(), "one of " + this.onNavigationEvent + " for " + this.onExtraCallbackWithResult)), CollectionsKt__CollectionsKt.emptyList());
    }
}
