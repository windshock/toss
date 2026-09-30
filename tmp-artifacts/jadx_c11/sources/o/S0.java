package o;

import java.lang.Character;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class S0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final List<Character.UnicodeBlock> onWarmupCompleted = CollectionsKt.listOf(new Character.UnicodeBlock[]{Character.UnicodeBlock.DEVANAGARI, Character.UnicodeBlock.DEVANAGARI_EXTENDED, Character.UnicodeBlock.KHMER, Character.UnicodeBlock.KHMER_SYMBOLS, Character.UnicodeBlock.MYANMAR, Character.UnicodeBlock.SINHALA, Character.UnicodeBlock.BENGALI});

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onNavigationEvent(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
            List<Character.UnicodeBlock> list = onWarmupCompleted;
            if (list instanceof Collection) {
                int i3 = IAuthTabCallback + 37;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    list.isEmpty();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (list.isEmpty()) {
                    continue;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int i4 = onNavigationEvent + 35;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 73 / 0;
                            if (Intrinsics.areEqual((Character.UnicodeBlock) it.next(), unicodeBlockOf)) {
                                return true;
                            }
                        } else if (Intrinsics.areEqual((Character.UnicodeBlock) it.next(), unicodeBlockOf)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    static {
        int i = onExtraCallbackWithResult + 19;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }
}
