package o;

import android.content.Context;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class RealImageLoader_androidKt {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    static {
        int i = IAuthTabCallback + 89;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ RealImageLoader_androidKt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean IAuthTabCallback();

    public abstract String onExtraCallbackWithResult();

    private RealImageLoader_androidKt() {
    }

    public static final class onExtraCallback extends RealImageLoader_androidKt {
        private static int IAuthTabCallback = 1;
        private static int asBinder = 1;
        private static int onExtraCallback;
        private static int onWarmupCompleted;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static final String onExtraCallbackWithResult = "d";

        @Override // o.RealImageLoader_androidKt
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        private onExtraCallback() {
            super(null);
        }

        static {
            int i = IAuthTabCallback + 125;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // o.RealImageLoader_androidKt
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 69;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallbackWithResult;
            int i5 = i2 + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class IAuthTabCallback extends RealImageLoader_androidKt {
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
        private static final String onExtraCallback = "p";

        @Override // o.RealImageLoader_androidKt
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 39;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
            return false;
        }

        private IAuthTabCallback() {
            super(null);
        }

        static {
            int i = onNavigationEvent + 97;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        @Override // o.RealImageLoader_androidKt
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = onExtraCallback;
            int i5 = i2 + 77;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return str;
        }
    }

    public static final class onExtraCallbackWithResult extends RealImageLoader_androidKt {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final String onNavigationEvent;
        private final long onWarmupCompleted;

        public onExtraCallbackWithResult(long j) {
            long jCurrentTimeMillis;
            super(null);
            if (j <= 0 || System.currentTimeMillis() + j >= Long.MAX_VALUE) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i = onExtraCallback + 77;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                this.onWarmupCompleted = j;
                jCurrentTimeMillis = System.currentTimeMillis() + j;
            } else {
                this.onWarmupCompleted = j;
                jCurrentTimeMillis = System.currentTimeMillis() + j;
            }
            this.onNavigationEvent = String.valueOf(jCurrentTimeMillis);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = 0L;
            this.onNavigationEvent = str;
        }

        @Override // o.RealImageLoader_androidKt
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.RealImageLoader_androidKt
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (Long.parseLong(this.onNavigationEvent) < System.currentTimeMillis()) {
                return true;
            }
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
    }

    public static final class onNavigationEvent extends RealImageLoader_androidKt {
        public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onTransact = 1;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        static {
            int i = onExtraCallback + 111;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = str2;
        }

        @Override // o.RealImageLoader_androidKt
        public String onExtraCallbackWithResult() {
            int i = 2 % 2;
            String str = "AppVersion-" + IAuthTabCallback(this.onNavigationEvent);
            int i2 = onTransact + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override // o.RealImageLoader_androidKt
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            IAuthTabCallback = i2 % 128;
            boolean zAreEqual = i2 % 2 != 0 ? Intrinsics.areEqual(IAuthTabCallback(this.onWarmupCompleted), IAuthTabCallback(this.onNavigationEvent)) : !Intrinsics.areEqual(IAuthTabCallback(this.onWarmupCompleted), IAuthTabCallback(this.onNavigationEvent));
            int i3 = IAuthTabCallback + 19;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        private final String IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onTransact + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String strReplace$default = StringsKt.replace$default(str, ".", "-", false, 4, (Object) null);
            int i4 = onTransact + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strReplace$default;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class IAuthTabCallback {
            public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IAuthTabCallback() {
            }
        }
    }

    public static final class onWarmupCompleted {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RealImageLoader_androidKt onExtraCallback(@NotNull File file, @NotNull Context context) {
            Object obj;
            String extension;
            RealImageLoader_androidKt onextracallbackwithresult;
            int i;
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            Intrinsics.checkNotNullParameter(context, "");
            try {
                Result.Companion companion = kotlin.Result.Companion;
                extension = FilesKt.getExtension(file);
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (StringsKt.startsWith$default(extension, "AppVersion-", false, 2, (Object) null)) {
                onextracallbackwithresult = new onNavigationEvent(onIconClick.onExtraCallback(context), StringsKt.removePrefix(extension, "AppVersion-"));
                i = onNavigationEvent + 125;
                i2 = i % 128;
            } else {
                if (StringsKt.toLongOrNull(extension) == null) {
                    onextracallbackwithresult = IAuthTabCallback.onExtraCallbackWithResult;
                    if (!Intrinsics.areEqual(extension, onextracallbackwithresult.onExtraCallbackWithResult())) {
                        onextracallbackwithresult = onExtraCallback.onNavigationEvent;
                    }
                    obj = kotlin.Result.constructor-impl(onextracallbackwithresult);
                    onExtraCallback onextracallback = onExtraCallback.onNavigationEvent;
                    if (kotlin.Result.onExtraCallback(obj)) {
                        int i4 = onNavigationEvent + 59;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        obj = onextracallback;
                    }
                    return (RealImageLoader_androidKt) obj;
                }
                onextracallbackwithresult = new onExtraCallbackWithResult(extension);
                i = onNavigationEvent + 19;
                i2 = i % 128;
            }
            onWarmupCompleted = i2;
            int i6 = i % 2;
            obj = kotlin.Result.constructor-impl(onextracallbackwithresult);
            onExtraCallback onextracallback2 = onExtraCallback.onNavigationEvent;
            if (kotlin.Result.onExtraCallback(obj)) {
            }
            return (RealImageLoader_androidKt) obj;
        }
    }
}
