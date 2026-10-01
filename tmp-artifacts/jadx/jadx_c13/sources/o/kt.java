package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import o.kt;
import o.qt;
import o.ufy;
import o.vbt;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class kt<T> extends xf<T> {
    private final Map<String, KSerializer<? extends T>> IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final KClass<T> onExtraCallbackWithResult;
    private List<? extends Annotation> onNavigationEvent;
    private final Map<KClass<? extends T>, KSerializer<? extends T>> onWarmupCompleted;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static int asBinder = 478308946;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3;
        int i4 = (i * 3) + 1;
        byte[] bArr = $$a;
        int i5 = 4 - (b * 3);
        int i6 = (b2 * 4) + 105;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i5;
            int i10 = (-i5) + i7;
            int i11 = i9 + 1;
            i2 = i8;
            i6 = i10;
            i5 = i11;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i12 = i6;
            i9 = i5;
            i5 = bArr[i5];
            i8 = i3;
            i7 = i12;
            int i102 = (-i5) + i7;
            int i112 = i9 + 1;
            i2 = i8;
            i6 = i102;
            i5 = i112;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ SerialDescriptor IAuthTabCallback(String str, kt ktVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptorOnNavigationEvent = onNavigationEvent(str, ktVar);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return serialDescriptorOnNavigationEvent;
    }

    public static /* synthetic */ Unit onNavigationEvent(kt ktVar, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(ktVar, qtVar);
        int i4 = IAuthTabCallbackDefault + 103;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(kt ktVar, qt qtVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(ktVar, qtVar);
        int i4 = IAuthTabCallbackDefault + 77;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    @Override // o.xf
    public KClass<T> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        KClass<T> kClass = this.onExtraCallbackWithResult;
        int i5 = i2 + 15;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return kClass;
    }

    public kt(@NotNull final String str, @NotNull KClass<T> kClass, @NotNull KClass<? extends T>[] kClassArr, @NotNull KSerializer<? extends T>[] kSerializerArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClassArr, "");
        Intrinsics.checkNotNullParameter(kSerializerArr, "");
        this.onExtraCallbackWithResult = kClass;
        this.onNavigationEvent = CollectionsKt__CollectionsKt.emptyList();
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kt.IAuthTabCallback(str, this);
            }
        });
        if (kClassArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + onExtraCallbackWithResult().getSimpleName() + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, KSerializer<? extends T>> mapOnWarmupCompleted = access8000.onWarmupCompleted(ArraysKt___ArraysKt.zip(kClassArr, kSerializerArr));
        this.onWarmupCompleted = mapOnWarmupCompleted;
        access7200 onextracallbackwithresult = new onExtraCallbackWithResult(mapOnWarmupCompleted.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = onextracallbackwithresult.sourceIterator();
        while (itSourceIterator.hasNext()) {
            int i = IAuthTabCallbackDefault + 125;
            asInterface = i % 128;
            if (i % 2 == 0) {
                linkedHashMap.get(onextracallbackwithresult.keyOf(itSourceIterator.next()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            T next = itSourceIterator.next();
            Object objKeyOf = onextracallbackwithresult.keyOf(next);
            Object obj2 = linkedHashMap.get(objKeyOf);
            if (obj2 == null) {
                int i2 = asInterface + 113;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj2;
            String str2 = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + onExtraCallbackWithResult() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
            int i4 = asInterface + 29;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(access8200.onNavigationEvent(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            int i7 = 2 % 2;
        }
        this.IAuthTabCallback = linkedHashMap2;
        int i8 = asInterface + 85;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 47 / 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kt(@NotNull String str, @NotNull KClass<T> kClass, @NotNull KClass<? extends T>[] kClassArr, @NotNull KSerializer<? extends T>[] kSerializerArr, @NotNull Annotation[] annotationArr) {
        this(str, kClass, kClassArr, kSerializerArr);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClassArr, "");
        Intrinsics.checkNotNullParameter(kSerializerArr, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        this.onNavigationEvent = ArraysKt___ArraysJvmKt.asList(annotationArr);
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) this.onExtraCallback.getValue();
        int i3 = IAuthTabCallbackDefault + 83;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return serialDescriptor;
    }

    private static final SerialDescriptor onNavigationEvent(String str, final kt ktVar) {
        int i = 2 % 2;
        SerialDescriptor serialDescriptorOnExtraCallback = ujb.onExtraCallback(str, ufy.onWarmupCompleted.onNavigationEvent, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kt.onNavigationEvent(this.f$0, (qt) obj);
            }
        });
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return serialDescriptorOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(kt ktVar, qt qtVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        for (Map.Entry<String, KSerializer<? extends T>> entry : ktVar.IAuthTabCallback.entrySet()) {
            int i2 = IAuthTabCallbackDefault + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            qt.onExtraCallback(qtVar, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(final kt ktVar, qt qtVar) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 4, 2 - (Process.myPid() >> 22), new char[]{0, 65525, 4, '\t'}, false, 236 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        qt.onExtraCallback(qtVar, ((String) objArr[0]).intern(), sp.onExtraCallbackWithResult(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        SerialDescriptor serialDescriptorOnExtraCallback = ujb.onExtraCallback("kotlinx.serialization.Sealed<" + ktVar.onExtraCallbackWithResult().getSimpleName() + '>', vbt.onNavigationEvent.onExtraCallbackWithResult, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kt.onWarmupCompleted(this.f$0, (qt) obj);
            }
        });
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{65525, 0, '\t', 65529, '\n'}, false, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 230, objArr2);
        qt.onExtraCallback(qtVar, ((String) objArr2[0]).intern(), serialDescriptorOnExtraCallback, null, false, 12, null);
        qtVar.onNavigationEvent(ktVar.onNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $11 + 111;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 35125), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 23, (ViewConfiguration.getTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 54 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), AndroidCharacter.getMirror('0') + 2119, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            int i9 = $11 + 93;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 59;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 54 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2167 - TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i13 = $11 + 125;
        $10 = i13 % 128;
        int i14 = i13 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = super.onExtraCallbackWithResult(r4, r5);
        r5 = o.kt.asInterface + 17;
        o.kt.IAuthTabCallbackDefault = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r1 = r1;
        r4 = o.kt.asInterface + 113;
        o.kt.IAuthTabCallbackDefault = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // o.xf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jp<T> onExtraCallbackWithResult(@NotNull yw ywVar, @Nullable String str) {
        KSerializer<? extends T> kSerializer;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 39;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(ywVar, "");
            kSerializer = this.IAuthTabCallback.get(str);
            int i3 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(ywVar, "");
            kSerializer = this.IAuthTabCallback.get(str);
        }
    }

    @Override // o.xf
    public py<T> onWarmupCompleted(@NotNull Encoder encoder, @NotNull T t) {
        KSerializer<? extends T> kSerializerOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        KSerializer<? extends T> kSerializer = this.onWarmupCompleted.get(Reflection.getOrCreateKotlinClass(t.getClass()));
        if (kSerializer != null) {
            int i2 = asInterface + 103;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            kSerializerOnWarmupCompleted = kSerializer;
            int i5 = i3 + 9;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
        } else {
            kSerializerOnWarmupCompleted = super.onWarmupCompleted(encoder, (Encoder) t);
        }
        if (kSerializerOnWarmupCompleted == null) {
            return null;
        }
        int i7 = IAuthTabCallbackDefault + 51;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return kSerializerOnWarmupCompleted;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult implements access7200<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> {
        final /* synthetic */ Iterable onWarmupCompleted;

        public onExtraCallbackWithResult(Iterable iterable) {
            this.onWarmupCompleted = iterable;
        }

        @Override // o.access7200
        public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
            return this.onWarmupCompleted.iterator();
        }

        @Override // o.access7200
        public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
            return entry.getValue().getDescriptor().onExtraCallbackWithResult();
        }
    }
}
