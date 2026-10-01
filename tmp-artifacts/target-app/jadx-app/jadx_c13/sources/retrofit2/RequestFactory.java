package retrofit2;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.InterfaceC0050certDecryptPrikey;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.assets;
import o.certDecryptPriKey;
import o.certFinalize;
import o.certGetAuthorityInformationAccess;
import o.getCurCert;
import o.getDirNames;
import o.getIvD;
import o.getKey4;
import o.getKeyH;
import o.getSignatureAlgorithm;
import o.getSubjectDN;
import o.getUserCert;
import o.getUserCertList;
import o.hasCert;
import o.initCertList;
import o.setBSignCertB64;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestFactory {
    private final boolean IAuthTabCallback;

    @Nullable
    private final Headers IAuthTabCallbackDefault;
    private final setBSignCertB64<?>[] IAuthTabCallbackStub;

    @Nullable
    private final String IAuthTabCallbackStubProxy;
    private final Class<?> access100;
    private final boolean asBinder;
    private final Method asInterface;
    public final boolean onExtraCallback;

    @Nullable
    private final MediaType onExtraCallbackWithResult;
    public final String onNavigationEvent;
    private final boolean onTransact;
    private final HttpUrl onWarmupCompleted;

    public static RequestFactory onWarmupCompleted(Retrofit retrofit, Class<?> cls, Method method) {
        return new Builder(retrofit, cls, method).onNavigationEvent();
    }

    RequestFactory(Builder builder) {
        this.access100 = builder.onMessageChannelReady;
        this.asInterface = builder.writeTypedObject;
        this.onWarmupCompleted = builder.onActivityResized.onExtraCallback;
        this.onNavigationEvent = builder.IAuthTabCallbackStubProxy;
        this.IAuthTabCallbackStubProxy = builder.onActivityLayout;
        this.IAuthTabCallbackDefault = builder.access000;
        this.onExtraCallbackWithResult = builder.onExtraCallback;
        this.IAuthTabCallback = builder.onTransact;
        this.asBinder = builder.IAuthTabCallback_Parcel;
        this.onTransact = builder.access100;
        this.IAuthTabCallbackStub = builder.extraCallback;
        this.onExtraCallback = builder.getInterfaceDescriptor;
    }

    public Request onWarmupCompleted(@Nullable Object obj, Object[] objArr) throws IOException {
        setBSignCertB64<?>[] setbsigncertb64Arr = this.IAuthTabCallbackStub;
        int length = objArr.length;
        if (length != setbsigncertb64Arr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + setbsigncertb64Arr.length + ")");
        }
        RequestBuilder requestBuilder = new RequestBuilder(this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallbackStubProxy, this.IAuthTabCallbackDefault, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.asBinder, this.onTransact);
        if (this.onExtraCallback) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            setbsigncertb64Arr[i].onExtraCallbackWithResult(requestBuilder, objArr[i]);
        }
        return requestBuilder.onWarmupCompleted().tag((Class<? super Class>) getSignatureAlgorithm.class, (Class) new getSignatureAlgorithm(this.access100, obj, this.asInterface, arrayList)).build();
    }

    static final class Builder {
        private static final Pattern ICustomTabsCallbackDefault;
        private static long ICustomTabsCallbackStub;
        private static char ICustomTabsCallbackStubProxy;
        private static final Pattern onPostMessage;
        private static int onRelationshipValidationResult;
        private static int onUnminimized;
        boolean IAuthTabCallback;
        boolean IAuthTabCallbackDefault;
        boolean IAuthTabCallbackStub;

        @Nullable
        String IAuthTabCallbackStubProxy;
        boolean IAuthTabCallback_Parcel;
        final Type[] ICustomTabsCallback;

        @Nullable
        Headers access000;
        boolean access100;
        boolean asBinder;
        boolean asInterface;

        @Nullable
        setBSignCertB64<?>[] extraCallback;
        final Annotation[][] extraCallbackWithResult;
        boolean getInterfaceDescriptor;

        @Nullable
        String onActivityLayout;
        final Retrofit onActivityResized;

        @Nullable
        MediaType onExtraCallback;
        boolean onExtraCallbackWithResult;
        final Class<?> onMessageChannelReady;

        @Nullable
        Set<String> onMinimized;
        boolean onNavigationEvent;
        boolean onTransact;
        boolean onWarmupCompleted;
        final Annotation[] readTypedObject;
        final Method writeTypedObject;
        private static final byte[] $$a = {2, 105, -126, -86};
        private static final int $$b = 56;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int ICustomTabsService = 0;
        private static int mayLaunchUrl = 1;
        private static int extraCommand = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, short s2) {
            int i2;
            byte[] bArr = $$a;
            int i3 = s * 2;
            int i4 = 4 - (s2 * 3);
            int i5 = i + 109;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i4;
                int i7 = 0;
                int i8 = i3;
                i5 = (-i5) + i8;
                i4 = i6 + 1;
                i2 = i7;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i3) {
                    return new String(bArr2, 0);
                }
                int i9 = bArr[i4];
                int i10 = i4;
                i8 = i5;
                i5 = i9;
                i6 = i10;
                i5 = (-i5) + i8;
                i4 = i6 + 1;
                i2 = i7;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i3) {
                }
            }
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i3, i3);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43;
                        int deadChar = 1451 - KeyEvent.getDeadChar(i3, i3);
                        byte b = (byte) i3;
                        byte b2 = (byte) (b + 1);
                        String str$$c = $$c(b, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMakeMeasureSpec, maximumFlingVelocity, deadChar, 228868077, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) i3;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, i3) + 49123), 44 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1494 - View.MeasureSpec.getMode(i3), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 23972), (ViewConfiguration.getScrollBarSize() >> 8) + 50, KeyEvent.getDeadChar(0, 0) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 29, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (ICustomTabsCallbackStub ^ 7798559133331975163L)) ^ ((int) (onRelationshipValidationResult ^ 7798559133331975163L))) ^ ((char) (ICustomTabsCallbackStubProxy ^ 7798559133331975163L)));
                                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                                int i4 = $10 + 79;
                                $11 = i4 % 128;
                                int i5 = i4 % 2;
                                i3 = 0;
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
            String str = new String(cArr6);
            int i6 = $11 + 101;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        static {
            onUnminimized = 0;
            onExtraCallback();
            ICustomTabsCallbackDefault = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
            onPostMessage = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
            int i = extraCommand + Imgproc.COLOR_YUV2RGB_YVYU;
            onUnminimized = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        Builder(Retrofit retrofit, Class<?> cls, Method method) {
            this.onActivityResized = retrofit;
            this.onMessageChannelReady = cls;
            this.writeTypedObject = method;
            this.readTypedObject = method.getAnnotations();
            this.ICustomTabsCallback = method.getGenericParameterTypes();
            this.extraCallbackWithResult = method.getParameterAnnotations();
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[PHI: r7 r8 r9
          0x0083: PHI (r7v3 o.setBSignCertB64<?>[]) = (r7v2 o.setBSignCertB64<?>[]), (r7v6 o.setBSignCertB64<?>[]) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x0083: PHI (r8v3 java.lang.reflect.Type) = (r8v2 java.lang.reflect.Type), (r8v7 java.lang.reflect.Type) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x0083: PHI (r9v2 java.lang.annotation.Annotation[]) = (r9v1 java.lang.annotation.Annotation[]), (r9v6 java.lang.annotation.Annotation[]) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[PHI: r7 r8 r9
          0x008b: PHI (r7v5 o.setBSignCertB64<?>[]) = (r7v2 o.setBSignCertB64<?>[]), (r7v6 o.setBSignCertB64<?>[]) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x008b: PHI (r8v5 java.lang.reflect.Type) = (r8v2 java.lang.reflect.Type), (r8v7 java.lang.reflect.Type) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x008b: PHI (r9v4 java.lang.annotation.Annotation[]) = (r9v1 java.lang.annotation.Annotation[]), (r9v6 java.lang.annotation.Annotation[]) binds: [B:31:0x0081, B:28:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        RequestFactory onNavigationEvent() throws Throwable {
            setBSignCertB64<?>[] setbsigncertb64Arr;
            Type type;
            Annotation[] annotationArr;
            int i = 2 % 2;
            for (Annotation annotation : this.readTypedObject) {
                onExtraCallback(annotation);
            }
            if (this.IAuthTabCallbackStubProxy == null) {
                throw getDirNames.IAuthTabCallback(this.writeTypedObject, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            Object obj = null;
            if (!this.onTransact) {
                int i2 = mayLaunchUrl + 119;
                int i3 = i2 % 128;
                ICustomTabsService = i3;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this.access100) {
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.IAuthTabCallback_Parcel) {
                    int i4 = i3 + 21;
                    mayLaunchUrl = i4 % 128;
                    int i5 = i4 % 2;
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.extraCallbackWithResult.length;
            this.extraCallback = new setBSignCertB64[length];
            int i6 = 0;
            while (true) {
                boolean z = true;
                if (i6 >= length) {
                    break;
                }
                int i7 = ICustomTabsService;
                int i8 = i7 + 1;
                mayLaunchUrl = i8 % 128;
                if (i8 % 2 == 0) {
                    setbsigncertb64Arr = this.extraCallback;
                    type = this.ICustomTabsCallback[i6];
                    annotationArr = this.extraCallbackWithResult[i6];
                    if (i6 == (length << 1)) {
                        int i9 = i7 + 125;
                        mayLaunchUrl = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        z = false;
                    }
                } else {
                    setbsigncertb64Arr = this.extraCallback;
                    type = this.ICustomTabsCallback[i6];
                    annotationArr = this.extraCallbackWithResult[i6];
                    if (i6 == length - 1) {
                    }
                }
                setbsigncertb64Arr[i6] = onExtraCallbackWithResult(i6, type, annotationArr, z);
                i6++;
            }
            if (this.onActivityLayout == null && !this.IAuthTabCallbackStub) {
                int i11 = ICustomTabsService + 95;
                mayLaunchUrl = i11 % 128;
                if (i11 % 2 != 0) {
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Missing either @%s URL or @Url parameter.", this.IAuthTabCallbackStubProxy);
                }
                Method method = this.writeTypedObject;
                Object[] objArr = new Object[0];
                objArr[1] = this.IAuthTabCallbackStubProxy;
                throw getDirNames.IAuthTabCallback(method, "Missing either @%s URL or @Url parameter.", objArr);
            }
            boolean z2 = this.IAuthTabCallback_Parcel;
            if (!z2 && (!this.access100)) {
                int i12 = mayLaunchUrl + Imgproc.COLOR_YUV2RGBA_YVYU;
                ICustomTabsService = i12 % 128;
                int i13 = i12 % 2;
                if (!this.onTransact && this.onExtraCallbackWithResult) {
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
            }
            if (z2) {
                int i14 = mayLaunchUrl + 93;
                ICustomTabsService = i14 % 128;
                int i15 = i14 % 2;
                if (!this.IAuthTabCallback) {
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
            }
            if (!(!this.access100)) {
                int i16 = ICustomTabsService + 79;
                mayLaunchUrl = i16 % 128;
                if (i16 % 2 == 0) {
                    throw null;
                }
                if (!this.onNavigationEvent) {
                    throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            }
            return new RequestFactory(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            if ((r18 instanceof o.initCertListOnMemory) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            r3 = r3 + 45;
            retrofit2.RequestFactory.Builder.mayLaunchUrl = r3 % 128;
            r3 = r3 % 2;
            r2 = new java.lang.Object[1];
            a((char) (42838 - android.widget.ExpandableListView.getPackedPositionGroup(0)), android.text.TextUtils.lastIndexOf(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 1753602470, new char[]{20329, 8478, 38841}, new char[]{56315, 1698, 47179, 57778}, new char[]{42449, 34265, 22120, 47271}, r2);
            onNavigationEvent(((java.lang.String) r2[0]).intern(), ((o.initCertListOnMemory) r18).onExtraCallbackWithResult(), false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
        
            if ((r18 instanceof o.initCertListByDefaultExtDir) == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
        
            r5 = r5 + 3;
            retrofit2.RequestFactory.Builder.ICustomTabsService = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
        
            if ((r5 % 2) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
        
            onNavigationEvent("HEAD", ((o.initCertListByDefaultExtDir) r18).onExtraCallback(), true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
        
            onNavigationEvent("HEAD", ((o.initCertListByDefaultExtDir) r18).onExtraCallback(), false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
        
            if ((r18 instanceof o.SetAppInfo) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
        
            onNavigationEvent("PATCH", ((o.SetAppInfo) r18).onWarmupCompleted(), true);
            r1 = retrofit2.RequestFactory.Builder.ICustomTabsService + 113;
            retrofit2.RequestFactory.Builder.mayLaunchUrl = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
        
            if ((r1 % 2) == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
        
            r1 = null;
            r1.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        
            if ((r18 instanceof o.getIv8) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
        
            r2 = new java.lang.Object[1];
            a((char) (47364 - android.text.AndroidCharacter.getMirror('0')), android.text.AndroidCharacter.getMirror('0') - '0', new char[]{42122, 37438, 12346, 55171}, new char[]{56315, 1698, 47179, 57778}, new char[]{23243, 16998, 54309, 16568}, r2);
            onNavigationEvent(((java.lang.String) r2[0]).intern(), ((o.getIv8) r18).onExtraCallback(), true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
        
            if ((r18 instanceof o.appFilesDir) == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
        
            onNavigationEvent("PUT", ((o.appFilesDir) r18).onExtraCallbackWithResult(), true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
        
            if ((r18 instanceof o.CertToolkitMgr) == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
        
            r5 = r5 + 73;
            retrofit2.RequestFactory.Builder.ICustomTabsService = r5 % 128;
            r5 = r5 % 2;
            onNavigationEvent("OPTIONS", ((o.CertToolkitMgr) r18).onExtraCallbackWithResult(), false);
            r1 = retrofit2.RequestFactory.Builder.mayLaunchUrl + 123;
            retrofit2.RequestFactory.Builder.ICustomTabsService = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
        
            if ((!(r18 instanceof o.initCertSync)) == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0134, code lost:
        
            if ((r18 instanceof o.setCurCert) == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0136, code lost:
        
            r1 = (o.setCurCert) r18;
            r3 = r1.onExtraCallbackWithResult();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
        
            if (r3.length == 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
        
            r4 = retrofit2.RequestFactory.Builder.mayLaunchUrl + 41;
            retrofit2.RequestFactory.Builder.ICustomTabsService = r4 % 128;
            r4 = r4 % 2;
            r17.access000 = onWarmupCompleted(r3, r1.onNavigationEvent());
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
        
            throw o.getDirNames.IAuthTabCallback(r17.writeTypedObject, "@Headers annotation is empty.", new java.lang.Object[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0162, code lost:
        
            if ((r18 instanceof o.GetLicenseInfo) == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0166, code lost:
        
            if (r17.IAuthTabCallback_Parcel != false) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0168, code lost:
        
            r5 = r5 + 93;
            retrofit2.RequestFactory.Builder.ICustomTabsService = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x016f, code lost:
        
            if ((r5 % 2) == 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0171, code lost:
        
            r17.access100 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0173, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if ((r18 instanceof o.getUserCertListOnMemory) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0174, code lost:
        
            r17.access100 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x017f, code lost:
        
            throw o.getDirNames.IAuthTabCallback(r17.writeTypedObject, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
        
            if ((r18 instanceof o.getUserCertOnMemory) == false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
        
            if (r17.access100 != false) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
        
            r3 = r3 + 111;
            retrofit2.RequestFactory.Builder.mayLaunchUrl = r3 % 128;
            r3 = r3 % 2;
            r17.IAuthTabCallback_Parcel = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0191, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
        
            throw o.getDirNames.IAuthTabCallback(r17.writeTypedObject, "Only one encoding annotation is allowed.", new java.lang.Object[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
        
            r1 = (o.initCertSync) r18;
            onNavigationEvent(r1.onNavigationEvent(), r1.onExtraCallback(), r1.onWarmupCompleted());
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x01ad, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        
            if ((r18 instanceof o.getUserCertListOnMemory) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            r3 = r3 + 105;
            retrofit2.RequestFactory.Builder.mayLaunchUrl = r3 % 128;
            r3 = r3 % 2;
            onNavigationEvent("DELETE", ((o.getUserCertListOnMemory) r18).onExtraCallbackWithResult(), false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void onExtraCallback(Annotation annotation) throws Throwable {
            int i = 2 % 2;
            int i2 = ICustomTabsService;
            int i3 = i2 + 67;
            int i4 = i3 % 128;
            mayLaunchUrl = i4;
            if (i3 % 2 == 0) {
                int i5 = 23 / 0;
            }
        }

        private void onNavigationEvent(String str, String str2, boolean z) {
            int i = 2 % 2;
            String str3 = this.IAuthTabCallbackStubProxy;
            if (str3 != null) {
                throw getDirNames.IAuthTabCallback(this.writeTypedObject, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            int i2 = ICustomTabsService + 27;
            mayLaunchUrl = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStubProxy = str;
            this.onTransact = z;
            if (str2.isEmpty()) {
                int i4 = ICustomTabsService + 123;
                mayLaunchUrl = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1) {
                int i5 = ICustomTabsService + 53;
                mayLaunchUrl = i5 % 128;
                if (i5 % 2 != 0 ? iIndexOf < str2.length() - 1 : iIndexOf < str2.length() - 1) {
                    int i6 = mayLaunchUrl + 75;
                    ICustomTabsService = i6 % 128;
                    int i7 = i6 % 2;
                    String strSubstring = str2.substring(iIndexOf + 1);
                    if (ICustomTabsCallbackDefault.matcher(strSubstring).find()) {
                        int i8 = mayLaunchUrl + 39;
                        ICustomTabsService = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw getDirNames.IAuthTabCallback(this.writeTypedObject, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                        }
                        Method method = this.writeTypedObject;
                        Object[] objArr = new Object[1];
                        objArr[1] = strSubstring;
                        throw getDirNames.IAuthTabCallback(method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", objArr);
                    }
                }
            }
            this.onActivityLayout = str2;
            this.onMinimized = onNavigationEvent(str2);
        }

        private Headers onWarmupCompleted(String[] strArr, boolean z) {
            int i = 2 % 2;
            Headers.Builder builder = new Headers.Builder();
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                int iIndexOf = str.indexOf(58);
                if (iIndexOf != -1) {
                    int i3 = mayLaunchUrl + 111;
                    ICustomTabsService = i3 % 128;
                    int i4 = i3 % 2;
                    if (iIndexOf != 0 && iIndexOf != str.length() - 1) {
                        String strSubstring = str.substring(0, iIndexOf);
                        String strTrim = str.substring(iIndexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                            try {
                                this.onExtraCallback = MediaType.get(strTrim);
                            } catch (IllegalArgumentException e) {
                                throw getDirNames.onWarmupCompleted(this.writeTypedObject, e, "Malformed content type: %s", strTrim);
                            }
                        } else if (z) {
                            builder.addUnsafeNonAscii(strSubstring, strTrim);
                        } else {
                            builder.add(strSubstring, strTrim);
                        }
                        i2++;
                        int i5 = ICustomTabsService + 113;
                        mayLaunchUrl = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                throw getDirNames.IAuthTabCallback(this.writeTypedObject, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            return builder.build();
        }

        @Nullable
        private setBSignCertB64<?> onExtraCallbackWithResult(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            setBSignCertB64<?> setbsigncertb64;
            int i2 = 2 % 2;
            if (annotationArr != null) {
                int i3 = mayLaunchUrl + 89;
                ICustomTabsService = i3 % 128;
                int i4 = i3 % 2;
                setbsigncertb64 = null;
                for (Annotation annotation : annotationArr) {
                    setBSignCertB64<?> setbsigncertb64OnNavigationEvent = onNavigationEvent(i, type, annotationArr, annotation);
                    if (setbsigncertb64OnNavigationEvent != null) {
                        if (setbsigncertb64 != null) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        setbsigncertb64 = setbsigncertb64OnNavigationEvent;
                    }
                }
            } else {
                int i5 = ICustomTabsService + 33;
                mayLaunchUrl = i5 % 128;
                int i6 = i5 % 2;
                setbsigncertb64 = null;
            }
            if (setbsigncertb64 != null) {
                return setbsigncertb64;
            }
            if (!(!z)) {
                try {
                    if (getDirNames.onWarmupCompleted(type) == access13800.class) {
                        this.getInterfaceDescriptor = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
        
            if (java.lang.Iterable.class.isAssignableFrom(r1) != false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0169, code lost:
        
            if (java.lang.Iterable.class.isAssignableFrom(r1) != false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
        
            if ((r10 instanceof java.lang.reflect.ParameterizedType) == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
        
            return new o.setBSignCertB64.onTransact(r0, r8.onActivityResized.onNavigationEvent(o.getDirNames.onExtraCallbackWithResult(0, (java.lang.reflect.ParameterizedType) r10), r11), r12).IAuthTabCallback();
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
        
            throw o.getDirNames.onWarmupCompleted(r8.writeTypedObject, r9, r1.getSimpleName() + " must include generic type (e.g., " + r1.getSimpleName() + "<String>)", new java.lang.Object[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
        
            if (r1.isArray() == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        
            return new o.setBSignCertB64.onTransact(r0, r8.onActivityResized.onNavigationEvent(onWarmupCompleted(r1.getComponentType()), r11), r12).onWarmupCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
        
            return new o.setBSignCertB64.onTransact(r0, r8.onActivityResized.onNavigationEvent(r10, r11), r12);
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private setBSignCertB64<?> onNavigationEvent(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            String strOnNavigationEvent;
            boolean zOnExtraCallback;
            Class<?> clsOnWarmupCompleted;
            int i2 = 2 % 2;
            if (annotation instanceof certGetAuthorityInformationAccess) {
                onWarmupCompleted(i, type);
                if (this.IAuthTabCallbackStub) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.onWarmupCompleted) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                int i3 = ICustomTabsService;
                int i4 = i3 + 85;
                mayLaunchUrl = i4 % 128;
                int i5 = i4 % 2;
                if (this.asBinder) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.IAuthTabCallbackDefault) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.asInterface) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                int i6 = i3 + 85;
                mayLaunchUrl = i6 % 128;
                int i7 = i6 % 2;
                if (this.onActivityLayout != null) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Url cannot be used with @%s URL", this.IAuthTabCallbackStubProxy);
                }
                this.IAuthTabCallbackStub = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new setBSignCertB64.access100(this.writeTypedObject, i);
                }
                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof getIvD) {
                onWarmupCompleted(i, type);
                if (this.asBinder) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.IAuthTabCallbackDefault) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.asInterface) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.IAuthTabCallbackStub) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.onActivityLayout == null) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Path can only be used with relative url on @%s", this.IAuthTabCallbackStubProxy);
                }
                this.onWarmupCompleted = true;
                getIvD getivd = (getIvD) annotation;
                String strOnNavigationEvent2 = getivd.onNavigationEvent();
                onExtraCallbackWithResult(i, strOnNavigationEvent2);
                return new setBSignCertB64.asInterface(this.writeTypedObject, i, strOnNavigationEvent2, this.onActivityResized.onNavigationEvent(type, annotationArr), getivd.onWarmupCompleted());
            }
            if (!(annotation instanceof getKey4)) {
                if (annotation instanceof InterfaceC0050certDecryptPrikey) {
                    int i8 = ICustomTabsService + 43;
                    mayLaunchUrl = i8 % 128;
                    int i9 = i8 % 2;
                    onWarmupCompleted(i, type);
                    boolean zOnWarmupCompleted = ((InterfaceC0050certDecryptPrikey) annotation).onWarmupCompleted();
                    Class<?> clsOnWarmupCompleted2 = getDirNames.onWarmupCompleted(type);
                    this.IAuthTabCallbackDefault = true;
                    if (!Iterable.class.isAssignableFrom(clsOnWarmupCompleted2)) {
                        if (!clsOnWarmupCompleted2.isArray()) {
                            return new setBSignCertB64.IAuthTabCallback_Parcel(this.onActivityResized.onNavigationEvent(type, annotationArr), zOnWarmupCompleted);
                        }
                        return new setBSignCertB64.IAuthTabCallback_Parcel(this.onActivityResized.onNavigationEvent(onWarmupCompleted(clsOnWarmupCompleted2.getComponentType()), annotationArr), zOnWarmupCompleted).onWarmupCompleted();
                    }
                    if (type instanceof ParameterizedType) {
                        setBSignCertB64<Iterable<T>> setbsigncertb64IAuthTabCallback = new setBSignCertB64.IAuthTabCallback_Parcel(this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type), annotationArr), zOnWarmupCompleted).IAuthTabCallback();
                        int i10 = mayLaunchUrl + 59;
                        ICustomTabsService = i10 % 128;
                        int i11 = i10 % 2;
                        return setbsigncertb64IAuthTabCallback;
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, clsOnWarmupCompleted2.getSimpleName() + " must include generic type (e.g., " + clsOnWarmupCompleted2.getSimpleName() + "<String>)", new Object[0]);
                }
                if (annotation instanceof certFinalize) {
                    onWarmupCompleted(i, type);
                    Class<?> clsOnWarmupCompleted3 = getDirNames.onWarmupCompleted(type);
                    this.asInterface = true;
                    if (!Map.class.isAssignableFrom(clsOnWarmupCompleted3)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@QueryMap parameter type must be Map.", new Object[0]);
                    }
                    int i12 = mayLaunchUrl + 51;
                    ICustomTabsService = i12 % 128;
                    int i13 = i12 % 2;
                    Type typeOnNavigationEvent = getDirNames.onNavigationEvent(type, clsOnWarmupCompleted3, (Class<?>) Map.class);
                    if (!(typeOnNavigationEvent instanceof ParameterizedType)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) typeOnNavigationEvent;
                    Type typeOnExtraCallbackWithResult = getDirNames.onExtraCallbackWithResult(0, parameterizedType);
                    if (String.class == typeOnExtraCallbackWithResult) {
                        return new setBSignCertB64.IAuthTabCallbackStubProxy(this.writeTypedObject, i, this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(1, parameterizedType), annotationArr), ((certFinalize) annotation).onWarmupCompleted());
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@QueryMap keys must be of type String: " + typeOnExtraCallbackWithResult, new Object[0]);
                }
                Object obj = null;
                if (annotation instanceof initCertList) {
                    onWarmupCompleted(i, type);
                    initCertList initcertlist = (initCertList) annotation;
                    String strOnExtraCallbackWithResult = initcertlist.onExtraCallbackWithResult();
                    Class<?> clsOnWarmupCompleted4 = getDirNames.onWarmupCompleted(type);
                    if (!Iterable.class.isAssignableFrom(clsOnWarmupCompleted4)) {
                        if (!clsOnWarmupCompleted4.isArray()) {
                            return new setBSignCertB64.IAuthTabCallback(strOnExtraCallbackWithResult, this.onActivityResized.onNavigationEvent(type, annotationArr), initcertlist.onExtraCallback());
                        }
                        return new setBSignCertB64.IAuthTabCallback(strOnExtraCallbackWithResult, this.onActivityResized.onNavigationEvent(onWarmupCompleted(clsOnWarmupCompleted4.getComponentType()), annotationArr), initcertlist.onExtraCallback()).onWarmupCompleted();
                    }
                    if (!(type instanceof ParameterizedType)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, clsOnWarmupCompleted4.getSimpleName() + " must include generic type (e.g., " + clsOnWarmupCompleted4.getSimpleName() + "<String>)", new Object[0]);
                    }
                    setBSignCertB64<Iterable<T>> setbsigncertb64IAuthTabCallback2 = new setBSignCertB64.IAuthTabCallback(strOnExtraCallbackWithResult, this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type), annotationArr), initcertlist.onExtraCallback()).IAuthTabCallback();
                    int i14 = ICustomTabsService + 103;
                    mayLaunchUrl = i14 % 128;
                    if (i14 % 2 != 0) {
                        return setbsigncertb64IAuthTabCallback2;
                    }
                    obj.hashCode();
                    throw null;
                }
                if (annotation instanceof hasCert) {
                    if (type == Headers.class) {
                        return new setBSignCertB64.IAuthTabCallbackDefault(this.writeTypedObject, i);
                    }
                    onWarmupCompleted(i, type);
                    Class<?> clsOnWarmupCompleted5 = getDirNames.onWarmupCompleted(type);
                    if (!Map.class.isAssignableFrom(clsOnWarmupCompleted5)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                    }
                    Type typeOnNavigationEvent2 = getDirNames.onNavigationEvent(type, clsOnWarmupCompleted5, (Class<?>) Map.class);
                    if (!(typeOnNavigationEvent2 instanceof ParameterizedType)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType2 = (ParameterizedType) typeOnNavigationEvent2;
                    Type typeOnExtraCallbackWithResult2 = getDirNames.onExtraCallbackWithResult(0, parameterizedType2);
                    if (String.class == typeOnExtraCallbackWithResult2) {
                        return new setBSignCertB64.onWarmupCompleted(this.writeTypedObject, i, this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(1, parameterizedType2), annotationArr), ((hasCert) annotation).onExtraCallbackWithResult());
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@HeaderMap keys must be of type String: " + typeOnExtraCallbackWithResult2, new Object[0]);
                }
                if (annotation instanceof getCurCert) {
                    onWarmupCompleted(i, type);
                    if (!this.IAuthTabCallback_Parcel) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                    }
                    getCurCert getcurcert = (getCurCert) annotation;
                    String strOnExtraCallbackWithResult2 = getcurcert.onExtraCallbackWithResult();
                    boolean zOnExtraCallback2 = getcurcert.onExtraCallback();
                    this.IAuthTabCallback = true;
                    Class<?> clsOnWarmupCompleted6 = getDirNames.onWarmupCompleted(type);
                    if (!Iterable.class.isAssignableFrom(clsOnWarmupCompleted6)) {
                        if (!clsOnWarmupCompleted6.isArray()) {
                            return new setBSignCertB64.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, this.onActivityResized.onNavigationEvent(type, annotationArr), zOnExtraCallback2);
                        }
                        return new setBSignCertB64.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, this.onActivityResized.onNavigationEvent(onWarmupCompleted(clsOnWarmupCompleted6.getComponentType()), annotationArr), zOnExtraCallback2).onWarmupCompleted();
                    }
                    if (type instanceof ParameterizedType) {
                        return new setBSignCertB64.onExtraCallbackWithResult(strOnExtraCallbackWithResult2, this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type), annotationArr), zOnExtraCallback2).IAuthTabCallback();
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, clsOnWarmupCompleted6.getSimpleName() + " must include generic type (e.g., " + clsOnWarmupCompleted6.getSimpleName() + "<String>)", new Object[0]);
                }
                if (annotation instanceof getUserCert) {
                    onWarmupCompleted(i, type);
                    if (!this.IAuthTabCallback_Parcel) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    }
                    Class<?> clsOnWarmupCompleted7 = getDirNames.onWarmupCompleted(type);
                    if (!Map.class.isAssignableFrom(clsOnWarmupCompleted7)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@FieldMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeOnNavigationEvent3 = getDirNames.onNavigationEvent(type, clsOnWarmupCompleted7, (Class<?>) Map.class);
                    if (!(typeOnNavigationEvent3 instanceof ParameterizedType)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType3 = (ParameterizedType) typeOnNavigationEvent3;
                    Type typeOnExtraCallbackWithResult3 = getDirNames.onExtraCallbackWithResult(0, parameterizedType3);
                    if (String.class == typeOnExtraCallbackWithResult3) {
                        Converter converterOnNavigationEvent = this.onActivityResized.onNavigationEvent(getDirNames.onExtraCallbackWithResult(1, parameterizedType3), annotationArr);
                        this.IAuthTabCallback = true;
                        return new setBSignCertB64.onExtraCallback(this.writeTypedObject, i, converterOnNavigationEvent, ((getUserCert) annotation).IAuthTabCallback());
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@FieldMap keys must be of type String: " + typeOnExtraCallbackWithResult3, new Object[0]);
                }
                if (!(annotation instanceof assets)) {
                    if (annotation instanceof getKeyH) {
                        onWarmupCompleted(i, type);
                        if (!this.access100) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        }
                        this.onNavigationEvent = true;
                        Class<?> clsOnWarmupCompleted8 = getDirNames.onWarmupCompleted(type);
                        if (!Map.class.isAssignableFrom(clsOnWarmupCompleted8)) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@PartMap parameter type must be Map.", new Object[0]);
                        }
                        Type typeOnNavigationEvent4 = getDirNames.onNavigationEvent(type, clsOnWarmupCompleted8, (Class<?>) Map.class);
                        if (!(typeOnNavigationEvent4 instanceof ParameterizedType)) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        ParameterizedType parameterizedType4 = (ParameterizedType) typeOnNavigationEvent4;
                        Type typeOnExtraCallbackWithResult4 = getDirNames.onExtraCallbackWithResult(0, parameterizedType4);
                        if (String.class == typeOnExtraCallbackWithResult4) {
                            Type typeOnExtraCallbackWithResult5 = getDirNames.onExtraCallbackWithResult(1, parameterizedType4);
                            if (MultipartBody.Part.class.isAssignableFrom(getDirNames.onWarmupCompleted(typeOnExtraCallbackWithResult5))) {
                                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            return new setBSignCertB64.asBinder(this.writeTypedObject, i, this.onActivityResized.onExtraCallbackWithResult(typeOnExtraCallbackWithResult5, annotationArr, this.readTypedObject), ((getKeyH) annotation).onWarmupCompleted());
                        }
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@PartMap keys must be of type String: " + typeOnExtraCallbackWithResult4, new Object[0]);
                    }
                    if (annotation instanceof getUserCertList) {
                        onWarmupCompleted(i, type);
                        if (this.IAuthTabCallback_Parcel || this.access100) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        }
                        if (this.onExtraCallbackWithResult) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                        try {
                            Converter converterOnExtraCallbackWithResult = this.onActivityResized.onExtraCallbackWithResult(type, annotationArr, this.readTypedObject);
                            this.onExtraCallbackWithResult = true;
                            return new setBSignCertB64.onNavigationEvent(this.writeTypedObject, i, converterOnExtraCallbackWithResult);
                        } catch (RuntimeException e) {
                            throw getDirNames.onExtraCallback(this.writeTypedObject, e, i, "Unable to create @Body converter for %s", type);
                        }
                    }
                    if (!(annotation instanceof certDecryptPriKey)) {
                        return null;
                    }
                    int i15 = ICustomTabsService + 51;
                    mayLaunchUrl = i15 % 128;
                    int i16 = i15 % 2;
                    onWarmupCompleted(i, type);
                    Class<?> clsOnWarmupCompleted9 = onWarmupCompleted(getDirNames.onWarmupCompleted(type));
                    for (int i17 = i - 1; i17 >= 0; i17--) {
                        setBSignCertB64<?> setbsigncertb64 = this.extraCallback[i17];
                        if ((setbsigncertb64 instanceof setBSignCertB64.access000) && ((setBSignCertB64.access000) setbsigncertb64).onExtraCallback.equals(clsOnWarmupCompleted9)) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Tag type " + clsOnWarmupCompleted9.getName() + " is duplicate of " + getSubjectDN.onNavigationEvent.onNavigationEvent(this.writeTypedObject, i17) + " and would always overwrite its value.", new Object[0]);
                        }
                    }
                    return new setBSignCertB64.access000(clsOnWarmupCompleted9);
                }
                int i18 = ICustomTabsService + 99;
                mayLaunchUrl = i18 % 128;
                if (i18 % 2 == 0) {
                    onWarmupCompleted(i, type);
                    throw null;
                }
                onWarmupCompleted(i, type);
                if (!this.access100) {
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                assets assetsVar = (assets) annotation;
                this.onNavigationEvent = true;
                String strOnExtraCallbackWithResult3 = assetsVar.onExtraCallbackWithResult();
                Class<?> clsOnWarmupCompleted10 = getDirNames.onWarmupCompleted(type);
                if (strOnExtraCallbackWithResult3.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsOnWarmupCompleted10)) {
                        if (clsOnWarmupCompleted10.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(clsOnWarmupCompleted10.getComponentType())) {
                                return setBSignCertB64.getInterfaceDescriptor.onExtraCallback.onWarmupCompleted();
                            }
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (MultipartBody.Part.class.isAssignableFrom(clsOnWarmupCompleted10)) {
                            return setBSignCertB64.getInterfaceDescriptor.onExtraCallback;
                        }
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        int i19 = ICustomTabsService + 107;
                        mayLaunchUrl = i19 % 128;
                        if (i19 % 2 != 0 ? !MultipartBody.Part.class.isAssignableFrom(getDirNames.onWarmupCompleted(getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type))) : !MultipartBody.Part.class.isAssignableFrom(getDirNames.onWarmupCompleted(getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type)))) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return setBSignCertB64.getInterfaceDescriptor.onExtraCallback.IAuthTabCallback();
                    }
                    throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, clsOnWarmupCompleted10.getSimpleName() + " must include generic type (e.g., " + clsOnWarmupCompleted10.getSimpleName() + "<String>)", new Object[0]);
                }
                Headers headersOf = Headers.of("Content-Disposition", "form-data; name=\"" + strOnExtraCallbackWithResult3 + "\"", "Content-Transfer-Encoding", assetsVar.onWarmupCompleted());
                if (!Iterable.class.isAssignableFrom(clsOnWarmupCompleted10)) {
                    if (!clsOnWarmupCompleted10.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(clsOnWarmupCompleted10)) {
                            throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new setBSignCertB64.IAuthTabCallbackStub(this.writeTypedObject, i, headersOf, this.onActivityResized.onExtraCallbackWithResult(type, annotationArr, this.readTypedObject));
                    }
                    Class<?> clsOnWarmupCompleted11 = onWarmupCompleted(clsOnWarmupCompleted10.getComponentType());
                    if (MultipartBody.Part.class.isAssignableFrom(clsOnWarmupCompleted11)) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new setBSignCertB64.IAuthTabCallbackStub(this.writeTypedObject, i, headersOf, this.onActivityResized.onExtraCallbackWithResult(clsOnWarmupCompleted11, annotationArr, this.readTypedObject)).onWarmupCompleted();
                }
                if (type instanceof ParameterizedType) {
                    Type typeOnExtraCallbackWithResult6 = getDirNames.onExtraCallbackWithResult(0, (ParameterizedType) type);
                    if (MultipartBody.Part.class.isAssignableFrom(getDirNames.onWarmupCompleted(typeOnExtraCallbackWithResult6))) {
                        throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new setBSignCertB64.IAuthTabCallbackStub(this.writeTypedObject, i, headersOf, this.onActivityResized.onExtraCallbackWithResult(typeOnExtraCallbackWithResult6, annotationArr, this.readTypedObject)).IAuthTabCallback();
                }
                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, clsOnWarmupCompleted10.getSimpleName() + " must include generic type (e.g., " + clsOnWarmupCompleted10.getSimpleName() + "<String>)", new Object[0]);
            }
            int i20 = mayLaunchUrl + 27;
            ICustomTabsService = i20 % 128;
            if (i20 % 2 != 0) {
                onWarmupCompleted(i, type);
                getKey4 getkey4 = (getKey4) annotation;
                strOnNavigationEvent = getkey4.onNavigationEvent();
                zOnExtraCallback = getkey4.onExtraCallback();
                clsOnWarmupCompleted = getDirNames.onWarmupCompleted(type);
                this.asBinder = true;
            } else {
                onWarmupCompleted(i, type);
                getKey4 getkey42 = (getKey4) annotation;
                strOnNavigationEvent = getkey42.onNavigationEvent();
                zOnExtraCallback = getkey42.onExtraCallback();
                clsOnWarmupCompleted = getDirNames.onWarmupCompleted(type);
                this.asBinder = true;
            }
        }

        private void onWarmupCompleted(int i, Type type) {
            int i2 = 2 % 2;
            int i3 = mayLaunchUrl + 101;
            ICustomTabsService = i3 % 128;
            int i4 = i3 % 2;
            if (getDirNames.onExtraCallbackWithResult(type)) {
                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
            int i5 = mayLaunchUrl + 55;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
        }

        private void onExtraCallbackWithResult(int i, String str) {
            int i2 = 2 % 2;
            if (!onPostMessage.matcher(str).matches()) {
                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "@Path parameter name must match %s. Found: %s", ICustomTabsCallbackDefault.pattern(), str);
            }
            int i3 = ICustomTabsService + 53;
            mayLaunchUrl = i3 % 128;
            if (i3 % 2 == 0) {
                this.onMinimized.contains(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.onMinimized.contains(str)) {
                throw getDirNames.onWarmupCompleted(this.writeTypedObject, i, "URL \"%s\" does not contain \"{%s}\".", this.onActivityLayout, str);
            }
            int i4 = mayLaunchUrl + 25;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
        }

        static Set<String> onNavigationEvent(String str) {
            int i = 2 % 2;
            Matcher matcher = ICustomTabsCallbackDefault.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                int i2 = mayLaunchUrl + 23;
                ICustomTabsService = i2 % 128;
                int i3 = i2 % 2;
                linkedHashSet.add(matcher.group(1));
            }
            int i4 = mayLaunchUrl + 3;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 == 0) {
                return linkedHashSet;
            }
            throw null;
        }

        private static Class<?> onWarmupCompleted(Class<?> cls) {
            int i = 2 % 2;
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            Object obj = null;
            if (Byte.TYPE == cls) {
                int i2 = ICustomTabsService + 89;
                mayLaunchUrl = i2 % 128;
                if (i2 % 2 != 0) {
                    return Byte.class;
                }
                throw null;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                int i3 = ICustomTabsService + 61;
                mayLaunchUrl = i3 % 128;
                if (i3 % 2 != 0) {
                    return Float.class;
                }
                int i4 = 41 / 0;
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                int i5 = ICustomTabsService + Imgproc.COLOR_YUV2RGBA_YVYU;
                mayLaunchUrl = i5 % 128;
                int i6 = i5 % 2;
                return Long.class;
            }
            if (Short.TYPE != cls) {
                return cls;
            }
            int i7 = mayLaunchUrl + 107;
            ICustomTabsService = i7 % 128;
            if (i7 % 2 == 0) {
                return Short.class;
            }
            obj.hashCode();
            throw null;
        }

        static void onExtraCallback() {
            ICustomTabsCallbackStub = -8248144266140602368L;
            onRelationshipValidationResult = -1776194565;
            ICustomTabsCallbackStubProxy = (char) 27643;
        }
    }
}
