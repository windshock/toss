package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class clearSignalInfo {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements Sequence<T> {
        final /* synthetic */ Function2 onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Function2 function2) {
            this.onExtraCallbackWithResult = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return clearSignalInfo.IAuthTabCallback(this.onExtraCallbackWithResult);
        }
    }

    public static <T> Sequence<T> onNavigationEvent(@NotNull Function2<? super clearCommandLine<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new onExtraCallbackWithResult(function2);
    }

    public static <T> Iterator<T> IAuthTabCallback(@NotNull Function2<? super clearCommandLine<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        clearMemoryMappings clearmemorymappings = new clearMemoryMappings();
        clearmemorymappings.onExtraCallback(access14200.onNavigationEvent(function2, clearmemorymappings, clearmemorymappings));
        return clearmemorymappings;
    }
}
