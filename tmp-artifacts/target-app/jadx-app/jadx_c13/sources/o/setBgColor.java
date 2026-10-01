package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setBgColor<E, C extends Collection<? extends E>, B> extends getTimeOutListener<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setBgColor(@NotNull KSerializer<E> kSerializer) {
        super(kSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull C c) {
        Intrinsics.checkNotNullParameter(c, "");
        return c.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public Iterator<E> onExtraCallbackWithResult(@NotNull C c) {
        Intrinsics.checkNotNullParameter(c, "");
        return c.iterator();
    }
}
