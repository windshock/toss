package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ProtobufEncoder {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.objectEncoders, this.valueEncoders, this.fallbackEncoder).encode(obj);
    }

    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder implements EncoderConfig<Builder> {
        private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.ProtobufEncoder$Builder$$ExternalSyntheticLambda0
            public final void encode(Object obj, Object obj2) throws EncodingException {
                ProtobufEncoder.Builder.m69$r8$lambda$HcoNKxmNqN9duQx_r41_DwbVtE(obj, (ObjectEncoderContext) obj2);
            }
        };
        private final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
        private final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();
        private ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
        /* renamed from: $r8$lambda$HcoNKxmNqN-9duQx_r41_DwbVtE, reason: not valid java name */
        public static /* synthetic */ void m69$r8$lambda$HcoNKxmNqN9duQx_r41_DwbVtE(Object obj, ObjectEncoderContext objectEncoderContext) throws EncodingException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.objectEncoders.put(cls, objectEncoder);
            this.valueEncoders.remove(cls);
            return this;
        }

        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.valueEncoders.put(cls, valueEncoder);
            this.objectEncoders.remove(cls);
            return this;
        }

        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.fallbackEncoder = objectEncoder;
            return this;
        }

        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.objectEncoders), new HashMap(this.valueEncoders), this.fallbackEncoder);
        }
    }
}
