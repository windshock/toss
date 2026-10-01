package com.alibaba.ariver.resource.api.prepare;

import com.alibaba.ariver.kernel.RVParams;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum OfflineMode {
    SYNC_FORCE(2),
    SYNC_TRY(1),
    ASYNC(0);

    public int value;

    OfflineMode(int i2) {
        this.value = i2;
    }

    public static OfflineMode fromString(String str, String str2) {
        if ("sync".equals(str)) {
            if (RVParams.DEFAULT_LONG_UP_STRATEGY.equals(str2)) {
                return SYNC_TRY;
            }
            return SYNC_FORCE;
        }
        return ASYNC;
    }

    public boolean isSync() {
        return this.value > 0;
    }

    /* renamed from: com.alibaba.ariver.resource.api.prepare.OfflineMode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$ariver$resource$api$prepare$OfflineMode;

        static {
            int[] iArr = new int[OfflineMode.values().length];
            $SwitchMap$com$alibaba$ariver$resource$api$prepare$OfflineMode = iArr;
            try {
                iArr[OfflineMode.SYNC_FORCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$resource$api$prepare$OfflineMode[OfflineMode.SYNC_TRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$ariver$resource$api$prepare$OfflineMode[OfflineMode.ASYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = AnonymousClass1.$SwitchMap$com$alibaba$ariver$resource$api$prepare$OfflineMode[ordinal()];
        if (i2 == 1) {
            return "SYNC_FORCE";
        }
        if (i2 == 2) {
            return "SYNC_TRY";
        }
        return "ASYNC";
    }
}
