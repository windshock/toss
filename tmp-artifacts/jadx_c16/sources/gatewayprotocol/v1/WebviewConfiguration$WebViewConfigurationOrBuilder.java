package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface WebviewConfiguration$WebViewConfigurationOrBuilder extends MessageLiteOrBuilder {
    String getAdditionalFiles(int i);

    ByteString getAdditionalFilesBytes(int i);

    int getAdditionalFilesCount();

    List<String> getAdditionalFilesList();

    String getEntryPoint();

    ByteString getEntryPointBytes();

    String getType();

    ByteString getTypeBytes();

    int getVersion();
}
