package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ResizeOptionsCompanion {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("cancelButton")
    private ImagePipelineExternalSyntheticLambda4 cancelButton;

    @SerializedName("confirmButton")
    private ImagePipelineExternalSyntheticLambda4 confirmButton;

    @SerializedName("impressionLogId")
    private Long impressionLogId;

    @SerializedName("message")
    private String message;

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private IAuthTabCallback type;

    public ResizeOptionsCompanion() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return true;
        }
        if (!(obj instanceof ResizeOptionsCompanion)) {
            return false;
        }
        ResizeOptionsCompanion resizeOptionsCompanion = (ResizeOptionsCompanion) obj;
        if (!Intrinsics.areEqual(this.message, resizeOptionsCompanion.message)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.title, resizeOptionsCompanion.title)) {
            int i4 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.confirmButton, resizeOptionsCompanion.confirmButton)) {
            int i6 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.cancelButton, resizeOptionsCompanion.cancelButton)) {
            int i7 = onWarmupCompleted + 83;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.impressionLogId, resizeOptionsCompanion.impressionLogId)) {
            return this.type == resizeOptionsCompanion.type;
        }
        int i9 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r1 r3 r4
      0x003b: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r4v6 o.ImagePipelineExternalSyntheticLambda4) = (r4v0 o.ImagePipelineExternalSyntheticLambda4), (r4v8 o.ImagePipelineExternalSyntheticLambda4) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1 r3
      0x0030: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x002e, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.ResizeOptionsCompanion.onExtraCallbackWithResult
            int r1 = r1 + 25
            int r2 = r1 % 128
            o.ResizeOptionsCompanion.onWarmupCompleted = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.String r1 = r7.message
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.title
            int r3 = r3.hashCode()
            o.ImagePipelineExternalSyntheticLambda4 r4 = r7.confirmButton
            if (r4 != 0) goto L3b
            goto L30
        L20:
            java.lang.String r1 = r7.message
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.title
            int r3 = r3.hashCode()
            o.ImagePipelineExternalSyntheticLambda4 r4 = r7.confirmButton
            if (r4 != 0) goto L3b
        L30:
            int r4 = o.ResizeOptionsCompanion.onExtraCallbackWithResult
            int r4 = r4 + 61
            int r5 = r4 % 128
            o.ResizeOptionsCompanion.onWarmupCompleted = r5
            int r4 = r4 % r0
            r4 = r2
            goto L3f
        L3b:
            int r4 = r4.hashCode()
        L3f:
            o.ImagePipelineExternalSyntheticLambda4 r5 = r7.cancelButton
            if (r5 != 0) goto L52
            int r5 = o.ResizeOptionsCompanion.onExtraCallbackWithResult
            int r5 = r5 + 81
            int r6 = r5 % 128
            o.ResizeOptionsCompanion.onWarmupCompleted = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L50
            r0 = 1
            goto L56
        L50:
            r0 = r2
            goto L56
        L52:
            int r0 = r5.hashCode()
        L56:
            java.lang.Long r5 = r7.impressionLogId
            if (r5 == 0) goto L5e
            int r2 = r5.hashCode()
        L5e:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            o.ResizeOptionsCompanion$IAuthTabCallback r0 = r7.type
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ResizeOptionsCompanion.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ErrorInfo(message=" + this.message + ", title=" + this.title + ", confirmButton=" + this.confirmButton + ", cancelButton=" + this.cancelButton + ", impressionLogId=" + this.impressionLogId + ", type=" + this.type + ")";
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ResizeOptionsCompanion(@NotNull String str, @NotNull String str2, @Nullable ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4, @Nullable ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda42, @Nullable Long l, @NotNull IAuthTabCallback iAuthTabCallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.message = str;
        this.title = str2;
        this.confirmButton = imagePipelineExternalSyntheticLambda4;
        this.cancelButton = imagePipelineExternalSyntheticLambda42;
        this.impressionLogId = l;
        this.type = iAuthTabCallback;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResizeOptionsCompanion(String str, String str2, ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4, ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda42, Long l, IAuthTabCallback iAuthTabCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda43;
        String str3 = "";
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str3 = str2;
        }
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda44 = (i & 4) != 0 ? null : imagePipelineExternalSyntheticLambda4;
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 0;
            }
            int i9 = 2 % 2;
            imagePipelineExternalSyntheticLambda43 = null;
        } else {
            imagePipelineExternalSyntheticLambda43 = imagePipelineExternalSyntheticLambda42;
        }
        Long l2 = (i & 16) == 0 ? l : null;
        if ((i & 32) != 0) {
            int i10 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            iAuthTabCallback = IAuthTabCallback.UNKNOWN;
            int i12 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        }
        this(str, str3, imagePipelineExternalSyntheticLambda44, imagePipelineExternalSyntheticLambda43, l2, iAuthTabCallback);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i2 + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImagePipelineExternalSyntheticLambda4 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4 = this.confirmButton;
        int i4 = i3 + 69;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return imagePipelineExternalSyntheticLambda4;
        }
        obj.hashCode();
        throw null;
    }

    public final ImagePipelineExternalSyntheticLambda4 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4 = this.cancelButton;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return imagePipelineExternalSyntheticLambda4;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Long l = this.impressionLogId;
        int i5 = i3 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final IAuthTabCallback asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = this.type;
        int i5 = i2 + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback DIALOG;
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback TEXT;
        public static final IAuthTabCallback TOAST;
        public static final IAuthTabCallback UNKNOWN;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static char[] onWarmupCompleted;

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            IAuthTabCallback[] iAuthTabCallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback iAuthTabCallback = TEXT;
                IAuthTabCallback iAuthTabCallback2 = DIALOG;
                IAuthTabCallback iAuthTabCallback3 = TOAST;
                IAuthTabCallback iAuthTabCallback4 = UNKNOWN;
                iAuthTabCallbackArr = new IAuthTabCallback[5];
                iAuthTabCallbackArr[0] = iAuthTabCallback;
                iAuthTabCallbackArr[1] = iAuthTabCallback2;
                iAuthTabCallbackArr[3] = iAuthTabCallback3;
                iAuthTabCallbackArr[2] = iAuthTabCallback4;
            } else {
                iAuthTabCallbackArr = new IAuthTabCallback[]{TEXT, DIALOG, TOAST, UNKNOWN};
            }
            int i4 = i2 + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            EnumEntries<IAuthTabCallback> enumEntries;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                enumEntries = $ENTRIES;
                int i4 = 51 / 0;
            } else {
                enumEntries = $ENTRIES;
            }
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onNavigationEvent + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            onNavigationEvent();
            TEXT = new IAuthTabCallback("TEXT", 0);
            DIALOG = new IAuthTabCallback("DIALOG", 1);
            TOAST = new IAuthTabCallback("TOAST", 2);
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 16, 1}, false, new byte[]{0, 1, 1, 1, 1, 1, 0}, objArr);
            UNKNOWN = new IAuthTabCallback(((String) objArr[0]).intern(), 3);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 13;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onWarmupCompleted;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.indexOf("", "")), ExpandableListView.getPackedPositionGroup(0L) + 35, 14239 - TextUtils.getTrimmedLength(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        int i7 = $10 + 39;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i9 = $10 + 29;
                    $11 = i9 % 128;
                    if (i9 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17657 - View.MeasureSpec.getSize(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.getDefaultSize(0, 0)), 65 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0')), 70 - View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i12 = $10 + 29;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    char[] cArr5 = new char[i3];
                    System.arraycopy(cArr3, 1, cArr5, 1, i3);
                    System.arraycopy(cArr5, 0, cArr3, i3 - i5, i5);
                    System.arraycopy(cArr5, i5, cArr3, 0, i3 << i5);
                } else {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i13 = i3 - i5;
                    System.arraycopy(cArr6, 0, cArr3, i13, i5);
                    System.arraycopy(cArr6, i5, cArr3, 0, i13);
                }
            }
            if (z) {
                char[] cArr7 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                int i14 = $11 + 81;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 5 / 3;
                }
                cArr3 = cArr7;
            }
            if (i4 > 0) {
                int i16 = $10 + 117;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        static void onNavigationEvent() {
            onWarmupCompleted = new char[]{27233, 27183, 27183, 27154, 27154, 27152, 27181};
        }
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        IAuthTabCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 48);
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda4 = this.cancelButton;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ImagePipelineExternalSyntheticLambda4.class, imagePipelineExternalSyntheticLambda4).write(jsonWriter, imagePipelineExternalSyntheticLambda4);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 788);
        ImagePipelineExternalSyntheticLambda4 imagePipelineExternalSyntheticLambda42 = this.confirmButton;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ImagePipelineExternalSyntheticLambda4.class, imagePipelineExternalSyntheticLambda42).write(jsonWriter, imagePipelineExternalSyntheticLambda42);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 542);
        Long l = this.impressionLogId;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Long.class, l).write(jsonWriter, l);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 848);
        jsonWriter.value(this.message);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 131);
        jsonWriter.value(this.title);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 849);
        IAuthTabCallback iAuthTabCallback = this.type;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, IAuthTabCallback.class, iAuthTabCallback).write(jsonWriter, iAuthTabCallback);
    }

    public /* synthetic */ void onNavigationEvent(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            onExtraCallbackWithResult(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 311) {
            if (z) {
                this.type = (IAuthTabCallback) gson.getAdapter(IAuthTabCallback.class).read(jsonReader);
                return;
            } else {
                this.type = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 443) {
            if (z) {
                this.confirmButton = (ImagePipelineExternalSyntheticLambda4) gson.getAdapter(ImagePipelineExternalSyntheticLambda4.class).read(jsonReader);
                return;
            } else {
                this.confirmButton = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 450) {
            if (z) {
                this.cancelButton = (ImagePipelineExternalSyntheticLambda4) gson.getAdapter(ImagePipelineExternalSyntheticLambda4.class).read(jsonReader);
                return;
            } else {
                this.cancelButton = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 530) {
            if (!z) {
                this.message = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.message = jsonReader.nextString();
                return;
            } else {
                this.message = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 610) {
            if (z) {
                this.impressionLogId = (Long) gson.getAdapter(Long.class).read(jsonReader);
                return;
            } else {
                this.impressionLogId = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 806) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.title = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.title = jsonReader.nextString();
        } else {
            this.title = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}
