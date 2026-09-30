package im.toss.appsintoss.data.remote.model;

import im.toss.appsintoss.data.remote.model.ProcessProductGrantRequest$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProcessProductGrantRequest$Companion {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public /* synthetic */ ProcessProductGrantRequest$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProcessProductGrantRequest$Companion() {
    }

    public final KSerializer<ProcessProductGrantRequest> serializer() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            ProcessProductGrantRequest$.serializer serializerVar = ProcessProductGrantRequest$.serializer.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProcessProductGrantRequest$.serializer serializerVar2 = ProcessProductGrantRequest$.serializer.INSTANCE;
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return serializerVar2;
    }
}
