package o;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.hasPermissionModel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class interceptUrlForTiny extends exitAllPages<NativeKeyboardObserverSpec> {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public interceptUrlForTiny(@NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onExtraCallbackWithResult(new hasPermissionModel(this, onextracallback).onNavigationEvent());
        onExtraCallbackWithResult(new setAuthState(this, onextracallback).onWarmupCompleted());
    }

    public long getItemId(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        List list = (List) ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted;
        if (i4 != 0) {
            return ((NativeKeyboardObserverSpec) list.get(i)).IAuthTabCallback();
        }
        ((NativeKeyboardObserverSpec) list.get(i)).IAuthTabCallback();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[PHI: r2
      0x0041: PHI (r2v6 o.removePlugin) = (r2v5 o.removePlugin), (r2v9 o.removePlugin) binds: [B:11:0x003f, B:8:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<NativeKeyboardObserverSpec> IAuthTabCallback(@NotNull List<removePlugin> list) {
        removePlugin removeplugin;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                removeplugin = (removePlugin) it.next();
                int i3 = 12 / 0;
                if (removeplugin.onExtraCallback() != null) {
                    arrayList.add(new hasPermissionModel.onExtraCallback(removeplugin, !arrayList.isEmpty()));
                }
            } else {
                removeplugin = (removePlugin) it.next();
                if (removeplugin.onExtraCallback() != null) {
                }
            }
            ArrayList arrayListIAuthTabCallback = removeplugin.IAuthTabCallback();
            ArrayList<FlipperPlugin> arrayList2 = new ArrayList();
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            for (Object obj : arrayListIAuthTabCallback) {
                int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
                if (((Boolean) FlipperPlugin.IAuthTabCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{(FlipperPlugin) obj}, 165019874, -165019874)).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            for (FlipperPlugin flipperPlugin : arrayList2) {
                int i6 = IAuthTabCallback + 119;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                if (flipperPlugin.getInterfaceDescriptor() != null) {
                    arrayList.add(new FlipperDiagnosticActivity(flipperPlugin.IAuthTabCallbackStub() + "TOP_BORDER", removeplugin.onWarmupCompleted()));
                }
                arrayList.add(flipperPlugin);
                if (flipperPlugin.onExtraCallback() != null) {
                    arrayList.add(new FlipperDiagnosticActivity(flipperPlugin.IAuthTabCallbackStub() + "BOTTOM_BORDER", removeplugin.onWarmupCompleted()));
                }
            }
        }
        return arrayList;
    }
}
