package o;

import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class extractFile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ extractFile[] $VALUES;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String value;
    public static final extractFile CIRCLE = new extractFile("CIRCLE", 0, "circle");
    public static final extractFile RECT = new extractFile("RECT", 1, "rect");
    public static final extractFile PAPER = new extractFile("PAPER", 2, "paper");

    private static final /* synthetic */ extractFile[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        extractFile[] extractfileArr = {CIRCLE, RECT, PAPER};
        int i5 = i2 + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return extractfileArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<extractFile> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        EnumEntries<extractFile> enumEntries = $ENTRIES;
        int i5 = i3 + 119;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static extractFile valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        extractFile extractfile = (extractFile) Enum.valueOf(extractFile.class, str);
        if (i3 == 0) {
            return extractfile;
        }
        throw null;
    }

    public static extractFile[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        extractFile[] extractfileArr = $VALUES;
        if (i3 != 0) {
            return (extractFile[]) extractfileArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private extractFile(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    static {
        extractFile[] extractfileArr$values = $values();
        $VALUES = extractfileArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(extractfileArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new IAuthTabCallback(defaultConstructorMarker);
        int i = onNavigationEvent + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final extractFile IAuthTabCallback(@NotNull String str) {
            Object obj;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator it = extractFile.getEntries().iterator();
            int i2 = IAuthTabCallback + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                int i4 = onExtraCallback + 107;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                Object next = it.next();
                if (!(!Intrinsics.areEqual(((extractFile) next).getValue(), str))) {
                    obj = next;
                    break;
                }
            }
            extractFile extractfile = (extractFile) obj;
            return extractfile == null ? extractFile.CIRCLE : extractfile;
        }
    }
}
