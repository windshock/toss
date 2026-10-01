package o;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onAppOpenAdHidden {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private final onExtraCallback onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 51;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 47;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof onAppOpenAdHidden)) {
            int i7 = i3 + 111;
            IAuthTabCallbackStub = i7 % 128;
            return i7 % 2 == 0;
        }
        onAppOpenAdHidden onappopenadhidden = (onAppOpenAdHidden) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, onappopenadhidden.onNavigationEvent)) {
            int i8 = asInterface + 11;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onappopenadhidden.onExtraCallbackWithResult) || (!Intrinsics.areEqual(this.onWarmupCompleted, onappopenadhidden.onWarmupCompleted))) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, onappopenadhidden.onExtraCallback)) {
            return true;
        }
        int i10 = IAuthTabCallbackStub + 7;
        asInterface = i10 % 128;
        return i10 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallbackStub + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PortalServiceRoute(serviceName=" + this.onNavigationEvent + ", url=" + this.onExtraCallbackWithResult + ", company=" + this.onWarmupCompleted + ", bundleParams=" + this.onExtraCallback + ")";
        int i2 = asInterface + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public onAppOpenAdHidden(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallback = onextracallback;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 125;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 117;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 107;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 115;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ onAppOpenAdHidden(String str, String str2, String str3, onExtraCallback onextracallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            onextracallback = new onExtraCallback(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            int i2 = IAuthTabCallbackStub + 119;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(str, str2, str3, onextracallback);
    }

    public final onExtraCallback onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        onExtraCallback onextracallback = this.onExtraCallback;
        int i5 = i3 + 3;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return onextracallback;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final Long IAuthTabCallback;
        private final Date onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallback() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!(!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback))) {
                return Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback);
            }
            int i3 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i3 % 128;
            return i3 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            Date date = this.onExtraCallback;
            int iHashCode2 = 0;
            if (date == null) {
                int i2 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = date.hashCode();
            }
            Long l = this.IAuthTabCallback;
            if (l != null) {
                int i4 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    l.hashCode();
                    throw null;
                }
                iHashCode2 = l.hashCode();
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BundleParams(minDeployedAt=" + this.onExtraCallback + ", maxAge=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(@Nullable Date date, @Nullable Long l) {
            this.onExtraCallback = date;
            this.IAuthTabCallback = l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(Date date, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = onExtraCallbackWithResult + 87;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                date = null;
            }
            if ((i & 2) != 0) {
                int i4 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                l = null;
            }
            this(date, l);
        }

        public final Date onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Date date = this.onExtraCallback;
            int i5 = i3 + 43;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return date;
            }
            throw null;
        }

        public final Long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            Long l = this.IAuthTabCallback;
            int i5 = i3 + 67;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return l;
        }
    }

    public static final class onWarmupCompleted {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static char[] onNavigationEvent = {27170, 27292, 27269, 27294, 27250, 27191, 27191, 27191, 27181, 27139, 27158, 27178, 27160, 27142, 27156, 27171, 27198, 27197, 27254, 27196, 27194, 27197, 27197, 27199, 27199, 27197, 27173};
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[PHI: r4
          0x00a0: PHI (r4v17 java.util.List) = (r4v16 java.util.List), (r4v21 java.util.List) binds: [B:27:0x009e, B:24:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final onAppOpenAdHidden onExtraCallback(@NotNull String str) throws Throwable {
            Object obj;
            List listEmptyList;
            Pair pairIAuthTabCallback;
            List listSplit$default;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(new URI(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                int i2 = IAuthTabCallback + 81;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                obj = null;
            }
            URI uri = (URI) obj;
            if (uri == null) {
                return null;
            }
            String scheme = uri.getScheme();
            Object[] objArr = new Object[1];
            a(new int[]{18, 9, 0, 3}, true, new byte[]{0, 1, 0, 0, 0, 0, 1, 0, 1}, objArr);
            if (!Intrinsics.areEqual(scheme, ((String) objArr[0]).intern())) {
                int i4 = onWarmupCompleted + 67;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            String path = uri.getPath();
            if (path != null) {
                int i5 = onWarmupCompleted + 31;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    char[] cArr = new char[1];
                    cArr[1] = '&';
                    listSplit$default = StringsKt.split$default(path, cArr, false, 1, 23, (Object) null);
                    if (listSplit$default != null) {
                        listEmptyList = new ArrayList();
                        for (Object obj2 : listSplit$default) {
                            if (((String) obj2).length() > 0) {
                                listEmptyList.add(obj2);
                            }
                        }
                    } else {
                        listEmptyList = null;
                    }
                } else {
                    listSplit$default = StringsKt.split$default(path, new char[]{'/'}, false, 0, 6, (Object) null);
                    if (listSplit$default != null) {
                    }
                }
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (Intrinsics.areEqual(uri.getHost(), "m")) {
                int i6 = onWarmupCompleted + 9;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 4, 103, 2}, false, new byte[]{1, 1, 0, 0}, objArr2);
                pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), listEmptyList);
                int i8 = onWarmupCompleted + 19;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } else {
                if (!Intrinsics.areEqual(CollectionsKt.firstOrNull(listEmptyList), "m")) {
                    int i10 = IAuthTabCallback + 41;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                String host = uri.getHost();
                pairIAuthTabCallback = getWrite.IAuthTabCallback(host != null ? host : "", CollectionsKt.drop(listEmptyList, 1));
            }
            String str2 = (String) pairIAuthTabCallback.onExtraCallbackWithResult();
            String str3 = (String) CollectionsKt.firstOrNull((List) pairIAuthTabCallback.IAuthTabCallback());
            if (str3 == null) {
                return null;
            }
            return new onAppOpenAdHidden(str3, str, str2, null, 8, null);
        }

        public static /* synthetic */ onAppOpenAdHidden onWarmupCompleted(onWarmupCompleted onwarmupcompleted, Intent intent, long j, int i, Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 109;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
                j = DERSet.onExtraCallback.getSavedStateRegistryControllerannotations();
            }
            onAppOpenAdHidden onappopenadhiddenOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted(intent, j);
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return onappopenadhiddenOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final onAppOpenAdHidden onWarmupCompleted(@NotNull Intent intent, long j) throws Throwable {
            boolean zBooleanValue;
            long jLongValue;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(intent, "");
            String stringExtra = intent.getStringExtra("bundlePath");
            Object obj = null;
            if (stringExtra != null) {
                if (StringsKt.isBlank(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    String stringExtra2 = intent.getStringExtra("__originScheme");
                    if (stringExtra2 == null) {
                        Uri data = intent.getData();
                        if (data != null) {
                            stringExtra2 = data.toString();
                        } else {
                            int i2 = IAuthTabCallback + 59;
                            onWarmupCompleted = i2 % 128;
                            int i3 = i2 % 2;
                            stringExtra2 = null;
                        }
                        if (stringExtra2 == null) {
                            return null;
                        }
                    } else {
                        if (StringsKt.isBlank(stringExtra2)) {
                            int i4 = IAuthTabCallback + 41;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            stringExtra2 = null;
                        }
                        if (stringExtra2 == null) {
                        }
                    }
                    String stringExtra3 = intent.getStringExtra("_company");
                    if (stringExtra3 == null) {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 4, 103, 2}, false, new byte[]{1, 1, 0, 0}, objArr);
                        stringExtra3 = ((String) objArr[0]).intern();
                    }
                    String stringExtra4 = intent.getStringExtra("_remote");
                    if (stringExtra4 != null) {
                        int i6 = onWarmupCompleted + 11;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(stringExtra4);
                        zBooleanValue = booleanStrictOrNull != null ? booleanStrictOrNull.booleanValue() : false;
                    }
                    String stringExtra5 = intent.getStringExtra("_maxAge");
                    if (stringExtra5 != null) {
                        int i8 = onWarmupCompleted + 93;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            StringsKt.toLongOrNull(stringExtra5);
                            obj.hashCode();
                            throw null;
                        }
                        Long longOrNull = StringsKt.toLongOrNull(stringExtra5);
                        if (longOrNull != null) {
                            int i9 = IAuthTabCallback + 121;
                            onWarmupCompleted = i9 % 128;
                            if (i9 % 2 == 0) {
                                jLongValue = longOrNull.longValue();
                                int i10 = 81 / 0;
                            } else {
                                jLongValue = longOrNull.longValue();
                            }
                        } else {
                            jLongValue = zBooleanValue ? 0L : j;
                        }
                    }
                    Locale locale = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    Object[] objArr2 = new Object[1];
                    a(new int[]{4, 14, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, objArr2);
                    IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = new IdGeneratorExternalSyntheticLambda1(((String) objArr2[0]).intern(), locale);
                    String stringExtra6 = intent.getStringExtra("_minDeployedAt");
                    if (stringExtra6 == null) {
                        stringExtra6 = "00000000000000";
                    }
                    return new onAppOpenAdHidden(stringExtra, stringExtra2, stringExtra3, new onExtraCallback(setCampaign.onWarmupCompleted(idGeneratorExternalSyntheticLambda1, stringExtra6), Long.valueOf(jLongValue)));
                }
            }
            return null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), ExpandableListView.getPackedPositionChild(j) + 36, 14239 - Color.alpha(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
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
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                char[] cArr5 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = $10 + 25;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10934), Color.blue(0) + 65, TextUtils.lastIndexOf("", '0') + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 17656 - TextUtils.lastIndexOf("", '0', 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.combineMeasuredStates(0, 0)), 69 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 12486 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i5 > 0) {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr4, 0, cArr6, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr6, 0, cArr4, i13, i5);
                System.arraycopy(cArr6, i5, cArr4, 0, i13);
            }
            if (z) {
                int i14 = $11 + 115;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i15 = $11 + 39;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }
    }
}
