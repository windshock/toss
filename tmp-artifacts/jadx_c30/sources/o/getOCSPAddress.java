package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getOCSPAddress {
    private final UST_TRANS_V2_SendReceiverInfo IAuthTabCallback;
    private final UST_TRANS_V2_SendReceiverInfo onWarmupCompleted;

    public abstract onWarmupCompleted onWarmupCompleted();

    public enum onWarmupCompleted {
        Alias("<alias>"),
        Anchor("<anchor>"),
        BlockEnd("<block end>"),
        BlockEntry("-"),
        BlockMappingStart("<block mapping start>"),
        BlockSequenceStart("<block sequence start>"),
        Directive("<directive>"),
        DocumentEnd("<document end>"),
        DocumentStart("<document start>"),
        FlowEntry(","),
        FlowMappingEnd("}"),
        FlowMappingStart("{"),
        FlowSequenceEnd("]"),
        FlowSequenceStart("["),
        Key("?"),
        Scalar("<scalar>"),
        StreamEnd("<stream end>"),
        StreamStart("<stream start>"),
        Tag("<tag>"),
        Value(":"),
        Whitespace("<whitespace>"),
        Comment("#"),
        Error("<error>");

        private final String description;

        onWarmupCompleted(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    public getOCSPAddress(UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo, UST_TRANS_V2_SendReceiverInfo uST_TRANS_V2_SendReceiverInfo2) {
        if (uST_TRANS_V2_SendReceiverInfo == null || uST_TRANS_V2_SendReceiverInfo2 == null) {
            throw new UST_TRANS_V2_Init("Token requires marks.");
        }
        this.onWarmupCompleted = uST_TRANS_V2_SendReceiverInfo;
        this.IAuthTabCallback = uST_TRANS_V2_SendReceiverInfo2;
    }

    public UST_TRANS_V2_SendReceiverInfo asBinder() {
        return this.onWarmupCompleted;
    }

    public UST_TRANS_V2_SendReceiverInfo IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }
}
