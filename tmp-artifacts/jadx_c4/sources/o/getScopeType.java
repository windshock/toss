package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getScopeType {
    public static final Object Companion;

    static {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1066250133);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 18847), ExpandableListView.getPackedPositionGroup(0L) + 31, 11071 - TextUtils.lastIndexOf("", '0', 0, 0), 248336645, false, "onExtraCallback", (Class[]) null);
        }
        Companion = ((Field) objOnExtraCallback).get(null);
    }

    List<Object> IAuthTabCallback();

    void IAuthTabCallback(@NotNull List<Object> list);

    void IAuthTabCallback$252026d8(@NotNull Object obj);

    void onExtraCallback$252026d8(@NotNull Object obj);

    List<Object> onExtraCallbackWithResult();

    void onExtraCallbackWithResult$252026d8(@NotNull Object obj);

    void onNavigationEvent$252026d8(@NotNull Object obj);

    List<Object> onWarmupCompleted();
}
