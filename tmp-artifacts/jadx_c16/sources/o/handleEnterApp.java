package o;

import androidx.collection.LruCache;
import java.io.File;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class handleEnterApp extends LruCache<String, File> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult((DefaultConstructorMarker) null);
    private static final AppSetIdAndScope1 onExtraCallbackWithResult = ea10.onExtraCallbackWithResult("FileLruCache");

    public static /* synthetic */ int onNavigationEvent(File file, File file2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(file, file2);
            throw null;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(file, file2);
        int i3 = onExtraCallback + 91;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(z, (String) obj, (File) obj2, (File) obj3);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = IAuthTabCallback + 119;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final int onExtraCallbackWithResult(File file, File file2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iCompare = Intrinsics.compare(file.lastModified(), file2.lastModified());
        int i4 = onExtraCallback + 3;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iCompare;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void onNavigationEvent(boolean z, @NotNull String str, @NotNull File file, @Nullable File file2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(file, "");
        file.lastModified();
        Objects.toString(file);
        try {
            Result.Companion companion = Result.Companion;
            Result.constructor-impl(Boolean.valueOf(file.delete()));
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
