package okhttp3.internal.idn;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TTAppOpenAdActivity9;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IdnaMappingTable {
    private final String mappings;
    private final String ranges;
    private final String sections;

    public IdnaMappingTable(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    public final String getSections() {
        return this.sections;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final boolean map(int i, @NotNull TTAppOpenAdActivity9 tTAppOpenAdActivity9) throws IOException {
        Intrinsics.checkNotNullParameter(tTAppOpenAdActivity9, "");
        int iFindSectionsIndex = findSectionsIndex(i);
        int iFindRangesOffset = findRangesOffset(i, IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 2), iFindSectionsIndex + 4 < this.sections.length() ? IdnaMappingTableKt.read14BitInt(this.sections, iFindSectionsIndex + 6) : this.ranges.length() / 4);
        char cCharAt = this.ranges.charAt(iFindRangesOffset + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i2 = IdnaMappingTableKt.read14BitInt(this.ranges, iFindRangesOffset + 2);
            tTAppOpenAdActivity9.onNavigationEvent(this.mappings, i2, cCharAt + i2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            tTAppOpenAdActivity9.access100(i - (this.ranges.charAt(iFindRangesOffset + 3) | (((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            tTAppOpenAdActivity9.access100(i + (this.ranges.charAt(iFindRangesOffset + 3) | ((cCharAt & 15) << 14) | (this.ranges.charAt(iFindRangesOffset + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            Unit unit = Unit.INSTANCE;
            return true;
        }
        if (cCharAt == 'x') {
            tTAppOpenAdActivity9.access100(i);
            return true;
        }
        if (cCharAt == 'y') {
            tTAppOpenAdActivity9.access100(i);
            return false;
        }
        if (cCharAt == 'z') {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2));
            return true;
        }
        if (cCharAt == '{') {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2));
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '}') {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 3));
            return true;
        }
        if (cCharAt == '~') {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2));
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 2) | 128);
            tTAppOpenAdActivity9.onExtraCallbackWithResult(this.ranges.charAt(iFindRangesOffset + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i).toString());
    }

    private final int findSectionsIndex(int i) {
        int i2;
        int length = (this.sections.length() / 4) - 1;
        int i3 = 0;
        while (true) {
            if (i3 > length) {
                i2 = (-i3) - 1;
                break;
            }
            i2 = (i3 + length) / 2;
            int iCompare = Intrinsics.compare((2097024 & i) >> 7, IdnaMappingTableKt.read14BitInt(this.sections, i2 << 2));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i3 = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i2 >= 0 ? i2 << 2 : ((-i2) - 2) << 2;
    }

    private final int findRangesOffset(int i, int i2, int i3) {
        int i4;
        int i5 = i3 - 1;
        while (true) {
            if (i2 > i5) {
                i4 = (-i2) - 1;
                break;
            }
            i4 = (i2 + i5) / 2;
            int iCompare = Intrinsics.compare(i & 127, (int) this.ranges.charAt(i4 << 2));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i2 = i4 + 1;
            } else {
                i5 = i4 - 1;
            }
        }
        return i4 >= 0 ? i4 << 2 : ((-i4) - 2) << 2;
    }
}
