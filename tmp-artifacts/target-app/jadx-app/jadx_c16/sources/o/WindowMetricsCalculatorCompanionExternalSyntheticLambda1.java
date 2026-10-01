package o;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import im.toss.assetpack.AssetPackHelper$;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WindowMetricsCalculatorCompanionExternalSyntheticLambda1 {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final Context IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final MulticastConsumer onExtraCallbackWithResult;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final AppSetIdAndScope1 onWarmupCompleted = ea10.onExtraCallbackWithResult("AssetPackHelper");

    public /* synthetic */ WindowMetricsCalculatorCompanionExternalSyntheticLambda1(Context context, MulticastConsumer multicastConsumer, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, multicastConsumer);
    }

    public static /* synthetic */ AssetPackManager onNavigationEvent(WindowMetricsCalculatorCompanionExternalSyntheticLambda1 windowMetricsCalculatorCompanionExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(windowMetricsCalculatorCompanionExternalSyntheticLambda1);
            throw null;
        }
        AssetPackManager assetPackManagerOnExtraCallback = onExtraCallback(windowMetricsCalculatorCompanionExternalSyntheticLambda1);
        int i3 = onNavigationEvent + 7;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return assetPackManagerOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private WindowMetricsCalculatorCompanionExternalSyntheticLambda1(Context context, MulticastConsumer multicastConsumer) {
        this.IAuthTabCallback = context;
        this.onExtraCallbackWithResult = multicastConsumer;
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new AssetPackHelper$.ExternalSyntheticLambda0(this));
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final WindowMetricsCalculatorCompanionExternalSyntheticLambda1 onWarmupCompleted(@NotNull Context context, @NotNull MulticastConsumer multicastConsumer) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(multicastConsumer, "");
            WindowMetricsCalculatorCompanionExternalSyntheticLambda1 windowMetricsCalculatorCompanionExternalSyntheticLambda1 = new WindowMetricsCalculatorCompanionExternalSyntheticLambda1(context, multicastConsumer, null);
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return windowMetricsCalculatorCompanionExternalSyntheticLambda1;
        }
    }

    static {
        int i = asBinder + 13;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return strIAuthTabCallback;
    }

    private final AssetPackManager onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        AssetPackManager assetPackManager = (AssetPackManager) value;
        int i4 = asInterface + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return assetPackManager;
        }
        throw null;
    }

    private static final AssetPackManager onExtraCallback(WindowMetricsCalculatorCompanionExternalSyntheticLambda1 windowMetricsCalculatorCompanionExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AssetPackManager assetPackManagerFactory = AssetPackManagerFactory.getInstance(windowMetricsCalculatorCompanionExternalSyntheticLambda1.IAuthTabCallback);
        int i4 = asInterface + 87;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return assetPackManagerFactory;
    }

    public static /* synthetic */ Uri onExtraCallback(WindowMetricsCalculatorCompanionExternalSyntheticLambda1 windowMetricsCalculatorCompanionExternalSyntheticLambda1, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = asInterface;
            int i4 = i3 + 9;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 87;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        }
        return windowMetricsCalculatorCompanionExternalSyntheticLambda1.onExtraCallbackWithResult(str, z);
    }

    public final Uri onExtraCallbackWithResult(@NotNull String str, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        File fileOnNavigationEvent = onNavigationEvent(this, str, false, 2, null);
        if (fileOnNavigationEvent != null) {
            int i2 = onNavigationEvent + 77;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Uri uriForFile = FileProvider.getUriForFile(this.IAuthTabCallback, zzaj.onNavigationEvent().onUnminimized(), fileOnNavigationEvent);
            if (uriForFile != null) {
                int i4 = asInterface + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return uriForFile;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (z) {
            int i5 = onNavigationEvent + 113;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            if (this.onExtraCallbackWithResult.onExtraCallbackWithResult() != null) {
                return Uri.parse(this.onExtraCallbackWithResult.onExtraCallbackWithResult() + str);
            }
        }
        return null;
    }

    public static /* synthetic */ File onNavigationEvent(WindowMetricsCalculatorCompanionExternalSyntheticLambda1 windowMetricsCalculatorCompanionExternalSyntheticLambda1, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            z = true;
        }
        File fileOnExtraCallback = windowMetricsCalculatorCompanionExternalSyntheticLambda1.onExtraCallback(str, z);
        int i5 = asInterface + 15;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return fileOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r3 = new java.io.File(r1.assetsPath(), r5.onExtraCallbackWithResult.onWarmupCompleted() + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (o.zzaj.onNavigationEvent().onActivityLayout() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r3.exists() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (r7 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r3.exists() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        r6 = o.WindowMetricsCalculatorCompanionExternalSyntheticLambda1.asInterface + 51;
        o.WindowMetricsCalculatorCompanionExternalSyntheticLambda1.onNavigationEvent = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File onExtraCallback(@NotNull String str, boolean z) {
        AssetPackLocation packLocation;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            packLocation = onWarmupCompleted().getPackLocation(onExtraCallbackWithResult());
            int i3 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            packLocation = onWarmupCompleted().getPackLocation(onExtraCallbackWithResult());
        }
    }
}
