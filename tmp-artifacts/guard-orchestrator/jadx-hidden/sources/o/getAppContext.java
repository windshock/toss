package o;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.enums.EnumEntries;
import o.s3c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class getAppContext {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getAppContext[] $VALUES;
    public static final getAppContext ANYONE;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final getAppContext TOSS_TEAM;
    public static final getAppContext TOSS_TEAM_ALPHA;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    private static final /* synthetic */ getAppContext[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        getAppContext[] getappcontextArr = {TOSS_TEAM_ALPHA, TOSS_TEAM, ANYONE};
        int i5 = i2 + 43;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getappcontextArr;
    }

    public static EnumEntries<getAppContext> getEntries() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 11;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getAppContext> enumEntries = $ENTRIES;
        int i5 = i2 + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static getAppContext valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getAppContext getappcontext = (getAppContext) Enum.valueOf(getAppContext.class, str);
        int i4 = asInterface + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getappcontext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getAppContext[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getAppContext[] getappcontextArr = (getAppContext[]) $VALUES.clone();
        int i4 = asInterface + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return getappcontextArr;
    }

    private getAppContext(String str, int i) {
    }

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{16899, 19401, 59313, 25773, 9103, 3487, 58432, 21217, 59284, 4903, 4292, 3785, 32885, 11091, 22831, 60430}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr);
        TOSS_TEAM_ALPHA = new getAppContext(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(new char[]{16899, 19401, 59313, 25773, 9103, 3487, 58432, 21217, 1962, 16567}, ((byte) KeyEvent.getModifierMetaStateMask()) + 10, objArr2);
        TOSS_TEAM = new getAppContext(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a(new char[]{36588, 2265, 46256, 22407, 54456, 60497}, 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        ANYONE = new getAppContext(((String) objArr3[0]).intern(), 2);
        getAppContext[] getappcontextArr$values = $values();
        $VALUES = getappcontextArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getappcontextArr$values);
        int i = onTransact + 67;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L))), c2 >>> 5, IAuthTabCallback);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L))), C >>> 5, onNavigationEvent);
                i5 -= 40503;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = (char) 17963;
        onNavigationEvent = (char) 24002;
        onWarmupCompleted = (char) 47878;
        IAuthTabCallback = (char) 61290;
    }
}
