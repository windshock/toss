package o;

import kotlin.enums.EnumEntries;
import o.QuirkSettingsLoader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getShouldExtendMsg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getShouldExtendMsg[] $VALUES;
    public static final getShouldExtendMsg Bottom;
    private static int IAuthTabCallback = 0;
    public static final getShouldExtendMsg Top;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final QuirkSettingsLoader alignment;
    private final float angle;
    private final float height;
    private final float offset;

    private static final /* synthetic */ getShouldExtendMsg[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        getShouldExtendMsg[] getshouldextendmsgArr = {Top, Bottom};
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getshouldextendmsgArr;
    }

    public static EnumEntries<getShouldExtendMsg> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<getShouldExtendMsg> enumEntries = $ENTRIES;
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getShouldExtendMsg valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getShouldExtendMsg getshouldextendmsg = (getShouldExtendMsg) Enum.valueOf(getShouldExtendMsg.class, str);
        int i4 = onExtraCallback + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getshouldextendmsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getShouldExtendMsg[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getShouldExtendMsg[] getshouldextendmsgArr = (getShouldExtendMsg[]) $VALUES.clone();
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getshouldextendmsgArr;
        }
        throw null;
    }

    private getShouldExtendMsg(String str, int i, float f, float f2, float f3, QuirkSettingsLoader quirkSettingsLoader) {
        this.height = f;
        this.offset = f2;
        this.angle = f3;
        this.alignment = quirkSettingsLoader;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m155getHeightD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.height;
        int i5 = i2 + 17;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    /* renamed from: getOffset-D9Ej5fM, reason: not valid java name */
    public final float m156getOffsetD9Ej5fM() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offset;
        }
        throw null;
    }

    public final float getAngle() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.angle;
        int i5 = i2 + 125;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final QuirkSettingsLoader getAlignment() {
        QuirkSettingsLoader quirkSettingsLoader;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            quirkSettingsLoader = this.alignment;
            int i4 = 90 / 0;
        } else {
            quirkSettingsLoader = this.alignment;
        }
        int i5 = i2 + 69;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return quirkSettingsLoader;
        }
        throw null;
    }

    static {
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        Top = new getShouldExtendMsg("Top", 0, fIAuthTabCallback, fIAuthTabCallback2, 270.0f, onextracallbackwithresult.IAuthTabCallback_Parcel());
        Bottom = new getShouldExtendMsg("Bottom", 1, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-16.0f), 90.0f, onextracallbackwithresult.IAuthTabCallback_Parcel());
        getShouldExtendMsg[] getshouldextendmsgArr$values = $values();
        $VALUES = getshouldextendmsgArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getshouldextendmsgArr$values);
        int i = IAuthTabCallback + 45;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }
}
