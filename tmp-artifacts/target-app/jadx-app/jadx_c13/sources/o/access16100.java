package o;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access16100 {
    private final File IAuthTabCallback;
    private final List<File> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access16100)) {
            return false;
        }
        access16100 access16100Var = (access16100) obj;
        return Intrinsics.areEqual(this.IAuthTabCallback, access16100Var.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, access16100Var.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.IAuthTabCallback + ", segments=" + this.onExtraCallbackWithResult + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public access16100(@NotNull File file, @NotNull List<? extends File> list) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = file;
        this.onExtraCallbackWithResult = list;
    }

    public final File IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final List<File> onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final boolean onExtraCallbackWithResult() {
        String path = this.IAuthTabCallback.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        return path.length() > 0;
    }

    public final int onExtraCallback() {
        return this.onExtraCallbackWithResult.size();
    }

    public final File IAuthTabCallback(int i, int i2) {
        if (i < 0 || i > i2 || i2 > onExtraCallback()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.onExtraCallbackWithResult.subList(i, i2);
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return new File(CollectionsKt___CollectionsKt.joinToString$default(listSubList, str, null, null, 0, null, null, 62, null));
    }
}
