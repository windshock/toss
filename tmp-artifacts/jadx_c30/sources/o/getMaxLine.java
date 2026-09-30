package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getMaxLine extends setDividerDrawableVertical {
    public static final getMaxLine onNavigationEvent = new getMaxLine();
    private static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();

    public static final class onWarmupCompleted extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
        onWarmupCompleted() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ClassValue
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Function1<Throwable, Throwable> computeValue(Class<?> cls) {
            Intrinsics.checkNotNull(cls, BuildConfig.FLAVOR);
            return setFlexDirection.onNavigationEvent(cls);
        }
    }

    private getMaxLine() {
    }
}
