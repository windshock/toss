package im.toss.devtool.sharedpref.presentation;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import im.toss.devtool.sharedpref.domain.usecase.item.RestorePrefUseCase;
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
public final class SharedPrefEditViewModel extends ViewModel {
    public static final Object Companion;
    private static final String IAuthTabCallback;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final LiveData<Object> IAuthTabCallbackDefault;
    private final Object IAuthTabCallbackStub;
    private final Object IAuthTabCallbackStubProxy;
    private String asBinder;
    private final RestorePrefUseCase asInterface;
    private final Object onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private final getCornerRadius<Object> onTransact;
    private final Object onWarmupCompleted;

    @Inject
    public SharedPrefEditViewModel(@NotNull Object obj, @NotNull Object obj2, @NotNull Object obj3, @NotNull Object obj4, @NotNull RestorePrefUseCase restorePrefUseCase, @NotNull Object obj5, @NotNull Object obj6) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        int i = access000;
        int i2 = i & 67;
        int i3 = (i | 67) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        IAuthTabCallback_Parcel = i5 % 128;
        Object obj7 = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj3, "");
            Intrinsics.checkNotNullParameter(obj4, "");
            Intrinsics.checkNotNullParameter(restorePrefUseCase, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        Intrinsics.checkNotNullParameter(restorePrefUseCase, "");
        int i6 = access000;
        int i7 = ((i6 | 17) << 1) - (i6 ^ 17);
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj5, "");
            Intrinsics.checkNotNullParameter(obj6, "");
            obj7.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj5, "");
        Intrinsics.checkNotNullParameter(obj6, "");
        this.onExtraCallback = obj;
        this.onExtraCallbackWithResult = obj2;
        this.onWarmupCompleted = obj3;
        this.IAuthTabCallbackStub = obj4;
        this.asInterface = restorePrefUseCase;
        this.IAuthTabCallbackStubProxy = obj5;
        this.onNavigationEvent = obj6;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-762377083);
        getCornerRadius<Object> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(((Field) (objOnExtraCallback == null ? BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 14918), 34 - View.resolveSize(0, 0), 13459 - ((byte) KeyEvent.getModifierMetaStateMask()), -472911339, false, "IAuthTabCallback", (Class[]) null) : objOnExtraCallback)).get(null));
        this.onTransact = getcornerradiusOnNavigationEvent;
        this.IAuthTabCallbackDefault = TextFieldKeyInputExternalSyntheticLambda7.onExtraCallback(getcornerradiusOnNavigationEvent, (CoroutineContext) null, 0L, 3, (Object) null);
        this.asBinder = "";
    }

    static {
        try {
            Object[] objArr = {null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(676346095);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (31671 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 80 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 420529791, false, (String) null, new Class[]{DefaultConstructorMarker.class});
            }
            Companion = ((Constructor) objOnExtraCallback).newInstance(objArr);
            int i = access100 + 37;
            getInterfaceDescriptor = i % 128;
            int i2 = i % 2;
            IAuthTabCallback = SharedPrefEditViewModel.class.getSimpleName();
            int i3 = getInterfaceDescriptor;
            int i4 = ((i3 ^ 37) - (~(-(-((i3 & 37) << 1))))) - 1;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
