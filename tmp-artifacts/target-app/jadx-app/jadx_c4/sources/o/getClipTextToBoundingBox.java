package o;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getClipTextToBoundingBox {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getClipTextToBoundingBox[] $VALUES;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final getClipTextToBoundingBox In = new getClipTextToBoundingBox("In", 0);
    public static final getClipTextToBoundingBox Out = new getClipTextToBoundingBox("Out", 1);
    public static final getClipTextToBoundingBox None = new getClipTextToBoundingBox("None", 2);

    private static final /* synthetic */ getClipTextToBoundingBox[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return new getClipTextToBoundingBox[]{In, Out, None};
        }
        getClipTextToBoundingBox getcliptexttoboundingbox = In;
        getClipTextToBoundingBox getcliptexttoboundingbox2 = Out;
        getClipTextToBoundingBox getcliptexttoboundingbox3 = None;
        getClipTextToBoundingBox[] getcliptexttoboundingboxArr = new getClipTextToBoundingBox[4];
        getcliptexttoboundingboxArr[1] = getcliptexttoboundingbox;
        getcliptexttoboundingboxArr[1] = getcliptexttoboundingbox2;
        getcliptexttoboundingboxArr[2] = getcliptexttoboundingbox3;
        return getcliptexttoboundingboxArr;
    }

    public static EnumEntries<getClipTextToBoundingBox> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getClipTextToBoundingBox> enumEntries = $ENTRIES;
        int i5 = i2 + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getClipTextToBoundingBox valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getClipTextToBoundingBox getcliptexttoboundingbox = (getClipTextToBoundingBox) Enum.valueOf(getClipTextToBoundingBox.class, str);
        if (i3 != 0) {
            return getcliptexttoboundingbox;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getClipTextToBoundingBox[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getClipTextToBoundingBox[] getcliptexttoboundingboxArr = (getClipTextToBoundingBox[]) $VALUES.clone();
        int i3 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return getcliptexttoboundingboxArr;
    }

    static {
        getClipTextToBoundingBox[] getcliptexttoboundingboxArr$values = $values();
        $VALUES = getcliptexttoboundingboxArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getcliptexttoboundingboxArr$values);
        int i = IAuthTabCallback + 83;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getClipTextToBoundingBox(String str, int i) {
    }
}
