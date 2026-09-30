package o;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class RectangleShapeParser {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final onValueChanged onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    private RectangleShapeParser(onValueChanged onvaluechanged, byte[] bArr, byte[] bArr2) {
        this.onExtraCallback = onvaluechanged;
        this.onWarmupCompleted = onvaluechanged.onExtraCallbackWithResult(bArr);
        this.onExtraCallbackWithResult = onvaluechanged.onExtraCallbackWithResult(bArr2);
    }

    private RectangleShapeParser(onValueChanged onvaluechanged, String str, String str2) {
        this.onExtraCallback = onvaluechanged;
        this.onWarmupCompleted = str;
        this.onExtraCallbackWithResult = str2;
    }

    static RectangleShapeParser onExtraCallbackWithResult(onValueChanged onvaluechanged, String str) throws tempExtension {
        int i = 2 % 2;
        IAuthTabCallback(str);
        String[] strArrSplit = str.split("-_-");
        RectangleShapeParser rectangleShapeParser = new RectangleShapeParser(onvaluechanged, strArrSplit[0], strArrSplit[1]);
        int i2 = IAuthTabCallback + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return rectangleShapeParser;
        }
        throw null;
    }

    static RectangleShapeParser IAuthTabCallback(onValueChanged onvaluechanged, byte[] bArr, byte[] bArr2) {
        int i = 2 % 2;
        RectangleShapeParser rectangleShapeParser = new RectangleShapeParser(onvaluechanged, bArr, bArr2);
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rectangleShapeParser;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r3.contains("-_-") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r3 = o.RectangleShapeParser.IAuthTabCallback + 73;
        o.RectangleShapeParser.onNavigationEvent = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r3.contains("-_-") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void IAuthTabCallback(String str) throws tempExtension {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!str.isEmpty()) {
            int i4 = onNavigationEvent + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
        }
        throw tempExtension.onNavigationEvent(str);
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.onWarmupCompleted + "-_-" + this.onExtraCallbackWithResult;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    byte[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(this.onExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return bArrOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    byte[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrOnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(this.onWarmupCompleted);
        int i4 = IAuthTabCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return bArrOnWarmupCompleted;
    }
}
