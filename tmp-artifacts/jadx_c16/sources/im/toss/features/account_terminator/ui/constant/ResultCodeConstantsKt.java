package im.toss.features.account_terminator.ui.constant;

import java.util.Set;
import o.clearFaultAdjacentMetadata;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ResultCodeConstantsKt {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int onTransact;
    private static final Set<String> onExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"5022", "5023", "5024", "5025", "5026", "1201", "1202", "1203", "1205", "1206", "1208", "1212", "1215", "1221", "1291"});
    private static final Set<String> onExtraCallbackWithResult = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"5001", "5002", "5003", "5004", "5005", "5006", "5021"});
    private static final Set<String> IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"5201", "5202", "5203", "5204", "5205", "5206", "5300"});
    private static final Set<String> onNavigationEvent = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"5011", "5012", "5013", "5031", "5032", "5033", "5034", "5035", "5036", "5037", "5038", "5039", "5040", "5041", "5042", "5043", "5044", "5045", "5090", "5099"});
    private static final Set<String> onWarmupCompleted = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"5027", "5028"});

    static {
        int i = IAuthTabCallbackStub + 65;
        asBinder = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final Set<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 39;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = onExtraCallback;
        int i5 = i2 + 109;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public static final Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 117;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = onExtraCallbackWithResult;
        int i5 = i2 + 119;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public static final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Set<String> set = onNavigationEvent;
        int i4 = i2 + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return set;
    }

    public static final Set<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 53;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = onWarmupCompleted;
        int i5 = i2 + 21;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }
}
