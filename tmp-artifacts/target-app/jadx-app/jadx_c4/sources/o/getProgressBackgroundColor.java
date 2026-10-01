package o;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getProgressBackgroundColor implements setOnProgressChangedListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Gson onNavigationEvent;

    public getProgressBackgroundColor(@NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "");
        this.onNavigationEvent = gson;
    }

    public getProgressBackgroundColor() {
        this.onNavigationEvent = new Gson();
    }

    @Override // o.setOnProgressChangedListener
    public <T> T IAuthTabCallback(@Nullable String str, @Nullable Type type) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) this.onNavigationEvent.fromJson(str, type);
        int i4 = onExtraCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return t;
    }

    @Override // o.setOnProgressChangedListener
    public <T> String onWarmupCompleted(T t, @Nullable Type type) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String json = this.onNavigationEvent.toJson(t, type);
        Intrinsics.checkNotNullExpressionValue(json, "");
        int i4 = onExtraCallback + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return json;
    }
}
