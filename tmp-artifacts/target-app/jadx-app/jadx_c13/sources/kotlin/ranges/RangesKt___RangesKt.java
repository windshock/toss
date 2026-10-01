package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.IntProgression;
import o.access4100;
import o.access4500;
import o.access4700;
import o.getRegistersOrBuilderList;
import o.getUnreadableElfFiles;
import o.getUnreadableElfFilesCount;
import o.getUnreadableElfFilesList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final int first(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getFirst();
    }

    public static final long first(@NotNull access4100 access4100Var) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        if (access4100Var.isEmpty()) {
            throw new NoSuchElementException("Progression " + access4100Var + " is empty.");
        }
        return access4100Var.onNavigationEvent();
    }

    public static final char first(@NotNull getRegistersOrBuilderList getregistersorbuilderlist) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        if (getregistersorbuilderlist.isEmpty()) {
            throw new NoSuchElementException("Progression " + getregistersorbuilderlist + " is empty.");
        }
        return getregistersorbuilderlist.IAuthTabCallback();
    }

    public static final Integer firstOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    public static final Long firstOrNull(@NotNull access4100 access4100Var) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        if (access4100Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(access4100Var.onNavigationEvent());
    }

    public static final Character firstOrNull(@NotNull getRegistersOrBuilderList getregistersorbuilderlist) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        if (getregistersorbuilderlist.isEmpty()) {
            return null;
        }
        return Character.valueOf(getregistersorbuilderlist.IAuthTabCallback());
    }

    public static final int last(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + intProgression + " is empty.");
        }
        return intProgression.getLast();
    }

    public static final long last(@NotNull access4100 access4100Var) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        if (access4100Var.isEmpty()) {
            throw new NoSuchElementException("Progression " + access4100Var + " is empty.");
        }
        return access4100Var.IAuthTabCallback();
    }

    public static final char last(@NotNull getRegistersOrBuilderList getregistersorbuilderlist) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        if (getregistersorbuilderlist.isEmpty()) {
            throw new NoSuchElementException("Progression " + getregistersorbuilderlist + " is empty.");
        }
        return getregistersorbuilderlist.onNavigationEvent();
    }

    public static final Integer lastOrNull(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    public static final Long lastOrNull(@NotNull access4100 access4100Var) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        if (access4100Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(access4100Var.IAuthTabCallback());
    }

    public static final Character lastOrNull(@NotNull getRegistersOrBuilderList getregistersorbuilderlist) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        if (getregistersorbuilderlist.isEmpty()) {
            return null;
        }
        return Character.valueOf(getregistersorbuilderlist.onNavigationEvent());
    }

    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return random(intRange, Random.onNavigationEvent);
    }

    private static final long random(access4500 access4500Var) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return random(access4500Var, Random.onNavigationEvent);
    }

    private static final char random(getUnreadableElfFiles getunreadableelffiles) {
        Intrinsics.checkNotNullParameter(getunreadableelffiles, "");
        return random(getunreadableelffiles, Random.onNavigationEvent);
    }

    public static int random(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return RandomKt.onNavigationEvent(random, intRange);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static long random(@NotNull access4500 access4500Var, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return RandomKt.onWarmupCompleted(random, access4500Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final char random(@NotNull getUnreadableElfFiles getunreadableelffiles, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(getunreadableelffiles, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return (char) random.onExtraCallback((int) getunreadableelffiles.IAuthTabCallback(), getunreadableelffiles.onNavigationEvent() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return randomOrNull(intRange, Random.onNavigationEvent);
    }

    private static final Long randomOrNull(access4500 access4500Var) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return randomOrNull(access4500Var, Random.onNavigationEvent);
    }

    private static final Character randomOrNull(getUnreadableElfFiles getunreadableelffiles) {
        Intrinsics.checkNotNullParameter(getunreadableelffiles, "");
        return randomOrNull(getunreadableelffiles, Random.onNavigationEvent);
    }

    public static final Integer randomOrNull(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(intRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.onNavigationEvent(random, intRange));
    }

    public static final Long randomOrNull(@NotNull access4500 access4500Var, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (access4500Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.onWarmupCompleted(random, access4500Var));
    }

    public static final Character randomOrNull(@NotNull getUnreadableElfFiles getunreadableelffiles, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(getunreadableelffiles, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (getunreadableelffiles.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.onExtraCallback((int) getunreadableelffiles.IAuthTabCallback(), getunreadableelffiles.onNavigationEvent() + 1));
    }

    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return num != null && intRange.contains(num.intValue());
    }

    private static final boolean contains(access4500 access4500Var, Long l) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return l != null && access4500Var.onExtraCallback(l.longValue());
    }

    private static final boolean contains(getUnreadableElfFiles getunreadableelffiles, Character ch) {
        Intrinsics.checkNotNullParameter(getunreadableelffiles, "");
        return ch != null && getunreadableelffiles.onNavigationEvent(ch.charValue());
    }

    public static final boolean intRangeContains(@NotNull getUnreadableElfFilesCount<Integer> getunreadableelffilescount, byte b) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Integer.valueOf(b));
    }

    public static final boolean longRangeContains(@NotNull getUnreadableElfFilesCount<Long> getunreadableelffilescount, byte b) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Long.valueOf(b));
    }

    public static final boolean shortRangeContains(@NotNull getUnreadableElfFilesCount<Short> getunreadableelffilescount, byte b) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Short.valueOf(b));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean doubleRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, byte b) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Double.valueOf(b));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean floatRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, byte b) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Float.valueOf(b));
    }

    public static final boolean intRangeContains(@NotNull access4700<Integer> access4700Var, byte b) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Integer.valueOf(b));
    }

    public static final boolean longRangeContains(@NotNull access4700<Long> access4700Var, byte b) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Long.valueOf(b));
    }

    public static final boolean shortRangeContains(@NotNull access4700<Short> access4700Var, byte b) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Short.valueOf(b));
    }

    private static final boolean contains(IntRange intRange, byte b) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRangeContains((getUnreadableElfFilesCount<Integer>) intRange, b);
    }

    private static final boolean contains(access4500 access4500Var, byte b) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return longRangeContains((getUnreadableElfFilesCount<Long>) access4500Var, b);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean intRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, double d) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Integer intExactOrNull = toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return getunreadableelffilescount.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean longRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, double d) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Long longExactOrNull = toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return getunreadableelffilescount.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean byteRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, double d) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Byte byteExactOrNull = toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return getunreadableelffilescount.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean shortRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, double d) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Short shortExactOrNull = toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return getunreadableelffilescount.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean floatRangeContains(@NotNull getUnreadableElfFilesCount<Float> getunreadableelffilescount, double d) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Float.valueOf((float) d));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean intRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, float f) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Integer intExactOrNull = toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return getunreadableelffilescount.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean longRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, float f) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Long longExactOrNull = toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return getunreadableelffilescount.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean byteRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, float f) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Byte byteExactOrNull = toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return getunreadableelffilescount.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean shortRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, float f) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Short shortExactOrNull = toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return getunreadableelffilescount.contains(shortExactOrNull);
        }
        return false;
    }

    public static final boolean doubleRangeContains(@NotNull getUnreadableElfFilesCount<Double> getunreadableelffilescount, float f) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Double.valueOf(f));
    }

    public static final boolean doubleRangeContains(@NotNull access4700<Double> access4700Var, float f) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Double.valueOf(f));
    }

    public static final boolean longRangeContains(@NotNull getUnreadableElfFilesCount<Long> getunreadableelffilescount, int i) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Long.valueOf(i));
    }

    public static final boolean byteRangeContains(@NotNull getUnreadableElfFilesCount<Byte> getunreadableelffilescount, int i) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return getunreadableelffilescount.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(@NotNull getUnreadableElfFilesCount<Short> getunreadableelffilescount, int i) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return getunreadableelffilescount.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean doubleRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, int i) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Double.valueOf(i));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean floatRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, int i) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Float.valueOf(i));
    }

    public static final boolean longRangeContains(@NotNull access4700<Long> access4700Var, int i) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Long.valueOf(i));
    }

    public static final boolean byteRangeContains(@NotNull access4700<Byte> access4700Var, int i) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return access4700Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(@NotNull access4700<Short> access4700Var, int i) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return access4700Var.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(access4500 access4500Var, int i) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return longRangeContains((getUnreadableElfFilesCount<Long>) access4500Var, i);
    }

    public static final boolean intRangeContains(@NotNull getUnreadableElfFilesCount<Integer> getunreadableelffilescount, long j) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return getunreadableelffilescount.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(@NotNull getUnreadableElfFilesCount<Byte> getunreadableelffilescount, long j) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return getunreadableelffilescount.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(@NotNull getUnreadableElfFilesCount<Short> getunreadableelffilescount, long j) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return getunreadableelffilescount.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean doubleRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, long j) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Double.valueOf(j));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean floatRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, long j) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Float.valueOf(j));
    }

    public static final boolean intRangeContains(@NotNull access4700<Integer> access4700Var, long j) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return access4700Var.contains(intExactOrNull);
        }
        return false;
    }

    public static final boolean byteRangeContains(@NotNull access4700<Byte> access4700Var, long j) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return access4700Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static final boolean shortRangeContains(@NotNull access4700<Short> access4700Var, long j) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return access4700Var.contains(shortExactOrNull);
        }
        return false;
    }

    private static final boolean contains(IntRange intRange, long j) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRangeContains((getUnreadableElfFilesCount<Integer>) intRange, j);
    }

    public static final boolean intRangeContains(@NotNull getUnreadableElfFilesCount<Integer> getunreadableelffilescount, short s) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Integer.valueOf(s));
    }

    public static final boolean longRangeContains(@NotNull getUnreadableElfFilesCount<Long> getunreadableelffilescount, short s) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Long.valueOf(s));
    }

    public static final boolean byteRangeContains(@NotNull getUnreadableElfFilesCount<Byte> getunreadableelffilescount, short s) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return getunreadableelffilescount.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean doubleRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, short s) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Double.valueOf(s));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ boolean floatRangeContains(getUnreadableElfFilesCount getunreadableelffilescount, short s) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        return getunreadableelffilescount.contains(Float.valueOf(s));
    }

    public static final boolean intRangeContains(@NotNull access4700<Integer> access4700Var, short s) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Integer.valueOf(s));
    }

    public static final boolean longRangeContains(@NotNull access4700<Long> access4700Var, short s) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        return access4700Var.contains(Long.valueOf(s));
    }

    public static final boolean byteRangeContains(@NotNull access4700<Byte> access4700Var, short s) {
        Intrinsics.checkNotNullParameter(access4700Var, "");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return access4700Var.contains(byteExactOrNull);
        }
        return false;
    }

    private static final boolean contains(IntRange intRange, short s) {
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRangeContains((getUnreadableElfFilesCount<Integer>) intRange, s);
    }

    private static final boolean contains(access4500 access4500Var, short s) {
        Intrinsics.checkNotNullParameter(access4500Var, "");
        return longRangeContains((getUnreadableElfFilesCount<Long>) access4500Var, s);
    }

    public static final IntProgression downTo(int i, byte b) {
        return IntProgression.Companion.onExtraCallback(i, b, -1);
    }

    public static final access4100 downTo(long j, byte b) {
        return access4100.Companion.onNavigationEvent(j, b, -1L);
    }

    public static final IntProgression downTo(byte b, byte b2) {
        return IntProgression.Companion.onExtraCallback(b, b2, -1);
    }

    public static final IntProgression downTo(short s, byte b) {
        return IntProgression.Companion.onExtraCallback(s, b, -1);
    }

    public static final getRegistersOrBuilderList downTo(char c, char c2) {
        return getRegistersOrBuilderList.Companion.onNavigationEvent(c, c2, -1);
    }

    public static IntProgression downTo(int i, int i2) {
        return IntProgression.Companion.onExtraCallback(i, i2, -1);
    }

    public static access4100 downTo(long j, int i) {
        return access4100.Companion.onNavigationEvent(j, i, -1L);
    }

    public static final IntProgression downTo(byte b, int i) {
        return IntProgression.Companion.onExtraCallback(b, i, -1);
    }

    public static final IntProgression downTo(short s, int i) {
        return IntProgression.Companion.onExtraCallback(s, i, -1);
    }

    public static final access4100 downTo(int i, long j) {
        return access4100.Companion.onNavigationEvent(i, j, -1L);
    }

    public static final access4100 downTo(long j, long j2) {
        return access4100.Companion.onNavigationEvent(j, j2, -1L);
    }

    public static final access4100 downTo(byte b, long j) {
        return access4100.Companion.onNavigationEvent(b, j, -1L);
    }

    public static final access4100 downTo(short s, long j) {
        return access4100.Companion.onNavigationEvent(s, j, -1L);
    }

    public static final IntProgression downTo(int i, short s) {
        return IntProgression.Companion.onExtraCallback(i, s, -1);
    }

    public static final access4100 downTo(long j, short s) {
        return access4100.Companion.onNavigationEvent(j, s, -1L);
    }

    public static final IntProgression downTo(byte b, short s) {
        return IntProgression.Companion.onExtraCallback(b, s, -1);
    }

    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.Companion.onExtraCallback(s, s2, -1);
    }

    public static IntProgression reversed(@NotNull IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        return IntProgression.Companion.onExtraCallback(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static access4100 reversed(@NotNull access4100 access4100Var) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        return access4100.Companion.onNavigationEvent(access4100Var.IAuthTabCallback(), access4100Var.onNavigationEvent(), -access4100Var.onExtraCallback());
    }

    public static final getRegistersOrBuilderList reversed(@NotNull getRegistersOrBuilderList getregistersorbuilderlist) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        return getRegistersOrBuilderList.Companion.onNavigationEvent(getregistersorbuilderlist.onNavigationEvent(), getregistersorbuilderlist.IAuthTabCallback(), -getregistersorbuilderlist.onExtraCallbackWithResult());
    }

    public static IntProgression step(@NotNull IntProgression intProgression, int i) {
        Intrinsics.checkNotNullParameter(intProgression, "");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        IntProgression.onExtraCallbackWithResult onextracallbackwithresult = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return onextracallbackwithresult.onExtraCallback(first, last, i);
    }

    public static access4100 step(@NotNull access4100 access4100Var, long j) {
        Intrinsics.checkNotNullParameter(access4100Var, "");
        RangesKt__RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        access4100.onNavigationEvent onnavigationevent = access4100.Companion;
        long jOnNavigationEvent = access4100Var.onNavigationEvent();
        long jIAuthTabCallback = access4100Var.IAuthTabCallback();
        if (access4100Var.onExtraCallback() <= 0) {
            j = -j;
        }
        return onnavigationevent.onNavigationEvent(jOnNavigationEvent, jIAuthTabCallback, j);
    }

    public static final getRegistersOrBuilderList step(@NotNull getRegistersOrBuilderList getregistersorbuilderlist, int i) {
        Intrinsics.checkNotNullParameter(getregistersorbuilderlist, "");
        RangesKt__RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        getRegistersOrBuilderList.onWarmupCompleted onwarmupcompleted = getRegistersOrBuilderList.Companion;
        char cIAuthTabCallback = getregistersorbuilderlist.IAuthTabCallback();
        char cOnNavigationEvent = getregistersorbuilderlist.onNavigationEvent();
        if (getregistersorbuilderlist.onExtraCallbackWithResult() <= 0) {
            i = -i;
        }
        return onwarmupcompleted.onNavigationEvent(cIAuthTabCallback, cOnNavigationEvent, i);
    }

    public static final Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i);
    }

    public static final Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j);
    }

    public static final Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s);
    }

    public static final Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    public static final Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    public static final Integer toIntExactOrNull(long j) {
        if (-2147483648L > j || j >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    public static final Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    public static final Integer toIntExactOrNull(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    public static final Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    public static final Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    public static final Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return Short.valueOf((short) i);
    }

    public static final Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= 32768) {
            return null;
        }
        return Short.valueOf((short) j);
    }

    public static final Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    public static final Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    public static final IntRange until(int i, byte b) {
        return new IntRange(i, b - 1);
    }

    public static final access4500 until(long j, byte b) {
        return new access4500(j, b - 1);
    }

    public static final IntRange until(byte b, byte b2) {
        return new IntRange(b, b2 - 1);
    }

    public static final IntRange until(short s, byte b) {
        return new IntRange(s, b - 1);
    }

    public static final getUnreadableElfFiles until(char c, char c2) {
        return Intrinsics.compare((int) c2, 0) <= 0 ? getUnreadableElfFiles.Companion.onExtraCallbackWithResult() : new getUnreadableElfFiles(c, (char) (c2 - 1));
    }

    public static IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.Companion.IAuthTabCallback();
        }
        return new IntRange(i, i2 - 1);
    }

    public static final access4500 until(long j, int i) {
        return new access4500(j, i - 1);
    }

    public static final IntRange until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.Companion.IAuthTabCallback();
        }
        return new IntRange(b, i - 1);
    }

    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.Companion.IAuthTabCallback();
        }
        return new IntRange(s, i - 1);
    }

    public static final access4500 until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return access4500.Companion.onNavigationEvent();
        }
        return new access4500(i, j - 1);
    }

    public static access4500 until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return access4500.Companion.onNavigationEvent();
        }
        return new access4500(j, j2 - 1);
    }

    public static final access4500 until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return access4500.Companion.onNavigationEvent();
        }
        return new access4500(b, j - 1);
    }

    public static final access4500 until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return access4500.Companion.onNavigationEvent();
        }
        return new access4500(s, j - 1);
    }

    public static final IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    public static final access4500 until(long j, short s) {
        return new access4500(j, s - 1);
    }

    public static final IntRange until(byte b, short s) {
        return new IntRange(b, s - 1);
    }

    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    public static <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    public static <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        Intrinsics.checkNotNullParameter(t, "");
        if (t2 != null && t3 != null) {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull getUnreadableElfFilesList<T> getunreadableelffileslist) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(getunreadableelffileslist, "");
        if (!getunreadableelffileslist.isEmpty()) {
            return (!getunreadableelffileslist.IAuthTabCallback(t, getunreadableelffileslist.getStart()) || getunreadableelffileslist.IAuthTabCallback(getunreadableelffileslist.getStart(), t)) ? (!getunreadableelffileslist.IAuthTabCallback(getunreadableelffileslist.getEndInclusive(), t) || getunreadableelffileslist.IAuthTabCallback(t, getunreadableelffileslist.getEndInclusive())) ? t : getunreadableelffileslist.getEndInclusive() : getunreadableelffileslist.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + getunreadableelffileslist + '.');
    }

    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull getUnreadableElfFilesCount<T> getunreadableelffilescount) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        if (getunreadableelffilescount instanceof getUnreadableElfFilesList) {
            return (T) coerceIn((Comparable) t, (getUnreadableElfFilesList) getunreadableelffilescount);
        }
        if (!getunreadableelffilescount.isEmpty()) {
            return t.compareTo(getunreadableelffilescount.getStart()) < 0 ? (T) getunreadableelffilescount.getStart() : t.compareTo(getunreadableelffilescount.getEndInclusive()) > 0 ? (T) getunreadableelffilescount.getEndInclusive() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + getunreadableelffilescount + '.');
    }

    public static int coerceIn(int i, @NotNull getUnreadableElfFilesCount<Integer> getunreadableelffilescount) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        if (getunreadableelffilescount instanceof getUnreadableElfFilesList) {
            return ((Number) coerceIn(Integer.valueOf(i), (getUnreadableElfFilesList<Integer>) getunreadableelffilescount)).intValue();
        }
        if (!getunreadableelffilescount.isEmpty()) {
            return i < ((Number) getunreadableelffilescount.getStart()).intValue() ? ((Number) getunreadableelffilescount.getStart()).intValue() : i > ((Number) getunreadableelffilescount.getEndInclusive()).intValue() ? ((Number) getunreadableelffilescount.getEndInclusive()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + getunreadableelffilescount + '.');
    }

    public static long coerceIn(long j, @NotNull getUnreadableElfFilesCount<Long> getunreadableelffilescount) {
        Intrinsics.checkNotNullParameter(getunreadableelffilescount, "");
        if (getunreadableelffilescount instanceof getUnreadableElfFilesList) {
            return ((Number) coerceIn(Long.valueOf(j), (getUnreadableElfFilesList<Long>) getunreadableelffilescount)).longValue();
        }
        if (!getunreadableelffilescount.isEmpty()) {
            return j < ((Number) getunreadableelffilescount.getStart()).longValue() ? ((Number) getunreadableelffilescount.getStart()).longValue() : j > ((Number) getunreadableelffilescount.getEndInclusive()).longValue() ? ((Number) getunreadableelffilescount.getEndInclusive()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + getunreadableelffilescount + '.');
    }
}
