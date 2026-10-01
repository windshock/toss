package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import im.toss.core.security.CryptoStringAdapter;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCEyeBlink {
    private static int IAuthTabCallback = 1;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static final Gson onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final ALCEyeBlink onWarmupCompleted;

    private ALCEyeBlink() {
    }

    static {
        ALCEyeBlink aLCEyeBlink = new ALCEyeBlink();
        onWarmupCompleted = aLCEyeBlink;
        Gson gsonCreate = aLCEyeBlink.onExtraCallbackWithResult().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "");
        onExtraCallbackWithResult = gsonCreate;
        int i = IAuthTabCallback + 57;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Deprecated
    public final GsonBuilder onExtraCallbackWithResult() {
        int i = 2 % 2;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Class.forName("o.BaseRoundCornerProgressBar1"), new CryptoStringAdapter());
        int i2 = asInterface + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return gsonBuilder;
    }

    @Deprecated
    @JvmStatic
    public static final Gson onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Gson gson = onExtraCallbackWithResult;
        int i5 = i2 + 81;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return gson;
    }

    @Deprecated
    public final JsonElement onExtraCallbackWithResult(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonElement string = JsonParser.parseString(onExtraCallbackWithResult.toJson(obj));
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i4 = onExtraCallback + 11;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }
}
