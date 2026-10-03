package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CompressedData implements Parcelable, UST_CERT_VerifyEnvelopeVID {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 8;
    public static final Parcelable.Creator<CompressedData> CREATOR;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    @SerializedName("signCert")
    private String _signCert;

    @SerializedName("signPri")
    private String _signPri;

    @SerializedName("signPw")
    private String _signPw;

    @SerializedName("vendorId")
    private Integer _vendorId;
    private Map<String, Object> debugInfo;

    public static final class onExtraCallback implements Parcelable.Creator<CompressedData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CompressedData[] newArray(int i) {
            return new CompressedData[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CompressedData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CompressedData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    static {
        onTransact();
        CREATOR = new onExtraCallback();
        int i = onExtraCallbackWithResult + 51;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public CompressedData() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this._vendorId;
        if (num == null) {
            int i3 = asBinder + 99;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        int i5 = asBinder + 117;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        parcel.writeString(this._signCert);
        parcel.writeString(this._signPri);
        parcel.writeString(this._signPw);
    }

    public CompressedData(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) throws Throwable {
        Integer numValueOf;
        Integer numValueOf2;
        this._vendorId = num;
        this._signCert = str;
        this._signPri = str2;
        this._signPw = str3;
        Object[] objArr = new Object[1];
        Integer numValueOf3 = null;
        a(null, null, new byte[]{-127}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), num);
        String str4 = this._signCert;
        if (str4 != null) {
            numValueOf = Integer.valueOf(str4.length());
            int i = 2 % 2;
        } else {
            int i2 = asBinder + 45;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            numValueOf = null;
        }
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-126}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, objArr2);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), numValueOf);
        String str5 = this._signPri;
        if (str5 != null) {
            int i5 = onTransact + 101;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            numValueOf2 = Integer.valueOf(str5.length());
        } else {
            numValueOf2 = null;
        }
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-125}, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), numValueOf2);
        String str6 = this._signPw;
        if (str6 != null) {
            numValueOf3 = Integer.valueOf(str6.length());
            int i7 = onTransact + 39;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
        }
        this.debugInfo = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("3", numValueOf3)});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CompressedData(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        num = (i & 1) != 0 ? 0 : num;
        if ((i & 2) != 0) {
            int i2 = onTransact + 109;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
            str = "";
        }
        str2 = (i & 4) != 0 ? "" : str2;
        if ((i & 8) != 0) {
            int i8 = asBinder + 77;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            str3 = "";
        }
        this(num, str, str2, str3);
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this._vendorId;
        if (num == null) {
            return 0;
        }
        int i5 = i2 + 109;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        int iIntValue = num.intValue();
        int i7 = asBinder + 51;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return iIntValue;
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        this._vendorId = Integer.valueOf(i);
        int i5 = asBinder + 51;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this._signCert;
        if (str == null) {
            str = "";
        }
        int i4 = i3 + 3;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this._signCert = str;
        int i4 = asBinder + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 19;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this._signPri;
        if (str != null) {
            return str;
        }
        int i5 = i2 + 97;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this._signPri = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this._signPri = str;
        int i3 = asBinder + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public UST_CMP_Issue_Close onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UST_CMP_Issue_Close uST_CMP_Issue_Close = UST_CMP_Issue_Close.CERT;
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return uST_CMP_Issue_Close;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public UST_CMP_IssueCertificate_SendConf IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        UST_CMP_IssueCertificate_SendConf uST_CMP_IssueCertificate_SendConf = UST_CMP_IssueCertificate_SendConf.CARD;
        int i4 = asBinder + 33;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return uST_CMP_IssueCertificate_SendConf;
    }

    @Override // o.UST_CERT_VerifyEnvelopeVID
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = asBinder + 21;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return iOnExtraCallbackWithResult;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardCertLogin(" + onExtraCallbackWithResult() + ")";
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 78 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 20952 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 75 - TextUtils.indexOf("", ""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (!(!onWarmupCompleted)) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $11 + 103;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] % iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 62 - TextUtils.indexOf((CharSequence) "", '0'), 12215 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64, 12215 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 12214 - (Process.myPid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i7 = $10 + 65;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    public /* synthetic */ void onWarmupCompleted(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        jsonWriter.beginObject();
        onExtraCallbackWithResult(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
        int i4 = asBinder + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 344);
        jsonWriter.value(this._signCert);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 570);
        jsonWriter.value(this._signPri);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 218);
        jsonWriter.value(this._signPw);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 847);
        Integer num = this._vendorId;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Integer.class, num).write(jsonWriter, num);
        if (this != this.debugInfo) {
            defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 576);
            ContentInfo contentInfo = new ContentInfo();
            Map<String, Object> map = this.debugInfo;
            DefaultGainProviderBuilderExternalSyntheticLambda0.onExtraCallback(gson, contentInfo, map).write(jsonWriter, map);
        }
        int i4 = onTransact + 45;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        int i = 2 % 2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i2 = asBinder + 105;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
            int i4 = asBinder + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        int i2 = 2 % 2;
        boolean z = jsonReader.peek() != JsonToken.NULL;
        Object obj = null;
        if (i == 15) {
            if (!z) {
                this._signPri = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this._signPri = jsonReader.nextString();
                return;
            } else {
                this._signPri = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 228) {
            if (z) {
                this.debugInfo = (Map) gson.getAdapter(new ContentInfo()).read(jsonReader);
                return;
            } else {
                this.debugInfo = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 352) {
            if (!z) {
                this._signCert = null;
                jsonReader.nextNull();
                return;
            }
            int i3 = asBinder + 55;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this._signCert = jsonReader.nextString();
                return;
            } else {
                this._signCert = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i != 687) {
            if (i != 714) {
                jsonReader.skipValue();
                return;
            } else if (z) {
                this._vendorId = (Integer) gson.getAdapter(Integer.class).read(jsonReader);
                return;
            } else {
                this._vendorId = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (!z) {
            this._signPw = null;
            jsonReader.nextNull();
            return;
        }
        int i5 = onTransact + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        if (jsonReader.peek() == JsonToken.BOOLEAN) {
            this._signPw = Boolean.toString(jsonReader.nextBoolean());
            return;
        }
        int i7 = onTransact + 37;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            this._signPw = jsonReader.nextString();
        } else {
            this._signPw = jsonReader.nextString();
            obj.hashCode();
            throw null;
        }
    }

    static void onTransact() {
        onExtraCallback = new char[]{32586, 32585, 32584};
        onNavigationEvent = -1184334022;
        IAuthTabCallback = true;
        onWarmupCompleted = true;
    }
}
