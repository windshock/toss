package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import o.IAnimation;
import o.serializeObject;
import o.writeBinary;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class RxConvertKt$$ExternalSyntheticLambda0 implements serializeObject {
    public final /* synthetic */ CoroutineContext f$0;
    public final /* synthetic */ IAnimation f$1;

    public /* synthetic */ RxConvertKt$$ExternalSyntheticLambda0(CoroutineContext coroutineContext, IAnimation iAnimation) {
        this.f$0 = coroutineContext;
        this.f$1 = iAnimation;
    }

    public final void subscribe(writeBinary writebinary) {
        RxConvertKt.onNavigationEvent(this.f$0, this.f$1, writebinary);
    }
}
