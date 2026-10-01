package com.google.firebase.encoders.proto;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final ObjectEncoder<Map.Entry<Object, Object>> DEFAULT_MAP_ENCODER;
    private static int IAuthTabCallback = 1;
    private static final FieldDescriptor MAP_KEY_DESC;
    private static final FieldDescriptor MAP_VALUE_DESC;
    private static final Charset UTF_8;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;

    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i2) throws EncodingException, IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextM66add = m66add(fieldDescriptor, i2);
        if (i5 != 0) {
            int i6 = 94 / 0;
        }
        return protobufDataEncoderContextM66add;
    }

    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return m67add(fieldDescriptor, j);
        }
        m67add(fieldDescriptor, j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextM68add = m68add(fieldDescriptor, z);
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        return protobufDataEncoderContextM68add;
    }

    static {
        onWarmupCompleted();
        UTF_8 = Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME);
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 177, 0}, false, new byte[]{0, 0, 0}, objArr);
        MAP_KEY_DESC = FieldDescriptor.builder(((String) objArr[0]).intern()).withProperty(AtProtobuf.builder().tag(1).build()).build();
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 5, 157, 2}, true, null, objArr2);
        MAP_VALUE_DESC = FieldDescriptor.builder(((String) objArr2[0]).intern()).withProperty(AtProtobuf.builder().tag(2).build()).build();
        DEFAULT_MAP_ENCODER = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$$ExternalSyntheticLambda0
            public final void encode(Object obj, Object obj2) {
                ProtobufDataEncoderContext.m65$r8$lambda$HMpWU6Ryr444SahjVbEVRqtyxs((Map.Entry) obj, (ObjectEncoderContext) obj2);
            }
        };
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: $r8$lambda$HMpWU6Ryr444SahjVbEVRqty-xs, reason: not valid java name */
    public static /* synthetic */ void m65$r8$lambda$HMpWU6Ryr444SahjVbEVRqtyxs(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
        int i5 = onExtraCallback + 9;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        FieldDescriptor fieldDescriptorOf = FieldDescriptor.of(str);
        if (i4 != 0) {
            return add(fieldDescriptorOf, obj);
        }
        add(fieldDescriptorOf, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ObjectEncoderContext objectEncoderContextAdd = add(FieldDescriptor.of(str), d);
        int i5 = onExtraCallback + 27;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objectEncoderContextAdd;
    }

    public ObjectEncoderContext add(@NonNull String str, int i2) throws EncodingException, IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextM66add = m66add(FieldDescriptor.of(str), i2);
        int i6 = onNavigationEvent + 109;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return protobufDataEncoderContextM66add;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ObjectEncoderContext add(@NonNull String str, long j) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        FieldDescriptor fieldDescriptorOf = FieldDescriptor.of(str);
        if (i4 == 0) {
            m67add(fieldDescriptorOf, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ProtobufDataEncoderContext protobufDataEncoderContextM67add = m67add(fieldDescriptorOf, j);
        int i5 = onExtraCallback + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return protobufDataEncoderContextM67add;
    }

    public ObjectEncoderContext add(@NonNull String str, boolean z) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextM68add = m68add(FieldDescriptor.of(str), z);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return protobufDataEncoderContextM68add;
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ObjectEncoderContext objectEncoderContextAdd = add(fieldDescriptor, obj, true);
        int i5 = onExtraCallback + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return objectEncoderContextAdd;
        }
        throw null;
    }

    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        Iterator it;
        int i2 = 2 % 2;
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(UTF_8);
                    writeVarInt32(bytes.length);
                    this.output.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                int i3 = onNavigationEvent + 25;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    it = ((Collection) obj).iterator();
                    int i4 = 70 / 0;
                } else {
                    it = ((Collection) obj).iterator();
                }
                while (it.hasNext()) {
                    add(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    doEncode((ObjectEncoder<FieldDescriptor>) DEFAULT_MAP_ENCODER, fieldDescriptor, (FieldDescriptor) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    int i5 = onExtraCallback + 43;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return add(fieldDescriptor, ((Double) obj).doubleValue(), z);
                    }
                    ObjectEncoderContext objectEncoderContextAdd = add(fieldDescriptor, ((Double) obj).doubleValue(), z);
                    int i6 = 47 / 0;
                    return objectEncoderContextAdd;
                }
                if (obj instanceof Float) {
                    return add(fieldDescriptor, ((Float) obj).floatValue(), z);
                }
                if (!(!(obj instanceof Number))) {
                    return add(fieldDescriptor, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
                    if (objectEncoder != null) {
                        return doEncode((ObjectEncoder<FieldDescriptor>) objectEncoder, fieldDescriptor, (FieldDescriptor) obj, z);
                    }
                    ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
                    return valueEncoder != null ? doEncode((ValueEncoder<FieldDescriptor>) valueEncoder, fieldDescriptor, (FieldDescriptor) obj, z) : !((obj instanceof ProtoEnum) ^ true) ? m66add(fieldDescriptor, ((ProtoEnum) obj).getNumber()) : obj instanceof Enum ? m66add(fieldDescriptor, ((Enum) obj).ordinal()) : doEncode((ObjectEncoder<FieldDescriptor>) this.fallbackEncoder, fieldDescriptor, (FieldDescriptor) obj, z);
                }
                int i7 = onNavigationEvent + 99;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    writeVarInt32(bArr.length);
                    this.output.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ObjectEncoderContext objectEncoderContextAdd = add(fieldDescriptor, d, true);
        int i5 = onNavigationEvent + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return objectEncoderContextAdd;
    }

    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        int i2 = 2 % 2;
        if (!(!z)) {
            int i3 = onExtraCallback;
            int i4 = i3 + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (d == 0.0d) {
                int i6 = i3 + 33;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i3 + 37;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return this;
            }
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d).array());
        return this;
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onExtraCallback = i3 % 128;
        ObjectEncoderContext objectEncoderContextAdd = i3 % 2 != 0 ? add(fieldDescriptor, f, false) : add(fieldDescriptor, f, true);
        int i4 = onNavigationEvent + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return objectEncoderContextAdd;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 43;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - View.MeasureSpec.getMode(0)), ExpandableListView.getPackedPositionType(0L) + 35, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getCapsMode("", 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i11 = $11 + 29;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 64 - TextUtils.indexOf((CharSequence) "", '0', 0), 16718 - TextUtils.getOffsetAfter("", 0), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - Process.getGidForName(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 49468), TextUtils.indexOf("", "", 0) + 70, 12487 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            int i15 = $10 + 49;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
            int i18 = $11 + 117;
            $10 = i18 % 128;
            i2 = 2;
            int i19 = i18 % 2;
        } else {
            i2 = 2;
        }
        if (z) {
            int i20 = $11 + 85;
            $10 = i20 % 128;
            int i21 = i20 % i2;
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i22 = $10 + 63;
            $11 = i22 % 128;
            int i23 = i22 % i2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (z && f == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f).array());
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    /* renamed from: add, reason: collision with other method in class */
    public ProtobufDataEncoderContext m66add(@NonNull FieldDescriptor fieldDescriptor, int i2) throws EncodingException, IOException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextAdd = add(fieldDescriptor, i2, true);
        int i6 = onNavigationEvent + 37;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return protobufDataEncoderContextAdd;
    }

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        static {
            int[] iArr = new int[Protobuf$IntEncoding.values().length];
            $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = iArr;
            try {
                iArr[Protobuf$IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf$IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf$IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i2, boolean z) throws EncodingException, IOException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (!z || i2 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i6 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
            if (i6 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i2);
                int i7 = onExtraCallback + 91;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 51 / 0;
                }
                return this;
            }
            int i9 = onExtraCallback + 107;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0 ? i6 == 2 : i6 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i2 << 1) ^ (i2 >> 31));
                return this;
            }
            if (i6 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(allocateBuffer(4).putInt(i2).array());
                int i10 = onExtraCallback + 105;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                return this;
            }
        }
        return this;
    }

    /* renamed from: add, reason: collision with other method in class */
    public ProtobufDataEncoderContext m67add(@NonNull FieldDescriptor fieldDescriptor, long j) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextAdd = add(fieldDescriptor, j, true);
        int i5 = onNavigationEvent + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return protobufDataEncoderContextAdd;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws EncodingException, IOException {
        int i2 = 2 % 2;
        if (z) {
            int i3 = onNavigationEvent + 43;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0 ? j != 0 : j != 1) {
                Protobuf protobuf = getProtobuf(fieldDescriptor);
                int i4 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
                if (i4 == 1) {
                    writeVarInt32(protobuf.tag() << 3);
                    writeVarInt64(j);
                    return this;
                }
                int i5 = onExtraCallback + 91;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (i4 == 2) {
                    writeVarInt32(protobuf.tag() << 3);
                    writeVarInt64((j << 1) ^ (j >> 63));
                    int i7 = onNavigationEvent + 79;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return this;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i4 == 3) {
                    writeVarInt32((protobuf.tag() << 3) | 1);
                    this.output.write(allocateBuffer(8).putLong(j).array());
                    return this;
                }
            }
        }
        return this;
    }

    /* renamed from: add, reason: collision with other method in class */
    public ProtobufDataEncoderContext m68add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextAdd = add(fieldDescriptor, z, true);
        int i5 = onNavigationEvent + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return protobufDataEncoderContextAdd;
    }

    ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return add(fieldDescriptor, z ? 1 : 0, z2);
        }
        add(fieldDescriptor, z ? 1 : 0, z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ObjectEncoderContext inline(@Nullable Object obj) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ProtobufDataEncoderContext protobufDataEncoderContextEncode = encode(obj);
        int i5 = onNavigationEvent + 57;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return protobufDataEncoderContextEncode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    ProtobufDataEncoderContext encode(@Nullable Object obj) throws EncodingException, IOException {
        int i2 = 2 % 2;
        if (obj == null) {
            int i3 = onExtraCallback + 33;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 81;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
        objectEncoder.encode(obj, this);
        int i8 = onExtraCallback + 101;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 23 / 0;
        }
        return this;
    }

    public ObjectEncoderContext nested(@NonNull String str) throws EncodingException, IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ObjectEncoderContext objectEncoderContextNested = nested(FieldDescriptor.of(str));
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = onNavigationEvent + 49;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return objectEncoderContextNested;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws EncodingException, IOException {
        int i2 = 2 % 2;
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    private <T> ProtobufDataEncoderContext doEncode(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        int i2 = 2 % 2;
        long jDetermineSize = determineSize(objectEncoder, t);
        if (!z || jDetermineSize != 0) {
            writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
            writeVarInt64(jDetermineSize);
            objectEncoder.encode(t, this);
            return this;
        }
        int i3 = onExtraCallback + 71;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 73;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        throw null;
    }

    private <T> long determineSize(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        int i2 = 2 % 2;
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
                int i3 = onNavigationEvent + 103;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> ProtobufDataEncoderContext doEncode(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.valueEncoderContext.resetContext(fieldDescriptor, z);
        valueEncoder.encode(t, this.valueEncoderContext);
        int i5 = onExtraCallback + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static ByteBuffer allocateBuffer(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
        if (i5 != 0) {
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            throw null;
        }
        ByteBuffer byteBufferOrder = byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        int i6 = onNavigationEvent + 85;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return byteBufferOrder;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    private static int getTag(FieldDescriptor fieldDescriptor) throws EncodingException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Protobuf property = fieldDescriptor.getProperty(Protobuf.class);
            if (property == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            int iTag = property.tag();
            int i4 = onNavigationEvent + 83;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iTag;
        }
        fieldDescriptor.getProperty(Protobuf.class);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) throws EncodingException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Protobuf property = fieldDescriptor.getProperty(Protobuf.class);
        if (property == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i5 = onExtraCallback + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return property;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void writeVarInt32(int i2) throws IOException {
        int i3 = 2 % 2;
        while ((i2 & (-128)) != 0) {
            int i4 = onNavigationEvent + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            this.output.write((i2 & 127) | 128);
            i2 >>>= 7;
            int i6 = onNavigationEvent + 65;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        this.output.write(i2 & 127);
    }

    private void writeVarInt64(long j) throws IOException {
        int i2 = 2 % 2;
        while (((-128) & j) != 0) {
            int i3 = onExtraCallback + 99;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.output.write((((int) j) & 127) | 128);
            j >>>= 7;
            int i5 = onNavigationEvent + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        this.output.write(((int) j) & 127);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = new char[]{27328, 27479, 27502, 27312, 27485, 27468, 27484, 27463};
    }
}
