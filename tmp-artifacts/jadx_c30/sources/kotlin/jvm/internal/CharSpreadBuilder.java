package kotlin.jvm.internal;

import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CharSpreadBuilder extends PrimitiveSpreadBuilder<char[]> {
    private final char[] values;

    public CharSpreadBuilder(int i) {
        super(i);
        this.values = new char[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, BuildConfig.FLAVOR);
        return cArr.length;
    }

    public final void add(char c) {
        char[] cArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        cArr[position] = c;
    }

    public final char[] toArray() {
        return toArray(this.values, new char[size()]);
    }
}
