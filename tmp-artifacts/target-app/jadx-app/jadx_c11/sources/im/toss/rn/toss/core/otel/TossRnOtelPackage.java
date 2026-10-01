package im.toss.rn.toss.core.otel;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossRnOtelPackage extends BaseReactPackage {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = onExtraCallbackWithResult + 101;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Map onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map mapIAuthTabCallback = IAuthTabCallback();
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return mapIAuthTabCallback;
    }

    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        if (!Intrinsics.areEqual(str, NativeTossRnOtelModuleSpec.NAME)) {
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        TossRnOtelModuleImpl tossRnOtelModuleImpl = new TossRnOtelModuleImpl(reactApplicationContext);
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tossRnOtelModuleImpl;
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        int i = 2 % 2;
        ReactModuleInfoProvider reactModuleInfoProvider = new ReactModuleInfoProvider() { // from class: im.toss.rn.toss.core.otel.TossRnOtelPackage$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Map getReactModuleInfos() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 35;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Map mapOnNavigationEvent = TossRnOtelPackage.onNavigationEvent();
                int i5 = onExtraCallback + 105;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return mapOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return reactModuleInfoProvider;
    }

    private static final Map IAuthTabCallback() {
        int i = 2 % 2;
        String name = TossRnOtelModuleImpl.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        Map mapOnNavigationEvent = access8100.onNavigationEvent(getWrite.IAuthTabCallback(NativeTossRnOtelModuleSpec.NAME, new ReactModuleInfo(NativeTossRnOtelModuleSpec.NAME, name, false, false, false, true)));
        int i2 = IAuthTabCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return mapOnNavigationEvent;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
