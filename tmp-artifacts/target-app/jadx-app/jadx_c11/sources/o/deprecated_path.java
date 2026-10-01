package o;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Deprecated;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface deprecated_path {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    void IAuthTabCallback();

    void IAuthTabCallback(@NotNull String str, float f);

    void IAuthTabCallback(@NotNull String str, @NotNull int[] iArr);

    void onExtraCallback();

    String onExtraCallbackWithResult();

    void onExtraCallbackWithResult(@NotNull String str, int i);

    void onExtraCallbackWithResult(@NotNull String str, @NotNull createSeekController createseekcontroller);

    void onExtraCallbackWithResult(@NotNull deprecated_persistent deprecated_persistentVar);

    @Deprecated
    void onNavigationEvent();

    void onWarmupCompleted(@NotNull String str, int i);

    void onWarmupCompleted(@NotNull String str, @NotNull excludeChildren excludechildren);

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onExtraCallback + 117;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallback() {
        }

        private final String onWarmupCompleted(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iLastIndexOf$default = StringsKt.lastIndexOf$default(str, ".", 0, false, 6, (Object) null);
            if (iLastIndexOf$default == -1) {
                return str;
            }
            int i4 = onNavigationEvent + 11;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            String strSubstring = str.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }

        private final String onExtraCallbackWithResult(InputStream inputStream) throws IOException {
            int i = 2 % 2;
            String text = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
            inputStream.close();
            int i2 = IAuthTabCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return text;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final deprecated_path onExtraCallback(@NotNull AssetManager assetManager, @NotNull String str, @NotNull String str2) throws IOException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(assetManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String strOnWarmupCompleted = onWarmupCompleted(str);
            InputStream inputStreamOpen = assetManager.open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(inputStreamOpen);
            InputStream inputStreamOpen2 = assetManager.open(str2);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen2, "");
            accessgetDAY_OF_MONTH_PATTERNcp accessgetday_of_month_patterncp = new accessgetDAY_OF_MONTH_PATTERNcp(strOnWarmupCompleted, strOnExtraCallbackWithResult, onExtraCallbackWithResult(inputStreamOpen2));
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return accessgetday_of_month_patterncp;
        }

        public final deprecated_path onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            accessgetDAY_OF_MONTH_PATTERNcp accessgetday_of_month_patterncp = new accessgetDAY_OF_MONTH_PATTERNcp(str, str2, str3);
            int i2 = IAuthTabCallback + 13;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return accessgetday_of_month_patterncp;
            }
            throw null;
        }

        public final deprecated_path IAuthTabCallback(@NotNull AssetManager assetManager, @NotNull String str) throws IOException {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(assetManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            InputStream inputStreamOpen = assetManager.open("shader/simple_quad.vert");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            accessgetDAY_OF_MONTH_PATTERNcp accessgetday_of_month_patterncp = new accessgetDAY_OF_MONTH_PATTERNcp("simple_quad", onExtraCallbackWithResult(inputStreamOpen), str);
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return accessgetday_of_month_patterncp;
            }
            throw null;
        }
    }
}
