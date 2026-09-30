package o;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.getAppEnteredForegroundTimeMillis;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getAppEnteredForegroundTimeMillis {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    public static final getAppEnteredForegroundTimeMillis onWarmupCompleted = new getAppEnteredForegroundTimeMillis();
    private static final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.splittarget.spec.tds.TdsOverlay$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return getAppEnteredForegroundTimeMillis.onNavigationEvent();
            }
            getAppEnteredForegroundTimeMillis.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    public static final int onExtraCallback = 8;

    public static /* synthetic */ ResourceUriFetcherFactory onNavigationEvent() {
        ResourceUriFetcherFactory resourceUriFetcherFactoryOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            resourceUriFetcherFactoryOnWarmupCompleted = onWarmupCompleted();
            int i3 = 38 / 0;
        } else {
            resourceUriFetcherFactoryOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = IAuthTabCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return resourceUriFetcherFactoryOnWarmupCompleted;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i3 | i5);
        int i8 = ~(i5 | i2);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i5;
        int i12 = (~(i10 | i2)) | (~(i10 | i11)) | (~(i11 | i2));
        int i13 = ~i2;
        int i14 = i12 | (~(i13 | i3 | i5));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = i3 + i5 + i + (1962400304 * i6) + (1167700406 * i4);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i5) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i) + ((-1660944384) * i6) + ((-325058560) * i4) + (867827712 * i17);
        int i19 = ((i3 * (-1629562239)) - 1134582380) + (i5 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i * (-1629561329)) + (i6 * (-1621399344)) + (i4 * (-873382486)) + (i17 * 1407582208);
        return i18 + ((i19 * i19) * (-1895432192)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private getAppEnteredForegroundTimeMillis() {
    }

    static {
        int i = asBinder + 115;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private final ResourceUriFetcherFactory IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object value = onExtraCallbackWithResult.getValue();
        if (i3 != 0) {
            return (ResourceUriFetcherFactory) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final ResourceUriFetcherFactory onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        if (i3 != 0) {
            int i4 = 85 / 0;
            return ((RealInterceptorChain) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
        }
        return ((RealInterceptorChain) Response.onExtraCallback(userChoiceBillingListener.onExtraCallback(), RealInterceptorChain.class)).extraCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            int i3 = 59 / 0;
            if (((Boolean) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 1094500129, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1094500128, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue()) {
                int i4 = IAuthTabCallback + 61;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0 ? IAuthTabCallbackDefault().getInterfaceDescriptor().onExtraCallback("devWeedCheckerEnabled", false) : IAuthTabCallbackDefault().getInterfaceDescriptor().onExtraCallback("devWeedCheckerEnabled", true)) {
                    int i5 = onNavigationEvent + 57;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
        } else {
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            if (((Boolean) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, 1094500129, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1094500128, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue()) {
            }
        }
        return false;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (((Boolean) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1094500129, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1094500128, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue()) {
            int i2 = IAuthTabCallback + 81;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (IAuthTabCallbackDefault().getInterfaceDescriptor().onExtraCallback("devTdsCheckerEnabled", false)) {
                int i4 = IAuthTabCallback + 109;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        int i5 = onNavigationEvent + 53;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!onExtraCallbackWithResult() && (!onExtraCallback())) {
            int i3 = IAuthTabCallback + 41;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = onNavigationEvent + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        if (zzaj.onNavigationEvent().onActivityResized() < 8000) {
            return false;
        }
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        int i6 = 67 / 0;
        return true;
    }

    public final List<IAuthTabCallback> onExtraCallbackWithResult(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "");
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Object objOnWarmupCompleted = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, "mGlobal", windowManager}, iOnWarmupCompleted, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        if (objOnWarmupCompleted == null) {
            return new ArrayList();
        }
        int i4 = onNavigationEvent + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            Object objOnWarmupCompleted2 = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, "mRoots", objOnWarmupCompleted}, iOnWarmupCompleted2, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            Object objOnWarmupCompleted3 = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, "mParams", objOnWarmupCompleted}, iOnWarmupCompleted3, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
            Intrinsics.checkNotNull(objOnWarmupCompleted2, "");
            Intrinsics.checkNotNull(objOnWarmupCompleted3, "");
            return onNavigationEvent((ArrayList) objOnWarmupCompleted2, (List<? extends WindowManager.LayoutParams>) objOnWarmupCompleted3);
        }
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Object objOnWarmupCompleted4 = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, "mRoots", objOnWarmupCompleted}, iOnWarmupCompleted4, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        Object objOnWarmupCompleted5 = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, "mParams", objOnWarmupCompleted}, iOnWarmupCompleted5, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
        Intrinsics.checkNotNull(objOnWarmupCompleted4, "");
        Intrinsics.checkNotNull(objOnWarmupCompleted5, "");
        onNavigationEvent((ArrayList) objOnWarmupCompleted4, (List<? extends WindowManager.LayoutParams>) objOnWarmupCompleted5);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getAppEnteredForegroundTimeMillis getappenteredforegroundtimemillis = (getAppEnteredForegroundTimeMillis) objArr[0];
        String str = (String) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return getappenteredforegroundtimemillis.onExtraCallback(str, obj);
            }
            getappenteredforegroundtimemillis.onExtraCallback(str, obj);
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final Object onExtraCallback(String str, Object obj) throws SecurityException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Field fieldOnNavigationEvent = onNavigationEvent(str, obj.getClass());
            if (fieldOnNavigationEvent != null) {
                int i3 = onNavigationEvent + 99;
                IAuthTabCallback = i3 % 128;
                fieldOnNavigationEvent.setAccessible(i3 % 2 != 0);
            }
            if (fieldOnNavigationEvent == null) {
                int i4 = IAuthTabCallback + 103;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            return fieldOnNavigationEvent.get(obj);
        }
        onNavigationEvent(str, obj.getClass());
        throw null;
    }

    public static final class onWarmupCompleted<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((IAuthTabCallback) t).onExtraCallback().type), Integer.valueOf(((IAuthTabCallback) t2).onExtraCallback().type));
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return iIAuthTabCallback;
            }
            throw null;
        }
    }

    private final Field onNavigationEvent(String str, Class<Object> cls) {
        int i = 2 % 2;
        while (!Intrinsics.areEqual(cls, new PropertyReference1Impl() { // from class: o.getAppEnteredForegroundTimeMillis.onExtraCallback
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i2 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public Object get(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 71;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Class<?> cls2 = obj.getClass();
                if (i4 != 0) {
                    int i5 = 32 / 0;
                }
                int i6 = onNavigationEvent + 105;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    return cls2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        })) {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "");
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = IAuthTabCallback + 33;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Field field = declaredFields[i2];
                if (Intrinsics.areEqual(str, field.getName())) {
                    return field;
                }
                i2++;
                int i5 = IAuthTabCallback + 55;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            cls = cls.getSuperclass();
            Intrinsics.checkNotNull(cls, "");
            int i7 = IAuthTabCallback + 9;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final WindowManager.LayoutParams onExtraCallback;
        private final Rect onExtraCallbackWithResult;
        private final View onWarmupCompleted;

        public IAuthTabCallback(@NotNull View view, @NotNull Rect rect, @NotNull WindowManager.LayoutParams layoutParams) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(layoutParams, "");
            this.onWarmupCompleted = view;
            this.onExtraCallbackWithResult = rect;
            this.onExtraCallback = layoutParams;
        }

        public final View onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            View view = this.onWarmupCompleted;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return view;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final WindowManager.LayoutParams onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            WindowManager.LayoutParams layoutParams = this.onExtraCallback;
            int i5 = i3 + 35;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return layoutParams;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList<IAuthTabCallback> onNavigationEvent(List<? extends ViewParent> list, List<? extends WindowManager.LayoutParams> list2) {
        View view;
        int i = 2 % 2;
        ArrayList<IAuthTabCallback> arrayList = new ArrayList<>();
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ViewParent viewParent = (ViewParent) obj;
            if (list2.get(i2).type != 2) {
                int i3 = onNavigationEvent + 61;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    if (list2.get(i2).type == 1) {
                        Object objOnWarmupCompleted = onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{onWarmupCompleted, "mView", viewParent}, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
                        if (objOnWarmupCompleted instanceof View) {
                            int i4 = IAuthTabCallback + 3;
                            onNavigationEvent = i4 % 128;
                            int i5 = i4 % 2;
                            view = (View) objOnWarmupCompleted;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            int i6 = onNavigationEvent + 19;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            if (view.isShown()) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                int i8 = iArr[0];
                                arrayList.add(new IAuthTabCallback(view, new Rect(i8, iArr[1], view.getMeasuredWidth() + i8, iArr[1] + view.getMeasuredHeight()), list2.get(i2)));
                            }
                        }
                    }
                } else if (list2.get(i2).type == 1) {
                }
            }
            i2++;
            int i9 = onNavigationEvent + 51;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new onWarmupCompleted());
        }
        return arrayList;
    }

    private final Object onExtraCallbackWithResult(String str, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, str, obj}, iOnWarmupCompleted, -755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 755389370, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted());
    }

    private final boolean IAuthTabCallbackStub() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return ((Boolean) onWarmupCompleted(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted, 1094500129, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1094500128, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).booleanValue();
    }
}
