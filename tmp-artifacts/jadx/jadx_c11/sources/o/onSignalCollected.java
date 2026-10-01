package o;

import android.content.Context;
import im.toss.rn.toss.core.legacy.bundle.v2.TossReactBundleCache$;
import java.io.File;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onSignalCollected {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final r8lambda8mviLOQqqUbMmgyt26CXIocfr8 onNavigationEvent;

    static {
        int i = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ File onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        File fileOnExtraCallback = onExtraCallback(context);
        int i4 = IAuthTabCallback + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return fileOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public onSignalCollected(@NotNull r8lambda8mviLOQqqUbMmgyt26CXIocfr8 r8lambda8mviloqqqubmmgyt26cxiocfr8) {
        Intrinsics.checkNotNullParameter(r8lambda8mviloqqqubmmgyt26cxiocfr8, "");
        this.onNavigationEvent = r8lambda8mviloqqqubmmgyt26cxiocfr8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public onSignalCollected(@NotNull Context context) {
        this((r8lambda8mviLOQqqUbMmgyt26CXIocfr8) new TossReactBundleCache$.ExternalSyntheticLambda0(context));
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static final File onExtraCallback(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return cacheDir;
        }
        obj.hashCode();
        throw null;
    }

    private final File onExtraCallbackWithResult() {
        int i = 2 % 2;
        File file = new File(this.onNavigationEvent.get(), "toss_react_bundle_cache");
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return file;
        }
        throw null;
    }

    public final File onNavigationEvent(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String lowerCase2 = str2.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        File fileOnExtraCallbackWithResult = onExtraCallbackWithResult(new File(new File(onExtraCallbackWithResult(), lowerCase), lowerCase2));
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return fileOnExtraCallbackWithResult;
    }

    public final File onWarmupCompleted() {
        File fileOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            fileOnExtraCallbackWithResult = onExtraCallbackWithResult(onExtraCallbackWithResult());
            int i3 = 81 / 0;
        } else {
            fileOnExtraCallbackWithResult = onExtraCallbackWithResult(onExtraCallbackWithResult());
        }
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return fileOnExtraCallbackWithResult;
        }
        throw null;
    }

    private final File onExtraCallbackWithResult(File file) {
        int i = 2 % 2;
        if (!file.exists()) {
            int i2 = IAuthTabCallback + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            file.mkdirs();
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
        }
        int i5 = onExtraCallback + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
