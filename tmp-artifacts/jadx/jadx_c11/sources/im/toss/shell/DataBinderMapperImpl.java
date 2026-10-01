package im.toss.shell;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import o.ContextMenuAreaKtExternalSyntheticLambda1;
import o.ContextMenuAreaKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class DataBinderMapperImpl extends ContextMenuAreaKtExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static final SparseIntArray onWarmupCompleted = new SparseIntArray(0);

    static {
        int i = onExtraCallbackWithResult + 65;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ViewDataBinding onExtraCallbackWithResult(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View view, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
            if (onWarmupCompleted.get(i) > 0) {
                if (view.getTag() == null) {
                    throw new RuntimeException("view must have a tag");
                }
            }
        } else if (onWarmupCompleted.get(i) > 0) {
        }
        int i5 = onExtraCallback + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return null;
    }

    public ViewDataBinding onNavigationEvent(ContextMenuAreaKtExternalSyntheticLambda1 contextMenuAreaKtExternalSyntheticLambda1, View[] viewArr, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (viewArr != null) {
            int i3 = onExtraCallback;
            int i4 = i3 + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (viewArr.length != 0) {
                int i6 = i3 + 51;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    if (onWarmupCompleted.get(i) > 0 && viewArr[0].getTag() == null) {
                        throw new RuntimeException("view must have a tag");
                    }
                } else {
                    onWarmupCompleted.get(i);
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i7 = IAuthTabCallback + 121;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public List<ContextMenuAreaKtExternalSyntheticLambda3> onNavigationEvent() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new viva.republica.toss.DataBinderMapperImpl());
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }
}
