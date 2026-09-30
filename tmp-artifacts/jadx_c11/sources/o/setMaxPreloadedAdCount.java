package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GLUtilsProgram2D;
import o.getSurfaceSize;
import o.setMaxPreloadedAdCount;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setMaxPreloadedAdCount extends checkGlErrorOrThrow {
    public static final onWarmupCompleted Companion;
    private static final Lazy<getSurfaceSize> IAuthTabCallback;
    private static final setMaxPreloadedAdCount IAuthTabCallbackDefault;
    private static final setMaxPreloadedAdCount IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100;
    private static final setMaxPreloadedAdCount asInterface;
    private static final setMaxPreloadedAdCount onExtraCallback;
    private static final setMaxPreloadedAdCount onExtraCallbackWithResult;
    private static final setMaxPreloadedAdCount onNavigationEvent;
    private static final setMaxPreloadedAdCount onTransact;
    private static final setMaxPreloadedAdCount onWarmupCompleted;
    private final GraphicDeviceInfo asBinder;

    public static /* synthetic */ getSurfaceSize onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return access000();
        }
        access000();
        throw null;
    }

    public static final /* synthetic */ setMaxPreloadedAdCount IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        setMaxPreloadedAdCount setmaxpreloadedadcount = onWarmupCompleted;
        int i5 = i2 + 71;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return setmaxpreloadedadcount;
    }

    public static final /* synthetic */ Lazy IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 105;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Lazy<getSurfaceSize> lazy = IAuthTabCallback;
        int i5 = i3 + 43;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return lazy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setMaxPreloadedAdCount asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 107;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        setMaxPreloadedAdCount setmaxpreloadedadcount = IAuthTabCallbackDefault;
        int i5 = i2 + 41;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return setmaxpreloadedadcount;
    }

    public static final /* synthetic */ setMaxPreloadedAdCount asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        setMaxPreloadedAdCount setmaxpreloadedadcount = IAuthTabCallbackStub;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return setmaxpreloadedadcount;
    }

    public static final /* synthetic */ setMaxPreloadedAdCount onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        setMaxPreloadedAdCount setmaxpreloadedadcount = asInterface;
        int i5 = i3 + 69;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return setmaxpreloadedadcount;
        }
        throw null;
    }

    public GraphicDeviceInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GraphicDeviceInfo graphicDeviceInfo = this.asBinder;
        int i4 = i2 + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return graphicDeviceInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMaxPreloadedAdCount(@NotNull GraphicDeviceInfo graphicDeviceInfo) {
        super(GLUtils3.Companion.onExtraCallbackWithResult(), new getMaxPreloadedAdCount(graphicDeviceInfo.IAuthTabCallbackStub()), new GLUtilsProgram2D.onWarmupCompleted(new GLUtilsProgram2D.IAuthTabCallback[0]), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(graphicDeviceInfo, "");
        this.asBinder = graphicDeviceInfo;
    }

    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            use.Companion.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted = use.Companion.onWarmupCompleted();
        int i3 = IAuthTabCallbackStubProxy + 79;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return iOnWarmupCompleted;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final setMaxPreloadedAdCount IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setMaxPreloadedAdCount setmaxpreloadedadcountAsBinder = setMaxPreloadedAdCount.asBinder();
            int i4 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setmaxpreloadedadcountAsBinder;
        }

        public final setMaxPreloadedAdCount onNavigationEvent() {
            setMaxPreloadedAdCount setmaxpreloadedadcountOnTransact;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                setmaxpreloadedadcountOnTransact = setMaxPreloadedAdCount.onTransact();
                int i3 = 61 / 0;
            } else {
                setmaxpreloadedadcountOnTransact = setMaxPreloadedAdCount.onTransact();
            }
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return setmaxpreloadedadcountOnTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final setMaxPreloadedAdCount onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setMaxPreloadedAdCount setmaxpreloadedadcountAsInterface = setMaxPreloadedAdCount.asInterface();
            int i4 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return setmaxpreloadedadcountAsInterface;
        }

        public final setMaxPreloadedAdCount onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setMaxPreloadedAdCount setmaxpreloadedadcountIAuthTabCallbackDefault = setMaxPreloadedAdCount.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return setmaxpreloadedadcountIAuthTabCallbackDefault;
        }

        public final getSurfaceSize onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            getSurfaceSize getsurfacesize = (getSurfaceSize) setMaxPreloadedAdCount.IAuthTabCallbackStub().getValue();
            int i4 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return getsurfacesize;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        onTransact = new setMaxPreloadedAdCount(isrepeatingenabled.IAuthTabCallbackDefault());
        IAuthTabCallbackDefault = new setMaxPreloadedAdCount(isrepeatingenabled.asBinder());
        asInterface = new setMaxPreloadedAdCount(isrepeatingenabled.onTransact());
        IAuthTabCallbackStub = new setMaxPreloadedAdCount(isrepeatingenabled.IAuthTabCallbackStub());
        onWarmupCompleted = new setMaxPreloadedAdCount(isrepeatingenabled.onExtraCallbackWithResult());
        onExtraCallback = new setMaxPreloadedAdCount(isrepeatingenabled.onWarmupCompleted());
        onExtraCallbackWithResult = new setMaxPreloadedAdCount(isrepeatingenabled.onNavigationEvent());
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        onNavigationEvent = new setMaxPreloadedAdCount((GraphicDeviceInfo) isRepeatingEnabled.IAuthTabCallback(new Object[]{isrepeatingenabled}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1916068508, iOnNavigationEvent, 1916068508));
        IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.compose.foundation.font.TdsFont$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 105;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                getSurfaceSize getsurfacesizeOnExtraCallback = setMaxPreloadedAdCount.onExtraCallback();
                if (i3 == 0) {
                    int i4 = 36 / 0;
                }
                return getsurfacesizeOnExtraCallback;
            }
        });
        int i = access100 + 107;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static final getSurfaceSize access000() {
        int i = 2 % 2;
        List<GraphicDeviceInfo> listAsInterface = isRepeatingEnabled.onExtraCallback.asInterface();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsInterface, 10));
        Iterator<T> it = listAsInterface.iterator();
        while (it.hasNext()) {
            arrayList.add(new setMaxPreloadedAdCount((GraphicDeviceInfo) it.next()));
            int i2 = IAuthTabCallbackStubProxy + 25;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        return querySurface.onExtraCallbackWithResult(arrayList);
    }
}
