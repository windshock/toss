package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FabricUIManager {

    public static final /* synthetic */ class onWarmupCompleted implements TextLinkScopeExternalSyntheticLambda0, FunctionAdapter {
        private final /* synthetic */ Function1 IAuthTabCallback;

        public onWarmupCompleted(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
            this.IAuthTabCallback = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof TextLinkScopeExternalSyntheticLambda0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        public final clearWrite<?> getFunctionDelegate() {
            return this.IAuthTabCallback;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.IAuthTabCallback.invoke(obj);
        }
    }
}
