package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getKeyTemplate {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getKeyTemplate[] $VALUES;
    public static final IAuthTabCallback Companion;
    public static final getKeyTemplate SOLID = new getKeyTemplate("SOLID", 0);
    public static final getKeyTemplate NONE = new getKeyTemplate("NONE", 1);

    private static final /* synthetic */ getKeyTemplate[] $values() {
        return new getKeyTemplate[]{SOLID, NONE};
    }

    public static EnumEntries<getKeyTemplate> getEntries() {
        return $ENTRIES;
    }

    public static getKeyTemplate valueOf(String str) {
        return (getKeyTemplate) Enum.valueOf(getKeyTemplate.class, str);
    }

    public static getKeyTemplate[] values() {
        return (getKeyTemplate[]) $VALUES.clone();
    }

    private getKeyTemplate(String str, int i) {
    }

    static {
        getKeyTemplate[] getkeytemplateArr$values = $values();
        $VALUES = getkeytemplateArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getkeytemplateArr$values);
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
    }
}
