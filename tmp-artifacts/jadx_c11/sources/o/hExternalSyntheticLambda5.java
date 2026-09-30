package o;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import im.toss.rn.spec.log.ReactLogKt;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hExternalSyntheticLambda5 extends JSBundleLoader {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final String asInterface;
    private final Context onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Function1<Exception, Unit> onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public hExternalSyntheticLambda5(@Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Function1<? super Exception, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = context;
        this.IAuthTabCallbackStub = str;
        this.onTransact = str2;
        this.asInterface = str3;
        this.onWarmupCompleted = str4;
        this.IAuthTabCallback = str5;
        this.onExtraCallbackWithResult = str6;
        this.onNavigationEvent = function1;
    }

    public String loadScript(@NotNull JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(jSBundleLoaderDelegate, "");
        try {
            if (StringsKt.startsWith$default(this.IAuthTabCallbackStub, "assets://", false, 2, (Object) null)) {
                int i5 = asBinder + 77;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                Context context = this.onExtraCallback;
                AssetManager assets = context != null ? context.getAssets() : null;
                Intrinsics.checkNotNull(assets);
                jSBundleLoaderDelegate.loadScriptFromAssets(assets, this.IAuthTabCallbackStub, false);
                i = asBinder + 51;
                IAuthTabCallbackDefault = i % 128;
            } else {
                String str = this.IAuthTabCallbackStub;
                jSBundleLoaderDelegate.loadScriptFromPathToMemory(str, str, false);
                i = IAuthTabCallbackDefault + 47;
                asBinder = i % 128;
            }
            int i7 = i % 2;
        } catch (Exception e) {
            this.onNavigationEvent.invoke(e);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "EvaluateBundleFailure"), getWrite.IAuthTabCallback("sharedDeploymentId", this.onTransact), getWrite.IAuthTabCallback("serviceDeploymentId", this.IAuthTabCallback), getWrite.IAuthTabCallback("source", this.IAuthTabCallbackStub), getWrite.IAuthTabCallback("throwable", e.getMessage())}), (String) null, false, (String) null, 58, (Object) null);
            ReactLogKt.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.asInterface, this.onTransact);
        }
        return this.IAuthTabCallbackStub;
    }
}
