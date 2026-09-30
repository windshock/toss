package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import o.b11;
import o.b9;
import o.setPatch;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public setPatch createDispatcher(@NotNull List<? extends MainDispatcherFactory> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new b9(b11.onExtraCallback(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
