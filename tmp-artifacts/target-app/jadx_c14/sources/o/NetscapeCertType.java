package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NetscapeCertType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetscapeCertType[] $VALUES;
    public static final onWarmupCompleted Companion;
    private final int count;
    private final String validateRegex;
    public static final NetscapeCertType AreaCode = new NetscapeCertType("AreaCode", 0, "^(02|0[3-9][\\d])([\\d]{3,4})([\\d]{4})$", 3);
    public static final NetscapeCertType NationalRepresentative = new NetscapeCertType("NationalRepresentative", 1, "^(1[3-9][\\d]{2})([\\d]{4})$", 2);
    public static final NetscapeCertType Phone = new NetscapeCertType("Phone", 2, "^(01[016-9])([\\d]{3,4})([\\d]{4})$", 3);

    private static final /* synthetic */ NetscapeCertType[] $values() {
        return new NetscapeCertType[]{AreaCode, NationalRepresentative, Phone};
    }

    public static EnumEntries<NetscapeCertType> getEntries() {
        return $ENTRIES;
    }

    public static NetscapeCertType valueOf(String str) {
        return (NetscapeCertType) Enum.valueOf(NetscapeCertType.class, str);
    }

    public static NetscapeCertType[] values() {
        return (NetscapeCertType[]) $VALUES.clone();
    }

    private NetscapeCertType(String str, int i, String str2, int i2) {
        this.validateRegex = str2;
        this.count = i2;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getValidateRegex() {
        return this.validateRegex;
    }

    static {
        NetscapeCertType[] netscapeCertTypeArr$values = $values();
        $VALUES = netscapeCertTypeArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(netscapeCertTypeArr$values);
        Companion = new onWarmupCompleted(null);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final NetscapeCertType onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strOnNavigationEvent = onNavigationEvent(str);
            for (NetscapeCertType netscapeCertType : NetscapeCertType.values()) {
                if (new Regex(netscapeCertType.getValidateRegex()).onExtraCallbackWithResult(strOnNavigationEvent)) {
                    return netscapeCertType;
                }
            }
            return null;
        }

        public final String onExtraCallbackWithResult(@NotNull String str) {
            NetscapeCertType netscapeCertType;
            Intrinsics.checkNotNullParameter(str, "");
            String strOnNavigationEvent = onNavigationEvent(str);
            NetscapeCertType[] netscapeCertTypeArrValues = NetscapeCertType.values();
            int length = netscapeCertTypeArrValues.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    netscapeCertType = null;
                    break;
                }
                netscapeCertType = netscapeCertTypeArrValues[i2];
                if (new Regex(netscapeCertType.getValidateRegex()).onExtraCallbackWithResult(strOnNavigationEvent)) {
                    break;
                }
                i2++;
            }
            if (netscapeCertType == null) {
                return strOnNavigationEvent;
            }
            Matcher matcherOnExtraCallback = enableFabricLogs.onExtraCallback.onExtraCallback(netscapeCertType.getValidateRegex(), strOnNavigationEvent);
            matcherOnExtraCallback.find();
            ArrayList arrayList = new ArrayList();
            if (netscapeCertType == NetscapeCertType.NationalRepresentative) {
                arrayList.add("02");
            }
            int iCount = CollectionsKt.count(new IntRange(1, netscapeCertType.getCount()));
            while (i < iCount) {
                i++;
                String strGroup = matcherOnExtraCallback.group(i);
                if (strGroup != null) {
                    arrayList.add(strGroup);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = ((String) next) + "-" + ((String) it.next());
            }
            return (String) next;
        }

        private final String onNavigationEvent(String str) {
            return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.trim(str).toString(), "-", "", false, 4, (Object) null), " ", "", false, 4, (Object) null), ".", "", false, 4, (Object) null);
        }
    }
}
