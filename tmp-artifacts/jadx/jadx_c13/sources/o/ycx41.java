package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ycx41 {
    private final Optional<sya8> IAuthTabCallback;
    private final Optional<sya8> onNavigationEvent;

    public abstract IAuthTabCallback onNavigationEvent();

    public ycx41(Optional<sya8> optional, Optional<sya8> optional2) {
        Objects.requireNonNull(optional);
        Objects.requireNonNull(optional2);
        this.IAuthTabCallback = optional;
        this.onNavigationEvent = optional2;
    }

    public Optional<sya8> onTransact() {
        return this.IAuthTabCallback;
    }

    public Optional<sya8> asInterface() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return onNavigationEvent().toString();
    }

    public enum IAuthTabCallback {
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
        Comment("#"),
        Value(":");

        private final String description;

        IAuthTabCallback(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }
}
