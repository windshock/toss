package im.toss.ads_sdk;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.ContextMenuAreaKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class DataBinderMapperImpl extends ContextMenuAreaKtExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 1;
    private static final SparseIntArray onExtraCallback = new SparseIntArray(0);
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 95;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public ViewDataBinding onExtraCallbackWithResult(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onExtraCallback.get(i);
            throw null;
        }
        if (onExtraCallback.get(i) <= 0 || view.getTag() != null) {
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewDataBinding onNavigationEvent(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View[] viewArr, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
            if (viewArr != null) {
                if (viewArr.length != 0 && onExtraCallback.get(i) > 0 && viewArr[0].getTag() == null) {
                    throw new RuntimeException("view must have a tag");
                }
            }
        } else if (viewArr != null) {
        }
        int i5 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public List<ContextMenuAreaKtExternalSyntheticLambda3> onNavigationEvent() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        int i2 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }
}
