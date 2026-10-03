package o;

import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.send.v4.entity.TransferSource;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class processBytes implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback CREATOR;
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static long asBinder = 0;
    private static int asInterface = 1;
    private String onExtraCallback;
    private String onExtraCallbackWithResult;
    private String onNavigationEvent;
    private String onTransact;
    private String onWarmupCompleted;

    static {
        asInterface();
        CREATOR = new IAuthTabCallback(null);
        IAuthTabCallback = 8;
        int i = IAuthTabCallbackDefault + 101;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ processBytes(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i6)) | i4;
        int i9 = ~i6;
        int i10 = ~i4;
        int i11 = (~(i9 | i10)) | i5;
        int i12 = (~(i4 | i9 | i5)) | (~(i7 | i9 | i10)) | (~(i10 | i6 | i5));
        int i13 = i6 + i5 + i + ((-104759182) * i3) + ((-453318476) * i2);
        int i14 = i13 * i13;
        int i15 = (i6 * 1504131295) + 1805123584 + (1504131295 * i5) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i) + (711983104 * i3) + (1180696576 * i2) + (1022754816 * i14);
        int i16 = ((i6 * (-1431886989)) - 1507491630) + (i5 * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i * (-1431886867)) + (i3 * 722567050) + (i2 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 35;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
        int i4 = IAuthTabCallbackStub + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 13;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 65;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 41;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = str;
        int i4 = IAuthTabCallbackStub + 123;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 119;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 89;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        int i4 = access000 + 11;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 81;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 1;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 81;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallbackWithResult = str;
        int i4 = access000 + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        processBytes processbytes = (processBytes) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            processbytes.onTransact = str;
            int i3 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            processbytes.onTransact = str;
        }
        int i4 = IAuthTabCallbackStub + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 85;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onTransact;
        int i5 = i2 + 87;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public processBytes() throws Throwable {
        this.onExtraCallback = "";
        this.onNavigationEvent = "";
        Object[] objArr = new Object[1];
        a(new char[]{58609, 58561, 58370, 61388, 30052}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr);
        this.onWarmupCompleted = ((String) objArr[0]).intern();
        this.onExtraCallbackWithResult = "";
        this.onTransact = "";
    }

    private processBytes(Parcel parcel) throws Throwable {
        String str = "";
        this.onExtraCallback = "";
        this.onNavigationEvent = "";
        Object[] objArr = new Object[1];
        a(new char[]{58609, 58561, 58370, 61388, 30052}, View.getDefaultSize(0, 0) + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{58609, 58561, 58370, 61388, 30052}, View.MeasureSpec.getMode(0) + 1, objArr2);
        this.onWarmupCompleted = ((String) objArr2[0]).intern();
        this.onExtraCallbackWithResult = "";
        this.onTransact = "";
        String string = parcel.readString();
        if (string == null) {
            int i = access000 + 105;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 4;
            } else {
                int i3 = 2 % 2;
            }
            string = "";
        }
        this.onExtraCallback = string;
        String string2 = parcel.readString();
        this.onNavigationEvent = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        this.onWarmupCompleted = string3 != null ? string3 : strIntern;
        String string4 = parcel.readString();
        if (string4 == null) {
            int i4 = IAuthTabCallbackStub + 43;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            string4 = "";
        }
        this.onExtraCallbackWithResult = string4;
        String string5 = parcel.readString();
        if (string5 == null) {
            int i7 = IAuthTabCallbackStub + 21;
            int i8 = i7 % 128;
            access000 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 115;
            IAuthTabCallbackStub = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
        } else {
            str = string5;
        }
        this.onTransact = str;
    }

    public final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this, false}, iOnExtraCallback, 635899749, -635899749)).booleanValue();
        int i4 = IAuthTabCallbackStub + 101;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r10) throws java.lang.Throwable {
        /*
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = r10[r0]
            o.processBytes r2 = (o.processBytes) r2
            r3 = 1
            r10 = r10[r3]
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r4 = 2
            int r5 = r4 % r4
            int r5 = o.processBytes.IAuthTabCallbackStub
            int r6 = r5 + 49
            int r7 = r6 % 128
            o.processBytes.access000 = r7
            int r6 = r6 % r4
            r10 = r10 ^ r3
            r6 = 0
            if (r10 == 0) goto L42
            int r5 = r5 + 31
            int r10 = r5 % 128
            o.processBytes.access000 = r10
            int r5 = r5 % r4
            if (r5 == 0) goto L3c
            java.lang.String r10 = r2.onExtraCallback
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L42
            java.lang.String r10 = r2.onExtraCallbackWithResult
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L4a
            goto L42
        L3c:
            java.lang.String r10 = r2.onExtraCallback
            android.text.TextUtils.isEmpty(r10)
            throw r6
        L42:
            java.lang.String r10 = r2.onNavigationEvent
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L4b
        L4a:
            return r1
        L4b:
            java.lang.String r10 = r2.onWarmupCompleted
            r7 = 0
            if (r10 != 0) goto L6b
            r10 = 5
            char[] r10 = new char[r10]
            r10 = {x009e: FILL_ARRAY_DATA , data: [-6927, -6975, -7166, -4148, 30052} // fill-array
            int r5 = android.widget.ExpandableListView.getPackedPositionChild(r7)
            int r5 = -r5
            java.lang.Object[] r9 = new java.lang.Object[r3]
            a(r10, r5, r9)
            r10 = r9[r0]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r10.intern()
            r2.onWarmupCompleted = r10
        L6b:
            java.lang.String r10 = r2.onWarmupCompleted
            java.lang.Long r10 = kotlin.text.StringsKt.toLongOrNull(r10)
            if (r10 == 0) goto L87
            int r0 = o.processBytes.IAuthTabCallbackStub
            int r0 = r0 + 105
            int r2 = r0 % 128
            o.processBytes.access000 = r2
            int r0 = r0 % r4
            if (r0 == 0) goto L83
            long r7 = r10.longValue()
            goto L87
        L83:
            r10.longValue()
            throw r6
        L87:
            r5 = 2000000(0x1e8480, double:9.881313E-318)
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L98
            int r10 = o.processBytes.access000
            int r10 = r10 + 29
            int r0 = r10 % 128
            o.processBytes.IAuthTabCallbackStub = r0
            int r10 = r10 % r4
            return r1
        L98:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.processBytes.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asBinder ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 55;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asBinder)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetBefore("", 0) + 45812), 84 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - MotionEvent.axisFromString("")), 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 31;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final String onExtraCallback(@Nullable TransferSource transferSource, @NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        Object[] objArr = {onTransact(), this.onWarmupCompleted, str};
        int i4 = 0;
        Object[] objArr2 = new Object[1];
        a(new char[]{41525, 41542, 4154, 61942, 26441, 32949, 42059, 9723, 9379, 39199, 11632, 44233, 44942, 7757, 46684, 12905, 14058, 34806, 16185, 47366, 47514, 3294, 47144, 16493, '.', 30126, 705, 51038, 35619, 64136, 35774, 19987, 4730, 24613, 5254, 54719, 38266, 59738, 40373, 23690, 7180, 28270, 58956, 58300, 59058, 55077, 28538, 27329, 27024, 23581, 59466, 61543, 61686}, -ImageFormat.getBitsPerPixel(0), objArr2);
        String str2 = String.format(locale, ((String) objArr2[0]).intern(), Arrays.copyOf(objArr, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        try {
            i4 = Integer.parseInt(this.onExtraCallbackWithResult);
        } catch (NumberFormatException unused) {
        }
        if (i4 > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.getDefault(), "&bankCode=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            str2 = str2 + str3;
            int i5 = access000 + 13;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        if (transferSource == null) {
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str4 = String.format(Locale.getDefault(), "&source=%s", Arrays.copyOf(new Object[]{transferSource.getValue()}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        String str5 = str2 + str4;
        int i7 = access000 + 41;
        IAuthTabCallbackStub = i7 % 128;
        int i8 = i7 % 2;
        return str5;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 27;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strReplace$default = StringsKt.replace$default(this.onNavigationEvent, "-", "", false, 4, (Object) null);
        int i4 = IAuthTabCallbackStub + 43;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return strReplace$default;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        if (this.onExtraCallback.length() > 0) {
            str = this.onExtraCallback + " ";
            int i2 = IAuthTabCallbackStub + 29;
            access000 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 2;
            }
        } else {
            str = "";
            int i4 = IAuthTabCallbackStub + 55;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        return str + this.onNavigationEvent;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 73;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.ACCOUNT;
        int i4 = IAuthTabCallbackStub + 27;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackwithresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        if (!TextUtils.isEmpty(this.onNavigationEvent)) {
            int i2 = IAuthTabCallbackStub + 5;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                jsonObject.addProperty("bankName", this.onExtraCallback);
                jsonObject.addProperty("bankAccount", onTransact());
                jsonObject.addProperty("bankCode", this.onExtraCallbackWithResult);
            } else {
                jsonObject.addProperty("bankName", this.onExtraCallback);
                jsonObject.addProperty("bankAccount", onTransact());
                jsonObject.addProperty("bankCode", this.onExtraCallbackWithResult);
                throw null;
            }
        }
        jsonObject.addProperty("amount", this.onWarmupCompleted);
        String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i3 = access000 + 81;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onNavigationEvent);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.onTransact);
        int i5 = access000 + 83;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 97;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(processBytes.class, obj.getClass())) {
            return false;
        }
        int i4 = IAuthTabCallbackStub + 79;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        processBytes processbytes = (processBytes) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, processbytes.onExtraCallback)) {
            return false;
        }
        int i6 = access000 + 29;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return Intrinsics.areEqual(this.onNavigationEvent, processbytes.onNavigationEvent) && Intrinsics.areEqual(this.onWarmupCompleted, processbytes.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, processbytes.onExtraCallbackWithResult);
        }
        Intrinsics.areEqual(this.onNavigationEvent, processbytes.onNavigationEvent);
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iHash = Objects.hash(this.onExtraCallback, this.onNavigationEvent, this.onWarmupCompleted, this.onExtraCallbackWithResult);
        int i4 = access000 + 105;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHash;
    }

    public final onExtraCallbackWithResult asBinder() {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (onExtraCallbackWithResult) IAuthTabCallback(iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this}, iOnExtraCallback, -466158666, 466158667);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult ACCOUNT = new onExtraCallbackWithResult("ACCOUNT", 0);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            return new onExtraCallbackWithResult[]{ACCOUNT};
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            return $ENTRIES;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            return (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
        }

        public static onExtraCallbackWithResult[] values() {
            return (onExtraCallbackWithResult[]) $VALUES.clone();
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
        }
    }

    public final boolean onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return ((Boolean) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback, 635899749, -635899749)).booleanValue();
    }

    public final void IAuthTabCallback(@NotNull String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(iOnExtraCallback2, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback3, new Object[]{this, str}, iOnExtraCallback, 957847388, -957847386);
    }

    static void asInterface() {
        asBinder = -8464401227945633099L;
    }

    public static final class IAuthTabCallback implements Parcelable.Creator<processBytes> {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public processBytes createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new processBytes(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public processBytes[] newArray(int i) {
            return new processBytes[i];
        }
    }
}
