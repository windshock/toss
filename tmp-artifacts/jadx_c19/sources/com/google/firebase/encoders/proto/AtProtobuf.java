package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AtProtobuf {
    private Protobuf$IntEncoding intEncoding = Protobuf$IntEncoding.DEFAULT;
    private int tag;

    public AtProtobuf tag(int i2) {
        this.tag = i2;
        return this;
    }

    public AtProtobuf intEncoding(Protobuf$IntEncoding protobuf$IntEncoding) {
        this.intEncoding = protobuf$IntEncoding;
        return this;
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public Protobuf build() {
        return new ProtobufImpl(this.tag, this.intEncoding);
    }

    static final class ProtobufImpl implements Protobuf {
        private final Protobuf$IntEncoding intEncoding;
        private final int tag;

        ProtobufImpl(int i2, Protobuf$IntEncoding protobuf$IntEncoding) {
            this.tag = i2;
            this.intEncoding = protobuf$IntEncoding;
        }

        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public int tag() {
            return this.tag;
        }

        public Protobuf$IntEncoding intEncoding() {
            return this.intEncoding;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.tag == protobuf.tag() && this.intEncoding.equals(protobuf.intEncoding());
        }

        public int hashCode() {
            return (this.tag ^ 14552422) + (this.intEncoding.hashCode() ^ 2041407134);
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.tag + "intEncoding=" + this.intEncoding + ')';
        }
    }
}
