package o;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class newImageLoader {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onExtraCallback;

    public newImageLoader(@NotNull Context context, @NotNull String str) throws Exception {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("key may not be blank");
        }
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String str2 = File.separator;
        this.onExtraCallback = absolutePath + str2 + "file-cache" + str2 + RealImageLoader_jvmCommonKt.onNavigationEvent(str);
        int i = onExtraCallbackWithResult + 33;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final File onExtraCallback() {
        int i = 2 % 2;
        File file = new File(this.onExtraCallback);
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback().mkdirs();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (onExtraCallback().mkdirs()) {
            RealImageLoader_jvmCommonKt.onNavigationEvent();
        }
        int i3 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public final List<File> onNavigationEvent(@NotNull RealImageLoader_nonNativeKt realImageLoader_nonNativeKt) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(realImageLoader_nonNativeKt, "");
        File[] fileArrListFiles = new File(this.onExtraCallback).listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            if (Intrinsics.areEqual(StringsKt.substringBefore$default(name, ".", (String) null, 2, (Object) null), realImageLoader_nonNativeKt.onWarmupCompleted())) {
                int i4 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(file);
                if (i5 == 0) {
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
