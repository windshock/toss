package o;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ComponentModela;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ComponentModela extends GeckoHubImp implements Closeable, AutoCloseable {
    public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult(null);

    public abstract void close();

    public abstract Executor onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult extends hasFaultAdjacentMetadata<GeckoHubImp, ComponentModela> {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
            super(GeckoHubImp.onExtraCallbackWithResult, new Function1() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComponentModela.onExtraCallbackWithResult.onExtraCallback((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ComponentModela onExtraCallback(CoroutineContext.Element element) {
            if (element instanceof ComponentModela) {
                return (ComponentModela) element;
            }
            return null;
        }
    }
}
