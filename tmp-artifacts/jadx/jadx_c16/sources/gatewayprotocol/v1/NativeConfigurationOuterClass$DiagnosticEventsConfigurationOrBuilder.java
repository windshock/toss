package gatewayprotocol.v1;

import com.google.protobuf.MessageLiteOrBuilder;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface NativeConfigurationOuterClass$DiagnosticEventsConfigurationOrBuilder extends MessageLiteOrBuilder {
    DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i);

    int getAllowedEventsCount();

    List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getAllowedEventsList();

    int getAllowedEventsValue(int i);

    List<Integer> getAllowedEventsValueList();

    DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i);

    int getBlockedEventsCount();

    List<DiagnosticEventRequestOuterClass.DiagnosticEventType> getBlockedEventsList();

    int getBlockedEventsValue(int i);

    List<Integer> getBlockedEventsValueList();

    boolean getEnabled();

    int getMaxBatchIntervalMs();

    int getMaxBatchSize();

    DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity();

    int getSeverityValue();

    boolean getTtmEnabled();
}
