package o;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class onCallBack<T> extends ExoPlayerImplExternalSyntheticLambda30<T> {
    private static int IAuthTabCallback = 1;
    public static final int onExtraCallback = 8;
    private static int onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onCallBack(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
        super(itemCallback);
        Intrinsics.checkNotNullParameter(itemCallback, "");
    }

    public final void onNavigationEvent(@NotNull ExoPlayerImplExternalSyntheticLambda32<List<T>> exoPlayerImplExternalSyntheticLambda32) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(exoPlayerImplExternalSyntheticLambda32, "");
            ((ExoPlayerImplExternalSyntheticLambda30) this).onExtraCallbackWithResult.onNavigationEvent(exoPlayerImplExternalSyntheticLambda32);
            throw null;
        }
        Intrinsics.checkNotNullParameter(exoPlayerImplExternalSyntheticLambda32, "");
        ((ExoPlayerImplExternalSyntheticLambda30) this).onExtraCallbackWithResult.onNavigationEvent(exoPlayerImplExternalSyntheticLambda32);
        int i3 = IAuthTabCallback + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
