package im.toss.devtool.sharedpref.presentation;

import android.graphics.Color;
import android.os.Process;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda7;
import o.getCornerRadius;
import o.setShine;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SharedPrefStoreViewModel extends ViewModel {
    public static final Object Companion;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface = 1;
    private static final String onExtraCallback;
    private static int onTransact;
    private final getCornerRadius<Object> IAuthTabCallback;
    private final LiveData<Object> IAuthTabCallbackDefault;
    private final Object asBinder;
    private final Object onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final Object onWarmupCompleted;

    @Inject
    public SharedPrefStoreViewModel(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Object obj4) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        int i = onTransact;
        int i2 = i & 117;
        int i3 = ((i | 117) & (~i2)) + (i2 << 1);
        IAuthTabCallbackStubProxy = i3 % 128;
        Object obj5 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj3, "");
            Intrinsics.checkNotNullParameter(obj4, "");
            obj5.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        this.onWarmupCompleted = obj;
        this.onNavigationEvent = obj2;
        this.onExtraCallbackWithResult = obj3;
        this.asBinder = obj4;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-53197092);
        getCornerRadius<Object> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (64915 - Color.argb(0, 0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13696, -845891508, false, "onExtraCallback", (Class[]) null) : objOnExtraCallback)).get(null));
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackDefault = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getcornerradiusOnNavigationEvent, (CoroutineContext) null, 0L, 3, (Object) null);
    }

    static {
        try {
            Object[] objArr = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1640504126);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 6053), 81 - (Process.myPid() >> 22), 13727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1351148974, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i = IAuthTabCallbackStub + 91;
            asInterface = i % 128;
            if (i % 2 != 0) {
                onExtraCallback = SharedPrefStoreViewModel.class.getSimpleName();
            } else {
                onExtraCallback = SharedPrefStoreViewModel.class.getSimpleName();
                int i2 = 90 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
