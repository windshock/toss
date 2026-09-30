package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface drawTextProgressMargin {
    void onExtraCallback();

    Map<String, String> onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NotNull Bundle bundle);

    void onExtraCallbackWithResult(@NotNull Fragment fragment);
}
