package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import o.TombstoneProtosThreadBuilder;
import o.TombstoneProtosThreadOrBuilder;
import o.access4200;
import o.access4400;
import o.access4700;
import o.access4800;
import o.getUnreadableElfFilesBytes;
import o.getUnreadableElfFilesCount;
import o.getUnreadableElfFilesList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RangesKt__RangesKt {
    public static final <T extends Comparable<? super T>> getUnreadableElfFilesCount<T> rangeTo(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return new TombstoneProtosThreadOrBuilder(t, t2);
    }

    public static final <T extends Comparable<? super T>> access4700<T> rangeUntil(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return new access4200(t, t2);
    }

    public static getUnreadableElfFilesList<Double> rangeTo(double d, double d2) {
        return new TombstoneProtosThreadBuilder(d, d2);
    }

    public static final access4700<Double> rangeUntil(double d, double d2) {
        return new access4800(d, d2);
    }

    public static getUnreadableElfFilesList<Float> rangeTo(float f, float f2) {
        return new getUnreadableElfFilesBytes(f, f2);
    }

    public static access4700<Float> rangeUntil(float f, float f2) {
        return new access4400(f, f2);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;R::Lo/getUnreadableElfFilesCount<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(getUnreadableElfFilesCount getunreadableelffilescount, Comparable comparable) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return comparable != null && getunreadableelffilescount.contains(comparable);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo/getUnreadableElfFilesCount<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @Deprecated
    @DeprecatedSinceKotlin
    private static final /* synthetic */ boolean contains(getUnreadableElfFilesCount getunreadableelffilescount, Object obj) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return obj != null && getunreadableelffilescount.contains((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;R::Lo/access4700<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(access4700 access4700Var, Comparable comparable) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return comparable != null && access4700Var.contains(comparable);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lo/access4700<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @Deprecated
    @DeprecatedSinceKotlin
    private static final /* synthetic */ boolean contains(access4700 access4700Var, Object obj) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return obj != null && access4700Var.contains((Comparable) obj);
    }

    public static final void checkStepIsPositive(boolean z, @NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
