package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import kotlin.enums.EnumEntries;
import o.s3c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class backPressed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ backPressed[] $VALUES;
    public static final backPressed ALL;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final backPressed PINNED;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private final String label;

    private static final /* synthetic */ backPressed[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        backPressed[] backpressedArr = {PINNED, ALL};
        int i5 = i3 + 125;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return backpressedArr;
        }
        throw null;
    }

    public static EnumEntries<backPressed> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<backPressed> enumEntries = $ENTRIES;
        int i4 = i2 + 25;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return enumEntries;
    }

    public static backPressed valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        backPressed backpressed = (backPressed) Enum.valueOf(backPressed.class, str);
        int i4 = IAuthTabCallbackStub + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return backpressed;
    }

    public static backPressed[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        backPressed[] backpressedArr = (backPressed[]) $VALUES.clone();
        int i4 = onExtraCallbackWithResult + 59;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return backpressedArr;
    }

    private backPressed(String str, int i, String str2) {
        this.label = str2;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{36550, 57730, 37394, 37548, 10827, 21138}, 7 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{61502, 46508, 33981, 12410}, Drawable.resolveOpacity(0, 0) + 4, objArr2);
        PINNED = new backPressed(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{41661, 59101, 63763, 37358}, Color.red(0) + 3, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{59761, 54634}, 3 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        ALL = new backPressed(strIntern2, 1, ((String) objArr4[0]).intern());
        backPressed[] backpressedArr$values = $values();
        $VALUES = backpressedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(backpressedArr$values);
        int i = asBinder + 39;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 7;
            $11 = i3 % 128;
            int i4 = 58224;
            if (i3 % 2 == 0) {
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            } else {
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            }
            int i5 = 0;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i4) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L))), c2 >>> 5, onWarmupCompleted);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i4) ^ ((C << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), C >>> 5, onNavigationEvent);
                i4 -= 40503;
                i5++;
                int i6 = $10 + 65;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = (char) 24875;
        onNavigationEvent = (char) 12721;
        onExtraCallback = (char) 16926;
        onWarmupCompleted = (char) 24561;
    }
}
