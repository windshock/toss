package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.internal.ICustomTabsService;
import com.facebook.internal.mayLaunchUrl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.acquireTempRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dispatchDependentViewsChanged implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Parcelable.Creator<dispatchDependentViewsChanged> CREATOR;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int access100;
    private static char asInterface;
    private static final String onNavigationEvent;
    private static char[] onTransact;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final Uri IAuthTabCallbackStub;
    private final String asBinder;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final Uri onWarmupCompleted;

    @JvmStatic
    public static final void onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = access100 + 121;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Companion.IAuthTabCallback();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final dispatchDependentViewsChanged onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = access100 + 3;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        dispatchDependentViewsChanged dispatchdependentviewschangedOnNavigationEvent = Companion.onNavigationEvent();
        int i5 = IAuthTabCallback_Parcel + 79;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return dispatchdependentviewschangedOnNavigationEvent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        int i2 = 2 % 2;
        int i3 = access100 + 75;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ dispatchDependentViewsChanged(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public static final /* synthetic */ String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = access100 + 17;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    public dispatchDependentViewsChanged(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Uri uri, @Nullable Uri uri2) {
        ICustomTabsService.onExtraCallback(str, TtmlNode.ATTR_ID);
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.IAuthTabCallbackDefault = str3;
        this.IAuthTabCallback = str4;
        this.asBinder = str5;
        this.onWarmupCompleted = uri;
        this.IAuthTabCallbackStub = uri2;
    }

    public static final class IAuthTabCallback {

        public static final class onWarmupCompleted implements mayLaunchUrl.onExtraCallback {
            private static final byte[] $$a = {120, -46, -95, -23};
            private static final int $$b = 75;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private static long onExtraCallbackWithResult = 7798559133331975163L;
            private static int onNavigationEvent = -1776194565;
            private static char IAuthTabCallback = 10256;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(byte b, byte b2, short s) {
                int i2;
                int i3;
                int i4 = 1 - (s * 3);
                int i5 = b2 + 109;
                int i6 = 4 - (b * 2);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i4];
                if (bArr == null) {
                    int i7 = i6;
                    int i8 = i4;
                    int i9 = 0;
                    int i10 = i6 + i8;
                    int i11 = i7 + 1;
                    i2 = i9;
                    i5 = i10;
                    i6 = i11;
                    bArr2[i2] = (byte) i5;
                    i3 = i2 + 1;
                    if (i3 == i4) {
                        return new String(bArr2, 0);
                    }
                    int i12 = i5;
                    i7 = i6;
                    i6 = bArr[i6];
                    i9 = i3;
                    i8 = i12;
                    int i102 = i6 + i8;
                    int i112 = i7 + 1;
                    i2 = i9;
                    i5 = i102;
                    i6 = i112;
                    bArr2[i2] = (byte) i5;
                    i3 = i2 + 1;
                    if (i3 == i4) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i5;
                    i3 = i2 + 1;
                    if (i3 == i4) {
                    }
                }
            }

            private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i5 = $11 + 43;
                    $10 = i5 % 128;
                    int i6 = i5 % i3;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b + 1);
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), View.resolveSizeAndState(0, 0, 0) + 43, 1451 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                            if (objOnExtraCallback2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 49123), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43, 1493 - MotionEvent.axisFromString(""), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 50, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - Color.alpha(0)), 29 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTapTimeout() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                    int i7 = $11 + 89;
                                    $10 = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        int i8 = 3 % 2;
                                    }
                                    i3 = 2;
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
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            onWarmupCompleted() {
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onExtraCallbackWithResult(@Nullable JSONObject jSONObject) throws Throwable {
                String strOptString;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 11;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 8 / 0;
                    strOptString = jSONObject != null ? jSONObject.optString(TtmlNode.ATTR_ID) : null;
                } else if (jSONObject != null) {
                }
                if (strOptString != null) {
                    String strOptString2 = jSONObject.optString("link");
                    String strOptString3 = jSONObject.optString("profile_picture", null);
                    String strOptString4 = jSONObject.optString("first_name");
                    String strOptString5 = jSONObject.optString("middle_name");
                    String strOptString6 = jSONObject.optString("last_name");
                    Object[] objArr = new Object[1];
                    a((char) (3204 - Gravity.getAbsoluteGravity(0, 0)), Color.alpha(0), new char[]{1083, 22715, 4569, 53910}, new char[]{0, 0, 0, 0}, new char[]{63346, 57629, 33985, 17676}, objArr);
                    dispatchDependentViewsChanged.Companion.IAuthTabCallback(new dispatchDependentViewsChanged(strOptString, strOptString4, strOptString5, strOptString6, jSONObject.optString(((String) objArr[0]).intern()), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
                    int i5 = onExtraCallback + 65;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                int i7 = onWarmupCompleted + 3;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                dispatchDependentViewsChanged.IAuthTabCallback();
            }

            public void onNavigationEvent(@Nullable layoutChildWithAnchor layoutchildwithanchor) {
                int i2 = 2 % 2;
                dispatchDependentViewsChanged.IAuthTabCallback();
                Objects.toString(layoutchildwithanchor);
                int i3 = onExtraCallback + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        private IAuthTabCallback() {
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final dispatchDependentViewsChanged onNavigationEvent() {
            return getChildRect.Companion.onNavigationEvent().IAuthTabCallback();
        }

        @JvmStatic
        public final void IAuthTabCallback(@Nullable dispatchDependentViewsChanged dispatchdependentviewschanged) {
            getChildRect.Companion.onNavigationEvent().onNavigationEvent(dispatchdependentviewschanged);
        }

        @JvmStatic
        public final void IAuthTabCallback() {
            acquireTempRect.onWarmupCompleted onwarmupcompleted = acquireTempRect.Companion;
            acquireTempRect acquiretemprectOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
            if (acquiretemprectOnNavigationEvent != null) {
                if (!onwarmupcompleted.onExtraCallback()) {
                    IAuthTabCallback(null);
                } else {
                    mayLaunchUrl.onExtraCallback(acquiretemprectOnNavigationEvent.IAuthTabCallback_Parcel(), new onWarmupCompleted());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        String str;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dispatchDependentViewsChanged)) {
            int i3 = access100 + 115;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        String str2 = this.onExtraCallback;
        if (((str2 == null && ((dispatchDependentViewsChanged) obj).onExtraCallback == null) || Intrinsics.areEqual(str2, ((dispatchDependentViewsChanged) obj).onExtraCallback)) && (((str = this.onExtraCallbackWithResult) == null && ((dispatchDependentViewsChanged) obj).onExtraCallbackWithResult == null) || Intrinsics.areEqual(str, ((dispatchDependentViewsChanged) obj).onExtraCallbackWithResult))) {
            String str3 = this.IAuthTabCallbackDefault;
            if (str3 == null) {
                int i5 = IAuthTabCallback_Parcel + 63;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                if (((dispatchDependentViewsChanged) obj).IAuthTabCallbackDefault != null) {
                    if (Intrinsics.areEqual(str3, ((dispatchDependentViewsChanged) obj).IAuthTabCallbackDefault)) {
                        String str4 = this.IAuthTabCallback;
                        if (str4 == null) {
                            int i7 = IAuthTabCallback_Parcel + 59;
                            access100 = i7 % 128;
                            int i8 = i7 % 2;
                            if (((dispatchDependentViewsChanged) obj).IAuthTabCallback != null) {
                                if (Intrinsics.areEqual(str4, ((dispatchDependentViewsChanged) obj).IAuthTabCallback)) {
                                    String str5 = this.asBinder;
                                    if (str5 == null) {
                                        int i9 = IAuthTabCallback_Parcel + 23;
                                        access100 = i9 % 128;
                                        int i10 = i9 % 2;
                                        if (((dispatchDependentViewsChanged) obj).asBinder != null) {
                                            if (Intrinsics.areEqual(str5, ((dispatchDependentViewsChanged) obj).asBinder)) {
                                                Uri uri = this.onWarmupCompleted;
                                                Object obj2 = null;
                                                if (uri == null) {
                                                    int i11 = IAuthTabCallback_Parcel + 97;
                                                    access100 = i11 % 128;
                                                    if (i11 % 2 != 0) {
                                                        Uri uri2 = ((dispatchDependentViewsChanged) obj).onWarmupCompleted;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    if (((dispatchDependentViewsChanged) obj).onWarmupCompleted != null) {
                                                        if (Intrinsics.areEqual(uri, ((dispatchDependentViewsChanged) obj).onWarmupCompleted)) {
                                                            Uri uri3 = this.IAuthTabCallbackStub;
                                                            if ((uri3 == null && ((dispatchDependentViewsChanged) obj).IAuthTabCallbackStub == null) || Intrinsics.areEqual(uri3, ((dispatchDependentViewsChanged) obj).IAuthTabCallbackStub)) {
                                                                int i12 = IAuthTabCallback_Parcel + 11;
                                                                access100 = i12 % 128;
                                                                if (i12 % 2 == 0) {
                                                                    return true;
                                                                }
                                                                obj2.hashCode();
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        String str = this.onExtraCallback;
        int iHashCode = 0;
        if (str != null) {
            int i3 = IAuthTabCallback_Parcel + 83;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
                iHashCode = str.hashCode();
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            int i5 = IAuthTabCallback_Parcel + 73;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        int iHashCode2 = iHashCode + 527;
        String str2 = this.onExtraCallbackWithResult;
        if (str2 != null) {
            iHashCode2 = (iHashCode2 * 31) + str2.hashCode();
        }
        String str3 = this.IAuthTabCallbackDefault;
        if (str3 != null) {
            iHashCode2 = (iHashCode2 * 31) + str3.hashCode();
            int i7 = access100 + 89;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        String str4 = this.IAuthTabCallback;
        if (str4 != null) {
            int i9 = IAuthTabCallback_Parcel + 49;
            access100 = i9 % 128;
            iHashCode2 = i9 % 2 != 0 ? (iHashCode2 * 111) >>> str4.hashCode() : (iHashCode2 * 31) + str4.hashCode();
        }
        String str5 = this.asBinder;
        if (str5 != null) {
            iHashCode2 = (iHashCode2 * 31) + str5.hashCode();
        }
        Uri uri = this.onWarmupCompleted;
        if (uri != null) {
            int i10 = IAuthTabCallback_Parcel + 125;
            access100 = i10 % 128;
            iHashCode2 = i10 % 2 != 0 ? (iHashCode2 - 93) / uri.hashCode() : (iHashCode2 * 31) + uri.hashCode();
        }
        Uri uri2 = this.IAuthTabCallbackStub;
        if (uri2 != null) {
            iHashCode2 = (iHashCode2 * 31) + uri2.hashCode();
            int i11 = IAuthTabCallback_Parcel + 79;
            access100 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 5;
            }
        }
        return iHashCode2;
    }

    public final JSONObject onExtraCallback() throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.onExtraCallback);
            jSONObject.put("first_name", this.onExtraCallbackWithResult);
            jSONObject.put("middle_name", this.IAuthTabCallbackDefault);
            jSONObject.put("last_name", this.IAuthTabCallback);
            Object[] objArr = new Object[1];
            a(new char[]{2, 3, 0, 1}, (byte) (103 - (ViewConfiguration.getPressedStateDuration() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr);
            jSONObject.put(((String) objArr[0]).intern(), this.asBinder);
            Uri uri = this.onWarmupCompleted;
            if (uri != null) {
                int i3 = access100 + 59;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    jSONObject.put("link_uri", uri.toString());
                    int i4 = 51 / 0;
                } else {
                    jSONObject.put("link_uri", uri.toString());
                }
            }
            Uri uri2 = this.IAuthTabCallbackStub;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            int i5 = IAuthTabCallback_Parcel + 79;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public dispatchDependentViewsChanged(@NotNull JSONObject jSONObject) throws Throwable {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Uri uri = null;
        this.onExtraCallback = jSONObject.optString(TtmlNode.ATTR_ID, null);
        this.onExtraCallbackWithResult = jSONObject.optString("first_name", null);
        this.IAuthTabCallbackDefault = jSONObject.optString("middle_name", null);
        this.IAuthTabCallback = jSONObject.optString("last_name", null);
        Object[] objArr = new Object[1];
        a(new char[]{2, 3, 0, 1}, (byte) (103 - ExpandableListView.getPackedPositionType(0L)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr);
        this.asBinder = jSONObject.optString(((String) objArr[0]).intern(), null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.onWarmupCompleted = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        if (strOptString2 != null) {
            uri = Uri.parse(strOptString2);
            int i2 = IAuthTabCallback_Parcel + 107;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
            }
            this.IAuthTabCallbackStub = uri;
        }
        int i3 = IAuthTabCallback_Parcel + 65;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 2 % 2;
        this.IAuthTabCallbackStub = uri;
    }

    private dispatchDependentViewsChanged(Parcel parcel) {
        Uri uri;
        this.onExtraCallback = parcel.readString();
        this.onExtraCallbackWithResult = parcel.readString();
        this.IAuthTabCallbackDefault = parcel.readString();
        this.IAuthTabCallback = parcel.readString();
        this.asBinder = parcel.readString();
        String string = parcel.readString();
        Uri uri2 = null;
        if (string != null) {
            uri = Uri.parse(string);
        } else {
            int i2 = IAuthTabCallback_Parcel + 123;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            uri = null;
        }
        this.onWarmupCompleted = uri;
        String string2 = parcel.readString();
        if (string2 == null) {
            int i4 = IAuthTabCallback_Parcel + 93;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            uri2 = Uri.parse(string2);
        }
        this.IAuthTabCallbackStub = uri2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        String string;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.IAuthTabCallbackDefault);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.asBinder);
        Uri uri = this.onWarmupCompleted;
        String string2 = null;
        if (uri != null) {
            int i6 = access100 + 19;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                uri.toString();
                string2.hashCode();
                throw null;
            }
            string = uri.toString();
        } else {
            string = null;
        }
        parcel.writeString(string);
        Uri uri2 = this.IAuthTabCallbackStub;
        if (uri2 != null) {
            string2 = uri2.toString();
            int i7 = access100 + 33;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        parcel.writeString(string2);
    }

    static {
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        String simpleName = dispatchDependentViewsChanged.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        onNavigationEvent = simpleName;
        CREATOR = new onWarmupCompleted();
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onTransact;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), KeyEvent.normalizeMetaState(0) + 26, 23139 - TextUtils.getCapsMode("", 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "") + 26, 23139 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i8 = $10 + 123;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback % b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - View.MeasureSpec.getSize(0)), 74 - (ViewConfiguration.getPressedStateDuration() >> 16), 8089 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 30 - (ViewConfiguration.getLongPressTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                int i14 = $10 + 91;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i2; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static final class onWarmupCompleted implements Parcelable.Creator<dispatchDependentViewsChanged> {
        onWarmupCompleted() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public dispatchDependentViewsChanged createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new dispatchDependentViewsChanged(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public dispatchDependentViewsChanged[] newArray(int i2) {
            return new dispatchDependentViewsChanged[i2];
        }
    }

    static void onExtraCallbackWithResult() {
        onTransact = new char[]{64982, 64990, 64978, 64989};
        asInterface = (char) 51243;
    }
}
