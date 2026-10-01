package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.internal.mayLaunchUrl;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zziea;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class onLayoutChild {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static boolean IAuthTabCallbackDefault = false;
    private static boolean IAuthTabCallbackStub = false;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final String onExtraCallback = "com.facebook.appevents.codeless.internal.ViewHierarchy";
    private static WeakReference<View> onExtraCallbackWithResult;
    private static Method onNavigationEvent;
    private static int onTransact;
    private static char[] onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~(i8 | i7);
        int i10 = ~i4;
        int i11 = ~i7;
        int i12 = (~(i11 | i8)) | i10;
        int i13 = (~(i2 | i7)) | (~(i8 | i10 | i11));
        int i14 = i4 + i7 + i6 + ((-1136091917) * i5) + (376669458 * i3);
        int i15 = i14 * i14;
        int i16 = ((-905468225) * i4) + 1718550528 + ((-1748215485) * i7) + (i9 * (-421373630)) + (421373630 * i12) + ((-421373630) * i13) + ((-1326841856) * i6) + ((-2044854272) * i5) + (41156608 * i3) + (1721171968 * i15);
        int i17 = ((i4 * (-924404593)) - 1636593565) + (i7 * (-924403757)) + (i9 * 418) + (i12 * (-418)) + (i13 * 418) + (i6 * (-924404175)) + (i5 * (-2083730301)) + (i3 * 182666354) + (i15 * (-51970048));
        int i18 = i16 + (i17 * i17 * (-653721600));
        return i18 != 1 ? i18 != 2 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    static {
        onNavigationEvent();
        onExtraCallbackWithResult = new WeakReference<>(null);
        onNavigationEvent = null;
        int i2 = asInterface + 125;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    public static ViewGroup IAuthTabCallbackDefault(View view) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i3 = asBinder + 23;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 31 / 0;
            }
            return null;
        }
        if (view == null) {
            int i5 = IAuthTabCallback_Parcel + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    public static List<View> onExtraCallbackWithResult(View view) {
        ViewGroup viewGroup;
        int childCount;
        int i2;
        int i3 = 2 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i4 = asBinder + 5;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int i5 = IAuthTabCallback_Parcel + 55;
                asBinder = i5 % 128;
                if (i5 % 2 != 0) {
                    viewGroup = (ViewGroup) view;
                    childCount = viewGroup.getChildCount();
                    i2 = 1;
                } else {
                    viewGroup = (ViewGroup) view;
                    childCount = viewGroup.getChildCount();
                    i2 = 0;
                }
                while (i2 < childCount) {
                    int i6 = asBinder + 19;
                    IAuthTabCallback_Parcel = i6 % 128;
                    if (i6 % 2 == 0) {
                        arrayList.add(viewGroup.getChildAt(i2));
                        i2 += 124;
                    } else {
                        arrayList.add(viewGroup.getChildAt(i2));
                        i2++;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strOnWarmupCompleted;
        String strIntern;
        View view = (View) objArr[0];
        JSONObject jSONObject = (JSONObject) objArr[1];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 59;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i5 = IAuthTabCallback_Parcel + 51;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            try {
                try {
                    String strAsInterface = asInterface(view);
                    String strIAuthTabCallbackStub = IAuthTabCallbackStub(view);
                    Object tag = view.getTag();
                    CharSequence contentDescription = view.getContentDescription();
                    jSONObject.put("classname", view.getClass().getCanonicalName());
                    jSONObject.put("classtypebitmask", onExtraCallback(view));
                    jSONObject.put(TtmlNode.ATTR_ID, view.getId());
                    if (onInterceptTouchEvent.onExtraCallbackWithResult(view)) {
                        Object[] objArr2 = new Object[1];
                        a(null, null, new byte[]{-125, -123, -124, -125}, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, objArr2);
                        jSONObject.put(((String) objArr2[0]).intern(), "");
                        jSONObject.put("is_user_input", true);
                        int i7 = IAuthTabCallback_Parcel + 87;
                        asBinder = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 2 % 5;
                        }
                    } else {
                        Object[] objArr3 = new Object[1];
                        a(null, null, new byte[]{-125, -123, -124, -125}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, objArr3);
                        jSONObject.put(((String) objArr3[0]).intern(), mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strAsInterface), ""));
                    }
                    jSONObject.put("hint", mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(strIAuthTabCallbackStub), ""));
                    if (tag != null) {
                        jSONObject.put("tag", mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(tag.toString()), ""));
                    }
                    if (contentDescription != null) {
                        int i9 = asBinder + 19;
                        IAuthTabCallback_Parcel = i9 % 128;
                        if (i9 % 2 == 0) {
                            strOnWarmupCompleted = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(contentDescription.toString()), "");
                            Object[] objArr4 = new Object[1];
                            a(null, null, new byte[]{-115, -116, -118, -125, -117, -118, -119, -120, -121, -124, -122}, 101 >> View.getDefaultSize(0, 1), objArr4);
                            strIntern = ((String) objArr4[0]).intern();
                        } else {
                            strOnWarmupCompleted = mayLaunchUrl.onWarmupCompleted(mayLaunchUrl.asBinder(contentDescription.toString()), "");
                            Object[] objArr5 = new Object[1];
                            a(null, null, new byte[]{-115, -116, -118, -125, -117, -118, -119, -120, -121, -124, -122}, View.getDefaultSize(0, 0) + 127, objArr5);
                            strIntern = ((String) objArr5[0]).intern();
                        }
                        jSONObject.put(strIntern, strOnWarmupCompleted);
                    }
                    jSONObject.put("dimension", getInterfaceDescriptor(view));
                    return null;
                } catch (JSONException e) {
                    mayLaunchUrl.onNavigationEvent(onExtraCallback, e);
                }
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            }
        }
        return null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 76, 20952 - Drawable.resolveOpacity(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
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
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 75, 16036 - ImageFormat.getBitsPerPixel(0), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i5 = 1052772399;
            if (IAuthTabCallbackDefault) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 63 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12214 - View.MeasureSpec.getSize(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i5 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallbackStub) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 81;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.blue(0) + 63, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i2 = 0;
        View view = (View) objArr[0];
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                onExtraCallbackWithResult = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                int iIAuthTabCallback = zziea.IAuthTabCallback();
                int iIAuthTabCallback2 = zziea.IAuthTabCallback();
                onExtraCallback(new Object[]{view, jSONObject}, iIAuthTabCallback, zziea.IAuthTabCallback(), -4614832, zziea.IAuthTabCallback(), iIAuthTabCallback2, 4614832);
                JSONArray jSONArray = new JSONArray();
                List<View> listOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
                while (i2 < listOnExtraCallbackWithResult.size()) {
                    int i6 = IAuthTabCallback_Parcel + 89;
                    asBinder = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object[] objArr2 = {listOnExtraCallbackWithResult.get(i2)};
                        int iIAuthTabCallback3 = zziea.IAuthTabCallback();
                        int iIAuthTabCallback4 = zziea.IAuthTabCallback();
                        jSONArray.put((JSONObject) onExtraCallback(objArr2, iIAuthTabCallback3, zziea.IAuthTabCallback(), -130206551, zziea.IAuthTabCallback(), iIAuthTabCallback4, 130206553));
                        i2 += 19;
                    } else {
                        Object[] objArr3 = {listOnExtraCallbackWithResult.get(i2)};
                        int iIAuthTabCallback5 = zziea.IAuthTabCallback();
                        int iIAuthTabCallback6 = zziea.IAuthTabCallback();
                        jSONArray.put((JSONObject) onExtraCallback(objArr3, iIAuthTabCallback5, zziea.IAuthTabCallback(), -130206551, zziea.IAuthTabCallback(), iIAuthTabCallback6, 130206553));
                        i2++;
                    }
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException unused) {
                int i7 = asBinder + 103;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                return jSONObject;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            int i9 = asBinder + 125;
            IAuthTabCallback_Parcel = i9 % 128;
            if (i9 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[PHI: r1
      0x0051: PHI (r1v13 int) = (r1v11 int), (r1v16 int) binds: [B:25:0x004f, B:22:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int onExtraCallback(View view) {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return 0;
        }
        int i5 = view instanceof ImageView ? 2 : 0;
        try {
            if (view.isClickable()) {
                i5 |= 32;
            }
            if (access000(view)) {
                i5 |= 512;
            }
            if (view instanceof TextView) {
                int i6 = i5 | 1025;
                if (view instanceof Button) {
                    int i7 = IAuthTabCallback_Parcel + 77;
                    asBinder = i7 % 128;
                    if (i7 % 2 != 0) {
                        i6 = i5 | 24843;
                        if (view instanceof Switch) {
                            i6 = i5 | 9221;
                        } else if (view instanceof CheckBox) {
                            i6 = 33797 | i5;
                        }
                    } else {
                        i6 = i5 | 1029;
                        if (!(view instanceof Switch)) {
                        }
                    }
                }
                if (!(view instanceof EditText)) {
                    return i6;
                }
                int i8 = IAuthTabCallback_Parcel + 11;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                return i6 | 2048;
            }
            if (!(view instanceof Spinner)) {
                int i10 = asBinder;
                int i11 = i10 + 63;
                IAuthTabCallback_Parcel = i11 % 128;
                int i12 = i11 % 2;
                if (!(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return 65536 | i5;
                    }
                    if (view instanceof RadioGroup) {
                        int i13 = i10 + 7;
                        IAuthTabCallback_Parcel = i13 % 128;
                        int i14 = i13 % 2;
                        return i5 | 16384;
                    }
                    if (view instanceof ViewGroup) {
                        if (IAuthTabCallback(view, onExtraCallbackWithResult.get())) {
                            int i15 = asBinder + 125;
                            IAuthTabCallback_Parcel = i15 % 128;
                            int i16 = i15 % 2;
                            return i5 | 64;
                        }
                    }
                    return i5;
                }
            }
            return i5 | 4096;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return 0;
        }
    }

    private static boolean access000(View view) {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class);
            obj.hashCode();
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> clsOnWarmupCompleted = onWarmupCompleted("android.support.v4.view.NestedScrollingChild");
            if (clsOnWarmupCompleted != null && clsOnWarmupCompleted.isInstance(parent)) {
                int i4 = IAuthTabCallback_Parcel;
                int i5 = i4 + 101;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 111;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 1 / 0;
                }
                return true;
            }
            Class<?> clsOnWarmupCompleted2 = onWarmupCompleted("androidx.core.view.NestedScrollingChild");
            if (clsOnWarmupCompleted2 != null) {
                int i9 = IAuthTabCallback_Parcel + 23;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    clsOnWarmupCompleted2.isInstance(parent);
                    obj.hashCode();
                    throw null;
                }
                if (clsOnWarmupCompleted2.isInstance(parent)) {
                    int i10 = IAuthTabCallback_Parcel + 119;
                    asBinder = i10 % 128;
                    if (i10 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((r9 instanceof android.widget.TextView) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = o.onLayoutChild.asBinder + 5;
        o.onLayoutChild.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = ((android.widget.TextView) r9).getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if ((r9 instanceof android.widget.Switch) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (((android.widget.Switch) r9).isChecked() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        r6 = new java.lang.Object[1];
        a(null, null, new byte[]{-127}, android.text.TextUtils.indexOf("", "", 0) + 127, r6);
        r9 = ((java.lang.String) r6[0]).intern();
        r1 = o.onLayoutChild.asBinder + 115;
        o.onLayoutChild.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r6 = new java.lang.Object[1];
        a(null, null, new byte[]{-126}, android.graphics.ImageFormat.getBitsPerPixel(0) + 128, r6);
        r9 = ((java.lang.String) r6[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if ((r9 instanceof android.widget.Spinner) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r1 = o.onLayoutChild.IAuthTabCallback_Parcel + 119;
        o.onLayoutChild.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        if (((android.widget.Spinner) r9).getCount() <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r9 = ((android.widget.Spinner) r9).getSelectedItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r9 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r9 = r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if ((r9 instanceof android.widget.DatePicker) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        r9 = (android.widget.DatePicker) r9;
        r1 = java.lang.String.format("%04d-%02d-%02d", java.lang.Integer.valueOf(r9.getYear()), java.lang.Integer.valueOf(r9.getMonth()), java.lang.Integer.valueOf(r9.getDayOfMonth()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        if ((r9 instanceof android.widget.TimePicker) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
    
        r9 = (android.widget.TimePicker) r9;
        r1 = java.lang.String.format("%02d:%02d", r9.getCurrentHour(), r9.getCurrentMinute());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        if ((r9 instanceof android.widget.RadioGroup) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r1 = o.onLayoutChild.asBinder + 57;
        o.onLayoutChild.IAuthTabCallback_Parcel = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r9 = (android.widget.RadioGroup) r9;
        r1 = r9.getCheckedRadioButtonId();
        r6 = r9.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r4 >= r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        r7 = o.onLayoutChild.IAuthTabCallback_Parcel + 101;
        o.onLayoutChild.asBinder = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0114, code lost:
    
        r7 = r9.getChildAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        if (r7.getId() != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        if ((r7 instanceof android.widget.RadioButton) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        r9 = ((android.widget.RadioButton) r7).getText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        if ((!(r9 instanceof android.widget.RatingBar)) == true) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
    
        r1 = java.lang.String.valueOf(((android.widget.RatingBar) r9).getRating());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        r9 = o.onLayoutChild.IAuthTabCallback_Parcel + 21;
        o.onLayoutChild.asBinder = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onLayoutChild.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014e, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        o.convertResponseToCredentialManager.onExtraCallbackWithResult(r9, o.onLayoutChild.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0152, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onLayoutChild.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String asInterface(View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 13;
        asBinder = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0) {
            int i5 = 40 / 0;
        }
    }

    public static String IAuthTabCallbackStub(View view) {
        CharSequence hint;
        int i2 = 2 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i3 = IAuthTabCallback_Parcel + 117;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        try {
            if (!(view instanceof EditText)) {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            } else {
                int i4 = asBinder + 51;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    hint = ((EditText) view).getHint();
                    int i5 = 88 / 0;
                } else {
                    hint = ((EditText) view).getHint();
                }
            }
            if (hint != null) {
                return hint.toString();
            }
            int i6 = asBinder + 35;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                return "";
            }
            int i7 = 52 / 0;
            return "";
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    private static JSONObject getInterfaceDescriptor(View view) {
        int i2 = 2 % 2;
        if (!(!convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class))) {
            int i3 = asBinder + 83;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 25;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put(TtmlNode.LEFT, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    public static View.OnClickListener onWarmupCompleted(View view) {
        int i2 = 2 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i3 = IAuthTabCallback_Parcel + 119;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            try {
                Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField != null) {
                    int i4 = asBinder + 71;
                    IAuthTabCallback_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(view);
                if (obj == null) {
                    int i6 = asBinder + 81;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    return null;
                }
                Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                if (declaredField2 == null) {
                    return null;
                }
                int i8 = IAuthTabCallback_Parcel + 19;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                declaredField2.setAccessible(true);
                return (View.OnClickListener) declaredField2.get(obj);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                return null;
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Field declaredField;
        Field field;
        Object obj;
        View view = (View) objArr[0];
        View.OnClickListener onClickListener = (View.OnClickListener) objArr[1];
        int i2 = 2 % 2;
        Object obj2 = null;
        if (!convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i3 = asBinder + 43;
            IAuthTabCallback_Parcel = i3 % 128;
            ?? r5 = i3 % 2;
            try {
                try {
                    try {
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        r5 = 0;
                        declaredField = null;
                        field = r5;
                        if (field != null) {
                        }
                        view.setOnClickListener(onClickListener);
                        return null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                    field = r5;
                    if (field != null) {
                    }
                    view.setOnClickListener(onClickListener);
                    return null;
                }
                if (r5 == 0) {
                    Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    obj2.hashCode();
                    throw null;
                }
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                field = declaredField2;
                if (field != null || declaredField == null) {
                    view.setOnClickListener(onClickListener);
                    return null;
                }
                int i4 = IAuthTabCallback_Parcel + 117;
                asBinder = i4 % 128;
                try {
                    if (i4 % 2 != 0) {
                        field.setAccessible(false);
                        declaredField.setAccessible(true);
                        field.setAccessible(false);
                    } else {
                        field.setAccessible(true);
                        declaredField.setAccessible(true);
                        field.setAccessible(true);
                    }
                    obj = field.get(view);
                } catch (IllegalAccessException unused3) {
                    obj = null;
                }
                if (obj != null) {
                    declaredField.set(obj, onClickListener);
                    return null;
                }
                int i5 = asBinder + 21;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    view.setOnClickListener(onClickListener);
                    int i6 = 64 / 0;
                } else {
                    view.setOnClickListener(onClickListener);
                }
                int i7 = IAuthTabCallback_Parcel + 73;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return null;
            } catch (Exception unused4) {
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            }
        }
        return null;
    }

    public static View.OnTouchListener asBinder(View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 17;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class);
            throw null;
        }
        try {
            if (!convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                        Object obj = declaredField.get(view);
                        if (obj == null) {
                            int i4 = IAuthTabCallback_Parcel + 31;
                            asBinder = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 55 / 0;
                            }
                            return null;
                        }
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        if (declaredField2 != null) {
                            declaredField2.setAccessible(true);
                            return (View.OnTouchListener) declaredField2.get(obj);
                        }
                        int i6 = asBinder + 83;
                        IAuthTabCallback_Parcel = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 29 / 0;
                        }
                        return null;
                    } catch (IllegalAccessException e) {
                        mayLaunchUrl.onNavigationEvent(onExtraCallback, e);
                        int i8 = asBinder + 75;
                        IAuthTabCallback_Parcel = i8 % 128;
                        int i9 = i8 % 2;
                        return null;
                    }
                } catch (ClassNotFoundException e2) {
                    mayLaunchUrl.onNavigationEvent(onExtraCallback, e2);
                    int i82 = asBinder + 75;
                    IAuthTabCallback_Parcel = i82 % 128;
                    int i92 = i82 % 2;
                    return null;
                } catch (NoSuchFieldException e3) {
                    mayLaunchUrl.onNavigationEvent(onExtraCallback, e3);
                    int i822 = asBinder + 75;
                    IAuthTabCallback_Parcel = i822 % 128;
                    int i922 = i822 % 2;
                    return null;
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
        }
        return null;
    }

    public static View IAuthTabCallback(float[] fArr, @Nullable View view) {
        int i2 = 2 % 2;
        Object obj = null;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i3 = IAuthTabCallback_Parcel + 1;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            onWarmupCompleted();
            Method method = onNavigationEvent;
            if (method != null) {
                int i4 = IAuthTabCallback_Parcel + 35;
                int i5 = i4 % 128;
                asBinder = i5;
                int i6 = i4 % 2;
                if (view != null) {
                    int i7 = i5 + 77;
                    IAuthTabCallback_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        View view2 = (View) method.invoke(null, fArr, view);
                        if (view2 != null && view2.getId() > 0) {
                            int i9 = IAuthTabCallback_Parcel + 3;
                            asBinder = i9 % 128;
                            if (i9 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            View view3 = (View) view2.getParent();
                            if (view3 != null) {
                                return view3;
                            }
                            return null;
                        }
                    } catch (IllegalAccessException e) {
                        mayLaunchUrl.onNavigationEvent(onExtraCallback, e);
                    } catch (InvocationTargetException e2) {
                        mayLaunchUrl.onNavigationEvent(onExtraCallback, e2);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    public static boolean IAuthTabCallback(View view, @Nullable View view2) {
        View viewIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return false;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") && (viewIAuthTabCallback = IAuthTabCallback(IAuthTabCallbackStubProxy(view), view2)) != null) {
                if (viewIAuthTabCallback.getId() == view.getId()) {
                    int i5 = asBinder + 37;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return false;
        }
    }

    public static boolean onTransact(View view) {
        int i2 = 2 % 2;
        int i3 = asBinder + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (!convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            try {
                return view.getClass().getName().equals("com.facebook.react.ReactRootView");
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
                return false;
            }
        }
        int i5 = IAuthTabCallback_Parcel + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static View IAuthTabCallback(View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 109;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            int i5 = asBinder + 109;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        while (view != null) {
            int i7 = IAuthTabCallback_Parcel + 5;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                onTransact(view);
                throw null;
            }
            try {
                if (!onTransact(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                    int i8 = IAuthTabCallback_Parcel + 115;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            }
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
        }
        int i10 = IAuthTabCallback_Parcel + 61;
        asBinder = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r6.getLocationOnScreen(new int[2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return new float[]{r1[0], r1[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        o.convertResponseToCredentialManager.onExtraCallbackWithResult(r6, o.onLayoutChild.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onLayoutChild.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (o.convertResponseToCredentialManager.onExtraCallback(o.onLayoutChild.class) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = o.onLayoutChild.IAuthTabCallback_Parcel + 89;
        o.onLayoutChild.asBinder = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static float[] IAuthTabCallbackStubProxy(View view) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 77;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
    }

    private static void onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return;
        }
        try {
            if (onNavigationEvent == null) {
                try {
                    try {
                        Method declaredMethod = Class.forName("o.CredentialProviderGetSignInIntentControllerhandleResponse1").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                        onNavigationEvent = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (ClassNotFoundException e) {
                        mayLaunchUrl.onNavigationEvent(onExtraCallback, e);
                    }
                } catch (NoSuchMethodException e2) {
                    mayLaunchUrl.onNavigationEvent(onExtraCallback, e2);
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            int i5 = IAuthTabCallback_Parcel + 11;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static Class<?> onWarmupCompleted(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 5;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class);
            throw null;
        }
        if (convertResponseToCredentialManager.onExtraCallback(onLayoutChild.class)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            int i4 = asBinder + 85;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return cls;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, onLayoutChild.class);
            return null;
        }
    }

    public static JSONObject onNavigationEvent(View view) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        return (JSONObject) onExtraCallback(new Object[]{view}, iIAuthTabCallback, zziea.IAuthTabCallback(), -130206551, zziea.IAuthTabCallback(), iIAuthTabCallback2, 130206553);
    }

    public static void onExtraCallback(View view, View.OnClickListener onClickListener) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onExtraCallback(new Object[]{view, onClickListener}, iIAuthTabCallback, zziea.IAuthTabCallback(), -44141260, zziea.IAuthTabCallback(), iIAuthTabCallback2, 44141261);
    }

    public static void onExtraCallbackWithResult(View view, JSONObject jSONObject) {
        int iIAuthTabCallback = zziea.IAuthTabCallback();
        int iIAuthTabCallback2 = zziea.IAuthTabCallback();
        onExtraCallback(new Object[]{view, jSONObject}, iIAuthTabCallback, zziea.IAuthTabCallback(), -4614832, zziea.IAuthTabCallback(), iIAuthTabCallback2, 4614832);
    }

    static void onNavigationEvent() {
        onWarmupCompleted = new char[]{32461, 32462, 32258, 32273, 32262, 32274, 32259, 32275, 32268, 32277, 32270, 32271, 32264};
        IAuthTabCallback = -1184334146;
        IAuthTabCallbackStub = true;
        IAuthTabCallbackDefault = true;
    }
}
