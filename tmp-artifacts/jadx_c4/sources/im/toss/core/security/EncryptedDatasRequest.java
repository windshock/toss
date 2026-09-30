package im.toss.core.security;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tmoney.LiveCheckConstants;
import im.toss.core.security.EncryptedDatasRequest$;
import im.toss.core.security.ImageEncryptedData$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda0;
import o.DefaultGainProviderBuilderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DefaultGainProviderExternalSyntheticLambda3;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EncryptedDatasRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 1;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;
    private ImageEncryptedData data;
    private String iv;
    private String key;

    static {
        onWarmupCompleted();
        Companion = new Companion(null);
        int i = asInterface + 39;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof EncryptedDatasRequest)) {
            return false;
        }
        EncryptedDatasRequest encryptedDatasRequest = (EncryptedDatasRequest) obj;
        if (!Intrinsics.areEqual(this.key, encryptedDatasRequest.key)) {
            int i4 = IAuthTabCallbackStub + 43;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.iv, encryptedDatasRequest.iv)) {
            int i5 = IAuthTabCallbackStub + 103;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.data, encryptedDatasRequest.data)) {
            return true;
        }
        int i7 = IAuthTabCallbackDefault + 17;
        IAuthTabCallbackStub = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.key.hashCode() * 31) + this.iv.hashCode()) * 31) + this.data.hashCode();
        int i4 = IAuthTabCallbackDefault + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.key;
        String str2 = this.iv;
        ImageEncryptedData imageEncryptedData = this.data;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{46382, 29832, 9099, 55015, 34979, 47268, 12924, 58175, 13232, 33007, 44088, 37216, 839, 55674, 31678, 37633, 45143, 53497, 26844, 42871, 5199, 53895, 47591, 16876, 35712, 53233}, 26 - Color.argb(0, 0, 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new char[]{14426, 17843, 39950, 12350, 29931, 60348}, View.MeasureSpec.getMode(0) + 5, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(new char[]{14426, 17843, 55964, 56530, 11719, 44720, 29931, 60348}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(imageEncryptedData);
        Object[] objArr4 = new Object[1];
        a(new char[]{45856, 57488}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EncryptedDatasRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                EncryptedDatasRequest$.serializer serializerVar = EncryptedDatasRequest$.serializer.INSTANCE;
                throw null;
            }
            EncryptedDatasRequest$.serializer serializerVar2 = EncryptedDatasRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ EncryptedDatasRequest(int i, String str, String str2, ImageEncryptedData imageEncryptedData, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = IAuthTabCallbackStub + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, EncryptedDatasRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallbackStub + 5;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.key = str;
        this.iv = str2;
        this.data = imageEncryptedData;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(EncryptedDatasRequest encryptedDatasRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, encryptedDatasRequest.key);
            vylVar.onExtraCallback(serialDescriptor, 0, encryptedDatasRequest.iv);
            vylVar.onNavigationEvent(serialDescriptor, 3, ImageEncryptedData$.serializer.INSTANCE, encryptedDatasRequest.data);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, encryptedDatasRequest.key);
            vylVar.onExtraCallback(serialDescriptor, 1, encryptedDatasRequest.iv);
            vylVar.onNavigationEvent(serialDescriptor, 2, ImageEncryptedData$.serializer.INSTANCE, encryptedDatasRequest.data);
        }
        int i3 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 19;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 43;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 11;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                        int i14 = 12434 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, packedPositionGroup, i14, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 10, 12434 - View.resolveSize(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.normalizeMetaState(0)), 14 - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
        int i4 = IAuthTabCallbackStub + 57;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) throws ClassNotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 697);
        Class<?> cls = Class.forName("im.toss.core.security.ImageEncryptedData");
        ImageEncryptedData imageEncryptedData = this.data;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, cls, imageEncryptedData).write(jsonWriter, imageEncryptedData);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 487);
        jsonWriter.value(this.iv);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 109);
        jsonWriter.value(this.key);
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ EncryptedDatasRequest() {
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        jsonReader.beginObject();
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        while (!(!jsonReader.hasNext())) {
            onNavigationEvent(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
        int i6 = IAuthTabCallbackStub + 53;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
    }

    protected /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, int i) {
        int i2 = 2 % 2;
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 132) {
            if (!z) {
                this.key = null;
                jsonReader.nextNull();
                return;
            } else {
                if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.key = Boolean.toString(jsonReader.nextBoolean());
                    return;
                }
                int i3 = IAuthTabCallbackStub + 123;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                this.key = jsonReader.nextString();
                return;
            }
        }
        if (i == 618) {
            if (z) {
                this.data = (ImageEncryptedData) gson.getAdapter(Class.forName("im.toss.core.security.ImageEncryptedData")).read(jsonReader);
                return;
            } else {
                this.data = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 791) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.iv = null;
            jsonReader.nextNull();
            return;
        }
        int i5 = IAuthTabCallbackStub + 55;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.iv = jsonReader.nextString();
        } else {
            this.iv = Boolean.toString(jsonReader.nextBoolean());
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = (char) 9246;
        onExtraCallback = (char) 18301;
        onExtraCallbackWithResult = (char) 65495;
        onWarmupCompleted = (char) 50274;
    }
}
